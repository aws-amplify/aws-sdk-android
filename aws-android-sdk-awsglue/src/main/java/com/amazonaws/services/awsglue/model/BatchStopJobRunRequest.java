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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stops one or more job runs for a specified job definition.
 * </p>
 */
public class BatchStopJobRunRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the job definition for which to stop job runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * A list of the <code>JobRunIds</code> that should be stopped for that job
     * definition.
     * </p>
     */
    private java.util.List<String> jobRunIds;

    /**
     * <p>
     * The name of the job definition for which to stop job runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the job definition for which to stop job runs.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the job definition for which to stop job runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job definition for which to stop job runs.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition for which to stop job runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job definition for which to stop job runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * A list of the <code>JobRunIds</code> that should be stopped for that job
     * definition.
     * </p>
     *
     * @return <p>
     *         A list of the <code>JobRunIds</code> that should be stopped for
     *         that job definition.
     *         </p>
     */
    public java.util.List<String> getJobRunIds() {
        return jobRunIds;
    }

    /**
     * <p>
     * A list of the <code>JobRunIds</code> that should be stopped for that job
     * definition.
     * </p>
     *
     * @param jobRunIds <p>
     *            A list of the <code>JobRunIds</code> that should be stopped
     *            for that job definition.
     *            </p>
     */
    public void setJobRunIds(java.util.Collection<String> jobRunIds) {
        if (jobRunIds == null) {
            this.jobRunIds = null;
            return;
        }

        this.jobRunIds = new java.util.ArrayList<String>(jobRunIds);
    }

    /**
     * <p>
     * A list of the <code>JobRunIds</code> that should be stopped for that job
     * definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobRunIds <p>
     *            A list of the <code>JobRunIds</code> that should be stopped
     *            for that job definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunRequest withJobRunIds(String... jobRunIds) {
        if (getJobRunIds() == null) {
            this.jobRunIds = new java.util.ArrayList<String>(jobRunIds.length);
        }
        for (String value : jobRunIds) {
            this.jobRunIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the <code>JobRunIds</code> that should be stopped for that job
     * definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobRunIds <p>
     *            A list of the <code>JobRunIds</code> that should be stopped
     *            for that job definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunRequest withJobRunIds(java.util.Collection<String> jobRunIds) {
        setJobRunIds(jobRunIds);
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
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getJobRunIds() != null)
            sb.append("JobRunIds: " + getJobRunIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunIds() == null) ? 0 : getJobRunIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopJobRunRequest == false)
            return false;
        BatchStopJobRunRequest other = (BatchStopJobRunRequest) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunIds() == null ^ this.getJobRunIds() == null)
            return false;
        if (other.getJobRunIds() != null
                && other.getJobRunIds().equals(this.getJobRunIds()) == false)
            return false;
        return true;
    }
}
