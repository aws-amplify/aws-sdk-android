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
 * Contains the output of DescribeScheduledInstanceAvailability.
 * </p>
 */
public class DescribeScheduledInstanceAvailabilityResult implements Serializable {
    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     */
    private java.util.List<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet;

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
    public DescribeScheduledInstanceAvailabilityResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     *
     * @return <p>
     *         Information about the available Scheduled Instances.
     *         </p>
     */
    public java.util.List<ScheduledInstanceAvailability> getScheduledInstanceAvailabilitySet() {
        return scheduledInstanceAvailabilitySet;
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     *
     * @param scheduledInstanceAvailabilitySet <p>
     *            Information about the available Scheduled Instances.
     *            </p>
     */
    public void setScheduledInstanceAvailabilitySet(
            java.util.Collection<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet) {
        if (scheduledInstanceAvailabilitySet == null) {
            this.scheduledInstanceAvailabilitySet = null;
            return;
        }

        this.scheduledInstanceAvailabilitySet = new java.util.ArrayList<ScheduledInstanceAvailability>(
                scheduledInstanceAvailabilitySet);
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceAvailabilitySet <p>
     *            Information about the available Scheduled Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstanceAvailabilityResult withScheduledInstanceAvailabilitySet(
            ScheduledInstanceAvailability... scheduledInstanceAvailabilitySet) {
        if (getScheduledInstanceAvailabilitySet() == null) {
            this.scheduledInstanceAvailabilitySet = new java.util.ArrayList<ScheduledInstanceAvailability>(
                    scheduledInstanceAvailabilitySet.length);
        }
        for (ScheduledInstanceAvailability value : scheduledInstanceAvailabilitySet) {
            this.scheduledInstanceAvailabilitySet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceAvailabilitySet <p>
     *            Information about the available Scheduled Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledInstanceAvailabilityResult withScheduledInstanceAvailabilitySet(
            java.util.Collection<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet) {
        setScheduledInstanceAvailabilitySet(scheduledInstanceAvailabilitySet);
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
        if (getScheduledInstanceAvailabilitySet() != null)
            sb.append("ScheduledInstanceAvailabilitySet: " + getScheduledInstanceAvailabilitySet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduledInstanceAvailabilitySet() == null) ? 0
                        : getScheduledInstanceAvailabilitySet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledInstanceAvailabilityResult == false)
            return false;
        DescribeScheduledInstanceAvailabilityResult other = (DescribeScheduledInstanceAvailabilityResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScheduledInstanceAvailabilitySet() == null
                ^ this.getScheduledInstanceAvailabilitySet() == null)
            return false;
        if (other.getScheduledInstanceAvailabilitySet() != null
                && other.getScheduledInstanceAvailabilitySet().equals(
                        this.getScheduledInstanceAvailabilitySet()) == false)
            return false;
        return true;
    }
}
