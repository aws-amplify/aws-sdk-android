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
 * Describes the validation record of each domain name in the SSL/TLS
 * certificate.
 * </p>
 */
public class LoadBalancerTlsCertificateDomainValidationRecord implements Serializable {
    /**
     * <p>
     * A fully qualified domain name in the certificate. For example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain
     * validation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * The value for that type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String value;

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     */
    private String validationStatus;

    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * A fully qualified domain name in the certificate. For example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A fully qualified domain name in the certificate. For example,
     *         <code>example.com</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A fully qualified domain name in the certificate. For example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A fully qualified domain name in the certificate. For example,
     *            <code>example.com</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A fully qualified domain name in the certificate. For example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A fully qualified domain name in the certificate. For example,
     *            <code>example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateDomainValidationRecord withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain
     * validation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of validation record. For example, <code>CNAME</code>
     *         for domain validation.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain
     * validation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of validation record. For example, <code>CNAME</code>
     *            for domain validation.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of validation record. For example, <code>CNAME</code> for domain
     * validation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of validation record. For example, <code>CNAME</code>
     *            for domain validation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateDomainValidationRecord withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The value for that type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value for that type.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value for that type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The value for that type.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for that type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The value for that type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateDomainValidationRecord withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @return <p>
     *         The validation status. Valid values are listed below.
     *         </p>
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The validation status. Valid values are listed below.
     *            </p>
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The validation status. Valid values are listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public LoadBalancerTlsCertificateDomainValidationRecord withValidationStatus(
            String validationStatus) {
        this.validationStatus = validationStatus;
        return this;
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The validation status. Valid values are listed below.
     *            </p>
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public void setValidationStatus(LoadBalancerTlsCertificateDomainStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
    }

    /**
     * <p>
     * The validation status. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, FAILED, SUCCESS
     *
     * @param validationStatus <p>
     *            The validation status. Valid values are listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateDomainStatus
     */
    public LoadBalancerTlsCertificateDomainValidationRecord withValidationStatus(
            LoadBalancerTlsCertificateDomainStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     *
     * @return <p>
     *         The domain name against which your SSL/TLS certificate was
     *         validated.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     *
     * @param domainName <p>
     *            The domain name against which your SSL/TLS certificate was
     *            validated.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name against which your SSL/TLS certificate was validated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name against which your SSL/TLS certificate was
     *            validated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificateDomainValidationRecord withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getValidationStatus() != null)
            sb.append("validationStatus: " + getValidationStatus() + ",");
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificateDomainValidationRecord == false)
            return false;
        LoadBalancerTlsCertificateDomainValidationRecord other = (LoadBalancerTlsCertificateDomainValidationRecord) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null
                && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }
}
