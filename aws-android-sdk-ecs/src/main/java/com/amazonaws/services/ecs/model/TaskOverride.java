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

/**
 * <p>
 * The overrides associated with a task.
 * </p>
 */
public class TaskOverride implements Serializable {
    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     */
    private java.util.List<ContainerOverride> containerOverrides;

    /**
     * <p>
     * The cpu override for the task.
     * </p>
     */
    private String cpu;

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     */
    private java.util.List<InferenceAcceleratorOverride> inferenceAcceleratorOverrides;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override
     * for the task.
     * </p>
     */
    private String executionRoleArn;

    /**
     * <p>
     * The memory override for the task.
     * </p>
     */
    private String memory;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this
     * task can assume. All containers in this task are granted the permissions
     * that are specified in this role.
     * </p>
     */
    private String taskRoleArn;

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     *
     * @return <p>
     *         One or more container overrides sent to a task.
     *         </p>
     */
    public java.util.List<ContainerOverride> getContainerOverrides() {
        return containerOverrides;
    }

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     *
     * @param containerOverrides <p>
     *            One or more container overrides sent to a task.
     *            </p>
     */
    public void setContainerOverrides(java.util.Collection<ContainerOverride> containerOverrides) {
        if (containerOverrides == null) {
            this.containerOverrides = null;
            return;
        }

        this.containerOverrides = new java.util.ArrayList<ContainerOverride>(containerOverrides);
    }

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerOverrides <p>
     *            One or more container overrides sent to a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withContainerOverrides(ContainerOverride... containerOverrides) {
        if (getContainerOverrides() == null) {
            this.containerOverrides = new java.util.ArrayList<ContainerOverride>(
                    containerOverrides.length);
        }
        for (ContainerOverride value : containerOverrides) {
            this.containerOverrides.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more container overrides sent to a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerOverrides <p>
     *            One or more container overrides sent to a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withContainerOverrides(
            java.util.Collection<ContainerOverride> containerOverrides) {
        setContainerOverrides(containerOverrides);
        return this;
    }

    /**
     * <p>
     * The cpu override for the task.
     * </p>
     *
     * @return <p>
     *         The cpu override for the task.
     *         </p>
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * <p>
     * The cpu override for the task.
     * </p>
     *
     * @param cpu <p>
     *            The cpu override for the task.
     *            </p>
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The cpu override for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpu <p>
     *            The cpu override for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     *
     * @return <p>
     *         The Elastic Inference accelerator override for the task.
     *         </p>
     */
    public java.util.List<InferenceAcceleratorOverride> getInferenceAcceleratorOverrides() {
        return inferenceAcceleratorOverrides;
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     *
     * @param inferenceAcceleratorOverrides <p>
     *            The Elastic Inference accelerator override for the task.
     *            </p>
     */
    public void setInferenceAcceleratorOverrides(
            java.util.Collection<InferenceAcceleratorOverride> inferenceAcceleratorOverrides) {
        if (inferenceAcceleratorOverrides == null) {
            this.inferenceAcceleratorOverrides = null;
            return;
        }

        this.inferenceAcceleratorOverrides = new java.util.ArrayList<InferenceAcceleratorOverride>(
                inferenceAcceleratorOverrides);
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceAcceleratorOverrides <p>
     *            The Elastic Inference accelerator override for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withInferenceAcceleratorOverrides(
            InferenceAcceleratorOverride... inferenceAcceleratorOverrides) {
        if (getInferenceAcceleratorOverrides() == null) {
            this.inferenceAcceleratorOverrides = new java.util.ArrayList<InferenceAcceleratorOverride>(
                    inferenceAcceleratorOverrides.length);
        }
        for (InferenceAcceleratorOverride value : inferenceAcceleratorOverrides) {
            this.inferenceAcceleratorOverrides.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceAcceleratorOverrides <p>
     *            The Elastic Inference accelerator override for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withInferenceAcceleratorOverrides(
            java.util.Collection<InferenceAcceleratorOverride> inferenceAcceleratorOverrides) {
        setInferenceAcceleratorOverrides(inferenceAcceleratorOverrides);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override
     * for the task.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the task execution IAM role
     *         override for the task.
     *         </p>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override
     * for the task.
     * </p>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the task execution IAM role
     *            override for the task.
     *            </p>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override
     * for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the task execution IAM role
     *            override for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * The memory override for the task.
     * </p>
     *
     * @return <p>
     *         The memory override for the task.
     *         </p>
     */
    public String getMemory() {
        return memory;
    }

    /**
     * <p>
     * The memory override for the task.
     * </p>
     *
     * @param memory <p>
     *            The memory override for the task.
     *            </p>
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The memory override for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memory <p>
     *            The memory override for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this
     * task can assume. All containers in this task are granted the permissions
     * that are specified in this role.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that containers in
     *         this task can assume. All containers in this task are granted the
     *         permissions that are specified in this role.
     *         </p>
     */
    public String getTaskRoleArn() {
        return taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this
     * task can assume. All containers in this task are granted the permissions
     * that are specified in this role.
     * </p>
     *
     * @param taskRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that containers
     *            in this task can assume. All containers in this task are
     *            granted the permissions that are specified in this role.
     *            </p>
     */
    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this
     * task can assume. All containers in this task are granted the permissions
     * that are specified in this role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that containers
     *            in this task can assume. All containers in this task are
     *            granted the permissions that are specified in this role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskOverride withTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
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
        if (getContainerOverrides() != null)
            sb.append("containerOverrides: " + getContainerOverrides() + ",");
        if (getCpu() != null)
            sb.append("cpu: " + getCpu() + ",");
        if (getInferenceAcceleratorOverrides() != null)
            sb.append("inferenceAcceleratorOverrides: " + getInferenceAcceleratorOverrides() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("executionRoleArn: " + getExecutionRoleArn() + ",");
        if (getMemory() != null)
            sb.append("memory: " + getMemory() + ",");
        if (getTaskRoleArn() != null)
            sb.append("taskRoleArn: " + getTaskRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime
                * hashCode
                + ((getInferenceAcceleratorOverrides() == null) ? 0
                        : getInferenceAcceleratorOverrides().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode
                + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskOverride == false)
            return false;
        TaskOverride other = (TaskOverride) obj;

        if (other.getContainerOverrides() == null ^ this.getContainerOverrides() == null)
            return false;
        if (other.getContainerOverrides() != null
                && other.getContainerOverrides().equals(this.getContainerOverrides()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getInferenceAcceleratorOverrides() == null
                ^ this.getInferenceAcceleratorOverrides() == null)
            return false;
        if (other.getInferenceAcceleratorOverrides() != null
                && other.getInferenceAcceleratorOverrides().equals(
                        this.getInferenceAcceleratorOverrides()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null
                && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        return true;
    }
}
