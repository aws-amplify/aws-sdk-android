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

public class StopBgpFailoverTestResult implements Serializable {
    /**
     * <p>
     * Information about the virtual interface failover test.
     * </p>
     */
    private VirtualInterfaceTestHistory virtualInterfaceTest;

    /**
     * <p>
     * Information about the virtual interface failover test.
     * </p>
     *
     * @return <p>
     *         Information about the virtual interface failover test.
     *         </p>
     */
    public VirtualInterfaceTestHistory getVirtualInterfaceTest() {
        return virtualInterfaceTest;
    }

    /**
     * <p>
     * Information about the virtual interface failover test.
     * </p>
     *
     * @param virtualInterfaceTest <p>
     *            Information about the virtual interface failover test.
     *            </p>
     */
    public void setVirtualInterfaceTest(VirtualInterfaceTestHistory virtualInterfaceTest) {
        this.virtualInterfaceTest = virtualInterfaceTest;
    }

    /**
     * <p>
     * Information about the virtual interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceTest <p>
     *            Information about the virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopBgpFailoverTestResult withVirtualInterfaceTest(
            VirtualInterfaceTestHistory virtualInterfaceTest) {
        this.virtualInterfaceTest = virtualInterfaceTest;
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
        if (getVirtualInterfaceTest() != null)
            sb.append("virtualInterfaceTest: " + getVirtualInterfaceTest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterfaceTest() == null) ? 0 : getVirtualInterfaceTest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopBgpFailoverTestResult == false)
            return false;
        StopBgpFailoverTestResult other = (StopBgpFailoverTestResult) obj;

        if (other.getVirtualInterfaceTest() == null ^ this.getVirtualInterfaceTest() == null)
            return false;
        if (other.getVirtualInterfaceTest() != null
                && other.getVirtualInterfaceTest().equals(this.getVirtualInterfaceTest()) == false)
            return false;
        return true;
    }
}
