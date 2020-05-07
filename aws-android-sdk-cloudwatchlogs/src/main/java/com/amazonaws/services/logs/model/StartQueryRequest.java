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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Schedules a query of a log group using CloudWatch Logs Insights. You specify
 * the log group and time range to query, and the query string to use.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
 * >CloudWatch Logs Insights Query Syntax</a>.
 * </p>
 * <p>
 * Queries time out after 15 minutes of execution. If your queries are timing
 * out, reduce the time range being searched, or partition your query into a
 * number of queries.
 * </p>
 */
public class StartQueryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 20 log
     * groups.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     */
    private java.util.List<String> logGroupNames;

    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the
     * specified start time is included in the query. Specified as epoch time,
     * the number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startTime;

    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the
     * specified end time is included in the query. Specified as epoch time, the
     * number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endTime;

    /**
     * <p>
     * The query string to use. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
     * >CloudWatch Logs Insights Query Syntax</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     */
    private String queryString;

    /**
     * <p>
     * The maximum number of log events to return in the query. If the query
     * string uses the <code>fields</code> command, only the specified fields
     * and their values are returned. The default is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The log group on which to perform the query.
     *         </p>
     *         <p>
     *         A <code>StartQuery</code> operation must include a
     *         <code>logGroupNames</code> or a <code>logGroupName</code>
     *         parameter, but not both.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The log group on which to perform the query.
     *            </p>
     *            <p>
     *            A <code>StartQuery</code> operation must include a
     *            <code>logGroupNames</code> or a <code>logGroupName</code>
     *            parameter, but not both.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The log group on which to perform the query.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
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
     *            The log group on which to perform the query.
     *            </p>
     *            <p>
     *            A <code>StartQuery</code> operation must include a
     *            <code>logGroupNames</code> or a <code>logGroupName</code>
     *            parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 20 log
     * groups.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     *
     * @return <p>
     *         The list of log groups to be queried. You can include up to 20
     *         log groups.
     *         </p>
     *         <p>
     *         A <code>StartQuery</code> operation must include a
     *         <code>logGroupNames</code> or a <code>logGroupName</code>
     *         parameter, but not both.
     *         </p>
     */
    public java.util.List<String> getLogGroupNames() {
        return logGroupNames;
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 20 log
     * groups.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     *
     * @param logGroupNames <p>
     *            The list of log groups to be queried. You can include up to 20
     *            log groups.
     *            </p>
     *            <p>
     *            A <code>StartQuery</code> operation must include a
     *            <code>logGroupNames</code> or a <code>logGroupName</code>
     *            parameter, but not both.
     *            </p>
     */
    public void setLogGroupNames(java.util.Collection<String> logGroupNames) {
        if (logGroupNames == null) {
            this.logGroupNames = null;
            return;
        }

        this.logGroupNames = new java.util.ArrayList<String>(logGroupNames);
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 20 log
     * groups.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupNames <p>
     *            The list of log groups to be queried. You can include up to 20
     *            log groups.
     *            </p>
     *            <p>
     *            A <code>StartQuery</code> operation must include a
     *            <code>logGroupNames</code> or a <code>logGroupName</code>
     *            parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryRequest withLogGroupNames(String... logGroupNames) {
        if (getLogGroupNames() == null) {
            this.logGroupNames = new java.util.ArrayList<String>(logGroupNames.length);
        }
        for (String value : logGroupNames) {
            this.logGroupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of log groups to be queried. You can include up to 20 log
     * groups.
     * </p>
     * <p>
     * A <code>StartQuery</code> operation must include a
     * <code>logGroupNames</code> or a <code>logGroupName</code> parameter, but
     * not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupNames <p>
     *            The list of log groups to be queried. You can include up to 20
     *            log groups.
     *            </p>
     *            <p>
     *            A <code>StartQuery</code> operation must include a
     *            <code>logGroupNames</code> or a <code>logGroupName</code>
     *            parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryRequest withLogGroupNames(java.util.Collection<String> logGroupNames) {
        setLogGroupNames(logGroupNames);
        return this;
    }

    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the
     * specified start time is included in the query. Specified as epoch time,
     * the number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The beginning of the time range to query. The range is inclusive,
     *         so the specified start time is included in the query. Specified
     *         as epoch time, the number of seconds since January 1, 1970,
     *         00:00:00 UTC.
     *         </p>
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the
     * specified start time is included in the query. Specified as epoch time,
     * the number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime <p>
     *            The beginning of the time range to query. The range is
     *            inclusive, so the specified start time is included in the
     *            query. Specified as epoch time, the number of seconds since
     *            January 1, 1970, 00:00:00 UTC.
     *            </p>
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time range to query. The range is inclusive, so the
     * specified start time is included in the query. Specified as epoch time,
     * the number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime <p>
     *            The beginning of the time range to query. The range is
     *            inclusive, so the specified start time is included in the
     *            query. Specified as epoch time, the number of seconds since
     *            January 1, 1970, 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the
     * specified end time is included in the query. Specified as epoch time, the
     * number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The end of the time range to query. The range is inclusive, so
     *         the specified end time is included in the query. Specified as
     *         epoch time, the number of seconds since January 1, 1970, 00:00:00
     *         UTC.
     *         </p>
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the
     * specified end time is included in the query. Specified as epoch time, the
     * number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime <p>
     *            The end of the time range to query. The range is inclusive, so
     *            the specified end time is included in the query. Specified as
     *            epoch time, the number of seconds since January 1, 1970,
     *            00:00:00 UTC.
     *            </p>
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range to query. The range is inclusive, so the
     * specified end time is included in the query. Specified as epoch time, the
     * number of seconds since January 1, 1970, 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime <p>
     *            The end of the time range to query. The range is inclusive, so
     *            the specified end time is included in the query. Specified as
     *            epoch time, the number of seconds since January 1, 1970,
     *            00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The query string to use. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
     * >CloudWatch Logs Insights Query Syntax</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     *
     * @return <p>
     *         The query string to use. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
     *         >CloudWatch Logs Insights Query Syntax</a>.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The query string to use. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
     * >CloudWatch Logs Insights Query Syntax</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     *
     * @param queryString <p>
     *            The query string to use. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
     *            >CloudWatch Logs Insights Query Syntax</a>.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string to use. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
     * >CloudWatch Logs Insights Query Syntax</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     *
     * @param queryString <p>
     *            The query string to use. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html"
     *            >CloudWatch Logs Insights Query Syntax</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * The maximum number of log events to return in the query. If the query
     * string uses the <code>fields</code> command, only the specified fields
     * and their values are returned. The default is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The maximum number of log events to return in the query. If the
     *         query string uses the <code>fields</code> command, only the
     *         specified fields and their values are returned. The default is
     *         1000.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of log events to return in the query. If the query
     * string uses the <code>fields</code> command, only the specified fields
     * and their values are returned. The default is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit <p>
     *            The maximum number of log events to return in the query. If
     *            the query string uses the <code>fields</code> command, only
     *            the specified fields and their values are returned. The
     *            default is 1000.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of log events to return in the query. If the query
     * string uses the <code>fields</code> command, only the specified fields
     * and their values are returned. The default is 1000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit <p>
     *            The maximum number of log events to return in the query. If
     *            the query string uses the <code>fields</code> command, only
     *            the specified fields and their values are returned. The
     *            default is 1000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryRequest withLimit(Integer limit) {
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
        if (getLogGroupNames() != null)
            sb.append("logGroupNames: " + getLogGroupNames() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString() + ",");
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
                + ((getLogGroupNames() == null) ? 0 : getLogGroupNames().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryRequest == false)
            return false;
        StartQueryRequest other = (StartQueryRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogGroupNames() == null ^ this.getLogGroupNames() == null)
            return false;
        if (other.getLogGroupNames() != null
                && other.getLogGroupNames().equals(this.getLogGroupNames()) == false)
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
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
