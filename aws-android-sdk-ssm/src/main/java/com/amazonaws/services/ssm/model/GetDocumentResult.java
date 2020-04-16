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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class GetDocumentResult implements Serializable {
    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a
     * document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Updating</code>, <code>Failed</code>, and
     * <code>Deleting</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     */
    private String status;

    /**
     * <p>
     * A message returned by AWS Systems Manager that explains the
     * <code>Status</code> value. For example, a <code>Failed</code> status
     * might be explained by the <code>StatusInformation</code> message,
     * "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
     * </p>
     */
    private String statusInformation;

    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String content;

    /**
     * <p>
     * The document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     */
    private String documentType;

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     */
    private String documentFormat;

    /**
     * <p>
     * A list of SSM documents required by a document. For example, an
     * <code>ApplicationConfiguration</code> document requires an
     * <code>ApplicationConfigurationSchema</code> document.
     * </p>
     */
    private java.util.List<DocumentRequires> requires;

    /**
     * <p>
     * A description of the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     */
    private java.util.List<AttachmentContent> attachmentsContent;

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the Systems Manager document.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the Systems Manager document.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the Systems Manager document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a
     * document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>
     *         The version of the artifact associated with the document. For
     *         example, "Release 12, Update 6". This value is unique across all
     *         versions of a document, and cannot be changed.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * The version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a
     * document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            The version of the artifact associated with the document. For
     *            example, "Release 12, Update 6". This value is unique across
     *            all versions of a document, and cannot be changed.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The version of the artifact associated with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a
     * document, and cannot be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            The version of the artifact associated with the document. For
     *            example, "Release 12, Update 6". This value is unique across
     *            all versions of a document, and cannot be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The document version.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Updating</code>, <code>Failed</code>, and
     * <code>Deleting</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @return <p>
     *         The status of the Systems Manager document, such as
     *         <code>Creating</code>, <code>Active</code>, <code>Updating</code>, <code>Failed</code>, and <code>Deleting</code>.
     *         </p>
     * @see DocumentStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Updating</code>, <code>Failed</code>, and
     * <code>Deleting</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document, such as
     *            <code>Creating</code>, <code>Active</code>,
     *            <code>Updating</code>, <code>Failed</code>, and
     *            <code>Deleting</code>.
     *            </p>
     * @see DocumentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Updating</code>, <code>Failed</code>, and
     * <code>Deleting</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document, such as
     *            <code>Creating</code>, <code>Active</code>,
     *            <code>Updating</code>, <code>Failed</code>, and
     *            <code>Deleting</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentStatus
     */
    public GetDocumentResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Updating</code>, <code>Failed</code>, and
     * <code>Deleting</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document, such as
     *            <code>Creating</code>, <code>Active</code>,
     *            <code>Updating</code>, <code>Failed</code>, and
     *            <code>Deleting</code>.
     *            </p>
     * @see DocumentStatus
     */
    public void setStatus(DocumentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the Systems Manager document, such as <code>Creating</code>, <code>Active</code>, <code>Updating</code>, <code>Failed</code>, and
     * <code>Deleting</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document, such as
     *            <code>Creating</code>, <code>Active</code>,
     *            <code>Updating</code>, <code>Failed</code>, and
     *            <code>Deleting</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentStatus
     */
    public GetDocumentResult withStatus(DocumentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message returned by AWS Systems Manager that explains the
     * <code>Status</code> value. For example, a <code>Failed</code> status
     * might be explained by the <code>StatusInformation</code> message,
     * "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
     * </p>
     *
     * @return <p>
     *         A message returned by AWS Systems Manager that explains the
     *         <code>Status</code> value. For example, a <code>Failed</code>
     *         status might be explained by the <code>StatusInformation</code>
     *         message,
     *         "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
     *         </p>
     */
    public String getStatusInformation() {
        return statusInformation;
    }

    /**
     * <p>
     * A message returned by AWS Systems Manager that explains the
     * <code>Status</code> value. For example, a <code>Failed</code> status
     * might be explained by the <code>StatusInformation</code> message,
     * "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
     * </p>
     *
     * @param statusInformation <p>
     *            A message returned by AWS Systems Manager that explains the
     *            <code>Status</code> value. For example, a <code>Failed</code>
     *            status might be explained by the
     *            <code>StatusInformation</code> message,
     *            "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
     *            </p>
     */
    public void setStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
    }

    /**
     * <p>
     * A message returned by AWS Systems Manager that explains the
     * <code>Status</code> value. For example, a <code>Failed</code> status
     * might be explained by the <code>StatusInformation</code> message,
     * "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusInformation <p>
     *            A message returned by AWS Systems Manager that explains the
     *            <code>Status</code> value. For example, a <code>Failed</code>
     *            status might be explained by the
     *            <code>StatusInformation</code> message,
     *            "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
        return this;
    }

    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The contents of the Systems Manager document.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content <p>
     *            The contents of the Systems Manager document.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content <p>
     *            The contents of the Systems Manager document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @return <p>
     *         The document type.
     *         </p>
     * @see DocumentType
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The document type.
     *            </p>
     * @see DocumentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The document type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public GetDocumentResult withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The document type.
     *            </p>
     * @see DocumentType
     */
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>
     * The document type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The document type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public GetDocumentResult withDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
        return this;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @return <p>
     *         The document format, either JSON or YAML.
     *         </p>
     * @see DocumentFormat
     */
    public String getDocumentFormat() {
        return documentFormat;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            The document format, either JSON or YAML.
     *            </p>
     * @see DocumentFormat
     */
    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            The document format, either JSON or YAML.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentFormat
     */
    public GetDocumentResult withDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
        return this;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            The document format, either JSON or YAML.
     *            </p>
     * @see DocumentFormat
     */
    public void setDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            The document format, either JSON or YAML.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentFormat
     */
    public GetDocumentResult withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>
     * A list of SSM documents required by a document. For example, an
     * <code>ApplicationConfiguration</code> document requires an
     * <code>ApplicationConfigurationSchema</code> document.
     * </p>
     *
     * @return <p>
     *         A list of SSM documents required by a document. For example, an
     *         <code>ApplicationConfiguration</code> document requires an
     *         <code>ApplicationConfigurationSchema</code> document.
     *         </p>
     */
    public java.util.List<DocumentRequires> getRequires() {
        return requires;
    }

    /**
     * <p>
     * A list of SSM documents required by a document. For example, an
     * <code>ApplicationConfiguration</code> document requires an
     * <code>ApplicationConfigurationSchema</code> document.
     * </p>
     *
     * @param requires <p>
     *            A list of SSM documents required by a document. For example,
     *            an <code>ApplicationConfiguration</code> document requires an
     *            <code>ApplicationConfigurationSchema</code> document.
     *            </p>
     */
    public void setRequires(java.util.Collection<DocumentRequires> requires) {
        if (requires == null) {
            this.requires = null;
            return;
        }

        this.requires = new java.util.ArrayList<DocumentRequires>(requires);
    }

    /**
     * <p>
     * A list of SSM documents required by a document. For example, an
     * <code>ApplicationConfiguration</code> document requires an
     * <code>ApplicationConfigurationSchema</code> document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requires <p>
     *            A list of SSM documents required by a document. For example,
     *            an <code>ApplicationConfiguration</code> document requires an
     *            <code>ApplicationConfigurationSchema</code> document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withRequires(DocumentRequires... requires) {
        if (getRequires() == null) {
            this.requires = new java.util.ArrayList<DocumentRequires>(requires.length);
        }
        for (DocumentRequires value : requires) {
            this.requires.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of SSM documents required by a document. For example, an
     * <code>ApplicationConfiguration</code> document requires an
     * <code>ApplicationConfigurationSchema</code> document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requires <p>
     *            A list of SSM documents required by a document. For example,
     *            an <code>ApplicationConfiguration</code> document requires an
     *            <code>ApplicationConfigurationSchema</code> document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withRequires(java.util.Collection<DocumentRequires> requires) {
        setRequires(requires);
        return this;
    }

    /**
     * <p>
     * A description of the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     *
     * @return <p>
     *         A description of the document attachments, including names,
     *         locations, sizes, etc.
     *         </p>
     */
    public java.util.List<AttachmentContent> getAttachmentsContent() {
        return attachmentsContent;
    }

    /**
     * <p>
     * A description of the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     *
     * @param attachmentsContent <p>
     *            A description of the document attachments, including names,
     *            locations, sizes, etc.
     *            </p>
     */
    public void setAttachmentsContent(java.util.Collection<AttachmentContent> attachmentsContent) {
        if (attachmentsContent == null) {
            this.attachmentsContent = null;
            return;
        }

        this.attachmentsContent = new java.util.ArrayList<AttachmentContent>(attachmentsContent);
    }

    /**
     * <p>
     * A description of the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentsContent <p>
     *            A description of the document attachments, including names,
     *            locations, sizes, etc.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withAttachmentsContent(AttachmentContent... attachmentsContent) {
        if (getAttachmentsContent() == null) {
            this.attachmentsContent = new java.util.ArrayList<AttachmentContent>(
                    attachmentsContent.length);
        }
        for (AttachmentContent value : attachmentsContent) {
            this.attachmentsContent.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A description of the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentsContent <p>
     *            A description of the document attachments, including names,
     *            locations, sizes, etc.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentResult withAttachmentsContent(
            java.util.Collection<AttachmentContent> attachmentsContent) {
        setAttachmentsContent(attachmentsContent);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusInformation() != null)
            sb.append("StatusInformation: " + getStatusInformation() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getDocumentType() != null)
            sb.append("DocumentType: " + getDocumentType() + ",");
        if (getDocumentFormat() != null)
            sb.append("DocumentFormat: " + getDocumentFormat() + ",");
        if (getRequires() != null)
            sb.append("Requires: " + getRequires() + ",");
        if (getAttachmentsContent() != null)
            sb.append("AttachmentsContent: " + getAttachmentsContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusInformation() == null) ? 0 : getStatusInformation().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getRequires() == null) ? 0 : getRequires().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentsContent() == null) ? 0 : getAttachmentsContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentResult == false)
            return false;
        GetDocumentResult other = (GetDocumentResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusInformation() == null ^ this.getStatusInformation() == null)
            return false;
        if (other.getStatusInformation() != null
                && other.getStatusInformation().equals(this.getStatusInformation()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null
                && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null)
            return false;
        if (other.getDocumentFormat() != null
                && other.getDocumentFormat().equals(this.getDocumentFormat()) == false)
            return false;
        if (other.getRequires() == null ^ this.getRequires() == null)
            return false;
        if (other.getRequires() != null && other.getRequires().equals(this.getRequires()) == false)
            return false;
        if (other.getAttachmentsContent() == null ^ this.getAttachmentsContent() == null)
            return false;
        if (other.getAttachmentsContent() != null
                && other.getAttachmentsContent().equals(this.getAttachmentsContent()) == false)
            return false;
        return true;
    }
}
