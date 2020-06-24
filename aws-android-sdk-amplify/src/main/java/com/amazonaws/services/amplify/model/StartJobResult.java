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
 * The result structure for the run job request.
 * </p>
 */
public class StartJobResult implements Serializable {
    /**
     * <p>
     * The summary for the job.
     * </p>
     */
    private JobSummary jobSummary;

    /**
     * <p>
     * The summary for the job.
     * </p>
     *
     * @return <p>
     *         The summary for the job.
     *         </p>
     */
    public JobSummary getJobSummary() {
        return jobSummary;
    }

    /**
     * <p>
     * The summary for the job.
     * </p>
     *
     * @param jobSummary <p>
     *            The summary for the job.
     *            </p>
     */
    public void setJobSummary(JobSummary jobSummary) {
        this.jobSummary = jobSummary;
    }

    /**
     * <p>
     * The summary for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobSummary <p>
     *            The summary for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobResult withJobSummary(JobSummary jobSummary) {
        this.jobSummary = jobSummary;
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
        if (getJobSummary() != null)
            sb.append("jobSummary: " + getJobSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobSummary() == null) ? 0 : getJobSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobResult == false)
            return false;
        StartJobResult other = (StartJobResult) obj;

        if (other.getJobSummary() == null ^ this.getJobSummary() == null)
            return false;
        if (other.getJobSummary() != null
                && other.getJobSummary().equals(this.getJobSummary()) == false)
            return false;
        return true;
    }
}
