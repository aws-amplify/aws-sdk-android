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
 * Contains the response to a successful <a>ListSSHPublicKeys</a> request.
 * </p>
 */
public class ListSSHPublicKeysResult implements Serializable {
    /**
     * <p>
     * A list of the SSH public keys assigned to IAM user.
     * </p>
     */
    private java.util.List<SSHPublicKeyMetadata> sSHPublicKeys;

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
     * A list of the SSH public keys assigned to IAM user.
     * </p>
     *
     * @return <p>
     *         A list of the SSH public keys assigned to IAM user.
     *         </p>
     */
    public java.util.List<SSHPublicKeyMetadata> getSSHPublicKeys() {
        return sSHPublicKeys;
    }

    /**
     * <p>
     * A list of the SSH public keys assigned to IAM user.
     * </p>
     *
     * @param sSHPublicKeys <p>
     *            A list of the SSH public keys assigned to IAM user.
     *            </p>
     */
    public void setSSHPublicKeys(java.util.Collection<SSHPublicKeyMetadata> sSHPublicKeys) {
        if (sSHPublicKeys == null) {
            this.sSHPublicKeys = null;
            return;
        }

        this.sSHPublicKeys = new java.util.ArrayList<SSHPublicKeyMetadata>(sSHPublicKeys);
    }

    /**
     * <p>
     * A list of the SSH public keys assigned to IAM user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSHPublicKeys <p>
     *            A list of the SSH public keys assigned to IAM user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSSHPublicKeysResult withSSHPublicKeys(SSHPublicKeyMetadata... sSHPublicKeys) {
        if (getSSHPublicKeys() == null) {
            this.sSHPublicKeys = new java.util.ArrayList<SSHPublicKeyMetadata>(sSHPublicKeys.length);
        }
        for (SSHPublicKeyMetadata value : sSHPublicKeys) {
            this.sSHPublicKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the SSH public keys assigned to IAM user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSHPublicKeys <p>
     *            A list of the SSH public keys assigned to IAM user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSSHPublicKeysResult withSSHPublicKeys(
            java.util.Collection<SSHPublicKeyMetadata> sSHPublicKeys) {
        setSSHPublicKeys(sSHPublicKeys);
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
    public ListSSHPublicKeysResult withIsTruncated(Boolean isTruncated) {
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
    public ListSSHPublicKeysResult withMarker(String marker) {
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
        if (getSSHPublicKeys() != null)
            sb.append("SSHPublicKeys: " + getSSHPublicKeys() + ",");
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
                + ((getSSHPublicKeys() == null) ? 0 : getSSHPublicKeys().hashCode());
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

        if (obj instanceof ListSSHPublicKeysResult == false)
            return false;
        ListSSHPublicKeysResult other = (ListSSHPublicKeysResult) obj;

        if (other.getSSHPublicKeys() == null ^ this.getSSHPublicKeys() == null)
            return false;
        if (other.getSSHPublicKeys() != null
                && other.getSSHPublicKeys().equals(this.getSSHPublicKeys()) == false)
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
