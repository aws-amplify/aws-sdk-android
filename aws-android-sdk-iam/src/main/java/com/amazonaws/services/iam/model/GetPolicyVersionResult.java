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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetPolicyVersion</a> request.
 * </p>
 */
public class GetPolicyVersionResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the policy version.
     * </p>
     */
    private PolicyVersion policyVersion;

    /**
     * <p>
     * A structure containing details about the policy version.
     * </p>
     *
     * @return <p>
     *         A structure containing details about the policy version.
     *         </p>
     */
    public PolicyVersion getPolicyVersion() {
        return policyVersion;
    }

    /**
     * <p>
     * A structure containing details about the policy version.
     * </p>
     *
     * @param policyVersion <p>
     *            A structure containing details about the policy version.
     *            </p>
     */
    public void setPolicyVersion(PolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
    }

    /**
     * <p>
     * A structure containing details about the policy version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyVersion <p>
     *            A structure containing details about the policy version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPolicyVersionResult withPolicyVersion(PolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
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
        if (getPolicyVersion() != null)
            sb.append("PolicyVersion: " + getPolicyVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyVersion() == null) ? 0 : getPolicyVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyVersionResult == false)
            return false;
        GetPolicyVersionResult other = (GetPolicyVersionResult) obj;

        if (other.getPolicyVersion() == null ^ this.getPolicyVersion() == null)
            return false;
        if (other.getPolicyVersion() != null
                && other.getPolicyVersion().equals(this.getPolicyVersion()) == false)
            return false;
        return true;
    }
}
