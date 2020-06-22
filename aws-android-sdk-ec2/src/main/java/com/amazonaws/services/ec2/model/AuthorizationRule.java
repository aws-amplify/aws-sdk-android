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
 * Information about an authorization rule.
 * </p>
 */
public class AuthorizationRule implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is
     * associated.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule
     * grants access.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     */
    private Boolean accessAll;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the
     * authorization rule applies.
     * </p>
     */
    private String destinationCidr;

    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     */
    private ClientVpnAuthorizationRuleStatus status;

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is
     * associated.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint with which the authorization
     *         rule is associated.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is
     * associated.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint with which the authorization
     *            rule is associated.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is
     * associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint with which the authorization
     *            rule is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationRule withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     *
     * @return <p>
     *         A brief description of the authorization rule.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     *
     * @param description <p>
     *            A brief description of the authorization rule.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A brief description of the authorization rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule
     * grants access.
     * </p>
     *
     * @return <p>
     *         The ID of the Active Directory group to which the authorization
     *         rule grants access.
     *         </p>
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule
     * grants access.
     * </p>
     *
     * @param groupId <p>
     *            The ID of the Active Directory group to which the
     *            authorization rule grants access.
     *            </p>
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to which the authorization rule
     * grants access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupId <p>
     *            The ID of the Active Directory group to which the
     *            authorization rule grants access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationRule withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     *
     * @return <p>
     *         Indicates whether the authorization rule grants access to all
     *         clients.
     *         </p>
     */
    public Boolean isAccessAll() {
        return accessAll;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     *
     * @return <p>
     *         Indicates whether the authorization rule grants access to all
     *         clients.
     *         </p>
     */
    public Boolean getAccessAll() {
        return accessAll;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     *
     * @param accessAll <p>
     *            Indicates whether the authorization rule grants access to all
     *            clients.
     *            </p>
     */
    public void setAccessAll(Boolean accessAll) {
        this.accessAll = accessAll;
    }

    /**
     * <p>
     * Indicates whether the authorization rule grants access to all clients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessAll <p>
     *            Indicates whether the authorization rule grants access to all
     *            clients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationRule withAccessAll(Boolean accessAll) {
        this.accessAll = accessAll;
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the
     * authorization rule applies.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, of the network to which
     *         the authorization rule applies.
     *         </p>
     */
    public String getDestinationCidr() {
        return destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the
     * authorization rule applies.
     * </p>
     *
     * @param destinationCidr <p>
     *            The IPv4 address range, in CIDR notation, of the network to
     *            which the authorization rule applies.
     *            </p>
     */
    public void setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network to which the
     * authorization rule applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidr <p>
     *            The IPv4 address range, in CIDR notation, of the network to
     *            which the authorization rule applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationRule withDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
        return this;
    }

    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     *
     * @return <p>
     *         The current state of the authorization rule.
     *         </p>
     */
    public ClientVpnAuthorizationRuleStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     *
     * @param status <p>
     *            The current state of the authorization rule.
     *            </p>
     */
    public void setStatus(ClientVpnAuthorizationRuleStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the authorization rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the authorization rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationRule withStatus(ClientVpnAuthorizationRuleStatus status) {
        this.status = status;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getAccessAll() != null)
            sb.append("AccessAll: " + getAccessAll() + ",");
        if (getDestinationCidr() != null)
            sb.append("DestinationCidr: " + getDestinationCidr() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getAccessAll() == null) ? 0 : getAccessAll().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationCidr() == null) ? 0 : getDestinationCidr().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizationRule == false)
            return false;
        AuthorizationRule other = (AuthorizationRule) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getAccessAll() == null ^ this.getAccessAll() == null)
            return false;
        if (other.getAccessAll() != null
                && other.getAccessAll().equals(this.getAccessAll()) == false)
            return false;
        if (other.getDestinationCidr() == null ^ this.getDestinationCidr() == null)
            return false;
        if (other.getDestinationCidr() != null
                && other.getDestinationCidr().equals(this.getDestinationCidr()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
