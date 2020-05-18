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
 * Uploads a client certificate revocation list to the specified Client VPN
 * endpoint. Uploading a client certificate revocation list overwrites the
 * existing client certificate revocation list.
 * </p>
 * <p>
 * Uploading a client certificate revocation list resets existing client
 * connections.
 * </p>
 */
public class ImportClientVpnClientCertificateRevocationListRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client certificate
     * revocation list applies.
     * </p>
     */
    private String clientVpnEndpointId;

    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client
     * VPN Administrator Guide</i>.
     * </p>
     */
    private String certificateRevocationList;

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
     * The ID of the Client VPN endpoint to which the client certificate
     * revocation list applies.
     * </p>
     *
     * @return <p>
     *         The ID of the Client VPN endpoint to which the client certificate
     *         revocation list applies.
     *         </p>
     */
    public String getClientVpnEndpointId() {
        return clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client certificate
     * revocation list applies.
     * </p>
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to which the client
     *            certificate revocation list applies.
     *            </p>
     */
    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client certificate
     * revocation list applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientVpnEndpointId <p>
     *            The ID of the Client VPN endpoint to which the client
     *            certificate revocation list applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportClientVpnClientCertificateRevocationListRequest withClientVpnEndpointId(
            String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
        return this;
    }

    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client
     * VPN Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         The client certificate revocation list file. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     *         >Generate a Client Certificate Revocation List</a> in the <i>AWS
     *         Client VPN Administrator Guide</i>.
     *         </p>
     */
    public String getCertificateRevocationList() {
        return certificateRevocationList;
    }

    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client
     * VPN Administrator Guide</i>.
     * </p>
     *
     * @param certificateRevocationList <p>
     *            The client certificate revocation list file. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     *            >Generate a Client Certificate Revocation List</a> in the
     *            <i>AWS Client VPN Administrator Guide</i>.
     *            </p>
     */
    public void setCertificateRevocationList(String certificateRevocationList) {
        this.certificateRevocationList = certificateRevocationList;
    }

    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client
     * VPN Administrator Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateRevocationList <p>
     *            The client certificate revocation list file. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     *            >Generate a Client Certificate Revocation List</a> in the
     *            <i>AWS Client VPN Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportClientVpnClientCertificateRevocationListRequest withCertificateRevocationList(
            String certificateRevocationList) {
        this.certificateRevocationList = certificateRevocationList;
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
    public ImportClientVpnClientCertificateRevocationListRequest withDryRun(Boolean dryRun) {
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
        if (getCertificateRevocationList() != null)
            sb.append("CertificateRevocationList: " + getCertificateRevocationList() + ",");
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
        hashCode = prime
                * hashCode
                + ((getCertificateRevocationList() == null) ? 0 : getCertificateRevocationList()
                        .hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportClientVpnClientCertificateRevocationListRequest == false)
            return false;
        ImportClientVpnClientCertificateRevocationListRequest other = (ImportClientVpnClientCertificateRevocationListRequest) obj;

        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null
                && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getCertificateRevocationList() == null
                ^ this.getCertificateRevocationList() == null)
            return false;
        if (other.getCertificateRevocationList() != null
                && other.getCertificateRevocationList().equals(this.getCertificateRevocationList()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
