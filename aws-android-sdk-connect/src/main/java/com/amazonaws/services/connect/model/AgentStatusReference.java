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
 * Information about the agent's status.
 * </p>
 */
public class AgentStatusReference implements Serializable {
    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     */
    private java.util.Date statusStartTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     */
    private String statusArn;

    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     *
     * @return <p>
     *         The start timestamp of the agent's status.
     *         </p>
     */
    public java.util.Date getStatusStartTimestamp() {
        return statusStartTimestamp;
    }

    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     *
     * @param statusStartTimestamp <p>
     *            The start timestamp of the agent's status.
     *            </p>
     */
    public void setStatusStartTimestamp(java.util.Date statusStartTimestamp) {
        this.statusStartTimestamp = statusStartTimestamp;
    }

    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusStartTimestamp <p>
     *            The start timestamp of the agent's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatusReference withStatusStartTimestamp(java.util.Date statusStartTimestamp) {
        this.statusStartTimestamp = statusStartTimestamp;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the agent's status.
     *         </p>
     */
    public String getStatusArn() {
        return statusArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     *
     * @param statusArn <p>
     *            The Amazon Resource Name (ARN) of the agent's status.
     *            </p>
     */
    public void setStatusArn(String statusArn) {
        this.statusArn = statusArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusArn <p>
     *            The Amazon Resource Name (ARN) of the agent's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentStatusReference withStatusArn(String statusArn) {
        this.statusArn = statusArn;
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
        if (getStatusStartTimestamp() != null)
            sb.append("StatusStartTimestamp: " + getStatusStartTimestamp() + ",");
        if (getStatusArn() != null)
            sb.append("StatusArn: " + getStatusArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatusStartTimestamp() == null) ? 0 : getStatusStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatusArn() == null) ? 0 : getStatusArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentStatusReference == false)
            return false;
        AgentStatusReference other = (AgentStatusReference) obj;

        if (other.getStatusStartTimestamp() == null ^ this.getStatusStartTimestamp() == null)
            return false;
        if (other.getStatusStartTimestamp() != null
                && other.getStatusStartTimestamp().equals(this.getStatusStartTimestamp()) == false)
            return false;
        if (other.getStatusArn() == null ^ this.getStatusArn() == null)
            return false;
        if (other.getStatusArn() != null
                && other.getStatusArn().equals(this.getStatusArn()) == false)
            return false;
        return true;
    }
}
