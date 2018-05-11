/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Updates an alias to map it to a different key.
 * </p>
 * <p>
 * An alias is not a property of a key. Therefore, an alias can be mapped to and
 * unmapped from an existing key without changing the properties of the key.
 * </p>
 * <p>
 * An alias name can contain only alphanumeric characters, forward slashes (/),
 * underscores (_), and dashes (-). An alias must start with the word "alias"
 * followed by a forward slash (alias/). An alias that begins with "aws" after
 * the forward slash (alias/aws...) is reserved by Amazon Web Services (AWS).
 * </p>
 * <p>
 * The alias and the key it is mapped to must be in the same AWS account and the
 * same region.
 * </p>
 */
public class UpdateAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * String that contains the name of the alias to be modified. The name must
     * start with the word "alias" followed by a forward slash (alias/). Aliases
     * that begin with "alias/aws" are reserved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * <p>
     * Unique identifier of the customer master key to be mapped to the alias.
     * This value can be a globally unique identifier or the fully specified ARN
     * of a key.
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
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a>ListAliases</a> to verify that the alias is mapped to the
     * correct <code>TargetKeyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String targetKeyId;

    /**
     * <p>
     * String that contains the name of the alias to be modified. The name must
     * start with the word "alias" followed by a forward slash (alias/). Aliases
     * that begin with "alias/aws" are reserved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         String that contains the name of the alias to be modified. The
     *         name must start with the word "alias" followed by a forward slash
     *         (alias/). Aliases that begin with "alias/aws" are reserved.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * String that contains the name of the alias to be modified. The name must
     * start with the word "alias" followed by a forward slash (alias/). Aliases
     * that begin with "alias/aws" are reserved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            String that contains the name of the alias to be modified. The
     *            name must start with the word "alias" followed by a forward
     *            slash (alias/). Aliases that begin with "alias/aws" are
     *            reserved.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * String that contains the name of the alias to be modified. The name must
     * start with the word "alias" followed by a forward slash (alias/). Aliases
     * that begin with "alias/aws" are reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            String that contains the name of the alias to be modified. The
     *            name must start with the word "alias" followed by a forward
     *            slash (alias/). Aliases that begin with "alias/aws" are
     *            reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAliasRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * <p>
     * Unique identifier of the customer master key to be mapped to the alias.
     * This value can be a globally unique identifier or the fully specified ARN
     * of a key.
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
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a>ListAliases</a> to verify that the alias is mapped to the
     * correct <code>TargetKeyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Unique identifier of the customer master key to be mapped to the
     *         alias. This value can be a globally unique identifier or the
     *         fully specified ARN of a key.
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
     *         Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can call <a>ListAliases</a> to verify that the alias is
     *         mapped to the correct <code>TargetKeyId</code>.
     *         </p>
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    /**
     * <p>
     * Unique identifier of the customer master key to be mapped to the alias.
     * This value can be a globally unique identifier or the fully specified ARN
     * of a key.
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
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a>ListAliases</a> to verify that the alias is mapped to the
     * correct <code>TargetKeyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetKeyId <p>
     *            Unique identifier of the customer master key to be mapped to
     *            the alias. This value can be a globally unique identifier or
     *            the fully specified ARN of a key.
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
     *            Globally Unique Key ID Example -
     *            12345678-1234-1234-1234-123456789012
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can call <a>ListAliases</a> to verify that the alias is
     *            mapped to the correct <code>TargetKeyId</code>.
     *            </p>
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * Unique identifier of the customer master key to be mapped to the alias.
     * This value can be a globally unique identifier or the fully specified ARN
     * of a key.
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
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call <a>ListAliases</a> to verify that the alias is mapped to the
     * correct <code>TargetKeyId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param targetKeyId <p>
     *            Unique identifier of the customer master key to be mapped to
     *            the alias. This value can be a globally unique identifier or
     *            the fully specified ARN of a key.
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
     *            Globally Unique Key ID Example -
     *            12345678-1234-1234-1234-123456789012
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can call <a>ListAliases</a> to verify that the alias is
     *            mapped to the correct <code>TargetKeyId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAliasRequest withTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
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
        if (getAliasName() != null)
            sb.append("AliasName: " + getAliasName() + ",");
        if (getTargetKeyId() != null)
            sb.append("TargetKeyId: " + getTargetKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAliasRequest == false)
            return false;
        UpdateAliasRequest other = (UpdateAliasRequest) obj;

        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getTargetKeyId() == null ^ this.getTargetKeyId() == null)
            return false;
        if (other.getTargetKeyId() != null
                && other.getTargetKeyId().equals(this.getTargetKeyId()) == false)
            return false;
        return true;
    }
}
