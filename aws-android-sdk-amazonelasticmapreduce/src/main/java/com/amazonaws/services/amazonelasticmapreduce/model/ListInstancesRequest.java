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
 * Provides information for all active EC2 instances and EC2 instances
 * terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in
 * any of the following states are considered active: AWAITING_FULFILLMENT,
 * PROVISIONING, BOOTSTRAPPING, RUNNING.
 * </p>
 */
public class ListInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     */
    private String instanceGroupId;

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     */
    private java.util.List<String> instanceGroupTypes;

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     */
    private String instanceFleetId;

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceFleetType;

    /**
     * <p>
     * A list of instance states that will filter the instances returned with
     * this request.
     * </p>
     */
    private java.util.List<String> instanceStates;

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster for which to list the instances.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     *
     * @param clusterId <p>
     *            The identifier of the cluster for which to list the instances.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterId <p>
     *            The identifier of the cluster for which to list the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     *
     * @return <p>
     *         The identifier of the instance group for which to list the
     *         instances.
     *         </p>
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     *
     * @param instanceGroupId <p>
     *            The identifier of the instance group for which to list the
     *            instances.
     *            </p>
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroupId <p>
     *            The identifier of the instance group for which to list the
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     *
     * @return <p>
     *         The type of instance group for which to list the instances.
     *         </p>
     */
    public java.util.List<String> getInstanceGroupTypes() {
        return instanceGroupTypes;
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     *
     * @param instanceGroupTypes <p>
     *            The type of instance group for which to list the instances.
     *            </p>
     */
    public void setInstanceGroupTypes(java.util.Collection<String> instanceGroupTypes) {
        if (instanceGroupTypes == null) {
            this.instanceGroupTypes = null;
            return;
        }

        this.instanceGroupTypes = new java.util.ArrayList<String>(instanceGroupTypes);
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroupTypes <p>
     *            The type of instance group for which to list the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withInstanceGroupTypes(String... instanceGroupTypes) {
        if (getInstanceGroupTypes() == null) {
            this.instanceGroupTypes = new java.util.ArrayList<String>(instanceGroupTypes.length);
        }
        for (String value : instanceGroupTypes) {
            this.instanceGroupTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroupTypes <p>
     *            The type of instance group for which to list the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withInstanceGroupTypes(
            java.util.Collection<String> instanceGroupTypes) {
        setInstanceGroupTypes(instanceGroupTypes);
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
    public String getInstanceFleetId() {
        return instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     *
     * @param instanceFleetId <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     */
    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleetId <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
        return this;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return <p>
     *         The node type of the instance fleet. For example MASTER, CORE, or
     *         TASK.
     *         </p>
     * @see InstanceFleetType
     */
    public String getInstanceFleetType() {
        return instanceFleetType;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type of the instance fleet. For example MASTER, CORE,
     *            or TASK.
     *            </p>
     * @see InstanceFleetType
     */
    public void setInstanceFleetType(String instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type of the instance fleet. For example MASTER, CORE,
     *            or TASK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetType
     */
    public ListInstancesRequest withInstanceFleetType(String instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
        return this;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type of the instance fleet. For example MASTER, CORE,
     *            or TASK.
     *            </p>
     * @see InstanceFleetType
     */
    public void setInstanceFleetType(InstanceFleetType instanceFleetType) {
        this.instanceFleetType = instanceFleetType.toString();
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type of the instance fleet. For example MASTER, CORE,
     *            or TASK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetType
     */
    public ListInstancesRequest withInstanceFleetType(InstanceFleetType instanceFleetType) {
        this.instanceFleetType = instanceFleetType.toString();
        return this;
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with
     * this request.
     * </p>
     *
     * @return <p>
     *         A list of instance states that will filter the instances returned
     *         with this request.
     *         </p>
     */
    public java.util.List<String> getInstanceStates() {
        return instanceStates;
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with
     * this request.
     * </p>
     *
     * @param instanceStates <p>
     *            A list of instance states that will filter the instances
     *            returned with this request.
     *            </p>
     */
    public void setInstanceStates(java.util.Collection<String> instanceStates) {
        if (instanceStates == null) {
            this.instanceStates = null;
            return;
        }

        this.instanceStates = new java.util.ArrayList<String>(instanceStates);
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with
     * this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStates <p>
     *            A list of instance states that will filter the instances
     *            returned with this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withInstanceStates(String... instanceStates) {
        if (getInstanceStates() == null) {
            this.instanceStates = new java.util.ArrayList<String>(instanceStates.length);
        }
        for (String value : instanceStates) {
            this.instanceStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with
     * this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStates <p>
     *            A list of instance states that will filter the instances
     *            returned with this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withInstanceStates(java.util.Collection<String> instanceStates) {
        setInstanceStates(instanceStates);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @return <p>
     *         The pagination token that indicates the next set of results to
     *         retrieve.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withMarker(String marker) {
        this.marker = marker;
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
            sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getInstanceGroupTypes() != null)
            sb.append("InstanceGroupTypes: " + getInstanceGroupTypes() + ",");
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: " + getInstanceFleetId() + ",");
        if (getInstanceFleetType() != null)
            sb.append("InstanceFleetType: " + getInstanceFleetType() + ",");
        if (getInstanceStates() != null)
            sb.append("InstanceStates: " + getInstanceStates() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
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
        hashCode = prime * hashCode
                + ((getInstanceGroupTypes() == null) ? 0 : getInstanceGroupTypes().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFleetType() == null) ? 0 : getInstanceFleetType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceStates() == null) ? 0 : getInstanceStates().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInstancesRequest == false)
            return false;
        ListInstancesRequest other = (ListInstancesRequest) obj;

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
        if (other.getInstanceGroupTypes() == null ^ this.getInstanceGroupTypes() == null)
            return false;
        if (other.getInstanceGroupTypes() != null
                && other.getInstanceGroupTypes().equals(this.getInstanceGroupTypes()) == false)
            return false;
        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null
                && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        if (other.getInstanceFleetType() == null ^ this.getInstanceFleetType() == null)
            return false;
        if (other.getInstanceFleetType() != null
                && other.getInstanceFleetType().equals(this.getInstanceFleetType()) == false)
            return false;
        if (other.getInstanceStates() == null ^ this.getInstanceStates() == null)
            return false;
        if (other.getInstanceStates() != null
                && other.getInstanceStates().equals(this.getInstanceStates()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
