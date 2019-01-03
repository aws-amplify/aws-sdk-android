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

package com.amazonaws.mobileconnectors.lex.interactionkit.continuations;

import android.util.Log;

import com.amazonaws.mobileconnectors.lex.interactionkit.InteractionClient;
import com.amazonaws.mobileconnectors.lex.interactionkit.exceptions.InvalidParameterException;
import com.amazonaws.mobileconnectors.lex.interactionkit.utils.ResponseType;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Continuations</b>
 * <p>
 * "Continuation"s provide a simple technique to continue with a transaction
 * after a user responds to a prompt from the Amazon Lex service. This
 * encapsulates and provides access to responses from the Amazon Lex service.
 * </p>
 */
public final class LexServiceContinuation{
    // Response from Amazon Lex service.
    private final InteractionClient interactionClient;
    private final Map<String, String> sessionAttributes;
    private final ResponseType responseMode;
    private final ResponseType requestMode;

    /**
     * Constructs a continuation for speech request.
     * @param interactionClient {@link InteractionClient}.
     */
    public LexServiceContinuation(InteractionClient interactionClient,
                                           ResponseType responseMode,
                                           ResponseType requestMode) {
        this.interactionClient = interactionClient;
        this.sessionAttributes = new HashMap<String, String>();
        this.responseMode = responseMode;
        this.requestMode = requestMode;
    }

    /**
     * Returns a specific session attribute.
     * @param attribute the request attribute as a {@link String}.
     * @return the value for the attribute, null if the attribute is not set.
     */
    public String getSessionAttribute(String attribute) {
        return this.sessionAttributes.get(attribute);
    }

    /**
     * Returns all session attributes.
     * @return All session attributes as a {@link Map}.
     */
    public Map<String, String> getSessionAttributes() {
        return this.sessionAttributes;
    }

    /**
     * Replace all session attributes with a new set.
     * @param sessionAttributes {@link Map}.
     */
    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes.clear();
        this.sessionAttributes.putAll(sessionAttributes);
    }

    /**
     * Set value for a specific session attribute, will over-write current value.
     * @param attribute name of the attribute as {@link String}.
     * @param value value of the attribute as {@link String}.
     */
    public void setSessionAttribute(String attribute, String value) {
        sessionAttributes.put(attribute, value);
    }

    /**
     * Use this method if the users response is speech. The client will listen to user's input from
     * the device's microphone. The service will respond to this request with text.
     */
    public void continueWithAudioInForTextOut() {
        continueWithAudioInForTextOut(null);
    }

    /**
     * Use this method if the users response is speech. The client will listen to user's input from
     * the device's microphone. The service will respond to this request with text.
     *
     * @param requestAttributes attributes to add to this request
     */
    public void continueWithAudioInForTextOut(Map<String, String> requestAttributes) {
        interactionClient.audioInForTextOut(sessionAttributes, requestAttributes);
    }

    /**
     * Use this method if the users response is speech. The client will listen to user's input from
     * the device's microphone. The service will respond to this request with audio.
     */
    public void continueWithAudioInForAudioOut() {
        continueWithAudioInForAudioOut(null);
    }

    /**
     * Use this method if the users response is speech. The client will listen to user's input from
     * the device's microphone. The service will respond to this request with audio.
     *
     * @param requestAttributes attributes to add to this request
     */
    public void continueWithAudioInForAudioOut(Map<String, String> requestAttributes) {
        interactionClient.audioInForAudioOut(sessionAttributes, requestAttributes);
    }

    /**
     * Use this method to respond with text and expect service response with audio.
     * @param text the response to the prompt as a {@link String}.
     */
    public void continueWithTextInForAudioOut(String text) {
        continueWithTextInForAudioOut(text, null);
    }

    /**
     * Use this method to respond with text and expect service response with audio.
     * @param text the response to the prompt as a {@link String}.
     *
     * @param requestAttributes attributes to add to this request
     */
    public void continueWithTextInForAudioOut(String text, Map<String, String> requestAttributes) {
        interactionClient.textInForAudioOut(text, sessionAttributes, requestAttributes);
    }

    /**
     * Use this method to respond with text and expect service response with text.
     * @param text the response to the prompt as a {@link String}.
     */
    public void continueWithTextInForTextOut(String text) {
        continueWithTextInForTextOut(text, null);
    }

    /**
     * Use this method to respond with text and expect service response with text.
     * @param text the response to the prompt as a {@link String}.
     *
     * @param requestAttributes attributes to add to this request
     */
    public void continueWithTextInForTextOut(String text, Map<String, String> requestAttributes) {
        interactionClient.textInForTextOut(text, sessionAttributes, requestAttributes);
    }

    /**
     * Use this method to continue with the current audio input and output mode, and current session attributes.
     */
    public void continueWithCurrentMode() {
        Log.d("SDK", " -- responseMode: " + responseMode + "; requestMode: " + requestMode);
        if (ResponseType.AUDIO_MPEG.equals(responseMode) && ResponseType.AUDIO_MPEG.equals(requestMode)) {
            continueWithAudioInForAudioOut();
        } else {
            throw new InvalidParameterException(
                    "Cannot continue with current mode, if request and response are not audio");
        }
    }

    /**
     * Use this method to cancel the current transaction.
     */
    public void cancel() {
        interactionClient.cancel();
    }
}
