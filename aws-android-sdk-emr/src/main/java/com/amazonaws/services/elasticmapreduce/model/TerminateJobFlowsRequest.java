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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow
 * is shut down, any step not yet completed is canceled and the EC2 instances on
 * which the cluster is running are stopped. Any log files not already saved are
 * uploaded to Amazon S3 if a LogUri was specified when the cluster was created.
 * </p>
 * <p>
 * The maximum number of clusters allowed is 10. The call to
 * <code>TerminateJobFlows</code> is asynchronous. Depending on the
 * configuration of the cluster, it may take up to 1-5 minutes for the cluster
 * to completely terminate and release allocated resources, such as Amazon EC2
 * instances.
 * </p>
 */
public class TerminateJobFlowsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     */
    private java.util.List<String> jobFlowIds;

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     *
     * @return <p>
     *         A list of job flows to be shutdown.
     *         </p>
     */
    public java.util.List<String> getJobFlowIds() {
        return jobFlowIds;
    }

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     *
     * @param jobFlowIds <p>
     *            A list of job flows to be shutdown.
     *            </p>
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
            return;
        }

        this.jobFlowIds = new java.util.ArrayList<String>(jobFlowIds);
    }

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            A list of job flows to be shutdown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
        if (getJobFlowIds() == null) {
            this.jobFlowIds = new java.util.ArrayList<String>(jobFlowIds.length);
        }
        for (String value : jobFlowIds) {
            this.jobFlowIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            A list of job flows to be shutdown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
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
        if (getJobFlowIds() != null)
            sb.append("JobFlowIds: " + getJobFlowIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateJobFlowsRequest == false)
            return false;
        TerminateJobFlowsRequest other = (TerminateJobFlowsRequest) obj;

        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null
                && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        return true;
    }
}
