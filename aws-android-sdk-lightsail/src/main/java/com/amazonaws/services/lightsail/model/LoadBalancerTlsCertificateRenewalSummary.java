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
 * Contains information about the status of Lightsail's managed renewal for the
 * certificate.
 * </p>
 */
public class LoadBalancerTlsCertificateRenewalSummary implements Serializable {
    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid
     * values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS,
     * FAILED
     */
    private String renewalStatus;

    /**
     * <p>
     * Contains information about the validation of each domain name in the
     * certificate, as it pertains to Lightsail's managed renewal. This is
     * different from the initial validation that occurs as a result of the
     * RequestCertificate request.
     * </p>
     */
    private java.util.List<LoadBalancerTlsCertificateDomainValidationOption> domainValidationOptions;

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid
     * values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS,
     * FAILED
     *
     * @return <p>
     *         The status of Lightsail's managed renewal of the certificate.
     *         Valid values are listed below.
     *         </p>
     * @see LoadBalancerTlsCertificateRenewalStatus
     */
    public String getRenewalStatus() {
        return renewalStatus;
    }

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid
     * values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS,
     * FAILED
     *
     * @param renewalStatus <p>
     *            The status of Lightsail's managed renewal of the certificate.
     *            Valid values are listed below.
     *            </p>
     * @see LoadBalancerTlsCertificateRenewalStatus
     */
    public void setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
    }

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid
     * values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS,
     * FAILED
     *
     * @param renewalStatus <p>
     *            The status of Lightsail's managed renewal of the certificate.
     *            Valid values are listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateRenewalStatus
     */
    public LoadBalancerTlsCertificateRenewalSummary withRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid
     * values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS,
     * FAILED
     *
     * @param renewalStatus <p>
     *            The status of Lightsail's managed renewal of the certificate.
     *            Valid values are listed below.
     *            </p>
     * @see LoadBalancerTlsCertificateRenewalStatus
     */
    public void setRenewalStatus(LoadBalancerTlsCertificateRenewalStatus renewalStatus) {
        this.renewalStatus = renewalStatus.toString();
    }

    /**
     * <p>
     * The status of Lightsail's managed renewal of the certificate. Valid
     * values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS,
     * FAILED
     *
     * @param renewalStatus <p>
     *            The status of Lightsail's managed renewal of the certificate.
     *            Valid values are listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateRenewalStatus
     */
    public LoadBalancerTlsCertificateRenewalSummary withRenewalStatus(
            LoadBalancerTlsCertificateRenewalStatus renewalStatus) {
        this.renewalStatus = renewalStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the
     * certificate, as it pertains to Lightsail's managed renewal. This is
     * different from the initial validation that occurs as a result of the
     * RequestCertificate request.
     * </p>
     *
     * @return <p>
     *         Contains information about the validation of each domain name in
     *         the certificate, as it pertains to Lightsail's managed renewal.
     *         This is different from the initial validation that occurs as a
     *         result of the RequestCertificate request.
     *         </p>
     */
    public java.util.List<LoadBalancerTlsCertificateDomainValidationOption> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the
     * certificate, as it pertains to Lightsail's managed renewal. This is
     * different from the initial validation that occurs as a result of the
     * RequestCertificate request.
     * </p>
     *
     * @param domainValidationOptions <p>
     *            Contains information about the validation of each domain name
     *            in the certificate, as it pertains to Lightsail's managed
     *            renewal. This is different from the initial validation that
     *            occurs as a result of the RequestCertificate request.
     *            </p>
     */
    public void setDomainValidationOptions(
            java.util.Collection<LoadBalancerTlsCertificateDomainValidationOption> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationOption>(
                domainValidationOptions);
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the
     * certificate, as it pertains to Lightsail's managed renewal. This is
     * different from the initial validation that occurs as a result of the
     * RequestCertificate request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainValidationOptions <p>
     *            Contains information about the validation of each domain name
     *            in the certificate, as it pertains to Lightsail's managed
     *            renewal. This is different from the initial validation that
     *            occurs as a result of the RequestCertificate request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateRenewalSummary withDomainValidationOptions(
            LoadBalancerTlsCertificateDomainValidationOption... domainValidationOptions) {
        if (getDomainValidationOptions() == null) {
            this.domainValidationOptions = new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationOption>(
                    domainValidationOptions.length);
        }
        for (LoadBalancerTlsCertificateDomainValidationOption value : domainValidationOptions) {
            this.domainValidationOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the validation of each domain name in the
     * certificate, as it pertains to Lightsail's managed renewal. This is
     * different from the initial validation that occurs as a result of the
     * RequestCertificate request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainValidationOptions <p>
     *            Contains information about the validation of each domain name
     *            in the certificate, as it pertains to Lightsail's managed
     *            renewal. This is different from the initial validation that
     *            occurs as a result of the RequestCertificate request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateRenewalSummary withDomainValidationOptions(
            java.util.Collection<LoadBalancerTlsCertificateDomainValidationOption> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
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
        if (getRenewalStatus() != null)
            sb.append("renewalStatus: " + getRenewalStatus() + ",");
        if (getDomainValidationOptions() != null)
            sb.append("domainValidationOptions: " + getDomainValidationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRenewalStatus() == null) ? 0 : getRenewalStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainValidationOptions() == null) ? 0 : getDomainValidationOptions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificateRenewalSummary == false)
            return false;
        LoadBalancerTlsCertificateRenewalSummary other = (LoadBalancerTlsCertificateRenewalSummary) obj;

        if (other.getRenewalStatus() == null ^ this.getRenewalStatus() == null)
            return false;
        if (other.getRenewalStatus() != null
                && other.getRenewalStatus().equals(this.getRenewalStatus()) == false)
            return false;
        if (other.getDomainValidationOptions() == null ^ this.getDomainValidationOptions() == null)
            return false;
        if (other.getDomainValidationOptions() != null
                && other.getDomainValidationOptions().equals(this.getDomainValidationOptions()) == false)
            return false;
        return true;
    }
}
