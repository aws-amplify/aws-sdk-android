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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class PutResourcePolicyResult implements Serializable {
    /**
     * <p>
     * The new policy.
     * </p>
     */
    private ResourcePolicy resourcePolicy;

    /**
     * <p>
     * The new policy.
     * </p>
     *
     * @return <p>
     *         The new policy.
     *         </p>
     */
    public ResourcePolicy getResourcePolicy() {
        return resourcePolicy;
    }

    /**
     * <p>
     * The new policy.
     * </p>
     *
     * @param resourcePolicy <p>
     *            The new policy.
     *            </p>
     */
    public void setResourcePolicy(ResourcePolicy resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * The new policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcePolicy <p>
     *            The new policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyResult withResourcePolicy(ResourcePolicy resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
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
        if (getResourcePolicy() != null)
            sb.append("resourcePolicy: " + getResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyResult == false)
            return false;
        PutResourcePolicyResult other = (PutResourcePolicyResult) obj;

        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null
                && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        return true;
    }
}
