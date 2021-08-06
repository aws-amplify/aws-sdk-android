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

/**
 * <p>
 * Contains information about an agent status.
 * </p>
 */
public class AgentStatus implements Serializable {
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
     * The name of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     */
    private String description;

    /**
     * <p>
     * The type of agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     */
    private String type;

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer displayOrder;

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String state;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public AgentStatus withAgentStatusARN(String agentStatusARN) {
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
    public AgentStatus withAgentStatusId(String agentStatusId) {
        this.agentStatusId = agentStatusId;
        return this;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The name of the agent status.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the agent status.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @return <p>
     *         The description of the agent status.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description of the agent status.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatus withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @return <p>
     *         The type of agent status.
     *         </p>
     * @see AgentStatusType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of agent status.
     *            </p>
     * @see AgentStatusType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentStatusType
     */
    public AgentStatus withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of agent status.
     *            </p>
     * @see AgentStatusType
     */
    public void setType(AgentStatusType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentStatusType
     */
    public AgentStatus withType(AgentStatusType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The display order of the agent status.
     *         </p>
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param displayOrder <p>
     *            The display order of the agent status.
     *            </p>
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param displayOrder <p>
     *            The display order of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatus withDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The state of the agent status.
     *         </p>
     * @see AgentStatusState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the agent status.
     *            </p>
     * @see AgentStatusState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentStatusState
     */
    public AgentStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the agent status.
     *            </p>
     * @see AgentStatusState
     */
    public void setState(AgentStatusState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentStatusState
     */
    public AgentStatus withState(AgentStatusState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatus withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatus addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AgentStatus clearTagsEntries() {
        this.tags = null;
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
            sb.append("AgentStatusId: " + getAgentStatusId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDisplayOrder() != null)
            sb.append("DisplayOrder: " + getDisplayOrder() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayOrder() == null) ? 0 : getDisplayOrder().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentStatus == false)
            return false;
        AgentStatus other = (AgentStatus) obj;

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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDisplayOrder() == null ^ this.getDisplayOrder() == null)
            return false;
        if (other.getDisplayOrder() != null
                && other.getDisplayOrder().equals(this.getDisplayOrder()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
