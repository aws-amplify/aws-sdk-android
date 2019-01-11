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

public class GetUserEndpointsResult implements Serializable {
    /**
     * List of endpoints
     */
    private EndpointsResponse endpointsResponse;

    /**
     * List of endpoints
     *
     * @return List of endpoints
     */
    public EndpointsResponse getEndpointsResponse() {
        return endpointsResponse;
    }

    /**
     * List of endpoints
     *
     * @param endpointsResponse List of endpoints
     */
    public void setEndpointsResponse(EndpointsResponse endpointsResponse) {
        this.endpointsResponse = endpointsResponse;
    }

    /**
     * List of endpoints
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointsResponse List of endpoints
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserEndpointsResult withEndpointsResponse(EndpointsResponse endpointsResponse) {
        this.endpointsResponse = endpointsResponse;
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
        if (getEndpointsResponse() != null)
            sb.append("EndpointsResponse: " + getEndpointsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointsResponse() == null) ? 0 : getEndpointsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserEndpointsResult == false)
            return false;
        GetUserEndpointsResult other = (GetUserEndpointsResult) obj;

        if (other.getEndpointsResponse() == null ^ this.getEndpointsResponse() == null)
            return false;
        if (other.getEndpointsResponse() != null
                && other.getEndpointsResponse().equals(this.getEndpointsResponse()) == false)
            return false;
        return true;
    }
}
