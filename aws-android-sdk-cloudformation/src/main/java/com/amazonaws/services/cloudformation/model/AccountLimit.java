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

/**
 * <p>
 * The AccountLimit data type.
 * </p>
 * <p>
 * CloudFormation has the following limits per account:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Number of concurrent resources
 * </p>
 * </li>
 * <li>
 * <p>
 * Number of stacks
 * </p>
 * </li>
 * <li>
 * <p>
 * Number of stack outputs
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about these account limits, and other CloudFormation
 * limits, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html"
 * >AWS CloudFormation Limits</a> in the <i>AWS CloudFormation User Guide</i>.
 * </p>
 */
public class AccountLimit implements Serializable {
    /**
     * <p>
     * The name of the account limit.
     * </p>
     * <p>
     * Values: <code>ConcurrentResourcesLimit</code> | <code>StackLimit</code> |
     * <code>StackOutputsLimit</code>
     * </p>
     */
    private String name;

    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * The name of the account limit.
     * </p>
     * <p>
     * Values: <code>ConcurrentResourcesLimit</code> | <code>StackLimit</code> |
     * <code>StackOutputsLimit</code>
     * </p>
     *
     * @return <p>
     *         The name of the account limit.
     *         </p>
     *         <p>
     *         Values: <code>ConcurrentResourcesLimit</code> |
     *         <code>StackLimit</code> | <code>StackOutputsLimit</code>
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the account limit.
     * </p>
     * <p>
     * Values: <code>ConcurrentResourcesLimit</code> | <code>StackLimit</code> |
     * <code>StackOutputsLimit</code>
     * </p>
     *
     * @param name <p>
     *            The name of the account limit.
     *            </p>
     *            <p>
     *            Values: <code>ConcurrentResourcesLimit</code> |
     *            <code>StackLimit</code> | <code>StackOutputsLimit</code>
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the account limit.
     * </p>
     * <p>
     * Values: <code>ConcurrentResourcesLimit</code> | <code>StackLimit</code> |
     * <code>StackOutputsLimit</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the account limit.
     *            </p>
     *            <p>
     *            Values: <code>ConcurrentResourcesLimit</code> |
     *            <code>StackLimit</code> | <code>StackOutputsLimit</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountLimit withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     *
     * @return <p>
     *         The value that is associated with the account limit name.
     *         </p>
     */
    public Integer getValue() {
        return value;
    }

    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     *
     * @param value <p>
     *            The value that is associated with the account limit name.
     *            </p>
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that is associated with the account limit name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value that is associated with the account limit name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountLimit withValue(Integer value) {
        this.value = value;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLimit == false)
            return false;
        AccountLimit other = (AccountLimit) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
