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
 * Lists log events from the specified log stream. You can list all the log
 * events or filter using a time range.
 * </p>
 * <p>
 * By default, this operation returns as many log events as can fit in a
 * response size of 1MB (up to 10,000 log events). You can get additional log
 * events by specifying one of the tokens in a subsequent call.
 * </p>
 */
public class GetLogEventsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamName;

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to this
     * time or later than this time are included. Events with a time stamp
     * earlier than this time are not included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startTime;

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to or later than
     * this time are not included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endTime;

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
     * The maximum number of log events returned. If you don't specify a value,
     * the maximum is as many log events as can fit in a response size of 1 MB,
     * up to 10,000 log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the
     * value is false, the latest log events are returned first. The default
     * value is false.
     * </p>
     */
    private Boolean startFromHead;

    /**
     * Default constructor for GetLogEventsRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public GetLogEventsRequest() {
    }

    /**
     * Constructs a new GetLogEventsRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     */
    public GetLogEventsRequest(String logGroupName, String logStreamName) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
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
    public GetLogEventsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         The name of the log stream.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName <p>
     *            The name of the log stream.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName <p>
     *            The name of the log stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to this
     * time or later than this time are included. Events with a time stamp
     * earlier than this time are not included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The start of the time range, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time
     *         stamp equal to this time or later than this time are included.
     *         Events with a time stamp earlier than this time are not included.
     *         </p>
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to this
     * time or later than this time are included. Events with a time stamp
     * earlier than this time are not included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime <p>
     *            The start of the time range, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *            time stamp equal to this time or later than this time are
     *            included. Events with a time stamp earlier than this time are
     *            not included.
     *            </p>
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to this
     * time or later than this time are included. Events with a time stamp
     * earlier than this time are not included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime <p>
     *            The start of the time range, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *            time stamp equal to this time or later than this time are
     *            included. Events with a time stamp earlier than this time are
     *            not included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to or later than
     * this time are not included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The end of the time range, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time
     *         stamp equal to or later than this time are not included.
     *         </p>
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to or later than
     * this time are not included.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime <p>
     *            The end of the time range, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *            time stamp equal to or later than this time are not included.
     *            </p>
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp equal to or later than
     * this time are not included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime <p>
     *            The end of the time range, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *            time stamp equal to or later than this time are not included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
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
    public GetLogEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of log events returned. If you don't specify a value,
     * the maximum is as many log events as can fit in a response size of 1 MB,
     * up to 10,000 log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The maximum number of log events returned. If you don't specify a
     *         value, the maximum is as many log events as can fit in a response
     *         size of 1 MB, up to 10,000 log events.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of log events returned. If you don't specify a value,
     * the maximum is as many log events as can fit in a response size of 1 MB,
     * up to 10,000 log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit <p>
     *            The maximum number of log events returned. If you don't
     *            specify a value, the maximum is as many log events as can fit
     *            in a response size of 1 MB, up to 10,000 log events.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of log events returned. If you don't specify a value,
     * the maximum is as many log events as can fit in a response size of 1 MB,
     * up to 10,000 log events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit <p>
     *            The maximum number of log events returned. If you don't
     *            specify a value, the maximum is as many log events as can fit
     *            in a response size of 1 MB, up to 10,000 log events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the
     * value is false, the latest log events are returned first. The default
     * value is false.
     * </p>
     *
     * @return <p>
     *         If the value is true, the earliest log events are returned first.
     *         If the value is false, the latest log events are returned first.
     *         The default value is false.
     *         </p>
     */
    public Boolean isStartFromHead() {
        return startFromHead;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the
     * value is false, the latest log events are returned first. The default
     * value is false.
     * </p>
     *
     * @return <p>
     *         If the value is true, the earliest log events are returned first.
     *         If the value is false, the latest log events are returned first.
     *         The default value is false.
     *         </p>
     */
    public Boolean getStartFromHead() {
        return startFromHead;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the
     * value is false, the latest log events are returned first. The default
     * value is false.
     * </p>
     *
     * @param startFromHead <p>
     *            If the value is true, the earliest log events are returned
     *            first. If the value is false, the latest log events are
     *            returned first. The default value is false.
     *            </p>
     */
    public void setStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the
     * value is false, the latest log events are returned first. The default
     * value is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startFromHead <p>
     *            If the value is true, the earliest log events are returned
     *            first. If the value is false, the latest log events are
     *            returned first. The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsRequest withStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
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
        if (getLogStreamName() != null)
            sb.append("logStreamName: " + getLogStreamName() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit() + ",");
        if (getStartFromHead() != null)
            sb.append("startFromHead: " + getStartFromHead());
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
                + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getStartFromHead() == null) ? 0 : getStartFromHead().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogEventsRequest == false)
            return false;
        GetLogEventsRequest other = (GetLogEventsRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getStartFromHead() == null ^ this.getStartFromHead() == null)
            return false;
        if (other.getStartFromHead() != null
                && other.getStartFromHead().equals(this.getStartFromHead()) == false)
            return false;
        return true;
    }
}
