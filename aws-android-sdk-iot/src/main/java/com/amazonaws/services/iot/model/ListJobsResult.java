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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListJobsResult implements Serializable {
    /**
     * <p>
     * A list of jobs.
     * </p>
     */
    private java.util.List<JobSummary> jobs;

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no
     * additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of jobs.
     * </p>
     *
     * @return <p>
     *         A list of jobs.
     *         </p>
     */
    public java.util.List<JobSummary> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     *
     * @param jobs <p>
     *            A list of jobs.
     *            </p>
     */
    public void setJobs(java.util.Collection<JobSummary> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<JobSummary>(jobs);
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobs <p>
     *            A list of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withJobs(JobSummary... jobs) {
        if (getJobs() == null) {
            this.jobs = new java.util.ArrayList<JobSummary>(jobs.length);
        }
        for (JobSummary value : jobs) {
            this.jobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobs <p>
     *            A list of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withJobs(java.util.Collection<JobSummary> jobs) {
        setJobs(jobs);
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
    public ListJobsResult withNextToken(String nextToken) {
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
        if (getJobs() != null)
            sb.append("jobs: " + getJobs() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsResult == false)
            return false;
        ListJobsResult other = (ListJobsResult) obj;

        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
