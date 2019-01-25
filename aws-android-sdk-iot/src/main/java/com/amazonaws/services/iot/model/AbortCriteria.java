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
 * Details of abort criteria to define rules to abort the job.
 * </p>
 */
public class AbortCriteria implements Serializable {
    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job
     * abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     */
    private String failureType;

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     */
    private String action;

    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that
     * will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9
     * and 10.99, but not 10.999).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Double thresholdPercentage;

    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer minNumberOfExecutedThings;

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job
     * abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @return <p>
     *         The type of job execution failure to define a rule to initiate a
     *         job abort.
     *         </p>
     * @see JobExecutionFailureType
     */
    public String getFailureType() {
        return failureType;
    }

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job
     * abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failure to define a rule to initiate
     *            a job abort.
     *            </p>
     * @see JobExecutionFailureType
     */
    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job
     * abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failure to define a rule to initiate
     *            a job abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobExecutionFailureType
     */
    public AbortCriteria withFailureType(String failureType) {
        this.failureType = failureType;
        return this;
    }

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job
     * abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failure to define a rule to initiate
     *            a job abort.
     *            </p>
     * @see JobExecutionFailureType
     */
    public void setFailureType(JobExecutionFailureType failureType) {
        this.failureType = failureType.toString();
    }

    /**
     * <p>
     * The type of job execution failure to define a rule to initiate a job
     * abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failure to define a rule to initiate
     *            a job abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobExecutionFailureType
     */
    public AbortCriteria withFailureType(JobExecutionFailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @return <p>
     *         The type of abort action to initiate a job abort.
     *         </p>
     * @see AbortAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of abort action to initiate a job abort.
     *            </p>
     * @see AbortAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of abort action to initiate a job abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AbortAction
     */
    public AbortCriteria withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of abort action to initiate a job abort.
     *            </p>
     * @see AbortAction
     */
    public void setAction(AbortAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The type of abort action to initiate a job abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of abort action to initiate a job abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AbortAction
     */
    public AbortCriteria withAction(AbortAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that
     * will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9
     * and 10.99, but not 10.999).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         The threshold as a percentage of the total number of executed
     *         things that will initiate a job abort.
     *         </p>
     *         <p>
     *         AWS IoT supports up to two digits after the decimal (for example,
     *         10.9 and 10.99, but not 10.999).
     *         </p>
     */
    public Double getThresholdPercentage() {
        return thresholdPercentage;
    }

    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that
     * will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9
     * and 10.99, but not 10.999).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param thresholdPercentage <p>
     *            The threshold as a percentage of the total number of executed
     *            things that will initiate a job abort.
     *            </p>
     *            <p>
     *            AWS IoT supports up to two digits after the decimal (for
     *            example, 10.9 and 10.99, but not 10.999).
     *            </p>
     */
    public void setThresholdPercentage(Double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    /**
     * <p>
     * The threshold as a percentage of the total number of executed things that
     * will initiate a job abort.
     * </p>
     * <p>
     * AWS IoT supports up to two digits after the decimal (for example, 10.9
     * and 10.99, but not 10.999).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param thresholdPercentage <p>
     *            The threshold as a percentage of the total number of executed
     *            things that will initiate a job abort.
     *            </p>
     *            <p>
     *            AWS IoT supports up to two digits after the decimal (for
     *            example, 10.9 and 10.99, but not 10.999).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AbortCriteria withThresholdPercentage(Double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
        return this;
    }

    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Minimum number of executed things before evaluating an abort
     *         rule.
     *         </p>
     */
    public Integer getMinNumberOfExecutedThings() {
        return minNumberOfExecutedThings;
    }

    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minNumberOfExecutedThings <p>
     *            Minimum number of executed things before evaluating an abort
     *            rule.
     *            </p>
     */
    public void setMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
        this.minNumberOfExecutedThings = minNumberOfExecutedThings;
    }

    /**
     * <p>
     * Minimum number of executed things before evaluating an abort rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minNumberOfExecutedThings <p>
     *            Minimum number of executed things before evaluating an abort
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AbortCriteria withMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
        this.minNumberOfExecutedThings = minNumberOfExecutedThings;
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
        if (getFailureType() != null)
            sb.append("failureType: " + getFailureType() + ",");
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getThresholdPercentage() != null)
            sb.append("thresholdPercentage: " + getThresholdPercentage() + ",");
        if (getMinNumberOfExecutedThings() != null)
            sb.append("minNumberOfExecutedThings: " + getMinNumberOfExecutedThings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getThresholdPercentage() == null) ? 0 : getThresholdPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinNumberOfExecutedThings() == null) ? 0 : getMinNumberOfExecutedThings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortCriteria == false)
            return false;
        AbortCriteria other = (AbortCriteria) obj;

        if (other.getFailureType() == null ^ this.getFailureType() == null)
            return false;
        if (other.getFailureType() != null
                && other.getFailureType().equals(this.getFailureType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getThresholdPercentage() == null ^ this.getThresholdPercentage() == null)
            return false;
        if (other.getThresholdPercentage() != null
                && other.getThresholdPercentage().equals(this.getThresholdPercentage()) == false)
            return false;
        if (other.getMinNumberOfExecutedThings() == null
                ^ this.getMinNumberOfExecutedThings() == null)
            return false;
        if (other.getMinNumberOfExecutedThings() != null
                && other.getMinNumberOfExecutedThings().equals(this.getMinNumberOfExecutedThings()) == false)
            return false;
        return true;
    }
}
