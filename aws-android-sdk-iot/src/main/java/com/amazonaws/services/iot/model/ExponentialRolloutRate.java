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
 * Allows you to create an exponential rate of rollout for a job.
 * </p>
 */
public class ExponentialRolloutRate implements Serializable {
    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per
     * minute at the start of job rollout. This parameter allows you to define
     * the initial rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer baseRatePerMinute;

    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     */
    private Double incrementFactor;

    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but
     * not 1.55).
     * </p>
     */
    private RateIncreaseCriteria rateIncreaseCriteria;

    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per
     * minute at the start of job rollout. This parameter allows you to define
     * the initial rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The minimum number of things that will be notified of a pending
     *         job, per minute at the start of job rollout. This parameter
     *         allows you to define the initial rate of rollout.
     *         </p>
     */
    public Integer getBaseRatePerMinute() {
        return baseRatePerMinute;
    }

    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per
     * minute at the start of job rollout. This parameter allows you to define
     * the initial rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param baseRatePerMinute <p>
     *            The minimum number of things that will be notified of a
     *            pending job, per minute at the start of job rollout. This
     *            parameter allows you to define the initial rate of rollout.
     *            </p>
     */
    public void setBaseRatePerMinute(Integer baseRatePerMinute) {
        this.baseRatePerMinute = baseRatePerMinute;
    }

    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per
     * minute at the start of job rollout. This parameter allows you to define
     * the initial rate of rollout.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param baseRatePerMinute <p>
     *            The minimum number of things that will be notified of a
     *            pending job, per minute at the start of job rollout. This
     *            parameter allows you to define the initial rate of rollout.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExponentialRolloutRate withBaseRatePerMinute(Integer baseRatePerMinute) {
        this.baseRatePerMinute = baseRatePerMinute;
        return this;
    }

    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @return <p>
     *         The exponential factor to increase the rate of rollout for a job.
     *         </p>
     */
    public Double getIncrementFactor() {
        return incrementFactor;
    }

    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param incrementFactor <p>
     *            The exponential factor to increase the rate of rollout for a
     *            job.
     *            </p>
     */
    public void setIncrementFactor(Double incrementFactor) {
        this.incrementFactor = incrementFactor;
    }

    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param incrementFactor <p>
     *            The exponential factor to increase the rate of rollout for a
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExponentialRolloutRate withIncrementFactor(Double incrementFactor) {
        this.incrementFactor = incrementFactor;
        return this;
    }

    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but
     * not 1.55).
     * </p>
     *
     * @return <p>
     *         The criteria to initiate the increase in rate of rollout for a
     *         job.
     *         </p>
     *         <p>
     *         AWS IoT supports up to one digit after the decimal (for example,
     *         1.5, but not 1.55).
     *         </p>
     */
    public RateIncreaseCriteria getRateIncreaseCriteria() {
        return rateIncreaseCriteria;
    }

    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but
     * not 1.55).
     * </p>
     *
     * @param rateIncreaseCriteria <p>
     *            The criteria to initiate the increase in rate of rollout for a
     *            job.
     *            </p>
     *            <p>
     *            AWS IoT supports up to one digit after the decimal (for
     *            example, 1.5, but not 1.55).
     *            </p>
     */
    public void setRateIncreaseCriteria(RateIncreaseCriteria rateIncreaseCriteria) {
        this.rateIncreaseCriteria = rateIncreaseCriteria;
    }

    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but
     * not 1.55).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rateIncreaseCriteria <p>
     *            The criteria to initiate the increase in rate of rollout for a
     *            job.
     *            </p>
     *            <p>
     *            AWS IoT supports up to one digit after the decimal (for
     *            example, 1.5, but not 1.55).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExponentialRolloutRate withRateIncreaseCriteria(RateIncreaseCriteria rateIncreaseCriteria) {
        this.rateIncreaseCriteria = rateIncreaseCriteria;
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
        if (getBaseRatePerMinute() != null)
            sb.append("baseRatePerMinute: " + getBaseRatePerMinute() + ",");
        if (getIncrementFactor() != null)
            sb.append("incrementFactor: " + getIncrementFactor() + ",");
        if (getRateIncreaseCriteria() != null)
            sb.append("rateIncreaseCriteria: " + getRateIncreaseCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBaseRatePerMinute() == null) ? 0 : getBaseRatePerMinute().hashCode());
        hashCode = prime * hashCode
                + ((getIncrementFactor() == null) ? 0 : getIncrementFactor().hashCode());
        hashCode = prime * hashCode
                + ((getRateIncreaseCriteria() == null) ? 0 : getRateIncreaseCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExponentialRolloutRate == false)
            return false;
        ExponentialRolloutRate other = (ExponentialRolloutRate) obj;

        if (other.getBaseRatePerMinute() == null ^ this.getBaseRatePerMinute() == null)
            return false;
        if (other.getBaseRatePerMinute() != null
                && other.getBaseRatePerMinute().equals(this.getBaseRatePerMinute()) == false)
            return false;
        if (other.getIncrementFactor() == null ^ this.getIncrementFactor() == null)
            return false;
        if (other.getIncrementFactor() != null
                && other.getIncrementFactor().equals(this.getIncrementFactor()) == false)
            return false;
        if (other.getRateIncreaseCriteria() == null ^ this.getRateIncreaseCriteria() == null)
            return false;
        if (other.getRateIncreaseCriteria() != null
                && other.getRateIncreaseCriteria().equals(this.getRateIncreaseCriteria()) == false)
            return false;
        return true;
    }
}
