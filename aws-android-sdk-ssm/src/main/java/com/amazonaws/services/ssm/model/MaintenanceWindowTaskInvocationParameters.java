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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The parameters for task execution.
 * </p>
 */
public class MaintenanceWindowTaskInvocationParameters implements Serializable {
    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     */
    private MaintenanceWindowRunCommandParameters runCommand;

    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     */
    private MaintenanceWindowAutomationParameters automation;

    /**
     * <p>
     * The parameters for a STEP_FUNCTIONS task type.
     * </p>
     */
    private MaintenanceWindowStepFunctionsParameters stepFunctions;

    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     */
    private MaintenanceWindowLambdaParameters lambda;

    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     *
     * @return <p>
     *         The parameters for a RUN_COMMAND task type.
     *         </p>
     */
    public MaintenanceWindowRunCommandParameters getRunCommand() {
        return runCommand;
    }

    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     *
     * @param runCommand <p>
     *            The parameters for a RUN_COMMAND task type.
     *            </p>
     */
    public void setRunCommand(MaintenanceWindowRunCommandParameters runCommand) {
        this.runCommand = runCommand;
    }

    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runCommand <p>
     *            The parameters for a RUN_COMMAND task type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTaskInvocationParameters withRunCommand(
            MaintenanceWindowRunCommandParameters runCommand) {
        this.runCommand = runCommand;
        return this;
    }

    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     *
     * @return <p>
     *         The parameters for an AUTOMATION task type.
     *         </p>
     */
    public MaintenanceWindowAutomationParameters getAutomation() {
        return automation;
    }

    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     *
     * @param automation <p>
     *            The parameters for an AUTOMATION task type.
     *            </p>
     */
    public void setAutomation(MaintenanceWindowAutomationParameters automation) {
        this.automation = automation;
    }

    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automation <p>
     *            The parameters for an AUTOMATION task type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTaskInvocationParameters withAutomation(
            MaintenanceWindowAutomationParameters automation) {
        this.automation = automation;
        return this;
    }

    /**
     * <p>
     * The parameters for a STEP_FUNCTIONS task type.
     * </p>
     *
     * @return <p>
     *         The parameters for a STEP_FUNCTIONS task type.
     *         </p>
     */
    public MaintenanceWindowStepFunctionsParameters getStepFunctions() {
        return stepFunctions;
    }

    /**
     * <p>
     * The parameters for a STEP_FUNCTIONS task type.
     * </p>
     *
     * @param stepFunctions <p>
     *            The parameters for a STEP_FUNCTIONS task type.
     *            </p>
     */
    public void setStepFunctions(MaintenanceWindowStepFunctionsParameters stepFunctions) {
        this.stepFunctions = stepFunctions;
    }

    /**
     * <p>
     * The parameters for a STEP_FUNCTIONS task type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepFunctions <p>
     *            The parameters for a STEP_FUNCTIONS task type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTaskInvocationParameters withStepFunctions(
            MaintenanceWindowStepFunctionsParameters stepFunctions) {
        this.stepFunctions = stepFunctions;
        return this;
    }

    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     *
     * @return <p>
     *         The parameters for a LAMBDA task type.
     *         </p>
     */
    public MaintenanceWindowLambdaParameters getLambda() {
        return lambda;
    }

    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     *
     * @param lambda <p>
     *            The parameters for a LAMBDA task type.
     *            </p>
     */
    public void setLambda(MaintenanceWindowLambdaParameters lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambda <p>
     *            The parameters for a LAMBDA task type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTaskInvocationParameters withLambda(
            MaintenanceWindowLambdaParameters lambda) {
        this.lambda = lambda;
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
        if (getRunCommand() != null)
            sb.append("RunCommand: " + getRunCommand() + ",");
        if (getAutomation() != null)
            sb.append("Automation: " + getAutomation() + ",");
        if (getStepFunctions() != null)
            sb.append("StepFunctions: " + getStepFunctions() + ",");
        if (getLambda() != null)
            sb.append("Lambda: " + getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunCommand() == null) ? 0 : getRunCommand().hashCode());
        hashCode = prime * hashCode + ((getAutomation() == null) ? 0 : getAutomation().hashCode());
        hashCode = prime * hashCode
                + ((getStepFunctions() == null) ? 0 : getStepFunctions().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowTaskInvocationParameters == false)
            return false;
        MaintenanceWindowTaskInvocationParameters other = (MaintenanceWindowTaskInvocationParameters) obj;

        if (other.getRunCommand() == null ^ this.getRunCommand() == null)
            return false;
        if (other.getRunCommand() != null
                && other.getRunCommand().equals(this.getRunCommand()) == false)
            return false;
        if (other.getAutomation() == null ^ this.getAutomation() == null)
            return false;
        if (other.getAutomation() != null
                && other.getAutomation().equals(this.getAutomation()) == false)
            return false;
        if (other.getStepFunctions() == null ^ this.getStepFunctions() == null)
            return false;
        if (other.getStepFunctions() != null
                && other.getStepFunctions().equals(this.getStepFunctions()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }
}
