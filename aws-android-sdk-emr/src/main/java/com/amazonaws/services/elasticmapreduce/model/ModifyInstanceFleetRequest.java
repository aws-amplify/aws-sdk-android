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
 * Modifies the target On-Demand and target Spot capacities for the instance
 * fleet with the specified InstanceFleetID within the cluster specified using
 * ClusterID. The call either succeeds or fails atomically.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 */
public class ModifyInstanceFleetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     */
    private InstanceFleetModifyConfig instanceFleet;

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
    public ModifyInstanceFleetRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the instance fleet.
     *         </p>
     */
    public InstanceFleetModifyConfig getInstanceFleet() {
        return instanceFleet;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     *
     * @param instanceFleet <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     */
    public void setInstanceFleet(InstanceFleetModifyConfig instanceFleet) {
        this.instanceFleet = instanceFleet;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleet <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceFleetRequest withInstanceFleet(InstanceFleetModifyConfig instanceFleet) {
        this.instanceFleet = instanceFleet;
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
        if (getInstanceFleet() != null)
            sb.append("InstanceFleet: " + getInstanceFleet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFleet() == null) ? 0 : getInstanceFleet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceFleetRequest == false)
            return false;
        ModifyInstanceFleetRequest other = (ModifyInstanceFleetRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceFleet() == null ^ this.getInstanceFleet() == null)
            return false;
        if (other.getInstanceFleet() != null
                && other.getInstanceFleet().equals(this.getInstanceFleet()) == false)
            return false;
        return true;
    }
}
