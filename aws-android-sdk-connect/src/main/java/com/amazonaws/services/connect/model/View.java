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
 * <p>
 * A view resource object. Contains metadata and content necessary to render the
 * view.
 * </p>
 */
public class View implements Serializable {
    /**
     * <p>
     * The identifier of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     */
    private String name;

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     */
    private String status;

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     */
    private String type;

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     */
    private String description;

    /**
     * <p>
     * Current version of the view.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The description of the version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     */
    private ViewContent content;

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or
     * <code>CreateViewVersion</code> operations.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     */
    private String viewContentSha256;

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @return <p>
     *         The identifier of the view.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param id <p>
     *            The identifier of the view.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param id <p>
     *            The identifier of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the view.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the view.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @return <p>
     *         The name of the view.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @param name <p>
     *            The name of the view.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @param name <p>
     *            The name of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @return <p>
     *         Indicates the view status as either <code>SAVED</code> or
     *         <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *         initiate validation on the content.
     *         </p>
     * @see ViewStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public View withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(ViewStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public View withStatus(ViewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @return <p>
     *         The type of the view - <code>CUSTOMER_MANAGED</code>.
     *         </p>
     * @see ViewType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view - <code>CUSTOMER_MANAGED</code>.
     *            </p>
     * @see ViewType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view - <code>CUSTOMER_MANAGED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewType
     */
    public View withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view - <code>CUSTOMER_MANAGED</code>.
     *            </p>
     * @see ViewType
     */
    public void setType(ViewType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the view - <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view - <code>CUSTOMER_MANAGED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewType
     */
    public View withType(ViewType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @return <p>
     *         The description of the view.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param description <p>
     *            The description of the view.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param description <p>
     *            The description of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Current version of the view.
     * </p>
     *
     * @return <p>
     *         Current version of the view.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * Current version of the view.
     * </p>
     *
     * @param version <p>
     *            Current version of the view.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * Current version of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            Current version of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @return <p>
     *         The description of the version.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param versionDescription <p>
     *            The description of the version.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param versionDescription <p>
     *            The description of the version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     *
     * @return <p>
     *         View content containing all content necessary to render a view
     *         except for runtime input data.
     *         </p>
     */
    public ViewContent getContent() {
        return content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data.
     *            </p>
     */
    public void setContent(ViewContent content) {
        this.content = content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withContent(ViewContent content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).
     * </p>
     *
     * @return <p>
     *         The tags associated with the view resource (not specific to view
     *         version).
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the view resource (not specific to
     *            view version).
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the view resource (not specific to
     *            view version).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags associated with the view resource (not specific to view
     * version).
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
    public View addTagsEntry(String key, String value) {
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
    public View clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     *
     * @return <p>
     *         The timestamp of when the view was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp of when the view was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp of when the view was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp of when the view was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or
     * <code>CreateViewVersion</code> operations.
     * </p>
     *
     * @return <p>
     *         Latest timestamp of the <code>UpdateViewContent</code> or
     *         <code>CreateViewVersion</code> operations.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or
     * <code>CreateViewVersion</code> operations.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Latest timestamp of the <code>UpdateViewContent</code> or
     *            <code>CreateViewVersion</code> operations.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Latest timestamp of the <code>UpdateViewContent</code> or
     * <code>CreateViewVersion</code> operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Latest timestamp of the <code>UpdateViewContent</code> or
     *            <code>CreateViewVersion</code> operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     *
     * @return <p>
     *         Indicates the checksum value of the latest published view
     *         content.
     *         </p>
     */
    public String getViewContentSha256() {
        return viewContentSha256;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     *
     * @param viewContentSha256 <p>
     *            Indicates the checksum value of the latest published view
     *            content.
     *            </p>
     */
    public void setViewContentSha256(String viewContentSha256) {
        this.viewContentSha256 = viewContentSha256;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     *
     * @param viewContentSha256 <p>
     *            Indicates the checksum value of the latest published view
     *            content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withViewContentSha256(String viewContentSha256) {
        this.viewContentSha256 = viewContentSha256;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getViewContentSha256() != null)
            sb.append("ViewContentSha256: " + getViewContentSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getViewContentSha256() == null) ? 0 : getViewContentSha256().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof View == false)
            return false;
        View other = (View) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getViewContentSha256() == null ^ this.getViewContentSha256() == null)
            return false;
        if (other.getViewContentSha256() != null
                && other.getViewContentSha256().equals(this.getViewContentSha256()) == false)
            return false;
        return true;
    }
}
