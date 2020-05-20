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
 * Information about the deployment status of the instances in the deployment.
 * </p>
 */
public class DeploymentOverview implements Serializable {
    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     */
    private Long pending;

    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     */
    private Long inProgress;

    /**
     * <p>
     * The number of instances in the deployment to which revisions have been
     * successfully deployed.
     * </p>
     */
    private Long succeeded;

    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     */
    private Long failed;

    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     */
    private Long skipped;

    /**
     * <p>
     * The number of instances in a replacement environment ready to receive
     * traffic in a blue/green deployment.
     * </p>
     */
    private Long ready;

    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     *
     * @return <p>
     *         The number of instances in the deployment in a pending state.
     *         </p>
     */
    public Long getPending() {
        return pending;
    }

    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     *
     * @param pending <p>
     *            The number of instances in the deployment in a pending state.
     *            </p>
     */
    public void setPending(Long pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pending <p>
     *            The number of instances in the deployment in a pending state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentOverview withPending(Long pending) {
        this.pending = pending;
        return this;
    }

    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     *
     * @return <p>
     *         The number of instances in which the deployment is in progress.
     *         </p>
     */
    public Long getInProgress() {
        return inProgress;
    }

    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     *
     * @param inProgress <p>
     *            The number of instances in which the deployment is in
     *            progress.
     *            </p>
     */
    public void setInProgress(Long inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inProgress <p>
     *            The number of instances in which the deployment is in
     *            progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentOverview withInProgress(Long inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    /**
     * <p>
     * The number of instances in the deployment to which revisions have been
     * successfully deployed.
     * </p>
     *
     * @return <p>
     *         The number of instances in the deployment to which revisions have
     *         been successfully deployed.
     *         </p>
     */
    public Long getSucceeded() {
        return succeeded;
    }

    /**
     * <p>
     * The number of instances in the deployment to which revisions have been
     * successfully deployed.
     * </p>
     *
     * @param succeeded <p>
     *            The number of instances in the deployment to which revisions
     *            have been successfully deployed.
     *            </p>
     */
    public void setSucceeded(Long succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * <p>
     * The number of instances in the deployment to which revisions have been
     * successfully deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param succeeded <p>
     *            The number of instances in the deployment to which revisions
     *            have been successfully deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentOverview withSucceeded(Long succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     *
     * @return <p>
     *         The number of instances in the deployment in a failed state.
     *         </p>
     */
    public Long getFailed() {
        return failed;
    }

    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     *
     * @param failed <p>
     *            The number of instances in the deployment in a failed state.
     *            </p>
     */
    public void setFailed(Long failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failed <p>
     *            The number of instances in the deployment in a failed state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentOverview withFailed(Long failed) {
        this.failed = failed;
        return this;
    }

    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     *
     * @return <p>
     *         The number of instances in the deployment in a skipped state.
     *         </p>
     */
    public Long getSkipped() {
        return skipped;
    }

    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     *
     * @param skipped <p>
     *            The number of instances in the deployment in a skipped state.
     *            </p>
     */
    public void setSkipped(Long skipped) {
        this.skipped = skipped;
    }

    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipped <p>
     *            The number of instances in the deployment in a skipped state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentOverview withSkipped(Long skipped) {
        this.skipped = skipped;
        return this;
    }

    /**
     * <p>
     * The number of instances in a replacement environment ready to receive
     * traffic in a blue/green deployment.
     * </p>
     *
     * @return <p>
     *         The number of instances in a replacement environment ready to
     *         receive traffic in a blue/green deployment.
     *         </p>
     */
    public Long getReady() {
        return ready;
    }

    /**
     * <p>
     * The number of instances in a replacement environment ready to receive
     * traffic in a blue/green deployment.
     * </p>
     *
     * @param ready <p>
     *            The number of instances in a replacement environment ready to
     *            receive traffic in a blue/green deployment.
     *            </p>
     */
    public void setReady(Long ready) {
        this.ready = ready;
    }

    /**
     * <p>
     * The number of instances in a replacement environment ready to receive
     * traffic in a blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ready <p>
     *            The number of instances in a replacement environment ready to
     *            receive traffic in a blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentOverview withReady(Long ready) {
        this.ready = ready;
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
        if (getPending() != null)
            sb.append("Pending: " + getPending() + ",");
        if (getInProgress() != null)
            sb.append("InProgress: " + getInProgress() + ",");
        if (getSucceeded() != null)
            sb.append("Succeeded: " + getSucceeded() + ",");
        if (getFailed() != null)
            sb.append("Failed: " + getFailed() + ",");
        if (getSkipped() != null)
            sb.append("Skipped: " + getSkipped() + ",");
        if (getReady() != null)
            sb.append("Ready: " + getReady());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getInProgress() == null) ? 0 : getInProgress().hashCode());
        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        hashCode = prime * hashCode + ((getReady() == null) ? 0 : getReady().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentOverview == false)
            return false;
        DeploymentOverview other = (DeploymentOverview) obj;

        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getInProgress() == null ^ this.getInProgress() == null)
            return false;
        if (other.getInProgress() != null
                && other.getInProgress().equals(this.getInProgress()) == false)
            return false;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null
                && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getSkipped() == null ^ this.getSkipped() == null)
            return false;
        if (other.getSkipped() != null && other.getSkipped().equals(this.getSkipped()) == false)
            return false;
        if (other.getReady() == null ^ this.getReady() == null)
            return false;
        if (other.getReady() != null && other.getReady().equals(this.getReady()) == false)
            return false;
        return true;
    }
}
