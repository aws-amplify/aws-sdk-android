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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Changes the status of the specified user signing certificate from active to
 * disabled, or vice versa. This operation can be used to disable an IAM user's
 * signing certificate as part of a certificate rotation work flow.
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the user name is
 * determined implicitly based on the AWS access key ID used to sign the
 * request. This operation works for access keys under the AWS account.
 * Consequently, you can use this operation to manage AWS account root user
 * credentials even if the AWS account has no associated users.
 * </p>
 */
public class UpdateSigningCertificateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code>
     * means that the certificate can be used for API calls to AWS
     * <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user the signing certificate belongs to.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user the signing certificate belongs to.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user the signing certificate belongs to.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user the signing certificate belongs to.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSigningCertificateRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The ID of the signing certificate you want to update.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters that can consist of any upper or lowercased
     *         letter or digit.
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the signing certificate you want to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that can consist of any upper or
     *            lowercased letter or digit.
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate you want to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the signing certificate you want to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that can consist of any upper or
     *            lowercased letter or digit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSigningCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code>
     * means that the certificate can be used for API calls to AWS
     * <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return <p>
     *         The status you want to assign to the certificate.
     *         <code>Active</code> means that the certificate can be used for
     *         API calls to AWS <code>Inactive</code> means that the certificate
     *         cannot be used.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code>
     * means that the certificate can be used for API calls to AWS
     * <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the certificate.
     *            <code>Active</code> means that the certificate can be used for
     *            API calls to AWS <code>Inactive</code> means that the
     *            certificate cannot be used.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code>
     * means that the certificate can be used for API calls to AWS
     * <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the certificate.
     *            <code>Active</code> means that the certificate can be used for
     *            API calls to AWS <code>Inactive</code> means that the
     *            certificate cannot be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UpdateSigningCertificateRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code>
     * means that the certificate can be used for API calls to AWS
     * <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the certificate.
     *            <code>Active</code> means that the certificate can be used for
     *            API calls to AWS <code>Inactive</code> means that the
     *            certificate cannot be used.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status you want to assign to the certificate. <code>Active</code>
     * means that the certificate can be used for API calls to AWS
     * <code>Inactive</code> means that the certificate cannot be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status you want to assign to the certificate.
     *            <code>Active</code> means that the certificate can be used for
     *            API calls to AWS <code>Inactive</code> means that the
     *            certificate cannot be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UpdateSigningCertificateRequest withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getCertificateId() != null)
            sb.append("CertificateId: " + getCertificateId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSigningCertificateRequest == false)
            return false;
        UpdateSigningCertificateRequest other = (UpdateSigningCertificateRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
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
        return true;
    }
}
