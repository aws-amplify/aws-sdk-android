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

public class DescribeFleetHistoryResult implements Serializable {
    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     */
    private java.util.List<HistoryRecordEntry> historyRecords;

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
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         Information about the events in the history of the EC2 Fleet.
     *         </p>
     */
    public java.util.List<HistoryRecordEntry> getHistoryRecords() {
        return historyRecords;
    }

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     *
     * @param historyRecords <p>
     *            Information about the events in the history of the EC2 Fleet.
     *            </p>
     */
    public void setHistoryRecords(java.util.Collection<HistoryRecordEntry> historyRecords) {
        if (historyRecords == null) {
            this.historyRecords = null;
            return;
        }

        this.historyRecords = new java.util.ArrayList<HistoryRecordEntry>(historyRecords);
    }

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param historyRecords <p>
     *            Information about the events in the history of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetHistoryResult withHistoryRecords(HistoryRecordEntry... historyRecords) {
        if (getHistoryRecords() == null) {
            this.historyRecords = new java.util.ArrayList<HistoryRecordEntry>(historyRecords.length);
        }
        for (HistoryRecordEntry value : historyRecords) {
            this.historyRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param historyRecords <p>
     *            Information about the events in the history of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetHistoryResult withHistoryRecords(
            java.util.Collection<HistoryRecordEntry> historyRecords) {
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
    public DescribeFleetHistoryResult withLastEvaluatedTime(java.util.Date lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetHistoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     *
     * @return <p>
     *         The ID of the EC Fleet.
     *         </p>
     */
    public String getFleetId() {
        return fleetId;
    }

    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     *
     * @param fleetId <p>
     *            The ID of the EC Fleet.
     *            </p>
     */
    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetId <p>
     *            The ID of the EC Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetHistoryResult withFleetId(String fleetId) {
        this.fleetId = fleetId;
        return this;
    }

    /**
     * <p>
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The start date and time for the events, in UTC format (for
     *         example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param startTime <p>
     *            The start date and time for the events, in UTC format (for
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
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start date and time for the events, in UTC format (for
     *            example,
     *            <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i
     *            >SS</i>Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetHistoryResult withStartTime(java.util.Date startTime) {
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
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
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
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetHistoryResult == false)
            return false;
        DescribeFleetHistoryResult other = (DescribeFleetHistoryResult) obj;

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
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }
}
