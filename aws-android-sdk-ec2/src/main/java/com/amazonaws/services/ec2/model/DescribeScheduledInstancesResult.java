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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeScheduledInstances.
 * </p>
 */
public class DescribeScheduledInstancesResult implements Serializable {
    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     */
    private java.util.List<ScheduledInstance> scheduledInstanceSet;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token required to retrieve the next set of results. This
     *         value is <code>null</code> when there are no more results to
     *         return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token required to retrieve the next set of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token required to retrieve the next set of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     *
     * @return <p>
     *         Information about the Scheduled Instances.
     *         </p>
     */
    public java.util.List<ScheduledInstance> getScheduledInstanceSet() {
        return scheduledInstanceSet;
    }

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     *
     * @param scheduledInstanceSet <p>
     *            Information about the Scheduled Instances.
     *            </p>
     */
    public void setScheduledInstanceSet(java.util.Collection<ScheduledInstance> scheduledInstanceSet) {
        if (scheduledInstanceSet == null) {
            this.scheduledInstanceSet = null;
            return;
        }

        this.scheduledInstanceSet = new java.util.ArrayList<ScheduledInstance>(scheduledInstanceSet);
    }

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceSet <p>
     *            Information about the Scheduled Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesResult withScheduledInstanceSet(
            ScheduledInstance... scheduledInstanceSet) {
        if (getScheduledInstanceSet() == null) {
            this.scheduledInstanceSet = new java.util.ArrayList<ScheduledInstance>(
                    scheduledInstanceSet.length);
        }
        for (ScheduledInstance value : scheduledInstanceSet) {
            this.scheduledInstanceSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceSet <p>
     *            Information about the Scheduled Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstancesResult withScheduledInstanceSet(
            java.util.Collection<ScheduledInstance> scheduledInstanceSet) {
        setScheduledInstanceSet(scheduledInstanceSet);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getScheduledInstanceSet() != null)
            sb.append("ScheduledInstanceSet: " + getScheduledInstanceSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledInstanceSet() == null) ? 0 : getScheduledInstanceSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledInstancesResult == false)
            return false;
        DescribeScheduledInstancesResult other = (DescribeScheduledInstancesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScheduledInstanceSet() == null ^ this.getScheduledInstanceSet() == null)
            return false;
        if (other.getScheduledInstanceSet() != null
                && other.getScheduledInstanceSet().equals(this.getScheduledInstanceSet()) == false)
            return false;
        return true;
    }
}
