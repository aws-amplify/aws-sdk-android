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
 * Describes a bundle task.
 * </p>
 */
public class BundleTask implements Serializable {
    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     */
    private String bundleId;

    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     */
    private BundleTaskError bundleTaskError;

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     */
    private String progress;

    /**
     * <p>
     * The time this task started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The state of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing,
     * cancelling, complete, failed
     */
    private String state;

    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     */
    private Storage storage;

    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     *
     * @return <p>
     *         The ID of the bundle task.
     *         </p>
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     *
     * @param bundleId <p>
     *            The ID of the bundle task.
     *            </p>
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleId <p>
     *            The ID of the bundle task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleTask withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     *
     * @return <p>
     *         If the task fails, a description of the error.
     *         </p>
     */
    public BundleTaskError getBundleTaskError() {
        return bundleTaskError;
    }

    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     *
     * @param bundleTaskError <p>
     *            If the task fails, a description of the error.
     *            </p>
     */
    public void setBundleTaskError(BundleTaskError bundleTaskError) {
        this.bundleTaskError = bundleTaskError;
    }

    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleTaskError <p>
     *            If the task fails, a description of the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleTask withBundleTaskError(BundleTaskError bundleTaskError) {
        this.bundleTaskError = bundleTaskError;
        return this;
    }

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     *
     * @return <p>
     *         The ID of the instance associated with this bundle task.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance associated with this bundle task.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance associated with this bundle task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleTask withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     *
     * @return <p>
     *         The level of task completion, as a percent (for example, 20%).
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     *
     * @param progress <p>
     *            The level of task completion, as a percent (for example, 20%).
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The level of task completion, as a percent (for example, 20%).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleTask withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The time this task started.
     * </p>
     *
     * @return <p>
     *         The time this task started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time this task started.
     * </p>
     *
     * @param startTime <p>
     *            The time this task started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time this task started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time this task started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleTask withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing,
     * cancelling, complete, failed
     *
     * @return <p>
     *         The state of the task.
     *         </p>
     * @see BundleTaskState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing,
     * cancelling, complete, failed
     *
     * @param state <p>
     *            The state of the task.
     *            </p>
     * @see BundleTaskState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing,
     * cancelling, complete, failed
     *
     * @param state <p>
     *            The state of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BundleTaskState
     */
    public BundleTask withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing,
     * cancelling, complete, failed
     *
     * @param state <p>
     *            The state of the task.
     *            </p>
     * @see BundleTaskState
     */
    public void setState(BundleTaskState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing,
     * cancelling, complete, failed
     *
     * @param state <p>
     *            The state of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BundleTaskState
     */
    public BundleTask withState(BundleTaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 storage locations.
     *         </p>
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     *
     * @param storage <p>
     *            The Amazon S3 storage locations.
     *            </p>
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storage <p>
     *            The Amazon S3 storage locations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleTask withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     *
     * @return <p>
     *         The time of the most recent update for the task.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     *
     * @param updateTime <p>
     *            The time of the most recent update for the task.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The time of the most recent update for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BundleTask withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getBundleTaskError() != null)
            sb.append("BundleTaskError: " + getBundleTaskError() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStorage() != null)
            sb.append("Storage: " + getStorage() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode
                + ((getBundleTaskError() == null) ? 0 : getBundleTaskError().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BundleTask == false)
            return false;
        BundleTask other = (BundleTask) obj;

        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getBundleTaskError() == null ^ this.getBundleTaskError() == null)
            return false;
        if (other.getBundleTaskError() != null
                && other.getBundleTaskError().equals(this.getBundleTaskError()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }
}
