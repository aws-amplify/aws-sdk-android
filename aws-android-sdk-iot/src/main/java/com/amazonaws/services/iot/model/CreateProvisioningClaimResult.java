/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class CreateProvisioningClaimResult implements Serializable {
    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The provisioning claim certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String certificatePem;

    /**
     * <p>
     * The provisioning claim key pair.
     * </p>
     */
    private KeyPair keyPair;

    /**
     * <p>
     * The provisioning claim expiration time.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The ID of the certificate.
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the certificate.
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningClaimResult withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The provisioning claim certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         The provisioning claim certificate.
     *         </p>
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * <p>
     * The provisioning claim certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            The provisioning claim certificate.
     *            </p>
     */
    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The provisioning claim certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            The provisioning claim certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningClaimResult withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * <p>
     * The provisioning claim key pair.
     * </p>
     *
     * @return <p>
     *         The provisioning claim key pair.
     *         </p>
     */
    public KeyPair getKeyPair() {
        return keyPair;
    }

    /**
     * <p>
     * The provisioning claim key pair.
     * </p>
     *
     * @param keyPair <p>
     *            The provisioning claim key pair.
     *            </p>
     */
    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The provisioning claim key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPair <p>
     *            The provisioning claim key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningClaimResult withKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
        return this;
    }

    /**
     * <p>
     * The provisioning claim expiration time.
     * </p>
     *
     * @return <p>
     *         The provisioning claim expiration time.
     *         </p>
     */
    public java.util.Date getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * The provisioning claim expiration time.
     * </p>
     *
     * @param expiration <p>
     *            The provisioning claim expiration time.
     *            </p>
     */
    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The provisioning claim expiration time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            The provisioning claim expiration time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningClaimResult withExpiration(java.util.Date expiration) {
        this.expiration = expiration;
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
        if (getCertificateId() != null)
            sb.append("certificateId: " + getCertificateId() + ",");
        if (getCertificatePem() != null)
            sb.append("certificatePem: " + getCertificatePem() + ",");
        if (getKeyPair() != null)
            sb.append("keyPair: " + getKeyPair() + ",");
        if (getExpiration() != null)
            sb.append("expiration: " + getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode
                + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisioningClaimResult == false)
            return false;
        CreateProvisioningClaimResult other = (CreateProvisioningClaimResult) obj;

        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null
                && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }
}
