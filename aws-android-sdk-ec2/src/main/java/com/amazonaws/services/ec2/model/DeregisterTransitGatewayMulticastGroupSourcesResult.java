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

public class DeregisterTransitGatewayMulticastGroupSourcesResult implements Serializable {
    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     */
    private TransitGatewayMulticastDeregisteredGroupSources deregisteredMulticastGroupSources;

    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     *
     * @return <p>
     *         Information about the deregistered group sources.
     *         </p>
     */
    public TransitGatewayMulticastDeregisteredGroupSources getDeregisteredMulticastGroupSources() {
        return deregisteredMulticastGroupSources;
    }

    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     *
     * @param deregisteredMulticastGroupSources <p>
     *            Information about the deregistered group sources.
     *            </p>
     */
    public void setDeregisteredMulticastGroupSources(
            TransitGatewayMulticastDeregisteredGroupSources deregisteredMulticastGroupSources) {
        this.deregisteredMulticastGroupSources = deregisteredMulticastGroupSources;
    }

    /**
     * <p>
     * Information about the deregistered group sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deregisteredMulticastGroupSources <p>
     *            Information about the deregistered group sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterTransitGatewayMulticastGroupSourcesResult withDeregisteredMulticastGroupSources(
            TransitGatewayMulticastDeregisteredGroupSources deregisteredMulticastGroupSources) {
        this.deregisteredMulticastGroupSources = deregisteredMulticastGroupSources;
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
        if (getDeregisteredMulticastGroupSources() != null)
            sb.append("DeregisteredMulticastGroupSources: "
                    + getDeregisteredMulticastGroupSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDeregisteredMulticastGroupSources() == null) ? 0
                        : getDeregisteredMulticastGroupSources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTransitGatewayMulticastGroupSourcesResult == false)
            return false;
        DeregisterTransitGatewayMulticastGroupSourcesResult other = (DeregisterTransitGatewayMulticastGroupSourcesResult) obj;

        if (other.getDeregisteredMulticastGroupSources() == null
                ^ this.getDeregisteredMulticastGroupSources() == null)
            return false;
        if (other.getDeregisteredMulticastGroupSources() != null
                && other.getDeregisteredMulticastGroupSources().equals(
                        this.getDeregisteredMulticastGroupSources()) == false)
            return false;
        return true;
    }
}
