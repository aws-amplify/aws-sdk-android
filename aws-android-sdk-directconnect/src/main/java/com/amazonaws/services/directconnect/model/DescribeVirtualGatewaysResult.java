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

public class DescribeVirtualGatewaysResult implements Serializable {
    /**
     * <p>
     * The virtual private gateways.
     * </p>
     */
    private java.util.List<VirtualGateway> virtualGateways;

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     *
     * @return <p>
     *         The virtual private gateways.
     *         </p>
     */
    public java.util.List<VirtualGateway> getVirtualGateways() {
        return virtualGateways;
    }

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     *
     * @param virtualGateways <p>
     *            The virtual private gateways.
     *            </p>
     */
    public void setVirtualGateways(java.util.Collection<VirtualGateway> virtualGateways) {
        if (virtualGateways == null) {
            this.virtualGateways = null;
            return;
        }

        this.virtualGateways = new java.util.ArrayList<VirtualGateway>(virtualGateways);
    }

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGateways <p>
     *            The virtual private gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVirtualGatewaysResult withVirtualGateways(VirtualGateway... virtualGateways) {
        if (getVirtualGateways() == null) {
            this.virtualGateways = new java.util.ArrayList<VirtualGateway>(virtualGateways.length);
        }
        for (VirtualGateway value : virtualGateways) {
            this.virtualGateways.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The virtual private gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGateways <p>
     *            The virtual private gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVirtualGatewaysResult withVirtualGateways(
            java.util.Collection<VirtualGateway> virtualGateways) {
        setVirtualGateways(virtualGateways);
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
        if (getVirtualGateways() != null)
            sb.append("virtualGateways: " + getVirtualGateways());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualGateways() == null) ? 0 : getVirtualGateways().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVirtualGatewaysResult == false)
            return false;
        DescribeVirtualGatewaysResult other = (DescribeVirtualGatewaysResult) obj;

        if (other.getVirtualGateways() == null ^ this.getVirtualGateways() == null)
            return false;
        if (other.getVirtualGateways() != null
                && other.getVirtualGateways().equals(this.getVirtualGateways()) == false)
            return false;
        return true;
    }
}
