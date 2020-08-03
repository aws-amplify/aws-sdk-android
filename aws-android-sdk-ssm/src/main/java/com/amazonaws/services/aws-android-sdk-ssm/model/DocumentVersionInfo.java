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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Version information about the document.</p>
 */
public class DocumentVersionInfo implements Serializable {
    /**
     * <p>The document name.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The document version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>The date the document was created.</p>
     */
    private java.util.Date createdDate;

    /**
     * <p>An identifier for the default version of the document.</p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>The document format, either JSON or YAML.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     */
    private String documentFormat;

    /**
     * <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     */
    private String status;

    /**
     * <p>A message returned by AWS Systems Manager that explains the <code>Status</code> value. For example, a <code>Failed</code> status might be explained by the <code>StatusInformation</code> message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."</p>
     */
    private String statusInformation;

    /**
     * <p>The document name.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The document name.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The document name.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The document name.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The document name.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The document name.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentVersionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The document version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>The document version.</p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>The document version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The document version.</p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>The document version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The document version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentVersionInfo withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentVersionInfo withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>The date the document was created.</p>
     *
     * @return <p>The date the document was created.</p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>The date the document was created.</p>
     *
     * @param createdDate <p>The date the document was created.</p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>The date the document was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate <p>The date the document was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentVersionInfo withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>An identifier for the default version of the document.</p>
     *
     * @return <p>An identifier for the default version of the document.</p>
     */
    public Boolean isIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>An identifier for the default version of the document.</p>
     *
     * @return <p>An identifier for the default version of the document.</p>
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>An identifier for the default version of the document.</p>
     *
     * @param isDefaultVersion <p>An identifier for the default version of the document.</p>
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>An identifier for the default version of the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isDefaultVersion <p>An identifier for the default version of the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentVersionInfo withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * <p>The document format, either JSON or YAML.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @return <p>The document format, either JSON or YAML.</p>
     *
     * @see DocumentFormat
     */
    public String getDocumentFormat() {
        return documentFormat;
    }

    /**
     * <p>The document format, either JSON or YAML.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>The document format, either JSON or YAML.</p>
     *
     * @see DocumentFormat
     */
    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>The document format, either JSON or YAML.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>The document format, either JSON or YAML.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentFormat
     */
    public DocumentVersionInfo withDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
        return this;
    }

    /**
     * <p>The document format, either JSON or YAML.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>The document format, either JSON or YAML.</p>
     *
     * @see DocumentFormat
     */
    public void setDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
    }

    /**
     * <p>The document format, either JSON or YAML.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>The document format, either JSON or YAML.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentFormat
     */
    public DocumentVersionInfo withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @return <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     *
     * @see DocumentStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     *
     * @see DocumentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentStatus
     */
    public DocumentVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     *
     * @see DocumentStatus
     */
    public void setStatus(DocumentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Failed</code>, and <code>Deleting</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentStatus
     */
    public DocumentVersionInfo withStatus(DocumentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>A message returned by AWS Systems Manager that explains the <code>Status</code> value. For example, a <code>Failed</code> status might be explained by the <code>StatusInformation</code> message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."</p>
     *
     * @return <p>A message returned by AWS Systems Manager that explains the <code>Status</code> value. For example, a <code>Failed</code> status might be explained by the <code>StatusInformation</code> message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."</p>
     */
    public String getStatusInformation() {
        return statusInformation;
    }

    /**
     * <p>A message returned by AWS Systems Manager that explains the <code>Status</code> value. For example, a <code>Failed</code> status might be explained by the <code>StatusInformation</code> message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."</p>
     *
     * @param statusInformation <p>A message returned by AWS Systems Manager that explains the <code>Status</code> value. For example, a <code>Failed</code> status might be explained by the <code>StatusInformation</code> message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."</p>
     */
    public void setStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
    }

    /**
     * <p>A message returned by AWS Systems Manager that explains the <code>Status</code> value. For example, a <code>Failed</code> status might be explained by the <code>StatusInformation</code> message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusInformation <p>A message returned by AWS Systems Manager that explains the <code>Status</code> value. For example, a <code>Failed</code> status might be explained by the <code>StatusInformation</code> message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentVersionInfo withStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDocumentVersion() != null) sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getVersionName() != null) sb.append("VersionName: " + getVersionName() + ",");
        if (getCreatedDate() != null) sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getIsDefaultVersion() != null) sb.append("IsDefaultVersion: " + getIsDefaultVersion() + ",");
        if (getDocumentFormat() != null) sb.append("DocumentFormat: " + getDocumentFormat() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusInformation() != null) sb.append("StatusInformation: " + getStatusInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusInformation() == null) ? 0 : getStatusInformation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DocumentVersionInfo == false) return false;
        DocumentVersionInfo other = (DocumentVersionInfo)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null) return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false) return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null) return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false) return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null) return false;
        if (other.getIsDefaultVersion() != null && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false) return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null) return false;
        if (other.getDocumentFormat() != null && other.getDocumentFormat().equals(this.getDocumentFormat()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusInformation() == null ^ this.getStatusInformation() == null) return false;
        if (other.getStatusInformation() != null && other.getStatusInformation().equals(this.getStatusInformation()) == false) return false;
        return true;
    }
}
