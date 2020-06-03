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

/**
 * <p>
 * Information about a virtual private gateway for a private virtual interface.
 * </p>
 */
public class VirtualGateway implements Serializable {
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private
     * virtual interface is unable to send traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     */
    private String virtualGatewayState;

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway.
     *         </p>
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualGateway withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private
     * virtual interface is unable to send traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The state of the virtual private gateway. The following are the
     *         possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code>: Initial state after creating the virtual
     *         private gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: Ready for use by a private virtual
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: Initial state after deleting the virtual
     *         private gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The virtual private gateway is deleted. The
     *         private virtual interface is unable to send traffic over this
     *         gateway.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getVirtualGatewayState() {
        return virtualGatewayState;
    }

    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private
     * virtual interface is unable to send traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     *
     * @param virtualGatewayState <p>
     *            The state of the virtual private gateway. The following are
     *            the possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>pending</code>: Initial state after creating the virtual
     *            private gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: Ready for use by a private virtual
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: Initial state after deleting the
     *            virtual private gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The virtual private gateway is deleted.
     *            The private virtual interface is unable to send traffic over
     *            this gateway.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setVirtualGatewayState(String virtualGatewayState) {
        this.virtualGatewayState = virtualGatewayState;
    }

    /**
     * <p>
     * The state of the virtual private gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: Initial state after creating the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: Ready for use by a private virtual interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: Initial state after deleting the virtual private
     * gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The virtual private gateway is deleted. The private
     * virtual interface is unable to send traffic over this gateway.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayState <p>
     *            The state of the virtual private gateway. The following are
     *            the possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>pending</code>: Initial state after creating the virtual
     *            private gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: Ready for use by a private virtual
     *            interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: Initial state after deleting the
     *            virtual private gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The virtual private gateway is deleted.
     *            The private virtual interface is unable to send traffic over
     *            this gateway.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualGateway withVirtualGatewayState(String virtualGatewayState) {
        this.virtualGatewayState = virtualGatewayState;
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
        if (getVirtualGatewayId() != null)
            sb.append("virtualGatewayId: " + getVirtualGatewayId() + ",");
        if (getVirtualGatewayState() != null)
            sb.append("virtualGatewayState: " + getVirtualGatewayState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualGatewayState() == null) ? 0 : getVirtualGatewayState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGateway == false)
            return false;
        VirtualGateway other = (VirtualGateway) obj;

        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null
                && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayState() == null ^ this.getVirtualGatewayState() == null)
            return false;
        if (other.getVirtualGatewayState() != null
                && other.getVirtualGatewayState().equals(this.getVirtualGatewayState()) == false)
            return false;
        return true;
    }
}
