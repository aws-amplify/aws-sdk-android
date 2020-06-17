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

public class ExportClientVpnClientCertificateRevocationListResult implements Serializable {
    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     */
    private String certificateRevocationList;

    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     */
    private ClientCertificateRevocationListStatus status;

    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     *
     * @return <p>
     *         Information about the client certificate revocation list.
     *         </p>
     */
    public String getCertificateRevocationList() {
        return certificateRevocationList;
    }

    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     *
     * @param certificateRevocationList <p>
     *            Information about the client certificate revocation list.
     *            </p>
     */
    public void setCertificateRevocationList(String certificateRevocationList) {
        this.certificateRevocationList = certificateRevocationList;
    }

    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateRevocationList <p>
     *            Information about the client certificate revocation list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportClientVpnClientCertificateRevocationListResult withCertificateRevocationList(
            String certificateRevocationList) {
        this.certificateRevocationList = certificateRevocationList;
        return this;
    }

    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     *
     * @return <p>
     *         The current state of the client certificate revocation list.
     *         </p>
     */
    public ClientCertificateRevocationListStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     *
     * @param status <p>
     *            The current state of the client certificate revocation list.
     *            </p>
     */
    public void setStatus(ClientCertificateRevocationListStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current state of the client certificate revocation list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportClientVpnClientCertificateRevocationListResult withStatus(
            ClientCertificateRevocationListStatus status) {
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
        if (getCertificateRevocationList() != null)
            sb.append("CertificateRevocationList: " + getCertificateRevocationList() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateRevocationList() == null) ? 0 : getCertificateRevocationList()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportClientVpnClientCertificateRevocationListResult == false)
            return false;
        ExportClientVpnClientCertificateRevocationListResult other = (ExportClientVpnClientCertificateRevocationListResult) obj;

        if (other.getCertificateRevocationList() == null
                ^ this.getCertificateRevocationList() == null)
            return false;
        if (other.getCertificateRevocationList() != null
                && other.getCertificateRevocationList().equals(this.getCertificateRevocationList()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
