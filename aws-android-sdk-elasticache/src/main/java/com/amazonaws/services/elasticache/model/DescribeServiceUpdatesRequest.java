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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns details of the service updates
 * </p>
 */
public class DescribeServiceUpdatesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;

    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private java.util.List<String> serviceUpdateStatus;

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     *
     * @return <p>
     *         The unique ID of the service update
     *         </p>
     */
    public String getServiceUpdateName() {
        return serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     */
    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServiceUpdatesRequest withServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     *
     * @return <p>
     *         The status of the service update
     *         </p>
     */
    public java.util.List<String> getServiceUpdateStatus() {
        return serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     */
    public void setServiceUpdateStatus(java.util.Collection<String> serviceUpdateStatus) {
        if (serviceUpdateStatus == null) {
            this.serviceUpdateStatus = null;
            return;
        }

        this.serviceUpdateStatus = new java.util.ArrayList<String>(serviceUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServiceUpdatesRequest withServiceUpdateStatus(String... serviceUpdateStatus) {
        if (getServiceUpdateStatus() == null) {
            this.serviceUpdateStatus = new java.util.ArrayList<String>(serviceUpdateStatus.length);
        }
        for (String value : serviceUpdateStatus) {
            this.serviceUpdateStatus.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServiceUpdatesRequest withServiceUpdateStatus(
            java.util.Collection<String> serviceUpdateStatus) {
        setServiceUpdateStatus(serviceUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     *
     * @return <p>
     *         The maximum number of records to include in the response
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of records to include in the response
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServiceUpdatesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional marker returned from a prior request. Use this marker
     *         for pagination of results from this operation. If this parameter
     *         is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional marker returned from a prior request. Use this
     *            marker for pagination of results from this operation. If this
     *            parameter is specified, the response includes only records
     *            beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServiceUpdatesRequest withMarker(String marker) {
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: " + getServiceUpdateName() + ",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: " + getServiceUpdateStatus() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
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
                + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceUpdatesRequest == false)
            return false;
        DescribeServiceUpdatesRequest other = (DescribeServiceUpdatesRequest) obj;

        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null
                && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null
                && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
