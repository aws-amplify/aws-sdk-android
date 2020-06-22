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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a managed scaling policy for an Amazon EMR cluster. The
 * managed scaling policy defines the limits for resources, such as EC2
 * instances that can be added or terminated from a cluster. The policy only
 * applies to the core and task nodes. The master node cannot be scaled after
 * initial configuration.
 * </p>
 */
public class PutManagedScalingPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is
     * attached.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     */
    private ManagedScalingPolicy managedScalingPolicy;

    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is
     * attached.
     * </p>
     *
     * @return <p>
     *         Specifies the ID of an EMR cluster where the managed scaling
     *         policy is attached.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is
     * attached.
     * </p>
     *
     * @param clusterId <p>
     *            Specifies the ID of an EMR cluster where the managed scaling
     *            policy is attached.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is
     * attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterId <p>
     *            Specifies the ID of an EMR cluster where the managed scaling
     *            policy is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutManagedScalingPolicyRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     *
     * @return <p>
     *         Specifies the constraints for the managed scaling policy.
     *         </p>
     */
    public ManagedScalingPolicy getManagedScalingPolicy() {
        return managedScalingPolicy;
    }

    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     *
     * @param managedScalingPolicy <p>
     *            Specifies the constraints for the managed scaling policy.
     *            </p>
     */
    public void setManagedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
        this.managedScalingPolicy = managedScalingPolicy;
    }

    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedScalingPolicy <p>
     *            Specifies the constraints for the managed scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutManagedScalingPolicyRequest withManagedScalingPolicy(
            ManagedScalingPolicy managedScalingPolicy) {
        this.managedScalingPolicy = managedScalingPolicy;
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
        if (getManagedScalingPolicy() != null)
            sb.append("ManagedScalingPolicy: " + getManagedScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getManagedScalingPolicy() == null) ? 0 : getManagedScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutManagedScalingPolicyRequest == false)
            return false;
        PutManagedScalingPolicyRequest other = (PutManagedScalingPolicyRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getManagedScalingPolicy() == null ^ this.getManagedScalingPolicy() == null)
            return false;
        if (other.getManagedScalingPolicy() != null
                && other.getManagedScalingPolicy().equals(this.getManagedScalingPolicy()) == false)
            return false;
        return true;
    }
}
