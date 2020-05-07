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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class UnpeerVpcResult implements Serializable {
    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     */
    private Operation operation;

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the result of the action, such
     *         as the status of the request, the timestamp of the request, and
     *         the resources affected by the request.
     *         </p>
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     *
     * @param operation <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operation <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnpeerVpcResult withOperation(Operation operation) {
        this.operation = operation;
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
        if (getOperation() != null)
            sb.append("operation: " + getOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnpeerVpcResult == false)
            return false;
        UnpeerVpcResult other = (UnpeerVpcResult) obj;

        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null
                && other.getOperation().equals(this.getOperation()) == false)
            return false;
        return true;
    }
}
