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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Lists all of the secrets that are stored by Secrets Manager in the AWS account. To list the versions currently stored for a specific secret, use <a>ListSecretVersionIds</a>. The encrypted fields <code>SecretString</code> and <code>SecretBinary</code> are not included in the output. To get that information, call the <a>GetSecretValue</a> operation.</p> <note> <p>Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations. These operations can occasionally return an empty or shorter than expected list of results even when there more results become available. When this happens, the <code>NextToken</code> response parameter contains a value to pass to the next call to the same API to request the next part of the list.</p> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:ListSecrets</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To list the versions attached to a secret, use <a>ListSecretVersionIds</a>.</p> </li> </ul>
 */
public class ListSecretsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>Lists the secret request filters.</p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>Lists secrets in the requested order. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, desc
     */
    private String sortOrder;

    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param nextToken <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param nextToken <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>Lists the secret request filters.</p>
     *
     * @return <p>Lists the secret request filters.</p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>Lists the secret request filters.</p>
     *
     * @param filters <p>Lists the secret request filters.</p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>Lists the secret request filters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>Lists the secret request filters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>Lists the secret request filters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>Lists the secret request filters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>Lists secrets in the requested order. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, desc
     *
     * @return <p>Lists secrets in the requested order. </p>
     *
     * @see SortOrderType
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>Lists secrets in the requested order. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, desc
     *
     * @param sortOrder <p>Lists secrets in the requested order. </p>
     *
     * @see SortOrderType
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>Lists secrets in the requested order. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, desc
     *
     * @param sortOrder <p>Lists secrets in the requested order. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SortOrderType
     */
    public ListSecretsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>Lists secrets in the requested order. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, desc
     *
     * @param sortOrder <p>Lists secrets in the requested order. </p>
     *
     * @see SortOrderType
     */
    public void setSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>Lists secrets in the requested order. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>asc, desc
     *
     * @param sortOrder <p>Lists secrets in the requested order. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SortOrderType
     */
    public ListSecretsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getSortOrder() != null) sb.append("SortOrder: " + getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListSecretsRequest == false) return false;
        ListSecretsRequest other = (ListSecretsRequest)obj;

        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null) return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false) return false;
        return true;
    }
}
