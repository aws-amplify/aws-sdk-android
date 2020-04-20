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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class BatchGetDevEndpointsResult implements Serializable {
    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     */
    private java.util.List<DevEndpoint> devEndpoints;

    /**
     * <p>
     * A list of <code>DevEndpoints</code> not found.
     * </p>
     */
    private java.util.List<String> devEndpointsNotFound;

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     *
     * @return <p>
     *         A list of <code>DevEndpoint</code> definitions.
     *         </p>
     */
    public java.util.List<DevEndpoint> getDevEndpoints() {
        return devEndpoints;
    }

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     *
     * @param devEndpoints <p>
     *            A list of <code>DevEndpoint</code> definitions.
     *            </p>
     */
    public void setDevEndpoints(java.util.Collection<DevEndpoint> devEndpoints) {
        if (devEndpoints == null) {
            this.devEndpoints = null;
            return;
        }

        this.devEndpoints = new java.util.ArrayList<DevEndpoint>(devEndpoints);
    }

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpoints <p>
     *            A list of <code>DevEndpoint</code> definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevEndpointsResult withDevEndpoints(DevEndpoint... devEndpoints) {
        if (getDevEndpoints() == null) {
            this.devEndpoints = new java.util.ArrayList<DevEndpoint>(devEndpoints.length);
        }
        for (DevEndpoint value : devEndpoints) {
            this.devEndpoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpoints <p>
     *            A list of <code>DevEndpoint</code> definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevEndpointsResult withDevEndpoints(
            java.util.Collection<DevEndpoint> devEndpoints) {
        setDevEndpoints(devEndpoints);
        return this;
    }

    /**
     * <p>
     * A list of <code>DevEndpoints</code> not found.
     * </p>
     *
     * @return <p>
     *         A list of <code>DevEndpoints</code> not found.
     *         </p>
     */
    public java.util.List<String> getDevEndpointsNotFound() {
        return devEndpointsNotFound;
    }

    /**
     * <p>
     * A list of <code>DevEndpoints</code> not found.
     * </p>
     *
     * @param devEndpointsNotFound <p>
     *            A list of <code>DevEndpoints</code> not found.
     *            </p>
     */
    public void setDevEndpointsNotFound(java.util.Collection<String> devEndpointsNotFound) {
        if (devEndpointsNotFound == null) {
            this.devEndpointsNotFound = null;
            return;
        }

        this.devEndpointsNotFound = new java.util.ArrayList<String>(devEndpointsNotFound);
    }

    /**
     * <p>
     * A list of <code>DevEndpoints</code> not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpointsNotFound <p>
     *            A list of <code>DevEndpoints</code> not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevEndpointsResult withDevEndpointsNotFound(String... devEndpointsNotFound) {
        if (getDevEndpointsNotFound() == null) {
            this.devEndpointsNotFound = new java.util.ArrayList<String>(devEndpointsNotFound.length);
        }
        for (String value : devEndpointsNotFound) {
            this.devEndpointsNotFound.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DevEndpoints</code> not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpointsNotFound <p>
     *            A list of <code>DevEndpoints</code> not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevEndpointsResult withDevEndpointsNotFound(
            java.util.Collection<String> devEndpointsNotFound) {
        setDevEndpointsNotFound(devEndpointsNotFound);
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
        if (getDevEndpoints() != null)
            sb.append("DevEndpoints: " + getDevEndpoints() + ",");
        if (getDevEndpointsNotFound() != null)
            sb.append("DevEndpointsNotFound: " + getDevEndpointsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDevEndpoints() == null) ? 0 : getDevEndpoints().hashCode());
        hashCode = prime * hashCode
                + ((getDevEndpointsNotFound() == null) ? 0 : getDevEndpointsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDevEndpointsResult == false)
            return false;
        BatchGetDevEndpointsResult other = (BatchGetDevEndpointsResult) obj;

        if (other.getDevEndpoints() == null ^ this.getDevEndpoints() == null)
            return false;
        if (other.getDevEndpoints() != null
                && other.getDevEndpoints().equals(this.getDevEndpoints()) == false)
            return false;
        if (other.getDevEndpointsNotFound() == null ^ this.getDevEndpointsNotFound() == null)
            return false;
        if (other.getDevEndpointsNotFound() != null
                && other.getDevEndpointsNotFound().equals(this.getDevEndpointsNotFound()) == false)
            return false;
        return true;
    }
}
