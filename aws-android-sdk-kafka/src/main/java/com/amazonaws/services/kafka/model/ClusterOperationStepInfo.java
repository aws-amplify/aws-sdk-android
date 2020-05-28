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
 * State information about the operation step.
 * </p>
 */
public class ClusterOperationStepInfo implements Serializable {
    /**
     * 
     <p>
     * The steps current status.
     * </p>
     */
    private String stepStatus;

    /**
     * 
     <p>
     * The steps current status.
     * </p>
     * 
     * @return <p>
     *         The steps current status.
     *         </p>
     */
    public String getStepStatus() {
        return stepStatus;
    }

    /**
     * 
     <p>
     * The steps current status.
     * </p>
     * 
     * @param stepStatus <p>
     *            The steps current status.
     *            </p>
     */
    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * 
     <p>
     * The steps current status.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepStatus <p>
     *            The steps current status.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterOperationStepInfo withStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
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
        if (getStepStatus() != null)
            sb.append("StepStatus: " + getStepStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationStepInfo == false)
            return false;
        ClusterOperationStepInfo other = (ClusterOperationStepInfo) obj;

        if (other.getStepStatus() == null ^ this.getStepStatus() == null)
            return false;
        if (other.getStepStatus() != null
                && other.getStepStatus().equals(this.getStepStatus()) == false)
            return false;
        return true;
    }
}
