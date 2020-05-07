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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon
 * Elastic Compute Cloud (Amazon EC2). This operation results in an export
 * snapshot record that can be used with the
 * <code>create cloud formation stack</code> operation to create new Amazon EC2
 * instances.
 * </p>
 * <p>
 * Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images
 * (AMIs), and the instance system disk appears as an Amazon Elastic Block Store
 * (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as Amazon
 * EBS volumes. Snapshots are exported to the same Amazon Web Services Region in
 * Amazon EC2 as the source Lightsail snapshot.
 * </p>
 * <p/>
 * <p>
 * The <code>export snapshot</code> operation supports tag-based access control
 * via resource tags applied to the resource identified by
 * <code>source snapshot name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 * <note>
 * <p>
 * Use the <code>get instance snapshots</code> or
 * <code>get disk snapshots</code> operations to get a list of snapshots that
 * you can export to Amazon EC2.
 * </p>
 * </note>
 */
public class ExportSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String sourceSnapshotName;

    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the instance or disk snapshot to be exported to
     *         Amazon EC2.
     *         </p>
     */
    public String getSourceSnapshotName() {
        return sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sourceSnapshotName <p>
     *            The name of the instance or disk snapshot to be exported to
     *            Amazon EC2.
     *            </p>
     */
    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param sourceSnapshotName <p>
     *            The name of the instance or disk snapshot to be exported to
     *            Amazon EC2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
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
        if (getSourceSnapshotName() != null)
            sb.append("sourceSnapshotName: " + getSourceSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSnapshotRequest == false)
            return false;
        ExportSnapshotRequest other = (ExportSnapshotRequest) obj;

        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null)
            return false;
        if (other.getSourceSnapshotName() != null
                && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false)
            return false;
        return true;
    }
}
