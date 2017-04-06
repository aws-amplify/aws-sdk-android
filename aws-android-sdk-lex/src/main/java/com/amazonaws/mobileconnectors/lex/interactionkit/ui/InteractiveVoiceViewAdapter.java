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

package com.amazonaws.mobileconnectors.lex.interactionkit.ui;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobileconnectors.lex.interactionkit.InteractionClient;
import com.amazonaws.mobileconnectors.lex.interactionkit.Response;
import com.amazonaws.mobileconnectors.lex.interactionkit.config.InteractionConfig;
import com.amazonaws.mobileconnectors.lex.interactionkit.continuations.LexServiceContinuation;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.InvalidParameterException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.MaxSpeechTimeOutException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.NoSpeechTimeOutException;
import com.amazonaws.mobileconnectors.lex.interactionkit.listeners.AudioPlaybackListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.listeners.InteractionListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.listeners.MicrophoneListener;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lexrts.model.DialogState;

import java.util.HashMap;
import java.util.Map;

/**
 * This class helps to easily interface the {@link InteractiveVoiceView} view's
 * with the Amazon Lex client. It manages the client states and delivers results
 * through separate callbacks. This implementation of the adapter offers only
 * voice for voice out operations only.
 */
public class InteractiveVoiceViewAdapter
        implements InteractionListener, AudioPlaybackListener, MicrophoneListener,
        View.OnClickListener {

    private final static String TAG = "Lex";
    private static final String INTERACTION_VOICE_VIEW_USER_AGENT = "VOICE_BUTTON";
    private final Context context;
    private final InteractiveVoiceView micButton;
    private InteractiveVoiceView.InteractiveVoiceListener voiceListener;
    protected int state;
    private Regions awsRegion;
    private AWSCredentialsProvider credentialsProvider;
    private InteractionConfig interactionConfig;
    private InteractionClient lexInteractionClient;
    private LexServiceContinuation continuation;
    private boolean shouldInitialize;
    private Map<String, String> sessionAttributes;
    private final ClientConfiguration clientConfiguration;

    // Dialog states.
    protected final static int STATE_NOT_READY = 0;
    protected final static int STATE_READY = 1;
    protected final static int STATE_LISTENING = 2;
    protected final static int STATE_AUDIO_PLAYBACK = 3;
    protected final static int STATE_AWAITING_RESPONSE = 4;

    private InteractiveVoiceViewAdapter(Context context,
                                        InteractiveVoiceView micButton) {
        this.context = context;
        this.micButton = micButton;
        this.micButton.setOnClickListener(this);
        this.shouldInitialize = true;
        this.voiceListener = null;
        this.state = STATE_READY;

        // for setting the user agent
        clientConfiguration = new ClientConfiguration();
        clientConfiguration.setUserAgent(INTERACTION_VOICE_VIEW_USER_AGENT);
    }

    public static InteractiveVoiceViewAdapter getInstance(Context context,
                                                          InteractiveVoiceView micButton) {
        return new InteractiveVoiceViewAdapter(context, micButton);
    }

    @Override
    public void onAudioPlaybackStarted() {
        state = STATE_AUDIO_PLAYBACK;
        micButton.animateAudioPlayback();
    }

    @Override
    public void onAudioPlayBackCompleted() {
        if (state != STATE_NOT_READY) {
            if (this.continuation != null) {
                state = STATE_LISTENING;
                continuation.continueWithCurrentMode();
                micButton.animateListening();
            } else {
                // Cannot continue, must start new dialog.
                state = STATE_READY;
                micButton.animateNone();
            }
        }
    }

    @Override
    public void onAudioPlaybackError(Exception e) {
        // Audio playback failed.
        Log.e(TAG, "InteractiveVoiceViewAdapter: Audio playback failed", e);
        state = STATE_READY;
        micButton.animateNone();
    }

    @Override
    public void onReadyForFulfillment(Response response) {
        // The request is ready for fulfillment, the bot is ready for a new dialog.
        state = STATE_READY;
        continuation = null;

        if (voiceListener != null) {
            voiceListener.dialogReadyForFulfillment(response.getSlots(), response.getIntentName());
        }
    }

    @Override
    public void promptUserToRespond(Response response,
                                    LexServiceContinuation continuation) {
        if (response == null) {
            Log.e(TAG, "InteractiveVoiceViewAdapter: Received null response from Amazon Lex bot");
        }

        if (DialogState.Fulfilled.toString().equals(response.getDialogState())) {
            // The request has been fulfilled, the bot is ready for a new dialog.
            micButton.animateNone();
            state = STATE_READY;
            this.continuation = null;
        } else {
            this.continuation = continuation;
        }

        if (voiceListener != null) {
            voiceListener.onResponse(response);
        }
    }

    @Override
    public void onInteractionError(Response response, Exception e) {
        Log.e(TAG, "InteractiveVoiceViewAdapter: Interaction error", e);
        if (state != STATE_AUDIO_PLAYBACK) {
            micButton.animateNone();
            state = STATE_READY;
        }
        continuation = null;

        if (voiceListener != null) {
            if (response != null) {
                voiceListener.onError(response.getTextResponse(), e);
            } else {
                voiceListener.onError("Error from Bot", e);
            }
        }
    }

    @Override
    public void readyForRecording() {
        // noop.
    }

    @Override
    public void startedRecording() {
        //noop.
    }

    @Override
    public void onRecordingEnd() {
        if (state == STATE_NOT_READY) {
            return;
        }

        if (state == STATE_LISTENING) {
            state = STATE_AWAITING_RESPONSE;
            micButton.animateWaitSpinner();
        } else {
            state = STATE_READY;
        }
    }

    @Override
    public void onSoundLevelChanged(double soundLevel) {
        if (state == STATE_LISTENING) {
            micButton.animateSoundLevel((float) soundLevel);
        }
    }

    @Override
    public void onMicrophoneError(Exception e) {
        micButton.animateNone();
        if (e instanceof NoSpeechTimeOutException) {
            Log.e(TAG, "InteractiveVoiceViewAdapter: Failed to detect speech", e);
            state = STATE_READY;
        } else if (e instanceof MaxSpeechTimeOutException) {
            Log.e(TAG, "InteractiveVoiceViewAdapter: Speech time out", e);
        }
    }

    @Override
    public void onClick(View v) {
        // Return if not ready.
        switch (state) {
            case STATE_READY:
                if (shouldInitialize) {
                    init();
                }

                if (sessionAttributes == null) {
                    sessionAttributes = new HashMap<String, String>();
                }
                startListening(sessionAttributes);
                break;
            case STATE_LISTENING:
            case STATE_AUDIO_PLAYBACK:
            case STATE_AWAITING_RESPONSE:
                lexInteractionClient.cancel();
                state = STATE_READY;
                break;
        }
    }

    /**
     * Validates app details.
     * <p>
     *     <b>Override this method</b> to implement custom attribute verification.
     * </p>
     */
    protected void validateAppData() {
        if (interactionConfig == null) {
            throw new InvalidParameterException(
                    "Interaction config is not set");
        } else {
            if (interactionConfig.getBotName() == null || interactionConfig.getBotName().isEmpty()) {
                throw new InvalidParameterException(
                        "Bot name is not set");
            }

            if (interactionConfig.getBotAlias() == null || interactionConfig.getBotAlias().isEmpty()) {
                throw new InvalidParameterException(
                        "Bot alias is not set");
            }
        }

        if (awsRegion == null) {
            throw new InvalidParameterException(
                    "AWS Region is not set");
        }
    }

    /**
     * Creates the interaction client, uses default interaction config setting
     * {@link com.amazonaws.mobileconnectors.lex.interactionkit.config.InteractionConfig}
     * .
     */
    protected void createInteractionClient() {
        // Release system resources assigned to an earlier instance of the client.
        if (lexInteractionClient != null) {
            lexInteractionClient.cancel();
        }

        lexInteractionClient = new InteractionClient(
                context,
                credentialsProvider,
                awsRegion,
                interactionConfig,
                clientConfiguration);

        lexInteractionClient.setAudioPlaybackListener(this);
        lexInteractionClient.setInteractionListener(this);
        lexInteractionClient.setMicrophoneListener(this);
    }

    /**
     * Invoke Amazon Lex client to start a new audio in audio request.
     *
     * @param sessionParameters The session parameters to be used for this
     *            request.
     */
    private void startListening(Map<String, String> sessionParameters) {
        state = STATE_LISTENING;
        lexInteractionClient.audioInForAudioOut(sessionParameters);
    }

    /**
     * Initializes this adapter. This will terminate any ongoing transactions with the current
     * instance of the client and creates a new client.
     */
    private void init() {
        state = STATE_READY;
        validateAppData();
        createInteractionClient();
        micButton.setOnClickListener(this);
        shouldInitialize = false;
    }

    /**
     * Cancel current dialog.
     */
    protected void cancel() {
        reset();
    }

    /**
     * Reset client.
     */
    protected void reset() {
        if (lexInteractionClient != null) {
            lexInteractionClient.cancel();
        }
        state = STATE_READY;
        sessionAttributes = null;
    }

    /**
     * Assign a listener for the voice interactions with the Amazon Lex bot.
     *
     * @param voiceListener
     */
    protected void setVoiceListener(InteractiveVoiceView.InteractiveVoiceListener voiceListener) {
        this.voiceListener = voiceListener;
    }

    /**
     * Set credentials provider.
     * @param credentialsProvider
     */
    public void setCredentialProvider(AWSCredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
        shouldInitialize = true;
    }

    /**
     * Set interaction config.
     * @param interactionConfig The interaction config.
     */
    public void setInteractionConfig(InteractionConfig interactionConfig) {
        this.interactionConfig = interactionConfig;
        shouldInitialize = true;
    }

    /**
     * Set session attributes, these will be picked for the next dialog transaction.
     * @param sessionAttributes
     */
    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * Set the AWS region where the Amazon Lex bot has been setup.
     *
     * @param awsRegion
     */
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = Regions.fromName(awsRegion) ;
    }

    /**
     * Get the AWS regions set for this adapter.
     * @return The AWS region, {@link String}.
     */
    public String getAwsRegion() {
        return awsRegion == null ? null : awsRegion.getName();
    }
}
