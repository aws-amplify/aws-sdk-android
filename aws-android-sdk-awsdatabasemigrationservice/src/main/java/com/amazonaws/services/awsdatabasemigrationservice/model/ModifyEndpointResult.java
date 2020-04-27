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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class ModifyEndpointResult implements Serializable {
    /**
     * <p>
     * The modified endpoint.
     * </p>
     */
    private Endpoint endpoint;

    /**
     * <p>
     * The modified endpoint.
     * </p>
     *
     * @return <p>
     *         The modified endpoint.
     *         </p>
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The modified endpoint.
     * </p>
     *
     * @param endpoint <p>
     *            The modified endpoint.
     *            </p>
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The modified endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The modified endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEndpointResult withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
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
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEndpointResult == false)
            return false;
        ModifyEndpointResult other = (ModifyEndpointResult) obj;

        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }
}
