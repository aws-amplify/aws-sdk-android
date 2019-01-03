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
 * Registers a CA certificate with AWS IoT. This CA certificate can then be used
 * to sign device certificates, which can be then registered with AWS IoT. You
 * can register up to 10 CA certificates per AWS account that have the same
 * subject field. This enables you to have up to 10 certificate authorities sign
 * your device certificates. If you have more than one CA certificate
 * registered, make sure you pass the CA certificate when you register your
 * device certificates with the RegisterCertificate API.
 * </p>
 */
public class RegisterCACertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String caCertificate;

    /**
     * <p>
     * The private key verification certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String verificationCertificate;

    /**
     * <p>
     * A boolean value that specifies if the CA certificate is set to active.
     * </p>
     */
    private Boolean setAsActive;

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     */
    private Boolean allowAutoRegistration;

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     */
    private RegistrationConfig registrationConfig;

    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         The CA certificate.
     *         </p>
     */
    public String getCaCertificate() {
        return caCertificate;
    }

    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param caCertificate <p>
     *            The CA certificate.
     *            </p>
     */
    public void setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
    }

    /**
     * <p>
     * The CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param caCertificate <p>
     *            The CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    /**
     * <p>
     * The private key verification certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         The private key verification certificate.
     *         </p>
     */
    public String getVerificationCertificate() {
        return verificationCertificate;
    }

    /**
     * <p>
     * The private key verification certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param verificationCertificate <p>
     *            The private key verification certificate.
     *            </p>
     */
    public void setVerificationCertificate(String verificationCertificate) {
        this.verificationCertificate = verificationCertificate;
    }

    /**
     * <p>
     * The private key verification certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param verificationCertificate <p>
     *            The private key verification certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withVerificationCertificate(String verificationCertificate) {
        this.verificationCertificate = verificationCertificate;
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
    public RegisterCACertificateRequest withSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
        return this;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     *
     * @return <p>
     *         Allows this CA certificate to be used for auto registration of
     *         device certificates.
     *         </p>
     */
    public Boolean isAllowAutoRegistration() {
        return allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     *
     * @return <p>
     *         Allows this CA certificate to be used for auto registration of
     *         device certificates.
     *         </p>
     */
    public Boolean getAllowAutoRegistration() {
        return allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     *
     * @param allowAutoRegistration <p>
     *            Allows this CA certificate to be used for auto registration of
     *            device certificates.
     *            </p>
     */
    public void setAllowAutoRegistration(Boolean allowAutoRegistration) {
        this.allowAutoRegistration = allowAutoRegistration;
    }

    /**
     * <p>
     * Allows this CA certificate to be used for auto registration of device
     * certificates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowAutoRegistration <p>
     *            Allows this CA certificate to be used for auto registration of
     *            device certificates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withAllowAutoRegistration(Boolean allowAutoRegistration) {
        this.allowAutoRegistration = allowAutoRegistration;
        return this;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     *
     * @return <p>
     *         Information about the registration configuration.
     *         </p>
     */
    public RegistrationConfig getRegistrationConfig() {
        return registrationConfig;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     *
     * @param registrationConfig <p>
     *            Information about the registration configuration.
     *            </p>
     */
    public void setRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
    }

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registrationConfig <p>
     *            Information about the registration configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterCACertificateRequest withRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
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
        if (getCaCertificate() != null)
            sb.append("caCertificate: " + getCaCertificate() + ",");
        if (getVerificationCertificate() != null)
            sb.append("verificationCertificate: " + getVerificationCertificate() + ",");
        if (getSetAsActive() != null)
            sb.append("setAsActive: " + getSetAsActive() + ",");
        if (getAllowAutoRegistration() != null)
            sb.append("allowAutoRegistration: " + getAllowAutoRegistration() + ",");
        if (getRegistrationConfig() != null)
            sb.append("registrationConfig: " + getRegistrationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaCertificate() == null) ? 0 : getCaCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getVerificationCertificate() == null) ? 0 : getVerificationCertificate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowAutoRegistration() == null) ? 0 : getAllowAutoRegistration().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrationConfig() == null) ? 0 : getRegistrationConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterCACertificateRequest == false)
            return false;
        RegisterCACertificateRequest other = (RegisterCACertificateRequest) obj;

        if (other.getCaCertificate() == null ^ this.getCaCertificate() == null)
            return false;
        if (other.getCaCertificate() != null
                && other.getCaCertificate().equals(this.getCaCertificate()) == false)
            return false;
        if (other.getVerificationCertificate() == null ^ this.getVerificationCertificate() == null)
            return false;
        if (other.getVerificationCertificate() != null
                && other.getVerificationCertificate().equals(this.getVerificationCertificate()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null
                && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        if (other.getAllowAutoRegistration() == null ^ this.getAllowAutoRegistration() == null)
            return false;
        if (other.getAllowAutoRegistration() != null
                && other.getAllowAutoRegistration().equals(this.getAllowAutoRegistration()) == false)
            return false;
        if (other.getRegistrationConfig() == null ^ this.getRegistrationConfig() == null)
            return false;
        if (other.getRegistrationConfig() != null
                && other.getRegistrationConfig().equals(this.getRegistrationConfig()) == false)
            return false;
        return true;
    }
}
