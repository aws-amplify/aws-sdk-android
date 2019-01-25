/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the ListPolicyVersions operation.
 * </p>
 */
public class ListPolicyVersionsResult implements Serializable {
    /**
     * <p>
     * The policy versions.
     * </p>
     */
    private java.util.List<PolicyVersion> policyVersions;

    /**
     * <p>
     * The policy versions.
     * </p>
     *
     * @return <p>
     *         The policy versions.
     *         </p>
     */
    public java.util.List<PolicyVersion> getPolicyVersions() {
        return policyVersions;
    }

    /**
     * <p>
     * The policy versions.
     * </p>
     *
     * @param policyVersions <p>
     *            The policy versions.
     *            </p>
     */
    public void setPolicyVersions(java.util.Collection<PolicyVersion> policyVersions) {
        if (policyVersions == null) {
            this.policyVersions = null;
            return;
        }

        this.policyVersions = new java.util.ArrayList<PolicyVersion>(policyVersions);
    }

    /**
     * <p>
     * The policy versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyVersions <p>
     *            The policy versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPolicyVersionsResult withPolicyVersions(PolicyVersion... policyVersions) {
        if (getPolicyVersions() == null) {
            this.policyVersions = new java.util.ArrayList<PolicyVersion>(policyVersions.length);
        }
        for (PolicyVersion value : policyVersions) {
            this.policyVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The policy versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyVersions <p>
     *            The policy versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPolicyVersionsResult withPolicyVersions(
            java.util.Collection<PolicyVersion> policyVersions) {
        setPolicyVersions(policyVersions);
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
        if (getPolicyVersions() != null)
            sb.append("policyVersions: " + getPolicyVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyVersions() == null) ? 0 : getPolicyVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPolicyVersionsResult == false)
            return false;
        ListPolicyVersionsResult other = (ListPolicyVersionsResult) obj;

        if (other.getPolicyVersions() == null ^ this.getPolicyVersions() == null)
            return false;
        if (other.getPolicyVersions() != null
                && other.getPolicyVersions().equals(this.getPolicyVersions()) == false)
            return false;
        return true;
    }
}
