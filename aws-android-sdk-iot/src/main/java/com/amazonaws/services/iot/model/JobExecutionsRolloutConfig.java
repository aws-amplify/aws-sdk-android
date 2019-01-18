/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Allows you to create a staged rollout of a job.
 * </p>
 */
public class JobExecutionsRolloutConfig implements Serializable {
    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per
     * minute. This parameter allows you to create a staged rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maximumPerMinute;

    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to
     * define an exponential rate for a job rollout.
     * </p>
     */
    private ExponentialRolloutRate exponentialRate;

    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per
     * minute. This parameter allows you to create a staged rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of things that will be notified of a pending
     *         job, per minute. This parameter allows you to create a staged
     *         rollout.
     *         </p>
     */
    public Integer getMaximumPerMinute() {
        return maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per
     * minute. This parameter allows you to create a staged rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumPerMinute <p>
     *            The maximum number of things that will be notified of a
     *            pending job, per minute. This parameter allows you to create a
     *            staged rollout.
     *            </p>
     */
    public void setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per
     * minute. This parameter allows you to create a staged rollout.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumPerMinute <p>
     *            The maximum number of things that will be notified of a
     *            pending job, per minute. This parameter allows you to create a
     *            staged rollout.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionsRolloutConfig withMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
        return this;
    }

    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to
     * define an exponential rate for a job rollout.
     * </p>
     *
     * @return <p>
     *         The rate of increase for a job rollout. This parameter allows you
     *         to define an exponential rate for a job rollout.
     *         </p>
     */
    public ExponentialRolloutRate getExponentialRate() {
        return exponentialRate;
    }

    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to
     * define an exponential rate for a job rollout.
     * </p>
     *
     * @param exponentialRate <p>
     *            The rate of increase for a job rollout. This parameter allows
     *            you to define an exponential rate for a job rollout.
     *            </p>
     */
    public void setExponentialRate(ExponentialRolloutRate exponentialRate) {
        this.exponentialRate = exponentialRate;
    }

    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to
     * define an exponential rate for a job rollout.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exponentialRate <p>
     *            The rate of increase for a job rollout. This parameter allows
     *            you to define an exponential rate for a job rollout.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionsRolloutConfig withExponentialRate(ExponentialRolloutRate exponentialRate) {
        this.exponentialRate = exponentialRate;
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
        if (getMaximumPerMinute() != null)
            sb.append("maximumPerMinute: " + getMaximumPerMinute() + ",");
        if (getExponentialRate() != null)
            sb.append("exponentialRate: " + getExponentialRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaximumPerMinute() == null) ? 0 : getMaximumPerMinute().hashCode());
        hashCode = prime * hashCode
                + ((getExponentialRate() == null) ? 0 : getExponentialRate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionsRolloutConfig == false)
            return false;
        JobExecutionsRolloutConfig other = (JobExecutionsRolloutConfig) obj;

        if (other.getMaximumPerMinute() == null ^ this.getMaximumPerMinute() == null)
            return false;
        if (other.getMaximumPerMinute() != null
                && other.getMaximumPerMinute().equals(this.getMaximumPerMinute()) == false)
            return false;
        if (other.getExponentialRate() == null ^ this.getExponentialRate() == null)
            return false;
        if (other.getExponentialRate() != null
                && other.getExponentialRate().equals(this.getExponentialRate()) == false)
            return false;
        return true;
    }
}
