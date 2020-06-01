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
 * Creates a named query in the specified workgroup. Requires that you have
 * access to the workgroup.
 * </p>
 * <p>
 * For code samples using the AWS SDK for Java, see <a
 * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples
 * and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
 * </p>
 */
public class CreateNamedQueryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The query name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The query description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String database;

    /**
     * <p>
     * The contents of the query with all query statements.
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
     * <code>CreateNamedQuery</code> request is received, the same response is
     * returned and another query is not created. If a parameter has changed,
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
     * The name of the workgroup in which the named query is being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     */
    private String workGroup;

    /**
     * <p>
     * The query name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The query name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The query name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The query name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The query name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The query name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNamedQueryRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The query description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The query description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The query description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNamedQueryRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The database to which the query belongs.
     *         </p>
     */
    public String getDatabase() {
        return database;
    }

    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param database <p>
     *            The database to which the query belongs.
     *            </p>
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param database <p>
     *            The database to which the query belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNamedQueryRequest withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @return <p>
     *         The contents of the query with all query statements.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param queryString <p>
     *            The contents of the query with all query statements.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 262144<br/>
     *
     * @param queryString <p>
     *            The contents of the query with all query statements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNamedQueryRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the
     * query is idempotent (executes only once). If another
     * <code>CreateNamedQuery</code> request is received, the same response is
     * returned and another query is not created. If a parameter has changed,
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
     *         <code>CreateNamedQuery</code> request is received, the same
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
     * <code>CreateNamedQuery</code> request is received, the same response is
     * returned and another query is not created. If a parameter has changed,
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
     *            another <code>CreateNamedQuery</code> request is received, the
     *            same response is returned and another query is not created. If
     *            a parameter has changed, for example, the
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
     * <code>CreateNamedQuery</code> request is received, the same response is
     * returned and another query is not created. If a parameter has changed,
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
     *            another <code>CreateNamedQuery</code> request is received, the
     *            same response is returned and another query is not created. If
     *            a parameter has changed, for example, the
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
    public CreateNamedQueryRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The name of the workgroup in which the named query is being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @return <p>
     *         The name of the workgroup in which the named query is being
     *         created.
     *         </p>
     */
    public String getWorkGroup() {
        return workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the named query is being created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The name of the workgroup in which the named query is being
     *            created.
     *            </p>
     */
    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the named query is being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The name of the workgroup in which the named query is being
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNamedQueryRequest withWorkGroup(String workGroup) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDatabase() != null)
            sb.append("Database: " + getDatabase() + ",");
        if (getQueryString() != null)
            sb.append("QueryString: " + getQueryString() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: " + getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNamedQueryRequest == false)
            return false;
        CreateNamedQueryRequest other = (CreateNamedQueryRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
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
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null
                && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }
}
