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
 * Returns a list of resource metadata for a given list of job names. After
 * calling the <code>ListJobs</code> operation, you can call this operation to
 * access the data to which you have been granted permissions. This operation
 * supports all IAM permissions, including permission conditions that uses tags.
 * </p>
 */
public class BatchGetJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of job names, which might be the names returned from the
     * <code>ListJobs</code> operation.
     * </p>
     */
    private java.util.List<String> jobNames;

    /**
     * <p>
     * A list of job names, which might be the names returned from the
     * <code>ListJobs</code> operation.
     * </p>
     *
     * @return <p>
     *         A list of job names, which might be the names returned from the
     *         <code>ListJobs</code> operation.
     *         </p>
     */
    public java.util.List<String> getJobNames() {
        return jobNames;
    }

    /**
     * <p>
     * A list of job names, which might be the names returned from the
     * <code>ListJobs</code> operation.
     * </p>
     *
     * @param jobNames <p>
     *            A list of job names, which might be the names returned from
     *            the <code>ListJobs</code> operation.
     *            </p>
     */
    public void setJobNames(java.util.Collection<String> jobNames) {
        if (jobNames == null) {
            this.jobNames = null;
            return;
        }

        this.jobNames = new java.util.ArrayList<String>(jobNames);
    }

    /**
     * <p>
     * A list of job names, which might be the names returned from the
     * <code>ListJobs</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobNames <p>
     *            A list of job names, which might be the names returned from
     *            the <code>ListJobs</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetJobsRequest withJobNames(String... jobNames) {
        if (getJobNames() == null) {
            this.jobNames = new java.util.ArrayList<String>(jobNames.length);
        }
        for (String value : jobNames) {
            this.jobNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of job names, which might be the names returned from the
     * <code>ListJobs</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobNames <p>
     *            A list of job names, which might be the names returned from
     *            the <code>ListJobs</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetJobsRequest withJobNames(java.util.Collection<String> jobNames) {
        setJobNames(jobNames);
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
        if (getJobNames() != null)
            sb.append("JobNames: " + getJobNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobNames() == null) ? 0 : getJobNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetJobsRequest == false)
            return false;
        BatchGetJobsRequest other = (BatchGetJobsRequest) obj;

        if (other.getJobNames() == null ^ this.getJobNames() == null)
            return false;
        if (other.getJobNames() != null && other.getJobNames().equals(this.getJobNames()) == false)
            return false;
        return true;
    }
}
