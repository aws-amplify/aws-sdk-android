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
 * Imports or reimports key material into an existing KMS key that was created
 * without key material. <code>ImportKeyMaterial</code> also sets the expiration
 * model and expiration date of the imported key material.
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
 * After you successfully import key material into a KMS key, you can <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material"
 * >reimport the same key material</a> into that KMS key, but you cannot import
 * different key material. You might reimport key material to replace key
 * material that expired or key material that you deleted. You might also
 * reimport key material to change the expiration model or expiration date of
 * the key material.
 * </p>
 * <p>
 * Each time you import key material into KMS, you can determine whether (
 * <code>ExpirationModel</code>) and when (<code>ValidTo</code>) the key
 * material expires. To change the expiration of your key material, you must
 * import it again, either by calling <code>ImportKeyMaterial</code> or using
 * the <a href=
 * "kms/latest/developerguide/importing-keys-import-key-material.html#importing-keys-import-key-material-console"
 * >import features</a> of the KMS console.
 * </p>
 * <p>
 * Before calling <code>ImportKeyMaterial</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create or identify a KMS key with no key material. The KMS key must have an
 * <code>Origin</code> value of <code>EXTERNAL</code>, which indicates that the
 * KMS key is designed for imported key material.
 * </p>
 * <p>
 * To create an new KMS key for imported key material, call the <a>CreateKey</a>
 * operation with an <code>Origin</code> value of <code>EXTERNAL</code>. You can
 * create a symmetric encryption KMS key, HMAC KMS key, asymmetric encryption
 * KMS key, or asymmetric signing KMS key. You can also import key material into
 * a <a href="kms/latest/developerguide/multi-region-keys-overview.html">multi-
 * Region key</a> of any supported type. However, you can't import key material
 * into a KMS key in a <a
 * href="kms/latest/developerguide/custom-key-store-overview.html">custom key
 * store</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <a>DescribeKey</a> operation to verify that the <code>KeyState</code>
 * of the KMS key is <code>PendingImport</code>, which indicates that the KMS
 * key has no key material.
 * </p>
 * <p>
 * If you are reimporting the same key material into an existing KMS key, you
 * might need to call the <a>DeleteImportedKeyMaterial</a> to delete its
 * existing key material.
 * </p>
 * </li>
 * <li>
 * <p>
 * Call the <a>GetParametersForImport</a> operation to get a public key and
 * import token set for importing key material.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the public key in the <a>GetParametersForImport</a> response to encrypt
 * your key material.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Then, in an <code>ImportKeyMaterial</code> request, you submit your encrypted
 * key material and import token. When calling this operation, you must specify
 * the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The key ID or key ARN of the KMS key to associate with the imported key
 * material. Its <code>Origin</code> must be <code>EXTERNAL</code> and its
 * <code>KeyState</code> must be <code>PendingImport</code>. You cannot perform
 * this operation on a KMS key in a <a
 * href="kms/latest/developerguide/custom-key-store-overview.html">custom key
 * store</a>, or on a KMS key in a different Amazon Web Services account. To get
 * the <code>Origin</code> and <code>KeyState</code> of a KMS key, call
 * <a>DescribeKey</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The encrypted key material.
 * </p>
 * </li>
 * <li>
 * <p>
 * The import token that <a>GetParametersForImport</a> returned. You must use a
 * public key and token from the same <code>GetParametersForImport</code>
 * response.
 * </p>
 * </li>
 * <li>
 * <p>
 * Whether the key material expires (<code>ExpirationModel</code>) and, if so,
 * when (<code>ValidTo</code>). For help with this choice, see <a href=
 * "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
 * >Setting an expiration time</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * If you set an expiration date, KMS deletes the key material from the KMS key
 * on the specified date, making the KMS key unusable. To use the KMS key in
 * cryptographic operations again, you must reimport the same key material.
 * However, you can delete and reimport the key material at any time, including
 * before the key material expires. Each time you reimport, you can eliminate or
 * reset the expiration time.
 * </p>
 * </li>
 * </ul>
 * <p>
 * When this operation is successful, the key state of the KMS key changes from
 * <code>PendingImport</code> to <code>Enabled</code>, and you can use the KMS
 * key in cryptographic operations.
 * </p>
 * <p>
 * If this operation fails, use the exception to help determine the problem. If
 * the error is related to the key material, the import token, or wrapping key,
 * use <a>GetParametersForImport</a> to get a new public key and import token
 * for the KMS key and repeat the import procedure. For help, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#importing-keys-overview"
 * >How To Import Key Material</a> in the <i>Key Management Service Developer
 * Guide</i>.
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
 * >kms:ImportKeyMaterial</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteImportedKeyMaterial</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetParametersForImport</a>
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
public class ImportKeyMaterialRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported
     * key material. This must be the same KMS key specified in the
     * <code>KeyID</code> parameter of the corresponding
     * <a>GetParametersForImport</a> request. The <code>Origin</code> of the KMS
     * key must be <code>EXTERNAL</code> and its <code>KeyState</code> must be
     * <code>PendingImport</code>.
     * </p>
     * <p>
     * The KMS key can be a symmetric encryption KMS key, HMAC KMS key,
     * asymmetric encryption KMS key, or asymmetric signing KMS key, including a
     * <a
     * href="kms/latest/developerguide/multi-region-keys-overview.html">multi-
     * Region key</a> of any supported type. You cannot perform this operation
     * on a KMS key in a custom key store, or on a KMS key in a different Amazon
     * Web Services account.
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
     * The import token that you received in the response to a previous
     * <a>GetParametersForImport</a> request. It must be from the same response
     * that contained the public key that you used to encrypt the key material.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer importToken;

    /**
     * <p>
     * The encrypted key material to import. The key material must be encrypted
     * under the public wrapping key that <a>GetParametersForImport</a>
     * returned, using the wrapping algorithm that you specified in the same
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer encryptedKeyMaterial;

    /**
     * <p>
     * The date and time when the imported key material expires. This parameter
     * is required when the value of the <code>ExpirationModel</code> parameter
     * is <code>KEY_MATERIAL_EXPIRES</code>. Otherwise it is not valid.
     * </p>
     * <p>
     * The value of this parameter must be a future date and time. The maximum
     * value is 365 days from the request date.
     * </p>
     * <p>
     * When the key material expires, KMS deletes the key material from the KMS
     * key. Without its key material, the KMS key is unusable. To use the KMS
     * key in cryptographic operations, you must reimport the same key material.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must delete
     * (<a>DeleteImportedKeyMaterial</a>) and reimport the key material.
     * </p>
     */
    private java.util.Date validTo;

    /**
     * <p>
     * Specifies whether the key material expires. The default is
     * <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     * >Setting an expiration time</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the value of <code>ExpirationModel</code> is
     * <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value for the
     * <code>ValidTo</code> parameter. When value is
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     * <code>ValidTo</code> parameter.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must reimport the key material.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     */
    private String expirationModel;

    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported
     * key material. This must be the same KMS key specified in the
     * <code>KeyID</code> parameter of the corresponding
     * <a>GetParametersForImport</a> request. The <code>Origin</code> of the KMS
     * key must be <code>EXTERNAL</code> and its <code>KeyState</code> must be
     * <code>PendingImport</code>.
     * </p>
     * <p>
     * The KMS key can be a symmetric encryption KMS key, HMAC KMS key,
     * asymmetric encryption KMS key, or asymmetric signing KMS key, including a
     * <a
     * href="kms/latest/developerguide/multi-region-keys-overview.html">multi-
     * Region key</a> of any supported type. You cannot perform this operation
     * on a KMS key in a custom key store, or on a KMS key in a different Amazon
     * Web Services account.
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
     *         imported key material. This must be the same KMS key specified in
     *         the <code>KeyID</code> parameter of the corresponding
     *         <a>GetParametersForImport</a> request. The <code>Origin</code> of
     *         the KMS key must be <code>EXTERNAL</code> and its
     *         <code>KeyState</code> must be <code>PendingImport</code>.
     *         </p>
     *         <p>
     *         The KMS key can be a symmetric encryption KMS key, HMAC KMS key,
     *         asymmetric encryption KMS key, or asymmetric signing KMS key,
     *         including a <a href=
     *         "kms/latest/developerguide/multi-region-keys-overview.html"
     *         >multi-Region key</a> of any supported type. You cannot perform
     *         this operation on a KMS key in a custom key store, or on a KMS
     *         key in a different Amazon Web Services account.
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
     * key material. This must be the same KMS key specified in the
     * <code>KeyID</code> parameter of the corresponding
     * <a>GetParametersForImport</a> request. The <code>Origin</code> of the KMS
     * key must be <code>EXTERNAL</code> and its <code>KeyState</code> must be
     * <code>PendingImport</code>.
     * </p>
     * <p>
     * The KMS key can be a symmetric encryption KMS key, HMAC KMS key,
     * asymmetric encryption KMS key, or asymmetric signing KMS key, including a
     * <a
     * href="kms/latest/developerguide/multi-region-keys-overview.html">multi-
     * Region key</a> of any supported type. You cannot perform this operation
     * on a KMS key in a custom key store, or on a KMS key in a different Amazon
     * Web Services account.
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
     *            imported key material. This must be the same KMS key specified
     *            in the <code>KeyID</code> parameter of the corresponding
     *            <a>GetParametersForImport</a> request. The <code>Origin</code>
     *            of the KMS key must be <code>EXTERNAL</code> and its
     *            <code>KeyState</code> must be <code>PendingImport</code>.
     *            </p>
     *            <p>
     *            The KMS key can be a symmetric encryption KMS key, HMAC KMS
     *            key, asymmetric encryption KMS key, or asymmetric signing KMS
     *            key, including a <a href=
     *            "kms/latest/developerguide/multi-region-keys-overview.html"
     *            >multi-Region key</a> of any supported type. You cannot
     *            perform this operation on a KMS key in a custom key store, or
     *            on a KMS key in a different Amazon Web Services account.
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
     * key material. This must be the same KMS key specified in the
     * <code>KeyID</code> parameter of the corresponding
     * <a>GetParametersForImport</a> request. The <code>Origin</code> of the KMS
     * key must be <code>EXTERNAL</code> and its <code>KeyState</code> must be
     * <code>PendingImport</code>.
     * </p>
     * <p>
     * The KMS key can be a symmetric encryption KMS key, HMAC KMS key,
     * asymmetric encryption KMS key, or asymmetric signing KMS key, including a
     * <a
     * href="kms/latest/developerguide/multi-region-keys-overview.html">multi-
     * Region key</a> of any supported type. You cannot perform this operation
     * on a KMS key in a custom key store, or on a KMS key in a different Amazon
     * Web Services account.
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
     *            imported key material. This must be the same KMS key specified
     *            in the <code>KeyID</code> parameter of the corresponding
     *            <a>GetParametersForImport</a> request. The <code>Origin</code>
     *            of the KMS key must be <code>EXTERNAL</code> and its
     *            <code>KeyState</code> must be <code>PendingImport</code>.
     *            </p>
     *            <p>
     *            The KMS key can be a symmetric encryption KMS key, HMAC KMS
     *            key, asymmetric encryption KMS key, or asymmetric signing KMS
     *            key, including a <a href=
     *            "kms/latest/developerguide/multi-region-keys-overview.html"
     *            >multi-Region key</a> of any supported type. You cannot
     *            perform this operation on a KMS key in a custom key store, or
     *            on a KMS key in a different Amazon Web Services account.
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
    public ImportKeyMaterialRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The import token that you received in the response to a previous
     * <a>GetParametersForImport</a> request. It must be from the same response
     * that contained the public key that you used to encrypt the key material.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The import token that you received in the response to a previous
     *         <a>GetParametersForImport</a> request. It must be from the same
     *         response that contained the public key that you used to encrypt
     *         the key material.
     *         </p>
     */
    public java.nio.ByteBuffer getImportToken() {
        return importToken;
    }

    /**
     * <p>
     * The import token that you received in the response to a previous
     * <a>GetParametersForImport</a> request. It must be from the same response
     * that contained the public key that you used to encrypt the key material.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param importToken <p>
     *            The import token that you received in the response to a
     *            previous <a>GetParametersForImport</a> request. It must be
     *            from the same response that contained the public key that you
     *            used to encrypt the key material.
     *            </p>
     */
    public void setImportToken(java.nio.ByteBuffer importToken) {
        this.importToken = importToken;
    }

    /**
     * <p>
     * The import token that you received in the response to a previous
     * <a>GetParametersForImport</a> request. It must be from the same response
     * that contained the public key that you used to encrypt the key material.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param importToken <p>
     *            The import token that you received in the response to a
     *            previous <a>GetParametersForImport</a> request. It must be
     *            from the same response that contained the public key that you
     *            used to encrypt the key material.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyMaterialRequest withImportToken(java.nio.ByteBuffer importToken) {
        this.importToken = importToken;
        return this;
    }

    /**
     * <p>
     * The encrypted key material to import. The key material must be encrypted
     * under the public wrapping key that <a>GetParametersForImport</a>
     * returned, using the wrapping algorithm that you specified in the same
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The encrypted key material to import. The key material must be
     *         encrypted under the public wrapping key that
     *         <a>GetParametersForImport</a> returned, using the wrapping
     *         algorithm that you specified in the same
     *         <code>GetParametersForImport</code> request.
     *         </p>
     */
    public java.nio.ByteBuffer getEncryptedKeyMaterial() {
        return encryptedKeyMaterial;
    }

    /**
     * <p>
     * The encrypted key material to import. The key material must be encrypted
     * under the public wrapping key that <a>GetParametersForImport</a>
     * returned, using the wrapping algorithm that you specified in the same
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param encryptedKeyMaterial <p>
     *            The encrypted key material to import. The key material must be
     *            encrypted under the public wrapping key that
     *            <a>GetParametersForImport</a> returned, using the wrapping
     *            algorithm that you specified in the same
     *            <code>GetParametersForImport</code> request.
     *            </p>
     */
    public void setEncryptedKeyMaterial(java.nio.ByteBuffer encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
    }

    /**
     * <p>
     * The encrypted key material to import. The key material must be encrypted
     * under the public wrapping key that <a>GetParametersForImport</a>
     * returned, using the wrapping algorithm that you specified in the same
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param encryptedKeyMaterial <p>
     *            The encrypted key material to import. The key material must be
     *            encrypted under the public wrapping key that
     *            <a>GetParametersForImport</a> returned, using the wrapping
     *            algorithm that you specified in the same
     *            <code>GetParametersForImport</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyMaterialRequest withEncryptedKeyMaterial(
            java.nio.ByteBuffer encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
        return this;
    }

    /**
     * <p>
     * The date and time when the imported key material expires. This parameter
     * is required when the value of the <code>ExpirationModel</code> parameter
     * is <code>KEY_MATERIAL_EXPIRES</code>. Otherwise it is not valid.
     * </p>
     * <p>
     * The value of this parameter must be a future date and time. The maximum
     * value is 365 days from the request date.
     * </p>
     * <p>
     * When the key material expires, KMS deletes the key material from the KMS
     * key. Without its key material, the KMS key is unusable. To use the KMS
     * key in cryptographic operations, you must reimport the same key material.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must delete
     * (<a>DeleteImportedKeyMaterial</a>) and reimport the key material.
     * </p>
     *
     * @return <p>
     *         The date and time when the imported key material expires. This
     *         parameter is required when the value of the
     *         <code>ExpirationModel</code> parameter is
     *         <code>KEY_MATERIAL_EXPIRES</code>. Otherwise it is not valid.
     *         </p>
     *         <p>
     *         The value of this parameter must be a future date and time. The
     *         maximum value is 365 days from the request date.
     *         </p>
     *         <p>
     *         When the key material expires, KMS deletes the key material from
     *         the KMS key. Without its key material, the KMS key is unusable.
     *         To use the KMS key in cryptographic operations, you must reimport
     *         the same key material.
     *         </p>
     *         <p>
     *         You cannot change the <code>ExpirationModel</code> or
     *         <code>ValidTo</code> values for the current import after the
     *         request completes. To change either value, you must delete
     *         (<a>DeleteImportedKeyMaterial</a>) and reimport the key material.
     *         </p>
     */
    public java.util.Date getValidTo() {
        return validTo;
    }

    /**
     * <p>
     * The date and time when the imported key material expires. This parameter
     * is required when the value of the <code>ExpirationModel</code> parameter
     * is <code>KEY_MATERIAL_EXPIRES</code>. Otherwise it is not valid.
     * </p>
     * <p>
     * The value of this parameter must be a future date and time. The maximum
     * value is 365 days from the request date.
     * </p>
     * <p>
     * When the key material expires, KMS deletes the key material from the KMS
     * key. Without its key material, the KMS key is unusable. To use the KMS
     * key in cryptographic operations, you must reimport the same key material.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must delete
     * (<a>DeleteImportedKeyMaterial</a>) and reimport the key material.
     * </p>
     *
     * @param validTo <p>
     *            The date and time when the imported key material expires. This
     *            parameter is required when the value of the
     *            <code>ExpirationModel</code> parameter is
     *            <code>KEY_MATERIAL_EXPIRES</code>. Otherwise it is not valid.
     *            </p>
     *            <p>
     *            The value of this parameter must be a future date and time.
     *            The maximum value is 365 days from the request date.
     *            </p>
     *            <p>
     *            When the key material expires, KMS deletes the key material
     *            from the KMS key. Without its key material, the KMS key is
     *            unusable. To use the KMS key in cryptographic operations, you
     *            must reimport the same key material.
     *            </p>
     *            <p>
     *            You cannot change the <code>ExpirationModel</code> or
     *            <code>ValidTo</code> values for the current import after the
     *            request completes. To change either value, you must delete
     *            (<a>DeleteImportedKeyMaterial</a>) and reimport the key
     *            material.
     *            </p>
     */
    public void setValidTo(java.util.Date validTo) {
        this.validTo = validTo;
    }

    /**
     * <p>
     * The date and time when the imported key material expires. This parameter
     * is required when the value of the <code>ExpirationModel</code> parameter
     * is <code>KEY_MATERIAL_EXPIRES</code>. Otherwise it is not valid.
     * </p>
     * <p>
     * The value of this parameter must be a future date and time. The maximum
     * value is 365 days from the request date.
     * </p>
     * <p>
     * When the key material expires, KMS deletes the key material from the KMS
     * key. Without its key material, the KMS key is unusable. To use the KMS
     * key in cryptographic operations, you must reimport the same key material.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must delete
     * (<a>DeleteImportedKeyMaterial</a>) and reimport the key material.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validTo <p>
     *            The date and time when the imported key material expires. This
     *            parameter is required when the value of the
     *            <code>ExpirationModel</code> parameter is
     *            <code>KEY_MATERIAL_EXPIRES</code>. Otherwise it is not valid.
     *            </p>
     *            <p>
     *            The value of this parameter must be a future date and time.
     *            The maximum value is 365 days from the request date.
     *            </p>
     *            <p>
     *            When the key material expires, KMS deletes the key material
     *            from the KMS key. Without its key material, the KMS key is
     *            unusable. To use the KMS key in cryptographic operations, you
     *            must reimport the same key material.
     *            </p>
     *            <p>
     *            You cannot change the <code>ExpirationModel</code> or
     *            <code>ValidTo</code> values for the current import after the
     *            request completes. To change either value, you must delete
     *            (<a>DeleteImportedKeyMaterial</a>) and reimport the key
     *            material.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportKeyMaterialRequest withValidTo(java.util.Date validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is
     * <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     * >Setting an expiration time</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the value of <code>ExpirationModel</code> is
     * <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value for the
     * <code>ValidTo</code> parameter. When value is
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     * <code>ValidTo</code> parameter.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must reimport the key material.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @return <p>
     *         Specifies whether the key material expires. The default is
     *         <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice, see
     *         <a href=
     *         "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     *         >Setting an expiration time</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         When the value of <code>ExpirationModel</code> is
     *         <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value for
     *         the <code>ValidTo</code> parameter. When value is
     *         <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     *         <code>ValidTo</code> parameter.
     *         </p>
     *         <p>
     *         You cannot change the <code>ExpirationModel</code> or
     *         <code>ValidTo</code> values for the current import after the
     *         request completes. To change either value, you must reimport the
     *         key material.
     *         </p>
     * @see ExpirationModelType
     */
    public String getExpirationModel() {
        return expirationModel;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is
     * <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     * >Setting an expiration time</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the value of <code>ExpirationModel</code> is
     * <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value for the
     * <code>ValidTo</code> parameter. When value is
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     * <code>ValidTo</code> parameter.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must reimport the key material.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the key material expires. The default is
     *            <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice,
     *            see <a href=
     *            "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     *            >Setting an expiration time</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            When the value of <code>ExpirationModel</code> is
     *            <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value
     *            for the <code>ValidTo</code> parameter. When value is
     *            <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     *            <code>ValidTo</code> parameter.
     *            </p>
     *            <p>
     *            You cannot change the <code>ExpirationModel</code> or
     *            <code>ValidTo</code> values for the current import after the
     *            request completes. To change either value, you must reimport
     *            the key material.
     *            </p>
     * @see ExpirationModelType
     */
    public void setExpirationModel(String expirationModel) {
        this.expirationModel = expirationModel;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is
     * <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     * >Setting an expiration time</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the value of <code>ExpirationModel</code> is
     * <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value for the
     * <code>ValidTo</code> parameter. When value is
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     * <code>ValidTo</code> parameter.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must reimport the key material.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the key material expires. The default is
     *            <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice,
     *            see <a href=
     *            "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     *            >Setting an expiration time</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            When the value of <code>ExpirationModel</code> is
     *            <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value
     *            for the <code>ValidTo</code> parameter. When value is
     *            <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     *            <code>ValidTo</code> parameter.
     *            </p>
     *            <p>
     *            You cannot change the <code>ExpirationModel</code> or
     *            <code>ValidTo</code> values for the current import after the
     *            request completes. To change either value, you must reimport
     *            the key material.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationModelType
     */
    public ImportKeyMaterialRequest withExpirationModel(String expirationModel) {
        this.expirationModel = expirationModel;
        return this;
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is
     * <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     * >Setting an expiration time</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the value of <code>ExpirationModel</code> is
     * <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value for the
     * <code>ValidTo</code> parameter. When value is
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     * <code>ValidTo</code> parameter.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must reimport the key material.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the key material expires. The default is
     *            <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice,
     *            see <a href=
     *            "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     *            >Setting an expiration time</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            When the value of <code>ExpirationModel</code> is
     *            <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value
     *            for the <code>ValidTo</code> parameter. When value is
     *            <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     *            <code>ValidTo</code> parameter.
     *            </p>
     *            <p>
     *            You cannot change the <code>ExpirationModel</code> or
     *            <code>ValidTo</code> values for the current import after the
     *            request completes. To change either value, you must reimport
     *            the key material.
     *            </p>
     * @see ExpirationModelType
     */
    public void setExpirationModel(ExpirationModelType expirationModel) {
        this.expirationModel = expirationModel.toString();
    }

    /**
     * <p>
     * Specifies whether the key material expires. The default is
     * <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice, see <a
     * href=
     * "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     * >Setting an expiration time</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * When the value of <code>ExpirationModel</code> is
     * <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value for the
     * <code>ValidTo</code> parameter. When value is
     * <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     * <code>ValidTo</code> parameter.
     * </p>
     * <p>
     * You cannot change the <code>ExpirationModel</code> or
     * <code>ValidTo</code> values for the current import after the request
     * completes. To change either value, you must reimport the key material.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_MATERIAL_EXPIRES, KEY_MATERIAL_DOES_NOT_EXPIRE
     *
     * @param expirationModel <p>
     *            Specifies whether the key material expires. The default is
     *            <code>KEY_MATERIAL_EXPIRES</code>. For help with this choice,
     *            see <a href=
     *            "https://docs.aws.amazon.com/en_us/kms/latest/developerguide/importing-keys.html#importing-keys-expiration"
     *            >Setting an expiration time</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            When the value of <code>ExpirationModel</code> is
     *            <code>KEY_MATERIAL_EXPIRES</code>, you must specify a value
     *            for the <code>ValidTo</code> parameter. When value is
     *            <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the
     *            <code>ValidTo</code> parameter.
     *            </p>
     *            <p>
     *            You cannot change the <code>ExpirationModel</code> or
     *            <code>ValidTo</code> values for the current import after the
     *            request completes. To change either value, you must reimport
     *            the key material.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationModelType
     */
    public ImportKeyMaterialRequest withExpirationModel(ExpirationModelType expirationModel) {
        this.expirationModel = expirationModel.toString();
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
        if (getImportToken() != null)
            sb.append("ImportToken: " + getImportToken() + ",");
        if (getEncryptedKeyMaterial() != null)
            sb.append("EncryptedKeyMaterial: " + getEncryptedKeyMaterial() + ",");
        if (getValidTo() != null)
            sb.append("ValidTo: " + getValidTo() + ",");
        if (getExpirationModel() != null)
            sb.append("ExpirationModel: " + getExpirationModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getImportToken() == null) ? 0 : getImportToken().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptedKeyMaterial() == null) ? 0 : getEncryptedKeyMaterial().hashCode());
        hashCode = prime * hashCode + ((getValidTo() == null) ? 0 : getValidTo().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationModel() == null) ? 0 : getExpirationModel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportKeyMaterialRequest == false)
            return false;
        ImportKeyMaterialRequest other = (ImportKeyMaterialRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getImportToken() == null ^ this.getImportToken() == null)
            return false;
        if (other.getImportToken() != null
                && other.getImportToken().equals(this.getImportToken()) == false)
            return false;
        if (other.getEncryptedKeyMaterial() == null ^ this.getEncryptedKeyMaterial() == null)
            return false;
        if (other.getEncryptedKeyMaterial() != null
                && other.getEncryptedKeyMaterial().equals(this.getEncryptedKeyMaterial()) == false)
            return false;
        if (other.getValidTo() == null ^ this.getValidTo() == null)
            return false;
        if (other.getValidTo() != null && other.getValidTo().equals(this.getValidTo()) == false)
            return false;
        if (other.getExpirationModel() == null ^ this.getExpirationModel() == null)
            return false;
        if (other.getExpirationModel() != null
                && other.getExpirationModel().equals(this.getExpirationModel()) == false)
            return false;
        return true;
    }
}
