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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a list of connection definitions from the Data Catalog.
 * </p>
 */
public class GetConnectionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * A filter that controls which connections are returned.
     * </p>
     */
    private GetConnectionsFilter filter;

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     */
    private Boolean hidePassword;

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the Data Catalog in which the connections reside. If
     *         none is provided, the AWS account ID is used by default.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog in which the connections reside. If
     *            none is provided, the AWS account ID is used by default.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is
     * provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog in which the connections reside. If
     *            none is provided, the AWS account ID is used by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * A filter that controls which connections are returned.
     * </p>
     *
     * @return <p>
     *         A filter that controls which connections are returned.
     *         </p>
     */
    public GetConnectionsFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * A filter that controls which connections are returned.
     * </p>
     *
     * @param filter <p>
     *            A filter that controls which connections are returned.
     *            </p>
     */
    public void setFilter(GetConnectionsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter that controls which connections are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A filter that controls which connections are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsRequest withFilter(GetConnectionsFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     *
     * @return <p>
     *         Allows you to retrieve the connection metadata without returning
     *         the password. For instance, the AWS Glue console uses this flag
     *         to retrieve the connection, and does not display the password.
     *         Set this parameter when the caller might not have permission to
     *         use the AWS KMS key to decrypt the password, but it does have
     *         permission to access the rest of the connection properties.
     *         </p>
     */
    public Boolean isHidePassword() {
        return hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     *
     * @return <p>
     *         Allows you to retrieve the connection metadata without returning
     *         the password. For instance, the AWS Glue console uses this flag
     *         to retrieve the connection, and does not display the password.
     *         Set this parameter when the caller might not have permission to
     *         use the AWS KMS key to decrypt the password, but it does have
     *         permission to access the rest of the connection properties.
     *         </p>
     */
    public Boolean getHidePassword() {
        return hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     *
     * @param hidePassword <p>
     *            Allows you to retrieve the connection metadata without
     *            returning the password. For instance, the AWS Glue console
     *            uses this flag to retrieve the connection, and does not
     *            display the password. Set this parameter when the caller might
     *            not have permission to use the AWS KMS key to decrypt the
     *            password, but it does have permission to access the rest of
     *            the connection properties.
     *            </p>
     */
    public void setHidePassword(Boolean hidePassword) {
        this.hidePassword = hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the
     * password. For instance, the AWS Glue console uses this flag to retrieve
     * the connection, and does not display the password. Set this parameter
     * when the caller might not have permission to use the AWS KMS key to
     * decrypt the password, but it does have permission to access the rest of
     * the connection properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hidePassword <p>
     *            Allows you to retrieve the connection metadata without
     *            returning the password. For instance, the AWS Glue console
     *            uses this flag to retrieve the connection, and does not
     *            display the password. Set this parameter when the caller might
     *            not have permission to use the AWS KMS key to decrypt the
     *            password, but it does have permission to access the rest of
     *            the connection properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsRequest withHidePassword(Boolean hidePassword) {
        this.hidePassword = hidePassword;
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     *
     * @return <p>
     *         A continuation token, if this is a continuation call.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if this is a continuation call.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if this is a continuation call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of connections to return in one response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of connections to return in one response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of connections to return in one response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getCatalogId() != null)
            sb.append("CatalogId: " + getCatalogId() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getHidePassword() != null)
            sb.append("HidePassword: " + getHidePassword() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getHidePassword() == null) ? 0 : getHidePassword().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionsRequest == false)
            return false;
        GetConnectionsRequest other = (GetConnectionsRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getHidePassword() == null ^ this.getHidePassword() == null)
            return false;
        if (other.getHidePassword() != null
                && other.getHidePassword().equals(this.getHidePassword()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
