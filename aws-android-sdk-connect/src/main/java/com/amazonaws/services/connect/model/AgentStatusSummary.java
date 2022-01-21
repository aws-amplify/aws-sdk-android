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
 * Summary information for an agent status.
 * </p>
 */
public class AgentStatusSummary implements Serializable {
    /**
     * <p>
     * The identifier for an agent status.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the agent status.
     * </p>
     */
    private String arn;

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
     * The type of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     */
    private String type;

    /**
     * <p>
     * The identifier for an agent status.
     * </p>
     *
     * @return <p>
     *         The identifier for an agent status.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for an agent status.
     * </p>
     *
     * @param id <p>
     *            The identifier for an agent status.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for an agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for an agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatusSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the agent status.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the agent status.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the agent status.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the agent status.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatusSummary withArn(String arn) {
        this.arn = arn;
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
    public AgentStatusSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @return <p>
     *         The type of the agent status.
     *         </p>
     * @see AgentStatusType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of the agent status.
     *            </p>
     * @see AgentStatusType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentStatusType
     */
    public AgentStatusSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the agent status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of the agent status.
     *            </p>
     * @see AgentStatusType
     */
    public void setType(AgentStatusType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the agent status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTABLE, CUSTOM, OFFLINE
     *
     * @param type <p>
     *            The type of the agent status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentStatusType
     */
    public AgentStatusSummary withType(AgentStatusType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentStatusSummary == false)
            return false;
        AgentStatusSummary other = (AgentStatusSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
