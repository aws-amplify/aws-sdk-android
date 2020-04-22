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
 * Changes the size of the cluster. You can change the cluster's type, or change
 * the number or type of nodes. The default behavior is to use the elastic
 * resize method. With an elastic resize, your cluster is available for read and
 * write operations more quickly than with the classic resize method.
 * </p>
 * <p>
 * Elastic resize operations have the following restrictions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can only resize clusters of the following types:
 * </p>
 * <ul>
 * <li>
 * <p>
 * dc2.large
 * </p>
 * </li>
 * <li>
 * <p>
 * dc2.8xlarge
 * </p>
 * </li>
 * <li>
 * <p>
 * ds2.xlarge
 * </p>
 * </li>
 * <li>
 * <p>
 * ds2.8xlarge
 * </p>
 * </li>
 * <li>
 * <p>
 * ra3.4xlarge
 * </p>
 * </li>
 * <li>
 * <p>
 * ra3.16xlarge
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * The type of nodes that you add must match the node type for the cluster.
 * </p>
 * </li>
 * </ul>
 */
public class ResizeClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     */
    private String clusterType;

    /**
     * <p>
     * The new node type for the nodes you are adding. If not specified, the
     * cluster's current node type is used.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the
     * classic resize process. If you don't provide this parameter or set the
     * value to <code>false</code>, the resize type is elastic.
     * </p>
     */
    private Boolean classic;

    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the cluster to resize.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier for the cluster to resize.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier for the cluster to resize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResizeClusterRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     *
     * @return <p>
     *         The new cluster type for the specified cluster.
     *         </p>
     */
    public String getClusterType() {
        return clusterType;
    }

    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     *
     * @param clusterType <p>
     *            The new cluster type for the specified cluster.
     *            </p>
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterType <p>
     *            The new cluster type for the specified cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResizeClusterRequest withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * <p>
     * The new node type for the nodes you are adding. If not specified, the
     * cluster's current node type is used.
     * </p>
     *
     * @return <p>
     *         The new node type for the nodes you are adding. If not specified,
     *         the cluster's current node type is used.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The new node type for the nodes you are adding. If not specified, the
     * cluster's current node type is used.
     * </p>
     *
     * @param nodeType <p>
     *            The new node type for the nodes you are adding. If not
     *            specified, the cluster's current node type is used.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The new node type for the nodes you are adding. If not specified, the
     * cluster's current node type is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The new node type for the nodes you are adding. If not
     *            specified, the cluster's current node type is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResizeClusterRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     *
     * @return <p>
     *         The new number of nodes for the cluster.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The new number of nodes for the cluster.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The new number of nodes for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResizeClusterRequest withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the
     * classic resize process. If you don't provide this parameter or set the
     * value to <code>false</code>, the resize type is elastic.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether the resize operation is using
     *         the classic resize process. If you don't provide this parameter
     *         or set the value to <code>false</code>, the resize type is
     *         elastic.
     *         </p>
     */
    public Boolean isClassic() {
        return classic;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the
     * classic resize process. If you don't provide this parameter or set the
     * value to <code>false</code>, the resize type is elastic.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether the resize operation is using
     *         the classic resize process. If you don't provide this parameter
     *         or set the value to <code>false</code>, the resize type is
     *         elastic.
     *         </p>
     */
    public Boolean getClassic() {
        return classic;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the
     * classic resize process. If you don't provide this parameter or set the
     * value to <code>false</code>, the resize type is elastic.
     * </p>
     *
     * @param classic <p>
     *            A boolean value indicating whether the resize operation is
     *            using the classic resize process. If you don't provide this
     *            parameter or set the value to <code>false</code>, the resize
     *            type is elastic.
     *            </p>
     */
    public void setClassic(Boolean classic) {
        this.classic = classic;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the
     * classic resize process. If you don't provide this parameter or set the
     * value to <code>false</code>, the resize type is elastic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classic <p>
     *            A boolean value indicating whether the resize operation is
     *            using the classic resize process. If you don't provide this
     *            parameter or set the value to <code>false</code>, the resize
     *            type is elastic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResizeClusterRequest withClassic(Boolean classic) {
        this.classic = classic;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getClusterType() != null)
            sb.append("ClusterType: " + getClusterType() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getClassic() != null)
            sb.append("Classic: " + getClassic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getClassic() == null) ? 0 : getClassic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResizeClusterRequest == false)
            return false;
        ResizeClusterRequest other = (ResizeClusterRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null
                && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getClassic() == null ^ this.getClassic() == null)
            return false;
        if (other.getClassic() != null && other.getClassic().equals(this.getClassic()) == false)
            return false;
        return true;
    }
}
