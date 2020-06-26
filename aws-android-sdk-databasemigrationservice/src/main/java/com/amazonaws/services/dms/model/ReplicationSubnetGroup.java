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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a subnet group in response to a request by the
 * <code>DescribeReplicationSubnetGroup</code> operation.
 * </p>
 */
public class ReplicationSubnetGroup implements Serializable {
    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;

    /**
     * <p>
     * A description for the replication subnet group.
     * </p>
     */
    private String replicationSubnetGroupDescription;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     */
    private String subnetGroupStatus;

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     */
    private java.util.List<Subnet> subnets;

    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     *
     * @return <p>
     *         The identifier of the replication instance subnet group.
     *         </p>
     */
    public String getReplicationSubnetGroupIdentifier() {
        return replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            The identifier of the replication instance subnet group.
     *            </p>
     */
    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * The identifier of the replication instance subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            The identifier of the replication instance subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationSubnetGroup withReplicationSubnetGroupIdentifier(
            String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * A description for the replication subnet group.
     * </p>
     *
     * @return <p>
     *         A description for the replication subnet group.
     *         </p>
     */
    public String getReplicationSubnetGroupDescription() {
        return replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the replication subnet group.
     * </p>
     *
     * @param replicationSubnetGroupDescription <p>
     *            A description for the replication subnet group.
     *            </p>
     */
    public void setReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the replication subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroupDescription <p>
     *            A description for the replication subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationSubnetGroup withReplicationSubnetGroupDescription(
            String replicationSubnetGroupDescription) {
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationSubnetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     *
     * @return <p>
     *         The status of the subnet group.
     *         </p>
     */
    public String getSubnetGroupStatus() {
        return subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     *
     * @param subnetGroupStatus <p>
     *            The status of the subnet group.
     *            </p>
     */
    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }

    /**
     * <p>
     * The status of the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetGroupStatus <p>
     *            The status of the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
        return this;
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     *
     * @return <p>
     *         The subnets that are in the subnet group.
     *         </p>
     */
    public java.util.List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     *
     * @param subnets <p>
     *            The subnets that are in the subnet group.
     *            </p>
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<Subnet>(subnets);
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The subnets that are in the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationSubnetGroup withSubnets(Subnet... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<Subnet>(subnets.length);
        }
        for (Subnet value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The subnets that are in the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The subnets that are in the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
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
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: " + getReplicationSubnetGroupIdentifier()
                    + ",");
        if (getReplicationSubnetGroupDescription() != null)
            sb.append("ReplicationSubnetGroupDescription: "
                    + getReplicationSubnetGroupDescription() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetGroupStatus() != null)
            sb.append("SubnetGroupStatus: " + getSubnetGroupStatus() + ",");
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroupIdentifier() == null) ? 0
                        : getReplicationSubnetGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroupDescription() == null) ? 0
                        : getReplicationSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationSubnetGroup == false)
            return false;
        ReplicationSubnetGroup other = (ReplicationSubnetGroup) obj;

        if (other.getReplicationSubnetGroupIdentifier() == null
                ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(
                        this.getReplicationSubnetGroupIdentifier()) == false)
            return false;
        if (other.getReplicationSubnetGroupDescription() == null
                ^ this.getReplicationSubnetGroupDescription() == null)
            return false;
        if (other.getReplicationSubnetGroupDescription() != null
                && other.getReplicationSubnetGroupDescription().equals(
                        this.getReplicationSubnetGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null)
            return false;
        if (other.getSubnetGroupStatus() != null
                && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }
}
