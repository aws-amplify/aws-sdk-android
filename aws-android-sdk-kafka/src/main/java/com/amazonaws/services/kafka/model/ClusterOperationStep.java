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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Step taken during a cluster operation.
 * </p>
 */
public class ClusterOperationStep implements Serializable {
    /**
     * 
     <p>
     * Information about the step and its status.
     * </p>
     */
    private ClusterOperationStepInfo stepInfo;

    /**
     * 
     <p>
     * The name of the step.
     * </p>
     */
    private String stepName;

    /**
     * 
     <p>
     * Information about the step and its status.
     * </p>
     * 
     * @return <p>
     *         Information about the step and its status.
     *         </p>
     */
    public ClusterOperationStepInfo getStepInfo() {
        return stepInfo;
    }

    /**
     * 
     <p>
     * Information about the step and its status.
     * </p>
     * 
     * @param stepInfo <p>
     *            Information about the step and its status.
     *            </p>
     */
    public void setStepInfo(ClusterOperationStepInfo stepInfo) {
        this.stepInfo = stepInfo;
    }

    /**
     * 
     <p>
     * Information about the step and its status.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepInfo <p>
     *            Information about the step and its status.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationStep withStepInfo(ClusterOperationStepInfo stepInfo) {
        this.stepInfo = stepInfo;
        return this;
    }

    /**
     * 
     <p>
     * The name of the step.
     * </p>
     * 
     * @return <p>
     *         The name of the step.
     *         </p>
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * 
     <p>
     * The name of the step.
     * </p>
     * 
     * @param stepName <p>
     *            The name of the step.
     *            </p>
     */
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * 
     <p>
     * The name of the step.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepName <p>
     *            The name of the step.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationStep withStepName(String stepName) {
        this.stepName = stepName;
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
        if (getStepInfo() != null)
            sb.append("StepInfo: " + getStepInfo() + ",");
        if (getStepName() != null)
            sb.append("StepName: " + getStepName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepInfo() == null) ? 0 : getStepInfo().hashCode());
        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationStep == false)
            return false;
        ClusterOperationStep other = (ClusterOperationStep) obj;

        if (other.getStepInfo() == null ^ this.getStepInfo() == null)
            return false;
        if (other.getStepInfo() != null && other.getStepInfo().equals(this.getStepInfo()) == false)
            return false;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        return true;
    }
}
