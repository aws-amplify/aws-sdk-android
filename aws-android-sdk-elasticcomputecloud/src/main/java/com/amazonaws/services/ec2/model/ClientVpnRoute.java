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
 * Information about a Client VPN endpoint route.
 * </p>
 */
public class ClientVpnRoute implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     */
    private String destinationCidr;

    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     */
    private String targetSubnet;

    /**
     * <p>
     * The route type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint.
     * <code>associate</code> indicates that the route was automatically added
     * when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using
     * the <b>CreateClientVpnRoute</b> action.
     * </p>
     */
    private String origin;

    /**
     * <p>
     * The current state of the route.
     * </p>
     */
    private ClientVpnRouteStatus status;

    /**
     * <p>
     * A brief description of the route.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint with which the route is
     *         associated.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint with which the route is
     *            associated.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the route is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint with which the route is
     *            associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnRoute withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, of the route
     *         destination.
     *         </p>
     */
    public String getDestinationCidr() {
        return destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     *
     * @param destinationCidr <p>
     *            The IPv4 address range, in CIDR notation, of the route
     *            destination.
     *            </p>
     */
    public void setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the route destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidr <p>
     *            The IPv4 address range, in CIDR notation, of the route
     *            destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnRoute withDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet through which traffic is routed.
     *         </p>
     */
    public String getTargetSubnet() {
        return targetSubnet;
    }

    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     *
     * @param targetSubnet <p>
     *            The ID of the subnet through which traffic is routed.
     *            </p>
     */
    public void setTargetSubnet(String targetSubnet) {
        this.targetSubnet = targetSubnet;
    }

    /**
     * <p>
     * The ID of the subnet through which traffic is routed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetSubnet <p>
     *            The ID of the subnet through which traffic is routed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnRoute withTargetSubnet(String targetSubnet) {
        this.targetSubnet = targetSubnet;
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     *
     * @return <p>
     *         The route type.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     *
     * @param type <p>
     *            The route type.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The route type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnRoute withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint.
     * <code>associate</code> indicates that the route was automatically added
     * when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using
     * the <b>CreateClientVpnRoute</b> action.
     * </p>
     *
     * @return <p>
     *         Indicates how the route was associated with the Client VPN
     *         endpoint. <code>associate</code> indicates that the route was
     *         automatically added when the target network was associated with
     *         the Client VPN endpoint. <code>add-route</code> indicates that
     *         the route was manually added using the
     *         <b>CreateClientVpnRoute</b> action.
     *         </p>
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint.
     * <code>associate</code> indicates that the route was automatically added
     * when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using
     * the <b>CreateClientVpnRoute</b> action.
     * </p>
     *
     * @param origin <p>
     *            Indicates how the route was associated with the Client VPN
     *            endpoint. <code>associate</code> indicates that the route was
     *            automatically added when the target network was associated
     *            with the Client VPN endpoint. <code>add-route</code> indicates
     *            that the route was manually added using the
     *            <b>CreateClientVpnRoute</b> action.
     *            </p>
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * Indicates how the route was associated with the Client VPN endpoint.
     * <code>associate</code> indicates that the route was automatically added
     * when the target network was associated with the Client VPN endpoint.
     * <code>add-route</code> indicates that the route was manually added using
     * the <b>CreateClientVpnRoute</b> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param origin <p>
     *            Indicates how the route was associated with the Client VPN
     *            endpoint. <code>associate</code> indicates that the route was
     *            automatically added when the target network was associated
     *            with the Client VPN endpoint. <code>add-route</code> indicates
     *            that the route was manually added using the
     *            <b>CreateClientVpnRoute</b> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnRoute withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     *
     * @return <p>
     *         The current state of the route.
     *         </p>
     */
    public ClientVpnRouteStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     *
     * @param status <p>
     *            The current state of the route.
     *            </p>
     */
    public void setStatus(ClientVpnRouteStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnRoute withStatus(ClientVpnRouteStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     *
     * @return <p>
     *         A brief description of the route.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     *
     * @param description <p>
     *            A brief description of the route.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A brief description of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientVpnRoute withDescription(String description) {
        this.description = description;
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: " + getClientVpnEndpointId() + ",");
        if (getDestinationCidr() != null)
            sb.append("DestinationCidr: " + getDestinationCidr() + ",");
        if (getTargetSubnet() != null)
            sb.append("TargetSubnet: " + getTargetSubnet() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCidr() == null) ? 0 : getDestinationCidr().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSubnet() == null) ? 0 : getTargetSubnet().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnRoute == false)
            return false;
        ClientVpnRoute other = (ClientVpnRoute) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDestinationCidr() == null ^ this.getDestinationCidr() == null)
            return false;
        if (other.getDestinationCidr() != null
                && other.getDestinationCidr().equals(this.getDestinationCidr()) == false)
            return false;
        if (other.getTargetSubnet() == null ^ this.getTargetSubnet() == null)
            return false;
        if (other.getTargetSubnet() != null
                && other.getTargetSubnet().equals(this.getTargetSubnet()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
