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
 * Contains the response to a successful <a>GetAccountAuthorizationDetails</a>
 * request.
 * </p>
 */
public class GetAccountAuthorizationDetailsResult implements Serializable {
    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     */
    private java.util.List<UserDetail> userDetailList;

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     */
    private java.util.List<GroupDetail> groupDetailList;

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     */
    private java.util.List<RoleDetail> roleDetailList;

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     */
    private java.util.List<ManagedPolicyDetail> policies;

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
     * A list containing information about IAM users.
     * </p>
     *
     * @return <p>
     *         A list containing information about IAM users.
     *         </p>
     */
    public java.util.List<UserDetail> getUserDetailList() {
        return userDetailList;
    }

    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     *
     * @param userDetailList <p>
     *            A list containing information about IAM users.
     *            </p>
     */
    public void setUserDetailList(java.util.Collection<UserDetail> userDetailList) {
        if (userDetailList == null) {
            this.userDetailList = null;
            return;
        }

        this.userDetailList = new java.util.ArrayList<UserDetail>(userDetailList);
    }

    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDetailList <p>
     *            A list containing information about IAM users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withUserDetailList(UserDetail... userDetailList) {
        if (getUserDetailList() == null) {
            this.userDetailList = new java.util.ArrayList<UserDetail>(userDetailList.length);
        }
        for (UserDetail value : userDetailList) {
            this.userDetailList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDetailList <p>
     *            A list containing information about IAM users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withUserDetailList(
            java.util.Collection<UserDetail> userDetailList) {
        setUserDetailList(userDetailList);
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     *
     * @return <p>
     *         A list containing information about IAM groups.
     *         </p>
     */
    public java.util.List<GroupDetail> getGroupDetailList() {
        return groupDetailList;
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     *
     * @param groupDetailList <p>
     *            A list containing information about IAM groups.
     *            </p>
     */
    public void setGroupDetailList(java.util.Collection<GroupDetail> groupDetailList) {
        if (groupDetailList == null) {
            this.groupDetailList = null;
            return;
        }

        this.groupDetailList = new java.util.ArrayList<GroupDetail>(groupDetailList);
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupDetailList <p>
     *            A list containing information about IAM groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withGroupDetailList(GroupDetail... groupDetailList) {
        if (getGroupDetailList() == null) {
            this.groupDetailList = new java.util.ArrayList<GroupDetail>(groupDetailList.length);
        }
        for (GroupDetail value : groupDetailList) {
            this.groupDetailList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupDetailList <p>
     *            A list containing information about IAM groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withGroupDetailList(
            java.util.Collection<GroupDetail> groupDetailList) {
        setGroupDetailList(groupDetailList);
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     *
     * @return <p>
     *         A list containing information about IAM roles.
     *         </p>
     */
    public java.util.List<RoleDetail> getRoleDetailList() {
        return roleDetailList;
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     *
     * @param roleDetailList <p>
     *            A list containing information about IAM roles.
     *            </p>
     */
    public void setRoleDetailList(java.util.Collection<RoleDetail> roleDetailList) {
        if (roleDetailList == null) {
            this.roleDetailList = null;
            return;
        }

        this.roleDetailList = new java.util.ArrayList<RoleDetail>(roleDetailList);
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleDetailList <p>
     *            A list containing information about IAM roles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withRoleDetailList(RoleDetail... roleDetailList) {
        if (getRoleDetailList() == null) {
            this.roleDetailList = new java.util.ArrayList<RoleDetail>(roleDetailList.length);
        }
        for (RoleDetail value : roleDetailList) {
            this.roleDetailList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about IAM roles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleDetailList <p>
     *            A list containing information about IAM roles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withRoleDetailList(
            java.util.Collection<RoleDetail> roleDetailList) {
        setRoleDetailList(roleDetailList);
        return this;
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     *
     * @return <p>
     *         A list containing information about managed policies.
     *         </p>
     */
    public java.util.List<ManagedPolicyDetail> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     *
     * @param policies <p>
     *            A list containing information about managed policies.
     *            </p>
     */
    public void setPolicies(java.util.Collection<ManagedPolicyDetail> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<ManagedPolicyDetail>(policies);
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            A list containing information about managed policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withPolicies(ManagedPolicyDetail... policies) {
        if (getPolicies() == null) {
            this.policies = new java.util.ArrayList<ManagedPolicyDetail>(policies.length);
        }
        for (ManagedPolicyDetail value : policies) {
            this.policies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about managed policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            A list containing information about managed policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsResult withPolicies(
            java.util.Collection<ManagedPolicyDetail> policies) {
        setPolicies(policies);
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
    public GetAccountAuthorizationDetailsResult withIsTruncated(Boolean isTruncated) {
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
    public GetAccountAuthorizationDetailsResult withMarker(String marker) {
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
        if (getUserDetailList() != null)
            sb.append("UserDetailList: " + getUserDetailList() + ",");
        if (getGroupDetailList() != null)
            sb.append("GroupDetailList: " + getGroupDetailList() + ",");
        if (getRoleDetailList() != null)
            sb.append("RoleDetailList: " + getRoleDetailList() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
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
                + ((getUserDetailList() == null) ? 0 : getUserDetailList().hashCode());
        hashCode = prime * hashCode
                + ((getGroupDetailList() == null) ? 0 : getGroupDetailList().hashCode());
        hashCode = prime * hashCode
                + ((getRoleDetailList() == null) ? 0 : getRoleDetailList().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
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

        if (obj instanceof GetAccountAuthorizationDetailsResult == false)
            return false;
        GetAccountAuthorizationDetailsResult other = (GetAccountAuthorizationDetailsResult) obj;

        if (other.getUserDetailList() == null ^ this.getUserDetailList() == null)
            return false;
        if (other.getUserDetailList() != null
                && other.getUserDetailList().equals(this.getUserDetailList()) == false)
            return false;
        if (other.getGroupDetailList() == null ^ this.getGroupDetailList() == null)
            return false;
        if (other.getGroupDetailList() != null
                && other.getGroupDetailList().equals(this.getGroupDetailList()) == false)
            return false;
        if (other.getRoleDetailList() == null ^ this.getRoleDetailList() == null)
            return false;
        if (other.getRoleDetailList() != null
                && other.getRoleDetailList().equals(this.getRoleDetailList()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
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
