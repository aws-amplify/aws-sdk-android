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
 * Returns the contents of the effective tag policy for the account. The
 * effective tag policy is the aggregation of any tag policies the account
 * inherits, plus any policy directly that is attached to the account.
 * </p>
 * <p>
 * This action returns information on tag policies only.
 * </p>
 * <p>
 * For more information on policy inheritance, see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies-inheritance.html"
 * >How Policy Inheritance Works</a> in the <i>AWS Organizations User Guide</i>.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account or
 * by a member account that is a delegated administrator for an AWS service.
 * </p>
 */
public class DescribeEffectivePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of policy that you want information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY
     */
    private String policyType;

    /**
     * <p>
     * When you're signed in as the master account, specify the ID of the
     * account that you want details about. Specifying an organization root or
     * OU as the target is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     */
    private String targetId;

    /**
     * <p>
     * The type of policy that you want information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY
     *
     * @return <p>
     *         The type of policy that you want information about.
     *         </p>
     * @see EffectivePolicyType
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The type of policy that you want information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY
     *
     * @param policyType <p>
     *            The type of policy that you want information about.
     *            </p>
     * @see EffectivePolicyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy that you want information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY
     *
     * @param policyType <p>
     *            The type of policy that you want information about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EffectivePolicyType
     */
    public DescribeEffectivePolicyRequest withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The type of policy that you want information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY
     *
     * @param policyType <p>
     *            The type of policy that you want information about.
     *            </p>
     * @see EffectivePolicyType
     */
    public void setPolicyType(EffectivePolicyType policyType) {
        this.policyType = policyType.toString();
    }

    /**
     * <p>
     * The type of policy that you want information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAG_POLICY
     *
     * @param policyType <p>
     *            The type of policy that you want information about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EffectivePolicyType
     */
    public DescribeEffectivePolicyRequest withPolicyType(EffectivePolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * When you're signed in as the master account, specify the ID of the
     * account that you want details about. Specifying an organization root or
     * OU as the target is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @return <p>
     *         When you're signed in as the master account, specify the ID of
     *         the account that you want details about. Specifying an
     *         organization root or OU as the target is not supported.
     *         </p>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * When you're signed in as the master account, specify the ID of the
     * account that you want details about. Specifying an organization root or
     * OU as the target is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            When you're signed in as the master account, specify the ID of
     *            the account that you want details about. Specifying an
     *            organization root or OU as the target is not supported.
     *            </p>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * When you're signed in as the master account, specify the ID of the
     * account that you want details about. Specifying an organization root or
     * OU as the target is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            When you're signed in as the master account, specify the ID of
     *            the account that you want details about. Specifying an
     *            organization root or OU as the target is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEffectivePolicyRequest withTargetId(String targetId) {
        this.targetId = targetId;
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
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType() + ",");
        if (getTargetId() != null)
            sb.append("TargetId: " + getTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEffectivePolicyRequest == false)
            return false;
        DescribeEffectivePolicyRequest other = (DescribeEffectivePolicyRequest) obj;

        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        return true;
    }
}
