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
 * Retrieves the specified SSH public key, including metadata about the key.
 * </p>
 * <p>
 * The SSH public key retrieved by this operation is used only for
 * authenticating the associated IAM user to an AWS CodeCommit repository. For
 * more information about using SSH keys to authenticate to an AWS CodeCommit
 * repository, see <a href=
 * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
 * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User
 * Guide</i>.
 * </p>
 */
public class GetSSHPublicKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
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
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String sSHPublicKeyId;

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSH, PEM
     */
    private String encoding;

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
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
     *         The name of the IAM user associated with the SSH public key.
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
     * The name of the IAM user associated with the SSH public key.
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
     *            The name of the IAM user associated with the SSH public key.
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
     * The name of the IAM user associated with the SSH public key.
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
     *            The name of the IAM user associated with the SSH public key.
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
    public GetSSHPublicKeyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The unique identifier for the SSH public key.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters that can consist of any upper or lowercased
     *         letter or digit.
     *         </p>
     */
    public String getSSHPublicKeyId() {
        return sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param sSHPublicKeyId <p>
     *            The unique identifier for the SSH public key.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that can consist of any upper or
     *            lowercased letter or digit.
     *            </p>
     */
    public void setSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
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
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param sSHPublicKeyId <p>
     *            The unique identifier for the SSH public key.
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
    public GetSSHPublicKeyRequest withSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSH, PEM
     *
     * @return <p>
     *         Specifies the public key encoding format to use in the response.
     *         To retrieve the public key in ssh-rsa format, use
     *         <code>SSH</code>. To retrieve the public key in PEM format, use
     *         <code>PEM</code>.
     *         </p>
     * @see EncodingType
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSH, PEM
     *
     * @param encoding <p>
     *            Specifies the public key encoding format to use in the
     *            response. To retrieve the public key in ssh-rsa format, use
     *            <code>SSH</code>. To retrieve the public key in PEM format,
     *            use <code>PEM</code>.
     *            </p>
     * @see EncodingType
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSH, PEM
     *
     * @param encoding <p>
     *            Specifies the public key encoding format to use in the
     *            response. To retrieve the public key in ssh-rsa format, use
     *            <code>SSH</code>. To retrieve the public key in PEM format,
     *            use <code>PEM</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public GetSSHPublicKeyRequest withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSH, PEM
     *
     * @param encoding <p>
     *            Specifies the public key encoding format to use in the
     *            response. To retrieve the public key in ssh-rsa format, use
     *            <code>SSH</code>. To retrieve the public key in PEM format,
     *            use <code>PEM</code>.
     *            </p>
     * @see EncodingType
     */
    public void setEncoding(EncodingType encoding) {
        this.encoding = encoding.toString();
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSH, PEM
     *
     * @param encoding <p>
     *            Specifies the public key encoding format to use in the
     *            response. To retrieve the public key in ssh-rsa format, use
     *            <code>SSH</code>. To retrieve the public key in PEM format,
     *            use <code>PEM</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public GetSSHPublicKeyRequest withEncoding(EncodingType encoding) {
        this.encoding = encoding.toString();
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
        if (getSSHPublicKeyId() != null)
            sb.append("SSHPublicKeyId: " + getSSHPublicKeyId() + ",");
        if (getEncoding() != null)
            sb.append("Encoding: " + getEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getSSHPublicKeyId() == null) ? 0 : getSSHPublicKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSSHPublicKeyRequest == false)
            return false;
        GetSSHPublicKeyRequest other = (GetSSHPublicKeyRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSSHPublicKeyId() == null ^ this.getSSHPublicKeyId() == null)
            return false;
        if (other.getSSHPublicKeyId() != null
                && other.getSSHPublicKeyId().equals(this.getSSHPublicKeyId()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        return true;
    }
}
