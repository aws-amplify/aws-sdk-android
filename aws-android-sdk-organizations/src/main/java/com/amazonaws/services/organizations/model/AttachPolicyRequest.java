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
 * Attaches a policy to a root, an organizational unit (OU), or an individual
 * account. How the policy affects accounts depends on the type of policy:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Service control policy (SCP)</b> - An SCP specifies what permissions can
 * be delegated to users in affected member accounts. The scope of influence for
 * a policy depends on what you attach the policy to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you attach an SCP to a root, it affects all accounts in the organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you attach an SCP to an OU, it affects all accounts in that OU and in any
 * child OUs.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you attach the policy directly to an account, it affects only that
 * account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * SCPs are JSON policies that specify the maximum permissions for an
 * organization or organizational unit (OU). You can attach one SCP to a higher
 * level root or OU, and a different SCP to a child OU or to an account. The
 * child policy can further restrict only the permissions that pass through the
 * parent filter and are available to the child. An SCP that is attached to a
 * child can't grant a permission that the parent hasn't already granted. For
 * example, imagine that the parent SCP allows permissions A, B, C, D, and E.
 * The child SCP allows C, D, E, F, and G. The result is that the accounts
 * affected by the child SCP are allowed to use only C, D, and E. They can't use
 * A or B because the child OU filtered them out. They also can't use F and G
 * because the parent OU filtered them out. They can't be granted back by the
 * child SCP; child SCPs can only filter the permissions they receive from the
 * parent SCP.
 * </p>
 * <p>
 * AWS Organizations attaches a default SCP named <code>"FullAWSAccess</code> to
 * every root, OU, and account. This default SCP allows all services and
 * actions, enabling any new child OU or account to inherit the permissions of
 * the parent root or OU. If you detach the default policy, you must replace it
 * with a policy that specifies the permissions that you want to allow in that
 * OU or account.
 * </p>
 * <p>
 * For more information about how AWS Organizations policies permissions work,
 * see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
 * >Using Service Control Policies</a> in the <i>AWS Organizations User
 * Guide.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class AttachPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to attach to the
     * target. You can get the ID for the policy by calling the
     * <a>ListPolicies</a> operation.
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
     * The unique identifier (ID) of the root, OU, or account that you want to
     * attach the policy to. You can get the ID by calling the <a>ListRoots</a>,
     * <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a>
     * operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Account</b> - A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     */
    private String targetId;

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to attach to the
     * target. You can get the ID for the policy by calling the
     * <a>ListPolicies</a> operation.
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
     *         The unique identifier (ID) of the policy that you want to attach
     *         to the target. You can get the ID for the policy by calling the
     *         <a>ListPolicies</a> operation.
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
     * The unique identifier (ID) of the policy that you want to attach to the
     * target. You can get the ID for the policy by calling the
     * <a>ListPolicies</a> operation.
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
     *            attach to the target. You can get the ID for the policy by
     *            calling the <a>ListPolicies</a> operation.
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
     * The unique identifier (ID) of the policy that you want to attach to the
     * target. You can get the ID for the policy by calling the
     * <a>ListPolicies</a> operation.
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
     *            attach to the target. You can get the ID for the policy by
     *            calling the <a>ListPolicies</a> operation.
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
    public AttachPolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to
     * attach the policy to. You can get the ID by calling the <a>ListRoots</a>,
     * <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a>
     * operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Account</b> - A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the root, OU, or account that you
     *         want to attach the policy to. You can get the ID by calling the
     *         <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or
     *         <a>ListAccounts</a> operations.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a target ID string requires one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Root</b> - A string that begins with "r-" followed by from 4
     *         to 32 lowercase letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Account</b> - A string that consists of exactly 12 digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     *         followed by from 4 to 32 lowercase letters or digits (the ID of
     *         the root that the OU is in). This string is followed by a second
     *         "-" dash and from 8 to 32 additional lowercase letters or digits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to
     * attach the policy to. You can get the ID by calling the <a>ListRoots</a>,
     * <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a>
     * operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Account</b> - A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            The unique identifier (ID) of the root, OU, or account that
     *            you want to attach the policy to. You can get the ID by
     *            calling the <a>ListRoots</a>,
     *            <a>ListOrganizationalUnitsForParent</a>, or
     *            <a>ListAccounts</a> operations.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a target ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Account</b> - A string that consists of exactly 12 digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to
     * attach the policy to. You can get the ID by calling the <a>ListRoots</a>,
     * <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a>
     * operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Account</b> - A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            The unique identifier (ID) of the root, OU, or account that
     *            you want to attach the policy to. You can get the ID by
     *            calling the <a>ListRoots</a>,
     *            <a>ListOrganizationalUnitsForParent</a>, or
     *            <a>ListAccounts</a> operations.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a target ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Account</b> - A string that consists of exactly 12 digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachPolicyRequest withTargetId(String targetId) {
        this.targetId = targetId;
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
        if (getTargetId() != null)
            sb.append("TargetId: " + getTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachPolicyRequest == false)
            return false;
        AttachPolicyRequest other = (AttachPolicyRequest) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        return true;
    }
}
