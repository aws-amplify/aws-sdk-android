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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a list of connection definitions from the Data Catalog.
 * </p>
 */
public class BatchDeleteConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     */
    private java.util.List<String> connectionNameList;

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the Data Catalog in which the connections reside. If
     *         none is provided, the AWS account ID is used by default.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog in which the connections reside. If
     *            none is provided, the AWS account ID is used by default.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
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
     *            The ID of the Data Catalog in which the connections reside. If
     *            none is provided, the AWS account ID is used by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteConnectionRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     *
     * @return <p>
     *         A list of names of the connections to delete.
     *         </p>
     */
    public java.util.List<String> getConnectionNameList() {
        return connectionNameList;
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     *
     * @param connectionNameList <p>
     *            A list of names of the connections to delete.
     *            </p>
     */
    public void setConnectionNameList(java.util.Collection<String> connectionNameList) {
        if (connectionNameList == null) {
            this.connectionNameList = null;
            return;
        }

        this.connectionNameList = new java.util.ArrayList<String>(connectionNameList);
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionNameList <p>
     *            A list of names of the connections to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteConnectionRequest withConnectionNameList(String... connectionNameList) {
        if (getConnectionNameList() == null) {
            this.connectionNameList = new java.util.ArrayList<String>(connectionNameList.length);
        }
        for (String value : connectionNameList) {
            this.connectionNameList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionNameList <p>
     *            A list of names of the connections to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteConnectionRequest withConnectionNameList(
            java.util.Collection<String> connectionNameList) {
        setConnectionNameList(connectionNameList);
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
        if (getConnectionNameList() != null)
            sb.append("ConnectionNameList: " + getConnectionNameList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionNameList() == null) ? 0 : getConnectionNameList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteConnectionRequest == false)
            return false;
        BatchDeleteConnectionRequest other = (BatchDeleteConnectionRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getConnectionNameList() == null ^ this.getConnectionNameList() == null)
            return false;
        if (other.getConnectionNameList() != null
                && other.getConnectionNameList().equals(this.getConnectionNameList()) == false)
            return false;
        return true;
    }
}
