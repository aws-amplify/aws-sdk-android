/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The receipt for the message delivered to the recipient.
 * </p>
 */
public class Receipt implements Serializable {
    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deliveredTimestamp;

    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String readTimestamp;

    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String recipientParticipantId;

    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The time when the message was delivered to the recipient.
     *         </p>
     */
    public String getDeliveredTimestamp() {
        return deliveredTimestamp;
    }

    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deliveredTimestamp <p>
     *            The time when the message was delivered to the recipient.
     *            </p>
     */
    public void setDeliveredTimestamp(String deliveredTimestamp) {
        this.deliveredTimestamp = deliveredTimestamp;
    }

    /**
     * <p>
     * The time when the message was delivered to the recipient.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deliveredTimestamp <p>
     *            The time when the message was delivered to the recipient.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Receipt withDeliveredTimestamp(String deliveredTimestamp) {
        this.deliveredTimestamp = deliveredTimestamp;
        return this;
    }

    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The time when the message was read by the recipient.
     *         </p>
     */
    public String getReadTimestamp() {
        return readTimestamp;
    }

    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param readTimestamp <p>
     *            The time when the message was read by the recipient.
     *            </p>
     */
    public void setReadTimestamp(String readTimestamp) {
        this.readTimestamp = readTimestamp;
    }

    /**
     * <p>
     * The time when the message was read by the recipient.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param readTimestamp <p>
     *            The time when the message was read by the recipient.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Receipt withReadTimestamp(String readTimestamp) {
        this.readTimestamp = readTimestamp;
        return this;
    }

    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the recipient of the message.
     *         </p>
     */
    public String getRecipientParticipantId() {
        return recipientParticipantId;
    }

    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param recipientParticipantId <p>
     *            The identifier of the recipient of the message.
     *            </p>
     */
    public void setRecipientParticipantId(String recipientParticipantId) {
        this.recipientParticipantId = recipientParticipantId;
    }

    /**
     * <p>
     * The identifier of the recipient of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param recipientParticipantId <p>
     *            The identifier of the recipient of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Receipt withRecipientParticipantId(String recipientParticipantId) {
        this.recipientParticipantId = recipientParticipantId;
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
        if (getDeliveredTimestamp() != null)
            sb.append("DeliveredTimestamp: " + getDeliveredTimestamp() + ",");
        if (getReadTimestamp() != null)
            sb.append("ReadTimestamp: " + getReadTimestamp() + ",");
        if (getRecipientParticipantId() != null)
            sb.append("RecipientParticipantId: " + getRecipientParticipantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveredTimestamp() == null) ? 0 : getDeliveredTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getReadTimestamp() == null) ? 0 : getReadTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecipientParticipantId() == null) ? 0 : getRecipientParticipantId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Receipt == false)
            return false;
        Receipt other = (Receipt) obj;

        if (other.getDeliveredTimestamp() == null ^ this.getDeliveredTimestamp() == null)
            return false;
        if (other.getDeliveredTimestamp() != null
                && other.getDeliveredTimestamp().equals(this.getDeliveredTimestamp()) == false)
            return false;
        if (other.getReadTimestamp() == null ^ this.getReadTimestamp() == null)
            return false;
        if (other.getReadTimestamp() != null
                && other.getReadTimestamp().equals(this.getReadTimestamp()) == false)
            return false;
        if (other.getRecipientParticipantId() == null ^ this.getRecipientParticipantId() == null)
            return false;
        if (other.getRecipientParticipantId() != null
                && other.getRecipientParticipantId().equals(this.getRecipientParticipantId()) == false)
            return false;
        return true;
    }
}
