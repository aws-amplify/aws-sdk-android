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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for CreateMultiplexResponse
 */
public class CreateMultiplexResult implements Serializable {
    /**
     * The newly created multiplex.
     */
    private Multiplex multiplex;

    /**
     * The newly created multiplex.
     *
     * @return The newly created multiplex.
     */
    public Multiplex getMultiplex() {
        return multiplex;
    }

    /**
     * The newly created multiplex.
     *
     * @param multiplex The newly created multiplex.
     */
    public void setMultiplex(Multiplex multiplex) {
        this.multiplex = multiplex;
    }

    /**
     * The newly created multiplex.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplex The newly created multiplex.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMultiplexResult withMultiplex(Multiplex multiplex) {
        this.multiplex = multiplex;
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
        if (getMultiplex() != null)
            sb.append("Multiplex: " + getMultiplex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiplex() == null) ? 0 : getMultiplex().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMultiplexResult == false)
            return false;
        CreateMultiplexResult other = (CreateMultiplexResult) obj;

        if (other.getMultiplex() == null ^ this.getMultiplex() == null)
            return false;
        if (other.getMultiplex() != null
                && other.getMultiplex().equals(this.getMultiplex()) == false)
            return false;
        return true;
    }
}
