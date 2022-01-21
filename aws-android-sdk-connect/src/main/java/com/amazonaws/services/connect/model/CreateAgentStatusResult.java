/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class CreateAgentStatusResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     */
    private String agentStatusARN;

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     */
    private String agentStatusId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the agent status.
     *         </p>
     */
    public String getAgentStatusARN() {
        return agentStatusARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     *
     * @param agentStatusARN <p>
     *            The Amazon Resource Name (ARN) of the agent status.
     *            </p>
     */
    public void setAgentStatusARN(String agentStatusARN) {
        this.agentStatusARN = agentStatusARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentStatusARN <p>
     *            The Amazon Resource Name (ARN) of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAgentStatusResult withAgentStatusARN(String agentStatusARN) {
        this.agentStatusARN = agentStatusARN;
        return this;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     *
     * @return <p>
     *         The identifier of the agent status.
     *         </p>
     */
    public String getAgentStatusId() {
        return agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     *
     * @param agentStatusId <p>
     *            The identifier of the agent status.
     *            </p>
     */
    public void setAgentStatusId(String agentStatusId) {
        this.agentStatusId = agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentStatusId <p>
     *            The identifier of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAgentStatusResult withAgentStatusId(String agentStatusId) {
        this.agentStatusId = agentStatusId;
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
        if (getAgentStatusARN() != null)
            sb.append("AgentStatusARN: " + getAgentStatusARN() + ",");
        if (getAgentStatusId() != null)
            sb.append("AgentStatusId: " + getAgentStatusId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAgentStatusARN() == null) ? 0 : getAgentStatusARN().hashCode());
        hashCode = prime * hashCode
                + ((getAgentStatusId() == null) ? 0 : getAgentStatusId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAgentStatusResult == false)
            return false;
        CreateAgentStatusResult other = (CreateAgentStatusResult) obj;

        if (other.getAgentStatusARN() == null ^ this.getAgentStatusARN() == null)
            return false;
        if (other.getAgentStatusARN() != null
                && other.getAgentStatusARN().equals(this.getAgentStatusARN()) == false)
            return false;
        if (other.getAgentStatusId() == null ^ this.getAgentStatusId() == null)
            return false;
        if (other.getAgentStatusId() != null
                && other.getAgentStatusId().equals(this.getAgentStatusId()) == false)
            return false;
        return true;
    }
}
