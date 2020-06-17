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
 * Information about the client certificate to be used for authentication.
 * </p>
 */
public class CertificateAuthenticationRequest implements Serializable {
    /**
     * <p>
     * The ARN of the client certificate. The certificate must be signed by a
     * certificate authority (CA) and it must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     */
    private String clientRootCertificateChainArn;

    /**
     * <p>
     * The ARN of the client certificate. The certificate must be signed by a
     * certificate authority (CA) and it must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     *
     * @return <p>
     *         The ARN of the client certificate. The certificate must be signed
     *         by a certificate authority (CA) and it must be provisioned in AWS
     *         Certificate Manager (ACM).
     *         </p>
     */
    public String getClientRootCertificateChainArn() {
        return clientRootCertificateChainArn;
    }

    /**
     * <p>
     * The ARN of the client certificate. The certificate must be signed by a
     * certificate authority (CA) and it must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     *
     * @param clientRootCertificateChainArn <p>
     *            The ARN of the client certificate. The certificate must be
     *            signed by a certificate authority (CA) and it must be
     *            provisioned in AWS Certificate Manager (ACM).
     *            </p>
     */
    public void setClientRootCertificateChainArn(String clientRootCertificateChainArn) {
        this.clientRootCertificateChainArn = clientRootCertificateChainArn;
    }

    /**
     * <p>
     * The ARN of the client certificate. The certificate must be signed by a
     * certificate authority (CA) and it must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientRootCertificateChainArn <p>
     *            The ARN of the client certificate. The certificate must be
     *            signed by a certificate authority (CA) and it must be
     *            provisioned in AWS Certificate Manager (ACM).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CertificateAuthenticationRequest withClientRootCertificateChainArn(
            String clientRootCertificateChainArn) {
        this.clientRootCertificateChainArn = clientRootCertificateChainArn;
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
        if (getClientRootCertificateChainArn() != null)
            sb.append("ClientRootCertificateChainArn: " + getClientRootCertificateChainArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClientRootCertificateChainArn() == null) ? 0
                        : getClientRootCertificateChainArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateAuthenticationRequest == false)
            return false;
        CertificateAuthenticationRequest other = (CertificateAuthenticationRequest) obj;

        if (other.getClientRootCertificateChainArn() == null
                ^ this.getClientRootCertificateChainArn() == null)
            return false;
        if (other.getClientRootCertificateChainArn() != null
                && other.getClientRootCertificateChainArn().equals(
                        this.getClientRootCertificateChainArn()) == false)
            return false;
        return true;
    }
}
