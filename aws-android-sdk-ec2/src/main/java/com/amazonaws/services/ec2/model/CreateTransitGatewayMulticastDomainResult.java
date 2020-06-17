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

public class CreateTransitGatewayMulticastDomainResult implements Serializable {
    /**
     * <p>
     * Information about the transit gateway multicast domain.
     * </p>
     */
    private TransitGatewayMulticastDomain transitGatewayMulticastDomain;

    /**
     * <p>
     * Information about the transit gateway multicast domain.
     * </p>
     *
     * @return <p>
     *         Information about the transit gateway multicast domain.
     *         </p>
     */
    public TransitGatewayMulticastDomain getTransitGatewayMulticastDomain() {
        return transitGatewayMulticastDomain;
    }

    /**
     * <p>
     * Information about the transit gateway multicast domain.
     * </p>
     *
     * @param transitGatewayMulticastDomain <p>
     *            Information about the transit gateway multicast domain.
     *            </p>
     */
    public void setTransitGatewayMulticastDomain(
            TransitGatewayMulticastDomain transitGatewayMulticastDomain) {
        this.transitGatewayMulticastDomain = transitGatewayMulticastDomain;
    }

    /**
     * <p>
     * Information about the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomain <p>
     *            Information about the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayMulticastDomainResult withTransitGatewayMulticastDomain(
            TransitGatewayMulticastDomain transitGatewayMulticastDomain) {
        this.transitGatewayMulticastDomain = transitGatewayMulticastDomain;
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
        if (getTransitGatewayMulticastDomain() != null)
            sb.append("TransitGatewayMulticastDomain: " + getTransitGatewayMulticastDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayMulticastDomain() == null) ? 0
                        : getTransitGatewayMulticastDomain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayMulticastDomainResult == false)
            return false;
        CreateTransitGatewayMulticastDomainResult other = (CreateTransitGatewayMulticastDomainResult) obj;

        if (other.getTransitGatewayMulticastDomain() == null
                ^ this.getTransitGatewayMulticastDomain() == null)
            return false;
        if (other.getTransitGatewayMulticastDomain() != null
                && other.getTransitGatewayMulticastDomain().equals(
                        this.getTransitGatewayMulticastDomain()) == false)
            return false;
        return true;
    }
}
