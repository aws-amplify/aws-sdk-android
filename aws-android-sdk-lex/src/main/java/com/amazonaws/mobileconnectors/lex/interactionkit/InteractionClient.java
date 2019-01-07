/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.lex.interactionkit;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;

import com.amazon.blueshift.bluefront.android.audio.encoder.OpusEncoder;
import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCredentialsProvider;
import com.amazonaws.mobileconnectors.lex.interactionkit.config.InteractionConfig;
import com.amazonaws.mobileconnectors.lex.interactionkit.continuations.LexServiceContinuation;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.AudioPlaybackException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.DialogFailedException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.InvalidParameterException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.LexClientException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.MaxSpeechTimeOutException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.NoSpeechTimeOutException;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.AudioRecorder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.AudioRecordingTask;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.AudioRecordingTaskListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.AudioTimeouts;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.LexAudioRecorder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.LexAudioRecorderBuilder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.AudioEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.BufferedAudioEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder.L16PcmEncoder;
import com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad.config.DnnVADConfig;
import com.amazonaws.mobileconnectors.lex.interactionkit.listeners.AudioPlaybackListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.listeners.DefaultInteractionListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.listeners.InteractionListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.listeners.MicrophoneListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.utils.AudioEncoding;
import com.amazonaws.mobileconnectors.lex.interactionkit.utils.CreateLexServiceRequest;
import com.amazonaws.mobileconnectors.lex.interactionkit.utils.ResponseType;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lexrts.AmazonLexRuntime;
import com.amazonaws.services.lexrts.AmazonLexRuntimeClient;
import com.amazonaws.services.lexrts.model.DialogState;
import com.amazonaws.services.lexrts.model.PostContentRequest;
import com.amazonaws.services.lexrts.model.PostContentResult;
import com.amazonaws.util.StringUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * The main service interface for the developers. This class abstracts all service complexities.
 * Developers will primarily interact with this class.
 * The parameters for interactions with a user are read from
 * {@link InteractionConfig}.
 * Set the these configurations before initializing this class.
 */
public class InteractionClient {
    /**
     * The size of the each sample in bit.
     */
    public static final int SAMPLE_SIZE = 16;
    private static final String INTERACTION_CLIENT_USER_AGENT = "INTERACTION_CLIENT";
    private final String TAG = "Lex";
    /**
     * Application context.
     */
    private final Context context;
    /**
     * Amazon Lex service client.
     */
    private final AmazonLexRuntime amazonlex;
    /**
     * User speech interaction client for Android.
     */
    private final InteractionConfig interactionConfig;
    /**
     * Amazon AWS Credentials to access DeespSense service.
     */
    private final AWSCredentialsProvider credentialsProvider;
    /**
     * Client states.
     */
    private final boolean BUSY = true;
    private final boolean NOT_BUSY = false;
    /**
     * Callback for high-level user interactions.
     */
    private InteractionListener interactionListener;
    /**
     * Callback for audio playback.
     */
    private AudioPlaybackListener audioPlaybackListener;
    /**
     * Callback for user interactions with microphone.
     */
    private MicrophoneListener microphoneListener;
    /**
     * Local media player for audio playback.
     */
    private MediaPlayer lMediaPlayer;
    /**
     * Audio encoding used for audio streamed to the Amazon Lex service.
     */
    private AudioEncoder audioEncoder;
    /**
     * Intervals for no speech and max speech timeouts.
     */
    private AudioTimeouts audioTimeouts;
    /**
     * Config for voice activity detection.
     */
    private DnnVADConfig vadConfig;
    /**
     * Records user audio for streaming.
     */
    private LexAudioRecorder lexAudioRecorder;
    /**
     * Indicates if the client is busy with a request.
     */
    private volatile boolean requestInProgress;

    /**
     * Indicates if the client is busy with audio playback.
     */
    private volatile boolean audioPlayBackInProgress;

    /**
     * Constructors for Amazon Lex local clients.
     */
    public InteractionClient(Context context,
                             AWSCredentialsProvider credentialsProvider,
                             Regions region,
                             String botName,
                             String botAlias) {
        // Uses default interaction configuration and listeners.
        this(context,
                credentialsProvider,
                region,
                new InteractionConfig(botName, botAlias));
    }

    public InteractionClient(Context context,
                             AWSCredentialsProvider credentialsProvider,
                             Regions region,
                             InteractionConfig interactionConfig) {
        this(context, credentialsProvider, region, interactionConfig, null);
    }

    public InteractionClient(Context context,
                             AWSCredentialsProvider credentialsProvider,
                             Regions region,
                             InteractionConfig interactionConfig,
                             ClientConfiguration clientConfiguration) {

        if (context == null) {
            throw new InvalidParameterException("Context cannot be null.");
        } else {
            this.context = context;
        }

        // Check if all necessary credentials are available.
        if (credentialsProvider == null) {
            throw new InvalidParameterException("Credentials are not set.");
        }

        if (interactionConfig == null) {
            throw new InvalidParameterException("Interaction config is not set.");
        }

        if ((interactionConfig.getUserId() == null || interactionConfig.getUserId().isEmpty())
                && !(credentialsProvider instanceof CognitoCredentialsProvider)) {
            throw new InvalidParameterException(
                    "User id must be set in the config or Amazon Cognito Identity must used as the credentials provider");
        }

        this.interactionConfig = interactionConfig;
        this.credentialsProvider = credentialsProvider;
        this.interactionListener = new DefaultInteractionListener();

        // Create service low-level client.
        if (null == clientConfiguration) {
            clientConfiguration = new ClientConfiguration();
        }

        String userAgent = INTERACTION_CLIENT_USER_AGENT;

        if (!StringUtils.isBlank(clientConfiguration.getUserAgent())) {
            userAgent += clientConfiguration.getUserAgent();
        }

        clientConfiguration.setUserAgent(userAgent);

        amazonlex = new AmazonLexRuntimeClient(credentialsProvider, clientConfiguration);
        amazonlex.setRegion(Region.getRegion(region));
    }

    /**
     * Accept input from mic (speech) for text, {@link String}, response from the service.
     *
     * @param sessionAttributes {@link Map}.
     * @param requestAttributes {@link Map}.
     */
    public void audioInForTextOut(final Map<String, String> sessionAttributes, final Map<String, String> requestAttributes) {
        carryOnWithMic(sessionAttributes, requestAttributes, ResponseType.TEXT);
    }

    /**
     * Accept input from mic (speech) for text, {@link String}, response from the service.
     *
     * @param sessionAttributes {@link Map}.
     */
    public void audioInForTextOut(final Map<String, String> sessionAttributes) {
        audioInForTextOut(sessionAttributes, null);
    }

    /**
     * Accept input from mic (speech) for audio response from the service. To allow the to playback
     * audio from the service response, use {@link InteractionConfig#setEnableAudioPlayback(boolean)}.
     *
     * @param sessionAttributes {@link Map}.
     * @param requestAttributes {@link Map}.
     */
    public void audioInForAudioOut(final Map<String, String> sessionAttributes, final Map<String, String> requestAttributes) {
        carryOnWithMic(sessionAttributes, requestAttributes, ResponseType.AUDIO_MPEG);
    }

    /**
     * Accept input from mic (speech) for audio response from the service. To allow the to playback
     * audio from the service response, use {@link InteractionConfig#setEnableAudioPlayback(boolean)}.
     *
     * @param sessionAttributes {@link Map}.
     */
    public void audioInForAudioOut(final Map<String, String> sessionAttributes) {
        audioInForAudioOut(sessionAttributes, null);
    }

    /**
     * Accept input as text, {@link String}, for text, {@link String}, reponse from the service.
     *
     * @param text              input as {@link String}.
     * @param sessionAttributes {@link Map}.
     * @param requestAttributes {@link Map}.
     */
    public void textInForTextOut(final String text, final Map<String, String> sessionAttributes, final Map<String, String> requestAttributes) {
        carryOnWithText(text, sessionAttributes, requestAttributes, ResponseType.TEXT);
    }

    /**
     * Accept input as text, {@link String}, for text, {@link String}, reponse from the service.
     *
     * @param text              input as {@link String}.
     * @param sessionAttributes {@link Map}.
     */
    public void textInForTextOut(final String text, final Map<String, String> sessionAttributes) {
        textInForTextOut(text, sessionAttributes, null);
    }

    /**
     * Accept input as text, {@link String}, for audio response from the service. To allow the to playback
     * audio from the service response, use {@link InteractionConfig#setEnableAudioPlayback(boolean)}.
     *
     * @param text              input as {@link String}.
     * @param sessionAttributes {@link Map}.
     * @param requestAttributes {@link Map}.
     */
    public void textInForAudioOut(final String text, final Map<String, String> sessionAttributes, final Map<String, String> requestAttributes) {
        carryOnWithText(text, sessionAttributes, requestAttributes, ResponseType.AUDIO_MPEG);
    }

    /**
     * Accept input as text, {@link String}, for audio response from the service. To allow the to playback
     * audio from the service response, use {@link InteractionConfig#setEnableAudioPlayback(boolean)}.
     *
     * @param text              input as {@link String}.
     * @param sessionAttributes {@link Map}.
     */
    public void textInForAudioOut(final String text, final Map<String, String> sessionAttributes) {
        textInForAudioOut(text, sessionAttributes, null);
    }

    /**
     * Cancel the current  with the user's.
     */
    public void cancel() {
        // TODO - Also stop the http client.
        // Stop current dialog.
        terminateAudioDecoder();
        terminateAudioPlayback();
        setBusyState(NOT_BUSY);
    }

    /**
     * Starts listening for the user to speak, through the microphones. The voice interaction client
     * detects the start and end of speech.
     */
    private void carryOnWithMic(final Map<String, String> sessionAttributes,
                                final Map<String, String> requestAttributes,
                                final ResponseType mode) {
        // Ensure that the client is not pre-occupied with another dlalog
        checkBusyState();
        // Send user's response to Amazon Lex service as an audio-stream.
        final InteractionClient client = this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallBack;
                try {
                    // Create a new voice interaction client.
                    if (AudioEncoding.LPCM.equals(interactionConfig.getAudioEncoding())) {
                        audioEncoder = new BufferedAudioEncoder(new L16PcmEncoder());
                    } else {
                        audioEncoder = new BufferedAudioEncoder(new OpusEncoder());
                    }

                    // Set time-out limits for mic audio.
                    audioTimeouts = new AudioTimeouts(interactionConfig.getNoSpeechTimeoutInterval(),
                            interactionConfig.getMaxSpeechTimeoutInterval());

                    // Set VAD configuration.
                    vadConfig = new DnnVADConfig(interactionConfig.getLrtThreshold(),
                            interactionConfig.getStartPointingThreshold(),
                            interactionConfig.getEndPointingThreshold());

                    lexAudioRecorder =
                            new LexAudioRecorderBuilder(context).
                                    audioEncoder(audioEncoder).
                                    audioTimeouts(audioTimeouts).
                                    dnnVADConfig(vadConfig).
                                    build();

                    // Calculate the maximum buffer size for pipes.
                    final int maxTotalAudioLengthInMills = audioTimeouts.getNoSpeechTimeout()
                            + audioTimeouts.getMaxSpeechTimeout();
                    final int pipeSize = AudioRecorder.DEFAULT_SAMPLE_RATE
                            * (int) TimeUnit.MILLISECONDS.toSeconds(maxTotalAudioLengthInMills)
                            * (SAMPLE_SIZE / Byte.SIZE);

                    final InputStream audioInStream =
                            new BufferedInputStream(lexAudioRecorder.getConsumerStream(),
                                    pipeSize);

                    final PostContentRequest request =
                            CreateLexServiceRequest.generatePostContentRequest(sessionAttributes,
                                    requestAttributes,
                                    interactionConfig,
                                    credentialsProvider,
                                    mode,
                                    audioInStream,
                                    audioEncoder.getMediaType().toString());

                    // Start the speech listener, service api's will be called only when the speech frames are detected.
                    startListening(handler, microphoneListener, lexAudioRecorder, request, client,
                            mode);
                } catch (final Exception e) {
                    returnCallBack = new Runnable() {
                        @Override
                        public void run() {
                            interactionListener.onInteractionError(null, e);
                        }
                    };
                    handler.post(returnCallBack);
                } finally {
                    setBusyState(NOT_BUSY);
                }
            }
        }).start();
    }

    /**
     * This method will be invoked when speech frames are detected in the audio
     * input over the microphone.
     *
     * @param handler {@link Handler}, to interact with app components in the
     *                main thread.
     * @param request {@link PostContentResult}, response from the Amazon Lex
     *                service.
     * @param client  {@link InteractionClient}, reference to this object.
     * @param mode    {@link ResponseType}, current response type.
     */
    private void sendAudioRequest(final Handler handler,
                                  final PostContentRequest request,
                                  final InteractionClient client,
                                  final ResponseType mode) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final PostContentResult result = amazonlex.postContent(request);
                    processResponseAudioPlayback(handler, result, client, mode, ResponseType.AUDIO_MPEG);
                } catch (final Exception e) {
                    final Runnable returnCallBack = new Runnable() {
                        @Override
                        public void run() {
                            interactionListener.onInteractionError(null, e);
                        }
                    };
                    handler.post(returnCallBack);
                } finally {
                    setBusyState(NOT_BUSY);
                }
            }
        }).start();
    }

    /**
     * Accepts user's response as {@link String}.
     */
    private void carryOnWithText(final String text,
                                 final Map<String, String> sessionAttributes,
                                 final Map<String, String> requestAttributes,
                                 final ResponseType mode) {
        // Ensure the client is not pre-occupied with a request.
        checkBusyState();
        // Send user's response to Amazon Lex service as a text.
        final InteractionClient client = this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler(context.getMainLooper());
                Runnable returnCallback;
                try {
                    final PostContentRequest request =
                            CreateLexServiceRequest.generatePostContentRequest(sessionAttributes,
                                    requestAttributes,
                                    interactionConfig,
                                    credentialsProvider,
                                    mode,
                                    text);
                    final PostContentResult result = amazonlex.postContent(request);
                    processResponseAudioPlayback(handler, result, client, mode, ResponseType.TEXT);
                } catch (final Exception e) {
                    returnCallback = new Runnable() {
                        @Override
                        public void run() {

                            interactionListener.onInteractionError(null, e);
                        }
                    };
                    handler.post(returnCallback);
                } finally {
                    setBusyState(NOT_BUSY);
                }
            }
        }).start();
    }

    /**
     * Invokes the Android {@link MediaPlayer} to playback audio if audio
     * playback was requested, and continues to analyze the response. If the
     * response does not contain audio stream or if audio playback was not
     * requested, continues to analyze the response.
     *
     * @param handler      {@link Handler}, to interact with app components in the
     *                     main thread.
     * @param result       {@link PostContentResult}, response from the Amazon Lex
     *                     service.
     * @param client       {@link InteractionClient}, reference to this object.
     * @param responseMode {@link ResponseType}, current response type.
     */
    private void processResponseAudioPlayback(final Handler handler,
                                              final PostContentResult result,
                                              final InteractionClient client,
                                              final ResponseType responseMode,
                                              final ResponseType requestType) {
        // Check if response is audio and audio playback is requested.
        if (ResponseType.AUDIO_MPEG.equals(responseMode) && interactionConfig.isEnableAudioPlayback()) {
            this.lMediaPlayer = new MediaPlayer();
            this.lMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            try {
                setAudioPlaybackState(BUSY);
                File tempAudioFile = File.createTempFile("lex_temp_response", "mp3",
                        context.getFilesDir());
                tempAudioFile.deleteOnExit();
                // Media player listeners.
                lMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    @Override
                    public boolean onError(final MediaPlayer mp, final int what, final int extra) {
                        if (interactionListener != null) {
                            final Runnable appCallback = new Runnable() {
                                @Override
                                public void run() {
                                    audioPlaybackListener.onAudioPlaybackError(
                                            new AudioPlaybackException(
                                                    String.format(Locale.US,
                                                            "MediaPlayer error: \"what\": %d, \"extra\":%d",
                                                            what,
                                                            extra)));
                                }
                            };
                            handler.post(appCallback);
                        }
                        return false;
                    }
                });

                lMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        if (audioPlaybackListener != null) {
                            final Runnable appCallback = new Runnable() {
                                @Override
                                public void run() {
                                    audioPlaybackListener.onAudioPlaybackStarted();
                                }
                            };
                            handler.post(appCallback);
                        }
                        mp.start();
                    }
                });

                lMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        setAudioPlaybackState(NOT_BUSY);
                        if (audioPlaybackListener != null) {
                            final Runnable appCallback = new Runnable() {
                                @Override
                                public void run() {
                                    audioPlaybackListener.onAudioPlayBackCompleted();
                                }
                            };
                            handler.post(appCallback);
                        }
                        try {
                            if (lMediaPlayer.isPlaying() || lMediaPlayer.isLooping()) {
                                lMediaPlayer.stop();
                            }
                            lMediaPlayer.release();
                        } catch (final Exception e) {
                            Log.e(TAG, "InteractionClient: Error while releasing MediaPlayer", e);
                        } finally {
                            lMediaPlayer = null;
                        }
                    }
                });

                final InputStream audioStream = result.getAudioStream();
                tempAudioFile = File.createTempFile("lex_temp_response", "dat",
                        context.getFilesDir());
                tempAudioFile.deleteOnExit();
                final FileOutputStream audioOut = new FileOutputStream(tempAudioFile);
                final byte buffer[] = new byte[16384];
                int length;
                while ((length = audioStream.read(buffer)) != -1) {
                    audioOut.write(buffer, 0, length);
                }
                audioOut.close();
                final FileInputStream audioIn = new FileInputStream(tempAudioFile);
                lMediaPlayer.setDataSource(audioIn.getFD());
                lMediaPlayer.prepare();
                processResponse(handler, result, client, responseMode, requestType);
            } catch (final Exception e) {
                // Playback failed.
                if (audioPlaybackListener != null) {
                    final Runnable appCallback = new Runnable() {
                        @Override
                        public void run() {
                            audioPlaybackListener.onAudioPlaybackError(
                                    new LexClientException("Audio playback failed", e));
                        }
                    };
                    handler.post(appCallback);
                }
                try {
                    if (lMediaPlayer.isPlaying() || lMediaPlayer.isLooping()) {
                        lMediaPlayer.stop();
                    }
                    lMediaPlayer.release();
                    lMediaPlayer = null;
                } catch (final Exception exp) {
                    Log.e(TAG, "InteractionClient: Error while releasing MediaPlayer", exp);
                }
                processResponse(handler, result, client, responseMode, requestType);
            } finally {
                setAudioPlaybackState(NOT_BUSY);
            }

        } else {
            processResponse(handler, result, client, responseMode, requestType);
        }
    }

    /**
     * Analyzes response from Amazon Lex service. Returns a {@link Runnable}
     * with the next step, which is usually a callback method in the
     * {@link InteractionListener} object.
     *
     * @param handler      {@link Handler}, to interact with app components in the
     *                     main thread.
     * @param result       {@link PostContentResult}, response from the Amazon Lex
     *                     service.
     * @param client       {@link InteractionClient}, reference to this object.
     * @param responseMode {@link ResponseType}, current response type.
     */
    private void processResponse(final Handler handler,
                                 final PostContentResult result,
                                 final InteractionClient client,
                                 final ResponseType responseMode,
                                 final ResponseType requestMode) {
        Runnable response;
        try {
            setBusyState(NOT_BUSY);
            final Response serviceResponse = new Response(result);
            if (DialogState.Failed.toString().equals(result.getDialogState())) {
                // Amazon Lex service reported an error.
                response = new Runnable() {
                    @Override
                    public void run() {
                        interactionListener.onInteractionError(serviceResponse,
                                new DialogFailedException(
                                        "Failed to fulfill current request."));
                    }
                };
            } else if (DialogState.ReadyForFulfillment.toString().equals(result.getDialogState())) {
                // The current dialog is ready for fulfillment by the client, no
                // further action is required.
                response = new Runnable() {
                    @Override
                    public void run() {
                        interactionListener.onReadyForFulfillment(new Response(result));

                        interactionListener.promptUserToRespond(serviceResponse, null);
                    }
                };
            } else if (DialogState.Fulfilled.toString().equals(result.getDialogState())) {
                // Request was successfully fulfilled, no further action required.
                response = new Runnable() {
                    @Override
                    public void run() {
                        interactionListener.promptUserToRespond(serviceResponse, null);
                    }
                };
            } else {
                // User's response is required to continue.
                final LexServiceContinuation continuation =
                        new LexServiceContinuation(client, responseMode, requestMode);
                // set the session attributes on the continuation
                continuation.setSessionAttributes(serviceResponse.getSessionAttributes());
                response = new Runnable() {
                    @Override
                    public void run() {
                        interactionListener.promptUserToRespond(serviceResponse, continuation);
                    }
                };
            }
        } catch (final Exception e) {
            response = new Runnable() {
                @Override
                public void run() {
                    interactionListener.onInteractionError(null, e);
                }
            };
        } finally {
            setBusyState(NOT_BUSY);
        }
        handler.post(response);
    }

    /**
     * Starts listening to the user over the mic.
     *
     * @param handler            {@link Handler}, to interact with app components in the
     *                           main thread.
     * @param microphoneListener {@link MicrophoneListener}, callback to
     *                           communicate recording over microphone to the application.
     * @param lexAudioRecorder   {@link LexAudioRecorder}, listens to audio from
     *                           mic.
     */
    private void startListening(final Handler handler,
                                final MicrophoneListener microphoneListener,
                                final LexAudioRecorder lexAudioRecorder,
                                final PostContentRequest request,
                                final InteractionClient client,
                                final ResponseType mode) {
        final AudioRecordingTask recordingTask = new AudioRecordingTask(lexAudioRecorder,
                new AudioRecordingTaskListener() {
                    @Override
                    public void onReadyForSpeech() {
                        // Client ready to listen to user speech.
                        if (microphoneListener != null) {
                            final Runnable appCallBack = new Runnable() {
                                @Override
                                public void run() {
                                    microphoneListener.readyForRecording();
                                }
                            };
                            handler.post(appCallBack);
                        }
                    }

                    @Override
                    public void onBeginningOfSpeech() {
                        // App detected speech.
                        if (microphoneListener != null) {
                            final Runnable appCallBack = new Runnable() {
                                @Override
                                public void run() {
                                    microphoneListener.startedRecording();
                                }
                            };
                            handler.post(appCallBack);
                        }

                        // Now since the speech frames have been detected, send
                        // the request to the Amazon Lex bot.
                        sendAudioRequest(handler, request, client, mode);
                    }

                    @Override
                    public void onBufferReceived(byte[] buffer) {
                        // No operation required. This callback is invoked by AudioRecorder. The bytes received
                        // in this callback are PCM encoded. LexAudioRecorder extends AudioRecorder to
                        // allow other audio encoders, and pipe the encoded bytes through a PipedInputStream.
                        // The PipedInputStream used in the request to the
                        // Amazon Lex service.
                    }

                    @Override
                    public void onRmsChanged(final float rmsdB) {
                        // Sound level has changed.
                        if (microphoneListener != null) {
                            final Runnable appCallBack = new Runnable() {
                                @Override
                                public void run() {
                                    microphoneListener.onSoundLevelChanged(rmsdB);
                                }
                            };
                            handler.post(appCallBack);
                        }
                    }

                    @Override
                    public void onSilenceDetected() {
                        // Silence detected after speech.
                        if (microphoneListener != null) {
                            final Runnable appCallBack = new Runnable() {
                                @Override
                                public void run() {
                                    microphoneListener.onRecordingEnd();
                                }
                            };
                            handler.post(appCallBack);
                        }
                    }

                    @Override
                    public void onNoSpeechTimeout() {
                        // Stop recording on no timeout.
                        lexAudioRecorder.cancel();

                        if (microphoneListener != null) {
                            final Runnable appCallBack = new Runnable() {
                                @Override
                                public void run() {
                                    microphoneListener.onMicrophoneError(
                                            new NoSpeechTimeOutException(
                                                    "User did not respond within the speech time out limit."));
                                }
                            };
                            handler.post(appCallBack);
                        }

                        setBusyState(NOT_BUSY);
                    }

                    @Override
                    public void onMaxSpeechTimeout() {
                        lexAudioRecorder.cancel();
                        if (microphoneListener != null) {
                            final Runnable appCallBack = new Runnable() {
                                @Override
                                public void run() {
                                    microphoneListener.onMicrophoneError(
                                            new MaxSpeechTimeOutException(
                                                    "User did not complete response within the max speech time out limit."));
                                }
                            };
                            handler.post(appCallBack);
                        }
                    }

                    @Override
                    public void onError(final AmazonClientException e) {
                        if (microphoneListener != null) {
                            final Runnable appCallBack = new Runnable() {
                                @Override
                                public void run() {
                                    microphoneListener.onMicrophoneError(
                                            new LexClientException(e.getMessage(), e));
                                }
                            };
                            handler.post(appCallBack);
                        }
                    }
                });

        recordingTask.execute();
    }

    /**
     * Assign a audio playback listener to this interaction client. This will be invoked during
     * audio playback events only when audio playback is enabled.
     *
     * @param audioPlaybackListener
     */
    public void setAudioPlaybackListener(AudioPlaybackListener audioPlaybackListener) {
        this.audioPlaybackListener = audioPlaybackListener;
    }

    /**
     * Assign a listener for microphone events.
     *
     * @param microphoneListener
     */
    public void setMicrophoneListener(MicrophoneListener microphoneListener) {
        this.microphoneListener = microphoneListener;
    }

    /**
     * Set an interaction listener for this client. If no internaction listner was provided, the
     * default implementation is used.
     *
     * @param interactionListener the interaction listener {@link InteractionListener}.
     */
    public void setInteractionListener(InteractionListener interactionListener) {
        if (interactionListener == null) {
            // use the default implementation
            interactionListener = new DefaultInteractionListener();
        }
        this.interactionListener = interactionListener;
    }

    /**
     * Check if this client is busy, with a request in progress.
     */
    private void checkBusyState() {
        if (isBusy()) {
            throw new LexClientException("Client is busy with a request.");
        } else if (isAudioPlayBackInProgress()) {
            throw new LexClientException("Audio playback is in progress.");
        } else {
            setBusyState(BUSY);
        }
    }

    /**
     * Returns the current state of the client.
     *
     * @return boolean for the current state of the client.
     */
    private boolean isBusy() {
        return requestInProgress;
    }

    /**
     * Sets the current state of the client.
     *
     * @param busyState the client state.
     */
    private void setBusyState(boolean busyState) {
        this.requestInProgress = busyState;
    }

    /**
     * Returns {@code true} if audio playback is on progress.
     *
     * @return
     */
    private boolean isAudioPlayBackInProgress() {
        return audioPlayBackInProgress;
    }

    /**
     * Sets the current state of the client.
     *
     * @param playbackState the audio playback state.
     */
    private void setAudioPlaybackState(boolean playbackState) {
        this.audioPlayBackInProgress = playbackState;
    }

    /**
     * Terminates any audio playback which is in progress.
     */
    private void terminateAudioPlayback() {
        try {
            if (lMediaPlayer != null) {
                if (lMediaPlayer.isPlaying() || lMediaPlayer.isLooping()) {
                    lMediaPlayer.stop();
                }
                lMediaPlayer.release();
                lMediaPlayer = null;
            }
        } catch (final Exception e) {
            // Media player failed.
            Log.e(TAG, "InteractionClient: MediaPlayer error", e);
        } finally {
            setAudioPlaybackState(NOT_BUSY);
        }
    }

    /**
     * Terminates active audio decoder and release any allocated AudioRecorder system resources.
     */
    private void terminateAudioDecoder() {
        try {
            if (lexAudioRecorder != null) {
                lexAudioRecorder.cancel();
            }
        } catch (final Exception e) {
            // Bluefront audio decoder failed.
            Log.e(TAG, "InteractionClient: Bluefront audio decoder error", e);
        }
    }

}
