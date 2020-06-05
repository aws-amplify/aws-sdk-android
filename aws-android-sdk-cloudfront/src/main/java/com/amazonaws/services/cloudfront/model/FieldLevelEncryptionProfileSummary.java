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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * The field-level encryption profile summary.
 * </p>
 */
public class FieldLevelEncryptionProfileSummary implements Serializable {
    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The time when the the field-level encryption profile summary was last
     * updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption
     * profile that include the public key ID, provider, and field patterns for
     * specifying which fields to encrypt with this key.
     * </p>
     */
    private EncryptionEntities encryptionEntities;

    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     *
     * @return <p>
     *         ID for the field-level encryption profile summary.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     *
     * @param id <p>
     *            ID for the field-level encryption profile summary.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            ID for the field-level encryption profile summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The time when the the field-level encryption profile summary was last
     * updated.
     * </p>
     *
     * @return <p>
     *         The time when the the field-level encryption profile summary was
     *         last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The time when the the field-level encryption profile summary was last
     * updated.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The time when the the field-level encryption profile summary
     *            was last updated.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the the field-level encryption profile summary was last
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The time when the the field-level encryption profile summary
     *            was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     *
     * @return <p>
     *         Name for the field-level encryption profile summary.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     *
     * @param name <p>
     *            Name for the field-level encryption profile summary.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Name for the field-level encryption profile summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption
     * profile that include the public key ID, provider, and field patterns for
     * specifying which fields to encrypt with this key.
     * </p>
     *
     * @return <p>
     *         A complex data type of encryption entities for the field-level
     *         encryption profile that include the public key ID, provider, and
     *         field patterns for specifying which fields to encrypt with this
     *         key.
     *         </p>
     */
    public EncryptionEntities getEncryptionEntities() {
        return encryptionEntities;
    }

    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption
     * profile that include the public key ID, provider, and field patterns for
     * specifying which fields to encrypt with this key.
     * </p>
     *
     * @param encryptionEntities <p>
     *            A complex data type of encryption entities for the field-level
     *            encryption profile that include the public key ID, provider,
     *            and field patterns for specifying which fields to encrypt with
     *            this key.
     *            </p>
     */
    public void setEncryptionEntities(EncryptionEntities encryptionEntities) {
        this.encryptionEntities = encryptionEntities;
    }

    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption
     * profile that include the public key ID, provider, and field patterns for
     * specifying which fields to encrypt with this key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionEntities <p>
     *            A complex data type of encryption entities for the field-level
     *            encryption profile that include the public key ID, provider,
     *            and field patterns for specifying which fields to encrypt with
     *            this key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileSummary withEncryptionEntities(
            EncryptionEntities encryptionEntities) {
        this.encryptionEntities = encryptionEntities;
        return this;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     *
     * @return <p>
     *         An optional comment for the field-level encryption profile
     *         summary.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     *
     * @param comment <p>
     *            An optional comment for the field-level encryption profile
     *            summary.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            An optional comment for the field-level encryption profile
     *            summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileSummary withComment(String comment) {
        this.comment = comment;
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
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEncryptionEntities() != null)
            sb.append("EncryptionEntities: " + getEncryptionEntities() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionEntities() == null) ? 0 : getEncryptionEntities().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryptionProfileSummary == false)
            return false;
        FieldLevelEncryptionProfileSummary other = (FieldLevelEncryptionProfileSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEncryptionEntities() == null ^ this.getEncryptionEntities() == null)
            return false;
        if (other.getEncryptionEntities() != null
                && other.getEncryptionEntities().equals(this.getEncryptionEntities()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
