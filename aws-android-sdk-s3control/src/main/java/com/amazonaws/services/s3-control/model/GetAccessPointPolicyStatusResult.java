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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


public class GetAccessPointPolicyStatusResult implements Serializable {
    /**
     * <p>Indicates the current policy status of the specified access point.</p>
     */
    private PolicyStatus policyStatus;

    /**
     * <p>Indicates the current policy status of the specified access point.</p>
     *
     * @return <p>Indicates the current policy status of the specified access point.</p>
     */
    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    /**
     * <p>Indicates the current policy status of the specified access point.</p>
     *
     * @param policyStatus <p>Indicates the current policy status of the specified access point.</p>
     */
    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }

    /**
     * <p>Indicates the current policy status of the specified access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyStatus <p>Indicates the current policy status of the specified access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAccessPointPolicyStatusResult withPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyStatus() != null) sb.append("PolicyStatus: " + getPolicyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStatus() == null) ? 0 : getPolicyStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAccessPointPolicyStatusResult == false) return false;
        GetAccessPointPolicyStatusResult other = (GetAccessPointPolicyStatusResult)obj;

        if (other.getPolicyStatus() == null ^ this.getPolicyStatus() == null) return false;
        if (other.getPolicyStatus() != null && other.getPolicyStatus().equals(this.getPolicyStatus()) == false) return false;
        return true;
    }
}
