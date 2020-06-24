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
 * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in
 * the cluster cannot be terminated by user intervention, an API call, or in the
 * event of a job-flow error. The cluster still terminates upon successful
 * completion of the job flow. Calling <code>SetTerminationProtection</code> on
 * a cluster is similar to calling the Amazon EC2
 * <code>DisableAPITermination</code> API on all EC2 instances in a cluster.
 * </p>
 * <p>
 * <code>SetTerminationProtection</code> is used to prevent accidental
 * termination of a cluster and to ensure that in the event of an error, the
 * instances persist so that you can recover any data stored in their ephemeral
 * instance storage.
 * </p>
 * <p>
 * To terminate a cluster that has been locked by setting
 * <code>SetTerminationProtection</code> to <code>true</code>, you must first
 * unlock the job flow by a subsequent call to
 * <code>SetTerminationProtection</code> in which you set the value to
 * <code>false</code>.
 * </p>
 * <p>
 * For more information, see<a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/UsingEMR_TerminationProtection.html"
 * >Managing Cluster Termination</a> in the <i>Amazon EMR Management Guide</i>.
 * </p>
 */
public class SetTerminationProtectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This
     * identifier is returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * </p>
     */
    private java.util.List<String> jobFlowIds;

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the
     * Amazon EC2 instances in the cluster from shutting down due to API calls,
     * user intervention, or job-flow error.
     * </p>
     */
    private Boolean terminationProtected;

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This
     * identifier is returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * </p>
     *
     * @return <p>
     *         A list of strings that uniquely identify the clusters to protect.
     *         This identifier is returned by <a>RunJobFlow</a> and can also be
     *         obtained from <a>DescribeJobFlows</a> .
     *         </p>
     */
    public java.util.List<String> getJobFlowIds() {
        return jobFlowIds;
    }

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This
     * identifier is returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * </p>
     *
     * @param jobFlowIds <p>
     *            A list of strings that uniquely identify the clusters to
     *            protect. This identifier is returned by <a>RunJobFlow</a> and
     *            can also be obtained from <a>DescribeJobFlows</a> .
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
     * A list of strings that uniquely identify the clusters to protect. This
     * identifier is returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            A list of strings that uniquely identify the clusters to
     *            protect. This identifier is returned by <a>RunJobFlow</a> and
     *            can also be obtained from <a>DescribeJobFlows</a> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTerminationProtectionRequest withJobFlowIds(String... jobFlowIds) {
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
     * A list of strings that uniquely identify the clusters to protect. This
     * identifier is returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            A list of strings that uniquely identify the clusters to
     *            protect. This identifier is returned by <a>RunJobFlow</a> and
     *            can also be obtained from <a>DescribeJobFlows</a> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTerminationProtectionRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the
     * Amazon EC2 instances in the cluster from shutting down due to API calls,
     * user intervention, or job-flow error.
     * </p>
     *
     * @return <p>
     *         A Boolean that indicates whether to protect the cluster and
     *         prevent the Amazon EC2 instances in the cluster from shutting
     *         down due to API calls, user intervention, or job-flow error.
     *         </p>
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the
     * Amazon EC2 instances in the cluster from shutting down due to API calls,
     * user intervention, or job-flow error.
     * </p>
     *
     * @return <p>
     *         A Boolean that indicates whether to protect the cluster and
     *         prevent the Amazon EC2 instances in the cluster from shutting
     *         down due to API calls, user intervention, or job-flow error.
     *         </p>
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the
     * Amazon EC2 instances in the cluster from shutting down due to API calls,
     * user intervention, or job-flow error.
     * </p>
     *
     * @param terminationProtected <p>
     *            A Boolean that indicates whether to protect the cluster and
     *            prevent the Amazon EC2 instances in the cluster from shutting
     *            down due to API calls, user intervention, or job-flow error.
     *            </p>
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the
     * Amazon EC2 instances in the cluster from shutting down due to API calls,
     * user intervention, or job-flow error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationProtected <p>
     *            A Boolean that indicates whether to protect the cluster and
     *            prevent the Amazon EC2 instances in the cluster from shutting
     *            down due to API calls, user intervention, or job-flow error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTerminationProtectionRequest withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
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
            sb.append("JobFlowIds: " + getJobFlowIds() + ",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: " + getTerminationProtected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode
                + ((getTerminationProtected() == null) ? 0 : getTerminationProtected().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTerminationProtectionRequest == false)
            return false;
        SetTerminationProtectionRequest other = (SetTerminationProtectionRequest) obj;

        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null
                && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getTerminationProtected() == null ^ this.getTerminationProtected() == null)
            return false;
        if (other.getTerminationProtected() != null
                && other.getTerminationProtected().equals(this.getTerminationProtected()) == false)
            return false;
        return true;
    }
}
