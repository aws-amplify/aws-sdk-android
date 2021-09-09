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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class ScheduleKeyDeletionResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key whose deletion is scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The date and time after which KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, this
     * field does not appear. The deletion date for the primary key isn't known
     * until its last replica key is deleted.
     * </p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     */
    private String keyState;

    /**
     * <p>
     * The waiting period before the KMS key is deleted.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replicas, the waiting
     * period begins when the last of its replica keys is deleted. Otherwise,
     * the waiting period begins immediately.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     */
    private Integer pendingWindowInDays;

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key whose deletion is scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *         >key ARN</a>) of the KMS key whose deletion is scheduled.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key whose deletion is scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key whose deletion is scheduled.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     * >key ARN</a>) of the KMS key whose deletion is scheduled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The Amazon Resource Name (<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN"
     *            >key ARN</a>) of the KMS key whose deletion is scheduled.
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
     * The date and time after which KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, this
     * field does not appear. The deletion date for the primary key isn't known
     * until its last replica key is deleted.
     * </p>
     *
     * @return <p>
     *         The date and time after which KMS deletes the KMS key.
     *         </p>
     *         <p>
     *         If the KMS key is a multi-Region primary key with replica keys,
     *         this field does not appear. The deletion date for the primary key
     *         isn't known until its last replica key is deleted.
     *         </p>
     */
    public java.util.Date getDeletionDate() {
        return deletionDate;
    }

    /**
     * <p>
     * The date and time after which KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, this
     * field does not appear. The deletion date for the primary key isn't known
     * until its last replica key is deleted.
     * </p>
     *
     * @param deletionDate <p>
     *            The date and time after which KMS deletes the KMS key.
     *            </p>
     *            <p>
     *            If the KMS key is a multi-Region primary key with replica
     *            keys, this field does not appear. The deletion date for the
     *            primary key isn't known until its last replica key is deleted.
     *            </p>
     */
    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, this
     * field does not appear. The deletion date for the primary key isn't known
     * until its last replica key is deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionDate <p>
     *            The date and time after which KMS deletes the KMS key.
     *            </p>
     *            <p>
     *            If the KMS key is a multi-Region primary key with replica
     *            keys, this field does not appear. The deletion date for the
     *            primary key isn't known until its last replica key is deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleKeyDeletionResult withDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
        return this;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @return <p>
     *         The current status of the KMS key.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a KMS
     *         key, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >Key state: Effect on your KMS key</a> in the <i>Key Management
     *         Service Developer Guide</i>.
     *         </p>
     * @see KeyState
     */
    public String getKeyState() {
        return keyState;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @see KeyState
     */
    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyState
     */
    public ScheduleKeyDeletionResult withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @see KeyState
     */
    public void setKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
    }

    /**
     * <p>
     * The current status of the KMS key.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Enabled, Disabled, PendingDeletion,
     * PendingImport, PendingReplicaDeletion, Unavailable, Updating
     *
     * @param keyState <p>
     *            The current status of the KMS key.
     *            </p>
     *            <p>
     *            For more information about how key state affects the use of a
     *            KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *            >Key state: Effect on your KMS key</a> in the <i>Key
     *            Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyState
     */
    public ScheduleKeyDeletionResult withKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
        return this;
    }

    /**
     * <p>
     * The waiting period before the KMS key is deleted.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replicas, the waiting
     * period begins when the last of its replica keys is deleted. Otherwise,
     * the waiting period begins immediately.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @return <p>
     *         The waiting period before the KMS key is deleted.
     *         </p>
     *         <p>
     *         If the KMS key is a multi-Region primary key with replicas, the
     *         waiting period begins when the last of its replica keys is
     *         deleted. Otherwise, the waiting period begins immediately.
     *         </p>
     */
    public Integer getPendingWindowInDays() {
        return pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period before the KMS key is deleted.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replicas, the waiting
     * period begins when the last of its replica keys is deleted. Otherwise,
     * the waiting period begins immediately.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @param pendingWindowInDays <p>
     *            The waiting period before the KMS key is deleted.
     *            </p>
     *            <p>
     *            If the KMS key is a multi-Region primary key with replicas,
     *            the waiting period begins when the last of its replica keys is
     *            deleted. Otherwise, the waiting period begins immediately.
     *            </p>
     */
    public void setPendingWindowInDays(Integer pendingWindowInDays) {
        this.pendingWindowInDays = pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period before the KMS key is deleted.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replicas, the waiting
     * period begins when the last of its replica keys is deleted. Otherwise,
     * the waiting period begins immediately.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @param pendingWindowInDays <p>
     *            The waiting period before the KMS key is deleted.
     *            </p>
     *            <p>
     *            If the KMS key is a multi-Region primary key with replicas,
     *            the waiting period begins when the last of its replica keys is
     *            deleted. Otherwise, the waiting period begins immediately.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleKeyDeletionResult withPendingWindowInDays(Integer pendingWindowInDays) {
        this.pendingWindowInDays = pendingWindowInDays;
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
            sb.append("DeletionDate: " + getDeletionDate() + ",");
        if (getKeyState() != null)
            sb.append("KeyState: " + getKeyState() + ",");
        if (getPendingWindowInDays() != null)
            sb.append("PendingWindowInDays: " + getPendingWindowInDays());
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
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode
                + ((getPendingWindowInDays() == null) ? 0 : getPendingWindowInDays().hashCode());
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
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getPendingWindowInDays() == null ^ this.getPendingWindowInDays() == null)
            return false;
        if (other.getPendingWindowInDays() != null
                && other.getPendingWindowInDays().equals(this.getPendingWindowInDays()) == false)
            return false;
        return true;
    }
}
