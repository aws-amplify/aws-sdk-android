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

public class UpdateSchemaResult implements Serializable {
    /**
     * <p>
     * The description of the schema.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     */
    private String schemaArn;

    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;

    /**
     * <p>
     * The version number of the schema
     * </p>
     */
    private String schemaVersion;

    /**
     * <p>
     * Key-value pairs associated with a resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of the schema.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     */
    private java.util.Date versionCreatedDate;

    /**
     * <p>
     * The description of the schema.
     * </p>
     *
     * @return <p>
     *         The description of the schema.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     *
     * @param description <p>
     *            The description of the schema.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     *
     * @return <p>
     *         The date and time that schema was modified.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     *
     * @param lastModified <p>
     *            The date and time that schema was modified.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that schema was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            The date and time that schema was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     *
     * @return <p>
     *         The ARN of the schema.
     *         </p>
     */
    public String getSchemaArn() {
        return schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     *
     * @param schemaArn <p>
     *            The ARN of the schema.
     *            </p>
     */
    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaArn <p>
     *            The ARN of the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
        return this;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     *
     * @return <p>
     *         The name of the schema.
     *         </p>
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     *
     * @param schemaName <p>
     *            The name of the schema.
     *            </p>
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaName <p>
     *            The name of the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     *
     * @return <p>
     *         The version number of the schema
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     *
     * @param schemaVersion <p>
     *            The version number of the schema
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaVersion <p>
     *            The version number of the schema
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * <p>
     * Key-value pairs associated with a resource.
     * </p>
     *
     * @return <p>
     *         Key-value pairs associated with a resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs associated with a resource.
     * </p>
     *
     * @param tags <p>
     *            Key-value pairs associated with a resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Key-value pairs associated with a resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs associated with a resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Key-value pairs associated with a resource.
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
    public UpdateSchemaResult addTagsEntry(String key, String value) {
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
    public UpdateSchemaResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of the schema.
     * </p>
     *
     * @return <p>
     *         The type of the schema.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the schema.
     * </p>
     *
     * @param type <p>
     *            The type of the schema.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     *
     * @return <p>
     *         The date the schema version was created.
     *         </p>
     */
    public java.util.Date getVersionCreatedDate() {
        return versionCreatedDate;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     *
     * @param versionCreatedDate <p>
     *            The date the schema version was created.
     *            </p>
     */
    public void setVersionCreatedDate(java.util.Date versionCreatedDate) {
        this.versionCreatedDate = versionCreatedDate;
    }

    /**
     * <p>
     * The date the schema version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionCreatedDate <p>
     *            The date the schema version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSchemaResult withVersionCreatedDate(java.util.Date versionCreatedDate) {
        this.versionCreatedDate = versionCreatedDate;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: " + getSchemaArn() + ",");
        if (getSchemaName() != null)
            sb.append("SchemaName: " + getSchemaName() + ",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: " + getSchemaVersion() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVersionCreatedDate() != null)
            sb.append("VersionCreatedDate: " + getVersionCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getVersionCreatedDate() == null) ? 0 : getVersionCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSchemaResult == false)
            return false;
        UpdateSchemaResult other = (UpdateSchemaResult) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null
                && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null
                && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null
                && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVersionCreatedDate() == null ^ this.getVersionCreatedDate() == null)
            return false;
        if (other.getVersionCreatedDate() != null
                && other.getVersionCreatedDate().equals(this.getVersionCreatedDate()) == false)
            return false;
        return true;
    }
}
