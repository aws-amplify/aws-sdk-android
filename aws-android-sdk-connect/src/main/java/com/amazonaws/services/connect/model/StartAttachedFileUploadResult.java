/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * Response from StartAttachedFileUpload API.
 */
public class StartAttachedFileUploadResult implements Serializable {
    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     */
    private String fileArn;

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String fileId;

    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's
     * specified in ISO 8601 format: <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For
     * example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     */
    private String creationTime;

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, PROCESSING, FAILED
     */
    private String fileStatus;

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     */
    private CreatedByInfo createdBy;

    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     */
    private UploadUrlMetadata uploadUrlMetadata;

    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     *
     * @return <p>
     *         The unique identifier of the attached file resource (ARN).
     *         </p>
     */
    public String getFileArn() {
        return fileArn;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     *
     * @param fileArn <p>
     *            The unique identifier of the attached file resource (ARN).
     *            </p>
     */
    public void setFileArn(String fileArn) {
        this.fileArn = fileArn;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileArn <p>
     *            The unique identifier of the attached file resource (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadResult withFileArn(String fileArn) {
        this.fileArn = fileArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The unique identifier of the attached file resource.
     *         </p>
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param fileId <p>
     *            The unique identifier of the attached file resource.
     *            </p>
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param fileId <p>
     *            The unique identifier of the attached file resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadResult withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's
     * specified in ISO 8601 format: <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For
     * example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     *
     * @return <p>
     *         The time of Creation of the file resource as an ISO timestamp.
     *         It's specified in ISO 8601 format:
     *         <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example,
     *         <code>2024-05-03T02:41:28.172Z</code>.
     *         </p>
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's
     * specified in ISO 8601 format: <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For
     * example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     *
     * @param creationTime <p>
     *            The time of Creation of the file resource as an ISO timestamp.
     *            It's specified in ISO 8601 format:
     *            <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example,
     *            <code>2024-05-03T02:41:28.172Z</code>.
     *            </p>
     */
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's
     * specified in ISO 8601 format: <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For
     * example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time of Creation of the file resource as an ISO timestamp.
     *            It's specified in ISO 8601 format:
     *            <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example,
     *            <code>2024-05-03T02:41:28.172Z</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadResult withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, PROCESSING, FAILED
     *
     * @return <p>
     *         The current status of the attached file.
     *         </p>
     * @see FileStatusType
     */
    public String getFileStatus() {
        return fileStatus;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, PROCESSING, FAILED
     *
     * @param fileStatus <p>
     *            The current status of the attached file.
     *            </p>
     * @see FileStatusType
     */
    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, PROCESSING, FAILED
     *
     * @param fileStatus <p>
     *            The current status of the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileStatusType
     */
    public StartAttachedFileUploadResult withFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, PROCESSING, FAILED
     *
     * @param fileStatus <p>
     *            The current status of the attached file.
     *            </p>
     * @see FileStatusType
     */
    public void setFileStatus(FileStatusType fileStatus) {
        this.fileStatus = fileStatus.toString();
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, REJECTED, PROCESSING, FAILED
     *
     * @param fileStatus <p>
     *            The current status of the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileStatusType
     */
    public StartAttachedFileUploadResult withFileStatus(FileStatusType fileStatus) {
        this.fileStatus = fileStatus.toString();
        return this;
    }

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     *
     * @return <p>
     *         Represents the identity that created the file.
     *         </p>
     */
    public CreatedByInfo getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     *
     * @param createdBy <p>
     *            Represents the identity that created the file.
     *            </p>
     */
    public void setCreatedBy(CreatedByInfo createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Represents the identity that created the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadResult withCreatedBy(CreatedByInfo createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     *
     * @return <p>
     *         Information to be used while uploading the attached file.
     *         </p>
     */
    public UploadUrlMetadata getUploadUrlMetadata() {
        return uploadUrlMetadata;
    }

    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     *
     * @param uploadUrlMetadata <p>
     *            Information to be used while uploading the attached file.
     *            </p>
     */
    public void setUploadUrlMetadata(UploadUrlMetadata uploadUrlMetadata) {
        this.uploadUrlMetadata = uploadUrlMetadata;
    }

    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadUrlMetadata <p>
     *            Information to be used while uploading the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadResult withUploadUrlMetadata(UploadUrlMetadata uploadUrlMetadata) {
        this.uploadUrlMetadata = uploadUrlMetadata;
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
        if (getFileArn() != null)
            sb.append("FileArn: " + getFileArn() + ",");
        if (getFileId() != null)
            sb.append("FileId: " + getFileId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFileStatus() != null)
            sb.append("FileStatus: " + getFileStatus() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getUploadUrlMetadata() != null)
            sb.append("UploadUrlMetadata: " + getUploadUrlMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileArn() == null) ? 0 : getFileArn().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFileStatus() == null) ? 0 : getFileStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getUploadUrlMetadata() == null) ? 0 : getUploadUrlMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAttachedFileUploadResult == false)
            return false;
        StartAttachedFileUploadResult other = (StartAttachedFileUploadResult) obj;

        if (other.getFileArn() == null ^ this.getFileArn() == null)
            return false;
        if (other.getFileArn() != null && other.getFileArn().equals(this.getFileArn()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFileStatus() == null ^ this.getFileStatus() == null)
            return false;
        if (other.getFileStatus() != null
                && other.getFileStatus().equals(this.getFileStatus()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getUploadUrlMetadata() == null ^ this.getUploadUrlMetadata() == null)
            return false;
        if (other.getUploadUrlMetadata() != null
                && other.getUploadUrlMetadata().equals(this.getUploadUrlMetadata()) == false)
            return false;
        return true;
    }
}
