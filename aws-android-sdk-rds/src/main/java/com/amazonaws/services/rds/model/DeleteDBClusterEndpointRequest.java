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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class DeleteDBClusterEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier associated with the custom endpoint. This parameter is
     * stored as a lowercase string.
     * </p>
     */
    private String dBClusterEndpointIdentifier;

    /**
     * <p>
     * The identifier associated with the custom endpoint. This parameter is
     * stored as a lowercase string.
     * </p>
     *
     * @return <p>
     *         The identifier associated with the custom endpoint. This
     *         parameter is stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterEndpointIdentifier() {
        return dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier associated with the custom endpoint. This parameter is
     * stored as a lowercase string.
     * </p>
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier associated with the custom endpoint. This
     *            parameter is stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier associated with the custom endpoint. This parameter is
     * stored as a lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier associated with the custom endpoint. This
     *            parameter is stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBClusterEndpointRequest withDBClusterEndpointIdentifier(
            String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
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
        if (getDBClusterEndpointIdentifier() != null)
            sb.append("DBClusterEndpointIdentifier: " + getDBClusterEndpointIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterEndpointIdentifier() == null) ? 0
                        : getDBClusterEndpointIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBClusterEndpointRequest == false)
            return false;
        DeleteDBClusterEndpointRequest other = (DeleteDBClusterEndpointRequest) obj;

        if (other.getDBClusterEndpointIdentifier() == null
                ^ this.getDBClusterEndpointIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointIdentifier() != null
                && other.getDBClusterEndpointIdentifier().equals(
                        this.getDBClusterEndpointIdentifier()) == false)
            return false;
        return true;
    }
}
