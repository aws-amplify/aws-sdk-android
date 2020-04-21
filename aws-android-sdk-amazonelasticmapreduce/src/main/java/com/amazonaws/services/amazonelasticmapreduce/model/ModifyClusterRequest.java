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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the number of steps that can be executed concurrently for the
 * cluster specified using ClusterID.
 * </p>
 */
public class ModifyClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a
     * maximum of 256 steps.
     * </p>
     */
    private Integer stepConcurrencyLevel;

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     *
     * @param clusterId <p>
     *            The unique identifier of the cluster.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterId <p>
     *            The unique identifier of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a
     * maximum of 256 steps.
     * </p>
     *
     * @return <p>
     *         The number of steps that can be executed concurrently. You can
     *         specify a maximum of 256 steps.
     *         </p>
     */
    public Integer getStepConcurrencyLevel() {
        return stepConcurrencyLevel;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a
     * maximum of 256 steps.
     * </p>
     *
     * @param stepConcurrencyLevel <p>
     *            The number of steps that can be executed concurrently. You can
     *            specify a maximum of 256 steps.
     *            </p>
     */
    public void setStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a
     * maximum of 256 steps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepConcurrencyLevel <p>
     *            The number of steps that can be executed concurrently. You can
     *            specify a maximum of 256 steps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterRequest withStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
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
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getStepConcurrencyLevel() != null)
            sb.append("StepConcurrencyLevel: " + getStepConcurrencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getStepConcurrencyLevel() == null) ? 0 : getStepConcurrencyLevel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterRequest == false)
            return false;
        ModifyClusterRequest other = (ModifyClusterRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getStepConcurrencyLevel() == null ^ this.getStepConcurrencyLevel() == null)
            return false;
        if (other.getStepConcurrencyLevel() != null
                && other.getStepConcurrencyLevel().equals(this.getStepConcurrencyLevel()) == false)
            return false;
        return true;
    }
}
