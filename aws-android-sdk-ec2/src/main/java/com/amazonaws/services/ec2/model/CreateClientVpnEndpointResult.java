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

public class CreateClientVpnEndpointResult implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     */
    private ClientVpnEndpointStatus status;

    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     */
    private String dnsName;

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
    public CreateClientVpnEndpointResult withClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     *
     * @return <p>
     *         The current state of the Client VPN endpoint.
     *         </p>
     */
    public ClientVpnEndpointStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     *
     * @param status <p>
     *            The current state of the Client VPN endpoint.
     *            </p>
     */
    public void setStatus(ClientVpnEndpointStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointResult withStatus(ClientVpnEndpointStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     *
     * @return <p>
     *         The DNS name to be used by clients when establishing their VPN
     *         session.
     *         </p>
     */
    public String getDnsName() {
        return dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     *
     * @param dnsName <p>
     *            The DNS name to be used by clients when establishing their VPN
     *            session.
     *            </p>
     */
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when establishing their VPN session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsName <p>
     *            The DNS name to be used by clients when establishing their VPN
     *            session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClientVpnEndpointResult withDnsName(String dnsName) {
        this.dnsName = dnsName;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDnsName() != null)
            sb.append("DnsName: " + getDnsName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClientVpnEndpointResult == false)
            return false;
        CreateClientVpnEndpointResult other = (CreateClientVpnEndpointResult) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        return true;
    }
}
