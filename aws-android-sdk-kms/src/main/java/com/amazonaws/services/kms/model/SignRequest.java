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
 * Creates a <a href="https://en.wikipedia.org/wiki/Digital_signature">digital
 * signature</a> for a message or message digest by using the private key in an
 * asymmetric KMS key. To verify the signature, use the <a>Verify</a> operation,
 * or use the public key in the same asymmetric KMS key outside of KMS. For
 * information about symmetric and asymmetric KMS keys, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html"
 * >Using Symmetric and Asymmetric KMS keys</a> in the <i>Key Management Service
 * Developer Guide</i>.
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
 * </important>
 * <p>
 * To verify the signature that this operation generates, use the <a>Verify</a>
 * operation. Or use the <a>GetPublicKey</a> operation to download the public
 * key and then use the public key to verify the signature outside of KMS.
 * </p>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
 * Developer Guide</i>.
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
     * bytes. To sign a larger message, provide the message digest.
     * </p>
     * <p>
     * If you provide a message, KMS generates a hash digest of the message and
     * then signs it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer message;

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter is a
     * message or message digest. The default value, RAW, indicates a message.
     * To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
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
     * specified asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     */
    private String signingAlgorithm;

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
     * bytes. To sign a larger message, provide the message digest.
     * </p>
     * <p>
     * If you provide a message, KMS generates a hash digest of the message and
     * then signs it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         Specifies the message or message digest to sign. Messages can be
     *         0-4096 bytes. To sign a larger message, provide the message
     *         digest.
     *         </p>
     *         <p>
     *         If you provide a message, KMS generates a hash digest of the
     *         message and then signs it.
     *         </p>
     */
    public java.nio.ByteBuffer getMessage() {
        return message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096
     * bytes. To sign a larger message, provide the message digest.
     * </p>
     * <p>
     * If you provide a message, KMS generates a hash digest of the message and
     * then signs it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param message <p>
     *            Specifies the message or message digest to sign. Messages can
     *            be 0-4096 bytes. To sign a larger message, provide the message
     *            digest.
     *            </p>
     *            <p>
     *            If you provide a message, KMS generates a hash digest of the
     *            message and then signs it.
     *            </p>
     */
    public void setMessage(java.nio.ByteBuffer message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096
     * bytes. To sign a larger message, provide the message digest.
     * </p>
     * <p>
     * If you provide a message, KMS generates a hash digest of the message and
     * then signs it.
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
     *            be 0-4096 bytes. To sign a larger message, provide the message
     *            digest.
     *            </p>
     *            <p>
     *            If you provide a message, KMS generates a hash digest of the
     *            message and then signs it.
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
     * Tells KMS whether the value of the <code>Message</code> parameter is a
     * message or message digest. The default value, RAW, indicates a message.
     * To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @return <p>
     *         Tells KMS whether the value of the <code>Message</code> parameter
     *         is a message or message digest. The default value, RAW, indicates
     *         a message. To indicate a message digest, enter
     *         <code>DIGEST</code>.
     *         </p>
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter is a
     * message or message digest. The default value, RAW, indicates a message.
     * To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter is a message or message digest. The default value,
     *            RAW, indicates a message. To indicate a message digest, enter
     *            <code>DIGEST</code>.
     *            </p>
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter is a
     * message or message digest. The default value, RAW, indicates a message.
     * To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter is a message or message digest. The default value,
     *            RAW, indicates a message. To indicate a message digest, enter
     *            <code>DIGEST</code>.
     *            </p>
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
     * Tells KMS whether the value of the <code>Message</code> parameter is a
     * message or message digest. The default value, RAW, indicates a message.
     * To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter is a message or message digest. The default value,
     *            RAW, indicates a message. To indicate a message digest, enter
     *            <code>DIGEST</code>.
     *            </p>
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter is a
     * message or message digest. The default value, RAW, indicates a message.
     * To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, DIGEST
     *
     * @param messageType <p>
     *            Tells KMS whether the value of the <code>Message</code>
     *            parameter is a message or message digest. The default value,
     *            RAW, indicates a message. To indicate a message digest, enter
     *            <code>DIGEST</code>.
     *            </p>
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
     * specified asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @return <p>
     *         Specifies the signing algorithm to use when signing the message.
     *         </p>
     *         <p>
     *         Choose an algorithm that is compatible with the type and size of
     *         the specified asymmetric KMS key.
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
     * specified asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key.
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
     * specified asymmetric KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key.
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
     * specified asymmetric KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key.
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
     * specified asymmetric KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RSASSA_PSS_SHA_256, RSASSA_PSS_SHA_384,
     * RSASSA_PSS_SHA_512, RSASSA_PKCS1_V1_5_SHA_256, RSASSA_PKCS1_V1_5_SHA_384,
     * RSASSA_PKCS1_V1_5_SHA_512, ECDSA_SHA_256, ECDSA_SHA_384, ECDSA_SHA_512
     *
     * @param signingAlgorithm <p>
     *            Specifies the signing algorithm to use when signing the
     *            message.
     *            </p>
     *            <p>
     *            Choose an algorithm that is compatible with the type and size
     *            of the specified asymmetric KMS key.
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
            sb.append("SigningAlgorithm: " + getSigningAlgorithm());
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
        return true;
    }
}
