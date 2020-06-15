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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class GetGatewayResult implements Serializable {
    /**
     * <p>
     * The details of the gateway.
     * </p>
     */
    private Gateway gateway;

    /**
     * <p>
     * The details of the gateway.
     * </p>
     *
     * @return <p>
     *         The details of the gateway.
     *         </p>
     */
    public Gateway getGateway() {
        return gateway;
    }

    /**
     * <p>
     * The details of the gateway.
     * </p>
     *
     * @param gateway <p>
     *            The details of the gateway.
     *            </p>
     */
    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    /**
     * <p>
     * The details of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gateway <p>
     *            The details of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGatewayResult withGateway(Gateway gateway) {
        this.gateway = gateway;
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
        if (getGateway() != null)
            sb.append("Gateway: " + getGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGateway() == null) ? 0 : getGateway().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGatewayResult == false)
            return false;
        GetGatewayResult other = (GetGatewayResult) obj;

        if (other.getGateway() == null ^ this.getGateway() == null)
            return false;
        if (other.getGateway() != null && other.getGateway().equals(this.getGateway()) == false)
            return false;
        return true;
    }
}
