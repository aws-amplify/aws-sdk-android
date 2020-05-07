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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class DescribeQueryDefinitionsResult implements Serializable {
    /**
     * The new value for the queryDefinitions property for this object.
     */
    private java.util.List<QueryDefinition> queryDefinitions;

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * Returns the value of the queryDefinitions property for this object.
     *
     * @return The value of the queryDefinitions property for this object.
     */
    public java.util.List<QueryDefinition> getQueryDefinitions() {
        return queryDefinitions;
    }

    /**
     * Sets the value of queryDefinitions
     *
     * @param queryDefinitions The new value for the queryDefinitions property
     *            for this object.
     */
    public void setQueryDefinitions(java.util.Collection<QueryDefinition> queryDefinitions) {
        if (queryDefinitions == null) {
            this.queryDefinitions = null;
            return;
        }

        this.queryDefinitions = new java.util.ArrayList<QueryDefinition>(queryDefinitions);
    }

    /**
     * Sets the value of the queryDefinitions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryDefinitions The new value for the queryDefinitions property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueryDefinitionsResult withQueryDefinitions(QueryDefinition... queryDefinitions) {
        if (getQueryDefinitions() == null) {
            this.queryDefinitions = new java.util.ArrayList<QueryDefinition>(
                    queryDefinitions.length);
        }
        for (QueryDefinition value : queryDefinitions) {
            this.queryDefinitions.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the queryDefinitions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryDefinitions The new value for the queryDefinitions property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueryDefinitionsResult withQueryDefinitions(
            java.util.Collection<QueryDefinition> queryDefinitions) {
        setQueryDefinitions(queryDefinitions);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. The token expires
     *         after 24 hours.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueryDefinitionsResult withNextToken(String nextToken) {
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
        if (getQueryDefinitions() != null)
            sb.append("queryDefinitions: " + getQueryDefinitions() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryDefinitions() == null) ? 0 : getQueryDefinitions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQueryDefinitionsResult == false)
            return false;
        DescribeQueryDefinitionsResult other = (DescribeQueryDefinitionsResult) obj;

        if (other.getQueryDefinitions() == null ^ this.getQueryDefinitions() == null)
            return false;
        if (other.getQueryDefinitions() != null
                && other.getQueryDefinitions().equals(this.getQueryDefinitions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
