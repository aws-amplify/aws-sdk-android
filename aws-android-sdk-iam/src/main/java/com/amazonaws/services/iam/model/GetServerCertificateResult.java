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
 * Contains the response to a successful <a>GetServerCertificate</a> request.
 * </p>
 */
public class GetServerCertificateResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the server certificate.
     * </p>
     */
    private ServerCertificate serverCertificate;

    /**
     * <p>
     * A structure containing details about the server certificate.
     * </p>
     *
     * @return <p>
     *         A structure containing details about the server certificate.
     *         </p>
     */
    public ServerCertificate getServerCertificate() {
        return serverCertificate;
    }

    /**
     * <p>
     * A structure containing details about the server certificate.
     * </p>
     *
     * @param serverCertificate <p>
     *            A structure containing details about the server certificate.
     *            </p>
     */
    public void setServerCertificate(ServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
    }

    /**
     * <p>
     * A structure containing details about the server certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificate <p>
     *            A structure containing details about the server certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServerCertificateResult withServerCertificate(ServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
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
        if (getServerCertificate() != null)
            sb.append("ServerCertificate: " + getServerCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServerCertificate() == null) ? 0 : getServerCertificate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServerCertificateResult == false)
            return false;
        GetServerCertificateResult other = (GetServerCertificateResult) obj;

        if (other.getServerCertificate() == null ^ this.getServerCertificate() == null)
            return false;
        if (other.getServerCertificate() != null
                && other.getServerCertificate().equals(this.getServerCertificate()) == false)
            return false;
        return true;
    }
}
