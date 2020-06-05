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
 * Complex data type for field-level encryption profiles that includes the
 * encryption key and field pattern specifications.
 * </p>
 */
public class EncryptionEntity implements Serializable {
    /**
     * <p>
     * The public key associated with a set of field-level encryption patterns,
     * to be used when encrypting the fields that match the patterns.
     * </p>
     */
    private String publicKeyId;

    /**
     * <p>
     * The provider associated with the public key being used for encryption.
     * This value must also be provided with the private key for applications to
     * be able to decrypt data.
     * </p>
     */
    private String providerId;

    /**
     * <p>
     * Field patterns in a field-level encryption content type profile specify
     * the fields that you want to be encrypted. You can provide the full field
     * name, or any beginning characters followed by a wildcard (*). You can't
     * overlap field patterns. For example, you can't have both ABC* and AB*.
     * Note that field patterns are case-sensitive.
     * </p>
     */
    private FieldPatterns fieldPatterns;

    /**
     * <p>
     * The public key associated with a set of field-level encryption patterns,
     * to be used when encrypting the fields that match the patterns.
     * </p>
     *
     * @return <p>
     *         The public key associated with a set of field-level encryption
     *         patterns, to be used when encrypting the fields that match the
     *         patterns.
     *         </p>
     */
    public String getPublicKeyId() {
        return publicKeyId;
    }

    /**
     * <p>
     * The public key associated with a set of field-level encryption patterns,
     * to be used when encrypting the fields that match the patterns.
     * </p>
     *
     * @param publicKeyId <p>
     *            The public key associated with a set of field-level encryption
     *            patterns, to be used when encrypting the fields that match the
     *            patterns.
     *            </p>
     */
    public void setPublicKeyId(String publicKeyId) {
        this.publicKeyId = publicKeyId;
    }

    /**
     * <p>
     * The public key associated with a set of field-level encryption patterns,
     * to be used when encrypting the fields that match the patterns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKeyId <p>
     *            The public key associated with a set of field-level encryption
     *            patterns, to be used when encrypting the fields that match the
     *            patterns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionEntity withPublicKeyId(String publicKeyId) {
        this.publicKeyId = publicKeyId;
        return this;
    }

    /**
     * <p>
     * The provider associated with the public key being used for encryption.
     * This value must also be provided with the private key for applications to
     * be able to decrypt data.
     * </p>
     *
     * @return <p>
     *         The provider associated with the public key being used for
     *         encryption. This value must also be provided with the private key
     *         for applications to be able to decrypt data.
     *         </p>
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * <p>
     * The provider associated with the public key being used for encryption.
     * This value must also be provided with the private key for applications to
     * be able to decrypt data.
     * </p>
     *
     * @param providerId <p>
     *            The provider associated with the public key being used for
     *            encryption. This value must also be provided with the private
     *            key for applications to be able to decrypt data.
     *            </p>
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * <p>
     * The provider associated with the public key being used for encryption.
     * This value must also be provided with the private key for applications to
     * be able to decrypt data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerId <p>
     *            The provider associated with the public key being used for
     *            encryption. This value must also be provided with the private
     *            key for applications to be able to decrypt data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionEntity withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * <p>
     * Field patterns in a field-level encryption content type profile specify
     * the fields that you want to be encrypted. You can provide the full field
     * name, or any beginning characters followed by a wildcard (*). You can't
     * overlap field patterns. For example, you can't have both ABC* and AB*.
     * Note that field patterns are case-sensitive.
     * </p>
     *
     * @return <p>
     *         Field patterns in a field-level encryption content type profile
     *         specify the fields that you want to be encrypted. You can provide
     *         the full field name, or any beginning characters followed by a
     *         wildcard (*). You can't overlap field patterns. For example, you
     *         can't have both ABC* and AB*. Note that field patterns are
     *         case-sensitive.
     *         </p>
     */
    public FieldPatterns getFieldPatterns() {
        return fieldPatterns;
    }

    /**
     * <p>
     * Field patterns in a field-level encryption content type profile specify
     * the fields that you want to be encrypted. You can provide the full field
     * name, or any beginning characters followed by a wildcard (*). You can't
     * overlap field patterns. For example, you can't have both ABC* and AB*.
     * Note that field patterns are case-sensitive.
     * </p>
     *
     * @param fieldPatterns <p>
     *            Field patterns in a field-level encryption content type
     *            profile specify the fields that you want to be encrypted. You
     *            can provide the full field name, or any beginning characters
     *            followed by a wildcard (*). You can't overlap field patterns.
     *            For example, you can't have both ABC* and AB*. Note that field
     *            patterns are case-sensitive.
     *            </p>
     */
    public void setFieldPatterns(FieldPatterns fieldPatterns) {
        this.fieldPatterns = fieldPatterns;
    }

    /**
     * <p>
     * Field patterns in a field-level encryption content type profile specify
     * the fields that you want to be encrypted. You can provide the full field
     * name, or any beginning characters followed by a wildcard (*). You can't
     * overlap field patterns. For example, you can't have both ABC* and AB*.
     * Note that field patterns are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldPatterns <p>
     *            Field patterns in a field-level encryption content type
     *            profile specify the fields that you want to be encrypted. You
     *            can provide the full field name, or any beginning characters
     *            followed by a wildcard (*). You can't overlap field patterns.
     *            For example, you can't have both ABC* and AB*. Note that field
     *            patterns are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionEntity withFieldPatterns(FieldPatterns fieldPatterns) {
        this.fieldPatterns = fieldPatterns;
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
        if (getPublicKeyId() != null)
            sb.append("PublicKeyId: " + getPublicKeyId() + ",");
        if (getProviderId() != null)
            sb.append("ProviderId: " + getProviderId() + ",");
        if (getFieldPatterns() != null)
            sb.append("FieldPatterns: " + getFieldPatterns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPublicKeyId() == null) ? 0 : getPublicKeyId().hashCode());
        hashCode = prime * hashCode + ((getProviderId() == null) ? 0 : getProviderId().hashCode());
        hashCode = prime * hashCode
                + ((getFieldPatterns() == null) ? 0 : getFieldPatterns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionEntity == false)
            return false;
        EncryptionEntity other = (EncryptionEntity) obj;

        if (other.getPublicKeyId() == null ^ this.getPublicKeyId() == null)
            return false;
        if (other.getPublicKeyId() != null
                && other.getPublicKeyId().equals(this.getPublicKeyId()) == false)
            return false;
        if (other.getProviderId() == null ^ this.getProviderId() == null)
            return false;
        if (other.getProviderId() != null
                && other.getProviderId().equals(this.getProviderId()) == false)
            return false;
        if (other.getFieldPatterns() == null ^ this.getFieldPatterns() == null)
            return false;
        if (other.getFieldPatterns() != null
                && other.getFieldPatterns().equals(this.getFieldPatterns()) == false)
            return false;
        return true;
    }
}
