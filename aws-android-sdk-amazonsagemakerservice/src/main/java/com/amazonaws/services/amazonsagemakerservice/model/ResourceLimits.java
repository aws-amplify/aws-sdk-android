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
 * Specifies the maximum number of training jobs and parallel training jobs that
 * a hyperparameter tuning job can launch.
 * </p>
 */
public class ResourceLimits implements Serializable {
    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can
     * launch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxNumberOfTrainingJobs;

    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter
     * tuning job can launch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxParallelTrainingJobs;

    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can
     * launch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of training jobs that a hyperparameter tuning
     *         job can launch.
     *         </p>
     */
    public Integer getMaxNumberOfTrainingJobs() {
        return maxNumberOfTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can
     * launch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxNumberOfTrainingJobs <p>
     *            The maximum number of training jobs that a hyperparameter
     *            tuning job can launch.
     *            </p>
     */
    public void setMaxNumberOfTrainingJobs(Integer maxNumberOfTrainingJobs) {
        this.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can
     * launch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxNumberOfTrainingJobs <p>
     *            The maximum number of training jobs that a hyperparameter
     *            tuning job can launch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceLimits withMaxNumberOfTrainingJobs(Integer maxNumberOfTrainingJobs) {
        this.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
        return this;
    }

    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter
     * tuning job can launch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of concurrent training jobs that a
     *         hyperparameter tuning job can launch.
     *         </p>
     */
    public Integer getMaxParallelTrainingJobs() {
        return maxParallelTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter
     * tuning job can launch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxParallelTrainingJobs <p>
     *            The maximum number of concurrent training jobs that a
     *            hyperparameter tuning job can launch.
     *            </p>
     */
    public void setMaxParallelTrainingJobs(Integer maxParallelTrainingJobs) {
        this.maxParallelTrainingJobs = maxParallelTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter
     * tuning job can launch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxParallelTrainingJobs <p>
     *            The maximum number of concurrent training jobs that a
     *            hyperparameter tuning job can launch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceLimits withMaxParallelTrainingJobs(Integer maxParallelTrainingJobs) {
        this.maxParallelTrainingJobs = maxParallelTrainingJobs;
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
        if (getMaxNumberOfTrainingJobs() != null)
            sb.append("MaxNumberOfTrainingJobs: " + getMaxNumberOfTrainingJobs() + ",");
        if (getMaxParallelTrainingJobs() != null)
            sb.append("MaxParallelTrainingJobs: " + getMaxParallelTrainingJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMaxNumberOfTrainingJobs() == null) ? 0 : getMaxNumberOfTrainingJobs()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxParallelTrainingJobs() == null) ? 0 : getMaxParallelTrainingJobs()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceLimits == false)
            return false;
        ResourceLimits other = (ResourceLimits) obj;

        if (other.getMaxNumberOfTrainingJobs() == null ^ this.getMaxNumberOfTrainingJobs() == null)
            return false;
        if (other.getMaxNumberOfTrainingJobs() != null
                && other.getMaxNumberOfTrainingJobs().equals(this.getMaxNumberOfTrainingJobs()) == false)
            return false;
        if (other.getMaxParallelTrainingJobs() == null ^ this.getMaxParallelTrainingJobs() == null)
            return false;
        if (other.getMaxParallelTrainingJobs() != null
                && other.getMaxParallelTrainingJobs().equals(this.getMaxParallelTrainingJobs()) == false)
            return false;
        return true;
    }
}
