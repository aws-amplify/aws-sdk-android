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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Changes the primary key of a multi-Region key.
 * </p>
 * <p>
 * This operation changes the replica key in the specified Region to a primary
 * key and changes the former primary key to a replica key. For example, suppose
 * you have a primary key in <code>us-east-1</code> and a replica key in
 * <code>eu-west-2</code>. If you run <code>UpdatePrimaryRegion</code> with a
 * <code>PrimaryRegion</code> value of <code>eu-west-2</code>, the primary key
 * is now the key in <code>eu-west-2</code>, and the key in
 * <code>us-east-1</code> becomes a replica key. For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-update"
 * >Updating the primary Region</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * This operation supports <i>multi-Region keys</i>, an KMS feature that lets
 * you create multiple interoperable KMS keys in different Amazon Web Services
 * Regions. Because these KMS keys have the same key ID, key material, and other
 * metadata, you can use them interchangeably to encrypt data in one Amazon Web
 * Services Region and decrypt it in a different Amazon Web Services Region
 * without re-encrypting the data or making a cross-Region call. For more
 * information about multi-Region keys, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
 * >Using multi-Region keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * The <i>primary key</i> of a multi-Region key is the source for properties
 * that are always shared by primary and replica keys, including the key
 * material, <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id"
 * >key ID</a>, <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-spec"
 * >key spec</a>, <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-usage"
 * >key usage</a>, <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-origin"
 * >key material origin</a>, and <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html"
 * >automatic key rotation</a>. It's the only key that can be replicated. You
 * cannot <a href=
 * "https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html"
 * >delete the primary key</a> until all replica keys are deleted.
 * </p>
 * <p>
 * The key ID and primary Region that you specify uniquely identify the replica
 * key that will become the primary key. The primary Region must already have a
 * replica key. This operation does not create a KMS key in the specified
 * Region. To find the replica keys, use the <a>DescribeKey</a> operation on the
 * primary key or any replica key. To create a replica key, use the
 * <a>ReplicateKey</a> operation.
 * </p>
 * <p>
 * You can run this operation while using the affected multi-Region keys in
 * cryptographic operations. This operation should not delay, interrupt, or
 * cause failures in cryptographic operations.
 * </p>
 * <p>
 * Even after this operation completes, the process of updating the primary
 * Region might still be in progress for a few more seconds. Operations such as
 * <code>DescribeKey</code> might display both the old and new primary keys as
 * replicas. The old and new primary keys have a transient key state of
 * <code>Updating</code>. The original key state is restored when the update is
 * complete. While the key state is <code>Updating</code>, you can use the keys
 * in cryptographic operations, but you cannot replicate the new primary key or
 * perform certain management operations, such as enabling or disabling these
 * keys. For details about the <code>Updating</code> key state, see <a
 * href="kms/latest/developerguide/key-state.html">Key state: Effect on your KMS
 * key</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * This operation does not return any output. To verify that primary key is
 * changed, use the <a>DescribeKey</a> operation.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot use this operation in a different
 * Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>kms:UpdatePrimaryRegion</code> on the current primary key (in the
 * primary key's Region). Include this permission primary key's key policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>kms:UpdatePrimaryRegion</code> on the current replica key (in the
 * replica key's Region). Include this permission in the replica key's key
 * policy.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Related operations</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ReplicateKey</a>
 * </p>
 * </li>
 * </ul>
 */
public class UpdatePrimaryRegionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the current primary key. When the operation completes, this
     * KMS key will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     * The Amazon Web Services Region of the new primary key. Enter the Region
     * ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. There
     * must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be
     * the primary key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     */
    private String primaryRegion;

    /**
     * <p>
     * Identifies the current primary key. When the operation completes, this
     * KMS key will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     *         Identifies the current primary key. When the operation completes,
     *         this KMS key will be a replica key.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of a multi-Region primary key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     * Identifies the current primary key. When the operation completes, this
     * KMS key will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     *            Identifies the current primary key. When the operation
     *            completes, this KMS key will be a replica key.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of a multi-Region primary key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     * Identifies the current primary key. When the operation completes, this
     * KMS key will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
     *            Identifies the current primary key. When the operation
     *            completes, this KMS key will be a replica key.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of a multi-Region primary key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
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
    public UpdatePrimaryRegionRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the new primary key. Enter the Region
     * ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. There
     * must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be
     * the primary key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region of the new primary key. Enter the
     *         Region ID, such as <code>us-east-1</code> or
     *         <code>ap-southeast-2</code>. There must be an existing replica
     *         key in this Region.
     *         </p>
     *         <p>
     *         When the operation completes, the multi-Region key in this Region
     *         will be the primary key.
     *         </p>
     */
    public String getPrimaryRegion() {
        return primaryRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the new primary key. Enter the Region
     * ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. There
     * must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be
     * the primary key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @param primaryRegion <p>
     *            The Amazon Web Services Region of the new primary key. Enter
     *            the Region ID, such as <code>us-east-1</code> or
     *            <code>ap-southeast-2</code>. There must be an existing replica
     *            key in this Region.
     *            </p>
     *            <p>
     *            When the operation completes, the multi-Region key in this
     *            Region will be the primary key.
     *            </p>
     */
    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the new primary key. Enter the Region
     * ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. There
     * must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be
     * the primary key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([a-z]+-){2,3}\d+$<br/>
     *
     * @param primaryRegion <p>
     *            The Amazon Web Services Region of the new primary key. Enter
     *            the Region ID, such as <code>us-east-1</code> or
     *            <code>ap-southeast-2</code>. There must be an existing replica
     *            key in this Region.
     *            </p>
     *            <p>
     *            When the operation completes, the multi-Region key in this
     *            Region will be the primary key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePrimaryRegionRequest withPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
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
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: " + getPrimaryRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePrimaryRegionRequest == false)
            return false;
        UpdatePrimaryRegionRequest other = (UpdatePrimaryRegionRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null
                && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        return true;
    }
}
