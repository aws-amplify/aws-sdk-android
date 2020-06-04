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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a static route for a VPN connection.
 * </p>
 */
public class VpnStaticRoute implements Serializable {
    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data
     * center.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     */
    private String source;

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data
     * center.
     * </p>
     *
     * @return <p>
     *         The CIDR block associated with the local subnet of the customer
     *         data center.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data
     * center.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The CIDR block associated with the local subnet of the
     *            customer data center.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data
     * center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The CIDR block associated with the local subnet of the
     *            customer data center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpnStaticRoute withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @return <p>
     *         Indicates how the routes were provided.
     *         </p>
     * @see VpnStaticRouteSource
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source <p>
     *            Indicates how the routes were provided.
     *            </p>
     * @see VpnStaticRouteSource
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source <p>
     *            Indicates how the routes were provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnStaticRouteSource
     */
    public VpnStaticRoute withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source <p>
     *            Indicates how the routes were provided.
     *            </p>
     * @see VpnStaticRouteSource
     */
    public void setSource(VpnStaticRouteSource source) {
        this.source = source.toString();
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source <p>
     *            Indicates how the routes were provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnStaticRouteSource
     */
    public VpnStaticRoute withSource(VpnStaticRouteSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return <p>
     *         The current state of the static route.
     *         </p>
     * @see VpnState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the static route.
     *            </p>
     * @see VpnState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the static route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnState
     */
    public VpnStaticRoute withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the static route.
     *            </p>
     * @see VpnState
     */
    public void setState(VpnState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The current state of the static route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpnState
     */
    public VpnStaticRoute withState(VpnState state) {
        this.state = state.toString();
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnStaticRoute == false)
            return false;
        VpnStaticRoute other = (VpnStaticRoute) obj;

        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null
                && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
