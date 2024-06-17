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
 * Returns the public key and an import token you need to import or reimport key
 * material for a KMS key.
 * </p>
 * <p>
 * By default, KMS keys are created with key material that KMS generates. This
 * operation supports <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
 * >Importing key material</a>, an advanced feature that lets you generate and
 * import the cryptographic key material for a KMS key. For more information
 * about importing key material into KMS, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html"
 * >Importing key material</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * Before calling <code>GetParametersForImport</code>, use the <a>CreateKey</a>
 * operation with an <code>Origin</code> value of <code>EXTERNAL</code> to
 * create a KMS key with no key material. You can import key material for a
 * symmetric encryption KMS key, HMAC KMS key, asymmetric encryption KMS key, or
 * asymmetric signing KMS key. You can also import key material into a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html"
 * >multi-Region key</a> of any supported type. However, you can't import key
 * material into a KMS key in a <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html"
 * >custom key store</a>. You can also use <code>GetParametersForImport</code>
 * to get a public key and import token to <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material"
 * >reimport the original key material</a> into a KMS key whose key material
 * expired or was deleted.
 * </p>
 * <p>
 * <code>GetParametersForImport</code> returns the items that you need to import
 * your key material.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The public key (or "wrapping key") of an RSA key pair that KMS generates.
 * </p>
 * <p>
 * You will use this public key to encrypt ("wrap") your key material while it's
 * in transit to KMS.
 * </p>
 * </li>
 * <li>
 * <p>
 * A import token that ensures that KMS can decrypt your key material and
 * associate it with the correct KMS key.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The public key and its import token are permanently linked and must be used
 * together. Each public key and import token set is valid for 24 hours. The
 * expiration date and time appear in the <code>ParametersValidTo</code> field
 * in the <code>GetParametersForImport</code> response. You cannot use an
 * expired public key or import token in an <a>ImportKeyMaterial</a> request. If
 * your key and token expire, send another <code>GetParametersForImport</code>
 * request.
 * </p>
 * <p>
 * <code>GetParametersForImport</code> requires the following information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The key ID of the KMS key for which you are importing the key material.
 * </p>
 * </li>
 * <li>
 * <p>
 * The key spec of the public key ("wrapping key") that you will use to encrypt
 * your key material during import.
 * </p>
 * </li>
 * <li>
 * <p>
 * The wrapping algorithm that you will use with the public key to encrypt your
 * key material.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use the same or a different public key spec and wrapping algorithm
 * each time you import or reimport the same key material.
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
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:GetParametersForImport</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ImportKeyMaterial</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteImportedKeyMaterial</a>
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
public class GetParametersForImportRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported
     * key material. The <code>Origin</code> of the KMS key must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However,
     * you cannot import key material into a KMS key in a custom key store.
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
     * The algorithm you will use with the RSA public key (
     * <code>PublicKey</code>) in the response to protect your key material
     * during import. For more information, see <a href=
     * "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     * >Select a wrapping algorithm</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an
     * AES key that you generate, then encrypt your AES key with the RSA public
     * key from KMS. For RSAES wrapping algorithms, you encrypt your key
     * material directly with the RSA public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key
     * material that you are importing. To import an RSA private key, you must
     * use an RSA_AES wrapping algorithm.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material,
     * except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the
     * RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except
     * RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048
     * wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does
     * not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, RSA_AES_KEY_WRAP_SHA_1, RSA_AES_KEY_WRAP_SHA_256,
     * SM2PKE
     */
    private String wrappingAlgorithm;

    /**
     * <p>
     * The type of RSA public key to return in the response. You will use this
     * wrapping key with the specified wrapping algorithm to protect your key
     * material during import.
     * </p>
     * <p>
     * Use the longest RSA wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521
     * private key. Instead, use an RSA_AES wrapping algorithm or choose a
     * longer RSA public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, SM2
     */
    private String wrappingKeySpec;

    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported
     * key material. The <code>Origin</code> of the KMS key must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However,
     * you cannot import key material into a KMS key in a custom key store.
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
     *         The identifier of the KMS key that will be associated with the
     *         imported key material. The <code>Origin</code> of the KMS key
     *         must be <code>EXTERNAL</code>.
     *         </p>
     *         <p>
     *         All KMS key types are supported, including multi-Region keys.
     *         However, you cannot import key material into a KMS key in a
     *         custom key store.
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
     * The identifier of the KMS key that will be associated with the imported
     * key material. The <code>Origin</code> of the KMS key must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However,
     * you cannot import key material into a KMS key in a custom key store.
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
     *            The identifier of the KMS key that will be associated with the
     *            imported key material. The <code>Origin</code> of the KMS key
     *            must be <code>EXTERNAL</code>.
     *            </p>
     *            <p>
     *            All KMS key types are supported, including multi-Region keys.
     *            However, you cannot import key material into a KMS key in a
     *            custom key store.
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
     * The identifier of the KMS key that will be associated with the imported
     * key material. The <code>Origin</code> of the KMS key must be
     * <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However,
     * you cannot import key material into a KMS key in a custom key store.
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
     *            The identifier of the KMS key that will be associated with the
     *            imported key material. The <code>Origin</code> of the KMS key
     *            must be <code>EXTERNAL</code>.
     *            </p>
     *            <p>
     *            All KMS key types are supported, including multi-Region keys.
     *            However, you cannot import key material into a KMS key in a
     *            custom key store.
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
    public GetParametersForImportRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The algorithm you will use with the RSA public key (
     * <code>PublicKey</code>) in the response to protect your key material
     * during import. For more information, see <a href=
     * "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     * >Select a wrapping algorithm</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an
     * AES key that you generate, then encrypt your AES key with the RSA public
     * key from KMS. For RSAES wrapping algorithms, you encrypt your key
     * material directly with the RSA public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key
     * material that you are importing. To import an RSA private key, you must
     * use an RSA_AES wrapping algorithm.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material,
     * except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the
     * RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except
     * RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048
     * wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does
     * not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, RSA_AES_KEY_WRAP_SHA_1, RSA_AES_KEY_WRAP_SHA_256,
     * SM2PKE
     *
     * @return <p>
     *         The algorithm you will use with the RSA public key (
     *         <code>PublicKey</code>) in the response to protect your key
     *         material during import. For more information, see <a href=
     *         "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *         >Select a wrapping algorithm</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         For RSA_AES wrapping algorithms, you encrypt your key material
     *         with an AES key that you generate, then encrypt your AES key with
     *         the RSA public key from KMS. For RSAES wrapping algorithms, you
     *         encrypt your key material directly with the RSA public key from
     *         KMS.
     *         </p>
     *         <p>
     *         The wrapping algorithms that you can use depend on the type of
     *         key material that you are importing. To import an RSA private
     *         key, you must use an RSA_AES wrapping algorithm.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and
     *         ECC key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and
     *         ECC key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key
     *         material, except RSA key material (private key).
     *         </p>
     *         <p>
     *         You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the
     *         RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key
     *         material, except RSA key material (private key).
     *         </p>
     *         <p>
     *         You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the
     *         RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023,
     *         KMS does not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     *         </p>
     *         </li>
     *         </ul>
     * @see AlgorithmSpec
     */
    public String getWrappingAlgorithm() {
        return wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use with the RSA public key (
     * <code>PublicKey</code>) in the response to protect your key material
     * during import. For more information, see <a href=
     * "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     * >Select a wrapping algorithm</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an
     * AES key that you generate, then encrypt your AES key with the RSA public
     * key from KMS. For RSAES wrapping algorithms, you encrypt your key
     * material directly with the RSA public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key
     * material that you are importing. To import an RSA private key, you must
     * use an RSA_AES wrapping algorithm.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material,
     * except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the
     * RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except
     * RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048
     * wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does
     * not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, RSA_AES_KEY_WRAP_SHA_1, RSA_AES_KEY_WRAP_SHA_256,
     * SM2PKE
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use with the RSA public key (
     *            <code>PublicKey</code>) in the response to protect your key
     *            material during import. For more information, see <a href=
     *            "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *            >Select a wrapping algorithm</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For RSA_AES wrapping algorithms, you encrypt your key material
     *            with an AES key that you generate, then encrypt your AES key
     *            with the RSA public key from KMS. For RSAES wrapping
     *            algorithms, you encrypt your key material directly with the
     *            RSA public key from KMS.
     *            </p>
     *            <p>
     *            The wrapping algorithms that you can use depend on the type of
     *            key material that you are importing. To import an RSA private
     *            key, you must use an RSA_AES wrapping algorithm.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA
     *            and ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and
     *            ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023,
     *            KMS does not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     *            </p>
     *            </li>
     *            </ul>
     * @see AlgorithmSpec
     */
    public void setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use with the RSA public key (
     * <code>PublicKey</code>) in the response to protect your key material
     * during import. For more information, see <a href=
     * "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     * >Select a wrapping algorithm</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an
     * AES key that you generate, then encrypt your AES key with the RSA public
     * key from KMS. For RSAES wrapping algorithms, you encrypt your key
     * material directly with the RSA public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key
     * material that you are importing. To import an RSA private key, you must
     * use an RSA_AES wrapping algorithm.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material,
     * except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the
     * RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except
     * RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048
     * wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does
     * not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, RSA_AES_KEY_WRAP_SHA_1, RSA_AES_KEY_WRAP_SHA_256,
     * SM2PKE
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use with the RSA public key (
     *            <code>PublicKey</code>) in the response to protect your key
     *            material during import. For more information, see <a href=
     *            "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *            >Select a wrapping algorithm</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For RSA_AES wrapping algorithms, you encrypt your key material
     *            with an AES key that you generate, then encrypt your AES key
     *            with the RSA public key from KMS. For RSAES wrapping
     *            algorithms, you encrypt your key material directly with the
     *            RSA public key from KMS.
     *            </p>
     *            <p>
     *            The wrapping algorithms that you can use depend on the type of
     *            key material that you are importing. To import an RSA private
     *            key, you must use an RSA_AES wrapping algorithm.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA
     *            and ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and
     *            ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023,
     *            KMS does not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmSpec
     */
    public GetParametersForImportRequest withWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }

    /**
     * <p>
     * The algorithm you will use with the RSA public key (
     * <code>PublicKey</code>) in the response to protect your key material
     * during import. For more information, see <a href=
     * "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     * >Select a wrapping algorithm</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an
     * AES key that you generate, then encrypt your AES key with the RSA public
     * key from KMS. For RSAES wrapping algorithms, you encrypt your key
     * material directly with the RSA public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key
     * material that you are importing. To import an RSA private key, you must
     * use an RSA_AES wrapping algorithm.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material,
     * except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the
     * RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except
     * RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048
     * wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does
     * not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, RSA_AES_KEY_WRAP_SHA_1, RSA_AES_KEY_WRAP_SHA_256,
     * SM2PKE
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use with the RSA public key (
     *            <code>PublicKey</code>) in the response to protect your key
     *            material during import. For more information, see <a href=
     *            "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *            >Select a wrapping algorithm</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For RSA_AES wrapping algorithms, you encrypt your key material
     *            with an AES key that you generate, then encrypt your AES key
     *            with the RSA public key from KMS. For RSAES wrapping
     *            algorithms, you encrypt your key material directly with the
     *            RSA public key from KMS.
     *            </p>
     *            <p>
     *            The wrapping algorithms that you can use depend on the type of
     *            key material that you are importing. To import an RSA private
     *            key, you must use an RSA_AES wrapping algorithm.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA
     *            and ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and
     *            ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023,
     *            KMS does not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     *            </p>
     *            </li>
     *            </ul>
     * @see AlgorithmSpec
     */
    public void setWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm.toString();
    }

    /**
     * <p>
     * The algorithm you will use with the RSA public key (
     * <code>PublicKey</code>) in the response to protect your key material
     * during import. For more information, see <a href=
     * "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     * >Select a wrapping algorithm</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an
     * AES key that you generate, then encrypt your AES key with the RSA public
     * key from KMS. For RSAES wrapping algorithms, you encrypt your key
     * material directly with the RSA public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key
     * material that you are importing. To import an RSA private key, you must
     * use an RSA_AES wrapping algorithm.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key
     * material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material,
     * except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the
     * RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except
     * RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048
     * wrapping key spec to wrap ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does
     * not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSAES_PKCS1_V1_5, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256, RSA_AES_KEY_WRAP_SHA_1, RSA_AES_KEY_WRAP_SHA_256,
     * SM2PKE
     *
     * @param wrappingAlgorithm <p>
     *            The algorithm you will use with the RSA public key (
     *            <code>PublicKey</code>) in the response to protect your key
     *            material during import. For more information, see <a href=
     *            "kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *            >Select a wrapping algorithm</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For RSA_AES wrapping algorithms, you encrypt your key material
     *            with an AES key that you generate, then encrypt your AES key
     *            with the RSA public key from KMS. For RSAES wrapping
     *            algorithms, you encrypt your key material directly with the
     *            RSA public key from KMS.
     *            </p>
     *            <p>
     *            The wrapping algorithms that you can use depend on the type of
     *            key material that you are importing. To import an RSA private
     *            key, you must use an RSA_AES wrapping algorithm.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA
     *            and ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and
     *            ECC key material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key
     *            material, except RSA key material (private key).
     *            </p>
     *            <p>
     *            You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with
     *            the RSA_2048 wrapping key spec to wrap ECC_NIST_P521 key
     *            material.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023,
     *            KMS does not support the RSAES_PKCS1_V1_5 wrapping algorithm.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmSpec
     */
    public GetParametersForImportRequest withWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The type of RSA public key to return in the response. You will use this
     * wrapping key with the specified wrapping algorithm to protect your key
     * material during import.
     * </p>
     * <p>
     * Use the longest RSA wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521
     * private key. Instead, use an RSA_AES wrapping algorithm or choose a
     * longer RSA public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, SM2
     *
     * @return <p>
     *         The type of RSA public key to return in the response. You will
     *         use this wrapping key with the specified wrapping algorithm to
     *         protect your key material during import.
     *         </p>
     *         <p>
     *         Use the longest RSA wrapping key that is practical.
     *         </p>
     *         <p>
     *         You cannot use an RSA_2048 public key to directly wrap an
     *         ECC_NIST_P521 private key. Instead, use an RSA_AES wrapping
     *         algorithm or choose a longer RSA public key.
     *         </p>
     * @see WrappingKeySpec
     */
    public String getWrappingKeySpec() {
        return wrappingKeySpec;
    }

    /**
     * <p>
     * The type of RSA public key to return in the response. You will use this
     * wrapping key with the specified wrapping algorithm to protect your key
     * material during import.
     * </p>
     * <p>
     * Use the longest RSA wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521
     * private key. Instead, use an RSA_AES wrapping algorithm or choose a
     * longer RSA public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, SM2
     *
     * @param wrappingKeySpec <p>
     *            The type of RSA public key to return in the response. You will
     *            use this wrapping key with the specified wrapping algorithm to
     *            protect your key material during import.
     *            </p>
     *            <p>
     *            Use the longest RSA wrapping key that is practical.
     *            </p>
     *            <p>
     *            You cannot use an RSA_2048 public key to directly wrap an
     *            ECC_NIST_P521 private key. Instead, use an RSA_AES wrapping
     *            algorithm or choose a longer RSA public key.
     *            </p>
     * @see WrappingKeySpec
     */
    public void setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
    }

    /**
     * <p>
     * The type of RSA public key to return in the response. You will use this
     * wrapping key with the specified wrapping algorithm to protect your key
     * material during import.
     * </p>
     * <p>
     * Use the longest RSA wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521
     * private key. Instead, use an RSA_AES wrapping algorithm or choose a
     * longer RSA public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, SM2
     *
     * @param wrappingKeySpec <p>
     *            The type of RSA public key to return in the response. You will
     *            use this wrapping key with the specified wrapping algorithm to
     *            protect your key material during import.
     *            </p>
     *            <p>
     *            Use the longest RSA wrapping key that is practical.
     *            </p>
     *            <p>
     *            You cannot use an RSA_2048 public key to directly wrap an
     *            ECC_NIST_P521 private key. Instead, use an RSA_AES wrapping
     *            algorithm or choose a longer RSA public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WrappingKeySpec
     */
    public GetParametersForImportRequest withWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }

    /**
     * <p>
     * The type of RSA public key to return in the response. You will use this
     * wrapping key with the specified wrapping algorithm to protect your key
     * material during import.
     * </p>
     * <p>
     * Use the longest RSA wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521
     * private key. Instead, use an RSA_AES wrapping algorithm or choose a
     * longer RSA public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, SM2
     *
     * @param wrappingKeySpec <p>
     *            The type of RSA public key to return in the response. You will
     *            use this wrapping key with the specified wrapping algorithm to
     *            protect your key material during import.
     *            </p>
     *            <p>
     *            Use the longest RSA wrapping key that is practical.
     *            </p>
     *            <p>
     *            You cannot use an RSA_2048 public key to directly wrap an
     *            ECC_NIST_P521 private key. Instead, use an RSA_AES wrapping
     *            algorithm or choose a longer RSA public key.
     *            </p>
     * @see WrappingKeySpec
     */
    public void setWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec.toString();
    }

    /**
     * <p>
     * The type of RSA public key to return in the response. You will use this
     * wrapping key with the specified wrapping algorithm to protect your key
     * material during import.
     * </p>
     * <p>
     * Use the longest RSA wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521
     * private key. Instead, use an RSA_AES wrapping algorithm or choose a
     * longer RSA public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, SM2
     *
     * @param wrappingKeySpec <p>
     *            The type of RSA public key to return in the response. You will
     *            use this wrapping key with the specified wrapping algorithm to
     *            protect your key material during import.
     *            </p>
     *            <p>
     *            Use the longest RSA wrapping key that is practical.
     *            </p>
     *            <p>
     *            You cannot use an RSA_2048 public key to directly wrap an
     *            ECC_NIST_P521 private key. Instead, use an RSA_AES wrapping
     *            algorithm or choose a longer RSA public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WrappingKeySpec
     */
    public GetParametersForImportRequest withWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec.toString();
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
        if (getWrappingAlgorithm() != null)
            sb.append("WrappingAlgorithm: " + getWrappingAlgorithm() + ",");
        if (getWrappingKeySpec() != null)
            sb.append("WrappingKeySpec: " + getWrappingKeySpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getWrappingAlgorithm() == null) ? 0 : getWrappingAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getWrappingKeySpec() == null) ? 0 : getWrappingKeySpec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForImportRequest == false)
            return false;
        GetParametersForImportRequest other = (GetParametersForImportRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getWrappingAlgorithm() == null ^ this.getWrappingAlgorithm() == null)
            return false;
        if (other.getWrappingAlgorithm() != null
                && other.getWrappingAlgorithm().equals(this.getWrappingAlgorithm()) == false)
            return false;
        if (other.getWrappingKeySpec() == null ^ this.getWrappingKeySpec() == null)
            return false;
        if (other.getWrappingKeySpec() != null
                && other.getWrappingKeySpec().equals(this.getWrappingKeySpec()) == false)
            return false;
        return true;
    }
}
