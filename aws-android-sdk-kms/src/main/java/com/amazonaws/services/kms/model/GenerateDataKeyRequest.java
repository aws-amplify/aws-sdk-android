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
 * Returns a unique symmetric data key for use outside of KMS. This operation
 * returns a plaintext copy of the data key and a copy that is encrypted under a
 * symmetric encryption KMS key that you specify. The bytes in the plaintext key
 * are random; they are not related to the caller or the KMS key. You can use
 * the plaintext key to encrypt your data outside of KMS and store the encrypted
 * data key with the encrypted data.
 * </p>
 * <p>
 * To generate a data key, specify the symmetric encryption KMS key that will be
 * used to encrypt the data key. You cannot use an asymmetric KMS key to encrypt
 * data keys. To get the type of your KMS key, use the <a>DescribeKey</a>
 * operation.
 * </p>
 * <p>
 * You must also specify the length of the data key. Use either the
 * <code>KeySpec</code> or <code>NumberOfBytes</code> parameters (but not both).
 * For 128-bit and 256-bit data keys, use the <code>KeySpec</code> parameter.
 * </p>
 * <p>
 * To generate a 128-bit SM4 data key (China Regions only), specify a
 * <code>KeySpec</code> value of <code>AES_128</code> or a
 * <code>NumberOfBytes</code> value of <code>16</code>. The symmetric encryption
 * key used in China Regions to encrypt your data key is an SM4 encryption key.
 * </p>
 * <p>
 * To get only an encrypted copy of the data key, use
 * <a>GenerateDataKeyWithoutPlaintext</a>. To generate an asymmetric data key
 * pair, use the <a>GenerateDataKeyPair</a> or
 * <a>GenerateDataKeyPairWithoutPlaintext</a> operation. To get a
 * cryptographically secure random byte string, use <a>GenerateRandom</a>.
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
 * <code>GenerateDataKey</code> also supports <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave.html"
 * >Amazon Web Services Nitro Enclaves</a>, which provide an isolated compute
 * environment in Amazon EC2. To call <code>GenerateDataKey</code> for an Amazon
 * Web Services Nitro enclave, use the <a href=
 * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
 * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
 * Use the <code>Recipient</code> parameter to provide the attestation document
 * for the enclave. <code>GenerateDataKey</code> returns a copy of the data key
 * encrypted under the specified KMS key, as usual. But instead of a plaintext
 * copy of the data key, the response includes a copy of the data key encrypted
 * under the public key from the attestation document (
 * <code>CiphertextForRecipient</code>). For information about the interaction
 * between KMS and Amazon Web Services Nitro Enclaves, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
 * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key Management
 * Service Developer Guide</i>..
 * </p>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key states of KMS keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>How to use your data key</b>
 * </p>
 * <p>
 * We recommend that you use the following pattern to encrypt data locally in
 * your application. You can write your own code or use a client-side encryption
 * library, such as the <a
 * href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/"
 * >Amazon Web Services Encryption SDK</a>, the <a href=
 * "https://docs.aws.amazon.com/dynamodb-encryption-client/latest/devguide/"
 * >Amazon DynamoDB Encryption Client</a>, or <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html"
 * >Amazon S3 client-side encryption</a> to do these tasks for you.
 * </p>
 * <p>
 * To encrypt data outside of KMS:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Use the <code>GenerateDataKey</code> operation to get a data key.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the plaintext data key (in the <code>Plaintext</code> field of the
 * response) to encrypt your data outside of KMS. Then erase the plaintext data
 * key from memory.
 * </p>
 * </li>
 * <li>
 * <p>
 * Store the encrypted data key (in the <code>CiphertextBlob</code> field of the
 * response) with the encrypted data.
 * </p>
 * </li>
 * </ol>
 * <p>
 * To decrypt data outside of KMS:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Use the <a>Decrypt</a> operation to decrypt the encrypted data key. The
 * operation returns a plaintext copy of the data key.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the plaintext data key to decrypt data outside of KMS, then erase the
 * plaintext data key from memory.
 * </p>
 * </li>
 * </ol>
 * <p>
 * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a
 * different Amazon Web Services account, specify the key ARN or alias ARN in
 * the value of the <code>KeyId</code> parameter.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:GenerateDataKey</a> (key policy)
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
 * <a>GenerateDataKeyPair</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyPairWithoutPlaintext</a>
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
public class GenerateDataKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the symmetric encryption KMS key that encrypts the data key.
     * You cannot specify an asymmetric KMS key or a KMS key in a custom key
     * store. To get the type and origin of your KMS key, use the
     * <a>DescribeKey</a> operation.
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
     * Specifies the encryption context that will be used when encrypting the
     * data key.
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
     * Specifies the length of the data key in bytes. For example, use the value
     * 64 to generate a 512-bit data key (64 bytes is 512 bits). For 128-bit
     * (16-byte) and 256-bit (32-byte) data keys, use the <code>KeySpec</code>
     * parameter.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer numberOfBytes;

    /**
     * <p>
     * Specifies the length of the data key. Use <code>AES_128</code> to
     * generate a 128-bit symmetric key, or <code>AES_256</code> to generate a
     * 256-bit symmetric key.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     */
    private String keySpec;

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
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning the plaintext data key,
     * KMS encrypts the plaintext data key under the public key in the
     * attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains a copy of the
     * data key encrypted under the KMS key specified by the <code>KeyId</code>
     * parameter. The <code>Plaintext</code> field in the response is null or
     * empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     */
    private RecipientInfo recipient;

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
     * Specifies the symmetric encryption KMS key that encrypts the data key.
     * You cannot specify an asymmetric KMS key or a KMS key in a custom key
     * store. To get the type and origin of your KMS key, use the
     * <a>DescribeKey</a> operation.
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
     *         Specifies the symmetric encryption KMS key that encrypts the data
     *         key. You cannot specify an asymmetric KMS key or a KMS key in a
     *         custom key store. To get the type and origin of your KMS key, use
     *         the <a>DescribeKey</a> operation.
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
     * Specifies the symmetric encryption KMS key that encrypts the data key.
     * You cannot specify an asymmetric KMS key or a KMS key in a custom key
     * store. To get the type and origin of your KMS key, use the
     * <a>DescribeKey</a> operation.
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
     *            data key. You cannot specify an asymmetric KMS key or a KMS
     *            key in a custom key store. To get the type and origin of your
     *            KMS key, use the <a>DescribeKey</a> operation.
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
     * Specifies the symmetric encryption KMS key that encrypts the data key.
     * You cannot specify an asymmetric KMS key or a KMS key in a custom key
     * store. To get the type and origin of your KMS key, use the
     * <a>DescribeKey</a> operation.
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
     *            data key. You cannot specify an asymmetric KMS key or a KMS
     *            key in a custom key store. To get the type and origin of your
     *            KMS key, use the <a>DescribeKey</a> operation.
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
    public GenerateDataKeyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context that will be used when encrypting the
     * data key.
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
     *         encrypting the data key.
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
     * data key.
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
     *            encrypting the data key.
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
     * data key.
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
     *            encrypting the data key.
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
    public GenerateDataKeyRequest withEncryptionContext(
            java.util.Map<String, String> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context that will be used when encrypting the
     * data key.
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
    public GenerateDataKeyRequest addEncryptionContextEntry(String key, String value) {
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
    public GenerateDataKeyRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Specifies the length of the data key in bytes. For example, use the value
     * 64 to generate a 512-bit data key (64 bytes is 512 bits). For 128-bit
     * (16-byte) and 256-bit (32-byte) data keys, use the <code>KeySpec</code>
     * parameter.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Specifies the length of the data key in bytes. For example, use
     *         the value 64 to generate a 512-bit data key (64 bytes is 512
     *         bits). For 128-bit (16-byte) and 256-bit (32-byte) data keys, use
     *         the <code>KeySpec</code> parameter.
     *         </p>
     *         <p>
     *         You must specify either the <code>KeySpec</code> or the
     *         <code>NumberOfBytes</code> parameter (but not both) in every
     *         <code>GenerateDataKey</code> request.
     *         </p>
     */
    public Integer getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * <p>
     * Specifies the length of the data key in bytes. For example, use the value
     * 64 to generate a 512-bit data key (64 bytes is 512 bits). For 128-bit
     * (16-byte) and 256-bit (32-byte) data keys, use the <code>KeySpec</code>
     * parameter.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            Specifies the length of the data key in bytes. For example,
     *            use the value 64 to generate a 512-bit data key (64 bytes is
     *            512 bits). For 128-bit (16-byte) and 256-bit (32-byte) data
     *            keys, use the <code>KeySpec</code> parameter.
     *            </p>
     *            <p>
     *            You must specify either the <code>KeySpec</code> or the
     *            <code>NumberOfBytes</code> parameter (but not both) in every
     *            <code>GenerateDataKey</code> request.
     *            </p>
     */
    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * Specifies the length of the data key in bytes. For example, use the value
     * 64 to generate a 512-bit data key (64 bytes is 512 bits). For 128-bit
     * (16-byte) and 256-bit (32-byte) data keys, use the <code>KeySpec</code>
     * parameter.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            Specifies the length of the data key in bytes. For example,
     *            use the value 64 to generate a 512-bit data key (64 bytes is
     *            512 bits). For 128-bit (16-byte) and 256-bit (32-byte) data
     *            keys, use the <code>KeySpec</code> parameter.
     *            </p>
     *            <p>
     *            You must specify either the <code>KeySpec</code> or the
     *            <code>NumberOfBytes</code> parameter (but not both) in every
     *            <code>GenerateDataKey</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyRequest withNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }

    /**
     * <p>
     * Specifies the length of the data key. Use <code>AES_128</code> to
     * generate a 128-bit symmetric key, or <code>AES_256</code> to generate a
     * 256-bit symmetric key.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @return <p>
     *         Specifies the length of the data key. Use <code>AES_128</code> to
     *         generate a 128-bit symmetric key, or <code>AES_256</code> to
     *         generate a 256-bit symmetric key.
     *         </p>
     *         <p>
     *         You must specify either the <code>KeySpec</code> or the
     *         <code>NumberOfBytes</code> parameter (but not both) in every
     *         <code>GenerateDataKey</code> request.
     *         </p>
     * @see DataKeySpec
     */
    public String getKeySpec() {
        return keySpec;
    }

    /**
     * <p>
     * Specifies the length of the data key. Use <code>AES_128</code> to
     * generate a 128-bit symmetric key, or <code>AES_256</code> to generate a
     * 256-bit symmetric key.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec <p>
     *            Specifies the length of the data key. Use <code>AES_128</code>
     *            to generate a 128-bit symmetric key, or <code>AES_256</code>
     *            to generate a 256-bit symmetric key.
     *            </p>
     *            <p>
     *            You must specify either the <code>KeySpec</code> or the
     *            <code>NumberOfBytes</code> parameter (but not both) in every
     *            <code>GenerateDataKey</code> request.
     *            </p>
     * @see DataKeySpec
     */
    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    /**
     * <p>
     * Specifies the length of the data key. Use <code>AES_128</code> to
     * generate a 128-bit symmetric key, or <code>AES_256</code> to generate a
     * 256-bit symmetric key.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec <p>
     *            Specifies the length of the data key. Use <code>AES_128</code>
     *            to generate a 128-bit symmetric key, or <code>AES_256</code>
     *            to generate a 256-bit symmetric key.
     *            </p>
     *            <p>
     *            You must specify either the <code>KeySpec</code> or the
     *            <code>NumberOfBytes</code> parameter (but not both) in every
     *            <code>GenerateDataKey</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataKeySpec
     */
    public GenerateDataKeyRequest withKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * <p>
     * Specifies the length of the data key. Use <code>AES_128</code> to
     * generate a 128-bit symmetric key, or <code>AES_256</code> to generate a
     * 256-bit symmetric key.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec <p>
     *            Specifies the length of the data key. Use <code>AES_128</code>
     *            to generate a 128-bit symmetric key, or <code>AES_256</code>
     *            to generate a 256-bit symmetric key.
     *            </p>
     *            <p>
     *            You must specify either the <code>KeySpec</code> or the
     *            <code>NumberOfBytes</code> parameter (but not both) in every
     *            <code>GenerateDataKey</code> request.
     *            </p>
     * @see DataKeySpec
     */
    public void setKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
    }

    /**
     * <p>
     * Specifies the length of the data key. Use <code>AES_128</code> to
     * generate a 128-bit symmetric key, or <code>AES_256</code> to generate a
     * 256-bit symmetric key.
     * </p>
     * <p>
     * You must specify either the <code>KeySpec</code> or the
     * <code>NumberOfBytes</code> parameter (but not both) in every
     * <code>GenerateDataKey</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec <p>
     *            Specifies the length of the data key. Use <code>AES_128</code>
     *            to generate a 128-bit symmetric key, or <code>AES_256</code>
     *            to generate a 256-bit symmetric key.
     *            </p>
     *            <p>
     *            You must specify either the <code>KeySpec</code> or the
     *            <code>NumberOfBytes</code> parameter (but not both) in every
     *            <code>GenerateDataKey</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataKeySpec
     */
    public GenerateDataKeyRequest withKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
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
    public GenerateDataKeyRequest withGrantTokens(String... grantTokens) {
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
    public GenerateDataKeyRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning the plaintext data key,
     * KMS encrypts the plaintext data key under the public key in the
     * attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains a copy of the
     * data key encrypted under the KMS key specified by the <code>KeyId</code>
     * parameter. The <code>Plaintext</code> field in the response is null or
     * empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A signed <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *         >attestation document</a> from an Amazon Web Services Nitro
     *         enclave and the encryption algorithm to use with the enclave's
     *         public key. The only valid encryption algorithm is
     *         <code>RSAES_OAEP_SHA_256</code>.
     *         </p>
     *         <p>
     *         This parameter only supports attestation documents for Amazon Web
     *         Services Nitro Enclaves. To include this parameter, use the <a
     *         href=
     *         "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *         >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web
     *         Services SDK.
     *         </p>
     *         <p>
     *         When you use this parameter, instead of returning the plaintext
     *         data key, KMS encrypts the plaintext data key under the public
     *         key in the attestation document, and returns the resulting
     *         ciphertext in the <code>CiphertextForRecipient</code> field in
     *         the response. This ciphertext can be decrypted only with the
     *         private key in the enclave. The <code>CiphertextBlob</code> field
     *         in the response contains a copy of the data key encrypted under
     *         the KMS key specified by the <code>KeyId</code> parameter. The
     *         <code>Plaintext</code> field in the response is null or empty.
     *         </p>
     *         <p>
     *         For information about the interaction between KMS and Amazon Web
     *         Services Nitro Enclaves, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *         >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *         <i>Key Management Service Developer Guide</i>.
     *         </p>
     */
    public RecipientInfo getRecipient() {
        return recipient;
    }

    /**
     * <p>
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning the plaintext data key,
     * KMS encrypts the plaintext data key under the public key in the
     * attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains a copy of the
     * data key encrypted under the KMS key specified by the <code>KeyId</code>
     * parameter. The <code>Plaintext</code> field in the response is null or
     * empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     *
     * @param recipient <p>
     *            A signed <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *            >attestation document</a> from an Amazon Web Services Nitro
     *            enclave and the encryption algorithm to use with the enclave's
     *            public key. The only valid encryption algorithm is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     *            <p>
     *            This parameter only supports attestation documents for Amazon
     *            Web Services Nitro Enclaves. To include this parameter, use
     *            the <a href=
     *            "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *            >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web
     *            Services SDK.
     *            </p>
     *            <p>
     *            When you use this parameter, instead of returning the
     *            plaintext data key, KMS encrypts the plaintext data key under
     *            the public key in the attestation document, and returns the
     *            resulting ciphertext in the
     *            <code>CiphertextForRecipient</code> field in the response.
     *            This ciphertext can be decrypted only with the private key in
     *            the enclave. The <code>CiphertextBlob</code> field in the
     *            response contains a copy of the data key encrypted under the
     *            KMS key specified by the <code>KeyId</code> parameter. The
     *            <code>Plaintext</code> field in the response is null or empty.
     *            </p>
     *            <p>
     *            For information about the interaction between KMS and Amazon
     *            Web Services Nitro Enclaves, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *            >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *            <i>Key Management Service Developer Guide</i>.
     *            </p>
     */
    public void setRecipient(RecipientInfo recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To include this parameter, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services
     * SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning the plaintext data key,
     * KMS encrypts the plaintext data key under the public key in the
     * attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains a copy of the
     * data key encrypted under the KMS key specified by the <code>KeyId</code>
     * parameter. The <code>Plaintext</code> field in the response is null or
     * empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services
     * Nitro Enclaves, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     * >How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipient <p>
     *            A signed <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *            >attestation document</a> from an Amazon Web Services Nitro
     *            enclave and the encryption algorithm to use with the enclave's
     *            public key. The only valid encryption algorithm is
     *            <code>RSAES_OAEP_SHA_256</code>.
     *            </p>
     *            <p>
     *            This parameter only supports attestation documents for Amazon
     *            Web Services Nitro Enclaves. To include this parameter, use
     *            the <a href=
     *            "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *            >Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web
     *            Services SDK.
     *            </p>
     *            <p>
     *            When you use this parameter, instead of returning the
     *            plaintext data key, KMS encrypts the plaintext data key under
     *            the public key in the attestation document, and returns the
     *            resulting ciphertext in the
     *            <code>CiphertextForRecipient</code> field in the response.
     *            This ciphertext can be decrypted only with the private key in
     *            the enclave. The <code>CiphertextBlob</code> field in the
     *            response contains a copy of the data key encrypted under the
     *            KMS key specified by the <code>KeyId</code> parameter. The
     *            <code>Plaintext</code> field in the response is null or empty.
     *            </p>
     *            <p>
     *            For information about the interaction between KMS and Amazon
     *            Web Services Nitro Enclaves, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html"
     *            >How Amazon Web Services Nitro Enclaves uses KMS</a> in the
     *            <i>Key Management Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateDataKeyRequest withRecipient(RecipientInfo recipient) {
        this.recipient = recipient;
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
    public GenerateDataKeyRequest withDryRun(Boolean dryRun) {
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getEncryptionContext() != null)
            sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
        if (getKeySpec() != null)
            sb.append("KeySpec: " + getKeySpec() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        if (getRecipient() != null)
            sb.append("Recipient: " + getRecipient() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode());
        hashCode = prime * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataKeyRequest == false)
            return false;
        GenerateDataKeyRequest other = (GenerateDataKeyRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null)
            return false;
        if (other.getEncryptionContext() != null
                && other.getEncryptionContext().equals(this.getEncryptionContext()) == false)
            return false;
        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null
                && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        if (other.getKeySpec() == null ^ this.getKeySpec() == null)
            return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null
                && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
