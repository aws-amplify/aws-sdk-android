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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class GetInventoryResult implements Serializable {
    /**
     * <p>Collection of inventory entities such as a collection of instance inventory. </p>
     */
    private java.util.List<InventoryResultEntity> entities;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>Collection of inventory entities such as a collection of instance inventory. </p>
     *
     * @return <p>Collection of inventory entities such as a collection of instance inventory. </p>
     */
    public java.util.List<InventoryResultEntity> getEntities() {
        return entities;
    }

    /**
     * <p>Collection of inventory entities such as a collection of instance inventory. </p>
     *
     * @param entities <p>Collection of inventory entities such as a collection of instance inventory. </p>
     */
    public void setEntities(java.util.Collection<InventoryResultEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<InventoryResultEntity>(entities);
    }

    /**
     * <p>Collection of inventory entities such as a collection of instance inventory. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entities <p>Collection of inventory entities such as a collection of instance inventory. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryResult withEntities(InventoryResultEntity... entities) {
        if (getEntities() == null) {
            this.entities = new java.util.ArrayList<InventoryResultEntity>(entities.length);
        }
        for (InventoryResultEntity value : entities) {
            this.entities.add(value);
        }
        return this;
    }

    /**
     * <p>Collection of inventory entities such as a collection of instance inventory. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entities <p>Collection of inventory entities such as a collection of instance inventory. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryResult withEntities(java.util.Collection<InventoryResultEntity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetInventoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEntities() != null) sb.append("Entities: " + getEntities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetInventoryResult == false) return false;
        GetInventoryResult other = (GetInventoryResult)obj;

        if (other.getEntities() == null ^ this.getEntities() == null) return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
