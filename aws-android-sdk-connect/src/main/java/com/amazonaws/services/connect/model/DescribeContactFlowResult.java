/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class DescribeContactFlowResult implements Serializable {
    /**
     * <p>
     * Information about the contact flow.
     * </p>
     */
    private ContactFlow contactFlow;

    /**
     * <p>
     * Information about the contact flow.
     * </p>
     *
     * @return <p>
     *         Information about the contact flow.
     *         </p>
     */
    public ContactFlow getContactFlow() {
        return contactFlow;
    }

    /**
     * <p>
     * Information about the contact flow.
     * </p>
     *
     * @param contactFlow <p>
     *            Information about the contact flow.
     *            </p>
     */
    public void setContactFlow(ContactFlow contactFlow) {
        this.contactFlow = contactFlow;
    }

    /**
     * <p>
     * Information about the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFlow <p>
     *            Information about the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContactFlowResult withContactFlow(ContactFlow contactFlow) {
        this.contactFlow = contactFlow;
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
        if (getContactFlow() != null)
            sb.append("ContactFlow: " + getContactFlow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContactFlow() == null) ? 0 : getContactFlow().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContactFlowResult == false)
            return false;
        DescribeContactFlowResult other = (DescribeContactFlowResult) obj;

        if (other.getContactFlow() == null ^ this.getContactFlow() == null)
            return false;
        if (other.getContactFlow() != null
                && other.getContactFlow().equals(this.getContactFlow()) == false)
            return false;
        return true;
    }
}
