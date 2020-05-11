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

public class DescribeDataSourceResult implements Serializable {
    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * The name that you gave the data source when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     */
    private String type;

    /**
     * <p>
     * Information that describes where the data source is located and how the
     * data source is configured. The specific information in the description
     * depends on the data source provider.
     * </p>
     */
    private DataSourceConfiguration configuration;

    /**
     * <p>
     * The Unix timestamp of when the data source was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Unix timestamp of when the data source was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The description of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String description;

    /**
     * <p>
     * The current status of the data source. When the status is
     * <code>ACTIVE</code> the data source is ready to use. When the status is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     * reason that the data source failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     */
    private String status;

    /**
     * <p>
     * The schedule that Amazon Kendra will update the data source.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that enables the data source
     * to access its resources.
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
     * When the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the data source to fail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The identifier of the data source.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param id <p>
     *            The identifier of the data source.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param id <p>
     *            The identifier of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index that contains the data source.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the data source.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * The name that you gave the data source when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The name that you gave the data source when it was created.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name that you gave the data source when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name that you gave the data source when it was created.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you gave the data source when it was created.
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
     *            The name that you gave the data source when it was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @return <p>
     *         The type of the data source.
     *         </p>
     * @see DataSourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @param type <p>
     *            The type of the data source.
     *            </p>
     * @see DataSourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @param type <p>
     *            The type of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public DescribeDataSourceResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @param type <p>
     *            The type of the data source.
     *            </p>
     * @see DataSourceType
     */
    public void setType(DataSourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @param type <p>
     *            The type of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public DescribeDataSourceResult withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information that describes where the data source is located and how the
     * data source is configured. The specific information in the description
     * depends on the data source provider.
     * </p>
     *
     * @return <p>
     *         Information that describes where the data source is located and
     *         how the data source is configured. The specific information in
     *         the description depends on the data source provider.
     *         </p>
     */
    public DataSourceConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * Information that describes where the data source is located and how the
     * data source is configured. The specific information in the description
     * depends on the data source provider.
     * </p>
     *
     * @param configuration <p>
     *            Information that describes where the data source is located
     *            and how the data source is configured. The specific
     *            information in the description depends on the data source
     *            provider.
     *            </p>
     */
    public void setConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Information that describes where the data source is located and how the
     * data source is configured. The specific information in the description
     * depends on the data source provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            Information that describes where the data source is located
     *            and how the data source is configured. The specific
     *            information in the description depends on the data source
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp of when the data source was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source was created.
     * </p>
     *
     * @param createdAt <p>
     *            The Unix timestamp of when the data source was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix timestamp of when the data source was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source was last updated.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp of when the data source was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source was last updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The Unix timestamp of when the data source was last updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The Unix timestamp of when the data source was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         The description of the data source.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            The description of the data source.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data source.
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
     *            The description of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The current status of the data source. When the status is
     * <code>ACTIVE</code> the data source is ready to use. When the status is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     * reason that the data source failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @return <p>
     *         The current status of the data source. When the status is
     *         <code>ACTIVE</code> the data source is ready to use. When the
     *         status is <code>FAILED</code>, the <code>ErrorMessage</code>
     *         field contains the reason that the data source failed.
     *         </p>
     * @see DataSourceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the data source. When the status is
     * <code>ACTIVE</code> the data source is ready to use. When the status is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     * reason that the data source failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The current status of the data source. When the status is
     *            <code>ACTIVE</code> the data source is ready to use. When the
     *            status is <code>FAILED</code>, the <code>ErrorMessage</code>
     *            field contains the reason that the data source failed.
     *            </p>
     * @see DataSourceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the data source. When the status is
     * <code>ACTIVE</code> the data source is ready to use. When the status is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     * reason that the data source failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The current status of the data source. When the status is
     *            <code>ACTIVE</code> the data source is ready to use. When the
     *            status is <code>FAILED</code>, the <code>ErrorMessage</code>
     *            field contains the reason that the data source failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceStatus
     */
    public DescribeDataSourceResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the data source. When the status is
     * <code>ACTIVE</code> the data source is ready to use. When the status is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     * reason that the data source failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The current status of the data source. When the status is
     *            <code>ACTIVE</code> the data source is ready to use. When the
     *            status is <code>FAILED</code>, the <code>ErrorMessage</code>
     *            field contains the reason that the data source failed.
     *            </p>
     * @see DataSourceStatus
     */
    public void setStatus(DataSourceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the data source. When the status is
     * <code>ACTIVE</code> the data source is ready to use. When the status is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     * reason that the data source failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The current status of the data source. When the status is
     *            <code>ACTIVE</code> the data source is ready to use. When the
     *            status is <code>FAILED</code>, the <code>ErrorMessage</code>
     *            field contains the reason that the data source failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceStatus
     */
    public DescribeDataSourceResult withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The schedule that Amazon Kendra will update the data source.
     * </p>
     *
     * @return <p>
     *         The schedule that Amazon Kendra will update the data source.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule that Amazon Kendra will update the data source.
     * </p>
     *
     * @param schedule <p>
     *            The schedule that Amazon Kendra will update the data source.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule that Amazon Kendra will update the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            The schedule that Amazon Kendra will update the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that enables the data source
     * to access its resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role that enables the data
     *         source to access its resources.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that enables the data source
     * to access its resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role that enables the
     *            data source to access its resources.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that enables the data source
     * to access its resources.
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
     *            The Amazon Resource Name (ARN) of the role that enables the
     *            data source to access its resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the data source to fail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         When the <code>Status</code> field value is <code>FAILED</code>,
     *         the <code>ErrorMessage</code> field contains a description of the
     *         error that caused the data source to fail.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the data source to fail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param errorMessage <p>
     *            When the <code>Status</code> field value is
     *            <code>FAILED</code>, the <code>ErrorMessage</code> field
     *            contains a description of the error that caused the data
     *            source to fail.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the data source to fail.
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
     *            When the <code>Status</code> field value is
     *            <code>FAILED</code>, the <code>ErrorMessage</code> field
     *            contains a description of the error that caused the data
     *            source to fail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataSourceResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIndexId() != null)
            sb.append("IndexId: " + getIndexId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataSourceResult == false)
            return false;
        DescribeDataSourceResult other = (DescribeDataSourceResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
