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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Schedules the deletion of a KMS key. By default, KMS applies a waiting period
 * of 30 days, but you can specify a waiting period of 7-30 days. When this
 * operation is successful, the key state of the KMS key changes to
 * <code>PendingDeletion</code> and the key can't be used in any cryptographic
 * operations. It remains in this state for the duration of the waiting period.
 * Before the waiting period ends, you can use <a>CancelKeyDeletion</a> to
 * cancel the deletion of the KMS key. After the waiting period ends, KMS
 * deletes the KMS key, its key material, and all KMS data associated with it,
 * including all aliases that refer to it.
 * </p>
 * <important>
 * <p>
 * Deleting a KMS key is a destructive and potentially dangerous operation. When
 * a KMS key is deleted, all data that was encrypted under the KMS key is
 * unrecoverable. (The only exception is a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html"
 * >multi-Region replica key</a>, or an <a href=
 * "kms/latest/developerguide/importing-keys-managing.html#import-delete-key"
 * >asymmetric or HMAC KMS key with imported key material</a>.) To prevent the
 * use of a KMS key without deleting it, use <a>DisableKey</a>.
 * </p>
 * </important>
 * <p>
 * You can schedule the deletion of a multi-Region primary key and its replica
 * keys at any time. However, KMS will not delete a multi-Region primary key
 * with existing replica keys. If you schedule the deletion of a primary key
 * with replicas, its key state changes to <code>PendingReplicaDeletion</code>
 * and it cannot be replicated or used in cryptographic operations. This status
 * can continue indefinitely. When the last of its replicas keys is deleted (not
 * just scheduled), the key state of the primary key changes to
 * <code>PendingDeletion</code> and its waiting period (
 * <code>PendingWindowInDays</code>) begins. For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html"
 * >Deleting multi-Region keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * When KMS <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/delete-cmk-keystore.html"
 * >deletes a KMS key from an CloudHSM key store</a>, it makes a best effort to
 * delete the associated key material from the associated CloudHSM cluster.
 * However, you might need to manually <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key"
 * >delete the orphaned key material</a> from the cluster and its backups. <a
 * href
 * ="https://docs.aws.amazon.com/kms/latest/developerguide/delete-xks-key.html"
 * >Deleting a KMS key from an external key store</a> has no effect on the
 * associated external key. However, for both types of custom key stores,
 * deleting a KMS key is destructive and irreversible. You cannot decrypt
 * ciphertext encrypted under the KMS key by using only its associated external
 * key or CloudHSM key. Also, you cannot recreate a KMS key in an external key
 * store by creating a new KMS key with the same key material.
 * </p>
 * <p>
 * For more information about scheduling a KMS key for deletion, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
 * >Deleting KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key states of KMS keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key
 * in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: kms:ScheduleKeyDeletion (key policy)
 * </p>
 * <p>
 * <b>Related operations</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CancelKeyDeletion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisableKey</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Eventual consistency</b>: The KMS API follows an eventual consistency
 * model. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
 * >KMS eventual consistency</a>.
 * </p>
 */
public class ScheduleKeyDeletionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the KMS key to delete.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period
     * ends, KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, the
     * waiting period begins when the last of its replica keys is deleted.
     * Otherwise, the waiting period begins immediately.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     * > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition
     * key to further constrain the values that principals can specify in the
     * <code>PendingWindowInDays</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     */
    private Integer pendingWindowInDays;

    /**
     * <p>
     * The unique identifier of the KMS key to delete.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The unique identifier of the KMS key to delete.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a>
     *         or <a>DescribeKey</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The unique identifier of the KMS key to delete.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The unique identifier of the KMS key to delete.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier of the KMS key to delete.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The unique identifier of the KMS key to delete.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleKeyDeletionRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period
     * ends, KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, the
     * waiting period begins when the last of its replica keys is deleted.
     * Otherwise, the waiting period begins immediately.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     * > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition
     * key to further constrain the values that principals can specify in the
     * <code>PendingWindowInDays</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @return <p>
     *         The waiting period, specified in number of days. After the
     *         waiting period ends, KMS deletes the KMS key.
     *         </p>
     *         <p>
     *         If the KMS key is a multi-Region primary key with replica keys,
     *         the waiting period begins when the last of its replica keys is
     *         deleted. Otherwise, the waiting period begins immediately.
     *         </p>
     *         <p>
     *         This value is optional. If you include a value, it must be
     *         between 7 and 30, inclusive. If you do not include a value, it
     *         defaults to 30. You can use the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     *         > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a>
     *         condition key to further constrain the values that principals can
     *         specify in the <code>PendingWindowInDays</code> parameter.
     *         </p>
     */
    public Integer getPendingWindowInDays() {
        return pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period
     * ends, KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, the
     * waiting period begins when the last of its replica keys is deleted.
     * Otherwise, the waiting period begins immediately.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     * > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition
     * key to further constrain the values that principals can specify in the
     * <code>PendingWindowInDays</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @param pendingWindowInDays <p>
     *            The waiting period, specified in number of days. After the
     *            waiting period ends, KMS deletes the KMS key.
     *            </p>
     *            <p>
     *            If the KMS key is a multi-Region primary key with replica
     *            keys, the waiting period begins when the last of its replica
     *            keys is deleted. Otherwise, the waiting period begins
     *            immediately.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 7 and 30, inclusive. If you do not include a value, it
     *            defaults to 30. You can use the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     *            > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a>
     *            condition key to further constrain the values that principals
     *            can specify in the <code>PendingWindowInDays</code> parameter.
     *            </p>
     */
    public void setPendingWindowInDays(Integer pendingWindowInDays) {
        this.pendingWindowInDays = pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period
     * ends, KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, the
     * waiting period begins when the last of its replica keys is deleted.
     * Otherwise, the waiting period begins immediately.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     * > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition
     * key to further constrain the values that principals can specify in the
     * <code>PendingWindowInDays</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @param pendingWindowInDays <p>
     *            The waiting period, specified in number of days. After the
     *            waiting period ends, KMS deletes the KMS key.
     *            </p>
     *            <p>
     *            If the KMS key is a multi-Region primary key with replica
     *            keys, the waiting period begins when the last of its replica
     *            keys is deleted. Otherwise, the waiting period begins
     *            immediately.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 7 and 30, inclusive. If you do not include a value, it
     *            defaults to 30. You can use the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     *            > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a>
     *            condition key to further constrain the values that principals
     *            can specify in the <code>PendingWindowInDays</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleKeyDeletionRequest withPendingWindowInDays(Integer pendingWindowInDays) {
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
                + ((getPendingWindowInDays() == null) ? 0 : getPendingWindowInDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleKeyDeletionRequest == false)
            return false;
        ScheduleKeyDeletionRequest other = (ScheduleKeyDeletionRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPendingWindowInDays() == null ^ this.getPendingWindowInDays() == null)
            return false;
        if (other.getPendingWindowInDays() != null
                && other.getPendingWindowInDays().equals(this.getPendingWindowInDays()) == false)
            return false;
        return true;
    }
}
