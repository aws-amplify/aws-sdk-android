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
 * Deprecated. Use <a>AllocateHostedConnection</a> instead.
 * </p>
 * <p>
 * Creates a hosted connection on an interconnect.
 * </p>
 * <p>
 * Allocates a VLAN number and a specified amount of bandwidth for use by a
 * hosted connection on the specified interconnect.
 * </p>
 * <note>
 * <p>
 * Intended for use by AWS Direct Connect Partners only.
 * </p>
 * </note>
 */
public class AllocateConnectionOnInterconnectRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The name of the provisioned connection.
     * </p>
     */
    private String connectionName;

    /**
     * <p>
     * The ID of the AWS account of the customer for whom the connection will be
     * provisioned.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The ID of the interconnect on which the connection will be provisioned.
     * </p>
     */
    private String interconnectId;

    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     */
    private Integer vlan;

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
    public AllocateConnectionOnInterconnectRequest withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * <p>
     * The name of the provisioned connection.
     * </p>
     *
     * @return <p>
     *         The name of the provisioned connection.
     *         </p>
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * <p>
     * The name of the provisioned connection.
     * </p>
     *
     * @param connectionName <p>
     *            The name of the provisioned connection.
     *            </p>
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the provisioned connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionName <p>
     *            The name of the provisioned connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateConnectionOnInterconnectRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account of the customer for whom the connection will be
     * provisioned.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account of the customer for whom the connection
     *         will be provisioned.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account of the customer for whom the connection will be
     * provisioned.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account of the customer for whom the
     *            connection will be provisioned.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account of the customer for whom the connection will be
     * provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account of the customer for whom the
     *            connection will be provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateConnectionOnInterconnectRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The ID of the interconnect on which the connection will be provisioned.
     * </p>
     *
     * @return <p>
     *         The ID of the interconnect on which the connection will be
     *         provisioned.
     *         </p>
     */
    public String getInterconnectId() {
        return interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect on which the connection will be provisioned.
     * </p>
     *
     * @param interconnectId <p>
     *            The ID of the interconnect on which the connection will be
     *            provisioned.
     *            </p>
     */
    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * <p>
     * The ID of the interconnect on which the connection will be provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interconnectId <p>
     *            The ID of the interconnect on which the connection will be
     *            provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateConnectionOnInterconnectRequest withInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
        return this;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     *
     * @return <p>
     *         The dedicated VLAN provisioned to the connection.
     *         </p>
     */
    public Integer getVlan() {
        return vlan;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     *
     * @param vlan <p>
     *            The dedicated VLAN provisioned to the connection.
     *            </p>
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    /**
     * <p>
     * The dedicated VLAN provisioned to the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vlan <p>
     *            The dedicated VLAN provisioned to the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateConnectionOnInterconnectRequest withVlan(Integer vlan) {
        this.vlan = vlan;
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
        if (getBandwidth() != null)
            sb.append("bandwidth: " + getBandwidth() + ",");
        if (getConnectionName() != null)
            sb.append("connectionName: " + getConnectionName() + ",");
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getInterconnectId() != null)
            sb.append("interconnectId: " + getInterconnectId() + ",");
        if (getVlan() != null)
            sb.append("vlan: " + getVlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateConnectionOnInterconnectRequest == false)
            return false;
        AllocateConnectionOnInterconnectRequest other = (AllocateConnectionOnInterconnectRequest) obj;

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
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null
                && other.getInterconnectId().equals(this.getInterconnectId()) == false)
            return false;
        if (other.getVlan() == null ^ this.getVlan() == null)
            return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false)
            return false;
        return true;
    }
}
