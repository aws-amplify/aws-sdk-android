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

import com.amazonaws.AmazonWebServiceRequest;

public class DescribeQueryDefinitionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * The new value for the queryDefinitionNamePrefix property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     */
    private String queryDefinitionNamePrefix;

    /**
     * The new value for the maxResults property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

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
     * Returns the value of the queryDefinitionNamePrefix property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     *
     * @return The value of the queryDefinitionNamePrefix property for this
     *         object.
     */
    public String getQueryDefinitionNamePrefix() {
        return queryDefinitionNamePrefix;
    }

    /**
     * Sets the value of queryDefinitionNamePrefix
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     *
     * @param queryDefinitionNamePrefix The new value for the
     *            queryDefinitionNamePrefix property for this object.
     */
    public void setQueryDefinitionNamePrefix(String queryDefinitionNamePrefix) {
        this.queryDefinitionNamePrefix = queryDefinitionNamePrefix;
    }

    /**
     * Sets the value of the queryDefinitionNamePrefix property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^([^:*\/]+\/?)*[^:*\/]+$<br/>
     *
     * @param queryDefinitionNamePrefix The new value for the
     *            queryDefinitionNamePrefix property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueryDefinitionsRequest withQueryDefinitionNamePrefix(
            String queryDefinitionNamePrefix) {
        this.queryDefinitionNamePrefix = queryDefinitionNamePrefix;
        return this;
    }

    /**
     * Returns the value of the maxResults property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The value of the maxResults property for this object.
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of maxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults The new value for the maxResults property for this
     *            object.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Sets the value of the maxResults property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults The new value for the maxResults property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueryDefinitionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public DescribeQueryDefinitionsRequest withNextToken(String nextToken) {
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
        if (getQueryDefinitionNamePrefix() != null)
            sb.append("queryDefinitionNamePrefix: " + getQueryDefinitionNamePrefix() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getQueryDefinitionNamePrefix() == null) ? 0 : getQueryDefinitionNamePrefix()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQueryDefinitionsRequest == false)
            return false;
        DescribeQueryDefinitionsRequest other = (DescribeQueryDefinitionsRequest) obj;

        if (other.getQueryDefinitionNamePrefix() == null
                ^ this.getQueryDefinitionNamePrefix() == null)
            return false;
        if (other.getQueryDefinitionNamePrefix() != null
                && other.getQueryDefinitionNamePrefix().equals(this.getQueryDefinitionNamePrefix()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
