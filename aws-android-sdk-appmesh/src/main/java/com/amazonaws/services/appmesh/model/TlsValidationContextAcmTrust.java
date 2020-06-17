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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a TLS validation context trust for an AWS Certicate
 * Manager (ACM) certificate.
 * </p>
 */
public class TlsValidationContextAcmTrust implements Serializable {
    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     */
    private java.util.List<String> certificateAuthorityArns;

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     *
     * @return <p>
     *         One or more ACM Amazon Resource Name (ARN)s.
     *         </p>
     */
    public java.util.List<String> getCertificateAuthorityArns() {
        return certificateAuthorityArns;
    }

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     *
     * @param certificateAuthorityArns <p>
     *            One or more ACM Amazon Resource Name (ARN)s.
     *            </p>
     */
    public void setCertificateAuthorityArns(java.util.Collection<String> certificateAuthorityArns) {
        if (certificateAuthorityArns == null) {
            this.certificateAuthorityArns = null;
            return;
        }

        this.certificateAuthorityArns = new java.util.ArrayList<String>(certificateAuthorityArns);
    }

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateAuthorityArns <p>
     *            One or more ACM Amazon Resource Name (ARN)s.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsValidationContextAcmTrust withCertificateAuthorityArns(
            String... certificateAuthorityArns) {
        if (getCertificateAuthorityArns() == null) {
            this.certificateAuthorityArns = new java.util.ArrayList<String>(
                    certificateAuthorityArns.length);
        }
        for (String value : certificateAuthorityArns) {
            this.certificateAuthorityArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more ACM Amazon Resource Name (ARN)s.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateAuthorityArns <p>
     *            One or more ACM Amazon Resource Name (ARN)s.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsValidationContextAcmTrust withCertificateAuthorityArns(
            java.util.Collection<String> certificateAuthorityArns) {
        setCertificateAuthorityArns(certificateAuthorityArns);
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
        if (getCertificateAuthorityArns() != null)
            sb.append("certificateAuthorityArns: " + getCertificateAuthorityArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateAuthorityArns() == null) ? 0 : getCertificateAuthorityArns()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsValidationContextAcmTrust == false)
            return false;
        TlsValidationContextAcmTrust other = (TlsValidationContextAcmTrust) obj;

        if (other.getCertificateAuthorityArns() == null
                ^ this.getCertificateAuthorityArns() == null)
            return false;
        if (other.getCertificateAuthorityArns() != null
                && other.getCertificateAuthorityArns().equals(this.getCertificateAuthorityArns()) == false)
            return false;
        return true;
    }
}
