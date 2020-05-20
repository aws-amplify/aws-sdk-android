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
 * An object that represents a local file certificate. The certificate must meet
 * specific requirements and you must have proxy authorization enabled. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites"
 * >Transport Layer Security (TLS)</a>.
 * </p>
 */
public class ListenerTlsFileCertificate implements Serializable {
    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String certificateChain;

    /**
     * <p>
     * The private key for a certificate stored on the file system of the
     * virtual node that the proxy is running on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String privateKey;

    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The certificate chain for the certificate.
     *         </p>
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param certificateChain <p>
     *            The certificate chain for the certificate.
     *            </p>
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param certificateChain <p>
     *            The certificate chain for the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTlsFileCertificate withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /**
     * <p>
     * The private key for a certificate stored on the file system of the
     * virtual node that the proxy is running on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The private key for a certificate stored on the file system of
     *         the virtual node that the proxy is running on.
     *         </p>
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * <p>
     * The private key for a certificate stored on the file system of the
     * virtual node that the proxy is running on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param privateKey <p>
     *            The private key for a certificate stored on the file system of
     *            the virtual node that the proxy is running on.
     *            </p>
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key for a certificate stored on the file system of the
     * virtual node that the proxy is running on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param privateKey <p>
     *            The private key for a certificate stored on the file system of
     *            the virtual node that the proxy is running on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTlsFileCertificate withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
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
        if (getCertificateChain() != null)
            sb.append("certificateChain: " + getCertificateChain() + ",");
        if (getPrivateKey() != null)
            sb.append("privateKey: " + getPrivateKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTlsFileCertificate == false)
            return false;
        ListenerTlsFileCertificate other = (ListenerTlsFileCertificate) obj;

        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null
                && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null
                && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        return true;
    }
}
