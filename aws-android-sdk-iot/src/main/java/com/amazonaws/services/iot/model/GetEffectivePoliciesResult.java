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

public class GetEffectivePoliciesResult implements Serializable {
    /**
     * <p>
     * The effective policies.
     * </p>
     */
    private java.util.List<EffectivePolicy> effectivePolicies;

    /**
     * <p>
     * The effective policies.
     * </p>
     *
     * @return <p>
     *         The effective policies.
     *         </p>
     */
    public java.util.List<EffectivePolicy> getEffectivePolicies() {
        return effectivePolicies;
    }

    /**
     * <p>
     * The effective policies.
     * </p>
     *
     * @param effectivePolicies <p>
     *            The effective policies.
     *            </p>
     */
    public void setEffectivePolicies(java.util.Collection<EffectivePolicy> effectivePolicies) {
        if (effectivePolicies == null) {
            this.effectivePolicies = null;
            return;
        }

        this.effectivePolicies = new java.util.ArrayList<EffectivePolicy>(effectivePolicies);
    }

    /**
     * <p>
     * The effective policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectivePolicies <p>
     *            The effective policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEffectivePoliciesResult withEffectivePolicies(EffectivePolicy... effectivePolicies) {
        if (getEffectivePolicies() == null) {
            this.effectivePolicies = new java.util.ArrayList<EffectivePolicy>(
                    effectivePolicies.length);
        }
        for (EffectivePolicy value : effectivePolicies) {
            this.effectivePolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The effective policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectivePolicies <p>
     *            The effective policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEffectivePoliciesResult withEffectivePolicies(
            java.util.Collection<EffectivePolicy> effectivePolicies) {
        setEffectivePolicies(effectivePolicies);
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
        if (getEffectivePolicies() != null)
            sb.append("effectivePolicies: " + getEffectivePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEffectivePolicies() == null) ? 0 : getEffectivePolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEffectivePoliciesResult == false)
            return false;
        GetEffectivePoliciesResult other = (GetEffectivePoliciesResult) obj;

        if (other.getEffectivePolicies() == null ^ this.getEffectivePolicies() == null)
            return false;
        if (other.getEffectivePolicies() != null
                && other.getEffectivePolicies().equals(this.getEffectivePolicies()) == false)
            return false;
        return true;
    }
}
