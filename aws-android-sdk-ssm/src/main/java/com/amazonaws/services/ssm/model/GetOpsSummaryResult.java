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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class GetOpsSummaryResult implements Serializable {
    /**
     * <p>
     * The list of aggregated and filtered OpsItems.
     * </p>
     */
    private java.util.List<OpsEntity> entities;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of aggregated and filtered OpsItems.
     * </p>
     *
     * @return <p>
     *         The list of aggregated and filtered OpsItems.
     *         </p>
     */
    public java.util.List<OpsEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The list of aggregated and filtered OpsItems.
     * </p>
     *
     * @param entities <p>
     *            The list of aggregated and filtered OpsItems.
     *            </p>
     */
    public void setEntities(java.util.Collection<OpsEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<OpsEntity>(entities);
    }

    /**
     * <p>
     * The list of aggregated and filtered OpsItems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            The list of aggregated and filtered OpsItems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpsSummaryResult withEntities(OpsEntity... entities) {
        if (getEntities() == null) {
            this.entities = new java.util.ArrayList<OpsEntity>(entities.length);
        }
        for (OpsEntity value : entities) {
            this.entities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of aggregated and filtered OpsItems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entities <p>
     *            The list of aggregated and filtered OpsItems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpsSummaryResult withEntities(java.util.Collection<OpsEntity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. Use this token to
     *         get the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpsSummaryResult withNextToken(String nextToken) {
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
        if (getEntities() != null)
            sb.append("Entities: " + getEntities() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpsSummaryResult == false)
            return false;
        GetOpsSummaryResult other = (GetOpsSummaryResult) obj;

        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
