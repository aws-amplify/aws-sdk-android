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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the client certificate used for authentication.
 * </p>
 */
public class CertificateAuthentication implements Serializable {
    /**
     * <p>
     * The ARN of the client certificate.
     * </p>
     */
    private String clientRootCertificateChain;

    /**
     * <p>
     * The ARN of the client certificate.
     * </p>
     *
     * @return <p>
     *         The ARN of the client certificate.
     *         </p>
     */
    public String getClientRootCertificateChain() {
        return clientRootCertificateChain;
    }

    /**
     * <p>
     * The ARN of the client certificate.
     * </p>
     *
     * @param clientRootCertificateChain <p>
     *            The ARN of the client certificate.
     *            </p>
     */
    public void setClientRootCertificateChain(String clientRootCertificateChain) {
        this.clientRootCertificateChain = clientRootCertificateChain;
    }

    /**
     * <p>
     * The ARN of the client certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientRootCertificateChain <p>
     *            The ARN of the client certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CertificateAuthentication withClientRootCertificateChain(
            String clientRootCertificateChain) {
        this.clientRootCertificateChain = clientRootCertificateChain;
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
        if (getClientRootCertificateChain() != null)
            sb.append("ClientRootCertificateChain: " + getClientRootCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClientRootCertificateChain() == null) ? 0 : getClientRootCertificateChain()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateAuthentication == false)
            return false;
        CertificateAuthentication other = (CertificateAuthentication) obj;

        if (other.getClientRootCertificateChain() == null
                ^ this.getClientRootCertificateChain() == null)
            return false;
        if (other.getClientRootCertificateChain() != null
                && other.getClientRootCertificateChain().equals(
                        this.getClientRootCertificateChain()) == false)
            return false;
        return true;
    }
}
