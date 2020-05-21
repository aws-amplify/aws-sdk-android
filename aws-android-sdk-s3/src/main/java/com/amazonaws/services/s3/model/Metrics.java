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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A container specifying replication metrics-related settings enabling metrics
 * and Amazon S3 events for S3 Replication Time Control (S3 RTC). Must be
 * specified together with a <code>ReplicationTime</code> block.
 * </p>
 */
public class Metrics implements Serializable {
    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * A container specifying the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     */
    private ReplicationTimeValue eventThreshold;

    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Specifies whether the replication metrics are enabled.
     *         </p>
     * @see MetricsStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication metrics are enabled.
     *            </p>
     * @see MetricsStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication metrics are enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricsStatus
     */
    public Metrics withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication metrics are enabled.
     *            </p>
     * @see MetricsStatus
     */
    public void setStatus(MetricsStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication metrics are enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricsStatus
     */
    public Metrics withStatus(MetricsStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A container specifying the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     *
     * @return <p>
     *         A container specifying the time threshold for emitting the
     *         <code>s3:Replication:OperationMissedThreshold</code> event.
     *         </p>
     */
    public ReplicationTimeValue getEventThreshold() {
        return eventThreshold;
    }

    /**
     * <p>
     * A container specifying the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     *
     * @param eventThreshold <p>
     *            A container specifying the time threshold for emitting the
     *            <code>s3:Replication:OperationMissedThreshold</code> event.
     *            </p>
     */
    public void setEventThreshold(ReplicationTimeValue eventThreshold) {
        this.eventThreshold = eventThreshold;
    }

    /**
     * <p>
     * A container specifying the time threshold for emitting the
     * <code>s3:Replication:OperationMissedThreshold</code> event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventThreshold <p>
     *            A container specifying the time threshold for emitting the
     *            <code>s3:Replication:OperationMissedThreshold</code> event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Metrics withEventThreshold(ReplicationTimeValue eventThreshold) {
        this.eventThreshold = eventThreshold;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEventThreshold() != null)
            sb.append("EventThreshold: " + getEventThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEventThreshold() == null) ? 0 : getEventThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Metrics == false)
            return false;
        Metrics other = (Metrics) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEventThreshold() == null ^ this.getEventThreshold() == null)
            return false;
        if (other.getEventThreshold() != null
                && other.getEventThreshold().equals(this.getEventThreshold()) == false)
            return false;
        return true;
    }
}
