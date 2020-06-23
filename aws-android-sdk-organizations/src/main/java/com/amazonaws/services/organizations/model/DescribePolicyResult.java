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

public class DescribePolicyResult implements Serializable {
    /**
     * <p>
     * A structure that contains details about the specified policy.
     * </p>
     */
    private Policy policy;

    /**
     * <p>
     * A structure that contains details about the specified policy.
     * </p>
     *
     * @return <p>
     *         A structure that contains details about the specified policy.
     *         </p>
     */
    public Policy getPolicy() {
        return policy;
    }

    /**
     * <p>
     * A structure that contains details about the specified policy.
     * </p>
     *
     * @param policy <p>
     *            A structure that contains details about the specified policy.
     *            </p>
     */
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A structure that contains details about the specified policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policy <p>
     *            A structure that contains details about the specified policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePolicyResult withPolicy(Policy policy) {
        this.policy = policy;
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
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePolicyResult == false)
            return false;
        DescribePolicyResult other = (DescribePolicyResult) obj;

        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }
}
