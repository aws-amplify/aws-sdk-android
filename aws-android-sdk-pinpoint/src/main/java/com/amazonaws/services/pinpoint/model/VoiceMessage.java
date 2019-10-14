/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the settings for a one-time voice message that's sent directly to
 * an endpoint through the voice channel.
 * </p>
 */
public class VoiceMessage implements Serializable {
    /**
     * <p>
     * The text script for the voice message.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The language to use when delivering the message. For a list of supported
     * languages, see the <a href="AmazonPollyDG.html">Amazon Polly Developer
     * Guide</a>.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * The long code to send the voice message from. This value should be one of
     * the dedicated long codes that's assigned to your AWS account. Although it
     * isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery
     * of the message.
     * </p>
     */
    private String originationNumber;

    /**
     * <p>
     * The default message variables to use in the voice message. You can
     * override the default variables with individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of
     * supported voices, see the <a href="AmazonPollyDG.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * The text script for the voice message.
     * </p>
     *
     * @return <p>
     *         The text script for the voice message.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The text script for the voice message.
     * </p>
     *
     * @param body <p>
     *            The text script for the voice message.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The text script for the voice message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The text script for the voice message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The language to use when delivering the message. For a list of supported
     * languages, see the <a href="AmazonPollyDG.html">Amazon Polly Developer
     * Guide</a>.
     * </p>
     *
     * @return <p>
     *         The language to use when delivering the message. For a list of
     *         supported languages, see the <a href="AmazonPollyDG.html">Amazon
     *         Polly Developer Guide</a>.
     *         </p>
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language to use when delivering the message. For a list of supported
     * languages, see the <a href="AmazonPollyDG.html">Amazon Polly Developer
     * Guide</a>.
     * </p>
     *
     * @param languageCode <p>
     *            The language to use when delivering the message. For a list of
     *            supported languages, see the <a
     *            href="AmazonPollyDG.html">Amazon Polly Developer Guide</a>.
     *            </p>
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language to use when delivering the message. For a list of supported
     * languages, see the <a href="AmazonPollyDG.html">Amazon Polly Developer
     * Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCode <p>
     *            The language to use when delivering the message. For a list of
     *            supported languages, see the <a
     *            href="AmazonPollyDG.html">Amazon Polly Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceMessage withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The long code to send the voice message from. This value should be one of
     * the dedicated long codes that's assigned to your AWS account. Although it
     * isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery
     * of the message.
     * </p>
     *
     * @return <p>
     *         The long code to send the voice message from. This value should
     *         be one of the dedicated long codes that's assigned to your AWS
     *         account. Although it isn't required, we recommend that you
     *         specify the long code in E.164 format, for example +12065550100,
     *         to ensure prompt and accurate delivery of the message.
     *         </p>
     */
    public String getOriginationNumber() {
        return originationNumber;
    }

    /**
     * <p>
     * The long code to send the voice message from. This value should be one of
     * the dedicated long codes that's assigned to your AWS account. Although it
     * isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery
     * of the message.
     * </p>
     *
     * @param originationNumber <p>
     *            The long code to send the voice message from. This value
     *            should be one of the dedicated long codes that's assigned to
     *            your AWS account. Although it isn't required, we recommend
     *            that you specify the long code in E.164 format, for example
     *            +12065550100, to ensure prompt and accurate delivery of the
     *            message.
     *            </p>
     */
    public void setOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
    }

    /**
     * <p>
     * The long code to send the voice message from. This value should be one of
     * the dedicated long codes that's assigned to your AWS account. Although it
     * isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery
     * of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originationNumber <p>
     *            The long code to send the voice message from. This value
     *            should be one of the dedicated long codes that's assigned to
     *            your AWS account. Although it isn't required, we recommend
     *            that you specify the long code in E.164 format, for example
     *            +12065550100, to ensure prompt and accurate delivery of the
     *            message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceMessage withOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the voice message. You can
     * override the default variables with individual address variables.
     * </p>
     *
     * @return <p>
     *         The default message variables to use in the voice message. You
     *         can override the default variables with individual address
     *         variables.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the voice message. You can
     * override the default variables with individual address variables.
     * </p>
     *
     * @param substitutions <p>
     *            The default message variables to use in the voice message. You
     *            can override the default variables with individual address
     *            variables.
     *            </p>
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the voice message. You can
     * override the default variables with individual address variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions <p>
     *            The default message variables to use in the voice message. You
     *            can override the default variables with individual address
     *            variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceMessage withSubstitutions(
            java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the voice message. You can
     * override the default variables with individual address variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into Substitutions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Substitutions.
     * @param value The corresponding value of the entry to be added into
     *            Substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public VoiceMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of
     * supported voices, see the <a href="AmazonPollyDG.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The name of the voice to use when delivering the message. For a
     *         list of supported voices, see the <a
     *         href="AmazonPollyDG.html">Amazon Polly Developer Guide</a>.
     *         </p>
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of
     * supported voices, see the <a href="AmazonPollyDG.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     *
     * @param voiceId <p>
     *            The name of the voice to use when delivering the message. For
     *            a list of supported voices, see the <a
     *            href="AmazonPollyDG.html">Amazon Polly Developer Guide</a>.
     *            </p>
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of
     * supported voices, see the <a href="AmazonPollyDG.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceId <p>
     *            The name of the voice to use when delivering the message. For
     *            a list of supported voices, see the <a
     *            href="AmazonPollyDG.html">Amazon Polly Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceMessage withVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getOriginationNumber() != null)
            sb.append("OriginationNumber: " + getOriginationNumber() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions() + ",");
        if (getVoiceId() != null)
            sb.append("VoiceId: " + getVoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getOriginationNumber() == null) ? 0 : getOriginationNumber().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceMessage == false)
            return false;
        VoiceMessage other = (VoiceMessage) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getOriginationNumber() == null ^ this.getOriginationNumber() == null)
            return false;
        if (other.getOriginationNumber() != null
                && other.getOriginationNumber().equals(this.getOriginationNumber()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null
                && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        return true;
    }
}
