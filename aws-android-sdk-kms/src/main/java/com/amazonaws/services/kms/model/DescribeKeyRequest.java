/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides detailed information about the specified customer master key.
 * </p>
 */
public class DescribeKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234
     * -1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> grantTokens = new java.util.ArrayList<String>();

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234
     * -1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the customer master key. This value can
     *         be a globally unique identifier, a fully specified ARN to either
     *         an alias or a key, or an alias name prefixed by "alias/".
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678-
     *         1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias Name Example - alias/MyAliasName
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234
     * -1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            A unique identifier for the customer master key. This value
     *            can be a globally unique identifier, a fully specified ARN to
     *            either an alias or a key, or an alias name prefixed by
     *            "alias/".
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ARN Example -
     *            arn:aws:kms:us-east-1:123456789012:key/12345678
     *            -1234-1234-1234-123456789012
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN Example -
     *            arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Globally Unique Key ID Example -
     *            12345678-1234-1234-1234-123456789012
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias Name Example - alias/MyAliasName
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234
     * -1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId <p>
     *            A unique identifier for the customer master key. This value
     *            can be a globally unique identifier, a fully specified ARN to
     *            either an alias or a key, or an alias name prefixed by
     *            "alias/".
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ARN Example -
     *            arn:aws:kms:us-east-1:123456789012:key/12345678
     *            -1234-1234-1234-123456789012
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN Example -
     *            arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Globally Unique Key ID Example -
     *            12345678-1234-1234-1234-123456789012
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias Name Example - alias/MyAliasName
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of grant tokens.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
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
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     *
     * @param grantTokens <p>
     *            A list of grant tokens.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
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
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
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
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyRequest withGrantTokens(String... grantTokens) {
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
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
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
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *            >Grant Tokens</a> in the <i>AWS Key Management Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
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

        if (obj instanceof DescribeKeyRequest == false)
            return false;
        DescribeKeyRequest other = (DescribeKeyRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        return true;
    }
}
