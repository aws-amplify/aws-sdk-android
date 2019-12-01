/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Decrypts ciphertext that was encrypted by a AWS KMS customer master key (CMK)
 * using any of the following operations:
 * </p>
 * <ul>
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
 * <li>
 * <p>
 * <a>GenerateDataKeyWithoutPlaintext</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyPairWithoutPlaintext</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use this operation to decrypt ciphertext that was encrypted under a
 * symmetric or asymmetric CMK. When the CMK is asymmetric, you must specify the
 * CMK and the encryption algorithm that was used to encrypt the ciphertext. For
 * information about symmetric and asymmetric CMKs, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
 * >Using Symmetric and Asymmetric CMKs</a> in the <i>AWS Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * The Decrypt operation also decrypts ciphertext that was encrypted outside of
 * AWS KMS by the public key in an AWS KMS asymmetric CMK. However, it cannot
 * decrypt ciphertext produced by other libraries, such as the <a
 * href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/">AWS
 * Encryption SDK</a> or <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html"
 * >Amazon S3 client-side encryption</a>. These libraries return a ciphertext
 * format that is incompatible with AWS KMS.
 * </p>
 * <p>
 * If the ciphertext was encrypted under a symmetric CMK, you do not need to
 * specify the CMK or the encryption algorithm. AWS KMS can get this information
 * from metadata that it adds to the symmetric ciphertext blob. However, if you
 * prefer, you can specify the <code>KeyId</code> to ensure that a particular
 * CMK is used to decrypt the ciphertext. If you specify a different CMK than
 * the one used to encrypt the ciphertext, the <code>Decrypt</code> operation
 * fails.
 * </p>
 * <p>
 * Whenever possible, use key policies to give users permission to call the
 * Decrypt operation on a particular CMK, instead of using IAM policies.
 * Otherwise, you might create an IAM user policy that gives the user Decrypt
 * permission on all CMKs. This user could decrypt ciphertext that was encrypted
 * by CMKs in other accounts if the key policy for the cross-account CMK permits
 * it. If you must use an IAM policy for <code>Decrypt</code> permissions, limit
 * the user to particular CMKs or particular trusted accounts.
 * </p>
 * <p>
 * The CMK that you use for this operation must be in a compatible key state.
 * For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
 * Management Service Developer Guide</i>.
 * </p>
 */
public class DecryptRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextBlob;

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An
     * encryption context is valid only for cryptographic operations with a
     * symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     * uses do not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric CMK, but
     * it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> encryptionContext = new java.util.HashMap<String, String>();

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> grantTokens = new java.util.ArrayList<String>();

    /**
     * <p>
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt
     * the ciphertext. Enter a key ID of the CMK that was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code>
     * operation succeeds only if the specified CMK was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. Otherwise, AWS KMS uses the metadata that it adds to
     * the ciphertext blob to determine which CMK was used to encrypt the
     * ciphertext. However, you can use this parameter to ensure that a
     * particular CMK (of any kind) is used to decrypt the ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the
     * ciphertext. Specify the same algorithm that was used to encrypt the data.
     * If you specify a different algorithm, the <code>Decrypt</code> operation
     * fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. The default value, <code>SYMMETRIC_DEFAULT</code>,
     * represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     */
    private String encryptionAlgorithm;

    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         Ciphertext to be decrypted. The blob includes metadata.
     *         </p>
     */
    public java.nio.ByteBuffer getCiphertextBlob() {
        return ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            Ciphertext to be decrypted. The blob includes metadata.
     *            </p>
     */
    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob <p>
     *            Ciphertext to be decrypted. The blob includes metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptRequest withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An
     * encryption context is valid only for cryptographic operations with a
     * symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     * uses do not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric CMK, but
     * it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the encryption context to use when decrypting the data.
     *         An encryption context is valid only for cryptographic operations
     *         with a symmetric CMK. The standard asymmetric encryption
     *         algorithms that AWS KMS uses do not support an encryption
     *         context.
     *         </p>
     *         <p>
     *         An <i>encryption context</i> is a collection of non-secret
     *         key-value pairs that represents additional authenticated data.
     *         When you use an encryption context to encrypt data, you must
     *         specify the same (an exact case-sensitive match) encryption
     *         context to decrypt the data. An encryption context is optional
     *         when encrypting with a symmetric CMK, but it is highly
     *         recommended.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *         >Encryption Context</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, String> getEncryptionContext() {
        return encryptionContext;
    }

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An
     * encryption context is valid only for cryptographic operations with a
     * symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     * uses do not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric CMK, but
     * it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param encryptionContext <p>
     *            Specifies the encryption context to use when decrypting the
     *            data. An encryption context is valid only for cryptographic
     *            operations with a symmetric CMK. The standard asymmetric
     *            encryption algorithms that AWS KMS uses do not support an
     *            encryption context.
     *            </p>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represents additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is optional
     *            when encrypting with a symmetric CMK, but it is highly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setEncryptionContext(java.util.Map<String, String> encryptionContext) {
        this.encryptionContext = encryptionContext;
    }

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An
     * encryption context is valid only for cryptographic operations with a
     * symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     * uses do not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric CMK, but
     * it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionContext <p>
     *            Specifies the encryption context to use when decrypting the
     *            data. An encryption context is valid only for cryptographic
     *            operations with a symmetric CMK. The standard asymmetric
     *            encryption algorithms that AWS KMS uses do not support an
     *            encryption context.
     *            </p>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represents additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is optional
     *            when encrypting with a symmetric CMK, but it is highly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption Context</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptRequest withEncryptionContext(java.util.Map<String, String> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An
     * encryption context is valid only for cryptographic operations with a
     * symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     * uses do not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represents additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is optional when encrypting with a symmetric CMK, but
     * it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into EncryptionContext parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into EncryptionContext.
     * @param value The corresponding value of the entry to be added into
     *            EncryptionContext.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptRequest addEncryptionContextEntry(String key, String value) {
        if (null == this.encryptionContext) {
            this.encryptionContext = new java.util.HashMap<String, String>();
        }
        if (this.encryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.encryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContext.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DecryptRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of grant tokens.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *         >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
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
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
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
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
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
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptRequest withGrantTokens(String... grantTokens) {
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
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
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
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt
     * the ciphertext. Enter a key ID of the CMK that was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code>
     * operation succeeds only if the specified CMK was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. Otherwise, AWS KMS uses the metadata that it adds to
     * the ciphertext blob to determine which CMK was used to encrypt the
     * ciphertext. However, you can use this parameter to ensure that a
     * particular CMK (of any kind) is used to decrypt the ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Specifies the customer master key (CMK) that AWS KMS will use to
     *         decrypt the ciphertext. Enter a key ID of the CMK that was used
     *         to encrypt the ciphertext.
     *         </p>
     *         <p>
     *         If you specify a <code>KeyId</code> value, the
     *         <code>Decrypt</code> operation succeeds only if the specified CMK
     *         was used to encrypt the ciphertext.
     *         </p>
     *         <p>
     *         This parameter is required only when the ciphertext was encrypted
     *         under an asymmetric CMK. Otherwise, AWS KMS uses the metadata
     *         that it adds to the ciphertext blob to determine which CMK was
     *         used to encrypt the ciphertext. However, you can use this
     *         parameter to ensure that a particular CMK (of any kind) is used
     *         to decrypt the ciphertext.
     *         </p>
     *         <p>
     *         To specify a CMK, use its key ID, Amazon Resource Name (ARN),
     *         alias name, or alias ARN. When using an alias name, prefix it
     *         with <code>"alias/"</code>.
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
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     *         <a>DescribeKey</a>. To get the alias name and alias ARN, use
     *         <a>ListAliases</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt
     * the ciphertext. Enter a key ID of the CMK that was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code>
     * operation succeeds only if the specified CMK was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. Otherwise, AWS KMS uses the metadata that it adds to
     * the ciphertext blob to determine which CMK was used to encrypt the
     * ciphertext. However, you can use this parameter to ensure that a
     * particular CMK (of any kind) is used to decrypt the ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>. To get the alias name and alias ARN, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Specifies the customer master key (CMK) that AWS KMS will use
     *            to decrypt the ciphertext. Enter a key ID of the CMK that was
     *            used to encrypt the ciphertext.
     *            </p>
     *            <p>
     *            If you specify a <code>KeyId</code> value, the
     *            <code>Decrypt</code> operation succeeds only if the specified
     *            CMK was used to encrypt the ciphertext.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric CMK. Otherwise, AWS KMS uses the
     *            metadata that it adds to the ciphertext blob to determine
     *            which CMK was used to encrypt the ciphertext. However, you can
     *            use this parameter to ensure that a particular CMK (of any
     *            kind) is used to decrypt the ciphertext.
     *            </p>
     *            <p>
     *            To specify a CMK, use its key ID, Amazon Resource Name (ARN),
     *            alias name, or alias ARN. When using an alias name, prefix it
     *            with <code>"alias/"</code>.
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
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>. To get the alias name and alias ARN,
     *            use <a>ListAliases</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt
     * the ciphertext. Enter a key ID of the CMK that was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code>
     * operation succeeds only if the specified CMK was used to encrypt the
     * ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. Otherwise, AWS KMS uses the metadata that it adds to
     * the ciphertext blob to determine which CMK was used to encrypt the
     * ciphertext. However, you can use this parameter to ensure that a
     * particular CMK (of any kind) is used to decrypt the ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
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
     * @param keyId <p>
     *            Specifies the customer master key (CMK) that AWS KMS will use
     *            to decrypt the ciphertext. Enter a key ID of the CMK that was
     *            used to encrypt the ciphertext.
     *            </p>
     *            <p>
     *            If you specify a <code>KeyId</code> value, the
     *            <code>Decrypt</code> operation succeeds only if the specified
     *            CMK was used to encrypt the ciphertext.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric CMK. Otherwise, AWS KMS uses the
     *            metadata that it adds to the ciphertext blob to determine
     *            which CMK was used to encrypt the ciphertext. However, you can
     *            use this parameter to ensure that a particular CMK (of any
     *            kind) is used to decrypt the ciphertext.
     *            </p>
     *            <p>
     *            To specify a CMK, use its key ID, Amazon Resource Name (ARN),
     *            alias name, or alias ARN. When using an alias name, prefix it
     *            with <code>"alias/"</code>.
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
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>. To get the alias name and alias ARN,
     *            use <a>ListAliases</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecryptRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the
     * ciphertext. Specify the same algorithm that was used to encrypt the data.
     * If you specify a different algorithm, the <code>Decrypt</code> operation
     * fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. The default value, <code>SYMMETRIC_DEFAULT</code>,
     * represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @return <p>
     *         Specifies the encryption algorithm that will be used to decrypt
     *         the ciphertext. Specify the same algorithm that was used to
     *         encrypt the data. If you specify a different algorithm, the
     *         <code>Decrypt</code> operation fails.
     *         </p>
     *         <p>
     *         This parameter is required only when the ciphertext was encrypted
     *         under an asymmetric CMK. The default value,
     *         <code>SYMMETRIC_DEFAULT</code>, represents the only supported
     *         algorithm that is valid for symmetric CMKs.
     *         </p>
     * @see EncryptionAlgorithmSpec
     */
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the
     * ciphertext. Specify the same algorithm that was used to encrypt the data.
     * If you specify a different algorithm, the <code>Decrypt</code> operation
     * fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. The default value, <code>SYMMETRIC_DEFAULT</code>,
     * represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            Specifies the encryption algorithm that will be used to
     *            decrypt the ciphertext. Specify the same algorithm that was
     *            used to encrypt the data. If you specify a different
     *            algorithm, the <code>Decrypt</code> operation fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric CMK. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, represents the only supported
     *            algorithm that is valid for symmetric CMKs.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the
     * ciphertext. Specify the same algorithm that was used to encrypt the data.
     * If you specify a different algorithm, the <code>Decrypt</code> operation
     * fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. The default value, <code>SYMMETRIC_DEFAULT</code>,
     * represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            Specifies the encryption algorithm that will be used to
     *            decrypt the ciphertext. Specify the same algorithm that was
     *            used to encrypt the data. If you specify a different
     *            algorithm, the <code>Decrypt</code> operation fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric CMK. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, represents the only supported
     *            algorithm that is valid for symmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public DecryptRequest withEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the
     * ciphertext. Specify the same algorithm that was used to encrypt the data.
     * If you specify a different algorithm, the <code>Decrypt</code> operation
     * fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. The default value, <code>SYMMETRIC_DEFAULT</code>,
     * represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            Specifies the encryption algorithm that will be used to
     *            decrypt the ciphertext. Specify the same algorithm that was
     *            used to encrypt the data. If you specify a different
     *            algorithm, the <code>Decrypt</code> operation fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric CMK. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, represents the only supported
     *            algorithm that is valid for symmetric CMKs.
     *            </p>
     * @see EncryptionAlgorithmSpec
     */
    public void setEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the
     * ciphertext. Specify the same algorithm that was used to encrypt the data.
     * If you specify a different algorithm, the <code>Decrypt</code> operation
     * fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under
     * an asymmetric CMK. The default value, <code>SYMMETRIC_DEFAULT</code>,
     * represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYMMETRIC_DEFAULT, RSAES_OAEP_SHA_1,
     * RSAES_OAEP_SHA_256
     *
     * @param encryptionAlgorithm <p>
     *            Specifies the encryption algorithm that will be used to
     *            decrypt the ciphertext. Specify the same algorithm that was
     *            used to encrypt the data. If you specify a different
     *            algorithm, the <code>Decrypt</code> operation fails.
     *            </p>
     *            <p>
     *            This parameter is required only when the ciphertext was
     *            encrypted under an asymmetric CMK. The default value,
     *            <code>SYMMETRIC_DEFAULT</code>, represents the only supported
     *            algorithm that is valid for symmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionAlgorithmSpec
     */
    public DecryptRequest withEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
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
        if (getEncryptionContext() != null)
            sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getEncryptionAlgorithm() != null)
            sb.append("EncryptionAlgorithm: " + getEncryptionAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode());
        hashCode = prime * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionAlgorithm() == null) ? 0 : getEncryptionAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecryptRequest == false)
            return false;
        DecryptRequest other = (DecryptRequest) obj;

        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null)
            return false;
        if (other.getCiphertextBlob() != null
                && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false)
            return false;
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null)
            return false;
        if (other.getEncryptionContext() != null
                && other.getEncryptionContext().equals(this.getEncryptionContext()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getEncryptionAlgorithm() == null ^ this.getEncryptionAlgorithm() == null)
            return false;
        if (other.getEncryptionAlgorithm() != null
                && other.getEncryptionAlgorithm().equals(this.getEncryptionAlgorithm()) == false)
            return false;
        return true;
    }
}
