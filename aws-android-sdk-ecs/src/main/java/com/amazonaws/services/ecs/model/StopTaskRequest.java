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
 * <p>
 * Stops a running task. Any tags associated with the task will be deleted.
 * </p>
 * <p>
 * When <a>StopTask</a> is called on a task, the equivalent of
 * <code>docker stop</code> is issued to the containers running in the task.
 * This results in a <code>SIGTERM</code> value and a default 30-second timeout,
 * after which the <code>SIGKILL</code> value is sent and the containers are
 * forcibly stopped. If the container handles the <code>SIGTERM</code> value
 * gracefully and exits within 30 seconds from receiving it, no
 * <code>SIGKILL</code> value is sent.
 * </p>
 * <note>
 * <p>
 * The default 30-second timeout can be configured on the Amazon ECS container
 * agent with the <code>ECS_CONTAINER_STOP_TIMEOUT</code> variable. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html"
 * >Amazon ECS Container Agent Configuration</a> in the <i>Amazon Elastic
 * Container Service Developer Guide</i>.
 * </p>
 * </note>
 */
public class StopTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task to stop. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     */
    private String task;

    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you
     * are using a custom scheduler, you can use this parameter to specify the
     * reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters
     * are allowed in this message.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task to stop. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the task to stop. If you do not specify a cluster, the
     *         default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task to stop. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the task to stop. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the task to stop. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the task to stop. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopTaskRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     *
     * @return <p>
     *         The task ID or full Amazon Resource Name (ARN) of the task to
     *         stop.
     *         </p>
     */
    public String getTask() {
        return task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     *
     * @param task <p>
     *            The task ID or full Amazon Resource Name (ARN) of the task to
     *            stop.
     *            </p>
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param task <p>
     *            The task ID or full Amazon Resource Name (ARN) of the task to
     *            stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopTaskRequest withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you
     * are using a custom scheduler, you can use this parameter to specify the
     * reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters
     * are allowed in this message.
     * </p>
     *
     * @return <p>
     *         An optional message specified when a task is stopped. For
     *         example, if you are using a custom scheduler, you can use this
     *         parameter to specify the reason for stopping the task here, and
     *         the message appears in subsequent <a>DescribeTasks</a> API
     *         operations on this task. Up to 255 characters are allowed in this
     *         message.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you
     * are using a custom scheduler, you can use this parameter to specify the
     * reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters
     * are allowed in this message.
     * </p>
     *
     * @param reason <p>
     *            An optional message specified when a task is stopped. For
     *            example, if you are using a custom scheduler, you can use this
     *            parameter to specify the reason for stopping the task here,
     *            and the message appears in subsequent <a>DescribeTasks</a> API
     *            operations on this task. Up to 255 characters are allowed in
     *            this message.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you
     * are using a custom scheduler, you can use this parameter to specify the
     * reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters
     * are allowed in this message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            An optional message specified when a task is stopped. For
     *            example, if you are using a custom scheduler, you can use this
     *            parameter to specify the reason for stopping the task here,
     *            and the message appears in subsequent <a>DescribeTasks</a> API
     *            operations on this task. Up to 255 characters are allowed in
     *            this message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopTaskRequest withReason(String reason) {
        this.reason = reason;
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
        if (getReason() != null)
            sb.append("reason: " + getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTaskRequest == false)
            return false;
        StopTaskRequest other = (StopTaskRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }
}
