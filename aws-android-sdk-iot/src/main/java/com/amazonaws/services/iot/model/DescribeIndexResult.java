/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class DescribeIndexResult implements Serializable {
    /**
     * <p>
     * The index name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The index status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     */
    private String indexStatus;

    /**
     * <p>
     * Contains a value that specifies the type of indexing performed. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains only registry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry data and shadow
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains registry
     * data and thing connectivity status data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index contains
     * registry data, shadow data, and thing connectivity status data.
     * </p>
     * </li>
     * </ul>
     */
    private String schema;

    /**
     * <p>
     * The index name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The index name.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The index name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The index name.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The index name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The index name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The index status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @return <p>
     *         The index status.
     *         </p>
     * @see IndexStatus
     */
    public String getIndexStatus() {
        return indexStatus;
    }

    /**
     * <p>
     * The index status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param indexStatus <p>
     *            The index status.
     *            </p>
     * @see IndexStatus
     */
    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    /**
     * <p>
     * The index status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param indexStatus <p>
     *            The index status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public DescribeIndexResult withIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }

    /**
     * <p>
     * The index status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param indexStatus <p>
     *            The index status.
     *            </p>
     * @see IndexStatus
     */
    public void setIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
    }

    /**
     * <p>
     * The index status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, BUILDING, REBUILDING
     *
     * @param indexStatus <p>
     *            The index status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IndexStatus
     */
    public DescribeIndexResult withIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains a value that specifies the type of indexing performed. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains only registry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry data and shadow
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains registry
     * data and thing connectivity status data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index contains
     * registry data, shadow data, and thing connectivity status data.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Contains a value that specifies the type of indexing performed.
     *         Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         REGISTRY – Your thing index contains only registry data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGISTRY_AND_SHADOW - Your thing index contains registry data and
     *         shadow data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains
     *         registry data and thing connectivity status data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index
     *         contains registry data, shadow data, and thing connectivity
     *         status data.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSchema() {
        return schema;
    }

    /**
     * <p>
     * Contains a value that specifies the type of indexing performed. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains only registry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry data and shadow
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains registry
     * data and thing connectivity status data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index contains
     * registry data, shadow data, and thing connectivity status data.
     * </p>
     * </li>
     * </ul>
     *
     * @param schema <p>
     *            Contains a value that specifies the type of indexing
     *            performed. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains only registry data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry data
     *            and shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains
     *            registry data and thing connectivity status data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index
     *            contains registry data, shadow data, and thing connectivity
     *            status data.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * Contains a value that specifies the type of indexing performed. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains only registry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry data and shadow
     * data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains registry
     * data and thing connectivity status data.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index contains
     * registry data, shadow data, and thing connectivity status data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            Contains a value that specifies the type of indexing
     *            performed. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains only registry data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry data
     *            and shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains
     *            registry data and thing connectivity status data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index
     *            contains registry data, shadow data, and thing connectivity
     *            status data.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIndexResult withSchema(String schema) {
        this.schema = schema;
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
        if (getIndexName() != null)
            sb.append("indexName: " + getIndexName() + ",");
        if (getIndexStatus() != null)
            sb.append("indexStatus: " + getIndexStatus() + ",");
        if (getSchema() != null)
            sb.append("schema: " + getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getIndexStatus() == null) ? 0 : getIndexStatus().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIndexResult == false)
            return false;
        DescribeIndexResult other = (DescribeIndexResult) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null)
            return false;
        if (other.getIndexStatus() != null
                && other.getIndexStatus().equals(this.getIndexStatus()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }
}
