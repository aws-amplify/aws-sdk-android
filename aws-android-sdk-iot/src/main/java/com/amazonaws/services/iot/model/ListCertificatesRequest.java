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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#listCertificates(ListCertificatesRequest) ListCertificates operation}.
 * <p>
 * Lists your certificates.
 * </p>
 * <p>
 * The results are paginated with a default page size of 25. You can
 * retrieve additional results using the returned marker.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#listCertificates(ListCertificatesRequest)
 */
public class ListCertificatesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The result page size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer pageSize;

    /**
     * The marker for the next set of results.
     */
    private String marker;

    /**
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     */
    private Boolean ascendingOrder;

    /**
     * The result page size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return The result page size.
     */
    public Integer getPageSize() {
        return pageSize;
    }
    
    /**
     * The result page size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param pageSize The result page size.
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
     * The result page size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param pageSize The result page size.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListCertificatesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The marker for the next set of results.
     *
     * @return The marker for the next set of results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker for the next set of results.
     *
     * @param marker The marker for the next set of results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker for the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker for the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListCertificatesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     *
     * @return Specifies the order for results. If True, the results are returned in
     *         ascending order, based on the creation date.
     */
    public Boolean isAscendingOrder() {
        return ascendingOrder;
    }
    
    /**
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     *
     * @param ascendingOrder Specifies the order for results. If True, the results are returned in
     *         ascending order, based on the creation date.
     */
    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }
    
    /**
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ascendingOrder Specifies the order for results. If True, the results are returned in
     *         ascending order, based on the creation date.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListCertificatesRequest withAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
        return this;
    }

    /**
     * Specifies the order for results. If True, the results are returned in
     * ascending order, based on the creation date.
     *
     * @return Specifies the order for results. If True, the results are returned in
     *         ascending order, based on the creation date.
     */
    public Boolean getAscendingOrder() {
        return ascendingOrder;
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
        if (getPageSize() != null) sb.append("PageSize: " + getPageSize() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isAscendingOrder() != null) sb.append("AscendingOrder: " + isAscendingOrder() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isAscendingOrder() == null) ? 0 : isAscendingOrder().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListCertificatesRequest == false) return false;
        ListCertificatesRequest other = (ListCertificatesRequest)obj;
        
        if (other.getPageSize() == null ^ this.getPageSize() == null) return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isAscendingOrder() == null ^ this.isAscendingOrder() == null) return false;
        if (other.isAscendingOrder() != null && other.isAscendingOrder().equals(this.isAscendingOrder()) == false) return false; 
        return true;
    }
    
}
    