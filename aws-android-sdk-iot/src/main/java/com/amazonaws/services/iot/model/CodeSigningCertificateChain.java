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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the certificate chain being used when code signing a file.
 * </p>
 */
public class CodeSigningCertificateChain implements Serializable {
    /**
     * <p>
     * The name of the certificate.
     * </p>
     */
    private String certificateName;

    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate
     * chain.
     * </p>
     */
    private String inlineDocument;

    /**
     * <p>
     * The name of the certificate.
     * </p>
     *
     * @return <p>
     *         The name of the certificate.
     *         </p>
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     *
     * @param certificateName <p>
     *            The name of the certificate.
     *            </p>
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateName <p>
     *            The name of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeSigningCertificateChain withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate
     * chain.
     * </p>
     *
     * @return <p>
     *         A base64 encoded binary representation of the code signing
     *         certificate chain.
     *         </p>
     */
    public String getInlineDocument() {
        return inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate
     * chain.
     * </p>
     *
     * @param inlineDocument <p>
     *            A base64 encoded binary representation of the code signing
     *            certificate chain.
     *            </p>
     */
    public void setInlineDocument(String inlineDocument) {
        this.inlineDocument = inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate
     * chain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inlineDocument <p>
     *            A base64 encoded binary representation of the code signing
     *            certificate chain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeSigningCertificateChain withInlineDocument(String inlineDocument) {
        this.inlineDocument = inlineDocument;
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
        if (getCertificateName() != null)
            sb.append("certificateName: " + getCertificateName() + ",");
        if (getInlineDocument() != null)
            sb.append("inlineDocument: " + getInlineDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode
                + ((getInlineDocument() == null) ? 0 : getInlineDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSigningCertificateChain == false)
            return false;
        CodeSigningCertificateChain other = (CodeSigningCertificateChain) obj;

        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null
                && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getInlineDocument() == null ^ this.getInlineDocument() == null)
            return false;
        if (other.getInlineDocument() != null
                && other.getInlineDocument().equals(this.getInlineDocument()) == false)
            return false;
        return true;
    }
}
