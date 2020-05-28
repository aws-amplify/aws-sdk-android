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
 * The node information object.
 * </p>
 */
public class NodeInfo implements Serializable {
    /**
     * 
     <p>
     * The start time.
     * </p>
     */
    private String addedToClusterTime;

    /**
     * 
     <p>
     * The broker node info.
     * </p>
     */
    private BrokerNodeInfo brokerNodeInfo;

    /**
     * 
     <p>
     * The instance type.
     * </p>
     */
    private String instanceType;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p>
     */
    private String nodeARN;

    /**
     * 
     <p>
     * The node type.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROKER
     */
    private String nodeType;

    /**
     * 
     <p>
     * The ZookeeperNodeInfo.
     * </p>
     */
    private ZookeeperNodeInfo zookeeperNodeInfo;

    /**
     * 
     <p>
     * The start time.
     * </p>
     * 
     * @return <p>
     *         The start time.
     *         </p>
     */
    public String getAddedToClusterTime() {
        return addedToClusterTime;
    }

    /**
     * 
     <p>
     * The start time.
     * </p>
     * 
     * @param addedToClusterTime <p>
     *            The start time.
     *            </p>
     */
    public void setAddedToClusterTime(String addedToClusterTime) {
        this.addedToClusterTime = addedToClusterTime;
    }

    /**
     * 
     <p>
     * The start time.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addedToClusterTime <p>
     *            The start time.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeInfo withAddedToClusterTime(String addedToClusterTime) {
        this.addedToClusterTime = addedToClusterTime;
        return this;
    }

    /**
     * 
     <p>
     * The broker node info.
     * </p>
     * 
     * @return <p>
     *         The broker node info.
     *         </p>
     */
    public BrokerNodeInfo getBrokerNodeInfo() {
        return brokerNodeInfo;
    }

    /**
     * 
     <p>
     * The broker node info.
     * </p>
     * 
     * @param brokerNodeInfo <p>
     *            The broker node info.
     *            </p>
     */
    public void setBrokerNodeInfo(BrokerNodeInfo brokerNodeInfo) {
        this.brokerNodeInfo = brokerNodeInfo;
    }

    /**
     * 
     <p>
     * The broker node info.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brokerNodeInfo <p>
     *            The broker node info.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeInfo withBrokerNodeInfo(BrokerNodeInfo brokerNodeInfo) {
        this.brokerNodeInfo = brokerNodeInfo;
        return this;
    }

    /**
     * 
     <p>
     * The instance type.
     * </p>
     * 
     * @return <p>
     *         The instance type.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * 
     <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * 
     <p>
     * The instance type.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeInfo withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the node.
     *         </p>
     */
    public String getNodeARN() {
        return nodeARN;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p>
     * 
     * @param nodeARN <p>
     *            The Amazon Resource Name (ARN) of the node.
     *            </p>
     */
    public void setNodeARN(String nodeARN) {
        this.nodeARN = nodeARN;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeARN <p>
     *            The Amazon Resource Name (ARN) of the node.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeInfo withNodeARN(String nodeARN) {
        this.nodeARN = nodeARN;
        return this;
    }

    /**
     * 
     <p>
     * The node type.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROKER
     *
     * @return <p>
     *         The node type.
     *         </p> @see NodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * 
     <p>
     * The node type.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROKER
     *
     * @param nodeType <p>
     *            The node type.
     *            </p> @see NodeType
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * 
     <p>
     * The node type.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROKER
     *
     * @param nodeType <p>
     *            The node type.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeType
     */
    public NodeInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 
     <p>
     * The node type.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROKER
     *
     * @param nodeType <p>
     *            The node type.
     *            </p> @see NodeType
     */
    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType.toString();
    }

    /**
     * 
     <p>
     * The node type.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BROKER
     *
     * @param nodeType <p>
     *            The node type.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeType
     */
    public NodeInfo withNodeType(NodeType nodeType) {
        this.nodeType = nodeType.toString();
        return this;
    }

    /**
     * 
     <p>
     * The ZookeeperNodeInfo.
     * </p>
     * 
     * @return <p>
     *         The ZookeeperNodeInfo.
     *         </p>
     */
    public ZookeeperNodeInfo getZookeeperNodeInfo() {
        return zookeeperNodeInfo;
    }

    /**
     * 
     <p>
     * The ZookeeperNodeInfo.
     * </p>
     * 
     * @param zookeeperNodeInfo <p>
     *            The ZookeeperNodeInfo.
     *            </p>
     */
    public void setZookeeperNodeInfo(ZookeeperNodeInfo zookeeperNodeInfo) {
        this.zookeeperNodeInfo = zookeeperNodeInfo;
    }

    /**
     * 
     <p>
     * The ZookeeperNodeInfo.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zookeeperNodeInfo <p>
     *            The ZookeeperNodeInfo.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeInfo withZookeeperNodeInfo(ZookeeperNodeInfo zookeeperNodeInfo) {
        this.zookeeperNodeInfo = zookeeperNodeInfo;
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
        if (getAddedToClusterTime() != null)
            sb.append("AddedToClusterTime: " + getAddedToClusterTime() + ",");
        if (getBrokerNodeInfo() != null)
            sb.append("BrokerNodeInfo: " + getBrokerNodeInfo() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getNodeARN() != null)
            sb.append("NodeARN: " + getNodeARN() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getZookeeperNodeInfo() != null)
            sb.append("ZookeeperNodeInfo: " + getZookeeperNodeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAddedToClusterTime() == null) ? 0 : getAddedToClusterTime().hashCode());
        hashCode = prime * hashCode
                + ((getBrokerNodeInfo() == null) ? 0 : getBrokerNodeInfo().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getNodeARN() == null) ? 0 : getNodeARN().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getZookeeperNodeInfo() == null) ? 0 : getZookeeperNodeInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeInfo == false)
            return false;
        NodeInfo other = (NodeInfo) obj;

        if (other.getAddedToClusterTime() == null ^ this.getAddedToClusterTime() == null)
            return false;
        if (other.getAddedToClusterTime() != null
                && other.getAddedToClusterTime().equals(this.getAddedToClusterTime()) == false)
            return false;
        if (other.getBrokerNodeInfo() == null ^ this.getBrokerNodeInfo() == null)
            return false;
        if (other.getBrokerNodeInfo() != null
                && other.getBrokerNodeInfo().equals(this.getBrokerNodeInfo()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getNodeARN() == null ^ this.getNodeARN() == null)
            return false;
        if (other.getNodeARN() != null && other.getNodeARN().equals(this.getNodeARN()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getZookeeperNodeInfo() == null ^ this.getZookeeperNodeInfo() == null)
            return false;
        if (other.getZookeeperNodeInfo() != null
                && other.getZookeeperNodeInfo().equals(this.getZookeeperNodeInfo()) == false)
            return false;
        return true;
    }
}
