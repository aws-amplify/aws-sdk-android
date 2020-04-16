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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Systems Manager document.
 * </p>
 * <p>
 * After you create a document, you can use CreateAssociation to associate it
 * with one or more running instances.
 * </p>
 */
public class CreateDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String content;

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
     * A list of key and value pairs that describe attachments to a version of a
     * document.
     * </p>
     */
    private java.util.List<AttachmentsSource> attachments;

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They
     * are reserved by AWS for use as document prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating
     * with the document. For example, "Release 12, Update 6". This value is
     * unique across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>
     * The type of document to create.
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
     * Specify the document format for the request. The document format can be
     * JSON, YAML, or TEXT. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     */
    private String documentFormat;

    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can
     * run on. For example, to run a document on EC2 instances, specify the
     * following value: /AWS::EC2::Instance. If you specify a value of '/' the
     * document can run on all types of resources. If you don't specify a value,
     * the document can't run on any resources. For a list of valid resource
     * types, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     */
    private String targetType;

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an SSM document to
     * identify the types of targets or the environment where it will run. In
     * this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a>
     * action.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A valid JSON or YAML string.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content <p>
     *            A valid JSON or YAML string.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param content <p>
     *            A valid JSON or YAML string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withContent(String content) {
        this.content = content;
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
    public CreateDocumentRequest withRequires(DocumentRequires... requires) {
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
    public CreateDocumentRequest withRequires(java.util.Collection<DocumentRequires> requires) {
        setRequires(requires);
        return this;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a
     * document.
     * </p>
     *
     * @return <p>
     *         A list of key and value pairs that describe attachments to a
     *         version of a document.
     *         </p>
     */
    public java.util.List<AttachmentsSource> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a
     * document.
     * </p>
     *
     * @param attachments <p>
     *            A list of key and value pairs that describe attachments to a
     *            version of a document.
     *            </p>
     */
    public void setAttachments(java.util.Collection<AttachmentsSource> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AttachmentsSource>(attachments);
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a
     * document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            A list of key and value pairs that describe attachments to a
     *            version of a document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withAttachments(AttachmentsSource... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<AttachmentsSource>(attachments.length);
        }
        for (AttachmentsSource value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a
     * document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            A list of key and value pairs that describe attachments to a
     *            version of a document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withAttachments(java.util.Collection<AttachmentsSource> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They
     * are reserved by AWS for use as document prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         A name for the Systems Manager document.
     *         </p>
     *         <important>
     *         <p>
     *         Do not use the following to begin the names of documents you
     *         create. They are reserved by AWS for use as document prefixes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aws</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>amazon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>amzn</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </important>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They
     * are reserved by AWS for use as document prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            A name for the Systems Manager document.
     *            </p>
     *            <important>
     *            <p>
     *            Do not use the following to begin the names of documents you
     *            create. They are reserved by AWS for use as document prefixes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>aws</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>amazon</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>amzn</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </important>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They
     * are reserved by AWS for use as document prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            A name for the Systems Manager document.
     *            </p>
     *            <important>
     *            <p>
     *            Do not use the following to begin the names of documents you
     *            create. They are reserved by AWS for use as document prefixes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>aws</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>amazon</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>amzn</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating
     * with the document. For example, "Release 12, Update 6". This value is
     * unique across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>
     *         An optional field specifying the version of the artifact you are
     *         creating with the document. For example, "Release 12, Update 6".
     *         This value is unique across all versions of a document, and
     *         cannot be changed.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating
     * with the document. For example, "Release 12, Update 6". This value is
     * unique across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            An optional field specifying the version of the artifact you
     *            are creating with the document. For example,
     *            "Release 12, Update 6". This value is unique across all
     *            versions of a document, and cannot be changed.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating
     * with the document. For example, "Release 12, Update 6". This value is
     * unique across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            An optional field specifying the version of the artifact you
     *            are creating with the document. For example,
     *            "Release 12, Update 6". This value is unique across all
     *            versions of a document, and cannot be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The type of document to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @return <p>
     *         The type of document to create.
     *         </p>
     * @see DocumentType
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * <p>
     * The type of document to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The type of document to create.
     *            </p>
     * @see DocumentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The type of document to create.
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
     *            The type of document to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public CreateDocumentRequest withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * <p>
     * The type of document to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The type of document to create.
     *            </p>
     * @see DocumentType
     */
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>
     * The type of document to create.
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
     *            The type of document to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public CreateDocumentRequest withDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
        return this;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be
     * JSON, YAML, or TEXT. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @return <p>
     *         Specify the document format for the request. The document format
     *         can be JSON, YAML, or TEXT. JSON is the default format.
     *         </p>
     * @see DocumentFormat
     */
    public String getDocumentFormat() {
        return documentFormat;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be
     * JSON, YAML, or TEXT. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Specify the document format for the request. The document
     *            format can be JSON, YAML, or TEXT. JSON is the default format.
     *            </p>
     * @see DocumentFormat
     */
    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be
     * JSON, YAML, or TEXT. JSON is the default format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Specify the document format for the request. The document
     *            format can be JSON, YAML, or TEXT. JSON is the default format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentFormat
     */
    public CreateDocumentRequest withDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
        return this;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be
     * JSON, YAML, or TEXT. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Specify the document format for the request. The document
     *            format can be JSON, YAML, or TEXT. JSON is the default format.
     *            </p>
     * @see DocumentFormat
     */
    public void setDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be
     * JSON, YAML, or TEXT. JSON is the default format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Specify the document format for the request. The document
     *            format can be JSON, YAML, or TEXT. JSON is the default format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentFormat
     */
    public CreateDocumentRequest withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can
     * run on. For example, to run a document on EC2 instances, specify the
     * following value: /AWS::EC2::Instance. If you specify a value of '/' the
     * document can run on all types of resources. If you don't specify a value,
     * the document can't run on any resources. For a list of valid resource
     * types, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @return <p>
     *         Specify a target type to define the kinds of resources the
     *         document can run on. For example, to run a document on EC2
     *         instances, specify the following value: /AWS::EC2::Instance. If
     *         you specify a value of '/' the document can run on all types of
     *         resources. If you don't specify a value, the document can't run
     *         on any resources. For a list of valid resource types, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >AWS Resource Types Reference</a> in the <i>AWS CloudFormation
     *         User Guide</i>.
     *         </p>
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can
     * run on. For example, to run a document on EC2 instances, specify the
     * following value: /AWS::EC2::Instance. If you specify a value of '/' the
     * document can run on all types of resources. If you don't specify a value,
     * the document can't run on any resources. For a list of valid resource
     * types, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @param targetType <p>
     *            Specify a target type to define the kinds of resources the
     *            document can run on. For example, to run a document on EC2
     *            instances, specify the following value: /AWS::EC2::Instance.
     *            If you specify a value of '/' the document can run on all
     *            types of resources. If you don't specify a value, the document
     *            can't run on any resources. For a list of valid resource
     *            types, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >AWS Resource Types Reference</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can
     * run on. For example, to run a document on EC2 instances, specify the
     * following value: /AWS::EC2::Instance. If you specify a value of '/' the
     * document can run on all types of resources. If you don't specify a value,
     * the document can't run on any resources. For a list of valid resource
     * types, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @param targetType <p>
     *            Specify a target type to define the kinds of resources the
     *            document can run on. For example, to run a document on EC2
     *            instances, specify the following value: /AWS::EC2::Instance.
     *            If you specify a value of '/' the document can run on all
     *            types of resources. If you don't specify a value, the document
     *            can't run on any resources. For a list of valid resource
     *            types, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >AWS Resource Types Reference</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an SSM document to
     * identify the types of targets or the environment where it will run. In
     * this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a>
     * action.
     * </p>
     * </note>
     *
     * @return <p>
     *         Optional metadata that you assign to a resource. Tags enable you
     *         to categorize a resource in different ways, such as by purpose,
     *         owner, or environment. For example, you might want to tag an SSM
     *         document to identify the types of targets or the environment
     *         where it will run. In this case, you could specify the following
     *         key name/value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=Environment,Value=Production</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         To add tags to an existing SSM document, use the
     *         <a>AddTagsToResource</a> action.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an SSM document to
     * identify the types of targets or the environment where it will run. In
     * this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a>
     * action.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an SSM document to identify the types of targets or the
     *            environment where it will run. In this case, you could specify
     *            the following key name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing SSM document, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
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
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an SSM document to
     * identify the types of targets or the environment where it will run. In
     * this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a>
     * action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an SSM document to identify the types of targets or the
     *            environment where it will run. In this case, you could specify
     *            the following key name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing SSM document, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withTags(Tag... tags) {
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
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an SSM document to
     * identify the types of targets or the environment where it will run. In
     * this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a>
     * action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an SSM document to identify the types of targets or the
     *            environment where it will run. In this case, you could specify
     *            the following key name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing SSM document, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDocumentRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getRequires() != null)
            sb.append("Requires: " + getRequires() + ",");
        if (getAttachments() != null)
            sb.append("Attachments: " + getAttachments() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getDocumentType() != null)
            sb.append("DocumentType: " + getDocumentType() + ",");
        if (getDocumentFormat() != null)
            sb.append("DocumentFormat: " + getDocumentFormat() + ",");
        if (getTargetType() != null)
            sb.append("TargetType: " + getTargetType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getRequires() == null) ? 0 : getRequires().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentRequest == false)
            return false;
        CreateDocumentRequest other = (CreateDocumentRequest) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getRequires() == null ^ this.getRequires() == null)
            return false;
        if (other.getRequires() != null && other.getRequires().equals(this.getRequires()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
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
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null
                && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
