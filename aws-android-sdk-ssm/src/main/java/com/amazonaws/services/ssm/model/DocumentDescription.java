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

/**
 * <p>
 * Describes a Systems Manager document.
 * </p>
 */
public class DocumentDescription implements Serializable {
    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification.
     * </p>
     */
    private String sha1;

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String hash;

    /**
     * <p>
     * The hash type of the document. Valid values include <code>Sha256</code>
     * or <code>Sha1</code>.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     */
    private String hashType;

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
     * The version of the artifact associated with the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>
     * The AWS user account that created the document.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * The date when the document was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The status of the Systems Manager document.
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
     * The document version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * A description of the document.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     */
    private java.util.List<DocumentParameter> parameters;

    /**
     * <p>
     * The list of OS platforms compatible with this Systems Manager document.
     * </p>
     */
    private java.util.List<String> platformTypes;

    /**
     * <p>
     * The type of document.
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
     * The schema version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     */
    private String schemaVersion;

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String latestVersion;

    /**
     * <p>
     * The default version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String defaultVersion;

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
     * The target type which defines the kinds of resources the document can run
     * on. For example, /AWS::EC2::Instance. For a list of valid resource types,
     * see <a href=
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
     * The tags, or metadata, that have been applied to the document.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Details about the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     */
    private java.util.List<AttachmentInformation> attachmentsInformation;

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
     * The SHA1 hash of the document, which you can use for verification.
     * </p>
     *
     * @return <p>
     *         The SHA1 hash of the document, which you can use for
     *         verification.
     *         </p>
     */
    public String getSha1() {
        return sha1;
    }

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification.
     * </p>
     *
     * @param sha1 <p>
     *            The SHA1 hash of the document, which you can use for
     *            verification.
     *            </p>
     */
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sha1 <p>
     *            The SHA1 hash of the document, which you can use for
     *            verification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Sha256 or Sha1 hash created by the system when the document
     *         was created.
     *         </p>
     *         <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     *         </note>
     */
    public String getHash() {
        return hash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param hash <p>
     *            The Sha256 or Sha1 hash created by the system when the
     *            document was created.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param hash <p>
     *            The Sha256 or Sha1 hash created by the system when the
     *            document was created.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * <p>
     * The hash type of the document. Valid values include <code>Sha256</code>
     * or <code>Sha1</code>.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @return <p>
     *         The hash type of the document. Valid values include
     *         <code>Sha256</code> or <code>Sha1</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     *         </note>
     * @see DocumentHashType
     */
    public String getHashType() {
        return hashType;
    }

    /**
     * <p>
     * The hash type of the document. Valid values include <code>Sha256</code>
     * or <code>Sha1</code>.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param hashType <p>
     *            The hash type of the document. Valid values include
     *            <code>Sha256</code> or <code>Sha1</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @see DocumentHashType
     */
    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    /**
     * <p>
     * The hash type of the document. Valid values include <code>Sha256</code>
     * or <code>Sha1</code>.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param hashType <p>
     *            The hash type of the document. Valid values include
     *            <code>Sha256</code> or <code>Sha1</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentHashType
     */
    public DocumentDescription withHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }

    /**
     * <p>
     * The hash type of the document. Valid values include <code>Sha256</code>
     * or <code>Sha1</code>.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param hashType <p>
     *            The hash type of the document. Valid values include
     *            <code>Sha256</code> or <code>Sha1</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @see DocumentHashType
     */
    public void setHashType(DocumentHashType hashType) {
        this.hashType = hashType.toString();
    }

    /**
     * <p>
     * The hash type of the document. Valid values include <code>Sha256</code>
     * or <code>Sha1</code>.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param hashType <p>
     *            The hash type of the document. Valid values include
     *            <code>Sha256</code> or <code>Sha1</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentHashType
     */
    public DocumentDescription withHashType(DocumentHashType hashType) {
        this.hashType = hashType.toString();
        return this;
    }

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
    public DocumentDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The version of the artifact associated with the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>
     *         The version of the artifact associated with the document.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * The version of the artifact associated with the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            The version of the artifact associated with the document.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The version of the artifact associated with the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            The version of the artifact associated with the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The AWS user account that created the document.
     * </p>
     *
     * @return <p>
     *         The AWS user account that created the document.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The AWS user account that created the document.
     * </p>
     *
     * @param owner <p>
     *            The AWS user account that created the document.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The AWS user account that created the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The AWS user account that created the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The date when the document was created.
     * </p>
     *
     * @return <p>
     *         The date when the document was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date when the document was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date when the document was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the document was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date when the document was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The status of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @return <p>
     *         The status of the Systems Manager document.
     *         </p>
     * @see DocumentStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document.
     *            </p>
     * @see DocumentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentStatus
     */
    public DocumentDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document.
     *            </p>
     * @see DocumentStatus
     */
    public void setStatus(DocumentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Updating, Deleting, Failed
     *
     * @param status <p>
     *            The status of the Systems Manager document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentStatus
     */
    public DocumentDescription withStatus(DocumentStatus status) {
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
    public DocumentDescription withStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
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
    public DocumentDescription withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * A description of the document.
     * </p>
     *
     * @return <p>
     *         A description of the document.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the document.
     * </p>
     *
     * @param description <p>
     *            A description of the document.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     *
     * @return <p>
     *         A description of the parameters for a document.
     *         </p>
     */
    public java.util.List<DocumentParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     *
     * @param parameters <p>
     *            A description of the parameters for a document.
     *            </p>
     */
    public void setParameters(java.util.Collection<DocumentParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<DocumentParameter>(parameters);
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A description of the parameters for a document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withParameters(DocumentParameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<DocumentParameter>(parameters.length);
        }
        for (DocumentParameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A description of the parameters for a document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withParameters(java.util.Collection<DocumentParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The list of OS platforms compatible with this Systems Manager document.
     * </p>
     *
     * @return <p>
     *         The list of OS platforms compatible with this Systems Manager
     *         document.
     *         </p>
     */
    public java.util.List<String> getPlatformTypes() {
        return platformTypes;
    }

    /**
     * <p>
     * The list of OS platforms compatible with this Systems Manager document.
     * </p>
     *
     * @param platformTypes <p>
     *            The list of OS platforms compatible with this Systems Manager
     *            document.
     *            </p>
     */
    public void setPlatformTypes(java.util.Collection<String> platformTypes) {
        if (platformTypes == null) {
            this.platformTypes = null;
            return;
        }

        this.platformTypes = new java.util.ArrayList<String>(platformTypes);
    }

    /**
     * <p>
     * The list of OS platforms compatible with this Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformTypes <p>
     *            The list of OS platforms compatible with this Systems Manager
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withPlatformTypes(String... platformTypes) {
        if (getPlatformTypes() == null) {
            this.platformTypes = new java.util.ArrayList<String>(platformTypes.length);
        }
        for (String value : platformTypes) {
            this.platformTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of OS platforms compatible with this Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformTypes <p>
     *            The list of OS platforms compatible with this Systems Manager
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withPlatformTypes(java.util.Collection<String> platformTypes) {
        setPlatformTypes(platformTypes);
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @return <p>
     *         The type of document.
     *         </p>
     * @see DocumentType
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The type of document.
     *            </p>
     * @see DocumentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The type of document.
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
     *            The type of document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public DocumentDescription withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package,
     * ApplicationConfiguration, ApplicationConfigurationSchema,
     * DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>
     *            The type of document.
     *            </p>
     * @see DocumentType
     */
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>
     * The type of document.
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
     *            The type of document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public DocumentDescription withDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
        return this;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     *
     * @return <p>
     *         The schema version.
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     *
     * @param schemaVersion <p>
     *            The schema version.
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     *
     * @param schemaVersion <p>
     *            The schema version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The latest version of the document.
     *         </p>
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param latestVersion <p>
     *            The latest version of the document.
     *            </p>
     */
    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param latestVersion <p>
     *            The latest version of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * <p>
     * The default version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The default version.
     *         </p>
     */
    public String getDefaultVersion() {
        return defaultVersion;
    }

    /**
     * <p>
     * The default version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param defaultVersion <p>
     *            The default version.
     *            </p>
     */
    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * The default version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param defaultVersion <p>
     *            The default version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
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
    public DocumentDescription withDocumentFormat(String documentFormat) {
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
    public DocumentDescription withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>
     * The target type which defines the kinds of resources the document can run
     * on. For example, /AWS::EC2::Instance. For a list of valid resource types,
     * see <a href=
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
     *         The target type which defines the kinds of resources the document
     *         can run on. For example, /AWS::EC2::Instance. For a list of valid
     *         resource types, see <a href=
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
     * The target type which defines the kinds of resources the document can run
     * on. For example, /AWS::EC2::Instance. For a list of valid resource types,
     * see <a href=
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
     *            The target type which defines the kinds of resources the
     *            document can run on. For example, /AWS::EC2::Instance. For a
     *            list of valid resource types, see <a href=
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
     * The target type which defines the kinds of resources the document can run
     * on. For example, /AWS::EC2::Instance. For a list of valid resource types,
     * see <a href=
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
     *            The target type which defines the kinds of resources the
     *            document can run on. For example, /AWS::EC2::Instance. For a
     *            list of valid resource types, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >AWS Resource Types Reference</a> in the <i>AWS CloudFormation
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * <p>
     * The tags, or metadata, that have been applied to the document.
     * </p>
     *
     * @return <p>
     *         The tags, or metadata, that have been applied to the document.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags, or metadata, that have been applied to the document.
     * </p>
     *
     * @param tags <p>
     *            The tags, or metadata, that have been applied to the document.
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
     * The tags, or metadata, that have been applied to the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags, or metadata, that have been applied to the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withTags(Tag... tags) {
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
     * The tags, or metadata, that have been applied to the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags, or metadata, that have been applied to the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Details about the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     *
     * @return <p>
     *         Details about the document attachments, including names,
     *         locations, sizes, etc.
     *         </p>
     */
    public java.util.List<AttachmentInformation> getAttachmentsInformation() {
        return attachmentsInformation;
    }

    /**
     * <p>
     * Details about the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     *
     * @param attachmentsInformation <p>
     *            Details about the document attachments, including names,
     *            locations, sizes, etc.
     *            </p>
     */
    public void setAttachmentsInformation(
            java.util.Collection<AttachmentInformation> attachmentsInformation) {
        if (attachmentsInformation == null) {
            this.attachmentsInformation = null;
            return;
        }

        this.attachmentsInformation = new java.util.ArrayList<AttachmentInformation>(
                attachmentsInformation);
    }

    /**
     * <p>
     * Details about the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentsInformation <p>
     *            Details about the document attachments, including names,
     *            locations, sizes, etc.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withAttachmentsInformation(
            AttachmentInformation... attachmentsInformation) {
        if (getAttachmentsInformation() == null) {
            this.attachmentsInformation = new java.util.ArrayList<AttachmentInformation>(
                    attachmentsInformation.length);
        }
        for (AttachmentInformation value : attachmentsInformation) {
            this.attachmentsInformation.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details about the document attachments, including names, locations,
     * sizes, etc.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentsInformation <p>
     *            Details about the document attachments, including names,
     *            locations, sizes, etc.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withAttachmentsInformation(
            java.util.Collection<AttachmentInformation> attachmentsInformation) {
        setAttachmentsInformation(attachmentsInformation);
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
    public DocumentDescription withRequires(DocumentRequires... requires) {
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
    public DocumentDescription withRequires(java.util.Collection<DocumentRequires> requires) {
        setRequires(requires);
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
        if (getSha1() != null)
            sb.append("Sha1: " + getSha1() + ",");
        if (getHash() != null)
            sb.append("Hash: " + getHash() + ",");
        if (getHashType() != null)
            sb.append("HashType: " + getHashType() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusInformation() != null)
            sb.append("StatusInformation: " + getStatusInformation() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getPlatformTypes() != null)
            sb.append("PlatformTypes: " + getPlatformTypes() + ",");
        if (getDocumentType() != null)
            sb.append("DocumentType: " + getDocumentType() + ",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: " + getSchemaVersion() + ",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: " + getLatestVersion() + ",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: " + getDefaultVersion() + ",");
        if (getDocumentFormat() != null)
            sb.append("DocumentFormat: " + getDocumentFormat() + ",");
        if (getTargetType() != null)
            sb.append("TargetType: " + getTargetType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getAttachmentsInformation() != null)
            sb.append("AttachmentsInformation: " + getAttachmentsInformation() + ",");
        if (getRequires() != null)
            sb.append("Requires: " + getRequires());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSha1() == null) ? 0 : getSha1().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        hashCode = prime * hashCode + ((getHashType() == null) ? 0 : getHashType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusInformation() == null) ? 0 : getStatusInformation().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformTypes() == null) ? 0 : getPlatformTypes().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttachmentsInformation() == null) ? 0 : getAttachmentsInformation()
                        .hashCode());
        hashCode = prime * hashCode + ((getRequires() == null) ? 0 : getRequires().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentDescription == false)
            return false;
        DocumentDescription other = (DocumentDescription) obj;

        if (other.getSha1() == null ^ this.getSha1() == null)
            return false;
        if (other.getSha1() != null && other.getSha1().equals(this.getSha1()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        if (other.getHashType() == null ^ this.getHashType() == null)
            return false;
        if (other.getHashType() != null && other.getHashType().equals(this.getHashType()) == false)
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
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
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
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getPlatformTypes() == null ^ this.getPlatformTypes() == null)
            return false;
        if (other.getPlatformTypes() != null
                && other.getPlatformTypes().equals(this.getPlatformTypes()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null
                && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null
                && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null
                && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null
                && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
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
        if (other.getAttachmentsInformation() == null ^ this.getAttachmentsInformation() == null)
            return false;
        if (other.getAttachmentsInformation() != null
                && other.getAttachmentsInformation().equals(this.getAttachmentsInformation()) == false)
            return false;
        if (other.getRequires() == null ^ this.getRequires() == null)
            return false;
        if (other.getRequires() != null && other.getRequires().equals(this.getRequires()) == false)
            return false;
        return true;
    }
}
