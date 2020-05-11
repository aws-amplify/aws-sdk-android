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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;


public class ListRepositoryAssociationsResult implements Serializable {
    /**
     * <p>A list of repository associations that meet the criteria of the request.</p>
     */
    private java.util.List<RepositoryAssociationSummary> repositoryAssociationSummaries;

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>ListRecommendations</code> request. When the results of a <code>ListRecommendations</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String nextToken;

    /**
     * <p>A list of repository associations that meet the criteria of the request.</p>
     *
     * @return <p>A list of repository associations that meet the criteria of the request.</p>
     */
    public java.util.List<RepositoryAssociationSummary> getRepositoryAssociationSummaries() {
        return repositoryAssociationSummaries;
    }

    /**
     * <p>A list of repository associations that meet the criteria of the request.</p>
     *
     * @param repositoryAssociationSummaries <p>A list of repository associations that meet the criteria of the request.</p>
     */
    public void setRepositoryAssociationSummaries(java.util.Collection<RepositoryAssociationSummary> repositoryAssociationSummaries) {
        if (repositoryAssociationSummaries == null) {
            this.repositoryAssociationSummaries = null;
            return;
        }

        this.repositoryAssociationSummaries = new java.util.ArrayList<RepositoryAssociationSummary>(repositoryAssociationSummaries);
    }

    /**
     * <p>A list of repository associations that meet the criteria of the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param repositoryAssociationSummaries <p>A list of repository associations that meet the criteria of the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListRepositoryAssociationsResult withRepositoryAssociationSummaries(RepositoryAssociationSummary... repositoryAssociationSummaries) {
        if (getRepositoryAssociationSummaries() == null) {
            this.repositoryAssociationSummaries = new java.util.ArrayList<RepositoryAssociationSummary>(repositoryAssociationSummaries.length);
        }
        for (RepositoryAssociationSummary value : repositoryAssociationSummaries) {
            this.repositoryAssociationSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>A list of repository associations that meet the criteria of the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param repositoryAssociationSummaries <p>A list of repository associations that meet the criteria of the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListRepositoryAssociationsResult withRepositoryAssociationSummaries(java.util.Collection<RepositoryAssociationSummary> repositoryAssociationSummaries) {
        setRepositoryAssociationSummaries(repositoryAssociationSummaries);
        return this;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>ListRecommendations</code> request. When the results of a <code>ListRecommendations</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>The <code>nextToken</code> value to include in a future <code>ListRecommendations</code> request. When the results of a <code>ListRecommendations</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>ListRecommendations</code> request. When the results of a <code>ListRecommendations</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>The <code>nextToken</code> value to include in a future <code>ListRecommendations</code> request. When the results of a <code>ListRecommendations</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The <code>nextToken</code> value to include in a future <code>ListRecommendations</code> request. When the results of a <code>ListRecommendations</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>The <code>nextToken</code> value to include in a future <code>ListRecommendations</code> request. When the results of a <code>ListRecommendations</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no more results to return. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListRepositoryAssociationsResult withNextToken(String nextToken) {
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
        if (getRepositoryAssociationSummaries() != null) sb.append("RepositoryAssociationSummaries: " + getRepositoryAssociationSummaries() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryAssociationSummaries() == null) ? 0 : getRepositoryAssociationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListRepositoryAssociationsResult == false) return false;
        ListRepositoryAssociationsResult other = (ListRepositoryAssociationsResult)obj;

        if (other.getRepositoryAssociationSummaries() == null ^ this.getRepositoryAssociationSummaries() == null) return false;
        if (other.getRepositoryAssociationSummaries() != null && other.getRepositoryAssociationSummaries().equals(this.getRepositoryAssociationSummaries()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
