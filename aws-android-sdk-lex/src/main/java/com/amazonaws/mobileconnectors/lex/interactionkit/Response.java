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

import com.amazonaws.services.lexrts.model.PostContentResult;
import com.amazonaws.util.Base64;
import com.amazonaws.util.json.JsonUtils;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * Encapsulates the response from the service and provides methods to read from the response.
 */
public class Response {
    private final PostContentResult result;

    /**
     * Uses the service response to create an instance of this class.
     * @param result response from the service.
     */
    protected Response(PostContentResult result) {
        this.result = result;
    }

    /**
     * Returns the dialog state. The dialog states represent the service's
     * intent in this response, that is what the service expects from the user.
     * There are five dialog states.
     * <p>
     * {@link com.amazonaws.services.lexrts.model.DialogState#Failed}: Amazon Lex
     * service is unable to continue with the current transaction. The text
     * response and audio response, if available, will have further details.
     * {@link com.amazonaws.services.lexrts.model.DialogState#Fulfilled}: Amazon
     * Lex service was able to successfully complete the current transaction.
     * The text response and audio response, if available, will have further
     * details.
     * {@link com.amazonaws.services.lexrts.model.DialogState#ReadyForFulfillment}
     * : Amazon Lex service has all the details (read intent and all associated
     * slots) to fulfill the current transaction. However the transaction was
     * not fulfilled because the means for fulfillment was not set or client
     * side fulfillment was requested. Use {@link Response#getIntentName()} for
     * the intent identified by the service.
     * {@link Response#getSessionAttributes()} will contain the slots for
     * fulfillment.
     * {@link com.amazonaws.services.lexrts.model.DialogState#ConfirmIntent},
     * {@link com.amazonaws.services.lexrts.model.DialogState#ElicitIntent},
     * {@link com.amazonaws.services.lexrts.model.DialogState#ElicitParameter}:
     * Amazon Lex requires further input from the user to continue with this
     * transaction. The intent - {@link Response#getIntentName()}, parameter -
     * {@link Response#getParameterToIllicit()}, will provide more context.
     * </p>
     *
     * @return dialog state as {@link String}.
     */
    public String getDialogState() {
        return result.getDialogState();
    }

    /**
     * Returns session attributes.
     * @return session attributes, as {@link Map}.
     */
    public Map<String, String> getSessionAttributes() {
        return base64ToMap(result.getSessionAttributes());
    }

    /**
     * Returns a stream containing audio response from the service. This can
     * return null if text response was requested, check the content type
     * {@link Response#getContentType()}.
     *
     * @return text response from Amazon Lex service as a {@link InputStream}.
     */
    public InputStream getAudioResponse() {
        return  result.getAudioStream();
    }

    /**
     * Returns a text response from the service.
     * @return text response, as {@link String}.
     */
    public String getTextResponse() {
        return  result.getMessage();
    }

    /**
     * Returns the name of the slot which is required from the user. Check the
     * dialog state {@link Response#getDialogState()} for context.
     *
     * @return parameter required from user, as {@link String}.
     */
    public String getSlotToIllicit() {
        return result.getSlotToElicit();
    }

    /**
     * The response type from Amazon Lex service.
     *
     * @return
     */
    public String getContentType() {
        return  result.getContentType();
    }

    /**
     *
     * @return
     */
    public String getIntentName() {
        return result.getIntentName();
    }

    /**
     * Returns a Map of key value pair of the slots which are filled.
     *
     * @return
     */
    public Map<String, String> getSlots() {
        return base64ToMap(result.getSlots());
    }

    /**
     * Transcript of the voice input to the operation.
     * 
     * @return
     */
    public String getInputTranscript() {
        return result.getInputTranscript();
    }

    private static Map<String, String> base64ToMap(String base64) {
        byte[] bytes = Base64.decode(base64);
        String valueAsString = new String(bytes, Charset.forName("UTF-8"));
        Map<String, String> valueAsMap = JsonUtils.jsonToMap(valueAsString);
        return valueAsMap;
    }
}
