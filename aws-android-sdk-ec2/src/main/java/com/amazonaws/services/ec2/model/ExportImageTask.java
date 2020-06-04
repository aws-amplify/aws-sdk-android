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
 * Describes an export image task.
 * </p>
 */
public class ExportImageTask implements Serializable {
    /**
     * <p>
     * A description of the image being exported.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the export image task.
     * </p>
     */
    private String exportImageTaskId;

    /**
     * <p>
     * The ID of the image.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     */
    private String progress;

    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     */
    private ExportTaskS3Location s3ExportLocation;

    /**
     * <p>
     * The status of the export image task. The possible values are
     * <code>active</code>, <code>completed</code>, <code>deleting</code>, and
     * <code>deleted</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The status message for the export image task.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * A description of the image being exported.
     * </p>
     *
     * @return <p>
     *         A description of the image being exported.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the image being exported.
     * </p>
     *
     * @param description <p>
     *            A description of the image being exported.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the image being exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the image being exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageTask withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the export image task.
     * </p>
     *
     * @return <p>
     *         The ID of the export image task.
     *         </p>
     */
    public String getExportImageTaskId() {
        return exportImageTaskId;
    }

    /**
     * <p>
     * The ID of the export image task.
     * </p>
     *
     * @param exportImageTaskId <p>
     *            The ID of the export image task.
     *            </p>
     */
    public void setExportImageTaskId(String exportImageTaskId) {
        this.exportImageTaskId = exportImageTaskId;
    }

    /**
     * <p>
     * The ID of the export image task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportImageTaskId <p>
     *            The ID of the export image task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageTask withExportImageTaskId(String exportImageTaskId) {
        this.exportImageTaskId = exportImageTaskId;
        return this;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     *
     * @return <p>
     *         The ID of the image.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the image.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageTask withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     *
     * @return <p>
     *         The percent complete of the export image task.
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     *
     * @param progress <p>
     *            The percent complete of the export image task.
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The percent complete of the export image task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The percent complete of the export image task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageTask withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     *
     * @return <p>
     *         Information about the destination S3 bucket.
     *         </p>
     */
    public ExportTaskS3Location getS3ExportLocation() {
        return s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     *
     * @param s3ExportLocation <p>
     *            Information about the destination S3 bucket.
     *            </p>
     */
    public void setS3ExportLocation(ExportTaskS3Location s3ExportLocation) {
        this.s3ExportLocation = s3ExportLocation;
    }

    /**
     * <p>
     * Information about the destination S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3ExportLocation <p>
     *            Information about the destination S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageTask withS3ExportLocation(ExportTaskS3Location s3ExportLocation) {
        this.s3ExportLocation = s3ExportLocation;
        return this;
    }

    /**
     * <p>
     * The status of the export image task. The possible values are
     * <code>active</code>, <code>completed</code>, <code>deleting</code>, and
     * <code>deleted</code>.
     * </p>
     *
     * @return <p>
     *         The status of the export image task. The possible values are
     *         <code>active</code>, <code>completed</code>,
     *         <code>deleting</code>, and <code>deleted</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the export image task. The possible values are
     * <code>active</code>, <code>completed</code>, <code>deleting</code>, and
     * <code>deleted</code>.
     * </p>
     *
     * @param status <p>
     *            The status of the export image task. The possible values are
     *            <code>active</code>, <code>completed</code>,
     *            <code>deleting</code>, and <code>deleted</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the export image task. The possible values are
     * <code>active</code>, <code>completed</code>, <code>deleting</code>, and
     * <code>deleted</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the export image task. The possible values are
     *            <code>active</code>, <code>completed</code>,
     *            <code>deleting</code>, and <code>deleted</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageTask withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status message for the export image task.
     * </p>
     *
     * @return <p>
     *         The status message for the export image task.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status message for the export image task.
     * </p>
     *
     * @param statusMessage <p>
     *            The status message for the export image task.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the export image task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The status message for the export image task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportImageTask withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
        if (getExportImageTaskId() != null)
            sb.append("ExportImageTaskId: " + getExportImageTaskId() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getS3ExportLocation() != null)
            sb.append("S3ExportLocation: " + getS3ExportLocation() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage());
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
                + ((getExportImageTaskId() == null) ? 0 : getExportImageTaskId().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode
                + ((getS3ExportLocation() == null) ? 0 : getS3ExportLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportImageTask == false)
            return false;
        ExportImageTask other = (ExportImageTask) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExportImageTaskId() == null ^ this.getExportImageTaskId() == null)
            return false;
        if (other.getExportImageTaskId() != null
                && other.getExportImageTaskId().equals(this.getExportImageTaskId()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getS3ExportLocation() == null ^ this.getS3ExportLocation() == null)
            return false;
        if (other.getS3ExportLocation() != null
                && other.getS3ExportLocation().equals(this.getS3ExportLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }
}
