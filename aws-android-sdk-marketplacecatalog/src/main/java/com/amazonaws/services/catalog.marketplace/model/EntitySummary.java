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
package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;


/**
 * <p>This object is a container for common summary information about the entity. The summary doesn't contain the whole entity structure, but it does contain information common across all entities.</p>
 */
public class EntitySummary implements Serializable {
    /**
     * <p>The name for the entity. This value is not unique. It is defined by the seller.</p>
     */
    private String name;

    /**
     * <p>The type of the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String entityType;

    /**
     * <p>The unique identifier for the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     */
    private String entityId;

    /**
     * <p>The ARN associated with the unique identifier for the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     */
    private String entityArn;

    /**
     * <p>The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).</p>
     */
    private String lastModifiedDate;

    /**
     * <p>The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view it). </p>
     */
    private String visibility;

    /**
     * <p>The name for the entity. This value is not unique. It is defined by the seller.</p>
     *
     * @return <p>The name for the entity. This value is not unique. It is defined by the seller.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name for the entity. This value is not unique. It is defined by the seller.</p>
     *
     * @param name <p>The name for the entity. This value is not unique. It is defined by the seller.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name for the entity. This value is not unique. It is defined by the seller.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name <p>The name for the entity. This value is not unique. It is defined by the seller.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public EntitySummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The type of the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>The type of the entity.</p>
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * <p>The type of the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param entityType <p>The type of the entity.</p>
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>The type of the entity.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param entityType <p>The type of the entity.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public EntitySummary withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * <p>The unique identifier for the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @return <p>The unique identifier for the entity.</p>
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * <p>The unique identifier for the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param entityId <p>The unique identifier for the entity.</p>
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>The unique identifier for the entity.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param entityId <p>The unique identifier for the entity.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public EntitySummary withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * <p>The ARN associated with the unique identifier for the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @return <p>The ARN associated with the unique identifier for the entity.</p>
     */
    public String getEntityArn() {
        return entityArn;
    }

    /**
     * <p>The ARN associated with the unique identifier for the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param entityArn <p>The ARN associated with the unique identifier for the entity.</p>
     */
    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>The ARN associated with the unique identifier for the entity.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param entityArn <p>The ARN associated with the unique identifier for the entity.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public EntitySummary withEntityArn(String entityArn) {
        this.entityArn = entityArn;
        return this;
    }

    /**
     * <p>The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).</p>
     *
     * @return <p>The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).</p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).</p>
     *
     * @param lastModifiedDate <p>The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).</p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate <p>The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public EntitySummary withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view it). </p>
     *
     * @return <p>The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view it). </p>
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * <p>The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view it). </p>
     *
     * @param visibility <p>The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view it). </p>
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view it). </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibility <p>The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view it). </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public EntitySummary withVisibility(String visibility) {
        this.visibility = visibility;
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
        if (getEntityType() != null) sb.append("EntityType: " + getEntityType() + ",");
        if (getEntityId() != null) sb.append("EntityId: " + getEntityId() + ",");
        if (getEntityArn() != null) sb.append("EntityArn: " + getEntityArn() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getVisibility() != null) sb.append("Visibility: " + getVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EntitySummary == false) return false;
        EntitySummary other = (EntitySummary)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null) return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false) return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null) return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false) return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null) return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false) return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null) return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false) return false;
        return true;
    }
}
