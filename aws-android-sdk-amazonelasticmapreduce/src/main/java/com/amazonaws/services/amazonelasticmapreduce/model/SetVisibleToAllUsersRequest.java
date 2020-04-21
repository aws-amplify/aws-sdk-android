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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the <a>Cluster$VisibleToAllUsers</a> value, which determines whether the
 * cluster is visible to all IAM users of the AWS account associated with the
 * cluster. Only the IAM user who created the cluster or the AWS account root
 * user can call this action. The default value, <code>true</code>, indicates
 * that all IAM users in the AWS account can perform cluster actions if they
 * have the proper IAM policy permissions. If set to <code>false</code>, only
 * the IAM user that created the cluster can perform actions. This action works
 * on running clusters. You can override the default <code>true</code> setting
 * when you create a cluster by using the <code>VisibleToAllUsers</code>
 * parameter with <code>RunJobFlow</code>.
 * </p>
 */
public class SetVisibleToAllUsersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the job flow (cluster).
     * </p>
     */
    private java.util.List<String> jobFlowIds;

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     */
    private Boolean visibleToAllUsers;

    /**
     * <p>
     * The unique identifier of the job flow (cluster).
     * </p>
     *
     * @return <p>
     *         The unique identifier of the job flow (cluster).
     *         </p>
     */
    public java.util.List<String> getJobFlowIds() {
        return jobFlowIds;
    }

    /**
     * <p>
     * The unique identifier of the job flow (cluster).
     * </p>
     *
     * @param jobFlowIds <p>
     *            The unique identifier of the job flow (cluster).
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
     * The unique identifier of the job flow (cluster).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            The unique identifier of the job flow (cluster).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetVisibleToAllUsersRequest withJobFlowIds(String... jobFlowIds) {
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
     * The unique identifier of the job flow (cluster).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobFlowIds <p>
     *            The unique identifier of the job flow (cluster).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetVisibleToAllUsersRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     *
     * @return <p>
     *         A value of <code>true</code> indicates that all IAM users in the
     *         AWS account can perform cluster actions if they have the proper
     *         IAM policy permissions. This is the default. A value of
     *         <code>false</code> indicates that only the IAM user who created
     *         the cluster can perform actions.
     *         </p>
     */
    public Boolean isVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     *
     * @return <p>
     *         A value of <code>true</code> indicates that all IAM users in the
     *         AWS account can perform cluster actions if they have the proper
     *         IAM policy permissions. This is the default. A value of
     *         <code>false</code> indicates that only the IAM user who created
     *         the cluster can perform actions.
     *         </p>
     */
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     *
     * @param visibleToAllUsers <p>
     *            A value of <code>true</code> indicates that all IAM users in
     *            the AWS account can perform cluster actions if they have the
     *            proper IAM policy permissions. This is the default. A value of
     *            <code>false</code> indicates that only the IAM user who
     *            created the cluster can perform actions.
     *            </p>
     */
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * A value of <code>true</code> indicates that all IAM users in the AWS
     * account can perform cluster actions if they have the proper IAM policy
     * permissions. This is the default. A value of <code>false</code> indicates
     * that only the IAM user who created the cluster can perform actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param visibleToAllUsers <p>
     *            A value of <code>true</code> indicates that all IAM users in
     *            the AWS account can perform cluster actions if they have the
     *            proper IAM policy permissions. This is the default. A value of
     *            <code>false</code> indicates that only the IAM user who
     *            created the cluster can perform actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetVisibleToAllUsersRequest withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
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
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: " + getVisibleToAllUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode
                + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetVisibleToAllUsersRequest == false)
            return false;
        SetVisibleToAllUsersRequest other = (SetVisibleToAllUsersRequest) obj;

        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null
                && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getVisibleToAllUsers() == null ^ this.getVisibleToAllUsers() == null)
            return false;
        if (other.getVisibleToAllUsers() != null
                && other.getVisibleToAllUsers().equals(this.getVisibleToAllUsers()) == false)
            return false;
        return true;
    }
}
