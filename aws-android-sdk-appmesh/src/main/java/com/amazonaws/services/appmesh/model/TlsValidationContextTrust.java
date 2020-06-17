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
 * trust.
 * </p>
 */
public class TlsValidationContextTrust implements Serializable {
    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust
     * for an AWS Certicate Manager (ACM) certificate.
     * </p>
     */
    private TlsValidationContextAcmTrust acm;

    /**
     * <p>
     * An object that represents a TLS validation context trust for a local
     * file.
     * </p>
     */
    private TlsValidationContextFileTrust file;

    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust
     * for an AWS Certicate Manager (ACM) certificate.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents a TLS validation context
     *         trust for an AWS Certicate Manager (ACM) certificate.
     *         </p>
     */
    public TlsValidationContextAcmTrust getAcm() {
        return acm;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust
     * for an AWS Certicate Manager (ACM) certificate.
     * </p>
     *
     * @param acm <p>
     *            A reference to an object that represents a TLS validation
     *            context trust for an AWS Certicate Manager (ACM) certificate.
     *            </p>
     */
    public void setAcm(TlsValidationContextAcmTrust acm) {
        this.acm = acm;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust
     * for an AWS Certicate Manager (ACM) certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acm <p>
     *            A reference to an object that represents a TLS validation
     *            context trust for an AWS Certicate Manager (ACM) certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsValidationContextTrust withAcm(TlsValidationContextAcmTrust acm) {
        this.acm = acm;
        return this;
    }

    /**
     * <p>
     * An object that represents a TLS validation context trust for a local
     * file.
     * </p>
     *
     * @return <p>
     *         An object that represents a TLS validation context trust for a
     *         local file.
     *         </p>
     */
    public TlsValidationContextFileTrust getFile() {
        return file;
    }

    /**
     * <p>
     * An object that represents a TLS validation context trust for a local
     * file.
     * </p>
     *
     * @param file <p>
     *            An object that represents a TLS validation context trust for a
     *            local file.
     *            </p>
     */
    public void setFile(TlsValidationContextFileTrust file) {
        this.file = file;
    }

    /**
     * <p>
     * An object that represents a TLS validation context trust for a local
     * file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param file <p>
     *            An object that represents a TLS validation context trust for a
     *            local file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsValidationContextTrust withFile(TlsValidationContextFileTrust file) {
        this.file = file;
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
        if (getAcm() != null)
            sb.append("acm: " + getAcm() + ",");
        if (getFile() != null)
            sb.append("file: " + getFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcm() == null) ? 0 : getAcm().hashCode());
        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsValidationContextTrust == false)
            return false;
        TlsValidationContextTrust other = (TlsValidationContextTrust) obj;

        if (other.getAcm() == null ^ this.getAcm() == null)
            return false;
        if (other.getAcm() != null && other.getAcm().equals(this.getAcm()) == false)
            return false;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        return true;
    }
}
