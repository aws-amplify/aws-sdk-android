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
 * Specifies the encryption-at-rest configuration for the Data Catalog.
 * </p>
 */
public class EncryptionAtRest implements Serializable {
    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS
     */
    private String catalogEncryptionMode;

    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String sseAwsKmsKeyId;

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS
     *
     * @return <p>
     *         The encryption-at-rest mode for encrypting Data Catalog data.
     *         </p>
     * @see CatalogEncryptionMode
     */
    public String getCatalogEncryptionMode() {
        return catalogEncryptionMode;
    }

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS
     *
     * @param catalogEncryptionMode <p>
     *            The encryption-at-rest mode for encrypting Data Catalog data.
     *            </p>
     * @see CatalogEncryptionMode
     */
    public void setCatalogEncryptionMode(String catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode;
    }

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS
     *
     * @param catalogEncryptionMode <p>
     *            The encryption-at-rest mode for encrypting Data Catalog data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CatalogEncryptionMode
     */
    public EncryptionAtRest withCatalogEncryptionMode(String catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode;
        return this;
    }

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS
     *
     * @param catalogEncryptionMode <p>
     *            The encryption-at-rest mode for encrypting Data Catalog data.
     *            </p>
     * @see CatalogEncryptionMode
     */
    public void setCatalogEncryptionMode(CatalogEncryptionMode catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode.toString();
    }

    /**
     * <p>
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, SSE-KMS
     *
     * @param catalogEncryptionMode <p>
     *            The encryption-at-rest mode for encrypting Data Catalog data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CatalogEncryptionMode
     */
    public EncryptionAtRest withCatalogEncryptionMode(CatalogEncryptionMode catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the AWS KMS key to use for encryption at rest.
     *         </p>
     */
    public String getSseAwsKmsKeyId() {
        return sseAwsKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param sseAwsKmsKeyId <p>
     *            The ID of the AWS KMS key to use for encryption at rest.
     *            </p>
     */
    public void setSseAwsKmsKeyId(String sseAwsKmsKeyId) {
        this.sseAwsKmsKeyId = sseAwsKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use for encryption at rest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param sseAwsKmsKeyId <p>
     *            The ID of the AWS KMS key to use for encryption at rest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionAtRest withSseAwsKmsKeyId(String sseAwsKmsKeyId) {
        this.sseAwsKmsKeyId = sseAwsKmsKeyId;
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
        if (getCatalogEncryptionMode() != null)
            sb.append("CatalogEncryptionMode: " + getCatalogEncryptionMode() + ",");
        if (getSseAwsKmsKeyId() != null)
            sb.append("SseAwsKmsKeyId: " + getSseAwsKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCatalogEncryptionMode() == null) ? 0 : getCatalogEncryptionMode().hashCode());
        hashCode = prime * hashCode
                + ((getSseAwsKmsKeyId() == null) ? 0 : getSseAwsKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionAtRest == false)
            return false;
        EncryptionAtRest other = (EncryptionAtRest) obj;

        if (other.getCatalogEncryptionMode() == null ^ this.getCatalogEncryptionMode() == null)
            return false;
        if (other.getCatalogEncryptionMode() != null
                && other.getCatalogEncryptionMode().equals(this.getCatalogEncryptionMode()) == false)
            return false;
        if (other.getSseAwsKmsKeyId() == null ^ this.getSseAwsKmsKeyId() == null)
            return false;
        if (other.getSseAwsKmsKeyId() != null
                && other.getSseAwsKmsKeyId().equals(this.getSseAwsKmsKeyId()) == false)
            return false;
        return true;
    }
}
