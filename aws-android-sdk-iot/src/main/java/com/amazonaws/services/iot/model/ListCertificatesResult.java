/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The output of the ListCertificates operation.
 * </p>
 */
public class ListCertificatesResult implements Serializable {

    /**
     * The descriptions of the certificates.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Certificate> certificates;

    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     */
    private String nextMarker;

    /**
     * The descriptions of the certificates.
     *
     * @return The descriptions of the certificates.
     */
    public java.util.List<Certificate> getCertificates() {
        if (certificates == null) {
              certificates = new com.amazonaws.internal.ListWithAutoConstructFlag<Certificate>();
              certificates.setAutoConstruct(true);
        }
        return certificates;
    }
    
    /**
     * The descriptions of the certificates.
     *
     * @param certificates The descriptions of the certificates.
     */
    public void setCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Certificate> certificatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Certificate>(certificates.size());
        certificatesCopy.addAll(certificates);
        this.certificates = certificatesCopy;
    }
    
    /**
     * The descriptions of the certificates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificates The descriptions of the certificates.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListCertificatesResult withCertificates(Certificate... certificates) {
        if (getCertificates() == null) setCertificates(new java.util.ArrayList<Certificate>(certificates.length));
        for (Certificate value : certificates) {
            getCertificates().add(value);
        }
        return this;
    }
    
    /**
     * The descriptions of the certificates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificates The descriptions of the certificates.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListCertificatesResult withCertificates(java.util.Collection<Certificate> certificates) {
        if (certificates == null) {
            this.certificates = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Certificate> certificatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Certificate>(certificates.size());
            certificatesCopy.addAll(certificates);
            this.certificates = certificatesCopy;
        }

        return this;
    }

    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     *
     * @return The marker for the next set of results, or null if there are no
     *         additional results.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     *
     * @param nextMarker The marker for the next set of results, or null if there are no
     *         additional results.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker The marker for the next set of results, or null if there are no
     *         additional results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListCertificatesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificates() != null) sb.append("Certificates: " + getCertificates() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListCertificatesResult == false) return false;
        ListCertificatesResult other = (ListCertificatesResult)obj;
        
        if (other.getCertificates() == null ^ this.getCertificates() == null) return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        return true;
    }
    
}
    