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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


public class ListJobsResult implements Serializable {
    /**
     * <p>If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z0-9\+\:\/\=\?\#-_]+$<br/>
     */
    private String nextToken;

    /**
     * <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     */
    private java.util.List<JobListDescriptor> jobs;

    /**
     * <p>If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z0-9\+\:\/\=\?\#-_]+$<br/>
     *
     * @return <p>If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z0-9\+\:\/\=\?\#-_]+$<br/>
     *
     * @param nextToken <p>If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z0-9\+\:\/\=\?\#-_]+$<br/>
     *
     * @param nextToken <p>If the <code>List Jobs</code> request produced more than the maximum number of results, you can pass this value into a subsequent <code>List Jobs</code> request in order to retrieve the next page of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListJobsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     *
     * @return <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     */
    public java.util.List<JobListDescriptor> getJobs() {
        return jobs;
    }

    /**
     * <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     *
     * @param jobs <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     */
    public void setJobs(java.util.Collection<JobListDescriptor> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<JobListDescriptor>(jobs);
    }

    /**
     * <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobs <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListJobsResult withJobs(JobListDescriptor... jobs) {
        if (getJobs() == null) {
            this.jobs = new java.util.ArrayList<JobListDescriptor>(jobs.length);
        }
        for (JobListDescriptor value : jobs) {
            this.jobs.add(value);
        }
        return this;
    }

    /**
     * <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobs <p>The list of current jobs and jobs that have ended within the last 30 days.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListJobsResult withJobs(java.util.Collection<JobListDescriptor> jobs) {
        setJobs(jobs);
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getJobs() != null) sb.append("Jobs: " + getJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsResult == false) return false;
        ListJobsResult other = (ListJobsResult)obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getJobs() == null ^ this.getJobs() == null) return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false) return false;
        return true;
    }
}
