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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This action is only used by the Amazon ECS agent, and it is not intended for
 * use outside of the agent.
 * </p>
 * </note>
 * <p>
 * Sent to acknowledge that a task changed states.
 * </p>
 */
public class SubmitTaskStateChangeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The task ID or full ARN of the task in the state change request.
     * </p>
     */
    private String task;

    /**
     * <p>
     * The status of the state change request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     */
    private java.util.List<ContainerStateChange> containers;

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     */
    private java.util.List<AttachmentStateChange> attachments;

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     */
    private java.util.Date pullStartedAt;

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     */
    private java.util.Date pullStoppedAt;

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     */
    private java.util.Date executionStoppedAt;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the task.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the task.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The task ID or full ARN of the task in the state change request.
     * </p>
     *
     * @return <p>
     *         The task ID or full ARN of the task in the state change request.
     *         </p>
     */
    public String getTask() {
        return task;
    }

    /**
     * <p>
     * The task ID or full ARN of the task in the state change request.
     * </p>
     *
     * @param task <p>
     *            The task ID or full ARN of the task in the state change
     *            request.
     *            </p>
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The task ID or full ARN of the task in the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param task <p>
     *            The task ID or full ARN of the task in the state change
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     *
     * @return <p>
     *         The status of the state change request.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     *
     * @param status <p>
     *            The status of the state change request.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     *
     * @return <p>
     *         The reason for the state change request.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     *
     * @param reason <p>
     *            The reason for the state change request.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            The reason for the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     *
     * @return <p>
     *         Any containers associated with the state change request.
     *         </p>
     */
    public java.util.List<ContainerStateChange> getContainers() {
        return containers;
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     *
     * @param containers <p>
     *            Any containers associated with the state change request.
     *            </p>
     */
    public void setContainers(java.util.Collection<ContainerStateChange> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<ContainerStateChange>(containers);
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            Any containers associated with the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withContainers(ContainerStateChange... containers) {
        if (getContainers() == null) {
            this.containers = new java.util.ArrayList<ContainerStateChange>(containers.length);
        }
        for (ContainerStateChange value : containers) {
            this.containers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            Any containers associated with the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withContainers(
            java.util.Collection<ContainerStateChange> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     *
     * @return <p>
     *         Any attachments associated with the state change request.
     *         </p>
     */
    public java.util.List<AttachmentStateChange> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     *
     * @param attachments <p>
     *            Any attachments associated with the state change request.
     *            </p>
     */
    public void setAttachments(java.util.Collection<AttachmentStateChange> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AttachmentStateChange>(attachments);
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Any attachments associated with the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withAttachments(AttachmentStateChange... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<AttachmentStateChange>(attachments.length);
        }
        for (AttachmentStateChange value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Any attachments associated with the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withAttachments(
            java.util.Collection<AttachmentStateChange> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the container image pull began.
     *         </p>
     */
    public java.util.Date getPullStartedAt() {
        return pullStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     *
     * @param pullStartedAt <p>
     *            The Unix timestamp for when the container image pull began.
     *            </p>
     */
    public void setPullStartedAt(java.util.Date pullStartedAt) {
        this.pullStartedAt = pullStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullStartedAt <p>
     *            The Unix timestamp for when the container image pull began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withPullStartedAt(java.util.Date pullStartedAt) {
        this.pullStartedAt = pullStartedAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the container image pull completed.
     *         </p>
     */
    public java.util.Date getPullStoppedAt() {
        return pullStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     *
     * @param pullStoppedAt <p>
     *            The Unix timestamp for when the container image pull
     *            completed.
     *            </p>
     */
    public void setPullStoppedAt(java.util.Date pullStoppedAt) {
        this.pullStoppedAt = pullStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullStoppedAt <p>
     *            The Unix timestamp for when the container image pull
     *            completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withPullStoppedAt(java.util.Date pullStoppedAt) {
        this.pullStoppedAt = pullStoppedAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task execution stopped.
     *         </p>
     */
    public java.util.Date getExecutionStoppedAt() {
        return executionStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     *
     * @param executionStoppedAt <p>
     *            The Unix timestamp for when the task execution stopped.
     *            </p>
     */
    public void setExecutionStoppedAt(java.util.Date executionStoppedAt) {
        this.executionStoppedAt = executionStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionStoppedAt <p>
     *            The Unix timestamp for when the task execution stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitTaskStateChangeRequest withExecutionStoppedAt(java.util.Date executionStoppedAt) {
        this.executionStoppedAt = executionStoppedAt;
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getTask() != null)
            sb.append("task: " + getTask() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getReason() != null)
            sb.append("reason: " + getReason() + ",");
        if (getContainers() != null)
            sb.append("containers: " + getContainers() + ",");
        if (getAttachments() != null)
            sb.append("attachments: " + getAttachments() + ",");
        if (getPullStartedAt() != null)
            sb.append("pullStartedAt: " + getPullStartedAt() + ",");
        if (getPullStoppedAt() != null)
            sb.append("pullStoppedAt: " + getPullStoppedAt() + ",");
        if (getExecutionStoppedAt() != null)
            sb.append("executionStoppedAt: " + getExecutionStoppedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getPullStartedAt() == null) ? 0 : getPullStartedAt().hashCode());
        hashCode = prime * hashCode
                + ((getPullStoppedAt() == null) ? 0 : getPullStoppedAt().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStoppedAt() == null) ? 0 : getExecutionStoppedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitTaskStateChangeRequest == false)
            return false;
        SubmitTaskStateChangeRequest other = (SubmitTaskStateChangeRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null
                && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getPullStartedAt() == null ^ this.getPullStartedAt() == null)
            return false;
        if (other.getPullStartedAt() != null
                && other.getPullStartedAt().equals(this.getPullStartedAt()) == false)
            return false;
        if (other.getPullStoppedAt() == null ^ this.getPullStoppedAt() == null)
            return false;
        if (other.getPullStoppedAt() != null
                && other.getPullStoppedAt().equals(this.getPullStoppedAt()) == false)
            return false;
        if (other.getExecutionStoppedAt() == null ^ this.getExecutionStoppedAt() == null)
            return false;
        if (other.getExecutionStoppedAt() != null
                && other.getExecutionStoppedAt().equals(this.getExecutionStoppedAt()) == false)
            return false;
        return true;
    }
}
