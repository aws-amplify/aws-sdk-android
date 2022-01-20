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

public class DescribeContactFlowModuleResult implements Serializable {
    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     */
    private ContactFlowModule contactFlowModule;

    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     *
     * @return <p>
     *         Information about the contact flow module.
     *         </p>
     */
    public ContactFlowModule getContactFlowModule() {
        return contactFlowModule;
    }

    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     *
     * @param contactFlowModule <p>
     *            Information about the contact flow module.
     *            </p>
     */
    public void setContactFlowModule(ContactFlowModule contactFlowModule) {
        this.contactFlowModule = contactFlowModule;
    }

    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFlowModule <p>
     *            Information about the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContactFlowModuleResult withContactFlowModule(ContactFlowModule contactFlowModule) {
        this.contactFlowModule = contactFlowModule;
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
        if (getContactFlowModule() != null)
            sb.append("ContactFlowModule: " + getContactFlowModule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContactFlowModule() == null) ? 0 : getContactFlowModule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContactFlowModuleResult == false)
            return false;
        DescribeContactFlowModuleResult other = (DescribeContactFlowModuleResult) obj;

        if (other.getContactFlowModule() == null ^ this.getContactFlowModule() == null)
            return false;
        if (other.getContactFlowModule() != null
                && other.getContactFlowModule().equals(this.getContactFlowModule()) == false)
            return false;
        return true;
    }
}
