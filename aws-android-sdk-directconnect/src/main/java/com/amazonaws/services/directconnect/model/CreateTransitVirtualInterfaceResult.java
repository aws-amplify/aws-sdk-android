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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class CreateTransitVirtualInterfaceResult implements Serializable {
    /**
     * <p>
     * Information about a virtual interface.
     * </p>
     */
    private VirtualInterface virtualInterface;

    /**
     * <p>
     * Information about a virtual interface.
     * </p>
     *
     * @return <p>
     *         Information about a virtual interface.
     *         </p>
     */
    public VirtualInterface getVirtualInterface() {
        return virtualInterface;
    }

    /**
     * <p>
     * Information about a virtual interface.
     * </p>
     *
     * @param virtualInterface <p>
     *            Information about a virtual interface.
     *            </p>
     */
    public void setVirtualInterface(VirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
    }

    /**
     * <p>
     * Information about a virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterface <p>
     *            Information about a virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitVirtualInterfaceResult withVirtualInterface(
            VirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
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
        if (getVirtualInterface() != null)
            sb.append("virtualInterface: " + getVirtualInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterface() == null) ? 0 : getVirtualInterface().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitVirtualInterfaceResult == false)
            return false;
        CreateTransitVirtualInterfaceResult other = (CreateTransitVirtualInterfaceResult) obj;

        if (other.getVirtualInterface() == null ^ this.getVirtualInterface() == null)
            return false;
        if (other.getVirtualInterface() != null
                && other.getVirtualInterface().equals(this.getVirtualInterface()) == false)
            return false;
        return true;
    }
}
