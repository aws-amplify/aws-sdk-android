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

package com.amazonaws.services.iotdata.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the DeleteThingShadow operation.
 * </p>
 */
public class DeleteThingShadowResult implements Serializable {
    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     *
     * @return <p>
     *         The state information, in JSON format.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     *
     * @param payload <p>
     *            The state information, in JSON format.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            The state information, in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteThingShadowResult withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
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
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteThingShadowResult == false)
            return false;
        DeleteThingShadowResult other = (DeleteThingShadowResult) obj;

        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
