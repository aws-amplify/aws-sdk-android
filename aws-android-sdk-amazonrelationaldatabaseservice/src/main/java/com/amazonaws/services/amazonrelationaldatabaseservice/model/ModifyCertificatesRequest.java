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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Override the system-default Secure Sockets Layer/Transport Layer Security
 * (SSL/TLS) certificate for Amazon RDS for new DB instances temporarily, or
 * remove the override.
 * </p>
 * <p>
 * By using this operation, you can specify an RDS-approved SSL/TLS certificate
 * for new DB instances that is different from the default certificate provided
 * by RDS. You can also use this operation to remove the override, so that new
 * DB instances use the default certificate provided by RDS.
 * </p>
 * <p>
 * You might need to override the default certificate in the following
 * situations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You already migrated your applications to support the latest certificate
 * authority (CA) certificate, but the new CA certificate is not yet the RDS
 * default CA certificate for the specified AWS Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * RDS has already moved to a new default CA certificate for the specified AWS
 * Region, but you are still in the process of supporting the new CA
 * certificate. In this case, you temporarily need additional time to finish
 * your application changes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about rotating your SSL/TLS certificate for RDS DB
 * engines, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html"
 * > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon RDS User Guide</i>.
 * </p>
 * <p>
 * For more information about rotating your SSL/TLS certificate for Aurora DB
 * engines, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html"
 * > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User
 * Guide</i>.
 * </p>
 */
public class ModifyCertificatesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code>
     * AWS CLI command or the <code>DescribeCertificates</code> API operation.
     * </p>
     */
    private String certificateIdentifier;

    /**
     * <p>
     * A value that indicates whether to remove the override for the default
     * certificate. If the override is removed, the default certificate is the
     * system default.
     * </p>
     */
    private Boolean removeCustomerOverride;

    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code>
     * AWS CLI command or the <code>DescribeCertificates</code> API operation.
     * </p>
     *
     * @return <p>
     *         The new default certificate identifier to override the current
     *         one with.
     *         </p>
     *         <p>
     *         To determine the valid values, use the
     *         <code>describe-certificates</code> AWS CLI command or the
     *         <code>DescribeCertificates</code> API operation.
     *         </p>
     */
    public String getCertificateIdentifier() {
        return certificateIdentifier;
    }

    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code>
     * AWS CLI command or the <code>DescribeCertificates</code> API operation.
     * </p>
     *
     * @param certificateIdentifier <p>
     *            The new default certificate identifier to override the current
     *            one with.
     *            </p>
     *            <p>
     *            To determine the valid values, use the
     *            <code>describe-certificates</code> AWS CLI command or the
     *            <code>DescribeCertificates</code> API operation.
     *            </p>
     */
    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code>
     * AWS CLI command or the <code>DescribeCertificates</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateIdentifier <p>
     *            The new default certificate identifier to override the current
     *            one with.
     *            </p>
     *            <p>
     *            To determine the valid values, use the
     *            <code>describe-certificates</code> AWS CLI command or the
     *            <code>DescribeCertificates</code> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCertificatesRequest withCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default
     * certificate. If the override is removed, the default certificate is the
     * system default.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to remove the override for the
     *         default certificate. If the override is removed, the default
     *         certificate is the system default.
     *         </p>
     */
    public Boolean isRemoveCustomerOverride() {
        return removeCustomerOverride;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default
     * certificate. If the override is removed, the default certificate is the
     * system default.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to remove the override for the
     *         default certificate. If the override is removed, the default
     *         certificate is the system default.
     *         </p>
     */
    public Boolean getRemoveCustomerOverride() {
        return removeCustomerOverride;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default
     * certificate. If the override is removed, the default certificate is the
     * system default.
     * </p>
     *
     * @param removeCustomerOverride <p>
     *            A value that indicates whether to remove the override for the
     *            default certificate. If the override is removed, the default
     *            certificate is the system default.
     *            </p>
     */
    public void setRemoveCustomerOverride(Boolean removeCustomerOverride) {
        this.removeCustomerOverride = removeCustomerOverride;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default
     * certificate. If the override is removed, the default certificate is the
     * system default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeCustomerOverride <p>
     *            A value that indicates whether to remove the override for the
     *            default certificate. If the override is removed, the default
     *            certificate is the system default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCertificatesRequest withRemoveCustomerOverride(Boolean removeCustomerOverride) {
        this.removeCustomerOverride = removeCustomerOverride;
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
        if (getCertificateIdentifier() != null)
            sb.append("CertificateIdentifier: " + getCertificateIdentifier() + ",");
        if (getRemoveCustomerOverride() != null)
            sb.append("RemoveCustomerOverride: " + getRemoveCustomerOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveCustomerOverride() == null) ? 0 : getRemoveCustomerOverride()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCertificatesRequest == false)
            return false;
        ModifyCertificatesRequest other = (ModifyCertificatesRequest) obj;

        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null)
            return false;
        if (other.getCertificateIdentifier() != null
                && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false)
            return false;
        if (other.getRemoveCustomerOverride() == null ^ this.getRemoveCustomerOverride() == null)
            return false;
        if (other.getRemoveCustomerOverride() != null
                && other.getRemoveCustomerOverride().equals(this.getRemoveCustomerOverride()) == false)
            return false;
        return true;
    }
}
