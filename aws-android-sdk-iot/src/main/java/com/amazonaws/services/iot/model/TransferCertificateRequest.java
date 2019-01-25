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
 * Transfers the specified certificate to the specified AWS account.
 * </p>
 * <p>
 * You can cancel the transfer until it is acknowledged by the recipient.
 * </p>
 * <p>
 * No notification is sent to the transfer destination's account. It is up to
 * the caller to notify the transfer target.
 * </p>
 * <p>
 * The certificate being transferred must not be in the ACTIVE state. You can
 * use the UpdateCertificate API to deactivate it.
 * </p>
 * <p>
 * The certificate must not have any policies attached to it. You can use the
 * DetachPrincipalPolicy API to detach them.
 * </p>
 */
public class TransferCertificateRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String targetAwsAccount;

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
    public TransferCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The AWS account.
     *         </p>
     */
    public String getTargetAwsAccount() {
        return targetAwsAccount;
    }

    /**
     * <p>
     * The AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param targetAwsAccount <p>
     *            The AWS account.
     *            </p>
     */
    public void setTargetAwsAccount(String targetAwsAccount) {
        this.targetAwsAccount = targetAwsAccount;
    }

    /**
     * <p>
     * The AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param targetAwsAccount <p>
     *            The AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferCertificateRequest withTargetAwsAccount(String targetAwsAccount) {
        this.targetAwsAccount = targetAwsAccount;
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
    public TransferCertificateRequest withTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
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
        if (getTargetAwsAccount() != null)
            sb.append("targetAwsAccount: " + getTargetAwsAccount() + ",");
        if (getTransferMessage() != null)
            sb.append("transferMessage: " + getTransferMessage());
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
                + ((getTargetAwsAccount() == null) ? 0 : getTargetAwsAccount().hashCode());
        hashCode = prime * hashCode
                + ((getTransferMessage() == null) ? 0 : getTransferMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferCertificateRequest == false)
            return false;
        TransferCertificateRequest other = (TransferCertificateRequest) obj;

        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getTargetAwsAccount() == null ^ this.getTargetAwsAccount() == null)
            return false;
        if (other.getTargetAwsAccount() != null
                && other.getTargetAwsAccount().equals(this.getTargetAwsAccount()) == false)
            return false;
        if (other.getTransferMessage() == null ^ this.getTransferMessage() == null)
            return false;
        if (other.getTransferMessage() != null
                && other.getTransferMessage().equals(this.getTransferMessage()) == false)
            return false;
        return true;
    }
}
