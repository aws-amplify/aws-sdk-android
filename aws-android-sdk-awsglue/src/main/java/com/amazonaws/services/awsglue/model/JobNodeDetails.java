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

/**
 * <p>
 * The details of a Job node present in the workflow.
 * </p>
 */
public class JobNodeDetails implements Serializable {
    /**
     * <p>
     * The information for the job runs represented by the job node.
     * </p>
     */
    private java.util.List<JobRun> jobRuns;

    /**
     * <p>
     * The information for the job runs represented by the job node.
     * </p>
     *
     * @return <p>
     *         The information for the job runs represented by the job node.
     *         </p>
     */
    public java.util.List<JobRun> getJobRuns() {
        return jobRuns;
    }

    /**
     * <p>
     * The information for the job runs represented by the job node.
     * </p>
     *
     * @param jobRuns <p>
     *            The information for the job runs represented by the job node.
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
     * The information for the job runs represented by the job node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobRuns <p>
     *            The information for the job runs represented by the job node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobNodeDetails withJobRuns(JobRun... jobRuns) {
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
     * The information for the job runs represented by the job node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobRuns <p>
     *            The information for the job runs represented by the job node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobNodeDetails withJobRuns(java.util.Collection<JobRun> jobRuns) {
        setJobRuns(jobRuns);
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
            sb.append("JobRuns: " + getJobRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobRuns() == null) ? 0 : getJobRuns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobNodeDetails == false)
            return false;
        JobNodeDetails other = (JobNodeDetails) obj;

        if (other.getJobRuns() == null ^ this.getJobRuns() == null)
            return false;
        if (other.getJobRuns() != null && other.getJobRuns().equals(this.getJobRuns()) == false)
            return false;
        return true;
    }
}
