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

public class GetQueryResultsResult implements Serializable {
    /**
     * <p>
     * The log events that matched the query criteria during the most recent
     * time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is
     * one object in the top-level array. Each of these log event objects is an
     * array of <code>field</code>/<code>value</code> pairs.
     * </p>
     */
    private java.util.List<java.util.List<ResultField>> results;

    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log
     * events that matched the query criteria, and the total number of bytes in
     * the log events that were scanned.
     * </p>
     */
    private QueryStatistics statistics;

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are
     * <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, <code>Timeout</code>, and
     * <code>Unknown</code>.
     * </p>
     * <p>
     * Queries time out after 15 minutes of execution. To avoid having your
     * queries time out, reduce the time range being searched, or partition your
     * query into a number of queries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     */
    private String status;

    /**
     * <p>
     * The log events that matched the query criteria during the most recent
     * time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is
     * one object in the top-level array. Each of these log event objects is an
     * array of <code>field</code>/<code>value</code> pairs.
     * </p>
     *
     * @return <p>
     *         The log events that matched the query criteria during the most
     *         recent time it ran.
     *         </p>
     *         <p>
     *         The <code>results</code> value is an array of arrays. Each log
     *         event is one object in the top-level array. Each of these log
     *         event objects is an array of <code>field</code>/
     *         <code>value</code> pairs.
     *         </p>
     */
    public java.util.List<java.util.List<ResultField>> getResults() {
        return results;
    }

    /**
     * <p>
     * The log events that matched the query criteria during the most recent
     * time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is
     * one object in the top-level array. Each of these log event objects is an
     * array of <code>field</code>/<code>value</code> pairs.
     * </p>
     *
     * @param results <p>
     *            The log events that matched the query criteria during the most
     *            recent time it ran.
     *            </p>
     *            <p>
     *            The <code>results</code> value is an array of arrays. Each log
     *            event is one object in the top-level array. Each of these log
     *            event objects is an array of <code>field</code>/
     *            <code>value</code> pairs.
     *            </p>
     */
    public void setResults(java.util.Collection<java.util.List<ResultField>> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<java.util.List<ResultField>>(results);
    }

    /**
     * <p>
     * The log events that matched the query criteria during the most recent
     * time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is
     * one object in the top-level array. Each of these log event objects is an
     * array of <code>field</code>/<code>value</code> pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            The log events that matched the query criteria during the most
     *            recent time it ran.
     *            </p>
     *            <p>
     *            The <code>results</code> value is an array of arrays. Each log
     *            event is one object in the top-level array. Each of these log
     *            event objects is an array of <code>field</code>/
     *            <code>value</code> pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueryResultsResult withResults(java.util.List<ResultField>... results) {
        if (getResults() == null) {
            this.results = new java.util.ArrayList<java.util.List<ResultField>>(results.length);
        }
        for (java.util.List<ResultField> value : results) {
            this.results.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The log events that matched the query criteria during the most recent
     * time it ran.
     * </p>
     * <p>
     * The <code>results</code> value is an array of arrays. Each log event is
     * one object in the top-level array. Each of these log event objects is an
     * array of <code>field</code>/<code>value</code> pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            The log events that matched the query criteria during the most
     *            recent time it ran.
     *            </p>
     *            <p>
     *            The <code>results</code> value is an array of arrays. Each log
     *            event is one object in the top-level array. Each of these log
     *            event objects is an array of <code>field</code>/
     *            <code>value</code> pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueryResultsResult withResults(
            java.util.Collection<java.util.List<ResultField>> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log
     * events that matched the query criteria, and the total number of bytes in
     * the log events that were scanned.
     * </p>
     *
     * @return <p>
     *         Includes the number of log events scanned by the query, the
     *         number of log events that matched the query criteria, and the
     *         total number of bytes in the log events that were scanned.
     *         </p>
     */
    public QueryStatistics getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log
     * events that matched the query criteria, and the total number of bytes in
     * the log events that were scanned.
     * </p>
     *
     * @param statistics <p>
     *            Includes the number of log events scanned by the query, the
     *            number of log events that matched the query criteria, and the
     *            total number of bytes in the log events that were scanned.
     *            </p>
     */
    public void setStatistics(QueryStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Includes the number of log events scanned by the query, the number of log
     * events that matched the query criteria, and the total number of bytes in
     * the log events that were scanned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            Includes the number of log events scanned by the query, the
     *            number of log events that matched the query criteria, and the
     *            total number of bytes in the log events that were scanned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueryResultsResult withStatistics(QueryStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are
     * <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, <code>Timeout</code>, and
     * <code>Unknown</code>.
     * </p>
     * <p>
     * Queries time out after 15 minutes of execution. To avoid having your
     * queries time out, reduce the time range being searched, or partition your
     * query into a number of queries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @return <p>
     *         The status of the most recent running of the query. Possible
     *         values are <code>Cancelled</code>, <code>Complete</code>,
     *         <code>Failed</code>, <code>Running</code>, <code>Scheduled</code>, <code>Timeout</code>, and <code>Unknown</code>.
     *         </p>
     *         <p>
     *         Queries time out after 15 minutes of execution. To avoid having
     *         your queries time out, reduce the time range being searched, or
     *         partition your query into a number of queries.
     *         </p>
     * @see QueryStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are
     * <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, <code>Timeout</code>, and
     * <code>Unknown</code>.
     * </p>
     * <p>
     * Queries time out after 15 minutes of execution. To avoid having your
     * queries time out, reduce the time range being searched, or partition your
     * query into a number of queries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of the most recent running of the query. Possible
     *            values are <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, <code>Timeout</code>, and
     *            <code>Unknown</code>.
     *            </p>
     *            <p>
     *            Queries time out after 15 minutes of execution. To avoid
     *            having your queries time out, reduce the time range being
     *            searched, or partition your query into a number of queries.
     *            </p>
     * @see QueryStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are
     * <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, <code>Timeout</code>, and
     * <code>Unknown</code>.
     * </p>
     * <p>
     * Queries time out after 15 minutes of execution. To avoid having your
     * queries time out, reduce the time range being searched, or partition your
     * query into a number of queries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of the most recent running of the query. Possible
     *            values are <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, <code>Timeout</code>, and
     *            <code>Unknown</code>.
     *            </p>
     *            <p>
     *            Queries time out after 15 minutes of execution. To avoid
     *            having your queries time out, reduce the time range being
     *            searched, or partition your query into a number of queries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryStatus
     */
    public GetQueryResultsResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are
     * <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, <code>Timeout</code>, and
     * <code>Unknown</code>.
     * </p>
     * <p>
     * Queries time out after 15 minutes of execution. To avoid having your
     * queries time out, reduce the time range being searched, or partition your
     * query into a number of queries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of the most recent running of the query. Possible
     *            values are <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, <code>Timeout</code>, and
     *            <code>Unknown</code>.
     *            </p>
     *            <p>
     *            Queries time out after 15 minutes of execution. To avoid
     *            having your queries time out, reduce the time range being
     *            searched, or partition your query into a number of queries.
     *            </p>
     * @see QueryStatus
     */
    public void setStatus(QueryStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the most recent running of the query. Possible values are
     * <code>Cancelled</code>, <code>Complete</code>, <code>Failed</code>,
     * <code>Running</code>, <code>Scheduled</code>, <code>Timeout</code>, and
     * <code>Unknown</code>.
     * </p>
     * <p>
     * Queries time out after 15 minutes of execution. To avoid having your
     * queries time out, reduce the time range being searched, or partition your
     * query into a number of queries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Scheduled, Running, Complete, Failed, Cancelled
     *
     * @param status <p>
     *            The status of the most recent running of the query. Possible
     *            values are <code>Cancelled</code>, <code>Complete</code>,
     *            <code>Failed</code>, <code>Running</code>,
     *            <code>Scheduled</code>, <code>Timeout</code>, and
     *            <code>Unknown</code>.
     *            </p>
     *            <p>
     *            Queries time out after 15 minutes of execution. To avoid
     *            having your queries time out, reduce the time range being
     *            searched, or partition your query into a number of queries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryStatus
     */
    public GetQueryResultsResult withStatus(QueryStatus status) {
        this.status = status.toString();
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
        if (getResults() != null)
            sb.append("results: " + getResults() + ",");
        if (getStatistics() != null)
            sb.append("statistics: " + getStatistics() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryResultsResult == false)
            return false;
        GetQueryResultsResult other = (GetQueryResultsResult) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null
                && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
