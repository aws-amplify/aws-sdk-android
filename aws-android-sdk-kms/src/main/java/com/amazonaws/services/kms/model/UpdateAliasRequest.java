/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Associates an existing AWS KMS alias with a different customer master key
 * (CMK). Each alias is associated with only one CMK at a time, although a CMK
 * can have multiple aliases. The alias and the CMK must be in the same AWS
 * account and region. You cannot perform this operation on an alias in a
 * different AWS account.
 * </p>
 * <p>
 * The current and new CMK must be the same type (both symmetric or both
 * asymmetric), and they must have the same key usage (
 * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>). This restriction
 * prevents errors in code that uses aliases. If you must assign an alias to a
 * different type of CMK, use <a>DeleteAlias</a> to delete the old alias and
 * <a>CreateAlias</a> to create a new alias.
 * </p>
 * <p>
 * You cannot use <code>UpdateAlias</code> to change an alias name. To change an
 * alias name, use <a>DeleteAlias</a> to delete the old alias and
 * <a>CreateAlias</a> to create a new alias.
 * </p>
 * <p>
 * Because an alias is not a property of a CMK, you can create, update, and
 * delete the aliases of a CMK without affecting the CMK. Also, aliases do not
 * appear in the response from the <a>DescribeKey</a> operation. To get the
 * aliases of all CMKs in the account, use the <a>ListAliases</a> operation.
 * </p>
 * <p>
 * The CMK that you use for this operation must be in a compatible key state.
 * For details, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
 * >How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key
 * Management Service Developer Guide</i>.
 * </p>
 */
public class UpdateAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with
     * <code>alias/</code> followed by the alias name, such as
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
     * Identifies the CMK to associate with the alias. When the update operation
     * completes, the alias will point to this CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also,
     * the new target CMK must be the same type as the current target CMK (both
     * symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String targetKeyId;

    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with
     * <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the
     * alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         Identifies the alias that is changing its CMK. This value must
     *         begin with <code>alias/</code> followed by the alias name, such
     *         as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to
     *         change the alias name.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with
     * <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the
     * alias name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            Identifies the alias that is changing its CMK. This value must
     *            begin with <code>alias/</code> followed by the alias name,
     *            such as <code>alias/ExampleAlias</code>. You cannot use
     *            UpdateAlias to change the alias name.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with
     * <code>alias/</code> followed by the alias name, such as
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
     *            Identifies the alias that is changing its CMK. This value must
     *            begin with <code>alias/</code> followed by the alias name,
     *            such as <code>alias/ExampleAlias</code>. You cannot use
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
     * Identifies the CMK to associate with the alias. When the update operation
     * completes, the alias will point to this CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also,
     * the new target CMK must be the same type as the current target CMK (both
     * symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Identifies the CMK to associate with the alias. When the update
     *         operation completes, the alias will point to this CMK.
     *         </p>
     *         <p>
     *         The CMK must be in the same AWS account and Region as the alias.
     *         Also, the new target CMK must be the same type as the current
     *         target CMK (both symmetric or both asymmetric) and they must have
     *         the same key usage.
     *         </p>
     *         <p>
     *         Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
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
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     *         <a>DescribeKey</a>.
     *         </p>
     *         <p>
     *         To verify that the alias is mapped to the correct CMK, use
     *         <a>ListAliases</a>.
     *         </p>
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    /**
     * <p>
     * Identifies the CMK to associate with the alias. When the update operation
     * completes, the alias will point to this CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also,
     * the new target CMK must be the same type as the current target CMK (both
     * symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param targetKeyId <p>
     *            Identifies the CMK to associate with the alias. When the
     *            update operation completes, the alias will point to this CMK.
     *            </p>
     *            <p>
     *            The CMK must be in the same AWS account and Region as the
     *            alias. Also, the new target CMK must be the same type as the
     *            current target CMK (both symmetric or both asymmetric) and
     *            they must have the same key usage.
     *            </p>
     *            <p>
     *            Specify the key ID or the Amazon Resource Name (ARN) of the
     *            CMK.
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
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>.
     *            </p>
     *            <p>
     *            To verify that the alias is mapped to the correct CMK, use
     *            <a>ListAliases</a>.
     *            </p>
     */
    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * Identifies the CMK to associate with the alias. When the update operation
     * completes, the alias will point to this CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also,
     * the new target CMK must be the same type as the current target CMK (both
     * symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
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
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use
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
     *            Identifies the CMK to associate with the alias. When the
     *            update operation completes, the alias will point to this CMK.
     *            </p>
     *            <p>
     *            The CMK must be in the same AWS account and Region as the
     *            alias. Also, the new target CMK must be the same type as the
     *            current target CMK (both symmetric or both asymmetric) and
     *            they must have the same key usage.
     *            </p>
     *            <p>
     *            Specify the key ID or the Amazon Resource Name (ARN) of the
     *            CMK.
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
     *            To get the key ID and key ARN for a CMK, use <a>ListKeys</a>
     *            or <a>DescribeKey</a>.
     *            </p>
     *            <p>
     *            To verify that the alias is mapped to the correct CMK, use
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
