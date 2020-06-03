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
 * Uploads an SSH public key and associates it with the specified IAM user.
 * </p>
 * <p>
 * The SSH public key uploaded by this operation can be used only for
 * authenticating the associated IAM user to an AWS CodeCommit repository. For
 * more information about using SSH keys to authenticate to an AWS CodeCommit
 * repository, see <a href=
 * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
 * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User
 * Guide</i>.
 * </p>
 */
public class UploadSSHPublicKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the IAM user to associate the SSH public key with.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format. The minimum bit-length of the public key is 2048 bits. For
     * example, you can generate a 2048-bit key, and the resulting PEM file is
     * 1679 bytes long.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String sSHPublicKeyBody;

    /**
     * <p>
     * The name of the IAM user to associate the SSH public key with.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user to associate the SSH public key with.
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
     * The name of the IAM user to associate the SSH public key with.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user to associate the SSH public key with.
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
     * The name of the IAM user to associate the SSH public key with.
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
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user to associate the SSH public key with.
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
    public UploadSSHPublicKeyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format. The minimum bit-length of the public key is 2048 bits. For
     * example, you can generate a 2048-bit key, and the resulting PEM file is
     * 1679 bytes long.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The SSH public key. The public key must be encoded in ssh-rsa
     *         format or PEM format. The minimum bit-length of the public key is
     *         2048 bits. For example, you can generate a 2048-bit key, and the
     *         resulting PEM file is 1679 bytes long.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         used to validate this parameter is a string of characters
     *         consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1
     *         Supplement character set (through <code>\u00FF</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab (<code>\u0009</code>), line feed (
     *         <code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSSHPublicKeyBody() {
        return sSHPublicKeyBody;
    }

    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format. The minimum bit-length of the public key is 2048 bits. For
     * example, you can generate a 2048-bit key, and the resulting PEM file is
     * 1679 bytes long.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param sSHPublicKeyBody <p>
     *            The SSH public key. The public key must be encoded in ssh-rsa
     *            format or PEM format. The minimum bit-length of the public key
     *            is 2048 bits. For example, you can generate a 2048-bit key,
     *            and the resulting PEM file is 1679 bytes long.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
    }

    /**
     * <p>
     * The SSH public key. The public key must be encoded in ssh-rsa format or
     * PEM format. The minimum bit-length of the public key is 2048 bits. For
     * example, you can generate a 2048-bit key, and the resulting PEM file is
     * 1679 bytes long.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param sSHPublicKeyBody <p>
     *            The SSH public key. The public key must be encoded in ssh-rsa
     *            format or PEM format. The minimum bit-length of the public key
     *            is 2048 bits. For example, you can generate a 2048-bit key,
     *            and the resulting PEM file is 1679 bytes long.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadSSHPublicKeyRequest withSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
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
        if (getSSHPublicKeyBody() != null)
            sb.append("SSHPublicKeyBody: " + getSSHPublicKeyBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getSSHPublicKeyBody() == null) ? 0 : getSSHPublicKeyBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadSSHPublicKeyRequest == false)
            return false;
        UploadSSHPublicKeyRequest other = (UploadSSHPublicKeyRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSSHPublicKeyBody() == null ^ this.getSSHPublicKeyBody() == null)
            return false;
        if (other.getSSHPublicKeyBody() != null
                && other.getSSHPublicKeyBody().equals(this.getSSHPublicKeyBody()) == false)
            return false;
        return true;
    }
}
