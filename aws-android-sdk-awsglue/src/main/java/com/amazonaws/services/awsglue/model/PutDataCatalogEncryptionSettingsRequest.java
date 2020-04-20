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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the security configuration for a specified catalog. After the
 * configuration has been set, the specified encryption is applied to every
 * catalog write thereafter.
 * </p>
 */
public class PutDataCatalogEncryptionSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Data Catalog to set the security configuration for. If none
     * is provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * The security configuration to set.
     * </p>
     */
    private DataCatalogEncryptionSettings dataCatalogEncryptionSettings;

    /**
     * <p>
     * The ID of the Data Catalog to set the security configuration for. If none
     * is provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the Data Catalog to set the security configuration for.
     *         If none is provided, the AWS account ID is used by default.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog to set the security configuration for. If none
     * is provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog to set the security configuration
     *            for. If none is provided, the AWS account ID is used by
     *            default.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog to set the security configuration for. If none
     * is provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog to set the security configuration
     *            for. If none is provided, the AWS account ID is used by
     *            default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDataCatalogEncryptionSettingsRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * The security configuration to set.
     * </p>
     *
     * @return <p>
     *         The security configuration to set.
     *         </p>
     */
    public DataCatalogEncryptionSettings getDataCatalogEncryptionSettings() {
        return dataCatalogEncryptionSettings;
    }

    /**
     * <p>
     * The security configuration to set.
     * </p>
     *
     * @param dataCatalogEncryptionSettings <p>
     *            The security configuration to set.
     *            </p>
     */
    public void setDataCatalogEncryptionSettings(
            DataCatalogEncryptionSettings dataCatalogEncryptionSettings) {
        this.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
    }

    /**
     * <p>
     * The security configuration to set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataCatalogEncryptionSettings <p>
     *            The security configuration to set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDataCatalogEncryptionSettingsRequest withDataCatalogEncryptionSettings(
            DataCatalogEncryptionSettings dataCatalogEncryptionSettings) {
        this.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
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
        if (getCatalogId() != null)
            sb.append("CatalogId: " + getCatalogId() + ",");
        if (getDataCatalogEncryptionSettings() != null)
            sb.append("DataCatalogEncryptionSettings: " + getDataCatalogEncryptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataCatalogEncryptionSettings() == null) ? 0
                        : getDataCatalogEncryptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDataCatalogEncryptionSettingsRequest == false)
            return false;
        PutDataCatalogEncryptionSettingsRequest other = (PutDataCatalogEncryptionSettingsRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDataCatalogEncryptionSettings() == null
                ^ this.getDataCatalogEncryptionSettings() == null)
            return false;
        if (other.getDataCatalogEncryptionSettings() != null
                && other.getDataCatalogEncryptionSettings().equals(
                        this.getDataCatalogEncryptionSettings()) == false)
            return false;
        return true;
    }
}
