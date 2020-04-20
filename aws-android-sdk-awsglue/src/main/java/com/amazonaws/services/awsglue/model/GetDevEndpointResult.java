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

public class GetDevEndpointResult implements Serializable {
    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     */
    private DevEndpoint devEndpoint;

    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     *
     * @return <p>
     *         A <code>DevEndpoint</code> definition.
     *         </p>
     */
    public DevEndpoint getDevEndpoint() {
        return devEndpoint;
    }

    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     *
     * @param devEndpoint <p>
     *            A <code>DevEndpoint</code> definition.
     *            </p>
     */
    public void setDevEndpoint(DevEndpoint devEndpoint) {
        this.devEndpoint = devEndpoint;
    }

    /**
     * <p>
     * A <code>DevEndpoint</code> definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpoint <p>
     *            A <code>DevEndpoint</code> definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevEndpointResult withDevEndpoint(DevEndpoint devEndpoint) {
        this.devEndpoint = devEndpoint;
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
        if (getDevEndpoint() != null)
            sb.append("DevEndpoint: " + getDevEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDevEndpoint() == null) ? 0 : getDevEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevEndpointResult == false)
            return false;
        GetDevEndpointResult other = (GetDevEndpointResult) obj;

        if (other.getDevEndpoint() == null ^ this.getDevEndpoint() == null)
            return false;
        if (other.getDevEndpoint() != null
                && other.getDevEndpoint().equals(this.getDevEndpoint()) == false)
            return false;
        return true;
    }
}
