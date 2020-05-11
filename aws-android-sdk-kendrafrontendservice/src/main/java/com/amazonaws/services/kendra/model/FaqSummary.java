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
 * Provides information about a frequently asked questions and answer contained
 * in an index.
 * </p>
 */
public class FaqSummary implements Serializable {
    /**
     * <p>
     * The unique identifier of the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The name that you assigned the FAQ when you created or updated the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * The current status of the FAQ. When the status is <code>ACTIVE</code> the
     * FAQ is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     */
    private String status;

    /**
     * <p>
     * The UNIX datetime that the FAQ was added to the index.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The UNIX datetime that the FAQ was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The unique identifier of the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The unique identifier of the FAQ.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier of the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param id <p>
     *            The unique identifier of the FAQ.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the FAQ.
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
     *            The unique identifier of the FAQ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaqSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name that you assigned the FAQ when you created or updated the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The name that you assigned the FAQ when you created or updated
     *         the FAQ.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name that you assigned the FAQ when you created or updated the FAQ.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name that you assigned the FAQ when you created or updated
     *            the FAQ.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you assigned the FAQ when you created or updated the FAQ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name that you assigned the FAQ when you created or updated
     *            the FAQ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaqSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current status of the FAQ. When the status is <code>ACTIVE</code> the
     * FAQ is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @return <p>
     *         The current status of the FAQ. When the status is
     *         <code>ACTIVE</code> the FAQ is ready for use.
     *         </p>
     * @see FaqStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the FAQ. When the status is <code>ACTIVE</code> the
     * FAQ is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The current status of the FAQ. When the status is
     *            <code>ACTIVE</code> the FAQ is ready for use.
     *            </p>
     * @see FaqStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the FAQ. When the status is <code>ACTIVE</code> the
     * FAQ is ready for use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The current status of the FAQ. When the status is
     *            <code>ACTIVE</code> the FAQ is ready for use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FaqStatus
     */
    public FaqSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the FAQ. When the status is <code>ACTIVE</code> the
     * FAQ is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The current status of the FAQ. When the status is
     *            <code>ACTIVE</code> the FAQ is ready for use.
     *            </p>
     * @see FaqStatus
     */
    public void setStatus(FaqStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the FAQ. When the status is <code>ACTIVE</code> the
     * FAQ is ready for use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The current status of the FAQ. When the status is
     *            <code>ACTIVE</code> the FAQ is ready for use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FaqStatus
     */
    public FaqSummary withStatus(FaqStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the FAQ was added to the index.
     * </p>
     *
     * @return <p>
     *         The UNIX datetime that the FAQ was added to the index.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The UNIX datetime that the FAQ was added to the index.
     * </p>
     *
     * @param createdAt <p>
     *            The UNIX datetime that the FAQ was added to the index.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The UNIX datetime that the FAQ was added to the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The UNIX datetime that the FAQ was added to the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaqSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the FAQ was last updated.
     * </p>
     *
     * @return <p>
     *         The UNIX datetime that the FAQ was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The UNIX datetime that the FAQ was last updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The UNIX datetime that the FAQ was last updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The UNIX datetime that the FAQ was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The UNIX datetime that the FAQ was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaqSummary withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaqSummary == false)
            return false;
        FaqSummary other = (FaqSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        return true;
    }
}
