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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a placement group in which to launch instances. The strategy of the
 * placement group determines how the instances are organized within the group.
 * </p>
 * <p>
 * A <code>cluster</code> placement group is a logical grouping of instances
 * within a single Availability Zone that benefit from low network latency, high
 * network throughput. A <code>spread</code> placement group places instances on
 * distinct hardware. A <code>partition</code> placement group places groups of
 * instances in different partitions, where instances in one partition do not
 * share the same hardware with instances in another partition.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
 * >Placement groups</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
public class CreatePlacementGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * A name for the placement group. Must be unique within the scope of your
     * account for the Region.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     */
    private String groupName;

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
     * The number of partitions. Valid only when <b>Strategy</b> is set to
     * <code>partition</code>.
     * </p>
     */
    private Integer partitionCount;

    /**
     * <p>
     * The tags to apply to the new placement group.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlacementGroupRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * A name for the placement group. Must be unique within the scope of your
     * account for the Region.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     *
     * @return <p>
     *         A name for the placement group. Must be unique within the scope
     *         of your account for the Region.
     *         </p>
     *         <p>
     *         Constraints: Up to 255 ASCII characters
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * A name for the placement group. Must be unique within the scope of your
     * account for the Region.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     *
     * @param groupName <p>
     *            A name for the placement group. Must be unique within the
     *            scope of your account for the Region.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 ASCII characters
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * A name for the placement group. Must be unique within the scope of your
     * account for the Region.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            A name for the placement group. Must be unique within the
     *            scope of your account for the Region.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 ASCII characters
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlacementGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
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
    public CreatePlacementGroupRequest withStrategy(String strategy) {
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
    public CreatePlacementGroupRequest withStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The number of partitions. Valid only when <b>Strategy</b> is set to
     * <code>partition</code>.
     * </p>
     *
     * @return <p>
     *         The number of partitions. Valid only when <b>Strategy</b> is set
     *         to <code>partition</code>.
     *         </p>
     */
    public Integer getPartitionCount() {
        return partitionCount;
    }

    /**
     * <p>
     * The number of partitions. Valid only when <b>Strategy</b> is set to
     * <code>partition</code>.
     * </p>
     *
     * @param partitionCount <p>
     *            The number of partitions. Valid only when <b>Strategy</b> is
     *            set to <code>partition</code>.
     *            </p>
     */
    public void setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
    }

    /**
     * <p>
     * The number of partitions. Valid only when <b>Strategy</b> is set to
     * <code>partition</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionCount <p>
     *            The number of partitions. Valid only when <b>Strategy</b> is
     *            set to <code>partition</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlacementGroupRequest withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the new placement group.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the new placement group.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the new placement group.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the new placement group.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the new placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the new placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlacementGroupRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the new placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the new placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePlacementGroupRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getStrategy() != null)
            sb.append("Strategy: " + getStrategy() + ",");
        if (getPartitionCount() != null)
            sb.append("PartitionCount: " + getPartitionCount() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionCount() == null) ? 0 : getPartitionCount().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlacementGroupRequest == false)
            return false;
        CreatePlacementGroupRequest other = (CreatePlacementGroupRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
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
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
