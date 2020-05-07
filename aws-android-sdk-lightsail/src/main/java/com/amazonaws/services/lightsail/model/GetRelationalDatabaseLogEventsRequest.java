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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of log events for a database in Amazon Lightsail.
 * </p>
 */
public class GetRelationalDatabaseLogEventsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseName;

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get
     * a list of available log streams.
     * </p>
     */
    private String logStreamName;

    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If
     * <code>true</code> is specified, the log event starts from the head of the
     * log. If <code>false</code> is specified, the log event starts from the
     * tail of the log.
     * </p>
     * <note>
     * <p>
     * For PostgreSQL, the default value of <code>false</code> is the only
     * option available.
     * </p>
     * </note>
     */
    private Boolean startFromHead;

    /**
     * <p>
     * The token to advance to the next or previous page of results from your
     * request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseLogEvents</code> request. If your results are
     * paginated, the response will return a next forward token and/or next
     * backward token that you can specify as the page token in a subsequent
     * request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your database for which to get log events.
     *         </p>
     */
    public String getRelationalDatabaseName() {
        return relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get log events.
     *            </p>
     */
    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get log events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get log events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsRequest withRelationalDatabaseName(
            String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
        return this;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get
     * a list of available log streams.
     * </p>
     *
     * @return <p>
     *         The name of the log stream.
     *         </p>
     *         <p>
     *         Use the <code>get relational database log streams</code>
     *         operation to get a list of available log streams.
     *         </p>
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get
     * a list of available log streams.
     * </p>
     *
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     *            <p>
     *            Use the <code>get relational database log streams</code>
     *            operation to get a list of available log streams.
     *            </p>
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * Use the <code>get relational database log streams</code> operation to get
     * a list of available log streams.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     *            <p>
     *            Use the <code>get relational database log streams</code>
     *            operation to get a list of available log streams.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The start of the time interval from which to get log events.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use a start time of October 1, 2018,
     *         at 8 PM UTC, then you input <code>1538424000</code> as the start
     *         time.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     *
     * @param startTime <p>
     *            The start of the time interval from which to get log events.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in the Unix time format.
     *            </p>
     *            <p>
     *            For example, if you wish to use a start time of October 1,
     *            2018, at 8 PM UTC, then you input <code>1538424000</code> as
     *            the start time.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start of the time interval from which to get log events.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in the Unix time format.
     *            </p>
     *            <p>
     *            For example, if you wish to use a start time of October 1,
     *            2018, at 8 PM UTC, then you input <code>1538424000</code> as
     *            the start time.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The end of the time interval from which to get log events.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use an end time of October 1, 2018,
     *         at 8 PM UTC, then you input <code>1538424000</code> as the end
     *         time.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     *
     * @param endTime <p>
     *            The end of the time interval from which to get log events.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in the Unix time format.
     *            </p>
     *            <p>
     *            For example, if you wish to use an end time of October 1,
     *            2018, at 8 PM UTC, then you input <code>1538424000</code> as
     *            the end time.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval from which to get log events.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 8 PM
     * UTC, then you input <code>1538424000</code> as the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end of the time interval from which to get log events.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Specified in Coordinated Universal Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified in the Unix time format.
     *            </p>
     *            <p>
     *            For example, if you wish to use an end time of October 1,
     *            2018, at 8 PM UTC, then you input <code>1538424000</code> as
     *            the end time.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If
     * <code>true</code> is specified, the log event starts from the head of the
     * log. If <code>false</code> is specified, the log event starts from the
     * tail of the log.
     * </p>
     * <note>
     * <p>
     * For PostgreSQL, the default value of <code>false</code> is the only
     * option available.
     * </p>
     * </note>
     *
     * @return <p>
     *         Parameter to specify if the log should start from head or tail.
     *         If <code>true</code> is specified, the log event starts from the
     *         head of the log. If <code>false</code> is specified, the log
     *         event starts from the tail of the log.
     *         </p>
     *         <note>
     *         <p>
     *         For PostgreSQL, the default value of <code>false</code> is the
     *         only option available.
     *         </p>
     *         </note>
     */
    public Boolean isStartFromHead() {
        return startFromHead;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If
     * <code>true</code> is specified, the log event starts from the head of the
     * log. If <code>false</code> is specified, the log event starts from the
     * tail of the log.
     * </p>
     * <note>
     * <p>
     * For PostgreSQL, the default value of <code>false</code> is the only
     * option available.
     * </p>
     * </note>
     *
     * @return <p>
     *         Parameter to specify if the log should start from head or tail.
     *         If <code>true</code> is specified, the log event starts from the
     *         head of the log. If <code>false</code> is specified, the log
     *         event starts from the tail of the log.
     *         </p>
     *         <note>
     *         <p>
     *         For PostgreSQL, the default value of <code>false</code> is the
     *         only option available.
     *         </p>
     *         </note>
     */
    public Boolean getStartFromHead() {
        return startFromHead;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If
     * <code>true</code> is specified, the log event starts from the head of the
     * log. If <code>false</code> is specified, the log event starts from the
     * tail of the log.
     * </p>
     * <note>
     * <p>
     * For PostgreSQL, the default value of <code>false</code> is the only
     * option available.
     * </p>
     * </note>
     *
     * @param startFromHead <p>
     *            Parameter to specify if the log should start from head or
     *            tail. If <code>true</code> is specified, the log event starts
     *            from the head of the log. If <code>false</code> is specified,
     *            the log event starts from the tail of the log.
     *            </p>
     *            <note>
     *            <p>
     *            For PostgreSQL, the default value of <code>false</code> is the
     *            only option available.
     *            </p>
     *            </note>
     */
    public void setStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
    }

    /**
     * <p>
     * Parameter to specify if the log should start from head or tail. If
     * <code>true</code> is specified, the log event starts from the head of the
     * log. If <code>false</code> is specified, the log event starts from the
     * tail of the log.
     * </p>
     * <note>
     * <p>
     * For PostgreSQL, the default value of <code>false</code> is the only
     * option available.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startFromHead <p>
     *            Parameter to specify if the log should start from head or
     *            tail. If <code>true</code> is specified, the log event starts
     *            from the head of the log. If <code>false</code> is specified,
     *            the log event starts from the tail of the log.
     *            </p>
     *            <note>
     *            <p>
     *            For PostgreSQL, the default value of <code>false</code> is the
     *            only option available.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsRequest withStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
        return this;
    }

    /**
     * <p>
     * The token to advance to the next or previous page of results from your
     * request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseLogEvents</code> request. If your results are
     * paginated, the response will return a next forward token and/or next
     * backward token that you can specify as the page token in a subsequent
     * request.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next or previous page of results from
     *         your request.
     *         </p>
     *         <p>
     *         To get a page token, perform an initial
     *         <code>GetRelationalDatabaseLogEvents</code> request. If your
     *         results are paginated, the response will return a next forward
     *         token and/or next backward token that you can specify as the page
     *         token in a subsequent request.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The token to advance to the next or previous page of results from your
     * request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseLogEvents</code> request. If your results are
     * paginated, the response will return a next forward token and/or next
     * backward token that you can specify as the page token in a subsequent
     * request.
     * </p>
     *
     * @param pageToken <p>
     *            The token to advance to the next or previous page of results
     *            from your request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial
     *            <code>GetRelationalDatabaseLogEvents</code> request. If your
     *            results are paginated, the response will return a next forward
     *            token and/or next backward token that you can specify as the
     *            page token in a subsequent request.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next or previous page of results from your
     * request.
     * </p>
     * <p>
     * To get a page token, perform an initial
     * <code>GetRelationalDatabaseLogEvents</code> request. If your results are
     * paginated, the response will return a next forward token and/or next
     * backward token that you can specify as the page token in a subsequent
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageToken <p>
     *            The token to advance to the next or previous page of results
     *            from your request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial
     *            <code>GetRelationalDatabaseLogEvents</code> request. If your
     *            results are paginated, the response will return a next forward
     *            token and/or next backward token that you can specify as the
     *            page token in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getRelationalDatabaseName() != null)
            sb.append("relationalDatabaseName: " + getRelationalDatabaseName() + ",");
        if (getLogStreamName() != null)
            sb.append("logStreamName: " + getLogStreamName() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getStartFromHead() != null)
            sb.append("startFromHead: " + getStartFromHead() + ",");
        if (getPageToken() != null)
            sb.append("pageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getStartFromHead() == null) ? 0 : getStartFromHead().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseLogEventsRequest == false)
            return false;
        GetRelationalDatabaseLogEventsRequest other = (GetRelationalDatabaseLogEventsRequest) obj;

        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null
                && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null
                && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartFromHead() == null ^ this.getStartFromHead() == null)
            return false;
        if (other.getStartFromHead() != null
                && other.getStartFromHead().equals(this.getStartFromHead()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }
}
