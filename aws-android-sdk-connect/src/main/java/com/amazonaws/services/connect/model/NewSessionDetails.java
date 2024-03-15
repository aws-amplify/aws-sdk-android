/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Payload of chat properties to apply when starting a new contact.
 * </p>
 */
public class NewSessionDetails implements Serializable {
    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     */
    private java.util.List<String> supportedMessagingContentTypes;

    /**
     * <p>
     * The customer's details.
     * </p>
     */
    private ParticipantDetails participantDetails;

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The streaming configuration, such as the Amazon SNS streaming endpoint.
     * </p>
     */
    private ChatStreamingConfiguration streamingConfiguration;

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     *
     * @return <p>
     *         The supported chat message content types. Supported types are
     *         <code>text/plain</code>, <code>text/markdown</code>,
     *         <code>application/json</code>,
     *         <code>application/vnd.amazonaws.connect.message.interactive</code>
     *         , and
     *         <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *         .
     *         </p>
     *         <p>
     *         Content types must always contain <code> text/plain</code>. You
     *         can then put any other supported type in the list. For example,
     *         all the following lists are valid because they contain
     *         <code>text/plain</code>:
     *         <code>[text/plain, text/markdown, application/json]</code>,
     *         <code> [text/markdown, text/plain]</code>,
     *         <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *         .
     *         </p>
     */
    public java.util.List<String> getSupportedMessagingContentTypes() {
        return supportedMessagingContentTypes;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     *
     * @param supportedMessagingContentTypes <p>
     *            The supported chat message content types. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>,
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            , and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     *            <p>
     *            Content types must always contain <code> text/plain</code>.
     *            You can then put any other supported type in the list. For
     *            example, all the following lists are valid because they
     *            contain <code>text/plain</code>:
     *            <code>[text/plain, text/markdown, application/json]</code>,
     *            <code> [text/markdown, text/plain]</code>,
     *            <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *            .
     *            </p>
     */
    public void setSupportedMessagingContentTypes(
            java.util.Collection<String> supportedMessagingContentTypes) {
        if (supportedMessagingContentTypes == null) {
            this.supportedMessagingContentTypes = null;
            return;
        }

        this.supportedMessagingContentTypes = new java.util.ArrayList<String>(
                supportedMessagingContentTypes);
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedMessagingContentTypes <p>
     *            The supported chat message content types. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>,
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            , and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     *            <p>
     *            Content types must always contain <code> text/plain</code>.
     *            You can then put any other supported type in the list. For
     *            example, all the following lists are valid because they
     *            contain <code>text/plain</code>:
     *            <code>[text/plain, text/markdown, application/json]</code>,
     *            <code> [text/markdown, text/plain]</code>,
     *            <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewSessionDetails withSupportedMessagingContentTypes(
            String... supportedMessagingContentTypes) {
        if (getSupportedMessagingContentTypes() == null) {
            this.supportedMessagingContentTypes = new java.util.ArrayList<String>(
                    supportedMessagingContentTypes.length);
        }
        for (String value : supportedMessagingContentTypes) {
            this.supportedMessagingContentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedMessagingContentTypes <p>
     *            The supported chat message content types. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>,
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            , and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     *            <p>
     *            Content types must always contain <code> text/plain</code>.
     *            You can then put any other supported type in the list. For
     *            example, all the following lists are valid because they
     *            contain <code>text/plain</code>:
     *            <code>[text/plain, text/markdown, application/json]</code>,
     *            <code> [text/markdown, text/plain]</code>,
     *            <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewSessionDetails withSupportedMessagingContentTypes(
            java.util.Collection<String> supportedMessagingContentTypes) {
        setSupportedMessagingContentTypes(supportedMessagingContentTypes);
        return this;
    }

    /**
     * <p>
     * The customer's details.
     * </p>
     *
     * @return <p>
     *         The customer's details.
     *         </p>
     */
    public ParticipantDetails getParticipantDetails() {
        return participantDetails;
    }

    /**
     * <p>
     * The customer's details.
     * </p>
     *
     * @param participantDetails <p>
     *            The customer's details.
     *            </p>
     */
    public void setParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
    }

    /**
     * <p>
     * The customer's details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantDetails <p>
     *            The customer's details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewSessionDetails withParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @return <p>
     *         A custom key-value pair using an attribute map. The attributes
     *         are standard Amazon Connect attributes. They can be accessed in
     *         flows just like any other contact attributes.
     *         </p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs
     *         per contact. Attribute keys can include only alphanumeric, dash,
     *         and underscore characters.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @param attributes <p>
     *            A custom key-value pair using an attribute map. The attributes
     *            are standard Amazon Connect attributes. They can be accessed
     *            in flows just like any other contact attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A custom key-value pair using an attribute map. The attributes
     *            are standard Amazon Connect attributes. They can be accessed
     *            in flows just like any other contact attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewSessionDetails withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewSessionDetails addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public NewSessionDetails clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The streaming configuration, such as the Amazon SNS streaming endpoint.
     * </p>
     *
     * @return <p>
     *         The streaming configuration, such as the Amazon SNS streaming
     *         endpoint.
     *         </p>
     */
    public ChatStreamingConfiguration getStreamingConfiguration() {
        return streamingConfiguration;
    }

    /**
     * <p>
     * The streaming configuration, such as the Amazon SNS streaming endpoint.
     * </p>
     *
     * @param streamingConfiguration <p>
     *            The streaming configuration, such as the Amazon SNS streaming
     *            endpoint.
     *            </p>
     */
    public void setStreamingConfiguration(ChatStreamingConfiguration streamingConfiguration) {
        this.streamingConfiguration = streamingConfiguration;
    }

    /**
     * <p>
     * The streaming configuration, such as the Amazon SNS streaming endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamingConfiguration <p>
     *            The streaming configuration, such as the Amazon SNS streaming
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewSessionDetails withStreamingConfiguration(
            ChatStreamingConfiguration streamingConfiguration) {
        this.streamingConfiguration = streamingConfiguration;
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
        if (getSupportedMessagingContentTypes() != null)
            sb.append("SupportedMessagingContentTypes: " + getSupportedMessagingContentTypes()
                    + ",");
        if (getParticipantDetails() != null)
            sb.append("ParticipantDetails: " + getParticipantDetails() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getStreamingConfiguration() != null)
            sb.append("StreamingConfiguration: " + getStreamingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSupportedMessagingContentTypes() == null) ? 0
                        : getSupportedMessagingContentTypes().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantDetails() == null) ? 0 : getParticipantDetails().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getStreamingConfiguration() == null) ? 0 : getStreamingConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewSessionDetails == false)
            return false;
        NewSessionDetails other = (NewSessionDetails) obj;

        if (other.getSupportedMessagingContentTypes() == null
                ^ this.getSupportedMessagingContentTypes() == null)
            return false;
        if (other.getSupportedMessagingContentTypes() != null
                && other.getSupportedMessagingContentTypes().equals(
                        this.getSupportedMessagingContentTypes()) == false)
            return false;
        if (other.getParticipantDetails() == null ^ this.getParticipantDetails() == null)
            return false;
        if (other.getParticipantDetails() != null
                && other.getParticipantDetails().equals(this.getParticipantDetails()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getStreamingConfiguration() == null ^ this.getStreamingConfiguration() == null)
            return false;
        if (other.getStreamingConfiguration() != null
                && other.getStreamingConfiguration().equals(this.getStreamingConfiguration()) == false)
            return false;
        return true;
    }
}
