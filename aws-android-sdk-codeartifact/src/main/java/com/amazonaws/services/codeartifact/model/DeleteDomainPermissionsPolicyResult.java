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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

public class DeleteDomainPermissionsPolicyResult implements Serializable {
    /**
     * <p>
     * Information about the deleted resource policy after processing the
     * request.
     * </p>
     */
    private ResourcePolicy policy;

    /**
     * <p>
     * Information about the deleted resource policy after processing the
     * request.
     * </p>
     *
     * @return <p>
     *         Information about the deleted resource policy after processing
     *         the request.
     *         </p>
     */
    public ResourcePolicy getPolicy() {
        return policy;
    }

    /**
     * <p>
     * Information about the deleted resource policy after processing the
     * request.
     * </p>
     *
     * @param policy <p>
     *            Information about the deleted resource policy after processing
     *            the request.
     *            </p>
     */
    public void setPolicy(ResourcePolicy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Information about the deleted resource policy after processing the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policy <p>
     *            Information about the deleted resource policy after processing
     *            the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDomainPermissionsPolicyResult withPolicy(ResourcePolicy policy) {
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
            sb.append("policy: " + getPolicy());
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

        if (obj instanceof DeleteDomainPermissionsPolicyResult == false)
            return false;
        DeleteDomainPermissionsPolicyResult other = (DeleteDomainPermissionsPolicyResult) obj;

        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }
}
