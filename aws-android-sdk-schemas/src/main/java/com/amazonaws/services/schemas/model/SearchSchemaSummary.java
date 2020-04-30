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

public class SearchSchemaSummary implements Serializable {
    /**
     * <p>
     * The name of the registry.
     * </p>
     */
    private String registryName;

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
     * An array of schema version summaries.
     * </p>
     */
    private java.util.List<SearchSchemaVersionSummary> schemaVersions;

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
    public SearchSchemaSummary withRegistryName(String registryName) {
        this.registryName = registryName;
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
    public SearchSchemaSummary withSchemaArn(String schemaArn) {
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
    public SearchSchemaSummary withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     *
     * @return <p>
     *         An array of schema version summaries.
     *         </p>
     */
    public java.util.List<SearchSchemaVersionSummary> getSchemaVersions() {
        return schemaVersions;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     *
     * @param schemaVersions <p>
     *            An array of schema version summaries.
     *            </p>
     */
    public void setSchemaVersions(java.util.Collection<SearchSchemaVersionSummary> schemaVersions) {
        if (schemaVersions == null) {
            this.schemaVersions = null;
            return;
        }

        this.schemaVersions = new java.util.ArrayList<SearchSchemaVersionSummary>(schemaVersions);
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaVersions <p>
     *            An array of schema version summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSchemaSummary withSchemaVersions(SearchSchemaVersionSummary... schemaVersions) {
        if (getSchemaVersions() == null) {
            this.schemaVersions = new java.util.ArrayList<SearchSchemaVersionSummary>(
                    schemaVersions.length);
        }
        for (SearchSchemaVersionSummary value : schemaVersions) {
            this.schemaVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaVersions <p>
     *            An array of schema version summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchSchemaSummary withSchemaVersions(
            java.util.Collection<SearchSchemaVersionSummary> schemaVersions) {
        setSchemaVersions(schemaVersions);
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
        if (getRegistryName() != null)
            sb.append("RegistryName: " + getRegistryName() + ",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: " + getSchemaArn() + ",");
        if (getSchemaName() != null)
            sb.append("SchemaName: " + getSchemaName() + ",");
        if (getSchemaVersions() != null)
            sb.append("SchemaVersions: " + getSchemaVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersions() == null) ? 0 : getSchemaVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSchemaSummary == false)
            return false;
        SearchSchemaSummary other = (SearchSchemaSummary) obj;

        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null
                && other.getRegistryName().equals(this.getRegistryName()) == false)
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
        if (other.getSchemaVersions() == null ^ this.getSchemaVersions() == null)
            return false;
        if (other.getSchemaVersions() != null
                && other.getSchemaVersions().equals(this.getSchemaVersions()) == false)
            return false;
        return true;
    }
}
