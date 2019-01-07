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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the CA certificates registered for your AWS account.
 * </p>
 * <p>
 * The results are paginated with a default page size of 25. You can use the
 * returned marker to retrieve additional results.
 * </p>
 */
public class ListCACertificatesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The result page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer pageSize;

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String marker;

    /**
     * <p>
     * Determines the order of the results.
     * </p>
     */
    private Boolean ascendingOrder;

    /**
     * <p>
     * The result page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The result page size.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param pageSize <p>
     *            The result page size.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param pageSize <p>
     *            The result page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCACertificatesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The marker for the next set of results.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param marker <p>
     *            The marker for the next set of results.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param marker <p>
     *            The marker for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCACertificatesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Determines the order of the results.
     * </p>
     *
     * @return <p>
     *         Determines the order of the results.
     *         </p>
     */
    public Boolean isAscendingOrder() {
        return ascendingOrder;
    }

    /**
     * <p>
     * Determines the order of the results.
     * </p>
     *
     * @return <p>
     *         Determines the order of the results.
     *         </p>
     */
    public Boolean getAscendingOrder() {
        return ascendingOrder;
    }

    /**
     * <p>
     * Determines the order of the results.
     * </p>
     *
     * @param ascendingOrder <p>
     *            Determines the order of the results.
     *            </p>
     */
    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Determines the order of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ascendingOrder <p>
     *            Determines the order of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCACertificatesRequest withAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
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
        if (getPageSize() != null)
            sb.append("pageSize: " + getPageSize() + ",");
        if (getMarker() != null)
            sb.append("marker: " + getMarker() + ",");
        if (getAscendingOrder() != null)
            sb.append("ascendingOrder: " + getAscendingOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getAscendingOrder() == null) ? 0 : getAscendingOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCACertificatesRequest == false)
            return false;
        ListCACertificatesRequest other = (ListCACertificatesRequest) obj;

        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAscendingOrder() == null ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null
                && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        return true;
    }
}
