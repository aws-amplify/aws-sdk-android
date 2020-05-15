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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetJobRunsResult implements Serializable {
    /**
     * <p>
     * A list of job-run metadata objects.
     * </p>
     */
    private java.util.List<JobRun> jobRuns;

    /**
     * <p>
     * A continuation token, if not all requested job runs have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of job-run metadata objects.
     * </p>
     *
     * @return <p>
     *         A list of job-run metadata objects.
     *         </p>
     */
    public java.util.List<JobRun> getJobRuns() {
        return jobRuns;
    }

    /**
     * <p>
     * A list of job-run metadata objects.
     * </p>
     *
     * @param jobRuns <p>
     *            A list of job-run metadata objects.
     *            </p>
     */
    public void setJobRuns(java.util.Collection<JobRun> jobRuns) {
        if (jobRuns == null) {
            this.jobRuns = null;
            return;
        }

        this.jobRuns = new java.util.ArrayList<JobRun>(jobRuns);
    }

    /**
     * <p>
     * A list of job-run metadata objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobRuns <p>
     *            A list of job-run metadata objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobRunsResult withJobRuns(JobRun... jobRuns) {
        if (getJobRuns() == null) {
            this.jobRuns = new java.util.ArrayList<JobRun>(jobRuns.length);
        }
        for (JobRun value : jobRuns) {
            this.jobRuns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of job-run metadata objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobRuns <p>
     *            A list of job-run metadata objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobRunsResult withJobRuns(java.util.Collection<JobRun> jobRuns) {
        setJobRuns(jobRuns);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all requested job runs have been returned.
     * </p>
     *
     * @return <p>
     *         A continuation token, if not all requested job runs have been
     *         returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested job runs have been returned.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if not all requested job runs have been
     *            returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all requested job runs have been returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if not all requested job runs have been
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobRunsResult withNextToken(String nextToken) {
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
        if (getJobRuns() != null)
            sb.append("JobRuns: " + getJobRuns() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobRuns() == null) ? 0 : getJobRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobRunsResult == false)
            return false;
        GetJobRunsResult other = (GetJobRunsResult) obj;

        if (other.getJobRuns() == null ^ this.getJobRuns() == null)
            return false;
        if (other.getJobRuns() != null && other.getJobRuns().equals(this.getJobRuns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
