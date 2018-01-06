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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Schedules the deletion of a customer master key (CMK). You may provide a
 * waiting period, specified in days, before deletion occurs. If you do not
 * provide a waiting period, the default period of 30 days is used. When this
 * operation is successful, the state of the CMK changes to
 * <code>PendingDeletion</code>. Before the waiting period ends, you can use
 * <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the waiting
 * period ends, AWS KMS deletes the CMK and all AWS KMS data associated with it,
 * including all aliases that refer to it.
 * </p>
 * <important>
 * <p>
 * Deleting a CMK is a destructive and potentially dangerous operation. When a
 * CMK is deleted, all data that was encrypted under the CMK is rendered
 * unrecoverable. To restrict the use of a CMK without deleting it, use
 * <a>DisableKey</a>.
 * </p>
 * </important>
 * <p>
 * For more information about scheduling a CMK for deletion, see <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
 * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
 * Developer Guide</i>.
 * </p>
 */
public class ScheduleKeyDeletionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to delete.
     * </p>
     * <p>
     * To specify this value, use the unique key ID or the Amazon Resource Name
     * (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain the unique key ID and key ARN for a given CMK, use
     * <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period
     * ends, AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     */
    private Integer pendingWindowInDays;

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to delete.
     * </p>
     * <p>
     * To specify this value, use the unique key ID or the Amazon Resource Name
     * (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain the unique key ID and key ARN for a given CMK, use
     * <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The unique identifier for the customer master key (CMK) to
     *         delete.
     *         </p>
     *         <p>
     *         To specify this value, use the unique key ID or the Amazon
     *         Resource Name (ARN) of the CMK. Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Unique key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd
     *         -56ef-1234567890ab
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To obtain the unique key ID and key ARN for a given CMK, use
     *         <a>ListKeys</a> or <a>DescribeKey</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to delete.
     * </p>
     * <p>
     * To specify this value, use the unique key ID or the Amazon Resource Name
     * (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain the unique key ID and key ARN for a given CMK, use
     * <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            The unique identifier for the customer master key (CMK) to
     *            delete.
     *            </p>
     *            <p>
     *            To specify this value, use the unique key ID or the Amazon
     *            Resource Name (ARN) of the CMK. Examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Unique key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34
     *            cd-56ef-1234567890ab
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To obtain the unique key ID and key ARN for a given CMK, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to delete.
     * </p>
     * <p>
     * To specify this value, use the unique key ID or the Amazon Resource Name
     * (ARN) of the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-
     * 56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain the unique key ID and key ARN for a given CMK, use
     * <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            The unique identifier for the customer master key (CMK) to
     *            delete.
     *            </p>
     *            <p>
     *            To specify this value, use the unique key ID or the Amazon
     *            Resource Name (ARN) of the CMK. Examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Unique key ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34
     *            cd-56ef-1234567890ab
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To obtain the unique key ID and key ARN for a given CMK, use
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
     * ends, AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @return <p>
     *         The waiting period, specified in number of days. After the
     *         waiting period ends, AWS KMS deletes the customer master key
     *         (CMK).
     *         </p>
     *         <p>
     *         This value is optional. If you include a value, it must be
     *         between 7 and 30, inclusive. If you do not include a value, it
     *         defaults to 30.
     *         </p>
     */
    public Integer getPendingWindowInDays() {
        return pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period
     * ends, AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 365<br/>
     *
     * @param pendingWindowInDays <p>
     *            The waiting period, specified in number of days. After the
     *            waiting period ends, AWS KMS deletes the customer master key
     *            (CMK).
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 7 and 30, inclusive. If you do not include a value, it
     *            defaults to 30.
     *            </p>
     */
    public void setPendingWindowInDays(Integer pendingWindowInDays) {
        this.pendingWindowInDays = pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period
     * ends, AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and
     * 30, inclusive. If you do not include a value, it defaults to 30.
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
     *            waiting period ends, AWS KMS deletes the customer master key
     *            (CMK).
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 7 and 30, inclusive. If you do not include a value, it
     *            defaults to 30.
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
