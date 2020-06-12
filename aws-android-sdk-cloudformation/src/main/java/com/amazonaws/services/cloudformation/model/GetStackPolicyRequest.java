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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the stack policy for a specified stack. If a stack doesn't have a
 * policy, a null value is returned.
 * </p>
 */
public class GetStackPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or unique stack ID that is associated with the stack whose
     * policy you want to get.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The name or unique stack ID that is associated with the stack whose
     * policy you want to get.
     * </p>
     *
     * @return <p>
     *         The name or unique stack ID that is associated with the stack
     *         whose policy you want to get.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name or unique stack ID that is associated with the stack whose
     * policy you want to get.
     * </p>
     *
     * @param stackName <p>
     *            The name or unique stack ID that is associated with the stack
     *            whose policy you want to get.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or unique stack ID that is associated with the stack whose
     * policy you want to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name or unique stack ID that is associated with the stack
     *            whose policy you want to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetStackPolicyRequest withStackName(String stackName) {
        this.stackName = stackName;
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStackPolicyRequest == false)
            return false;
        GetStackPolicyRequest other = (GetStackPolicyRequest) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }
}
