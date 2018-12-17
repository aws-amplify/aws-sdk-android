/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Public endpoint attributes.
 */
public class PublicEndpoint implements Serializable {
    /**
     * The unique identifier for the recipient. For example, an address could be
     * a device token, email address, or mobile phone number.
     */
    private String address;

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create a segment.
     */
    private java.util.Map<String, java.util.List<String>> attributes;

    /**
     * The channel type. Valid values: APNS, GCM
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     */
    private String channelType;

    /**
     * The endpoint demographic attributes.
     */
    private EndpointDemographic demographic;

    /**
     * The date and time when the endpoint was last updated, in ISO 8601 format.
     */
    private String effectiveDate;

    /**
     * The status of the endpoint. If the update fails, the value is INACTIVE.
     * If the endpoint is updated successfully, the value is ACTIVE.
     */
    private String endpointStatus;

    /**
     * The endpoint location attributes.
     */
    private EndpointLocation location;

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     */
    private java.util.Map<String, Double> metrics;

    /**
     * Indicates whether a user has opted out of receiving messages with one of
     * the following values: ALL - User has opted out of all messages. NONE -
     * Users has not opted out and receives all messages.
     */
    private String optOut;

    /**
     * A unique identifier that is generated each time the endpoint is updated.
     */
    private String requestId;

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     */
    private EndpointUser user;

    /**
     * The unique identifier for the recipient. For example, an address could be
     * a device token, email address, or mobile phone number.
     *
     * @return The unique identifier for the recipient. For example, an address
     *         could be a device token, email address, or mobile phone number.
     */
    public String getAddress() {
        return address;
    }

    /**
     * The unique identifier for the recipient. For example, an address could be
     * a device token, email address, or mobile phone number.
     *
     * @param address The unique identifier for the recipient. For example, an
     *            address could be a device token, email address, or mobile
     *            phone number.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The unique identifier for the recipient. For example, an address could be
     * a device token, email address, or mobile phone number.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address The unique identifier for the recipient. For example, an
     *            address could be a device token, email address, or mobile
     *            phone number.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create a segment.
     *
     * @return Custom attributes that your app reports to Amazon Pinpoint. You
     *         can use these attributes as selection criteria when you create a
     *         segment.
     */
    public java.util.Map<String, java.util.List<String>> getAttributes() {
        return attributes;
    }

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create a segment.
     *
     * @param attributes Custom attributes that your app reports to Amazon
     *            Pinpoint. You can use these attributes as selection criteria
     *            when you create a segment.
     */
    public void setAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
    }

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create a segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes Custom attributes that your app reports to Amazon
     *            Pinpoint. You can use these attributes as selection criteria
     *            when you create a segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create a segment.
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
    public PublicEndpoint addAttributesEntry(String key, java.util.List<String> value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, java.util.List<String>>();
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
    public PublicEndpoint clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * The channel type. Valid values: APNS, GCM
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @return The channel type. Valid values: APNS, GCM
     * @see ChannelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * The channel type. Valid values: APNS, GCM
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType The channel type. Valid values: APNS, GCM
     * @see ChannelType
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * The channel type. Valid values: APNS, GCM
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType The channel type. Valid values: APNS, GCM
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public PublicEndpoint withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * The channel type. Valid values: APNS, GCM
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType The channel type. Valid values: APNS, GCM
     * @see ChannelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
    }

    /**
     * The channel type. Valid values: APNS, GCM
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType The channel type. Valid values: APNS, GCM
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public PublicEndpoint withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * The endpoint demographic attributes.
     *
     * @return The endpoint demographic attributes.
     */
    public EndpointDemographic getDemographic() {
        return demographic;
    }

    /**
     * The endpoint demographic attributes.
     *
     * @param demographic The endpoint demographic attributes.
     */
    public void setDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
    }

    /**
     * The endpoint demographic attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param demographic The endpoint demographic attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
        return this;
    }

    /**
     * The date and time when the endpoint was last updated, in ISO 8601 format.
     *
     * @return The date and time when the endpoint was last updated, in ISO 8601
     *         format.
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * The date and time when the endpoint was last updated, in ISO 8601 format.
     *
     * @param effectiveDate The date and time when the endpoint was last
     *            updated, in ISO 8601 format.
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * The date and time when the endpoint was last updated, in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectiveDate The date and time when the endpoint was last
     *            updated, in ISO 8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * The status of the endpoint. If the update fails, the value is INACTIVE.
     * If the endpoint is updated successfully, the value is ACTIVE.
     *
     * @return The status of the endpoint. If the update fails, the value is
     *         INACTIVE. If the endpoint is updated successfully, the value is
     *         ACTIVE.
     */
    public String getEndpointStatus() {
        return endpointStatus;
    }

    /**
     * The status of the endpoint. If the update fails, the value is INACTIVE.
     * If the endpoint is updated successfully, the value is ACTIVE.
     *
     * @param endpointStatus The status of the endpoint. If the update fails,
     *            the value is INACTIVE. If the endpoint is updated
     *            successfully, the value is ACTIVE.
     */
    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * The status of the endpoint. If the update fails, the value is INACTIVE.
     * If the endpoint is updated successfully, the value is ACTIVE.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointStatus The status of the endpoint. If the update fails,
     *            the value is INACTIVE. If the endpoint is updated
     *            successfully, the value is ACTIVE.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }

    /**
     * The endpoint location attributes.
     *
     * @return The endpoint location attributes.
     */
    public EndpointLocation getLocation() {
        return location;
    }

    /**
     * The endpoint location attributes.
     *
     * @param location The endpoint location attributes.
     */
    public void setLocation(EndpointLocation location) {
        this.location = location;
    }

    /**
     * The endpoint location attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location The endpoint location attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withLocation(EndpointLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     *
     * @return Custom metrics that your app reports to Amazon Pinpoint.
     */
    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     *
     * @param metrics Custom metrics that your app reports to Amazon Pinpoint.
     */
    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics Custom metrics that your app reports to Amazon Pinpoint.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PublicEndpoint clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * Indicates whether a user has opted out of receiving messages with one of
     * the following values: ALL - User has opted out of all messages. NONE -
     * Users has not opted out and receives all messages.
     *
     * @return Indicates whether a user has opted out of receiving messages with
     *         one of the following values: ALL - User has opted out of all
     *         messages. NONE - Users has not opted out and receives all
     *         messages.
     */
    public String getOptOut() {
        return optOut;
    }

    /**
     * Indicates whether a user has opted out of receiving messages with one of
     * the following values: ALL - User has opted out of all messages. NONE -
     * Users has not opted out and receives all messages.
     *
     * @param optOut Indicates whether a user has opted out of receiving
     *            messages with one of the following values: ALL - User has
     *            opted out of all messages. NONE - Users has not opted out and
     *            receives all messages.
     */
    public void setOptOut(String optOut) {
        this.optOut = optOut;
    }

    /**
     * Indicates whether a user has opted out of receiving messages with one of
     * the following values: ALL - User has opted out of all messages. NONE -
     * Users has not opted out and receives all messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optOut Indicates whether a user has opted out of receiving
     *            messages with one of the following values: ALL - User has
     *            opted out of all messages. NONE - Users has not opted out and
     *            receives all messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withOptOut(String optOut) {
        this.optOut = optOut;
        return this;
    }

    /**
     * A unique identifier that is generated each time the endpoint is updated.
     *
     * @return A unique identifier that is generated each time the endpoint is
     *         updated.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * A unique identifier that is generated each time the endpoint is updated.
     *
     * @param requestId A unique identifier that is generated each time the
     *            endpoint is updated.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * A unique identifier that is generated each time the endpoint is updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId A unique identifier that is generated each time the
     *            endpoint is updated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     *
     * @return Custom user-specific attributes that your app reports to Amazon
     *         Pinpoint.
     */
    public EndpointUser getUser() {
        return user;
    }

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     *
     * @param user Custom user-specific attributes that your app reports to
     *            Amazon Pinpoint.
     */
    public void setUser(EndpointUser user) {
        this.user = user;
    }

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user Custom user-specific attributes that your app reports to
     *            Amazon Pinpoint.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicEndpoint withUser(EndpointUser user) {
        this.user = user;
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
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getChannelType() != null)
            sb.append("ChannelType: " + getChannelType() + ",");
        if (getDemographic() != null)
            sb.append("Demographic: " + getDemographic() + ",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: " + getEffectiveDate() + ",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: " + getEndpointStatus() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getOptOut() != null)
            sb.append("OptOut: " + getOptOut() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode
                + ((getDemographic() == null) ? 0 : getDemographic().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getOptOut() == null) ? 0 : getOptOut().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicEndpoint == false)
            return false;
        PublicEndpoint other = (PublicEndpoint) obj;

        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null
                && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getDemographic() == null ^ this.getDemographic() == null)
            return false;
        if (other.getDemographic() != null
                && other.getDemographic().equals(this.getDemographic()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null
                && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null
                && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getOptOut() == null ^ this.getOptOut() == null)
            return false;
        if (other.getOptOut() != null && other.getOptOut().equals(this.getOptOut()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }
}
