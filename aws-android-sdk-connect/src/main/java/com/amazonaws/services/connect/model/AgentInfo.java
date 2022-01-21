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

/**
 * <p>
 * Information about the agent who accepted the contact.
 * </p>
 */
public class AgentInfo implements Serializable {
    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     */
    private java.util.Date connectedToAgentTimestamp;

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the agent who accepted the contact.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the agent who accepted the contact.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the agent who accepted the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     *
     * @return <p>
     *         The timestamp when the contact was connected to the agent.
     *         </p>
     */
    public java.util.Date getConnectedToAgentTimestamp() {
        return connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     *
     * @param connectedToAgentTimestamp <p>
     *            The timestamp when the contact was connected to the agent.
     *            </p>
     */
    public void setConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        this.connectedToAgentTimestamp = connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectedToAgentTimestamp <p>
     *            The timestamp when the contact was connected to the agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentInfo withConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        this.connectedToAgentTimestamp = connectedToAgentTimestamp;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getConnectedToAgentTimestamp() != null)
            sb.append("ConnectedToAgentTimestamp: " + getConnectedToAgentTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectedToAgentTimestamp() == null) ? 0 : getConnectedToAgentTimestamp()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentInfo == false)
            return false;
        AgentInfo other = (AgentInfo) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConnectedToAgentTimestamp() == null
                ^ this.getConnectedToAgentTimestamp() == null)
            return false;
        if (other.getConnectedToAgentTimestamp() != null
                && other.getConnectedToAgentTimestamp().equals(this.getConnectedToAgentTimestamp()) == false)
            return false;
        return true;
    }
}
