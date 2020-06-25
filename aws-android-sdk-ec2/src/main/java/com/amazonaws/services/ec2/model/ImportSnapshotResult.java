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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class ImportSnapshotResult implements Serializable {
    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     */
    private String importTaskId;

    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     */
    private SnapshotTaskDetail snapshotTaskDetail;

    /**
     * <p>
     * Any tags assigned to the snapshot being imported.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     *
     * @return <p>
     *         A description of the import snapshot task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     *
     * @param description <p>
     *            A description of the import snapshot task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the import snapshot task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the import snapshot task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     *
     * @return <p>
     *         The ID of the import snapshot task.
     *         </p>
     */
    public String getImportTaskId() {
        return importTaskId;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     *
     * @param importTaskId <p>
     *            The ID of the import snapshot task.
     *            </p>
     */
    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The ID of the import snapshot task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTaskId <p>
     *            The ID of the import snapshot task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotResult withImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
        return this;
    }

    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     *
     * @return <p>
     *         Information about the import snapshot task.
     *         </p>
     */
    public SnapshotTaskDetail getSnapshotTaskDetail() {
        return snapshotTaskDetail;
    }

    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     *
     * @param snapshotTaskDetail <p>
     *            Information about the import snapshot task.
     *            </p>
     */
    public void setSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        this.snapshotTaskDetail = snapshotTaskDetail;
    }

    /**
     * <p>
     * Information about the import snapshot task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotTaskDetail <p>
     *            Information about the import snapshot task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotResult withSnapshotTaskDetail(SnapshotTaskDetail snapshotTaskDetail) {
        this.snapshotTaskDetail = snapshotTaskDetail;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the snapshot being imported.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the snapshot being imported.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the snapshot being imported.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the snapshot being imported.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the snapshot being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the snapshot being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the snapshot being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the snapshot being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: " + getImportTaskId() + ",");
        if (getSnapshotTaskDetail() != null)
            sb.append("SnapshotTaskDetail: " + getSnapshotTaskDetail() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotTaskDetail() == null) ? 0 : getSnapshotTaskDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSnapshotResult == false)
            return false;
        ImportSnapshotResult other = (ImportSnapshotResult) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null
                && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getSnapshotTaskDetail() == null ^ this.getSnapshotTaskDetail() == null)
            return false;
        if (other.getSnapshotTaskDetail() != null
                && other.getSnapshotTaskDetail().equals(this.getSnapshotTaskDetail()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
