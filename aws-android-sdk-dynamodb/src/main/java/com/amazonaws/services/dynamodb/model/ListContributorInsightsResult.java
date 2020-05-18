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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

public class ListContributorInsightsResult implements Serializable {
    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     */
    private java.util.List<ContributorInsightsSummary> contributorInsightsSummaries;

    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     *
     * @return <p>
     *         A list of ContributorInsightsSummary.
     *         </p>
     */
    public java.util.List<ContributorInsightsSummary> getContributorInsightsSummaries() {
        return contributorInsightsSummaries;
    }

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     *
     * @param contributorInsightsSummaries <p>
     *            A list of ContributorInsightsSummary.
     *            </p>
     */
    public void setContributorInsightsSummaries(
            java.util.Collection<ContributorInsightsSummary> contributorInsightsSummaries) {
        if (contributorInsightsSummaries == null) {
            this.contributorInsightsSummaries = null;
            return;
        }

        this.contributorInsightsSummaries = new java.util.ArrayList<ContributorInsightsSummary>(
                contributorInsightsSummaries);
    }

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contributorInsightsSummaries <p>
     *            A list of ContributorInsightsSummary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContributorInsightsResult withContributorInsightsSummaries(
            ContributorInsightsSummary... contributorInsightsSummaries) {
        if (getContributorInsightsSummaries() == null) {
            this.contributorInsightsSummaries = new java.util.ArrayList<ContributorInsightsSummary>(
                    contributorInsightsSummaries.length);
        }
        for (ContributorInsightsSummary value : contributorInsightsSummaries) {
            this.contributorInsightsSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of ContributorInsightsSummary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contributorInsightsSummaries <p>
     *            A list of ContributorInsightsSummary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContributorInsightsResult withContributorInsightsSummaries(
            java.util.Collection<ContributorInsightsSummary> contributorInsightsSummaries) {
        setContributorInsightsSummaries(contributorInsightsSummaries);
        return this;
    }

    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     *
     * @return <p>
     *         A token to go to the next page if there is one.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     *
     * @param nextToken <p>
     *            A token to go to the next page if there is one.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to go to the next page if there is one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to go to the next page if there is one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContributorInsightsResult withNextToken(String nextToken) {
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
        if (getContributorInsightsSummaries() != null)
            sb.append("ContributorInsightsSummaries: " + getContributorInsightsSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getContributorInsightsSummaries() == null) ? 0
                        : getContributorInsightsSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContributorInsightsResult == false)
            return false;
        ListContributorInsightsResult other = (ListContributorInsightsResult) obj;

        if (other.getContributorInsightsSummaries() == null
                ^ this.getContributorInsightsSummaries() == null)
            return false;
        if (other.getContributorInsightsSummaries() != null
                && other.getContributorInsightsSummaries().equals(
                        this.getContributorInsightsSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
