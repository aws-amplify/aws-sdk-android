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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a hosted connection on the specified interconnect or a link
 * aggregation group (LAG) of interconnects.
 * </p>
 * <p>
 * Allocates a VLAN number and a specified amount of capacity (bandwidth) for
 * use by a hosted connection on the specified interconnect or LAG of
 * interconnects. AWS polices the hosted connection for the specified capacity
 * and the AWS Direct Connect Partner must also police the hosted connection for
 * the specified capacity.
 * </p>
 * <note>
 * <p>
 * Intended for use by AWS Direct Connect Partners only.
 * </p>
 * </note>
 */
public class AllocateHostedConnectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the interconnect or LAG.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The ID of the AWS account ID of the customer for the connection.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note
     * that only those AWS Direct Connect Partners who have met specific
     * requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted
     * connection.
     * </p>
     */
    private String bandwidth;

    /**
     * <p>
     * The name of the hosted connection.
     * </p>
     */
    private String connectionName;

    /**
     * <p>
     * The dedicated VLAN provisioned to the hosted connection.
     * </p>
     */
    private Integer vlan;

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the interconnect or LAG.
     * </p>
     *
     * @return <p>
     *         The ID of the interconnect or LAG.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or LAG.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the interconnect or LAG.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the interconnect or LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostedConnectionRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account ID of the customer for the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account ID of the customer for the connection.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account ID of the customer for the connection.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account ID of the customer for the
     *            connection.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account ID of the customer for the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account ID of the customer for the
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostedConnectionRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note
     * that only those AWS Direct Connect Partners who have met specific
     * requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted
     * connection.
     * </p>
     *
     * @return <p>
     *         The bandwidth of the connection. The possible values are 50Mbps,
     *         100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps,
     *         and 10Gbps. Note that only those AWS Direct Connect Partners who
     *         have met specific requirements are allowed to create a 1Gbps,
     *         2Gbps, 5Gbps or 10Gbps hosted connection.
     *         </p>
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note
     * that only those AWS Direct Connect Partners who have met specific
     * requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted
     * connection.
     * </p>
     *
     * @param bandwidth <p>
     *            The bandwidth of the connection. The possible values are
     *            50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps,
     *            2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct
     *            Connect Partners who have met specific requirements are
     *            allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted
     *            connection.
     *            </p>
     */
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note
     * that only those AWS Direct Connect Partners who have met specific
     * requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted
     * connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bandwidth <p>
     *            The bandwidth of the connection. The possible values are
     *            50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps,
     *            2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct
     *            Connect Partners who have met specific requirements are
     *            allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostedConnectionRequest withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * <p>
     * The name of the hosted connection.
     * </p>
     *
     * @return <p>
     *         The name of the hosted connection.
     *         </p>
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * <p>
     * The name of the hosted connection.
     * </p>
     *
     * @param connectionName <p>
     *            The name of the hosted connection.
     *            </p>
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the hosted connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionName <p>
     *            The name of the hosted connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostedConnectionRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the hosted connection.
     * </p>
     *
     * @return <p>
     *         The dedicated VLAN provisioned to the hosted connection.
     *         </p>
     */
    public Integer getVlan() {
        return vlan;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the hosted connection.
     * </p>
     *
     * @param vlan <p>
     *            The dedicated VLAN provisioned to the hosted connection.
     *            </p>
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the hosted connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vlan <p>
     *            The dedicated VLAN provisioned to the hosted connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostedConnectionRequest withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     *
     * @return <p>
     *         The tags associated with the connection.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the connection.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the connection.
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
     * The tags associated with the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostedConnectionRequest withTags(Tag... tags) {
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
     * The tags associated with the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostedConnectionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getBandwidth() != null)
            sb.append("bandwidth: " + getBandwidth() + ",");
        if (getConnectionName() != null)
            sb.append("connectionName: " + getConnectionName() + ",");
        if (getVlan() != null)
            sb.append("vlan: " + getVlan() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateHostedConnectionRequest == false)
            return false;
        AllocateHostedConnectionRequest other = (AllocateHostedConnectionRequest) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null
                && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null
                && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
