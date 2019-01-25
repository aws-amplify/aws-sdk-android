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
 * Allows you to define a criteria to initiate the increase in rate of rollout
 * for a job.
 * </p>
 */
public class RateIncreaseCriteria implements Serializable {
    /**
     * <p>
     * The threshold for number of notified things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer numberOfNotifiedThings;

    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer numberOfSucceededThings;

    /**
     * <p>
     * The threshold for number of notified things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The threshold for number of notified things that will initiate
     *         the increase in rate of rollout.
     *         </p>
     */
    public Integer getNumberOfNotifiedThings() {
        return numberOfNotifiedThings;
    }

    /**
     * <p>
     * The threshold for number of notified things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfNotifiedThings <p>
     *            The threshold for number of notified things that will initiate
     *            the increase in rate of rollout.
     *            </p>
     */
    public void setNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        this.numberOfNotifiedThings = numberOfNotifiedThings;
    }

    /**
     * <p>
     * The threshold for number of notified things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfNotifiedThings <p>
     *            The threshold for number of notified things that will initiate
     *            the increase in rate of rollout.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RateIncreaseCriteria withNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        this.numberOfNotifiedThings = numberOfNotifiedThings;
        return this;
    }

    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The threshold for number of succeeded things that will initiate
     *         the increase in rate of rollout.
     *         </p>
     */
    public Integer getNumberOfSucceededThings() {
        return numberOfSucceededThings;
    }

    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfSucceededThings <p>
     *            The threshold for number of succeeded things that will
     *            initiate the increase in rate of rollout.
     *            </p>
     */
    public void setNumberOfSucceededThings(Integer numberOfSucceededThings) {
        this.numberOfSucceededThings = numberOfSucceededThings;
    }

    /**
     * <p>
     * The threshold for number of succeeded things that will initiate the
     * increase in rate of rollout.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfSucceededThings <p>
     *            The threshold for number of succeeded things that will
     *            initiate the increase in rate of rollout.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RateIncreaseCriteria withNumberOfSucceededThings(Integer numberOfSucceededThings) {
        this.numberOfSucceededThings = numberOfSucceededThings;
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
        if (getNumberOfNotifiedThings() != null)
            sb.append("numberOfNotifiedThings: " + getNumberOfNotifiedThings() + ",");
        if (getNumberOfSucceededThings() != null)
            sb.append("numberOfSucceededThings: " + getNumberOfSucceededThings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNumberOfNotifiedThings() == null) ? 0 : getNumberOfNotifiedThings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfSucceededThings() == null) ? 0 : getNumberOfSucceededThings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateIncreaseCriteria == false)
            return false;
        RateIncreaseCriteria other = (RateIncreaseCriteria) obj;

        if (other.getNumberOfNotifiedThings() == null ^ this.getNumberOfNotifiedThings() == null)
            return false;
        if (other.getNumberOfNotifiedThings() != null
                && other.getNumberOfNotifiedThings().equals(this.getNumberOfNotifiedThings()) == false)
            return false;
        if (other.getNumberOfSucceededThings() == null ^ this.getNumberOfSucceededThings() == null)
            return false;
        if (other.getNumberOfSucceededThings() != null
                && other.getNumberOfSucceededThings().equals(this.getNumberOfSucceededThings()) == false)
            return false;
        return true;
    }
}
