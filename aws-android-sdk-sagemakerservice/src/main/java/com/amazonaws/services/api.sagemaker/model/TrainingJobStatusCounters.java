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
 * The numbers of training jobs launched by a hyperparameter tuning job,
 * categorized by status.
 * </p>
 */
public class TrainingJobStatusCounters implements Serializable {
    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter
     * tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer completed;

    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter
     * tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer inProgress;

    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed
     * training job can be retried only if it failed because an internal service
     * error occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer retryableError;

    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed
     * training job can't be retried if it failed because a client error
     * occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer nonRetryableError;

    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that
     * were manually stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer stopped;

    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter
     * tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of completed training jobs launched by the
     *         hyperparameter tuning job.
     *         </p>
     */
    public Integer getCompleted() {
        return completed;
    }

    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter
     * tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param completed <p>
     *            The number of completed training jobs launched by the
     *            hyperparameter tuning job.
     *            </p>
     */
    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter
     * tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param completed <p>
     *            The number of completed training jobs launched by the
     *            hyperparameter tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobStatusCounters withCompleted(Integer completed) {
        this.completed = completed;
        return this;
    }

    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter
     * tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of in-progress training jobs launched by a
     *         hyperparameter tuning job.
     *         </p>
     */
    public Integer getInProgress() {
        return inProgress;
    }

    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter
     * tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param inProgress <p>
     *            The number of in-progress training jobs launched by a
     *            hyperparameter tuning job.
     *            </p>
     */
    public void setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter
     * tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param inProgress <p>
     *            The number of in-progress training jobs launched by a
     *            hyperparameter tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobStatusCounters withInProgress(Integer inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed
     * training job can be retried only if it failed because an internal service
     * error occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of training jobs that failed, but can be retried. A
     *         failed training job can be retried only if it failed because an
     *         internal service error occurred.
     *         </p>
     */
    public Integer getRetryableError() {
        return retryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed
     * training job can be retried only if it failed because an internal service
     * error occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retryableError <p>
     *            The number of training jobs that failed, but can be retried. A
     *            failed training job can be retried only if it failed because
     *            an internal service error occurred.
     *            </p>
     */
    public void setRetryableError(Integer retryableError) {
        this.retryableError = retryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed
     * training job can be retried only if it failed because an internal service
     * error occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param retryableError <p>
     *            The number of training jobs that failed, but can be retried. A
     *            failed training job can be retried only if it failed because
     *            an internal service error occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobStatusCounters withRetryableError(Integer retryableError) {
        this.retryableError = retryableError;
        return this;
    }

    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed
     * training job can't be retried if it failed because a client error
     * occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of training jobs that failed and can't be retried. A
     *         failed training job can't be retried if it failed because a
     *         client error occurred.
     *         </p>
     */
    public Integer getNonRetryableError() {
        return nonRetryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed
     * training job can't be retried if it failed because a client error
     * occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param nonRetryableError <p>
     *            The number of training jobs that failed and can't be retried.
     *            A failed training job can't be retried if it failed because a
     *            client error occurred.
     *            </p>
     */
    public void setNonRetryableError(Integer nonRetryableError) {
        this.nonRetryableError = nonRetryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed
     * training job can't be retried if it failed because a client error
     * occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param nonRetryableError <p>
     *            The number of training jobs that failed and can't be retried.
     *            A failed training job can't be retried if it failed because a
     *            client error occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobStatusCounters withNonRetryableError(Integer nonRetryableError) {
        this.nonRetryableError = nonRetryableError;
        return this;
    }

    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that
     * were manually stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of training jobs launched by a hyperparameter tuning
     *         job that were manually stopped.
     *         </p>
     */
    public Integer getStopped() {
        return stopped;
    }

    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that
     * were manually stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param stopped <p>
     *            The number of training jobs launched by a hyperparameter
     *            tuning job that were manually stopped.
     *            </p>
     */
    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that
     * were manually stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param stopped <p>
     *            The number of training jobs launched by a hyperparameter
     *            tuning job that were manually stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobStatusCounters withStopped(Integer stopped) {
        this.stopped = stopped;
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
        if (getCompleted() != null)
            sb.append("Completed: " + getCompleted() + ",");
        if (getInProgress() != null)
            sb.append("InProgress: " + getInProgress() + ",");
        if (getRetryableError() != null)
            sb.append("RetryableError: " + getRetryableError() + ",");
        if (getNonRetryableError() != null)
            sb.append("NonRetryableError: " + getNonRetryableError() + ",");
        if (getStopped() != null)
            sb.append("Stopped: " + getStopped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompleted() == null) ? 0 : getCompleted().hashCode());
        hashCode = prime * hashCode + ((getInProgress() == null) ? 0 : getInProgress().hashCode());
        hashCode = prime * hashCode
                + ((getRetryableError() == null) ? 0 : getRetryableError().hashCode());
        hashCode = prime * hashCode
                + ((getNonRetryableError() == null) ? 0 : getNonRetryableError().hashCode());
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingJobStatusCounters == false)
            return false;
        TrainingJobStatusCounters other = (TrainingJobStatusCounters) obj;

        if (other.getCompleted() == null ^ this.getCompleted() == null)
            return false;
        if (other.getCompleted() != null
                && other.getCompleted().equals(this.getCompleted()) == false)
            return false;
        if (other.getInProgress() == null ^ this.getInProgress() == null)
            return false;
        if (other.getInProgress() != null
                && other.getInProgress().equals(this.getInProgress()) == false)
            return false;
        if (other.getRetryableError() == null ^ this.getRetryableError() == null)
            return false;
        if (other.getRetryableError() != null
                && other.getRetryableError().equals(this.getRetryableError()) == false)
            return false;
        if (other.getNonRetryableError() == null ^ this.getNonRetryableError() == null)
            return false;
        if (other.getNonRetryableError() != null
                && other.getNonRetryableError().equals(this.getNonRetryableError()) == false)
            return false;
        if (other.getStopped() == null ^ this.getStopped() == null)
            return false;
        if (other.getStopped() != null && other.getStopped().equals(this.getStopped()) == false)
            return false;
        return true;
    }
}
