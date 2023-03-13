/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Changes the current status of a user or agent in Amazon Connect. If the agent
 * is currently handling a contact, this sets the agent's next status.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html"
 * >Agent status</a> and <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html"
 * >Set your next status</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
public class PutUserStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the user.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
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
     * The identifier of the user.
     * </p>
     *
     * @return <p>
     *         The identifier of the user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The identifier of the user.
     * </p>
     *
     * @param userId <p>
     *            The identifier of the user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The identifier of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutUserStatusRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutUserStatusRequest withInstanceId(String instanceId) {
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
    public PutUserStatusRequest withAgentStatusId(String agentStatusId) {
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAgentStatusId() != null)
            sb.append("AgentStatusId: " + getAgentStatusId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
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

        if (obj instanceof PutUserStatusRequest == false)
            return false;
        PutUserStatusRequest other = (PutUserStatusRequest) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
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
        return true;
    }
}
