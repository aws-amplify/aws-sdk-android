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


public class DescribeEntityResult implements Serializable {
    /**
     * <p>The named type of the entity, in the format of <code>EntityType@Version</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String entityType;

    /**
     * <p>The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     */
    private String entityIdentifier;

    /**
     * <p>The ARN associated to the unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     */
    private String entityArn;

    /**
     * <p>The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).</p>
     */
    private String lastModifiedDate;

    /**
     * <p>This stringified JSON object includes the details of the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     */
    private String details;

    /**
     * <p>The named type of the entity, in the format of <code>EntityType@Version</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>The named type of the entity, in the format of <code>EntityType@Version</code>.</p>
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * <p>The named type of the entity, in the format of <code>EntityType@Version</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param entityType <p>The named type of the entity, in the format of <code>EntityType@Version</code>.</p>
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>The named type of the entity, in the format of <code>EntityType@Version</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param entityType <p>The named type of the entity, in the format of <code>EntityType@Version</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEntityResult withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * <p>The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     *
     * @return <p>The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.</p>
     */
    public String getEntityIdentifier() {
        return entityIdentifier;
    }

    /**
     * <p>The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     *
     * @param entityIdentifier <p>The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.</p>
     */
    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    /**
     * <p>The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-@]+$<br/>
     *
     * @param entityIdentifier <p>The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEntityResult withEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
        return this;
    }

    /**
     * <p>The ARN associated to the unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @return <p>The ARN associated to the unique identifier for the change set referenced in this request.</p>
     */
    public String getEntityArn() {
        return entityArn;
    }

    /**
     * <p>The ARN associated to the unique identifier for the change set referenced in this request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param entityArn <p>The ARN associated to the unique identifier for the change set referenced in this request.</p>
     */
    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>The ARN associated to the unique identifier for the change set referenced in this request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param entityArn <p>The ARN associated to the unique identifier for the change set referenced in this request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEntityResult withEntityArn(String entityArn) {
        this.entityArn = entityArn;
        return this;
    }

    /**
     * <p>The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).</p>
     *
     * @return <p>The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).</p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).</p>
     *
     * @param lastModifiedDate <p>The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).</p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate <p>The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEntityResult withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>This stringified JSON object includes the details of the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     *
     * @return <p>This stringified JSON object includes the details of the entity.</p>
     */
    public String getDetails() {
        return details;
    }

    /**
     * <p>This stringified JSON object includes the details of the entity.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     *
     * @param details <p>This stringified JSON object includes the details of the entity.</p>
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>This stringified JSON object includes the details of the entity.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     *
     * @param details <p>This stringified JSON object includes the details of the entity.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeEntityResult withDetails(String details) {
        this.details = details;
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
        if (getEntityType() != null) sb.append("EntityType: " + getEntityType() + ",");
        if (getEntityIdentifier() != null) sb.append("EntityIdentifier: " + getEntityIdentifier() + ",");
        if (getEntityArn() != null) sb.append("EntityArn: " + getEntityArn() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityIdentifier() == null) ? 0 : getEntityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEntityResult == false) return false;
        DescribeEntityResult other = (DescribeEntityResult)obj;

        if (other.getEntityType() == null ^ this.getEntityType() == null) return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false) return false;
        if (other.getEntityIdentifier() == null ^ this.getEntityIdentifier() == null) return false;
        if (other.getEntityIdentifier() != null && other.getEntityIdentifier().equals(this.getEntityIdentifier()) == false) return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null) return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false) return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false;
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false;
        return true;
    }
}
