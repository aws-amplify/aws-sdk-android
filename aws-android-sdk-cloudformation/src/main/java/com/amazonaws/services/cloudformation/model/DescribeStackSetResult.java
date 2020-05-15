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

public class DescribeStackSetResult implements Serializable {
    /**
     * <p>
     * The specified stack set.
     * </p>
     */
    private StackSet stackSet;

    /**
     * <p>
     * The specified stack set.
     * </p>
     *
     * @return <p>
     *         The specified stack set.
     *         </p>
     */
    public StackSet getStackSet() {
        return stackSet;
    }

    /**
     * <p>
     * The specified stack set.
     * </p>
     *
     * @param stackSet <p>
     *            The specified stack set.
     *            </p>
     */
    public void setStackSet(StackSet stackSet) {
        this.stackSet = stackSet;
    }

    /**
     * <p>
     * The specified stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSet <p>
     *            The specified stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackSetResult withStackSet(StackSet stackSet) {
        this.stackSet = stackSet;
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
        if (getStackSet() != null)
            sb.append("StackSet: " + getStackSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSet() == null) ? 0 : getStackSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackSetResult == false)
            return false;
        DescribeStackSetResult other = (DescribeStackSetResult) obj;

        if (other.getStackSet() == null ^ this.getStackSet() == null)
            return false;
        if (other.getStackSet() != null && other.getStackSet().equals(this.getStackSet()) == false)
            return false;
        return true;
    }
}
