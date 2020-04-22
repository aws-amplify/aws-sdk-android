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
 * Returns an array of <code>PolicyComplianceStatus</code> objects in the
 * response. Use <code>PolicyComplianceStatus</code> to get a summary of which
 * member accounts are protected by the specified policy.
 * </p>
 */
public class ListComplianceStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     */
    private String policyId;

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list
     * another group of <code>PolicyComplianceStatus</code> objects. For the
     * second and subsequent <code>ListComplianceStatus</code> requests, specify
     * the value of <code>NextToken</code> from the previous response to get
     * information about another batch of <code>PolicyComplianceStatus</code>
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that
     * you want AWS Firewall Manager to return for this request. If you have
     * more <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * <code>PolicyComplianceStatus</code> objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @return <p>
     *         The ID of the AWS Firewall Manager policy that you want the
     *         details for.
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @param policyId <p>
     *            The ID of the AWS Firewall Manager policy that you want the
     *            details for.
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy that you want the details for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @param policyId <p>
     *            The ID of the AWS Firewall Manager policy that you want the
     *            details for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceStatusRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list
     * another group of <code>PolicyComplianceStatus</code> objects. For the
     * second and subsequent <code>ListComplianceStatus</code> requests, specify
     * the value of <code>NextToken</code> from the previous response to get
     * information about another batch of <code>PolicyComplianceStatus</code>
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         If you specify a value for <code>MaxResults</code> and you have
     *         more <code>PolicyComplianceStatus</code> objects than the number
     *         that you specify for <code>MaxResults</code>, AWS Firewall
     *         Manager returns a <code>NextToken</code> value in the response
     *         that allows you to list another group of
     *         <code>PolicyComplianceStatus</code> objects. For the second and
     *         subsequent <code>ListComplianceStatus</code> requests, specify
     *         the value of <code>NextToken</code> from the previous response to
     *         get information about another batch of
     *         <code>PolicyComplianceStatus</code> objects.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list
     * another group of <code>PolicyComplianceStatus</code> objects. For the
     * second and subsequent <code>ListComplianceStatus</code> requests, specify
     * the value of <code>NextToken</code> from the previous response to get
     * information about another batch of <code>PolicyComplianceStatus</code>
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you specify a value for <code>MaxResults</code> and you
     *            have more <code>PolicyComplianceStatus</code> objects than the
     *            number that you specify for <code>MaxResults</code>, AWS
     *            Firewall Manager returns a <code>NextToken</code> value in the
     *            response that allows you to list another group of
     *            <code>PolicyComplianceStatus</code> objects. For the second
     *            and subsequent <code>ListComplianceStatus</code> requests,
     *            specify the value of <code>NextToken</code> from the previous
     *            response to get information about another batch of
     *            <code>PolicyComplianceStatus</code> objects.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, AWS Firewall Manager returns a
     * <code>NextToken</code> value in the response that allows you to list
     * another group of <code>PolicyComplianceStatus</code> objects. For the
     * second and subsequent <code>ListComplianceStatus</code> requests, specify
     * the value of <code>NextToken</code> from the previous response to get
     * information about another batch of <code>PolicyComplianceStatus</code>
     * objects.
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
     *            have more <code>PolicyComplianceStatus</code> objects than the
     *            number that you specify for <code>MaxResults</code>, AWS
     *            Firewall Manager returns a <code>NextToken</code> value in the
     *            response that allows you to list another group of
     *            <code>PolicyComplianceStatus</code> objects. For the second
     *            and subsequent <code>ListComplianceStatus</code> requests,
     *            specify the value of <code>NextToken</code> from the previous
     *            response to get information about another batch of
     *            <code>PolicyComplianceStatus</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that
     * you want AWS Firewall Manager to return for this request. If you have
     * more <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * <code>PolicyComplianceStatus</code> objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specifies the number of <code>PolicyComplianceStatus</code>
     *         objects that you want AWS Firewall Manager to return for this
     *         request. If you have more <code>PolicyComplianceStatus</code>
     *         objects than the number that you specify for
     *         <code>MaxResults</code>, the response includes a
     *         <code>NextToken</code> value that you can use to get another
     *         batch of <code>PolicyComplianceStatus</code> objects.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that
     * you want AWS Firewall Manager to return for this request. If you have
     * more <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * <code>PolicyComplianceStatus</code> objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of <code>PolicyComplianceStatus</code>
     *            objects that you want AWS Firewall Manager to return for this
     *            request. If you have more <code>PolicyComplianceStatus</code>
     *            objects than the number that you specify for
     *            <code>MaxResults</code>, the response includes a
     *            <code>NextToken</code> value that you can use to get another
     *            batch of <code>PolicyComplianceStatus</code> objects.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of <code>PolicyComplianceStatus</code> objects that
     * you want AWS Firewall Manager to return for this request. If you have
     * more <code>PolicyComplianceStatus</code> objects than the number that you
     * specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * <code>PolicyComplianceStatus</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of <code>PolicyComplianceStatus</code>
     *            objects that you want AWS Firewall Manager to return for this
     *            request. If you have more <code>PolicyComplianceStatus</code>
     *            objects than the number that you specify for
     *            <code>MaxResults</code>, the response includes a
     *            <code>NextToken</code> value that you can use to get another
     *            batch of <code>PolicyComplianceStatus</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceStatusRequest withMaxResults(Integer maxResults) {
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
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
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

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
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

        if (obj instanceof ListComplianceStatusRequest == false)
            return false;
        ListComplianceStatusRequest other = (ListComplianceStatusRequest) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
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
