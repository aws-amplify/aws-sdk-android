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
 * Specifies a limit to how long a model training or compilation job can run. It
 * also specifies how long you are willing to wait for a managed spot training
 * job to complete. When the job reaches the time limit, Amazon SageMaker ends
 * the training or compilation job. Use this API to cap model training costs.
 * </p>
 * <p>
 * To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code>
 * signal, which delays job termination for 120 seconds. Algorithms can use this
 * 120-second window to save the model artifacts, so the results of training are
 * not lost.
 * </p>
 * <p>
 * The training algorithms provided by Amazon SageMaker automatically save the
 * intermediate results of a model training job when possible. This attempt to
 * save artifacts is only a best effort case as model might not be in a state
 * from which it can be saved. For example, if training has just started, the
 * model might not be ready to save. When saved, this intermediate data is a
 * valid model artifact. You can use it to create a model with
 * <code>CreateModel</code>.
 * </p>
 * <note>
 * <p>
 * The Neural Topic Model (NTM) currently does not support saving intermediate
 * model artifacts. When training NTMs, make sure that the maximum runtime is
 * sufficient for the training job to complete.
 * </p>
 * </note>
 */
public class StoppingCondition implements Serializable {
    /**
     * <p>
     * The maximum length of time, in seconds, that the training or compilation
     * job can run. If job does not complete during this time, Amazon SageMaker
     * ends the job. If value is not specified, default value is 1 day. The
     * maximum value is 28 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxRuntimeInSeconds;

    /**
     * <p>
     * The maximum length of time, in seconds, how long you are willing to wait
     * for a managed spot training job to complete. It is the amount of time
     * spent waiting for Spot capacity plus the amount of time the training job
     * runs. It must be equal to or greater than
     * <code>MaxRuntimeInSeconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxWaitTimeInSeconds;

    /**
     * <p>
     * The maximum length of time, in seconds, that the training or compilation
     * job can run. If job does not complete during this time, Amazon SageMaker
     * ends the job. If value is not specified, default value is 1 day. The
     * maximum value is 28 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum length of time, in seconds, that the training or
     *         compilation job can run. If job does not complete during this
     *         time, Amazon SageMaker ends the job. If value is not specified,
     *         default value is 1 day. The maximum value is 28 days.
     *         </p>
     */
    public Integer getMaxRuntimeInSeconds() {
        return maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum length of time, in seconds, that the training or compilation
     * job can run. If job does not complete during this time, Amazon SageMaker
     * ends the job. If value is not specified, default value is 1 day. The
     * maximum value is 28 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRuntimeInSeconds <p>
     *            The maximum length of time, in seconds, that the training or
     *            compilation job can run. If job does not complete during this
     *            time, Amazon SageMaker ends the job. If value is not
     *            specified, default value is 1 day. The maximum value is 28
     *            days.
     *            </p>
     */
    public void setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum length of time, in seconds, that the training or compilation
     * job can run. If job does not complete during this time, Amazon SageMaker
     * ends the job. If value is not specified, default value is 1 day. The
     * maximum value is 28 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRuntimeInSeconds <p>
     *            The maximum length of time, in seconds, that the training or
     *            compilation job can run. If job does not complete during this
     *            time, Amazon SageMaker ends the job. If value is not
     *            specified, default value is 1 day. The maximum value is 28
     *            days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StoppingCondition withMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The maximum length of time, in seconds, how long you are willing to wait
     * for a managed spot training job to complete. It is the amount of time
     * spent waiting for Spot capacity plus the amount of time the training job
     * runs. It must be equal to or greater than
     * <code>MaxRuntimeInSeconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum length of time, in seconds, how long you are willing
     *         to wait for a managed spot training job to complete. It is the
     *         amount of time spent waiting for Spot capacity plus the amount of
     *         time the training job runs. It must be equal to or greater than
     *         <code>MaxRuntimeInSeconds</code>.
     *         </p>
     */
    public Integer getMaxWaitTimeInSeconds() {
        return maxWaitTimeInSeconds;
    }

    /**
     * <p>
     * The maximum length of time, in seconds, how long you are willing to wait
     * for a managed spot training job to complete. It is the amount of time
     * spent waiting for Spot capacity plus the amount of time the training job
     * runs. It must be equal to or greater than
     * <code>MaxRuntimeInSeconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxWaitTimeInSeconds <p>
     *            The maximum length of time, in seconds, how long you are
     *            willing to wait for a managed spot training job to complete.
     *            It is the amount of time spent waiting for Spot capacity plus
     *            the amount of time the training job runs. It must be equal to
     *            or greater than <code>MaxRuntimeInSeconds</code>.
     *            </p>
     */
    public void setMaxWaitTimeInSeconds(Integer maxWaitTimeInSeconds) {
        this.maxWaitTimeInSeconds = maxWaitTimeInSeconds;
    }

    /**
     * <p>
     * The maximum length of time, in seconds, how long you are willing to wait
     * for a managed spot training job to complete. It is the amount of time
     * spent waiting for Spot capacity plus the amount of time the training job
     * runs. It must be equal to or greater than
     * <code>MaxRuntimeInSeconds</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxWaitTimeInSeconds <p>
     *            The maximum length of time, in seconds, how long you are
     *            willing to wait for a managed spot training job to complete.
     *            It is the amount of time spent waiting for Spot capacity plus
     *            the amount of time the training job runs. It must be equal to
     *            or greater than <code>MaxRuntimeInSeconds</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StoppingCondition withMaxWaitTimeInSeconds(Integer maxWaitTimeInSeconds) {
        this.maxWaitTimeInSeconds = maxWaitTimeInSeconds;
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
        if (getMaxRuntimeInSeconds() != null)
            sb.append("MaxRuntimeInSeconds: " + getMaxRuntimeInSeconds() + ",");
        if (getMaxWaitTimeInSeconds() != null)
            sb.append("MaxWaitTimeInSeconds: " + getMaxWaitTimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxRuntimeInSeconds() == null) ? 0 : getMaxRuntimeInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getMaxWaitTimeInSeconds() == null) ? 0 : getMaxWaitTimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StoppingCondition == false)
            return false;
        StoppingCondition other = (StoppingCondition) obj;

        if (other.getMaxRuntimeInSeconds() == null ^ this.getMaxRuntimeInSeconds() == null)
            return false;
        if (other.getMaxRuntimeInSeconds() != null
                && other.getMaxRuntimeInSeconds().equals(this.getMaxRuntimeInSeconds()) == false)
            return false;
        if (other.getMaxWaitTimeInSeconds() == null ^ this.getMaxWaitTimeInSeconds() == null)
            return false;
        if (other.getMaxWaitTimeInSeconds() != null
                && other.getMaxWaitTimeInSeconds().equals(this.getMaxWaitTimeInSeconds()) == false)
            return false;
        return true;
    }
}
