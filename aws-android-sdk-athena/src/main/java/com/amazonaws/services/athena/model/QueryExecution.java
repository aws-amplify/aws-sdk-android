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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a single instance of a query execution.
 * </p>
 */
public class QueryExecution implements Serializable {
    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     */
    private String queryExecutionId;

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     */
    private String query;

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL
     * query statements. <code>DML</code> indicates DML (Data Manipulation
     * Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML,
     * such as <code>SHOW CREATE TABLE</code>, or
     * <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DDL, DML, UTILITY
     */
    private String statementType;

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the
     * encryption option, if any, used for query results. These are known as
     * "client-side settings". If workgroup settings override client-side
     * settings, then the query uses the location for the query results and the
     * encryption configuration that are specified for the workgroup.
     * </p>
     */
    private ResultConfiguration resultConfiguration;

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     */
    private QueryExecutionContext queryExecutionContext;

    /**
     * <p>
     * The completion date, current state, submission time, and state change
     * reason (if applicable) for the query execution.
     * </p>
     */
    private QueryExecutionStatus status;

    /**
     * <p>
     * Query execution statistics, such as the amount of data scanned, the
     * amount of time that the query took to process, and the type of statement
     * that was run.
     * </p>
     */
    private QueryExecutionStatistics statistics;

    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     */
    private String workGroup;

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     *
     * @return <p>
     *         The unique identifier for each query execution.
     *         </p>
     */
    public String getQueryExecutionId() {
        return queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     *
     * @param queryExecutionId <p>
     *            The unique identifier for each query execution.
     *            </p>
     */
    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionId <p>
     *            The unique identifier for each query execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecution withQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
        return this;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @return <p>
     *         The SQL query statements which the query execution ran.
     *         </p>
     */
    public String getQuery() {
        return query;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param query <p>
     *            The SQL query statements which the query execution ran.
     *            </p>
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param query <p>
     *            The SQL query statements which the query execution ran.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecution withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL
     * query statements. <code>DML</code> indicates DML (Data Manipulation
     * Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML,
     * such as <code>SHOW CREATE TABLE</code>, or
     * <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DDL, DML, UTILITY
     *
     * @return <p>
     *         The type of query statement that was run. <code>DDL</code>
     *         indicates DDL query statements. <code>DML</code> indicates DML
     *         (Data Manipulation Language) query statements, such as
     *         <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code>
     *         indicates query statements other than DDL and DML, such as
     *         <code>SHOW CREATE TABLE</code>, or
     *         <code>DESCRIBE &lt;table&gt;</code>.
     *         </p>
     * @see StatementType
     */
    public String getStatementType() {
        return statementType;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL
     * query statements. <code>DML</code> indicates DML (Data Manipulation
     * Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML,
     * such as <code>SHOW CREATE TABLE</code>, or
     * <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DDL, DML, UTILITY
     *
     * @param statementType <p>
     *            The type of query statement that was run. <code>DDL</code>
     *            indicates DDL query statements. <code>DML</code> indicates DML
     *            (Data Manipulation Language) query statements, such as
     *            <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code>
     *            indicates query statements other than DDL and DML, such as
     *            <code>SHOW CREATE TABLE</code>, or
     *            <code>DESCRIBE &lt;table&gt;</code>.
     *            </p>
     * @see StatementType
     */
    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL
     * query statements. <code>DML</code> indicates DML (Data Manipulation
     * Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML,
     * such as <code>SHOW CREATE TABLE</code>, or
     * <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DDL, DML, UTILITY
     *
     * @param statementType <p>
     *            The type of query statement that was run. <code>DDL</code>
     *            indicates DDL query statements. <code>DML</code> indicates DML
     *            (Data Manipulation Language) query statements, such as
     *            <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code>
     *            indicates query statements other than DDL and DML, such as
     *            <code>SHOW CREATE TABLE</code>, or
     *            <code>DESCRIBE &lt;table&gt;</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatementType
     */
    public QueryExecution withStatementType(String statementType) {
        this.statementType = statementType;
        return this;
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL
     * query statements. <code>DML</code> indicates DML (Data Manipulation
     * Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML,
     * such as <code>SHOW CREATE TABLE</code>, or
     * <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DDL, DML, UTILITY
     *
     * @param statementType <p>
     *            The type of query statement that was run. <code>DDL</code>
     *            indicates DDL query statements. <code>DML</code> indicates DML
     *            (Data Manipulation Language) query statements, such as
     *            <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code>
     *            indicates query statements other than DDL and DML, such as
     *            <code>SHOW CREATE TABLE</code>, or
     *            <code>DESCRIBE &lt;table&gt;</code>.
     *            </p>
     * @see StatementType
     */
    public void setStatementType(StatementType statementType) {
        this.statementType = statementType.toString();
    }

    /**
     * <p>
     * The type of query statement that was run. <code>DDL</code> indicates DDL
     * query statements. <code>DML</code> indicates DML (Data Manipulation
     * Language) query statements, such as <code>CREATE TABLE AS SELECT</code>.
     * <code>UTILITY</code> indicates query statements other than DDL and DML,
     * such as <code>SHOW CREATE TABLE</code>, or
     * <code>DESCRIBE &lt;table&gt;</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DDL, DML, UTILITY
     *
     * @param statementType <p>
     *            The type of query statement that was run. <code>DDL</code>
     *            indicates DDL query statements. <code>DML</code> indicates DML
     *            (Data Manipulation Language) query statements, such as
     *            <code>CREATE TABLE AS SELECT</code>. <code>UTILITY</code>
     *            indicates query statements other than DDL and DML, such as
     *            <code>SHOW CREATE TABLE</code>, or
     *            <code>DESCRIBE &lt;table&gt;</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatementType
     */
    public QueryExecution withStatementType(StatementType statementType) {
        this.statementType = statementType.toString();
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the
     * encryption option, if any, used for query results. These are known as
     * "client-side settings". If workgroup settings override client-side
     * settings, then the query uses the location for the query results and the
     * encryption configuration that are specified for the workgroup.
     * </p>
     *
     * @return <p>
     *         The location in Amazon S3 where query results were stored and the
     *         encryption option, if any, used for query results. These are
     *         known as "client-side settings". If workgroup settings override
     *         client-side settings, then the query uses the location for the
     *         query results and the encryption configuration that are specified
     *         for the workgroup.
     *         </p>
     */
    public ResultConfiguration getResultConfiguration() {
        return resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the
     * encryption option, if any, used for query results. These are known as
     * "client-side settings". If workgroup settings override client-side
     * settings, then the query uses the location for the query results and the
     * encryption configuration that are specified for the workgroup.
     * </p>
     *
     * @param resultConfiguration <p>
     *            The location in Amazon S3 where query results were stored and
     *            the encryption option, if any, used for query results. These
     *            are known as "client-side settings". If workgroup settings
     *            override client-side settings, then the query uses the
     *            location for the query results and the encryption
     *            configuration that are specified for the workgroup.
     *            </p>
     */
    public void setResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the
     * encryption option, if any, used for query results. These are known as
     * "client-side settings". If workgroup settings override client-side
     * settings, then the query uses the location for the query results and the
     * encryption configuration that are specified for the workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultConfiguration <p>
     *            The location in Amazon S3 where query results were stored and
     *            the encryption option, if any, used for query results. These
     *            are known as "client-side settings". If workgroup settings
     *            override client-side settings, then the query uses the
     *            location for the query results and the encryption
     *            configuration that are specified for the workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecution withResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
        return this;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     *
     * @return <p>
     *         The database in which the query execution occurred.
     *         </p>
     */
    public QueryExecutionContext getQueryExecutionContext() {
        return queryExecutionContext;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     *
     * @param queryExecutionContext <p>
     *            The database in which the query execution occurred.
     *            </p>
     */
    public void setQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        this.queryExecutionContext = queryExecutionContext;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionContext <p>
     *            The database in which the query execution occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecution withQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        this.queryExecutionContext = queryExecutionContext;
        return this;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change
     * reason (if applicable) for the query execution.
     * </p>
     *
     * @return <p>
     *         The completion date, current state, submission time, and state
     *         change reason (if applicable) for the query execution.
     *         </p>
     */
    public QueryExecutionStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change
     * reason (if applicable) for the query execution.
     * </p>
     *
     * @param status <p>
     *            The completion date, current state, submission time, and state
     *            change reason (if applicable) for the query execution.
     *            </p>
     */
    public void setStatus(QueryExecutionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change
     * reason (if applicable) for the query execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The completion date, current state, submission time, and state
     *            change reason (if applicable) for the query execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecution withStatus(QueryExecutionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Query execution statistics, such as the amount of data scanned, the
     * amount of time that the query took to process, and the type of statement
     * that was run.
     * </p>
     *
     * @return <p>
     *         Query execution statistics, such as the amount of data scanned,
     *         the amount of time that the query took to process, and the type
     *         of statement that was run.
     *         </p>
     */
    public QueryExecutionStatistics getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * Query execution statistics, such as the amount of data scanned, the
     * amount of time that the query took to process, and the type of statement
     * that was run.
     * </p>
     *
     * @param statistics <p>
     *            Query execution statistics, such as the amount of data
     *            scanned, the amount of time that the query took to process,
     *            and the type of statement that was run.
     *            </p>
     */
    public void setStatistics(QueryExecutionStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Query execution statistics, such as the amount of data scanned, the
     * amount of time that the query took to process, and the type of statement
     * that was run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            Query execution statistics, such as the amount of data
     *            scanned, the amount of time that the query took to process,
     *            and the type of statement that was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecution withStatistics(QueryExecutionStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @return <p>
     *         The name of the workgroup in which the query ran.
     *         </p>
     */
    public String getWorkGroup() {
        return workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The name of the workgroup in which the query ran.
     *            </p>
     */
    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query ran.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The name of the workgroup in which the query ran.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecution withWorkGroup(String workGroup) {
        this.workGroup = workGroup;
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: " + getQueryExecutionId() + ",");
        if (getQuery() != null)
            sb.append("Query: " + getQuery() + ",");
        if (getStatementType() != null)
            sb.append("StatementType: " + getStatementType() + ",");
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: " + getResultConfiguration() + ",");
        if (getQueryExecutionContext() != null)
            sb.append("QueryExecutionContext: " + getQueryExecutionContext() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatistics() != null)
            sb.append("Statistics: " + getStatistics() + ",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: " + getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode
                + ((getStatementType() == null) ? 0 : getStatementType().hashCode());
        hashCode = prime * hashCode
                + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueryExecutionContext() == null) ? 0 : getQueryExecutionContext().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecution == false)
            return false;
        QueryExecution other = (QueryExecution) obj;

        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null
                && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getStatementType() == null ^ this.getStatementType() == null)
            return false;
        if (other.getStatementType() != null
                && other.getStatementType().equals(this.getStatementType()) == false)
            return false;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null
                && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getQueryExecutionContext() == null ^ this.getQueryExecutionContext() == null)
            return false;
        if (other.getQueryExecutionContext() != null
                && other.getQueryExecutionContext().equals(this.getQueryExecutionContext()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null
                && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null
                && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }
}
