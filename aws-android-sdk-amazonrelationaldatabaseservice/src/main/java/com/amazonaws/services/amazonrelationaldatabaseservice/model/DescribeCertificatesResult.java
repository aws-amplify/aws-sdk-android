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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Data returned by the <b>DescribeCertificates</b> action.
 * </p>
 */
public class DescribeCertificatesResult implements Serializable {
    /**
     * <p>
     * The list of <code>Certificate</code> objects for the AWS account.
     * </p>
     */
    private java.util.List<Certificate> certificates;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeCertificates</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of <code>Certificate</code> objects for the AWS account.
     * </p>
     *
     * @return <p>
     *         The list of <code>Certificate</code> objects for the AWS account.
     *         </p>
     */
    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The list of <code>Certificate</code> objects for the AWS account.
     * </p>
     *
     * @param certificates <p>
     *            The list of <code>Certificate</code> objects for the AWS
     *            account.
     *            </p>
     */
    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<Certificate>(certificates);
    }

    /**
     * <p>
     * The list of <code>Certificate</code> objects for the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificates <p>
     *            The list of <code>Certificate</code> objects for the AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCertificatesResult withCertificates(Certificate... certificates) {
        if (getCertificates() == null) {
            this.certificates = new java.util.ArrayList<Certificate>(certificates.length);
        }
        for (Certificate value : certificates) {
            this.certificates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>Certificate</code> objects for the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificates <p>
     *            The list of <code>Certificate</code> objects for the AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCertificatesResult withCertificates(
            java.util.Collection<Certificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeCertificates</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <code>DescribeCertificates</code> request. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <code>MaxRecords</code> .
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeCertificates</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeCertificates</code> request. If this parameter
     *            is specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code> .
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <code>DescribeCertificates</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <code>DescribeCertificates</code> request. If this parameter
     *            is specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCertificatesResult withMarker(String marker) {
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
        if (getCertificates() != null)
            sb.append("Certificates: " + getCertificates() + ",");
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
                + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificatesResult == false)
            return false;
        DescribeCertificatesResult other = (DescribeCertificatesResult) obj;

        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null
                && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
