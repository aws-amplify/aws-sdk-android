/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A CA certificate.
 * </p>
 */
public class CACertificate implements Serializable {
    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The ID of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     *
     * @return <p>
     *         The ARN of the CA certificate.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     *
     * @param certificateArn <p>
     *            The ARN of the CA certificate.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The ARN of the CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificate withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The ID of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The ID of the CA certificate.
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the CA certificate.
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate.
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
     *            The ID of the CA certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificate withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the CA certificate.
     *         </p>
     *         <p>
     *         The status value REGISTER_INACTIVE is deprecated and should not
     *         be used.
     *         </p>
     * @see CACertificateStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the CA certificate.
     *            </p>
     *            <p>
     *            The status value REGISTER_INACTIVE is deprecated and should
     *            not be used.
     *            </p>
     * @see CACertificateStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the CA certificate.
     *            </p>
     *            <p>
     *            The status value REGISTER_INACTIVE is deprecated and should
     *            not be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */
    public CACertificate withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the CA certificate.
     *            </p>
     *            <p>
     *            The status value REGISTER_INACTIVE is deprecated and should
     *            not be used.
     *            </p>
     * @see CACertificateStatus
     */
    public void setStatus(CACertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the CA certificate.
     *            </p>
     *            <p>
     *            The status value REGISTER_INACTIVE is deprecated and should
     *            not be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */
    public CACertificate withStatus(CACertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     *
     * @return <p>
     *         The date the CA certificate was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date the CA certificate was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the CA certificate was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CACertificate withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getCertificateArn() != null)
            sb.append("certificateArn: " + getCertificateArn() + ",");
        if (getCertificateId() != null)
            sb.append("certificateId: " + getCertificateId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CACertificate == false)
            return false;
        CACertificate other = (CACertificate) obj;

        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
