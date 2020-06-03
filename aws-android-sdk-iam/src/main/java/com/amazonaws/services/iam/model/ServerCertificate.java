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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a server certificate.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetServerCertificate</a> operation.
 * </p>
 */
public class ServerCertificate implements Serializable {
    /**
     * <p>
     * The meta information of the server certificate, such as its name, path,
     * ID, and ARN.
     * </p>
     */
    private ServerCertificateMetadata serverCertificateMetadata;

    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String certificateBody;

    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String certificateChain;

    /**
     * <p>
     * The meta information of the server certificate, such as its name, path,
     * ID, and ARN.
     * </p>
     *
     * @return <p>
     *         The meta information of the server certificate, such as its name,
     *         path, ID, and ARN.
     *         </p>
     */
    public ServerCertificateMetadata getServerCertificateMetadata() {
        return serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the server certificate, such as its name, path,
     * ID, and ARN.
     * </p>
     *
     * @param serverCertificateMetadata <p>
     *            The meta information of the server certificate, such as its
     *            name, path, ID, and ARN.
     *            </p>
     */
    public void setServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the server certificate, such as its name, path,
     * ID, and ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificateMetadata <p>
     *            The meta information of the server certificate, such as its
     *            name, path, ID, and ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificate withServerCertificateMetadata(
            ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
        return this;
    }

    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The contents of the public key certificate.
     *         </p>
     */
    public String getCertificateBody() {
        return certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param certificateBody <p>
     *            The contents of the public key certificate.
     *            </p>
     */
    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param certificateBody <p>
     *            The contents of the public key certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificate withCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }

    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The contents of the public key certificate chain.
     *         </p>
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param certificateChain <p>
     *            The contents of the public key certificate chain.
     *            </p>
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The contents of the public key certificate chain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2097152<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param certificateChain <p>
     *            The contents of the public key certificate chain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificate withCertificateChain(String certificateChain) {
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
        if (getServerCertificateMetadata() != null)
            sb.append("ServerCertificateMetadata: " + getServerCertificateMetadata() + ",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: " + getCertificateBody() + ",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: " + getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getServerCertificateMetadata() == null) ? 0 : getServerCertificateMetadata()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode());
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

        if (obj instanceof ServerCertificate == false)
            return false;
        ServerCertificate other = (ServerCertificate) obj;

        if (other.getServerCertificateMetadata() == null
                ^ this.getServerCertificateMetadata() == null)
            return false;
        if (other.getServerCertificateMetadata() != null
                && other.getServerCertificateMetadata().equals(this.getServerCertificateMetadata()) == false)
            return false;
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null
                && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null
                && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }
}
