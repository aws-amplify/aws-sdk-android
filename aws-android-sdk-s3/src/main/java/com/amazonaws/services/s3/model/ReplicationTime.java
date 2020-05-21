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
 * A container specifying S3 Replication Time Control (S3 RTC) related
 * information, including whether S3 RTC is enabled and the time when all
 * objects and operations on objects must be replicated. Must be specified
 * together with a <code>Metrics</code> block.
 * </p>
 */
public class ReplicationTime implements Serializable {
    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * A container specifying the time by which replication should be complete
     * for all objects and operations on objects.
     * </p>
     */
    private ReplicationTimeValue time;

    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Specifies whether the replication time is enabled.
     *         </p>
     * @see ReplicationTimeStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication time is enabled.
     *            </p>
     * @see ReplicationTimeStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication time is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationTimeStatus
     */
    public ReplicationTime withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication time is enabled.
     *            </p>
     * @see ReplicationTimeStatus
     */
    public void setStatus(ReplicationTimeStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the replication time is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationTimeStatus
     */
    public ReplicationTime withStatus(ReplicationTimeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A container specifying the time by which replication should be complete
     * for all objects and operations on objects.
     * </p>
     *
     * @return <p>
     *         A container specifying the time by which replication should be
     *         complete for all objects and operations on objects.
     *         </p>
     */
    public ReplicationTimeValue getTime() {
        return time;
    }

    /**
     * <p>
     * A container specifying the time by which replication should be complete
     * for all objects and operations on objects.
     * </p>
     *
     * @param time <p>
     *            A container specifying the time by which replication should be
     *            complete for all objects and operations on objects.
     *            </p>
     */
    public void setTime(ReplicationTimeValue time) {
        this.time = time;
    }

    /**
     * <p>
     * A container specifying the time by which replication should be complete
     * for all objects and operations on objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param time <p>
     *            A container specifying the time by which replication should be
     *            complete for all objects and operations on objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTime withTime(ReplicationTimeValue time) {
        this.time = time;
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
        if (getTime() != null)
            sb.append("Time: " + getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTime == false)
            return false;
        ReplicationTime other = (ReplicationTime) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }
}
