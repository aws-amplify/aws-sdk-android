/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetEndpointResult implements Serializable {
    /**
     * Endpoint response
     */
    private EndpointResponse endpointResponse;

    /**
     * Endpoint response
     *
     * @return Endpoint response
     */
    public EndpointResponse getEndpointResponse() {
        return endpointResponse;
    }

    /**
     * Endpoint response
     *
     * @param endpointResponse Endpoint response
     */
    public void setEndpointResponse(EndpointResponse endpointResponse) {
        this.endpointResponse = endpointResponse;
    }

    /**
     * Endpoint response
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointResponse Endpoint response
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEndpointResult withEndpointResponse(EndpointResponse endpointResponse) {
        this.endpointResponse = endpointResponse;
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
        if (getEndpointResponse() != null)
            sb.append("EndpointResponse: " + getEndpointResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointResponse() == null) ? 0 : getEndpointResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEndpointResult == false)
            return false;
        GetEndpointResult other = (GetEndpointResult) obj;

        if (other.getEndpointResponse() == null ^ this.getEndpointResponse() == null)
            return false;
        if (other.getEndpointResponse() != null
                && other.getEndpointResponse().equals(this.getEndpointResponse()) == false)
            return false;
        return true;
    }
}
