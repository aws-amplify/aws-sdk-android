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

public class CreateClusterParameterGroupResult implements Serializable {
    /**
     * <p>
     * Describes a parameter group.
     * </p>
     */
    private ClusterParameterGroup clusterParameterGroup;

    /**
     * <p>
     * Describes a parameter group.
     * </p>
     *
     * @return <p>
     *         Describes a parameter group.
     *         </p>
     */
    public ClusterParameterGroup getClusterParameterGroup() {
        return clusterParameterGroup;
    }

    /**
     * <p>
     * Describes a parameter group.
     * </p>
     *
     * @param clusterParameterGroup <p>
     *            Describes a parameter group.
     *            </p>
     */
    public void setClusterParameterGroup(ClusterParameterGroup clusterParameterGroup) {
        this.clusterParameterGroup = clusterParameterGroup;
    }

    /**
     * <p>
     * Describes a parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterParameterGroup <p>
     *            Describes a parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterParameterGroupResult withClusterParameterGroup(
            ClusterParameterGroup clusterParameterGroup) {
        this.clusterParameterGroup = clusterParameterGroup;
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
        if (getClusterParameterGroup() != null)
            sb.append("ClusterParameterGroup: " + getClusterParameterGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterParameterGroup() == null) ? 0 : getClusterParameterGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterParameterGroupResult == false)
            return false;
        CreateClusterParameterGroupResult other = (CreateClusterParameterGroupResult) obj;

        if (other.getClusterParameterGroup() == null ^ this.getClusterParameterGroup() == null)
            return false;
        if (other.getClusterParameterGroup() != null
                && other.getClusterParameterGroup().equals(this.getClusterParameterGroup()) == false)
            return false;
        return true;
    }
}
