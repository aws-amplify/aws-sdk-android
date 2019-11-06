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
 * The result from sending a message to an endpoint.
 */
public class EndpointMessageResult implements Serializable {
    /**
     * Address that endpoint message was delivered to.
     */
    private String address;

    /**
     * The delivery status of the message. Possible values: SUCCESS - The
     * message was successfully delivered to the endpoint. TRANSIENT_FAILURE - A
     * temporary error occurred. Amazon Pinpoint will attempt to deliver the
     * message again later. FAILURE_PERMANENT - An error occurred when
     * delivering the message to the endpoint. Amazon Pinpoint won't attempt to
     * send the message again. TIMEOUT - The message couldn't be sent within the
     * timeout period. QUIET_TIME - The local time for the endpoint was within
     * the QuietTime for the campaign or app. DAILY_CAP - The endpoint has
     * received the maximum number of messages it can receive within a 24-hour
     * period. HOLDOUT - The endpoint was in a hold out treatment for the
     * campaign. THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
     * EXPIRED - The endpoint address is expired. CAMPAIGN_CAP - The endpoint
     * received the maximum number of messages allowed by the campaign.
     * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from
     * delivering the message. UNKNOWN - An unknown error occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     */
    private String deliveryStatus;

    /**
     * Unique message identifier associated with the message that was sent.
     */
    private String messageId;

    /**
     * Downstream service status code.
     */
    private Integer statusCode;

    /**
     * Status message for message delivery.
     */
    private String statusMessage;

    /**
     * If token was updated as part of delivery. (This is GCM Specific)
     */
    private String updatedToken;

    /**
     * Address that endpoint message was delivered to.
     *
     * @return Address that endpoint message was delivered to.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Address that endpoint message was delivered to.
     *
     * @param address Address that endpoint message was delivered to.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Address that endpoint message was delivered to.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address Address that endpoint message was delivered to.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointMessageResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * The delivery status of the message. Possible values: SUCCESS - The
     * message was successfully delivered to the endpoint. TRANSIENT_FAILURE - A
     * temporary error occurred. Amazon Pinpoint will attempt to deliver the
     * message again later. FAILURE_PERMANENT - An error occurred when
     * delivering the message to the endpoint. Amazon Pinpoint won't attempt to
     * send the message again. TIMEOUT - The message couldn't be sent within the
     * timeout period. QUIET_TIME - The local time for the endpoint was within
     * the QuietTime for the campaign or app. DAILY_CAP - The endpoint has
     * received the maximum number of messages it can receive within a 24-hour
     * period. HOLDOUT - The endpoint was in a hold out treatment for the
     * campaign. THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
     * EXPIRED - The endpoint address is expired. CAMPAIGN_CAP - The endpoint
     * received the maximum number of messages allowed by the campaign.
     * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from
     * delivering the message. UNKNOWN - An unknown error occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @return The delivery status of the message. Possible values: SUCCESS -
     *         The message was successfully delivered to the endpoint.
     *         TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint
     *         will attempt to deliver the message again later.
     *         FAILURE_PERMANENT - An error occurred when delivering the message
     *         to the endpoint. Amazon Pinpoint won't attempt to send the
     *         message again. TIMEOUT - The message couldn't be sent within the
     *         timeout period. QUIET_TIME - The local time for the endpoint was
     *         within the QuietTime for the campaign or app. DAILY_CAP - The
     *         endpoint has received the maximum number of messages it can
     *         receive within a 24-hour period. HOLDOUT - The endpoint was in a
     *         hold out treatment for the campaign. THROTTLED - Amazon Pinpoint
     *         throttled sending to this endpoint. EXPIRED - The endpoint
     *         address is expired. CAMPAIGN_CAP - The endpoint received the
     *         maximum number of messages allowed by the campaign.
     *         SERVICE_FAILURE - A service-level failure prevented Amazon
     *         Pinpoint from delivering the message. UNKNOWN - An unknown error
     *         occurred.
     * @see DeliveryStatus
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * The delivery status of the message. Possible values: SUCCESS - The
     * message was successfully delivered to the endpoint. TRANSIENT_FAILURE - A
     * temporary error occurred. Amazon Pinpoint will attempt to deliver the
     * message again later. FAILURE_PERMANENT - An error occurred when
     * delivering the message to the endpoint. Amazon Pinpoint won't attempt to
     * send the message again. TIMEOUT - The message couldn't be sent within the
     * timeout period. QUIET_TIME - The local time for the endpoint was within
     * the QuietTime for the campaign or app. DAILY_CAP - The endpoint has
     * received the maximum number of messages it can receive within a 24-hour
     * period. HOLDOUT - The endpoint was in a hold out treatment for the
     * campaign. THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
     * EXPIRED - The endpoint address is expired. CAMPAIGN_CAP - The endpoint
     * received the maximum number of messages allowed by the campaign.
     * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from
     * delivering the message. UNKNOWN - An unknown error occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus The delivery status of the message. Possible
     *            values: SUCCESS - The message was successfully delivered to
     *            the endpoint. TRANSIENT_FAILURE - A temporary error occurred.
     *            Amazon Pinpoint will attempt to deliver the message again
     *            later. FAILURE_PERMANENT - An error occurred when delivering
     *            the message to the endpoint. Amazon Pinpoint won't attempt to
     *            send the message again. TIMEOUT - The message couldn't be sent
     *            within the timeout period. QUIET_TIME - The local time for the
     *            endpoint was within the QuietTime for the campaign or app.
     *            DAILY_CAP - The endpoint has received the maximum number of
     *            messages it can receive within a 24-hour period. HOLDOUT - The
     *            endpoint was in a hold out treatment for the campaign.
     *            THROTTLED - Amazon Pinpoint throttled sending to this
     *            endpoint. EXPIRED - The endpoint address is expired.
     *            CAMPAIGN_CAP - The endpoint received the maximum number of
     *            messages allowed by the campaign. SERVICE_FAILURE - A
     *            service-level failure prevented Amazon Pinpoint from
     *            delivering the message. UNKNOWN - An unknown error occurred.
     * @see DeliveryStatus
     */
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * The delivery status of the message. Possible values: SUCCESS - The
     * message was successfully delivered to the endpoint. TRANSIENT_FAILURE - A
     * temporary error occurred. Amazon Pinpoint will attempt to deliver the
     * message again later. FAILURE_PERMANENT - An error occurred when
     * delivering the message to the endpoint. Amazon Pinpoint won't attempt to
     * send the message again. TIMEOUT - The message couldn't be sent within the
     * timeout period. QUIET_TIME - The local time for the endpoint was within
     * the QuietTime for the campaign or app. DAILY_CAP - The endpoint has
     * received the maximum number of messages it can receive within a 24-hour
     * period. HOLDOUT - The endpoint was in a hold out treatment for the
     * campaign. THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
     * EXPIRED - The endpoint address is expired. CAMPAIGN_CAP - The endpoint
     * received the maximum number of messages allowed by the campaign.
     * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from
     * delivering the message. UNKNOWN - An unknown error occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus The delivery status of the message. Possible
     *            values: SUCCESS - The message was successfully delivered to
     *            the endpoint. TRANSIENT_FAILURE - A temporary error occurred.
     *            Amazon Pinpoint will attempt to deliver the message again
     *            later. FAILURE_PERMANENT - An error occurred when delivering
     *            the message to the endpoint. Amazon Pinpoint won't attempt to
     *            send the message again. TIMEOUT - The message couldn't be sent
     *            within the timeout period. QUIET_TIME - The local time for the
     *            endpoint was within the QuietTime for the campaign or app.
     *            DAILY_CAP - The endpoint has received the maximum number of
     *            messages it can receive within a 24-hour period. HOLDOUT - The
     *            endpoint was in a hold out treatment for the campaign.
     *            THROTTLED - Amazon Pinpoint throttled sending to this
     *            endpoint. EXPIRED - The endpoint address is expired.
     *            CAMPAIGN_CAP - The endpoint received the maximum number of
     *            messages allowed by the campaign. SERVICE_FAILURE - A
     *            service-level failure prevented Amazon Pinpoint from
     *            delivering the message. UNKNOWN - An unknown error occurred.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryStatus
     */
    public EndpointMessageResult withDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }

    /**
     * The delivery status of the message. Possible values: SUCCESS - The
     * message was successfully delivered to the endpoint. TRANSIENT_FAILURE - A
     * temporary error occurred. Amazon Pinpoint will attempt to deliver the
     * message again later. FAILURE_PERMANENT - An error occurred when
     * delivering the message to the endpoint. Amazon Pinpoint won't attempt to
     * send the message again. TIMEOUT - The message couldn't be sent within the
     * timeout period. QUIET_TIME - The local time for the endpoint was within
     * the QuietTime for the campaign or app. DAILY_CAP - The endpoint has
     * received the maximum number of messages it can receive within a 24-hour
     * period. HOLDOUT - The endpoint was in a hold out treatment for the
     * campaign. THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
     * EXPIRED - The endpoint address is expired. CAMPAIGN_CAP - The endpoint
     * received the maximum number of messages allowed by the campaign.
     * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from
     * delivering the message. UNKNOWN - An unknown error occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus The delivery status of the message. Possible
     *            values: SUCCESS - The message was successfully delivered to
     *            the endpoint. TRANSIENT_FAILURE - A temporary error occurred.
     *            Amazon Pinpoint will attempt to deliver the message again
     *            later. FAILURE_PERMANENT - An error occurred when delivering
     *            the message to the endpoint. Amazon Pinpoint won't attempt to
     *            send the message again. TIMEOUT - The message couldn't be sent
     *            within the timeout period. QUIET_TIME - The local time for the
     *            endpoint was within the QuietTime for the campaign or app.
     *            DAILY_CAP - The endpoint has received the maximum number of
     *            messages it can receive within a 24-hour period. HOLDOUT - The
     *            endpoint was in a hold out treatment for the campaign.
     *            THROTTLED - Amazon Pinpoint throttled sending to this
     *            endpoint. EXPIRED - The endpoint address is expired.
     *            CAMPAIGN_CAP - The endpoint received the maximum number of
     *            messages allowed by the campaign. SERVICE_FAILURE - A
     *            service-level failure prevented Amazon Pinpoint from
     *            delivering the message. UNKNOWN - An unknown error occurred.
     * @see DeliveryStatus
     */
    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus.toString();
    }

    /**
     * The delivery status of the message. Possible values: SUCCESS - The
     * message was successfully delivered to the endpoint. TRANSIENT_FAILURE - A
     * temporary error occurred. Amazon Pinpoint will attempt to deliver the
     * message again later. FAILURE_PERMANENT - An error occurred when
     * delivering the message to the endpoint. Amazon Pinpoint won't attempt to
     * send the message again. TIMEOUT - The message couldn't be sent within the
     * timeout period. QUIET_TIME - The local time for the endpoint was within
     * the QuietTime for the campaign or app. DAILY_CAP - The endpoint has
     * received the maximum number of messages it can receive within a 24-hour
     * period. HOLDOUT - The endpoint was in a hold out treatment for the
     * campaign. THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
     * EXPIRED - The endpoint address is expired. CAMPAIGN_CAP - The endpoint
     * received the maximum number of messages allowed by the campaign.
     * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from
     * delivering the message. UNKNOWN - An unknown error occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus The delivery status of the message. Possible
     *            values: SUCCESS - The message was successfully delivered to
     *            the endpoint. TRANSIENT_FAILURE - A temporary error occurred.
     *            Amazon Pinpoint will attempt to deliver the message again
     *            later. FAILURE_PERMANENT - An error occurred when delivering
     *            the message to the endpoint. Amazon Pinpoint won't attempt to
     *            send the message again. TIMEOUT - The message couldn't be sent
     *            within the timeout period. QUIET_TIME - The local time for the
     *            endpoint was within the QuietTime for the campaign or app.
     *            DAILY_CAP - The endpoint has received the maximum number of
     *            messages it can receive within a 24-hour period. HOLDOUT - The
     *            endpoint was in a hold out treatment for the campaign.
     *            THROTTLED - Amazon Pinpoint throttled sending to this
     *            endpoint. EXPIRED - The endpoint address is expired.
     *            CAMPAIGN_CAP - The endpoint received the maximum number of
     *            messages allowed by the campaign. SERVICE_FAILURE - A
     *            service-level failure prevented Amazon Pinpoint from
     *            delivering the message. UNKNOWN - An unknown error occurred.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryStatus
     */
    public EndpointMessageResult withDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus.toString();
        return this;
    }

    /**
     * Unique message identifier associated with the message that was sent.
     *
     * @return Unique message identifier associated with the message that was
     *         sent.
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Unique message identifier associated with the message that was sent.
     *
     * @param messageId Unique message identifier associated with the message
     *            that was sent.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Unique message identifier associated with the message that was sent.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageId Unique message identifier associated with the message
     *            that was sent.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointMessageResult withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Downstream service status code.
     *
     * @return Downstream service status code.
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Downstream service status code.
     *
     * @param statusCode Downstream service status code.
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Downstream service status code.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCode Downstream service status code.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointMessageResult withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Status message for message delivery.
     *
     * @return Status message for message delivery.
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Status message for message delivery.
     *
     * @param statusMessage Status message for message delivery.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * Status message for message delivery.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage Status message for message delivery.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointMessageResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * If token was updated as part of delivery. (This is GCM Specific)
     *
     * @return If token was updated as part of delivery. (This is GCM Specific)
     */
    public String getUpdatedToken() {
        return updatedToken;
    }

    /**
     * If token was updated as part of delivery. (This is GCM Specific)
     *
     * @param updatedToken If token was updated as part of delivery. (This is
     *            GCM Specific)
     */
    public void setUpdatedToken(String updatedToken) {
        this.updatedToken = updatedToken;
    }

    /**
     * If token was updated as part of delivery. (This is GCM Specific)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedToken If token was updated as part of delivery. (This is
     *            GCM Specific)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointMessageResult withUpdatedToken(String updatedToken) {
        this.updatedToken = updatedToken;
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
        if (getDeliveryStatus() != null)
            sb.append("DeliveryStatus: " + getDeliveryStatus() + ",");
        if (getMessageId() != null)
            sb.append("MessageId: " + getMessageId() + ",");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getUpdatedToken() != null)
            sb.append("UpdatedToken: " + getUpdatedToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode
                + ((getDeliveryStatus() == null) ? 0 : getDeliveryStatus().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedToken() == null) ? 0 : getUpdatedToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointMessageResult == false)
            return false;
        EndpointMessageResult other = (EndpointMessageResult) obj;

        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getDeliveryStatus() == null ^ this.getDeliveryStatus() == null)
            return false;
        if (other.getDeliveryStatus() != null
                && other.getDeliveryStatus().equals(this.getDeliveryStatus()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null
                && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getUpdatedToken() == null ^ this.getUpdatedToken() == null)
            return false;
        if (other.getUpdatedToken() != null
                && other.getUpdatedToken().equals(this.getUpdatedToken()) == false)
            return false;
        return true;
    }
}
