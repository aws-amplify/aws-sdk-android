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

/**
 * <p>
 * A certificate that has been transferred but not yet accepted.
 * </p>
 */
public class OutgoingCertificate implements Serializable {
    /**
     * <p>
     * The certificate ARN.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The certificate ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String transferredTo;

    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     */
    private java.util.Date transferDate;

    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String transferMessage;

    /**
     * <p>
     * The certificate creation date.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The certificate ARN.
     * </p>
     *
     * @return <p>
     *         The certificate ARN.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The certificate ARN.
     * </p>
     *
     * @param certificateArn <p>
     *            The certificate ARN.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The certificate ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The certificate ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutgoingCertificate withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The certificate ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The certificate ID.
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The certificate ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>64 - 64<br/>
     * <b>Pattern: </b>(0x)?[a-fA-F0-9]+<br/>
     *
     * @param certificateId <p>
     *            The certificate ID.
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The certificate ID.
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
     *            The certificate ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutgoingCertificate withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The AWS account to which the transfer was made.
     *         </p>
     */
    public String getTransferredTo() {
        return transferredTo;
    }

    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param transferredTo <p>
     *            The AWS account to which the transfer was made.
     *            </p>
     */
    public void setTransferredTo(String transferredTo) {
        this.transferredTo = transferredTo;
    }

    /**
     * <p>
     * The AWS account to which the transfer was made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param transferredTo <p>
     *            The AWS account to which the transfer was made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutgoingCertificate withTransferredTo(String transferredTo) {
        this.transferredTo = transferredTo;
        return this;
    }

    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     *
     * @return <p>
     *         The date the transfer was initiated.
     *         </p>
     */
    public java.util.Date getTransferDate() {
        return transferDate;
    }

    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     *
     * @param transferDate <p>
     *            The date the transfer was initiated.
     *            </p>
     */
    public void setTransferDate(java.util.Date transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * <p>
     * The date the transfer was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transferDate <p>
     *            The date the transfer was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutgoingCertificate withTransferDate(java.util.Date transferDate) {
        this.transferDate = transferDate;
        return this;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The transfer message.
     *         </p>
     */
    public String getTransferMessage() {
        return transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param transferMessage <p>
     *            The transfer message.
     *            </p>
     */
    public void setTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param transferMessage <p>
     *            The transfer message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutgoingCertificate withTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
        return this;
    }

    /**
     * <p>
     * The certificate creation date.
     * </p>
     *
     * @return <p>
     *         The certificate creation date.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The certificate creation date.
     * </p>
     *
     * @param creationDate <p>
     *            The certificate creation date.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The certificate creation date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The certificate creation date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutgoingCertificate withCreationDate(java.util.Date creationDate) {
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
        if (getTransferredTo() != null)
            sb.append("transferredTo: " + getTransferredTo() + ",");
        if (getTransferDate() != null)
            sb.append("transferDate: " + getTransferDate() + ",");
        if (getTransferMessage() != null)
            sb.append("transferMessage: " + getTransferMessage() + ",");
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
        hashCode = prime * hashCode
                + ((getTransferredTo() == null) ? 0 : getTransferredTo().hashCode());
        hashCode = prime * hashCode
                + ((getTransferDate() == null) ? 0 : getTransferDate().hashCode());
        hashCode = prime * hashCode
                + ((getTransferMessage() == null) ? 0 : getTransferMessage().hashCode());
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

        if (obj instanceof OutgoingCertificate == false)
            return false;
        OutgoingCertificate other = (OutgoingCertificate) obj;

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
        if (other.getTransferredTo() == null ^ this.getTransferredTo() == null)
            return false;
        if (other.getTransferredTo() != null
                && other.getTransferredTo().equals(this.getTransferredTo()) == false)
            return false;
        if (other.getTransferDate() == null ^ this.getTransferDate() == null)
            return false;
        if (other.getTransferDate() != null
                && other.getTransferDate().equals(this.getTransferDate()) == false)
            return false;
        if (other.getTransferMessage() == null ^ this.getTransferMessage() == null)
            return false;
        if (other.getTransferMessage() != null
                && other.getTransferMessage().equals(this.getTransferMessage()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
