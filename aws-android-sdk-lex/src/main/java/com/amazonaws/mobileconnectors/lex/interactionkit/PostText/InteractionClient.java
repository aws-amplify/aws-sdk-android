package com.amazonaws.mobileconnectors.lex.interactionkit.PostText;

import android.content.Context;
import android.os.Handler;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCredentialsProvider;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.DialogFailedException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.InvalidParameterException;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.LexClientException;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lexrts.AmazonLexRuntime;
import com.amazonaws.services.lexrts.AmazonLexRuntimeClient;
import com.amazonaws.services.lexrts.model.DialogState;
import com.amazonaws.services.lexrts.model.PostTextRequest;
import com.amazonaws.services.lexrts.model.PostTextResult;
import com.amazonaws.util.StringUtils;
import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Continuations.LexServiceContinuation;
import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Listeners.DefaultInteractionListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Listeners.InteractionListener;
import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.Utils.CreateLexServiceRequest;
import com.amazonaws.mobileconnectors.lex.interactionkit.PostText.config.InteractionConfig;

import java.util.Map;

public class InteractionClient {
    private final String TAG = "Lex";
    private static final String INTERACTION_CLIENT_USER_AGENT = "INTERACTION_CLIENT";

    /**
     * Application context.
     */
    private final Context context;

    /**
     * Amazon Lex service client.
     */
    private final AmazonLexRuntime amazonlex;

//    /**
//     * User speech interaction client for Android.
//     */
    private final InteractionConfig interactionConfig;

    /**
     * Amazon AWS Credentials to access DeespSense service.
     */
    private final AWSCredentialsProvider credentialsProvider;

    /**
     * Callback for high-level user interactions.
     */
    private InteractionListener interactionListener;

    /**
     * The size of the each sample in bit.
     */
    public static final int SAMPLE_SIZE = 16;

    /**
     * Client states.
     */
    private final boolean BUSY = true;
    private final boolean NOT_BUSY = false;

    /**
     * Indicates if the client is busy with a request.
     */
    private volatile boolean requestInProgress;

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
     * Accept input as text, {@link String}, for text, {@link String}, reponse from the service.
     * @param text input as {@link String}.
     * @param sessionAttributes {@link Map}.
     */
    public void textInForTextOut(final String text, final Map<String, String> sessionAttributes) {
        carryOnWithText(text, sessionAttributes);
    }

    /**
     * Cancel the current  with the user's.
     */
    public void cancel() {
        setBusyState(NOT_BUSY);
    }

    /**
     * Accepts user's response as {@link String}.
     */
    private void carryOnWithText(final String text, final Map<String, String> sessionAttributes) {
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
                    final PostTextRequest request =
                            CreateLexServiceRequest.generatePostTextRequest(sessionAttributes,
                                    interactionConfig,
                                    credentialsProvider,
                                    text);
                    final PostTextResult result = amazonlex.postText(request);
                    processResponse(handler, result, client);
                    //processResponseAudioPlayback(handler, result, client, mode, ResponseType.TEXT);
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
     * Analyzes response from Amazon Lex service. Returns a {@link Runnable}
     * with the next step, which is usually a callback method in the
     * {@link InteractionListener} object.
     *
     * @param handler {@link Handler}, to interact with app components in the
     *            main thread.
     * @param result {@link PostTextRequest}, response from the Amazon Lex
     *            service.
     * @param client {@link com.amazonaws.mobileconnectors.lex.interactionkit.InteractionClient}, reference to this object.
     */
    private void processResponse(final Handler handler,
                                 final PostTextResult result,
                                 final InteractionClient client) {
        Runnable response;
        try {
            setBusyState(NOT_BUSY);
            final TextResponse serviceResponse = new TextResponse(result);
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
                        interactionListener.onReadyForFulfillment(new TextResponse(result));

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
                        new LexServiceContinuation(client);
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
     * Set an interaction listener for this client. If no internaction listner was provided, the
     * default implementation is used.
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
        } else {
            setBusyState(BUSY);
        }
    }

    /**
     * Returns the current state of the client.
     * @return boolean for the current state of the client.
     */
    private boolean isBusy() {
        return requestInProgress;
    }

    /**
     * Sets the current state of the client.
     * @param busyState the client state.
     */
    private void setBusyState(boolean busyState) {
        this.requestInProgress = busyState;
    }
}

