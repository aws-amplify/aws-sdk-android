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

package com.amazonaws.services.firewallmanagementservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a <code>MemberAccounts</code> object that lists the member accounts
 * in the administrator's AWS organization.
 * </p>
 * <p>
 * The <code>ListMemberAccounts</code> must be submitted by the account that is
 * set as the AWS Firewall Manager administrator.
 * </p>
 */
public class ListMemberAccountsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * account IDs than the number that you specify for <code>MaxResults</code>,
     * AWS Firewall Manager returns a <code>NextToken</code> value in the
     * response that allows you to list another group of IDs. For the second and
     * subsequent <code>ListMemberAccountsRequest</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of member account IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the number of member account IDs that you want AWS Firewall
     * Manager to return for this request. If you have more IDs than the number
     * that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * member account IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * account IDs than the number that you specify for <code>MaxResults</code>,
     * AWS Firewall Manager returns a <code>NextToken</code> value in the
     * response that allows you to list another group of IDs. For the second and
     * subsequent <code>ListMemberAccountsRequest</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of member account IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         If you specify a value for <code>MaxResults</code> and you have
     *         more account IDs than the number that you specify for
     *         <code>MaxResults</code>, AWS Firewall Manager returns a
     *         <code>NextToken</code> value in the response that allows you to
     *         list another group of IDs. For the second and subsequent
     *         <code>ListMemberAccountsRequest</code> requests, specify the
     *         value of <code>NextToken</code> from the previous response to get
     *         information about another batch of member account IDs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * account IDs than the number that you specify for <code>MaxResults</code>,
     * AWS Firewall Manager returns a <code>NextToken</code> value in the
     * response that allows you to list another group of IDs. For the second and
     * subsequent <code>ListMemberAccountsRequest</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of member account IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you specify a value for <code>MaxResults</code> and you
     *            have more account IDs than the number that you specify for
     *            <code>MaxResults</code>, AWS Firewall Manager returns a
     *            <code>NextToken</code> value in the response that allows you
     *            to list another group of IDs. For the second and subsequent
     *            <code>ListMemberAccountsRequest</code> requests, specify the
     *            value of <code>NextToken</code> from the previous response to
     *            get information about another batch of member account IDs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * account IDs than the number that you specify for <code>MaxResults</code>,
     * AWS Firewall Manager returns a <code>NextToken</code> value in the
     * response that allows you to list another group of IDs. For the second and
     * subsequent <code>ListMemberAccountsRequest</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of member account IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you specify a value for <code>MaxResults</code> and you
     *            have more account IDs than the number that you specify for
     *            <code>MaxResults</code>, AWS Firewall Manager returns a
     *            <code>NextToken</code> value in the response that allows you
     *            to list another group of IDs. For the second and subsequent
     *            <code>ListMemberAccountsRequest</code> requests, specify the
     *            value of <code>NextToken</code> from the previous response to
     *            get information about another batch of member account IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMemberAccountsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifies the number of member account IDs that you want AWS Firewall
     * Manager to return for this request. If you have more IDs than the number
     * that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * member account IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specifies the number of member account IDs that you want AWS
     *         Firewall Manager to return for this request. If you have more IDs
     *         than the number that you specify for <code>MaxResults</code>, the
     *         response includes a <code>NextToken</code> value that you can use
     *         to get another batch of member account IDs.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Specifies the number of member account IDs that you want AWS Firewall
     * Manager to return for this request. If you have more IDs than the number
     * that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * member account IDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of member account IDs that you want AWS
     *            Firewall Manager to return for this request. If you have more
     *            IDs than the number that you specify for
     *            <code>MaxResults</code>, the response includes a
     *            <code>NextToken</code> value that you can use to get another
     *            batch of member account IDs.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of member account IDs that you want AWS Firewall
     * Manager to return for this request. If you have more IDs than the number
     * that you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * member account IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of member account IDs that you want AWS
     *            Firewall Manager to return for this request. If you have more
     *            IDs than the number that you specify for
     *            <code>MaxResults</code>, the response includes a
     *            <code>NextToken</code> value that you can use to get another
     *            batch of member account IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMemberAccountsRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListMemberAccountsRequest == false)
            return false;
        ListMemberAccountsRequest other = (ListMemberAccountsRequest) obj;

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
