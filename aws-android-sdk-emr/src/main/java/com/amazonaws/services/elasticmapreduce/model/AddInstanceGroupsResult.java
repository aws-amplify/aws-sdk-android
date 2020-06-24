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

/**
 * <p>
 * Output from an AddInstanceGroups call.
 * </p>
 */
public class AddInstanceGroupsResult implements Serializable {
    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String jobFlowId;

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     */
    private java.util.List<String> instanceGroupIds;

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String clusterArn;

    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The job flow ID in which the instance groups are added.
     *         </p>
     */
    public String getJobFlowId() {
        return jobFlowId;
    }

    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowId <p>
     *            The job flow ID in which the instance groups are added.
     *            </p>
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowId <p>
     *            The job flow ID in which the instance groups are added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceGroupsResult withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     *
     * @return <p>
     *         Instance group IDs of the newly created instance groups.
     *         </p>
     */
    public java.util.List<String> getInstanceGroupIds() {
        return instanceGroupIds;
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     *
     * @param instanceGroupIds <p>
     *            Instance group IDs of the newly created instance groups.
     *            </p>
     */
    public void setInstanceGroupIds(java.util.Collection<String> instanceGroupIds) {
        if (instanceGroupIds == null) {
            this.instanceGroupIds = null;
            return;
        }

        this.instanceGroupIds = new java.util.ArrayList<String>(instanceGroupIds);
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroupIds <p>
     *            Instance group IDs of the newly created instance groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceGroupsResult withInstanceGroupIds(String... instanceGroupIds) {
        if (getInstanceGroupIds() == null) {
            this.instanceGroupIds = new java.util.ArrayList<String>(instanceGroupIds.length);
        }
        for (String value : instanceGroupIds) {
            this.instanceGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroupIds <p>
     *            Instance group IDs of the newly created instance groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceGroupsResult withInstanceGroupIds(
            java.util.Collection<String> instanceGroupIds) {
        setInstanceGroupIds(instanceGroupIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name of the cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name of the cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceGroupsResult withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: " + getJobFlowId() + ",");
        if (getInstanceGroupIds() != null)
            sb.append("InstanceGroupIds: " + getInstanceGroupIds() + ",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceGroupIds() == null) ? 0 : getInstanceGroupIds().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddInstanceGroupsResult == false)
            return false;
        AddInstanceGroupsResult other = (AddInstanceGroupsResult) obj;

        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null
                && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        if (other.getInstanceGroupIds() == null ^ this.getInstanceGroupIds() == null)
            return false;
        if (other.getInstanceGroupIds() != null
                && other.getInstanceGroupIds().equals(this.getInstanceGroupIds()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        return true;
    }
}
