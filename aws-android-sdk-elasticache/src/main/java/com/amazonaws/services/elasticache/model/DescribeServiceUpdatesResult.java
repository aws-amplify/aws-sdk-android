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

public class DescribeServiceUpdatesResult implements Serializable {
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
     * A list of service updates
     * </p>
     */
    private java.util.List<ServiceUpdate> serviceUpdates;

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
    public DescribeServiceUpdatesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     *
     * @return <p>
     *         A list of service updates
     *         </p>
     */
    public java.util.List<ServiceUpdate> getServiceUpdates() {
        return serviceUpdates;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     *
     * @param serviceUpdates <p>
     *            A list of service updates
     *            </p>
     */
    public void setServiceUpdates(java.util.Collection<ServiceUpdate> serviceUpdates) {
        if (serviceUpdates == null) {
            this.serviceUpdates = null;
            return;
        }

        this.serviceUpdates = new java.util.ArrayList<ServiceUpdate>(serviceUpdates);
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdates <p>
     *            A list of service updates
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServiceUpdatesResult withServiceUpdates(ServiceUpdate... serviceUpdates) {
        if (getServiceUpdates() == null) {
            this.serviceUpdates = new java.util.ArrayList<ServiceUpdate>(serviceUpdates.length);
        }
        for (ServiceUpdate value : serviceUpdates) {
            this.serviceUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdates <p>
     *            A list of service updates
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServiceUpdatesResult withServiceUpdates(
            java.util.Collection<ServiceUpdate> serviceUpdates) {
        setServiceUpdates(serviceUpdates);
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
        if (getServiceUpdates() != null)
            sb.append("ServiceUpdates: " + getServiceUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdates() == null) ? 0 : getServiceUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceUpdatesResult == false)
            return false;
        DescribeServiceUpdatesResult other = (DescribeServiceUpdatesResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getServiceUpdates() == null ^ this.getServiceUpdates() == null)
            return false;
        if (other.getServiceUpdates() != null
                && other.getServiceUpdates().equals(this.getServiceUpdates()) == false)
            return false;
        return true;
    }
}
