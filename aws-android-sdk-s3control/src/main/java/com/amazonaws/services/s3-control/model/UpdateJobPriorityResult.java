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


public class UpdateJobPriorityResult implements Serializable {
    /**
     * <p>The ID for the job whose priority Amazon S3 updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     */
    private String jobId;

    /**
     * <p>The new priority assigned to the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer priority;

    /**
     * <p>The ID for the job whose priority Amazon S3 updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @return <p>The ID for the job whose priority Amazon S3 updated.</p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>The ID for the job whose priority Amazon S3 updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the job whose priority Amazon S3 updated.</p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>The ID for the job whose priority Amazon S3 updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the job whose priority Amazon S3 updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateJobPriorityResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>The new priority assigned to the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>The new priority assigned to the specified job.</p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>The new priority assigned to the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The new priority assigned to the specified job.</p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>The new priority assigned to the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The new priority assigned to the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateJobPriorityResult withPriority(Integer priority) {
        this.priority = priority;
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
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getPriority() != null) sb.append("Priority: " + getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateJobPriorityResult == false) return false;
        UpdateJobPriorityResult other = (UpdateJobPriorityResult)obj;

        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false;
        if (other.getPriority() == null ^ this.getPriority() == null) return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false) return false;
        return true;
    }
}
