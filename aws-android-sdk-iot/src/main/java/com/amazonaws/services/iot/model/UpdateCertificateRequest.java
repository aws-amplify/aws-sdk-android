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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the status of the specified certificate. This operation is
 * idempotent.
 * </p>
 * <p>
 * Moving a certificate from the ACTIVE state (including REVOKED) will not
 * disconnect currently connected devices, but these devices will be unable to
 * reconnect.
 * </p>
 * <p>
 * The ACTIVE state is required to authenticate devices connecting to AWS IoT
 * using a certificate.
 * </p>
 */
public class UpdateCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an
     * exception being thrown. PENDING_TRANSFER is a status used internally by
     * AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     */
    private String newStatus;

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The ID of the certificate. (The last part of the certificate ARN
     *         contains the certificate ID.)
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the certificate. (The last part of the certificate
     *            ARN contains the certificate ID.)
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. (The last part of the certificate ARN contains
     * the certificate ID.)
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
     *            The ID of the certificate. (The last part of the certificate
     *            ARN contains the certificate ID.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an
     * exception being thrown. PENDING_TRANSFER is a status used internally by
     * AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @return <p>
     *         The new status.
     *         </p>
     *         <p>
     *         <b>Note:</b> Setting the status to PENDING_TRANSFER will result
     *         in an exception being thrown. PENDING_TRANSFER is a status used
     *         internally by AWS IoT. It is not intended for developer use.
     *         </p>
     *         <p>
     *         <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and
     *         should not be used.
     *         </p>
     * @see CertificateStatus
     */
    public String getNewStatus() {
        return newStatus;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an
     * exception being thrown. PENDING_TRANSFER is a status used internally by
     * AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param newStatus <p>
     *            The new status.
     *            </p>
     *            <p>
     *            <b>Note:</b> Setting the status to PENDING_TRANSFER will
     *            result in an exception being thrown. PENDING_TRANSFER is a
     *            status used internally by AWS IoT. It is not intended for
     *            developer use.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @see CertificateStatus
     */
    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an
     * exception being thrown. PENDING_TRANSFER is a status used internally by
     * AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param newStatus <p>
     *            The new status.
     *            </p>
     *            <p>
     *            <b>Note:</b> Setting the status to PENDING_TRANSFER will
     *            result in an exception being thrown. PENDING_TRANSFER is a
     *            status used internally by AWS IoT. It is not intended for
     *            developer use.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */
    public UpdateCertificateRequest withNewStatus(String newStatus) {
        this.newStatus = newStatus;
        return this;
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an
     * exception being thrown. PENDING_TRANSFER is a status used internally by
     * AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param newStatus <p>
     *            The new status.
     *            </p>
     *            <p>
     *            <b>Note:</b> Setting the status to PENDING_TRANSFER will
     *            result in an exception being thrown. PENDING_TRANSFER is a
     *            status used internally by AWS IoT. It is not intended for
     *            developer use.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @see CertificateStatus
     */
    public void setNewStatus(CertificateStatus newStatus) {
        this.newStatus = newStatus.toString();
    }

    /**
     * <p>
     * The new status.
     * </p>
     * <p>
     * <b>Note:</b> Setting the status to PENDING_TRANSFER will result in an
     * exception being thrown. PENDING_TRANSFER is a status used internally by
     * AWS IoT. It is not intended for developer use.
     * </p>
     * <p>
     * <b>Note:</b> The status value REGISTER_INACTIVE is deprecated and should
     * not be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER,
     * REGISTER_INACTIVE, PENDING_ACTIVATION
     *
     * @param newStatus <p>
     *            The new status.
     *            </p>
     *            <p>
     *            <b>Note:</b> Setting the status to PENDING_TRANSFER will
     *            result in an exception being thrown. PENDING_TRANSFER is a
     *            status used internally by AWS IoT. It is not intended for
     *            developer use.
     *            </p>
     *            <p>
     *            <b>Note:</b> The status value REGISTER_INACTIVE is deprecated
     *            and should not be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */
    public UpdateCertificateRequest withNewStatus(CertificateStatus newStatus) {
        this.newStatus = newStatus.toString();
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
        if (getNewStatus() != null)
            sb.append("newStatus: " + getNewStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getNewStatus() == null) ? 0 : getNewStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCertificateRequest == false)
            return false;
        UpdateCertificateRequest other = (UpdateCertificateRequest) obj;

        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getNewStatus() == null ^ this.getNewStatus() == null)
            return false;
        if (other.getNewStatus() != null
                && other.getNewStatus().equals(this.getNewStatus()) == false)
            return false;
        return true;
    }
}
