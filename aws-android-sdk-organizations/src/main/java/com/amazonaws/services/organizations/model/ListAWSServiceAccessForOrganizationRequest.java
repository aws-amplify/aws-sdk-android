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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of the AWS services that you enabled to integrate with your
 * organization. After a service on this list creates the resources that it
 * requires for the integration, it can perform operations on your organization
 * and its accounts.
 * </p>
 * <p>
 * For more information about integrating other services with AWS Organizations,
 * including the list of services that currently work with Organizations, see <a
 * href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html"
 * >Integrating AWS Organizations with Other AWS Services</a> in the <i>AWS
 * Organizations User Guide.</i>
 * </p>
 * <p>
 * This operation can be called only from the organization's master account or
 * by a member account that is a delegated administrator for an AWS service.
 * </p>
 */
public class ListAWSServiceAccessForOrganizationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     *
     * @return <p>
     *         The parameter for receiving additional results if you receive a
     *         <code>NextToken</code> response in a previous request. A
     *         <code>NextToken</code> response indicates that more output is
     *         available. Set this parameter to the value of the previous call's
     *         <code>NextToken</code> response to indicate where the output
     *         should continue from.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     *
     * @param nextToken <p>
     *            The parameter for receiving additional results if you receive
     *            a <code>NextToken</code> response in a previous request. A
     *            <code>NextToken</code> response indicates that more output is
     *            available. Set this parameter to the value of the previous
     *            call's <code>NextToken</code> response to indicate where the
     *            output should continue from.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The parameter for receiving additional results if you receive
     *            a <code>NextToken</code> response in a previous request. A
     *            <code>NextToken</code> response indicates that more output is
     *            available. Set this parameter to the value of the previous
     *            call's <code>NextToken</code> response to indicate where the
     *            output should continue from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAWSServiceAccessForOrganizationRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return <p>
     *         The total number of results that you want included on each page
     *         of the response. If you do not include this parameter, it
     *         defaults to a value that is specific to the operation. If
     *         additional items exist beyond the maximum you specify, the
     *         <code>NextToken</code> response element is present and has a
     *         value (is not null). Include that value as the
     *         <code>NextToken</code> request parameter in the next call to the
     *         operation to get the next part of the results. Note that
     *         Organizations might return fewer results than the maximum even
     *         when there are more results available. You should check
     *         <code>NextToken</code> after every operation to ensure that you
     *         receive all of the results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            The total number of results that you want included on each
     *            page of the response. If you do not include this parameter, it
     *            defaults to a value that is specific to the operation. If
     *            additional items exist beyond the maximum you specify, the
     *            <code>NextToken</code> response element is present and has a
     *            value (is not null). Include that value as the
     *            <code>NextToken</code> request parameter in the next call to
     *            the operation to get the next part of the results. Note that
     *            Organizations might return fewer results than the maximum even
     *            when there are more results available. You should check
     *            <code>NextToken</code> after every operation to ensure that
     *            you receive all of the results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            The total number of results that you want included on each
     *            page of the response. If you do not include this parameter, it
     *            defaults to a value that is specific to the operation. If
     *            additional items exist beyond the maximum you specify, the
     *            <code>NextToken</code> response element is present and has a
     *            value (is not null). Include that value as the
     *            <code>NextToken</code> request parameter in the next call to
     *            the operation to get the next part of the results. Note that
     *            Organizations might return fewer results than the maximum even
     *            when there are more results available. You should check
     *            <code>NextToken</code> after every operation to ensure that
     *            you receive all of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAWSServiceAccessForOrganizationRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListAWSServiceAccessForOrganizationRequest == false)
            return false;
        ListAWSServiceAccessForOrganizationRequest other = (ListAWSServiceAccessForOrganizationRequest) obj;

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
