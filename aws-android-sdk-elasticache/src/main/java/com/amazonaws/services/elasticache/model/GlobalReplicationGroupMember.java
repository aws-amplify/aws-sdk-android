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
 * A member of a Global Datastore. It contains the Replication Group Id, the AWS
 * region and the role of the replication group.
 * </p>
 */
public class GlobalReplicationGroupMember implements Serializable {
    /**
     * <p>
     * The replication group id of the Global Datastore member.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The AWS region of the Global Datastore member.
     * </p>
     */
    private String replicationGroupRegion;

    /**
     * <p>
     * Indicates the role of the replication group, primary or secondary.
     * </p>
     */
    private String role;

    /**
     * <p>
     * Indicates whether automatic failover is enabled for the replication
     * group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     */
    private String automaticFailover;

    /**
     * <p>
     * The status of the membership of the replication group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The replication group id of the Global Datastore member.
     * </p>
     *
     * @return <p>
     *         The replication group id of the Global Datastore member.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The replication group id of the Global Datastore member.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The replication group id of the Global Datastore member.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The replication group id of the Global Datastore member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The replication group id of the Global Datastore member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroupMember withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The AWS region of the Global Datastore member.
     * </p>
     *
     * @return <p>
     *         The AWS region of the Global Datastore member.
     *         </p>
     */
    public String getReplicationGroupRegion() {
        return replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region of the Global Datastore member.
     * </p>
     *
     * @param replicationGroupRegion <p>
     *            The AWS region of the Global Datastore member.
     *            </p>
     */
    public void setReplicationGroupRegion(String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
    }

    /**
     * <p>
     * The AWS region of the Global Datastore member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupRegion <p>
     *            The AWS region of the Global Datastore member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroupMember withReplicationGroupRegion(String replicationGroupRegion) {
        this.replicationGroupRegion = replicationGroupRegion;
        return this;
    }

    /**
     * <p>
     * Indicates the role of the replication group, primary or secondary.
     * </p>
     *
     * @return <p>
     *         Indicates the role of the replication group, primary or
     *         secondary.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * Indicates the role of the replication group, primary or secondary.
     * </p>
     *
     * @param role <p>
     *            Indicates the role of the replication group, primary or
     *            secondary.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Indicates the role of the replication group, primary or secondary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            Indicates the role of the replication group, primary or
     *            secondary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroupMember withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic failover is enabled for the replication
     * group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @return <p>
     *         Indicates whether automatic failover is enabled for the
     *         replication group.
     *         </p>
     * @see AutomaticFailoverStatus
     */
    public String getAutomaticFailover() {
        return automaticFailover;
    }

    /**
     * <p>
     * Indicates whether automatic failover is enabled for the replication
     * group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates whether automatic failover is enabled for the
     *            replication group.
     *            </p>
     * @see AutomaticFailoverStatus
     */
    public void setAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
    }

    /**
     * <p>
     * Indicates whether automatic failover is enabled for the replication
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates whether automatic failover is enabled for the
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomaticFailoverStatus
     */
    public GlobalReplicationGroupMember withAutomaticFailover(String automaticFailover) {
        this.automaticFailover = automaticFailover;
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic failover is enabled for the replication
     * group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates whether automatic failover is enabled for the
     *            replication group.
     *            </p>
     * @see AutomaticFailoverStatus
     */
    public void setAutomaticFailover(AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
    }

    /**
     * <p>
     * Indicates whether automatic failover is enabled for the replication
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling
     *
     * @param automaticFailover <p>
     *            Indicates whether automatic failover is enabled for the
     *            replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomaticFailoverStatus
     */
    public GlobalReplicationGroupMember withAutomaticFailover(
            AutomaticFailoverStatus automaticFailover) {
        this.automaticFailover = automaticFailover.toString();
        return this;
    }

    /**
     * <p>
     * The status of the membership of the replication group.
     * </p>
     *
     * @return <p>
     *         The status of the membership of the replication group.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the membership of the replication group.
     * </p>
     *
     * @param status <p>
     *            The status of the membership of the replication group.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the membership of the replication group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the membership of the replication group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroupMember withStatus(String status) {
        this.status = status;
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
        if (getReplicationGroupRegion() != null)
            sb.append("ReplicationGroupRegion: " + getReplicationGroupRegion() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getAutomaticFailover() != null)
            sb.append("AutomaticFailover: " + getAutomaticFailover() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
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
                + ((getReplicationGroupRegion() == null) ? 0 : getReplicationGroupRegion()
                        .hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getAutomaticFailover() == null) ? 0 : getAutomaticFailover().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalReplicationGroupMember == false)
            return false;
        GlobalReplicationGroupMember other = (GlobalReplicationGroupMember) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getReplicationGroupRegion() == null ^ this.getReplicationGroupRegion() == null)
            return false;
        if (other.getReplicationGroupRegion() != null
                && other.getReplicationGroupRegion().equals(this.getReplicationGroupRegion()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getAutomaticFailover() == null ^ this.getAutomaticFailover() == null)
            return false;
        if (other.getAutomaticFailover() != null
                && other.getAutomaticFailover().equals(this.getAutomaticFailover()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
