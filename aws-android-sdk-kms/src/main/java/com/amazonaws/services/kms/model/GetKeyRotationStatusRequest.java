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
 * Provides detailed information about the rotation status for a KMS key,
 * including whether <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html"
 * >automatic rotation of the key material</a> is enabled for the specified KMS
 * key, the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotation-period"
 * >rotation period</a>, and the next scheduled rotation date.
 * </p>
 * <p>
 * Automatic key rotation is supported only on <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks"
 * >symmetric encryption KMS keys</a>. You cannot enable automatic rotation of
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
 * >asymmetric KMS keys</a>, <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC
 * KMS keys</a>, KMS keys with <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
 * >imported key material</a>, or KMS keys in a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key store</a>. To enable or disable automatic rotation of a set of
 * related <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
 * >multi-Region keys</a>, set the property on the primary key..
 * </p>
 * <p>
 * You can enable (<a>EnableKeyRotation</a>) and disable automatic rotation
 * (<a>DisableKeyRotation</a>) of the key material in customer managed KMS keys.
 * Key material rotation of <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
 * >Amazon Web Services managed KMS keys</a> is not configurable. KMS always
 * rotates the key material in Amazon Web Services managed KMS keys every year.
 * The key rotation status for Amazon Web Services managed KMS keys is always
 * <code>true</code>.
 * </p>
 * <p>
 * You can perform on-demand (<a>RotateKeyOnDemand</a>) rotation of the key
 * material in customer managed KMS keys, regardless of whether or not automatic
 * key rotation is enabled. You can use GetKeyRotationStatus to identify the
 * date and time that an in progress on-demand rotation was initiated. You can
 * use <a>ListKeyRotations</a> to view the details of completed rotations.
 * </p>
 * <note>
 * <p>
 * In May 2022, KMS changed the rotation schedule for Amazon Web Services
 * managed keys from every three years to every year. For details, see
 * <a>EnableKeyRotation</a>.
 * </p>
 * </note>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key states of KMS keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Disabled: The key rotation status does not change when you disable a KMS key.
 * However, while the KMS key is disabled, KMS does not rotate the key material.
 * When you re-enable the KMS key, rotation resumes. If the key material in the
 * re-enabled KMS key hasn't been rotated in one year, KMS rotates it
 * immediately, and every year thereafter. If it's been less than a year since
 * the key material in the re-enabled KMS key was rotated, the KMS key resumes
 * its prior rotation schedule.
 * </p>
 * </li>
 * <li>
 * <p>
 * Pending deletion: While a KMS key is pending deletion, its key rotation
 * status is <code>false</code> and KMS does not rotate the key material. If you
 * cancel the deletion, the original key rotation status returns to
 * <code>true</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Cross-account use</b>: Yes. To perform this operation on a KMS key in a
 * different Amazon Web Services account, specify the key ARN in the value of
 * the <code>KeyId</code> parameter.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:GetKeyRotationStatus</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DisableKeyRotation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EnableKeyRotation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListKeyRotations</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RotateKeyOnDemand</a>
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
public class GetKeyRotationStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Gets the rotation status for the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
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
     * Gets the rotation status for the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
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
     *         Gets the rotation status for the specified KMS key.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key. To specify a KMS
     *         key in a different Amazon Web Services account, you must use the
     *         key ARN.
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
     * Gets the rotation status for the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
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
     *            Gets the rotation status for the specified KMS key.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key. To specify a KMS
     *            key in a different Amazon Web Services account, you must use
     *            the key ARN.
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
     * Gets the rotation status for the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
     * different Amazon Web Services account, you must use the key ARN.
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
     *            Gets the rotation status for the specified KMS key.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key. To specify a KMS
     *            key in a different Amazon Web Services account, you must use
     *            the key ARN.
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
    public GetKeyRotationStatusRequest withKeyId(String keyId) {
        this.keyId = keyId;
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
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyRotationStatusRequest == false)
            return false;
        GetKeyRotationStatusRequest other = (GetKeyRotationStatusRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
