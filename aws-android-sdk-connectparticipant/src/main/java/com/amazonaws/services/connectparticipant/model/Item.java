/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

/**
 * <p>
 * An item - message or event - that has been sent.
 * </p>
 */
public class Item implements Serializable {
    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String absoluteTime;

    /**
     * <p>
     * The content of the message or event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String content;

    /**
     * <p>
     * The type of content of the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String contentType;

    /**
     * <p>
     * The ID of the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT,
     * CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT,
     * ATTACHMENT, CONNECTION_ACK
     */
    private String type;

    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String participantId;

    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String displayName;

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM
     */
    private String participantRole;

    /**
     * <p>
     * Provides information about the attachments.
     * </p>
     */
    private java.util.List<AttachmentItem> attachments;

    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The time when the message or event was sent.
     *         </p>
     *         <p>
     *         It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     *         example, 2019-11-08T02:41:28.172Z.
     *         </p>
     */
    public String getAbsoluteTime() {
        return absoluteTime;
    }

    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param absoluteTime <p>
     *            The time when the message or event was sent.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     */
    public void setAbsoluteTime(String absoluteTime) {
        this.absoluteTime = absoluteTime;
    }

    /**
     * <p>
     * The time when the message or event was sent.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param absoluteTime <p>
     *            The time when the message or event was sent.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withAbsoluteTime(String absoluteTime) {
        this.absoluteTime = absoluteTime;
        return this;
    }

    /**
     * <p>
     * The content of the message or event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The content of the message or event.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the message or event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param content <p>
     *            The content of the message or event.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the message or event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param content <p>
     *            The content of the message or event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The type of content of the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The type of content of the item.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The type of content of the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param contentType <p>
     *            The type of content of the item.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of content of the item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param contentType <p>
     *            The type of content of the item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The ID of the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The ID of the item.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The ID of the item.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The ID of the item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT,
     * CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT,
     * ATTACHMENT, CONNECTION_ACK
     *
     * @return <p>
     *         Type of the item: message or event.
     *         </p>
     * @see ChatItemType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT,
     * CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT,
     * ATTACHMENT, CONNECTION_ACK
     *
     * @param type <p>
     *            Type of the item: message or event.
     *            </p>
     * @see ChatItemType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT,
     * CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT,
     * ATTACHMENT, CONNECTION_ACK
     *
     * @param type <p>
     *            Type of the item: message or event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChatItemType
     */
    public Item withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT,
     * CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT,
     * ATTACHMENT, CONNECTION_ACK
     *
     * @param type <p>
     *            Type of the item: message or event.
     *            </p>
     * @see ChatItemType
     */
    public void setType(ChatItemType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of the item: message or event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT,
     * CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT,
     * ATTACHMENT, CONNECTION_ACK
     *
     * @param type <p>
     *            Type of the item: message or event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChatItemType
     */
    public Item withType(ChatItemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The ID of the sender in the session.
     *         </p>
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The ID of the sender in the session.
     *            </p>
     */
    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The ID of the sender in the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The ID of the sender in the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The chat display name of the sender.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The chat display name of the sender.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The chat display name of the sender.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The chat display name of the sender.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM
     *
     * @return <p>
     *         The role of the sender. For example, is it a customer, agent, or
     *         system.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM
     *
     * @param participantRole <p>
     *            The role of the sender. For example, is it a customer, agent,
     *            or system.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM
     *
     * @param participantRole <p>
     *            The role of the sender. For example, is it a customer, agent,
     *            or system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public Item withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM
     *
     * @param participantRole <p>
     *            The role of the sender. For example, is it a customer, agent,
     *            or system.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * The role of the sender. For example, is it a customer, agent, or system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM
     *
     * @param participantRole <p>
     *            The role of the sender. For example, is it a customer, agent,
     *            or system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public Item withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * Provides information about the attachments.
     * </p>
     *
     * @return <p>
     *         Provides information about the attachments.
     *         </p>
     */
    public java.util.List<AttachmentItem> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * Provides information about the attachments.
     * </p>
     *
     * @param attachments <p>
     *            Provides information about the attachments.
     *            </p>
     */
    public void setAttachments(java.util.Collection<AttachmentItem> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AttachmentItem>(attachments);
    }

    /**
     * <p>
     * Provides information about the attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Provides information about the attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withAttachments(AttachmentItem... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<AttachmentItem>(attachments.length);
        }
        for (AttachmentItem value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Provides information about the attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withAttachments(java.util.Collection<AttachmentItem> attachments) {
        setAttachments(attachments);
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
        if (getAbsoluteTime() != null)
            sb.append("AbsoluteTime: " + getAbsoluteTime() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: " + getParticipantId() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole() + ",");
        if (getAttachments() != null)
            sb.append("Attachments: " + getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAbsoluteTime() == null) ? 0 : getAbsoluteTime().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Item == false)
            return false;
        Item other = (Item) obj;

        if (other.getAbsoluteTime() == null ^ this.getAbsoluteTime() == null)
            return false;
        if (other.getAbsoluteTime() != null
                && other.getAbsoluteTime().equals(this.getAbsoluteTime()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null
                && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }
}
