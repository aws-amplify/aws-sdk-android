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
 * An object that represents an AWS Certicate Manager (ACM) certificate.
 * </p>
 */
public class ListenerTlsAcmCertificate implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must
     * meet specific requirements and you must have proxy authorization enabled.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must
     * meet specific requirements and you must have proxy authorization enabled.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the certificate. The
     *         certificate must meet specific requirements and you must have
     *         proxy authorization enabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
     *         >Transport Layer Security (TLS)</a>.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must
     * meet specific requirements and you must have proxy authorization enabled.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) for the certificate. The
     *            certificate must meet specific requirements and you must have
     *            proxy authorization enabled. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
     *            >Transport Layer Security (TLS)</a>.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must
     * meet specific requirements and you must have proxy authorization enabled.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) for the certificate. The
     *            certificate must meet specific requirements and you must have
     *            proxy authorization enabled. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
     *            >Transport Layer Security (TLS)</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTlsAcmCertificate withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
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
        if (getCertificateArn() != null)
            sb.append("certificateArn: " + getCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTlsAcmCertificate == false)
            return false;
        ListenerTlsAcmCertificate other = (ListenerTlsAcmCertificate) obj;

        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        return true;
    }
}
