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
 * Creates a <a href="https://en.wikipedia.org/wiki/Digital_signature">digital
 * signature</a> for a message or message digest by using the private key in an
 * asymmetric signing KMS key. To verify the signature, use the <a>Verify</a>
 * operation, or use the public key in the same asymmetric KMS key outside of
 * KMS. For information about asymmetric KMS keys, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
 * >Asymmetric KMS keys</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * Digital signatures are generated and verified by using asymmetric key pair,
 * such as an RSA or ECC pair that is represented by an asymmetric KMS key. The
 * key owner (or an authorized user) uses their private key to sign a message.
 * Anyone with the public key can verify that the message was signed with that
 * particular private key and that the message hasn't changed since it was
 * signed.
 * </p>
 * <p>
 * To use the <code>Sign</code> operation, provide the following information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <code>KeyId</code> parameter to identify an asymmetric KMS key with a
 * <code>KeyUsage</code> value of <code>SIGN_VERIFY</code>. To get the
 * <code>KeyUsage</code> value of a KMS key, use the <a>DescribeKey</a>
 * operation. The caller must have <code>kms:Sign</code> permission on the KMS
 * key.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <code>Message</code> parameter to specify the message or message
 * digest to sign. You can submit messages of up to 4096 bytes. To sign a larger
 * message, generate a hash digest of the message, and then provide the hash
 * digest in the <code>Message</code> parameter. To indicate whether the message
 * is a full message or a digest, use the <code>MessageType</code> parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * Choose a signing algorithm that is compatible with the KMS key.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * When signing a message, be sure to record the KMS key and the signing
 * algorithm. This information is required to verify the signature.
 * </p>
 * </important> <note>
 * <p>
 * Best practices recommend that you limit the time during which any signature
 * is effective. This deters an attack where the actor uses a signed message to
 * establish validity repeatedly or long after the message is superseded.
 * Signatures do not include a timestamp, but you can include a timestamp in the
 * signed message to help you detect when its time to refresh the signature.
 * </p>
 * </note>
 * <p>
 * To verify the signature that this operation generates, use the <a>Verify</a>
 * operation. Or use the <a>GetPublicKey</a> operation to download the public
 * key and then use the public key to verify the signature outside of KMS.
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
 * >kms:Sign</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations</b>: <a>Verify</a>
 * </p>
 * <p>
 * <b>Eventual consistency</b>: The KMS API follows an eventual consistency
 * model. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
 * >KMS eventual consistency</a>.
 * </p>
 */
public class SignRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies an asymmetric KMS key. KMS uses the private key in the
     * asymmetric KMS key to sign the message. The <code>KeyUsage</code> type of
     * the KMS key must be <code>SIGN_VERIFY</code>. To find the
     * <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
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
     * Specifies the message or message digest to sign. Messages can be 0-4096
     * bytes. To sign a larger message, provide a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of
     * <code>MessageType</code> to prevent the digest from being hashed again
     * while signing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer message;

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should
     * be hashed as part of the signing algorithm. Use <code>RAW</code> for
     * unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses
     * the standard signing algorithm, which begins with a hash function. When
     * the value is <code>DIGEST</code>, KMS skips the hashing step in the
     * signing algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the
     * <code>Message</code> parameter is a message digest. If you use the
     * <code>DIGEST</code> value with an unhashed message, the security of the
     * signing operation can be compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the
     * length of the <code>Message</code> value must match the length of hashed
     * messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or
     * specify <code>RAW</code> so the digest is hashed again while signing.
     * However, this can cause verification failures when verifying with a
     * system that assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the
     * <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     */
    private String messageType;

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
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the
     * specified asymmetric KMS key. When signing with RSA key pairs, RSASSA-PSS
     * algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512,
     * SM2DSA
     */
    private String signingAlgorithm;

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
     * Identifies an asymmetric KMS key. KMS uses the private key in the
     * asymmetric KMS key to sign the message. The <code>KeyUsage</code> type of
     * the KMS key must be <code>SIGN_VERIFY</code>. To find the
     * <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
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
     *         Identifies an asymmetric KMS key. KMS uses the private key in the
     *         asymmetric KMS key to sign the message. The <code>KeyUsage</code>
     *         type of the KMS key must be <code>SIGN_VERIFY</code>. To find the
     *         <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a>
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
     * Identifies an asymmetric KMS key. KMS uses the private key in the
     * asymmetric KMS key to sign the message. The <code>KeyUsage</code> type of
     * the KMS key must be <code>SIGN_VERIFY</code>. To find the
     * <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
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
     *            Identifies an asymmetric KMS key. KMS uses the private key in
     *            the asymmetric KMS key to sign the message. The
     *            <code>KeyUsage</code> type of the KMS key must be
     *            <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of
     *            a KMS key, use the <a>DescribeKey</a> operation.
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
     * Identifies an asymmetric KMS key. KMS uses the private key in the
     * asymmetric KMS key to sign the message. The <code>KeyUsage</code> type of
     * the KMS key must be <code>SIGN_VERIFY</code>. To find the
     * <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
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
     *            Identifies an asymmetric KMS key. KMS uses the private key in
     *            the asymmetric KMS key to sign the message. The
     *            <code>KeyUsage</code> type of the KMS key must be
     *            <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of
     *            a KMS key, use the <a>DescribeKey</a> operation.
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
    public SignRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096
     * bytes. To sign a larger message, provide a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of
     * <code>MessageType</code> to prevent the digest from being hashed again
     * while signing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         Specifies the message or message digest to sign. Messages can be
     *         0-4096 bytes. To sign a larger message, provide a message digest.
     *         </p>
     *         <p>
     *         If you provide a message digest, use the <code>DIGEST</code>
     *         value of <code>MessageType</code> to prevent the digest from
     *         being hashed again while signing.
     *         </p>
     */
    public java.nio.ByteBuffer getMessage() {
        return message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096
     * bytes. To sign a larger message, provide a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of
     * <code>MessageType</code> to prevent the digest from being hashed again
     * while signing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param message <p>
     *            Specifies the message or message digest to sign. Messages can
     *            be 0-4096 bytes. To sign a larger message, provide a message
     *            digest.
     *            </p>
     *            <p>
     *            If you provide a message digest, use the <code>DIGEST</code>
     *            value of <code>MessageType</code> to prevent the digest from
     *            being hashed again while signing.
     *            </p>
     */
    public void setMessage(java.nio.ByteBuffer message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096
     * bytes. To sign a larger message, provide a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of
     * <code>MessageType</code> to prevent the digest from being hashed again
     * while signing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param message <p>
     *            Specifies the message or message digest to sign. Messages can
     *            be 0-4096 bytes. To sign a larger message, provide a message
     *            digest.
     *            </p>
     *            <p>
     *            If you provide a message digest, use the <code>DIGEST</code>
     *            value of <code>MessageType</code> to prevent the digest from
     *            being hashed again while signing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignRequest withMessage(java.nio.ByteBuffer message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should
     * be hashed as part of the signing algorithm. Use <code>RAW</code> for
     * unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses
     * the standard signing algorithm, which begins with a hash function. When
     * the value is <code>DIGEST</code>, KMS skips the hashing step in the
     * signing algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the
     * <code>Message</code> parameter is a message digest. If you use the
     * <code>DIGEST</code> value with an unhashed message, the security of the
     * signing operation can be compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the
     * length of the <code>Message</code> value must match the length of hashed
     * messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or
     * specify <code>RAW</code> so the digest is hashed again while signing.
     * However, this can cause verification failures when verifying with a
     * system that assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the
     * <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @return <p>
     *         Tells KMS whether the value of the <code>Message</code> parameter
     *         should be hashed as part of the signing algorithm. Use
     *         <code>RAW</code> for unhashed messages; use <code>DIGEST</code>
     *         for message digests, which are already hashed.
     *         </p>
     *         <p>
     *         When the value of <code>MessageType</code> is <code>RAW</code>,
     *         KMS uses the standard signing algorithm, which begins with a hash
     *         function. When the value is <code>DIGEST</code>, KMS skips the
     *         hashing step in the signing algorithm.
     *         </p>
     *         <important>
     *         <p>
     *         Use the <code>DIGEST</code> value only when the value of the
     *         <code>Message</code> parameter is a message digest. If you use
     *         the <code>DIGEST</code> value with an unhashed message, the
     *         security of the signing operation can be compromised.
     *         </p>
     *         </important>
     *         <p>
     *         When the value of <code>MessageType</code>is <code>DIGEST</code>,
     *         the length of the <code>Message</code> value must match the
     *         length of hashed messages for the specified signing algorithm.
     *         </p>
     *         <p>
     *         You can submit a message digest and omit the
     *         <code>MessageType</code> or specify <code>RAW</code> so the
     *         digest is hashed again while signing. However, this can cause
     *         verification failures when verifying with a system that assumes a
     *         single hash.
     *         </p>
     *         <p>
     *         The hashing algorithm in that <code>Sign</code> uses is based on
     *         the <code>SigningAlgorithm</code> value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Signing algorithms that end in SHA_256 use the SHA_256 hashing
     *         algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Signing algorithms that end in SHA_384 use the SHA_384 hashing
     *         algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Signing algorithms that end in SHA_512 use the SHA_512 hashing
     *         algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *         >Offline verification with SM2 key pairs</a>.
     *         </p>
     *         </li>
     *         </ul>
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should
     * be hashed as part of the signing algorithm. Use <code>RAW</code> for
     * unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses
     * the standard signing algorithm, which begins with a hash function. When
     * the value is <code>DIGEST</code>, KMS skips the hashing step in the
     * signing algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the
     * <code>Message</code> parameter is a message digest. If you use the
     * <code>DIGEST</code> value with an unhashed message, the security of the
     * signing operation can be compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the
     * length of the <code>Message</code> value must match the length of hashed
     * messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or
     * specify <code>RAW</code> so the digest is hashed again while signing.
     * However, this can cause verification failures when verifying with a
     * system that assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the
     * <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter should be hashed as part of the signing algorithm.
     *            Use <code>RAW</code> for unhashed messages; use
     *            <code>DIGEST</code> for message digests, which are already
     *            hashed.
     *            </p>
     *            <p>
     *            When the value of <code>MessageType</code> is <code>RAW</code>
     *            , KMS uses the standard signing algorithm, which begins with a
     *            hash function. When the value is <code>DIGEST</code>, KMS
     *            skips the hashing step in the signing algorithm.
     *            </p>
     *            <important>
     *            <p>
     *            Use the <code>DIGEST</code> value only when the value of the
     *            <code>Message</code> parameter is a message digest. If you use
     *            the <code>DIGEST</code> value with an unhashed message, the
     *            security of the signing operation can be compromised.
     *            </p>
     *            </important>
     *            <p>
     *            When the value of <code>MessageType</code>is
     *            <code>DIGEST</code>, the length of the <code>Message</code>
     *            value must match the length of hashed messages for the
     *            specified signing algorithm.
     *            </p>
     *            <p>
     *            You can submit a message digest and omit the
     *            <code>MessageType</code> or specify <code>RAW</code> so the
     *            digest is hashed again while signing. However, this can cause
     *            verification failures when verifying with a system that
     *            assumes a single hash.
     *            </p>
     *            <p>
     *            The hashing algorithm in that <code>Sign</code> uses is based
     *            on the <code>SigningAlgorithm</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_256 use the SHA_256 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_384 use the SHA_384 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_512 use the SHA_512 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SM2DSA uses the SM3 hashing algorithm. For details, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *            >Offline verification with SM2 key pairs</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should
     * be hashed as part of the signing algorithm. Use <code>RAW</code> for
     * unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses
     * the standard signing algorithm, which begins with a hash function. When
     * the value is <code>DIGEST</code>, KMS skips the hashing step in the
     * signing algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the
     * <code>Message</code> parameter is a message digest. If you use the
     * <code>DIGEST</code> value with an unhashed message, the security of the
     * signing operation can be compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the
     * length of the <code>Message</code> value must match the length of hashed
     * messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or
     * specify <code>RAW</code> so the digest is hashed again while signing.
     * However, this can cause verification failures when verifying with a
     * system that assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the
     * <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter should be hashed as part of the signing algorithm.
     *            Use <code>RAW</code> for unhashed messages; use
     *            <code>DIGEST</code> for message digests, which are already
     *            hashed.
     *            </p>
     *            <p>
     *            When the value of <code>MessageType</code> is <code>RAW</code>
     *            , KMS uses the standard signing algorithm, which begins with a
     *            hash function. When the value is <code>DIGEST</code>, KMS
     *            skips the hashing step in the signing algorithm.
     *            </p>
     *            <important>
     *            <p>
     *            Use the <code>DIGEST</code> value only when the value of the
     *            <code>Message</code> parameter is a message digest. If you use
     *            the <code>DIGEST</code> value with an unhashed message, the
     *            security of the signing operation can be compromised.
     *            </p>
     *            </important>
     *            <p>
     *            When the value of <code>MessageType</code>is
     *            <code>DIGEST</code>, the length of the <code>Message</code>
     *            value must match the length of hashed messages for the
     *            specified signing algorithm.
     *            </p>
     *            <p>
     *            You can submit a message digest and omit the
     *            <code>MessageType</code> or specify <code>RAW</code> so the
     *            digest is hashed again while signing. However, this can cause
     *            verification failures when verifying with a system that
     *            assumes a single hash.
     *            </p>
     *            <p>
     *            The hashing algorithm in that <code>Sign</code> uses is based
     *            on the <code>SigningAlgorithm</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_256 use the SHA_256 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_384 use the SHA_384 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_512 use the SHA_512 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SM2DSA uses the SM3 hashing algorithm. For details, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *            >Offline verification with SM2 key pairs</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public SignRequest withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should
     * be hashed as part of the signing algorithm. Use <code>RAW</code> for
     * unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses
     * the standard signing algorithm, which begins with a hash function. When
     * the value is <code>DIGEST</code>, KMS skips the hashing step in the
     * signing algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the
     * <code>Message</code> parameter is a message digest. If you use the
     * <code>DIGEST</code> value with an unhashed message, the security of the
     * signing operation can be compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the
     * length of the <code>Message</code> value must match the length of hashed
     * messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or
     * specify <code>RAW</code> so the digest is hashed again while signing.
     * However, this can cause verification failures when verifying with a
     * system that assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the
     * <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter should be hashed as part of the signing algorithm.
     *            Use <code>RAW</code> for unhashed messages; use
     *            <code>DIGEST</code> for message digests, which are already
     *            hashed.
     *            </p>
     *            <p>
     *            When the value of <code>MessageType</code> is <code>RAW</code>
     *            , KMS uses the standard signing algorithm, which begins with a
     *            hash function. When the value is <code>DIGEST</code>, KMS
     *            skips the hashing step in the signing algorithm.
     *            </p>
     *            <important>
     *            <p>
     *            Use the <code>DIGEST</code> value only when the value of the
     *            <code>Message</code> parameter is a message digest. If you use
     *            the <code>DIGEST</code> value with an unhashed message, the
     *            security of the signing operation can be compromised.
     *            </p>
     *            </important>
     *            <p>
     *            When the value of <code>MessageType</code>is
     *            <code>DIGEST</code>, the length of the <code>Message</code>
     *            value must match the length of hashed messages for the
     *            specified signing algorithm.
     *            </p>
     *            <p>
     *            You can submit a message digest and omit the
     *            <code>MessageType</code> or specify <code>RAW</code> so the
     *            digest is hashed again while signing. However, this can cause
     *            verification failures when verifying with a system that
     *            assumes a single hash.
     *            </p>
     *            <p>
     *            The hashing algorithm in that <code>Sign</code> uses is based
     *            on the <code>SigningAlgorithm</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_256 use the SHA_256 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_384 use the SHA_384 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_512 use the SHA_512 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SM2DSA uses the SM3 hashing algorithm. For details, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *            >Offline verification with SM2 key pairs</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should
     * be hashed as part of the signing algorithm. Use <code>RAW</code> for
     * unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses
     * the standard signing algorithm, which begins with a hash function. When
     * the value is <code>DIGEST</code>, KMS skips the hashing step in the
     * signing algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the
     * <code>Message</code> parameter is a message digest. If you use the
     * <code>DIGEST</code> value with an unhashed message, the security of the
     * signing operation can be compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the
     * length of the <code>Message</code> value must match the length of hashed
     * messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or
     * specify <code>RAW</code> so the digest is hashed again while signing.
     * However, this can cause verification failures when verifying with a
     * system that assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the
     * <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter should be hashed as part of the signing algorithm.
     *            Use <code>RAW</code> for unhashed messages; use
     *            <code>DIGEST</code> for message digests, which are already
     *            hashed.
     *            </p>
     *            <p>
     *            When the value of <code>MessageType</code> is <code>RAW</code>
     *            , KMS uses the standard signing algorithm, which begins with a
     *            hash function. When the value is <code>DIGEST</code>, KMS
     *            skips the hashing step in the signing algorithm.
     *            </p>
     *            <important>
     *            <p>
     *            Use the <code>DIGEST</code> value only when the value of the
     *            <code>Message</code> parameter is a message digest. If you use
     *            the <code>DIGEST</code> value with an unhashed message, the
     *            security of the signing operation can be compromised.
     *            </p>
     *            </important>
     *            <p>
     *            When the value of <code>MessageType</code>is
     *            <code>DIGEST</code>, the length of the <code>Message</code>
     *            value must match the length of hashed messages for the
     *            specified signing algorithm.
     *            </p>
     *            <p>
     *            You can submit a message digest and omit the
     *            <code>MessageType</code> or specify <code>RAW</code> so the
     *            digest is hashed again while signing. However, this can cause
     *            verification failures when verifying with a system that
     *            assumes a single hash.
     *            </p>
     *            <p>
     *            The hashing algorithm in that <code>Sign</code> uses is based
     *            on the <code>SigningAlgorithm</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_256 use the SHA_256 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_384 use the SHA_384 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Signing algorithms that end in SHA_512 use the SHA_512 hashing
     *            algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SM2DSA uses the SM3 hashing algorithm. For details, see <a
     *            href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *            >Offline verification with SM2 key pairs</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageType
     */
    public SignRequest withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
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
    public SignRequest withGrantTokens(String... grantTokens) {
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
    public SignRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the
     * specified asymmetric KMS key. When signing with RSA key pairs, RSASSA-PSS
     * algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512,
     * SM2DSA
     *
     * @return <p>
     *         Specifies the signing algorithm to use when signing the message.
     *         </p>
     *         <p>
     *         Choose an algorithm that is compatible with the type and size of
     *         the specified asymmetric KMS key. When signing with RSA key
     *         pairs, RSASSA-PSS algorithms are preferred. We include
     *         RSASSA-PKCS1-v1_5 algorithms for compatibility with existing
     *         applications.
     *         </p>
     * @see SigningAlgorithmSpec
     */
    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the
     * specified asymmetric KMS key. When signing with RSA key pairs, RSASSA-PSS
     * algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512,
     * SM2DSA
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key. When signing with RSA key
     *            pairs, RSASSA-PSS algorithms are preferred. We include
     *            RSASSA-PKCS1-v1_5 algorithms for compatibility with existing
     *            applications.
     *            </p>
     * @see SigningAlgorithmSpec
     */
    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the
     * specified asymmetric KMS key. When signing with RSA key pairs, RSASSA-PSS
     * algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512,
     * SM2DSA
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key. When signing with RSA key
     *            pairs, RSASSA-PSS algorithms are preferred. We include
     *            RSASSA-PKCS1-v1_5 algorithms for compatibility with existing
     *            applications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SigningAlgorithmSpec
     */
    public SignRequest withSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the
     * specified asymmetric KMS key. When signing with RSA key pairs, RSASSA-PSS
     * algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512,
     * SM2DSA
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key. When signing with RSA key
     *            pairs, RSASSA-PSS algorithms are preferred. We include
     *            RSASSA-PKCS1-v1_5 algorithms for compatibility with existing
     *            applications.
     *            </p>
     * @see SigningAlgorithmSpec
     */
    public void setSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the
     * specified asymmetric KMS key. When signing with RSA key pairs, RSASSA-PSS
     * algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512,
     * SM2DSA
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key. When signing with RSA key
     *            pairs, RSASSA-PSS algorithms are preferred. We include
     *            RSASSA-PKCS1-v1_5 algorithms for compatibility with existing
     *            applications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SigningAlgorithmSpec
     */
    public SignRequest withSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
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
    public SignRequest withDryRun(Boolean dryRun) {
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getMessageType() != null)
            sb.append("MessageType: " + getMessageType() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: " + getSigningAlgorithm() + ",");
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
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode
                + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignRequest == false)
            return false;
        SignRequest other = (SignRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null
                && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null
                && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
