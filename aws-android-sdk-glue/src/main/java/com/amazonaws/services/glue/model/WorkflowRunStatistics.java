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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Workflow run statistics provides statistics about the workflow run.
 * </p>
 */
public class WorkflowRunStatistics implements Serializable {
    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     */
    private Integer totalActions;

    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     */
    private Integer timeoutActions;

    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     */
    private Integer failedActions;

    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     */
    private Integer stoppedActions;

    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     */
    private Integer succeededActions;

    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     */
    private Integer runningActions;

    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     *
     * @return <p>
     *         Total number of Actions in the workflow run.
     *         </p>
     */
    public Integer getTotalActions() {
        return totalActions;
    }

    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     *
     * @param totalActions <p>
     *            Total number of Actions in the workflow run.
     *            </p>
     */
    public void setTotalActions(Integer totalActions) {
        this.totalActions = totalActions;
    }

    /**
     * <p>
     * Total number of Actions in the workflow run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalActions <p>
     *            Total number of Actions in the workflow run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRunStatistics withTotalActions(Integer totalActions) {
        this.totalActions = totalActions;
        return this;
    }

    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     *
     * @return <p>
     *         Total number of Actions which timed out.
     *         </p>
     */
    public Integer getTimeoutActions() {
        return timeoutActions;
    }

    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     *
     * @param timeoutActions <p>
     *            Total number of Actions which timed out.
     *            </p>
     */
    public void setTimeoutActions(Integer timeoutActions) {
        this.timeoutActions = timeoutActions;
    }

    /**
     * <p>
     * Total number of Actions which timed out.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutActions <p>
     *            Total number of Actions which timed out.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRunStatistics withTimeoutActions(Integer timeoutActions) {
        this.timeoutActions = timeoutActions;
        return this;
    }

    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     *
     * @return <p>
     *         Total number of Actions which have failed.
     *         </p>
     */
    public Integer getFailedActions() {
        return failedActions;
    }

    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     *
     * @param failedActions <p>
     *            Total number of Actions which have failed.
     *            </p>
     */
    public void setFailedActions(Integer failedActions) {
        this.failedActions = failedActions;
    }

    /**
     * <p>
     * Total number of Actions which have failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedActions <p>
     *            Total number of Actions which have failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRunStatistics withFailedActions(Integer failedActions) {
        this.failedActions = failedActions;
        return this;
    }

    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     *
     * @return <p>
     *         Total number of Actions which have stopped.
     *         </p>
     */
    public Integer getStoppedActions() {
        return stoppedActions;
    }

    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     *
     * @param stoppedActions <p>
     *            Total number of Actions which have stopped.
     *            </p>
     */
    public void setStoppedActions(Integer stoppedActions) {
        this.stoppedActions = stoppedActions;
    }

    /**
     * <p>
     * Total number of Actions which have stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppedActions <p>
     *            Total number of Actions which have stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRunStatistics withStoppedActions(Integer stoppedActions) {
        this.stoppedActions = stoppedActions;
        return this;
    }

    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     *
     * @return <p>
     *         Total number of Actions which have succeeded.
     *         </p>
     */
    public Integer getSucceededActions() {
        return succeededActions;
    }

    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     *
     * @param succeededActions <p>
     *            Total number of Actions which have succeeded.
     *            </p>
     */
    public void setSucceededActions(Integer succeededActions) {
        this.succeededActions = succeededActions;
    }

    /**
     * <p>
     * Total number of Actions which have succeeded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param succeededActions <p>
     *            Total number of Actions which have succeeded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRunStatistics withSucceededActions(Integer succeededActions) {
        this.succeededActions = succeededActions;
        return this;
    }

    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     *
     * @return <p>
     *         Total number Actions in running state.
     *         </p>
     */
    public Integer getRunningActions() {
        return runningActions;
    }

    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     *
     * @param runningActions <p>
     *            Total number Actions in running state.
     *            </p>
     */
    public void setRunningActions(Integer runningActions) {
        this.runningActions = runningActions;
    }

    /**
     * <p>
     * Total number Actions in running state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningActions <p>
     *            Total number Actions in running state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRunStatistics withRunningActions(Integer runningActions) {
        this.runningActions = runningActions;
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
        if (getTotalActions() != null)
            sb.append("TotalActions: " + getTotalActions() + ",");
        if (getTimeoutActions() != null)
            sb.append("TimeoutActions: " + getTimeoutActions() + ",");
        if (getFailedActions() != null)
            sb.append("FailedActions: " + getFailedActions() + ",");
        if (getStoppedActions() != null)
            sb.append("StoppedActions: " + getStoppedActions() + ",");
        if (getSucceededActions() != null)
            sb.append("SucceededActions: " + getSucceededActions() + ",");
        if (getRunningActions() != null)
            sb.append("RunningActions: " + getRunningActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTotalActions() == null) ? 0 : getTotalActions().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutActions() == null) ? 0 : getTimeoutActions().hashCode());
        hashCode = prime * hashCode
                + ((getFailedActions() == null) ? 0 : getFailedActions().hashCode());
        hashCode = prime * hashCode
                + ((getStoppedActions() == null) ? 0 : getStoppedActions().hashCode());
        hashCode = prime * hashCode
                + ((getSucceededActions() == null) ? 0 : getSucceededActions().hashCode());
        hashCode = prime * hashCode
                + ((getRunningActions() == null) ? 0 : getRunningActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowRunStatistics == false)
            return false;
        WorkflowRunStatistics other = (WorkflowRunStatistics) obj;

        if (other.getTotalActions() == null ^ this.getTotalActions() == null)
            return false;
        if (other.getTotalActions() != null
                && other.getTotalActions().equals(this.getTotalActions()) == false)
            return false;
        if (other.getTimeoutActions() == null ^ this.getTimeoutActions() == null)
            return false;
        if (other.getTimeoutActions() != null
                && other.getTimeoutActions().equals(this.getTimeoutActions()) == false)
            return false;
        if (other.getFailedActions() == null ^ this.getFailedActions() == null)
            return false;
        if (other.getFailedActions() != null
                && other.getFailedActions().equals(this.getFailedActions()) == false)
            return false;
        if (other.getStoppedActions() == null ^ this.getStoppedActions() == null)
            return false;
        if (other.getStoppedActions() != null
                && other.getStoppedActions().equals(this.getStoppedActions()) == false)
            return false;
        if (other.getSucceededActions() == null ^ this.getSucceededActions() == null)
            return false;
        if (other.getSucceededActions() != null
                && other.getSucceededActions().equals(this.getSucceededActions()) == false)
            return false;
        if (other.getRunningActions() == null ^ this.getRunningActions() == null)
            return false;
        if (other.getRunningActions() != null
                && other.getRunningActions().equals(this.getRunningActions()) == false)
            return false;
        return true;
    }
}
