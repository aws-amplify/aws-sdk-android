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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetDataflowGraphResult implements Serializable {
    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     */
    private java.util.List<CodeGenNode> dagNodes;

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     */
    private java.util.List<CodeGenEdge> dagEdges;

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     *
     * @return <p>
     *         A list of the nodes in the resulting DAG.
     *         </p>
     */
    public java.util.List<CodeGenNode> getDagNodes() {
        return dagNodes;
    }

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     *
     * @param dagNodes <p>
     *            A list of the nodes in the resulting DAG.
     *            </p>
     */
    public void setDagNodes(java.util.Collection<CodeGenNode> dagNodes) {
        if (dagNodes == null) {
            this.dagNodes = null;
            return;
        }

        this.dagNodes = new java.util.ArrayList<CodeGenNode>(dagNodes);
    }

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dagNodes <p>
     *            A list of the nodes in the resulting DAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataflowGraphResult withDagNodes(CodeGenNode... dagNodes) {
        if (getDagNodes() == null) {
            this.dagNodes = new java.util.ArrayList<CodeGenNode>(dagNodes.length);
        }
        for (CodeGenNode value : dagNodes) {
            this.dagNodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the nodes in the resulting DAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dagNodes <p>
     *            A list of the nodes in the resulting DAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataflowGraphResult withDagNodes(java.util.Collection<CodeGenNode> dagNodes) {
        setDagNodes(dagNodes);
        return this;
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     *
     * @return <p>
     *         A list of the edges in the resulting DAG.
     *         </p>
     */
    public java.util.List<CodeGenEdge> getDagEdges() {
        return dagEdges;
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     *
     * @param dagEdges <p>
     *            A list of the edges in the resulting DAG.
     *            </p>
     */
    public void setDagEdges(java.util.Collection<CodeGenEdge> dagEdges) {
        if (dagEdges == null) {
            this.dagEdges = null;
            return;
        }

        this.dagEdges = new java.util.ArrayList<CodeGenEdge>(dagEdges);
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dagEdges <p>
     *            A list of the edges in the resulting DAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataflowGraphResult withDagEdges(CodeGenEdge... dagEdges) {
        if (getDagEdges() == null) {
            this.dagEdges = new java.util.ArrayList<CodeGenEdge>(dagEdges.length);
        }
        for (CodeGenEdge value : dagEdges) {
            this.dagEdges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the edges in the resulting DAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dagEdges <p>
     *            A list of the edges in the resulting DAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataflowGraphResult withDagEdges(java.util.Collection<CodeGenEdge> dagEdges) {
        setDagEdges(dagEdges);
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
        if (getDagNodes() != null)
            sb.append("DagNodes: " + getDagNodes() + ",");
        if (getDagEdges() != null)
            sb.append("DagEdges: " + getDagEdges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDagNodes() == null) ? 0 : getDagNodes().hashCode());
        hashCode = prime * hashCode + ((getDagEdges() == null) ? 0 : getDagEdges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataflowGraphResult == false)
            return false;
        GetDataflowGraphResult other = (GetDataflowGraphResult) obj;

        if (other.getDagNodes() == null ^ this.getDagNodes() == null)
            return false;
        if (other.getDagNodes() != null && other.getDagNodes().equals(this.getDagNodes()) == false)
            return false;
        if (other.getDagEdges() == null ^ this.getDagEdges() == null)
            return false;
        if (other.getDagEdges() != null && other.getDagEdges().equals(this.getDagEdges()) == false)
            return false;
        return true;
    }
}
