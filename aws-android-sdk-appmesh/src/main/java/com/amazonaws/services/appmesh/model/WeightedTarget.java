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
 * <p>
 * An object that represents a target and its relative weight. Traffic is
 * distributed across targets according to their relative weight. For example, a
 * weighted target with a relative weight of 50 receives five times as much
 * traffic as one with a relative weight of 10. The total weight for all targets
 * combined must be less than or equal to 100.
 * </p>
 */
public class WeightedTarget implements Serializable {
    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualNode;

    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer weight;

    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The virtual node to associate with the weighted target.
     *         </p>
     */
    public String getVirtualNode() {
        return virtualNode;
    }

    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNode <p>
     *            The virtual node to associate with the weighted target.
     *            </p>
     */
    public void setVirtualNode(String virtualNode) {
        this.virtualNode = virtualNode;
    }

    /**
     * <p>
     * The virtual node to associate with the weighted target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNode <p>
     *            The virtual node to associate with the weighted target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WeightedTarget withVirtualNode(String virtualNode) {
        this.virtualNode = virtualNode;
        return this;
    }

    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The relative weight of the weighted target.
     *         </p>
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param weight <p>
     *            The relative weight of the weighted target.
     *            </p>
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The relative weight of the weighted target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param weight <p>
     *            The relative weight of the weighted target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WeightedTarget withWeight(Integer weight) {
        this.weight = weight;
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
            sb.append("virtualNode: " + getVirtualNode() + ",");
        if (getWeight() != null)
            sb.append("weight: " + getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualNode() == null) ? 0 : getVirtualNode().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeightedTarget == false)
            return false;
        WeightedTarget other = (WeightedTarget) obj;

        if (other.getVirtualNode() == null ^ this.getVirtualNode() == null)
            return false;
        if (other.getVirtualNode() != null
                && other.getVirtualNode().equals(this.getVirtualNode()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }
}
