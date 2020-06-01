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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Runs the SQL query statements contained in the <code>Query</code>. Requires
 * you to have access to the workgroup in which the query ran. Running queries
 * against an external catalog requires <a>GetDataCatalog</a> permission to the
 * catalog. For code samples using the AWS SDK for Java, see <a
 * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples
 * and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
 * </p>
 */
public class StartQueryExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     */
    private String queryString;

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the
     * query is idempotent (executes only once). If another
     * <code>StartQueryExecution</code> request is received, the same response
     * is returned and another query is not created. If a parameter has changed,
     * for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the
     * AWS SDK for Java) auto-generate the token for users. If you are not using
     * the AWS SDK or the AWS CLI, you must provide this token or the action
     * will fail.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 128<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The database within which the query executes.
     * </p>
     */
    private QueryExecutionContext queryExecutionContext;

    /**
     * <p>
     * Specifies information about where and how to save the results of the
     * query execution. If the query runs in a workgroup, then workgroup's
     * settings may override query settings. This affects the query results
     * location. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private ResultConfiguration resultConfiguration;

    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     */
    private String workGroup;

    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @return <p>
     *         The SQL query statements to be executed.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param queryString <p>
     *            The SQL query statements to be executed.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param queryString <p>
     *            The SQL query statements to be executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryExecutionRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the
     * query is idempotent (executes only once). If another
     * <code>StartQueryExecution</code> request is received, the same response
     * is returned and another query is not created. If a parameter has changed,
     * for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the
     * AWS SDK for Java) auto-generate the token for users. If you are not using
     * the AWS SDK or the AWS CLI, you must provide this token or the action
     * will fail.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 128<br/>
     *
     * @return <p>
     *         A unique case-sensitive string used to ensure the request to
     *         create the query is idempotent (executes only once). If another
     *         <code>StartQueryExecution</code> request is received, the same
     *         response is returned and another query is not created. If a
     *         parameter has changed, for example, the <code>QueryString</code>,
     *         an error is returned.
     *         </p>
     *         <important>
     *         <p>
     *         This token is listed as not required because AWS SDKs (for
     *         example the AWS SDK for Java) auto-generate the token for users.
     *         If you are not using the AWS SDK or the AWS CLI, you must provide
     *         this token or the action will fail.
     *         </p>
     *         </important>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the
     * query is idempotent (executes only once). If another
     * <code>StartQueryExecution</code> request is received, the same response
     * is returned and another query is not created. If a parameter has changed,
     * for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the
     * AWS SDK for Java) auto-generate the token for users. If you are not using
     * the AWS SDK or the AWS CLI, you must provide this token or the action
     * will fail.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 128<br/>
     *
     * @param clientRequestToken <p>
     *            A unique case-sensitive string used to ensure the request to
     *            create the query is idempotent (executes only once). If
     *            another <code>StartQueryExecution</code> request is received,
     *            the same response is returned and another query is not
     *            created. If a parameter has changed, for example, the
     *            <code>QueryString</code>, an error is returned.
     *            </p>
     *            <important>
     *            <p>
     *            This token is listed as not required because AWS SDKs (for
     *            example the AWS SDK for Java) auto-generate the token for
     *            users. If you are not using the AWS SDK or the AWS CLI, you
     *            must provide this token or the action will fail.
     *            </p>
     *            </important>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the
     * query is idempotent (executes only once). If another
     * <code>StartQueryExecution</code> request is received, the same response
     * is returned and another query is not created. If a parameter has changed,
     * for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the
     * AWS SDK for Java) auto-generate the token for users. If you are not using
     * the AWS SDK or the AWS CLI, you must provide this token or the action
     * will fail.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 128<br/>
     *
     * @param clientRequestToken <p>
     *            A unique case-sensitive string used to ensure the request to
     *            create the query is idempotent (executes only once). If
     *            another <code>StartQueryExecution</code> request is received,
     *            the same response is returned and another query is not
     *            created. If a parameter has changed, for example, the
     *            <code>QueryString</code>, an error is returned.
     *            </p>
     *            <important>
     *            <p>
     *            This token is listed as not required because AWS SDKs (for
     *            example the AWS SDK for Java) auto-generate the token for
     *            users. If you are not using the AWS SDK or the AWS CLI, you
     *            must provide this token or the action will fail.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryExecutionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The database within which the query executes.
     * </p>
     *
     * @return <p>
     *         The database within which the query executes.
     *         </p>
     */
    public QueryExecutionContext getQueryExecutionContext() {
        return queryExecutionContext;
    }

    /**
     * <p>
     * The database within which the query executes.
     * </p>
     *
     * @param queryExecutionContext <p>
     *            The database within which the query executes.
     *            </p>
     */
    public void setQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        this.queryExecutionContext = queryExecutionContext;
    }

    /**
     * <p>
     * The database within which the query executes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionContext <p>
     *            The database within which the query executes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryExecutionRequest withQueryExecutionContext(
            QueryExecutionContext queryExecutionContext) {
        this.queryExecutionContext = queryExecutionContext;
        return this;
    }

    /**
     * <p>
     * Specifies information about where and how to save the results of the
     * query execution. If the query runs in a workgroup, then workgroup's
     * settings may override query settings. This affects the query results
     * location. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @return <p>
     *         Specifies information about where and how to save the results of
     *         the query execution. If the query runs in a workgroup, then
     *         workgroup's settings may override query settings. This affects
     *         the query results location. The workgroup settings override is
     *         specified in EnforceWorkGroupConfiguration (true/false) in the
     *         WorkGroupConfiguration. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *         </p>
     */
    public ResultConfiguration getResultConfiguration() {
        return resultConfiguration;
    }

    /**
     * <p>
     * Specifies information about where and how to save the results of the
     * query execution. If the query runs in a workgroup, then workgroup's
     * settings may override query settings. This affects the query results
     * location. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @param resultConfiguration <p>
     *            Specifies information about where and how to save the results
     *            of the query execution. If the query runs in a workgroup, then
     *            workgroup's settings may override query settings. This affects
     *            the query results location. The workgroup settings override is
     *            specified in EnforceWorkGroupConfiguration (true/false) in the
     *            WorkGroupConfiguration. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     */
    public void setResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * Specifies information about where and how to save the results of the
     * query execution. If the query runs in a workgroup, then workgroup's
     * settings may override query settings. This affects the query results
     * location. The workgroup settings override is specified in
     * EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration.
     * See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultConfiguration <p>
     *            Specifies information about where and how to save the results
     *            of the query execution. If the query runs in a workgroup, then
     *            workgroup's settings may override query settings. This affects
     *            the query results location. The workgroup settings override is
     *            specified in EnforceWorkGroupConfiguration (true/false) in the
     *            WorkGroupConfiguration. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryExecutionRequest withResultConfiguration(
            ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
        return this;
    }

    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @return <p>
     *         The name of the workgroup in which the query is being started.
     *         </p>
     */
    public String getWorkGroup() {
        return workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The name of the workgroup in which the query is being started.
     *            </p>
     */
    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The name of the workgroup in which the query is being started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartQueryExecutionRequest withWorkGroup(String workGroup) {
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
        if (getQueryString() != null)
            sb.append("QueryString: " + getQueryString() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getQueryExecutionContext() != null)
            sb.append("QueryExecutionContext: " + getQueryExecutionContext() + ",");
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: " + getResultConfiguration() + ",");
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
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueryExecutionContext() == null) ? 0 : getQueryExecutionContext().hashCode());
        hashCode = prime * hashCode
                + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryExecutionRequest == false)
            return false;
        StartQueryExecutionRequest other = (StartQueryExecutionRequest) obj;

        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getQueryExecutionContext() == null ^ this.getQueryExecutionContext() == null)
            return false;
        if (other.getQueryExecutionContext() != null
                && other.getQueryExecutionContext().equals(this.getQueryExecutionContext()) == false)
            return false;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null
                && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null
                && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }
}
