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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Rotates the encryption keys for a cluster.
 * </p>
 */
public class RotateEncryptionKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the
     * encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption
     * enabled.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the
     * encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption
     * enabled.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster that you want to rotate the
     *         encryption keys for.
     *         </p>
     *         <p>
     *         Constraints: Must be the name of valid cluster that has
     *         encryption enabled.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the
     * encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption
     * enabled.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster that you want to rotate
     *            the encryption keys for.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of valid cluster that has
     *            encryption enabled.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that you want to rotate the
     * encryption keys for.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster that has encryption
     * enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster that you want to rotate
     *            the encryption keys for.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of valid cluster that has
     *            encryption enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RotateEncryptionKeyRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotateEncryptionKeyRequest == false)
            return false;
        RotateEncryptionKeyRequest other = (RotateEncryptionKeyRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        return true;
    }
}
