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
 * Generates a unique asymmetric data key pair. The
 * <code>GenerateDataKeyPairWithoutPlaintext</code> operation returns a
 * plaintext public key and a copy of the private key that is encrypted under
 * the symmetric CMK you specify. Unlike <a>GenerateDataKeyPair</a>, this
 * operation does not return a plaintext private key.
 * </p>
 * <p>
 * To generate a data key pair, you must specify a symmetric customer master key
 * (CMK) to encrypt the private key in the data key pair. You cannot use an
 * asymmetric CMK. To get the type of your CMK, use the <code>KeySpec</code>
 * field in the <a>DescribeKey</a> response.
 * </p>
 * <p>
 * You can use the public key that
 * <code>GenerateDataKeyPairWithoutPlaintext</code> returns to encrypt data or
 * verify a signature outside of AWS KMS. Then, store the encrypted private key
 * with the data. When you are ready to decrypt data or sign a message, you can
 * use the <a>Decrypt</a> operation to decrypt the encrypted private key.
 * </p>
 * <p>
 * <code>GenerateDataKeyPairWithoutPlaintext</code> returns a unique data key
 * pair for each request. The bytes in the key are not related to the caller or
 * CMK that is used to encrypt the private key.
 * </p>
 * <p>
 * You can use the optional encryption context to add additional security to the
 * encryption operation. If you specify an <code>EncryptionContext</code>, you
 * must specify the same encryption context (a case-sensitive exact match) when
 * decrypting the encrypted data key. Otherwise, the request to decrypt fails
 * with an InvalidCiphertextException. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
 * >Encryption Context</a> in the <i>AWS Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * The CMK that you use for this operation must be in a compatible key state.
 * For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
 * Management Service Developer Guide</i>.
 * </p>
 */
public class GenerateDataKeyPairWithoutPlaintextRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the encryption context that will be used when encrypting the
     * private key in the data key pair.
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
     * Specifies the CMK that encrypts the private key in the data key pair. You
     * must specify a symmetric CMK. You cannot use an asymmetric CMK. To get
     * the type of your CMK, use the <a>DescribeKey</a> operation.
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
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt
     * and decrypt or to sign and verify (but not both), and the rule that
     * permits you to use ECC CMKs only to sign and verify, are not effective
     * outside of AWS KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     */
    private String keyPairSpec;

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
     * Specifies the encryption context that will be used when encrypting the
     * private key in the data key pair.
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
     *         Specifies the encryption context that will be used when
     *         encrypting the private key in the data key pair.
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
     * Specifies the encryption context that will be used when encrypting the
     * private key in the data key pair.
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
     *            Specifies the encryption context that will be used when
     *            encrypting the private key in the data key pair.
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
     * Specifies the encryption context that will be used when encrypting the
     * private key in the data key pair.
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
     *            Specifies the encryption context that will be used when
     *            encrypting the private key in the data key pair.
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
    public GenerateDataKeyPairWithoutPlaintextRequest withEncryptionContext(
            java.util.Map<String, String> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context that will be used when encrypting the
     * private key in the data key pair.
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
    public GenerateDataKeyPairWithoutPlaintextRequest addEncryptionContextEntry(String key,
            String value) {
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
    public GenerateDataKeyPairWithoutPlaintextRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Specifies the CMK that encrypts the private key in the data key pair. You
     * must specify a symmetric CMK. You cannot use an asymmetric CMK. To get
     * the type of your CMK, use the <a>DescribeKey</a> operation.
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
     *         Specifies the CMK that encrypts the private key in the data key
     *         pair. You must specify a symmetric CMK. You cannot use an
     *         asymmetric CMK. To get the type of your CMK, use the
     *         <a>DescribeKey</a> operation.
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
     * Specifies the CMK that encrypts the private key in the data key pair. You
     * must specify a symmetric CMK. You cannot use an asymmetric CMK. To get
     * the type of your CMK, use the <a>DescribeKey</a> operation.
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
     *            Specifies the CMK that encrypts the private key in the data
     *            key pair. You must specify a symmetric CMK. You cannot use an
     *            asymmetric CMK. To get the type of your CMK, use the
     *            <a>DescribeKey</a> operation.
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
     * Specifies the CMK that encrypts the private key in the data key pair. You
     * must specify a symmetric CMK. You cannot use an asymmetric CMK. To get
     * the type of your CMK, use the <a>DescribeKey</a> operation.
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
     *            Specifies the CMK that encrypts the private key in the data
     *            key pair. You must specify a symmetric CMK. You cannot use an
     *            asymmetric CMK. To get the type of your CMK, use the
     *            <a>DescribeKey</a> operation.
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
    public GenerateDataKeyPairWithoutPlaintextRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt
     * and decrypt or to sign and verify (but not both), and the rule that
     * permits you to use ECC CMKs only to sign and verify, are not effective
     * outside of AWS KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @return <p>
     *         Determines the type of data key pair that is generated.
     *         </p>
     *         <p>
     *         The AWS KMS rule that restricts the use of asymmetric RSA CMKs to
     *         encrypt and decrypt or to sign and verify (but not both), and the
     *         rule that permits you to use ECC CMKs only to sign and verify,
     *         are not effective outside of AWS KMS.
     *         </p>
     * @see DataKeyPairSpec
     */
    public String getKeyPairSpec() {
        return keyPairSpec;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt
     * and decrypt or to sign and verify (but not both), and the rule that
     * permits you to use ECC CMKs only to sign and verify, are not effective
     * outside of AWS KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The AWS KMS rule that restricts the use of asymmetric RSA CMKs
     *            to encrypt and decrypt or to sign and verify (but not both),
     *            and the rule that permits you to use ECC CMKs only to sign and
     *            verify, are not effective outside of AWS KMS.
     *            </p>
     * @see DataKeyPairSpec
     */
    public void setKeyPairSpec(String keyPairSpec) {
        this.keyPairSpec = keyPairSpec;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt
     * and decrypt or to sign and verify (but not both), and the rule that
     * permits you to use ECC CMKs only to sign and verify, are not effective
     * outside of AWS KMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The AWS KMS rule that restricts the use of asymmetric RSA CMKs
     *            to encrypt and decrypt or to sign and verify (but not both),
     *            and the rule that permits you to use ECC CMKs only to sign and
     *            verify, are not effective outside of AWS KMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataKeyPairSpec
     */
    public GenerateDataKeyPairWithoutPlaintextRequest withKeyPairSpec(String keyPairSpec) {
        this.keyPairSpec = keyPairSpec;
        return this;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt
     * and decrypt or to sign and verify (but not both), and the rule that
     * permits you to use ECC CMKs only to sign and verify, are not effective
     * outside of AWS KMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The AWS KMS rule that restricts the use of asymmetric RSA CMKs
     *            to encrypt and decrypt or to sign and verify (but not both),
     *            and the rule that permits you to use ECC CMKs only to sign and
     *            verify, are not effective outside of AWS KMS.
     *            </p>
     * @see DataKeyPairSpec
     */
    public void setKeyPairSpec(DataKeyPairSpec keyPairSpec) {
        this.keyPairSpec = keyPairSpec.toString();
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt
     * and decrypt or to sign and verify (but not both), and the rule that
     * permits you to use ECC CMKs only to sign and verify, are not effective
     * outside of AWS KMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The AWS KMS rule that restricts the use of asymmetric RSA CMKs
     *            to encrypt and decrypt or to sign and verify (but not both),
     *            and the rule that permits you to use ECC CMKs only to sign and
     *            verify, are not effective outside of AWS KMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataKeyPairSpec
     */
    public GenerateDataKeyPairWithoutPlaintextRequest withKeyPairSpec(DataKeyPairSpec keyPairSpec) {
        this.keyPairSpec = keyPairSpec.toString();
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
    public GenerateDataKeyPairWithoutPlaintextRequest withGrantTokens(String... grantTokens) {
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
    public GenerateDataKeyPairWithoutPlaintextRequest withGrantTokens(
            java.util.Collection<String> grantTokens) {
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
        if (getEncryptionContext() != null)
            sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getKeyPairSpec() != null)
            sb.append("KeyPairSpec: " + getKeyPairSpec() + ",");
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
                + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getKeyPairSpec() == null) ? 0 : getKeyPairSpec().hashCode());
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

        if (obj instanceof GenerateDataKeyPairWithoutPlaintextRequest == false)
            return false;
        GenerateDataKeyPairWithoutPlaintextRequest other = (GenerateDataKeyPairWithoutPlaintextRequest) obj;

        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null)
            return false;
        if (other.getEncryptionContext() != null
                && other.getEncryptionContext().equals(this.getEncryptionContext()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyPairSpec() == null ^ this.getKeyPairSpec() == null)
            return false;
        if (other.getKeyPairSpec() != null
                && other.getKeyPairSpec().equals(this.getKeyPairSpec()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        return true;
    }
}
