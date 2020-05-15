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
 * Represents a node in a directed acyclic graph (DAG)
 * </p>
 */
public class CodeGenNode implements Serializable {
    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     */
    private String id;

    /**
     * <p>
     * The type of node that this is.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> args;

    /**
     * <p>
     * The line number of the node.
     * </p>
     */
    private Integer lineNumber;

    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @return <p>
     *         A node identifier that is unique within the node's graph.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @param id <p>
     *            A node identifier that is unique within the node's graph.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A node identifier that is unique within the node's graph.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @param id <p>
     *            A node identifier that is unique within the node's graph.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of node that this is.
     * </p>
     *
     * @return <p>
     *         The type of node that this is.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The type of node that this is.
     * </p>
     *
     * @param nodeType <p>
     *            The type of node that this is.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The type of node that this is.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The type of node that this is.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNode withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     *
     * @return <p>
     *         Properties of the node, in the form of name-value pairs.
     *         </p>
     */
    public java.util.List<CodeGenNodeArg> getArgs() {
        return args;
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     *
     * @param args <p>
     *            Properties of the node, in the form of name-value pairs.
     *            </p>
     */
    public void setArgs(java.util.Collection<CodeGenNodeArg> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new java.util.ArrayList<CodeGenNodeArg>(args);
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            Properties of the node, in the form of name-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNode withArgs(CodeGenNodeArg... args) {
        if (getArgs() == null) {
            this.args = new java.util.ArrayList<CodeGenNodeArg>(args.length);
        }
        for (CodeGenNodeArg value : args) {
            this.args.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Properties of the node, in the form of name-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            Properties of the node, in the form of name-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNode withArgs(java.util.Collection<CodeGenNodeArg> args) {
        setArgs(args);
        return this;
    }

    /**
     * <p>
     * The line number of the node.
     * </p>
     *
     * @return <p>
     *         The line number of the node.
     *         </p>
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * <p>
     * The line number of the node.
     * </p>
     *
     * @param lineNumber <p>
     *            The line number of the node.
     *            </p>
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * <p>
     * The line number of the node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineNumber <p>
     *            The line number of the node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNode withLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getArgs() != null)
            sb.append("Args: " + getArgs() + ",");
        if (getLineNumber() != null)
            sb.append("LineNumber: " + getLineNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        hashCode = prime * hashCode + ((getLineNumber() == null) ? 0 : getLineNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeGenNode == false)
            return false;
        CodeGenNode other = (CodeGenNode) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        if (other.getLineNumber() == null ^ this.getLineNumber() == null)
            return false;
        if (other.getLineNumber() != null
                && other.getLineNumber().equals(this.getLineNumber()) == false)
            return false;
        return true;
    }
}
