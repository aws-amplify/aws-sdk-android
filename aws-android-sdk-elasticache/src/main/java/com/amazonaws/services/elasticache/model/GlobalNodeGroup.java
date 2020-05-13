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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Indicates the slot configuration and global identifier for a slice group.
 * </p>
 */
public class GlobalNodeGroup implements Serializable {
    /**
     * <p>
     * The name of the global node group
     * </p>
     */
    private String globalNodeGroupId;

    /**
     * <p>
     * The keyspace for this node group
     * </p>
     */
    private String slots;

    /**
     * <p>
     * The name of the global node group
     * </p>
     *
     * @return <p>
     *         The name of the global node group
     *         </p>
     */
    public String getGlobalNodeGroupId() {
        return globalNodeGroupId;
    }

    /**
     * <p>
     * The name of the global node group
     * </p>
     *
     * @param globalNodeGroupId <p>
     *            The name of the global node group
     *            </p>
     */
    public void setGlobalNodeGroupId(String globalNodeGroupId) {
        this.globalNodeGroupId = globalNodeGroupId;
    }

    /**
     * <p>
     * The name of the global node group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalNodeGroupId <p>
     *            The name of the global node group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalNodeGroup withGlobalNodeGroupId(String globalNodeGroupId) {
        this.globalNodeGroupId = globalNodeGroupId;
        return this;
    }

    /**
     * <p>
     * The keyspace for this node group
     * </p>
     *
     * @return <p>
     *         The keyspace for this node group
     *         </p>
     */
    public String getSlots() {
        return slots;
    }

    /**
     * <p>
     * The keyspace for this node group
     * </p>
     *
     * @param slots <p>
     *            The keyspace for this node group
     *            </p>
     */
    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The keyspace for this node group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            The keyspace for this node group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalNodeGroup withSlots(String slots) {
        this.slots = slots;
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
        if (getGlobalNodeGroupId() != null)
            sb.append("GlobalNodeGroupId: " + getGlobalNodeGroupId() + ",");
        if (getSlots() != null)
            sb.append("Slots: " + getSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGlobalNodeGroupId() == null) ? 0 : getGlobalNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalNodeGroup == false)
            return false;
        GlobalNodeGroup other = (GlobalNodeGroup) obj;

        if (other.getGlobalNodeGroupId() == null ^ this.getGlobalNodeGroupId() == null)
            return false;
        if (other.getGlobalNodeGroupId() != null
                && other.getGlobalNodeGroupId().equals(this.getGlobalNodeGroupId()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        return true;
    }
}
