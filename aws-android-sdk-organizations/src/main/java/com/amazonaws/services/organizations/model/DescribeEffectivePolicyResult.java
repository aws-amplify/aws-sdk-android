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

public class DescribeEffectivePolicyResult implements Serializable {
    /**
     * <p>
     * The contents of the effective policy.
     * </p>
     */
    private EffectivePolicy effectivePolicy;

    /**
     * <p>
     * The contents of the effective policy.
     * </p>
     *
     * @return <p>
     *         The contents of the effective policy.
     *         </p>
     */
    public EffectivePolicy getEffectivePolicy() {
        return effectivePolicy;
    }

    /**
     * <p>
     * The contents of the effective policy.
     * </p>
     *
     * @param effectivePolicy <p>
     *            The contents of the effective policy.
     *            </p>
     */
    public void setEffectivePolicy(EffectivePolicy effectivePolicy) {
        this.effectivePolicy = effectivePolicy;
    }

    /**
     * <p>
     * The contents of the effective policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectivePolicy <p>
     *            The contents of the effective policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEffectivePolicyResult withEffectivePolicy(EffectivePolicy effectivePolicy) {
        this.effectivePolicy = effectivePolicy;
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
        if (getEffectivePolicy() != null)
            sb.append("EffectivePolicy: " + getEffectivePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEffectivePolicy() == null) ? 0 : getEffectivePolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEffectivePolicyResult == false)
            return false;
        DescribeEffectivePolicyResult other = (DescribeEffectivePolicyResult) obj;

        if (other.getEffectivePolicy() == null ^ this.getEffectivePolicy() == null)
            return false;
        if (other.getEffectivePolicy() != null
                && other.getEffectivePolicy().equals(this.getEffectivePolicy()) == false)
            return false;
        return true;
    }
}
