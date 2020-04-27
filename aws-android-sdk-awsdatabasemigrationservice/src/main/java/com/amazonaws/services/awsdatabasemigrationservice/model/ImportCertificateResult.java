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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

public class ImportCertificateResult implements Serializable {
    /**
     * <p>
     * The certificate to be uploaded.
     * </p>
     */
    private Certificate certificate;

    /**
     * <p>
     * The certificate to be uploaded.
     * </p>
     *
     * @return <p>
     *         The certificate to be uploaded.
     *         </p>
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * <p>
     * The certificate to be uploaded.
     * </p>
     *
     * @param certificate <p>
     *            The certificate to be uploaded.
     *            </p>
     */
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The certificate to be uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificate <p>
     *            The certificate to be uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportCertificateResult withCertificate(Certificate certificate) {
        this.certificate = certificate;
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
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateResult == false)
            return false;
        ImportCertificateResult other = (ImportCertificateResult) obj;

        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        return true;
    }
}
