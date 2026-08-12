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
 * An object to define <code>AgentsCriteria</code>.
 * </p>
 */
public class MatchCriteria implements Serializable {
    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     */
    private AgentsCriteria agentsCriteria;

    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     *
     * @return <p>
     *         An object to define <code>AgentIds</code>.
     *         </p>
     */
    public AgentsCriteria getAgentsCriteria() {
        return agentsCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     *
     * @param agentsCriteria <p>
     *            An object to define <code>AgentIds</code>.
     *            </p>
     */
    public void setAgentsCriteria(AgentsCriteria agentsCriteria) {
        this.agentsCriteria = agentsCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentsCriteria <p>
     *            An object to define <code>AgentIds</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MatchCriteria withAgentsCriteria(AgentsCriteria agentsCriteria) {
        this.agentsCriteria = agentsCriteria;
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
        if (getAgentsCriteria() != null)
            sb.append("AgentsCriteria: " + getAgentsCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAgentsCriteria() == null) ? 0 : getAgentsCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchCriteria == false)
            return false;
        MatchCriteria other = (MatchCriteria) obj;

        if (other.getAgentsCriteria() == null ^ this.getAgentsCriteria() == null)
            return false;
        if (other.getAgentsCriteria() != null
                && other.getAgentsCriteria().equals(this.getAgentsCriteria()) == false)
            return false;
        return true;
    }
}
