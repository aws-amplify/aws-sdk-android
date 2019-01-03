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

/**
 * <p>
 * The output from the DescribeCACertificate operation.
 * </p>
 */
public class DescribeCACertificateResult implements Serializable {
    /**
     * <p>
     * The CA certificate description.
     * </p>
     */
    private CACertificateDescription certificateDescription;

    /**
     * <p>
     * Information about the registration configuration.
     * </p>
     */
    private RegistrationConfig registrationConfig;

    /**
     * <p>
     * The CA certificate description.
     * </p>
     *
     * @return <p>
     *         The CA certificate description.
     *         </p>
     */
    public CACertificateDescription getCertificateDescription() {
        return certificateDescription;
    }

    /**
     * <p>
     * The CA certificate description.
     * </p>
     *
     * @param certificateDescription <p>
     *            The CA certificate description.
     *            </p>
     */
    public void setCertificateDescription(CACertificateDescription certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    /**
     * <p>
     * The CA certificate description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateDescription <p>
     *            The CA certificate description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCACertificateResult withCertificateDescription(
            CACertificateDescription certificateDescription) {
        this.certificateDescription = certificateDescription;
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
    public DescribeCACertificateResult withRegistrationConfig(RegistrationConfig registrationConfig) {
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
        if (getCertificateDescription() != null)
            sb.append("certificateDescription: " + getCertificateDescription() + ",");
        if (getRegistrationConfig() != null)
            sb.append("registrationConfig: " + getRegistrationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateDescription() == null) ? 0 : getCertificateDescription()
                        .hashCode());
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

        if (obj instanceof DescribeCACertificateResult == false)
            return false;
        DescribeCACertificateResult other = (DescribeCACertificateResult) obj;

        if (other.getCertificateDescription() == null ^ this.getCertificateDescription() == null)
            return false;
        if (other.getCertificateDescription() != null
                && other.getCertificateDescription().equals(this.getCertificateDescription()) == false)
            return false;
        if (other.getRegistrationConfig() == null ^ this.getRegistrationConfig() == null)
            return false;
        if (other.getRegistrationConfig() != null
                && other.getRegistrationConfig().equals(this.getRegistrationConfig()) == false)
            return false;
        return true;
    }
}
