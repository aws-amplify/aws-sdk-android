/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListAnalyticsDataAssociationsResult implements Serializable {
    /**
     * <p>
     * An array of successful results: <code>DataSetId</code>,
     * <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     * <code>ResourceShareArn</code>. This is a paginated API, so
     * <code>nextToken</code> is given if there are more results to be returned.
     * </p>
     */
    private java.util.List<AnalyticsDataAssociationResult> results;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of successful results: <code>DataSetId</code>,
     * <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     * <code>ResourceShareArn</code>. This is a paginated API, so
     * <code>nextToken</code> is given if there are more results to be returned.
     * </p>
     *
     * @return <p>
     *         An array of successful results: <code>DataSetId</code>,
     *         <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     *         <code>ResourceShareArn</code>. This is a paginated API, so
     *         <code>nextToken</code> is given if there are more results to be
     *         returned.
     *         </p>
     */
    public java.util.List<AnalyticsDataAssociationResult> getResults() {
        return results;
    }

    /**
     * <p>
     * An array of successful results: <code>DataSetId</code>,
     * <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     * <code>ResourceShareArn</code>. This is a paginated API, so
     * <code>nextToken</code> is given if there are more results to be returned.
     * </p>
     *
     * @param results <p>
     *            An array of successful results: <code>DataSetId</code>,
     *            <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     *            <code>ResourceShareArn</code>. This is a paginated API, so
     *            <code>nextToken</code> is given if there are more results to
     *            be returned.
     *            </p>
     */
    public void setResults(java.util.Collection<AnalyticsDataAssociationResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<AnalyticsDataAssociationResult>(results);
    }

    /**
     * <p>
     * An array of successful results: <code>DataSetId</code>,
     * <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     * <code>ResourceShareArn</code>. This is a paginated API, so
     * <code>nextToken</code> is given if there are more results to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            An array of successful results: <code>DataSetId</code>,
     *            <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     *            <code>ResourceShareArn</code>. This is a paginated API, so
     *            <code>nextToken</code> is given if there are more results to
     *            be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyticsDataAssociationsResult withResults(
            AnalyticsDataAssociationResult... results) {
        if (getResults() == null) {
            this.results = new java.util.ArrayList<AnalyticsDataAssociationResult>(results.length);
        }
        for (AnalyticsDataAssociationResult value : results) {
            this.results.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of successful results: <code>DataSetId</code>,
     * <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     * <code>ResourceShareArn</code>. This is a paginated API, so
     * <code>nextToken</code> is given if there are more results to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            An array of successful results: <code>DataSetId</code>,
     *            <code>TargetAccountId</code>, <code>ResourceShareId</code>,
     *            <code>ResourceShareArn</code>. This is a paginated API, so
     *            <code>nextToken</code> is given if there are more results to
     *            be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyticsDataAssociationsResult withResults(
            java.util.Collection<AnalyticsDataAssociationResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyticsDataAssociationsResult withNextToken(String nextToken) {
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
        if (getResults() != null)
            sb.append("Results: " + getResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnalyticsDataAssociationsResult == false)
            return false;
        ListAnalyticsDataAssociationsResult other = (ListAnalyticsDataAssociationsResult) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
