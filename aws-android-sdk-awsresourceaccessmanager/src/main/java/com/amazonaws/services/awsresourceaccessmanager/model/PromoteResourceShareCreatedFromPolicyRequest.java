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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Resource shares that were created by attaching a policy to a resource are
 * visible only to the resource share owner, and the resource share cannot be
 * modified in AWS RAM.
 * </p>
 * <p>
 * Use this API action to promote the resource share. When you promote the
 * resource share, it becomes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Visible to all principals that it is shared with.
 * </p>
 * </li>
 * <li>
 * <p>
 * Modifiable in AWS RAM.
 * </p>
 * </li>
 * </ul>
 */
public class PromoteResourceShareCreatedFromPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the resource share to promote.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The ARN of the resource share to promote.
     * </p>
     *
     * @return <p>
     *         The ARN of the resource share to promote.
     *         </p>
     */
    public String getResourceShareArn() {
        return resourceShareArn;
    }

    /**
     * <p>
     * The ARN of the resource share to promote.
     * </p>
     *
     * @param resourceShareArn <p>
     *            The ARN of the resource share to promote.
     *            </p>
     */
    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The ARN of the resource share to promote.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArn <p>
     *            The ARN of the resource share to promote.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PromoteResourceShareCreatedFromPolicyRequest withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
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
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromoteResourceShareCreatedFromPolicyRequest == false)
            return false;
        PromoteResourceShareCreatedFromPolicyRequest other = (PromoteResourceShareCreatedFromPolicyRequest) obj;

        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        return true;
    }
}
