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
 * Disables an organizational control policy type in a root. A policy of a
 * certain type can be attached to entities in a root only if that type is
 * enabled in the root. After you perform this operation, you no longer can
 * attach policies of the specified type to that root or to any organizational
 * unit (OU) or account in that root. You can undo this by using the
 * <a>EnablePolicyType</a> operation.
 * </p>
 * <p>
 * This is an asynchronous request that AWS performs in the background. If you
 * disable a policy for a root, it still appears enabled for the organization if
 * <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
 * >all features</a> are enabled for the organization. AWS recommends that you
 * first use <a>ListRoots</a> to see the status of policy types for a specified
 * root, and then use this operation.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 * <p>
 * To view the status of available policy types in the organization, use
 * <a>DescribeOrganization</a>.
 * </p>
 */
public class DisablePolicyTypeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to disable a
     * policy type. You can get the ID from the <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * root ID string requires "r-" followed by from 4 to 32 lowercase letters
     * or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-z]{4,32}$<br/>
     */
    private String rootId;

    /**
     * <p>
     * The policy type that you want to disable in this root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     */
    private String policyType;

    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to disable a
     * policy type. You can get the ID from the <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * root ID string requires "r-" followed by from 4 to 32 lowercase letters
     * or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-z]{4,32}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the root in which you want to
     *         disable a policy type. You can get the ID from the
     *         <a>ListRoots</a> operation.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a root ID string requires "r-" followed by from 4 to 32
     *         lowercase letters or digits.
     *         </p>
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to disable a
     * policy type. You can get the ID from the <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * root ID string requires "r-" followed by from 4 to 32 lowercase letters
     * or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-z]{4,32}$<br/>
     *
     * @param rootId <p>
     *            The unique identifier (ID) of the root in which you want to
     *            disable a policy type. You can get the ID from the
     *            <a>ListRoots</a> operation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a root ID string requires "r-" followed by
     *            from 4 to 32 lowercase letters or digits.
     *            </p>
     */
    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to disable a
     * policy type. You can get the ID from the <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * root ID string requires "r-" followed by from 4 to 32 lowercase letters
     * or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-z]{4,32}$<br/>
     *
     * @param rootId <p>
     *            The unique identifier (ID) of the root in which you want to
     *            disable a policy type. You can get the ID from the
     *            <a>ListRoots</a> operation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a root ID string requires "r-" followed by
     *            from 4 to 32 lowercase letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisablePolicyTypeRequest withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * <p>
     * The policy type that you want to disable in this root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @return <p>
     *         The policy type that you want to disable in this root.
     *         </p>
     * @see PolicyType
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The policy type that you want to disable in this root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param policyType <p>
     *            The policy type that you want to disable in this root.
     *            </p>
     * @see PolicyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type that you want to disable in this root.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param policyType <p>
     *            The policy type that you want to disable in this root.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public DisablePolicyTypeRequest withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The policy type that you want to disable in this root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param policyType <p>
     *            The policy type that you want to disable in this root.
     *            </p>
     * @see PolicyType
     */
    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
    }

    /**
     * <p>
     * The policy type that you want to disable in this root.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param policyType <p>
     *            The policy type that you want to disable in this root.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public DisablePolicyTypeRequest withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
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
        if (getRootId() != null)
            sb.append("RootId: " + getRootId() + ",");
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisablePolicyTypeRequest == false)
            return false;
        DisablePolicyTypeRequest other = (DisablePolicyTypeRequest) obj;

        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        return true;
    }
}
