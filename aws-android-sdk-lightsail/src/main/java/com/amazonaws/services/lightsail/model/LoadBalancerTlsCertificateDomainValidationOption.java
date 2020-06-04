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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the domain names on an SSL/TLS certificate that
 * you will use to validate domain ownership.
 * </p>
 */
public class LoadBalancerTlsCertificateDomainValidationOption implements Serializable {
    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     */
    private String validationStatus;

    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     *
     * @return <p>
     *         The fully qualified domain name in the certificate request.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     *
     * @param domainName <p>
     *            The fully qualified domain name in the certificate request.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name in the certificate request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The fully qualified domain name in the certificate request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateDomainValidationOption withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @return <p>
     *         The status of the domain validation. Valid values are listed
     *         below.
     *         </p>
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The status of the domain validation. Valid values are listed
     *            below.
     *            </p>
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The status of the domain validation. Valid values are listed
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public LoadBalancerTlsCertificateDomainValidationOption withValidationStatus(
            String validationStatus) {
        this.validationStatus = validationStatus;
        return this;
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The status of the domain validation. Valid values are listed
     *            below.
     *            </p>
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public void setValidationStatus(LoadBalancerTlsCertificateDomainStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
    }

    /**
     * <p>
     * The status of the domain validation. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The status of the domain validation. Valid values are listed
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public LoadBalancerTlsCertificateDomainValidationOption withValidationStatus(
            LoadBalancerTlsCertificateDomainStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
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
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getValidationStatus() != null)
            sb.append("validationStatus: " + getValidationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificateDomainValidationOption == false)
            return false;
        LoadBalancerTlsCertificateDomainValidationOption other = (LoadBalancerTlsCertificateDomainValidationOption) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null
                && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        return true;
    }
}
