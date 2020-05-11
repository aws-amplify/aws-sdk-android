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
 * A summary of information about an index.
 * </p>
 */
public class IndexConfigurationSummary implements Serializable {
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
     * A unique identifier for the index. Use this to identify the index when
     * you are using operations such as <code>Query</code>,
     * <code>DescribeIndex</code>, <code>UpdateIndex</code>, and
     * <code>DeleteIndex</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String id;

    /**
     * <p>
     * Indicates whether the index is a enterprise edition index or a developer
     * edition index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     */
    private String edition;

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Unix timestamp when the index was last updated by the
     * <code>UpdateIndex</code> operation.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>,
     * the index is ready to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     */
    private String status;

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
    public IndexConfigurationSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the index. Use this to identify the index when
     * you are using operations such as <code>Query</code>,
     * <code>DescribeIndex</code>, <code>UpdateIndex</code>, and
     * <code>DeleteIndex</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         A unique identifier for the index. Use this to identify the index
     *         when you are using operations such as <code>Query</code>,
     *         <code>DescribeIndex</code>, <code>UpdateIndex</code>, and
     *         <code>DeleteIndex</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A unique identifier for the index. Use this to identify the index when
     * you are using operations such as <code>Query</code>,
     * <code>DescribeIndex</code>, <code>UpdateIndex</code>, and
     * <code>DeleteIndex</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param id <p>
     *            A unique identifier for the index. Use this to identify the
     *            index when you are using operations such as <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and
     *            <code>DeleteIndex</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the index. Use this to identify the index when
     * you are using operations such as <code>Query</code>,
     * <code>DescribeIndex</code>, <code>UpdateIndex</code>, and
     * <code>DeleteIndex</code>.
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
     *            A unique identifier for the index. Use this to identify the
     *            index when you are using operations such as <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and
     *            <code>DeleteIndex</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexConfigurationSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Indicates whether the index is a enterprise edition index or a developer
     * edition index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @return <p>
     *         Indicates whether the index is a enterprise edition index or a
     *         developer edition index.
     *         </p>
     * @see IndexEdition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * <p>
     * Indicates whether the index is a enterprise edition index or a developer
     * edition index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            Indicates whether the index is a enterprise edition index or a
     *            developer edition index.
     *            </p>
     * @see IndexEdition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * Indicates whether the index is a enterprise edition index or a developer
     * edition index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            Indicates whether the index is a enterprise edition index or a
     *            developer edition index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexEdition
     */
    public IndexConfigurationSummary withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    /**
     * <p>
     * Indicates whether the index is a enterprise edition index or a developer
     * edition index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            Indicates whether the index is a enterprise edition index or a
     *            developer edition index.
     *            </p>
     * @see IndexEdition
     */
    public void setEdition(IndexEdition edition) {
        this.edition = edition.toString();
    }

    /**
     * <p>
     * Indicates whether the index is a enterprise edition index or a developer
     * edition index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVELOPER_EDITION, ENTERPRISE_EDITION
     *
     * @param edition <p>
     *            Indicates whether the index is a enterprise edition index or a
     *            developer edition index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexEdition
     */
    public IndexConfigurationSummary withEdition(IndexEdition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp when the index was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     *
     * @param createdAt <p>
     *            The Unix timestamp when the index was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix timestamp when the index was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexConfigurationSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated by the
     * <code>UpdateIndex</code> operation.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp when the index was last updated by the
     *         <code>UpdateIndex</code> operation.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated by the
     * <code>UpdateIndex</code> operation.
     * </p>
     *
     * @param updatedAt <p>
     *            The Unix timestamp when the index was last updated by the
     *            <code>UpdateIndex</code> operation.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated by the
     * <code>UpdateIndex</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The Unix timestamp when the index was last updated by the
     *            <code>UpdateIndex</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexConfigurationSummary withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>,
     * the index is ready to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @return <p>
     *         The current status of the index. When the status is
     *         <code>ACTIVE</code>, the index is ready to search.
     *         </p>
     * @see IndexStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>,
     * the index is ready to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @param status <p>
     *            The current status of the index. When the status is
     *            <code>ACTIVE</code>, the index is ready to search.
     *            </p>
     * @see IndexStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>,
     * the index is ready to search.
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
     *            The current status of the index. When the status is
     *            <code>ACTIVE</code>, the index is ready to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public IndexConfigurationSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>,
     * the index is ready to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, FAILED, UPDATING,
     * SYSTEM_UPDATING
     *
     * @param status <p>
     *            The current status of the index. When the status is
     *            <code>ACTIVE</code>, the index is ready to search.
     *            </p>
     * @see IndexStatus
     */
    public void setStatus(IndexStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>,
     * the index is ready to search.
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
     *            The current status of the index. When the status is
     *            <code>ACTIVE</code>, the index is ready to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public IndexConfigurationSummary withStatus(IndexStatus status) {
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
        if (getEdition() != null)
            sb.append("Edition: " + getEdition() + ",");
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
        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
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

        if (obj instanceof IndexConfigurationSummary == false)
            return false;
        IndexConfigurationSummary other = (IndexConfigurationSummary) obj;

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
