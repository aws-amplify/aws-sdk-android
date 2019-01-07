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

/**
 * <p>
 * Contains a summary of information about job executions for a specific job.
 * </p>
 */
public class JobExecutionSummaryForJob implements Serializable {
    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     */
    private String thingArn;

    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     */
    private JobExecutionSummary jobExecutionSummary;

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     *
     * @return <p>
     *         The ARN of the thing on which the job execution is running.
     *         </p>
     */
    public String getThingArn() {
        return thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     *
     * @param thingArn <p>
     *            The ARN of the thing on which the job execution is running.
     *            </p>
     */
    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingArn <p>
     *            The ARN of the thing on which the job execution is running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSummaryForJob withThingArn(String thingArn) {
        this.thingArn = thingArn;
        return this;
    }

    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     *
     * @return <p>
     *         Contains a subset of information about a job execution.
     *         </p>
     */
    public JobExecutionSummary getJobExecutionSummary() {
        return jobExecutionSummary;
    }

    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     *
     * @param jobExecutionSummary <p>
     *            Contains a subset of information about a job execution.
     *            </p>
     */
    public void setJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        this.jobExecutionSummary = jobExecutionSummary;
    }

    /**
     * <p>
     * Contains a subset of information about a job execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionSummary <p>
     *            Contains a subset of information about a job execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSummaryForJob withJobExecutionSummary(JobExecutionSummary jobExecutionSummary) {
        this.jobExecutionSummary = jobExecutionSummary;
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
        if (getThingArn() != null)
            sb.append("thingArn: " + getThingArn() + ",");
        if (getJobExecutionSummary() != null)
            sb.append("jobExecutionSummary: " + getJobExecutionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode
                + ((getJobExecutionSummary() == null) ? 0 : getJobExecutionSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionSummaryForJob == false)
            return false;
        JobExecutionSummaryForJob other = (JobExecutionSummaryForJob) obj;

        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getJobExecutionSummary() == null ^ this.getJobExecutionSummary() == null)
            return false;
        if (other.getJobExecutionSummary() != null
                && other.getJobExecutionSummary().equals(this.getJobExecutionSummary()) == false)
            return false;
        return true;
    }
}
