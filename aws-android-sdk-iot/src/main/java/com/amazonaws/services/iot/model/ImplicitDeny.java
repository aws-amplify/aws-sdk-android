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
 * Information that implicitly denies authorization. When policy doesn't
 * explicitly deny or allow an action on a resource it is considered an implicit
 * deny.
 * </p>
 */
public class ImplicitDeny implements Serializable {
    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the
     * specified action on the specified resource.
     * </p>
     */
    private java.util.List<Policy> policies;

    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the
     * specified action on the specified resource.
     * </p>
     *
     * @return <p>
     *         Policies that don't contain a matching allow or deny statement
     *         for the specified action on the specified resource.
     *         </p>
     */
    public java.util.List<Policy> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the
     * specified action on the specified resource.
     * </p>
     *
     * @param policies <p>
     *            Policies that don't contain a matching allow or deny statement
     *            for the specified action on the specified resource.
     *            </p>
     */
    public void setPolicies(java.util.Collection<Policy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<Policy>(policies);
    }

    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the
     * specified action on the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            Policies that don't contain a matching allow or deny statement
     *            for the specified action on the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImplicitDeny withPolicies(Policy... policies) {
        if (getPolicies() == null) {
            this.policies = new java.util.ArrayList<Policy>(policies.length);
        }
        for (Policy value : policies) {
            this.policies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Policies that don't contain a matching allow or deny statement for the
     * specified action on the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            Policies that don't contain a matching allow or deny statement
     *            for the specified action on the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImplicitDeny withPolicies(java.util.Collection<Policy> policies) {
        setPolicies(policies);
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
        if (getPolicies() != null)
            sb.append("policies: " + getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImplicitDeny == false)
            return false;
        ImplicitDeny other = (ImplicitDeny) obj;

        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }
}
