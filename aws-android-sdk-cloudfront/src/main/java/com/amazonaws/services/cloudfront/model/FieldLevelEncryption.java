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
 * A complex data type that includes the profile configurations and other
 * options specified for field-level encryption.
 * </p>
 */
public class FieldLevelEncryption implements Serializable {
    /**
     * <p>
     * The configuration ID for a field-level encryption configuration which
     * includes a set of profiles that specify certain selected data fields to
     * be encrypted by specific public keys.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The last time the field-level encryption configuration was changed.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A complex data type that includes the profile configurations specified
     * for field-level encryption.
     * </p>
     */
    private FieldLevelEncryptionConfig fieldLevelEncryptionConfig;

    /**
     * <p>
     * The configuration ID for a field-level encryption configuration which
     * includes a set of profiles that specify certain selected data fields to
     * be encrypted by specific public keys.
     * </p>
     *
     * @return <p>
     *         The configuration ID for a field-level encryption configuration
     *         which includes a set of profiles that specify certain selected
     *         data fields to be encrypted by specific public keys.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The configuration ID for a field-level encryption configuration which
     * includes a set of profiles that specify certain selected data fields to
     * be encrypted by specific public keys.
     * </p>
     *
     * @param id <p>
     *            The configuration ID for a field-level encryption
     *            configuration which includes a set of profiles that specify
     *            certain selected data fields to be encrypted by specific
     *            public keys.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The configuration ID for a field-level encryption configuration which
     * includes a set of profiles that specify certain selected data fields to
     * be encrypted by specific public keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The configuration ID for a field-level encryption
     *            configuration which includes a set of profiles that specify
     *            certain selected data fields to be encrypted by specific
     *            public keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryption withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The last time the field-level encryption configuration was changed.
     * </p>
     *
     * @return <p>
     *         The last time the field-level encryption configuration was
     *         changed.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The last time the field-level encryption configuration was changed.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The last time the field-level encryption configuration was
     *            changed.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the field-level encryption configuration was changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The last time the field-level encryption configuration was
     *            changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryption withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * A complex data type that includes the profile configurations specified
     * for field-level encryption.
     * </p>
     *
     * @return <p>
     *         A complex data type that includes the profile configurations
     *         specified for field-level encryption.
     *         </p>
     */
    public FieldLevelEncryptionConfig getFieldLevelEncryptionConfig() {
        return fieldLevelEncryptionConfig;
    }

    /**
     * <p>
     * A complex data type that includes the profile configurations specified
     * for field-level encryption.
     * </p>
     *
     * @param fieldLevelEncryptionConfig <p>
     *            A complex data type that includes the profile configurations
     *            specified for field-level encryption.
     *            </p>
     */
    public void setFieldLevelEncryptionConfig(FieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
        this.fieldLevelEncryptionConfig = fieldLevelEncryptionConfig;
    }

    /**
     * <p>
     * A complex data type that includes the profile configurations specified
     * for field-level encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldLevelEncryptionConfig <p>
     *            A complex data type that includes the profile configurations
     *            specified for field-level encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldLevelEncryption withFieldLevelEncryptionConfig(
            FieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
        this.fieldLevelEncryptionConfig = fieldLevelEncryptionConfig;
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
        if (getFieldLevelEncryptionConfig() != null)
            sb.append("FieldLevelEncryptionConfig: " + getFieldLevelEncryptionConfig());
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
        hashCode = prime
                * hashCode
                + ((getFieldLevelEncryptionConfig() == null) ? 0 : getFieldLevelEncryptionConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryption == false)
            return false;
        FieldLevelEncryption other = (FieldLevelEncryption) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFieldLevelEncryptionConfig() == null
                ^ this.getFieldLevelEncryptionConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionConfig() != null
                && other.getFieldLevelEncryptionConfig().equals(
                        this.getFieldLevelEncryptionConfig()) == false)
            return false;
        return true;
    }
}
