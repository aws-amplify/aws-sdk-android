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
 * Specifies the objects that define configuration and other settings for a
 * message.
 * </p>
 */
public class MessageRequest implements Serializable {
    /**
     * <p>
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address. You can use an
     * AddressConfiguration object to tailor the message for an address by
     * specifying settings such as content overrides and message variables.
     * </p>
     */
    private java.util.Map<String, AddressConfiguration> addresses;

    /**
     * <p>
     * A map of custom attributes to attach to the message. For a push
     * notification, this payload is added to the data.pinpoint object. For an
     * email or text message, this payload is added to email/SMS delivery
     * receipt event attributes.
     * </p>
     */
    private java.util.Map<String, String> context;

    /**
     * <p>
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. You can use an
     * EndpointSendConfiguration object to tailor the message for an endpoint by
     * specifying settings such as content overrides and message variables.
     * </p>
     */
    private java.util.Map<String, EndpointSendConfiguration> endpoints;

    /**
     * <p>
     * The set of properties that defines the configuration settings for the
     * message.
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
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address. You can use an
     * AddressConfiguration object to tailor the message for an address by
     * specifying settings such as content overrides and message variables.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs, where each key is an address and each
     *         value is an AddressConfiguration object. An address can be a push
     *         notification token, a phone number, or an email address. You can
     *         use an AddressConfiguration object to tailor the message for an
     *         address by specifying settings such as content overrides and
     *         message variables.
     *         </p>
     */
    public java.util.Map<String, AddressConfiguration> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address. You can use an
     * AddressConfiguration object to tailor the message for an address by
     * specifying settings such as content overrides and message variables.
     * </p>
     *
     * @param addresses <p>
     *            A map of key-value pairs, where each key is an address and
     *            each value is an AddressConfiguration object. An address can
     *            be a push notification token, a phone number, or an email
     *            address. You can use an AddressConfiguration object to tailor
     *            the message for an address by specifying settings such as
     *            content overrides and message variables.
     *            </p>
     */
    public void setAddresses(java.util.Map<String, AddressConfiguration> addresses) {
        this.addresses = addresses;
    }

    /**
     * <p>
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address. You can use an
     * AddressConfiguration object to tailor the message for an address by
     * specifying settings such as content overrides and message variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addresses <p>
     *            A map of key-value pairs, where each key is an address and
     *            each value is an AddressConfiguration object. An address can
     *            be a push notification token, a phone number, or an email
     *            address. You can use an AddressConfiguration object to tailor
     *            the message for an address by specifying settings such as
     *            content overrides and message variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withAddresses(java.util.Map<String, AddressConfiguration> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address. You can use an
     * AddressConfiguration object to tailor the message for an address by
     * specifying settings such as content overrides and message variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into Addresses parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Addresses.
     * @param value The corresponding value of the entry to be added into
     *            Addresses.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest addAddressesEntry(String key, AddressConfiguration value) {
        if (null == this.addresses) {
            this.addresses = new java.util.HashMap<String, AddressConfiguration>();
        }
        if (this.addresses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.addresses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MessageRequest clearAddressesEntries() {
        this.addresses = null;
        return this;
    }

    /**
     * <p>
     * A map of custom attributes to attach to the message. For a push
     * notification, this payload is added to the data.pinpoint object. For an
     * email or text message, this payload is added to email/SMS delivery
     * receipt event attributes.
     * </p>
     *
     * @return <p>
     *         A map of custom attributes to attach to the message. For a push
     *         notification, this payload is added to the data.pinpoint object.
     *         For an email or text message, this payload is added to email/SMS
     *         delivery receipt event attributes.
     *         </p>
     */
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * A map of custom attributes to attach to the message. For a push
     * notification, this payload is added to the data.pinpoint object. For an
     * email or text message, this payload is added to email/SMS delivery
     * receipt event attributes.
     * </p>
     *
     * @param context <p>
     *            A map of custom attributes to attach to the message. For a
     *            push notification, this payload is added to the data.pinpoint
     *            object. For an email or text message, this payload is added to
     *            email/SMS delivery receipt event attributes.
     *            </p>
     */
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * A map of custom attributes to attach to the message. For a push
     * notification, this payload is added to the data.pinpoint object. For an
     * email or text message, this payload is added to email/SMS delivery
     * receipt event attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param context <p>
     *            A map of custom attributes to attach to the message. For a
     *            push notification, this payload is added to the data.pinpoint
     *            object. For an email or text message, this payload is added to
     *            email/SMS delivery receipt event attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withContext(java.util.Map<String, String> context) {
        this.context = context;
        return this;
    }

    /**
     * <p>
     * A map of custom attributes to attach to the message. For a push
     * notification, this payload is added to the data.pinpoint object. For an
     * email or text message, this payload is added to email/SMS delivery
     * receipt event attributes.
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
    public MessageRequest addContextEntry(String key, String value) {
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
    public MessageRequest clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. You can use an
     * EndpointSendConfiguration object to tailor the message for an endpoint by
     * specifying settings such as content overrides and message variables.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs, where each key is an endpoint ID and
     *         each value is an EndpointSendConfiguration object. You can use an
     *         EndpointSendConfiguration object to tailor the message for an
     *         endpoint by specifying settings such as content overrides and
     *         message variables.
     *         </p>
     */
    public java.util.Map<String, EndpointSendConfiguration> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. You can use an
     * EndpointSendConfiguration object to tailor the message for an endpoint by
     * specifying settings such as content overrides and message variables.
     * </p>
     *
     * @param endpoints <p>
     *            A map of key-value pairs, where each key is an endpoint ID and
     *            each value is an EndpointSendConfiguration object. You can use
     *            an EndpointSendConfiguration object to tailor the message for
     *            an endpoint by specifying settings such as content overrides
     *            and message variables.
     *            </p>
     */
    public void setEndpoints(java.util.Map<String, EndpointSendConfiguration> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. You can use an
     * EndpointSendConfiguration object to tailor the message for an endpoint by
     * specifying settings such as content overrides and message variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints <p>
     *            A map of key-value pairs, where each key is an endpoint ID and
     *            each value is an EndpointSendConfiguration object. You can use
     *            an EndpointSendConfiguration object to tailor the message for
     *            an endpoint by specifying settings such as content overrides
     *            and message variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withEndpoints(java.util.Map<String, EndpointSendConfiguration> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. You can use an
     * EndpointSendConfiguration object to tailor the message for an endpoint by
     * specifying settings such as content overrides and message variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into Endpoints parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Endpoints.
     * @param value The corresponding value of the entry to be added into
     *            Endpoints.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest addEndpointsEntry(String key, EndpointSendConfiguration value) {
        if (null == this.endpoints) {
            this.endpoints = new java.util.HashMap<String, EndpointSendConfiguration>();
        }
        if (this.endpoints.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.endpoints.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MessageRequest clearEndpointsEntries() {
        this.endpoints = null;
        return this;
    }

    /**
     * <p>
     * The set of properties that defines the configuration settings for the
     * message.
     * </p>
     *
     * @return <p>
     *         The set of properties that defines the configuration settings for
     *         the message.
     *         </p>
     */
    public DirectMessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * <p>
     * The set of properties that defines the configuration settings for the
     * message.
     * </p>
     *
     * @param messageConfiguration <p>
     *            The set of properties that defines the configuration settings
     *            for the message.
     *            </p>
     */
    public void setMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * <p>
     * The set of properties that defines the configuration settings for the
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfiguration <p>
     *            The set of properties that defines the configuration settings
     *            for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
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
    public MessageRequest withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
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
    public MessageRequest withTraceId(String traceId) {
        this.traceId = traceId;
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
        if (getAddresses() != null)
            sb.append("Addresses: " + getAddresses() + ",");
        if (getContext() != null)
            sb.append("Context: " + getContext() + ",");
        if (getEndpoints() != null)
            sb.append("Endpoints: " + getEndpoints() + ",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: " + getMessageConfiguration() + ",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: " + getTemplateConfiguration() + ",");
        if (getTraceId() != null)
            sb.append("TraceId: " + getTraceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode
                + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTraceId() == null) ? 0 : getTraceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageRequest == false)
            return false;
        MessageRequest other = (MessageRequest) obj;

        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null
                && other.getAddresses().equals(this.getAddresses()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null
                && other.getEndpoints().equals(this.getEndpoints()) == false)
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
        return true;
    }
}
