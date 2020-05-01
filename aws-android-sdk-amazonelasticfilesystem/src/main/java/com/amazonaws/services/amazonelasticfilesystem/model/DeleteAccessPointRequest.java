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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified access point. After deletion is complete, new clients
 * can no longer connect to the access points. Clients connected to the access
 * point at the time of deletion will continue to function until they terminate
 * their connection.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DeleteAccessPoint</code> action.
 * </p>
 */
public class DeleteAccessPointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the access point that you want to delete.
     * </p>
     */
    private String accessPointId;

    /**
     * <p>
     * The ID of the access point that you want to delete.
     * </p>
     *
     * @return <p>
     *         The ID of the access point that you want to delete.
     *         </p>
     */
    public String getAccessPointId() {
        return accessPointId;
    }

    /**
     * <p>
     * The ID of the access point that you want to delete.
     * </p>
     *
     * @param accessPointId <p>
     *            The ID of the access point that you want to delete.
     *            </p>
     */
    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * The ID of the access point that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPointId <p>
     *            The ID of the access point that you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAccessPointRequest withAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
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
        if (getAccessPointId() != null)
            sb.append("AccessPointId: " + getAccessPointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccessPointRequest == false)
            return false;
        DeleteAccessPointRequest other = (DeleteAccessPointRequest) obj;

        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null
                && other.getAccessPointId().equals(this.getAccessPointId()) == false)
            return false;
        return true;
    }
}
