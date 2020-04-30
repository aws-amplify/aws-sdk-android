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

public class ListSchemaVersionsResult implements Serializable {
    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of schema version summaries.
     * </p>
     */
    private java.util.List<SchemaVersionSummary> schemaVersions;

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @return <p>
     *         The token that specifies the next page of results to return. To
     *         request the first page, leave NextToken empty. The token will
     *         expire in 24 hours, and cannot be shared with other accounts.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSchemaVersionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public java.util.List<SchemaVersionSummary> getSchemaVersions() {
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
    public void setSchemaVersions(java.util.Collection<SchemaVersionSummary> schemaVersions) {
        if (schemaVersions == null) {
            this.schemaVersions = null;
            return;
        }

        this.schemaVersions = new java.util.ArrayList<SchemaVersionSummary>(schemaVersions);
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
    public ListSchemaVersionsResult withSchemaVersions(SchemaVersionSummary... schemaVersions) {
        if (getSchemaVersions() == null) {
            this.schemaVersions = new java.util.ArrayList<SchemaVersionSummary>(
                    schemaVersions.length);
        }
        for (SchemaVersionSummary value : schemaVersions) {
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
    public ListSchemaVersionsResult withSchemaVersions(
            java.util.Collection<SchemaVersionSummary> schemaVersions) {
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSchemaVersions() != null)
            sb.append("SchemaVersions: " + getSchemaVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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

        if (obj instanceof ListSchemaVersionsResult == false)
            return false;
        ListSchemaVersionsResult other = (ListSchemaVersionsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSchemaVersions() == null ^ this.getSchemaVersions() == null)
            return false;
        if (other.getSchemaVersions() != null
                && other.getSchemaVersions().equals(this.getSchemaVersions()) == false)
            return false;
        return true;
    }
}
