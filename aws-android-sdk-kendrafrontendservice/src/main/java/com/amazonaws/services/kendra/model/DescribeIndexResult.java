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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

public class DescribeIndexResult implements Serializable {
    /**
     * <p>
     * The name of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * the name of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Kendra edition used for the index. You decide the edition when
     * you create the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     */
    private String edition;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra
     * permission to write to your Amazon Cloudwatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt
     * your data. Amazon Kendra doesn't support asymmetric CMKs.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>,
     * the index is ready for use. If the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     */
    private String status;

    /**
     * <p>
     * The description of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String description;

    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the
     * index.
     * </p>
     */
    private java.util.List<DocumentMetadataConfiguration> documentMetadataConfigurations;

    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and
     * the number of text documents indexed.
     * </p>
     */
    private IndexStatistics indexStatistics;

    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String errorMessage;

    /**
     * <p>
     * For enterprise edtion indexes, you can choose to use additional capacity
     * to meet the needs of your application. This contains the capacity units
     * used for the index. A 0 for the query capacity or the storage capacity
     * indicates that the index is using the default capacity for the index.
     * </p>
     */
    private CapacityUnitsConfiguration capacityUnits;

    /**
     * <p>
     * The name of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The name of the index.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name of the index.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name of the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * the name of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         the name of the index.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * the name of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param id <p>
     *            the name of the index.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * the name of the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param id <p>
     *            the name of the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Kendra edition used for the index. You decide the edition when
     * you create the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @return <p>
     *         The Amazon Kendra edition used for the index. You decide the
     *         edition when you create the index.
     *         </p>
     * @see IndexEdition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * <p>
     * The Amazon Kendra edition used for the index. You decide the edition when
     * you create the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition used for the index. You decide the
     *            edition when you create the index.
     *            </p>
     * @see IndexEdition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The Amazon Kendra edition used for the index. You decide the edition when
     * you create the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition used for the index. You decide the
     *            edition when you create the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexEdition
     */
    public DescribeIndexResult withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    /**
     * <p>
     * The Amazon Kendra edition used for the index. You decide the edition when
     * you create the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition used for the index. You decide the
     *            edition when you create the index.
     *            </p>
     * @see IndexEdition
     */
    public void setEdition(IndexEdition edition) {
        this.edition = edition.toString();
    }

    /**
     * <p>
     * The Amazon Kendra edition used for the index. You decide the edition when
     * you create the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            The Amazon Kendra edition used for the index. You decide the
     *            edition when you create the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexEdition
     */
    public DescribeIndexResult withEdition(IndexEdition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra
     * permission to write to your Amazon Cloudwatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that gives Amazon
     *         Kendra permission to write to your Amazon Cloudwatch logs.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra
     * permission to write to your Amazon Cloudwatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that gives
     *            Amazon Kendra permission to write to your Amazon Cloudwatch
     *            logs.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra
     * permission to write to your Amazon Cloudwatch logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that gives
     *            Amazon Kendra permission to write to your Amazon Cloudwatch
     *            logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt
     * your data. Amazon Kendra doesn't support asymmetric CMKs.
     * </p>
     *
     * @return <p>
     *         The identifier of the AWS KMS customer master key (CMK) used to
     *         encrypt your data. Amazon Kendra doesn't support asymmetric CMKs.
     *         </p>
     */
    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt
     * your data. Amazon Kendra doesn't support asymmetric CMKs.
     * </p>
     *
     * @param serverSideEncryptionConfiguration <p>
     *            The identifier of the AWS KMS customer master key (CMK) used
     *            to encrypt your data. Amazon Kendra doesn't support asymmetric
     *            CMKs.
     *            </p>
     */
    public void setServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt
     * your data. Amazon Kendra doesn't support asymmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryptionConfiguration <p>
     *            The identifier of the AWS KMS customer master key (CMK) used
     *            to encrypt your data. Amazon Kendra doesn't support asymmetric
     *            CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>,
     * the index is ready for use. If the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @return <p>
     *         The current status of the index. When the value is
     *         <code>ACTIVE</code>, the index is ready for use. If the
     *         <code>Status</code> field value is <code>FAILED</code>, the
     *         <code>ErrorMessage</code> field contains a message that explains
     *         why.
     *         </p>
     * @see IndexStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>,
     * the index is ready for use. If the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @param status <p>
     *            The current status of the index. When the value is
     *            <code>ACTIVE</code>, the index is ready for use. If the
     *            <code>Status</code> field value is <code>FAILED</code>, the
     *            <code>ErrorMessage</code> field contains a message that
     *            explains why.
     *            </p>
     * @see IndexStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>,
     * the index is ready for use. If the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @param status <p>
     *            The current status of the index. When the value is
     *            <code>ACTIVE</code>, the index is ready for use. If the
     *            <code>Status</code> field value is <code>FAILED</code>, the
     *            <code>ErrorMessage</code> field contains a message that
     *            explains why.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public DescribeIndexResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>,
     * the index is ready for use. If the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @param status <p>
     *            The current status of the index. When the value is
     *            <code>ACTIVE</code>, the index is ready for use. If the
     *            <code>Status</code> field value is <code>FAILED</code>, the
     *            <code>ErrorMessage</code> field contains a message that
     *            explains why.
     *            </p>
     * @see IndexStatus
     */
    public void setStatus(IndexStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>,
     * the index is ready for use. If the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @param status <p>
     *            The current status of the index. When the value is
     *            <code>ACTIVE</code>, the index is ready for use. If the
     *            <code>Status</code> field value is <code>FAILED</code>, the
     *            <code>ErrorMessage</code> field contains a message that
     *            explains why.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public DescribeIndexResult withStatus(IndexStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         The description of the index.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            The description of the index.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            The description of the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     *
     * @return <p>
     *         The Unix datetime that the index was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     *
     * @param createdAt <p>
     *            The Unix datetime that the index was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix datetime that the index was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     *
     * @return <p>
     *         The Unix datetime that the index was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The Unix datetime that the index was last updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The Unix datetime that the index was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the
     * index.
     * </p>
     *
     * @return <p>
     *         Configuration settings for any metadata applied to the documents
     *         in the index.
     *         </p>
     */
    public java.util.List<DocumentMetadataConfiguration> getDocumentMetadataConfigurations() {
        return documentMetadataConfigurations;
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the
     * index.
     * </p>
     *
     * @param documentMetadataConfigurations <p>
     *            Configuration settings for any metadata applied to the
     *            documents in the index.
     *            </p>
     */
    public void setDocumentMetadataConfigurations(
            java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurations) {
        if (documentMetadataConfigurations == null) {
            this.documentMetadataConfigurations = null;
            return;
        }

        this.documentMetadataConfigurations = new java.util.ArrayList<DocumentMetadataConfiguration>(
                documentMetadataConfigurations);
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the
     * index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadataConfigurations <p>
     *            Configuration settings for any metadata applied to the
     *            documents in the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withDocumentMetadataConfigurations(
            DocumentMetadataConfiguration... documentMetadataConfigurations) {
        if (getDocumentMetadataConfigurations() == null) {
            this.documentMetadataConfigurations = new java.util.ArrayList<DocumentMetadataConfiguration>(
                    documentMetadataConfigurations.length);
        }
        for (DocumentMetadataConfiguration value : documentMetadataConfigurations) {
            this.documentMetadataConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the
     * index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadataConfigurations <p>
     *            Configuration settings for any metadata applied to the
     *            documents in the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withDocumentMetadataConfigurations(
            java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurations) {
        setDocumentMetadataConfigurations(documentMetadataConfigurations);
        return this;
    }

    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and
     * the number of text documents indexed.
     * </p>
     *
     * @return <p>
     *         Provides information about the number of FAQ questions and
     *         answers and the number of text documents indexed.
     *         </p>
     */
    public IndexStatistics getIndexStatistics() {
        return indexStatistics;
    }

    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and
     * the number of text documents indexed.
     * </p>
     *
     * @param indexStatistics <p>
     *            Provides information about the number of FAQ questions and
     *            answers and the number of text documents indexed.
     *            </p>
     */
    public void setIndexStatistics(IndexStatistics indexStatistics) {
        this.indexStatistics = indexStatistics;
    }

    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and
     * the number of text documents indexed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexStatistics <p>
     *            Provides information about the number of FAQ questions and
     *            answers and the number of text documents indexed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withIndexStatistics(IndexStatistics indexStatistics) {
        this.indexStatistics = indexStatistics;
        return this;
    }

    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         When th e<code>Status</code> field value is <code>FAILED</code>,
     *         the <code>ErrorMessage</code> field contains a message that
     *         explains why.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param errorMessage <p>
     *            When th e<code>Status</code> field value is
     *            <code>FAILED</code>, the <code>ErrorMessage</code> field
     *            contains a message that explains why.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a message that explains why.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param errorMessage <p>
     *            When th e<code>Status</code> field value is
     *            <code>FAILED</code>, the <code>ErrorMessage</code> field
     *            contains a message that explains why.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * For enterprise edtion indexes, you can choose to use additional capacity
     * to meet the needs of your application. This contains the capacity units
     * used for the index. A 0 for the query capacity or the storage capacity
     * indicates that the index is using the default capacity for the index.
     * </p>
     *
     * @return <p>
     *         For enterprise edtion indexes, you can choose to use additional
     *         capacity to meet the needs of your application. This contains the
     *         capacity units used for the index. A 0 for the query capacity or
     *         the storage capacity indicates that the index is using the
     *         default capacity for the index.
     *         </p>
     */
    public CapacityUnitsConfiguration getCapacityUnits() {
        return capacityUnits;
    }

    /**
     * <p>
     * For enterprise edtion indexes, you can choose to use additional capacity
     * to meet the needs of your application. This contains the capacity units
     * used for the index. A 0 for the query capacity or the storage capacity
     * indicates that the index is using the default capacity for the index.
     * </p>
     *
     * @param capacityUnits <p>
     *            For enterprise edtion indexes, you can choose to use
     *            additional capacity to meet the needs of your application.
     *            This contains the capacity units used for the index. A 0 for
     *            the query capacity or the storage capacity indicates that the
     *            index is using the default capacity for the index.
     *            </p>
     */
    public void setCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        this.capacityUnits = capacityUnits;
    }

    /**
     * <p>
     * For enterprise edtion indexes, you can choose to use additional capacity
     * to meet the needs of your application. This contains the capacity units
     * used for the index. A 0 for the query capacity or the storage capacity
     * indicates that the index is using the default capacity for the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityUnits <p>
     *            For enterprise edtion indexes, you can choose to use
     *            additional capacity to meet the needs of your application.
     *            This contains the capacity units used for the index. A 0 for
     *            the query capacity or the storage capacity indicates that the
     *            index is using the default capacity for the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        this.capacityUnits = capacityUnits;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getEdition() != null)
            sb.append("Edition: " + getEdition() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: "
                    + getServerSideEncryptionConfiguration() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt() + ",");
        if (getDocumentMetadataConfigurations() != null)
            sb.append("DocumentMetadataConfigurations: " + getDocumentMetadataConfigurations()
                    + ",");
        if (getIndexStatistics() != null)
            sb.append("IndexStatistics: " + getIndexStatistics() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getCapacityUnits() != null)
            sb.append("CapacityUnits: " + getCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerSideEncryptionConfiguration() == null) ? 0
                        : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentMetadataConfigurations() == null) ? 0
                        : getDocumentMetadataConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getIndexStatistics() == null) ? 0 : getIndexStatistics().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIndexResult == false)
            return false;
        DescribeIndexResult other = (DescribeIndexResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null
                ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(
                        this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDocumentMetadataConfigurations() == null
                ^ this.getDocumentMetadataConfigurations() == null)
            return false;
        if (other.getDocumentMetadataConfigurations() != null
                && other.getDocumentMetadataConfigurations().equals(
                        this.getDocumentMetadataConfigurations()) == false)
            return false;
        if (other.getIndexStatistics() == null ^ this.getIndexStatistics() == null)
            return false;
        if (other.getIndexStatistics() != null
                && other.getIndexStatistics().equals(this.getIndexStatistics()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null
                && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
            return false;
        return true;
    }
}
