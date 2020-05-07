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
 * Returns the results from the specified query.
 * </p>
 * <p>
 * Only the fields requested in the query are returned, along with a
 * <code>@ptr</code> field which is the identifier for the log record. You can
 * use the value of <code>@ptr</code> in a <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetLogRecord.html"
 * >GetLogRecord</a> operation to get the full log record.
 * </p>
 * <p>
 * <code>GetQueryResults</code> does not start a query execution. To run a
 * query, use <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_StartQuery.html"
 * >StartQuery</a>.
 * </p>
 * <p>
 * If the value of the <code>Status</code> field in the output is
 * <code>Running</code>, this operation returns only partial results. If you see
 * a value of <code>Scheduled</code> or <code>Running</code> for the status, you
 * can retry the operation later to see the final results.
 * </p>
 */
public class GetQueryResultsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID number of the query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String queryId;

    /**
     * <p>
     * The ID number of the query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>
     *         The ID number of the query.
     *         </p>
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * <p>
     * The ID number of the query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryId <p>
     *            The ID number of the query.
     *            </p>
     */
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID number of the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryId <p>
     *            The ID number of the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueryResultsRequest withQueryId(String queryId) {
        this.queryId = queryId;
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
            sb.append("queryId: " + getQueryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryResultsRequest == false)
            return false;
        GetQueryResultsRequest other = (GetQueryResultsRequest) obj;

        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        return true;
    }
}
