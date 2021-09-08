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
 * Creates a friendly name for a KMS key.
 * </p>
 * <note>
 * <p>
 * Adding, deleting, or updating an alias can allow or deny permission to the
 * KMS key. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using
 * ABAC in KMS</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * </note>
 * <p>
 * You can use an alias to identify a KMS key in the KMS console, in the
 * <a>DescribeKey</a> operation and in <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
 * >cryptographic operations</a>, such as <a>Encrypt</a> and
 * <a>GenerateDataKey</a>. You can also change the KMS key that's associated
 * with the alias (<a>UpdateAlias</a>) or delete the alias (<a>DeleteAlias</a>)
 * at any time. These operations don't affect the underlying KMS key.
 * </p>
 * <p>
 * You can associate the alias with any customer managed key in the same Amazon
 * Web Services Region. Each alias is associated with only one KMS key at a
 * time, but a KMS key can have multiple aliases. A valid KMS key is required.
 * You can't create an alias without a KMS key.
 * </p>
 * <p>
 * The alias must be unique in the account and Region, but you can have aliases
 * with the same name in different Regions. For detailed information about
 * aliases, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html"
 * >Using aliases</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * This operation does not return a response. To get the alias that you created,
 * use the <a>ListAliases</a> operation.
 * </p>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on an alias
 * in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:CreateAlias</a> on the alias (IAM policy).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:CreateAlias</a> on the KMS key (key policy).
 * </p>
 * </li>
 * </ul>
 * <p>
 * For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html#alias-access"
 * >Controlling access to aliases</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Related operations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAliases</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAlias</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It
     * can contain only alphanumeric characters, forward slashes (/),
     * underscores (_), and dashes (-). The alias name cannot begin with
     * <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved
     * for <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed keys</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * <p>
     * Associates the alias with the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a>. The KMS key must be in the same Amazon Web
     * Services Region.
     * </p>
     * <p>
     * A valid key ID is required. If you supply a null or empty string value,
     * this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String targetKeyId;

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It
     * can contain only alphanumeric characters, forward slashes (/),
     * underscores (_), and dashes (-). The alias name cannot begin with
     * <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved
     * for <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed keys</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         Specifies the alias name. This value must begin with
     *         <code>alias/</code> followed by a name, such as
     *         <code>alias/ExampleAlias</code>.
     *         </p>
     *         <p>
     *         The <code>AliasName</code> value must be string of 1-256
     *         characters. It can contain only alphanumeric characters, forward
     *         slashes (/), underscores (_), and dashes (-). The alias name
     *         cannot begin with <code>alias/aws/</code>. The
     *         <code>alias/aws/</code> prefix is reserved for <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     *         >Amazon Web Services managed keys</a>.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It
     * can contain only alphanumeric characters, forward slashes (/),
     * underscores (_), and dashes (-). The alias name cannot begin with
     * <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved
     * for <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed keys</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            Specifies the alias name. This value must begin with
     *            <code>alias/</code> followed by a name, such as
     *            <code>alias/ExampleAlias</code>.
     *            </p>
     *            <p>
     *            The <code>AliasName</code> value must be string of 1-256
     *            characters. It can contain only alphanumeric characters,
     *            forward slashes (/), underscores (_), and dashes (-). The
     *            alias name cannot begin with <code>alias/aws/</code>. The
     *            <code>alias/aws/</code> prefix is reserved for <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     *            >Amazon Web Services managed keys</a>.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * Specifies the alias name. This value must begin with <code>alias/</code>
     * followed by a name, such as <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * The <code>AliasName</code> value must be string of 1-256 characters. It
     * can contain only alphanumeric characters, forward slashes (/),
     * underscores (_), and dashes (-). The alias name cannot begin with
     * <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved
     * for <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed keys</a>.
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
     *            <code>alias/ExampleAlias</code>.
     *            </p>
     *            <p>
     *            The <code>AliasName</code> value must be string of 1-256
     *            characters. It can contain only alphanumeric characters,
     *            forward slashes (/), underscores (_), and dashes (-). The
     *            alias name cannot begin with <code>alias/aws/</code>. The
     *            <code>alias/aws/</code> prefix is reserved for <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     *            >Amazon Web Services managed keys</a>.
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
     * Associates the alias with the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a>. The KMS key must be in the same Amazon Web
     * Services Region.
     * </p>
     * <p>
     * A valid key ID is required. If you supply a null or empty string value,
     * this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Associates the alias with the specified <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     *         >customer managed key</a>. The KMS key must be in the same Amazon
     *         Web Services Region.
     *         </p>
     *         <p>
     *         A valid key ID is required. If you supply a null or empty string
     *         value, this operation returns an error.
     *         </p>
     *         <p>
     *         For help finding the key ID and ARN, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     *         >Finding the Key ID and ARN</a> in the <i> <i>Key Management
     *         Service Developer Guide</i> </i>.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key.
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
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a>
     *         or <a>DescribeKey</a>.
     *         </p>
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    /**
     * <p>
     * Associates the alias with the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a>. The KMS key must be in the same Amazon Web
     * Services Region.
     * </p>
     * <p>
     * A valid key ID is required. If you supply a null or empty string value,
     * this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            Associates the alias with the specified <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     *            >customer managed key</a>. The KMS key must be in the same
     *            Amazon Web Services Region.
     *            </p>
     *            <p>
     *            A valid key ID is required. If you supply a null or empty
     *            string value, this operation returns an error.
     *            </p>
     *            <p>
     *            For help finding the key ID and ARN, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     *            >Finding the Key ID and ARN</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
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
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * Associates the alias with the specified <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a>. The KMS key must be in the same Amazon Web
     * Services Region.
     * </p>
     * <p>
     * A valid key ID is required. If you supply a null or empty string value,
     * this operation returns an error.
     * </p>
     * <p>
     * For help finding the key ID and ARN, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     * >Finding the Key ID and ARN</a> in the <i> <i>Key Management Service
     * Developer Guide</i> </i>.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            Associates the alias with the specified <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     *            >customer managed key</a>. The KMS key must be in the same
     *            Amazon Web Services Region.
     *            </p>
     *            <p>
     *            A valid key ID is required. If you supply a null or empty
     *            string value, this operation returns an error.
     *            </p>
     *            <p>
     *            For help finding the key ID and ARN, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn"
     *            >Finding the Key ID and ARN</a> in the <i> <i>Key Management
     *            Service Developer Guide</i> </i>.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
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
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
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
