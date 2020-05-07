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
 * Returns a list of CloudWatch Logs Insights queries that are scheduled,
 * executing, or have been executed recently in this account. You can request
 * all queries, or limit it to queries of a specific log group or queries with a
 * certain status.
 * </p>
 */
public class DescribeQueriesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status.
     * Valid values are <code>Cancelled</code>, <code>Complete</code>,
     * <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     */
    private String status;

    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         Limits the returned queries to only those for the specified log
     *         group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            Limits the returned queries to only those for the specified
     *            log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * Limits the returned queries to only those for the specified log group.
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
     *            Limits the returned queries to only those for the specified
     *            log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueriesRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status.
     * Valid values are <code>Cancelled</code>, <code>Complete</code>,
     * <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @return <p>
     *         Limits the returned queries to only those that have the specified
     *         status. Valid values are <code>Cancelled</code>,
     *         <code>Complete</code>, <code>Failed</code>, <code>Running</code>,
     *         and <code>Scheduled</code>.
     *         </p>
     * @see QueryStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status.
     * Valid values are <code>Cancelled</code>, <code>Complete</code>,
     * <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            Limits the returned queries to only those that have the
     *            specified status. Valid values are <code>Cancelled</code>,
     *            <code>Complete</code>, <code>Failed</code>,
     *            <code>Running</code>, and <code>Scheduled</code>.
     *            </p>
     * @see QueryStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status.
     * Valid values are <code>Cancelled</code>, <code>Complete</code>,
     * <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            Limits the returned queries to only those that have the
     *            specified status. Valid values are <code>Cancelled</code>,
     *            <code>Complete</code>, <code>Failed</code>,
     *            <code>Running</code>, and <code>Scheduled</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryStatus
     */
    public DescribeQueriesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status.
     * Valid values are <code>Cancelled</code>, <code>Complete</code>,
     * <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            Limits the returned queries to only those that have the
     *            specified status. Valid values are <code>Cancelled</code>,
     *            <code>Complete</code>, <code>Failed</code>,
     *            <code>Running</code>, and <code>Scheduled</code>.
     *            </p>
     * @see QueryStatus
     */
    public void setStatus(QueryStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Limits the returned queries to only those that have the specified status.
     * Valid values are <code>Cancelled</code>, <code>Complete</code>,
     * <code>Failed</code>, <code>Running</code>, and <code>Scheduled</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            Limits the returned queries to only those that have the
     *            specified status. Valid values are <code>Cancelled</code>,
     *            <code>Complete</code>, <code>Failed</code>,
     *            <code>Running</code>, and <code>Scheduled</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryStatus
     */
    public DescribeQueriesRequest withStatus(QueryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Limits the number of returned queries to the specified number.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            Limits the number of returned queries to the specified number.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits the number of returned queries to the specified number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            Limits the number of returned queries to the specified number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueriesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. The token expires
     *         after 24 hours.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeQueriesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQueriesRequest == false)
            return false;
        DescribeQueriesRequest other = (DescribeQueriesRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
