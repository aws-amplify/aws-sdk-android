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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class CreateHsmClientCertificateResult implements Serializable {
    /**
     * <p>
     * Returns information about an HSM client certificate. The certificate is
     * stored in a secure Hardware Storage Module (HSM), and used by the Amazon
     * Redshift cluster to encrypt data files.
     * </p>
     */
    private HsmClientCertificate hsmClientCertificate;

    /**
     * <p>
     * Returns information about an HSM client certificate. The certificate is
     * stored in a secure Hardware Storage Module (HSM), and used by the Amazon
     * Redshift cluster to encrypt data files.
     * </p>
     *
     * @return <p>
     *         Returns information about an HSM client certificate. The
     *         certificate is stored in a secure Hardware Storage Module (HSM),
     *         and used by the Amazon Redshift cluster to encrypt data files.
     *         </p>
     */
    public HsmClientCertificate getHsmClientCertificate() {
        return hsmClientCertificate;
    }

    /**
     * <p>
     * Returns information about an HSM client certificate. The certificate is
     * stored in a secure Hardware Storage Module (HSM), and used by the Amazon
     * Redshift cluster to encrypt data files.
     * </p>
     *
     * @param hsmClientCertificate <p>
     *            Returns information about an HSM client certificate. The
     *            certificate is stored in a secure Hardware Storage Module
     *            (HSM), and used by the Amazon Redshift cluster to encrypt data
     *            files.
     *            </p>
     */
    public void setHsmClientCertificate(HsmClientCertificate hsmClientCertificate) {
        this.hsmClientCertificate = hsmClientCertificate;
    }

    /**
     * <p>
     * Returns information about an HSM client certificate. The certificate is
     * stored in a secure Hardware Storage Module (HSM), and used by the Amazon
     * Redshift cluster to encrypt data files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmClientCertificate <p>
     *            Returns information about an HSM client certificate. The
     *            certificate is stored in a secure Hardware Storage Module
     *            (HSM), and used by the Amazon Redshift cluster to encrypt data
     *            files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmClientCertificateResult withHsmClientCertificate(
            HsmClientCertificate hsmClientCertificate) {
        this.hsmClientCertificate = hsmClientCertificate;
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
        if (getHsmClientCertificate() != null)
            sb.append("HsmClientCertificate: " + getHsmClientCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHsmClientCertificate() == null) ? 0 : getHsmClientCertificate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHsmClientCertificateResult == false)
            return false;
        CreateHsmClientCertificateResult other = (CreateHsmClientCertificateResult) obj;

        if (other.getHsmClientCertificate() == null ^ this.getHsmClientCertificate() == null)
            return false;
        if (other.getHsmClientCertificate() != null
                && other.getHsmClientCertificate().equals(this.getHsmClientCertificate()) == false)
            return false;
        return true;
    }
}
