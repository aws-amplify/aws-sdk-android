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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * BrokerNodeInfo
 * </p>
 */
public class BrokerNodeInfo implements Serializable {
    /**
     * 
     <p>
     * The attached elastic network interface of the broker.
     * </p>
     */
    private String attachedENIId;

    /**
     * 
     <p>
     * The ID of the broker.
     * </p>
     */
    private Double brokerId;

    /**
     * 
     <p>
     * The client subnet to which this broker node belongs.
     * </p>
     */
    private String clientSubnet;

    /**
     * 
     <p>
     * The virtual private cloud (VPC) of the client.
     * </p>
     */
    private String clientVpcIpAddress;

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p>
     */
    private BrokerSoftwareInfo currentBrokerSoftwareInfo;

    /**
     * 
     <p>
     * Endpoints for accessing the broker.
     * </p>
     */
    private java.util.List<String> endpoints;

    /**
     * 
     <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @return <p>
     *         The attached elastic network interface of the broker.
     *         </p>
     */
    public String getAttachedENIId() {
        return attachedENIId;
    }

    /**
     * 
     <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @param attachedENIId <p>
     *            The attached elastic network interface of the broker.
     *            </p>
     */
    public void setAttachedENIId(String attachedENIId) {
        this.attachedENIId = attachedENIId;
    }

    /**
     * 
     <p>
     * The attached elastic network interface of the broker.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachedENIId <p>
     *            The attached elastic network interface of the broker.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeInfo withAttachedENIId(String attachedENIId) {
        this.attachedENIId = attachedENIId;
        return this;
    }

    /**
     * 
     <p>
     * The ID of the broker.
     * </p>
     * 
     * @return <p>
     *         The ID of the broker.
     *         </p>
     */
    public Double getBrokerId() {
        return brokerId;
    }

    /**
     * 
     <p>
     * The ID of the broker.
     * </p>
     * 
     * @param brokerId <p>
     *            The ID of the broker.
     *            </p>
     */
    public void setBrokerId(Double brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * 
     <p>
     * The ID of the broker.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brokerId <p>
     *            The ID of the broker.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeInfo withBrokerId(Double brokerId) {
        this.brokerId = brokerId;
        return this;
    }

    /**
     * 
     <p>
     * The client subnet to which this broker node belongs.
     * </p>
     * 
     * @return <p>
     *         The client subnet to which this broker node belongs.
     *         </p>
     */
    public String getClientSubnet() {
        return clientSubnet;
    }

    /**
     * 
     <p>
     * The client subnet to which this broker node belongs.
     * </p>
     * 
     * @param clientSubnet <p>
     *            The client subnet to which this broker node belongs.
     *            </p>
     */
    public void setClientSubnet(String clientSubnet) {
        this.clientSubnet = clientSubnet;
    }

    /**
     * 
     <p>
     * The client subnet to which this broker node belongs.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientSubnet <p>
     *            The client subnet to which this broker node belongs.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeInfo withClientSubnet(String clientSubnet) {
        this.clientSubnet = clientSubnet;
        return this;
    }

    /**
     * 
     <p>
     * The virtual private cloud (VPC) of the client.
     * </p>
     * 
     * @return <p>
     *         The virtual private cloud (VPC) of the client.
     *         </p>
     */
    public String getClientVpcIpAddress() {
        return clientVpcIpAddress;
    }

    /**
     * 
     <p>
     * The virtual private cloud (VPC) of the client.
     * </p>
     * 
     * @param clientVpcIpAddress <p>
     *            The virtual private cloud (VPC) of the client.
     *            </p>
     */
    public void setClientVpcIpAddress(String clientVpcIpAddress) {
        this.clientVpcIpAddress = clientVpcIpAddress;
    }

    /**
     * 
     <p>
     * The virtual private cloud (VPC) of the client.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpcIpAddress <p>
     *            The virtual private cloud (VPC) of the client.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeInfo withClientVpcIpAddress(String clientVpcIpAddress) {
        this.clientVpcIpAddress = clientVpcIpAddress;
        return this;
    }

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the version of software currently deployed on
     *         the Kafka brokers in the cluster.
     *         </p>
     */
    public BrokerSoftwareInfo getCurrentBrokerSoftwareInfo() {
        return currentBrokerSoftwareInfo;
    }

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo <p>
     *            Information about the version of software currently deployed
     *            on the Kafka brokers in the cluster.
     *            </p>
     */
    public void setCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
    }

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentBrokerSoftwareInfo <p>
     *            Information about the version of software currently deployed
     *            on the Kafka brokers in the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeInfo withCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
        return this;
    }

    /**
     * 
     <p>
     * Endpoints for accessing the broker.
     * </p>
     * 
     * @return <p>
     *         Endpoints for accessing the broker.
     *         </p>
     */
    public java.util.List<String> getEndpoints() {
        return endpoints;
    }

    /**
     * 
     <p>
     * Endpoints for accessing the broker.
     * </p>
     * 
     * @param endpoints <p>
     *            Endpoints for accessing the broker.
     *            </p>
     */
    public void setEndpoints(java.util.Collection<String> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<String>(endpoints);
    }

    /**
     * 
     <p>
     * Endpoints for accessing the broker.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints <p>
     *            Endpoints for accessing the broker.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeInfo withEndpoints(String... endpoints) {
        if (getEndpoints() == null) {
            this.endpoints = new java.util.ArrayList<String>(endpoints.length);
        }
        for (String value : endpoints) {
            this.endpoints.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * Endpoints for accessing the broker.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints <p>
     *            Endpoints for accessing the broker.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeInfo withEndpoints(java.util.Collection<String> endpoints) {
        setEndpoints(endpoints);
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
        if (getAttachedENIId() != null)
            sb.append("AttachedENIId: " + getAttachedENIId() + ",");
        if (getBrokerId() != null)
            sb.append("BrokerId: " + getBrokerId() + ",");
        if (getClientSubnet() != null)
            sb.append("ClientSubnet: " + getClientSubnet() + ",");
        if (getClientVpcIpAddress() != null)
            sb.append("ClientVpcIpAddress: " + getClientVpcIpAddress() + ",");
        if (getCurrentBrokerSoftwareInfo() != null)
            sb.append("CurrentBrokerSoftwareInfo: " + getCurrentBrokerSoftwareInfo() + ",");
        if (getEndpoints() != null)
            sb.append("Endpoints: " + getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachedENIId() == null) ? 0 : getAttachedENIId().hashCode());
        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode
                + ((getClientSubnet() == null) ? 0 : getClientSubnet().hashCode());
        hashCode = prime * hashCode
                + ((getClientVpcIpAddress() == null) ? 0 : getClientVpcIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentBrokerSoftwareInfo() == null) ? 0 : getCurrentBrokerSoftwareInfo()
                        .hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerNodeInfo == false)
            return false;
        BrokerNodeInfo other = (BrokerNodeInfo) obj;

        if (other.getAttachedENIId() == null ^ this.getAttachedENIId() == null)
            return false;
        if (other.getAttachedENIId() != null
                && other.getAttachedENIId().equals(this.getAttachedENIId()) == false)
            return false;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getClientSubnet() == null ^ this.getClientSubnet() == null)
            return false;
        if (other.getClientSubnet() != null
                && other.getClientSubnet().equals(this.getClientSubnet()) == false)
            return false;
        if (other.getClientVpcIpAddress() == null ^ this.getClientVpcIpAddress() == null)
            return false;
        if (other.getClientVpcIpAddress() != null
                && other.getClientVpcIpAddress().equals(this.getClientVpcIpAddress()) == false)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() == null
                ^ this.getCurrentBrokerSoftwareInfo() == null)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() != null
                && other.getCurrentBrokerSoftwareInfo().equals(this.getCurrentBrokerSoftwareInfo()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null
                && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }
}
