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

/**
 * <p>
 * Information about one CloudWatch Logs Insights query that matches the request
 * in a <code>DescribeQueries</code> operation.
 * </p>
 */
public class QueryInfo implements Serializable {
    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String queryId;

    /**
     * <p>
     * The query string used in this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     */
    private String queryString;

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>,
     * <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     */
    private String status;

    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long createTime;

    /**
     * <p>
     * The name of the log group scanned by this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>
     *         The unique ID number of this query.
     *         </p>
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryId <p>
     *            The unique ID number of this query.
     *            </p>
     */
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The unique ID number of this query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryId <p>
     *            The unique ID number of this query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryInfo withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * <p>
     * The query string used in this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     *
     * @return <p>
     *         The query string used in this query.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The query string used in this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     *
     * @param queryString <p>
     *            The query string used in this query.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string used in this query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10000<br/>
     *
     * @param queryString <p>
     *            The query string used in this query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryInfo withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>,
     * <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @return <p>
     *         The status of this query. Possible values are
     *         <code>Cancelled</code>, <code>Complete</code>,
     *         <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>
     *         , and <code>Unknown</code>.
     *         </p>
     * @see QueryStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>,
     * <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of this query. Possible values are
     *            <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, and <code>Unknown</code>.
     *            </p>
     * @see QueryStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>,
     * <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of this query. Possible values are
     *            <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, and <code>Unknown</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryStatus
     */
    public QueryInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>,
     * <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of this query. Possible values are
     *            <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, and <code>Unknown</code>.
     *            </p>
     * @see QueryStatus
     */
    public void setStatus(QueryStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of this query. Possible values are <code>Cancelled</code>,
     * <code>Complete</code>, <code>Failed</code>, <code>Running</code>,
     * <code>Scheduled</code>, and <code>Unknown</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of this query. Possible values are
     *            <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, and <code>Unknown</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryStatus
     */
    public QueryInfo withStatus(QueryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The date and time that this query was created.
     *         </p>
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param createTime <p>
     *            The date and time that this query was created.
     *            </p>
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time that this query was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param createTime <p>
     *            The date and time that this query was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The name of the log group scanned by this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group scanned by this query.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group scanned by this query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group scanned by this query.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group scanned by this query.
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
     *            The name of the log group scanned by this query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryInfo withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
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
        if (getQueryId() != null)
            sb.append("queryId: " + getQueryId() + ",");
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime() + ",");
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryInfo == false)
            return false;
        QueryInfo other = (QueryInfo) obj;

        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        return true;
    }
}
