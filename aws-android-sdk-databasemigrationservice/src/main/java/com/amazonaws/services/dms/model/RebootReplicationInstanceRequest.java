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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Reboots a replication instance. Rebooting results in a momentary outage,
 * until the replication instance becomes available again.
 * </p>
 */
public class RebootReplicationInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a
     * Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then
     * you can't specify <code>true</code>.)
     * </p>
     */
    private Boolean forceFailover;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RebootReplicationInstanceRequest withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a
     * Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then
     * you can't specify <code>true</code>.)
     * </p>
     *
     * @return <p>
     *         If this parameter is <code>true</code>, the reboot is conducted
     *         through a Multi-AZ failover. (If the instance isn't configured
     *         for Multi-AZ, then you can't specify <code>true</code>.)
     *         </p>
     */
    public Boolean isForceFailover() {
        return forceFailover;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a
     * Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then
     * you can't specify <code>true</code>.)
     * </p>
     *
     * @return <p>
     *         If this parameter is <code>true</code>, the reboot is conducted
     *         through a Multi-AZ failover. (If the instance isn't configured
     *         for Multi-AZ, then you can't specify <code>true</code>.)
     *         </p>
     */
    public Boolean getForceFailover() {
        return forceFailover;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a
     * Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then
     * you can't specify <code>true</code>.)
     * </p>
     *
     * @param forceFailover <p>
     *            If this parameter is <code>true</code>, the reboot is
     *            conducted through a Multi-AZ failover. (If the instance isn't
     *            configured for Multi-AZ, then you can't specify
     *            <code>true</code>.)
     *            </p>
     */
    public void setForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a
     * Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then
     * you can't specify <code>true</code>.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceFailover <p>
     *            If this parameter is <code>true</code>, the reboot is
     *            conducted through a Multi-AZ failover. (If the instance isn't
     *            configured for Multi-AZ, then you can't specify
     *            <code>true</code>.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RebootReplicationInstanceRequest withForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getForceFailover() != null)
            sb.append("ForceFailover: " + getForceFailover());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getForceFailover() == null) ? 0 : getForceFailover().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootReplicationInstanceRequest == false)
            return false;
        RebootReplicationInstanceRequest other = (RebootReplicationInstanceRequest) obj;

        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getForceFailover() == null ^ this.getForceFailover() == null)
            return false;
        if (other.getForceFailover() != null
                && other.getForceFailover().equals(this.getForceFailover()) == false)
            return false;
        return true;
    }
}
