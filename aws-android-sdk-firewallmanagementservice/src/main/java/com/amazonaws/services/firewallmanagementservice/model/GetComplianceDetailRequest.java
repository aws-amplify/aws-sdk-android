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
 * Returns detailed compliance information about the specified member account.
 * Details include resources that are in and out of compliance with the
 * specified policy. Resources are considered noncompliant for AWS WAF and
 * Shield Advanced policies if the specified policy has not been applied to
 * them. Resources are considered noncompliant for security group policies if
 * they are in scope of the policy, they violate one or more of the policy
 * rules, and remediation is disabled or not possible.
 * </p>
 */
public class GetComplianceDetailRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the policy that you want to get the details for.
     * <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     */
    private String policyId;

    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String memberAccount;

    /**
     * <p>
     * The ID of the policy that you want to get the details for.
     * <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @return <p>
     *         The ID of the policy that you want to get the details for.
     *         <code>PolicyId</code> is returned by <code>PutPolicy</code> and
     *         by <code>ListPolicies</code>.
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The ID of the policy that you want to get the details for.
     * <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[a-z0-9A-Z-]{36}$<br/>
     *
     * @param policyId <p>
     *            The ID of the policy that you want to get the details for.
     *            <code>PolicyId</code> is returned by <code>PutPolicy</code>
     *            and by <code>ListPolicies</code>.
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the policy that you want to get the details for.
     * <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
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
     *            The ID of the policy that you want to get the details for.
     *            <code>PolicyId</code> is returned by <code>PutPolicy</code>
     *            and by <code>ListPolicies</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceDetailRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The AWS account that owns the resources that you want to get the
     *         details for.
     *         </p>
     */
    public String getMemberAccount() {
        return memberAccount;
    }

    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param memberAccount <p>
     *            The AWS account that owns the resources that you want to get
     *            the details for.
     *            </p>
     */
    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details
     * for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param memberAccount <p>
     *            The AWS account that owns the resources that you want to get
     *            the details for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceDetailRequest withMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
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
        if (getMemberAccount() != null)
            sb.append("MemberAccount: " + getMemberAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceDetailRequest == false)
            return false;
        GetComplianceDetailRequest other = (GetComplianceDetailRequest) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null
                && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        return true;
    }
}
