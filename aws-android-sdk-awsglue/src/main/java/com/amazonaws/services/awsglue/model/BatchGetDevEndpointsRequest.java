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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of resource metadata for a given list of development endpoint
 * names. After calling the <code>ListDevEndpoints</code> operation, you can
 * call this operation to access the data to which you have been granted
 * permissions. This operation supports all IAM permissions, including
 * permission conditions that uses tags.
 * </p>
 */
public class BatchGetDevEndpointsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The list of <code>DevEndpoint</code> names, which might be the names
     * returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     */
    private java.util.List<String> devEndpointNames;

    /**
     * <p>
     * The list of <code>DevEndpoint</code> names, which might be the names
     * returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     *
     * @return <p>
     *         The list of <code>DevEndpoint</code> names, which might be the
     *         names returned from the <code>ListDevEndpoint</code> operation.
     *         </p>
     */
    public java.util.List<String> getDevEndpointNames() {
        return devEndpointNames;
    }

    /**
     * <p>
     * The list of <code>DevEndpoint</code> names, which might be the names
     * returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     *
     * @param devEndpointNames <p>
     *            The list of <code>DevEndpoint</code> names, which might be the
     *            names returned from the <code>ListDevEndpoint</code>
     *            operation.
     *            </p>
     */
    public void setDevEndpointNames(java.util.Collection<String> devEndpointNames) {
        if (devEndpointNames == null) {
            this.devEndpointNames = null;
            return;
        }

        this.devEndpointNames = new java.util.ArrayList<String>(devEndpointNames);
    }

    /**
     * <p>
     * The list of <code>DevEndpoint</code> names, which might be the names
     * returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpointNames <p>
     *            The list of <code>DevEndpoint</code> names, which might be the
     *            names returned from the <code>ListDevEndpoint</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevEndpointsRequest withDevEndpointNames(String... devEndpointNames) {
        if (getDevEndpointNames() == null) {
            this.devEndpointNames = new java.util.ArrayList<String>(devEndpointNames.length);
        }
        for (String value : devEndpointNames) {
            this.devEndpointNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>DevEndpoint</code> names, which might be the names
     * returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpointNames <p>
     *            The list of <code>DevEndpoint</code> names, which might be the
     *            names returned from the <code>ListDevEndpoint</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDevEndpointsRequest withDevEndpointNames(
            java.util.Collection<String> devEndpointNames) {
        setDevEndpointNames(devEndpointNames);
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
        if (getDevEndpointNames() != null)
            sb.append("DevEndpointNames: " + getDevEndpointNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDevEndpointNames() == null) ? 0 : getDevEndpointNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDevEndpointsRequest == false)
            return false;
        BatchGetDevEndpointsRequest other = (BatchGetDevEndpointsRequest) obj;

        if (other.getDevEndpointNames() == null ^ this.getDevEndpointNames() == null)
            return false;
        if (other.getDevEndpointNames() != null
                && other.getDevEndpointNames().equals(this.getDevEndpointNames()) == false)
            return false;
        return true;
    }
}
