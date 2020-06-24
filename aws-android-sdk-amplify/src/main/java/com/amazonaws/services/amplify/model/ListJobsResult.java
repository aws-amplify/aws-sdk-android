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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The maximum number of records to list in a single response.
 * </p>
 */
public class ListJobsResult implements Serializable {
    /**
     * <p>
     * The result structure for the list job result request.
     * </p>
     */
    private java.util.List<JobSummary> jobSummaries;

    /**
     * <p>
     * A pagination token. If non-null the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The result structure for the list job result request.
     * </p>
     *
     * @return <p>
     *         The result structure for the list job result request.
     *         </p>
     */
    public java.util.List<JobSummary> getJobSummaries() {
        return jobSummaries;
    }

    /**
     * <p>
     * The result structure for the list job result request.
     * </p>
     *
     * @param jobSummaries <p>
     *            The result structure for the list job result request.
     *            </p>
     */
    public void setJobSummaries(java.util.Collection<JobSummary> jobSummaries) {
        if (jobSummaries == null) {
            this.jobSummaries = null;
            return;
        }

        this.jobSummaries = new java.util.ArrayList<JobSummary>(jobSummaries);
    }

    /**
     * <p>
     * The result structure for the list job result request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobSummaries <p>
     *            The result structure for the list job result request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withJobSummaries(JobSummary... jobSummaries) {
        if (getJobSummaries() == null) {
            this.jobSummaries = new java.util.ArrayList<JobSummary>(jobSummaries.length);
        }
        for (JobSummary value : jobSummaries) {
            this.jobSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The result structure for the list job result request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobSummaries <p>
     *            The result structure for the list job result request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsResult withJobSummaries(java.util.Collection<JobSummary> jobSummaries) {
        setJobSummaries(jobSummaries);
        return this;
    }

    /**
     * <p>
     * A pagination token. If non-null the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         A pagination token. If non-null the pagination token is returned
     *         in a result. Pass its value in another request to retrieve more
     *         entries.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token. If non-null the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. If non-null the pagination token is
     *            returned in a result. Pass its value in another request to
     *            retrieve more entries.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. If non-null the pagination token is returned in a
     * result. Pass its value in another request to retrieve more entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token. If non-null the pagination token is
     *            returned in a result. Pass its value in another request to
     *            retrieve more entries.
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
        if (getJobSummaries() != null)
            sb.append("jobSummaries: " + getJobSummaries() + ",");
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
                + ((getJobSummaries() == null) ? 0 : getJobSummaries().hashCode());
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

        if (other.getJobSummaries() == null ^ this.getJobSummaries() == null)
            return false;
        if (other.getJobSummaries() != null
                && other.getJobSummaries().equals(this.getJobSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
