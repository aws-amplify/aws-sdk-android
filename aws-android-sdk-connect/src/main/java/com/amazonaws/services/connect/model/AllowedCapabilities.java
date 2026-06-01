/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the capabilities enabled for participants of the contact.
 * </p>
 */
public class AllowedCapabilities implements Serializable {
    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     */
    private ParticipantCapabilities customer;

    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     */
    private ParticipantCapabilities agent;

    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     *
     * @return <p>
     *         Information about the customer's video sharing capabilities.
     *         </p>
     */
    public ParticipantCapabilities getCustomer() {
        return customer;
    }

    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     *
     * @param customer <p>
     *            Information about the customer's video sharing capabilities.
     *            </p>
     */
    public void setCustomer(ParticipantCapabilities customer) {
        this.customer = customer;
    }

    /**
     * <p>
     * Information about the customer's video sharing capabilities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customer <p>
     *            Information about the customer's video sharing capabilities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllowedCapabilities withCustomer(ParticipantCapabilities customer) {
        this.customer = customer;
        return this;
    }

    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     *
     * @return <p>
     *         Information about the agent's video sharing capabilities.
     *         </p>
     */
    public ParticipantCapabilities getAgent() {
        return agent;
    }

    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     *
     * @param agent <p>
     *            Information about the agent's video sharing capabilities.
     *            </p>
     */
    public void setAgent(ParticipantCapabilities agent) {
        this.agent = agent;
    }

    /**
     * <p>
     * Information about the agent's video sharing capabilities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agent <p>
     *            Information about the agent's video sharing capabilities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllowedCapabilities withAgent(ParticipantCapabilities agent) {
        this.agent = agent;
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
        if (getCustomer() != null)
            sb.append("Customer: " + getCustomer() + ",");
        if (getAgent() != null)
            sb.append("Agent: " + getAgent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        hashCode = prime * hashCode + ((getAgent() == null) ? 0 : getAgent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowedCapabilities == false)
            return false;
        AllowedCapabilities other = (AllowedCapabilities) obj;

        if (other.getCustomer() == null ^ this.getCustomer() == null)
            return false;
        if (other.getCustomer() != null && other.getCustomer().equals(this.getCustomer()) == false)
            return false;
        if (other.getAgent() == null ^ this.getAgent() == null)
            return false;
        if (other.getAgent() != null && other.getAgent().equals(this.getAgent()) == false)
            return false;
        return true;
    }
}
