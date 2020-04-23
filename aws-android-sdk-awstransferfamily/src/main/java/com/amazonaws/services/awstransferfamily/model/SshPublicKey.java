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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the public Secure Shell (SSH) key that is
 * associated with a user account for the specific file transfer
 * protocol-enabled server (as identified by <code>ServerId</code>). The
 * information returned includes the date the key was imported, the public key
 * contents, and the public key ID. A user can store more than one SSH public
 * key associated with their user name on a specific server.
 * </p>
 */
public class SshPublicKey implements Serializable {
    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     */
    private java.util.Date dateImported;

    /**
     * <p>
     * The content of the SSH public key as specified by the
     * <code>PublicKeyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^ssh-rsa\s+[A-Za-z0-9+/]+[=]{0,3}(\s+.+)?\s*$<br/>
     */
    private String sshPublicKeyBody;

    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the
     * public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 21<br/>
     * <b>Pattern: </b>^key-[0-9a-f]{17}$<br/>
     */
    private String sshPublicKeyId;

    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     *
     * @return <p>
     *         The date that the public key was added to the user account.
     *         </p>
     */
    public java.util.Date getDateImported() {
        return dateImported;
    }

    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     *
     * @param dateImported <p>
     *            The date that the public key was added to the user account.
     *            </p>
     */
    public void setDateImported(java.util.Date dateImported) {
        this.dateImported = dateImported;
    }

    /**
     * <p>
     * The date that the public key was added to the user account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateImported <p>
     *            The date that the public key was added to the user account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SshPublicKey withDateImported(java.util.Date dateImported) {
        this.dateImported = dateImported;
        return this;
    }

    /**
     * <p>
     * The content of the SSH public key as specified by the
     * <code>PublicKeyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^ssh-rsa\s+[A-Za-z0-9+/]+[=]{0,3}(\s+.+)?\s*$<br/>
     *
     * @return <p>
     *         The content of the SSH public key as specified by the
     *         <code>PublicKeyId</code>.
     *         </p>
     */
    public String getSshPublicKeyBody() {
        return sshPublicKeyBody;
    }

    /**
     * <p>
     * The content of the SSH public key as specified by the
     * <code>PublicKeyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^ssh-rsa\s+[A-Za-z0-9+/]+[=]{0,3}(\s+.+)?\s*$<br/>
     *
     * @param sshPublicKeyBody <p>
     *            The content of the SSH public key as specified by the
     *            <code>PublicKeyId</code>.
     *            </p>
     */
    public void setSshPublicKeyBody(String sshPublicKeyBody) {
        this.sshPublicKeyBody = sshPublicKeyBody;
    }

    /**
     * <p>
     * The content of the SSH public key as specified by the
     * <code>PublicKeyId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^ssh-rsa\s+[A-Za-z0-9+/]+[=]{0,3}(\s+.+)?\s*$<br/>
     *
     * @param sshPublicKeyBody <p>
     *            The content of the SSH public key as specified by the
     *            <code>PublicKeyId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SshPublicKey withSshPublicKeyBody(String sshPublicKeyBody) {
        this.sshPublicKeyBody = sshPublicKeyBody;
        return this;
    }

    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the
     * public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 21<br/>
     * <b>Pattern: </b>^key-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The <code>SshPublicKeyId</code> parameter contains the identifier
     *         of the public key.
     *         </p>
     */
    public String getSshPublicKeyId() {
        return sshPublicKeyId;
    }

    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the
     * public key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 21<br/>
     * <b>Pattern: </b>^key-[0-9a-f]{17}$<br/>
     *
     * @param sshPublicKeyId <p>
     *            The <code>SshPublicKeyId</code> parameter contains the
     *            identifier of the public key.
     *            </p>
     */
    public void setSshPublicKeyId(String sshPublicKeyId) {
        this.sshPublicKeyId = sshPublicKeyId;
    }

    /**
     * <p>
     * The <code>SshPublicKeyId</code> parameter contains the identifier of the
     * public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 21<br/>
     * <b>Pattern: </b>^key-[0-9a-f]{17}$<br/>
     *
     * @param sshPublicKeyId <p>
     *            The <code>SshPublicKeyId</code> parameter contains the
     *            identifier of the public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SshPublicKey withSshPublicKeyId(String sshPublicKeyId) {
        this.sshPublicKeyId = sshPublicKeyId;
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
        if (getDateImported() != null)
            sb.append("DateImported: " + getDateImported() + ",");
        if (getSshPublicKeyBody() != null)
            sb.append("SshPublicKeyBody: " + getSshPublicKeyBody() + ",");
        if (getSshPublicKeyId() != null)
            sb.append("SshPublicKeyId: " + getSshPublicKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDateImported() == null) ? 0 : getDateImported().hashCode());
        hashCode = prime * hashCode
                + ((getSshPublicKeyBody() == null) ? 0 : getSshPublicKeyBody().hashCode());
        hashCode = prime * hashCode
                + ((getSshPublicKeyId() == null) ? 0 : getSshPublicKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SshPublicKey == false)
            return false;
        SshPublicKey other = (SshPublicKey) obj;

        if (other.getDateImported() == null ^ this.getDateImported() == null)
            return false;
        if (other.getDateImported() != null
                && other.getDateImported().equals(this.getDateImported()) == false)
            return false;
        if (other.getSshPublicKeyBody() == null ^ this.getSshPublicKeyBody() == null)
            return false;
        if (other.getSshPublicKeyBody() != null
                && other.getSshPublicKeyBody().equals(this.getSshPublicKeyBody()) == false)
            return false;
        if (other.getSshPublicKeyId() == null ^ this.getSshPublicKeyId() == null)
            return false;
        if (other.getSshPublicKeyId() != null
                && other.getSshPublicKeyId().equals(this.getSshPublicKeyId()) == false)
            return false;
        return true;
    }
}
