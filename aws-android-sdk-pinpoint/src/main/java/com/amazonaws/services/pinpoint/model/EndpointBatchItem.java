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
 * Endpoint update request
 */
public class EndpointBatchItem implements Serializable {
    /**
     * The address or token of the endpoint as provided by your push provider
     * (e.g. DeviceToken or RegistrationId).
     */
    private String address;

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create a segment.
     */
    private java.util.Map<String, java.util.List<String>> attributes;

    /**
     * The channel type. Valid values: GCM | APNS | SMS | EMAIL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, ADM, SMS, EMAIL, BAIDU
     */
    private String channelType;

    /**
     * The endpoint demographic attributes.
     */
    private EndpointDemographic demographic;

    /**
     * The last time the endpoint was updated. Provided in ISO 8601 format.
     */
    private String effectiveDate;

    /**
     * The endpoint status. Can be either ACTIVE or INACTIVE. Will be set to
     * INACTIVE if a delivery fails. Will be set to ACTIVE if the address is
     * updated.
     */
    private String endpointStatus;

    /**
     * The unique Id for the Endpoint in the batch.
     */
    private String id;

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
     * The unique ID for the most recent request to update the endpoint.
     */
    private String requestId;

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     */
    private EndpointUser user;

    /**
     * The address or token of the endpoint as provided by your push provider
     * (e.g. DeviceToken or RegistrationId).
     *
     * @return The address or token of the endpoint as provided by your push
     *         provider (e.g. DeviceToken or RegistrationId).
     */
    public String getAddress() {
        return address;
    }

    /**
     * The address or token of the endpoint as provided by your push provider
     * (e.g. DeviceToken or RegistrationId).
     *
     * @param address The address or token of the endpoint as provided by your
     *            push provider (e.g. DeviceToken or RegistrationId).
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The address or token of the endpoint as provided by your push provider
     * (e.g. DeviceToken or RegistrationId).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address The address or token of the endpoint as provided by your
     *            push provider (e.g. DeviceToken or RegistrationId).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withAddress(String address) {
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
    public EndpointBatchItem withAttributes(java.util.Map<String, java.util.List<String>> attributes) {
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
    public EndpointBatchItem addAttributesEntry(String key, java.util.List<String> value) {
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
    public EndpointBatchItem clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * The channel type. Valid values: GCM | APNS | SMS | EMAIL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, ADM, SMS, EMAIL, BAIDU
     *
     * @return The channel type. Valid values: GCM | APNS | SMS | EMAIL
     * @see ChannelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * The channel type. Valid values: GCM | APNS | SMS | EMAIL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, ADM, SMS, EMAIL, BAIDU
     *
     * @param channelType The channel type. Valid values: GCM | APNS | SMS |
     *            EMAIL
     * @see ChannelType
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * The channel type. Valid values: GCM | APNS | SMS | EMAIL
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, ADM, SMS, EMAIL, BAIDU
     *
     * @param channelType The channel type. Valid values: GCM | APNS | SMS |
     *            EMAIL
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public EndpointBatchItem withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * The channel type. Valid values: GCM | APNS | SMS | EMAIL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, ADM, SMS, EMAIL, BAIDU
     *
     * @param channelType The channel type. Valid values: GCM | APNS | SMS |
     *            EMAIL
     * @see ChannelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
    }

    /**
     * The channel type. Valid values: GCM | APNS | SMS | EMAIL
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, ADM, SMS, EMAIL, BAIDU
     *
     * @param channelType The channel type. Valid values: GCM | APNS | SMS |
     *            EMAIL
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public EndpointBatchItem withChannelType(ChannelType channelType) {
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
    public EndpointBatchItem withDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
        return this;
    }

    /**
     * The last time the endpoint was updated. Provided in ISO 8601 format.
     *
     * @return The last time the endpoint was updated. Provided in ISO 8601
     *         format.
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * The last time the endpoint was updated. Provided in ISO 8601 format.
     *
     * @param effectiveDate The last time the endpoint was updated. Provided in
     *            ISO 8601 format.
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * The last time the endpoint was updated. Provided in ISO 8601 format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectiveDate The last time the endpoint was updated. Provided in
     *            ISO 8601 format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * The endpoint status. Can be either ACTIVE or INACTIVE. Will be set to
     * INACTIVE if a delivery fails. Will be set to ACTIVE if the address is
     * updated.
     *
     * @return The endpoint status. Can be either ACTIVE or INACTIVE. Will be
     *         set to INACTIVE if a delivery fails. Will be set to ACTIVE if the
     *         address is updated.
     */
    public String getEndpointStatus() {
        return endpointStatus;
    }

    /**
     * The endpoint status. Can be either ACTIVE or INACTIVE. Will be set to
     * INACTIVE if a delivery fails. Will be set to ACTIVE if the address is
     * updated.
     *
     * @param endpointStatus The endpoint status. Can be either ACTIVE or
     *            INACTIVE. Will be set to INACTIVE if a delivery fails. Will be
     *            set to ACTIVE if the address is updated.
     */
    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * The endpoint status. Can be either ACTIVE or INACTIVE. Will be set to
     * INACTIVE if a delivery fails. Will be set to ACTIVE if the address is
     * updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointStatus The endpoint status. Can be either ACTIVE or
     *            INACTIVE. Will be set to INACTIVE if a delivery fails. Will be
     *            set to ACTIVE if the address is updated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }

    /**
     * The unique Id for the Endpoint in the batch.
     *
     * @return The unique Id for the Endpoint in the batch.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique Id for the Endpoint in the batch.
     *
     * @param id The unique Id for the Endpoint in the batch.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique Id for the Endpoint in the batch.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique Id for the Endpoint in the batch.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withId(String id) {
        this.id = id;
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
    public EndpointBatchItem withLocation(EndpointLocation location) {
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
    public EndpointBatchItem withMetrics(java.util.Map<String, Double> metrics) {
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
    public EndpointBatchItem addMetricsEntry(String key, Double value) {
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
    public EndpointBatchItem clearMetricsEntries() {
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
    public EndpointBatchItem withOptOut(String optOut) {
        this.optOut = optOut;
        return this;
    }

    /**
     * The unique ID for the most recent request to update the endpoint.
     *
     * @return The unique ID for the most recent request to update the endpoint.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * The unique ID for the most recent request to update the endpoint.
     *
     * @param requestId The unique ID for the most recent request to update the
     *            endpoint.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * The unique ID for the most recent request to update the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId The unique ID for the most recent request to update the
     *            endpoint.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withRequestId(String requestId) {
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
    public EndpointBatchItem withUser(EndpointUser user) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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

        if (obj instanceof EndpointBatchItem == false)
            return false;
        EndpointBatchItem other = (EndpointBatchItem) obj;

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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
