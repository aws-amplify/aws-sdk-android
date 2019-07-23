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
 * Creates a display name for a customer managed customer master key (CMK). You
 * can use an alias to identify a CMK in selected operations, such as
 * <a>Encrypt</a> and <a>GenerateDataKey</a>.
 * </p>
 * <p>
 * Each CMK can have multiple aliases, but each alias points to only one CMK.
 * The alias name must be unique in the AWS account and region. To simplify code
 * that runs in multiple regions, use the same alias name, but point it to a
 * different CMK in each region.
 * </p>
 * <p>
 * Because an alias is not a property of a CMK, you can delete and change the
 * aliases of a CMK without affecting the CMK. Also, aliases do not appear in
 * the response from the <a>DescribeKey</a> operation. To get the aliases of all
 * CMKs, use the <a>ListAliases</a> operation.
 * </p>
 * <p>
 * The alias name must begin with <code>alias/</code> followed by a name, such
 * as <code>alias/ExampleAlias</code>. It can contain only alphanumeric
 * characters, forward slashes (/), underscores (_), and dashes (-). The alias
 * name cannot begin with <code>alias/aws/</code>. The <code>alias/aws/</code>
 * prefix is reserved for <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
 * >AWS managed CMKs</a>.
 * </p>
 * <p>
 * The alias and the CMK it is mapped to must be in the same AWS account and the
 * same region. You cannot perform this operation on an alias in a different AWS
 * account.
 * </p>
 * <p>
 * To map an existing alias to a different CMK, call <a>UpdateAlias</a>.
 * </p>
 * <p>
 * The result of this operation varies with the key state of the CMK. For
 * details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
 * Management Service Developer Guide</i>.
 * </p>
 */
public class CreateAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>. The alias
     * name cannot begin with <code>alias/aws/</code>. The
     * <code>alias/aws/</code> prefix is reserved for AWS managed CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * <p>
     * Identifies the CMK to which the alias refers. Specify the key ID or the
     * Amazon Resource Name (ARN) of the CMK. You cannot specify another alias.
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String targetKeyId;

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>. The alias
     * name cannot begin with <code>alias/aws/</code>. The
     * <code>alias/aws/</code> prefix is reserved for AWS managed CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         Specifies the alias name. This value must begin with
     *         <code>alias/</code> followed by a name, such as
     *         <code>alias/ExampleAlias</code>. The alias name cannot begin with
     *         <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is
     *         reserved for AWS managed CMKs.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>. The alias
     * name cannot begin with <code>alias/aws/</code>. The
     * <code>alias/aws/</code> prefix is reserved for AWS managed CMKs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            Specifies the alias name. This value must begin with
     *            <code>alias/</code> followed by a name, such as
     *            <code>alias/ExampleAlias</code>. The alias name cannot begin
     *            with <code>alias/aws/</code>. The <code>alias/aws/</code>
     *            prefix is reserved for AWS managed CMKs.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>. The alias
     * name cannot begin with <code>alias/aws/</code>. The
     * <code>alias/aws/</code> prefix is reserved for AWS managed CMKs.
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
     *            Specifies the alias name. This value must begin with
     *            <code>alias/</code> followed by a name, such as
     *            <code>alias/ExampleAlias</code>. The alias name cannot begin
     *            with <code>alias/aws/</code>. The <code>alias/aws/</code>
     *            prefix is reserved for AWS managed CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAliasRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * <p>
     * Identifies the CMK to which the alias refers. Specify the key ID or the
     * Amazon Resource Name (ARN) of the CMK. You cannot specify another alias.
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Identifies the CMK to which the alias refers. Specify the key ID
     *         or the Amazon Resource Name (ARN) of the CMK. You cannot specify
     *         another alias. For help finding the key ID and ARN, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     *         >Finding the Key ID and ARN</a> in the <i>AWS Key Management
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    /**
     * <p>
     * Identifies the CMK to which the alias refers. Specify the key ID or the
     * Amazon Resource Name (ARN) of the CMK. You cannot specify another alias.
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            Identifies the CMK to which the alias refers. Specify the key
     *            ID or the Amazon Resource Name (ARN) of the CMK. You cannot
     *            specify another alias. For help finding the key ID and ARN,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     *            >Finding the Key ID and ARN</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * Identifies the CMK to which the alias refers. Specify the key ID or the
     * Amazon Resource Name (ARN) of the CMK. You cannot specify another alias.
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            Identifies the CMK to which the alias refers. Specify the key
     *            ID or the Amazon Resource Name (ARN) of the CMK. You cannot
     *            specify another alias. For help finding the key ID and ARN,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     *            >Finding the Key ID and ARN</a> in the <i>AWS Key Management
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAliasRequest withTargetKeyId(String targetKeyId) {
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

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;

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
