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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

public class ListAutomaticTapeCreationPoliciesResult implements Serializable {
    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation
     * policies, including the automatic tape creation rules and the gateway
     * that is using the policies.
     * </p>
     */
    private java.util.List<AutomaticTapeCreationPolicyInfo> automaticTapeCreationPolicyInfos;

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation
     * policies, including the automatic tape creation rules and the gateway
     * that is using the policies.
     * </p>
     *
     * @return <p>
     *         Gets a listing of information about the gateway's automatic tape
     *         creation policies, including the automatic tape creation rules
     *         and the gateway that is using the policies.
     *         </p>
     */
    public java.util.List<AutomaticTapeCreationPolicyInfo> getAutomaticTapeCreationPolicyInfos() {
        return automaticTapeCreationPolicyInfos;
    }

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation
     * policies, including the automatic tape creation rules and the gateway
     * that is using the policies.
     * </p>
     *
     * @param automaticTapeCreationPolicyInfos <p>
     *            Gets a listing of information about the gateway's automatic
     *            tape creation policies, including the automatic tape creation
     *            rules and the gateway that is using the policies.
     *            </p>
     */
    public void setAutomaticTapeCreationPolicyInfos(
            java.util.Collection<AutomaticTapeCreationPolicyInfo> automaticTapeCreationPolicyInfos) {
        if (automaticTapeCreationPolicyInfos == null) {
            this.automaticTapeCreationPolicyInfos = null;
            return;
        }

        this.automaticTapeCreationPolicyInfos = new java.util.ArrayList<AutomaticTapeCreationPolicyInfo>(
                automaticTapeCreationPolicyInfos);
    }

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation
     * policies, including the automatic tape creation rules and the gateway
     * that is using the policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticTapeCreationPolicyInfos <p>
     *            Gets a listing of information about the gateway's automatic
     *            tape creation policies, including the automatic tape creation
     *            rules and the gateway that is using the policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutomaticTapeCreationPoliciesResult withAutomaticTapeCreationPolicyInfos(
            AutomaticTapeCreationPolicyInfo... automaticTapeCreationPolicyInfos) {
        if (getAutomaticTapeCreationPolicyInfos() == null) {
            this.automaticTapeCreationPolicyInfos = new java.util.ArrayList<AutomaticTapeCreationPolicyInfo>(
                    automaticTapeCreationPolicyInfos.length);
        }
        for (AutomaticTapeCreationPolicyInfo value : automaticTapeCreationPolicyInfos) {
            this.automaticTapeCreationPolicyInfos.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation
     * policies, including the automatic tape creation rules and the gateway
     * that is using the policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticTapeCreationPolicyInfos <p>
     *            Gets a listing of information about the gateway's automatic
     *            tape creation policies, including the automatic tape creation
     *            rules and the gateway that is using the policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAutomaticTapeCreationPoliciesResult withAutomaticTapeCreationPolicyInfos(
            java.util.Collection<AutomaticTapeCreationPolicyInfo> automaticTapeCreationPolicyInfos) {
        setAutomaticTapeCreationPolicyInfos(automaticTapeCreationPolicyInfos);
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
        if (getAutomaticTapeCreationPolicyInfos() != null)
            sb.append("AutomaticTapeCreationPolicyInfos: " + getAutomaticTapeCreationPolicyInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutomaticTapeCreationPolicyInfos() == null) ? 0
                        : getAutomaticTapeCreationPolicyInfos().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAutomaticTapeCreationPoliciesResult == false)
            return false;
        ListAutomaticTapeCreationPoliciesResult other = (ListAutomaticTapeCreationPoliciesResult) obj;

        if (other.getAutomaticTapeCreationPolicyInfos() == null
                ^ this.getAutomaticTapeCreationPolicyInfos() == null)
            return false;
        if (other.getAutomaticTapeCreationPolicyInfos() != null
                && other.getAutomaticTapeCreationPolicyInfos().equals(
                        this.getAutomaticTapeCreationPolicyInfos()) == false)
            return false;
        return true;
    }
}
