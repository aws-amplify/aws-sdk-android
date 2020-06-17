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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeVirtualNodeResult implements Serializable {
    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     */
    private VirtualNodeData virtualNode;

    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     *
     * @return <p>
     *         The full description of your virtual node.
     *         </p>
     */
    public VirtualNodeData getVirtualNode() {
        return virtualNode;
    }

    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     *
     * @param virtualNode <p>
     *            The full description of your virtual node.
     *            </p>
     */
    public void setVirtualNode(VirtualNodeData virtualNode) {
        this.virtualNode = virtualNode;
    }

    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualNode <p>
     *            The full description of your virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVirtualNodeResult withVirtualNode(VirtualNodeData virtualNode) {
        this.virtualNode = virtualNode;
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
        if (getVirtualNode() != null)
            sb.append("virtualNode: " + getVirtualNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualNode() == null) ? 0 : getVirtualNode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVirtualNodeResult == false)
            return false;
        DescribeVirtualNodeResult other = (DescribeVirtualNodeResult) obj;

        if (other.getVirtualNode() == null ^ this.getVirtualNode() == null)
            return false;
        if (other.getVirtualNode() != null
                && other.getVirtualNode().equals(this.getVirtualNode()) == false)
            return false;
        return true;
    }
}
