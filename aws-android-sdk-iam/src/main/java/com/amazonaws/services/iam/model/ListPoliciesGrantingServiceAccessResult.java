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

public class ListPoliciesGrantingServiceAccessResult implements Serializable {
    /**
     * <p>
     * A <code>ListPoliciesGrantingServiceAccess</code> object that contains
     * details about the permissions policies attached to the specified identity
     * (user, group, or role).
     * </p>
     */
    private java.util.List<ListPoliciesGrantingServiceAccessEntry> policiesGrantingServiceAccess;

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * We recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all your results.
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
     * A <code>ListPoliciesGrantingServiceAccess</code> object that contains
     * details about the permissions policies attached to the specified identity
     * (user, group, or role).
     * </p>
     *
     * @return <p>
     *         A <code>ListPoliciesGrantingServiceAccess</code> object that
     *         contains details about the permissions policies attached to the
     *         specified identity (user, group, or role).
     *         </p>
     */
    public java.util.List<ListPoliciesGrantingServiceAccessEntry> getPoliciesGrantingServiceAccess() {
        return policiesGrantingServiceAccess;
    }

    /**
     * <p>
     * A <code>ListPoliciesGrantingServiceAccess</code> object that contains
     * details about the permissions policies attached to the specified identity
     * (user, group, or role).
     * </p>
     *
     * @param policiesGrantingServiceAccess <p>
     *            A <code>ListPoliciesGrantingServiceAccess</code> object that
     *            contains details about the permissions policies attached to
     *            the specified identity (user, group, or role).
     *            </p>
     */
    public void setPoliciesGrantingServiceAccess(
            java.util.Collection<ListPoliciesGrantingServiceAccessEntry> policiesGrantingServiceAccess) {
        if (policiesGrantingServiceAccess == null) {
            this.policiesGrantingServiceAccess = null;
            return;
        }

        this.policiesGrantingServiceAccess = new java.util.ArrayList<ListPoliciesGrantingServiceAccessEntry>(
                policiesGrantingServiceAccess);
    }

    /**
     * <p>
     * A <code>ListPoliciesGrantingServiceAccess</code> object that contains
     * details about the permissions policies attached to the specified identity
     * (user, group, or role).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policiesGrantingServiceAccess <p>
     *            A <code>ListPoliciesGrantingServiceAccess</code> object that
     *            contains details about the permissions policies attached to
     *            the specified identity (user, group, or role).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesGrantingServiceAccessResult withPoliciesGrantingServiceAccess(
            ListPoliciesGrantingServiceAccessEntry... policiesGrantingServiceAccess) {
        if (getPoliciesGrantingServiceAccess() == null) {
            this.policiesGrantingServiceAccess = new java.util.ArrayList<ListPoliciesGrantingServiceAccessEntry>(
                    policiesGrantingServiceAccess.length);
        }
        for (ListPoliciesGrantingServiceAccessEntry value : policiesGrantingServiceAccess) {
            this.policiesGrantingServiceAccess.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A <code>ListPoliciesGrantingServiceAccess</code> object that contains
     * details about the permissions policies attached to the specified identity
     * (user, group, or role).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policiesGrantingServiceAccess <p>
     *            A <code>ListPoliciesGrantingServiceAccess</code> object that
     *            contains details about the permissions policies attached to
     *            the specified identity (user, group, or role).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesGrantingServiceAccessResult withPoliciesGrantingServiceAccess(
            java.util.Collection<ListPoliciesGrantingServiceAccessEntry> policiesGrantingServiceAccess) {
        setPoliciesGrantingServiceAccess(policiesGrantingServiceAccess);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * We recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to
     *         retrieve more items. We recommend that you check
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
     * We recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to
     *         retrieve more items. We recommend that you check
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
     * We recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all your results.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can make a subsequent
     *            pagination request using the <code>Marker</code> request
     *            parameter to retrieve more items. We recommend that you check
     *            <code>IsTruncated</code> after every call to ensure that you
     *            receive all your results.
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
     * We recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all your results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can make a subsequent
     *            pagination request using the <code>Marker</code> request
     *            parameter to retrieve more items. We recommend that you check
     *            <code>IsTruncated</code> after every call to ensure that you
     *            receive all your results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesGrantingServiceAccessResult withIsTruncated(Boolean isTruncated) {
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
    public ListPoliciesGrantingServiceAccessResult withMarker(String marker) {
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
        if (getPoliciesGrantingServiceAccess() != null)
            sb.append("PoliciesGrantingServiceAccess: " + getPoliciesGrantingServiceAccess() + ",");
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

        hashCode = prime
                * hashCode
                + ((getPoliciesGrantingServiceAccess() == null) ? 0
                        : getPoliciesGrantingServiceAccess().hashCode());
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

        if (obj instanceof ListPoliciesGrantingServiceAccessResult == false)
            return false;
        ListPoliciesGrantingServiceAccessResult other = (ListPoliciesGrantingServiceAccessResult) obj;

        if (other.getPoliciesGrantingServiceAccess() == null
                ^ this.getPoliciesGrantingServiceAccess() == null)
            return false;
        if (other.getPoliciesGrantingServiceAccess() != null
                && other.getPoliciesGrantingServiceAccess().equals(
                        this.getPoliciesGrantingServiceAccess()) == false)
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
