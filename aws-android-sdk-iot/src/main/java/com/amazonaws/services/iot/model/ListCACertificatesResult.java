/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the ListCACertificates operation.
 * </p>
 */
public class ListCACertificatesResult implements Serializable {
    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     */
    private java.util.List<CACertificate> certificates;

    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     *
     * @return <p>
     *         The CA certificates registered in your AWS account.
     *         </p>
     */
    public java.util.List<CACertificate> getCertificates() {
        return certificates;
    }

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     *
     * @param certificates <p>
     *            The CA certificates registered in your AWS account.
     *            </p>
     */
    public void setCertificates(java.util.Collection<CACertificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }

        this.certificates = new java.util.ArrayList<CACertificate>(certificates);
    }

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificates <p>
     *            The CA certificates registered in your AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCACertificatesResult withCertificates(CACertificate... certificates) {
        if (getCertificates() == null) {
            this.certificates = new java.util.ArrayList<CACertificate>(certificates.length);
        }
        for (CACertificate value : certificates) {
            this.certificates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The CA certificates registered in your AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificates <p>
     *            The CA certificates registered in your AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCACertificatesResult withCertificates(
            java.util.Collection<CACertificate> certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The current position within the list of CA certificates.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The current position within the list of CA certificates.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The current position within the list of CA certificates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The current position within the list of CA certificates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCACertificatesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
            sb.append("certificates: " + getCertificates() + ",");
        if (getNextMarker() != null)
            sb.append("nextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCACertificatesResult == false)
            return false;
        ListCACertificatesResult other = (ListCACertificatesResult) obj;

        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null
                && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
