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
 * Updates the name and/or the path of the specified server certificate stored
 * in IAM.
 * </p>
 * <p>
 * For more information about working with server certificates, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
 * >Working with Server Certificates</a> in the <i>IAM User Guide</i>. This
 * topic also includes a list of AWS services that can use the server
 * certificates that you manage with IAM.
 * </p>
 * <important>
 * <p>
 * You should understand the implications of changing a server certificate's
 * path or name. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts"
 * >Renaming a Server Certificate</a> in the <i>IAM User Guide</i>.
 * </p>
 * </important> <note>
 * <p>
 * The person making the request (the principal), must have permission to change
 * the server certificate with the old name and the new name. For example, to
 * change the certificate named <code>ProductionCert</code> to
 * <code>ProdCert</code>, the principal must have a policy that allows them to
 * update both certificates. If the principal has permission to update the
 * <code>ProductionCert</code> group, but not the <code>ProdCert</code>
 * certificate, then the update fails. For more information about permissions,
 * see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
 * Management</a> in the <i>IAM User Guide</i>.
 * </p>
 * </note>
 */
public class UpdateServerCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the server certificate that you want to update.
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
    private String serverCertificateName;

    /**
     * <p>
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String newPath;

    /**
     * <p>
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name. The name of the certificate
     * cannot contain any spaces.
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
    private String newServerCertificateName;

    /**
     * <p>
     * The name of the server certificate that you want to update.
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
     *         The name of the server certificate that you want to update.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getServerCertificateName() {
        return serverCertificateName;
    }

    /**
     * <p>
     * The name of the server certificate that you want to update.
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
     * @param serverCertificateName <p>
     *            The name of the server certificate that you want to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }

    /**
     * <p>
     * The name of the server certificate that you want to update.
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
     * @param serverCertificateName <p>
     *            The name of the server certificate that you want to update.
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
    public UpdateServerCertificateRequest withServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }

    /**
     * <p>
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return <p>
     *         The new path for the server certificate. Include this only if you
     *         are updating the server certificate's path.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of either a forward slash (/) by
     *         itself or a string that must begin and end with forward slashes.
     *         In addition, it can contain any ASCII character from the ! (
     *         <code>\u0021</code>) through the DEL character (
     *         <code>\u007F</code>), including most punctuation characters,
     *         digits, and upper and lowercased letters.
     *         </p>
     */
    public String getNewPath() {
        return newPath;
    }

    /**
     * <p>
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath <p>
     *            The new path for the server certificate. Include this only if
     *            you are updating the server certificate's path.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    /**
     * <p>
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath <p>
     *            The new path for the server certificate. Include this only if
     *            you are updating the server certificate's path.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServerCertificateRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * <p>
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name. The name of the certificate
     * cannot contain any spaces.
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
     *         The new name for the server certificate. Include this only if you
     *         are updating the server certificate's name. The name of the
     *         certificate cannot contain any spaces.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getNewServerCertificateName() {
        return newServerCertificateName;
    }

    /**
     * <p>
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name. The name of the certificate
     * cannot contain any spaces.
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
     * @param newServerCertificateName <p>
     *            The new name for the server certificate. Include this only if
     *            you are updating the server certificate's name. The name of
     *            the certificate cannot contain any spaces.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setNewServerCertificateName(String newServerCertificateName) {
        this.newServerCertificateName = newServerCertificateName;
    }

    /**
     * <p>
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name. The name of the certificate
     * cannot contain any spaces.
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
     * @param newServerCertificateName <p>
     *            The new name for the server certificate. Include this only if
     *            you are updating the server certificate's name. The name of
     *            the certificate cannot contain any spaces.
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
    public UpdateServerCertificateRequest withNewServerCertificateName(
            String newServerCertificateName) {
        this.newServerCertificateName = newServerCertificateName;
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
        if (getServerCertificateName() != null)
            sb.append("ServerCertificateName: " + getServerCertificateName() + ",");
        if (getNewPath() != null)
            sb.append("NewPath: " + getNewPath() + ",");
        if (getNewServerCertificateName() != null)
            sb.append("NewServerCertificateName: " + getNewServerCertificateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode());
        hashCode = prime * hashCode + ((getNewPath() == null) ? 0 : getNewPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewServerCertificateName() == null) ? 0 : getNewServerCertificateName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServerCertificateRequest == false)
            return false;
        UpdateServerCertificateRequest other = (UpdateServerCertificateRequest) obj;

        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null)
            return false;
        if (other.getServerCertificateName() != null
                && other.getServerCertificateName().equals(this.getServerCertificateName()) == false)
            return false;
        if (other.getNewPath() == null ^ this.getNewPath() == null)
            return false;
        if (other.getNewPath() != null && other.getNewPath().equals(this.getNewPath()) == false)
            return false;
        if (other.getNewServerCertificateName() == null
                ^ this.getNewServerCertificateName() == null)
            return false;
        if (other.getNewServerCertificateName() != null
                && other.getNewServerCertificateName().equals(this.getNewServerCertificateName()) == false)
            return false;
        return true;
    }
}
