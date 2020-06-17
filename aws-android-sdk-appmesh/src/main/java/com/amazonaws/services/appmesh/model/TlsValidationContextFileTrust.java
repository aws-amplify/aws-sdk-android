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
 * An object that represents a Transport Layer Security (TLS) validation context
 * trust for a local file.
 * </p>
 */
public class TlsValidationContextFileTrust implements Serializable {
    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system
     * of the virtual node that the proxy is running on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String certificateChain;

    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system
     * of the virtual node that the proxy is running on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The certificate trust chain for a certificate stored on the file
     *         system of the virtual node that the proxy is running on.
     *         </p>
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system
     * of the virtual node that the proxy is running on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param certificateChain <p>
     *            The certificate trust chain for a certificate stored on the
     *            file system of the virtual node that the proxy is running on.
     *            </p>
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system
     * of the virtual node that the proxy is running on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param certificateChain <p>
     *            The certificate trust chain for a certificate stored on the
     *            file system of the virtual node that the proxy is running on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsValidationContextFileTrust withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
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
            sb.append("certificateChain: " + getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsValidationContextFileTrust == false)
            return false;
        TlsValidationContextFileTrust other = (TlsValidationContextFileTrust) obj;

        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null
                && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }
}
