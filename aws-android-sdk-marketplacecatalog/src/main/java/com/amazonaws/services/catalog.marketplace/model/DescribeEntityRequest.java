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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the metadata and content of the entity.
 * </p>
 */
public class DescribeEntityRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String catalog;

    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     */
    private String entityId;

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         Required. The catalog related to the request. Fixed value:
     *         <code>AWSMarketplace</code>
     *         </p>
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            Required. The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            Required. The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEntityRequest withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @return <p>
     *         Required. The unique ID of the entity to describe.
     *         </p>
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param entityId <p>
     *            Required. The unique ID of the entity to describe.
     *            </p>
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param entityId <p>
     *            Required. The unique ID of the entity to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEntityRequest withEntityId(String entityId) {
        this.entityId = entityId;
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
        if (getCatalog() != null)
            sb.append("Catalog: " + getCatalog() + ",");
        if (getEntityId() != null)
            sb.append("EntityId: " + getEntityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntityRequest == false)
            return false;
        DescribeEntityRequest other = (DescribeEntityRequest) obj;

        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        return true;
    }
}
