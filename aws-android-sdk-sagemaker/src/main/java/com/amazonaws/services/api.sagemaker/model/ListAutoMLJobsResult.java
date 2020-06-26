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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class ListAutoMLJobsResult implements Serializable {
    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     */
    private java.util.List<AutoMLJobSummary> autoMLJobSummaries;

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     *
     * @return <p>
     *         Returns a summary list of jobs.
     *         </p>
     */
    public java.util.List<AutoMLJobSummary> getAutoMLJobSummaries() {
        return autoMLJobSummaries;
    }

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     *
     * @param autoMLJobSummaries <p>
     *            Returns a summary list of jobs.
     *            </p>
     */
    public void setAutoMLJobSummaries(java.util.Collection<AutoMLJobSummary> autoMLJobSummaries) {
        if (autoMLJobSummaries == null) {
            this.autoMLJobSummaries = null;
            return;
        }

        this.autoMLJobSummaries = new java.util.ArrayList<AutoMLJobSummary>(autoMLJobSummaries);
    }

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobSummaries <p>
     *            Returns a summary list of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsResult withAutoMLJobSummaries(AutoMLJobSummary... autoMLJobSummaries) {
        if (getAutoMLJobSummaries() == null) {
            this.autoMLJobSummaries = new java.util.ArrayList<AutoMLJobSummary>(
                    autoMLJobSummaries.length);
        }
        for (AutoMLJobSummary value : autoMLJobSummaries) {
            this.autoMLJobSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns a summary list of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobSummaries <p>
     *            Returns a summary list of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsResult withAutoMLJobSummaries(
            java.util.Collection<AutoMLJobSummary> autoMLJobSummaries) {
        setAutoMLJobSummaries(autoMLJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous response was truncated, you will receive this
     *         token. Use it in your next request to receive the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutoMLJobsResult withNextToken(String nextToken) {
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
        if (getAutoMLJobSummaries() != null)
            sb.append("AutoMLJobSummaries: " + getAutoMLJobSummaries() + ",");
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
                + ((getAutoMLJobSummaries() == null) ? 0 : getAutoMLJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAutoMLJobsResult == false)
            return false;
        ListAutoMLJobsResult other = (ListAutoMLJobsResult) obj;

        if (other.getAutoMLJobSummaries() == null ^ this.getAutoMLJobSummaries() == null)
            return false;
        if (other.getAutoMLJobSummaries() != null
                && other.getAutoMLJobSummaries().equals(this.getAutoMLJobSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
