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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Processes chat integration events from Amazon Web Services or external
 * integrations to Amazon Connect. A chat integration event includes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * SourceId, DestinationId, and Subtype: a set of identifiers, uniquely
 * representing a chat
 * </p>
 * </li>
 * <li>
 * <p>
 * ChatEvent: details of the chat action to perform such as sending a message,
 * event, or disconnecting from a chat
 * </p>
 * </li>
 * </ul>
 * <p>
 * When a chat integration event is sent with chat identifiers that do not map
 * to an active chat contact, a new chat contact is also created before handling
 * chat action.
 * </p>
 * <p>
 * Access to this API is currently restricted to Amazon Pinpoint for supporting
 * SMS integration.
 * </p>
 */
public class SendChatIntegrationEventRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * External identifier of chat customer participant, used in part to
     * uniquely identify a chat. For SMS, this is the E164 phone number of the
     * chat customer participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String sourceId;

    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is
     * associated with the Amazon Connect instance and flow to be used to start
     * chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String destinationId;

    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify
     * chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String subtype;

    /**
     * <p>
     * Chat integration event payload
     * </p>
     */
    private ChatEvent event;

    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration
     * event is handled with an existing chat, this is ignored.
     * </p>
     */
    private NewSessionDetails newSessionDetails;

    /**
     * <p>
     * External identifier of chat customer participant, used in part to
     * uniquely identify a chat. For SMS, this is the E164 phone number of the
     * chat customer participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         External identifier of chat customer participant, used in part to
     *         uniquely identify a chat. For SMS, this is the E164 phone number
     *         of the chat customer participant.
     *         </p>
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * <p>
     * External identifier of chat customer participant, used in part to
     * uniquely identify a chat. For SMS, this is the E164 phone number of the
     * chat customer participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param sourceId <p>
     *            External identifier of chat customer participant, used in part
     *            to uniquely identify a chat. For SMS, this is the E164 phone
     *            number of the chat customer participant.
     *            </p>
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * External identifier of chat customer participant, used in part to
     * uniquely identify a chat. For SMS, this is the E164 phone number of the
     * chat customer participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param sourceId <p>
     *            External identifier of chat customer participant, used in part
     *            to uniquely identify a chat. For SMS, this is the E164 phone
     *            number of the chat customer participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChatIntegrationEventRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is
     * associated with the Amazon Connect instance and flow to be used to start
     * chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         Chat system identifier, used in part to uniquely identify chat.
     *         This is associated with the Amazon Connect instance and flow to
     *         be used to start chats. For SMS, this is the phone number
     *         destination of inbound SMS messages represented by an Amazon
     *         Pinpoint phone number ARN.
     *         </p>
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is
     * associated with the Amazon Connect instance and flow to be used to start
     * chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param destinationId <p>
     *            Chat system identifier, used in part to uniquely identify
     *            chat. This is associated with the Amazon Connect instance and
     *            flow to be used to start chats. For SMS, this is the phone
     *            number destination of inbound SMS messages represented by an
     *            Amazon Pinpoint phone number ARN.
     *            </p>
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * Chat system identifier, used in part to uniquely identify chat. This is
     * associated with the Amazon Connect instance and flow to be used to start
     * chats. For SMS, this is the phone number destination of inbound SMS
     * messages represented by an Amazon Pinpoint phone number ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param destinationId <p>
     *            Chat system identifier, used in part to uniquely identify
     *            chat. This is associated with the Amazon Connect instance and
     *            flow to be used to start chats. For SMS, this is the phone
     *            number destination of inbound SMS messages represented by an
     *            Amazon Pinpoint phone number ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChatIntegrationEventRequest withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify
     * chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         Classification of a channel. This is used in part to uniquely
     *         identify chat.
     *         </p>
     *         <p>
     *         Valid value: <code>["connect:sms"]</code>
     *         </p>
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify
     * chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param subtype <p>
     *            Classification of a channel. This is used in part to uniquely
     *            identify chat.
     *            </p>
     *            <p>
     *            Valid value: <code>["connect:sms"]</code>
     *            </p>
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * <p>
     * Classification of a channel. This is used in part to uniquely identify
     * chat.
     * </p>
     * <p>
     * Valid value: <code>["connect:sms"]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param subtype <p>
     *            Classification of a channel. This is used in part to uniquely
     *            identify chat.
     *            </p>
     *            <p>
     *            Valid value: <code>["connect:sms"]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChatIntegrationEventRequest withSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }

    /**
     * <p>
     * Chat integration event payload
     * </p>
     *
     * @return <p>
     *         Chat integration event payload
     *         </p>
     */
    public ChatEvent getEvent() {
        return event;
    }

    /**
     * <p>
     * Chat integration event payload
     * </p>
     *
     * @param event <p>
     *            Chat integration event payload
     *            </p>
     */
    public void setEvent(ChatEvent event) {
        this.event = event;
    }

    /**
     * <p>
     * Chat integration event payload
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param event <p>
     *            Chat integration event payload
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChatIntegrationEventRequest withEvent(ChatEvent event) {
        this.event = event;
        return this;
    }

    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration
     * event is handled with an existing chat, this is ignored.
     * </p>
     *
     * @return <p>
     *         Contact properties to apply when starting a new chat. If the
     *         integration event is handled with an existing chat, this is
     *         ignored.
     *         </p>
     */
    public NewSessionDetails getNewSessionDetails() {
        return newSessionDetails;
    }

    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration
     * event is handled with an existing chat, this is ignored.
     * </p>
     *
     * @param newSessionDetails <p>
     *            Contact properties to apply when starting a new chat. If the
     *            integration event is handled with an existing chat, this is
     *            ignored.
     *            </p>
     */
    public void setNewSessionDetails(NewSessionDetails newSessionDetails) {
        this.newSessionDetails = newSessionDetails;
    }

    /**
     * <p>
     * Contact properties to apply when starting a new chat. If the integration
     * event is handled with an existing chat, this is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newSessionDetails <p>
     *            Contact properties to apply when starting a new chat. If the
     *            integration event is handled with an existing chat, this is
     *            ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChatIntegrationEventRequest withNewSessionDetails(NewSessionDetails newSessionDetails) {
        this.newSessionDetails = newSessionDetails;
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
        if (getSourceId() != null)
            sb.append("SourceId: " + getSourceId() + ",");
        if (getDestinationId() != null)
            sb.append("DestinationId: " + getDestinationId() + ",");
        if (getSubtype() != null)
            sb.append("Subtype: " + getSubtype() + ",");
        if (getEvent() != null)
            sb.append("Event: " + getEvent() + ",");
        if (getNewSessionDetails() != null)
            sb.append("NewSessionDetails: " + getNewSessionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime * hashCode + ((getSubtype() == null) ? 0 : getSubtype().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode
                + ((getNewSessionDetails() == null) ? 0 : getNewSessionDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendChatIntegrationEventRequest == false)
            return false;
        SendChatIntegrationEventRequest other = (SendChatIntegrationEventRequest) obj;

        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null
                && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getSubtype() == null ^ this.getSubtype() == null)
            return false;
        if (other.getSubtype() != null && other.getSubtype().equals(this.getSubtype()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getNewSessionDetails() == null ^ this.getNewSessionDetails() == null)
            return false;
        if (other.getNewSessionDetails() != null
                && other.getNewSessionDetails().equals(this.getNewSessionDetails()) == false)
            return false;
        return true;
    }
}
