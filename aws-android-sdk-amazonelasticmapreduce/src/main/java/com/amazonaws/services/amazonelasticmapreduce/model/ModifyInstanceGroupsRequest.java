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
 * ModifyInstanceGroups modifies the number of nodes and configuration settings
 * of an instance group. The input parameters include the new target instance
 * count for the group and the instance group ID. The call will either succeed
 * or fail atomically.
 * </p>
 */
public class ModifyInstanceGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * Instance groups to change.
     * </p>
     */
    private java.util.List<InstanceGroupModifyConfig> instanceGroups;

    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     *
     * @return <p>
     *         The ID of the cluster to which the instance group belongs.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     *
     * @param clusterId <p>
     *            The ID of the cluster to which the instance group belongs.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the instance group belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterId <p>
     *            The ID of the cluster to which the instance group belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceGroupsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     *
     * @return <p>
     *         Instance groups to change.
     *         </p>
     */
    public java.util.List<InstanceGroupModifyConfig> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     *
     * @param instanceGroups <p>
     *            Instance groups to change.
     *            </p>
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupModifyConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new java.util.ArrayList<InstanceGroupModifyConfig>(instanceGroups);
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Instance groups to change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceGroupsRequest withInstanceGroups(
            InstanceGroupModifyConfig... instanceGroups) {
        if (getInstanceGroups() == null) {
            this.instanceGroups = new java.util.ArrayList<InstanceGroupModifyConfig>(
                    instanceGroups.length);
        }
        for (InstanceGroupModifyConfig value : instanceGroups) {
            this.instanceGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Instance groups to change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Instance groups to change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceGroupsRequest withInstanceGroups(
            java.util.Collection<InstanceGroupModifyConfig> instanceGroups) {
        setInstanceGroups(instanceGroups);
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
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: " + getInstanceGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceGroupsRequest == false)
            return false;
        ModifyInstanceGroupsRequest other = (ModifyInstanceGroupsRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null
                && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        return true;
    }
}
