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

public class DeleteDiskSnapshotResult implements Serializable {
    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     */
    private java.util.List<Operation> operations;

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
    public java.util.List<Operation> getOperations() {
        return operations;
    }

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     *
     * @param operations <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     */
    public void setOperations(java.util.Collection<Operation> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<Operation>(operations);
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
     * @param operations <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDiskSnapshotResult withOperations(Operation... operations) {
        if (getOperations() == null) {
            this.operations = new java.util.ArrayList<Operation>(operations.length);
        }
        for (Operation value : operations) {
            this.operations.add(value);
        }
        return this;
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
     * @param operations <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDiskSnapshotResult withOperations(java.util.Collection<Operation> operations) {
        setOperations(operations);
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
        if (getOperations() != null)
            sb.append("operations: " + getOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDiskSnapshotResult == false)
            return false;
        DeleteDiskSnapshotResult other = (DeleteDiskSnapshotResult) obj;

        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null
                && other.getOperations().equals(this.getOperations()) == false)
            return false;
        return true;
    }
}
