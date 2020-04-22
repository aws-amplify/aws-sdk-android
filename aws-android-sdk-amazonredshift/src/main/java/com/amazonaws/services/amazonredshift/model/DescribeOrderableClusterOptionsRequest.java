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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of orderable cluster options. Before you create a new cluster
 * you can use this operation to find what options are available, such as the
 * EC2 Availability Zones (AZ) in the specific AWS Region that you can specify,
 * and the node types you can request. The node types differ by available
 * storage, memory, CPU and price. With the cost involved you might want to
 * obtain a list of cluster options in the specific region and specify values
 * when creating a cluster. For more information about managing clusters, go to
 * <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
 * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management
 * Guide</i>.
 * </p>
 */
public class DescribeOrderableClusterOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version.
     * </p>
     * <p>
     * Default: All versions.
     * </p>
     * <p>
     * Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     * </p>
     */
    private String clusterVersion;

    /**
     * <p>
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeOrderableClusterOptions</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version.
     * </p>
     * <p>
     * Default: All versions.
     * </p>
     * <p>
     * Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     * </p>
     *
     * @return <p>
     *         The version filter value. Specify this parameter to show only the
     *         available offerings matching the specified version.
     *         </p>
     *         <p>
     *         Default: All versions.
     *         </p>
     *         <p>
     *         Constraints: Must be one of the version returned from
     *         <a>DescribeClusterVersions</a>.
     *         </p>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    /**
     * <p>
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version.
     * </p>
     * <p>
     * Default: All versions.
     * </p>
     * <p>
     * Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     * </p>
     *
     * @param clusterVersion <p>
     *            The version filter value. Specify this parameter to show only
     *            the available offerings matching the specified version.
     *            </p>
     *            <p>
     *            Default: All versions.
     *            </p>
     *            <p>
     *            Constraints: Must be one of the version returned from
     *            <a>DescribeClusterVersions</a>.
     *            </p>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version filter value. Specify this parameter to show only the
     * available offerings matching the specified version.
     * </p>
     * <p>
     * Default: All versions.
     * </p>
     * <p>
     * Constraints: Must be one of the version returned from
     * <a>DescribeClusterVersions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterVersion <p>
     *            The version filter value. Specify this parameter to show only
     *            the available offerings matching the specified version.
     *            </p>
     *            <p>
     *            Default: All versions.
     *            </p>
     *            <p>
     *            Constraints: Must be one of the version returned from
     *            <a>DescribeClusterVersions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableClusterOptionsRequest withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * <p>
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     * </p>
     *
     * @return <p>
     *         The node type filter value. Specify this parameter to show only
     *         the available offerings matching the specified node type.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     * </p>
     *
     * @param nodeType <p>
     *            The node type filter value. Specify this parameter to show
     *            only the available offerings matching the specified node type.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type filter value. Specify this parameter to show only the
     * available offerings matching the specified node type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type filter value. Specify this parameter to show
     *            only the available offerings matching the specified node type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableClusterOptionsRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of response records to return in each call. If
     *         the number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the
     *         next set of records by retrying the command with the returned
     *         marker value.
     *         </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableClusterOptionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeOrderableClusterOptions</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <a>DescribeOrderableClusterOptions</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the
     *         next set of response records by providing the returned marker
     *         value in the <code>Marker</code> parameter and retrying the
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeOrderableClusterOptions</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeOrderableClusterOptions</a> request exceed the
     *            value specified in <code>MaxRecords</code>, AWS returns a
     *            value in the <code>Marker</code> field of the response. You
     *            can retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeOrderableClusterOptions</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeOrderableClusterOptions</a> request exceed the
     *            value specified in <code>MaxRecords</code>, AWS returns a
     *            value in the <code>Marker</code> field of the response. You
     *            can retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrderableClusterOptionsRequest withMarker(String marker) {
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
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
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
                + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
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

        if (obj instanceof DescribeOrderableClusterOptionsRequest == false)
            return false;
        DescribeOrderableClusterOptionsRequest other = (DescribeOrderableClusterOptionsRequest) obj;

        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null
                && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
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
