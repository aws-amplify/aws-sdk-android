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
 * This API is deprecated and will eventually be removed. We recommend you use
 * <a>ListClusters</a>, <a>DescribeCluster</a>, <a>ListSteps</a>,
 * <a>ListInstanceGroups</a> and <a>ListBootstrapActions</a> instead.
 * </p>
 * <p>
 * DescribeJobFlows returns a list of job flows that match all of the supplied
 * parameters. The parameters can include a list of job flow IDs, job flow
 * states, and restrictions on job flow creation date and time.
 * </p>
 * <p>
 * Regardless of supplied parameters, only job flows created within the last two
 * months are returned.
 * </p>
 * <p>
 * If no parameters are supplied, then job flows matching either of the
 * following criteria are returned:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Job flows created and completed in the last two weeks
 * </p>
 * </li>
 * <li>
 * <p>
 * Job flows created within the last two months that are in one of the following
 * states: <code>RUNNING</code>, <code>WAITING</code>,
 * <code>SHUTTING_DOWN</code>, <code>STARTING</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Amazon EMR can return a maximum of 512 job flow descriptions.
 * </p>
 */
public class DescribeJobFlowsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     */
    private java.util.Date createdAfter;

    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     */
    private java.util.Date createdBefore;

    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     */
    private java.util.List<String> jobFlowIds;

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     */
    private java.util.List<String> jobFlowStates;

    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     *
     * @return <p>
     *         Return only job flows created after this date and time.
     *         </p>
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }

    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     *
     * @param createdAfter <p>
     *            Return only job flows created after this date and time.
     *            </p>
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * Return only job flows created after this date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAfter <p>
     *            Return only job flows created after this date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobFlowsRequest withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     *
     * @return <p>
     *         Return only job flows created before this date and time.
     *         </p>
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }

    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     *
     * @param createdBefore <p>
     *            Return only job flows created before this date and time.
     *            </p>
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * Return only job flows created before this date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBefore <p>
     *            Return only job flows created before this date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobFlowsRequest withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     *
     * @return <p>
     *         Return only job flows whose job flow ID is contained in this
     *         list.
     *         </p>
     */
    public java.util.List<String> getJobFlowIds() {
        return jobFlowIds;
    }

    /**
     * <p>
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     *
     * @param jobFlowIds <p>
     *            Return only job flows whose job flow ID is contained in this
     *            list.
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
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            Return only job flows whose job flow ID is contained in this
     *            list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
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
     * Return only job flows whose job flow ID is contained in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            Return only job flows whose job flow ID is contained in this
     *            list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     *
     * @return <p>
     *         Return only job flows whose state is contained in this list.
     *         </p>
     */
    public java.util.List<String> getJobFlowStates() {
        return jobFlowStates;
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     *
     * @param jobFlowStates <p>
     *            Return only job flows whose state is contained in this list.
     *            </p>
     */
    public void setJobFlowStates(java.util.Collection<String> jobFlowStates) {
        if (jobFlowStates == null) {
            this.jobFlowStates = null;
            return;
        }

        this.jobFlowStates = new java.util.ArrayList<String>(jobFlowStates);
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowStates <p>
     *            Return only job flows whose state is contained in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobFlowsRequest withJobFlowStates(String... jobFlowStates) {
        if (getJobFlowStates() == null) {
            this.jobFlowStates = new java.util.ArrayList<String>(jobFlowStates.length);
        }
        for (String value : jobFlowStates) {
            this.jobFlowStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Return only job flows whose state is contained in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowStates <p>
     *            Return only job flows whose state is contained in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobFlowsRequest withJobFlowStates(java.util.Collection<String> jobFlowStates) {
        setJobFlowStates(jobFlowStates);
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
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: " + getCreatedAfter() + ",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: " + getCreatedBefore() + ",");
        if (getJobFlowIds() != null)
            sb.append("JobFlowIds: " + getJobFlowIds() + ",");
        if (getJobFlowStates() != null)
            sb.append("JobFlowStates: " + getJobFlowStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode
                + ((getJobFlowStates() == null) ? 0 : getJobFlowStates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobFlowsRequest == false)
            return false;
        DescribeJobFlowsRequest other = (DescribeJobFlowsRequest) obj;

        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null
                && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null
                && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null
                && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getJobFlowStates() == null ^ this.getJobFlowStates() == null)
            return false;
        if (other.getJobFlowStates() != null
                && other.getJobFlowStates().equals(this.getJobFlowStates()) == false)
            return false;
        return true;
    }
}
