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
 * Specifies the number of training jobs that this hyperparameter tuning job
 * launched, categorized by the status of their objective metric. The objective
 * metric status shows whether the final objective metric for the training job
 * has been evaluated by the tuning job and used in the hyperparameter tuning
 * process.
 * </p>
 */
public class ObjectiveStatusCounters implements Serializable {
    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by
     * the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer succeeded;

    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation
     * of their final objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer pending;

    /**
     * <p>
     * The number of training jobs whose final objective metric was not
     * evaluated and used in the hyperparameter tuning process. This typically
     * occurs when the training job failed or did not emit an objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer failed;

    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by
     * the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of training jobs whose final objective metric was
     *         evaluated by the hyperparameter tuning job and used in the
     *         hyperparameter tuning process.
     *         </p>
     */
    public Integer getSucceeded() {
        return succeeded;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by
     * the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param succeeded <p>
     *            The number of training jobs whose final objective metric was
     *            evaluated by the hyperparameter tuning job and used in the
     *            hyperparameter tuning process.
     *            </p>
     */
    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was evaluated by
     * the hyperparameter tuning job and used in the hyperparameter tuning
     * process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param succeeded <p>
     *            The number of training jobs whose final objective metric was
     *            evaluated by the hyperparameter tuning job and used in the
     *            hyperparameter tuning process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ObjectiveStatusCounters withSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation
     * of their final objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of training jobs that are in progress and pending
     *         evaluation of their final objective metric.
     *         </p>
     */
    public Integer getPending() {
        return pending;
    }

    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation
     * of their final objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pending <p>
     *            The number of training jobs that are in progress and pending
     *            evaluation of their final objective metric.
     *            </p>
     */
    public void setPending(Integer pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * The number of training jobs that are in progress and pending evaluation
     * of their final objective metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pending <p>
     *            The number of training jobs that are in progress and pending
     *            evaluation of their final objective metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ObjectiveStatusCounters withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was not
     * evaluated and used in the hyperparameter tuning process. This typically
     * occurs when the training job failed or did not emit an objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of training jobs whose final objective metric was not
     *         evaluated and used in the hyperparameter tuning process. This
     *         typically occurs when the training job failed or did not emit an
     *         objective metric.
     *         </p>
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was not
     * evaluated and used in the hyperparameter tuning process. This typically
     * occurs when the training job failed or did not emit an objective metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failed <p>
     *            The number of training jobs whose final objective metric was
     *            not evaluated and used in the hyperparameter tuning process.
     *            This typically occurs when the training job failed or did not
     *            emit an objective metric.
     *            </p>
     */
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of training jobs whose final objective metric was not
     * evaluated and used in the hyperparameter tuning process. This typically
     * occurs when the training job failed or did not emit an objective metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failed <p>
     *            The number of training jobs whose final objective metric was
     *            not evaluated and used in the hyperparameter tuning process.
     *            This typically occurs when the training job failed or did not
     *            emit an objective metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ObjectiveStatusCounters withFailed(Integer failed) {
        this.failed = failed;
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
        if (getSucceeded() != null)
            sb.append("Succeeded: " + getSucceeded() + ",");
        if (getPending() != null)
            sb.append("Pending: " + getPending() + ",");
        if (getFailed() != null)
            sb.append("Failed: " + getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectiveStatusCounters == false)
            return false;
        ObjectiveStatusCounters other = (ObjectiveStatusCounters) obj;

        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null
                && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }
}
