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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * The data structure used by the Data Catalog to encrypt the password as part
 * of <code>CreateConnection</code> or <code>UpdateConnection</code> and store
 * it in the <code>ENCRYPTED_PASSWORD</code> field in the connection properties.
 * You can enable catalog encryption or only password encryption.
 * </p>
 * <p>
 * When a <code>CreationConnection</code> request arrives containing a password,
 * the Data Catalog first encrypts the password using your AWS KMS key. It then
 * encrypts the whole connection object again if catalog encryption is also
 * enabled.
 * </p>
 * <p>
 * This encryption requires that you set AWS KMS key permissions to enable or
 * restrict access on the password key according to your security requirements.
 * For example, you might want only administrators to have decrypt permission on
 * the password key.
 * </p>
 */
public class ConnectionPasswordEncryption implements Serializable {
    /**
     * <p>
     * When the <code>ReturnConnectionPasswordEncrypted</code> flag is set to
     * "true", passwords remain encrypted in the responses of
     * <code>GetConnection</code> and <code>GetConnections</code>. This
     * encryption takes effect independently from catalog encryption.
     * </p>
     */
    private Boolean returnConnectionPasswordEncrypted;

    /**
     * <p>
     * An AWS KMS key that is used to encrypt the connection password.
     * </p>
     * <p>
     * If connection password protection is enabled, the caller of
     * <code>CreateConnection</code> and <code>UpdateConnection</code> needs at
     * least <code>kms:Encrypt</code> permission on the specified AWS KMS key,
     * to encrypt passwords before storing them in the Data Catalog.
     * </p>
     * <p>
     * You can set the decrypt permission to enable or restrict access on the
     * password key according to your security requirements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String awsKmsKeyId;

    /**
     * <p>
     * When the <code>ReturnConnectionPasswordEncrypted</code> flag is set to
     * "true", passwords remain encrypted in the responses of
     * <code>GetConnection</code> and <code>GetConnections</code>. This
     * encryption takes effect independently from catalog encryption.
     * </p>
     *
     * @return <p>
     *         When the <code>ReturnConnectionPasswordEncrypted</code> flag is
     *         set to "true", passwords remain encrypted in the responses of
     *         <code>GetConnection</code> and <code>GetConnections</code>. This
     *         encryption takes effect independently from catalog encryption.
     *         </p>
     */
    public Boolean isReturnConnectionPasswordEncrypted() {
        return returnConnectionPasswordEncrypted;
    }

    /**
     * <p>
     * When the <code>ReturnConnectionPasswordEncrypted</code> flag is set to
     * "true", passwords remain encrypted in the responses of
     * <code>GetConnection</code> and <code>GetConnections</code>. This
     * encryption takes effect independently from catalog encryption.
     * </p>
     *
     * @return <p>
     *         When the <code>ReturnConnectionPasswordEncrypted</code> flag is
     *         set to "true", passwords remain encrypted in the responses of
     *         <code>GetConnection</code> and <code>GetConnections</code>. This
     *         encryption takes effect independently from catalog encryption.
     *         </p>
     */
    public Boolean getReturnConnectionPasswordEncrypted() {
        return returnConnectionPasswordEncrypted;
    }

    /**
     * <p>
     * When the <code>ReturnConnectionPasswordEncrypted</code> flag is set to
     * "true", passwords remain encrypted in the responses of
     * <code>GetConnection</code> and <code>GetConnections</code>. This
     * encryption takes effect independently from catalog encryption.
     * </p>
     *
     * @param returnConnectionPasswordEncrypted <p>
     *            When the <code>ReturnConnectionPasswordEncrypted</code> flag
     *            is set to "true", passwords remain encrypted in the responses
     *            of <code>GetConnection</code> and <code>GetConnections</code>.
     *            This encryption takes effect independently from catalog
     *            encryption.
     *            </p>
     */
    public void setReturnConnectionPasswordEncrypted(Boolean returnConnectionPasswordEncrypted) {
        this.returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted;
    }

    /**
     * <p>
     * When the <code>ReturnConnectionPasswordEncrypted</code> flag is set to
     * "true", passwords remain encrypted in the responses of
     * <code>GetConnection</code> and <code>GetConnections</code>. This
     * encryption takes effect independently from catalog encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnConnectionPasswordEncrypted <p>
     *            When the <code>ReturnConnectionPasswordEncrypted</code> flag
     *            is set to "true", passwords remain encrypted in the responses
     *            of <code>GetConnection</code> and <code>GetConnections</code>.
     *            This encryption takes effect independently from catalog
     *            encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPasswordEncryption withReturnConnectionPasswordEncrypted(
            Boolean returnConnectionPasswordEncrypted) {
        this.returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted;
        return this;
    }

    /**
     * <p>
     * An AWS KMS key that is used to encrypt the connection password.
     * </p>
     * <p>
     * If connection password protection is enabled, the caller of
     * <code>CreateConnection</code> and <code>UpdateConnection</code> needs at
     * least <code>kms:Encrypt</code> permission on the specified AWS KMS key,
     * to encrypt passwords before storing them in the Data Catalog.
     * </p>
     * <p>
     * You can set the decrypt permission to enable or restrict access on the
     * password key according to your security requirements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         An AWS KMS key that is used to encrypt the connection password.
     *         </p>
     *         <p>
     *         If connection password protection is enabled, the caller of
     *         <code>CreateConnection</code> and <code>UpdateConnection</code>
     *         needs at least <code>kms:Encrypt</code> permission on the
     *         specified AWS KMS key, to encrypt passwords before storing them
     *         in the Data Catalog.
     *         </p>
     *         <p>
     *         You can set the decrypt permission to enable or restrict access
     *         on the password key according to your security requirements.
     *         </p>
     */
    public String getAwsKmsKeyId() {
        return awsKmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key that is used to encrypt the connection password.
     * </p>
     * <p>
     * If connection password protection is enabled, the caller of
     * <code>CreateConnection</code> and <code>UpdateConnection</code> needs at
     * least <code>kms:Encrypt</code> permission on the specified AWS KMS key,
     * to encrypt passwords before storing them in the Data Catalog.
     * </p>
     * <p>
     * You can set the decrypt permission to enable or restrict access on the
     * password key according to your security requirements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param awsKmsKeyId <p>
     *            An AWS KMS key that is used to encrypt the connection
     *            password.
     *            </p>
     *            <p>
     *            If connection password protection is enabled, the caller of
     *            <code>CreateConnection</code> and
     *            <code>UpdateConnection</code> needs at least
     *            <code>kms:Encrypt</code> permission on the specified AWS KMS
     *            key, to encrypt passwords before storing them in the Data
     *            Catalog.
     *            </p>
     *            <p>
     *            You can set the decrypt permission to enable or restrict
     *            access on the password key according to your security
     *            requirements.
     *            </p>
     */
    public void setAwsKmsKeyId(String awsKmsKeyId) {
        this.awsKmsKeyId = awsKmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key that is used to encrypt the connection password.
     * </p>
     * <p>
     * If connection password protection is enabled, the caller of
     * <code>CreateConnection</code> and <code>UpdateConnection</code> needs at
     * least <code>kms:Encrypt</code> permission on the specified AWS KMS key,
     * to encrypt passwords before storing them in the Data Catalog.
     * </p>
     * <p>
     * You can set the decrypt permission to enable or restrict access on the
     * password key according to your security requirements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param awsKmsKeyId <p>
     *            An AWS KMS key that is used to encrypt the connection
     *            password.
     *            </p>
     *            <p>
     *            If connection password protection is enabled, the caller of
     *            <code>CreateConnection</code> and
     *            <code>UpdateConnection</code> needs at least
     *            <code>kms:Encrypt</code> permission on the specified AWS KMS
     *            key, to encrypt passwords before storing them in the Data
     *            Catalog.
     *            </p>
     *            <p>
     *            You can set the decrypt permission to enable or restrict
     *            access on the password key according to your security
     *            requirements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPasswordEncryption withAwsKmsKeyId(String awsKmsKeyId) {
        this.awsKmsKeyId = awsKmsKeyId;
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
        if (getReturnConnectionPasswordEncrypted() != null)
            sb.append("ReturnConnectionPasswordEncrypted: "
                    + getReturnConnectionPasswordEncrypted() + ",");
        if (getAwsKmsKeyId() != null)
            sb.append("AwsKmsKeyId: " + getAwsKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReturnConnectionPasswordEncrypted() == null) ? 0
                        : getReturnConnectionPasswordEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getAwsKmsKeyId() == null) ? 0 : getAwsKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionPasswordEncryption == false)
            return false;
        ConnectionPasswordEncryption other = (ConnectionPasswordEncryption) obj;

        if (other.getReturnConnectionPasswordEncrypted() == null
                ^ this.getReturnConnectionPasswordEncrypted() == null)
            return false;
        if (other.getReturnConnectionPasswordEncrypted() != null
                && other.getReturnConnectionPasswordEncrypted().equals(
                        this.getReturnConnectionPasswordEncrypted()) == false)
            return false;
        if (other.getAwsKmsKeyId() == null ^ this.getAwsKmsKeyId() == null)
            return false;
        if (other.getAwsKmsKeyId() != null
                && other.getAwsKmsKeyId().equals(this.getAwsKmsKeyId()) == false)
            return false;
        return true;
    }
}
