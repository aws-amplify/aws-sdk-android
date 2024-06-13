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
 * Enables <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
 * >automatic rotation of the key material</a> of the specified symmetric
 * encryption KMS key.
 * </p>
 * <p>
 * By default, when you enable automatic rotation of a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
 * >customer managed KMS key</a>, KMS rotates the key material of the KMS key
 * one year (approximately 365 days) from the enable date and every year
 * thereafter. You can use the optional <code>RotationPeriodInDays</code>
 * parameter to specify a custom rotation period when you enable key rotation,
 * or you can use <code>RotationPeriodInDays</code> to modify the rotation
 * period of a key that you previously enabled automatic key rotation on.
 * </p>
 * <p>
 * You can monitor rotation of the key material for your KMS keys in CloudTrail
 * and Amazon CloudWatch. To disable rotation of the key material in a customer
 * managed KMS key, use the <a>DisableKeyRotation</a> operation. You can use the
 * <a>GetKeyRotationStatus</a> operation to identify any in progress rotations.
 * You can use the <a>ListKeyRotations</a> operation to view the details of
 * completed rotations.
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
 * >multi-Region keys</a>, set the property on the primary key.
 * </p>
 * <p>
 * You cannot enable or disable automatic rotation of <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
 * >Amazon Web Services managed KMS keys</a>. KMS always rotates the key
 * material of Amazon Web Services managed keys every year. Rotation of <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk"
 * >Amazon Web Services owned KMS keys</a> is managed by the Amazon Web Services
 * service that owns the key.
 * </p>
 * <note>
 * <p>
 * In May 2022, KMS changed the rotation schedule for Amazon Web Services
 * managed keys from every three years (approximately 1,095 days) to every year
 * (approximately 365 days).
 * </p>
 * <p>
 * New Amazon Web Services managed keys are automatically rotated one year after
 * they are created, and approximately every year thereafter.
 * </p>
 * <p>
 * Existing Amazon Web Services managed keys are automatically rotated one year
 * after their most recent rotation, and every year thereafter.
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
 * >kms:EnableKeyRotation</a> (key policy)
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
 * <note>
 * <p>
 * You can perform on-demand (<a>RotateKeyOnDemand</a>) rotation of the key
 * material in customer managed KMS keys, regardless of whether or not automatic
 * key rotation is enabled.
 * </p>
 * </note></li>
 * </ul>
 * <p>
 * <b>Eventual consistency</b>: The KMS API follows an eventual consistency
 * model. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
 * >KMS eventual consistency</a>.
 * </p>
 */
public class EnableKeyRotationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies a symmetric encryption KMS key. You cannot enable automatic
     * rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>. To enable or disable automatic rotation of a set
     * of related <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
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
     * Use this parameter to specify a custom period of time between each
     * rotation date. If no value is specified, the default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic
     * key rotation that KMS will rotate your key material, and the number of
     * days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further
     * constrain the values that principals can specify in the
     * <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     */
    private Integer rotationPeriodInDays;

    /**
     * <p>
     * Identifies a symmetric encryption KMS key. You cannot enable automatic
     * rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>. To enable or disable automatic rotation of a set
     * of related <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
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
     *         Identifies a symmetric encryption KMS key. You cannot enable
     *         automatic rotation of <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *         >asymmetric KMS keys</a>, <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     *         >HMAC KMS keys</a>, KMS keys with <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *         >imported key material</a>, or KMS keys in a <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a>. To enable or disable automatic rotation of
     *         a set of related <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     *         >multi-Region keys</a>, set the property on the primary key.
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
     * Identifies a symmetric encryption KMS key. You cannot enable automatic
     * rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>. To enable or disable automatic rotation of a set
     * of related <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
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
     *            automatic rotation of <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >asymmetric KMS keys</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     *            >HMAC KMS keys</a>, KMS keys with <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >imported key material</a>, or KMS keys in a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a>. To enable or disable automatic rotation
     *            of a set of related <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     *            >multi-Region keys</a>, set the property on the primary key.
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
     * Identifies a symmetric encryption KMS key. You cannot enable automatic
     * rotation of <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     * >asymmetric KMS keys</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     * >HMAC KMS keys</a>, KMS keys with <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >imported key material</a>, or KMS keys in a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a>. To enable or disable automatic rotation of a set
     * of related <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
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
     *            automatic rotation of <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
     *            >asymmetric KMS keys</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html"
     *            >HMAC KMS keys</a>, KMS keys with <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >imported key material</a>, or KMS keys in a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a>. To enable or disable automatic rotation
     *            of a set of related <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     *            >multi-Region keys</a>, set the property on the primary key.
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
    public EnableKeyRotationRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify a custom period of time between each
     * rotation date. If no value is specified, the default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic
     * key rotation that KMS will rotate your key material, and the number of
     * days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further
     * constrain the values that principals can specify in the
     * <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     *
     * @return <p>
     *         Use this parameter to specify a custom period of time between
     *         each rotation date. If no value is specified, the default value
     *         is 365 days.
     *         </p>
     *         <p>
     *         The rotation period defines the number of days after you enable
     *         automatic key rotation that KMS will rotate your key material,
     *         and the number of days between each automatic rotation
     *         thereafter.
     *         </p>
     *         <p>
     *         You can use the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     *         > <code>kms:RotationPeriodInDays</code> </a> condition key to
     *         further constrain the values that principals can specify in the
     *         <code>RotationPeriodInDays</code> parameter.
     *         </p>
     *         <p>
     *         </p>
     */
    public Integer getRotationPeriodInDays() {
        return rotationPeriodInDays;
    }

    /**
     * <p>
     * Use this parameter to specify a custom period of time between each
     * rotation date. If no value is specified, the default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic
     * key rotation that KMS will rotate your key material, and the number of
     * days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further
     * constrain the values that principals can specify in the
     * <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     *
     * @param rotationPeriodInDays <p>
     *            Use this parameter to specify a custom period of time between
     *            each rotation date. If no value is specified, the default
     *            value is 365 days.
     *            </p>
     *            <p>
     *            The rotation period defines the number of days after you
     *            enable automatic key rotation that KMS will rotate your key
     *            material, and the number of days between each automatic
     *            rotation thereafter.
     *            </p>
     *            <p>
     *            You can use the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     *            > <code>kms:RotationPeriodInDays</code> </a> condition key to
     *            further constrain the values that principals can specify in
     *            the <code>RotationPeriodInDays</code> parameter.
     *            </p>
     *            <p>
     *            </p>
     */
    public void setRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
    }

    /**
     * <p>
     * Use this parameter to specify a custom period of time between each
     * rotation date. If no value is specified, the default value is 365 days.
     * </p>
     * <p>
     * The rotation period defines the number of days after you enable automatic
     * key rotation that KMS will rotate your key material, and the number of
     * days between each automatic rotation thereafter.
     * </p>
     * <p>
     * You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     * > <code>kms:RotationPeriodInDays</code> </a> condition key to further
     * constrain the values that principals can specify in the
     * <code>RotationPeriodInDays</code> parameter.
     * </p>
     * <p>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>90 - 2560<br/>
     *
     * @param rotationPeriodInDays <p>
     *            Use this parameter to specify a custom period of time between
     *            each rotation date. If no value is specified, the default
     *            value is 365 days.
     *            </p>
     *            <p>
     *            The rotation period defines the number of days after you
     *            enable automatic key rotation that KMS will rotate your key
     *            material, and the number of days between each automatic
     *            rotation thereafter.
     *            </p>
     *            <p>
     *            You can use the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-rotation-period-in-days"
     *            > <code>kms:RotationPeriodInDays</code> </a> condition key to
     *            further constrain the values that principals can specify in
     *            the <code>RotationPeriodInDays</code> parameter.
     *            </p>
     *            <p>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableKeyRotationRequest withRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
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
        if (getRotationPeriodInDays() != null)
            sb.append("RotationPeriodInDays: " + getRotationPeriodInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getRotationPeriodInDays() == null) ? 0 : getRotationPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableKeyRotationRequest == false)
            return false;
        EnableKeyRotationRequest other = (EnableKeyRotationRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getRotationPeriodInDays() == null ^ this.getRotationPeriodInDays() == null)
            return false;
        if (other.getRotationPeriodInDays() != null
                && other.getRotationPeriodInDays().equals(this.getRotationPeriodInDays()) == false)
            return false;
        return true;
    }
}
