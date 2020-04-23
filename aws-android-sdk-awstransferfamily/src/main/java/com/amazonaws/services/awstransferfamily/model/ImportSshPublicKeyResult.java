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
 * Identifies the user, the file transfer protocol-enabled server they belong
 * to, and the identifier of the SSH public key associated with that user. A
 * user can have more than one key on each server that they are associated with.
 * </p>
 */
public class ImportSshPublicKeyResult implements Serializable {
    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * The name given to a public key by the system that was imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 21<br/>
     * <b>Pattern: </b>^key-[0-9a-f]{17}$<br/>
     */
    private String sshPublicKeyId;

    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you
     * specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     */
    private String userName;

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         A system-assigned unique identifier for a file transfer
     *         protocol-enabled server.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSshPublicKeyResult withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * The name given to a public key by the system that was imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 21<br/>
     * <b>Pattern: </b>^key-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The name given to a public key by the system that was imported.
     *         </p>
     */
    public String getSshPublicKeyId() {
        return sshPublicKeyId;
    }

    /**
     * <p>
     * The name given to a public key by the system that was imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 21<br/>
     * <b>Pattern: </b>^key-[0-9a-f]{17}$<br/>
     *
     * @param sshPublicKeyId <p>
     *            The name given to a public key by the system that was
     *            imported.
     *            </p>
     */
    public void setSshPublicKeyId(String sshPublicKeyId) {
        this.sshPublicKeyId = sshPublicKeyId;
    }

    /**
     * <p>
     * The name given to a public key by the system that was imported.
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
     *            The name given to a public key by the system that was
     *            imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSshPublicKeyResult withSshPublicKeyId(String sshPublicKeyId) {
        this.sshPublicKeyId = sshPublicKeyId;
        return this;
    }

    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you
     * specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @return <p>
     *         A user name assigned to the <code>ServerID</code> value that you
     *         specified.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you
     * specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            A user name assigned to the <code>ServerID</code> value that
     *            you specified.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A user name assigned to the <code>ServerID</code> value that you
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            A user name assigned to the <code>ServerID</code> value that
     *            you specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSshPublicKeyResult withUserName(String userName) {
        this.userName = userName;
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
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getSshPublicKeyId() != null)
            sb.append("SshPublicKeyId: " + getSshPublicKeyId() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode
                + ((getSshPublicKeyId() == null) ? 0 : getSshPublicKeyId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSshPublicKeyResult == false)
            return false;
        ImportSshPublicKeyResult other = (ImportSshPublicKeyResult) obj;

        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getSshPublicKeyId() == null ^ this.getSshPublicKeyId() == null)
            return false;
        if (other.getSshPublicKeyId() != null
                && other.getSshPublicKeyId().equals(this.getSshPublicKeyId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
