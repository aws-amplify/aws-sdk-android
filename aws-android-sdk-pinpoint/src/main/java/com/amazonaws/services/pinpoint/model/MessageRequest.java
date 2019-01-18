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
 * Send message request.
 */
public class MessageRequest implements Serializable {
    /**
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address.
     */
    private java.util.Map<String, AddressConfiguration> addresses;

    /**
     * A map of custom attributes to attributes to be attached to the message.
     * This payload is added to the push notification's 'data.pinpoint' object
     * or added to the email/sms delivery receipt event attributes.
     */
    private java.util.Map<String, String> context;

    /**
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. Within an
     * EndpointSendConfiguration object, you can tailor the message for an
     * endpoint by specifying message overrides or substitutions.
     */
    private java.util.Map<String, EndpointSendConfiguration> endpoints;

    /**
     * Message configuration.
     */
    private DirectMessageConfiguration messageConfiguration;

    /**
     * A unique ID that you can use to trace a message. This ID is visible to
     * recipients.
     */
    private String traceId;

    /**
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address.
     *
     * @return A map of key-value pairs, where each key is an address and each
     *         value is an AddressConfiguration object. An address can be a push
     *         notification token, a phone number, or an email address.
     */
    public java.util.Map<String, AddressConfiguration> getAddresses() {
        return addresses;
    }

    /**
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address.
     *
     * @param addresses A map of key-value pairs, where each key is an address
     *            and each value is an AddressConfiguration object. An address
     *            can be a push notification token, a phone number, or an email
     *            address.
     */
    public void setAddresses(java.util.Map<String, AddressConfiguration> addresses) {
        this.addresses = addresses;
    }

    /**
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addresses A map of key-value pairs, where each key is an address
     *            and each value is an AddressConfiguration object. An address
     *            can be a push notification token, a phone number, or an email
     *            address.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withAddresses(java.util.Map<String, AddressConfiguration> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * A map of key-value pairs, where each key is an address and each value is
     * an AddressConfiguration object. An address can be a push notification
     * token, a phone number, or an email address.
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
     * A map of custom attributes to attributes to be attached to the message.
     * This payload is added to the push notification's 'data.pinpoint' object
     * or added to the email/sms delivery receipt event attributes.
     *
     * @return A map of custom attributes to attributes to be attached to the
     *         message. This payload is added to the push notification's
     *         'data.pinpoint' object or added to the email/sms delivery receipt
     *         event attributes.
     */
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message.
     * This payload is added to the push notification's 'data.pinpoint' object
     * or added to the email/sms delivery receipt event attributes.
     *
     * @param context A map of custom attributes to attributes to be attached to
     *            the message. This payload is added to the push notification's
     *            'data.pinpoint' object or added to the email/sms delivery
     *            receipt event attributes.
     */
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message.
     * This payload is added to the push notification's 'data.pinpoint' object
     * or added to the email/sms delivery receipt event attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param context A map of custom attributes to attributes to be attached to
     *            the message. This payload is added to the push notification's
     *            'data.pinpoint' object or added to the email/sms delivery
     *            receipt event attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withContext(java.util.Map<String, String> context) {
        this.context = context;
        return this;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message.
     * This payload is added to the push notification's 'data.pinpoint' object
     * or added to the email/sms delivery receipt event attributes.
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
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. Within an
     * EndpointSendConfiguration object, you can tailor the message for an
     * endpoint by specifying message overrides or substitutions.
     *
     * @return A map of key-value pairs, where each key is an endpoint ID and
     *         each value is an EndpointSendConfiguration object. Within an
     *         EndpointSendConfiguration object, you can tailor the message for
     *         an endpoint by specifying message overrides or substitutions.
     */
    public java.util.Map<String, EndpointSendConfiguration> getEndpoints() {
        return endpoints;
    }

    /**
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. Within an
     * EndpointSendConfiguration object, you can tailor the message for an
     * endpoint by specifying message overrides or substitutions.
     *
     * @param endpoints A map of key-value pairs, where each key is an endpoint
     *            ID and each value is an EndpointSendConfiguration object.
     *            Within an EndpointSendConfiguration object, you can tailor the
     *            message for an endpoint by specifying message overrides or
     *            substitutions.
     */
    public void setEndpoints(java.util.Map<String, EndpointSendConfiguration> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. Within an
     * EndpointSendConfiguration object, you can tailor the message for an
     * endpoint by specifying message overrides or substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints A map of key-value pairs, where each key is an endpoint
     *            ID and each value is an EndpointSendConfiguration object.
     *            Within an EndpointSendConfiguration object, you can tailor the
     *            message for an endpoint by specifying message overrides or
     *            substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withEndpoints(java.util.Map<String, EndpointSendConfiguration> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * A map of key-value pairs, where each key is an endpoint ID and each value
     * is an EndpointSendConfiguration object. Within an
     * EndpointSendConfiguration object, you can tailor the message for an
     * endpoint by specifying message overrides or substitutions.
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
     * Message configuration.
     *
     * @return Message configuration.
     */
    public DirectMessageConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }

    /**
     * Message configuration.
     *
     * @param messageConfiguration Message configuration.
     */
    public void setMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * Message configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfiguration Message configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
        return this;
    }

    /**
     * A unique ID that you can use to trace a message. This ID is visible to
     * recipients.
     *
     * @return A unique ID that you can use to trace a message. This ID is
     *         visible to recipients.
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * A unique ID that you can use to trace a message. This ID is visible to
     * recipients.
     *
     * @param traceId A unique ID that you can use to trace a message. This ID
     *            is visible to recipients.
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * A unique ID that you can use to trace a message. This ID is visible to
     * recipients.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traceId A unique ID that you can use to trace a message. This ID
     *            is visible to recipients.
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
        if (other.getTraceId() == null ^ this.getTraceId() == null)
            return false;
        if (other.getTraceId() != null && other.getTraceId().equals(this.getTraceId()) == false)
            return false;
        return true;
    }
}
