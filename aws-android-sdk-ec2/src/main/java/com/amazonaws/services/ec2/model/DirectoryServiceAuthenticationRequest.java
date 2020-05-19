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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the Active Directory to be used for client authentication.
 * </p>
 */
public class DirectoryServiceAuthenticationRequest implements Serializable {
    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     */
    private String directoryId;

    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     *
     * @return <p>
     *         The ID of the Active Directory to be used for authentication.
     *         </p>
     */
    public String getDirectoryId() {
        return directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     *
     * @param directoryId <p>
     *            The ID of the Active Directory to be used for authentication.
     *            </p>
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory to be used for authentication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directoryId <p>
     *            The ID of the Active Directory to be used for authentication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectoryServiceAuthenticationRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryServiceAuthenticationRequest == false)
            return false;
        DirectoryServiceAuthenticationRequest other = (DirectoryServiceAuthenticationRequest) obj;

        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        return true;
    }
}
