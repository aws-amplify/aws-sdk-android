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
 * Specifies whether Amazon S3 replicates the delete markers. If you specify a
 * <code>Filter</code>, you must specify this element. However, in the latest
 * version of replication configuration (when <code>Filter</code> is specified),
 * Amazon S3 doesn't replicate delete markers. Therefore, the
 * <code>DeleteMarkerReplication</code> element can contain only
 * &lt;Status&gt;Disabled&lt;/Status&gt;. For an example configuration, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
 * >Basic Rule Configuration</a>.
 * </p>
 * <note>
 * <p>
 * If you don't specify the <code>Filter</code> element, Amazon S3 assumes that
 * the replication configuration is the earlier version, V1. In the earlier
 * version, Amazon S3 handled replication of delete markers differently. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
 * >Backward Compatibility</a>.
 * </p>
 * </note>
 */
public class DeleteMarkerReplication implements Serializable {
    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Amazon S3 doesn't replicate the delete
     * markers. The status must be <code>Disabled</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Amazon S3 doesn't replicate the delete
     * markers. The status must be <code>Disabled</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Indicates whether to replicate delete markers.
     *         </p>
     *         <note>
     *         <p>
     *         In the current implementation, Amazon S3 doesn't replicate the
     *         delete markers. The status must be <code>Disabled</code>.
     *         </p>
     *         </note>
     * @see DeleteMarkerReplicationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Amazon S3 doesn't replicate the delete
     * markers. The status must be <code>Disabled</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Indicates whether to replicate delete markers.
     *            </p>
     *            <note>
     *            <p>
     *            In the current implementation, Amazon S3 doesn't replicate the
     *            delete markers. The status must be <code>Disabled</code>.
     *            </p>
     *            </note>
     * @see DeleteMarkerReplicationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Amazon S3 doesn't replicate the delete
     * markers. The status must be <code>Disabled</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Indicates whether to replicate delete markers.
     *            </p>
     *            <note>
     *            <p>
     *            In the current implementation, Amazon S3 doesn't replicate the
     *            delete markers. The status must be <code>Disabled</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeleteMarkerReplicationStatus
     */
    public DeleteMarkerReplication withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Amazon S3 doesn't replicate the delete
     * markers. The status must be <code>Disabled</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Indicates whether to replicate delete markers.
     *            </p>
     *            <note>
     *            <p>
     *            In the current implementation, Amazon S3 doesn't replicate the
     *            delete markers. The status must be <code>Disabled</code>.
     *            </p>
     *            </note>
     * @see DeleteMarkerReplicationStatus
     */
    public void setStatus(DeleteMarkerReplicationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * In the current implementation, Amazon S3 doesn't replicate the delete
     * markers. The status must be <code>Disabled</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Indicates whether to replicate delete markers.
     *            </p>
     *            <note>
     *            <p>
     *            In the current implementation, Amazon S3 doesn't replicate the
     *            delete markers. The status must be <code>Disabled</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeleteMarkerReplicationStatus
     */
    public DeleteMarkerReplication withStatus(DeleteMarkerReplicationStatus status) {
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

        if (obj instanceof DeleteMarkerReplication == false)
            return false;
        DeleteMarkerReplication other = (DeleteMarkerReplication) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
