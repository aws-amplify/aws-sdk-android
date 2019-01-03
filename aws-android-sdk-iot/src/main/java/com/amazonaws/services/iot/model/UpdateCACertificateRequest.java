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
 * Updates a registered CA certificate.
 * </p>
 */
public class UpdateCACertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String newStatus;

    /**
     * <p>
     * The new value for the auto registration status. Valid values are:
     * "ENABLE" or "DISABLE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     */
    private String newAutoRegistrationStatus;

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     */
    private RegistrationConfig registrationConfig;

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     */
    private Boolean removeAutoRegistration;

    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The CA certificate identifier.
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The CA certificate identifier.
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The CA certificate identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The CA certificate identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCACertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The updated status of the CA certificate.
     *         </p>
     *         <p>
     *         <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and
     *         should not be used.
     *         </p>
     * @see CACertificateStatus
     */
    public String getNewStatus() {
        return newStatus;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param newStatus <p>
     *            The updated status of the CA certificate.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @see CACertificateStatus
     */
    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param newStatus <p>
     *            The updated status of the CA certificate.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */
    public UpdateCACertificateRequest withNewStatus(String newStatus) {
        this.newStatus = newStatus;
        return this;
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param newStatus <p>
     *            The updated status of the CA certificate.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @see CACertificateStatus
     */
    public void setNewStatus(CACertificateStatus newStatus) {
        this.newStatus = newStatus.toString();
    }

    /**
     * <p>
     * The updated status of the CA certificate.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param newStatus <p>
     *            The updated status of the CA certificate.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */
    public UpdateCACertificateRequest withNewStatus(CACertificateStatus newStatus) {
        this.newStatus = newStatus.toString();
        return this;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are:
     * "ENABLE" or "DISABLE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @return <p>
     *         The new value for the auto registration status. Valid values are:
     *         "ENABLE" or "DISABLE".
     *         </p>
     * @see AutoRegistrationStatus
     */
    public String getNewAutoRegistrationStatus() {
        return newAutoRegistrationStatus;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are:
     * "ENABLE" or "DISABLE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param newAutoRegistrationStatus <p>
     *            The new value for the auto registration status. Valid values
     *            are: "ENABLE" or "DISABLE".
     *            </p>
     * @see AutoRegistrationStatus
     */
    public void setNewAutoRegistrationStatus(String newAutoRegistrationStatus) {
        this.newAutoRegistrationStatus = newAutoRegistrationStatus;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are:
     * "ENABLE" or "DISABLE".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param newAutoRegistrationStatus <p>
     *            The new value for the auto registration status. Valid values
     *            are: "ENABLE" or "DISABLE".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoRegistrationStatus
     */
    public UpdateCACertificateRequest withNewAutoRegistrationStatus(String newAutoRegistrationStatus) {
        this.newAutoRegistrationStatus = newAutoRegistrationStatus;
        return this;
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are:
     * "ENABLE" or "DISABLE".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param newAutoRegistrationStatus <p>
     *            The new value for the auto registration status. Valid values
     *            are: "ENABLE" or "DISABLE".
     *            </p>
     * @see AutoRegistrationStatus
     */
    public void setNewAutoRegistrationStatus(AutoRegistrationStatus newAutoRegistrationStatus) {
        this.newAutoRegistrationStatus = newAutoRegistrationStatus.toString();
    }

    /**
     * <p>
     * The new value for the auto registration status. Valid values are:
     * "ENABLE" or "DISABLE".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLE, DISABLE
     *
     * @param newAutoRegistrationStatus <p>
     *            The new value for the auto registration status. Valid values
     *            are: "ENABLE" or "DISABLE".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoRegistrationStatus
     */
    public UpdateCACertificateRequest withNewAutoRegistrationStatus(
            AutoRegistrationStatus newAutoRegistrationStatus) {
        this.newAutoRegistrationStatus = newAutoRegistrationStatus.toString();
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
    public UpdateCACertificateRequest withRegistrationConfig(RegistrationConfig registrationConfig) {
        this.registrationConfig = registrationConfig;
        return this;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     *
     * @return <p>
     *         If true, remove auto registration.
     *         </p>
     */
    public Boolean isRemoveAutoRegistration() {
        return removeAutoRegistration;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     *
     * @return <p>
     *         If true, remove auto registration.
     *         </p>
     */
    public Boolean getRemoveAutoRegistration() {
        return removeAutoRegistration;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     *
     * @param removeAutoRegistration <p>
     *            If true, remove auto registration.
     *            </p>
     */
    public void setRemoveAutoRegistration(Boolean removeAutoRegistration) {
        this.removeAutoRegistration = removeAutoRegistration;
    }

    /**
     * <p>
     * If true, remove auto registration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAutoRegistration <p>
     *            If true, remove auto registration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCACertificateRequest withRemoveAutoRegistration(Boolean removeAutoRegistration) {
        this.removeAutoRegistration = removeAutoRegistration;
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
        if (getCertificateId() != null)
            sb.append("certificateId: " + getCertificateId() + ",");
        if (getNewStatus() != null)
            sb.append("newStatus: " + getNewStatus() + ",");
        if (getNewAutoRegistrationStatus() != null)
            sb.append("newAutoRegistrationStatus: " + getNewAutoRegistrationStatus() + ",");
        if (getRegistrationConfig() != null)
            sb.append("registrationConfig: " + getRegistrationConfig() + ",");
        if (getRemoveAutoRegistration() != null)
            sb.append("removeAutoRegistration: " + getRemoveAutoRegistration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getNewStatus() == null) ? 0 : getNewStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewAutoRegistrationStatus() == null) ? 0 : getNewAutoRegistrationStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRegistrationConfig() == null) ? 0 : getRegistrationConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveAutoRegistration() == null) ? 0 : getRemoveAutoRegistration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCACertificateRequest == false)
            return false;
        UpdateCACertificateRequest other = (UpdateCACertificateRequest) obj;

        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getNewStatus() == null ^ this.getNewStatus() == null)
            return false;
        if (other.getNewStatus() != null
                && other.getNewStatus().equals(this.getNewStatus()) == false)
            return false;
        if (other.getNewAutoRegistrationStatus() == null
                ^ this.getNewAutoRegistrationStatus() == null)
            return false;
        if (other.getNewAutoRegistrationStatus() != null
                && other.getNewAutoRegistrationStatus().equals(this.getNewAutoRegistrationStatus()) == false)
            return false;
        if (other.getRegistrationConfig() == null ^ this.getRegistrationConfig() == null)
            return false;
        if (other.getRegistrationConfig() != null
                && other.getRegistrationConfig().equals(this.getRegistrationConfig()) == false)
            return false;
        if (other.getRemoveAutoRegistration() == null ^ this.getRemoveAutoRegistration() == null)
            return false;
        if (other.getRemoveAutoRegistration() != null
                && other.getRemoveAutoRegistration().equals(this.getRemoveAutoRegistration()) == false)
            return false;
        return true;
    }
}
