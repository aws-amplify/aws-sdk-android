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

package com.amazonaws.mobileconnectors.lex.interactionkit.utils;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCredentialsProvider;
import com.amazonaws.mobileconnectors.lex.interactionkit.config.InteractionConfig;
import com.amazonaws.services.lexrts.model.PostContentRequest;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;

import com.google.common.net.MediaType;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to create requests for Amazon Lex service.
 */
public class CreateLexServiceRequest {

    /**
     * Creates a request to post speech input to the Amazon Lex service.
     *
     * @param sessionAttributes Session attributes for this current transaction.
     * @param requestAttributes Attributes to add to the current request
     * @param audioStream audio as {@link InputStream}.
     * @return {@link PostContentRequest}.
     */
    public static PostContentRequest generatePostContentRequest(Map<String, String> sessionAttributes,
                                                                Map<String, String> requestAttributes,
                                                                InteractionConfig interactionConfig,
                                                                AWSCredentialsProvider credentialsProvider,
                                                                ResponseType mode,
                                                                InputStream audioStream,
                                                                String contentType) {
        final PostContentRequest request = generateRequestInternal(sessionAttributes,
                requestAttributes,
                interactionConfig,
                credentialsProvider,
                mode);

        // Set input and content type.
        request.setInputStream(audioStream);
        request.setContentType(contentType);
        return request;
    }

    /**
     * Creates a request to post text input to the Amazon Lex service.
     *
     * @param sessionAttributes Session attributes for this current transaction.
     * @param requestAttributes Attributes to add to the current request
     * @param text Input text.
     * @return {@link PostContentRequest}.
     */
    public static PostContentRequest generatePostContentRequest(Map<String, String> sessionAttributes,
                                                                Map<String, String> requestAttributes,
                                                                InteractionConfig interactionConfig,
                                                                AWSCredentialsProvider credentialsProvider,
                                                                ResponseType mode,
                                                                String text) {
        final PostContentRequest request = generateRequestInternal(sessionAttributes,
                requestAttributes,
                interactionConfig,
                credentialsProvider,
                mode);

        // Set input and content type.
        final byte[] textContent = text.getBytes(StringUtils.UTF8);
        request.setInputStream(new ByteArrayInputStream(textContent));
        request.setContentType(MediaType.PLAIN_TEXT_UTF_8.toString());
        return request;
    }

    /**
     * Utility method for generating a request. Populates the request with a user ID from either interactionConfig or
     * the credentialsProvider, which must be an instance of CognitoCredentialsProvider.
     *
     * @param sessionAttributes Session attributes for this current transaction.
     * @param requestAttributes Attributes to add to the current request
     * @param interactionConfig The configuration for the interaction, which must contain the user ID if
     *                          credentialsProvider is not an instance of CognitoCredentialsProvider.
     * @param credentialsProvider The credentialsProvider to obtain the Cognito IdentityId. If the user ID is not set in
     *                            interactionConfig, credentialsProvider must be an instance of CognitoCredentialsProvider
     * @param mode The desired response type
     * @return a PostContentRequest with attributes and user ID, but no content
     */
    private static PostContentRequest generateRequestInternal(Map<String, String> sessionAttributes,
                                                              Map<String, String> requestAttributes,
                                                              InteractionConfig interactionConfig,
                                                              AWSCredentialsProvider credentialsProvider,
                                                              ResponseType mode) {
        final PostContentRequest request = new PostContentRequest();

        request.setBotName(interactionConfig.getBotName());
        request.setBotAlias(interactionConfig.getBotAlias());
        request.setAccept(mode.toString());

        final Map<String, String> newSessionAttributes = new HashMap<String, String>();
        newSessionAttributes.putAll(interactionConfig.getGlobalSessionAttributes());
        if (sessionAttributes != null) {
            newSessionAttributes.putAll(sessionAttributes);
        }

        request.setSessionAttributes(mapToBase64(newSessionAttributes));

        if (interactionConfig.getUserId() == null || interactionConfig.getUserId().isEmpty()) {
            final CognitoCredentialsProvider cognitoCredentialsProvider = (CognitoCredentialsProvider) credentialsProvider;
            request.setUserId(cognitoCredentialsProvider.getIdentityId());
        } else {
            request.setUserId(interactionConfig.getUserId());
        }

        return request;
    }

    private static String mapToBase64(Map<String, String> map) {
        String valueAsString = JsonUtils.mapToString(map);
        byte[] valueAsBytes = valueAsString.getBytes();
        String valueAsBase64 = Base64.encodeAsString(valueAsBytes);
        return valueAsBase64;
    }
}
