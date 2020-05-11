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

/**
 * <p>
 * Summary information for a Amazon Kendra data source. Returned in a call to .
 * </p>
 */
public class DataSourceSummary implements Serializable {
    /**
     * <p>
     * The name of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String id;

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
     * The UNIX datetime that the data source was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The UNIX datetime that the data source was lasted updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The status of the data source. When the status is <code>ATIVE</code> the
     * data source is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     */
    private String status;

    /**
     * <p>
     * The name of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The name of the data source.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name of the data source.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
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
     *            The name of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The unique identifier for the data source.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param id <p>
     *            The unique identifier for the data source.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the data source.
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
     *            The unique identifier for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSummary withId(String id) {
        this.id = id;
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
    public DataSourceSummary withType(String type) {
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
    public DataSourceSummary withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the data source was created.
     * </p>
     *
     * @return <p>
     *         The UNIX datetime that the data source was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The UNIX datetime that the data source was created.
     * </p>
     *
     * @param createdAt <p>
     *            The UNIX datetime that the data source was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The UNIX datetime that the data source was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The UNIX datetime that the data source was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the data source was lasted updated.
     * </p>
     *
     * @return <p>
     *         The UNIX datetime that the data source was lasted updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The UNIX datetime that the data source was lasted updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The UNIX datetime that the data source was lasted updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The UNIX datetime that the data source was lasted updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The UNIX datetime that the data source was lasted updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSummary withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * <p>
     * The status of the data source. When the status is <code>ATIVE</code> the
     * data source is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @return <p>
     *         The status of the data source. When the status is
     *         <code>ATIVE</code> the data source is ready to use.
     *         </p>
     * @see DataSourceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the data source. When the status is <code>ATIVE</code> the
     * data source is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The status of the data source. When the status is
     *            <code>ATIVE</code> the data source is ready to use.
     *            </p>
     * @see DataSourceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source. When the status is <code>ATIVE</code> the
     * data source is ready to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The status of the data source. When the status is
     *            <code>ATIVE</code> the data source is ready to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceStatus
     */
    public DataSourceSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the data source. When the status is <code>ATIVE</code> the
     * data source is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The status of the data source. When the status is
     *            <code>ATIVE</code> the data source is ready to use.
     *            </p>
     * @see DataSourceStatus
     */
    public void setStatus(DataSourceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the data source. When the status is <code>ATIVE</code> the
     * data source is ready to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, UPDATING, ACTIVE
     *
     * @param status <p>
     *            The status of the data source. When the status is
     *            <code>ATIVE</code> the data source is ready to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceStatus
     */
    public DataSourceSummary withStatus(DataSourceStatus status) {
        this.status = status.toString();
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceSummary == false)
            return false;
        DataSourceSummary other = (DataSourceSummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
