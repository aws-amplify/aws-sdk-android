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
 * Lists log events from the specified log group. You can list all the log
 * events or filter the results using a filter pattern, a time range, and the
 * name of the log stream.
 * </p>
 * <p>
 * By default, this operation returns as many log events as can fit in 1 MB (up
 * to 10,000 log events), or all the events found within the time range that you
 * specify. If the results include a token, then there are more log events
 * available, and you can get additional results by specifying the token in a
 * subsequent call.
 * </p>
 */
public class FilterLogEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     */
    private java.util.List<String> logStreamNames;

    /**
     * <p>
     * Filters the results to include only events from log streams that have
     * names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamNamePrefix;

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp before this time
     * are not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startTime;

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp later than this time
     * are not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endTime;

    /**
     * <p>
     * The filter pattern to use. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html"
     * >Filter and Pattern Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String filterPattern;

    /**
     * <p>
     * The token for the next set of events to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide
     * responses that contain events from multiple log streams within the log
     * group, interleaved in a single response. If the value is false, all the
     * matched log events in the first log stream are searched first, then those
     * in the next log stream, and so on. The default is false.
     * </p>
     */
    private Boolean interleaved;

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group to search.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group to search.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group to search.
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
     *            The name of the log group to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     *
     * @return <p>
     *         Filters the results to only logs from the log streams in this
     *         list.
     *         </p>
     *         <p>
     *         If you specify a value for both <code>logStreamNamePrefix</code>
     *         and <code>logStreamNames</code>, but the value for
     *         <code>logStreamNamePrefix</code> does not match any log stream
     *         names specified in <code>logStreamNames</code>, the action
     *         returns an <code>InvalidParameterException</code> error.
     *         </p>
     */
    public java.util.List<String> getLogStreamNames() {
        return logStreamNames;
    }

    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     *
     * @param logStreamNames <p>
     *            Filters the results to only logs from the log streams in this
     *            list.
     *            </p>
     *            <p>
     *            If you specify a value for both
     *            <code>logStreamNamePrefix</code> and
     *            <code>logStreamNames</code>, but the value for
     *            <code>logStreamNamePrefix</code> does not match any log stream
     *            names specified in <code>logStreamNames</code>, the action
     *            returns an <code>InvalidParameterException</code> error.
     *            </p>
     */
    public void setLogStreamNames(java.util.Collection<String> logStreamNames) {
        if (logStreamNames == null) {
            this.logStreamNames = null;
            return;
        }

        this.logStreamNames = new java.util.ArrayList<String>(logStreamNames);
    }

    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logStreamNames <p>
     *            Filters the results to only logs from the log streams in this
     *            list.
     *            </p>
     *            <p>
     *            If you specify a value for both
     *            <code>logStreamNamePrefix</code> and
     *            <code>logStreamNames</code>, but the value for
     *            <code>logStreamNamePrefix</code> does not match any log stream
     *            names specified in <code>logStreamNames</code>, the action
     *            returns an <code>InvalidParameterException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withLogStreamNames(String... logStreamNames) {
        if (getLogStreamNames() == null) {
            this.logStreamNames = new java.util.ArrayList<String>(logStreamNames.length);
        }
        for (String value : logStreamNames) {
            this.logStreamNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logStreamNames <p>
     *            Filters the results to only logs from the log streams in this
     *            list.
     *            </p>
     *            <p>
     *            If you specify a value for both
     *            <code>logStreamNamePrefix</code> and
     *            <code>logStreamNames</code>, but the value for
     *            <code>logStreamNamePrefix</code> does not match any log stream
     *            names specified in <code>logStreamNames</code>, the action
     *            returns an <code>InvalidParameterException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withLogStreamNames(java.util.Collection<String> logStreamNames) {
        setLogStreamNames(logStreamNames);
        return this;
    }

    /**
     * <p>
     * Filters the results to include only events from log streams that have
     * names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         Filters the results to include only events from log streams that
     *         have names starting with this prefix.
     *         </p>
     *         <p>
     *         If you specify a value for both <code>logStreamNamePrefix</code>
     *         and <code>logStreamNames</code>, but the value for
     *         <code>logStreamNamePrefix</code> does not match any log stream
     *         names specified in <code>logStreamNames</code>, the action
     *         returns an <code>InvalidParameterException</code> error.
     *         </p>
     */
    public String getLogStreamNamePrefix() {
        return logStreamNamePrefix;
    }

    /**
     * <p>
     * Filters the results to include only events from log streams that have
     * names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamNamePrefix <p>
     *            Filters the results to include only events from log streams
     *            that have names starting with this prefix.
     *            </p>
     *            <p>
     *            If you specify a value for both
     *            <code>logStreamNamePrefix</code> and
     *            <code>logStreamNames</code>, but the value for
     *            <code>logStreamNamePrefix</code> does not match any log stream
     *            names specified in <code>logStreamNames</code>, the action
     *            returns an <code>InvalidParameterException</code> error.
     *            </p>
     */
    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * Filters the results to include only events from log streams that have
     * names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and
     * <code>logStreamNames</code>, but the value for
     * <code>logStreamNamePrefix</code> does not match any log stream names
     * specified in <code>logStreamNames</code>, the action returns an
     * <code>InvalidParameterException</code> error.
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
     *            Filters the results to include only events from log streams
     *            that have names starting with this prefix.
     *            </p>
     *            <p>
     *            If you specify a value for both
     *            <code>logStreamNamePrefix</code> and
     *            <code>logStreamNames</code>, but the value for
     *            <code>logStreamNamePrefix</code> does not match any log stream
     *            names specified in <code>logStreamNames</code>, the action
     *            returns an <code>InvalidParameterException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
        return this;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp before this time
     * are not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The start of the time range, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time
     *         stamp before this time are not returned.
     *         </p>
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp before this time
     * are not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime <p>
     *            The start of the time range, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *            time stamp before this time are not returned.
     *            </p>
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds
     * after Jan 1, 1970 00:00:00 UTC. Events with a time stamp before this time
     * are not returned.
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
     *            time stamp before this time are not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp later than this time
     * are not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The end of the time range, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a time
     *         stamp later than this time are not returned.
     *         </p>
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp later than this time
     * are not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime <p>
     *            The end of the time range, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *            time stamp later than this time are not returned.
     *            </p>
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after
     * Jan 1, 1970 00:00:00 UTC. Events with a time stamp later than this time
     * are not returned.
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
     *            time stamp later than this time are not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The filter pattern to use. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html"
     * >Filter and Pattern Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The filter pattern to use. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html"
     *         >Filter and Pattern Syntax</a>.
     *         </p>
     *         <p>
     *         If not provided, all the events are matched.
     *         </p>
     */
    public String getFilterPattern() {
        return filterPattern;
    }

    /**
     * <p>
     * The filter pattern to use. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html"
     * >Filter and Pattern Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            The filter pattern to use. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html"
     *            >Filter and Pattern Syntax</a>.
     *            </p>
     *            <p>
     *            If not provided, all the events are matched.
     *            </p>
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * The filter pattern to use. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html"
     * >Filter and Pattern Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            The filter pattern to use. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html"
     *            >Filter and Pattern Syntax</a>.
     *            </p>
     *            <p>
     *            If not provided, all the events are matched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * <p>
     * The token for the next set of events to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of events to return. (You received
     *         this token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of events to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of events to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of events to return. (You received this token
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
     *            The token for the next set of events to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The maximum number of events to return. The default is 10,000
     *         events.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit <p>
     *            The maximum number of events to return. The default is 10,000
     *            events.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit <p>
     *            The maximum number of events to return. The default is 10,000
     *            events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide
     * responses that contain events from multiple log streams within the log
     * group, interleaved in a single response. If the value is false, all the
     * matched log events in the first log stream are searched first, then those
     * in the next log stream, and so on. The default is false.
     * </p>
     *
     * @return <p>
     *         If the value is true, the operation makes a best effort to
     *         provide responses that contain events from multiple log streams
     *         within the log group, interleaved in a single response. If the
     *         value is false, all the matched log events in the first log
     *         stream are searched first, then those in the next log stream, and
     *         so on. The default is false.
     *         </p>
     */
    public Boolean isInterleaved() {
        return interleaved;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide
     * responses that contain events from multiple log streams within the log
     * group, interleaved in a single response. If the value is false, all the
     * matched log events in the first log stream are searched first, then those
     * in the next log stream, and so on. The default is false.
     * </p>
     *
     * @return <p>
     *         If the value is true, the operation makes a best effort to
     *         provide responses that contain events from multiple log streams
     *         within the log group, interleaved in a single response. If the
     *         value is false, all the matched log events in the first log
     *         stream are searched first, then those in the next log stream, and
     *         so on. The default is false.
     *         </p>
     */
    public Boolean getInterleaved() {
        return interleaved;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide
     * responses that contain events from multiple log streams within the log
     * group, interleaved in a single response. If the value is false, all the
     * matched log events in the first log stream are searched first, then those
     * in the next log stream, and so on. The default is false.
     * </p>
     *
     * @param interleaved <p>
     *            If the value is true, the operation makes a best effort to
     *            provide responses that contain events from multiple log
     *            streams within the log group, interleaved in a single
     *            response. If the value is false, all the matched log events in
     *            the first log stream are searched first, then those in the
     *            next log stream, and so on. The default is false.
     *            </p>
     */
    public void setInterleaved(Boolean interleaved) {
        this.interleaved = interleaved;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide
     * responses that contain events from multiple log streams within the log
     * group, interleaved in a single response. If the value is false, all the
     * matched log events in the first log stream are searched first, then those
     * in the next log stream, and so on. The default is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interleaved <p>
     *            If the value is true, the operation makes a best effort to
     *            provide responses that contain events from multiple log
     *            streams within the log group, interleaved in a single
     *            response. If the value is false, all the matched log events in
     *            the first log stream are searched first, then those in the
     *            next log stream, and so on. The default is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsRequest withInterleaved(Boolean interleaved) {
        this.interleaved = interleaved;
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
        if (getLogStreamNames() != null)
            sb.append("logStreamNames: " + getLogStreamNames() + ",");
        if (getLogStreamNamePrefix() != null)
            sb.append("logStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getFilterPattern() != null)
            sb.append("filterPattern: " + getFilterPattern() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit() + ",");
        if (getInterleaved() != null)
            sb.append("interleaved: " + getInterleaved());
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
                + ((getLogStreamNames() == null) ? 0 : getLogStreamNames().hashCode());
        hashCode = prime * hashCode
                + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getInterleaved() == null) ? 0 : getInterleaved().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterLogEventsRequest == false)
            return false;
        FilterLogEventsRequest other = (FilterLogEventsRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNames() == null ^ this.getLogStreamNames() == null)
            return false;
        if (other.getLogStreamNames() != null
                && other.getLogStreamNames().equals(this.getLogStreamNames()) == false)
            return false;
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null
                && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
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
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null
                && other.getFilterPattern().equals(this.getFilterPattern()) == false)
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
        if (other.getInterleaved() == null ^ this.getInterleaved() == null)
            return false;
        if (other.getInterleaved() != null
                && other.getInterleaved().equals(this.getInterleaved()) == false)
            return false;
        return true;
    }
}
