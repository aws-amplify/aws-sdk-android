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

public class UpdateBrokerCountResult implements Serializable {
    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p>
     */
    private String clusterOperationArn;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBrokerCountResult withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster operation.
     *         </p>
     */
    public String getClusterOperationArn() {
        return clusterOperationArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p>
     * 
     * @param clusterOperationArn <p>
     *            The Amazon Resource Name (ARN) of the cluster operation.
     *            </p>
     */
    public void setClusterOperationArn(String clusterOperationArn) {
        this.clusterOperationArn = clusterOperationArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterOperationArn <p>
     *            The Amazon Resource Name (ARN) of the cluster operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBrokerCountResult withClusterOperationArn(String clusterOperationArn) {
        this.clusterOperationArn = clusterOperationArn;
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getClusterOperationArn() != null)
            sb.append("ClusterOperationArn: " + getClusterOperationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getClusterOperationArn() == null) ? 0 : getClusterOperationArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBrokerCountResult == false)
            return false;
        UpdateBrokerCountResult other = (UpdateBrokerCountResult) obj;

        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterOperationArn() == null ^ this.getClusterOperationArn() == null)
            return false;
        if (other.getClusterOperationArn() != null
                && other.getClusterOperationArn().equals(this.getClusterOperationArn()) == false)
            return false;
        return true;
    }
}
