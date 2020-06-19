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
 * Increase the number of node groups in the Global Datastore
 * </p>
 */
public class IncreaseNodeGroupsInGlobalReplicationGroupRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     */
    private Integer nodeGroupCount;

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are
     * stored and the shard configuration for each that comprise the Global
     * Datastore
     * </p>
     */
    private java.util.List<RegionalConfiguration> regionalConfigurations;

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only
     * permitted value for this parameter is true.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The name of the Global Datastore
     *         </p>
     */
    public String getGlobalReplicationGroupId() {
        return globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     */
    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withGlobalReplicationGroupId(
            String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     *
     * @return <p>
     *         The number of node groups you wish to add
     *         </p>
     */
    public Integer getNodeGroupCount() {
        return nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     *
     * @param nodeGroupCount <p>
     *            The number of node groups you wish to add
     *            </p>
     */
    public void setNodeGroupCount(Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
    }

    /**
     * <p>
     * The number of node groups you wish to add
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupCount <p>
     *            The number of node groups you wish to add
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withNodeGroupCount(
            Integer nodeGroupCount) {
        this.nodeGroupCount = nodeGroupCount;
        return this;
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are
     * stored and the shard configuration for each that comprise the Global
     * Datastore
     * </p>
     *
     * @return <p>
     *         Describes the replication group IDs, the AWS regions where they
     *         are stored and the shard configuration for each that comprise the
     *         Global Datastore
     *         </p>
     */
    public java.util.List<RegionalConfiguration> getRegionalConfigurations() {
        return regionalConfigurations;
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are
     * stored and the shard configuration for each that comprise the Global
     * Datastore
     * </p>
     *
     * @param regionalConfigurations <p>
     *            Describes the replication group IDs, the AWS regions where
     *            they are stored and the shard configuration for each that
     *            comprise the Global Datastore
     *            </p>
     */
    public void setRegionalConfigurations(
            java.util.Collection<RegionalConfiguration> regionalConfigurations) {
        if (regionalConfigurations == null) {
            this.regionalConfigurations = null;
            return;
        }

        this.regionalConfigurations = new java.util.ArrayList<RegionalConfiguration>(
                regionalConfigurations);
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are
     * stored and the shard configuration for each that comprise the Global
     * Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalConfigurations <p>
     *            Describes the replication group IDs, the AWS regions where
     *            they are stored and the shard configuration for each that
     *            comprise the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withRegionalConfigurations(
            RegionalConfiguration... regionalConfigurations) {
        if (getRegionalConfigurations() == null) {
            this.regionalConfigurations = new java.util.ArrayList<RegionalConfiguration>(
                    regionalConfigurations.length);
        }
        for (RegionalConfiguration value : regionalConfigurations) {
            this.regionalConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the replication group IDs, the AWS regions where they are
     * stored and the shard configuration for each that comprise the Global
     * Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalConfigurations <p>
     *            Describes the replication group IDs, the AWS regions where
     *            they are stored and the shard configuration for each that
     *            comprise the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withRegionalConfigurations(
            java.util.Collection<RegionalConfiguration> regionalConfigurations) {
        setRegionalConfigurations(regionalConfigurations);
        return this;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only
     * permitted value for this parameter is true.
     * </p>
     *
     * @return <p>
     *         Indicates that the process begins immediately. At present, the
     *         only permitted value for this parameter is true.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only
     * permitted value for this parameter is true.
     * </p>
     *
     * @return <p>
     *         Indicates that the process begins immediately. At present, the
     *         only permitted value for this parameter is true.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only
     * permitted value for this parameter is true.
     * </p>
     *
     * @param applyImmediately <p>
     *            Indicates that the process begins immediately. At present, the
     *            only permitted value for this parameter is true.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates that the process begins immediately. At present, the only
     * permitted value for this parameter is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            Indicates that the process begins immediately. At present, the
     *            only permitted value for this parameter is true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IncreaseNodeGroupsInGlobalReplicationGroupRequest withApplyImmediately(
            Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: " + getGlobalReplicationGroupId() + ",");
        if (getNodeGroupCount() != null)
            sb.append("NodeGroupCount: " + getNodeGroupCount() + ",");
        if (getRegionalConfigurations() != null)
            sb.append("RegionalConfigurations: " + getRegionalConfigurations() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroupCount() == null) ? 0 : getNodeGroupCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegionalConfigurations() == null) ? 0 : getRegionalConfigurations()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncreaseNodeGroupsInGlobalReplicationGroupRequest == false)
            return false;
        IncreaseNodeGroupsInGlobalReplicationGroupRequest other = (IncreaseNodeGroupsInGlobalReplicationGroupRequest) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupCount() == null ^ this.getNodeGroupCount() == null)
            return false;
        if (other.getNodeGroupCount() != null
                && other.getNodeGroupCount().equals(this.getNodeGroupCount()) == false)
            return false;
        if (other.getRegionalConfigurations() == null ^ this.getRegionalConfigurations() == null)
            return false;
        if (other.getRegionalConfigurations() != null
                && other.getRegionalConfigurations().equals(this.getRegionalConfigurations()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }
}
