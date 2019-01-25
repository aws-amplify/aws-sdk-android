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
 * Deletes the specified certificate.
 * </p>
 * <p>
 * A certificate cannot be deleted if it has a policy attached to it or if its
 * status is set to ACTIVE. To delete a certificate, first use the
 * <a>DetachPrincipalPolicy</a> API to detach all policies. Next, use the
 * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE status.
 * </p>
 */
public class DeleteCertificateRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Forces a certificate request to be deleted.
     * </p>
     */
    private Boolean forceDelete;

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
    public DeleteCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * Forces a certificate request to be deleted.
     * </p>
     *
     * @return <p>
     *         Forces a certificate request to be deleted.
     *         </p>
     */
    public Boolean isForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * Forces a certificate request to be deleted.
     * </p>
     *
     * @return <p>
     *         Forces a certificate request to be deleted.
     *         </p>
     */
    public Boolean getForceDelete() {
        return forceDelete;
    }

    /**
     * <p>
     * Forces a certificate request to be deleted.
     * </p>
     *
     * @param forceDelete <p>
     *            Forces a certificate request to be deleted.
     *            </p>
     */
    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Forces a certificate request to be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceDelete <p>
     *            Forces a certificate request to be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCertificateRequest withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
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
        if (getForceDelete() != null)
            sb.append("forceDelete: " + getForceDelete());
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
                + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCertificateRequest == false)
            return false;
        DeleteCertificateRequest other = (DeleteCertificateRequest) obj;

        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null
                && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }
}
