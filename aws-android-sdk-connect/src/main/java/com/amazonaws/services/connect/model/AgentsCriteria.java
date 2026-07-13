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
 * Can be used to define a list of preferred agents to target the contact within
 * the queue. Note that agents must have the queue in their routing profile in
 * order to be offered the contact.
 * </p>
 */
public class AgentsCriteria implements Serializable {
    /**
     * <p>
     * An object to specify a list of agents, by Agent ID.
     * </p>
     */
    private java.util.List<String> agentIds;

    /**
     * <p>
     * An object to specify a list of agents, by Agent ID.
     * </p>
     *
     * @return <p>
     *         An object to specify a list of agents, by Agent ID.
     *         </p>
     */
    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    /**
     * <p>
     * An object to specify a list of agents, by Agent ID.
     * </p>
     *
     * @param agentIds <p>
     *            An object to specify a list of agents, by Agent ID.
     *            </p>
     */
    public void setAgentIds(java.util.Collection<String> agentIds) {
        if (agentIds == null) {
            this.agentIds = null;
            return;
        }

        this.agentIds = new java.util.ArrayList<String>(agentIds);
    }

    /**
     * <p>
     * An object to specify a list of agents, by Agent ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentIds <p>
     *            An object to specify a list of agents, by Agent ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentsCriteria withAgentIds(String... agentIds) {
        if (getAgentIds() == null) {
            this.agentIds = new java.util.ArrayList<String>(agentIds.length);
        }
        for (String value : agentIds) {
            this.agentIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object to specify a list of agents, by Agent ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentIds <p>
     *            An object to specify a list of agents, by Agent ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentsCriteria withAgentIds(java.util.Collection<String> agentIds) {
        setAgentIds(agentIds);
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
        if (getAgentIds() != null)
            sb.append("AgentIds: " + getAgentIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentIds() == null) ? 0 : getAgentIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentsCriteria == false)
            return false;
        AgentsCriteria other = (AgentsCriteria) obj;

        if (other.getAgentIds() == null ^ this.getAgentIds() == null)
            return false;
        if (other.getAgentIds() != null && other.getAgentIds().equals(this.getAgentIds()) == false)
            return false;
        return true;
    }
}
