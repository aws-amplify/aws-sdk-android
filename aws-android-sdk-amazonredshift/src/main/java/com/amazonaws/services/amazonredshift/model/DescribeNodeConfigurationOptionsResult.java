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

public class DescribeNodeConfigurationOptionsResult implements Serializable {
    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     */
    private java.util.List<NodeConfigurationOption> nodeConfigurationOptionList;

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
     * A list of valid node configurations.
     * </p>
     *
     * @return <p>
     *         A list of valid node configurations.
     *         </p>
     */
    public java.util.List<NodeConfigurationOption> getNodeConfigurationOptionList() {
        return nodeConfigurationOptionList;
    }

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     *
     * @param nodeConfigurationOptionList <p>
     *            A list of valid node configurations.
     *            </p>
     */
    public void setNodeConfigurationOptionList(
            java.util.Collection<NodeConfigurationOption> nodeConfigurationOptionList) {
        if (nodeConfigurationOptionList == null) {
            this.nodeConfigurationOptionList = null;
            return;
        }

        this.nodeConfigurationOptionList = new java.util.ArrayList<NodeConfigurationOption>(
                nodeConfigurationOptionList);
    }

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeConfigurationOptionList <p>
     *            A list of valid node configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsResult withNodeConfigurationOptionList(
            NodeConfigurationOption... nodeConfigurationOptionList) {
        if (getNodeConfigurationOptionList() == null) {
            this.nodeConfigurationOptionList = new java.util.ArrayList<NodeConfigurationOption>(
                    nodeConfigurationOptionList.length);
        }
        for (NodeConfigurationOption value : nodeConfigurationOptionList) {
            this.nodeConfigurationOptionList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeConfigurationOptionList <p>
     *            A list of valid node configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsResult withNodeConfigurationOptionList(
            java.util.Collection<NodeConfigurationOption> nodeConfigurationOptionList) {
        setNodeConfigurationOptionList(nodeConfigurationOptionList);
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
    public DescribeNodeConfigurationOptionsResult withMarker(String marker) {
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
        if (getNodeConfigurationOptionList() != null)
            sb.append("NodeConfigurationOptionList: " + getNodeConfigurationOptionList() + ",");
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
                + ((getNodeConfigurationOptionList() == null) ? 0
                        : getNodeConfigurationOptionList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeConfigurationOptionsResult == false)
            return false;
        DescribeNodeConfigurationOptionsResult other = (DescribeNodeConfigurationOptionsResult) obj;

        if (other.getNodeConfigurationOptionList() == null
                ^ this.getNodeConfigurationOptionList() == null)
            return false;
        if (other.getNodeConfigurationOptionList() != null
                && other.getNodeConfigurationOptionList().equals(
                        this.getNodeConfigurationOptionList()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
