package com.example.prakritibansal.posttextrequest.Utils;

/**
 * Created by prakritibansal on 12/28/17.
 */

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCredentialsProvider;
import com.amazonaws.services.lexrts.model.PostTextRequest;
import com.example.prakritibansal.posttextrequest.config.InteractionConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to create requests for Amazon Lex service.
 */
public class CreateLexServiceRequest {

    /**
     * Creates a request to post text input request for Amazon Lex service.
     *
     * @param sessionAttributes Session attributes for this current transaction.
     * @param text Input text.
     * @return {@link PostTextRequest}.
     */
    public static PostTextRequest generatePostTextRequest(Map<String, String> sessionAttributes,
                                                                InteractionConfig interactionConfig,
                                                                AWSCredentialsProvider credentialsProvider,
                                                                String text) {
        final PostTextRequest request = generateRequestInternal(sessionAttributes,
                interactionConfig,
                credentialsProvider);
        request.setInputText(text);
        return request;
    }

    /**
     *
     * @param sessionAttributes
     * @param interactionConfig
     * @param credentialsProvider
     * @return
     */
    private static PostTextRequest generateRequestInternal(Map<String, String> sessionAttributes,
                                                              InteractionConfig interactionConfig,
                                                              AWSCredentialsProvider credentialsProvider) {
        final PostTextRequest request = new PostTextRequest();

        request.setBotName(interactionConfig.getBotName());
        request.setBotAlias(interactionConfig.getBotAlias());

        final Map<String, String> newSessionAttributes = new HashMap<String, String>();
        newSessionAttributes.putAll(interactionConfig.getGlobalSessionAttributes());
        if (sessionAttributes != null) {
            newSessionAttributes.putAll(sessionAttributes);
        }

        request.setSessionAttributes(newSessionAttributes);

        if (interactionConfig.getUserId() == null || interactionConfig.getUserId().isEmpty()) {
            final CognitoCredentialsProvider cognitoCredentialsProvider = (CognitoCredentialsProvider) credentialsProvider;
            request.setUserId(cognitoCredentialsProvider.getIdentityId());
        } else {
            request.setUserId(interactionConfig.getUserId());
        }

        return request;
    }
}
