/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a unique customer managed <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master-keys"
 * >customer master key</a> (CMK) in your AWS account and Region. You cannot use
 * this operation to create a CMK in a different AWS account.
 * </p>
 * <p>
 * You can use the <code>CreateKey</code> operation to create symmetric or
 * asymmetric CMKs.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Symmetric CMKs</b> contain a 256-bit symmetric key that never leaves AWS
 * KMS unencrypted. To use the CMK, you must call AWS KMS. You can use a
 * symmetric CMK to encrypt and decrypt small amounts of data, but they are
 * typically used to generate <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys"
 * >data keys</a> and <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-key-pairs"
 * >data keys pairs</a>. For details, see <a>GenerateDataKey</a> and
 * <a>GenerateDataKeyPair</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Asymmetric CMKs</b> can contain an RSA key pair or an Elliptic Curve (ECC)
 * key pair. The private key in an asymmetric CMK never leaves AWS KMS
 * unencrypted. However, you can use the <a>GetPublicKey</a> operation to
 * download the public key so it can be used outside of AWS KMS. CMKs with RSA
 * key pairs can be used to encrypt or decrypt data or sign and verify messages
 * (but not both). CMKs with ECC key pairs can be used only to sign and verify
 * messages.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about symmetric and asymmetric CMKs, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
 * >Using Symmetric and Asymmetric CMKs</a> in the <i>AWS Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * To create different types of CMKs, use the following guidance:
 * </p>
 * <dl>
 * <dt>Asymmetric CMKs</dt>
 * <dd>
 * <p>
 * To create an asymmetric CMK, use the <code>CustomerMasterKeySpec</code>
 * parameter to specify the type of key material in the CMK. Then, use the
 * <code>KeyUsage</code> parameter to determine whether the CMK will be used to
 * encrypt and decrypt or sign and verify. You can't change these properties
 * after the CMK is created.
 * </p>
 * <p>
 * </p></dd>
 * <dt>Symmetric CMKs</dt>
 * <dd>
 * <p>
 * When creating a symmetric CMK, you don't need to specify the
 * <code>CustomerMasterKeySpec</code> or <code>KeyUsage</code> parameters. The
 * default value for <code>CustomerMasterKeySpec</code>,
 * <code>SYMMETRIC_DEFAULT</code>, and the default value for
 * <code>KeyUsage</code>, <code>ENCRYPT_DECRYPT</code>, are the only valid
 * values for symmetric CMKs.
 * </p>
 * <p>
 * </p></dd>
 * <dt>Imported Key Material</dt>
 * <dd>
 * <p>
 * To import your own key material, begin by creating a symmetric CMK with no
 * key material. To do this, use the <code>Origin</code> parameter of
 * <code>CreateKey</code> with a value of <code>EXTERNAL</code>. Next, use
 * <a>GetParametersForImport</a> operation to get a public key and import token,
 * and use the public key to encrypt your key material. Then, use
 * <a>ImportKeyMaterial</a> with your import token to import the key material.
 * For step-by-step instructions, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
 * >Importing Key Material</a> in the <i> <i>AWS Key Management Service
 * Developer Guide</i> </i>. You cannot import the key material into an
 * asymmetric CMK.
 * </p>
 * <p>
 * </p></dd>
 * <dt>Custom Key Stores</dt>
 * <dd>
 * <p>
 * To create a symmetric CMK in a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key store</a>, use the <code>CustomKeyStoreId</code> parameter to
 * specify the custom key store. You must also use the <code>Origin</code>
 * parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster
 * that is associated with the custom key store must have at least two active
 * HSMs in different Availability Zones in the AWS Region.
 * </p>
 * <p>
 * You cannot create an asymmetric CMK in a custom key store. For information
 * about custom key stores in AWS KMS see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >Using Custom Key Stores</a> in the <i> <i>AWS Key Management Service
 * Developer Guide</i> </i>.
 * </p>
 * </dd>
 * </dl>
 */
public class CreateKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must allow the principal that is making the
     * <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     * request on the CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to AWS KMS. When
     * you create a new AWS principal (for example, an IAM user or role), you
     * might need to enforce a delay before including the new principal in a key
     * policy because the new principal might not be immediately visible to AWS
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy
     * to the CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * Determines the cryptographic operations for which you can use the CMK.
     * The default value is <code>ENCRYPT_DECRYPT</code>. This parameter is
     * required only for asymmetric CMKs. You can't change the
     * <code>KeyUsage</code> value after the CMK is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric CMKs, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     */
    private String keyUsage;

    /**
     * <p>
     * Specifies the type of CMK to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit symmetric
     * key for encryption and decryption. For help choosing a key spec for your
     * CMK, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     * >How to Choose Your CMK Configuration</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * The <code>CustomerMasterKeySpec</code> determines whether the CMK
     * contains a symmetric key or an asymmetric key pair. It also determines
     * the encryption algorithms or signing algorithms that the CMK supports.
     * You can't change the <code>CustomerMasterKeySpec</code> after the CMK is
     * created. To further restrict the algorithms that can be used with the
     * CMK, use a condition key in its key policy or IAM policy. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">AWS
     * services that are integrated with AWS KMS</a> use symmetric CMKs to
     * protect your data. These services do not support asymmetric CMKs. For
     * help determining whether a CMK is symmetric or asymmetric, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     * >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * AWS KMS supports the following key specs for CMKs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     * cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     */
    private String customerMasterKeySpec;

    /**
     * <p>
     * The source of the key material for the CMK. You cannot change the origin
     * after you create the CMK. The default is <code>AWS_KMS</code>, which
     * means AWS KMS creates the key material.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK
     * without key material so that you can import key material from your
     * existing key management infrastructure. For more information about
     * importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>. This value is valid only for symmetric CMKs.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates
     * the CMK in an AWS KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and creates its key material in the associated AWS
     * CloudHSM cluster. You must also use the <code>CustomKeyStoreId</code>
     * parameter to identify the custom key store. This value is valid only for
     * symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     */
    private String origin;

    /**
     * <p>
     * Creates the CMK in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated AWS CloudHSM
     * cluster. To create a CMK in a custom key store, you must also specify the
     * <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>.
     * The AWS CloudHSM cluster that is associated with the custom key store
     * must have at least two active HSMs, each in a different Availability Zone
     * in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric CMKs. You cannot create an
     * asymmetric CMK in a custom key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS
     * CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Both
     * the tag key and the tag value are required, but the tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * When you add tags to an AWS resource, AWS generates a cost allocation
     * report with usage and costs aggregated by tags. For information about
     * adding, changing, deleting and listing tags for CMKs, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. To add tags to an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must allow the principal that is making the
     * <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     * request on the CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to AWS KMS. When
     * you create a new AWS principal (for example, an IAM user or role), you
     * might need to enforce a delay before including the new principal in a key
     * policy because the new principal might not be immediately visible to AWS
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy
     * to the CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The key policy to attach to the CMK.
     *         </p>
     *         <p>
     *         If you provide a key policy, it must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to
     *         true, the key policy must allow the principal that is making the
     *         <code>CreateKey</code> request to make a subsequent
     *         <a>PutKeyPolicy</a> request on the CMK. This reduces the risk
     *         that the CMK becomes unmanageable. For more information, refer to
     *         the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section of the <i> <i>AWS Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more
     *         principals. The principals in the key policy must exist and be
     *         visible to AWS KMS. When you create a new AWS principal (for
     *         example, an IAM user or role), you might need to enforce a delay
     *         before including the new principal in a key policy because the
     *         new principal might not be immediately visible to AWS KMS. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in
     *         the <i>AWS Identity and Access Management User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you do not provide a key policy, AWS KMS attaches a default
     *         key policy to the CMK. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *         >Default Key Policy</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         The key policy size quota is 32 kilobytes (32768 bytes).
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must allow the principal that is making the
     * <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     * request on the CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to AWS KMS. When
     * you create a new AWS principal (for example, an IAM user or role), you
     * might need to enforce a delay before including the new principal in a key
     * policy because the new principal might not be immediately visible to AWS
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy
     * to the CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the CMK.
     *            </p>
     *            <p>
     *            If you provide a key policy, it must meet the following
     *            criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to true, the key policy must allow the principal that is
     *            making the <code>CreateKey</code> request to make a subsequent
     *            <a>PutKeyPolicy</a> request on the CMK. This reduces the risk
     *            that the CMK becomes unmanageable. For more information, refer
     *            to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section of the <i> <i>AWS Key
     *            Management Service Developer Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to AWS KMS. When you create a new AWS principal (for
     *            example, an IAM user or role), you might need to enforce a
     *            delay before including the new principal in a key policy
     *            because the new principal might not be immediately visible to
     *            AWS KMS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>AWS Identity and Access Management User Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you do not provide a key policy, AWS KMS attaches a default
     *            key policy to the CMK. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >Default Key Policy</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The key policy size quota is 32 kilobytes (32768 bytes).
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the
     * key policy must allow the principal that is making the
     * <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     * request on the CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to AWS KMS. When
     * you create a new AWS principal (for example, an IAM user or role), you
     * might need to enforce a delay before including the new principal in a key
     * policy because the new principal might not be immediately visible to AWS
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy
     * to the CMK. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default Key Policy</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the CMK.
     *            </p>
     *            <p>
     *            If you provide a key policy, it must meet the following
     *            criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to true, the key policy must allow the principal that is
     *            making the <code>CreateKey</code> request to make a subsequent
     *            <a>PutKeyPolicy</a> request on the CMK. This reduces the risk
     *            that the CMK becomes unmanageable. For more information, refer
     *            to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section of the <i> <i>AWS Key
     *            Management Service Developer Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to AWS KMS. When you create a new AWS principal (for
     *            example, an IAM user or role), you might need to enforce a
     *            delay before including the new principal in a key policy
     *            because the new principal might not be immediately visible to
     *            AWS KMS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>AWS Identity and Access Management User Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you do not provide a key policy, AWS KMS attaches a default
     *            key policy to the CMK. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >Default Key Policy</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The key policy size quota is 32 kilobytes (32768 bytes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return <p>
     *         A description of the CMK.
     *         </p>
     *         <p>
     *         Use a description that helps you decide whether the CMK is
     *         appropriate for a task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the CMK.
     *            </p>
     *            <p>
     *            Use a description that helps you decide whether the CMK is
     *            appropriate for a task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate
     * for a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the CMK.
     *            </p>
     *            <p>
     *            Use a description that helps you decide whether the CMK is
     *            appropriate for a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Determines the cryptographic operations for which you can use the CMK.
     * The default value is <code>ENCRYPT_DECRYPT</code>. This parameter is
     * required only for asymmetric CMKs. You can't change the
     * <code>KeyUsage</code> value after the CMK is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric CMKs, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @return <p>
     *         Determines the cryptographic operations for which you can use the
     *         CMK. The default value is <code>ENCRYPT_DECRYPT</code>. This
     *         parameter is required only for asymmetric CMKs. You can't change
     *         the <code>KeyUsage</code> value after the CMK is created.
     *         </p>
     *         <p>
     *         Select only one valid value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For symmetric CMKs, omit the parameter or specify
     *         <code>ENCRYPT_DECRYPT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric CMKs with RSA key material, specify
     *         <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric CMKs with ECC key material, specify
     *         <code>SIGN_VERIFY</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return keyUsage;
    }

    /**
     * <p>
     * Determines the cryptographic operations for which you can use the CMK.
     * The default value is <code>ENCRYPT_DECRYPT</code>. This parameter is
     * required only for asymmetric CMKs. You can't change the
     * <code>KeyUsage</code> value after the CMK is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric CMKs, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            Determines the cryptographic operations for which you can use
     *            the CMK. The default value is <code>ENCRYPT_DECRYPT</code>.
     *            This parameter is required only for asymmetric CMKs. You can't
     *            change the <code>KeyUsage</code> value after the CMK is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric CMKs, omit the parameter or specify
     *            <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * Determines the cryptographic operations for which you can use the CMK.
     * The default value is <code>ENCRYPT_DECRYPT</code>. This parameter is
     * required only for asymmetric CMKs. You can't change the
     * <code>KeyUsage</code> value after the CMK is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric CMKs, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            Determines the cryptographic operations for which you can use
     *            the CMK. The default value is <code>ENCRYPT_DECRYPT</code>.
     *            This parameter is required only for asymmetric CMKs. You can't
     *            change the <code>KeyUsage</code> value after the CMK is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric CMKs, omit the parameter or specify
     *            <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /**
     * <p>
     * Determines the cryptographic operations for which you can use the CMK.
     * The default value is <code>ENCRYPT_DECRYPT</code>. This parameter is
     * required only for asymmetric CMKs. You can't change the
     * <code>KeyUsage</code> value after the CMK is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric CMKs, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            Determines the cryptographic operations for which you can use
     *            the CMK. The default value is <code>ENCRYPT_DECRYPT</code>.
     *            This parameter is required only for asymmetric CMKs. You can't
     *            change the <code>KeyUsage</code> value after the CMK is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric CMKs, omit the parameter or specify
     *            <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }

    /**
     * <p>
     * Determines the cryptographic operations for which you can use the CMK.
     * The default value is <code>ENCRYPT_DECRYPT</code>. This parameter is
     * required only for asymmetric CMKs. You can't change the
     * <code>KeyUsage</code> value after the CMK is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric CMKs, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric CMKs with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT
     *
     * @param keyUsage <p>
     *            Determines the cryptographic operations for which you can use
     *            the CMK. The default value is <code>ENCRYPT_DECRYPT</code>.
     *            This parameter is required only for asymmetric CMKs. You can't
     *            change the <code>KeyUsage</code> value after the CMK is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric CMKs, omit the parameter or specify
     *            <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric CMKs with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public CreateKeyRequest withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of CMK to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit symmetric
     * key for encryption and decryption. For help choosing a key spec for your
     * CMK, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     * >How to Choose Your CMK Configuration</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * The <code>CustomerMasterKeySpec</code> determines whether the CMK
     * contains a symmetric key or an asymmetric key pair. It also determines
     * the encryption algorithms or signing algorithms that the CMK supports.
     * You can't change the <code>CustomerMasterKeySpec</code> after the CMK is
     * created. To further restrict the algorithms that can be used with the
     * CMK, use a condition key in its key policy or IAM policy. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">AWS
     * services that are integrated with AWS KMS</a> use symmetric CMKs to
     * protect your data. These services do not support asymmetric CMKs. For
     * help determining whether a CMK is symmetric or asymmetric, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     * >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * AWS KMS supports the following key specs for CMKs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     * cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @return <p>
     *         Specifies the type of CMK to create. The default value,
     *         <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit
     *         symmetric key for encryption and decryption. For help choosing a
     *         key spec for your CMK, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     *         >How to Choose Your CMK Configuration</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         The <code>CustomerMasterKeySpec</code> determines whether the CMK
     *         contains a symmetric key or an asymmetric key pair. It also
     *         determines the encryption algorithms or signing algorithms that
     *         the CMK supports. You can't change the
     *         <code>CustomerMasterKeySpec</code> after the CMK is created. To
     *         further restrict the algorithms that can be used with the CMK,
     *         use a condition key in its key policy or IAM policy. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *         >kms:EncryptionAlgorithm</a> or <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *         >kms:Signing Algorithm</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         <a href=
     *         "http://aws.amazon.com/kms/features/#AWS_Service_Integration">AWS
     *         services that are integrated with AWS KMS</a> use symmetric CMKs
     *         to protect your data. These services do not support asymmetric
     *         CMKs. For help determining whether a CMK is symmetric or
     *         asymmetric, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     *         >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         AWS KMS supports the following key specs for CMKs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Symmetric key (default)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Asymmetric RSA key pairs
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RSA_2048</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RSA_3072</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RSA_4096</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Asymmetric NIST-recommended elliptic curve key pairs
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ECC_NIST_P256</code> (secp256r1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ECC_NIST_P384</code> (secp384r1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ECC_NIST_P521</code> (secp521r1)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Other asymmetric elliptic curve key pairs
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     *         cryptocurrencies.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     * @see CustomerMasterKeySpec
     */
    public String getCustomerMasterKeySpec() {
        return customerMasterKeySpec;
    }

    /**
     * <p>
     * Specifies the type of CMK to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit symmetric
     * key for encryption and decryption. For help choosing a key spec for your
     * CMK, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     * >How to Choose Your CMK Configuration</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * The <code>CustomerMasterKeySpec</code> determines whether the CMK
     * contains a symmetric key or an asymmetric key pair. It also determines
     * the encryption algorithms or signing algorithms that the CMK supports.
     * You can't change the <code>CustomerMasterKeySpec</code> after the CMK is
     * created. To further restrict the algorithms that can be used with the
     * CMK, use a condition key in its key policy or IAM policy. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">AWS
     * services that are integrated with AWS KMS</a> use symmetric CMKs to
     * protect your data. These services do not support asymmetric CMKs. For
     * help determining whether a CMK is symmetric or asymmetric, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     * >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * AWS KMS supports the following key specs for CMKs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     * cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Specifies the type of CMK to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit
     *            symmetric key for encryption and decryption. For help choosing
     *            a key spec for your CMK, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     *            >How to Choose Your CMK Configuration</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The <code>CustomerMasterKeySpec</code> determines whether the
     *            CMK contains a symmetric key or an asymmetric key pair. It
     *            also determines the encryption algorithms or signing
     *            algorithms that the CMK supports. You can't change the
     *            <code>CustomerMasterKeySpec</code> after the CMK is created.
     *            To further restrict the algorithms that can be used with the
     *            CMK, use a condition key in its key policy or IAM policy. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >AWS services that are integrated with AWS KMS</a> use
     *            symmetric CMKs to protect your data. These services do not
     *            support asymmetric CMKs. For help determining whether a CMK is
     *            symmetric or asymmetric, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     *            >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS
     *            Key Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            AWS KMS supports the following key specs for CMKs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric RSA key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RSA_2048</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_3072</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_4096</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric NIST-recommended elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P256</code> (secp256r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P384</code> (secp384r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P521</code> (secp521r1)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Other asymmetric elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     *            cryptocurrencies.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
    }

    /**
     * <p>
     * Specifies the type of CMK to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit symmetric
     * key for encryption and decryption. For help choosing a key spec for your
     * CMK, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     * >How to Choose Your CMK Configuration</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * The <code>CustomerMasterKeySpec</code> determines whether the CMK
     * contains a symmetric key or an asymmetric key pair. It also determines
     * the encryption algorithms or signing algorithms that the CMK supports.
     * You can't change the <code>CustomerMasterKeySpec</code> after the CMK is
     * created. To further restrict the algorithms that can be used with the
     * CMK, use a condition key in its key policy or IAM policy. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">AWS
     * services that are integrated with AWS KMS</a> use symmetric CMKs to
     * protect your data. These services do not support asymmetric CMKs. For
     * help determining whether a CMK is symmetric or asymmetric, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     * >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * AWS KMS supports the following key specs for CMKs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     * cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Specifies the type of CMK to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit
     *            symmetric key for encryption and decryption. For help choosing
     *            a key spec for your CMK, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     *            >How to Choose Your CMK Configuration</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The <code>CustomerMasterKeySpec</code> determines whether the
     *            CMK contains a symmetric key or an asymmetric key pair. It
     *            also determines the encryption algorithms or signing
     *            algorithms that the CMK supports. You can't change the
     *            <code>CustomerMasterKeySpec</code> after the CMK is created.
     *            To further restrict the algorithms that can be used with the
     *            CMK, use a condition key in its key policy or IAM policy. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >AWS services that are integrated with AWS KMS</a> use
     *            symmetric CMKs to protect your data. These services do not
     *            support asymmetric CMKs. For help determining whether a CMK is
     *            symmetric or asymmetric, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     *            >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS
     *            Key Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            AWS KMS supports the following key specs for CMKs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric RSA key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RSA_2048</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_3072</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_4096</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric NIST-recommended elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P256</code> (secp256r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P384</code> (secp384r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P521</code> (secp521r1)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Other asymmetric elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     *            cryptocurrencies.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomerMasterKeySpec
     */
    public CreateKeyRequest withCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
        return this;
    }

    /**
     * <p>
     * Specifies the type of CMK to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit symmetric
     * key for encryption and decryption. For help choosing a key spec for your
     * CMK, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     * >How to Choose Your CMK Configuration</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * The <code>CustomerMasterKeySpec</code> determines whether the CMK
     * contains a symmetric key or an asymmetric key pair. It also determines
     * the encryption algorithms or signing algorithms that the CMK supports.
     * You can't change the <code>CustomerMasterKeySpec</code> after the CMK is
     * created. To further restrict the algorithms that can be used with the
     * CMK, use a condition key in its key policy or IAM policy. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">AWS
     * services that are integrated with AWS KMS</a> use symmetric CMKs to
     * protect your data. These services do not support asymmetric CMKs. For
     * help determining whether a CMK is symmetric or asymmetric, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     * >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * AWS KMS supports the following key specs for CMKs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     * cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Specifies the type of CMK to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit
     *            symmetric key for encryption and decryption. For help choosing
     *            a key spec for your CMK, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     *            >How to Choose Your CMK Configuration</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The <code>CustomerMasterKeySpec</code> determines whether the
     *            CMK contains a symmetric key or an asymmetric key pair. It
     *            also determines the encryption algorithms or signing
     *            algorithms that the CMK supports. You can't change the
     *            <code>CustomerMasterKeySpec</code> after the CMK is created.
     *            To further restrict the algorithms that can be used with the
     *            CMK, use a condition key in its key policy or IAM policy. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >AWS services that are integrated with AWS KMS</a> use
     *            symmetric CMKs to protect your data. These services do not
     *            support asymmetric CMKs. For help determining whether a CMK is
     *            symmetric or asymmetric, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     *            >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS
     *            Key Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            AWS KMS supports the following key specs for CMKs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric RSA key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RSA_2048</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_3072</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_4096</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric NIST-recommended elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P256</code> (secp256r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P384</code> (secp384r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P521</code> (secp521r1)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Other asymmetric elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     *            cryptocurrencies.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
    }

    /**
     * <p>
     * Specifies the type of CMK to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit symmetric
     * key for encryption and decryption. For help choosing a key spec for your
     * CMK, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     * >How to Choose Your CMK Configuration</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * The <code>CustomerMasterKeySpec</code> determines whether the CMK
     * contains a symmetric key or an asymmetric key pair. It also determines
     * the encryption algorithms or signing algorithms that the CMK supports.
     * You can't change the <code>CustomerMasterKeySpec</code> after the CMK is
     * created. To further restrict the algorithms that can be used with the
     * CMK, use a condition key in its key policy or IAM policy. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">AWS
     * services that are integrated with AWS KMS</a> use symmetric CMKs to
     * protect your data. These services do not support asymmetric CMKs. For
     * help determining whether a CMK is symmetric or asymmetric, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     * >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * AWS KMS supports the following key specs for CMKs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     * cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT
     *
     * @param customerMasterKeySpec <p>
     *            Specifies the type of CMK to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a CMK with a 256-bit
     *            symmetric key for encryption and decryption. For help choosing
     *            a key spec for your CMK, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html"
     *            >How to Choose Your CMK Configuration</a> in the <i>AWS Key
     *            Management Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            The <code>CustomerMasterKeySpec</code> determines whether the
     *            CMK contains a symmetric key or an asymmetric key pair. It
     *            also determines the encryption algorithms or signing
     *            algorithms that the CMK supports. You can't change the
     *            <code>CustomerMasterKeySpec</code> after the CMK is created.
     *            To further restrict the algorithms that can be used with the
     *            CMK, use a condition key in its key policy or IAM policy. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >AWS services that are integrated with AWS KMS</a> use
     *            symmetric CMKs to protect your data. These services do not
     *            support asymmetric CMKs. For help determining whether a CMK is
     *            symmetric or asymmetric, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/find-symm-asymm.html"
     *            >Identifying Symmetric and Asymmetric CMKs</a> in the <i>AWS
     *            Key Management Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            AWS KMS supports the following key specs for CMKs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code> (AES-256-GCM)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric RSA key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RSA_2048</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_3072</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RSA_4096</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Asymmetric NIST-recommended elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P256</code> (secp256r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P384</code> (secp384r1)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ECC_NIST_P521</code> (secp521r1)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Other asymmetric elliptic curve key pairs
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for
     *            cryptocurrencies.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomerMasterKeySpec
     */
    public CreateKeyRequest withCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
        return this;
    }

    /**
     * <p>
     * The source of the key material for the CMK. You cannot change the origin
     * after you create the CMK. The default is <code>AWS_KMS</code>, which
     * means AWS KMS creates the key material.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK
     * without key material so that you can import key material from your
     * existing key management infrastructure. For more information about
     * importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>. This value is valid only for symmetric CMKs.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates
     * the CMK in an AWS KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and creates its key material in the associated AWS
     * CloudHSM cluster. You must also use the <code>CustomKeyStoreId</code>
     * parameter to identify the custom key store. This value is valid only for
     * symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @return <p>
     *         The source of the key material for the CMK. You cannot change the
     *         origin after you create the CMK. The default is
     *         <code>AWS_KMS</code>, which means AWS KMS creates the key
     *         material.
     *         </p>
     *         <p>
     *         When the parameter value is <code>EXTERNAL</code>, AWS KMS
     *         creates a CMK without key material so that you can import key
     *         material from your existing key management infrastructure. For
     *         more information about importing key material into AWS KMS, see
     *         <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *         >Importing Key Material</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>. This value is valid only for symmetric CMKs.
     *         </p>
     *         <p>
     *         When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS
     *         creates the CMK in an AWS KMS <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a> and creates its key material in the
     *         associated AWS CloudHSM cluster. You must also use the
     *         <code>CustomKeyStoreId</code> parameter to identify the custom
     *         key store. This value is valid only for symmetric CMKs.
     *         </p>
     * @see OriginType
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * The source of the key material for the CMK. You cannot change the origin
     * after you create the CMK. The default is <code>AWS_KMS</code>, which
     * means AWS KMS creates the key material.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK
     * without key material so that you can import key material from your
     * existing key management infrastructure. For more information about
     * importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>. This value is valid only for symmetric CMKs.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates
     * the CMK in an AWS KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and creates its key material in the associated AWS
     * CloudHSM cluster. You must also use the <code>CustomKeyStoreId</code>
     * parameter to identify the custom key store. This value is valid only for
     * symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the CMK. You cannot change
     *            the origin after you create the CMK. The default is
     *            <code>AWS_KMS</code>, which means AWS KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            When the parameter value is <code>EXTERNAL</code>, AWS KMS
     *            creates a CMK without key material so that you can import key
     *            material from your existing key management infrastructure. For
     *            more information about importing key material into AWS KMS,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>. This value is valid only for
     *            symmetric CMKs.
     *            </p>
     *            <p>
     *            When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS
     *            creates the CMK in an AWS KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and creates its key material in the
     *            associated AWS CloudHSM cluster. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric CMKs.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the key material for the CMK. You cannot change the origin
     * after you create the CMK. The default is <code>AWS_KMS</code>, which
     * means AWS KMS creates the key material.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK
     * without key material so that you can import key material from your
     * existing key management infrastructure. For more information about
     * importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>. This value is valid only for symmetric CMKs.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates
     * the CMK in an AWS KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and creates its key material in the associated AWS
     * CloudHSM cluster. You must also use the <code>CustomKeyStoreId</code>
     * parameter to identify the custom key store. This value is valid only for
     * symmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the CMK. You cannot change
     *            the origin after you create the CMK. The default is
     *            <code>AWS_KMS</code>, which means AWS KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            When the parameter value is <code>EXTERNAL</code>, AWS KMS
     *            creates a CMK without key material so that you can import key
     *            material from your existing key management infrastructure. For
     *            more information about importing key material into AWS KMS,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>. This value is valid only for
     *            symmetric CMKs.
     *            </p>
     *            <p>
     *            When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS
     *            creates the CMK in an AWS KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and creates its key material in the
     *            associated AWS CloudHSM cluster. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public CreateKeyRequest withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * <p>
     * The source of the key material for the CMK. You cannot change the origin
     * after you create the CMK. The default is <code>AWS_KMS</code>, which
     * means AWS KMS creates the key material.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK
     * without key material so that you can import key material from your
     * existing key management infrastructure. For more information about
     * importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>. This value is valid only for symmetric CMKs.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates
     * the CMK in an AWS KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and creates its key material in the associated AWS
     * CloudHSM cluster. You must also use the <code>CustomKeyStoreId</code>
     * parameter to identify the custom key store. This value is valid only for
     * symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the CMK. You cannot change
     *            the origin after you create the CMK. The default is
     *            <code>AWS_KMS</code>, which means AWS KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            When the parameter value is <code>EXTERNAL</code>, AWS KMS
     *            creates a CMK without key material so that you can import key
     *            material from your existing key management infrastructure. For
     *            more information about importing key material into AWS KMS,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>. This value is valid only for
     *            symmetric CMKs.
     *            </p>
     *            <p>
     *            When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS
     *            creates the CMK in an AWS KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and creates its key material in the
     *            associated AWS CloudHSM cluster. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric CMKs.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(OriginType origin) {
        this.origin = origin.toString();
    }

    /**
     * <p>
     * The source of the key material for the CMK. You cannot change the origin
     * after you create the CMK. The default is <code>AWS_KMS</code>, which
     * means AWS KMS creates the key material.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK
     * without key material so that you can import key material from your
     * existing key management infrastructure. For more information about
     * importing key material into AWS KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>AWS Key Management Service
     * Developer Guide</i>. This value is valid only for symmetric CMKs.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates
     * the CMK in an AWS KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and creates its key material in the associated AWS
     * CloudHSM cluster. You must also use the <code>CustomKeyStoreId</code>
     * parameter to identify the custom key store. This value is valid only for
     * symmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the CMK. You cannot change
     *            the origin after you create the CMK. The default is
     *            <code>AWS_KMS</code>, which means AWS KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            When the parameter value is <code>EXTERNAL</code>, AWS KMS
     *            creates a CMK without key material so that you can import key
     *            material from your existing key management infrastructure. For
     *            more information about importing key material into AWS KMS,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>. This value is valid only for
     *            symmetric CMKs.
     *            </p>
     *            <p>
     *            When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS
     *            creates the CMK in an AWS KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and creates its key material in the
     *            associated AWS CloudHSM cluster. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginType
     */
    public CreateKeyRequest withOrigin(OriginType origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * Creates the CMK in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated AWS CloudHSM
     * cluster. To create a CMK in a custom key store, you must also specify the
     * <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>.
     * The AWS CloudHSM cluster that is associated with the custom key store
     * must have at least two active HSMs, each in a different Availability Zone
     * in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric CMKs. You cannot create an
     * asymmetric CMK in a custom key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS
     * CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Creates the CMK in the specified <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a> and the key material in its associated AWS
     *         CloudHSM cluster. To create a CMK in a custom key store, you must
     *         also specify the <code>Origin</code> parameter with a value of
     *         <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster that is
     *         associated with the custom key store must have at least two
     *         active HSMs, each in a different Availability Zone in the Region.
     *         </p>
     *         <p>
     *         This parameter is valid only for symmetric CMKs. You cannot
     *         create an asymmetric CMK in a custom key store.
     *         </p>
     *         <p>
     *         To find the ID of a custom key store, use the
     *         <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     *         <p>
     *         The response includes the custom key store ID and the ID of the
     *         AWS CloudHSM cluster.
     *         </p>
     *         <p>
     *         This operation is part of the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >Custom Key Store feature</a> feature in AWS KMS, which combines
     *         the convenience and extensive integration of AWS KMS with the
     *         isolation and control of a single-tenant key store.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Creates the CMK in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated AWS CloudHSM
     * cluster. To create a CMK in a custom key store, you must also specify the
     * <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>.
     * The AWS CloudHSM cluster that is associated with the custom key store
     * must have at least two active HSMs, each in a different Availability Zone
     * in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric CMKs. You cannot create an
     * asymmetric CMK in a custom key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS
     * CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Creates the CMK in the specified <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and the key material in its associated
     *            AWS CloudHSM cluster. To create a CMK in a custom key store,
     *            you must also specify the <code>Origin</code> parameter with a
     *            value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster
     *            that is associated with the custom key store must have at
     *            least two active HSMs, each in a different Availability Zone
     *            in the Region.
     *            </p>
     *            <p>
     *            This parameter is valid only for symmetric CMKs. You cannot
     *            create an asymmetric CMK in a custom key store.
     *            </p>
     *            <p>
     *            To find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     *            <p>
     *            The response includes the custom key store ID and the ID of
     *            the AWS CloudHSM cluster.
     *            </p>
     *            <p>
     *            This operation is part of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >Custom Key Store feature</a> feature in AWS KMS, which
     *            combines the convenience and extensive integration of AWS KMS
     *            with the isolation and control of a single-tenant key store.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Creates the CMK in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated AWS CloudHSM
     * cluster. To create a CMK in a custom key store, you must also specify the
     * <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>.
     * The AWS CloudHSM cluster that is associated with the custom key store
     * must have at least two active HSMs, each in a different Availability Zone
     * in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric CMKs. You cannot create an
     * asymmetric CMK in a custom key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS
     * CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >Custom Key Store feature</a> feature in AWS KMS, which combines the
     * convenience and extensive integration of AWS KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Creates the CMK in the specified <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and the key material in its associated
     *            AWS CloudHSM cluster. To create a CMK in a custom key store,
     *            you must also specify the <code>Origin</code> parameter with a
     *            value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster
     *            that is associated with the custom key store must have at
     *            least two active HSMs, each in a different Availability Zone
     *            in the Region.
     *            </p>
     *            <p>
     *            This parameter is valid only for symmetric CMKs. You cannot
     *            create an asymmetric CMK in a custom key store.
     *            </p>
     *            <p>
     *            To find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     *            <p>
     *            The response includes the custom key store ID and the ID of
     *            the AWS CloudHSM cluster.
     *            </p>
     *            <p>
     *            This operation is part of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >Custom Key Store feature</a> feature in AWS KMS, which
     *            combines the convenience and extensive integration of AWS KMS
     *            with the isolation and control of a single-tenant key store.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
        return this;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     *
     * @return <p>
     *         A flag to indicate whether to bypass the key policy lockout
     *         safety check.
     *         </p>
     *         <important>
     *         <p>
     *         Setting this value to true increases the risk that the CMK
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i> <i>AWS Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request
     *         and you intend to prevent the principal that is making the
     *         request from making a subsequent <a>PutKeyPolicy</a> request on
     *         the CMK.
     *         </p>
     *         <p>
     *         The default value is false.
     *         </p>
     */
    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     *
     * @return <p>
     *         A flag to indicate whether to bypass the key policy lockout
     *         safety check.
     *         </p>
     *         <important>
     *         <p>
     *         Setting this value to true increases the risk that the CMK
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i> <i>AWS Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request
     *         and you intend to prevent the principal that is making the
     *         request from making a subsequent <a>PutKeyPolicy</a> request on
     *         the CMK.
     *         </p>
     *         <p>
     *         The default value is false.
     *         </p>
     */
    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            A flag to indicate whether to bypass the key policy lockout
     *            safety check.
     *            </p>
     *            <important>
     *            <p>
     *            Setting this value to true increases the risk that the CMK
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i> <i>AWS Key
     *            Management Service Developer Guide</i> </i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you include a policy in the
     *            request and you intend to prevent the principal that is making
     *            the request from making a subsequent <a>PutKeyPolicy</a>
     *            request on the CMK.
     *            </p>
     *            <p>
     *            The default value is false.
     *            </p>
     */
    public void setBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the CMK becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>AWS Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            A flag to indicate whether to bypass the key policy lockout
     *            safety check.
     *            </p>
     *            <important>
     *            <p>
     *            Setting this value to true increases the risk that the CMK
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i> <i>AWS Key
     *            Management Service Developer Guide</i> </i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you include a policy in the
     *            request and you intend to prevent the principal that is making
     *            the request from making a subsequent <a>PutKeyPolicy</a>
     *            request on the CMK.
     *            </p>
     *            <p>
     *            The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withBypassPolicyLockoutSafetyCheck(
            Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        return this;
    }

    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Both
     * the tag key and the tag value are required, but the tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * When you add tags to an AWS resource, AWS generates a cost allocation
     * report with usage and costs aggregated by tags. For information about
     * adding, changing, deleting and listing tags for CMKs, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. To add tags to an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     *
     * @return <p>
     *         One or more tags. Each tag consists of a tag key and a tag value.
     *         Both the tag key and the tag value are required, but the tag
     *         value can be an empty (null) string.
     *         </p>
     *         <p>
     *         When you add tags to an AWS resource, AWS generates a cost
     *         allocation report with usage and costs aggregated by tags. For
     *         information about adding, changing, deleting and listing tags for
     *         CMKs, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *         >Tagging Keys</a>.
     *         </p>
     *         <p>
     *         Use this parameter to tag the CMK when it is created. To add tags
     *         to an existing CMK, use the <a>TagResource</a> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Both
     * the tag key and the tag value are required, but the tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * When you add tags to an AWS resource, AWS generates a cost allocation
     * report with usage and costs aggregated by tags. For information about
     * adding, changing, deleting and listing tags for CMKs, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. To add tags to an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     *
     * @param tags <p>
     *            One or more tags. Each tag consists of a tag key and a tag
     *            value. Both the tag key and the tag value are required, but
     *            the tag value can be an empty (null) string.
     *            </p>
     *            <p>
     *            When you add tags to an AWS resource, AWS generates a cost
     *            allocation report with usage and costs aggregated by tags. For
     *            information about adding, changing, deleting and listing tags
     *            for CMKs, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
     *            </p>
     *            <p>
     *            Use this parameter to tag the CMK when it is created. To add
     *            tags to an existing CMK, use the <a>TagResource</a> operation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Both
     * the tag key and the tag value are required, but the tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * When you add tags to an AWS resource, AWS generates a cost allocation
     * report with usage and costs aggregated by tags. For information about
     * adding, changing, deleting and listing tags for CMKs, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. To add tags to an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags. Each tag consists of a tag key and a tag
     *            value. Both the tag key and the tag value are required, but
     *            the tag value can be an empty (null) string.
     *            </p>
     *            <p>
     *            When you add tags to an AWS resource, AWS generates a cost
     *            allocation report with usage and costs aggregated by tags. For
     *            information about adding, changing, deleting and listing tags
     *            for CMKs, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
     *            </p>
     *            <p>
     *            Use this parameter to tag the CMK when it is created. To add
     *            tags to an existing CMK, use the <a>TagResource</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Both
     * the tag key and the tag value are required, but the tag value can be an
     * empty (null) string.
     * </p>
     * <p>
     * When you add tags to an AWS resource, AWS generates a cost allocation
     * report with usage and costs aggregated by tags. For information about
     * adding, changing, deleting and listing tags for CMKs, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. To add tags to an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags. Each tag consists of a tag key and a tag
     *            value. Both the tag key and the tag value are required, but
     *            the tag value can be an empty (null) string.
     *            </p>
     *            <p>
     *            When you add tags to an AWS resource, AWS generates a cost
     *            allocation report with usage and costs aggregated by tags. For
     *            information about adding, changing, deleting and listing tags
     *            for CMKs, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
     *            </p>
     *            <p>
     *            Use this parameter to tag the CMK when it is created. To add
     *            tags to an existing CMK, use the <a>TagResource</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: " + getKeyUsage() + ",");
        if (getCustomerMasterKeySpec() != null)
            sb.append("CustomerMasterKeySpec: " + getCustomerMasterKeySpec() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin() + ",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId() + ",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck()
                    + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerMasterKeySpec() == null) ? 0 : getCustomerMasterKeySpec().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime
                * hashCode
                + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0
                        : getBypassPolicyLockoutSafetyCheck().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyRequest == false)
            return false;
        CreateKeyRequest other = (CreateKeyRequest) obj;

        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getCustomerMasterKeySpec() == null ^ this.getCustomerMasterKeySpec() == null)
            return false;
        if (other.getCustomerMasterKeySpec() != null
                && other.getCustomerMasterKeySpec().equals(this.getCustomerMasterKeySpec()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() == null
                ^ this.getBypassPolicyLockoutSafetyCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() != null
                && other.getBypassPolicyLockoutSafetyCheck().equals(
                        this.getBypassPolicyLockoutSafetyCheck()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
