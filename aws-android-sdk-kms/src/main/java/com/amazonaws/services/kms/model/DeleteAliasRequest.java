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
 * Deletes the specified alias.
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
 * Because an alias is not a property of a KMS key, you can delete and change
 * the aliases of a KMS key without affecting the KMS key. Also, aliases do not
 * appear in the response from the <a>DescribeKey</a> operation. To get the
 * aliases of all KMS keys, use the <a>ListAliases</a> operation.
 * </p>
 * <p>
 * Each KMS key can have multiple aliases. To change the alias of a KMS key, use
 * <a>DeleteAlias</a> to delete the current alias and <a>CreateAlias</a> to
 * create a new alias. To associate an existing alias with a different KMS key,
 * call <a>UpdateAlias</a>.
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
 * >kms:DeleteAlias</a> on the alias (IAM policy).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:DeleteAlias</a> on the KMS key (key policy).
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
public class DeleteAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The alias to be deleted. The alias name must begin with
     * <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String aliasName;

    /**
     * <p>
     * The alias to be deleted. The alias name must begin with
     * <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         The alias to be deleted. The alias name must begin with
     *         <code>alias/</code> followed by the alias name, such as
     *         <code>alias/ExampleAlias</code>.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * The alias to be deleted. The alias name must begin with
     * <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param aliasName <p>
     *            The alias to be deleted. The alias name must begin with
     *            <code>alias/</code> followed by the alias name, such as
     *            <code>alias/ExampleAlias</code>.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The alias to be deleted. The alias name must begin with
     * <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>.
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
     *            The alias to be deleted. The alias name must begin with
     *            <code>alias/</code> followed by the alias name, such as
     *            <code>alias/ExampleAlias</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAliasRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
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
            sb.append("AliasName: " + getAliasName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAliasRequest == false)
            return false;
        DeleteAliasRequest other = (DeleteAliasRequest) obj;

        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        return true;
    }
}
