/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Registers a device certificate with AWS IoT. If you have more than one CA
 * certificate that has the same subject field, you must specify the CA
 * certificate that was used to sign the device certificate being registered.
 * </p>
 */
public class RegisterCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String certificatePem;

    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String caCertificatePem;

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     */
    private Boolean setAsActive;

    /**
     * <p>
     * The status of the register certificate request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     */
    private String status;

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         The certificate data, in PEM format.
     *         </p>
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            The certificate data, in PEM format.
     *            </p>
     */
    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            The certificate data, in PEM format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCertificateRequest withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         The CA certificate used to sign the device certificate being
     *         registered.
     *         </p>
     */
    public String getCaCertificatePem() {
        return caCertificatePem;
    }

    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param caCertificatePem <p>
     *            The CA certificate used to sign the device certificate being
     *            registered.
     *            </p>
     */
    public void setCaCertificatePem(String caCertificatePem) {
        this.caCertificatePem = caCertificatePem;
    }

    /**
     * <p>
     * The CA certificate used to sign the device certificate being registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param caCertificatePem <p>
     *            The CA certificate used to sign the device certificate being
     *            registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCertificateRequest withCaCertificatePem(String caCertificatePem) {
        this.caCertificatePem = caCertificatePem;
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies if the CA certificate is set to
     *         active.
     *         </p>
     */
    public Boolean isSetAsActive() {
        return setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies if the CA certificate is set to
     *         active.
     *         </p>
     */
    public Boolean getSetAsActive() {
        return setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     *
     * @param setAsActive <p>
     *            A boolean value that specifies if the CA certificate is set to
     *            active.
     *            </p>
     */
    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setAsActive <p>
     *            A boolean value that specifies if the CA certificate is set to
     *            active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCertificateRequest withSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
        return this;
    }

    /**
     * <p>
     * The status of the register certificate request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @return <p>
     *         The status of the register certificate request.
     *         </p>
     * @see CertificateStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the register certificate request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param status <p>
     *            The status of the register certificate request.
     *            </p>
     * @see CertificateStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the register certificate request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param status <p>
     *            The status of the register certificate request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */
    public RegisterCertificateRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the register certificate request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param status <p>
     *            The status of the register certificate request.
     *            </p>
     * @see CertificateStatus
     */
    public void setStatus(CertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the register certificate request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param status <p>
     *            The status of the register certificate request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */
    public RegisterCertificateRequest withStatus(CertificateStatus status) {
        this.status = status.toString();
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
        if (getCertificatePem() != null)
            sb.append("certificatePem: " + getCertificatePem() + ",");
        if (getCaCertificatePem() != null)
            sb.append("caCertificatePem: " + getCaCertificatePem() + ",");
        if (getSetAsActive() != null)
            sb.append("setAsActive: " + getSetAsActive() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode
                + ((getCaCertificatePem() == null) ? 0 : getCaCertificatePem().hashCode());
        hashCode = prime * hashCode
                + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterCertificateRequest == false)
            return false;
        RegisterCertificateRequest other = (RegisterCertificateRequest) obj;

        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null
                && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getCaCertificatePem() == null ^ this.getCaCertificatePem() == null)
            return false;
        if (other.getCaCertificatePem() != null
                && other.getCaCertificatePem().equals(this.getCaCertificatePem()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null
                && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
