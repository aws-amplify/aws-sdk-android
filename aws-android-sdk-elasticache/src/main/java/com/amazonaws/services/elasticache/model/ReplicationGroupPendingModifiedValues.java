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

/**
 * <p>
 * The settings to be applied to the Redis replication group, either immediately
 * or during the next maintenance window.
 * </p>
 */
public class ReplicationGroupPendingModifiedValues implements Serializable {
    /**
     * <p>
     * The primary cluster ID that is applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     * </p>
     */
    private String primaryClusterId;

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     */
    private String automaticFailoverStatus;

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     */
    private ReshardingStatus resharding;

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     */
    private String authTokenStatus;

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     * </p>
     *
     * @return <p>
     *         The primary cluster ID that is applied immediately (if
     *         <code>--apply-immediately</code> was specified), or during the
     *         next maintenance window.
     *         </p>
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     * </p>
     *
     * @param primaryClusterId <p>
     *            The primary cluster ID that is applied immediately (if
     *            <code>--apply-immediately</code> was specified), or during the
     *            next maintenance window.
     *            </p>
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    /**
     * <p>
     * The primary cluster ID that is applied immediately (if
     * <code>--apply-immediately</code> was specified), or during the next
     * maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryClusterId <p>
     *            The primary cluster ID that is applied immediately (if
     *            <code>--apply-immediately</code> was specified), or during the
     *            next maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroupPendingModifiedValues withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @return <p>
     *         Indicates the status of Multi-AZ with automatic failover for this
     *         Redis replication group.
     *         </p>
     *         <p>
     *         Amazon ElastiCache for Redis does not support Multi-AZ with
     *         automatic failover on:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis versions earlier than 2.8.6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled): T1 node types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): T1 node types.
     *         </p>
     *         </li>
     *         </ul>
     * @see PendingAutomaticFailoverStatus
     */
    public String getAutomaticFailoverStatus() {
        return automaticFailoverStatus;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            this Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @see PendingAutomaticFailoverStatus
     */
    public void setAutomaticFailoverStatus(String automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            this Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PendingAutomaticFailoverStatus
     */
    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(
            String automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus;
        return this;
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            this Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @see PendingAutomaticFailoverStatus
     */
    public void setAutomaticFailoverStatus(PendingAutomaticFailoverStatus automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus.toString();
    }

    /**
     * <p>
     * Indicates the status of Multi-AZ with automatic failover for this Redis
     * replication group.
     * </p>
     * <p>
     * Amazon ElastiCache for Redis does not support Multi-AZ with automatic
     * failover on:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis versions earlier than 2.8.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): T1 node types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): T1 node types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled
     *
     * @param automaticFailoverStatus <p>
     *            Indicates the status of Multi-AZ with automatic failover for
     *            this Redis replication group.
     *            </p>
     *            <p>
     *            Amazon ElastiCache for Redis does not support Multi-AZ with
     *            automatic failover on:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis versions earlier than 2.8.6.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled): T1 node types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): T1 node types.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PendingAutomaticFailoverStatus
     */
    public ReplicationGroupPendingModifiedValues withAutomaticFailoverStatus(
            PendingAutomaticFailoverStatus automaticFailoverStatus) {
        this.automaticFailoverStatus = automaticFailoverStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     *
     * @return <p>
     *         The status of an online resharding operation.
     *         </p>
     */
    public ReshardingStatus getResharding() {
        return resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     *
     * @param resharding <p>
     *            The status of an online resharding operation.
     *            </p>
     */
    public void setResharding(ReshardingStatus resharding) {
        this.resharding = resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resharding <p>
     *            The status of an online resharding operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroupPendingModifiedValues withResharding(ReshardingStatus resharding) {
        this.resharding = resharding;
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @return <p>
     *         The auth token status
     *         </p>
     * @see AuthTokenUpdateStatus
     */
    public String getAuthTokenStatus() {
        return authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @see AuthTokenUpdateStatus
     */
    public void setAuthTokenStatus(String authTokenStatus) {
        this.authTokenStatus = authTokenStatus;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTokenUpdateStatus
     */
    public ReplicationGroupPendingModifiedValues withAuthTokenStatus(String authTokenStatus) {
        this.authTokenStatus = authTokenStatus;
        return this;
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @see AuthTokenUpdateStatus
     */
    public void setAuthTokenStatus(AuthTokenUpdateStatus authTokenStatus) {
        this.authTokenStatus = authTokenStatus.toString();
    }

    /**
     * <p>
     * The auth token status
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SETTING, ROTATING
     *
     * @param authTokenStatus <p>
     *            The auth token status
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthTokenUpdateStatus
     */
    public ReplicationGroupPendingModifiedValues withAuthTokenStatus(
            AuthTokenUpdateStatus authTokenStatus) {
        this.authTokenStatus = authTokenStatus.toString();
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
        if (getPrimaryClusterId() != null)
            sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getAutomaticFailoverStatus() != null)
            sb.append("AutomaticFailoverStatus: " + getAutomaticFailoverStatus() + ",");
        if (getResharding() != null)
            sb.append("Resharding: " + getResharding() + ",");
        if (getAuthTokenStatus() != null)
            sb.append("AuthTokenStatus: " + getAuthTokenStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticFailoverStatus() == null) ? 0 : getAutomaticFailoverStatus()
                        .hashCode());
        hashCode = prime * hashCode + ((getResharding() == null) ? 0 : getResharding().hashCode());
        hashCode = prime * hashCode
                + ((getAuthTokenStatus() == null) ? 0 : getAuthTokenStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationGroupPendingModifiedValues == false)
            return false;
        ReplicationGroupPendingModifiedValues other = (ReplicationGroupPendingModifiedValues) obj;

        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null)
            return false;
        if (other.getPrimaryClusterId() != null
                && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false)
            return false;
        if (other.getAutomaticFailoverStatus() == null ^ this.getAutomaticFailoverStatus() == null)
            return false;
        if (other.getAutomaticFailoverStatus() != null
                && other.getAutomaticFailoverStatus().equals(this.getAutomaticFailoverStatus()) == false)
            return false;
        if (other.getResharding() == null ^ this.getResharding() == null)
            return false;
        if (other.getResharding() != null
                && other.getResharding().equals(this.getResharding()) == false)
            return false;
        if (other.getAuthTokenStatus() == null ^ this.getAuthTokenStatus() == null)
            return false;
        if (other.getAuthTokenStatus() != null
                && other.getAuthTokenStatus().equals(this.getAuthTokenStatus()) == false)
            return false;
        return true;
    }
}
