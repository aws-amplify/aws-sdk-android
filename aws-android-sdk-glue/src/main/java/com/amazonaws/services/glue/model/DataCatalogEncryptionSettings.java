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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Contains configuration information for maintaining Data Catalog security.
 * </p>
 */
public class DataCatalogEncryptionSettings implements Serializable {
    /**
     * <p>
     * Specifies the encryption-at-rest configuration for the Data Catalog.
     * </p>
     */
    private EncryptionAtRest encryptionAtRest;

    /**
     * <p>
     * When connection password protection is enabled, the Data Catalog uses a
     * customer-provided key to encrypt the password as part of
     * <code>CreateConnection</code> or <code>UpdateConnection</code> and store
     * it in the <code>ENCRYPTED_PASSWORD</code> field in the connection
     * properties. You can enable catalog encryption or only password
     * encryption.
     * </p>
     */
    private ConnectionPasswordEncryption connectionPasswordEncryption;

    /**
     * <p>
     * Specifies the encryption-at-rest configuration for the Data Catalog.
     * </p>
     *
     * @return <p>
     *         Specifies the encryption-at-rest configuration for the Data
     *         Catalog.
     *         </p>
     */
    public EncryptionAtRest getEncryptionAtRest() {
        return encryptionAtRest;
    }

    /**
     * <p>
     * Specifies the encryption-at-rest configuration for the Data Catalog.
     * </p>
     *
     * @param encryptionAtRest <p>
     *            Specifies the encryption-at-rest configuration for the Data
     *            Catalog.
     *            </p>
     */
    public void setEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
    }

    /**
     * <p>
     * Specifies the encryption-at-rest configuration for the Data Catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAtRest <p>
     *            Specifies the encryption-at-rest configuration for the Data
     *            Catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCatalogEncryptionSettings withEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
        return this;
    }

    /**
     * <p>
     * When connection password protection is enabled, the Data Catalog uses a
     * customer-provided key to encrypt the password as part of
     * <code>CreateConnection</code> or <code>UpdateConnection</code> and store
     * it in the <code>ENCRYPTED_PASSWORD</code> field in the connection
     * properties. You can enable catalog encryption or only password
     * encryption.
     * </p>
     *
     * @return <p>
     *         When connection password protection is enabled, the Data Catalog
     *         uses a customer-provided key to encrypt the password as part of
     *         <code>CreateConnection</code> or <code>UpdateConnection</code>
     *         and store it in the <code>ENCRYPTED_PASSWORD</code> field in the
     *         connection properties. You can enable catalog encryption or only
     *         password encryption.
     *         </p>
     */
    public ConnectionPasswordEncryption getConnectionPasswordEncryption() {
        return connectionPasswordEncryption;
    }

    /**
     * <p>
     * When connection password protection is enabled, the Data Catalog uses a
     * customer-provided key to encrypt the password as part of
     * <code>CreateConnection</code> or <code>UpdateConnection</code> and store
     * it in the <code>ENCRYPTED_PASSWORD</code> field in the connection
     * properties. You can enable catalog encryption or only password
     * encryption.
     * </p>
     *
     * @param connectionPasswordEncryption <p>
     *            When connection password protection is enabled, the Data
     *            Catalog uses a customer-provided key to encrypt the password
     *            as part of <code>CreateConnection</code> or
     *            <code>UpdateConnection</code> and store it in the
     *            <code>ENCRYPTED_PASSWORD</code> field in the connection
     *            properties. You can enable catalog encryption or only password
     *            encryption.
     *            </p>
     */
    public void setConnectionPasswordEncryption(
            ConnectionPasswordEncryption connectionPasswordEncryption) {
        this.connectionPasswordEncryption = connectionPasswordEncryption;
    }

    /**
     * <p>
     * When connection password protection is enabled, the Data Catalog uses a
     * customer-provided key to encrypt the password as part of
     * <code>CreateConnection</code> or <code>UpdateConnection</code> and store
     * it in the <code>ENCRYPTED_PASSWORD</code> field in the connection
     * properties. You can enable catalog encryption or only password
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionPasswordEncryption <p>
     *            When connection password protection is enabled, the Data
     *            Catalog uses a customer-provided key to encrypt the password
     *            as part of <code>CreateConnection</code> or
     *            <code>UpdateConnection</code> and store it in the
     *            <code>ENCRYPTED_PASSWORD</code> field in the connection
     *            properties. You can enable catalog encryption or only password
     *            encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCatalogEncryptionSettings withConnectionPasswordEncryption(
            ConnectionPasswordEncryption connectionPasswordEncryption) {
        this.connectionPasswordEncryption = connectionPasswordEncryption;
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
        if (getEncryptionAtRest() != null)
            sb.append("EncryptionAtRest: " + getEncryptionAtRest() + ",");
        if (getConnectionPasswordEncryption() != null)
            sb.append("ConnectionPasswordEncryption: " + getConnectionPasswordEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncryptionAtRest() == null) ? 0 : getEncryptionAtRest().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionPasswordEncryption() == null) ? 0
                        : getConnectionPasswordEncryption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCatalogEncryptionSettings == false)
            return false;
        DataCatalogEncryptionSettings other = (DataCatalogEncryptionSettings) obj;

        if (other.getEncryptionAtRest() == null ^ this.getEncryptionAtRest() == null)
            return false;
        if (other.getEncryptionAtRest() != null
                && other.getEncryptionAtRest().equals(this.getEncryptionAtRest()) == false)
            return false;
        if (other.getConnectionPasswordEncryption() == null
                ^ this.getConnectionPasswordEncryption() == null)
            return false;
        if (other.getConnectionPasswordEncryption() != null
                && other.getConnectionPasswordEncryption().equals(
                        this.getConnectionPasswordEncryption()) == false)
            return false;
        return true;
    }
}
