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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class ListSchemasResult implements Serializable {
    /**
     * <p>
     * A list of schemas.
     * </p>
     */
    private java.util.List<DatasetSchemaSummary> schemas;

    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of schemas.
     * </p>
     *
     * @return <p>
     *         A list of schemas.
     *         </p>
     */
    public java.util.List<DatasetSchemaSummary> getSchemas() {
        return schemas;
    }

    /**
     * <p>
     * A list of schemas.
     * </p>
     *
     * @param schemas <p>
     *            A list of schemas.
     *            </p>
     */
    public void setSchemas(java.util.Collection<DatasetSchemaSummary> schemas) {
        if (schemas == null) {
            this.schemas = null;
            return;
        }

        this.schemas = new java.util.ArrayList<DatasetSchemaSummary>(schemas);
    }

    /**
     * <p>
     * A list of schemas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemas <p>
     *            A list of schemas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSchemasResult withSchemas(DatasetSchemaSummary... schemas) {
        if (getSchemas() == null) {
            this.schemas = new java.util.ArrayList<DatasetSchemaSummary>(schemas.length);
        }
        for (DatasetSchemaSummary value : schemas) {
            this.schemas.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of schemas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemas <p>
     *            A list of schemas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSchemasResult withSchemas(java.util.Collection<DatasetSchemaSummary> schemas) {
        setSchemas(schemas);
        return this;
    }

    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token used to get the next set of schemas (if they exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token used to get the next set of schemas (if they exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of schemas (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token used to get the next set of schemas (if they exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSchemasResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSchemas() != null)
            sb.append("schemas: " + getSchemas() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemas() == null) ? 0 : getSchemas().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSchemasResult == false)
            return false;
        ListSchemasResult other = (ListSchemasResult) obj;

        if (other.getSchemas() == null ^ this.getSchemas() == null)
            return false;
        if (other.getSchemas() != null && other.getSchemas().equals(this.getSchemas()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
