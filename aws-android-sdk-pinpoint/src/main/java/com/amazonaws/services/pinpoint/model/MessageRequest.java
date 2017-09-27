/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     */
    private java.util.Map<String, AddressConfiguration> addresses;

    /**
     * The JSON payload used for campaign attributes. This payload is added to
     * the notifications' data->pinpoint->campaign' object in iOS and flattened
     * to pinpoint.campaign.{AttributeName} keys in Android. Email will use the
     * attribute campaign_id to save the templates.
     */
    private java.util.Map<String, String> campaign;

    /**
     * A map of custom attributes to attributes to be attached to the message.
     * This payload is added to the push notification's 'data.pinpoint' object
     * or added to the email/sms delivery receipt event attributes.
     */
    private java.util.Map<String, String> context;

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     */
    private java.util.Map<String, EndpointSendConfiguration> endpoints;

    /**
     * Message configuration.
     */
    private DirectMessageConfiguration messageConfiguration;

    /**
     * Original request Id for which this message is delivered.
     */
    private String requestId;

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     *
     * @return A map of destination addresses, with the address as the key(Email
     *         address, phone number or push token) and the Address
     *         Configuration as the value.
     */
    public java.util.Map<String, AddressConfiguration> getAddresses() {
        return addresses;
    }

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     *
     * @param addresses A map of destination addresses, with the address as the
     *            key(Email address, phone number or push token) and the Address
     *            Configuration as the value.
     */
    public void setAddresses(java.util.Map<String, AddressConfiguration> addresses) {
        this.addresses = addresses;
    }

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addresses A map of destination addresses, with the address as the
     *            key(Email address, phone number or push token) and the Address
     *            Configuration as the value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withAddresses(java.util.Map<String, AddressConfiguration> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
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
     * The JSON payload used for campaign attributes. This payload is added to
     * the notifications' data->pinpoint->campaign' object in iOS and flattened
     * to pinpoint.campaign.{AttributeName} keys in Android. Email will use the
     * attribute campaign_id to save the templates.
     *
     * @return The JSON payload used for campaign attributes. This payload is
     *         added to the notifications' data->pinpoint->campaign' object in
     *         iOS and flattened to pinpoint.campaign.{AttributeName} keys in
     *         Android. Email will use the attribute campaign_id to save the
     *         templates.
     */
    public java.util.Map<String, String> getCampaign() {
        return campaign;
    }

    /**
     * The JSON payload used for campaign attributes. This payload is added to
     * the notifications' data->pinpoint->campaign' object in iOS and flattened
     * to pinpoint.campaign.{AttributeName} keys in Android. Email will use the
     * attribute campaign_id to save the templates.
     *
     * @param campaign The JSON payload used for campaign attributes. This
     *            payload is added to the notifications'
     *            data->pinpoint->campaign' object in iOS and flattened to
     *            pinpoint.campaign.{AttributeName} keys in Android. Email will
     *            use the attribute campaign_id to save the templates.
     */
    public void setCampaign(java.util.Map<String, String> campaign) {
        this.campaign = campaign;
    }

    /**
     * The JSON payload used for campaign attributes. This payload is added to
     * the notifications' data->pinpoint->campaign' object in iOS and flattened
     * to pinpoint.campaign.{AttributeName} keys in Android. Email will use the
     * attribute campaign_id to save the templates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaign The JSON payload used for campaign attributes. This
     *            payload is added to the notifications'
     *            data->pinpoint->campaign' object in iOS and flattened to
     *            pinpoint.campaign.{AttributeName} keys in Android. Email will
     *            use the attribute campaign_id to save the templates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withCampaign(java.util.Map<String, String> campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * The JSON payload used for campaign attributes. This payload is added to
     * the notifications' data->pinpoint->campaign' object in iOS and flattened
     * to pinpoint.campaign.{AttributeName} keys in Android. Email will use the
     * attribute campaign_id to save the templates.
     * <p>
     * The method adds a new key-value pair into Campaign parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Campaign.
     * @param value The corresponding value of the entry to be added into
     *            Campaign.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest addCampaignEntry(String key, String value) {
        if (null == this.campaign) {
            this.campaign = new java.util.HashMap<String, String>();
        }
        if (this.campaign.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.campaign.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Campaign.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MessageRequest clearCampaignEntries() {
        this.campaign = null;
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
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     *
     * @return A map of destination addresses, with the address as the key(Email
     *         address, phone number or push token) and the Address
     *         Configuration as the value.
     */
    public java.util.Map<String, EndpointSendConfiguration> getEndpoints() {
        return endpoints;
    }

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     *
     * @param endpoints A map of destination addresses, with the address as the
     *            key(Email address, phone number or push token) and the Address
     *            Configuration as the value.
     */
    public void setEndpoints(java.util.Map<String, EndpointSendConfiguration> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints A map of destination addresses, with the address as the
     *            key(Email address, phone number or push token) and the Address
     *            Configuration as the value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withEndpoints(java.util.Map<String, EndpointSendConfiguration> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * A map of destination addresses, with the address as the key(Email
     * address, phone number or push token) and the Address Configuration as the
     * value.
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
     * Original request Id for which this message is delivered.
     *
     * @return Original request Id for which this message is delivered.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Original request Id for which this message is delivered.
     *
     * @param requestId Original request Id for which this message is delivered.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Original request Id for which this message is delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId Original request Id for which this message is delivered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageRequest withRequestId(String requestId) {
        this.requestId = requestId;
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
        if (getCampaign() != null)
            sb.append("Campaign: " + getCampaign() + ",");
        if (getContext() != null)
            sb.append("Context: " + getContext() + ",");
        if (getEndpoints() != null)
            sb.append("Endpoints: " + getEndpoints() + ",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: " + getMessageConfiguration() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode + ((getCampaign() == null) ? 0 : getCampaign().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode
                + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
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
        if (other.getCampaign() == null ^ this.getCampaign() == null)
            return false;
        if (other.getCampaign() != null && other.getCampaign().equals(this.getCampaign()) == false)
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
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }
}
