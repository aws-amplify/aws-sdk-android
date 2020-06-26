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

public class DescribeStackInstanceResult implements Serializable {
    /**
     * <p>
     * The stack instance that matches the specified request parameters.
     * </p>
     */
    private StackInstance stackInstance;

    /**
     * <p>
     * The stack instance that matches the specified request parameters.
     * </p>
     *
     * @return <p>
     *         The stack instance that matches the specified request parameters.
     *         </p>
     */
    public StackInstance getStackInstance() {
        return stackInstance;
    }

    /**
     * <p>
     * The stack instance that matches the specified request parameters.
     * </p>
     *
     * @param stackInstance <p>
     *            The stack instance that matches the specified request
     *            parameters.
     *            </p>
     */
    public void setStackInstance(StackInstance stackInstance) {
        this.stackInstance = stackInstance;
    }

    /**
     * <p>
     * The stack instance that matches the specified request parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackInstance <p>
     *            The stack instance that matches the specified request
     *            parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackInstanceResult withStackInstance(StackInstance stackInstance) {
        this.stackInstance = stackInstance;
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
        if (getStackInstance() != null)
            sb.append("StackInstance: " + getStackInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackInstance() == null) ? 0 : getStackInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackInstanceResult == false)
            return false;
        DescribeStackInstanceResult other = (DescribeStackInstanceResult) obj;

        if (other.getStackInstance() == null ^ this.getStackInstance() == null)
            return false;
        if (other.getStackInstance() != null
                && other.getStackInstance().equals(this.getStackInstance()) == false)
            return false;
        return true;
    }
}
