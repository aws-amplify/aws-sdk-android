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
 * Retrieves information about a policy.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account or
 * by a member account that is a delegated administrator for an AWS service.
 * </p>
 */
public class DescribePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the policy that you want details about. You
     * can get the ID from the <a>ListPolicies</a> or
     * <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 130<br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     */
    private String policyId;

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want details about. You
     * can get the ID from the <a>ListPolicies</a> or
     * <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 130<br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the policy that you want details
     *         about. You can get the ID from the <a>ListPolicies</a> or
     *         <a>ListPoliciesForTarget</a> operations.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a policy ID string requires "p-" followed by from 8 to 128
     *         lowercase or uppercase letters, digits, or the underscore
     *         character (_).
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want details about. You
     * can get the ID from the <a>ListPolicies</a> or
     * <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 130<br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @param policyId <p>
     *            The unique identifier (ID) of the policy that you want details
     *            about. You can get the ID from the <a>ListPolicies</a> or
     *            <a>ListPoliciesForTarget</a> operations.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a policy ID string requires "p-" followed by
     *            from 8 to 128 lowercase or uppercase letters, digits, or the
     *            underscore character (_).
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want details about. You
     * can get the ID from the <a>ListPolicies</a> or
     * <a>ListPoliciesForTarget</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lowercase or
     * uppercase letters, digits, or the underscore character (_).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 130<br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @param policyId <p>
     *            The unique identifier (ID) of the policy that you want details
     *            about. You can get the ID from the <a>ListPolicies</a> or
     *            <a>ListPoliciesForTarget</a> operations.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a policy ID string requires "p-" followed by
     *            from 8 to 128 lowercase or uppercase letters, digits, or the
     *            underscore character (_).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
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
            sb.append("PolicyId: " + getPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePolicyRequest == false)
            return false;
        DescribePolicyRequest other = (DescribePolicyRequest) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        return true;
    }
}
