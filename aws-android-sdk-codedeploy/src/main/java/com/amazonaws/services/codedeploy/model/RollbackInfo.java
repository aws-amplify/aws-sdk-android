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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a deployment rollback.
 * </p>
 */
public class RollbackInfo implements Serializable {
    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     */
    private String rollbackDeploymentId;

    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a
     * rollback deployment because it failed or was stopped.
     * </p>
     */
    private String rollbackTriggeringDeploymentId;

    /**
     * <p>
     * Information that describes the status of a deployment rollback (for
     * example, whether the deployment can't be rolled back, is in progress,
     * failed, or succeeded).
     * </p>
     */
    private String rollbackMessage;

    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     *
     * @return <p>
     *         The ID of the deployment rollback.
     *         </p>
     */
    public String getRollbackDeploymentId() {
        return rollbackDeploymentId;
    }

    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     *
     * @param rollbackDeploymentId <p>
     *            The ID of the deployment rollback.
     *            </p>
     */
    public void setRollbackDeploymentId(String rollbackDeploymentId) {
        this.rollbackDeploymentId = rollbackDeploymentId;
    }

    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackDeploymentId <p>
     *            The ID of the deployment rollback.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackInfo withRollbackDeploymentId(String rollbackDeploymentId) {
        this.rollbackDeploymentId = rollbackDeploymentId;
        return this;
    }

    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a
     * rollback deployment because it failed or was stopped.
     * </p>
     *
     * @return <p>
     *         The deployment ID of the deployment that was underway and
     *         triggered a rollback deployment because it failed or was stopped.
     *         </p>
     */
    public String getRollbackTriggeringDeploymentId() {
        return rollbackTriggeringDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a
     * rollback deployment because it failed or was stopped.
     * </p>
     *
     * @param rollbackTriggeringDeploymentId <p>
     *            The deployment ID of the deployment that was underway and
     *            triggered a rollback deployment because it failed or was
     *            stopped.
     *            </p>
     */
    public void setRollbackTriggeringDeploymentId(String rollbackTriggeringDeploymentId) {
        this.rollbackTriggeringDeploymentId = rollbackTriggeringDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a
     * rollback deployment because it failed or was stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackTriggeringDeploymentId <p>
     *            The deployment ID of the deployment that was underway and
     *            triggered a rollback deployment because it failed or was
     *            stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackInfo withRollbackTriggeringDeploymentId(String rollbackTriggeringDeploymentId) {
        this.rollbackTriggeringDeploymentId = rollbackTriggeringDeploymentId;
        return this;
    }

    /**
     * <p>
     * Information that describes the status of a deployment rollback (for
     * example, whether the deployment can't be rolled back, is in progress,
     * failed, or succeeded).
     * </p>
     *
     * @return <p>
     *         Information that describes the status of a deployment rollback
     *         (for example, whether the deployment can't be rolled back, is in
     *         progress, failed, or succeeded).
     *         </p>
     */
    public String getRollbackMessage() {
        return rollbackMessage;
    }

    /**
     * <p>
     * Information that describes the status of a deployment rollback (for
     * example, whether the deployment can't be rolled back, is in progress,
     * failed, or succeeded).
     * </p>
     *
     * @param rollbackMessage <p>
     *            Information that describes the status of a deployment rollback
     *            (for example, whether the deployment can't be rolled back, is
     *            in progress, failed, or succeeded).
     *            </p>
     */
    public void setRollbackMessage(String rollbackMessage) {
        this.rollbackMessage = rollbackMessage;
    }

    /**
     * <p>
     * Information that describes the status of a deployment rollback (for
     * example, whether the deployment can't be rolled back, is in progress,
     * failed, or succeeded).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackMessage <p>
     *            Information that describes the status of a deployment rollback
     *            (for example, whether the deployment can't be rolled back, is
     *            in progress, failed, or succeeded).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RollbackInfo withRollbackMessage(String rollbackMessage) {
        this.rollbackMessage = rollbackMessage;
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
        if (getRollbackDeploymentId() != null)
            sb.append("rollbackDeploymentId: " + getRollbackDeploymentId() + ",");
        if (getRollbackTriggeringDeploymentId() != null)
            sb.append("rollbackTriggeringDeploymentId: " + getRollbackTriggeringDeploymentId()
                    + ",");
        if (getRollbackMessage() != null)
            sb.append("rollbackMessage: " + getRollbackMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRollbackDeploymentId() == null) ? 0 : getRollbackDeploymentId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRollbackTriggeringDeploymentId() == null) ? 0
                        : getRollbackTriggeringDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getRollbackMessage() == null) ? 0 : getRollbackMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackInfo == false)
            return false;
        RollbackInfo other = (RollbackInfo) obj;

        if (other.getRollbackDeploymentId() == null ^ this.getRollbackDeploymentId() == null)
            return false;
        if (other.getRollbackDeploymentId() != null
                && other.getRollbackDeploymentId().equals(this.getRollbackDeploymentId()) == false)
            return false;
        if (other.getRollbackTriggeringDeploymentId() == null
                ^ this.getRollbackTriggeringDeploymentId() == null)
            return false;
        if (other.getRollbackTriggeringDeploymentId() != null
                && other.getRollbackTriggeringDeploymentId().equals(
                        this.getRollbackTriggeringDeploymentId()) == false)
            return false;
        if (other.getRollbackMessage() == null ^ this.getRollbackMessage() == null)
            return false;
        if (other.getRollbackMessage() != null
                && other.getRollbackMessage().equals(this.getRollbackMessage()) == false)
            return false;
        return true;
    }
}
