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
 * Decrypts ciphertext and then reencrypts it entirely within KMS. You can use
 * this operation to change the KMS key under which data is encrypted, such as
 * when you <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotate-keys-manually"
 * >manually rotate</a> a KMS key or change the KMS key that protects a
 * ciphertext. You can also use it to reencrypt ciphertext under the same KMS
 * key, such as to change the <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
 * >encryption context</a> of a ciphertext.
 * </p>
 * <p>
 * The <code>ReEncrypt</code> operation can decrypt ciphertext that was
 * encrypted by using an KMS KMS key in an KMS operation, such as <a>Encrypt</a>
 * or <a>GenerateDataKey</a>. It can also decrypt ciphertext that was encrypted
 * by using the public key of an <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html#asymmetric-cmks"
 * >asymmetric KMS key</a> outside of KMS. However, it cannot decrypt ciphertext
 * produced by other libraries, such as the <a
 * href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/"
 * >Amazon Web Services Encryption SDK</a> or <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html"
 * >Amazon S3 client-side encryption</a>. These libraries return a ciphertext
 * format that is incompatible with KMS.
 * </p>
 * <p>
 * When you use the <code>ReEncrypt</code> operation, you need to provide
 * information for the decrypt operation and the subsequent encrypt operation.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If your ciphertext was encrypted under an asymmetric KMS key, you must use
 * the <code>SourceKeyId</code> parameter to identify the KMS key that encrypted
 * the ciphertext. You must also supply the encryption algorithm that was used.
 * This information is required to decrypt the data.
 * </p>
 * </li>
 * <li>
 * <p>
 * If your ciphertext was encrypted under a symmetric KMS key, the
 * <code>SourceKeyId</code> parameter is optional. KMS can get this information
 * from metadata that it adds to the symmetric ciphertext blob. This feature
 * adds durability to your implementation by ensuring that authorized users can
 * decrypt ciphertext decades after it was encrypted, even if they've lost track
 * of the key ID. However, specifying the source KMS key is always recommended
 * as a best practice. When you use the <code>SourceKeyId</code> parameter to
 * specify a KMS key, KMS uses only the KMS key you specify. If the ciphertext
 * was encrypted under a different KMS key, the <code>ReEncrypt</code> operation
 * fails. This practice ensures that you use the KMS key that you intend.
 * </p>
 * </li>
 * <li>
 * <p>
 * To reencrypt the data, you must use the <code>DestinationKeyId</code>
 * parameter specify the KMS key that re-encrypts the data after it is
 * decrypted. You can select a symmetric or asymmetric KMS key. If the
 * destination KMS key is an asymmetric KMS key, you must also provide the
 * encryption algorithm. The algorithm that you choose must be compatible with
 * the KMS key.
 * </p>
 * <important>
 * <p>
 * When you use an asymmetric KMS key to encrypt or reencrypt data, be sure to
 * record the KMS key and encryption algorithm that you choose. You will be
 * required to provide the same KMS key and encryption algorithm when you
 * decrypt the data. If the KMS key and algorithm do not match the values used
 * to encrypt the data, the decrypt operation fails.
 * </p>
 * <p>
 * You are not required to supply the key ID and encryption algorithm when you
 * decrypt with symmetric KMS keys because KMS stores this information in the
 * ciphertext blob. KMS cannot store metadata in ciphertext generated with
 * asymmetric keys. The standard format for asymmetric key ciphertext does not
 * include configurable fields.
 * </p>
 * </important></li>
 * </ul>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: Yes. The source KMS key and destination KMS key can
 * be in different Amazon Web Services accounts. Either or both KMS keys can be
 * in a different account than the caller. To specify a KMS key in a different
 * account, you must use its key ARN or alias ARN.
 * </p>
 * <p>
 * <b>Required permissions</b>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:ReEncryptFrom</a> permission on the source KMS key (key policy)
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:ReEncryptTo</a> permission on the destination KMS key (key policy)
 * </p>
 * </li>
 * </ul>
 * <p>
 * To permit reencryption from or to a KMS key, include the
 * <code>"kms:ReEncrypt*"</code> permission in your <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key
 * policy</a>. This permission is automatically included in the key policy when
 * you use the console to create a KMS key. But you must include it manually
 * when you create a KMS key programmatically or when you use the
 * <a>PutKeyPolicy</a> operation to set a key policy.
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>Decrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Encrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyPair</a>
 * </p>
 * </li>
 * </ul>
 */
public class ReEncryptRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Ciphertext of the data to reencrypt.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextBlob;

    /**
     * <p>
     * Specifies the encryption context to use to decrypt the ciphertext. Enter
     * the same encryption context that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> sourceEncryptionContext = new java.util.HashMap<String, String>();

    /**
     * <p>
     * Specifies the KMS key that KMS will use to decrypt the ciphertext before
     * it is re-encrypted. Enter a key ID of the KMS key that was used to
     * encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key. If you used a symmetric KMS key, KMS can get the
     * KMS key from metadata that it adds to the symmetric ciphertext blob.
     * However, it is always recommended as a best practice. This practice
     * ensures that you use the KMS key that you intend.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String sourceKeyId;

    /**
     * <p>
     * A unique identifier for the KMS key that is used to reencrypt the data.
     * Specify a symmetric or asymmetric KMS key with a <code>KeyUsage</code>
     * value of <code>ENCRYPT_DECRYPT</code>. To find the <code>KeyUsage</code>
     * value of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String destinationKeyId;

    /**
     * <p>
     * Specifies that encryption context to use when the reencrypting the data.
     * </p>
     * <p>
     * A destination encryption context is valid only when the destination KMS
     * key is a symmetric KMS key. The standard ciphertext format for asymmetric
     * KMS keys does not include fields for metadata.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> destinationEncryptionContext = new java.util.HashMap<String, String>();

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to decrypt the
     * ciphertext before it is reencrypted. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the algorithm used for
     * symmetric KMS keys.
     * </p>
     * <p>
     * Specify the same algorithm that was used to encrypt the ciphertext. If
     * you specify a different algorithm, the decrypt attempt fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     */
    private String sourceEncryptionAlgorithm;

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to reecrypt the data
     * after it has decrypted it. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the encryption algorithm used
     * for symmetric KMS keys.
     * </p>
     * <p>
     * This parameter is required only when the destination KMS key is an
     * asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     */
    private String destinationEncryptionAlgorithm;

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> grantTokens = new java.util.ArrayList<String>();

    /**
     * <p>
     * Ciphertext of the data to reencrypt.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         Ciphertext of the data to reencrypt.
     *         </p>
     */
    public java.nio.ByteBuffer getCiphertextBlob() {
        return ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext of the data to reencrypt.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            Ciphertext of the data to reencrypt.
     *            </p>
     */
    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext of the data to reencrypt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            Ciphertext of the data to reencrypt.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context to use to decrypt the ciphertext. Enter
     * the same encryption context that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the encryption context to use to decrypt the
     *         ciphertext. Enter the same encryption context that was used to
     *         encrypt the ciphertext.
     *         </p>
     *         <p>
     *         An <i>encryption context</i> is a collection of non-secret
     *         key-value pairs that represents additional authenticated data.
     *         When you use an encryption context to encrypt data, you must
     *         specify the same (an exact case-sensitive match) encryption
     *         context to decrypt the data. An encryption context is optional
     *         when encrypting with a symmetric KMS key, but it is highly
     *         recommended.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *         >Encryption Context</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, String> getSourceEncryptionContext() {
        return sourceEncryptionContext;
    }

    /**
     * <p>
     * Specifies the encryption context to use to decrypt the ciphertext. Enter
     * the same encryption context that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param sourceEncryptionContext <p>
     *            Specifies the encryption context to use to decrypt the
     *            ciphertext. Enter the same encryption context that was used to
     *            encrypt the ciphertext.
     *            </p>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represents additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is optional
     *            when encrypting with a symmetric KMS key, but it is highly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setSourceEncryptionContext(java.util.Map<String, String> sourceEncryptionContext) {
        this.sourceEncryptionContext = sourceEncryptionContext;
    }

    /**
     * <p>
     * Specifies the encryption context to use to decrypt the ciphertext. Enter
     * the same encryption context that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEncryptionContext <p>
     *            Specifies the encryption context to use to decrypt the
     *            ciphertext. Enter the same encryption context that was used to
     *            encrypt the ciphertext.
     *            </p>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represents additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is optional
     *            when encrypting with a symmetric KMS key, but it is highly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest withSourceEncryptionContext(
            java.util.Map<String, String> sourceEncryptionContext) {
        this.sourceEncryptionContext = sourceEncryptionContext;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context to use to decrypt the ciphertext. Enter
     * the same encryption context that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into SourceEncryptionContext
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into SourceEncryptionContext.
     * @param value The corresponding value of the entry to be added into
     *            SourceEncryptionContext.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest addSourceEncryptionContextEntry(String key, String value) {
        if (null == this.sourceEncryptionContext) {
            this.sourceEncryptionContext = new java.util.HashMap<String, String>();
        }
        if (this.sourceEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.sourceEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SourceEncryptionContext.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ReEncryptRequest clearSourceEncryptionContextEntries() {
        this.sourceEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Specifies the KMS key that KMS will use to decrypt the ciphertext before
     * it is re-encrypted. Enter a key ID of the KMS key that was used to
     * encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key. If you used a symmetric KMS key, KMS can get the
     * KMS key from metadata that it adds to the symmetric ciphertext blob.
     * However, it is always recommended as a best practice. This practice
     * ensures that you use the KMS key that you intend.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Specifies the KMS key that KMS will use to decrypt the ciphertext
     *         before it is re-encrypted. Enter a key ID of the KMS key that was
     *         used to encrypt the ciphertext.
     *         </p>
     *         <p>
     *         This parameter is required only when the ciphertext was encrypted
     *         under an asymmetric KMS key. If you used a symmetric KMS key, KMS
     *         can get the KMS key from metadata that it adds to the symmetric
     *         ciphertext blob. However, it is always recommended as a best
     *         practice. This practice ensures that you use the KMS key that you
     *         intend.
     *         </p>
     *         <p>
     *         To specify a KMS key, use its key ID, key ARN, alias name, or
     *         alias ARN. When using an alias name, prefix it with
     *         <code>"alias/"</code>. To specify a KMS key in a different Amazon
     *         Web Services account, you must use the key ARN or alias ARN.
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
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a>
     *         or <a>DescribeKey</a>. To get the alias name and alias ARN, use
     *         <a>ListAliases</a>.
     *         </p>
     */
    public String getSourceKeyId() {
        return sourceKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key that KMS will use to decrypt the ciphertext before
     * it is re-encrypted. Enter a key ID of the KMS key that was used to
     * encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key. If you used a symmetric KMS key, KMS can get the
     * KMS key from metadata that it adds to the symmetric ciphertext blob.
     * However, it is always recommended as a best practice. This practice
     * ensures that you use the KMS key that you intend.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param sourceKeyId <p>
     *            Specifies the KMS key that KMS will use to decrypt the
     *            ciphertext before it is re-encrypted. Enter a key ID of the
     *            KMS key that was used to encrypt the ciphertext.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric KMS key. If you used a symmetric
     *            KMS key, KMS can get the KMS key from metadata that it adds to
     *            the symmetric ciphertext blob. However, it is always
     *            recommended as a best practice. This practice ensures that you
     *            use the KMS key that you intend.
     *            </p>
     *            <p>
     *            To specify a KMS key, use its key ID, key ARN, alias name, or
     *            alias ARN. When using an alias name, prefix it with
     *            <code>"alias/"</code>. To specify a KMS key in a different
     *            Amazon Web Services account, you must use the key ARN or alias
     *            ARN.
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
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name
     *            and alias ARN, use <a>ListAliases</a>.
     *            </p>
     */
    public void setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key that KMS will use to decrypt the ciphertext before
     * it is re-encrypted. Enter a key ID of the KMS key that was used to
     * encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key. If you used a symmetric KMS key, KMS can get the
     * KMS key from metadata that it adds to the symmetric ciphertext blob.
     * However, it is always recommended as a best practice. This practice
     * ensures that you use the KMS key that you intend.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param sourceKeyId <p>
     *            Specifies the KMS key that KMS will use to decrypt the
     *            ciphertext before it is re-encrypted. Enter a key ID of the
     *            KMS key that was used to encrypt the ciphertext.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric KMS key. If you used a symmetric
     *            KMS key, KMS can get the KMS key from metadata that it adds to
     *            the symmetric ciphertext blob. However, it is always
     *            recommended as a best practice. This practice ensures that you
     *            use the KMS key that you intend.
     *            </p>
     *            <p>
     *            To specify a KMS key, use its key ID, key ARN, alias name, or
     *            alias ARN. When using an alias name, prefix it with
     *            <code>"alias/"</code>. To specify a KMS key in a different
     *            Amazon Web Services account, you must use the key ARN or alias
     *            ARN.
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
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name
     *            and alias ARN, use <a>ListAliases</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest withSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the KMS key that is used to reencrypt the data.
     * Specify a symmetric or asymmetric KMS key with a <code>KeyUsage</code>
     * value of <code>ENCRYPT_DECRYPT</code>. To find the <code>KeyUsage</code>
     * value of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A unique identifier for the KMS key that is used to reencrypt the
     *         data. Specify a symmetric or asymmetric KMS key with a
     *         <code>KeyUsage</code> value of <code>ENCRYPT_DECRYPT</code>. To
     *         find the <code>KeyUsage</code> value of a KMS key, use the
     *         <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To specify a KMS key, use its key ID, key ARN, alias name, or
     *         alias ARN. When using an alias name, prefix it with
     *         <code>"alias/"</code>. To specify a KMS key in a different Amazon
     *         Web Services account, you must use the key ARN or alias ARN.
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
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a>
     *         or <a>DescribeKey</a>. To get the alias name and alias ARN, use
     *         <a>ListAliases</a>.
     *         </p>
     */
    public String getDestinationKeyId() {
        return destinationKeyId;
    }

    /**
     * <p>
     * A unique identifier for the KMS key that is used to reencrypt the data.
     * Specify a symmetric or asymmetric KMS key with a <code>KeyUsage</code>
     * value of <code>ENCRYPT_DECRYPT</code>. To find the <code>KeyUsage</code>
     * value of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param destinationKeyId <p>
     *            A unique identifier for the KMS key that is used to reencrypt
     *            the data. Specify a symmetric or asymmetric KMS key with a
     *            <code>KeyUsage</code> value of <code>ENCRYPT_DECRYPT</code>.
     *            To find the <code>KeyUsage</code> value of a KMS key, use the
     *            <a>DescribeKey</a> operation.
     *            </p>
     *            <p>
     *            To specify a KMS key, use its key ID, key ARN, alias name, or
     *            alias ARN. When using an alias name, prefix it with
     *            <code>"alias/"</code>. To specify a KMS key in a different
     *            Amazon Web Services account, you must use the key ARN or alias
     *            ARN.
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
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name
     *            and alias ARN, use <a>ListAliases</a>.
     *            </p>
     */
    public void setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
    }

    /**
     * <p>
     * A unique identifier for the KMS key that is used to reencrypt the data.
     * Specify a symmetric or asymmetric KMS key with a <code>KeyUsage</code>
     * value of <code>ENCRYPT_DECRYPT</code>. To find the <code>KeyUsage</code>
     * value of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN.
     * When using an alias name, prefix it with <code>"alias/"</code>. To
     * specify a KMS key in a different Amazon Web Services account, you must
     * use the key ARN or alias ARN.
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
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param destinationKeyId <p>
     *            A unique identifier for the KMS key that is used to reencrypt
     *            the data. Specify a symmetric or asymmetric KMS key with a
     *            <code>KeyUsage</code> value of <code>ENCRYPT_DECRYPT</code>.
     *            To find the <code>KeyUsage</code> value of a KMS key, use the
     *            <a>DescribeKey</a> operation.
     *            </p>
     *            <p>
     *            To specify a KMS key, use its key ID, key ARN, alias name, or
     *            alias ARN. When using an alias name, prefix it with
     *            <code>"alias/"</code>. To specify a KMS key in a different
     *            Amazon Web Services account, you must use the key ARN or alias
     *            ARN.
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
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name
     *            and alias ARN, use <a>ListAliases</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest withDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies that encryption context to use when the reencrypting the data.
     * </p>
     * <p>
     * A destination encryption context is valid only when the destination KMS
     * key is a symmetric KMS key. The standard ciphertext format for asymmetric
     * KMS keys does not include fields for metadata.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies that encryption context to use when the reencrypting
     *         the data.
     *         </p>
     *         <p>
     *         A destination encryption context is valid only when the
     *         destination KMS key is a symmetric KMS key. The standard
     *         ciphertext format for asymmetric KMS keys does not include fields
     *         for metadata.
     *         </p>
     *         <p>
     *         An <i>encryption context</i> is a collection of non-secret
     *         key-value pairs that represents additional authenticated data.
     *         When you use an encryption context to encrypt data, you must
     *         specify the same (an exact case-sensitive match) encryption
     *         context to decrypt the data. An encryption context is optional
     *         when encrypting with a symmetric KMS key, but it is highly
     *         recommended.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *         >Encryption Context</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, String> getDestinationEncryptionContext() {
        return destinationEncryptionContext;
    }

    /**
     * <p>
     * Specifies that encryption context to use when the reencrypting the data.
     * </p>
     * <p>
     * A destination encryption context is valid only when the destination KMS
     * key is a symmetric KMS key. The standard ciphertext format for asymmetric
     * KMS keys does not include fields for metadata.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param destinationEncryptionContext <p>
     *            Specifies that encryption context to use when the reencrypting
     *            the data.
     *            </p>
     *            <p>
     *            A destination encryption context is valid only when the
     *            destination KMS key is a symmetric KMS key. The standard
     *            ciphertext format for asymmetric KMS keys does not include
     *            fields for metadata.
     *            </p>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represents additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is optional
     *            when encrypting with a symmetric KMS key, but it is highly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setDestinationEncryptionContext(
            java.util.Map<String, String> destinationEncryptionContext) {
        this.destinationEncryptionContext = destinationEncryptionContext;
    }

    /**
     * <p>
     * Specifies that encryption context to use when the reencrypting the data.
     * </p>
     * <p>
     * A destination encryption context is valid only when the destination KMS
     * key is a symmetric KMS key. The standard ciphertext format for asymmetric
     * KMS keys does not include fields for metadata.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationEncryptionContext <p>
     *            Specifies that encryption context to use when the reencrypting
     *            the data.
     *            </p>
     *            <p>
     *            A destination encryption context is valid only when the
     *            destination KMS key is a symmetric KMS key. The standard
     *            ciphertext format for asymmetric KMS keys does not include
     *            fields for metadata.
     *            </p>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represents additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is optional
     *            when encrypting with a symmetric KMS key, but it is highly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest withDestinationEncryptionContext(
            java.util.Map<String, String> destinationEncryptionContext) {
        this.destinationEncryptionContext = destinationEncryptionContext;
        return this;
    }

    /**
     * <p>
     * Specifies that encryption context to use when the reencrypting the data.
     * </p>
     * <p>
     * A destination encryption context is valid only when the destination KMS
     * key is a symmetric KMS key. The standard ciphertext format for asymmetric
     * KMS keys does not include fields for metadata.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric KMS key,
     * but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into DestinationEncryptionContext
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            DestinationEncryptionContext.
     * @param value The corresponding value of the entry to be added into
     *            DestinationEncryptionContext.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest addDestinationEncryptionContextEntry(String key, String value) {
        if (null == this.destinationEncryptionContext) {
            this.destinationEncryptionContext = new java.util.HashMap<String, String>();
        }
        if (this.destinationEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.destinationEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DestinationEncryptionContext.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ReEncryptRequest clearDestinationEncryptionContextEntries() {
        this.destinationEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to decrypt the
     * ciphertext before it is reencrypted. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the algorithm used for
     * symmetric KMS keys.
     * </p>
     * <p>
     * Specify the same algorithm that was used to encrypt the ciphertext. If
     * you specify a different algorithm, the decrypt attempt fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @return <p>
     *         Specifies the encryption algorithm that KMS will use to decrypt
     *         the ciphertext before it is reencrypted. The default value,
     *         <code>SYMMETRIC_DEFAULT</code>, represents the algorithm used for
     *         symmetric KMS keys.
     *         </p>
     *         <p>
     *         Specify the same algorithm that was used to encrypt the
     *         ciphertext. If you specify a different algorithm, the decrypt
     *         attempt fails.
     *         </p>
     *         <p>
     *         This parameter is required only when the ciphertext was encrypted
     *         under an asymmetric KMS key.
     *         </p>
     * @see EncryptionAlgorithmSpec
     */
    public String getSourceEncryptionAlgorithm() {
        return sourceEncryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to decrypt the
     * ciphertext before it is reencrypted. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the algorithm used for
     * symmetric KMS keys.
     * </p>
     * <p>
     * Specify the same algorithm that was used to encrypt the ciphertext. If
     * you specify a different algorithm, the decrypt attempt fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param sourceEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            decrypt the ciphertext before it is reencrypted. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            Specify the same algorithm that was used to encrypt the
     *            ciphertext. If you specify a different algorithm, the decrypt
     *            attempt fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric KMS key.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to decrypt the
     * ciphertext before it is reencrypted. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the algorithm used for
     * symmetric KMS keys.
     * </p>
     * <p>
     * Specify the same algorithm that was used to encrypt the ciphertext. If
     * you specify a different algorithm, the decrypt attempt fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param sourceEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            decrypt the ciphertext before it is reencrypted. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            Specify the same algorithm that was used to encrypt the
     *            ciphertext. If you specify a different algorithm, the decrypt
     *            attempt fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public ReEncryptRequest withSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to decrypt the
     * ciphertext before it is reencrypted. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the algorithm used for
     * symmetric KMS keys.
     * </p>
     * <p>
     * Specify the same algorithm that was used to encrypt the ciphertext. If
     * you specify a different algorithm, the decrypt attempt fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param sourceEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            decrypt the ciphertext before it is reencrypted. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            Specify the same algorithm that was used to encrypt the
     *            ciphertext. If you specify a different algorithm, the decrypt
     *            attempt fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric KMS key.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setSourceEncryptionAlgorithm(EncryptionAlgorithmSpec sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm.toString();
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to decrypt the
     * ciphertext before it is reencrypted. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the algorithm used for
     * symmetric KMS keys.
     * </p>
     * <p>
     * Specify the same algorithm that was used to encrypt the ciphertext. If
     * you specify a different algorithm, the decrypt attempt fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param sourceEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            decrypt the ciphertext before it is reencrypted. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            Specify the same algorithm that was used to encrypt the
     *            ciphertext. If you specify a different algorithm, the decrypt
     *            attempt fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public ReEncryptRequest withSourceEncryptionAlgorithm(
            EncryptionAlgorithmSpec sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to reecrypt the data
     * after it has decrypted it. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the encryption algorithm used
     * for symmetric KMS keys.
     * </p>
     * <p>
     * This parameter is required only when the destination KMS key is an
     * asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @return <p>
     *         Specifies the encryption algorithm that KMS will use to reecrypt
     *         the data after it has decrypted it. The default value,
     *         <code>SYMMETRIC_DEFAULT</code>, represents the encryption
     *         algorithm used for symmetric KMS keys.
     *         </p>
     *         <p>
     *         This parameter is required only when the destination KMS key is
     *         an asymmetric KMS key.
     *         </p>
     * @see EncryptionAlgorithmSpec
     */
    public String getDestinationEncryptionAlgorithm() {
        return destinationEncryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to reecrypt the data
     * after it has decrypted it. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the encryption algorithm used
     * for symmetric KMS keys.
     * </p>
     * <p>
     * This parameter is required only when the destination KMS key is an
     * asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param destinationEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            reecrypt the data after it has decrypted it. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            encryption algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            This parameter is required only when the destination KMS key
     *            is an asymmetric KMS key.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setDestinationEncryptionAlgorithm(String destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to reecrypt the data
     * after it has decrypted it. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the encryption algorithm used
     * for symmetric KMS keys.
     * </p>
     * <p>
     * This parameter is required only when the destination KMS key is an
     * asymmetric KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param destinationEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            reecrypt the data after it has decrypted it. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            encryption algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            This parameter is required only when the destination KMS key
     *            is an asymmetric KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public ReEncryptRequest withDestinationEncryptionAlgorithm(String destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to reecrypt the data
     * after it has decrypted it. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the encryption algorithm used
     * for symmetric KMS keys.
     * </p>
     * <p>
     * This parameter is required only when the destination KMS key is an
     * asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param destinationEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            reecrypt the data after it has decrypted it. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            encryption algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            This parameter is required only when the destination KMS key
     *            is an asymmetric KMS key.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setDestinationEncryptionAlgorithm(
            EncryptionAlgorithmSpec destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm.toString();
    }

    /**
     * <p>
     * Specifies the encryption algorithm that KMS will use to reecrypt the data
     * after it has decrypted it. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the encryption algorithm used
     * for symmetric KMS keys.
     * </p>
     * <p>
     * This parameter is required only when the destination KMS key is an
     * asymmetric KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param destinationEncryptionAlgorithm <p>
     *            Specifies the encryption algorithm that KMS will use to
     *            reecrypt the data after it has decrypted it. The default
     *            value, <code>SYMMETRIC_DEFAULT</code>, represents the
     *            encryption algorithm used for symmetric KMS keys.
     *            </p>
     *            <p>
     *            This parameter is required only when the destination KMS key
     *            is an asymmetric KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public ReEncryptRequest withDestinationEncryptionAlgorithm(
            EncryptionAlgorithmSpec destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of grant tokens.
     *         </p>
     *         <p>
     *         Use a grant token when your permission to call this operation
     *         comes from a new grant that has not yet achieved <i>eventual
     *         consistency</i>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *         >Grant token</a> and <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *         >Using a grant token</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getGrantTokens() {
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            Use a grant token when your permission to call this operation
     *            comes from a new grant that has not yet achieved <i>eventual
     *            consistency</i>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *            >Using a grant token</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new java.util.ArrayList<String>(grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            Use a grant token when your permission to call this operation
     *            comes from a new grant that has not yet achieved <i>eventual
     *            consistency</i>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *            >Using a grant token</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) {
            this.grantTokens = new java.util.ArrayList<String>(grantTokens.length);
        }
        for (String value : grantTokens) {
            this.grantTokens.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from
     * a new grant that has not yet achieved <i>eventual consistency</i>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     * >Grant token</a> and <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     * >Using a grant token</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            Use a grant token when your permission to call this operation
     *            comes from a new grant that has not yet achieved <i>eventual
     *            consistency</i>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token"
     *            >Grant token</a> and <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token"
     *            >Using a grant token</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReEncryptRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
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
        if (getCiphertextBlob() != null)
            sb.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        if (getSourceEncryptionContext() != null)
            sb.append("SourceEncryptionContext: " + getSourceEncryptionContext() + ",");
        if (getSourceKeyId() != null)
            sb.append("SourceKeyId: " + getSourceKeyId() + ",");
        if (getDestinationKeyId() != null)
            sb.append("DestinationKeyId: " + getDestinationKeyId() + ",");
        if (getDestinationEncryptionContext() != null)
            sb.append("DestinationEncryptionContext: " + getDestinationEncryptionContext() + ",");
        if (getSourceEncryptionAlgorithm() != null)
            sb.append("SourceEncryptionAlgorithm: " + getSourceEncryptionAlgorithm() + ",");
        if (getDestinationEncryptionAlgorithm() != null)
            sb.append("DestinationEncryptionAlgorithm: " + getDestinationEncryptionAlgorithm()
                    + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceEncryptionContext() == null) ? 0 : getSourceEncryptionContext()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSourceKeyId() == null) ? 0 : getSourceKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationKeyId() == null) ? 0 : getDestinationKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationEncryptionContext() == null) ? 0
                        : getDestinationEncryptionContext().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceEncryptionAlgorithm() == null) ? 0 : getSourceEncryptionAlgorithm()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationEncryptionAlgorithm() == null) ? 0
                        : getDestinationEncryptionAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReEncryptRequest == false)
            return false;
        ReEncryptRequest other = (ReEncryptRequest) obj;

        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null)
            return false;
        if (other.getCiphertextBlob() != null
                && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false)
            return false;
        if (other.getSourceEncryptionContext() == null ^ this.getSourceEncryptionContext() == null)
            return false;
        if (other.getSourceEncryptionContext() != null
                && other.getSourceEncryptionContext().equals(this.getSourceEncryptionContext()) == false)
            return false;
        if (other.getSourceKeyId() == null ^ this.getSourceKeyId() == null)
            return false;
        if (other.getSourceKeyId() != null
                && other.getSourceKeyId().equals(this.getSourceKeyId()) == false)
            return false;
        if (other.getDestinationKeyId() == null ^ this.getDestinationKeyId() == null)
            return false;
        if (other.getDestinationKeyId() != null
                && other.getDestinationKeyId().equals(this.getDestinationKeyId()) == false)
            return false;
        if (other.getDestinationEncryptionContext() == null
                ^ this.getDestinationEncryptionContext() == null)
            return false;
        if (other.getDestinationEncryptionContext() != null
                && other.getDestinationEncryptionContext().equals(
                        this.getDestinationEncryptionContext()) == false)
            return false;
        if (other.getSourceEncryptionAlgorithm() == null
                ^ this.getSourceEncryptionAlgorithm() == null)
            return false;
        if (other.getSourceEncryptionAlgorithm() != null
                && other.getSourceEncryptionAlgorithm().equals(this.getSourceEncryptionAlgorithm()) == false)
            return false;
        if (other.getDestinationEncryptionAlgorithm() == null
                ^ this.getDestinationEncryptionAlgorithm() == null)
            return false;
        if (other.getDestinationEncryptionAlgorithm() != null
                && other.getDestinationEncryptionAlgorithm().equals(
                        this.getDestinationEncryptionAlgorithm()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        return true;
    }
}
