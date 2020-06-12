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

public class CreateStackSetResult implements Serializable {
    /**
     * <p>
     * The ID of the stack set that you're creating.
     * </p>
     */
    private String stackSetId;

    /**
     * <p>
     * The ID of the stack set that you're creating.
     * </p>
     *
     * @return <p>
     *         The ID of the stack set that you're creating.
     *         </p>
     */
    public String getStackSetId() {
        return stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set that you're creating.
     * </p>
     *
     * @param stackSetId <p>
     *            The ID of the stack set that you're creating.
     *            </p>
     */
    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set that you're creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetId <p>
     *            The ID of the stack set that you're creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetResult withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
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
        if (getStackSetId() != null)
            sb.append("StackSetId: " + getStackSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStackSetResult == false)
            return false;
        CreateStackSetResult other = (CreateStackSetResult) obj;

        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null
                && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        return true;
    }
}
