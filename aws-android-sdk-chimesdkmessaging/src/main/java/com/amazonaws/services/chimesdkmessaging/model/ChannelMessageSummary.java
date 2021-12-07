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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * Summary of the messages in a <code>Channel</code>.
 * </p>
 */
public class ChannelMessageSummary implements Serializable {
    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String messageId;

    /**
     * <p>
     * The content of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String content;

    /**
     * <p>
     * The metadata of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String metadata;

    /**
     * <p>
     * The type of message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     */
    private String type;

    /**
     * <p>
     * The time at which the message summary was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The time at which a message was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The time at which a message was last edited.
     * </p>
     */
    private java.util.Date lastEditedTimestamp;

    /**
     * <p>
     * The message sender.
     * </p>
     */
    private Identity sender;

    /**
     * <p>
     * Indicates whether a message was redacted.
     * </p>
     */
    private Boolean redacted;

    /**
     * <p>
     * The message status. The status value is <code>SENT</code> for messages
     * sent to a channel without a channel flow. For channels associated with
     * channel flow, the value determines the processing stage.
     * </p>
     */
    private ChannelMessageStatusStructure status;

    /**
     * <p>
     * The message attribues listed in a the summary of a channel message.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes;

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The ID of the message.
     *         </p>
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param messageId <p>
     *            The ID of the message.
     *            </p>
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param messageId <p>
     *            The ID of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The content of the message.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The content of the message.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The content of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The metadata of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The metadata of the message.
     *         </p>
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The metadata of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The metadata of the message.
     *            </p>
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The metadata of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The type of message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @return <p>
     *         The type of message.
     *         </p>
     * @see ChannelMessageType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message.
     *            </p>
     * @see ChannelMessageType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessageType
     */
    public ChannelMessageSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message.
     *            </p>
     * @see ChannelMessageType
     */
    public void setType(ChannelMessageType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessageType
     */
    public ChannelMessageSummary withType(ChannelMessageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the message summary was created.
     * </p>
     *
     * @return <p>
     *         The time at which the message summary was created.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The time at which the message summary was created.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The time at which the message summary was created.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the message summary was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The time at which the message summary was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The time at which a message was last updated.
     * </p>
     *
     * @return <p>
     *         The time at which a message was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was last updated.
     * </p>
     *
     * @param lastUpdatedTimestamp <p>
     *            The time at which a message was last updated.
     *            </p>
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimestamp <p>
     *            The time at which a message was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    /**
     * <p>
     * The time at which a message was last edited.
     * </p>
     *
     * @return <p>
     *         The time at which a message was last edited.
     *         </p>
     */
    public java.util.Date getLastEditedTimestamp() {
        return lastEditedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was last edited.
     * </p>
     *
     * @param lastEditedTimestamp <p>
     *            The time at which a message was last edited.
     *            </p>
     */
    public void setLastEditedTimestamp(java.util.Date lastEditedTimestamp) {
        this.lastEditedTimestamp = lastEditedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was last edited.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastEditedTimestamp <p>
     *            The time at which a message was last edited.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withLastEditedTimestamp(java.util.Date lastEditedTimestamp) {
        this.lastEditedTimestamp = lastEditedTimestamp;
        return this;
    }

    /**
     * <p>
     * The message sender.
     * </p>
     *
     * @return <p>
     *         The message sender.
     *         </p>
     */
    public Identity getSender() {
        return sender;
    }

    /**
     * <p>
     * The message sender.
     * </p>
     *
     * @param sender <p>
     *            The message sender.
     *            </p>
     */
    public void setSender(Identity sender) {
        this.sender = sender;
    }

    /**
     * <p>
     * The message sender.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sender <p>
     *            The message sender.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withSender(Identity sender) {
        this.sender = sender;
        return this;
    }

    /**
     * <p>
     * Indicates whether a message was redacted.
     * </p>
     *
     * @return <p>
     *         Indicates whether a message was redacted.
     *         </p>
     */
    public Boolean isRedacted() {
        return redacted;
    }

    /**
     * <p>
     * Indicates whether a message was redacted.
     * </p>
     *
     * @return <p>
     *         Indicates whether a message was redacted.
     *         </p>
     */
    public Boolean getRedacted() {
        return redacted;
    }

    /**
     * <p>
     * Indicates whether a message was redacted.
     * </p>
     *
     * @param redacted <p>
     *            Indicates whether a message was redacted.
     *            </p>
     */
    public void setRedacted(Boolean redacted) {
        this.redacted = redacted;
    }

    /**
     * <p>
     * Indicates whether a message was redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redacted <p>
     *            Indicates whether a message was redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withRedacted(Boolean redacted) {
        this.redacted = redacted;
        return this;
    }

    /**
     * <p>
     * The message status. The status value is <code>SENT</code> for messages
     * sent to a channel without a channel flow. For channels associated with
     * channel flow, the value determines the processing stage.
     * </p>
     *
     * @return <p>
     *         The message status. The status value is <code>SENT</code> for
     *         messages sent to a channel without a channel flow. For channels
     *         associated with channel flow, the value determines the processing
     *         stage.
     *         </p>
     */
    public ChannelMessageStatusStructure getStatus() {
        return status;
    }

    /**
     * <p>
     * The message status. The status value is <code>SENT</code> for messages
     * sent to a channel without a channel flow. For channels associated with
     * channel flow, the value determines the processing stage.
     * </p>
     *
     * @param status <p>
     *            The message status. The status value is <code>SENT</code> for
     *            messages sent to a channel without a channel flow. For
     *            channels associated with channel flow, the value determines
     *            the processing stage.
     *            </p>
     */
    public void setStatus(ChannelMessageStatusStructure status) {
        this.status = status;
    }

    /**
     * <p>
     * The message status. The status value is <code>SENT</code> for messages
     * sent to a channel without a channel flow. For channels associated with
     * channel flow, the value determines the processing stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The message status. The status value is <code>SENT</code> for
     *            messages sent to a channel without a channel flow. For
     *            channels associated with channel flow, the value determines
     *            the processing stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withStatus(ChannelMessageStatusStructure status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The message attribues listed in a the summary of a channel message.
     * </p>
     *
     * @return <p>
     *         The message attribues listed in a the summary of a channel
     *         message.
     *         </p>
     */
    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * <p>
     * The message attribues listed in a the summary of a channel message.
     * </p>
     *
     * @param messageAttributes <p>
     *            The message attribues listed in a the summary of a channel
     *            message.
     *            </p>
     */
    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    /**
     * <p>
     * The message attribues listed in a the summary of a channel message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributes <p>
     *            The message attribues listed in a the summary of a channel
     *            message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    /**
     * <p>
     * The message attribues listed in a the summary of a channel message.
     * </p>
     * <p>
     * The method adds a new key-value pair into MessageAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into MessageAttributes.
     * @param value The corresponding value of the entry to be added into
     *            MessageAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMessageSummary addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ChannelMessageSummary clearMessageAttributesEntries() {
        this.messageAttributes = null;
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
        if (getMessageId() != null)
            sb.append("MessageId: " + getMessageId() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getLastEditedTimestamp() != null)
            sb.append("LastEditedTimestamp: " + getLastEditedTimestamp() + ",");
        if (getSender() != null)
            sb.append("Sender: " + getSender() + ",");
        if (getRedacted() != null)
            sb.append("Redacted: " + getRedacted() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastEditedTimestamp() == null) ? 0 : getLastEditedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSender() == null) ? 0 : getSender().hashCode());
        hashCode = prime * hashCode + ((getRedacted() == null) ? 0 : getRedacted().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMessageSummary == false)
            return false;
        ChannelMessageSummary other = (ChannelMessageSummary) obj;

        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null
                && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null
                && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getLastEditedTimestamp() == null ^ this.getLastEditedTimestamp() == null)
            return false;
        if (other.getLastEditedTimestamp() != null
                && other.getLastEditedTimestamp().equals(this.getLastEditedTimestamp()) == false)
            return false;
        if (other.getSender() == null ^ this.getSender() == null)
            return false;
        if (other.getSender() != null && other.getSender().equals(this.getSender()) == false)
            return false;
        if (other.getRedacted() == null ^ this.getRedacted() == null)
            return false;
        if (other.getRedacted() != null && other.getRedacted().equals(this.getRedacted()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null
                && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        return true;
    }
}
