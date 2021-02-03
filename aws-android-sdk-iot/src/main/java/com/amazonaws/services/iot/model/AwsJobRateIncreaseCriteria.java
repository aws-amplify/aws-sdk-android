/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The criteria to initiate the increase in rate of rollout for a job.
 * </p>
 */
public class AwsJobRateIncreaseCriteria implements Serializable {
    /**
     * <p>
     * When this number of things have been notified, it will initiate an
     * increase in the rollout rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer numberOfNotifiedThings;

    /**
     * <p>
     * When this number of things have succeeded in their job execution, it will
     * initiate an increase in the rollout rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer numberOfSucceededThings;

    /**
     * <p>
     * When this number of things have been notified, it will initiate an
     * increase in the rollout rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         When this number of things have been notified, it will initiate
     *         an increase in the rollout rate.
     *         </p>
     */
    public Integer getNumberOfNotifiedThings() {
        return numberOfNotifiedThings;
    }

    /**
     * <p>
     * When this number of things have been notified, it will initiate an
     * increase in the rollout rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfNotifiedThings <p>
     *            When this number of things have been notified, it will
     *            initiate an increase in the rollout rate.
     *            </p>
     */
    public void setNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        this.numberOfNotifiedThings = numberOfNotifiedThings;
    }

    /**
     * <p>
     * When this number of things have been notified, it will initiate an
     * increase in the rollout rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfNotifiedThings <p>
     *            When this number of things have been notified, it will
     *            initiate an increase in the rollout rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsJobRateIncreaseCriteria withNumberOfNotifiedThings(Integer numberOfNotifiedThings) {
        this.numberOfNotifiedThings = numberOfNotifiedThings;
        return this;
    }

    /**
     * <p>
     * When this number of things have succeeded in their job execution, it will
     * initiate an increase in the rollout rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         When this number of things have succeeded in their job execution,
     *         it will initiate an increase in the rollout rate.
     *         </p>
     */
    public Integer getNumberOfSucceededThings() {
        return numberOfSucceededThings;
    }

    /**
     * <p>
     * When this number of things have succeeded in their job execution, it will
     * initiate an increase in the rollout rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfSucceededThings <p>
     *            When this number of things have succeeded in their job
     *            execution, it will initiate an increase in the rollout rate.
     *            </p>
     */
    public void setNumberOfSucceededThings(Integer numberOfSucceededThings) {
        this.numberOfSucceededThings = numberOfSucceededThings;
    }

    /**
     * <p>
     * When this number of things have succeeded in their job execution, it will
     * initiate an increase in the rollout rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfSucceededThings <p>
     *            When this number of things have succeeded in their job
     *            execution, it will initiate an increase in the rollout rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsJobRateIncreaseCriteria withNumberOfSucceededThings(Integer numberOfSucceededThings) {
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

        if (obj instanceof AwsJobRateIncreaseCriteria == false)
            return false;
        AwsJobRateIncreaseCriteria other = (AwsJobRateIncreaseCriteria) obj;

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
