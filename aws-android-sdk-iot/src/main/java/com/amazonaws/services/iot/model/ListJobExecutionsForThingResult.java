/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListJobExecutionsForThingResult implements Serializable {
    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     */
    private java.util.List<JobExecutionSummaryForThing> executionSummaries;

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     *
     * @return <p>
     *         A list of job execution summaries.
     *         </p>
     */
    public java.util.List<JobExecutionSummaryForThing> getExecutionSummaries() {
        return executionSummaries;
    }

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     *
     * @param executionSummaries <p>
     *            A list of job execution summaries.
     *            </p>
     */
    public void setExecutionSummaries(
            java.util.Collection<JobExecutionSummaryForThing> executionSummaries) {
        if (executionSummaries == null) {
            this.executionSummaries = null;
            return;
        }

        this.executionSummaries = new java.util.ArrayList<JobExecutionSummaryForThing>(
                executionSummaries);
    }

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionSummaries <p>
     *            A list of job execution summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobExecutionsForThingResult withExecutionSummaries(
            JobExecutionSummaryForThing... executionSummaries) {
        if (getExecutionSummaries() == null) {
            this.executionSummaries = new java.util.ArrayList<JobExecutionSummaryForThing>(
                    executionSummaries.length);
        }
        for (JobExecutionSummaryForThing value : executionSummaries) {
            this.executionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of job execution summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionSummaries <p>
     *            A list of job execution summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobExecutionsForThingResult withExecutionSummaries(
            java.util.Collection<JobExecutionSummaryForThing> executionSummaries) {
        setExecutionSummaries(executionSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results, or <b>null</b> if there
     *         are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or <b>null</b> if there
     *            are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results, or <b>null</b> if there
     *            are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobExecutionsForThingResult withNextToken(String nextToken) {
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
        if (getExecutionSummaries() != null)
            sb.append("executionSummaries: " + getExecutionSummaries() + ",");
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
                + ((getExecutionSummaries() == null) ? 0 : getExecutionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobExecutionsForThingResult == false)
            return false;
        ListJobExecutionsForThingResult other = (ListJobExecutionsForThingResult) obj;

        if (other.getExecutionSummaries() == null ^ this.getExecutionSummaries() == null)
            return false;
        if (other.getExecutionSummaries() != null
                && other.getExecutionSummaries().equals(this.getExecutionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
