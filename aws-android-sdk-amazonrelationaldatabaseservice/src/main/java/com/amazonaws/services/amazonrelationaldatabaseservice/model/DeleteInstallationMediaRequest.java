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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the installation medium for a DB engine that requires an on-premises
 * customer provided license, such as Microsoft SQL Server.
 * </p>
 */
public class DeleteInstallationMediaRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The installation medium ID.
     * </p>
     */
    private String installationMediaId;

    /**
     * <p>
     * The installation medium ID.
     * </p>
     *
     * @return <p>
     *         The installation medium ID.
     *         </p>
     */
    public String getInstallationMediaId() {
        return installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     *
     * @param installationMediaId <p>
     *            The installation medium ID.
     *            </p>
     */
    public void setInstallationMediaId(String installationMediaId) {
        this.installationMediaId = installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param installationMediaId <p>
     *            The installation medium ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInstallationMediaRequest withInstallationMediaId(String installationMediaId) {
        this.installationMediaId = installationMediaId;
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
        if (getInstallationMediaId() != null)
            sb.append("InstallationMediaId: " + getInstallationMediaId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstallationMediaId() == null) ? 0 : getInstallationMediaId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstallationMediaRequest == false)
            return false;
        DeleteInstallationMediaRequest other = (DeleteInstallationMediaRequest) obj;

        if (other.getInstallationMediaId() == null ^ this.getInstallationMediaId() == null)
            return false;
        if (other.getInstallationMediaId() != null
                && other.getInstallationMediaId().equals(this.getInstallationMediaId()) == false)
            return false;
        return true;
    }
}
