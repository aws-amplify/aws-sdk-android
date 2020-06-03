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
 * Deletes a signing certificate associated with the specified IAM user.
 * </p>
 * <p>
 * If you do not specify a user name, IAM determines the user name implicitly
 * based on the AWS access key ID signing the request. This operation works for
 * access keys under the AWS account. Consequently, you can use this operation
 * to manage AWS account root user credentials even if the AWS account has no
 * associated IAM users.
 * </p>
 */
public class DeleteSigningCertificateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the user the signing certificate belongs to.
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
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a
     * href="http://wikipedia.org/wiki/regex">regex</a> pattern, is a string of
     * characters that can be upper- or lower-cased letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String certificateId;

    /**
     * <p>
     * The name of the user the signing certificate belongs to.
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
     *         The name of the user the signing certificate belongs to.
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
     * The name of the user the signing certificate belongs to.
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
     *            The name of the user the signing certificate belongs to.
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
     * The name of the user the signing certificate belongs to.
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
     *            The name of the user the signing certificate belongs to.
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
    public DeleteSigningCertificateRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a
     * href="http://wikipedia.org/wiki/regex">regex</a> pattern, is a string of
     * characters that can be upper- or lower-cased letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The ID of the signing certificate to delete.
     *         </p>
     *         <p>
     *         The format of this parameter, as described by its <a
     *         href="http://wikipedia.org/wiki/regex">regex</a> pattern, is a
     *         string of characters that can be upper- or lower-cased letters or
     *         digits.
     *         </p>
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a
     * href="http://wikipedia.org/wiki/regex">regex</a> pattern, is a string of
     * characters that can be upper- or lower-cased letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param certificateId <p>
     *            The ID of the signing certificate to delete.
     *            </p>
     *            <p>
     *            The format of this parameter, as described by its <a
     *            href="http://wikipedia.org/wiki/regex">regex</a> pattern, is a
     *            string of characters that can be upper- or lower-cased letters
     *            or digits.
     *            </p>
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the signing certificate to delete.
     * </p>
     * <p>
     * The format of this parameter, as described by its <a
     * href="http://wikipedia.org/wiki/regex">regex</a> pattern, is a string of
     * characters that can be upper- or lower-cased letters or digits.
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
     *            The ID of the signing certificate to delete.
     *            </p>
     *            <p>
     *            The format of this parameter, as described by its <a
     *            href="http://wikipedia.org/wiki/regex">regex</a> pattern, is a
     *            string of characters that can be upper- or lower-cased letters
     *            or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSigningCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
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
            sb.append("CertificateId: " + getCertificateId());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSigningCertificateRequest == false)
            return false;
        DeleteSigningCertificateRequest other = (DeleteSigningCertificateRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        return true;
    }
}
