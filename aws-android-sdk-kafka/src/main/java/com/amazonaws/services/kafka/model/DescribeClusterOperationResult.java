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

public class DescribeClusterOperationResult implements Serializable {
    /**
     * 
     <p>
     * Cluster operation information
     * </p>
     */
    private ClusterOperationInfo clusterOperationInfo;

    /**
     * 
     <p>
     * Cluster operation information
     * </p>
     * 
     * @return <p>
     *         Cluster operation information
     *         </p>
     */
    public ClusterOperationInfo getClusterOperationInfo() {
        return clusterOperationInfo;
    }

    /**
     * 
     <p>
     * Cluster operation information
     * </p>
     * 
     * @param clusterOperationInfo <p>
     *            Cluster operation information
     *            </p>
     */
    public void setClusterOperationInfo(ClusterOperationInfo clusterOperationInfo) {
        this.clusterOperationInfo = clusterOperationInfo;
    }

    /**
     * 
     <p>
     * Cluster operation information
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterOperationInfo <p>
     *            Cluster operation information
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterOperationResult withClusterOperationInfo(
            ClusterOperationInfo clusterOperationInfo) {
        this.clusterOperationInfo = clusterOperationInfo;
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
        if (getClusterOperationInfo() != null)
            sb.append("ClusterOperationInfo: " + getClusterOperationInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterOperationInfo() == null) ? 0 : getClusterOperationInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterOperationResult == false)
            return false;
        DescribeClusterOperationResult other = (DescribeClusterOperationResult) obj;

        if (other.getClusterOperationInfo() == null ^ this.getClusterOperationInfo() == null)
            return false;
        if (other.getClusterOperationInfo() != null
                && other.getClusterOperationInfo().equals(this.getClusterOperationInfo()) == false)
            return false;
        return true;
    }
}
