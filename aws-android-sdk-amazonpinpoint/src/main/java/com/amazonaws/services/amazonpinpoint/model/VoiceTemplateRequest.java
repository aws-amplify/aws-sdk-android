/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the content and settings for a message template that can be used in
 * messages that are sent through the voice channel.
 * </p>
 */
public class VoiceTemplateRequest implements Serializable {
    /**
     * <p>
     * The text of the script to use in messages that are based on the message
     * template, in plain text format.
     * </p>
     */
    private String body;

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     */
    private String defaultSubstitutions;

    /**
     * <p>
     * The code for the language to use when synthesizing the text of the script
     * in messages that are based on the message template. For a list of
     * supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     */
    private String templateDescription;

    /**
     * <p>
     * The name of the voice to use when delivering messages that are based on
     * the message template. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * The text of the script to use in messages that are based on the message
     * template, in plain text format.
     * </p>
     *
     * @return <p>
     *         The text of the script to use in messages that are based on the
     *         message template, in plain text format.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The text of the script to use in messages that are based on the message
     * template, in plain text format.
     * </p>
     *
     * @param body <p>
     *            The text of the script to use in messages that are based on
     *            the message template, in plain text format.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The text of the script to use in messages that are based on the message
     * template, in plain text format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The text of the script to use in messages that are based on
     *            the message template, in plain text format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceTemplateRequest withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     *
     * @return <p>
     *         A JSON object that specifies the default values to use for
     *         message variables in the message template. This object is a set
     *         of key-value pairs. Each key defines a message variable in the
     *         template. The corresponding value defines the default value for
     *         that variable. When you create a message that's based on the
     *         template, you can override these defaults with message-specific
     *         and address-specific variables and values.
     *         </p>
     */
    public String getDefaultSubstitutions() {
        return defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values to use for
     *            message variables in the message template. This object is a
     *            set of key-value pairs. Each key defines a message variable in
     *            the template. The corresponding value defines the default
     *            value for that variable. When you create a message that's
     *            based on the template, you can override these defaults with
     *            message-specific and address-specific variables and values.
     *            </p>
     */
    public void setDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values to use for
     *            message variables in the message template. This object is a
     *            set of key-value pairs. Each key defines a message variable in
     *            the template. The corresponding value defines the default
     *            value for that variable. When you create a message that's
     *            based on the template, you can override these defaults with
     *            message-specific and address-specific variables and values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceTemplateRequest withDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
        return this;
    }

    /**
     * <p>
     * The code for the language to use when synthesizing the text of the script
     * in messages that are based on the message template. For a list of
     * supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The code for the language to use when synthesizing the text of
     *         the script in messages that are based on the message template.
     *         For a list of supported languages and the code for each one, see
     *         the <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html"
     *         >Amazon Polly Developer Guide</a>.
     *         </p>
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The code for the language to use when synthesizing the text of the script
     * in messages that are based on the message template. For a list of
     * supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     *
     * @param languageCode <p>
     *            The code for the language to use when synthesizing the text of
     *            the script in messages that are based on the message template.
     *            For a list of supported languages and the code for each one,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/what-is.html"
     *            >Amazon Polly Developer Guide</a>.
     *            </p>
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The code for the language to use when synthesizing the text of the script
     * in messages that are based on the message template. For a list of
     * supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCode <p>
     *            The code for the language to use when synthesizing the text of
     *            the script in messages that are based on the message template.
     *            For a list of supported languages and the code for each one,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/what-is.html"
     *            >Amazon Polly Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceTemplateRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that defines the tags
     *         to associate with the message template. Each tag consists of a
     *         required tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the message template. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the message template. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceTemplateRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceTemplateRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public VoiceTemplateRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     *
     * @return <p>
     *         A custom description of the message template.
     *         </p>
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     *
     * @param templateDescription <p>
     *            A custom description of the message template.
     *            </p>
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateDescription <p>
     *            A custom description of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceTemplateRequest withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * <p>
     * The name of the voice to use when delivering messages that are based on
     * the message template. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         The name of the voice to use when delivering messages that are
     *         based on the message template. For a list of supported voices,
     *         see the <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html"
     *         >Amazon Polly Developer Guide</a>.
     *         </p>
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * <p>
     * The name of the voice to use when delivering messages that are based on
     * the message template. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     *
     * @param voiceId <p>
     *            The name of the voice to use when delivering messages that are
     *            based on the message template. For a list of supported voices,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/what-is.html"
     *            >Amazon Polly Developer Guide</a>.
     *            </p>
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The name of the voice to use when delivering messages that are based on
     * the message template. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon
     * Polly Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceId <p>
     *            The name of the voice to use when delivering messages that are
     *            based on the message template. For a list of supported voices,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/what-is.html"
     *            >Amazon Polly Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VoiceTemplateRequest withVoiceId(String voiceId) {
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
        if (getDefaultSubstitutions() != null)
            sb.append("DefaultSubstitutions: " + getDefaultSubstitutions() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: " + getTemplateDescription() + ",");
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
                + ((getDefaultSubstitutions() == null) ? 0 : getDefaultSubstitutions().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceTemplateRequest == false)
            return false;
        VoiceTemplateRequest other = (VoiceTemplateRequest) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getDefaultSubstitutions() == null ^ this.getDefaultSubstitutions() == null)
            return false;
        if (other.getDefaultSubstitutions() != null
                && other.getDefaultSubstitutions().equals(this.getDefaultSubstitutions()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null
                && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        return true;
    }
}
