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
 * Generates a hash-based message authentication code (HMAC) for a message using
 * an HMAC KMS key and a MAC algorithm that the key supports. HMAC KMS keys and
 * the HMAC algorithms that KMS uses conform to industry standards defined in <a
 * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
 * </p>
 * <p>
 * You can use value that GenerateMac returns in the <a>VerifyMac</a> operation
 * to demonstrate that the original message has not changed. Also, because a
 * secret key is used to create the hash, you can verify that the party that
 * generated the hash has the required secret key. You can also use the raw
 * result to implement HMAC-based algorithms such as key derivation functions.
 * This operation is part of KMS support for HMAC KMS keys. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC
 * keys in KMS</a> in the <i> <i>Key Management Service Developer Guide</i>
 * </i>.
 * </p>
 * <note>
 * <p>
 * Best practices recommend that you limit the time during which any signing
 * mechanism, including an HMAC, is effective. This deters an attack where the
 * actor uses a signed message to establish validity repeatedly or long after
 * the message is superseded. HMAC tags do not include a timestamp, but you can
 * include a timestamp in the token or message to help you detect when its time
 * to refresh the HMAC.
 * </p>
 * </note>
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
 * >kms:GenerateMac</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations</b>: <a>VerifyMac</a>
 * </p>
 * <p>
 * <b>Eventual consistency</b>: The KMS API follows an eventual consistency
 * model. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
 * >KMS eventual consistency</a>.
 * </p>
 */
public class GenerateMacRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special
     * handling for message digests. If you generate an HMAC for a hash digest
     * of a message, you must verify the HMAC of the same hash digest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer message;

    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the
     * HMAC for the message and the key as described in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see
     * the <code>KeySpec</code> field in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify.
     * To find the MAC algorithms that your HMAC KMS key supports, use the
     * <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field
     * in the <code>DescribeKey</code> response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     */
    private String macAlgorithm;

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
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special
     * handling for message digests. If you generate an HMAC for a hash digest
     * of a message, you must verify the HMAC of the same hash digest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The message to be hashed. Specify a message of up to 4,096 bytes.
     *         </p>
     *         <p>
     *         <code>GenerateMac</code> and <a>VerifyMac</a> do not provide
     *         special handling for message digests. If you generate an HMAC for
     *         a hash digest of a message, you must verify the HMAC of the same
     *         hash digest.
     *         </p>
     */
    public java.nio.ByteBuffer getMessage() {
        return message;
    }

    /**
     * <p>
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special
     * handling for message digests. If you generate an HMAC for a hash digest
     * of a message, you must verify the HMAC of the same hash digest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param message <p>
     *            The message to be hashed. Specify a message of up to 4,096
     *            bytes.
     *            </p>
     *            <p>
     *            <code>GenerateMac</code> and <a>VerifyMac</a> do not provide
     *            special handling for message digests. If you generate an HMAC
     *            for a hash digest of a message, you must verify the HMAC of
     *            the same hash digest.
     *            </p>
     */
    public void setMessage(java.nio.ByteBuffer message) {
        this.message = message;
    }

    /**
     * <p>
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special
     * handling for message digests. If you generate an HMAC for a hash digest
     * of a message, you must verify the HMAC of the same hash digest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param message <p>
     *            The message to be hashed. Specify a message of up to 4,096
     *            bytes.
     *            </p>
     *            <p>
     *            <code>GenerateMac</code> and <a>VerifyMac</a> do not provide
     *            special handling for message digests. If you generate an HMAC
     *            for a hash digest of a message, you must verify the HMAC of
     *            the same hash digest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateMacRequest withMessage(java.nio.ByteBuffer message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the
     * HMAC for the message and the key as described in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see
     * the <code>KeySpec</code> field in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The HMAC KMS key to use in the operation. The MAC algorithm
     *         computes the HMAC for the message and the key as described in <a
     *         href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *         2104</a>.
     *         </p>
     *         <p>
     *         To identify an HMAC KMS key, use the <a>DescribeKey</a> operation
     *         and see the <code>KeySpec</code> field in the response.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the
     * HMAC for the message and the key as described in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see
     * the <code>KeySpec</code> field in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The HMAC KMS key to use in the operation. The MAC algorithm
     *            computes the HMAC for the message and the key as described in
     *            <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *            2104</a>.
     *            </p>
     *            <p>
     *            To identify an HMAC KMS key, use the <a>DescribeKey</a>
     *            operation and see the <code>KeySpec</code> field in the
     *            response.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the
     * HMAC for the message and the key as described in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see
     * the <code>KeySpec</code> field in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The HMAC KMS key to use in the operation. The MAC algorithm
     *            computes the HMAC for the message and the key as described in
     *            <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *            2104</a>.
     *            </p>
     *            <p>
     *            To identify an HMAC KMS key, use the <a>DescribeKey</a>
     *            operation and see the <code>KeySpec</code> field in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateMacRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify.
     * To find the MAC algorithms that your HMAC KMS key supports, use the
     * <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field
     * in the <code>DescribeKey</code> response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @return <p>
     *         The MAC algorithm used in the operation.
     *         </p>
     *         <p>
     *         The algorithm must be compatible with the HMAC KMS key that you
     *         specify. To find the MAC algorithms that your HMAC KMS key
     *         supports, use the <a>DescribeKey</a> operation and see the
     *         <code>MacAlgorithms</code> field in the <code>DescribeKey</code>
     *         response.
     *         </p>
     * @see MacAlgorithmSpec
     */
    public String getMacAlgorithm() {
        return macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify.
     * To find the MAC algorithms that your HMAC KMS key supports, use the
     * <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field
     * in the <code>DescribeKey</code> response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm used in the operation.
     *            </p>
     *            <p>
     *            The algorithm must be compatible with the HMAC KMS key that
     *            you specify. To find the MAC algorithms that your HMAC KMS key
     *            supports, use the <a>DescribeKey</a> operation and see the
     *            <code>MacAlgorithms</code> field in the
     *            <code>DescribeKey</code> response.
     *            </p>
     * @see MacAlgorithmSpec
     */
    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify.
     * To find the MAC algorithms that your HMAC KMS key supports, use the
     * <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field
     * in the <code>DescribeKey</code> response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm used in the operation.
     *            </p>
     *            <p>
     *            The algorithm must be compatible with the HMAC KMS key that
     *            you specify. To find the MAC algorithms that your HMAC KMS key
     *            supports, use the <a>DescribeKey</a> operation and see the
     *            <code>MacAlgorithms</code> field in the
     *            <code>DescribeKey</code> response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacAlgorithmSpec
     */
    public GenerateMacRequest withMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        return this;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify.
     * To find the MAC algorithms that your HMAC KMS key supports, use the
     * <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field
     * in the <code>DescribeKey</code> response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm used in the operation.
     *            </p>
     *            <p>
     *            The algorithm must be compatible with the HMAC KMS key that
     *            you specify. To find the MAC algorithms that your HMAC KMS key
     *            supports, use the <a>DescribeKey</a> operation and see the
     *            <code>MacAlgorithms</code> field in the
     *            <code>DescribeKey</code> response.
     *            </p>
     * @see MacAlgorithmSpec
     */
    public void setMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify.
     * To find the MAC algorithms that your HMAC KMS key supports, use the
     * <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field
     * in the <code>DescribeKey</code> response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm used in the operation.
     *            </p>
     *            <p>
     *            The algorithm must be compatible with the HMAC KMS key that
     *            you specify. To find the MAC algorithms that your HMAC KMS key
     *            supports, use the <a>DescribeKey</a> operation and see the
     *            <code>MacAlgorithms</code> field in the
     *            <code>DescribeKey</code> response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacAlgorithmSpec
     */
    public GenerateMacRequest withMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
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
    public GenerateMacRequest withGrantTokens(String... grantTokens) {
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
    public GenerateMacRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
    public GenerateMacRequest withDryRun(Boolean dryRun) {
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getMacAlgorithm() != null)
            sb.append("MacAlgorithm: " + getMacAlgorithm() + ",");
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

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getMacAlgorithm() == null) ? 0 : getMacAlgorithm().hashCode());
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

        if (obj instanceof GenerateMacRequest == false)
            return false;
        GenerateMacRequest other = (GenerateMacRequest) obj;

        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getMacAlgorithm() == null ^ this.getMacAlgorithm() == null)
            return false;
        if (other.getMacAlgorithm() != null
                && other.getMacAlgorithm().equals(this.getMacAlgorithm()) == false)
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
