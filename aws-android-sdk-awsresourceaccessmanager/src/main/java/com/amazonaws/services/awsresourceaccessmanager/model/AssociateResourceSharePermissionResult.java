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

public class AssociateResourceSharePermissionResult implements Serializable {
    /**
     * <p>
     * Indicates whether the request succeeded.
     * </p>
     */
    private Boolean returnValue;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Indicates whether the request succeeded.
     * </p>
     *
     * @return <p>
     *         Indicates whether the request succeeded.
     *         </p>
     */
    public Boolean isReturnValue() {
        return returnValue;
    }

    /**
     * <p>
     * Indicates whether the request succeeded.
     * </p>
     *
     * @return <p>
     *         Indicates whether the request succeeded.
     *         </p>
     */
    public Boolean getReturnValue() {
        return returnValue;
    }

    /**
     * <p>
     * Indicates whether the request succeeded.
     * </p>
     *
     * @param returnValue <p>
     *            Indicates whether the request succeeded.
     *            </p>
     */
    public void setReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * Indicates whether the request succeeded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnValue <p>
     *            Indicates whether the request succeeded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateResourceSharePermissionResult withReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateResourceSharePermissionResult withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getReturnValue() != null)
            sb.append("returnValue: " + getReturnValue() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReturnValue() == null) ? 0 : getReturnValue().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResourceSharePermissionResult == false)
            return false;
        AssociateResourceSharePermissionResult other = (AssociateResourceSharePermissionResult) obj;

        if (other.getReturnValue() == null ^ this.getReturnValue() == null)
            return false;
        if (other.getReturnValue() != null
                && other.getReturnValue().equals(this.getReturnValue()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
