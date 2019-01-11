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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class ScheduleKeyDeletionResult implements Serializable {
    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The unique identifier of the customer master key (CMK) for which
     *         deletion is scheduled.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The unique identifier of the customer master key (CMK) for
     *            which deletion is scheduled.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The unique identifier of the customer master key (CMK) for
     *            which deletion is scheduled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleKeyDeletionResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     *
     * @return <p>
     *         The date and time after which AWS KMS deletes the customer master
     *         key (CMK).
     *         </p>
     */
    public java.util.Date getDeletionDate() {
        return deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     *
     * @param deletionDate <p>
     *            The date and time after which AWS KMS deletes the customer
     *            master key (CMK).
     *            </p>
     */
    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionDate <p>
     *            The date and time after which AWS KMS deletes the customer
     *            master key (CMK).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleKeyDeletionResult withDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: " + getDeletionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleKeyDeletionResult == false)
            return false;
        ScheduleKeyDeletionResult other = (ScheduleKeyDeletionResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null
                && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        return true;
    }
}
