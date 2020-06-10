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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes an ingress authorization rule from a Client VPN endpoint.
 * </p>
 */
public class RevokeClientVpnIngressRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint with which the authorization rule is
     * associated.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being removed.
     * </p>
     */
    private String targetNetworkCidr;

    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     */
    private String accessGroupId;

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     */
    private Boolean revokeAllGroups;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

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
    public RevokeClientVpnIngressRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being removed.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, of the network for
     *         which access is being removed.
     *         </p>
     */
    public String getTargetNetworkCidr() {
        return targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being removed.
     * </p>
     *
     * @param targetNetworkCidr <p>
     *            The IPv4 address range, in CIDR notation, of the network for
     *            which access is being removed.
     *            </p>
     */
    public void setTargetNetworkCidr(String targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetNetworkCidr <p>
     *            The IPv4 address range, in CIDR notation, of the network for
     *            which access is being removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeClientVpnIngressRequest withTargetNetworkCidr(String targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
        return this;
    }

    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     *
     * @return <p>
     *         The ID of the Active Directory group for which to revoke access.
     *         </p>
     */
    public String getAccessGroupId() {
        return accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     *
     * @param accessGroupId <p>
     *            The ID of the Active Directory group for which to revoke
     *            access.
     *            </p>
     */
    public void setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group for which to revoke access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessGroupId <p>
     *            The ID of the Active Directory group for which to revoke
     *            access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeClientVpnIngressRequest withAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     *
     * @return <p>
     *         Indicates whether access should be revoked for all clients.
     *         </p>
     */
    public Boolean isRevokeAllGroups() {
        return revokeAllGroups;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     *
     * @return <p>
     *         Indicates whether access should be revoked for all clients.
     *         </p>
     */
    public Boolean getRevokeAllGroups() {
        return revokeAllGroups;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     *
     * @param revokeAllGroups <p>
     *            Indicates whether access should be revoked for all clients.
     *            </p>
     */
    public void setRevokeAllGroups(Boolean revokeAllGroups) {
        this.revokeAllGroups = revokeAllGroups;
    }

    /**
     * <p>
     * Indicates whether access should be revoked for all clients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokeAllGroups <p>
     *            Indicates whether access should be revoked for all clients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeClientVpnIngressRequest withRevokeAllGroups(Boolean revokeAllGroups) {
        this.revokeAllGroups = revokeAllGroups;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeClientVpnIngressRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getTargetNetworkCidr() != null)
            sb.append("TargetNetworkCidr: " + getTargetNetworkCidr() + ",");
        if (getAccessGroupId() != null)
            sb.append("AccessGroupId: " + getAccessGroupId() + ",");
        if (getRevokeAllGroups() != null)
            sb.append("RevokeAllGroups: " + getRevokeAllGroups() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
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
                + ((getTargetNetworkCidr() == null) ? 0 : getTargetNetworkCidr().hashCode());
        hashCode = prime * hashCode
                + ((getAccessGroupId() == null) ? 0 : getAccessGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getRevokeAllGroups() == null) ? 0 : getRevokeAllGroups().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeClientVpnIngressRequest == false)
            return false;
        RevokeClientVpnIngressRequest other = (RevokeClientVpnIngressRequest) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getTargetNetworkCidr() == null ^ this.getTargetNetworkCidr() == null)
            return false;
        if (other.getTargetNetworkCidr() != null
                && other.getTargetNetworkCidr().equals(this.getTargetNetworkCidr()) == false)
            return false;
        if (other.getAccessGroupId() == null ^ this.getAccessGroupId() == null)
            return false;
        if (other.getAccessGroupId() != null
                && other.getAccessGroupId().equals(this.getAccessGroupId()) == false)
            return false;
        if (other.getRevokeAllGroups() == null ^ this.getRevokeAllGroups() == null)
            return false;
        if (other.getRevokeAllGroups() != null
                && other.getRevokeAllGroups().equals(this.getRevokeAllGroups()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
