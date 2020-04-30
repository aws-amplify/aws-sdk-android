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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

public class PutCodeBindingResult implements Serializable {
    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private String schemaVersion;

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED
     */
    private String status;

    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     *
     * @return <p>
     *         The time and date that the code binding was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     *
     * @param creationDate <p>
     *            The time and date that the code binding was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The time and date that the code binding was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutCodeBindingResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     *
     * @return <p>
     *         The date and time that code bindings were modified.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     *
     * @param lastModified <p>
     *            The date and time that code bindings were modified.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            The date and time that code bindings were modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutCodeBindingResult withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     *
     * @return <p>
     *         The version number of the schema.
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     *
     * @param schemaVersion <p>
     *            The version number of the schema.
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaVersion <p>
     *            The version number of the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutCodeBindingResult withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED
     *
     * @return <p>
     *         The current status of code binding generation.
     *         </p>
     * @see CodeGenerationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED
     *
     * @param status <p>
     *            The current status of code binding generation.
     *            </p>
     * @see CodeGenerationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED
     *
     * @param status <p>
     *            The current status of code binding generation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CodeGenerationStatus
     */
    public PutCodeBindingResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED
     *
     * @param status <p>
     *            The current status of code binding generation.
     *            </p>
     * @see CodeGenerationStatus
     */
    public void setStatus(CodeGenerationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED
     *
     * @param status <p>
     *            The current status of code binding generation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CodeGenerationStatus
     */
    public PutCodeBindingResult withStatus(CodeGenerationStatus status) {
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
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: " + getSchemaVersion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutCodeBindingResult == false)
            return false;
        PutCodeBindingResult other = (PutCodeBindingResult) obj;

        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null
                && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
