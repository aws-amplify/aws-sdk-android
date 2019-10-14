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
 * Specifies the configuration and other settings for a message to send to all
 * the endpoints that are associated with a list of users.
 * </p>
 */
public class SendUsersMessageRequest implements Serializable {
    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon
     * Pinpoint adds these attributes to the data.pinpoint object in the body of
     * the notification payload. Amazon Pinpoint also provides these attributes
     * in the events that it generates for users-messages deliveries.
     * </p>
     */
    private java.util.Map<String, String> context;

    /**
     * <p>
     * The message definitions for the default message and any default messages
     * that you defined for specific channels.
     * </p>
     */
    private DirectMessageConfiguration messageConfiguration;

    /**
     * <p>
     * The message template to use for the message.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;

    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible
     * to message recipients.
     * </p>
     */
    private String traceId;

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects.
     * You can use an EndpointSendConfiguration object to tailor the message for
     * a user by specifying settings such as content overrides and message
     * variables.
     * </p>
     */
    private java.util.Map<String, EndpointSendConfiguration> users;

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon
     * Pinpoint adds these attributes to the data.pinpoint object in the body of
     * the notification payload. Amazon Pinpoint also provides these attributes
     * in the events that it generates for users-messages deliveries.
     * </p>
     *
     * @return <p>
     *         A map of custom attribute-value pairs. For a push notification,
     *         Amazon Pinpoint adds these attributes to the data.pinpoint object
     *         in the body of the notification payload. Amazon Pinpoint also
     *         provides these attributes in the events that it generates for
     *         users-messages deliveries.
     *         </p>
     */
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon
     * Pinpoint adds these attributes to the data.pinpoint object in the body of
     * the notification payload. Amazon Pinpoint also provides these attributes
     * in the events that it generates for users-messages deliveries.
     * </p>
     *
     * @param context <p>
     *            A map of custom attribute-value pairs. For a push
     *            notification, Amazon Pinpoint adds these attributes to the
     *            data.pinpoint object in the body of the notification payload.
     *            Amazon Pinpoint also provides these attributes in the events
     *            that it generates for users-messages deliveries.
     *            </p>
     */
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon
     * Pinpoint adds these attributes to the data.pinpoint object in the body of
     * the notification payload. Amazon Pinpoint also provides these attributes
     * in the events that it generates for users-messages deliveries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param context <p>
     *            A map of custom attribute-value pairs. For a push
     *            notification, Amazon Pinpoint adds these attributes to the
     *            data.pinpoint object in the body of the notification payload.
     *            Amazon Pinpoint also provides these attributes in the events
     *            that it generates for users-messages deliveries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageRequest withContext(java.util.Map<String, String> context) {
        this.context = context;
        return this;
    }

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon
     * Pinpoint adds these attributes to the data.pinpoint object in the body of
     * the notification payload. Amazon Pinpoint also provides these attributes
     * in the events that it generates for users-messages deliveries.
     * </p>
     * <p>
     * The method adds a new key-value pair into Context parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Context.
     * @param value The corresponding value of the entry to be added into
     *            Context.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageRequest addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SendUsersMessageRequest clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * The message definitions for the default message and any default messages
     * that you defined for specific channels.
     * </p>
     *
     * @return <p>
     *         The message definitions for the default message and any default
     *         messages that you defined for specific channels.
     *         </p>
     */
    public DirectMessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * <p>
     * The message definitions for the default message and any default messages
     * that you defined for specific channels.
     * </p>
     *
     * @param messageConfiguration <p>
     *            The message definitions for the default message and any
     *            default messages that you defined for specific channels.
     *            </p>
     */
    public void setMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * <p>
     * The message definitions for the default message and any default messages
     * that you defined for specific channels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfiguration <p>
     *            The message definitions for the default message and any
     *            default messages that you defined for specific channels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageRequest withMessageConfiguration(
            DirectMessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
        return this;
    }

    /**
     * <p>
     * The message template to use for the message.
     * </p>
     *
     * @return <p>
     *         The message template to use for the message.
     *         </p>
     */
    public TemplateConfiguration getTemplateConfiguration() {
        return templateConfiguration;
    }

    /**
     * <p>
     * The message template to use for the message.
     * </p>
     *
     * @param templateConfiguration <p>
     *            The message template to use for the message.
     *            </p>
     */
    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * The message template to use for the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateConfiguration <p>
     *            The message template to use for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageRequest withTemplateConfiguration(
            TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }

    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible
     * to message recipients.
     * </p>
     *
     * @return <p>
     *         The unique identifier for tracing the message. This identifier is
     *         visible to message recipients.
     *         </p>
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible
     * to message recipients.
     * </p>
     *
     * @param traceId <p>
     *            The unique identifier for tracing the message. This identifier
     *            is visible to message recipients.
     *            </p>
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible
     * to message recipients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traceId <p>
     *            The unique identifier for tracing the message. This identifier
     *            is visible to message recipients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageRequest withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects.
     * You can use an EndpointSendConfiguration object to tailor the message for
     * a user by specifying settings such as content overrides and message
     * variables.
     * </p>
     *
     * @return <p>
     *         A map that associates user IDs with EndpointSendConfiguration
     *         objects. You can use an EndpointSendConfiguration object to
     *         tailor the message for a user by specifying settings such as
     *         content overrides and message variables.
     *         </p>
     */
    public java.util.Map<String, EndpointSendConfiguration> getUsers() {
        return users;
    }

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects.
     * You can use an EndpointSendConfiguration object to tailor the message for
     * a user by specifying settings such as content overrides and message
     * variables.
     * </p>
     *
     * @param users <p>
     *            A map that associates user IDs with EndpointSendConfiguration
     *            objects. You can use an EndpointSendConfiguration object to
     *            tailor the message for a user by specifying settings such as
     *            content overrides and message variables.
     *            </p>
     */
    public void setUsers(java.util.Map<String, EndpointSendConfiguration> users) {
        this.users = users;
    }

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects.
     * You can use an EndpointSendConfiguration object to tailor the message for
     * a user by specifying settings such as content overrides and message
     * variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param users <p>
     *            A map that associates user IDs with EndpointSendConfiguration
     *            objects. You can use an EndpointSendConfiguration object to
     *            tailor the message for a user by specifying settings such as
     *            content overrides and message variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageRequest withUsers(java.util.Map<String, EndpointSendConfiguration> users) {
        this.users = users;
        return this;
    }

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects.
     * You can use an EndpointSendConfiguration object to tailor the message for
     * a user by specifying settings such as content overrides and message
     * variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into Users parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Users.
     * @param value The corresponding value of the entry to be added into Users.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessageRequest addUsersEntry(String key, EndpointSendConfiguration value) {
        if (null == this.users) {
            this.users = new java.util.HashMap<String, EndpointSendConfiguration>();
        }
        if (this.users.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.users.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Users.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SendUsersMessageRequest clearUsersEntries() {
        this.users = null;
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
        if (getContext() != null)
            sb.append("Context: " + getContext() + ",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: " + getMessageConfiguration() + ",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: " + getTemplateConfiguration() + ",");
        if (getTraceId() != null)
            sb.append("TraceId: " + getTraceId() + ",");
        if (getUsers() != null)
            sb.append("Users: " + getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode
                + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTraceId() == null) ? 0 : getTraceId().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendUsersMessageRequest == false)
            return false;
        SendUsersMessageRequest other = (SendUsersMessageRequest) obj;

        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getMessageConfiguration() == null ^ this.getMessageConfiguration() == null)
            return false;
        if (other.getMessageConfiguration() != null
                && other.getMessageConfiguration().equals(this.getMessageConfiguration()) == false)
            return false;
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null
                && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
            return false;
        if (other.getTraceId() == null ^ this.getTraceId() == null)
            return false;
        if (other.getTraceId() != null && other.getTraceId().equals(this.getTraceId()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }
}
