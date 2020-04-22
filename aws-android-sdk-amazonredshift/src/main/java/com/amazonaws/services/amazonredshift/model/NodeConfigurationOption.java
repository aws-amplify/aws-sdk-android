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

/**
 * <p>
 * A list of node configurations.
 * </p>
 */
public class NodeConfigurationOption implements Serializable {
    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The number of nodes.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     */
    private Double estimatedDiskUtilizationPercent;

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, high-performance
     */
    private String mode;

    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     *
     * @return <p>
     *         The node type, such as, "ds2.8xlarge".
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     *
     * @param nodeType <p>
     *            The node type, such as, "ds2.8xlarge".
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type, such as, "ds2.8xlarge".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type, such as, "ds2.8xlarge".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeConfigurationOption withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The number of nodes.
     * </p>
     *
     * @return <p>
     *         The number of nodes.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The number of nodes.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The number of nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeConfigurationOption withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     *
     * @return <p>
     *         The estimated disk utilizaton percentage.
     *         </p>
     */
    public Double getEstimatedDiskUtilizationPercent() {
        return estimatedDiskUtilizationPercent;
    }

    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     *
     * @param estimatedDiskUtilizationPercent <p>
     *            The estimated disk utilizaton percentage.
     *            </p>
     */
    public void setEstimatedDiskUtilizationPercent(Double estimatedDiskUtilizationPercent) {
        this.estimatedDiskUtilizationPercent = estimatedDiskUtilizationPercent;
    }

    /**
     * <p>
     * The estimated disk utilizaton percentage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedDiskUtilizationPercent <p>
     *            The estimated disk utilizaton percentage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeConfigurationOption withEstimatedDiskUtilizationPercent(
            Double estimatedDiskUtilizationPercent) {
        this.estimatedDiskUtilizationPercent = estimatedDiskUtilizationPercent;
        return this;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, high-performance
     *
     * @return <p>
     *         The category of the node configuration recommendation.
     *         </p>
     * @see Mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, high-performance
     *
     * @param mode <p>
     *            The category of the node configuration recommendation.
     *            </p>
     * @see Mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, high-performance
     *
     * @param mode <p>
     *            The category of the node configuration recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mode
     */
    public NodeConfigurationOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, high-performance
     *
     * @param mode <p>
     *            The category of the node configuration recommendation.
     *            </p>
     * @see Mode
     */
    public void setMode(Mode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The category of the node configuration recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, high-performance
     *
     * @param mode <p>
     *            The category of the node configuration recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mode
     */
    public NodeConfigurationOption withMode(Mode mode) {
        this.mode = mode.toString();
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
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getEstimatedDiskUtilizationPercent() != null)
            sb.append("EstimatedDiskUtilizationPercent: " + getEstimatedDiskUtilizationPercent()
                    + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedDiskUtilizationPercent() == null) ? 0
                        : getEstimatedDiskUtilizationPercent().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeConfigurationOption == false)
            return false;
        NodeConfigurationOption other = (NodeConfigurationOption) obj;

        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getEstimatedDiskUtilizationPercent() == null
                ^ this.getEstimatedDiskUtilizationPercent() == null)
            return false;
        if (other.getEstimatedDiskUtilizationPercent() != null
                && other.getEstimatedDiskUtilizationPercent().equals(
                        this.getEstimatedDiskUtilizationPercent()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }
}
