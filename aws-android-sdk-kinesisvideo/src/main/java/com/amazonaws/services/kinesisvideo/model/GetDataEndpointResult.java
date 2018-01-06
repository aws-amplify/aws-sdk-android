/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

public class GetDataEndpointResult implements Serializable {
    /**
     * The new value for the dataEndpoint property for this object.
     */
    private String dataEndpoint;

    /**
     * Returns the value of the dataEndpoint property for this object.
     *
     * @return The value of the dataEndpoint property for this object.
     */
    public String getDataEndpoint() {
        return dataEndpoint;
    }

    /**
     * Sets the value of dataEndpoint
     *
     * @param dataEndpoint The new value for the dataEndpoint property for this
     *            object.
     */
    public void setDataEndpoint(String dataEndpoint) {
        this.dataEndpoint = dataEndpoint;
    }

    /**
     * Sets the value of the dataEndpoint property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataEndpoint The new value for the dataEndpoint property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataEndpointResult withDataEndpoint(String dataEndpoint) {
        this.dataEndpoint = dataEndpoint;
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
        if (getDataEndpoint() != null)
            sb.append("DataEndpoint: " + getDataEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataEndpoint() == null) ? 0 : getDataEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataEndpointResult == false)
            return false;
        GetDataEndpointResult other = (GetDataEndpointResult) obj;

        if (other.getDataEndpoint() == null ^ this.getDataEndpoint() == null)
            return false;
        if (other.getDataEndpoint() != null
                && other.getDataEndpoint().equals(this.getDataEndpoint()) == false)
            return false;
        return true;
    }
}
