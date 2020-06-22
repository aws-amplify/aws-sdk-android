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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Combines the execution state and configuration of a step.
 * </p>
 */
public class StepDetail implements Serializable {
    /**
     * <p>
     * The step configuration.
     * </p>
     */
    private StepConfig stepConfig;

    /**
     * <p>
     * The description of the step status.
     * </p>
     */
    private StepExecutionStatusDetail executionStatusDetail;

    /**
     * <p>
     * The step configuration.
     * </p>
     *
     * @return <p>
     *         The step configuration.
     *         </p>
     */
    public StepConfig getStepConfig() {
        return stepConfig;
    }

    /**
     * <p>
     * The step configuration.
     * </p>
     *
     * @param stepConfig <p>
     *            The step configuration.
     *            </p>
     */
    public void setStepConfig(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
    }

    /**
     * <p>
     * The step configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepConfig <p>
     *            The step configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepDetail withStepConfig(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
        return this;
    }

    /**
     * <p>
     * The description of the step status.
     * </p>
     *
     * @return <p>
     *         The description of the step status.
     *         </p>
     */
    public StepExecutionStatusDetail getExecutionStatusDetail() {
        return executionStatusDetail;
    }

    /**
     * <p>
     * The description of the step status.
     * </p>
     *
     * @param executionStatusDetail <p>
     *            The description of the step status.
     *            </p>
     */
    public void setExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }

    /**
     * <p>
     * The description of the step status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionStatusDetail <p>
     *            The description of the step status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepDetail withExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
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
        if (getStepConfig() != null)
            sb.append("StepConfig: " + getStepConfig() + ",");
        if (getExecutionStatusDetail() != null)
            sb.append("ExecutionStatusDetail: " + getExecutionStatusDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepConfig() == null) ? 0 : getStepConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getExecutionStatusDetail() == null) ? 0 : getExecutionStatusDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepDetail == false)
            return false;
        StepDetail other = (StepDetail) obj;

        if (other.getStepConfig() == null ^ this.getStepConfig() == null)
            return false;
        if (other.getStepConfig() != null
                && other.getStepConfig().equals(this.getStepConfig()) == false)
            return false;
        if (other.getExecutionStatusDetail() == null ^ this.getExecutionStatusDetail() == null)
            return false;
        if (other.getExecutionStatusDetail() != null
                && other.getExecutionStatusDetail().equals(this.getExecutionStatusDetail()) == false)
            return false;
        return true;
    }
}
