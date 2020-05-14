/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an instance state change.
 * </p>
 */
public class InstanceStateChange implements Serializable {
    /**
     * <p>
     * The current state of the instance.
     * </p>
     */
    private InstanceState currentState;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The previous state of the instance.
     * </p>
     */
    private InstanceState previousState;

    /**
     * <p>
     * The current state of the instance.
     * </p>
     *
     * @return <p>
     *         The current state of the instance.
     *         </p>
     */
    public InstanceState getCurrentState() {
        return currentState;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     *
     * @param currentState <p>
     *            The current state of the instance.
     *            </p>
     */
    public void setCurrentState(InstanceState currentState) {
        this.currentState = currentState;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentState <p>
     *            The current state of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStateChange withCurrentState(InstanceState currentState) {
        this.currentState = currentState;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStateChange withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The previous state of the instance.
     * </p>
     *
     * @return <p>
     *         The previous state of the instance.
     *         </p>
     */
    public InstanceState getPreviousState() {
        return previousState;
    }

    /**
     * <p>
     * The previous state of the instance.
     * </p>
     *
     * @param previousState <p>
     *            The previous state of the instance.
     *            </p>
     */
    public void setPreviousState(InstanceState previousState) {
        this.previousState = previousState;
    }

    /**
     * <p>
     * The previous state of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param previousState <p>
     *            The previous state of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStateChange withPreviousState(InstanceState previousState) {
        this.previousState = previousState;
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
        if (getCurrentState() != null)
            sb.append("CurrentState: " + getCurrentState() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPreviousState() != null)
            sb.append("PreviousState: " + getPreviousState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousState() == null) ? 0 : getPreviousState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStateChange == false)
            return false;
        InstanceStateChange other = (InstanceStateChange) obj;

        if (other.getCurrentState() == null ^ this.getCurrentState() == null)
            return false;
        if (other.getCurrentState() != null
                && other.getCurrentState().equals(this.getCurrentState()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPreviousState() == null ^ this.getPreviousState() == null)
            return false;
        if (other.getPreviousState() != null
                && other.getPreviousState().equals(this.getPreviousState()) == false)
            return false;
        return true;
    }
}
