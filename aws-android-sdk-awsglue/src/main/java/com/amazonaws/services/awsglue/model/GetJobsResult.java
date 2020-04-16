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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetJobsResult implements Serializable {
    /**
     * <p>
     * A list of job definitions.
     * </p>
     */
    private java.util.List<Job> jobs;

    /**
     * <p>
     * A continuation token, if not all job definitions have yet been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of job definitions.
     * </p>
     *
     * @return <p>
     *         A list of job definitions.
     *         </p>
     */
    public java.util.List<Job> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of job definitions.
     * </p>
     *
     * @param jobs <p>
     *            A list of job definitions.
     *            </p>
     */
    public void setJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<Job>(jobs);
    }

    /**
     * <p>
     * A list of job definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobs <p>
     *            A list of job definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobsResult withJobs(Job... jobs) {
        if (getJobs() == null) {
            this.jobs = new java.util.ArrayList<Job>(jobs.length);
        }
        for (Job value : jobs) {
            this.jobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of job definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobs <p>
     *            A list of job definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobsResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all job definitions have yet been returned.
     * </p>
     *
     * @return <p>
     *         A continuation token, if not all job definitions have yet been
     *         returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all job definitions have yet been returned.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if not all job definitions have yet been
     *            returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all job definitions have yet been returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if not all job definitions have yet been
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobsResult withNextToken(String nextToken) {
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
            sb.append("Jobs: " + getJobs() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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

        if (obj instanceof GetJobsResult == false)
            return false;
        GetJobsResult other = (GetJobsResult) obj;

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
