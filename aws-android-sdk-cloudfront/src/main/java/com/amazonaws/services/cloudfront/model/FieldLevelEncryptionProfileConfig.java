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
 * A complex data type of profiles for the field-level encryption.
 * </p>
 */
public class FieldLevelEncryptionProfileConfig implements Serializable {
    /**
     * <p>
     * Profile name for the field-level encryption profile.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     */
    private String callerReference;

    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     */
    private String comment;

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
     * Profile name for the field-level encryption profile.
     * </p>
     *
     * @return <p>
     *         Profile name for the field-level encryption profile.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Profile name for the field-level encryption profile.
     * </p>
     *
     * @param name <p>
     *            Profile name for the field-level encryption profile.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Profile name for the field-level encryption profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Profile name for the field-level encryption profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     *
     * @return <p>
     *         A unique number that ensures that the request can't be replayed.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     *
     * @param callerReference <p>
     *            A unique number that ensures that the request can't be
     *            replayed.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callerReference <p>
     *            A unique number that ensures that the request can't be
     *            replayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileConfig withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     *
     * @return <p>
     *         An optional comment for the field-level encryption profile.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     *
     * @param comment <p>
     *            An optional comment for the field-level encryption profile.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            An optional comment for the field-level encryption profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryptionProfileConfig withComment(String comment) {
        this.comment = comment;
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
    public FieldLevelEncryptionProfileConfig withEncryptionEntities(
            EncryptionEntities encryptionEntities) {
        this.encryptionEntities = encryptionEntities;
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getEncryptionEntities() != null)
            sb.append("EncryptionEntities: " + getEncryptionEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionEntities() == null) ? 0 : getEncryptionEntities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryptionProfileConfig == false)
            return false;
        FieldLevelEncryptionProfileConfig other = (FieldLevelEncryptionProfileConfig) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getEncryptionEntities() == null ^ this.getEncryptionEntities() == null)
            return false;
        if (other.getEncryptionEntities() != null
                && other.getEncryptionEntities().equals(this.getEncryptionEntities()) == false)
            return false;
        return true;
    }
}
