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
 * Returns properties of possible node configurations such as node type, number
 * of nodes, and disk usage for the specified action type.
 * </p>
 */
public class DescribeNodeConfigurationOptionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify
     * "restore-cluster" to get configuration combinations based on an existing
     * snapshot. Specify "recommend-node-config" to get configuration
     * recommendations based on an existing cluster or snapshot. Specify
     * "resize-cluster" to get configuration combinations for elastic resize
     * based on an existing cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>restore-cluster, recommend-node-config,
     * resize-cluster
     */
    private String actionType;

    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node
     * configurations.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node
     * configurations.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     */
    private java.util.List<NodeConfigurationOptionsFilter> filters;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeNodeConfigurationOptions</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify
     * "restore-cluster" to get configuration combinations based on an existing
     * snapshot. Specify "recommend-node-config" to get configuration
     * recommendations based on an existing cluster or snapshot. Specify
     * "resize-cluster" to get configuration combinations for elastic resize
     * based on an existing cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>restore-cluster, recommend-node-config,
     * resize-cluster
     *
     * @return <p>
     *         The action type to evaluate for possible node configurations.
     *         Specify "restore-cluster" to get configuration combinations based
     *         on an existing snapshot. Specify "recommend-node-config" to get
     *         configuration recommendations based on an existing cluster or
     *         snapshot. Specify "resize-cluster" to get configuration
     *         combinations for elastic resize based on an existing cluster.
     *         </p>
     * @see ActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify
     * "restore-cluster" to get configuration combinations based on an existing
     * snapshot. Specify "recommend-node-config" to get configuration
     * recommendations based on an existing cluster or snapshot. Specify
     * "resize-cluster" to get configuration combinations for elastic resize
     * based on an existing cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>restore-cluster, recommend-node-config,
     * resize-cluster
     *
     * @param actionType <p>
     *            The action type to evaluate for possible node configurations.
     *            Specify "restore-cluster" to get configuration combinations
     *            based on an existing snapshot. Specify "recommend-node-config"
     *            to get configuration recommendations based on an existing
     *            cluster or snapshot. Specify "resize-cluster" to get
     *            configuration combinations for elastic resize based on an
     *            existing cluster.
     *            </p>
     * @see ActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify
     * "restore-cluster" to get configuration combinations based on an existing
     * snapshot. Specify "recommend-node-config" to get configuration
     * recommendations based on an existing cluster or snapshot. Specify
     * "resize-cluster" to get configuration combinations for elastic resize
     * based on an existing cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>restore-cluster, recommend-node-config,
     * resize-cluster
     *
     * @param actionType <p>
     *            The action type to evaluate for possible node configurations.
     *            Specify "restore-cluster" to get configuration combinations
     *            based on an existing snapshot. Specify "recommend-node-config"
     *            to get configuration recommendations based on an existing
     *            cluster or snapshot. Specify "resize-cluster" to get
     *            configuration combinations for elastic resize based on an
     *            existing cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public DescribeNodeConfigurationOptionsRequest withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify
     * "restore-cluster" to get configuration combinations based on an existing
     * snapshot. Specify "recommend-node-config" to get configuration
     * recommendations based on an existing cluster or snapshot. Specify
     * "resize-cluster" to get configuration combinations for elastic resize
     * based on an existing cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>restore-cluster, recommend-node-config,
     * resize-cluster
     *
     * @param actionType <p>
     *            The action type to evaluate for possible node configurations.
     *            Specify "restore-cluster" to get configuration combinations
     *            based on an existing snapshot. Specify "recommend-node-config"
     *            to get configuration recommendations based on an existing
     *            cluster or snapshot. Specify "resize-cluster" to get
     *            configuration combinations for elastic resize based on an
     *            existing cluster.
     *            </p>
     * @see ActionType
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * The action type to evaluate for possible node configurations. Specify
     * "restore-cluster" to get configuration combinations based on an existing
     * snapshot. Specify "recommend-node-config" to get configuration
     * recommendations based on an existing cluster or snapshot. Specify
     * "resize-cluster" to get configuration combinations for elastic resize
     * based on an existing cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>restore-cluster, recommend-node-config,
     * resize-cluster
     *
     * @param actionType <p>
     *            The action type to evaluate for possible node configurations.
     *            Specify "restore-cluster" to get configuration combinations
     *            based on an existing snapshot. Specify "recommend-node-config"
     *            to get configuration recommendations based on an existing
     *            cluster or snapshot. Specify "resize-cluster" to get
     *            configuration combinations for elastic resize based on an
     *            existing cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public DescribeNodeConfigurationOptionsRequest withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node
     * configurations.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster to evaluate for possible node
     *         configurations.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node
     * configurations.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster to evaluate for possible node
     *            configurations.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to evaluate for possible node
     * configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the cluster to evaluate for possible node
     *            configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node
     * configurations.
     * </p>
     *
     * @return <p>
     *         The identifier of the snapshot to evaluate for possible node
     *         configurations.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node
     * configurations.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot to evaluate for possible node
     *            configurations.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to evaluate for possible node
     * configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot to evaluate for possible node
     *            configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     *
     * @return <p>
     *         The AWS customer account used to create or copy the snapshot.
     *         Required if you are restoring a snapshot you do not own, optional
     *         if you own the snapshot.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     *
     * @param ownerAccount <p>
     *            The AWS customer account used to create or copy the snapshot.
     *            Required if you are restoring a snapshot you do not own,
     *            optional if you own the snapshot.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if
     * you are restoring a snapshot you do not own, optional if you own the
     * snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The AWS customer account used to create or copy the snapshot.
     *            Required if you are restoring a snapshot you do not own,
     *            optional if you own the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     *
     * @return <p>
     *         A set of name, operator, and value items to filter the results.
     *         </p>
     */
    public java.util.List<NodeConfigurationOptionsFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     *
     * @param filters <p>
     *            A set of name, operator, and value items to filter the
     *            results.
     *            </p>
     */
    public void setFilters(java.util.Collection<NodeConfigurationOptionsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<NodeConfigurationOptionsFilter>(filters);
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A set of name, operator, and value items to filter the
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsRequest withFilters(
            NodeConfigurationOptionsFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<NodeConfigurationOptionsFilter>(filters.length);
        }
        for (NodeConfigurationOptionsFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of name, operator, and value items to filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A set of name, operator, and value items to filter the
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsRequest withFilters(
            java.util.Collection<NodeConfigurationOptionsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeNodeConfigurationOptions</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <a>DescribeNodeConfigurationOptions</a> request exceed the value
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
     * <a>DescribeNodeConfigurationOptions</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeNodeConfigurationOptions</a> request exceed the
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
     * <a>DescribeNodeConfigurationOptions</a> request exceed the value
     * specified in <code>MaxRecords</code>, AWS returns a value in the
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
     *            <a>DescribeNodeConfigurationOptions</a> request exceed the
     *            value specified in <code>MaxRecords</code>, AWS returns a
     *            value in the <code>Marker</code> field of the response. You
     *            can retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsRequest withMarker(String marker) {
        this.marker = marker;
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
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
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
     *         Default: <code>500</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 100, maximum 500.
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
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
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
     *            Default: <code>500</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 100, maximum 500.
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
     * Default: <code>500</code>
     * </p>
     * <p>
     * Constraints: minimum 100, maximum 500.
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
     *            Default: <code>500</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 100, maximum 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNodeConfigurationOptionsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getActionType() != null)
            sb.append("ActionType: " + getActionType() + ",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeConfigurationOptionsRequest == false)
            return false;
        DescribeNodeConfigurationOptionsRequest other = (DescribeNodeConfigurationOptionsRequest) obj;

        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }
}
