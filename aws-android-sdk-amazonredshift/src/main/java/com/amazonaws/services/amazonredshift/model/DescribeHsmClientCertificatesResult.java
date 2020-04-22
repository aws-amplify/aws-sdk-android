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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeHsmClientCertificatesResult implements Serializable {
    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by
     * Amazon Redshift clusters to store and retrieve database encryption keys
     * in an HSM.
     * </p>
     */
    private java.util.List<HsmClientCertificate> hsmClientCertificates;

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @return <p>
     *         A value that indicates the starting point for the next set of
     *         response records in a subsequent request. If a value is returned
     *         in a response, you can retrieve the next set of records by
     *         providing this returned marker value in the <code>Marker</code>
     *         parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>Marker</code> parameter and retrying the command. If the
     *            <code>Marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>Marker</code> parameter and retrying the command. If the
     *            <code>Marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHsmClientCertificatesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by
     * Amazon Redshift clusters to store and retrieve database encryption keys
     * in an HSM.
     * </p>
     *
     * @return <p>
     *         A list of the identifiers for one or more HSM client certificates
     *         used by Amazon Redshift clusters to store and retrieve database
     *         encryption keys in an HSM.
     *         </p>
     */
    public java.util.List<HsmClientCertificate> getHsmClientCertificates() {
        return hsmClientCertificates;
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by
     * Amazon Redshift clusters to store and retrieve database encryption keys
     * in an HSM.
     * </p>
     *
     * @param hsmClientCertificates <p>
     *            A list of the identifiers for one or more HSM client
     *            certificates used by Amazon Redshift clusters to store and
     *            retrieve database encryption keys in an HSM.
     *            </p>
     */
    public void setHsmClientCertificates(
            java.util.Collection<HsmClientCertificate> hsmClientCertificates) {
        if (hsmClientCertificates == null) {
            this.hsmClientCertificates = null;
            return;
        }

        this.hsmClientCertificates = new java.util.ArrayList<HsmClientCertificate>(
                hsmClientCertificates);
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by
     * Amazon Redshift clusters to store and retrieve database encryption keys
     * in an HSM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmClientCertificates <p>
     *            A list of the identifiers for one or more HSM client
     *            certificates used by Amazon Redshift clusters to store and
     *            retrieve database encryption keys in an HSM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHsmClientCertificatesResult withHsmClientCertificates(
            HsmClientCertificate... hsmClientCertificates) {
        if (getHsmClientCertificates() == null) {
            this.hsmClientCertificates = new java.util.ArrayList<HsmClientCertificate>(
                    hsmClientCertificates.length);
        }
        for (HsmClientCertificate value : hsmClientCertificates) {
            this.hsmClientCertificates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by
     * Amazon Redshift clusters to store and retrieve database encryption keys
     * in an HSM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmClientCertificates <p>
     *            A list of the identifiers for one or more HSM client
     *            certificates used by Amazon Redshift clusters to store and
     *            retrieve database encryption keys in an HSM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHsmClientCertificatesResult withHsmClientCertificates(
            java.util.Collection<HsmClientCertificate> hsmClientCertificates) {
        setHsmClientCertificates(hsmClientCertificates);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getHsmClientCertificates() != null)
            sb.append("HsmClientCertificates: " + getHsmClientCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getHsmClientCertificates() == null) ? 0 : getHsmClientCertificates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHsmClientCertificatesResult == false)
            return false;
        DescribeHsmClientCertificatesResult other = (DescribeHsmClientCertificatesResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getHsmClientCertificates() == null ^ this.getHsmClientCertificates() == null)
            return false;
        if (other.getHsmClientCertificates() != null
                && other.getHsmClientCertificates().equals(this.getHsmClientCertificates()) == false)
            return false;
        return true;
    }
}
