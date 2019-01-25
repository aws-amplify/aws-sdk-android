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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Response from Cognito for a signing certificate request.
 * </p>
 */
public class GetSigningCertificateResult implements Serializable {
    /**
     * <p>
     * The signing certificate.
     * </p>
     */
    private String certificate;

    /**
     * <p>
     * The signing certificate.
     * </p>
     *
     * @return <p>
     *         The signing certificate.
     *         </p>
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * <p>
     * The signing certificate.
     * </p>
     *
     * @param certificate <p>
     *            The signing certificate.
     *            </p>
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The signing certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificate <p>
     *            The signing certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSigningCertificateResult withCertificate(String certificate) {
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

        if (obj instanceof GetSigningCertificateResult == false)
            return false;
        GetSigningCertificateResult other = (GetSigningCertificateResult) obj;

        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        return true;
    }
}
