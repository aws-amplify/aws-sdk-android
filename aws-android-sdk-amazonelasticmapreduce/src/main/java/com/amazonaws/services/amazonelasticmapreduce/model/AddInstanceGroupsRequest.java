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
 * Adds one or more instance groups to a running cluster.
 * </p>
 */
public class AddInstanceGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Instance groups to add.
     * </p>
     */
    private java.util.List<InstanceGroupConfig> instanceGroups;

    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String jobFlowId;

    /**
     * <p>
     * Instance groups to add.
     * </p>
     *
     * @return <p>
     *         Instance groups to add.
     *         </p>
     */
    public java.util.List<InstanceGroupConfig> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * Instance groups to add.
     * </p>
     *
     * @param instanceGroups <p>
     *            Instance groups to add.
     *            </p>
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new java.util.ArrayList<InstanceGroupConfig>(instanceGroups);
    }

    /**
     * <p>
     * Instance groups to add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Instance groups to add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceGroupsRequest withInstanceGroups(InstanceGroupConfig... instanceGroups) {
        if (getInstanceGroups() == null) {
            this.instanceGroups = new java.util.ArrayList<InstanceGroupConfig>(
                    instanceGroups.length);
        }
        for (InstanceGroupConfig value : instanceGroups) {
            this.instanceGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Instance groups to add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Instance groups to add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceGroupsRequest withInstanceGroups(
            java.util.Collection<InstanceGroupConfig> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Job flow in which to add the instance groups.
     *         </p>
     */
    public String getJobFlowId() {
        return jobFlowId;
    }

    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowId <p>
     *            Job flow in which to add the instance groups.
     *            </p>
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowId <p>
     *            Job flow in which to add the instance groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddInstanceGroupsRequest withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
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
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getJobFlowId() != null)
            sb.append("JobFlowId: " + getJobFlowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddInstanceGroupsRequest == false)
            return false;
        AddInstanceGroupsRequest other = (AddInstanceGroupsRequest) obj;

        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null
                && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null
                && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        return true;
    }
}
