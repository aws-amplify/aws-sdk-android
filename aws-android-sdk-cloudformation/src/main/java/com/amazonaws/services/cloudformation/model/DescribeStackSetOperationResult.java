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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

public class DescribeStackSetOperationResult implements Serializable {
    /**
     * <p>
     * The specified stack set operation.
     * </p>
     */
    private StackSetOperation stackSetOperation;

    /**
     * <p>
     * The specified stack set operation.
     * </p>
     *
     * @return <p>
     *         The specified stack set operation.
     *         </p>
     */
    public StackSetOperation getStackSetOperation() {
        return stackSetOperation;
    }

    /**
     * <p>
     * The specified stack set operation.
     * </p>
     *
     * @param stackSetOperation <p>
     *            The specified stack set operation.
     *            </p>
     */
    public void setStackSetOperation(StackSetOperation stackSetOperation) {
        this.stackSetOperation = stackSetOperation;
    }

    /**
     * <p>
     * The specified stack set operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetOperation <p>
     *            The specified stack set operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackSetOperationResult withStackSetOperation(StackSetOperation stackSetOperation) {
        this.stackSetOperation = stackSetOperation;
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
        if (getStackSetOperation() != null)
            sb.append("StackSetOperation: " + getStackSetOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetOperation() == null) ? 0 : getStackSetOperation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackSetOperationResult == false)
            return false;
        DescribeStackSetOperationResult other = (DescribeStackSetOperationResult) obj;

        if (other.getStackSetOperation() == null ^ this.getStackSetOperation() == null)
            return false;
        if (other.getStackSetOperation() != null
                && other.getStackSetOperation().equals(this.getStackSetOperation()) == false)
            return false;
        return true;
    }
}
