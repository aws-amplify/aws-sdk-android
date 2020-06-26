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
 * How long a job is allowed to run, or how many candidates a job is allowed to
 * generate.
 * </p>
 */
public class AutoMLJobCompletionCriteria implements Serializable {
    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxCandidates;

    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxRuntimePerTrainingJobInSeconds;

    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a
     * trial to complete. It must be equal to or greater than
     * MaxRuntimePerTrainingJobInSeconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxAutoMLJobRuntimeInSeconds;

    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of times a training job is allowed to run.
     *         </p>
     */
    public Integer getMaxCandidates() {
        return maxCandidates;
    }

    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxCandidates <p>
     *            The maximum number of times a training job is allowed to run.
     *            </p>
     */
    public void setMaxCandidates(Integer maxCandidates) {
        this.maxCandidates = maxCandidates;
    }

    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxCandidates <p>
     *            The maximum number of times a training job is allowed to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobCompletionCriteria withMaxCandidates(Integer maxCandidates) {
        this.maxCandidates = maxCandidates;
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum time, in seconds, a job is allowed to run.
     *         </p>
     */
    public Integer getMaxRuntimePerTrainingJobInSeconds() {
        return maxRuntimePerTrainingJobInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRuntimePerTrainingJobInSeconds <p>
     *            The maximum time, in seconds, a job is allowed to run.
     *            </p>
     */
    public void setMaxRuntimePerTrainingJobInSeconds(Integer maxRuntimePerTrainingJobInSeconds) {
        this.maxRuntimePerTrainingJobInSeconds = maxRuntimePerTrainingJobInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRuntimePerTrainingJobInSeconds <p>
     *            The maximum time, in seconds, a job is allowed to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobCompletionCriteria withMaxRuntimePerTrainingJobInSeconds(
            Integer maxRuntimePerTrainingJobInSeconds) {
        this.maxRuntimePerTrainingJobInSeconds = maxRuntimePerTrainingJobInSeconds;
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a
     * trial to complete. It must be equal to or greater than
     * MaxRuntimePerTrainingJobInSeconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum time, in seconds, an AutoML job is allowed to wait
     *         for a trial to complete. It must be equal to or greater than
     *         MaxRuntimePerTrainingJobInSeconds.
     *         </p>
     */
    public Integer getMaxAutoMLJobRuntimeInSeconds() {
        return maxAutoMLJobRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a
     * trial to complete. It must be equal to or greater than
     * MaxRuntimePerTrainingJobInSeconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxAutoMLJobRuntimeInSeconds <p>
     *            The maximum time, in seconds, an AutoML job is allowed to wait
     *            for a trial to complete. It must be equal to or greater than
     *            MaxRuntimePerTrainingJobInSeconds.
     *            </p>
     */
    public void setMaxAutoMLJobRuntimeInSeconds(Integer maxAutoMLJobRuntimeInSeconds) {
        this.maxAutoMLJobRuntimeInSeconds = maxAutoMLJobRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a
     * trial to complete. It must be equal to or greater than
     * MaxRuntimePerTrainingJobInSeconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxAutoMLJobRuntimeInSeconds <p>
     *            The maximum time, in seconds, an AutoML job is allowed to wait
     *            for a trial to complete. It must be equal to or greater than
     *            MaxRuntimePerTrainingJobInSeconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobCompletionCriteria withMaxAutoMLJobRuntimeInSeconds(
            Integer maxAutoMLJobRuntimeInSeconds) {
        this.maxAutoMLJobRuntimeInSeconds = maxAutoMLJobRuntimeInSeconds;
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
        if (getMaxCandidates() != null)
            sb.append("MaxCandidates: " + getMaxCandidates() + ",");
        if (getMaxRuntimePerTrainingJobInSeconds() != null)
            sb.append("MaxRuntimePerTrainingJobInSeconds: "
                    + getMaxRuntimePerTrainingJobInSeconds() + ",");
        if (getMaxAutoMLJobRuntimeInSeconds() != null)
            sb.append("MaxAutoMLJobRuntimeInSeconds: " + getMaxAutoMLJobRuntimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxCandidates() == null) ? 0 : getMaxCandidates().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxRuntimePerTrainingJobInSeconds() == null) ? 0
                        : getMaxRuntimePerTrainingJobInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxAutoMLJobRuntimeInSeconds() == null) ? 0
                        : getMaxAutoMLJobRuntimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobCompletionCriteria == false)
            return false;
        AutoMLJobCompletionCriteria other = (AutoMLJobCompletionCriteria) obj;

        if (other.getMaxCandidates() == null ^ this.getMaxCandidates() == null)
            return false;
        if (other.getMaxCandidates() != null
                && other.getMaxCandidates().equals(this.getMaxCandidates()) == false)
            return false;
        if (other.getMaxRuntimePerTrainingJobInSeconds() == null
                ^ this.getMaxRuntimePerTrainingJobInSeconds() == null)
            return false;
        if (other.getMaxRuntimePerTrainingJobInSeconds() != null
                && other.getMaxRuntimePerTrainingJobInSeconds().equals(
                        this.getMaxRuntimePerTrainingJobInSeconds()) == false)
            return false;
        if (other.getMaxAutoMLJobRuntimeInSeconds() == null
                ^ this.getMaxAutoMLJobRuntimeInSeconds() == null)
            return false;
        if (other.getMaxAutoMLJobRuntimeInSeconds() != null
                && other.getMaxAutoMLJobRuntimeInSeconds().equals(
                        this.getMaxAutoMLJobRuntimeInSeconds()) == false)
            return false;
        return true;
    }
}
