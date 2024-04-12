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
 * Returns a unique asymmetric data key pair for use outside of KMS. This
 * operation returns a plaintext public key and a copy of the private key that
 * is encrypted under the symmetric encryption KMS key you specify. Unlike
 * <a>GenerateDataKeyPair</a>, this operation does not return a plaintext
 * private key. The bytes in the keys are random; they are not related to the
 * caller or to the KMS key that is used to encrypt the private key.
 * </p>
 * <p>
 * You can use the public key that
 * <code>GenerateDataKeyPairWithoutPlaintext</code> returns to encrypt data or
 * verify a signature outside of KMS. Then, store the encrypted private key with
 * the data. When you are ready to decrypt data or sign a message, you can use
 * the <a>Decrypt</a> operation to decrypt the encrypted private key.
 * </p>
 * <p>
 * To generate a data key pair, you must specify a symmetric encryption KMS key
 * to encrypt the private key in a data key pair. You cannot use an asymmetric
 * KMS key or a KMS key in a custom key store. To get the type and origin of
 * your KMS key, use the <a>DescribeKey</a> operation.
 * </p>
 * <p>
 * Use the <code>KeyPairSpec</code> parameter to choose an RSA or Elliptic Curve
 * (ECC) data key pair. In China Regions, you can also choose an SM2 data key
 * pair. KMS recommends that you use ECC key pairs for signing, and use RSA and
 * SM2 key pairs for either encryption or signing, but not both. However, KMS
 * cannot enforce any restrictions on the use of data key pairs outside of KMS.
 * </p>
 * <p>
 * <code>GenerateDataKeyPairWithoutPlaintext</code> returns a unique data key
 * pair for each request. The bytes in the key are not related to the caller or
 * KMS key that is used to encrypt the private key. The public key is a
 * DER-encoded X.509 SubjectPublicKeyInfo, as specified in <a
 * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
 * </p>
 * <p>
 * You can use an optional encryption context to add additional security to the
 * encryption operation. If you specify an <code>EncryptionContext</code>, you
 * must specify the same encryption context (a case-sensitive exact match) when
 * decrypting the encrypted data key. Otherwise, the request to decrypt fails
 * with an <code>InvalidCiphertextException</code>. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
 * >Encryption Context</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key states of KMS keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a
 * different Amazon Web Services account, specify the key ARN or alias ARN in
 * the value of the <code>KeyId</code> parameter.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:GenerateDataKeyPairWithoutPlaintext</a> (key policy)
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
 * <li>
 * <p>
 * <a>GenerateDataKeyWithoutPlaintext</a>
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
public class GenerateDataKeyPairWithoutPlaintextRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the encryption context that will be used when encrypting the
     * private key in the data key pair.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represent additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is supported only on operations with symmetric
     * encryption KMS keys. On operations with symmetric encryption KMS keys, an
     * encryption context is optional, but it is strongly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> encryptionContext = new java.util.HashMap<String, String>();

    /**
     * <p>
     * Specifies the symmetric encryption KMS key that encrypts the private key
     * in the data key pair. You cannot specify an asymmetric KMS key or a KMS
     * key in a custom key store. To get the type and origin of your KMS key,
     * use the <a>DescribeKey</a> operation.
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
    private String keyId;

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to
     * encrypt and decrypt or to sign and verify (but not both), and the rule
     * that permits you to use ECC KMS keys only to sign and verify, are not
     * effective on data key pairs, which are used outside of KMS. The SM2 key
     * spec is only available in China Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SM2
     */
    private String keyPairSpec;

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
     * Checks if your request will succeed. <code>DryRun</code> is an optional
     * parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     * >Testing your KMS API calls</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Specifies the encryption context that will be used when encrypting the
     * private key in the data key pair.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represent additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is supported only on operations with symmetric
     * encryption KMS keys. On operations with symmetric encryption KMS keys, an
     * encryption context is optional, but it is strongly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the encryption context that will be used when
     *         encrypting the private key in the data key pair.
     *         </p>
     *         <important>
     *         <p>
     *         Do not include confidential or sensitive information in this
     *         field. This field may be displayed in plaintext in CloudTrail
     *         logs and other output.
     *         </p>
     *         </important>
     *         <p>
     *         An <i>encryption context</i> is a collection of non-secret
     *         key-value pairs that represent additional authenticated data.
     *         When you use an encryption context to encrypt data, you must
     *         specify the same (an exact case-sensitive match) encryption
     *         context to decrypt the data. An encryption context is supported
     *         only on operations with symmetric encryption KMS keys. On
     *         operations with symmetric encryption KMS keys, an encryption
     *         context is optional, but it is strongly recommended.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *         >Encryption context</a> in the <i>Key Management Service
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
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represent additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is supported only on operations with symmetric
     * encryption KMS keys. On operations with symmetric encryption KMS keys, an
     * encryption context is optional, but it is strongly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption context</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param encryptionContext <p>
     *            Specifies the encryption context that will be used when
     *            encrypting the private key in the data key pair.
     *            </p>
     *            <important>
     *            <p>
     *            Do not include confidential or sensitive information in this
     *            field. This field may be displayed in plaintext in CloudTrail
     *            logs and other output.
     *            </p>
     *            </important>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represent additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is
     *            supported only on operations with symmetric encryption KMS
     *            keys. On operations with symmetric encryption KMS keys, an
     *            encryption context is optional, but it is strongly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption context</a> in the <i>Key Management Service
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
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represent additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is supported only on operations with symmetric
     * encryption KMS keys. On operations with symmetric encryption KMS keys, an
     * encryption context is optional, but it is strongly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption context</a> in the <i>Key Management Service Developer
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
     *            <important>
     *            <p>
     *            Do not include confidential or sensitive information in this
     *            field. This field may be displayed in plaintext in CloudTrail
     *            logs and other output.
     *            </p>
     *            </important>
     *            <p>
     *            An <i>encryption context</i> is a collection of non-secret
     *            key-value pairs that represent additional authenticated data.
     *            When you use an encryption context to encrypt data, you must
     *            specify the same (an exact case-sensitive match) encryption
     *            context to decrypt the data. An encryption context is
     *            supported only on operations with symmetric encryption KMS
     *            keys. On operations with symmetric encryption KMS keys, an
     *            encryption context is optional, but it is strongly
     *            recommended.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     *            >Encryption context</a> in the <i>Key Management Service
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
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This
     * field may be displayed in plaintext in CloudTrail logs and other output.
     * </p>
     * </important>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value
     * pairs that represent additional authenticated data. When you use an
     * encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An
     * encryption context is supported only on operations with symmetric
     * encryption KMS keys. On operations with symmetric encryption KMS keys, an
     * encryption context is optional, but it is strongly recommended.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context"
     * >Encryption context</a> in the <i>Key Management Service Developer
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
     * Specifies the symmetric encryption KMS key that encrypts the private key
     * in the data key pair. You cannot specify an asymmetric KMS key or a KMS
     * key in a custom key store. To get the type and origin of your KMS key,
     * use the <a>DescribeKey</a> operation.
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
     *         Specifies the symmetric encryption KMS key that encrypts the
     *         private key in the data key pair. You cannot specify an
     *         asymmetric KMS key or a KMS key in a custom key store. To get the
     *         type and origin of your KMS key, use the <a>DescribeKey</a>
     *         operation.
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
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Specifies the symmetric encryption KMS key that encrypts the private key
     * in the data key pair. You cannot specify an asymmetric KMS key or a KMS
     * key in a custom key store. To get the type and origin of your KMS key,
     * use the <a>DescribeKey</a> operation.
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
     * @param keyId <p>
     *            Specifies the symmetric encryption KMS key that encrypts the
     *            private key in the data key pair. You cannot specify an
     *            asymmetric KMS key or a KMS key in a custom key store. To get
     *            the type and origin of your KMS key, use the
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
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Specifies the symmetric encryption KMS key that encrypts the private key
     * in the data key pair. You cannot specify an asymmetric KMS key or a KMS
     * key in a custom key store. To get the type and origin of your KMS key,
     * use the <a>DescribeKey</a> operation.
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
     * @param keyId <p>
     *            Specifies the symmetric encryption KMS key that encrypts the
     *            private key in the data key pair. You cannot specify an
     *            asymmetric KMS key or a KMS key in a custom key store. To get
     *            the type and origin of your KMS key, use the
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
    public GenerateDataKeyPairWithoutPlaintextRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to
     * encrypt and decrypt or to sign and verify (but not both), and the rule
     * that permits you to use ECC KMS keys only to sign and verify, are not
     * effective on data key pairs, which are used outside of KMS. The SM2 key
     * spec is only available in China Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SM2
     *
     * @return <p>
     *         Determines the type of data key pair that is generated.
     *         </p>
     *         <p>
     *         The KMS rule that restricts the use of asymmetric RSA and SM2 KMS
     *         keys to encrypt and decrypt or to sign and verify (but not both),
     *         and the rule that permits you to use ECC KMS keys only to sign
     *         and verify, are not effective on data key pairs, which are used
     *         outside of KMS. The SM2 key spec is only available in China
     *         Regions.
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
     * The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to
     * encrypt and decrypt or to sign and verify (but not both), and the rule
     * that permits you to use ECC KMS keys only to sign and verify, are not
     * effective on data key pairs, which are used outside of KMS. The SM2 key
     * spec is only available in China Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SM2
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The KMS rule that restricts the use of asymmetric RSA and SM2
     *            KMS keys to encrypt and decrypt or to sign and verify (but not
     *            both), and the rule that permits you to use ECC KMS keys only
     *            to sign and verify, are not effective on data key pairs, which
     *            are used outside of KMS. The SM2 key spec is only available in
     *            China Regions.
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
     * The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to
     * encrypt and decrypt or to sign and verify (but not both), and the rule
     * that permits you to use ECC KMS keys only to sign and verify, are not
     * effective on data key pairs, which are used outside of KMS. The SM2 key
     * spec is only available in China Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SM2
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The KMS rule that restricts the use of asymmetric RSA and SM2
     *            KMS keys to encrypt and decrypt or to sign and verify (but not
     *            both), and the rule that permits you to use ECC KMS keys only
     *            to sign and verify, are not effective on data key pairs, which
     *            are used outside of KMS. The SM2 key spec is only available in
     *            China Regions.
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
     * The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to
     * encrypt and decrypt or to sign and verify (but not both), and the rule
     * that permits you to use ECC KMS keys only to sign and verify, are not
     * effective on data key pairs, which are used outside of KMS. The SM2 key
     * spec is only available in China Regions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SM2
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The KMS rule that restricts the use of asymmetric RSA and SM2
     *            KMS keys to encrypt and decrypt or to sign and verify (but not
     *            both), and the rule that permits you to use ECC KMS keys only
     *            to sign and verify, are not effective on data key pairs, which
     *            are used outside of KMS. The SM2 key spec is only available in
     *            China Regions.
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
     * The KMS rule that restricts the use of asymmetric RSA and SM2 KMS keys to
     * encrypt and decrypt or to sign and verify (but not both), and the rule
     * that permits you to use ECC KMS keys only to sign and verify, are not
     * effective on data key pairs, which are used outside of KMS. The SM2 key
     * spec is only available in China Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSA_2048, RSA_3072, RSA_4096, ECC_NIST_P256,
     * ECC_NIST_P384, ECC_NIST_P521, ECC_SECG_P256K1, SM2
     *
     * @param keyPairSpec <p>
     *            Determines the type of data key pair that is generated.
     *            </p>
     *            <p>
     *            The KMS rule that restricts the use of asymmetric RSA and SM2
     *            KMS keys to encrypt and decrypt or to sign and verify (but not
     *            both), and the rule that permits you to use ECC KMS keys only
     *            to sign and verify, are not effective on data key pairs, which
     *            are used outside of KMS. The SM2 key spec is only available in
     *            China Regions.
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
    public GenerateDataKeyPairWithoutPlaintextRequest withGrantTokens(
            java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional
     * parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     * >Testing your KMS API calls</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Checks if your request will succeed. <code>DryRun</code> is an
     *         optional parameter.
     *         </p>
     *         <p>
     *         To learn more about how to use this parameter, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     *         >Testing your KMS API calls</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional
     * parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     * >Testing your KMS API calls</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Checks if your request will succeed. <code>DryRun</code> is an
     *         optional parameter.
     *         </p>
     *         <p>
     *         To learn more about how to use this parameter, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     *         >Testing your KMS API calls</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional
     * parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     * >Testing your KMS API calls</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks if your request will succeed. <code>DryRun</code> is an
     *            optional parameter.
     *            </p>
     *            <p>
     *            To learn more about how to use this parameter, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     *            >Testing your KMS API calls</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional
     * parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     * >Testing your KMS API calls</a> in the <i>Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks if your request will succeed. <code>DryRun</code> is an
     *            optional parameter.
     *            </p>
     *            <p>
     *            To learn more about how to use this parameter, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html"
     *            >Testing your KMS API calls</a> in the <i>Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyPairWithoutPlaintextRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
