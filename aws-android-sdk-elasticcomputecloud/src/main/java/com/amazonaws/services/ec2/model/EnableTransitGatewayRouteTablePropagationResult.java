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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class EnableTransitGatewayRouteTablePropagationResult implements Serializable {
    /**
     * <p>
     * Information about route propagation.
     * </p>
     */
    private TransitGatewayPropagation propagation;

    /**
     * <p>
     * Information about route propagation.
     * </p>
     *
     * @return <p>
     *         Information about route propagation.
     *         </p>
     */
    public TransitGatewayPropagation getPropagation() {
        return propagation;
    }

    /**
     * <p>
     * Information about route propagation.
     * </p>
     *
     * @param propagation <p>
     *            Information about route propagation.
     *            </p>
     */
    public void setPropagation(TransitGatewayPropagation propagation) {
        this.propagation = propagation;
    }

    /**
     * <p>
     * Information about route propagation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propagation <p>
     *            Information about route propagation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableTransitGatewayRouteTablePropagationResult withPropagation(
            TransitGatewayPropagation propagation) {
        this.propagation = propagation;
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
        if (getPropagation() != null)
            sb.append("Propagation: " + getPropagation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPropagation() == null) ? 0 : getPropagation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableTransitGatewayRouteTablePropagationResult == false)
            return false;
        EnableTransitGatewayRouteTablePropagationResult other = (EnableTransitGatewayRouteTablePropagationResult) obj;

        if (other.getPropagation() == null ^ this.getPropagation() == null)
            return false;
        if (other.getPropagation() != null
                && other.getPropagation().equals(this.getPropagation()) == false)
            return false;
        return true;
    }
}
