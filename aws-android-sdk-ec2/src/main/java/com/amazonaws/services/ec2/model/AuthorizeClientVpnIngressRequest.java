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
 * Adds an ingress authorization rule to a Client VPN endpoint. Ingress
 * authorization rules act as firewall rules that grant access to networks. You
 * must configure ingress authorization rules to enable clients to access
 * resources in AWS or on-premises networks.
 * </p>
 */
public class AuthorizeClientVpnIngressRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being authorized.
     * </p>
     */
    private String targetNetworkCidr;

    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     */
    private String accessGroupId;

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code>
     * to grant all clients who successfully establish a VPN connection access
     * to the network.
     * </p>
     */
    private Boolean authorizeAllGroups;

    /**
     * <p>
     * A brief description of the authorization rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

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
     * The ID of the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeClientVpnIngressRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being authorized.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, of the network for
     *         which access is being authorized.
     *         </p>
     */
    public String getTargetNetworkCidr() {
        return targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being authorized.
     * </p>
     *
     * @param targetNetworkCidr <p>
     *            The IPv4 address range, in CIDR notation, of the network for
     *            which access is being authorized.
     *            </p>
     */
    public void setTargetNetworkCidr(String targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the network for which access
     * is being authorized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetNetworkCidr <p>
     *            The IPv4 address range, in CIDR notation, of the network for
     *            which access is being authorized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeClientVpnIngressRequest withTargetNetworkCidr(String targetNetworkCidr) {
        this.targetNetworkCidr = targetNetworkCidr;
        return this;
    }

    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     *
     * @return <p>
     *         The ID of the Active Directory group to grant access.
     *         </p>
     */
    public String getAccessGroupId() {
        return accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     *
     * @param accessGroupId <p>
     *            The ID of the Active Directory group to grant access.
     *            </p>
     */
    public void setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
    }

    /**
     * <p>
     * The ID of the Active Directory group to grant access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessGroupId <p>
     *            The ID of the Active Directory group to grant access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeClientVpnIngressRequest withAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code>
     * to grant all clients who successfully establish a VPN connection access
     * to the network.
     * </p>
     *
     * @return <p>
     *         Indicates whether to grant access to all clients. Use
     *         <code>true</code> to grant all clients who successfully establish
     *         a VPN connection access to the network.
     *         </p>
     */
    public Boolean isAuthorizeAllGroups() {
        return authorizeAllGroups;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code>
     * to grant all clients who successfully establish a VPN connection access
     * to the network.
     * </p>
     *
     * @return <p>
     *         Indicates whether to grant access to all clients. Use
     *         <code>true</code> to grant all clients who successfully establish
     *         a VPN connection access to the network.
     *         </p>
     */
    public Boolean getAuthorizeAllGroups() {
        return authorizeAllGroups;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code>
     * to grant all clients who successfully establish a VPN connection access
     * to the network.
     * </p>
     *
     * @param authorizeAllGroups <p>
     *            Indicates whether to grant access to all clients. Use
     *            <code>true</code> to grant all clients who successfully
     *            establish a VPN connection access to the network.
     *            </p>
     */
    public void setAuthorizeAllGroups(Boolean authorizeAllGroups) {
        this.authorizeAllGroups = authorizeAllGroups;
    }

    /**
     * <p>
     * Indicates whether to grant access to all clients. Use <code>true</code>
     * to grant all clients who successfully establish a VPN connection access
     * to the network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizeAllGroups <p>
     *            Indicates whether to grant access to all clients. Use
     *            <code>true</code> to grant all clients who successfully
     *            establish a VPN connection access to the network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeClientVpnIngressRequest withAuthorizeAllGroups(Boolean authorizeAllGroups) {
        this.authorizeAllGroups = authorizeAllGroups;
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
    public AuthorizeClientVpnIngressRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeClientVpnIngressRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
    public AuthorizeClientVpnIngressRequest withDryRun(Boolean dryRun) {
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
        if (getAuthorizeAllGroups() != null)
            sb.append("AuthorizeAllGroups: " + getAuthorizeAllGroups() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
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
                + ((getAuthorizeAllGroups() == null) ? 0 : getAuthorizeAllGroups().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeClientVpnIngressRequest == false)
            return false;
        AuthorizeClientVpnIngressRequest other = (AuthorizeClientVpnIngressRequest) obj;

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
        if (other.getAuthorizeAllGroups() == null ^ this.getAuthorizeAllGroups() == null)
            return false;
        if (other.getAuthorizeAllGroups() != null
                && other.getAuthorizeAllGroups().equals(this.getAuthorizeAllGroups()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
