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
 * Associates an existing KMS alias with a different KMS key. Each alias is
 * associated with only one KMS key at a time, although a KMS key can have
 * multiple aliases. The alias and the KMS key must be in the same Amazon Web
 * Services account and Region.
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
 * The current and new KMS key must be the same type (both symmetric or both
 * asymmetric), and they must have the same key usage (
 * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>). This restriction
 * prevents errors in code that uses aliases. If you must assign an alias to a
 * different type of KMS key, use <a>DeleteAlias</a> to delete the old alias and
 * <a>CreateAlias</a> to create a new alias.
 * </p>
 * <p>
 * You cannot use <code>UpdateAlias</code> to change an alias name. To change an
 * alias name, use <a>DeleteAlias</a> to delete the old alias and
 * <a>CreateAlias</a> to create a new alias.
 * </p>
 * <p>
 * Because an alias is not a property of a KMS key, you can create, update, and
 * delete the aliases of a KMS key without affecting the KMS key. Also, aliases
 * do not appear in the response from the <a>DescribeKey</a> operation. To get
 * the aliases of all KMS keys in the account, use the <a>ListAliases</a>
 * operation.
 * </p>
 * <p>
 * The KMS key that you use for this operation must be in a compatible key
 * state. For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >Key state: Effect on your KMS key</a> in the <i>Key Management Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key
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
 * >kms:UpdateAlias</a> on the alias (IAM policy).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:UpdateAlias</a> on the current KMS key (key policy).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:UpdateAlias</a> on the new KMS key (key policy).
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
 * <a>CreateAlias</a>
 * </p>
 * </li>
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
 * </ul>
 */
public class UpdateAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the alias that is changing its KMS key. This value must begin
     * with <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the
     * alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * <p>
     * Identifies the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a> to associate with the alias. You don't have
     * permission to associate an alias with an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed key</a>.
     * </p>
     * <p>
     * The KMS key must be in the same Amazon Web Services account and Region as
     * the alias. Also, the new target KMS key must be the same type as the
     * current target KMS key (both symmetric or both asymmetric) and they must
     * have the same key usage.
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
     * To verify that the alias is mapped to the correct KMS key, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String targetKeyId;

    /**
     * <p>
     * Identifies the alias that is changing its KMS key. This value must begin
     * with <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the
     * alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         Identifies the alias that is changing its KMS key. This value
     *         must begin with <code>alias/</code> followed by the alias name,
     *         such as <code>alias/ExampleAlias</code>. You cannot use
     *         UpdateAlias to change the alias name.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * Identifies the alias that is changing its KMS key. This value must begin
     * with <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the
     * alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            Identifies the alias that is changing its KMS key. This value
     *            must begin with <code>alias/</code> followed by the alias
     *            name, such as <code>alias/ExampleAlias</code>. You cannot use
     *            UpdateAlias to change the alias name.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * Identifies the alias that is changing its KMS key. This value must begin
     * with <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the
     * alias name.
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
     *            Identifies the alias that is changing its KMS key. This value
     *            must begin with <code>alias/</code> followed by the alias
     *            name, such as <code>alias/ExampleAlias</code>. You cannot use
     *            UpdateAlias to change the alias name.
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
     * Identifies the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a> to associate with the alias. You don't have
     * permission to associate an alias with an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed key</a>.
     * </p>
     * <p>
     * The KMS key must be in the same Amazon Web Services account and Region as
     * the alias. Also, the new target KMS key must be the same type as the
     * current target KMS key (both symmetric or both asymmetric) and they must
     * have the same key usage.
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
     * To verify that the alias is mapped to the correct KMS key, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Identifies the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     *         >customer managed key</a> to associate with the alias. You don't
     *         have permission to associate an alias with an <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     *         >Amazon Web Services managed key</a>.
     *         </p>
     *         <p>
     *         The KMS key must be in the same Amazon Web Services account and
     *         Region as the alias. Also, the new target KMS key must be the
     *         same type as the current target KMS key (both symmetric or both
     *         asymmetric) and they must have the same key usage.
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
     *         <p>
     *         To verify that the alias is mapped to the correct KMS key, use
     *         <a>ListAliases</a>.
     *         </p>
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    /**
     * <p>
     * Identifies the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a> to associate with the alias. You don't have
     * permission to associate an alias with an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed key</a>.
     * </p>
     * <p>
     * The KMS key must be in the same Amazon Web Services account and Region as
     * the alias. Also, the new target KMS key must be the same type as the
     * current target KMS key (both symmetric or both asymmetric) and they must
     * have the same key usage.
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
     * To verify that the alias is mapped to the correct KMS key, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            Identifies the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     *            >customer managed key</a> to associate with the alias. You
     *            don't have permission to associate an alias with an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     *            >Amazon Web Services managed key</a>.
     *            </p>
     *            <p>
     *            The KMS key must be in the same Amazon Web Services account
     *            and Region as the alias. Also, the new target KMS key must be
     *            the same type as the current target KMS key (both symmetric or
     *            both asymmetric) and they must have the same key usage.
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
     *            <p>
     *            To verify that the alias is mapped to the correct KMS key, use
     *            <a>ListAliases</a>.
     *            </p>
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * Identifies the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     * >customer managed key</a> to associate with the alias. You don't have
     * permission to associate an alias with an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     * >Amazon Web Services managed key</a>.
     * </p>
     * <p>
     * The KMS key must be in the same Amazon Web Services account and Region as
     * the alias. Also, the new target KMS key must be the same type as the
     * current target KMS key (both symmetric or both asymmetric) and they must
     * have the same key usage.
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
     * To verify that the alias is mapped to the correct KMS key, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            Identifies the <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk"
     *            >customer managed key</a> to associate with the alias. You
     *            don't have permission to associate an alias with an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk"
     *            >Amazon Web Services managed key</a>.
     *            </p>
     *            <p>
     *            The KMS key must be in the same Amazon Web Services account
     *            and Region as the alias. Also, the new target KMS key must be
     *            the same type as the current target KMS key (both symmetric or
     *            both asymmetric) and they must have the same key usage.
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
     *            <p>
     *            To verify that the alias is mapped to the correct KMS key, use
     *            <a>ListAliases</a>.
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
