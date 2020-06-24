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
 * Contains the response to a successful <a>GetSSHPublicKey</a> request.
 * </p>
 */
public class GetSSHPublicKeyResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the SSH public key.
     * </p>
     */
    private SSHPublicKey sSHPublicKey;

    /**
     * <p>
     * A structure containing details about the SSH public key.
     * </p>
     *
     * @return <p>
     *         A structure containing details about the SSH public key.
     *         </p>
     */
    public SSHPublicKey getSSHPublicKey() {
        return sSHPublicKey;
    }

    /**
     * <p>
     * A structure containing details about the SSH public key.
     * </p>
     *
     * @param sSHPublicKey <p>
     *            A structure containing details about the SSH public key.
     *            </p>
     */
    public void setSSHPublicKey(SSHPublicKey sSHPublicKey) {
        this.sSHPublicKey = sSHPublicKey;
    }

    /**
     * <p>
     * A structure containing details about the SSH public key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSHPublicKey <p>
     *            A structure containing details about the SSH public key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSSHPublicKeyResult withSSHPublicKey(SSHPublicKey sSHPublicKey) {
        this.sSHPublicKey = sSHPublicKey;
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
        if (getSSHPublicKey() != null)
            sb.append("SSHPublicKey: " + getSSHPublicKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSSHPublicKey() == null) ? 0 : getSSHPublicKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSSHPublicKeyResult == false)
            return false;
        GetSSHPublicKeyResult other = (GetSSHPublicKeyResult) obj;

        if (other.getSSHPublicKey() == null ^ this.getSSHPublicKey() == null)
            return false;
        if (other.getSSHPublicKey() != null
                && other.getSSHPublicKey().equals(this.getSSHPublicKey()) == false)
            return false;
        return true;
    }
}
