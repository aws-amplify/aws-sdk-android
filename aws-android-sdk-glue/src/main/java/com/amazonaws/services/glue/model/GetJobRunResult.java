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

public class GetJobRunResult implements Serializable {
    /**
     * <p>
     * The requested job-run metadata.
     * </p>
     */
    private JobRun jobRun;

    /**
     * <p>
     * The requested job-run metadata.
     * </p>
     *
     * @return <p>
     *         The requested job-run metadata.
     *         </p>
     */
    public JobRun getJobRun() {
        return jobRun;
    }

    /**
     * <p>
     * The requested job-run metadata.
     * </p>
     *
     * @param jobRun <p>
     *            The requested job-run metadata.
     *            </p>
     */
    public void setJobRun(JobRun jobRun) {
        this.jobRun = jobRun;
    }

    /**
     * <p>
     * The requested job-run metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobRun <p>
     *            The requested job-run metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobRunResult withJobRun(JobRun jobRun) {
        this.jobRun = jobRun;
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
        if (getJobRun() != null)
            sb.append("JobRun: " + getJobRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobRun() == null) ? 0 : getJobRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobRunResult == false)
            return false;
        GetJobRunResult other = (GetJobRunResult) obj;

        if (other.getJobRun() == null ^ this.getJobRun() == null)
            return false;
        if (other.getJobRun() != null && other.getJobRun().equals(this.getJobRun()) == false)
            return false;
        return true;
    }
}
