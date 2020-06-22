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
 * Removes an automatic scaling policy from a specified instance group within an
 * EMR cluster.
 * </p>
 */
public class RemoveAutoScalingPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic
     * scaling policy is applied is within this cluster.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is
     * applied.
     * </p>
     */
    private String instanceGroupId;

    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic
     * scaling policy is applied is within this cluster.
     * </p>
     *
     * @return <p>
     *         Specifies the ID of a cluster. The instance group to which the
     *         automatic scaling policy is applied is within this cluster.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic
     * scaling policy is applied is within this cluster.
     * </p>
     *
     * @param clusterId <p>
     *            Specifies the ID of a cluster. The instance group to which the
     *            automatic scaling policy is applied is within this cluster.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic
     * scaling policy is applied is within this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterId <p>
     *            Specifies the ID of a cluster. The instance group to which the
     *            automatic scaling policy is applied is within this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAutoScalingPolicyRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is
     * applied.
     * </p>
     *
     * @return <p>
     *         Specifies the ID of the instance group to which the scaling
     *         policy is applied.
     *         </p>
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }

    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is
     * applied.
     * </p>
     *
     * @param instanceGroupId <p>
     *            Specifies the ID of the instance group to which the scaling
     *            policy is applied.
     *            </p>
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroupId <p>
     *            Specifies the ID of the instance group to which the scaling
     *            policy is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAutoScalingPolicyRequest withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
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
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: " + getInstanceGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAutoScalingPolicyRequest == false)
            return false;
        RemoveAutoScalingPolicyRequest other = (RemoveAutoScalingPolicyRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null
                && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        return true;
    }
}
