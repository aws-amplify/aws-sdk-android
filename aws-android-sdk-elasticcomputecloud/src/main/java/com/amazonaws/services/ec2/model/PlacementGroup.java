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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a placement group.
 * </p>
 */
public class PlacementGroup implements Serializable {
    /**
     * <p>
     * The name of the placement group.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * <p>
     * The placement strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, spread, partition
     */
    private String strategy;

    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to
     * <code>partition</code>.
     * </p>
     */
    private Integer partitionCount;

    /**
     * <p>
     * The ID of the placement group.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * Any tags applied to the placement group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the placement group.
     * </p>
     *
     * @return <p>
     *         The name of the placement group.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     *
     * @param groupName <p>
     *            The name of the placement group.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return <p>
     *         The state of the placement group.
     *         </p>
     * @see PlacementGroupState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the placement group.
     *            </p>
     * @see PlacementGroupState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlacementGroupState
     */
    public PlacementGroup withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the placement group.
     *            </p>
     * @see PlacementGroupState
     */
    public void setState(PlacementGroupState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlacementGroupState
     */
    public PlacementGroup withState(PlacementGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, spread, partition
     *
     * @return <p>
     *         The placement strategy.
     *         </p>
     * @see PlacementStrategy
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, spread, partition
     *
     * @param strategy <p>
     *            The placement strategy.
     *            </p>
     * @see PlacementStrategy
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, spread, partition
     *
     * @param strategy <p>
     *            The placement strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlacementStrategy
     */
    public PlacementGroup withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, spread, partition
     *
     * @param strategy <p>
     *            The placement strategy.
     *            </p>
     * @see PlacementStrategy
     */
    public void setStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, spread, partition
     *
     * @param strategy <p>
     *            The placement strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlacementStrategy
     */
    public PlacementGroup withStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to
     * <code>partition</code>.
     * </p>
     *
     * @return <p>
     *         The number of partitions. Valid only if <b>strategy</b> is set to
     *         <code>partition</code>.
     *         </p>
     */
    public Integer getPartitionCount() {
        return partitionCount;
    }

    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to
     * <code>partition</code>.
     * </p>
     *
     * @param partitionCount <p>
     *            The number of partitions. Valid only if <b>strategy</b> is set
     *            to <code>partition</code>.
     *            </p>
     */
    public void setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
    }

    /**
     * <p>
     * The number of partitions. Valid only if <b>strategy</b> is set to
     * <code>partition</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionCount <p>
     *            The number of partitions. Valid only if <b>strategy</b> is set
     *            to <code>partition</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementGroup withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * <p>
     * The ID of the placement group.
     * </p>
     *
     * @return <p>
     *         The ID of the placement group.
     *         </p>
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The ID of the placement group.
     * </p>
     *
     * @param groupId <p>
     *            The ID of the placement group.
     *            </p>
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupId <p>
     *            The ID of the placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * Any tags applied to the placement group.
     * </p>
     *
     * @return <p>
     *         Any tags applied to the placement group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags applied to the placement group.
     * </p>
     *
     * @param tags <p>
     *            Any tags applied to the placement group.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags applied to the placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags applied to the placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementGroup withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags applied to the placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags applied to the placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlacementGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStrategy() != null)
            sb.append("Strategy: " + getStrategy() + ",");
        if (getPartitionCount() != null)
            sb.append("PartitionCount: " + getPartitionCount() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionCount() == null) ? 0 : getPartitionCount().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementGroup == false)
            return false;
        PlacementGroup other = (PlacementGroup) obj;

        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getPartitionCount() == null ^ this.getPartitionCount() == null)
            return false;
        if (other.getPartitionCount() != null
                && other.getPartitionCount().equals(this.getPartitionCount()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
