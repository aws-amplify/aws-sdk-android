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

/**
 * <p>
 * Represents a client certificate used to configure client-side SSL
 * authentication while sending requests to the integration endpoint.
 * </p>
 * <div class="remarks">Client certificates are used to authenticate an API by
 * the backend server. To authenticate an API client (or user), use IAM roles
 * and policies, a custom <a>Authorizer</a> or an Amazon Cognito user
 * pool.</div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html"
 * >Use Client-Side Certificate</a> </div>
 */
public class UpdateClientCertificateResult implements Serializable {
    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     */
    private String clientCertificateId;

    /**
     * <p>
     * The description of the client certificate.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used
     * to configure certificate authentication in the integration endpoint .
     * </p>
     */
    private String pemEncodedCertificate;

    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     *
     * @return <p>
     *         The identifier of the client certificate.
     *         </p>
     */
    public String getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     *
     * @param clientCertificateId <p>
     *            The identifier of the client certificate.
     *            </p>
     */
    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the client certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientCertificateId <p>
     *            The identifier of the client certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClientCertificateResult withClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * <p>
     * The description of the client certificate.
     * </p>
     *
     * @return <p>
     *         The description of the client certificate.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the client certificate.
     * </p>
     *
     * @param description <p>
     *            The description of the client certificate.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the client certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the client certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClientCertificateResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used
     * to configure certificate authentication in the integration endpoint .
     * </p>
     *
     * @return <p>
     *         The PEM-encoded public key of the client certificate, which can
     *         be used to configure certificate authentication in the
     *         integration endpoint .
     *         </p>
     */
    public String getPemEncodedCertificate() {
        return pemEncodedCertificate;
    }

    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used
     * to configure certificate authentication in the integration endpoint .
     * </p>
     *
     * @param pemEncodedCertificate <p>
     *            The PEM-encoded public key of the client certificate, which
     *            can be used to configure certificate authentication in the
     *            integration endpoint .
     *            </p>
     */
    public void setPemEncodedCertificate(String pemEncodedCertificate) {
        this.pemEncodedCertificate = pemEncodedCertificate;
    }

    /**
     * <p>
     * The PEM-encoded public key of the client certificate, which can be used
     * to configure certificate authentication in the integration endpoint .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pemEncodedCertificate <p>
     *            The PEM-encoded public key of the client certificate, which
     *            can be used to configure certificate authentication in the
     *            integration endpoint .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClientCertificateResult withPemEncodedCertificate(String pemEncodedCertificate) {
        this.pemEncodedCertificate = pemEncodedCertificate;
        return this;
    }

    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the client certificate was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     *
     * @param createdDate <p>
     *            The timestamp when the client certificate was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The timestamp when the client certificate was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClientCertificateResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     *
     * @return <p>
     *         The timestamp when the client certificate will expire.
     *         </p>
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     *
     * @param expirationDate <p>
     *            The timestamp when the client certificate will expire.
     *            </p>
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The timestamp when the client certificate will expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationDate <p>
     *            The timestamp when the client certificate will expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClientCertificateResult withExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @return <p>
     *         The collection of tags. Each tag element is associated with a
     *         given resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClientCertificateResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClientCertificateResult addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateClientCertificateResult cleartagsEntries() {
        this.tags = null;
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
            sb.append("clientCertificateId: " + getClientCertificateId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPemEncodedCertificate() != null)
            sb.append("pemEncodedCertificate: " + getPemEncodedCertificate() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getExpirationDate() != null)
            sb.append("expirationDate: " + getExpirationDate() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getPemEncodedCertificate() == null) ? 0 : getPemEncodedCertificate().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClientCertificateResult == false)
            return false;
        UpdateClientCertificateResult other = (UpdateClientCertificateResult) obj;

        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null
                && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPemEncodedCertificate() == null ^ this.getPemEncodedCertificate() == null)
            return false;
        if (other.getPemEncodedCertificate() != null
                && other.getPemEncodedCertificate().equals(this.getPemEncodedCertificate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null
                && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
