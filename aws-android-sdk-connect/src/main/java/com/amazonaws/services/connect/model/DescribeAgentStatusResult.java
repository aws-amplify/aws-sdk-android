/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribeAgentStatusResult implements Serializable {
    /**
     * <p>
     * The agent status.
     * </p>
     */
    private AgentStatus agentStatus;

    /**
     * <p>
     * The agent status.
     * </p>
     *
     * @return <p>
     *         The agent status.
     *         </p>
     */
    public AgentStatus getAgentStatus() {
        return agentStatus;
    }

    /**
     * <p>
     * The agent status.
     * </p>
     *
     * @param agentStatus <p>
     *            The agent status.
     *            </p>
     */
    public void setAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * <p>
     * The agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentStatus <p>
     *            The agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAgentStatusResult withAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus;
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
        if (getAgentStatus() != null)
            sb.append("AgentStatus: " + getAgentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAgentStatus() == null) ? 0 : getAgentStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAgentStatusResult == false)
            return false;
        DescribeAgentStatusResult other = (DescribeAgentStatusResult) obj;

        if (other.getAgentStatus() == null ^ this.getAgentStatus() == null)
            return false;
        if (other.getAgentStatus() != null
                && other.getAgentStatus().equals(this.getAgentStatus()) == false)
            return false;
        return true;
    }
}
