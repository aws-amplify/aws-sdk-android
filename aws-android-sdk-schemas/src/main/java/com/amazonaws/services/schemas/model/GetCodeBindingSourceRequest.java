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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Get the code binding source URI.
 * </p>
 */
public class GetCodeBindingSourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The language of the code binding.
     * </p>
     */
    private String language;

    /**
     * <p>
     * The name of the registry.
     * </p>
     */
    private String registryName;

    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;

    /**
     * <p>
     * Specifying this limits the results to only this schema version.
     * </p>
     */
    private String schemaVersion;

    /**
     * <p>
     * The language of the code binding.
     * </p>
     *
     * @return <p>
     *         The language of the code binding.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The language of the code binding.
     * </p>
     *
     * @param language <p>
     *            The language of the code binding.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language of the code binding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param language <p>
     *            The language of the code binding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCodeBindingSourceRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     *
     * @return <p>
     *         The name of the registry.
     *         </p>
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     *
     * @param registryName <p>
     *            The name of the registry.
     *            </p>
     */
    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryName <p>
     *            The name of the registry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCodeBindingSourceRequest withRegistryName(String registryName) {
        this.registryName = registryName;
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
    public GetCodeBindingSourceRequest withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * <p>
     * Specifying this limits the results to only this schema version.
     * </p>
     *
     * @return <p>
     *         Specifying this limits the results to only this schema version.
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * Specifying this limits the results to only this schema version.
     * </p>
     *
     * @param schemaVersion <p>
     *            Specifying this limits the results to only this schema
     *            version.
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * Specifying this limits the results to only this schema version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaVersion <p>
     *            Specifying this limits the results to only this schema
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCodeBindingSourceRequest withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
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
        if (getLanguage() != null)
            sb.append("Language: " + getLanguage() + ",");
        if (getRegistryName() != null)
            sb.append("RegistryName: " + getRegistryName() + ",");
        if (getSchemaName() != null)
            sb.append("SchemaName: " + getSchemaName() + ",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: " + getSchemaVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCodeBindingSourceRequest == false)
            return false;
        GetCodeBindingSourceRequest other = (GetCodeBindingSourceRequest) obj;

        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null
                && other.getRegistryName().equals(this.getRegistryName()) == false)
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
        return true;
    }
}
