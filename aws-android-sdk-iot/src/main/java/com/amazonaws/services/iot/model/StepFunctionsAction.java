/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Starts execution of a Step Functions state machine.
 * </p>
 */
public class StepFunctionsAction implements Serializable {
    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting
     * of this prefix followed by a UUID. Step Functions automatically creates a
     * unique name for each state machine execution if one is not provided.
     * </p>
     */
    private String executionNamePrefix;

    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be
     * started.
     * </p>
     */
    private String stateMachineName;

    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a
     * state machine ("Action":"states:StartExecution").
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting
     * of this prefix followed by a UUID. Step Functions automatically creates a
     * unique name for each state machine execution if one is not provided.
     * </p>
     *
     * @return <p>
     *         (Optional) A name will be given to the state machine execution
     *         consisting of this prefix followed by a UUID. Step Functions
     *         automatically creates a unique name for each state machine
     *         execution if one is not provided.
     *         </p>
     */
    public String getExecutionNamePrefix() {
        return executionNamePrefix;
    }

    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting
     * of this prefix followed by a UUID. Step Functions automatically creates a
     * unique name for each state machine execution if one is not provided.
     * </p>
     *
     * @param executionNamePrefix <p>
     *            (Optional) A name will be given to the state machine execution
     *            consisting of this prefix followed by a UUID. Step Functions
     *            automatically creates a unique name for each state machine
     *            execution if one is not provided.
     *            </p>
     */
    public void setExecutionNamePrefix(String executionNamePrefix) {
        this.executionNamePrefix = executionNamePrefix;
    }

    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting
     * of this prefix followed by a UUID. Step Functions automatically creates a
     * unique name for each state machine execution if one is not provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionNamePrefix <p>
     *            (Optional) A name will be given to the state machine execution
     *            consisting of this prefix followed by a UUID. Step Functions
     *            automatically creates a unique name for each state machine
     *            execution if one is not provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepFunctionsAction withExecutionNamePrefix(String executionNamePrefix) {
        this.executionNamePrefix = executionNamePrefix;
        return this;
    }

    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be
     * started.
     * </p>
     *
     * @return <p>
     *         The name of the Step Functions state machine whose execution will
     *         be started.
     *         </p>
     */
    public String getStateMachineName() {
        return stateMachineName;
    }

    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be
     * started.
     * </p>
     *
     * @param stateMachineName <p>
     *            The name of the Step Functions state machine whose execution
     *            will be started.
     *            </p>
     */
    public void setStateMachineName(String stateMachineName) {
        this.stateMachineName = stateMachineName;
    }

    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be
     * started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateMachineName <p>
     *            The name of the Step Functions state machine whose execution
     *            will be started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepFunctionsAction withStateMachineName(String stateMachineName) {
        this.stateMachineName = stateMachineName;
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a
     * state machine ("Action":"states:StartExecution").
     * </p>
     *
     * @return <p>
     *         The ARN of the role that grants IoT permission to start execution
     *         of a state machine ("Action":"states:StartExecution").
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a
     * state machine ("Action":"states:StartExecution").
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants IoT permission to start
     *            execution of a state machine
     *            ("Action":"states:StartExecution").
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a
     * state machine ("Action":"states:StartExecution").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the role that grants IoT permission to start
     *            execution of a state machine
     *            ("Action":"states:StartExecution").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepFunctionsAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getExecutionNamePrefix() != null)
            sb.append("executionNamePrefix: " + getExecutionNamePrefix() + ",");
        if (getStateMachineName() != null)
            sb.append("stateMachineName: " + getStateMachineName() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExecutionNamePrefix() == null) ? 0 : getExecutionNamePrefix().hashCode());
        hashCode = prime * hashCode
                + ((getStateMachineName() == null) ? 0 : getStateMachineName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepFunctionsAction == false)
            return false;
        StepFunctionsAction other = (StepFunctionsAction) obj;

        if (other.getExecutionNamePrefix() == null ^ this.getExecutionNamePrefix() == null)
            return false;
        if (other.getExecutionNamePrefix() != null
                && other.getExecutionNamePrefix().equals(this.getExecutionNamePrefix()) == false)
            return false;
        if (other.getStateMachineName() == null ^ this.getStateMachineName() == null)
            return false;
        if (other.getStateMachineName() != null
                && other.getStateMachineName().equals(this.getStateMachineName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
