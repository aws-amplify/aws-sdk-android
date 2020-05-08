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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * A set of conditions for stopping a labeling job. If any of the conditions are
 * met, the job is automatically stopped. You can use these conditions to
 * control the cost of data labeling.
 * </p>
 * <note>
 * <p>
 * Labeling jobs fail after 30 days with an appropriate client error message.
 * </p>
 * </note>
 */
public class LabelingJobStoppingConditions implements Serializable {
    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxHumanLabeledObjectCount;

    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxPercentageOfInputDatasetLabeled;

    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of objects that can be labeled by human
     *         workers.
     *         </p>
     */
    public Integer getMaxHumanLabeledObjectCount() {
        return maxHumanLabeledObjectCount;
    }

    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxHumanLabeledObjectCount <p>
     *            The maximum number of objects that can be labeled by human
     *            workers.
     *            </p>
     */
    public void setMaxHumanLabeledObjectCount(Integer maxHumanLabeledObjectCount) {
        this.maxHumanLabeledObjectCount = maxHumanLabeledObjectCount;
    }

    /**
     * <p>
     * The maximum number of objects that can be labeled by human workers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxHumanLabeledObjectCount <p>
     *            The maximum number of objects that can be labeled by human
     *            workers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobStoppingConditions withMaxHumanLabeledObjectCount(
            Integer maxHumanLabeledObjectCount) {
        this.maxHumanLabeledObjectCount = maxHumanLabeledObjectCount;
        return this;
    }

    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of input data objects that should be labeled.
     *         </p>
     */
    public Integer getMaxPercentageOfInputDatasetLabeled() {
        return maxPercentageOfInputDatasetLabeled;
    }

    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxPercentageOfInputDatasetLabeled <p>
     *            The maximum number of input data objects that should be
     *            labeled.
     *            </p>
     */
    public void setMaxPercentageOfInputDatasetLabeled(Integer maxPercentageOfInputDatasetLabeled) {
        this.maxPercentageOfInputDatasetLabeled = maxPercentageOfInputDatasetLabeled;
    }

    /**
     * <p>
     * The maximum number of input data objects that should be labeled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxPercentageOfInputDatasetLabeled <p>
     *            The maximum number of input data objects that should be
     *            labeled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobStoppingConditions withMaxPercentageOfInputDatasetLabeled(
            Integer maxPercentageOfInputDatasetLabeled) {
        this.maxPercentageOfInputDatasetLabeled = maxPercentageOfInputDatasetLabeled;
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
        if (getMaxHumanLabeledObjectCount() != null)
            sb.append("MaxHumanLabeledObjectCount: " + getMaxHumanLabeledObjectCount() + ",");
        if (getMaxPercentageOfInputDatasetLabeled() != null)
            sb.append("MaxPercentageOfInputDatasetLabeled: "
                    + getMaxPercentageOfInputDatasetLabeled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMaxHumanLabeledObjectCount() == null) ? 0 : getMaxHumanLabeledObjectCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxPercentageOfInputDatasetLabeled() == null) ? 0
                        : getMaxPercentageOfInputDatasetLabeled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobStoppingConditions == false)
            return false;
        LabelingJobStoppingConditions other = (LabelingJobStoppingConditions) obj;

        if (other.getMaxHumanLabeledObjectCount() == null
                ^ this.getMaxHumanLabeledObjectCount() == null)
            return false;
        if (other.getMaxHumanLabeledObjectCount() != null
                && other.getMaxHumanLabeledObjectCount().equals(
                        this.getMaxHumanLabeledObjectCount()) == false)
            return false;
        if (other.getMaxPercentageOfInputDatasetLabeled() == null
                ^ this.getMaxPercentageOfInputDatasetLabeled() == null)
            return false;
        if (other.getMaxPercentageOfInputDatasetLabeled() != null
                && other.getMaxPercentageOfInputDatasetLabeled().equals(
                        this.getMaxPercentageOfInputDatasetLabeled()) == false)
            return false;
        return true;
    }
}
