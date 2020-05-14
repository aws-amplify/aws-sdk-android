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
 * Contains the output of DescribeSpotFleetRequestHistory.
 * </p>
 */
public class DescribeSpotFleetRequestHistoryResult implements Serializable {
    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     */
    private java.util.List<HistoryRecord> historyRecords;

    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this
     * value is not present.
     * </p>
     */
    private java.util.Date lastEvaluatedTime;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;

    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         Information about the events in the history of the Spot Fleet
     *         request.
     *         </p>
     */
    public java.util.List<HistoryRecord> getHistoryRecords() {
        return historyRecords;
    }

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     *
     * @param historyRecords <p>
     *            Information about the events in the history of the Spot Fleet
     *            request.
     *            </p>
     */
    public void setHistoryRecords(java.util.Collection<HistoryRecord> historyRecords) {
        if (historyRecords == null) {
            this.historyRecords = null;
            return;
        }

        this.historyRecords = new java.util.ArrayList<HistoryRecord>(historyRecords);
    }

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param historyRecords <p>
     *            Information about the events in the history of the Spot Fleet
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestHistoryResult withHistoryRecords(HistoryRecord... historyRecords) {
        if (getHistoryRecords() == null) {
            this.historyRecords = new java.util.ArrayList<HistoryRecord>(historyRecords.length);
        }
        for (HistoryRecord value : historyRecords) {
            this.historyRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param historyRecords <p>
     *            Information about the events in the history of the Spot Fleet
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestHistoryResult withHistoryRecords(
            java.util.Collection<HistoryRecord> historyRecords) {
        setHistoryRecords(historyRecords);
        return this;
    }

    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this
     * value is not present.
     * </p>
     *
     * @return <p>
     *         The last date and time for the events, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         All records up to this time were retrieved.
     *         </p>
     *         <p>
     *         If <code>nextToken</code> indicates that there are more results,
     *         this value is not present.
     *         </p>
     */
    public java.util.Date getLastEvaluatedTime() {
        return lastEvaluatedTime;
    }

    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this
     * value is not present.
     * </p>
     *
     * @param lastEvaluatedTime <p>
     *            The last date and time for the events, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). All records up to this time were retrieved.
     *            </p>
     *            <p>
     *            If <code>nextToken</code> indicates that there are more
     *            results, this value is not present.
     *            </p>
     */
    public void setLastEvaluatedTime(java.util.Date lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
    }

    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this
     * value is not present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastEvaluatedTime <p>
     *            The last date and time for the events, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z). All records up to this time were retrieved.
     *            </p>
     *            <p>
     *            If <code>nextToken</code> indicates that there are more
     *            results, this value is not present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestHistoryResult withLastEvaluatedTime(
            java.util.Date lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
        return this;
    }

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
    public DescribeSpotFleetRequestHistoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         The ID of the Spot Fleet request.
     *         </p>
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestHistoryResult withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The starting date and time for the events, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param startTime <p>
     *            The starting date and time for the events, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z).
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The starting date and time for the events, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestHistoryResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
        if (getHistoryRecords() != null)
            sb.append("HistoryRecords: " + getHistoryRecords() + ",");
        if (getLastEvaluatedTime() != null)
            sb.append("LastEvaluatedTime: " + getLastEvaluatedTime() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHistoryRecords() == null) ? 0 : getHistoryRecords().hashCode());
        hashCode = prime * hashCode
                + ((getLastEvaluatedTime() == null) ? 0 : getLastEvaluatedTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotFleetRequestHistoryResult == false)
            return false;
        DescribeSpotFleetRequestHistoryResult other = (DescribeSpotFleetRequestHistoryResult) obj;

        if (other.getHistoryRecords() == null ^ this.getHistoryRecords() == null)
            return false;
        if (other.getHistoryRecords() != null
                && other.getHistoryRecords().equals(this.getHistoryRecords()) == false)
            return false;
        if (other.getLastEvaluatedTime() == null ^ this.getLastEvaluatedTime() == null)
            return false;
        if (other.getLastEvaluatedTime() != null
                && other.getLastEvaluatedTime().equals(this.getLastEvaluatedTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null
                && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
