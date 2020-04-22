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

public class ModifyClusterSubnetGroupResult implements Serializable {
    /**
     * <p>
     * Describes a subnet group.
     * </p>
     */
    private ClusterSubnetGroup clusterSubnetGroup;

    /**
     * <p>
     * Describes a subnet group.
     * </p>
     *
     * @return <p>
     *         Describes a subnet group.
     *         </p>
     */
    public ClusterSubnetGroup getClusterSubnetGroup() {
        return clusterSubnetGroup;
    }

    /**
     * <p>
     * Describes a subnet group.
     * </p>
     *
     * @param clusterSubnetGroup <p>
     *            Describes a subnet group.
     *            </p>
     */
    public void setClusterSubnetGroup(ClusterSubnetGroup clusterSubnetGroup) {
        this.clusterSubnetGroup = clusterSubnetGroup;
    }

    /**
     * <p>
     * Describes a subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSubnetGroup <p>
     *            Describes a subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterSubnetGroupResult withClusterSubnetGroup(
            ClusterSubnetGroup clusterSubnetGroup) {
        this.clusterSubnetGroup = clusterSubnetGroup;
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
        if (getClusterSubnetGroup() != null)
            sb.append("ClusterSubnetGroup: " + getClusterSubnetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterSubnetGroup() == null) ? 0 : getClusterSubnetGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterSubnetGroupResult == false)
            return false;
        ModifyClusterSubnetGroupResult other = (ModifyClusterSubnetGroupResult) obj;

        if (other.getClusterSubnetGroup() == null ^ this.getClusterSubnetGroup() == null)
            return false;
        if (other.getClusterSubnetGroup() != null
                && other.getClusterSubnetGroup().equals(this.getClusterSubnetGroup()) == false)
            return false;
        return true;
    }
}
