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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides a pre-signed Amazon S3 URL in response for uploading your content.
 * </p>
 * <important>
 * <p>
 * You may only use this API to upload attachments to a <a href=
 * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
 * >Connect Case</a>.
 * </p>
 * </important>
 */
public class StartAttachedFileUploadRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

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
     * Optional override for the expiry of the pre-signed S3 URL in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     */
    private Integer urlExpiryInSeconds;

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
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     */
    private String associatedResourceArn;

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     */
    private CreatedByInfo createdBy;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If not provided, the Amazon Web
     *         Services SDK populates this field. For more information about
     *         idempotency, see <a href=
     *         "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *         >Making retries safe with idempotent APIs</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The unique identifier of the Connect instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The unique identifier of the Connect instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The unique identifier of the Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public StartAttachedFileUploadRequest withFileName(String fileName) {
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
    public StartAttachedFileUploadRequest withFileSizeInBytes(Long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
        return this;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @return <p>
     *         Optional override for the expiry of the pre-signed S3 URL in
     *         seconds.
     *         </p>
     */
    public Integer getUrlExpiryInSeconds() {
        return urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param urlExpiryInSeconds <p>
     *            Optional override for the expiry of the pre-signed S3 URL in
     *            seconds.
     *            </p>
     */
    public void setUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        this.urlExpiryInSeconds = urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param urlExpiryInSeconds <p>
     *            Optional override for the expiry of the pre-signed S3 URL in
     *            seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadRequest withUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        this.urlExpiryInSeconds = urlExpiryInSeconds;
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
    public StartAttachedFileUploadRequest withFileUseCaseType(String fileUseCaseType) {
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
    public StartAttachedFileUploadRequest withFileUseCaseType(FileUseCaseType fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType.toString();
        return this;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     *
     * @return <p>
     *         The resource to which the attached file is (being) uploaded to.
     *         <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *         >Cases</a> are the only current supported resource.
     *         </p>
     *         <note>
     *         <p>
     *         This value must be a valid ARN.
     *         </p>
     *         </note>
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
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     *
     * @param associatedResourceArn <p>
     *            The resource to which the attached file is (being) uploaded
     *            to. <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *            >Cases</a> are the only current supported resource.
     *            </p>
     *            <note>
     *            <p>
     *            This value must be a valid ARN.
     *            </p>
     *            </note>
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
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            This value must be a valid ARN.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAttachedFileUploadRequest withAssociatedResourceArn(String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
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
    public StartAttachedFileUploadRequest withCreatedBy(CreatedByInfo createdBy) {
        this.createdBy = createdBy;
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
    public StartAttachedFileUploadRequest withTags(java.util.Map<String, String> tags) {
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
    public StartAttachedFileUploadRequest addTagsEntry(String key, String value) {
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
    public StartAttachedFileUploadRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getFileName() != null)
            sb.append("FileName: " + getFileName() + ",");
        if (getFileSizeInBytes() != null)
            sb.append("FileSizeInBytes: " + getFileSizeInBytes() + ",");
        if (getUrlExpiryInSeconds() != null)
            sb.append("UrlExpiryInSeconds: " + getUrlExpiryInSeconds() + ",");
        if (getFileUseCaseType() != null)
            sb.append("FileUseCaseType: " + getFileUseCaseType() + ",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: " + getAssociatedResourceArn() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
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
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode
                + ((getFileSizeInBytes() == null) ? 0 : getFileSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getUrlExpiryInSeconds() == null) ? 0 : getUrlExpiryInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getFileUseCaseType() == null) ? 0 : getFileUseCaseType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatedResourceArn() == null) ? 0 : getAssociatedResourceArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAttachedFileUploadRequest == false)
            return false;
        StartAttachedFileUploadRequest other = (StartAttachedFileUploadRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getUrlExpiryInSeconds() == null ^ this.getUrlExpiryInSeconds() == null)
            return false;
        if (other.getUrlExpiryInSeconds() != null
                && other.getUrlExpiryInSeconds().equals(this.getUrlExpiryInSeconds()) == false)
            return false;
        if (other.getFileUseCaseType() == null ^ this.getFileUseCaseType() == null)
            return false;
        if (other.getFileUseCaseType() != null
                && other.getFileUseCaseType().equals(this.getFileUseCaseType()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null
                && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
