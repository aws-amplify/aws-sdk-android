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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about a specified development endpoint.
 * </p>
 * <note>
 * <p>
 * When you create a development endpoint in a virtual private cloud (VPC), AWS
 * Glue returns only a private IP address, and the public IP address field is
 * not populated. When you create a non-VPC development endpoint, AWS Glue
 * returns only a public IP address.
 * </p>
 * </note>
 */
public class GetDevEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the <code>DevEndpoint</code> to retrieve information for.
     * </p>
     */
    private String endpointName;

    /**
     * <p>
     * Name of the <code>DevEndpoint</code> to retrieve information for.
     * </p>
     *
     * @return <p>
     *         Name of the <code>DevEndpoint</code> to retrieve information for.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * Name of the <code>DevEndpoint</code> to retrieve information for.
     * </p>
     *
     * @param endpointName <p>
     *            Name of the <code>DevEndpoint</code> to retrieve information
     *            for.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * Name of the <code>DevEndpoint</code> to retrieve information for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointName <p>
     *            Name of the <code>DevEndpoint</code> to retrieve information
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevEndpointRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevEndpointRequest == false)
            return false;
        GetDevEndpointRequest other = (GetDevEndpointRequest) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        return true;
    }
}
