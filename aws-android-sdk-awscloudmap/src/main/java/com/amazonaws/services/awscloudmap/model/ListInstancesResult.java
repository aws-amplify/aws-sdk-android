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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

public class ListInstancesResult implements Serializable {
    /**
     * <p>
     * Summary information about the instances that are associated with the
     * specified service.
     * </p>
     */
    private java.util.List<InstanceSummary> instances;

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the instances that are associated with the
     * specified service.
     * </p>
     *
     * @return <p>
     *         Summary information about the instances that are associated with
     *         the specified service.
     *         </p>
     */
    public java.util.List<InstanceSummary> getInstances() {
        return instances;
    }

    /**
     * <p>
     * Summary information about the instances that are associated with the
     * specified service.
     * </p>
     *
     * @param instances <p>
     *            Summary information about the instances that are associated
     *            with the specified service.
     *            </p>
     */
    public void setInstances(java.util.Collection<InstanceSummary> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<InstanceSummary>(instances);
    }

    /**
     * <p>
     * Summary information about the instances that are associated with the
     * specified service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            Summary information about the instances that are associated
     *            with the specified service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesResult withInstances(InstanceSummary... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<InstanceSummary>(instances.length);
        }
        for (InstanceSummary value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the instances that are associated with the
     * specified service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            Summary information about the instances that are associated
     *            with the specified service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesResult withInstances(java.util.Collection<InstanceSummary> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         If more than <code>MaxResults</code> instances match the
     *         specified criteria, you can submit another
     *         <code>ListInstances</code> request to get the next group of
     *         results. Specify the value of <code>NextToken</code> from the
     *         previous response in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextToken <p>
     *            If more than <code>MaxResults</code> instances match the
     *            specified criteria, you can submit another
     *            <code>ListInstances</code> request to get the next group of
     *            results. Specify the value of <code>NextToken</code> from the
     *            previous response in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextToken <p>
     *            If more than <code>MaxResults</code> instances match the
     *            specified criteria, you can submit another
     *            <code>ListInstances</code> request to get the next group of
     *            results. Specify the value of <code>NextToken</code> from the
     *            previous response in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInstancesResult == false)
            return false;
        ListInstancesResult other = (ListInstancesResult) obj;

        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
