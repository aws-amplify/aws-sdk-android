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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The summary information for the data catalog, which includes its name and
 * type.
 * </p>
 */
public class DataCatalogSummary implements Serializable {
    /**
     * <p>
     * The name of the data catalog.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogName;

    /**
     * <p>
     * The data catalog type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     */
    private String type;

    /**
     * <p>
     * The name of the data catalog.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the data catalog.
     *         </p>
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * <p>
     * The name of the data catalog.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogName <p>
     *            The name of the data catalog.
     *            </p>
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * <p>
     * The name of the data catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogName <p>
     *            The name of the data catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCatalogSummary withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @return <p>
     *         The data catalog type.
     *         </p>
     * @see DataCatalogType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The data catalog type.
     *            </p>
     * @see DataCatalogType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The data catalog type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataCatalogType
     */
    public DataCatalogSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The data catalog type.
     *            </p>
     * @see DataCatalogType
     */
    public void setType(DataCatalogType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The data catalog type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LAMBDA, GLUE, HIVE
     *
     * @param type <p>
     *            The data catalog type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataCatalogType
     */
    public DataCatalogSummary withType(DataCatalogType type) {
        this.type = type.toString();
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
        if (getCatalogName() != null)
            sb.append("CatalogName: " + getCatalogName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCatalogName() == null) ? 0 : getCatalogName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCatalogSummary == false)
            return false;
        DataCatalogSummary other = (DataCatalogSummary) obj;

        if (other.getCatalogName() == null ^ this.getCatalogName() == null)
            return false;
        if (other.getCatalogName() != null
                && other.getCatalogName().equals(this.getCatalogName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
