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
 * Detaches a policy from a target root, organizational unit (OU), or account.
 * If the policy being detached is a service control policy (SCP), the changes
 * to permissions for IAM users and roles in affected accounts are immediate.
 * </p>
 * <p>
 * <b>Note:</b> Every root, OU, and account must have at least one SCP attached.
 * If you want to replace the default <code>FullAWSAccess</code> policy with one
 * that limits the permissions that can be delegated, you must attach the
 * replacement policy before you can remove the default one. This is the
 * authorization strategy of an
 * "<a href="https://docs.aws.amazon.com/organizations
 * /latest/userguide/orgs_manage_policies_about
 * -scps.html#orgs_policies_whitelist">allow list</a>". If you instead attach a
 * second SCP and leave the <code>FullAWSAccess</code> SCP still attached, and
 * specify <code>"Effect": "Deny"</code> in the second SCP to override the
 * <code>"Effect": "Allow"</code> in the <code>FullAWSAccess</code> policy (or
 * any other attached SCP), you're using the authorization strategy of a
 * "<a href="https://docs.aws.amazon.com/organizations/latest/userguide/
 * orgs_manage_policies_about-scps.html#orgs_policies_blacklist">deny list</a>".
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class DetachPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the policy you want to detach. You can get
     * the ID from the <a>ListPolicies</a> or <a>ListPoliciesForTarget</a>
     * operations.
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
     * detach the policy from. You can get the ID from the <a>ListRoots</a>,
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
     * The unique identifier (ID) of the policy you want to detach. You can get
     * the ID from the <a>ListPolicies</a> or <a>ListPoliciesForTarget</a>
     * operations.
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
     *         The unique identifier (ID) of the policy you want to detach. You
     *         can get the ID from the <a>ListPolicies</a> or
     *         <a>ListPoliciesForTarget</a> operations.
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
     * The unique identifier (ID) of the policy you want to detach. You can get
     * the ID from the <a>ListPolicies</a> or <a>ListPoliciesForTarget</a>
     * operations.
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
     *            The unique identifier (ID) of the policy you want to detach.
     *            You can get the ID from the <a>ListPolicies</a> or
     *            <a>ListPoliciesForTarget</a> operations.
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
     * The unique identifier (ID) of the policy you want to detach. You can get
     * the ID from the <a>ListPolicies</a> or <a>ListPoliciesForTarget</a>
     * operations.
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
     *            The unique identifier (ID) of the policy you want to detach.
     *            You can get the ID from the <a>ListPolicies</a> or
     *            <a>ListPoliciesForTarget</a> operations.
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
    public DetachPolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to
     * detach the policy from. You can get the ID from the <a>ListRoots</a>,
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
     *         want to detach the policy from. You can get the ID from the
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
     * detach the policy from. You can get the ID from the <a>ListRoots</a>,
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
     *            you want to detach the policy from. You can get the ID from
     *            the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>,
     *            or <a>ListAccounts</a> operations.
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
     * detach the policy from. You can get the ID from the <a>ListRoots</a>,
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
     *            you want to detach the policy from. You can get the ID from
     *            the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>,
     *            or <a>ListAccounts</a> operations.
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
    public DetachPolicyRequest withTargetId(String targetId) {
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

        if (obj instanceof DetachPolicyRequest == false)
            return false;
        DetachPolicyRequest other = (DetachPolicyRequest) obj;

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
