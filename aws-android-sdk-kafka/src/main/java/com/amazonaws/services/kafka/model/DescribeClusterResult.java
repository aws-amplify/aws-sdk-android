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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class DescribeClusterResult implements Serializable {
    /**
     * 
     <p>
     * The cluster information.
     * </p>
     */
    private ClusterInfo clusterInfo;

    /**
     * 
     <p>
     * The cluster information.
     * </p>
     * 
     * @return <p>
     *         The cluster information.
     *         </p>
     */
    public ClusterInfo getClusterInfo() {
        return clusterInfo;
    }

    /**
     * 
     <p>
     * The cluster information.
     * </p>
     * 
     * @param clusterInfo <p>
     *            The cluster information.
     *            </p>
     */
    public void setClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    /**
     * 
     <p>
     * The cluster information.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterInfo <p>
     *            The cluster information.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterResult withClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
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
        if (getClusterInfo() != null)
            sb.append("ClusterInfo: " + getClusterInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterInfo() == null) ? 0 : getClusterInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterResult == false)
            return false;
        DescribeClusterResult other = (DescribeClusterResult) obj;

        if (other.getClusterInfo() == null ^ this.getClusterInfo() == null)
            return false;
        if (other.getClusterInfo() != null
                && other.getClusterInfo().equals(this.getClusterInfo()) == false)
            return false;
        return true;
    }
}
