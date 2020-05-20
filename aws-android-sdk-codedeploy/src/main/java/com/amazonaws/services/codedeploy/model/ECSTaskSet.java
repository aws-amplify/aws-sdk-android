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
 * Information about a set of Amazon ECS tasks in an AWS CodeDeploy deployment.
 * An Amazon ECS task set includes details such as the desired number of tasks,
 * how many tasks are running, and whether the task set serves production
 * traffic. An AWS CodeDeploy application that uses the Amazon ECS compute
 * platform deploys a containerized application in an Amazon ECS service as a
 * task set.
 * </p>
 */
public class ECSTaskSet implements Serializable {
    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     */
    private String identifer;

    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the
     * Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new
     * task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new
     * task set.
     * </p>
     */
    private Long desiredCount;

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>PENDING</code> state is preparing to enter the <code>RUNNING</code>
     * state. A task set enters the <code>PENDING</code> status when it launches
     * for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     */
    private Long pendingCount;

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>RUNNING</code> state is running and ready for use.
     * </p>
     */
    private Long runningCount;

    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being
     * stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     */
    private Double trafficWeight;

    /**
     * <p>
     * The target group associated with the task set. The target group is used
     * by AWS CodeDeploy to manage traffic to a task set.
     * </p>
     */
    private TargetGroupInfo targetGroup;

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (
     * <code>BLUE</code>) or a replacement target (<code>GREEN</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     */
    private String taskSetLabel;

    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     *
     * @return <p>
     *         A unique ID of an <code>ECSTaskSet</code>.
     *         </p>
     */
    public String getIdentifer() {
        return identifer;
    }

    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     *
     * @param identifer <p>
     *            A unique ID of an <code>ECSTaskSet</code>.
     *            </p>
     */
    public void setIdentifer(String identifer) {
        this.identifer = identifer;
    }

    /**
     * <p>
     * A unique ID of an <code>ECSTaskSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifer <p>
     *            A unique ID of an <code>ECSTaskSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTaskSet withIdentifer(String identifer) {
        this.identifer = identifer;
        return this;
    }

    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the
     * Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new
     * task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new
     * task set.
     * </p>
     *
     * @return <p>
     *         The number of tasks in a task set. During a deployment that uses
     *         the Amazon ECS compute type, CodeDeploy instructs Amazon ECS to
     *         create a new task set and uses this value to determine how many
     *         tasks to create. After the updated task set is created,
     *         CodeDeploy shifts traffic to the new task set.
     *         </p>
     */
    public Long getDesiredCount() {
        return desiredCount;
    }

    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the
     * Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new
     * task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new
     * task set.
     * </p>
     *
     * @param desiredCount <p>
     *            The number of tasks in a task set. During a deployment that
     *            uses the Amazon ECS compute type, CodeDeploy instructs Amazon
     *            ECS to create a new task set and uses this value to determine
     *            how many tasks to create. After the updated task set is
     *            created, CodeDeploy shifts traffic to the new task set.
     *            </p>
     */
    public void setDesiredCount(Long desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of tasks in a task set. During a deployment that uses the
     * Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new
     * task set and uses this value to determine how many tasks to create. After
     * the updated task set is created, CodeDeploy shifts traffic to the new
     * task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCount <p>
     *            The number of tasks in a task set. During a deployment that
     *            uses the Amazon ECS compute type, CodeDeploy instructs Amazon
     *            ECS to create a new task set and uses this value to determine
     *            how many tasks to create. After the updated task set is
     *            created, CodeDeploy shifts traffic to the new task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTaskSet withDesiredCount(Long desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>PENDING</code> state is preparing to enter the <code>RUNNING</code>
     * state. A task set enters the <code>PENDING</code> status when it launches
     * for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the task set that are in the
     *         <code>PENDING</code> status during an Amazon ECS deployment. A
     *         task in the <code>PENDING</code> state is preparing to enter the
     *         <code>RUNNING</code> state. A task set enters the
     *         <code>PENDING</code> status when it launches for the first time,
     *         or when it is restarted after being in the <code>STOPPED</code>
     *         state.
     *         </p>
     */
    public Long getPendingCount() {
        return pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>PENDING</code> state is preparing to enter the <code>RUNNING</code>
     * state. A task set enters the <code>PENDING</code> status when it launches
     * for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     *
     * @param pendingCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>PENDING</code> status during an Amazon ECS deployment. A
     *            task in the <code>PENDING</code> state is preparing to enter
     *            the <code>RUNNING</code> state. A task set enters the
     *            <code>PENDING</code> status when it launches for the first
     *            time, or when it is restarted after being in the
     *            <code>STOPPED</code> state.
     *            </p>
     */
    public void setPendingCount(Long pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>PENDING</code> state is preparing to enter the <code>RUNNING</code>
     * state. A task set enters the <code>PENDING</code> status when it launches
     * for the first time, or when it is restarted after being in the
     * <code>STOPPED</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>PENDING</code> status during an Amazon ECS deployment. A
     *            task in the <code>PENDING</code> state is preparing to enter
     *            the <code>RUNNING</code> state. A task set enters the
     *            <code>PENDING</code> status when it launches for the first
     *            time, or when it is restarted after being in the
     *            <code>STOPPED</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTaskSet withPendingCount(Long pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>RUNNING</code> state is running and ready for use.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the task set that are in the
     *         <code>RUNNING</code> status during an Amazon ECS deployment. A
     *         task in the <code>RUNNING</code> state is running and ready for
     *         use.
     *         </p>
     */
    public Long getRunningCount() {
        return runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>RUNNING</code> state is running and ready for use.
     * </p>
     *
     * @param runningCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>RUNNING</code> status during an Amazon ECS deployment. A
     *            task in the <code>RUNNING</code> state is running and ready
     *            for use.
     *            </p>
     */
    public void setRunningCount(Long runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during an Amazon ECS deployment. A task in the
     * <code>RUNNING</code> state is running and ready for use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>RUNNING</code> status during an Amazon ECS deployment. A
     *            task in the <code>RUNNING</code> state is running and ready
     *            for use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTaskSet withRunningCount(Long runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being
     * stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the task set. There are three valid task set
     *         statuses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRIMARY</code>: Indicates the task set is serving
     *         production traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>: Indicates the task set is not serving
     *         production traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DRAINING</code>: Indicates the tasks in the task set are
     *         being stopped and their corresponding targets are being
     *         deregistered from their target group.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being
     * stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The status of the task set. There are three valid task set
     *            statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PRIMARY</code>: Indicates the task set is serving
     *            production traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code>: Indicates the task set is not serving
     *            production traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DRAINING</code>: Indicates the tasks in the task set are
     *            being stopped and their corresponding targets are being
     *            deregistered from their target group.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task set. There are three valid task set statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIMARY</code>: Indicates the task set is serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: Indicates the task set is not serving production
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAINING</code>: Indicates the tasks in the task set are being
     * stopped and their corresponding targets are being deregistered from their
     * target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the task set. There are three valid task set
     *            statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PRIMARY</code>: Indicates the task set is serving
     *            production traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code>: Indicates the task set is not serving
     *            production traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DRAINING</code>: Indicates the tasks in the task set are
     *            being stopped and their corresponding targets are being
     *            deregistered from their target group.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTaskSet withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     *
     * @return <p>
     *         The percentage of traffic served by this task set.
     *         </p>
     */
    public Double getTrafficWeight() {
        return trafficWeight;
    }

    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     *
     * @param trafficWeight <p>
     *            The percentage of traffic served by this task set.
     *            </p>
     */
    public void setTrafficWeight(Double trafficWeight) {
        this.trafficWeight = trafficWeight;
    }

    /**
     * <p>
     * The percentage of traffic served by this task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficWeight <p>
     *            The percentage of traffic served by this task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTaskSet withTrafficWeight(Double trafficWeight) {
        this.trafficWeight = trafficWeight;
        return this;
    }

    /**
     * <p>
     * The target group associated with the task set. The target group is used
     * by AWS CodeDeploy to manage traffic to a task set.
     * </p>
     *
     * @return <p>
     *         The target group associated with the task set. The target group
     *         is used by AWS CodeDeploy to manage traffic to a task set.
     *         </p>
     */
    public TargetGroupInfo getTargetGroup() {
        return targetGroup;
    }

    /**
     * <p>
     * The target group associated with the task set. The target group is used
     * by AWS CodeDeploy to manage traffic to a task set.
     * </p>
     *
     * @param targetGroup <p>
     *            The target group associated with the task set. The target
     *            group is used by AWS CodeDeploy to manage traffic to a task
     *            set.
     *            </p>
     */
    public void setTargetGroup(TargetGroupInfo targetGroup) {
        this.targetGroup = targetGroup;
    }

    /**
     * <p>
     * The target group associated with the task set. The target group is used
     * by AWS CodeDeploy to manage traffic to a task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroup <p>
     *            The target group associated with the task set. The target
     *            group is used by AWS CodeDeploy to manage traffic to a task
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTaskSet withTargetGroup(TargetGroupInfo targetGroup) {
        this.targetGroup = targetGroup;
        return this;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (
     * <code>BLUE</code>) or a replacement target (<code>GREEN</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @return <p>
     *         A label that identifies whether the ECS task set is an original
     *         target (<code>BLUE</code>) or a replacement target (
     *         <code>GREEN</code>).
     *         </p>
     * @see TargetLabel
     */
    public String getTaskSetLabel() {
        return taskSetLabel;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (
     * <code>BLUE</code>) or a replacement target (<code>GREEN</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param taskSetLabel <p>
     *            A label that identifies whether the ECS task set is an
     *            original target (<code>BLUE</code>) or a replacement target (
     *            <code>GREEN</code>).
     *            </p>
     * @see TargetLabel
     */
    public void setTaskSetLabel(String taskSetLabel) {
        this.taskSetLabel = taskSetLabel;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (
     * <code>BLUE</code>) or a replacement target (<code>GREEN</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param taskSetLabel <p>
     *            A label that identifies whether the ECS task set is an
     *            original target (<code>BLUE</code>) or a replacement target (
     *            <code>GREEN</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetLabel
     */
    public ECSTaskSet withTaskSetLabel(String taskSetLabel) {
        this.taskSetLabel = taskSetLabel;
        return this;
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (
     * <code>BLUE</code>) or a replacement target (<code>GREEN</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param taskSetLabel <p>
     *            A label that identifies whether the ECS task set is an
     *            original target (<code>BLUE</code>) or a replacement target (
     *            <code>GREEN</code>).
     *            </p>
     * @see TargetLabel
     */
    public void setTaskSetLabel(TargetLabel taskSetLabel) {
        this.taskSetLabel = taskSetLabel.toString();
    }

    /**
     * <p>
     * A label that identifies whether the ECS task set is an original target (
     * <code>BLUE</code>) or a replacement target (<code>GREEN</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param taskSetLabel <p>
     *            A label that identifies whether the ECS task set is an
     *            original target (<code>BLUE</code>) or a replacement target (
     *            <code>GREEN</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetLabel
     */
    public ECSTaskSet withTaskSetLabel(TargetLabel taskSetLabel) {
        this.taskSetLabel = taskSetLabel.toString();
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
        if (getIdentifer() != null)
            sb.append("identifer: " + getIdentifer() + ",");
        if (getDesiredCount() != null)
            sb.append("desiredCount: " + getDesiredCount() + ",");
        if (getPendingCount() != null)
            sb.append("pendingCount: " + getPendingCount() + ",");
        if (getRunningCount() != null)
            sb.append("runningCount: " + getRunningCount() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getTrafficWeight() != null)
            sb.append("trafficWeight: " + getTrafficWeight() + ",");
        if (getTargetGroup() != null)
            sb.append("targetGroup: " + getTargetGroup() + ",");
        if (getTaskSetLabel() != null)
            sb.append("taskSetLabel: " + getTaskSetLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifer() == null) ? 0 : getIdentifer().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode
                + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode
                + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficWeight() == null) ? 0 : getTrafficWeight().hashCode());
        hashCode = prime * hashCode
                + ((getTargetGroup() == null) ? 0 : getTargetGroup().hashCode());
        hashCode = prime * hashCode
                + ((getTaskSetLabel() == null) ? 0 : getTaskSetLabel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSTaskSet == false)
            return false;
        ECSTaskSet other = (ECSTaskSet) obj;

        if (other.getIdentifer() == null ^ this.getIdentifer() == null)
            return false;
        if (other.getIdentifer() != null
                && other.getIdentifer().equals(this.getIdentifer()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null
                && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getPendingCount() == null ^ this.getPendingCount() == null)
            return false;
        if (other.getPendingCount() != null
                && other.getPendingCount().equals(this.getPendingCount()) == false)
            return false;
        if (other.getRunningCount() == null ^ this.getRunningCount() == null)
            return false;
        if (other.getRunningCount() != null
                && other.getRunningCount().equals(this.getRunningCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrafficWeight() == null ^ this.getTrafficWeight() == null)
            return false;
        if (other.getTrafficWeight() != null
                && other.getTrafficWeight().equals(this.getTrafficWeight()) == false)
            return false;
        if (other.getTargetGroup() == null ^ this.getTargetGroup() == null)
            return false;
        if (other.getTargetGroup() != null
                && other.getTargetGroup().equals(this.getTargetGroup()) == false)
            return false;
        if (other.getTaskSetLabel() == null ^ this.getTaskSetLabel() == null)
            return false;
        if (other.getTaskSetLabel() != null
                && other.getTaskSetLabel().equals(this.getTaskSetLabel()) == false)
            return false;
        return true;
    }
}
