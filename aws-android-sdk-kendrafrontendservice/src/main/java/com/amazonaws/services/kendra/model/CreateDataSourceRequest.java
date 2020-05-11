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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a data source that you use to with an Amazon Kendra index.
 * </p>
 * <p>
 * You specify a name, connector type and description for your data source. You
 * can choose between an S3 connector, a SharePoint Online connector, and a
 * database connector.
 * </p>
 * <p>
 * You also specify configuration information such as document metadata (author,
 * source URI, and so on) and user context information.
 * </p>
 * <p>
 * <code>CreateDataSource</code> is a synchronous operation. The operation
 * returns 200 if the data source was successfully created. Otherwise, an
 * exception is raised.
 * </p>
 */
public class CreateDataSourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed
     * without deleting and recreating the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * The identifier of the index that should be associated with this data
     * source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     */
    private String type;

    /**
     * <p>
     * The connector configuration information that is required to access the
     * repository.
     * </p>
     */
    private DataSourceConfiguration configuration;

    /**
     * <p>
     * A description for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String description;

    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your
     * repository and update the index. If you don't set a schedule Amazon
     * Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the
     * data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
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
     * A list of key-value pairs that identify the data source. You can use the
     * tags to identify and organize your resources and to control access to
     * resources.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed
     * without deleting and recreating the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         A unique name for the data source. A data source name can't be
     *         changed without deleting and recreating the data source.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed
     * without deleting and recreating the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            A unique name for the data source. A data source name can't be
     *            changed without deleting and recreating the data source.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the data source. A data source name can't be changed
     * without deleting and recreating the data source.
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
     *            A unique name for the data source. A data source name can't be
     *            changed without deleting and recreating the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The identifier of the index that should be associated with this data
     * source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index that should be associated with this
     *         data source.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The identifier of the index that should be associated with this data
     * source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that should be associated with
     *            this data source.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that should be associated with this data
     * source.
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
     *            The identifier of the index that should be associated with
     *            this data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @return <p>
     *         The type of repository that contains the data source.
     *         </p>
     * @see DataSourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @param type <p>
     *            The type of repository that contains the data source.
     *            </p>
     * @see DataSourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
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
     *            The type of repository that contains the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public CreateDataSourceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of repository that contains the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE,
     * SERVICENOW
     *
     * @param type <p>
     *            The type of repository that contains the data source.
     *            </p>
     * @see DataSourceType
     */
    public void setType(DataSourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of repository that contains the data source.
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
     *            The type of repository that contains the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceType
     */
    public CreateDataSourceRequest withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The connector configuration information that is required to access the
     * repository.
     * </p>
     *
     * @return <p>
     *         The connector configuration information that is required to
     *         access the repository.
     *         </p>
     */
    public DataSourceConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The connector configuration information that is required to access the
     * repository.
     * </p>
     *
     * @param configuration <p>
     *            The connector configuration information that is required to
     *            access the repository.
     *            </p>
     */
    public void setConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The connector configuration information that is required to access the
     * repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            The connector configuration information that is required to
     *            access the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * <p>
     * A description for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         A description for the data source.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            A description for the data source.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the data source.
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
     *            A description for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your
     * repository and update the index. If you don't set a schedule Amazon
     * Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     *
     * @return <p>
     *         Sets the frequency that Amazon Kendra will check the documents in
     *         your repository and update the index. If you don't set a schedule
     *         Amazon Kendra will not periodically update the index. You can
     *         call the <code>StartDataSourceSyncJob</code> operation to update
     *         the index.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your
     * repository and update the index. If you don't set a schedule Amazon
     * Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     *
     * @param schedule <p>
     *            Sets the frequency that Amazon Kendra will check the documents
     *            in your repository and update the index. If you don't set a
     *            schedule Amazon Kendra will not periodically update the index.
     *            You can call the <code>StartDataSourceSyncJob</code> operation
     *            to update the index.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Sets the frequency that Amazon Kendra will check the documents in your
     * repository and update the index. If you don't set a schedule Amazon
     * Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> operation to update the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            Sets the frequency that Amazon Kendra will check the documents
     *            in your repository and update the index. If you don't set a
     *            schedule Amazon Kendra will not periodically update the index.
     *            You can call the <code>StartDataSourceSyncJob</code> operation
     *            to update the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the
     * data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a role with permission to
     *         access the data source. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     *         Roles for Amazon Kendra</a>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the
     * data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of a role with permission to
     *            access the data source. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html"
     *            >IAM Roles for Amazon Kendra</a>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the
     * data source. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
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
     *            The Amazon Resource Name (ARN) of a role with permission to
     *            access the data source. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html"
     *            >IAM Roles for Amazon Kendra</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the data source. You can use the
     * tags to identify and organize your resources and to control access to
     * resources.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that identify the data source. You can
     *         use the tags to identify and organize your resources and to
     *         control access to resources.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the data source. You can use the
     * tags to identify and organize your resources and to control access to
     * resources.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the data source. You
     *            can use the tags to identify and organize your resources and
     *            to control access to resources.
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
     * A list of key-value pairs that identify the data source. You can use the
     * tags to identify and organize your resources and to control access to
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the data source. You
     *            can use the tags to identify and organize your resources and
     *            to control access to resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withTags(Tag... tags) {
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
     * A list of key-value pairs that identify the data source. You can use the
     * tags to identify and organize your resources and to control access to
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that identify the data source. You
     *            can use the tags to identify and organize your resources and
     *            to control access to resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getIndexId() != null)
            sb.append("IndexId: " + getIndexId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
