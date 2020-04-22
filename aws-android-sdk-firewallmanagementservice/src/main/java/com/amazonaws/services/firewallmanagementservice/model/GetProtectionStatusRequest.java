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
 * If you created a Shield Advanced policy, returns policy-level attack summary
 * information in the event of a potential DDoS attack. Other policy types are
 * currently unsupported.
 * </p>
 */
public class GetProtectionStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     */
    private String policyId;

    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the
     * details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String memberAccountId;

    /**
     * <p>
     * The start of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * objects than the number that you specify for <code>MaxResults</code>, AWS
     * Firewall Manager returns a <code>NextToken</code> value in the response,
     * which you can use to retrieve another group of objects. For the second
     * and subsequent <code>GetProtectionStatus</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to
     * return for this request. If you have more objects than the number that
     * you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @return <p>
     *         The ID of the policy for which you want to get the attack
     *         information.
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @param policyId <p>
     *            The ID of the policy for which you want to get the attack
     *            information.
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the policy for which you want to get the attack information.
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
     *            The ID of the policy for which you want to get the attack
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the
     * details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The AWS account that is in scope of the policy that you want to
     *         get the details for.
     *         </p>
     */
    public String getMemberAccountId() {
        return memberAccountId;
    }

    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the
     * details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param memberAccountId <p>
     *            The AWS account that is in scope of the policy that you want
     *            to get the details for.
     *            </p>
     */
    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The AWS account that is in scope of the policy that you want to get the
     * details for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param memberAccountId <p>
     *            The AWS account that is in scope of the policy that you want
     *            to get the details for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusRequest withMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }

    /**
     * <p>
     * The start of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     *
     * @return <p>
     *         The start of the time period to query for the attacks. This is a
     *         <code>timestamp</code> type. The request syntax listing indicates
     *         a <code>number</code> type because the default used by AWS
     *         Firewall Manager is Unix time in seconds. However, any valid
     *         <code>timestamp</code> format is allowed.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     *
     * @param startTime <p>
     *            The start of the time period to query for the attacks. This is
     *            a <code>timestamp</code> type. The request syntax listing
     *            indicates a <code>number</code> type because the default used
     *            by AWS Firewall Manager is Unix time in seconds. However, any
     *            valid <code>timestamp</code> format is allowed.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start of the time period to query for the attacks. This is
     *            a <code>timestamp</code> type. The request syntax listing
     *            indicates a <code>number</code> type because the default used
     *            by AWS Firewall Manager is Unix time in seconds. However, any
     *            valid <code>timestamp</code> format is allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     *
     * @return <p>
     *         The end of the time period to query for the attacks. This is a
     *         <code>timestamp</code> type. The request syntax listing indicates
     *         a <code>number</code> type because the default used by AWS
     *         Firewall Manager is Unix time in seconds. However, any valid
     *         <code>timestamp</code> format is allowed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     *
     * @param endTime <p>
     *            The end of the time period to query for the attacks. This is a
     *            <code>timestamp</code> type. The request syntax listing
     *            indicates a <code>number</code> type because the default used
     *            by AWS Firewall Manager is Unix time in seconds. However, any
     *            valid <code>timestamp</code> format is allowed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period to query for the attacks. This is a
     * <code>timestamp</code> type. The request syntax listing indicates a
     * <code>number</code> type because the default used by AWS Firewall Manager
     * is Unix time in seconds. However, any valid <code>timestamp</code> format
     * is allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end of the time period to query for the attacks. This is a
     *            <code>timestamp</code> type. The request syntax listing
     *            indicates a <code>number</code> type because the default used
     *            by AWS Firewall Manager is Unix time in seconds. However, any
     *            valid <code>timestamp</code> format is allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * objects than the number that you specify for <code>MaxResults</code>, AWS
     * Firewall Manager returns a <code>NextToken</code> value in the response,
     * which you can use to retrieve another group of objects. For the second
     * and subsequent <code>GetProtectionStatus</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         If you specify a value for <code>MaxResults</code> and you have
     *         more objects than the number that you specify for
     *         <code>MaxResults</code>, AWS Firewall Manager returns a
     *         <code>NextToken</code> value in the response, which you can use
     *         to retrieve another group of objects. For the second and
     *         subsequent <code>GetProtectionStatus</code> requests, specify the
     *         value of <code>NextToken</code> from the previous response to get
     *         information about another batch of objects.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * objects than the number that you specify for <code>MaxResults</code>, AWS
     * Firewall Manager returns a <code>NextToken</code> value in the response,
     * which you can use to retrieve another group of objects. For the second
     * and subsequent <code>GetProtectionStatus</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you specify a value for <code>MaxResults</code> and you
     *            have more objects than the number that you specify for
     *            <code>MaxResults</code>, AWS Firewall Manager returns a
     *            <code>NextToken</code> value in the response, which you can
     *            use to retrieve another group of objects. For the second and
     *            subsequent <code>GetProtectionStatus</code> requests, specify
     *            the value of <code>NextToken</code> from the previous response
     *            to get information about another batch of objects.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> and you have more
     * objects than the number that you specify for <code>MaxResults</code>, AWS
     * Firewall Manager returns a <code>NextToken</code> value in the response,
     * which you can use to retrieve another group of objects. For the second
     * and subsequent <code>GetProtectionStatus</code> requests, specify the
     * value of <code>NextToken</code> from the previous response to get
     * information about another batch of objects.
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
     *            have more objects than the number that you specify for
     *            <code>MaxResults</code>, AWS Firewall Manager returns a
     *            <code>NextToken</code> value in the response, which you can
     *            use to retrieve another group of objects. For the second and
     *            subsequent <code>GetProtectionStatus</code> requests, specify
     *            the value of <code>NextToken</code> from the previous response
     *            to get information about another batch of objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to
     * return for this request. If you have more objects than the number that
     * you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Specifies the number of objects that you want AWS Firewall
     *         Manager to return for this request. If you have more objects than
     *         the number that you specify for <code>MaxResults</code>, the
     *         response includes a <code>NextToken</code> value that you can use
     *         to get another batch of objects.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to
     * return for this request. If you have more objects than the number that
     * you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of objects that you want AWS Firewall
     *            Manager to return for this request. If you have more objects
     *            than the number that you specify for <code>MaxResults</code>,
     *            the response includes a <code>NextToken</code> value that you
     *            can use to get another batch of objects.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of objects that you want AWS Firewall Manager to
     * return for this request. If you have more objects than the number that
     * you specify for <code>MaxResults</code>, the response includes a
     * <code>NextToken</code> value that you can use to get another batch of
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of objects that you want AWS Firewall
     *            Manager to return for this request. If you have more objects
     *            than the number that you specify for <code>MaxResults</code>,
     *            the response includes a <code>NextToken</code> value that you
     *            can use to get another batch of objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProtectionStatusRequest withMaxResults(Integer maxResults) {
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
        if (getMemberAccountId() != null)
            sb.append("MemberAccountId: " + getMemberAccountId() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
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
        hashCode = prime * hashCode
                + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
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

        if (obj instanceof GetProtectionStatusRequest == false)
            return false;
        GetProtectionStatusRequest other = (GetProtectionStatusRequest) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null
                && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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
