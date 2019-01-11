/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the log streams for the specified log group. You can list all the log
 * streams or filter the results by prefix. You can also control how the results
 * are ordered.
 * </p>
 * <p>
 * This operation has a limit of five transactions per second, after which
 * transactions are throttled.
 * </p>
 */
public class DescribeLogStreamsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * If <code>orderBy</code> is <code>LastEventTime</code>,you cannot specify
     * this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamNamePrefix;

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by
     * log stream name. If the value is <code>LastEventTime</code>, the results
     * are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the
     * <code>logStreamNamePrefix</code> parameter.
     * </p>
     * <p>
     * lastEventTimestamp represents the time of the most recent log event in
     * the log stream in CloudWatch Logs. This number is expressed as the number
     * of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp
     * updates on an eventual consistency basis. It typically updates in less
     * than an hour from ingestion, but may take longer in some rare situations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LogStreamName, LastEventTime
     */
    private String orderBy;

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the
     * value is to false, results are returned in ascending order. The default
     * value is false.
     * </p>
     */
    private Boolean descending;

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the
     * default is up to 50 items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer limit;

    /**
     * Default constructor for DescribeLogStreamsRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public DescribeLogStreamsRequest() {
    }

    /**
     * Constructs a new DescribeLogStreamsRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public DescribeLogStreamsRequest(String logGroupName) {
        setLogGroupName(logGroupName);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * If <code>orderBy</code> is <code>LastEventTime</code>,you cannot specify
     * this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The prefix to match.
     *         </p>
     *         <p>
     *         If <code>orderBy</code> is <code>LastEventTime</code>,you cannot
     *         specify this parameter.
     *         </p>
     */
    public String getLogStreamNamePrefix() {
        return logStreamNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * If <code>orderBy</code> is <code>LastEventTime</code>,you cannot specify
     * this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamNamePrefix <p>
     *            The prefix to match.
     *            </p>
     *            <p>
     *            If <code>orderBy</code> is <code>LastEventTime</code>,you
     *            cannot specify this parameter.
     *            </p>
     */
    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * If <code>orderBy</code> is <code>LastEventTime</code>,you cannot specify
     * this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamNamePrefix <p>
     *            The prefix to match.
     *            </p>
     *            <p>
     *            If <code>orderBy</code> is <code>LastEventTime</code>,you
     *            cannot specify this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
        return this;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by
     * log stream name. If the value is <code>LastEventTime</code>, the results
     * are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the
     * <code>logStreamNamePrefix</code> parameter.
     * </p>
     * <p>
     * lastEventTimestamp represents the time of the most recent log event in
     * the log stream in CloudWatch Logs. This number is expressed as the number
     * of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp
     * updates on an eventual consistency basis. It typically updates in less
     * than an hour from ingestion, but may take longer in some rare situations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LogStreamName, LastEventTime
     *
     * @return <p>
     *         If the value is <code>LogStreamName</code>, the results are
     *         ordered by log stream name. If the value is
     *         <code>LastEventTime</code>, the results are ordered by the event
     *         time. The default value is <code>LogStreamName</code>.
     *         </p>
     *         <p>
     *         If you order the results by event time, you cannot specify the
     *         <code>logStreamNamePrefix</code> parameter.
     *         </p>
     *         <p>
     *         lastEventTimestamp represents the time of the most recent log
     *         event in the log stream in CloudWatch Logs. This number is
     *         expressed as the number of milliseconds after Jan 1, 1970
     *         00:00:00 UTC. lastEventTimeStamp updates on an eventual
     *         consistency basis. It typically updates in less than an hour from
     *         ingestion, but may take longer in some rare situations.
     *         </p>
     * @see OrderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by
     * log stream name. If the value is <code>LastEventTime</code>, the results
     * are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the
     * <code>logStreamNamePrefix</code> parameter.
     * </p>
     * <p>
     * lastEventTimestamp represents the time of the most recent log event in
     * the log stream in CloudWatch Logs. This number is expressed as the number
     * of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp
     * updates on an eventual consistency basis. It typically updates in less
     * than an hour from ingestion, but may take longer in some rare situations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LogStreamName, LastEventTime
     *
     * @param orderBy <p>
     *            If the value is <code>LogStreamName</code>, the results are
     *            ordered by log stream name. If the value is
     *            <code>LastEventTime</code>, the results are ordered by the
     *            event time. The default value is <code>LogStreamName</code>.
     *            </p>
     *            <p>
     *            If you order the results by event time, you cannot specify the
     *            <code>logStreamNamePrefix</code> parameter.
     *            </p>
     *            <p>
     *            lastEventTimestamp represents the time of the most recent log
     *            event in the log stream in CloudWatch Logs. This number is
     *            expressed as the number of milliseconds after Jan 1, 1970
     *            00:00:00 UTC. lastEventTimeStamp updates on an eventual
     *            consistency basis. It typically updates in less than an hour
     *            from ingestion, but may take longer in some rare situations.
     *            </p>
     * @see OrderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by
     * log stream name. If the value is <code>LastEventTime</code>, the results
     * are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the
     * <code>logStreamNamePrefix</code> parameter.
     * </p>
     * <p>
     * lastEventTimestamp represents the time of the most recent log event in
     * the log stream in CloudWatch Logs. This number is expressed as the number
     * of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp
     * updates on an eventual consistency basis. It typically updates in less
     * than an hour from ingestion, but may take longer in some rare situations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LogStreamName, LastEventTime
     *
     * @param orderBy <p>
     *            If the value is <code>LogStreamName</code>, the results are
     *            ordered by log stream name. If the value is
     *            <code>LastEventTime</code>, the results are ordered by the
     *            event time. The default value is <code>LogStreamName</code>.
     *            </p>
     *            <p>
     *            If you order the results by event time, you cannot specify the
     *            <code>logStreamNamePrefix</code> parameter.
     *            </p>
     *            <p>
     *            lastEventTimestamp represents the time of the most recent log
     *            event in the log stream in CloudWatch Logs. This number is
     *            expressed as the number of milliseconds after Jan 1, 1970
     *            00:00:00 UTC. lastEventTimeStamp updates on an eventual
     *            consistency basis. It typically updates in less than an hour
     *            from ingestion, but may take longer in some rare situations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrderBy
     */
    public DescribeLogStreamsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by
     * log stream name. If the value is <code>LastEventTime</code>, the results
     * are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the
     * <code>logStreamNamePrefix</code> parameter.
     * </p>
     * <p>
     * lastEventTimestamp represents the time of the most recent log event in
     * the log stream in CloudWatch Logs. This number is expressed as the number
     * of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp
     * updates on an eventual consistency basis. It typically updates in less
     * than an hour from ingestion, but may take longer in some rare situations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LogStreamName, LastEventTime
     *
     * @param orderBy <p>
     *            If the value is <code>LogStreamName</code>, the results are
     *            ordered by log stream name. If the value is
     *            <code>LastEventTime</code>, the results are ordered by the
     *            event time. The default value is <code>LogStreamName</code>.
     *            </p>
     *            <p>
     *            If you order the results by event time, you cannot specify the
     *            <code>logStreamNamePrefix</code> parameter.
     *            </p>
     *            <p>
     *            lastEventTimestamp represents the time of the most recent log
     *            event in the log stream in CloudWatch Logs. This number is
     *            expressed as the number of milliseconds after Jan 1, 1970
     *            00:00:00 UTC. lastEventTimeStamp updates on an eventual
     *            consistency basis. It typically updates in less than an hour
     *            from ingestion, but may take longer in some rare situations.
     *            </p>
     * @see OrderBy
     */
    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by
     * log stream name. If the value is <code>LastEventTime</code>, the results
     * are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the
     * <code>logStreamNamePrefix</code> parameter.
     * </p>
     * <p>
     * lastEventTimestamp represents the time of the most recent log event in
     * the log stream in CloudWatch Logs. This number is expressed as the number
     * of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp
     * updates on an eventual consistency basis. It typically updates in less
     * than an hour from ingestion, but may take longer in some rare situations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LogStreamName, LastEventTime
     *
     * @param orderBy <p>
     *            If the value is <code>LogStreamName</code>, the results are
     *            ordered by log stream name. If the value is
     *            <code>LastEventTime</code>, the results are ordered by the
     *            event time. The default value is <code>LogStreamName</code>.
     *            </p>
     *            <p>
     *            If you order the results by event time, you cannot specify the
     *            <code>logStreamNamePrefix</code> parameter.
     *            </p>
     *            <p>
     *            lastEventTimestamp represents the time of the most recent log
     *            event in the log stream in CloudWatch Logs. This number is
     *            expressed as the number of milliseconds after Jan 1, 1970
     *            00:00:00 UTC. lastEventTimeStamp updates on an eventual
     *            consistency basis. It typically updates in less than an hour
     *            from ingestion, but may take longer in some rare situations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrderBy
     */
    public DescribeLogStreamsRequest withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
        return this;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the
     * value is to false, results are returned in ascending order. The default
     * value is false.
     * </p>
     *
     * @return <p>
     *         If the value is true, results are returned in descending order.
     *         If the value is to false, results are returned in ascending
     *         order. The default value is false.
     *         </p>
     */
    public Boolean isDescending() {
        return descending;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the
     * value is to false, results are returned in ascending order. The default
     * value is false.
     * </p>
     *
     * @return <p>
     *         If the value is true, results are returned in descending order.
     *         If the value is to false, results are returned in ascending
     *         order. The default value is false.
     *         </p>
     */
    public Boolean getDescending() {
        return descending;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the
     * value is to false, results are returned in ascending order. The default
     * value is false.
     * </p>
     *
     * @param descending <p>
     *            If the value is true, results are returned in descending
     *            order. If the value is to false, results are returned in
     *            ascending order. The default value is false.
     *            </p>
     */
    public void setDescending(Boolean descending) {
        this.descending = descending;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the
     * value is to false, results are returned in ascending order. The default
     * value is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param descending <p>
     *            If the value is true, results are returned in descending
     *            order. If the value is to false, results are returned in
     *            ascending order. The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsRequest withDescending(Boolean descending) {
        this.descending = descending;
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the
     * default is up to 50 items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of items returned. If you don't specify a
     *         value, the default is up to 50 items.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the
     * default is up to 50 items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param limit <p>
     *            The maximum number of items returned. If you don't specify a
     *            value, the default is up to 50 items.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the
     * default is up to 50 items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param limit <p>
     *            The maximum number of items returned. If you don't specify a
     *            value, the default is up to 50 items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLogStreamsRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getLogStreamNamePrefix() != null)
            sb.append("logStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
        if (getOrderBy() != null)
            sb.append("orderBy: " + getOrderBy() + ",");
        if (getDescending() != null)
            sb.append("descending: " + getDescending() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        hashCode = prime * hashCode + ((getDescending() == null) ? 0 : getDescending().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLogStreamsRequest == false)
            return false;
        DescribeLogStreamsRequest other = (DescribeLogStreamsRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null
                && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        if (other.getDescending() == null ^ this.getDescending() == null)
            return false;
        if (other.getDescending() != null
                && other.getDescending().equals(this.getDescending()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
