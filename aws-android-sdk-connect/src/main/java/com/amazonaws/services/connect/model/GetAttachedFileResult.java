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
 * Response from GetAttachedFile API.
 */
public class GetAttachedFileResult implements Serializable {
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
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String fileName;

    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long fileSizeInBytes;

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     */
    private String associatedResourceArn;

    /**
     * <p>
     * The use case for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHMENT
     */
    private String fileUseCaseType;

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     */
    private CreatedByInfo createdBy;

    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     */
    private DownloadUrlMetadata downloadUrlMetadata;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public GetAttachedFileResult withFileArn(String fileArn) {
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
    public GetAttachedFileResult withFileId(String fileId) {
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
    public GetAttachedFileResult withCreationTime(String creationTime) {
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
    public GetAttachedFileResult withFileStatus(String fileStatus) {
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
    public GetAttachedFileResult withFileStatus(FileStatusType fileStatus) {
        this.fileStatus = fileStatus.toString();
        return this;
    }

    /**
     * <p>
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         A case-sensitive name of the attached file being uploaded.
     *         </p>
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <p>
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param fileName <p>
     *            A case-sensitive name of the attached file being uploaded.
     *            </p>
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param fileName <p>
     *            A case-sensitive name of the attached file being uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileResult withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The size of the attached file in bytes.
     *         </p>
     */
    public Long getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param fileSizeInBytes <p>
     *            The size of the attached file in bytes.
     *            </p>
     */
    public void setFileSizeInBytes(Long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
    }

    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param fileSizeInBytes <p>
     *            The size of the attached file in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileResult withFileSizeInBytes(Long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     *
     * @return <p>
     *         The resource to which the attached file is (being) uploaded to.
     *         <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *         >Cases</a> are the only current supported resource.
     *         </p>
     */
    public String getAssociatedResourceArn() {
        return associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     *
     * @param associatedResourceArn <p>
     *            The resource to which the attached file is (being) uploaded
     *            to. <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *            >Cases</a> are the only current supported resource.
     *            </p>
     */
    public void setAssociatedResourceArn(String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedResourceArn <p>
     *            The resource to which the attached file is (being) uploaded
     *            to. <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *            >Cases</a> are the only current supported resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileResult withAssociatedResourceArn(String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
        return this;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHMENT
     *
     * @return <p>
     *         The use case for the file.
     *         </p>
     * @see FileUseCaseType
     */
    public String getFileUseCaseType() {
        return fileUseCaseType;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHMENT
     *
     * @param fileUseCaseType <p>
     *            The use case for the file.
     *            </p>
     * @see FileUseCaseType
     */
    public void setFileUseCaseType(String fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHMENT
     *
     * @param fileUseCaseType <p>
     *            The use case for the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileUseCaseType
     */
    public GetAttachedFileResult withFileUseCaseType(String fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType;
        return this;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHMENT
     *
     * @param fileUseCaseType <p>
     *            The use case for the file.
     *            </p>
     * @see FileUseCaseType
     */
    public void setFileUseCaseType(FileUseCaseType fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType.toString();
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ATTACHMENT
     *
     * @param fileUseCaseType <p>
     *            The use case for the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileUseCaseType
     */
    public GetAttachedFileResult withFileUseCaseType(FileUseCaseType fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType.toString();
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
    public GetAttachedFileResult withCreatedBy(CreatedByInfo createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     *
     * @return <p>
     *         URL and expiry to be used when downloading the attached file.
     *         </p>
     */
    public DownloadUrlMetadata getDownloadUrlMetadata() {
        return downloadUrlMetadata;
    }

    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     *
     * @param downloadUrlMetadata <p>
     *            URL and expiry to be used when downloading the attached file.
     *            </p>
     */
    public void setDownloadUrlMetadata(DownloadUrlMetadata downloadUrlMetadata) {
        this.downloadUrlMetadata = downloadUrlMetadata;
    }

    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param downloadUrlMetadata <p>
     *            URL and expiry to be used when downloading the attached file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileResult withDownloadUrlMetadata(DownloadUrlMetadata downloadUrlMetadata) {
        this.downloadUrlMetadata = downloadUrlMetadata;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example,
     *         <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example,
     *            <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example,
     *            <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetAttachedFileResult clearTagsEntries() {
        this.tags = null;
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
        if (getFileName() != null)
            sb.append("FileName: " + getFileName() + ",");
        if (getFileSizeInBytes() != null)
            sb.append("FileSizeInBytes: " + getFileSizeInBytes() + ",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: " + getAssociatedResourceArn() + ",");
        if (getFileUseCaseType() != null)
            sb.append("FileUseCaseType: " + getFileUseCaseType() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getDownloadUrlMetadata() != null)
            sb.append("DownloadUrlMetadata: " + getDownloadUrlMetadata() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode
                + ((getFileSizeInBytes() == null) ? 0 : getFileSizeInBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatedResourceArn() == null) ? 0 : getAssociatedResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getFileUseCaseType() == null) ? 0 : getFileUseCaseType().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getDownloadUrlMetadata() == null) ? 0 : getDownloadUrlMetadata().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttachedFileResult == false)
            return false;
        GetAttachedFileResult other = (GetAttachedFileResult) obj;

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
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getFileSizeInBytes() == null ^ this.getFileSizeInBytes() == null)
            return false;
        if (other.getFileSizeInBytes() != null
                && other.getFileSizeInBytes().equals(this.getFileSizeInBytes()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null
                && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        if (other.getFileUseCaseType() == null ^ this.getFileUseCaseType() == null)
            return false;
        if (other.getFileUseCaseType() != null
                && other.getFileUseCaseType().equals(this.getFileUseCaseType()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDownloadUrlMetadata() == null ^ this.getDownloadUrlMetadata() == null)
            return false;
        if (other.getDownloadUrlMetadata() != null
                && other.getDownloadUrlMetadata().equals(this.getDownloadUrlMetadata()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
