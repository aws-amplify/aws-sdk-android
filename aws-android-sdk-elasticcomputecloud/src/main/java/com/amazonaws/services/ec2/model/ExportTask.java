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

/**
 * <p>
 * Describes an instance export task.
 * </p>
 */
public class ExportTask implements Serializable {
    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the export task.
     * </p>
     */
    private String exportTaskId;

    /**
     * <p>
     * Information about the export task.
     * </p>
     */
    private ExportToS3Task exportToS3Task;

    /**
     * <p>
     * Information about the instance to export.
     * </p>
     */
    private InstanceExportDetails instanceExportDetails;

    /**
     * <p>
     * The state of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     */
    private String state;

    /**
     * <p>
     * The status message related to the export task.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The tags for the export task.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     *
     * @return <p>
     *         A description of the resource being exported.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     *
     * @param description <p>
     *            A description of the resource being exported.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the resource being exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     *
     * @return <p>
     *         The ID of the export task.
     *         </p>
     */
    public String getExportTaskId() {
        return exportTaskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     *
     * @param exportTaskId <p>
     *            The ID of the export task.
     *            </p>
     */
    public void setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTaskId <p>
     *            The ID of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }

    /**
     * <p>
     * Information about the export task.
     * </p>
     *
     * @return <p>
     *         Information about the export task.
     *         </p>
     */
    public ExportToS3Task getExportToS3Task() {
        return exportToS3Task;
    }

    /**
     * <p>
     * Information about the export task.
     * </p>
     *
     * @param exportToS3Task <p>
     *            Information about the export task.
     *            </p>
     */
    public void setExportToS3Task(ExportToS3Task exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
    }

    /**
     * <p>
     * Information about the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportToS3Task <p>
     *            Information about the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withExportToS3Task(ExportToS3Task exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
        return this;
    }

    /**
     * <p>
     * Information about the instance to export.
     * </p>
     *
     * @return <p>
     *         Information about the instance to export.
     *         </p>
     */
    public InstanceExportDetails getInstanceExportDetails() {
        return instanceExportDetails;
    }

    /**
     * <p>
     * Information about the instance to export.
     * </p>
     *
     * @param instanceExportDetails <p>
     *            Information about the instance to export.
     *            </p>
     */
    public void setInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        this.instanceExportDetails = instanceExportDetails;
    }

    /**
     * <p>
     * Information about the instance to export.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceExportDetails <p>
     *            Information about the instance to export.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        this.instanceExportDetails = instanceExportDetails;
        return this;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @return <p>
     *         The state of the export task.
     *         </p>
     * @see ExportTaskState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the export task.
     *            </p>
     * @see ExportTaskState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportTaskState
     */
    public ExportTask withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the export task.
     *            </p>
     * @see ExportTaskState
     */
    public void setState(ExportTaskState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportTaskState
     */
    public ExportTask withState(ExportTaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status message related to the export task.
     * </p>
     *
     * @return <p>
     *         The status message related to the export task.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status message related to the export task.
     * </p>
     *
     * @param statusMessage <p>
     *            The status message related to the export task.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message related to the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The status message related to the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The tags for the export task.
     * </p>
     *
     * @return <p>
     *         The tags for the export task.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the export task.
     * </p>
     *
     * @param tags <p>
     *            The tags for the export task.
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
     * The tags for the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTags(Tag... tags) {
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
     * The tags for the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTags(java.util.Collection<Tag> tags) {
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
        if (getExportTaskId() != null)
            sb.append("ExportTaskId: " + getExportTaskId() + ",");
        if (getExportToS3Task() != null)
            sb.append("ExportToS3Task: " + getExportToS3Task() + ",");
        if (getInstanceExportDetails() != null)
            sb.append("InstanceExportDetails: " + getInstanceExportDetails() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
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
                + ((getExportTaskId() == null) ? 0 : getExportTaskId().hashCode());
        hashCode = prime * hashCode
                + ((getExportToS3Task() == null) ? 0 : getExportToS3Task().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceExportDetails() == null) ? 0 : getInstanceExportDetails().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTask == false)
            return false;
        ExportTask other = (ExportTask) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExportTaskId() == null ^ this.getExportTaskId() == null)
            return false;
        if (other.getExportTaskId() != null
                && other.getExportTaskId().equals(this.getExportTaskId()) == false)
            return false;
        if (other.getExportToS3Task() == null ^ this.getExportToS3Task() == null)
            return false;
        if (other.getExportToS3Task() != null
                && other.getExportToS3Task().equals(this.getExportToS3Task()) == false)
            return false;
        if (other.getInstanceExportDetails() == null ^ this.getInstanceExportDetails() == null)
            return false;
        if (other.getInstanceExportDetails() != null
                && other.getInstanceExportDetails().equals(this.getInstanceExportDetails()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
