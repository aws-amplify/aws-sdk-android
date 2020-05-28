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

public class ListEntitiesResult implements Serializable {
    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     */
    private java.util.List<EntitySummary> entitySummaryList;

    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more
     * result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     *
     * @return <p>
     *         Array of <code>EntitySummary</code> object.
     *         </p>
     */
    public java.util.List<EntitySummary> getEntitySummaryList() {
        return entitySummaryList;
    }

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     *
     * @param entitySummaryList <p>
     *            Array of <code>EntitySummary</code> object.
     *            </p>
     */
    public void setEntitySummaryList(java.util.Collection<EntitySummary> entitySummaryList) {
        if (entitySummaryList == null) {
            this.entitySummaryList = null;
            return;
        }

        this.entitySummaryList = new java.util.ArrayList<EntitySummary>(entitySummaryList);
    }

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entitySummaryList <p>
     *            Array of <code>EntitySummary</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesResult withEntitySummaryList(EntitySummary... entitySummaryList) {
        if (getEntitySummaryList() == null) {
            this.entitySummaryList = new java.util.ArrayList<EntitySummary>(
                    entitySummaryList.length);
        }
        for (EntitySummary value : entitySummaryList) {
            this.entitySummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Array of <code>EntitySummary</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entitySummaryList <p>
     *            Array of <code>EntitySummary</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesResult withEntitySummaryList(
            java.util.Collection<EntitySummary> entitySummaryList) {
        setEntitySummaryList(entitySummaryList);
        return this;
    }

    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more
     * result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @return <p>
     *         The value of the next token if it exists. Null if there is no
     *         more result.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more
     * result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @param nextToken <p>
     *            The value of the next token if it exists. Null if there is no
     *            more result.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value of the next token if it exists. Null if there is no more
     * result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[\w+=.:@\-\/]$<br/>
     *
     * @param nextToken <p>
     *            The value of the next token if it exists. Null if there is no
     *            more result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntitiesResult withNextToken(String nextToken) {
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
        if (getEntitySummaryList() != null)
            sb.append("EntitySummaryList: " + getEntitySummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEntitySummaryList() == null) ? 0 : getEntitySummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntitiesResult == false)
            return false;
        ListEntitiesResult other = (ListEntitiesResult) obj;

        if (other.getEntitySummaryList() == null ^ this.getEntitySummaryList() == null)
            return false;
        if (other.getEntitySummaryList() != null
                && other.getEntitySummaryList().equals(this.getEntitySummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
