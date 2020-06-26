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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

public class DescribeCertificatesResult implements Serializable {
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The Secure Sockets Layer (SSL) certificates associated with the
     * replication instance.
     * </p>
     */
    private java.util.List<Certificate> certificates;

    /**
     * <p>
     * The pagination token.
     * </p>
     *
     * @return <p>
     *         The pagination token.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     *
     * @param marker <p>
     *            The pagination token.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCertificatesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The Secure Sockets Layer (SSL) certificates associated with the
     * replication instance.
     * </p>
     *
     * @return <p>
     *         The Secure Sockets Layer (SSL) certificates associated with the
     *         replication instance.
     *         </p>
     */
    public java.util.List<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The Secure Sockets Layer (SSL) certificates associated with the
     * replication instance.
     * </p>
     *
     * @param certificates <p>
     *            The Secure Sockets Layer (SSL) certificates associated with
     *            the replication instance.
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
     * The Secure Sockets Layer (SSL) certificates associated with the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificates <p>
     *            The Secure Sockets Layer (SSL) certificates associated with
     *            the replication instance.
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
     * The Secure Sockets Layer (SSL) certificates associated with the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificates <p>
     *            The Secure Sockets Layer (SSL) certificates associated with
     *            the replication instance.
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
        if (getCertificates() != null)
            sb.append("Certificates: " + getCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
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

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null
                && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        return true;
    }
}
