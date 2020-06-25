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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * A workflow graph represents the complete workflow containing all the AWS Glue
 * components present in the workflow and all the directed connections between
 * them.
 * </p>
 */
public class WorkflowGraph implements Serializable {
    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented
     * as nodes.
     * </p>
     */
    private java.util.List<Node> nodes;

    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the
     * workflow.
     * </p>
     */
    private java.util.List<Edge> edges;

    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented
     * as nodes.
     * </p>
     *
     * @return <p>
     *         A list of the the AWS Glue components belong to the workflow
     *         represented as nodes.
     *         </p>
     */
    public java.util.List<Node> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented
     * as nodes.
     * </p>
     *
     * @param nodes <p>
     *            A list of the the AWS Glue components belong to the workflow
     *            represented as nodes.
     *            </p>
     */
    public void setNodes(java.util.Collection<Node> nodes) {
        if (nodes == null) {
            this.nodes = null;
            return;
        }

        this.nodes = new java.util.ArrayList<Node>(nodes);
    }

    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented
     * as nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodes <p>
     *            A list of the the AWS Glue components belong to the workflow
     *            represented as nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowGraph withNodes(Node... nodes) {
        if (getNodes() == null) {
            this.nodes = new java.util.ArrayList<Node>(nodes.length);
        }
        for (Node value : nodes) {
            this.nodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the the AWS Glue components belong to the workflow represented
     * as nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodes <p>
     *            A list of the the AWS Glue components belong to the workflow
     *            represented as nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowGraph withNodes(java.util.Collection<Node> nodes) {
        setNodes(nodes);
        return this;
    }

    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the
     * workflow.
     * </p>
     *
     * @return <p>
     *         A list of all the directed connections between the nodes
     *         belonging to the workflow.
     *         </p>
     */
    public java.util.List<Edge> getEdges() {
        return edges;
    }

    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the
     * workflow.
     * </p>
     *
     * @param edges <p>
     *            A list of all the directed connections between the nodes
     *            belonging to the workflow.
     *            </p>
     */
    public void setEdges(java.util.Collection<Edge> edges) {
        if (edges == null) {
            this.edges = null;
            return;
        }

        this.edges = new java.util.ArrayList<Edge>(edges);
    }

    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the
     * workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param edges <p>
     *            A list of all the directed connections between the nodes
     *            belonging to the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowGraph withEdges(Edge... edges) {
        if (getEdges() == null) {
            this.edges = new java.util.ArrayList<Edge>(edges.length);
        }
        for (Edge value : edges) {
            this.edges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the directed connections between the nodes belonging to the
     * workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param edges <p>
     *            A list of all the directed connections between the nodes
     *            belonging to the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowGraph withEdges(java.util.Collection<Edge> edges) {
        setEdges(edges);
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
        if (getNodes() != null)
            sb.append("Nodes: " + getNodes() + ",");
        if (getEdges() != null)
            sb.append("Edges: " + getEdges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        hashCode = prime * hashCode + ((getEdges() == null) ? 0 : getEdges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowGraph == false)
            return false;
        WorkflowGraph other = (WorkflowGraph) obj;

        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
            return false;
        if (other.getEdges() == null ^ this.getEdges() == null)
            return false;
        if (other.getEdges() != null && other.getEdges().equals(this.getEdges()) == false)
            return false;
        return true;
    }
}
