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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Start the migration of data.
 * </p>
 */
public class StartMigrationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster
     * mode disabled), list should have only one element.
     * </p>
     */
    private java.util.List<CustomerNodeEndpoint> customerNodeEndpointList;

    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     *
     * @return <p>
     *         The ID of the replication group to which data should be migrated.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The ID of the replication group to which data should be
     *            migrated.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which data should be migrated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The ID of the replication group to which data should be
     *            migrated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMigrationRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster
     * mode disabled), list should have only one element.
     * </p>
     *
     * @return <p>
     *         List of endpoints from which data should be migrated. For Redis
     *         (cluster mode disabled), list should have only one element.
     *         </p>
     */
    public java.util.List<CustomerNodeEndpoint> getCustomerNodeEndpointList() {
        return customerNodeEndpointList;
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster
     * mode disabled), list should have only one element.
     * </p>
     *
     * @param customerNodeEndpointList <p>
     *            List of endpoints from which data should be migrated. For
     *            Redis (cluster mode disabled), list should have only one
     *            element.
     *            </p>
     */
    public void setCustomerNodeEndpointList(
            java.util.Collection<CustomerNodeEndpoint> customerNodeEndpointList) {
        if (customerNodeEndpointList == null) {
            this.customerNodeEndpointList = null;
            return;
        }

        this.customerNodeEndpointList = new java.util.ArrayList<CustomerNodeEndpoint>(
                customerNodeEndpointList);
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster
     * mode disabled), list should have only one element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerNodeEndpointList <p>
     *            List of endpoints from which data should be migrated. For
     *            Redis (cluster mode disabled), list should have only one
     *            element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMigrationRequest withCustomerNodeEndpointList(
            CustomerNodeEndpoint... customerNodeEndpointList) {
        if (getCustomerNodeEndpointList() == null) {
            this.customerNodeEndpointList = new java.util.ArrayList<CustomerNodeEndpoint>(
                    customerNodeEndpointList.length);
        }
        for (CustomerNodeEndpoint value : customerNodeEndpointList) {
            this.customerNodeEndpointList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of endpoints from which data should be migrated. For Redis (cluster
     * mode disabled), list should have only one element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerNodeEndpointList <p>
     *            List of endpoints from which data should be migrated. For
     *            Redis (cluster mode disabled), list should have only one
     *            element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMigrationRequest withCustomerNodeEndpointList(
            java.util.Collection<CustomerNodeEndpoint> customerNodeEndpointList) {
        setCustomerNodeEndpointList(customerNodeEndpointList);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getCustomerNodeEndpointList() != null)
            sb.append("CustomerNodeEndpointList: " + getCustomerNodeEndpointList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerNodeEndpointList() == null) ? 0 : getCustomerNodeEndpointList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMigrationRequest == false)
            return false;
        StartMigrationRequest other = (StartMigrationRequest) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCustomerNodeEndpointList() == null
                ^ this.getCustomerNodeEndpointList() == null)
            return false;
        if (other.getCustomerNodeEndpointList() != null
                && other.getCustomerNodeEndpointList().equals(this.getCustomerNodeEndpointList()) == false)
            return false;
        return true;
    }
}
