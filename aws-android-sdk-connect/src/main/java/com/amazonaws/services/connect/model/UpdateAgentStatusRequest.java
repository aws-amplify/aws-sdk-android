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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Updates agent status.
 * </p>
 */
public class UpdateAgentStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

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
     * <b>Length: </b>0 - 250<br/>
     */
    private String description;

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
     * The display order of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer displayOrder;

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     */
    private Boolean resetOrderNumber;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAgentStatusRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public UpdateAgentStatusRequest withAgentStatusId(String agentStatusId) {
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
    public UpdateAgentStatusRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
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
     * <b>Length: </b>0 - 250<br/>
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
     * <b>Length: </b>0 - 250<br/>
     *
     * @param description <p>
     *            The description of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAgentStatusRequest withDescription(String description) {
        this.description = description;
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
    public UpdateAgentStatusRequest withState(String state) {
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
    public UpdateAgentStatusRequest withState(AgentStatusState state) {
        this.state = state.toString();
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
    public UpdateAgentStatusRequest withDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     *
     * @return <p>
     *         A number indicating the reset order of the agent status.
     *         </p>
     */
    public Boolean isResetOrderNumber() {
        return resetOrderNumber;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     *
     * @return <p>
     *         A number indicating the reset order of the agent status.
     *         </p>
     */
    public Boolean getResetOrderNumber() {
        return resetOrderNumber;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     *
     * @param resetOrderNumber <p>
     *            A number indicating the reset order of the agent status.
     *            </p>
     */
    public void setResetOrderNumber(Boolean resetOrderNumber) {
        this.resetOrderNumber = resetOrderNumber;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetOrderNumber <p>
     *            A number indicating the reset order of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAgentStatusRequest withResetOrderNumber(Boolean resetOrderNumber) {
        this.resetOrderNumber = resetOrderNumber;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAgentStatusId() != null)
            sb.append("AgentStatusId: " + getAgentStatusId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDisplayOrder() != null)
            sb.append("DisplayOrder: " + getDisplayOrder() + ",");
        if (getResetOrderNumber() != null)
            sb.append("ResetOrderNumber: " + getResetOrderNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getAgentStatusId() == null) ? 0 : getAgentStatusId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayOrder() == null) ? 0 : getDisplayOrder().hashCode());
        hashCode = prime * hashCode
                + ((getResetOrderNumber() == null) ? 0 : getResetOrderNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentStatusRequest == false)
            return false;
        UpdateAgentStatusRequest other = (UpdateAgentStatusRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDisplayOrder() == null ^ this.getDisplayOrder() == null)
            return false;
        if (other.getDisplayOrder() != null
                && other.getDisplayOrder().equals(this.getDisplayOrder()) == false)
            return false;
        if (other.getResetOrderNumber() == null ^ this.getResetOrderNumber() == null)
            return false;
        if (other.getResetOrderNumber() != null
                && other.getResetOrderNumber().equals(this.getResetOrderNumber()) == false)
            return false;
        return true;
    }
}
