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
 * Provides information about the results of sending a message directly to an
 * endpoint address.
 * </p>
 */
public class MessageResult implements Serializable {
    /**
     * <p>
     * The delivery status of the message. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DUPLICATE - The endpoint address is a duplicate of another endpoint
     * address. Amazon Pinpoint won't attempt to send the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT - The user who's associated with the endpoint address has opted
     * out of receiving messages from you. Amazon Pinpoint won't attempt to send
     * the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMANENT_FAILURE - An error occurred when delivering the message to the
     * endpoint address. Amazon Pinpoint won't attempt to send the message
     * again.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESSFUL - The message was successfully delivered to the endpoint
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will
     * attempt to deliver the message again later.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED - Amazon Pinpoint throttled the operation to send the message
     * to the endpoint address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT - The message couldn't be sent within the timeout period.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_FAILURE - An unknown error occurred.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     */
    private String deliveryStatus;

    /**
     * <p>
     * The unique identifier for the message that was sent.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * The downstream service status code for delivering the message.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * The status message for delivering the message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * For push notifications that are sent through the GCM channel, specifies
     * whether the endpoint's device registration token was updated as part of
     * delivering the message.
     * </p>
     */
    private String updatedToken;

    /**
     * <p>
     * The delivery status of the message. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DUPLICATE - The endpoint address is a duplicate of another endpoint
     * address. Amazon Pinpoint won't attempt to send the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT - The user who's associated with the endpoint address has opted
     * out of receiving messages from you. Amazon Pinpoint won't attempt to send
     * the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMANENT_FAILURE - An error occurred when delivering the message to the
     * endpoint address. Amazon Pinpoint won't attempt to send the message
     * again.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESSFUL - The message was successfully delivered to the endpoint
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will
     * attempt to deliver the message again later.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED - Amazon Pinpoint throttled the operation to send the message
     * to the endpoint address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT - The message couldn't be sent within the timeout period.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_FAILURE - An unknown error occurred.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @return <p>
     *         The delivery status of the message. Possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DUPLICATE - The endpoint address is a duplicate of another
     *         endpoint address. Amazon Pinpoint won't attempt to send the
     *         message again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPT_OUT - The user who's associated with the endpoint address has
     *         opted out of receiving messages from you. Amazon Pinpoint won't
     *         attempt to send the message again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PERMANENT_FAILURE - An error occurred when delivering the message
     *         to the endpoint address. Amazon Pinpoint won't attempt to send
     *         the message again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SUCCESSFUL - The message was successfully delivered to the
     *         endpoint address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint
     *         will attempt to deliver the message again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         THROTTLED - Amazon Pinpoint throttled the operation to send the
     *         message to the endpoint address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TIMEOUT - The message couldn't be sent within the timeout period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN_FAILURE - An unknown error occurred.
     *         </p>
     *         </li>
     *         </ul>
     * @see DeliveryStatus
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * <p>
     * The delivery status of the message. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DUPLICATE - The endpoint address is a duplicate of another endpoint
     * address. Amazon Pinpoint won't attempt to send the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT - The user who's associated with the endpoint address has opted
     * out of receiving messages from you. Amazon Pinpoint won't attempt to send
     * the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMANENT_FAILURE - An error occurred when delivering the message to the
     * endpoint address. Amazon Pinpoint won't attempt to send the message
     * again.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESSFUL - The message was successfully delivered to the endpoint
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will
     * attempt to deliver the message again later.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED - Amazon Pinpoint throttled the operation to send the message
     * to the endpoint address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT - The message couldn't be sent within the timeout period.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_FAILURE - An unknown error occurred.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus <p>
     *            The delivery status of the message. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DUPLICATE - The endpoint address is a duplicate of another
     *            endpoint address. Amazon Pinpoint won't attempt to send the
     *            message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPT_OUT - The user who's associated with the endpoint address
     *            has opted out of receiving messages from you. Amazon Pinpoint
     *            won't attempt to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PERMANENT_FAILURE - An error occurred when delivering the
     *            message to the endpoint address. Amazon Pinpoint won't attempt
     *            to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SUCCESSFUL - The message was successfully delivered to the
     *            endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TEMPORARY_FAILURE - A temporary error occurred. Amazon
     *            Pinpoint will attempt to deliver the message again later.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            THROTTLED - Amazon Pinpoint throttled the operation to send
     *            the message to the endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT - The message couldn't be sent within the timeout
     *            period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_FAILURE - An unknown error occurred.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeliveryStatus
     */
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * <p>
     * The delivery status of the message. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DUPLICATE - The endpoint address is a duplicate of another endpoint
     * address. Amazon Pinpoint won't attempt to send the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT - The user who's associated with the endpoint address has opted
     * out of receiving messages from you. Amazon Pinpoint won't attempt to send
     * the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMANENT_FAILURE - An error occurred when delivering the message to the
     * endpoint address. Amazon Pinpoint won't attempt to send the message
     * again.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESSFUL - The message was successfully delivered to the endpoint
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will
     * attempt to deliver the message again later.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED - Amazon Pinpoint throttled the operation to send the message
     * to the endpoint address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT - The message couldn't be sent within the timeout period.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_FAILURE - An unknown error occurred.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus <p>
     *            The delivery status of the message. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DUPLICATE - The endpoint address is a duplicate of another
     *            endpoint address. Amazon Pinpoint won't attempt to send the
     *            message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPT_OUT - The user who's associated with the endpoint address
     *            has opted out of receiving messages from you. Amazon Pinpoint
     *            won't attempt to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PERMANENT_FAILURE - An error occurred when delivering the
     *            message to the endpoint address. Amazon Pinpoint won't attempt
     *            to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SUCCESSFUL - The message was successfully delivered to the
     *            endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TEMPORARY_FAILURE - A temporary error occurred. Amazon
     *            Pinpoint will attempt to deliver the message again later.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            THROTTLED - Amazon Pinpoint throttled the operation to send
     *            the message to the endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT - The message couldn't be sent within the timeout
     *            period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_FAILURE - An unknown error occurred.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryStatus
     */
    public MessageResult withDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }

    /**
     * <p>
     * The delivery status of the message. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DUPLICATE - The endpoint address is a duplicate of another endpoint
     * address. Amazon Pinpoint won't attempt to send the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT - The user who's associated with the endpoint address has opted
     * out of receiving messages from you. Amazon Pinpoint won't attempt to send
     * the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMANENT_FAILURE - An error occurred when delivering the message to the
     * endpoint address. Amazon Pinpoint won't attempt to send the message
     * again.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESSFUL - The message was successfully delivered to the endpoint
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will
     * attempt to deliver the message again later.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED - Amazon Pinpoint throttled the operation to send the message
     * to the endpoint address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT - The message couldn't be sent within the timeout period.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_FAILURE - An unknown error occurred.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus <p>
     *            The delivery status of the message. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DUPLICATE - The endpoint address is a duplicate of another
     *            endpoint address. Amazon Pinpoint won't attempt to send the
     *            message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPT_OUT - The user who's associated with the endpoint address
     *            has opted out of receiving messages from you. Amazon Pinpoint
     *            won't attempt to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PERMANENT_FAILURE - An error occurred when delivering the
     *            message to the endpoint address. Amazon Pinpoint won't attempt
     *            to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SUCCESSFUL - The message was successfully delivered to the
     *            endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TEMPORARY_FAILURE - A temporary error occurred. Amazon
     *            Pinpoint will attempt to deliver the message again later.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            THROTTLED - Amazon Pinpoint throttled the operation to send
     *            the message to the endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT - The message couldn't be sent within the timeout
     *            period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_FAILURE - An unknown error occurred.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeliveryStatus
     */
    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus.toString();
    }

    /**
     * <p>
     * The delivery status of the message. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DUPLICATE - The endpoint address is a duplicate of another endpoint
     * address. Amazon Pinpoint won't attempt to send the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT - The user who's associated with the endpoint address has opted
     * out of receiving messages from you. Amazon Pinpoint won't attempt to send
     * the message again.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERMANENT_FAILURE - An error occurred when delivering the message to the
     * endpoint address. Amazon Pinpoint won't attempt to send the message
     * again.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESSFUL - The message was successfully delivered to the endpoint
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TEMPORARY_FAILURE - A temporary error occurred. Amazon Pinpoint will
     * attempt to deliver the message again later.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED - Amazon Pinpoint throttled the operation to send the message
     * to the endpoint address.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT - The message couldn't be sent within the timeout period.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_FAILURE - An unknown error occurred.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESSFUL, THROTTLED, TEMPORARY_FAILURE,
     * PERMANENT_FAILURE, UNKNOWN_FAILURE, OPT_OUT, DUPLICATE
     *
     * @param deliveryStatus <p>
     *            The delivery status of the message. Possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DUPLICATE - The endpoint address is a duplicate of another
     *            endpoint address. Amazon Pinpoint won't attempt to send the
     *            message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPT_OUT - The user who's associated with the endpoint address
     *            has opted out of receiving messages from you. Amazon Pinpoint
     *            won't attempt to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PERMANENT_FAILURE - An error occurred when delivering the
     *            message to the endpoint address. Amazon Pinpoint won't attempt
     *            to send the message again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SUCCESSFUL - The message was successfully delivered to the
     *            endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TEMPORARY_FAILURE - A temporary error occurred. Amazon
     *            Pinpoint will attempt to deliver the message again later.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            THROTTLED - Amazon Pinpoint throttled the operation to send
     *            the message to the endpoint address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT - The message couldn't be sent within the timeout
     *            period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_FAILURE - An unknown error occurred.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryStatus
     */
    public MessageResult withDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the message that was sent.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the message that was sent.
     *         </p>
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>
     * The unique identifier for the message that was sent.
     * </p>
     *
     * @param messageId <p>
     *            The unique identifier for the message that was sent.
     *            </p>
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The unique identifier for the message that was sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageId <p>
     *            The unique identifier for the message that was sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResult withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * <p>
     * The downstream service status code for delivering the message.
     * </p>
     *
     * @return <p>
     *         The downstream service status code for delivering the message.
     *         </p>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The downstream service status code for delivering the message.
     * </p>
     *
     * @param statusCode <p>
     *            The downstream service status code for delivering the message.
     *            </p>
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The downstream service status code for delivering the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCode <p>
     *            The downstream service status code for delivering the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResult withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * The status message for delivering the message.
     * </p>
     *
     * @return <p>
     *         The status message for delivering the message.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status message for delivering the message.
     * </p>
     *
     * @param statusMessage <p>
     *            The status message for delivering the message.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for delivering the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The status message for delivering the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * For push notifications that are sent through the GCM channel, specifies
     * whether the endpoint's device registration token was updated as part of
     * delivering the message.
     * </p>
     *
     * @return <p>
     *         For push notifications that are sent through the GCM channel,
     *         specifies whether the endpoint's device registration token was
     *         updated as part of delivering the message.
     *         </p>
     */
    public String getUpdatedToken() {
        return updatedToken;
    }

    /**
     * <p>
     * For push notifications that are sent through the GCM channel, specifies
     * whether the endpoint's device registration token was updated as part of
     * delivering the message.
     * </p>
     *
     * @param updatedToken <p>
     *            For push notifications that are sent through the GCM channel,
     *            specifies whether the endpoint's device registration token was
     *            updated as part of delivering the message.
     *            </p>
     */
    public void setUpdatedToken(String updatedToken) {
        this.updatedToken = updatedToken;
    }

    /**
     * <p>
     * For push notifications that are sent through the GCM channel, specifies
     * whether the endpoint's device registration token was updated as part of
     * delivering the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedToken <p>
     *            For push notifications that are sent through the GCM channel,
     *            specifies whether the endpoint's device registration token was
     *            updated as part of delivering the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageResult withUpdatedToken(String updatedToken) {
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

        if (obj instanceof MessageResult == false)
            return false;
        MessageResult other = (MessageResult) obj;

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
