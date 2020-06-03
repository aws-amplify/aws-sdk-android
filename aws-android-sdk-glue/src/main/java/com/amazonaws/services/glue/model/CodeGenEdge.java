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
 * Represents a directional edge in a directed acyclic graph (DAG).
 * </p>
 */
public class CodeGenEdge implements Serializable {
    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     */
    private String source;

    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     */
    private String target;

    /**
     * <p>
     * The target of the edge.
     * </p>
     */
    private String targetParameter;

    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @return <p>
     *         The ID of the node at which the edge starts.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @param source <p>
     *            The ID of the node at which the edge starts.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The ID of the node at which the edge starts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @param source <p>
     *            The ID of the node at which the edge starts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenEdge withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @return <p>
     *         The ID of the node at which the edge ends.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @param target <p>
     *            The ID of the node at which the edge ends.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The ID of the node at which the edge ends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z_][A-Za-z0-9_]*<br/>
     *
     * @param target <p>
     *            The ID of the node at which the edge ends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenEdge withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The target of the edge.
     * </p>
     *
     * @return <p>
     *         The target of the edge.
     *         </p>
     */
    public String getTargetParameter() {
        return targetParameter;
    }

    /**
     * <p>
     * The target of the edge.
     * </p>
     *
     * @param targetParameter <p>
     *            The target of the edge.
     *            </p>
     */
    public void setTargetParameter(String targetParameter) {
        this.targetParameter = targetParameter;
    }

    /**
     * <p>
     * The target of the edge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetParameter <p>
     *            The target of the edge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenEdge withTargetParameter(String targetParameter) {
        this.targetParameter = targetParameter;
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
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getTargetParameter() != null)
            sb.append("TargetParameter: " + getTargetParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode
                + ((getTargetParameter() == null) ? 0 : getTargetParameter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeGenEdge == false)
            return false;
        CodeGenEdge other = (CodeGenEdge) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTargetParameter() == null ^ this.getTargetParameter() == null)
            return false;
        if (other.getTargetParameter() != null
                && other.getTargetParameter().equals(this.getTargetParameter()) == false)
            return false;
        return true;
    }
}
