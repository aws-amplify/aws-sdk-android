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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>ListEntitiesForPolicy</a> request.
 * </p>
 */
public class ListEntitiesForPolicyResult implements Serializable {
    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     */
    private java.util.List<PolicyGroup> policyGroups;

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     */
    private java.util.List<PolicyUser> policyUsers;

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     */
    private java.util.List<PolicyRole> policyRoles;

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     *
     * @return <p>
     *         A list of IAM groups that the policy is attached to.
     *         </p>
     */
    public java.util.List<PolicyGroup> getPolicyGroups() {
        return policyGroups;
    }

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     *
     * @param policyGroups <p>
     *            A list of IAM groups that the policy is attached to.
     *            </p>
     */
    public void setPolicyGroups(java.util.Collection<PolicyGroup> policyGroups) {
        if (policyGroups == null) {
            this.policyGroups = null;
            return;
        }

        this.policyGroups = new java.util.ArrayList<PolicyGroup>(policyGroups);
    }

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyGroups <p>
     *            A list of IAM groups that the policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withPolicyGroups(PolicyGroup... policyGroups) {
        if (getPolicyGroups() == null) {
            this.policyGroups = new java.util.ArrayList<PolicyGroup>(policyGroups.length);
        }
        for (PolicyGroup value : policyGroups) {
            this.policyGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM groups that the policy is attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyGroups <p>
     *            A list of IAM groups that the policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withPolicyGroups(
            java.util.Collection<PolicyGroup> policyGroups) {
        setPolicyGroups(policyGroups);
        return this;
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     *
     * @return <p>
     *         A list of IAM users that the policy is attached to.
     *         </p>
     */
    public java.util.List<PolicyUser> getPolicyUsers() {
        return policyUsers;
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     *
     * @param policyUsers <p>
     *            A list of IAM users that the policy is attached to.
     *            </p>
     */
    public void setPolicyUsers(java.util.Collection<PolicyUser> policyUsers) {
        if (policyUsers == null) {
            this.policyUsers = null;
            return;
        }

        this.policyUsers = new java.util.ArrayList<PolicyUser>(policyUsers);
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyUsers <p>
     *            A list of IAM users that the policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withPolicyUsers(PolicyUser... policyUsers) {
        if (getPolicyUsers() == null) {
            this.policyUsers = new java.util.ArrayList<PolicyUser>(policyUsers.length);
        }
        for (PolicyUser value : policyUsers) {
            this.policyUsers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM users that the policy is attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyUsers <p>
     *            A list of IAM users that the policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withPolicyUsers(java.util.Collection<PolicyUser> policyUsers) {
        setPolicyUsers(policyUsers);
        return this;
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     *
     * @return <p>
     *         A list of IAM roles that the policy is attached to.
     *         </p>
     */
    public java.util.List<PolicyRole> getPolicyRoles() {
        return policyRoles;
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     *
     * @param policyRoles <p>
     *            A list of IAM roles that the policy is attached to.
     *            </p>
     */
    public void setPolicyRoles(java.util.Collection<PolicyRole> policyRoles) {
        if (policyRoles == null) {
            this.policyRoles = null;
            return;
        }

        this.policyRoles = new java.util.ArrayList<PolicyRole>(policyRoles);
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyRoles <p>
     *            A list of IAM roles that the policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withPolicyRoles(PolicyRole... policyRoles) {
        if (getPolicyRoles() == null) {
            this.policyRoles = new java.util.ArrayList<PolicyRole>(policyRoles.length);
        }
        for (PolicyRole value : policyRoles) {
            this.policyRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM roles that the policy is attached to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyRoles <p>
     *            A list of IAM roles that the policy is attached to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withPolicyRoles(java.util.Collection<PolicyRole> policyRoles) {
        setPolicyRoles(policyRoles);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to
     *         retrieve more items. Note that IAM might return fewer than the
     *         <code>MaxItems</code> number of results even when there are more
     *         results available. We recommend that you check
     *         <code>IsTruncated</code> after every call to ensure that you
     *         receive all your results.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to
     *         retrieve more items. Note that IAM might return fewer than the
     *         <code>MaxItems</code> number of results even when there are more
     *         results available. We recommend that you check
     *         <code>IsTruncated</code> after every call to ensure that you
     *         receive all your results.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can make a subsequent
     *            pagination request using the <code>Marker</code> request
     *            parameter to retrieve more items. Note that IAM might return
     *            fewer than the <code>MaxItems</code> number of results even
     *            when there are more results available. We recommend that you
     *            check <code>IsTruncated</code> after every call to ensure that
     *            you receive all your results.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can make a subsequent
     *            pagination request using the <code>Marker</code> request
     *            parameter to retrieve more items. Note that IAM might return
     *            fewer than the <code>MaxItems</code> number of results even
     *            when there are more results available. We recommend that you
     *            check <code>IsTruncated</code> after every call to ensure that
     *            you receive all your results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     *
     * @return <p>
     *         When <code>IsTruncated</code> is <code>true</code>, this element
     *         is present and contains the value to use for the
     *         <code>Marker</code> parameter in a subsequent pagination request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     *
     * @param marker <p>
     *            When <code>IsTruncated</code> is <code>true</code>, this
     *            element is present and contains the value to use for the
     *            <code>Marker</code> parameter in a subsequent pagination
     *            request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            When <code>IsTruncated</code> is <code>true</code>, this
     *            element is present and contains the value to use for the
     *            <code>Marker</code> parameter in a subsequent pagination
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesForPolicyResult withMarker(String marker) {
        this.marker = marker;
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
        if (getPolicyGroups() != null)
            sb.append("PolicyGroups: " + getPolicyGroups() + ",");
        if (getPolicyUsers() != null)
            sb.append("PolicyUsers: " + getPolicyUsers() + ",");
        if (getPolicyRoles() != null)
            sb.append("PolicyRoles: " + getPolicyRoles() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyGroups() == null) ? 0 : getPolicyGroups().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyUsers() == null) ? 0 : getPolicyUsers().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyRoles() == null) ? 0 : getPolicyRoles().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntitiesForPolicyResult == false)
            return false;
        ListEntitiesForPolicyResult other = (ListEntitiesForPolicyResult) obj;

        if (other.getPolicyGroups() == null ^ this.getPolicyGroups() == null)
            return false;
        if (other.getPolicyGroups() != null
                && other.getPolicyGroups().equals(this.getPolicyGroups()) == false)
            return false;
        if (other.getPolicyUsers() == null ^ this.getPolicyUsers() == null)
            return false;
        if (other.getPolicyUsers() != null
                && other.getPolicyUsers().equals(this.getPolicyUsers()) == false)
            return false;
        if (other.getPolicyRoles() == null ^ this.getPolicyRoles() == null)
            return false;
        if (other.getPolicyRoles() != null
                && other.getPolicyRoles().equals(this.getPolicyRoles()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
