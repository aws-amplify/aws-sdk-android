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
 * Disables <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html"
 * >automatic rotation of the key material</a> of the specified symmetric
 * encryption KMS key.
 * </p>
 * <p>
 * Automatic key rotation is supported only on symmetric encryption KMS keys.
 * You cannot enable automatic rotation of <a href=
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
 * >multi-Region keys</a>, set the property on the primary key.
 * </p>
 * <p>
 * You can enable (<a>EnableKeyRotation</a>) and disable automatic rotation of
 * the key material in <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
 * >customer managed KMS keys</a>. Key material rotation of <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
 * >Amazon Web Services managed KMS keys</a> is not configurable. KMS always
 * rotates the key material for every year. Rotation of <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk"
 * >Amazon Web Services owned KMS keys</a> varies.
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
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key
 * in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:DisableKeyRotation</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>EnableKeyRotation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetKeyRotationStatus</a>
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
public class DisableKeyRotationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies a symmetric encryption KMS key. You cannot enable or disable
     * automatic rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html#asymmetric-cmks"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>.
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
     * Identifies a symmetric encryption KMS key. You cannot enable or disable
     * automatic rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html#asymmetric-cmks"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>.
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
     *         Identifies a symmetric encryption KMS key. You cannot enable or
     *         disable automatic rotation of <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html#asymmetric-cmks"
     *         >asymmetric KMS keys</a>, <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     *         >HMAC KMS keys</a>, KMS keys with <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *         >imported key material</a>, or KMS keys in a <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a>.
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
     * Identifies a symmetric encryption KMS key. You cannot enable or disable
     * automatic rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html#asymmetric-cmks"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>.
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
     *            Identifies a symmetric encryption KMS key. You cannot enable
     *            or disable automatic rotation of <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html#asymmetric-cmks"
     *            >asymmetric KMS keys</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     *            >HMAC KMS keys</a>, KMS keys with <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >imported key material</a>, or KMS keys in a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a>.
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
     * Identifies a symmetric encryption KMS key. You cannot enable or disable
     * automatic rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html#asymmetric-cmks"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>.
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
     *            Identifies a symmetric encryption KMS key. You cannot enable
     *            or disable automatic rotation of <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html#asymmetric-cmks"
     *            >asymmetric KMS keys</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     *            >HMAC KMS keys</a>, KMS keys with <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >imported key material</a>, or KMS keys in a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a>.
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
    public DisableKeyRotationRequest withKeyId(String keyId) {
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

        if (obj instanceof DisableKeyRotationRequest == false)
            return false;
        DisableKeyRotationRequest other = (DisableKeyRotationRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
