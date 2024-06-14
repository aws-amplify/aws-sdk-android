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
 * Derives a shared secret using a key agreement algorithm.
 * </p>
 * <note>
 * <p>
 * You must use an asymmetric NIST-recommended elliptic curve (ECC) or SM2
 * (China Regions only) KMS key pair with a <code>KeyUsage</code> value of
 * <code>KEY_AGREEMENT</code> to call DeriveSharedSecret.
 * </p>
 * </note>
 * <p>
 * DeriveSharedSecret uses the <a href=
 * "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-56Ar3.pdf#page=60"
 * >Elliptic Curve Cryptography Cofactor Diffie-Hellman Primitive</a> (ECDH) to
 * establish a key agreement between two peers by deriving a shared secret from
 * their elliptic curve public-private key pairs. You can use the raw shared
 * secret that DeriveSharedSecret returns to derive a symmetric key that can
 * encrypt and decrypt data that is sent between the two peers, or that can
 * generate and verify HMACs. KMS recommends that you follow <a href=
 * "https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-56Cr2.pdf"
 * >NIST recommendations for key derivation</a> when using the raw shared secret
 * to derive a symmetric key.
 * </p>
 * <p>
 * The following workflow demonstrates how to establish key agreement over an
 * insecure communication channel using DeriveSharedSecret.
 * </p>
 * <ol>
 * <li>
 * <p>
 * <b>Alice</b> calls <a>CreateKey</a> to create an asymmetric KMS key pair with
 * a <code>KeyUsage</code> value of <code>KEY_AGREEMENT</code>.
 * </p>
 * <p>
 * The asymmetric KMS key must use a NIST-recommended elliptic curve (ECC) or
 * SM2 (China Regions only) key spec.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Bob</b> creates an elliptic curve key pair.
 * </p>
 * <p>
 * Bob can call <a>CreateKey</a> to create an asymmetric KMS key pair or
 * generate a key pair outside of KMS. Bob's key pair must use the same
 * NIST-recommended elliptic curve (ECC) or SM2 (China Regions ony) curve as
 * Alice.
 * </p>
 * </li>
 * <li>
 * <p>
 * Alice and Bob <b>exchange their public keys</b> through an insecure
 * communication channel (like the internet).
 * </p>
 * <p>
 * Use <a>GetPublicKey</a> to download the public key of your asymmetric KMS key
 * pair.
 * </p>
 * <note>
 * <p>
 * KMS strongly recommends verifying that the public key you receive came from
 * the expected party before using it to derive a shared secret.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * <b>Alice</b> calls DeriveSharedSecret.
 * </p>
 * <p>
 * KMS uses the private key from the KMS key pair generated in <b>Step 1</b>,
 * Bob's public key, and the Elliptic Curve Cryptography Cofactor Diffie-Hellman
 * Primitive to derive the shared secret. The private key in your KMS key pair
 * never leaves KMS unencrypted. DeriveSharedSecret returns the raw shared
 * secret.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Bob</b> uses the Elliptic Curve Cryptography Cofactor Diffie-Hellman
 * Primitive to calculate the same raw secret using his private key and Alice's
 * public key.
 * </p>
 * </li>
 * </ol>
 * <p>
 * To derive a shared secret you must provide a key agreement algorithm, the
 * private key of the caller's asymmetric NIST-recommended elliptic curve or SM2
 * (China Regions only) KMS key pair, and the public key from your peer's
 * NIST-recommended elliptic curve or SM2 (China Regions only) key pair. The
 * public key can be from another asymmetric KMS key pair or from a key pair
 * generated outside of KMS, but both key pairs must be on the same elliptic
 * curve.
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
 * >kms:DeriveSharedSecret</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPublicKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeKey</a>
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
public class DeriveSharedSecretRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only)
     * KMS key. KMS uses the private key in the specified key pair to derive the
     * shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS
     * key, use the <a>DescribeKey</a> operation.
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
     * Specifies the key agreement algorithm used to derive the shared secret.
     * The only valid value is <code>ECDH</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     */
    private String keyAgreementAlgorithm;

    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve
     * (ECC) or SM2 (China Regions only) key pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair
     * in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href=
     * "https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html"
     * >Amazon Web Services CLI version 1</a>, you must provide the DER-encoded
     * X.509 public key in a file. Otherwise, the Amazon Web Services CLI
     * Base64-encodes the public key a second time, resulting in a
     * <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (
     * <code>fileb://&lt;path-to-file&gt;</code>) or in-line using a Base64
     * encoded string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     */
    private java.nio.ByteBuffer publicKey;

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
     * A signed <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     * >attestation document</a> from an Amazon Web Services Nitro enclave and
     * the encryption algorithm to use with the enclave's public key. The only
     * valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web
     * Services Nitro Enclaves. To call DeriveSharedSecret for an Amazon Web
     * Services Nitro Enclaves, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> to generate the attestation
     * document and then use the Recipient parameter from any Amazon Web
     * Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the
     * shared secret, KMS encrypts the plaintext shared secret under the public
     * key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains the encrypted
     * shared secret derived from the KMS key specified by the
     * <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in
     * the response is null or empty.
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
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only)
     * KMS key. KMS uses the private key in the specified key pair to derive the
     * shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS
     * key, use the <a>DescribeKey</a> operation.
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
     *         Identifies an asymmetric NIST-recommended ECC or SM2 (China
     *         Regions only) KMS key. KMS uses the private key in the specified
     *         key pair to derive the shared secret. The key usage of the KMS
     *         key must be <code>KEY_AGREEMENT</code>. To find the
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
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only)
     * KMS key. KMS uses the private key in the specified key pair to derive the
     * shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS
     * key, use the <a>DescribeKey</a> operation.
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
     *            Identifies an asymmetric NIST-recommended ECC or SM2 (China
     *            Regions only) KMS key. KMS uses the private key in the
     *            specified key pair to derive the shared secret. The key usage
     *            of the KMS key must be <code>KEY_AGREEMENT</code>. To find the
     *            <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a>
     *            operation.
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
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only)
     * KMS key. KMS uses the private key in the specified key pair to derive the
     * shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS
     * key, use the <a>DescribeKey</a> operation.
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
     *            Identifies an asymmetric NIST-recommended ECC or SM2 (China
     *            Regions only) KMS key. KMS uses the private key in the
     *            specified key pair to derive the shared secret. The key usage
     *            of the KMS key must be <code>KEY_AGREEMENT</code>. To find the
     *            <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a>
     *            operation.
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
    public DeriveSharedSecretRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret.
     * The only valid value is <code>ECDH</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @return <p>
     *         Specifies the key agreement algorithm used to derive the shared
     *         secret. The only valid value is <code>ECDH</code>.
     *         </p>
     * @see KeyAgreementAlgorithmSpec
     */
    public String getKeyAgreementAlgorithm() {
        return keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret.
     * The only valid value is <code>ECDH</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Specifies the key agreement algorithm used to derive the
     *            shared secret. The only valid value is <code>ECDH</code>.
     *            </p>
     * @see KeyAgreementAlgorithmSpec
     */
    public void setKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret.
     * The only valid value is <code>ECDH</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Specifies the key agreement algorithm used to derive the
     *            shared secret. The only valid value is <code>ECDH</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyAgreementAlgorithmSpec
     */
    public DeriveSharedSecretRequest withKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
        return this;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret.
     * The only valid value is <code>ECDH</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Specifies the key agreement algorithm used to derive the
     *            shared secret. The only valid value is <code>ECDH</code>.
     *            </p>
     * @see KeyAgreementAlgorithmSpec
     */
    public void setKeyAgreementAlgorithm(KeyAgreementAlgorithmSpec keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm.toString();
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret.
     * The only valid value is <code>ECDH</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ECDH
     *
     * @param keyAgreementAlgorithm <p>
     *            Specifies the key agreement algorithm used to derive the
     *            shared secret. The only valid value is <code>ECDH</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KeyAgreementAlgorithmSpec
     */
    public DeriveSharedSecretRequest withKeyAgreementAlgorithm(
            KeyAgreementAlgorithmSpec keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve
     * (ECC) or SM2 (China Regions only) key pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair
     * in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href=
     * "https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html"
     * >Amazon Web Services CLI version 1</a>, you must provide the DER-encoded
     * X.509 public key in a file. Otherwise, the Amazon Web Services CLI
     * Base64-encodes the public key a second time, resulting in a
     * <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (
     * <code>fileb://&lt;path-to-file&gt;</code>) or in-line using a Base64
     * encoded string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @return <p>
     *         Specifies the public key in your peer's NIST-recommended elliptic
     *         curve (ECC) or SM2 (China Regions only) key pair.
     *         </p>
     *         <p>
     *         The public key must be a DER-encoded X.509 public key, also known
     *         as <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     *         href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     *         </p>
     *         <p>
     *         <a>GetPublicKey</a> returns the public key of an asymmetric KMS
     *         key pair in the required DER-encoded format.
     *         </p>
     *         <note>
     *         <p>
     *         If you use <a href=
     *         "https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html"
     *         >Amazon Web Services CLI version 1</a>, you must provide the
     *         DER-encoded X.509 public key in a file. Otherwise, the Amazon Web
     *         Services CLI Base64-encodes the public key a second time,
     *         resulting in a <code>ValidationException</code>.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify the public key as binary data in a file using
     *         fileb (<code>fileb://&lt;path-to-file&gt;</code>) or in-line
     *         using a Base64 encoded string.
     *         </p>
     */
    public java.nio.ByteBuffer getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve
     * (ECC) or SM2 (China Regions only) key pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair
     * in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href=
     * "https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html"
     * >Amazon Web Services CLI version 1</a>, you must provide the DER-encoded
     * X.509 public key in a file. Otherwise, the Amazon Web Services CLI
     * Base64-encodes the public key a second time, resulting in a
     * <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (
     * <code>fileb://&lt;path-to-file&gt;</code>) or in-line using a Base64
     * encoded string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param publicKey <p>
     *            Specifies the public key in your peer's NIST-recommended
     *            elliptic curve (ECC) or SM2 (China Regions only) key pair.
     *            </p>
     *            <p>
     *            The public key must be a DER-encoded X.509 public key, also
     *            known as <code>SubjectPublicKeyInfo</code> (SPKI), as defined
     *            in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     *            </p>
     *            <p>
     *            <a>GetPublicKey</a> returns the public key of an asymmetric
     *            KMS key pair in the required DER-encoded format.
     *            </p>
     *            <note>
     *            <p>
     *            If you use <a href=
     *            "https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html"
     *            >Amazon Web Services CLI version 1</a>, you must provide the
     *            DER-encoded X.509 public key in a file. Otherwise, the Amazon
     *            Web Services CLI Base64-encodes the public key a second time,
     *            resulting in a <code>ValidationException</code>.
     *            </p>
     *            </note>
     *            <p>
     *            You can specify the public key as binary data in a file using
     *            fileb (<code>fileb://&lt;path-to-file&gt;</code>) or in-line
     *            using a Base64 encoded string.
     *            </p>
     */
    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve
     * (ECC) or SM2 (China Regions only) key pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as
     * <code>SubjectPublicKeyInfo</code> (SPKI), as defined in <a
     * href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair
     * in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href=
     * "https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html"
     * >Amazon Web Services CLI version 1</a>, you must provide the DER-encoded
     * X.509 public key in a file. Otherwise, the Amazon Web Services CLI
     * Base64-encodes the public key a second time, resulting in a
     * <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (
     * <code>fileb://&lt;path-to-file&gt;</code>) or in-line using a Base64
     * encoded string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param publicKey <p>
     *            Specifies the public key in your peer's NIST-recommended
     *            elliptic curve (ECC) or SM2 (China Regions only) key pair.
     *            </p>
     *            <p>
     *            The public key must be a DER-encoded X.509 public key, also
     *            known as <code>SubjectPublicKeyInfo</code> (SPKI), as defined
     *            in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     *            </p>
     *            <p>
     *            <a>GetPublicKey</a> returns the public key of an asymmetric
     *            KMS key pair in the required DER-encoded format.
     *            </p>
     *            <note>
     *            <p>
     *            If you use <a href=
     *            "https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html"
     *            >Amazon Web Services CLI version 1</a>, you must provide the
     *            DER-encoded X.509 public key in a file. Otherwise, the Amazon
     *            Web Services CLI Base64-encodes the public key a second time,
     *            resulting in a <code>ValidationException</code>.
     *            </p>
     *            </note>
     *            <p>
     *            You can specify the public key as binary data in a file using
     *            fileb (<code>fileb://&lt;path-to-file&gt;</code>) or in-line
     *            using a Base64 encoded string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeriveSharedSecretRequest withPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
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
    public DeriveSharedSecretRequest withGrantTokens(String... grantTokens) {
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
    public DeriveSharedSecretRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
    public DeriveSharedSecretRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
     * Services Nitro Enclaves. To call DeriveSharedSecret for an Amazon Web
     * Services Nitro Enclaves, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> to generate the attestation
     * document and then use the Recipient parameter from any Amazon Web
     * Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the
     * shared secret, KMS encrypts the plaintext shared secret under the public
     * key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains the encrypted
     * shared secret derived from the KMS key specified by the
     * <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in
     * the response is null or empty.
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
     *         Services Nitro Enclaves. To call DeriveSharedSecret for an Amazon
     *         Web Services Nitro Enclaves, use the <a href=
     *         "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *         >Amazon Web Services Nitro Enclaves SDK</a> to generate the
     *         attestation document and then use the Recipient parameter from
     *         any Amazon Web Services SDK to provide the attestation document
     *         for the enclave.
     *         </p>
     *         <p>
     *         When you use this parameter, instead of returning a plaintext
     *         copy of the shared secret, KMS encrypts the plaintext shared
     *         secret under the public key in the attestation document, and
     *         returns the resulting ciphertext in the
     *         <code>CiphertextForRecipient</code> field in the response. This
     *         ciphertext can be decrypted only with the private key in the
     *         enclave. The <code>CiphertextBlob</code> field in the response
     *         contains the encrypted shared secret derived from the KMS key
     *         specified by the <code>KeyId</code> parameter and public key
     *         specified by the <code>PublicKey</code> parameter. The
     *         <code>SharedSecret</code> field in the response is null or empty.
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
     * Services Nitro Enclaves. To call DeriveSharedSecret for an Amazon Web
     * Services Nitro Enclaves, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> to generate the attestation
     * document and then use the Recipient parameter from any Amazon Web
     * Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the
     * shared secret, KMS encrypts the plaintext shared secret under the public
     * key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains the encrypted
     * shared secret derived from the KMS key specified by the
     * <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in
     * the response is null or empty.
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
     *            Web Services Nitro Enclaves. To call DeriveSharedSecret for an
     *            Amazon Web Services Nitro Enclaves, use the <a href=
     *            "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *            >Amazon Web Services Nitro Enclaves SDK</a> to generate the
     *            attestation document and then use the Recipient parameter from
     *            any Amazon Web Services SDK to provide the attestation
     *            document for the enclave.
     *            </p>
     *            <p>
     *            When you use this parameter, instead of returning a plaintext
     *            copy of the shared secret, KMS encrypts the plaintext shared
     *            secret under the public key in the attestation document, and
     *            returns the resulting ciphertext in the
     *            <code>CiphertextForRecipient</code> field in the response.
     *            This ciphertext can be decrypted only with the private key in
     *            the enclave. The <code>CiphertextBlob</code> field in the
     *            response contains the encrypted shared secret derived from the
     *            KMS key specified by the <code>KeyId</code> parameter and
     *            public key specified by the <code>PublicKey</code> parameter.
     *            The <code>SharedSecret</code> field in the response is null or
     *            empty.
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
     * Services Nitro Enclaves. To call DeriveSharedSecret for an Amazon Web
     * Services Nitro Enclaves, use the <a href=
     * "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     * >Amazon Web Services Nitro Enclaves SDK</a> to generate the attestation
     * document and then use the Recipient parameter from any Amazon Web
     * Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the
     * shared secret, KMS encrypts the plaintext shared secret under the public
     * key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This
     * ciphertext can be decrypted only with the private key in the enclave. The
     * <code>CiphertextBlob</code> field in the response contains the encrypted
     * shared secret derived from the KMS key specified by the
     * <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in
     * the response is null or empty.
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
     *            Web Services Nitro Enclaves. To call DeriveSharedSecret for an
     *            Amazon Web Services Nitro Enclaves, use the <a href=
     *            "https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk"
     *            >Amazon Web Services Nitro Enclaves SDK</a> to generate the
     *            attestation document and then use the Recipient parameter from
     *            any Amazon Web Services SDK to provide the attestation
     *            document for the enclave.
     *            </p>
     *            <p>
     *            When you use this parameter, instead of returning a plaintext
     *            copy of the shared secret, KMS encrypts the plaintext shared
     *            secret under the public key in the attestation document, and
     *            returns the resulting ciphertext in the
     *            <code>CiphertextForRecipient</code> field in the response.
     *            This ciphertext can be decrypted only with the private key in
     *            the enclave. The <code>CiphertextBlob</code> field in the
     *            response contains the encrypted shared secret derived from the
     *            KMS key specified by the <code>KeyId</code> parameter and
     *            public key specified by the <code>PublicKey</code> parameter.
     *            The <code>SharedSecret</code> field in the response is null or
     *            empty.
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
    public DeriveSharedSecretRequest withRecipient(RecipientInfo recipient) {
        this.recipient = recipient;
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
        if (getKeyAgreementAlgorithm() != null)
            sb.append("KeyAgreementAlgorithm: " + getKeyAgreementAlgorithm() + ",");
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getRecipient() != null)
            sb.append("Recipient: " + getRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeyAgreementAlgorithm() == null) ? 0 : getKeyAgreementAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeriveSharedSecretRequest == false)
            return false;
        DeriveSharedSecretRequest other = (DeriveSharedSecretRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyAgreementAlgorithm() == null ^ this.getKeyAgreementAlgorithm() == null)
            return false;
        if (other.getKeyAgreementAlgorithm() != null
                && other.getKeyAgreementAlgorithm().equals(this.getKeyAgreementAlgorithm()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
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
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null
                && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        return true;
    }
}
