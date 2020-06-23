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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing policy with a new name, description, or content. If you
 * don't supply any parameter, that value remains unchanged. You can't change a
 * policy's type.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class UpdatePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     */
    private String policyId;

    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     */
    private String description;

    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly
     * formatted JSON that complies with the syntax for the policy's type. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html"
     * >Service Control Policy Syntax</a> in the <i>AWS Organizations User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     */
    private String content;

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the policy that you want to update.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a policy ID string requires "p-" followed by from 8 to 128
     *         lowercase or uppercase letters, digits, or the underscore
     *         character (_).
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @param policyId <p>
     *            The unique identifier (ID) of the policy that you want to
     *            update.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a policy ID string requires "p-" followed by
     *            from 8 to 128 lowercase or uppercase letters, digits, or the
     *            underscore character (_).
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @param policyId <p>
     *            The unique identifier (ID) of the policy that you want to
     *            update.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a policy ID string requires "p-" followed by
     *            from 8 to 128 lowercase or uppercase letters, digits, or the
     *            underscore character (_).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         If provided, the new name for the policy.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         that is used to validate this parameter is a string of any of the
     *         characters in the ASCII character range.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            If provided, the new name for the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            If provided, the new name for the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePolicyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @return <p>
     *         If provided, the new description for the policy.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param description <p>
     *            If provided, the new description for the policy.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param description <p>
     *            If provided, the new description for the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePolicyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly
     * formatted JSON that complies with the syntax for the policy's type. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html"
     * >Service Control Policy Syntax</a> in the <i>AWS Organizations User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     *
     * @return <p>
     *         If provided, the new content for the policy. The text must be
     *         correctly formatted JSON that complies with the syntax for the
     *         policy's type. For more information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html"
     *         >Service Control Policy Syntax</a> in the <i>AWS Organizations
     *         User Guide.</i>
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly
     * formatted JSON that complies with the syntax for the policy's type. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html"
     * >Service Control Policy Syntax</a> in the <i>AWS Organizations User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     *
     * @param content <p>
     *            If provided, the new content for the policy. The text must be
     *            correctly formatted JSON that complies with the syntax for the
     *            policy's type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html"
     *            >Service Control Policy Syntax</a> in the <i>AWS Organizations
     *            User Guide.</i>
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly
     * formatted JSON that complies with the syntax for the policy's type. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html"
     * >Service Control Policy Syntax</a> in the <i>AWS Organizations User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     *
     * @param content <p>
     *            If provided, the new content for the policy. The text must be
     *            correctly formatted JSON that complies with the syntax for the
     *            policy's type. For more information, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html"
     *            >Service Control Policy Syntax</a> in the <i>AWS Organizations
     *            User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePolicyRequest withContent(String content) {
        this.content = content;
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
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicyRequest == false)
            return false;
        UpdatePolicyRequest other = (UpdatePolicyRequest) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
