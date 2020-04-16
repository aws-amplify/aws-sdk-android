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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The job completion criteria.
 * </p>
 */
public class TuningJobCompletionCriteria implements Serializable {
    /**
     * <p>
     * The objective metric's value.
     * </p>
     */
    private Float targetObjectiveMetricValue;

    /**
     * <p>
     * The objective metric's value.
     * </p>
     *
     * @return <p>
     *         The objective metric's value.
     *         </p>
     */
    public Float getTargetObjectiveMetricValue() {
        return targetObjectiveMetricValue;
    }

    /**
     * <p>
     * The objective metric's value.
     * </p>
     *
     * @param targetObjectiveMetricValue <p>
     *            The objective metric's value.
     *            </p>
     */
    public void setTargetObjectiveMetricValue(Float targetObjectiveMetricValue) {
        this.targetObjectiveMetricValue = targetObjectiveMetricValue;
    }

    /**
     * <p>
     * The objective metric's value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetObjectiveMetricValue <p>
     *            The objective metric's value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TuningJobCompletionCriteria withTargetObjectiveMetricValue(
            Float targetObjectiveMetricValue) {
        this.targetObjectiveMetricValue = targetObjectiveMetricValue;
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
        if (getTargetObjectiveMetricValue() != null)
            sb.append("TargetObjectiveMetricValue: " + getTargetObjectiveMetricValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTargetObjectiveMetricValue() == null) ? 0 : getTargetObjectiveMetricValue()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TuningJobCompletionCriteria == false)
            return false;
        TuningJobCompletionCriteria other = (TuningJobCompletionCriteria) obj;

        if (other.getTargetObjectiveMetricValue() == null
                ^ this.getTargetObjectiveMetricValue() == null)
            return false;
        if (other.getTargetObjectiveMetricValue() != null
                && other.getTargetObjectiveMetricValue().equals(
                        this.getTargetObjectiveMetricValue()) == false)
            return false;
        return true;
    }
}
