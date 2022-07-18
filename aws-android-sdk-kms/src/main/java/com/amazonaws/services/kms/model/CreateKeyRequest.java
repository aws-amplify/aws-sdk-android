/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms-keys"
 * >KMS key</a> in your Amazon Web Services account and Region.
 * </p>
 * <p>
 * In addition to the required parameters, you can use the optional parameters
 * to specify a key policy, description, tags, and other useful elements for any
 * key type.
 * </p>
 * <note>
 * <p>
 * KMS is replacing the term <i>customer master key (CMK)</i> with <i>KMS
 * key</i> and <i>KMS key</i>. The concept has not changed. To prevent breaking
 * changes, KMS is keeping some variations of this term.
 * </p>
 * </note>
 * <p>
 * To create different types of KMS keys, use the following guidance:
 * </p>
 * <dl>
 * <dt>Symmetric encryption KMS key</dt>
 * <dd>
 * <p>
 * To create a symmetric encryption KMS key, you aren't required to specify any
 * parameters. The default value for <code>KeySpec</code>,
 * <code>SYMMETRIC_DEFAULT</code>, and the default value for
 * <code>KeyUsage</code>, <code>ENCRYPT_DECRYPT</code>, create a symmetric
 * encryption KMS key. For technical details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-symmetric-default"
 * > SYMMETRIC_DEFAULT key spec</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * If you need a key for basic encryption and decryption or you are creating a
 * KMS key to protect your resources in an Amazon Web Services service, create a
 * symmetric encryption KMS key. The key material in a symmetric encryption key
 * never leaves KMS unencrypted. You can use a symmetric encryption KMS key to
 * encrypt and decrypt data up to 4,096 bytes, but they are typically used to
 * generate data keys and data keys pairs. For details, see
 * <a>GenerateDataKey</a> and <a>GenerateDataKeyPair</a>.
 * </p>
 * <p>
 * </p></dd>
 * <dt>Asymmetric KMS keys</dt>
 * <dd>
 * <p>
 * To create an asymmetric KMS key, use the <code>KeySpec</code> parameter to
 * specify the type of key material in the KMS key. Then, use the
 * <code>KeyUsage</code> parameter to determine whether the KMS key will be used
 * to encrypt and decrypt or sign and verify. You can't change these properties
 * after the KMS key is created.
 * </p>
 * <p>
 * Asymmetric KMS keys contain an RSA key pair, Elliptic Curve (ECC) key pair,
 * or an SM2 key pair (China Regions only). The private key in an asymmetric KMS
 * key never leaves KMS unencrypted. However, you can use the
 * <a>GetPublicKey</a> operation to download the public key so it can be used
 * outside of KMS. KMS keys with RSA or SM2 key pairs can be used to encrypt or
 * decrypt data or sign and verify messages (but not both). KMS keys with ECC
 * key pairs can be used only to sign and verify messages. For information about
 * asymmetric KMS keys, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
 * >Asymmetric KMS keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * </p></dd>
 * <dt>HMAC KMS key</dt>
 * <dd>
 * <p>
 * To create an HMAC KMS key, set the <code>KeySpec</code> parameter to a key
 * spec value for HMAC KMS keys. Then set the <code>KeyUsage</code> parameter to
 * <code>GENERATE_VERIFY_MAC</code>. You must set the key usage even though
 * <code>GENERATE_VERIFY_MAC</code> is the only valid key usage value for HMAC
 * KMS keys. You can't change these properties after the KMS key is created.
 * </p>
 * <p>
 * HMAC KMS keys are symmetric keys that never leave KMS unencrypted. You can
 * use HMAC keys to generate (<a>GenerateMac</a>) and verify (<a>VerifyMac</a>)
 * HMAC codes for messages up to 4096 bytes.
 * </p>
 * <p>
 * HMAC KMS keys are not supported in all Amazon Web Services Regions. If you
 * try to create an HMAC KMS key in an Amazon Web Services Region in which HMAC
 * keys are not supported, the <code>CreateKey</code> operation returns an
 * <code>UnsupportedOperationException</code>. For a list of Regions in which
 * HMAC KMS keys are supported, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC
 * keys in KMS</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * </p></dd>
 * <dt>Multi-Region primary keys</dt>
 * <dt>Imported key material</dt>
 * <dd>
 * <p>
 * To create a multi-Region <i>primary key</i> in the local Amazon Web Services
 * Region, use the <code>MultiRegion</code> parameter with a value of
 * <code>True</code>. To create a multi-Region <i>replica key</i>, that is, a
 * KMS key with the same key ID and key material as a primary key, but in a
 * different Amazon Web Services Region, use the <a>ReplicateKey</a> operation.
 * To change a replica key to a primary key, and its primary key to a replica
 * key, use the <a>UpdatePrimaryRegion</a> operation.
 * </p>
 * <p>
 * You can create multi-Region KMS keys for all supported KMS key types:
 * symmetric encryption KMS keys, HMAC KMS keys, asymmetric encryption KMS keys,
 * and asymmetric signing KMS keys. You can also create multi-Region keys with
 * imported key material. However, you can't create multi-Region keys in a
 * custom key store.
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
 * >Multi-Region keys in KMS</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * </p></dd>
 * <dd>
 * <p>
 * To import your own key material, begin by creating a symmetric encryption KMS
 * key with no key material. To do this, use the <code>Origin</code> parameter
 * of <code>CreateKey</code> with a value of <code>EXTERNAL</code>. Next, use
 * <a>GetParametersForImport</a> operation to get a public key and import token,
 * and use the public key to encrypt your key material. Then, use
 * <a>ImportKeyMaterial</a> with your import token to import the key material.
 * For step-by-step instructions, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
 * >Importing Key Material</a> in the <i> <i>Key Management Service Developer
 * Guide</i> </i>.
 * </p>
 * <p>
 * This feature supports only symmetric encryption KMS keys, including
 * multi-Region symmetric encryption KMS keys. You cannot import key material
 * into any other type of KMS key.
 * </p>
 * <p>
 * To create a multi-Region primary key with imported key material, use the
 * <code>Origin</code> parameter of <code>CreateKey</code> with a value of
 * <code>EXTERNAL</code> and the <code>MultiRegion</code> parameter with a value
 * of <code>True</code>. To create replicas of the multi-Region primary key, use
 * the <a>ReplicateKey</a> operation. For more information about multi-Region
 * keys, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
 * >Multi-Region keys in KMS</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * </p></dd>
 * <dt>Custom key store</dt>
 * <dd>
 * <p>
 * To create a symmetric encryption KMS key in a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key store</a>, use the <code>CustomKeyStoreId</code> parameter to
 * specify the custom key store. You must also use the <code>Origin</code>
 * parameter with a value of <code>AWS_CLOUDHSM</code>. The CloudHSM cluster
 * that is associated with the custom key store must have at least two active
 * HSMs in different Availability Zones in the Amazon Web Services Region.
 * </p>
 * <p>
 * Custom key stores support only symmetric encryption KMS keys. You cannot
 * create an HMAC KMS key or an asymmetric KMS key in a custom key store. For
 * information about custom key stores in KMS see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >Custom key stores in KMS</a> in the <i> <i>Key Management Service Developer
 * Guide</i> </i>.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * <b>Cross-account use</b>: No. You cannot use this operation to create a KMS
 * key in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:CreateKey</a> (IAM policy). To use the <code>Tags</code> parameter, <a
 * href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:TagResource</a> (IAM policy). For examples and information about related
 * permissions, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/iam-policies.html#iam-policy-example-create-key"
 * >Allow a user to create KMS keys</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListKeys</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ScheduleKeyDeletion</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The key policy to attach to the KMS key. If you do not specify a key
     * policy, KMS attaches a default key policy to the KMS key. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to
     * <code>True</code>, the key policy must allow the principal that is making
     * the <code>CreateKey</code> request to make a subsequent
     * <a>PutKeyPolicy</a> request on the KMS key. This reduces the risk that
     * the KMS key becomes unmanageable. For more information, refer to the
     * scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>. For help writing and formatting a JSON policy document, see
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is
     * appropriate for a task. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use
     * <a>UpdateKeyDescription</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * Determines the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key. The
     * default value is <code>ENCRYPT_DECRYPT</code>. This parameter is optional
     * when you are creating a symmetric encryption KMS key; otherwise, it is
     * required. You can't change the <code>KeyUsage</code> value after the KMS
     * key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only),
     * specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT, GENERATE_VERIFY_MAC
     */
    private String keyUsage;

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     * parameters work the same way. Only the names differ. We recommend that
     * you use <code>KeySpec</code> parameter in your code. However, to avoid
     * breaking changes, KMS will support both parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     */
    private String customerMasterKeySpec;

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a 256-bit AES-GCM
     * key that is used for encryption and decryption, except in China Regions,
     * where it creates a 128-bit symmetric key that uses SM4 encryption. For
     * help choosing a key spec for your KMS key, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     * >Choosing a KMS key type</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a
     * symmetric key or an asymmetric key pair. It also determines the
     * cryptographic algorithms that the KMS key supports. You can't change the
     * <code>KeySpec</code> after the KMS key is created. To further restrict
     * the algorithms that can be used with the KMS key, use a condition key in
     * its key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">
     * Amazon Web Services services that are integrated with KMS</a> use
     * symmetric encryption KMS keys to protect your data. These services do not
     * support asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
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
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     */
    private String keySpec;

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the
     * origin after you create the KMS key. The default is <code>AWS_KMS</code>,
     * which means that KMS creates the key material.
     * </p>
     * <p>
     * To create a KMS key with no key material (for imported key material), set
     * the value to <code>EXTERNAL</code>. For more information about importing
     * key material into KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>Key Management Service Developer
     * Guide</i>. This value is valid only for symmetric encryption KMS keys.
     * </p>
     * <p>
     * To create a KMS key in an KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and create its key material in the associated
     * CloudHSM cluster, set this value to <code>AWS_CLOUDHSM</code>. You must
     * also use the <code>CustomKeyStoreId</code> parameter to identify the
     * custom key store. This value is valid only for symmetric encryption KMS
     * keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     */
    private String origin;

    /**
     * <p>
     * Creates the KMS key in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated CloudHSM
     * cluster. To create a KMS key in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of
     * <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that is associated with
     * the custom key store must have at least two active HSMs, each in a
     * different Availability Zone in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a
     * single Region. You cannot create any other type of KMS key in a custom
     * key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the CloudHSM
     * cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store feature</a> feature in KMS, which combines the
     * convenience and extensive integration of KMS with the isolation and
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the KMS key.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * Assigns one or more tags to the KMS key. Use this parameter to tag the
     * KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >ABAC in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other
     * Amazon Web Services Regions. You cannot change this value after you
     * create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a
     * single-Region KMS key, omit this parameter or set it to
     * <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that
     * lets you create multiple interoperable KMS keys in different Amazon Web
     * Services Regions. Because these KMS keys have the same key ID, key
     * material, and other metadata, you can use them interchangeably to encrypt
     * data in one Amazon Web Services Region and decrypt it in a different
     * Amazon Web Services Region without re-encrypting the data or making a
     * cross-Region call. For more information about multi-Region keys, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Multi-Region keys in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a
     * <i>replica key</i>, use the <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a multi-Region version of a symmetric encryption KMS key,
     * an HMAC KMS key, an asymmetric KMS key, or a KMS key with imported key
     * material. However, you cannot create a multi-Region key in a custom key
     * store.
     * </p>
     */
    private Boolean multiRegion;

    /**
     * <p>
     * The key policy to attach to the KMS key. If you do not specify a key
     * policy, KMS attaches a default key policy to the KMS key. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to
     * <code>True</code>, the key policy must allow the principal that is making
     * the <code>CreateKey</code> request to make a subsequent
     * <a>PutKeyPolicy</a> request on the KMS key. This reduces the risk that
     * the KMS key becomes unmanageable. For more information, refer to the
     * scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>. For help writing and formatting a JSON policy document, see
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The key policy to attach to the KMS key. If you do not specify a
     *         key policy, KMS attaches a default key policy to the KMS key. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *         >Default key policy</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you provide a key policy, it must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to
     *         <code>True</code>, the key policy must allow the principal that
     *         is making the <code>CreateKey</code> request to make a subsequent
     *         <a>PutKeyPolicy</a> request on the KMS key. This reduces the risk
     *         that the KMS key becomes unmanageable. For more information,
     *         refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section of the <i> <i>Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more
     *         principals. The principals in the key policy must exist and be
     *         visible to KMS. When you create a new Amazon Web Services
     *         principal (for example, an IAM user or role), you might need to
     *         enforce a delay before including the new principal in a key
     *         policy because the new principal might not be immediately visible
     *         to KMS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in
     *         the <i>Amazon Web Services Identity and Access Management User
     *         Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A key policy document can include only the following characters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Printable ASCII characters from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character
     *         range.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Printable characters in the Basic Latin and Latin-1 Supplement
     *         character set (through <code>\u00FF</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The tab (<code>\u0009</code>), line feed (<code>\u000A</code>),
     *         and carriage return (<code>\u000D</code>) special characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about key policies, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *         >Key policies in KMS</a> in the <i>Key Management Service
     *         Developer Guide</i>. For help writing and formatting a JSON
     *         policy document, see the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *         >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     *         Management User Guide</i> </i>.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key. If you do not specify a key
     * policy, KMS attaches a default key policy to the KMS key. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to
     * <code>True</code>, the key policy must allow the principal that is making
     * the <code>CreateKey</code> request to make a subsequent
     * <a>PutKeyPolicy</a> request on the KMS key. This reduces the risk that
     * the KMS key becomes unmanageable. For more information, refer to the
     * scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>. For help writing and formatting a JSON policy document, see
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the KMS key. If you do not specify
     *            a key policy, KMS attaches a default key policy to the KMS
     *            key. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >Default key policy</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you provide a key policy, it must meet the following
     *            criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to <code>True</code>, the key policy must allow the principal
     *            that is making the <code>CreateKey</code> request to make a
     *            subsequent <a>PutKeyPolicy</a> request on the KMS key. This
     *            reduces the risk that the KMS key becomes unmanageable. For
     *            more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section of the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to KMS. When you create a new Amazon Web Services
     *            principal (for example, an IAM user or role), you might need
     *            to enforce a delay before including the new principal in a key
     *            policy because the new principal might not be immediately
     *            visible to KMS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>Amazon Web Services Identity and Access Management User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A key policy document can include only the following
     *            characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Printable ASCII characters from the space character (
     *            <code>\u0020</code>) through the end of the ASCII character
     *            range.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Printable characters in the Basic Latin and Latin-1 Supplement
     *            character set (through <code>\u00FF</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     *            ), and carriage return (<code>\u000D</code>) special
     *            characters
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For information about key policies, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            >Key policies in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>. For help writing and formatting a JSON
     *            policy document, see the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *            >IAM JSON Policy Reference</a> in the <i> <i>Identity and
     *            Access Management User Guide</i> </i>.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key. If you do not specify a key
     * policy, KMS attaches a default key policy to the KMS key. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to
     * <code>True</code>, the key policy must allow the principal that is making
     * the <code>CreateKey</code> request to make a subsequent
     * <a>PutKeyPolicy</a> request on the KMS key. This reduces the risk that
     * the KMS key becomes unmanageable. For more information, refer to the
     * scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal (for example, an IAM user or
     * role), you might need to enforce a delay before including the new
     * principal in a key policy because the new principal might not be
     * immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>. For help writing and formatting a JSON policy document, see
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
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
     *            The key policy to attach to the KMS key. If you do not specify
     *            a key policy, KMS attaches a default key policy to the KMS
     *            key. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default"
     *            >Default key policy</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you provide a key policy, it must meet the following
     *            criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't set <code>BypassPolicyLockoutSafetyCheck</code>
     *            to <code>True</code>, the key policy must allow the principal
     *            that is making the <code>CreateKey</code> request to make a
     *            subsequent <a>PutKeyPolicy</a> request on the KMS key. This
     *            reduces the risk that the KMS key becomes unmanageable. For
     *            more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section of the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to KMS. When you create a new Amazon Web Services
     *            principal (for example, an IAM user or role), you might need
     *            to enforce a delay before including the new principal in a key
     *            policy because the new principal might not be immediately
     *            visible to KMS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>Amazon Web Services Identity and Access Management User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A key policy document can include only the following
     *            characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Printable ASCII characters from the space character (
     *            <code>\u0020</code>) through the end of the ASCII character
     *            range.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Printable characters in the Basic Latin and Latin-1 Supplement
     *            character set (through <code>\u00FF</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     *            ), and carriage return (<code>\u000D</code>) special
     *            characters
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For information about key policies, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            >Key policies in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>. For help writing and formatting a JSON
     *            policy document, see the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *            >IAM JSON Policy Reference</a> in the <i> <i>Identity and
     *            Access Management User Guide</i> </i>.
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
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is
     * appropriate for a task. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use
     * <a>UpdateKeyDescription</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return <p>
     *         A description of the KMS key.
     *         </p>
     *         <p>
     *         Use a description that helps you decide whether the KMS key is
     *         appropriate for a task. The default value is an empty string (no
     *         description).
     *         </p>
     *         <p>
     *         To set or change the description after the key is created, use
     *         <a>UpdateKeyDescription</a>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is
     * appropriate for a task. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use
     * <a>UpdateKeyDescription</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the KMS key.
     *            </p>
     *            <p>
     *            Use a description that helps you decide whether the KMS key is
     *            appropriate for a task. The default value is an empty string
     *            (no description).
     *            </p>
     *            <p>
     *            To set or change the description after the key is created, use
     *            <a>UpdateKeyDescription</a>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is
     * appropriate for a task. The default value is an empty string (no
     * description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use
     * <a>UpdateKeyDescription</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description <p>
     *            A description of the KMS key.
     *            </p>
     *            <p>
     *            Use a description that helps you decide whether the KMS key is
     *            appropriate for a task. The default value is an empty string
     *            (no description).
     *            </p>
     *            <p>
     *            To set or change the description after the key is created, use
     *            <a>UpdateKeyDescription</a>.
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
     * Determines the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key. The
     * default value is <code>ENCRYPT_DECRYPT</code>. This parameter is optional
     * when you are creating a symmetric encryption KMS key; otherwise, it is
     * required. You can't change the <code>KeyUsage</code> value after the KMS
     * key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only),
     * specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT, GENERATE_VERIFY_MAC
     *
     * @return <p>
     *         Determines the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operations</a> for which you can use the KMS key.
     *         The default value is <code>ENCRYPT_DECRYPT</code>. This parameter
     *         is optional when you are creating a symmetric encryption KMS key;
     *         otherwise, it is required. You can't change the
     *         <code>KeyUsage</code> value after the KMS key is created.
     *         </p>
     *         <p>
     *         Select only one valid value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For symmetric encryption KMS keys, omit the parameter or specify
     *         <code>ENCRYPT_DECRYPT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For HMAC KMS keys (symmetric), specify
     *         <code>GENERATE_VERIFY_MAC</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric KMS keys with RSA key material, specify
     *         <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric KMS keys with ECC key material, specify
     *         <code>SIGN_VERIFY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric KMS keys with SM2 key material (China Regions
     *         only), specify <code>ENCRYPT_DECRYPT</code> or
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
     * Determines the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key. The
     * default value is <code>ENCRYPT_DECRYPT</code>. This parameter is optional
     * when you are creating a symmetric encryption KMS key; otherwise, it is
     * required. You can't change the <code>KeyUsage</code> value after the KMS
     * key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only),
     * specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT, GENERATE_VERIFY_MAC
     *
     * @param keyUsage <p>
     *            Determines the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     *            parameter is optional when you are creating a symmetric
     *            encryption KMS key; otherwise, it is required. You can't
     *            change the <code>KeyUsage</code> value after the KMS key is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric encryption KMS keys, omit the parameter or
     *            specify <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For HMAC KMS keys (symmetric), specify
     *            <code>GENERATE_VERIFY_MAC</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with SM2 key material (China Regions
     *            only), specify <code>ENCRYPT_DECRYPT</code> or
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
     * Determines the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key. The
     * default value is <code>ENCRYPT_DECRYPT</code>. This parameter is optional
     * when you are creating a symmetric encryption KMS key; otherwise, it is
     * required. You can't change the <code>KeyUsage</code> value after the KMS
     * key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only),
     * specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT, GENERATE_VERIFY_MAC
     *
     * @param keyUsage <p>
     *            Determines the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     *            parameter is optional when you are creating a symmetric
     *            encryption KMS key; otherwise, it is required. You can't
     *            change the <code>KeyUsage</code> value after the KMS key is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric encryption KMS keys, omit the parameter or
     *            specify <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For HMAC KMS keys (symmetric), specify
     *            <code>GENERATE_VERIFY_MAC</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with SM2 key material (China Regions
     *            only), specify <code>ENCRYPT_DECRYPT</code> or
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
     * Determines the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key. The
     * default value is <code>ENCRYPT_DECRYPT</code>. This parameter is optional
     * when you are creating a symmetric encryption KMS key; otherwise, it is
     * required. You can't change the <code>KeyUsage</code> value after the KMS
     * key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only),
     * specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT, GENERATE_VERIFY_MAC
     *
     * @param keyUsage <p>
     *            Determines the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     *            parameter is optional when you are creating a symmetric
     *            encryption KMS key; otherwise, it is required. You can't
     *            change the <code>KeyUsage</code> value after the KMS key is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric encryption KMS keys, omit the parameter or
     *            specify <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For HMAC KMS keys (symmetric), specify
     *            <code>GENERATE_VERIFY_MAC</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with SM2 key material (China Regions
     *            only), specify <code>ENCRYPT_DECRYPT</code> or
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
     * Determines the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     * >cryptographic operations</a> for which you can use the KMS key. The
     * default value is <code>ENCRYPT_DECRYPT</code>. This parameter is optional
     * when you are creating a symmetric encryption KMS key; otherwise, it is
     * required. You can't change the <code>KeyUsage</code> value after the KMS
     * key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only),
     * specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN_VERIFY, ENCRYPT_DECRYPT, GENERATE_VERIFY_MAC
     *
     * @param keyUsage <p>
     *            Determines the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *            >cryptographic operations</a> for which you can use the KMS
     *            key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     *            parameter is optional when you are creating a symmetric
     *            encryption KMS key; otherwise, it is required. You can't
     *            change the <code>KeyUsage</code> value after the KMS key is
     *            created.
     *            </p>
     *            <p>
     *            Select only one valid value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For symmetric encryption KMS keys, omit the parameter or
     *            specify <code>ENCRYPT_DECRYPT</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For HMAC KMS keys (symmetric), specify
     *            <code>GENERATE_VERIFY_MAC</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with RSA key material, specify
     *            <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with ECC key material, specify
     *            <code>SIGN_VERIFY</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For asymmetric KMS keys with SM2 key material (China Regions
     *            only), specify <code>ENCRYPT_DECRYPT</code> or
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
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     * parameters work the same way. Only the names differ. We recommend that
     * you use <code>KeySpec</code> parameter in your code. However, to avoid
     * breaking changes, KMS will support both parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @return <p>
     *         Instead, use the <code>KeySpec</code> parameter.
     *         </p>
     *         <p>
     *         The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     *         parameters work the same way. Only the names differ. We recommend
     *         that you use <code>KeySpec</code> parameter in your code.
     *         However, to avoid breaking changes, KMS will support both
     *         parameters.
     *         </p>
     * @see CustomerMasterKeySpec
     */
    public String getCustomerMasterKeySpec() {
        return customerMasterKeySpec;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     * parameters work the same way. Only the names differ. We recommend that
     * you use <code>KeySpec</code> parameter in your code. However, to avoid
     * breaking changes, KMS will support both parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> parameter.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> parameters work the same
     *            way. Only the names differ. We recommend that you use
     *            <code>KeySpec</code> parameter in your code. However, to avoid
     *            breaking changes, KMS will support both parameters.
     *            </p>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     * parameters work the same way. Only the names differ. We recommend that
     * you use <code>KeySpec</code> parameter in your code. However, to avoid
     * breaking changes, KMS will support both parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> parameter.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> parameters work the same
     *            way. Only the names differ. We recommend that you use
     *            <code>KeySpec</code> parameter in your code. However, to avoid
     *            breaking changes, KMS will support both parameters.
     *            </p>
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
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     * parameters work the same way. Only the names differ. We recommend that
     * you use <code>KeySpec</code> parameter in your code. However, to avoid
     * breaking changes, KMS will support both parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> parameter.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> parameters work the same
     *            way. Only the names differ. We recommend that you use
     *            <code>KeySpec</code> parameter in your code. However, to avoid
     *            breaking changes, KMS will support both parameters.
     *            </p>
     * @see CustomerMasterKeySpec
     */
    public void setCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code>
     * parameters work the same way. Only the names differ. We recommend that
     * you use <code>KeySpec</code> parameter in your code. However, to avoid
     * breaking changes, KMS will support both parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param customerMasterKeySpec <p>
     *            Instead, use the <code>KeySpec</code> parameter.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> and
     *            <code>CustomerMasterKeySpec</code> parameters work the same
     *            way. Only the names differ. We recommend that you use
     *            <code>KeySpec</code> parameter in your code. However, to avoid
     *            breaking changes, KMS will support both parameters.
     *            </p>
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
     * Specifies the type of KMS key to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a 256-bit AES-GCM
     * key that is used for encryption and decryption, except in China Regions,
     * where it creates a 128-bit symmetric key that uses SM4 encryption. For
     * help choosing a key spec for your KMS key, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     * >Choosing a KMS key type</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a
     * symmetric key or an asymmetric key pair. It also determines the
     * cryptographic algorithms that the KMS key supports. You can't change the
     * <code>KeySpec</code> after the KMS key is created. To further restrict
     * the algorithms that can be used with the KMS key, use a condition key in
     * its key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">
     * Amazon Web Services services that are integrated with KMS</a> use
     * symmetric encryption KMS keys to protect your data. These services do not
     * support asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
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
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @return <p>
     *         Specifies the type of KMS key to create. The default value,
     *         <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a 256-bit
     *         AES-GCM key that is used for encryption and decryption, except in
     *         China Regions, where it creates a 128-bit symmetric key that uses
     *         SM4 encryption. For help choosing a key spec for your KMS key,
     *         see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     *         >Choosing a KMS key type</a> in the <i> <i>Key Management Service
     *         Developer Guide</i> </i>.
     *         </p>
     *         <p>
     *         The <code>KeySpec</code> determines whether the KMS key contains
     *         a symmetric key or an asymmetric key pair. It also determines the
     *         cryptographic algorithms that the KMS key supports. You can't
     *         change the <code>KeySpec</code> after the KMS key is created. To
     *         further restrict the algorithms that can be used with the KMS
     *         key, use a condition key in its key policy or IAM policy. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *         >kms:EncryptionAlgorithm</a>, <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *         >kms:MacAlgorithm</a> or <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *         >kms:Signing Algorithm</a> in the <i> <i>Key Management Service
     *         Developer Guide</i> </i>.
     *         </p>
     *         <important>
     *         <p>
     *         <a href=
     *         "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *         >Amazon Web Services services that are integrated with KMS</a>
     *         use symmetric encryption KMS keys to protect your data. These
     *         services do not support asymmetric KMS keys or HMAC KMS keys.
     *         </p>
     *         </important>
     *         <p>
     *         KMS supports the following key specs for KMS keys:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Symmetric encryption key (default)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SYMMETRIC_DEFAULT</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         HMAC keys (symmetric)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HMAC_224</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HMAC_256</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HMAC_384</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HMAC_512</code>
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
     *         <li>
     *         <p>
     *         SM2 key pairs (China Regions only)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SM2</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     * @see KeySpec
     */
    public String getKeySpec() {
        return keySpec;
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a 256-bit AES-GCM
     * key that is used for encryption and decryption, except in China Regions,
     * where it creates a 128-bit symmetric key that uses SM4 encryption. For
     * help choosing a key spec for your KMS key, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     * >Choosing a KMS key type</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a
     * symmetric key or an asymmetric key pair. It also determines the
     * cryptographic algorithms that the KMS key supports. You can't change the
     * <code>KeySpec</code> after the KMS key is created. To further restrict
     * the algorithms that can be used with the KMS key, use a condition key in
     * its key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">
     * Amazon Web Services services that are integrated with KMS</a> use
     * symmetric encryption KMS keys to protect your data. These services do not
     * support asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
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
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param keySpec <p>
     *            Specifies the type of KMS key to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a
     *            256-bit AES-GCM key that is used for encryption and
     *            decryption, except in China Regions, where it creates a
     *            128-bit symmetric key that uses SM4 encryption. For help
     *            choosing a key spec for your KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     *            >Choosing a KMS key type</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> determines whether the KMS key
     *            contains a symmetric key or an asymmetric key pair. It also
     *            determines the cryptographic algorithms that the KMS key
     *            supports. You can't change the <code>KeySpec</code> after the
     *            KMS key is created. To further restrict the algorithms that
     *            can be used with the KMS key, use a condition key in its key
     *            policy or IAM policy. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *            >kms:MacAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >Amazon Web Services services that are integrated with KMS</a>
     *            use symmetric encryption KMS keys to protect your data. These
     *            services do not support asymmetric KMS keys or HMAC KMS keys.
     *            </p>
     *            </important>
     *            <p>
     *            KMS supports the following key specs for KMS keys:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric encryption key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            HMAC keys (symmetric)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HMAC_224</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_256</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_384</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_512</code>
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
     *            <li>
     *            <p>
     *            SM2 key pairs (China Regions only)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SM2</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see KeySpec
     */
    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a 256-bit AES-GCM
     * key that is used for encryption and decryption, except in China Regions,
     * where it creates a 128-bit symmetric key that uses SM4 encryption. For
     * help choosing a key spec for your KMS key, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     * >Choosing a KMS key type</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a
     * symmetric key or an asymmetric key pair. It also determines the
     * cryptographic algorithms that the KMS key supports. You can't change the
     * <code>KeySpec</code> after the KMS key is created. To further restrict
     * the algorithms that can be used with the KMS key, use a condition key in
     * its key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">
     * Amazon Web Services services that are integrated with KMS</a> use
     * symmetric encryption KMS keys to protect your data. These services do not
     * support asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
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
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
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
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param keySpec <p>
     *            Specifies the type of KMS key to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a
     *            256-bit AES-GCM key that is used for encryption and
     *            decryption, except in China Regions, where it creates a
     *            128-bit symmetric key that uses SM4 encryption. For help
     *            choosing a key spec for your KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     *            >Choosing a KMS key type</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> determines whether the KMS key
     *            contains a symmetric key or an asymmetric key pair. It also
     *            determines the cryptographic algorithms that the KMS key
     *            supports. You can't change the <code>KeySpec</code> after the
     *            KMS key is created. To further restrict the algorithms that
     *            can be used with the KMS key, use a condition key in its key
     *            policy or IAM policy. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *            >kms:MacAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >Amazon Web Services services that are integrated with KMS</a>
     *            use symmetric encryption KMS keys to protect your data. These
     *            services do not support asymmetric KMS keys or HMAC KMS keys.
     *            </p>
     *            </important>
     *            <p>
     *            KMS supports the following key specs for KMS keys:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric encryption key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            HMAC keys (symmetric)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HMAC_224</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_256</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_384</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_512</code>
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
     *            <li>
     *            <p>
     *            SM2 key pairs (China Regions only)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SM2</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeySpec
     */
    public CreateKeyRequest withKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a 256-bit AES-GCM
     * key that is used for encryption and decryption, except in China Regions,
     * where it creates a 128-bit symmetric key that uses SM4 encryption. For
     * help choosing a key spec for your KMS key, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     * >Choosing a KMS key type</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a
     * symmetric key or an asymmetric key pair. It also determines the
     * cryptographic algorithms that the KMS key supports. You can't change the
     * <code>KeySpec</code> after the KMS key is created. To further restrict
     * the algorithms that can be used with the KMS key, use a condition key in
     * its key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">
     * Amazon Web Services services that are integrated with KMS</a> use
     * symmetric encryption KMS keys to protect your data. These services do not
     * support asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
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
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param keySpec <p>
     *            Specifies the type of KMS key to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a
     *            256-bit AES-GCM key that is used for encryption and
     *            decryption, except in China Regions, where it creates a
     *            128-bit symmetric key that uses SM4 encryption. For help
     *            choosing a key spec for your KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     *            >Choosing a KMS key type</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> determines whether the KMS key
     *            contains a symmetric key or an asymmetric key pair. It also
     *            determines the cryptographic algorithms that the KMS key
     *            supports. You can't change the <code>KeySpec</code> after the
     *            KMS key is created. To further restrict the algorithms that
     *            can be used with the KMS key, use a condition key in its key
     *            policy or IAM policy. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *            >kms:MacAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >Amazon Web Services services that are integrated with KMS</a>
     *            use symmetric encryption KMS keys to protect your data. These
     *            services do not support asymmetric KMS keys or HMAC KMS keys.
     *            </p>
     *            </important>
     *            <p>
     *            KMS supports the following key specs for KMS keys:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric encryption key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            HMAC keys (symmetric)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HMAC_224</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_256</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_384</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_512</code>
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
     *            <li>
     *            <p>
     *            SM2 key pairs (China Regions only)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SM2</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see KeySpec
     */
    public void setKeySpec(KeySpec keySpec) {
        this.keySpec = keySpec.toString();
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a 256-bit AES-GCM
     * key that is used for encryption and decryption, except in China Regions,
     * where it creates a 128-bit symmetric key that uses SM4 encryption. For
     * help choosing a key spec for your KMS key, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     * >Choosing a KMS key type</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a
     * symmetric key or an asymmetric key pair. It also determines the
     * cryptographic algorithms that the KMS key supports. You can't change the
     * <code>KeySpec</code> after the KMS key is created. To further restrict
     * the algorithms that can be used with the KMS key, use a condition key in
     * its key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer
     * Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">
     * Amazon Web Services services that are integrated with KMS</a> use
     * symmetric encryption KMS keys to protect your data. These services do not
     * support asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
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
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
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
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SYMMETRIC_DEFAULT,
     * HMAC_224, HMAC_256, HMAC_384, HMAC_512, SM2
     *
     * @param keySpec <p>
     *            Specifies the type of KMS key to create. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, creates a KMS key with a
     *            256-bit AES-GCM key that is used for encryption and
     *            decryption, except in China Regions, where it creates a
     *            128-bit symmetric key that uses SM4 encryption. For help
     *            choosing a key spec for your KMS key, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose"
     *            >Choosing a KMS key type</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            The <code>KeySpec</code> determines whether the KMS key
     *            contains a symmetric key or an asymmetric key pair. It also
     *            determines the cryptographic algorithms that the KMS key
     *            supports. You can't change the <code>KeySpec</code> after the
     *            KMS key is created. To further restrict the algorithms that
     *            can be used with the KMS key, use a condition key in its key
     *            policy or IAM policy. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *            >kms:EncryptionAlgorithm</a>, <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *            >kms:MacAlgorithm</a> or <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *            >kms:Signing Algorithm</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <important>
     *            <p>
     *            <a href=
     *            "http://aws.amazon.com/kms/features/#AWS_Service_Integration"
     *            >Amazon Web Services services that are integrated with KMS</a>
     *            use symmetric encryption KMS keys to protect your data. These
     *            services do not support asymmetric KMS keys or HMAC KMS keys.
     *            </p>
     *            </important>
     *            <p>
     *            KMS supports the following key specs for KMS keys:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Symmetric encryption key (default)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SYMMETRIC_DEFAULT</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            HMAC keys (symmetric)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HMAC_224</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_256</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_384</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HMAC_512</code>
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
     *            <li>
     *            <p>
     *            SM2 key pairs (China Regions only)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SM2</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeySpec
     */
    public CreateKeyRequest withKeySpec(KeySpec keySpec) {
        this.keySpec = keySpec.toString();
        return this;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the
     * origin after you create the KMS key. The default is <code>AWS_KMS</code>,
     * which means that KMS creates the key material.
     * </p>
     * <p>
     * To create a KMS key with no key material (for imported key material), set
     * the value to <code>EXTERNAL</code>. For more information about importing
     * key material into KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>Key Management Service Developer
     * Guide</i>. This value is valid only for symmetric encryption KMS keys.
     * </p>
     * <p>
     * To create a KMS key in an KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and create its key material in the associated
     * CloudHSM cluster, set this value to <code>AWS_CLOUDHSM</code>. You must
     * also use the <code>CustomKeyStoreId</code> parameter to identify the
     * custom key store. This value is valid only for symmetric encryption KMS
     * keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @return <p>
     *         The source of the key material for the KMS key. You cannot change
     *         the origin after you create the KMS key. The default is
     *         <code>AWS_KMS</code>, which means that KMS creates the key
     *         material.
     *         </p>
     *         <p>
     *         To create a KMS key with no key material (for imported key
     *         material), set the value to <code>EXTERNAL</code>. For more
     *         information about importing key material into KMS, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *         >Importing Key Material</a> in the <i>Key Management Service
     *         Developer Guide</i>. This value is valid only for symmetric
     *         encryption KMS keys.
     *         </p>
     *         <p>
     *         To create a KMS key in an KMS <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a> and create its key material in the
     *         associated CloudHSM cluster, set this value to
     *         <code>AWS_CLOUDHSM</code>. You must also use the
     *         <code>CustomKeyStoreId</code> parameter to identify the custom
     *         key store. This value is valid only for symmetric encryption KMS
     *         keys.
     *         </p>
     * @see OriginType
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the
     * origin after you create the KMS key. The default is <code>AWS_KMS</code>,
     * which means that KMS creates the key material.
     * </p>
     * <p>
     * To create a KMS key with no key material (for imported key material), set
     * the value to <code>EXTERNAL</code>. For more information about importing
     * key material into KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>Key Management Service Developer
     * Guide</i>. This value is valid only for symmetric encryption KMS keys.
     * </p>
     * <p>
     * To create a KMS key in an KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and create its key material in the associated
     * CloudHSM cluster, set this value to <code>AWS_CLOUDHSM</code>. You must
     * also use the <code>CustomKeyStoreId</code> parameter to identify the
     * custom key store. This value is valid only for symmetric encryption KMS
     * keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. You cannot
     *            change the origin after you create the KMS key. The default is
     *            <code>AWS_KMS</code>, which means that KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            To create a KMS key with no key material (for imported key
     *            material), set the value to <code>EXTERNAL</code>. For more
     *            information about importing key material into KMS, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>Key Management Service
     *            Developer Guide</i>. This value is valid only for symmetric
     *            encryption KMS keys.
     *            </p>
     *            <p>
     *            To create a KMS key in an KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and create its key material in the
     *            associated CloudHSM cluster, set this value to
     *            <code>AWS_CLOUDHSM</code>. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric encryption
     *            KMS keys.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the
     * origin after you create the KMS key. The default is <code>AWS_KMS</code>,
     * which means that KMS creates the key material.
     * </p>
     * <p>
     * To create a KMS key with no key material (for imported key material), set
     * the value to <code>EXTERNAL</code>. For more information about importing
     * key material into KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>Key Management Service Developer
     * Guide</i>. This value is valid only for symmetric encryption KMS keys.
     * </p>
     * <p>
     * To create a KMS key in an KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and create its key material in the associated
     * CloudHSM cluster, set this value to <code>AWS_CLOUDHSM</code>. You must
     * also use the <code>CustomKeyStoreId</code> parameter to identify the
     * custom key store. This value is valid only for symmetric encryption KMS
     * keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. You cannot
     *            change the origin after you create the KMS key. The default is
     *            <code>AWS_KMS</code>, which means that KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            To create a KMS key with no key material (for imported key
     *            material), set the value to <code>EXTERNAL</code>. For more
     *            information about importing key material into KMS, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>Key Management Service
     *            Developer Guide</i>. This value is valid only for symmetric
     *            encryption KMS keys.
     *            </p>
     *            <p>
     *            To create a KMS key in an KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and create its key material in the
     *            associated CloudHSM cluster, set this value to
     *            <code>AWS_CLOUDHSM</code>. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric encryption
     *            KMS keys.
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
     * The source of the key material for the KMS key. You cannot change the
     * origin after you create the KMS key. The default is <code>AWS_KMS</code>,
     * which means that KMS creates the key material.
     * </p>
     * <p>
     * To create a KMS key with no key material (for imported key material), set
     * the value to <code>EXTERNAL</code>. For more information about importing
     * key material into KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>Key Management Service Developer
     * Guide</i>. This value is valid only for symmetric encryption KMS keys.
     * </p>
     * <p>
     * To create a KMS key in an KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and create its key material in the associated
     * CloudHSM cluster, set this value to <code>AWS_CLOUDHSM</code>. You must
     * also use the <code>CustomKeyStoreId</code> parameter to identify the
     * custom key store. This value is valid only for symmetric encryption KMS
     * keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. You cannot
     *            change the origin after you create the KMS key. The default is
     *            <code>AWS_KMS</code>, which means that KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            To create a KMS key with no key material (for imported key
     *            material), set the value to <code>EXTERNAL</code>. For more
     *            information about importing key material into KMS, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>Key Management Service
     *            Developer Guide</i>. This value is valid only for symmetric
     *            encryption KMS keys.
     *            </p>
     *            <p>
     *            To create a KMS key in an KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and create its key material in the
     *            associated CloudHSM cluster, set this value to
     *            <code>AWS_CLOUDHSM</code>. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric encryption
     *            KMS keys.
     *            </p>
     * @see OriginType
     */
    public void setOrigin(OriginType origin) {
        this.origin = origin.toString();
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the
     * origin after you create the KMS key. The default is <code>AWS_KMS</code>,
     * which means that KMS creates the key material.
     * </p>
     * <p>
     * To create a KMS key with no key material (for imported key material), set
     * the value to <code>EXTERNAL</code>. For more information about importing
     * key material into KMS, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     * >Importing Key Material</a> in the <i>Key Management Service Developer
     * Guide</i>. This value is valid only for symmetric encryption KMS keys.
     * </p>
     * <p>
     * To create a KMS key in an KMS <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and create its key material in the associated
     * CloudHSM cluster, set this value to <code>AWS_CLOUDHSM</code>. You must
     * also use the <code>CustomKeyStoreId</code> parameter to identify the
     * custom key store. This value is valid only for symmetric encryption KMS
     * keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_KMS, EXTERNAL, AWS_CLOUDHSM
     *
     * @param origin <p>
     *            The source of the key material for the KMS key. You cannot
     *            change the origin after you create the KMS key. The default is
     *            <code>AWS_KMS</code>, which means that KMS creates the key
     *            material.
     *            </p>
     *            <p>
     *            To create a KMS key with no key material (for imported key
     *            material), set the value to <code>EXTERNAL</code>. For more
     *            information about importing key material into KMS, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
     *            >Importing Key Material</a> in the <i>Key Management Service
     *            Developer Guide</i>. This value is valid only for symmetric
     *            encryption KMS keys.
     *            </p>
     *            <p>
     *            To create a KMS key in an KMS <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and create its key material in the
     *            associated CloudHSM cluster, set this value to
     *            <code>AWS_CLOUDHSM</code>. You must also use the
     *            <code>CustomKeyStoreId</code> parameter to identify the custom
     *            key store. This value is valid only for symmetric encryption
     *            KMS keys.
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
     * Creates the KMS key in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated CloudHSM
     * cluster. To create a KMS key in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of
     * <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that is associated with
     * the custom key store must have at least two active HSMs, each in a
     * different Availability Zone in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a
     * single Region. You cannot create any other type of KMS key in a custom
     * key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the CloudHSM
     * cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store feature</a> feature in KMS, which combines the
     * convenience and extensive integration of KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Creates the KMS key in the specified <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store</a> and the key material in its associated
     *         CloudHSM cluster. To create a KMS key in a custom key store, you
     *         must also specify the <code>Origin</code> parameter with a value
     *         of <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that is
     *         associated with the custom key store must have at least two
     *         active HSMs, each in a different Availability Zone in the Region.
     *         </p>
     *         <p>
     *         This parameter is valid only for symmetric encryption KMS keys in
     *         a single Region. You cannot create any other type of KMS key in a
     *         custom key store.
     *         </p>
     *         <p>
     *         To find the ID of a custom key store, use the
     *         <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     *         <p>
     *         The response includes the custom key store ID and the ID of the
     *         CloudHSM cluster.
     *         </p>
     *         <p>
     *         This operation is part of the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *         >custom key store feature</a> feature in KMS, which combines the
     *         convenience and extensive integration of KMS with the isolation
     *         and control of a single-tenant key store.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Creates the KMS key in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated CloudHSM
     * cluster. To create a KMS key in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of
     * <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that is associated with
     * the custom key store must have at least two active HSMs, each in a
     * different Availability Zone in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a
     * single Region. You cannot create any other type of KMS key in a custom
     * key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the CloudHSM
     * cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store feature</a> feature in KMS, which combines the
     * convenience and extensive integration of KMS with the isolation and
     * control of a single-tenant key store.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Creates the KMS key in the specified <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and the key material in its associated
     *            CloudHSM cluster. To create a KMS key in a custom key store,
     *            you must also specify the <code>Origin</code> parameter with a
     *            value of <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that
     *            is associated with the custom key store must have at least two
     *            active HSMs, each in a different Availability Zone in the
     *            Region.
     *            </p>
     *            <p>
     *            This parameter is valid only for symmetric encryption KMS keys
     *            in a single Region. You cannot create any other type of KMS
     *            key in a custom key store.
     *            </p>
     *            <p>
     *            To find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     *            <p>
     *            The response includes the custom key store ID and the ID of
     *            the CloudHSM cluster.
     *            </p>
     *            <p>
     *            This operation is part of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store feature</a> feature in KMS, which combines
     *            the convenience and extensive integration of KMS with the
     *            isolation and control of a single-tenant key store.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Creates the KMS key in the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store</a> and the key material in its associated CloudHSM
     * cluster. To create a KMS key in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of
     * <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that is associated with
     * the custom key store must have at least two active HSMs, each in a
     * different Availability Zone in the Region.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a
     * single Region. You cannot create any other type of KMS key in a custom
     * key store.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the CloudHSM
     * cluster.
     * </p>
     * <p>
     * This operation is part of the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     * >custom key store feature</a> feature in KMS, which combines the
     * convenience and extensive integration of KMS with the isolation and
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
     *            Creates the KMS key in the specified <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store</a> and the key material in its associated
     *            CloudHSM cluster. To create a KMS key in a custom key store,
     *            you must also specify the <code>Origin</code> parameter with a
     *            value of <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that
     *            is associated with the custom key store must have at least two
     *            active HSMs, each in a different Availability Zone in the
     *            Region.
     *            </p>
     *            <p>
     *            This parameter is valid only for symmetric encryption KMS keys
     *            in a single Region. You cannot create any other type of KMS
     *            key in a custom key store.
     *            </p>
     *            <p>
     *            To find the ID of a custom key store, use the
     *            <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     *            <p>
     *            The response includes the custom key store ID and the ID of
     *            the CloudHSM cluster.
     *            </p>
     *            <p>
     *            This operation is part of the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
     *            >custom key store feature</a> feature in KMS, which combines
     *            the convenience and extensive integration of KMS with the
     *            isolation and control of a single-tenant key store.
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the KMS key.
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
     *         Setting this value to true increases the risk that the KMS key
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i> <i>Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request
     *         and you intend to prevent the principal that is making the
     *         request from making a subsequent <a>PutKeyPolicy</a> request on
     *         the KMS key.
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the KMS key.
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
     *         Setting this value to true increases the risk that the KMS key
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i> <i>Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request
     *         and you intend to prevent the principal that is making the
     *         request from making a subsequent <a>PutKeyPolicy</a> request on
     *         the KMS key.
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the KMS key.
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
     *            Setting this value to true increases the risk that the KMS key
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you include a policy in the
     *            request and you intend to prevent the principal that is making
     *            the request from making a subsequent <a>PutKeyPolicy</a>
     *            request on the KMS key.
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
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you
     * intend to prevent the principal that is making the request from making a
     * subsequent <a>PutKeyPolicy</a> request on the KMS key.
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
     *            Setting this value to true increases the risk that the KMS key
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, refer to the scenario in the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *            >Default Key Policy</a> section in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you include a policy in the
     *            request and you intend to prevent the principal that is making
     *            the request from making a subsequent <a>PutKeyPolicy</a>
     *            request on the KMS key.
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
     * Assigns one or more tags to the KMS key. Use this parameter to tag the
     * KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >ABAC in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     *
     * @return <p>
     *         Assigns one or more tags to the KMS key. Use this parameter to
     *         tag the KMS key when it is created. To tag an existing KMS key,
     *         use the <a>TagResource</a> operation.
     *         </p>
     *         <note>
     *         <p>
     *         Tagging or untagging a KMS key can allow or deny permission to
     *         the KMS key. For details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *         >ABAC in KMS</a> in the <i>Key Management Service Developer
     *         Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         To use this parameter, you must have <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *         >kms:TagResource</a> permission in an IAM policy.
     *         </p>
     *         <p>
     *         Each tag consists of a tag key and a tag value. Both the tag key
     *         and the tag value are required, but the tag value can be an empty
     *         (null) string. You cannot have more than one tag on a KMS key
     *         with the same tag key. If you specify an existing tag key with a
     *         different tag value, KMS replaces the current tag value with the
     *         specified one.
     *         </p>
     *         <p>
     *         When you add tags to an Amazon Web Services resource, Amazon Web
     *         Services generates a cost allocation report with usage and costs
     *         aggregated by tags. Tags can also be used to control access to a
     *         KMS key. For details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *         >Tagging Keys</a>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags to the KMS key. Use this parameter to tag the
     * KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >ABAC in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     *
     * @param tags <p>
     *            Assigns one or more tags to the KMS key. Use this parameter to
     *            tag the KMS key when it is created. To tag an existing KMS
     *            key, use the <a>TagResource</a> operation.
     *            </p>
     *            <note>
     *            <p>
     *            Tagging or untagging a KMS key can allow or deny permission to
     *            the KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *            >ABAC in KMS</a> in the <i>Key Management Service Developer
     *            Guide</i>.
     *            </p>
     *            </note>
     *            <p>
     *            To use this parameter, you must have <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >kms:TagResource</a> permission in an IAM policy.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. Both the tag
     *            key and the tag value are required, but the tag value can be
     *            an empty (null) string. You cannot have more than one tag on a
     *            KMS key with the same tag key. If you specify an existing tag
     *            key with a different tag value, KMS replaces the current tag
     *            value with the specified one.
     *            </p>
     *            <p>
     *            When you add tags to an Amazon Web Services resource, Amazon
     *            Web Services generates a cost allocation report with usage and
     *            costs aggregated by tags. Tags can also be used to control
     *            access to a KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
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
     * Assigns one or more tags to the KMS key. Use this parameter to tag the
     * KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >ABAC in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Assigns one or more tags to the KMS key. Use this parameter to
     *            tag the KMS key when it is created. To tag an existing KMS
     *            key, use the <a>TagResource</a> operation.
     *            </p>
     *            <note>
     *            <p>
     *            Tagging or untagging a KMS key can allow or deny permission to
     *            the KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *            >ABAC in KMS</a> in the <i>Key Management Service Developer
     *            Guide</i>.
     *            </p>
     *            </note>
     *            <p>
     *            To use this parameter, you must have <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >kms:TagResource</a> permission in an IAM policy.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. Both the tag
     *            key and the tag value are required, but the tag value can be
     *            an empty (null) string. You cannot have more than one tag on a
     *            KMS key with the same tag key. If you specify an existing tag
     *            key with a different tag value, KMS replaces the current tag
     *            value with the specified one.
     *            </p>
     *            <p>
     *            When you add tags to an Amazon Web Services resource, Amazon
     *            Web Services generates a cost allocation report with usage and
     *            costs aggregated by tags. Tags can also be used to control
     *            access to a KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
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
     * Assigns one or more tags to the KMS key. Use this parameter to tag the
     * KMS key when it is created. To tag an existing KMS key, use the
     * <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS
     * key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     * >ABAC in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the
     * tag value are required, but the tag value can be an empty (null) string.
     * You cannot have more than one tag on a KMS key with the same tag key. If
     * you specify an existing tag key with a different tag value, KMS replaces
     * the current tag value with the specified one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services
     * generates a cost allocation report with usage and costs aggregated by
     * tags. Tags can also be used to control access to a KMS key. For details,
     * see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     * >Tagging Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Assigns one or more tags to the KMS key. Use this parameter to
     *            tag the KMS key when it is created. To tag an existing KMS
     *            key, use the <a>TagResource</a> operation.
     *            </p>
     *            <note>
     *            <p>
     *            Tagging or untagging a KMS key can allow or deny permission to
     *            the KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/abac.html"
     *            >ABAC in KMS</a> in the <i>Key Management Service Developer
     *            Guide</i>.
     *            </p>
     *            </note>
     *            <p>
     *            To use this parameter, you must have <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *            >kms:TagResource</a> permission in an IAM policy.
     *            </p>
     *            <p>
     *            Each tag consists of a tag key and a tag value. Both the tag
     *            key and the tag value are required, but the tag value can be
     *            an empty (null) string. You cannot have more than one tag on a
     *            KMS key with the same tag key. If you specify an existing tag
     *            key with a different tag value, KMS replaces the current tag
     *            value with the specified one.
     *            </p>
     *            <p>
     *            When you add tags to an Amazon Web Services resource, Amazon
     *            Web Services generates a cost allocation report with usage and
     *            costs aggregated by tags. Tags can also be used to control
     *            access to a KMS key. For details, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html"
     *            >Tagging Keys</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other
     * Amazon Web Services Regions. You cannot change this value after you
     * create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a
     * single-Region KMS key, omit this parameter or set it to
     * <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that
     * lets you create multiple interoperable KMS keys in different Amazon Web
     * Services Regions. Because these KMS keys have the same key ID, key
     * material, and other metadata, you can use them interchangeably to encrypt
     * data in one Amazon Web Services Region and decrypt it in a different
     * Amazon Web Services Region without re-encrypting the data or making a
     * cross-Region call. For more information about multi-Region keys, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Multi-Region keys in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a
     * <i>replica key</i>, use the <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a multi-Region version of a symmetric encryption KMS key,
     * an HMAC KMS key, an asymmetric KMS key, or a KMS key with imported key
     * material. However, you cannot create a multi-Region key in a custom key
     * store.
     * </p>
     *
     * @return <p>
     *         Creates a multi-Region primary key that you can replicate into
     *         other Amazon Web Services Regions. You cannot change this value
     *         after you create the KMS key.
     *         </p>
     *         <p>
     *         For a multi-Region key, set this parameter to <code>True</code>.
     *         For a single-Region KMS key, omit this parameter or set it to
     *         <code>False</code>. The default value is <code>False</code>.
     *         </p>
     *         <p>
     *         This operation supports <i>multi-Region keys</i>, an KMS feature
     *         that lets you create multiple interoperable KMS keys in different
     *         Amazon Web Services Regions. Because these KMS keys have the same
     *         key ID, key material, and other metadata, you can use them
     *         interchangeably to encrypt data in one Amazon Web Services Region
     *         and decrypt it in a different Amazon Web Services Region without
     *         re-encrypting the data or making a cross-Region call. For more
     *         information about multi-Region keys, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *         >Multi-Region keys in KMS</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         This value creates a <i>primary key</i>, not a replica. To create
     *         a <i>replica key</i>, use the <a>ReplicateKey</a> operation.
     *         </p>
     *         <p>
     *         You can create a multi-Region version of a symmetric encryption
     *         KMS key, an HMAC KMS key, an asymmetric KMS key, or a KMS key
     *         with imported key material. However, you cannot create a
     *         multi-Region key in a custom key store.
     *         </p>
     */
    public Boolean isMultiRegion() {
        return multiRegion;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other
     * Amazon Web Services Regions. You cannot change this value after you
     * create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a
     * single-Region KMS key, omit this parameter or set it to
     * <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that
     * lets you create multiple interoperable KMS keys in different Amazon Web
     * Services Regions. Because these KMS keys have the same key ID, key
     * material, and other metadata, you can use them interchangeably to encrypt
     * data in one Amazon Web Services Region and decrypt it in a different
     * Amazon Web Services Region without re-encrypting the data or making a
     * cross-Region call. For more information about multi-Region keys, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Multi-Region keys in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a
     * <i>replica key</i>, use the <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a multi-Region version of a symmetric encryption KMS key,
     * an HMAC KMS key, an asymmetric KMS key, or a KMS key with imported key
     * material. However, you cannot create a multi-Region key in a custom key
     * store.
     * </p>
     *
     * @return <p>
     *         Creates a multi-Region primary key that you can replicate into
     *         other Amazon Web Services Regions. You cannot change this value
     *         after you create the KMS key.
     *         </p>
     *         <p>
     *         For a multi-Region key, set this parameter to <code>True</code>.
     *         For a single-Region KMS key, omit this parameter or set it to
     *         <code>False</code>. The default value is <code>False</code>.
     *         </p>
     *         <p>
     *         This operation supports <i>multi-Region keys</i>, an KMS feature
     *         that lets you create multiple interoperable KMS keys in different
     *         Amazon Web Services Regions. Because these KMS keys have the same
     *         key ID, key material, and other metadata, you can use them
     *         interchangeably to encrypt data in one Amazon Web Services Region
     *         and decrypt it in a different Amazon Web Services Region without
     *         re-encrypting the data or making a cross-Region call. For more
     *         information about multi-Region keys, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *         >Multi-Region keys in KMS</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         This value creates a <i>primary key</i>, not a replica. To create
     *         a <i>replica key</i>, use the <a>ReplicateKey</a> operation.
     *         </p>
     *         <p>
     *         You can create a multi-Region version of a symmetric encryption
     *         KMS key, an HMAC KMS key, an asymmetric KMS key, or a KMS key
     *         with imported key material. However, you cannot create a
     *         multi-Region key in a custom key store.
     *         </p>
     */
    public Boolean getMultiRegion() {
        return multiRegion;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other
     * Amazon Web Services Regions. You cannot change this value after you
     * create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a
     * single-Region KMS key, omit this parameter or set it to
     * <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that
     * lets you create multiple interoperable KMS keys in different Amazon Web
     * Services Regions. Because these KMS keys have the same key ID, key
     * material, and other metadata, you can use them interchangeably to encrypt
     * data in one Amazon Web Services Region and decrypt it in a different
     * Amazon Web Services Region without re-encrypting the data or making a
     * cross-Region call. For more information about multi-Region keys, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Multi-Region keys in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a
     * <i>replica key</i>, use the <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a multi-Region version of a symmetric encryption KMS key,
     * an HMAC KMS key, an asymmetric KMS key, or a KMS key with imported key
     * material. However, you cannot create a multi-Region key in a custom key
     * store.
     * </p>
     *
     * @param multiRegion <p>
     *            Creates a multi-Region primary key that you can replicate into
     *            other Amazon Web Services Regions. You cannot change this
     *            value after you create the KMS key.
     *            </p>
     *            <p>
     *            For a multi-Region key, set this parameter to
     *            <code>True</code>. For a single-Region KMS key, omit this
     *            parameter or set it to <code>False</code>. The default value
     *            is <code>False</code>.
     *            </p>
     *            <p>
     *            This operation supports <i>multi-Region keys</i>, an KMS
     *            feature that lets you create multiple interoperable KMS keys
     *            in different Amazon Web Services Regions. Because these KMS
     *            keys have the same key ID, key material, and other metadata,
     *            you can use them interchangeably to encrypt data in one Amazon
     *            Web Services Region and decrypt it in a different Amazon Web
     *            Services Region without re-encrypting the data or making a
     *            cross-Region call. For more information about multi-Region
     *            keys, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *            >Multi-Region keys in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            This value creates a <i>primary key</i>, not a replica. To
     *            create a <i>replica key</i>, use the <a>ReplicateKey</a>
     *            operation.
     *            </p>
     *            <p>
     *            You can create a multi-Region version of a symmetric
     *            encryption KMS key, an HMAC KMS key, an asymmetric KMS key, or
     *            a KMS key with imported key material. However, you cannot
     *            create a multi-Region key in a custom key store.
     *            </p>
     */
    public void setMultiRegion(Boolean multiRegion) {
        this.multiRegion = multiRegion;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other
     * Amazon Web Services Regions. You cannot change this value after you
     * create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a
     * single-Region KMS key, omit this parameter or set it to
     * <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that
     * lets you create multiple interoperable KMS keys in different Amazon Web
     * Services Regions. Because these KMS keys have the same key ID, key
     * material, and other metadata, you can use them interchangeably to encrypt
     * data in one Amazon Web Services Region and decrypt it in a different
     * Amazon Web Services Region without re-encrypting the data or making a
     * cross-Region call. For more information about multi-Region keys, see <a
     * href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     * >Multi-Region keys in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a
     * <i>replica key</i>, use the <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a multi-Region version of a symmetric encryption KMS key,
     * an HMAC KMS key, an asymmetric KMS key, or a KMS key with imported key
     * material. However, you cannot create a multi-Region key in a custom key
     * store.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiRegion <p>
     *            Creates a multi-Region primary key that you can replicate into
     *            other Amazon Web Services Regions. You cannot change this
     *            value after you create the KMS key.
     *            </p>
     *            <p>
     *            For a multi-Region key, set this parameter to
     *            <code>True</code>. For a single-Region KMS key, omit this
     *            parameter or set it to <code>False</code>. The default value
     *            is <code>False</code>.
     *            </p>
     *            <p>
     *            This operation supports <i>multi-Region keys</i>, an KMS
     *            feature that lets you create multiple interoperable KMS keys
     *            in different Amazon Web Services Regions. Because these KMS
     *            keys have the same key ID, key material, and other metadata,
     *            you can use them interchangeably to encrypt data in one Amazon
     *            Web Services Region and decrypt it in a different Amazon Web
     *            Services Region without re-encrypting the data or making a
     *            cross-Region call. For more information about multi-Region
     *            keys, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
     *            >Multi-Region keys in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            This value creates a <i>primary key</i>, not a replica. To
     *            create a <i>replica key</i>, use the <a>ReplicateKey</a>
     *            operation.
     *            </p>
     *            <p>
     *            You can create a multi-Region version of a symmetric
     *            encryption KMS key, an HMAC KMS key, an asymmetric KMS key, or
     *            a KMS key with imported key material. However, you cannot
     *            create a multi-Region key in a custom key store.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withMultiRegion(Boolean multiRegion) {
        this.multiRegion = multiRegion;
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
        if (getKeySpec() != null)
            sb.append("KeySpec: " + getKeySpec() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin() + ",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId() + ",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck()
                    + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getMultiRegion() != null)
            sb.append("MultiRegion: " + getMultiRegion());
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
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime
                * hashCode
                + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0
                        : getBypassPolicyLockoutSafetyCheck().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getMultiRegion() == null) ? 0 : getMultiRegion().hashCode());
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
        if (other.getKeySpec() == null ^ this.getKeySpec() == null)
            return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false)
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
        if (other.getMultiRegion() == null ^ this.getMultiRegion() == null)
            return false;
        if (other.getMultiRegion() != null
                && other.getMultiRegion().equals(this.getMultiRegion()) == false)
            return false;
        return true;
    }
}
