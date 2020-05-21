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
 * Optional configuration to replicate existing source bucket objects. For more
 * information, see <a href=
 * " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-what-is-isnot-replicated.html#existing-object-replication"
 * >Replicating Existing Objects</a> in the <i>Amazon S3 Developer Guide</i>.
 * </p>
 */
public class ExistingObjectReplication implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p/>
     * @see ExistingObjectReplicationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p/>
     * @see ExistingObjectReplicationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExistingObjectReplicationStatus
     */
    public ExistingObjectReplication withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p/>
     * @see ExistingObjectReplicationStatus
     */
    public void setStatus(ExistingObjectReplicationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExistingObjectReplicationStatus
     */
    public ExistingObjectReplication withStatus(ExistingObjectReplicationStatus status) {
        this.status = status.toString();
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
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExistingObjectReplication == false)
            return false;
        ExistingObjectReplication other = (ExistingObjectReplication) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
