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
 * <p>
 * Contains the output from the <a>DescribeOrderableClusterOptions</a> action.
 * </p>
 */
public class DescribeOrderableClusterOptionsResult implements Serializable {
    /**
     * <p>
     * An <code>OrderableClusterOption</code> structure containing information
     * about orderable options for the cluster.
     * </p>
     */
    private java.util.List<OrderableClusterOption> orderableClusterOptions;

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
     * An <code>OrderableClusterOption</code> structure containing information
     * about orderable options for the cluster.
     * </p>
     *
     * @return <p>
     *         An <code>OrderableClusterOption</code> structure containing
     *         information about orderable options for the cluster.
     *         </p>
     */
    public java.util.List<OrderableClusterOption> getOrderableClusterOptions() {
        return orderableClusterOptions;
    }

    /**
     * <p>
     * An <code>OrderableClusterOption</code> structure containing information
     * about orderable options for the cluster.
     * </p>
     *
     * @param orderableClusterOptions <p>
     *            An <code>OrderableClusterOption</code> structure containing
     *            information about orderable options for the cluster.
     *            </p>
     */
    public void setOrderableClusterOptions(
            java.util.Collection<OrderableClusterOption> orderableClusterOptions) {
        if (orderableClusterOptions == null) {
            this.orderableClusterOptions = null;
            return;
        }

        this.orderableClusterOptions = new java.util.ArrayList<OrderableClusterOption>(
                orderableClusterOptions);
    }

    /**
     * <p>
     * An <code>OrderableClusterOption</code> structure containing information
     * about orderable options for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orderableClusterOptions <p>
     *            An <code>OrderableClusterOption</code> structure containing
     *            information about orderable options for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableClusterOptionsResult withOrderableClusterOptions(
            OrderableClusterOption... orderableClusterOptions) {
        if (getOrderableClusterOptions() == null) {
            this.orderableClusterOptions = new java.util.ArrayList<OrderableClusterOption>(
                    orderableClusterOptions.length);
        }
        for (OrderableClusterOption value : orderableClusterOptions) {
            this.orderableClusterOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An <code>OrderableClusterOption</code> structure containing information
     * about orderable options for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orderableClusterOptions <p>
     *            An <code>OrderableClusterOption</code> structure containing
     *            information about orderable options for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableClusterOptionsResult withOrderableClusterOptions(
            java.util.Collection<OrderableClusterOption> orderableClusterOptions) {
        setOrderableClusterOptions(orderableClusterOptions);
        return this;
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
    public DescribeOrderableClusterOptionsResult withMarker(String marker) {
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
        if (getOrderableClusterOptions() != null)
            sb.append("OrderableClusterOptions: " + getOrderableClusterOptions() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOrderableClusterOptions() == null) ? 0 : getOrderableClusterOptions()
                        .hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrderableClusterOptionsResult == false)
            return false;
        DescribeOrderableClusterOptionsResult other = (DescribeOrderableClusterOptionsResult) obj;

        if (other.getOrderableClusterOptions() == null ^ this.getOrderableClusterOptions() == null)
            return false;
        if (other.getOrderableClusterOptions() != null
                && other.getOrderableClusterOptions().equals(this.getOrderableClusterOptions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
