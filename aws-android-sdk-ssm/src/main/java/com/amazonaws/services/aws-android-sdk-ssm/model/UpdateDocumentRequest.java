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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Updates one or more values for an SSM document.</p>
 */
public class UpdateDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>A valid JSON or YAML string.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String content;

    /**
     * <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     */
    private java.util.List<AttachmentsSource> attachments;

    /**
     * <p>The name of the document that you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>(Required) The latest version of the document that you want to update. The latest document version can be specified using the $LATEST variable or by the version number. Updating a previous version of a document is not supported.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     */
    private String documentFormat;

    /**
     * <p>Specify a new target type for the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     */
    private String targetType;

    /**
     * <p>A valid JSON or YAML string.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>A valid JSON or YAML string.</p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>A valid JSON or YAML string.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content <p>A valid JSON or YAML string.</p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>A valid JSON or YAML string.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content <p>A valid JSON or YAML string.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     *
     * @return <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     */
    public java.util.List<AttachmentsSource> getAttachments() {
        return attachments;
    }

    /**
     * <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     *
     * @param attachments <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     */
    public void setAttachments(java.util.Collection<AttachmentsSource> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AttachmentsSource>(attachments);
    }

    /**
     * <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentRequest withAttachments(AttachmentsSource... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<AttachmentsSource>(attachments.length);
        }
        for (AttachmentsSource value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments <p>A list of key and value pairs that describe attachments to a version of a document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentRequest withAttachments(java.util.Collection<AttachmentsSource> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>The name of the document that you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of the document that you want to update.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the document that you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the document that you want to update.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the document that you want to update.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the document that you want to update.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>(Required) The latest version of the document that you want to update. The latest document version can be specified using the $LATEST variable or by the version number. Updating a previous version of a document is not supported.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>(Required) The latest version of the document that you want to update. The latest document version can be specified using the $LATEST variable or by the version number. Updating a previous version of a document is not supported.</p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>(Required) The latest version of the document that you want to update. The latest document version can be specified using the $LATEST variable or by the version number. Updating a previous version of a document is not supported.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>(Required) The latest version of the document that you want to update. The latest document version can be specified using the $LATEST variable or by the version number. Updating a previous version of a document is not supported.</p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>(Required) The latest version of the document that you want to update. The latest document version can be specified using the $LATEST variable or by the version number. Updating a previous version of a document is not supported.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>(Required) The latest version of the document that you want to update. The latest document version can be specified using the $LATEST variable or by the version number. Updating a previous version of a document is not supported.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentRequest withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @return <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     *
     * @see DocumentFormat
     */
    public String getDocumentFormat() {
        return documentFormat;
    }

    /**
     * <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     *
     * @see DocumentFormat
     */
    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentFormat
     */
    public UpdateDocumentRequest withDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
        return this;
    }

    /**
     * <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     *
     * @see DocumentFormat
     */
    public void setDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
    }

    /**
     * <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentFormat
     */
    public UpdateDocumentRequest withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>Specify a new target type for the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @return <p>Specify a new target type for the document.</p>
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * <p>Specify a new target type for the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @param targetType <p>Specify a new target type for the document.</p>
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>Specify a new target type for the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @param targetType <p>Specify a new target type for the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentRequest withTargetType(String targetType) {
        this.targetType = targetType;
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
        if (getContent() != null) sb.append("Content: " + getContent() + ",");
        if (getAttachments() != null) sb.append("Attachments: " + getAttachments() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersionName() != null) sb.append("VersionName: " + getVersionName() + ",");
        if (getDocumentVersion() != null) sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getDocumentFormat() != null) sb.append("DocumentFormat: " + getDocumentFormat() + ",");
        if (getTargetType() != null) sb.append("TargetType: " + getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateDocumentRequest == false) return false;
        UpdateDocumentRequest other = (UpdateDocumentRequest)obj;

        if (other.getContent() == null ^ this.getContent() == null) return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false) return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null) return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null) return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false) return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null) return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false) return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null) return false;
        if (other.getDocumentFormat() != null && other.getDocumentFormat().equals(this.getDocumentFormat()) == false) return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null) return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false) return false;
        return true;
    }
}
