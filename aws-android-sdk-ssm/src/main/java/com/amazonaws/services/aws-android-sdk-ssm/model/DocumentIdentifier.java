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
 * <p>Describes the name of a Systems Manager document.</p>
 */
public class DocumentIdentifier implements Serializable {
    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The AWS user account that created the document.</p>
     */
    private String owner;

    /**
     * <p>An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>The operating system platform. </p>
     */
    private java.util.List<String> platformTypes;

    /**
     * <p>The document version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>The document type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package, ApplicationConfiguration, ApplicationConfigurationSchema, DeploymentStrategy, ChangeCalendar
     */
    private String documentType;

    /**
     * <p>The schema version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     */
    private String schemaVersion;

    /**
     * <p>The document format, either JSON or YAML.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     */
    private String documentFormat;

    /**
     * <p>The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS resource and property types reference</a> in the <i>AWS CloudFormation User Guide</i>. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     */
    private String targetType;

    /**
     * <p>The tags, or metadata, that have been applied to the document.</p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     */
    private java.util.List<DocumentRequires> requires;

    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>The name of the Systems Manager document.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>The name of the Systems Manager document.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the Systems Manager document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>The name of the Systems Manager document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The AWS user account that created the document.</p>
     *
     * @return <p>The AWS user account that created the document.</p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>The AWS user account that created the document.</p>
     *
     * @param owner <p>The AWS user account that created the document.</p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>The AWS user account that created the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owner <p>The AWS user account that created the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>The operating system platform. </p>
     *
     * @return <p>The operating system platform. </p>
     */
    public java.util.List<String> getPlatformTypes() {
        return platformTypes;
    }

    /**
     * <p>The operating system platform. </p>
     *
     * @param platformTypes <p>The operating system platform. </p>
     */
    public void setPlatformTypes(java.util.Collection<String> platformTypes) {
        if (platformTypes == null) {
            this.platformTypes = null;
            return;
        }

        this.platformTypes = new java.util.ArrayList<String>(platformTypes);
    }

    /**
     * <p>The operating system platform. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platformTypes <p>The operating system platform. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withPlatformTypes(String... platformTypes) {
        if (getPlatformTypes() == null) {
            this.platformTypes = new java.util.ArrayList<String>(platformTypes.length);
        }
        for (String value : platformTypes) {
            this.platformTypes.add(value);
        }
        return this;
    }

    /**
     * <p>The operating system platform. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platformTypes <p>The operating system platform. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withPlatformTypes(java.util.Collection<String> platformTypes) {
        setPlatformTypes(platformTypes);
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
    public DocumentIdentifier withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>The document type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package, ApplicationConfiguration, ApplicationConfigurationSchema, DeploymentStrategy, ChangeCalendar
     *
     * @return <p>The document type.</p>
     *
     * @see DocumentType
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * <p>The document type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package, ApplicationConfiguration, ApplicationConfigurationSchema, DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>The document type.</p>
     *
     * @see DocumentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>The document type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package, ApplicationConfiguration, ApplicationConfigurationSchema, DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>The document type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentType
     */
    public DocumentIdentifier withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * <p>The document type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package, ApplicationConfiguration, ApplicationConfigurationSchema, DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>The document type.</p>
     *
     * @see DocumentType
     */
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>The document type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Policy, Automation, Session, Package, ApplicationConfiguration, ApplicationConfigurationSchema, DeploymentStrategy, ChangeCalendar
     *
     * @param documentType <p>The document type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentType
     */
    public DocumentIdentifier withDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
        return this;
    }

    /**
     * <p>The schema version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     *
     * @return <p>The schema version.</p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>The schema version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     *
     * @param schemaVersion <p>The schema version.</p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>The schema version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]+)\.([0-9]+)<br/>
     *
     * @param schemaVersion <p>The schema version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
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
    public DocumentIdentifier withDocumentFormat(String documentFormat) {
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
    public DocumentIdentifier withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS resource and property types reference</a> in the <i>AWS CloudFormation User Guide</i>. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @return <p>The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS resource and property types reference</a> in the <i>AWS CloudFormation User Guide</i>. </p>
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * <p>The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS resource and property types reference</a> in the <i>AWS CloudFormation User Guide</i>. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @param targetType <p>The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS resource and property types reference</a> in the <i>AWS CloudFormation User Guide</i>. </p>
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS resource and property types reference</a> in the <i>AWS CloudFormation User Guide</i>. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     * <b>Pattern: </b>^\/[\w\.\-\:\/]*$<br/>
     *
     * @param targetType <p>The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS resource and property types reference</a> in the <i>AWS CloudFormation User Guide</i>. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * <p>The tags, or metadata, that have been applied to the document.</p>
     *
     * @return <p>The tags, or metadata, that have been applied to the document.</p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>The tags, or metadata, that have been applied to the document.</p>
     *
     * @param tags <p>The tags, or metadata, that have been applied to the document.</p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>The tags, or metadata, that have been applied to the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The tags, or metadata, that have been applied to the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>The tags, or metadata, that have been applied to the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The tags, or metadata, that have been applied to the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     *
     * @return <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     */
    public java.util.List<DocumentRequires> getRequires() {
        return requires;
    }

    /**
     * <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     *
     * @param requires <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     */
    public void setRequires(java.util.Collection<DocumentRequires> requires) {
        if (requires == null) {
            this.requires = null;
            return;
        }

        this.requires = new java.util.ArrayList<DocumentRequires>(requires);
    }

    /**
     * <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requires <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withRequires(DocumentRequires... requires) {
        if (getRequires() == null) {
            this.requires = new java.util.ArrayList<DocumentRequires>(requires.length);
        }
        for (DocumentRequires value : requires) {
            this.requires.add(value);
        }
        return this;
    }

    /**
     * <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requires <p>A list of SSM documents required by a document. For example, an <code>ApplicationConfiguration</code> document requires an <code>ApplicationConfigurationSchema</code> document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentIdentifier withRequires(java.util.Collection<DocumentRequires> requires) {
        setRequires(requires);
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
        if (getOwner() != null) sb.append("Owner: " + getOwner() + ",");
        if (getVersionName() != null) sb.append("VersionName: " + getVersionName() + ",");
        if (getPlatformTypes() != null) sb.append("PlatformTypes: " + getPlatformTypes() + ",");
        if (getDocumentVersion() != null) sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getDocumentType() != null) sb.append("DocumentType: " + getDocumentType() + ",");
        if (getSchemaVersion() != null) sb.append("SchemaVersion: " + getSchemaVersion() + ",");
        if (getDocumentFormat() != null) sb.append("DocumentFormat: " + getDocumentFormat() + ",");
        if (getTargetType() != null) sb.append("TargetType: " + getTargetType() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getRequires() != null) sb.append("Requires: " + getRequires());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getPlatformTypes() == null) ? 0 : getPlatformTypes().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRequires() == null) ? 0 : getRequires().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DocumentIdentifier == false) return false;
        DocumentIdentifier other = (DocumentIdentifier)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null) return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false) return false;
        if (other.getPlatformTypes() == null ^ this.getPlatformTypes() == null) return false;
        if (other.getPlatformTypes() != null && other.getPlatformTypes().equals(this.getPlatformTypes()) == false) return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null) return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false) return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null) return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false) return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null) return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false) return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null) return false;
        if (other.getDocumentFormat() != null && other.getDocumentFormat().equals(this.getDocumentFormat()) == false) return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null) return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        if (other.getRequires() == null ^ this.getRequires() == null) return false;
        if (other.getRequires() != null && other.getRequires().equals(this.getRequires()) == false) return false;
        return true;
    }
}
