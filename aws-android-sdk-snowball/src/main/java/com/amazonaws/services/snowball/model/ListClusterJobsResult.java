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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

public class ListClusterJobsResult implements Serializable {
    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID,
     * and a value that indicates whether the job is a job part, in the case of
     * export jobs.
     * </p>
     */
    private java.util.List<JobListEntry> jobListEntries;

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will
     * start from this point in the array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID,
     * and a value that indicates whether the job is a job part, in the case of
     * export jobs.
     * </p>
     *
     * @return <p>
     *         Each <code>JobListEntry</code> object contains a job's state, a
     *         job's ID, and a value that indicates whether the job is a job
     *         part, in the case of export jobs.
     *         </p>
     */
    public java.util.List<JobListEntry> getJobListEntries() {
        return jobListEntries;
    }

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID,
     * and a value that indicates whether the job is a job part, in the case of
     * export jobs.
     * </p>
     *
     * @param jobListEntries <p>
     *            Each <code>JobListEntry</code> object contains a job's state,
     *            a job's ID, and a value that indicates whether the job is a
     *            job part, in the case of export jobs.
     *            </p>
     */
    public void setJobListEntries(java.util.Collection<JobListEntry> jobListEntries) {
        if (jobListEntries == null) {
            this.jobListEntries = null;
            return;
        }

        this.jobListEntries = new java.util.ArrayList<JobListEntry>(jobListEntries);
    }

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID,
     * and a value that indicates whether the job is a job part, in the case of
     * export jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobListEntries <p>
     *            Each <code>JobListEntry</code> object contains a job's state,
     *            a job's ID, and a value that indicates whether the job is a
     *            job part, in the case of export jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterJobsResult withJobListEntries(JobListEntry... jobListEntries) {
        if (getJobListEntries() == null) {
            this.jobListEntries = new java.util.ArrayList<JobListEntry>(jobListEntries.length);
        }
        for (JobListEntry value : jobListEntries) {
            this.jobListEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Each <code>JobListEntry</code> object contains a job's state, a job's ID,
     * and a value that indicates whether the job is a job part, in the case of
     * export jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobListEntries <p>
     *            Each <code>JobListEntry</code> object contains a job's state,
     *            a job's ID, and a value that indicates whether the job is a
     *            job part, in the case of export jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterJobsResult withJobListEntries(
            java.util.Collection<JobListEntry> jobListEntries) {
        setJobListEntries(jobListEntries);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will
     * start from this point in the array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         HTTP requests are stateless. If you use the automatically
     *         generated <code>NextToken</code> value in your next
     *         <code>ListClusterJobsResult</code> call, your list of returned
     *         jobs will start from this point in the array.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will
     * start from this point in the array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. If you use the automatically
     *            generated <code>NextToken</code> value in your next
     *            <code>ListClusterJobsResult</code> call, your list of returned
     *            jobs will start from this point in the array.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next
     * <code>ListClusterJobsResult</code> call, your list of returned jobs will
     * start from this point in the array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. If you use the automatically
     *            generated <code>NextToken</code> value in your next
     *            <code>ListClusterJobsResult</code> call, your list of returned
     *            jobs will start from this point in the array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterJobsResult withNextToken(String nextToken) {
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
        if (getJobListEntries() != null)
            sb.append("JobListEntries: " + getJobListEntries() + ",");
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
                + ((getJobListEntries() == null) ? 0 : getJobListEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClusterJobsResult == false)
            return false;
        ListClusterJobsResult other = (ListClusterJobsResult) obj;

        if (other.getJobListEntries() == null ^ this.getJobListEntries() == null)
            return false;
        if (other.getJobListEntries() != null
                && other.getJobListEntries().equals(this.getJobListEntries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
