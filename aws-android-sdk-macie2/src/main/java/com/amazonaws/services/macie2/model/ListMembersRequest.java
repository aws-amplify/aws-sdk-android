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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about the accounts that are associated with an Amazon
 * Macie master account.
 * </p>
 */
public class ListMembersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status
     * of an account's relationship with the master account. By default, the
     * response includes only current member accounts. To include all accounts,
     * set the value for this parameter to false.
     * </p>
     */
    private String onlyAssociated;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @return <p>
     *         The maximum number of items to include in each page of a
     *         paginated response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to include in each page of a
     *            paginated response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to include in each page of a
     *            paginated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     *
     * @return <p>
     *         The nextToken string that specifies which page of results to
     *         return in a paginated response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     *
     * @param nextToken <p>
     *            The nextToken string that specifies which page of results to
     *            return in a paginated response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The nextToken string that specifies which page of results to
     *            return in a paginated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status
     * of an account's relationship with the master account. By default, the
     * response includes only current member accounts. To include all accounts,
     * set the value for this parameter to false.
     * </p>
     *
     * @return <p>
     *         Specifies which accounts to include in the response, based on the
     *         status of an account's relationship with the master account. By
     *         default, the response includes only current member accounts. To
     *         include all accounts, set the value for this parameter to false.
     *         </p>
     */
    public String getOnlyAssociated() {
        return onlyAssociated;
    }

    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status
     * of an account's relationship with the master account. By default, the
     * response includes only current member accounts. To include all accounts,
     * set the value for this parameter to false.
     * </p>
     *
     * @param onlyAssociated <p>
     *            Specifies which accounts to include in the response, based on
     *            the status of an account's relationship with the master
     *            account. By default, the response includes only current member
     *            accounts. To include all accounts, set the value for this
     *            parameter to false.
     *            </p>
     */
    public void setOnlyAssociated(String onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
    }

    /**
     * <p>
     * Specifies which accounts to include in the response, based on the status
     * of an account's relationship with the master account. By default, the
     * response includes only current member accounts. To include all accounts,
     * set the value for this parameter to false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onlyAssociated <p>
     *            Specifies which accounts to include in the response, based on
     *            the status of an account's relationship with the master
     *            account. By default, the response includes only current member
     *            accounts. To include all accounts, set the value for this
     *            parameter to false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withOnlyAssociated(String onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
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
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getOnlyAssociated() != null)
            sb.append("onlyAssociated: " + getOnlyAssociated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getOnlyAssociated() == null) ? 0 : getOnlyAssociated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMembersRequest == false)
            return false;
        ListMembersRequest other = (ListMembersRequest) obj;

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
        if (other.getOnlyAssociated() == null ^ this.getOnlyAssociated() == null)
            return false;
        if (other.getOnlyAssociated() != null
                && other.getOnlyAssociated().equals(this.getOnlyAssociated()) == false)
            return false;
        return true;
    }
}
