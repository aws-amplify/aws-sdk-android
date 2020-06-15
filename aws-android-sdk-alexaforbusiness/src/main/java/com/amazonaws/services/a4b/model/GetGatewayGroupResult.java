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

public class GetGatewayGroupResult implements Serializable {
    /**
     * <p>
     * The details of the gateway group.
     * </p>
     */
    private GatewayGroup gatewayGroup;

    /**
     * <p>
     * The details of the gateway group.
     * </p>
     *
     * @return <p>
     *         The details of the gateway group.
     *         </p>
     */
    public GatewayGroup getGatewayGroup() {
        return gatewayGroup;
    }

    /**
     * <p>
     * The details of the gateway group.
     * </p>
     *
     * @param gatewayGroup <p>
     *            The details of the gateway group.
     *            </p>
     */
    public void setGatewayGroup(GatewayGroup gatewayGroup) {
        this.gatewayGroup = gatewayGroup;
    }

    /**
     * <p>
     * The details of the gateway group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayGroup <p>
     *            The details of the gateway group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGatewayGroupResult withGatewayGroup(GatewayGroup gatewayGroup) {
        this.gatewayGroup = gatewayGroup;
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
        if (getGatewayGroup() != null)
            sb.append("GatewayGroup: " + getGatewayGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGatewayGroup() == null) ? 0 : getGatewayGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGatewayGroupResult == false)
            return false;
        GetGatewayGroupResult other = (GetGatewayGroupResult) obj;

        if (other.getGatewayGroup() == null ^ this.getGatewayGroup() == null)
            return false;
        if (other.getGatewayGroup() != null
                && other.getGatewayGroup().equals(this.getGatewayGroup()) == false)
            return false;
        return true;
    }
}
