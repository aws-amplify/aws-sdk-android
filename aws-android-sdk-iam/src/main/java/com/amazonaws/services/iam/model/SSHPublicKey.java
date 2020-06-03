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

/**
 * <p>
 * Contains information about an SSH public key.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetSSHPublicKey</a>
 * and <a>UploadSSHPublicKey</a> operations.
 * </p>
 */
public class SSHPublicKey implements Serializable {
    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String sSHPublicKeyId;

    /**
     * <p>
     * The MD5 message digest of the SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     */
    private String fingerprint;

    /**
     * <p>
     * The SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String sSHPublicKeyBody;

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the SSH public key was uploaded.
     * </p>
     */
    private java.util.Date uploadDate;

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user associated with the SSH public key.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user associated with the SSH public key.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSHPublicKey withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The unique identifier for the SSH public key.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param sSHPublicKeyId <p>
     *            The unique identifier for the SSH public key.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSHPublicKey withSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
        return this;
    }

    /**
     * <p>
     * The MD5 message digest of the SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     *
     * @return <p>
     *         The MD5 message digest of the SSH public key.
     *         </p>
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * <p>
     * The MD5 message digest of the SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     *
     * @param fingerprint <p>
     *            The MD5 message digest of the SSH public key.
     *            </p>
     */
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * <p>
     * The MD5 message digest of the SSH public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>48 - 48<br/>
     * <b>Pattern: </b>[:\w]+<br/>
     *
     * @param fingerprint <p>
     *            The MD5 message digest of the SSH public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSHPublicKey withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * <p>
     * The SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The SSH public key.
     *         </p>
     */
    public String getSSHPublicKeyBody() {
        return sSHPublicKeyBody;
    }

    /**
     * <p>
     * The SSH public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param sSHPublicKeyBody <p>
     *            The SSH public key.
     *            </p>
     */
    public void setSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
    }

    /**
     * <p>
     * The SSH public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param sSHPublicKeyBody <p>
     *            The SSH public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSHPublicKey withSSHPublicKeyBody(String sSHPublicKeyBody) {
        this.sSHPublicKeyBody = sSHPublicKeyBody;
        return this;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return <p>
     *         The status of the SSH public key. <code>Active</code> means that
     *         the key can be used for authentication with an AWS CodeCommit
     *         repository. <code>Inactive</code> means that the key cannot be
     *         used.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the SSH public key. <code>Active</code> means
     *            that the key can be used for authentication with an AWS
     *            CodeCommit repository. <code>Inactive</code> means that the
     *            key cannot be used.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the SSH public key. <code>Active</code> means
     *            that the key can be used for authentication with an AWS
     *            CodeCommit repository. <code>Inactive</code> means that the
     *            key cannot be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public SSHPublicKey withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the SSH public key. <code>Active</code> means
     *            that the key can be used for authentication with an AWS
     *            CodeCommit repository. <code>Inactive</code> means that the
     *            key cannot be used.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the SSH public key. <code>Active</code> means that the key
     * can be used for authentication with an AWS CodeCommit repository.
     * <code>Inactive</code> means that the key cannot be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the SSH public key. <code>Active</code> means
     *            that the key can be used for authentication with an AWS
     *            CodeCommit repository. <code>Inactive</code> means that the
     *            key cannot be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public SSHPublicKey withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the SSH public key was uploaded.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the SSH public key was uploaded.
     *         </p>
     */
    public java.util.Date getUploadDate() {
        return uploadDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the SSH public key was uploaded.
     * </p>
     *
     * @param uploadDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the SSH public key was uploaded.
     *            </p>
     */
    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the SSH public key was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the SSH public key was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SSHPublicKey withUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
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
        if (getFingerprint() != null)
            sb.append("Fingerprint: " + getFingerprint() + ",");
        if (getSSHPublicKeyBody() != null)
            sb.append("SSHPublicKeyBody: " + getSSHPublicKeyBody() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getUploadDate() != null)
            sb.append("UploadDate: " + getUploadDate());
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
        hashCode = prime * hashCode
                + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode());
        hashCode = prime * hashCode
                + ((getSSHPublicKeyBody() == null) ? 0 : getSSHPublicKeyBody().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSHPublicKey == false)
            return false;
        SSHPublicKey other = (SSHPublicKey) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSSHPublicKeyId() == null ^ this.getSSHPublicKeyId() == null)
            return false;
        if (other.getSSHPublicKeyId() != null
                && other.getSSHPublicKeyId().equals(this.getSSHPublicKeyId()) == false)
            return false;
        if (other.getFingerprint() == null ^ this.getFingerprint() == null)
            return false;
        if (other.getFingerprint() != null
                && other.getFingerprint().equals(this.getFingerprint()) == false)
            return false;
        if (other.getSSHPublicKeyBody() == null ^ this.getSSHPublicKeyBody() == null)
            return false;
        if (other.getSSHPublicKeyBody() != null
                && other.getSSHPublicKeyBody().equals(this.getSSHPublicKeyBody()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUploadDate() == null ^ this.getUploadDate() == null)
            return false;
        if (other.getUploadDate() != null
                && other.getUploadDate().equals(this.getUploadDate()) == false)
            return false;
        return true;
    }
}
