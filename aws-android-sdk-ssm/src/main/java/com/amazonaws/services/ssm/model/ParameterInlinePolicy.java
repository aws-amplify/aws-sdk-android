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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * One or more policies assigned to a parameter.
 * </p>
 */
public class ParameterInlinePolicy implements Serializable {
    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     */
    private String policyText;

    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types:
     * Expiration, ExpirationNotification, and NoChangeNotification.
     * </p>
     */
    private String policyType;

    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending
     * (the policy has not been enforced or applied yet), Finished (the policy
     * was applied), Failed (the policy was not applied), or InProgress (the
     * policy is being applied now).
     * </p>
     */
    private String policyStatus;

    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     *
     * @return <p>
     *         The JSON text of the policy.
     *         </p>
     */
    public String getPolicyText() {
        return policyText;
    }

    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     *
     * @param policyText <p>
     *            The JSON text of the policy.
     *            </p>
     */
    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyText <p>
     *            The JSON text of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterInlinePolicy withPolicyText(String policyText) {
        this.policyText = policyText;
        return this;
    }

    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types:
     * Expiration, ExpirationNotification, and NoChangeNotification.
     * </p>
     *
     * @return <p>
     *         The type of policy. Parameter Store supports the following policy
     *         types: Expiration, ExpirationNotification, and
     *         NoChangeNotification.
     *         </p>
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types:
     * Expiration, ExpirationNotification, and NoChangeNotification.
     * </p>
     *
     * @param policyType <p>
     *            The type of policy. Parameter Store supports the following
     *            policy types: Expiration, ExpirationNotification, and
     *            NoChangeNotification.
     *            </p>
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types:
     * Expiration, ExpirationNotification, and NoChangeNotification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyType <p>
     *            The type of policy. Parameter Store supports the following
     *            policy types: Expiration, ExpirationNotification, and
     *            NoChangeNotification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterInlinePolicy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending
     * (the policy has not been enforced or applied yet), Finished (the policy
     * was applied), Failed (the policy was not applied), or InProgress (the
     * policy is being applied now).
     * </p>
     *
     * @return <p>
     *         The status of the policy. Policies report the following statuses:
     *         Pending (the policy has not been enforced or applied yet),
     *         Finished (the policy was applied), Failed (the policy was not
     *         applied), or InProgress (the policy is being applied now).
     *         </p>
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending
     * (the policy has not been enforced or applied yet), Finished (the policy
     * was applied), Failed (the policy was not applied), or InProgress (the
     * policy is being applied now).
     * </p>
     *
     * @param policyStatus <p>
     *            The status of the policy. Policies report the following
     *            statuses: Pending (the policy has not been enforced or applied
     *            yet), Finished (the policy was applied), Failed (the policy
     *            was not applied), or InProgress (the policy is being applied
     *            now).
     *            </p>
     */
    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending
     * (the policy has not been enforced or applied yet), Finished (the policy
     * was applied), Failed (the policy was not applied), or InProgress (the
     * policy is being applied now).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyStatus <p>
     *            The status of the policy. Policies report the following
     *            statuses: Pending (the policy has not been enforced or applied
     *            yet), Finished (the policy was applied), Failed (the policy
     *            was not applied), or InProgress (the policy is being applied
     *            now).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterInlinePolicy withPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
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
        if (getPolicyText() != null)
            sb.append("PolicyText: " + getPolicyText() + ",");
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType() + ",");
        if (getPolicyStatus() != null)
            sb.append("PolicyStatus: " + getPolicyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyText() == null) ? 0 : getPolicyText().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyStatus() == null) ? 0 : getPolicyStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterInlinePolicy == false)
            return false;
        ParameterInlinePolicy other = (ParameterInlinePolicy) obj;

        if (other.getPolicyText() == null ^ this.getPolicyText() == null)
            return false;
        if (other.getPolicyText() != null
                && other.getPolicyText().equals(this.getPolicyText()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getPolicyStatus() == null ^ this.getPolicyStatus() == null)
            return false;
        if (other.getPolicyStatus() != null
                && other.getPolicyStatus().equals(this.getPolicyStatus()) == false)
            return false;
        return true;
    }
}
