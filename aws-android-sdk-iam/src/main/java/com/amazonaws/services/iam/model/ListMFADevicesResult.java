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
 * Contains the response to a successful <a>ListMFADevices</a> request.
 * </p>
 */
public class ListMFADevicesResult implements Serializable {
    /**
     * <p>
     * A list of MFA devices.
     * </p>
     */
    private java.util.List<MFADevice> mFADevices;

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
     * A list of MFA devices.
     * </p>
     *
     * @return <p>
     *         A list of MFA devices.
     *         </p>
     */
    public java.util.List<MFADevice> getMFADevices() {
        return mFADevices;
    }

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     *
     * @param mFADevices <p>
     *            A list of MFA devices.
     *            </p>
     */
    public void setMFADevices(java.util.Collection<MFADevice> mFADevices) {
        if (mFADevices == null) {
            this.mFADevices = null;
            return;
        }

        this.mFADevices = new java.util.ArrayList<MFADevice>(mFADevices);
    }

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFADevices <p>
     *            A list of MFA devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMFADevicesResult withMFADevices(MFADevice... mFADevices) {
        if (getMFADevices() == null) {
            this.mFADevices = new java.util.ArrayList<MFADevice>(mFADevices.length);
        }
        for (MFADevice value : mFADevices) {
            this.mFADevices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of MFA devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mFADevices <p>
     *            A list of MFA devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMFADevicesResult withMFADevices(java.util.Collection<MFADevice> mFADevices) {
        setMFADevices(mFADevices);
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
    public ListMFADevicesResult withIsTruncated(Boolean isTruncated) {
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
    public ListMFADevicesResult withMarker(String marker) {
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
        if (getMFADevices() != null)
            sb.append("MFADevices: " + getMFADevices() + ",");
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

        hashCode = prime * hashCode + ((getMFADevices() == null) ? 0 : getMFADevices().hashCode());
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

        if (obj instanceof ListMFADevicesResult == false)
            return false;
        ListMFADevicesResult other = (ListMFADevicesResult) obj;

        if (other.getMFADevices() == null ^ this.getMFADevices() == null)
            return false;
        if (other.getMFADevices() != null
                && other.getMFADevices().equals(this.getMFADevices()) == false)
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
