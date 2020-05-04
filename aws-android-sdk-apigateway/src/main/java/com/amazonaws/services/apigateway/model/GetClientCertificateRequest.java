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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about the current <a>ClientCertificate</a> resource.
 * </p>
 */
public class GetClientCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be
     * described.
     * </p>
     */
    private String clientCertificateId;

    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be
     * described.
     * </p>
     *
     * @return <p>
     *         [Required] The identifier of the <a>ClientCertificate</a>
     *         resource to be described.
     *         </p>
     */
    public String getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be
     * described.
     * </p>
     *
     * @param clientCertificateId <p>
     *            [Required] The identifier of the <a>ClientCertificate</a>
     *            resource to be described.
     *            </p>
     */
    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>ClientCertificate</a> resource to be
     * described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientCertificateId <p>
     *            [Required] The identifier of the <a>ClientCertificate</a>
     *            resource to be described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClientCertificateRequest withClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
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
        if (getClientCertificateId() != null)
            sb.append("clientCertificateId: " + getClientCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClientCertificateRequest == false)
            return false;
        GetClientCertificateRequest other = (GetClientCertificateRequest) obj;

        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null
                && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        return true;
    }
}
