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
 * The criteria that determine when and how a job abort takes place.
 * </p>
 */
public class AwsJobAbortCriteria implements Serializable {
    /**
     * <p>
     * The type of job execution failures that can initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     */
    private String failureType;

    /**
     * <p>
     * The type of job action to take to initiate the job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     */
    private String action;

    /**
     * <p>
     * The minimum percentage of job execution failures that must occur to
     * initiate the job abort.
     * </p>
     * <p>
     * Amazon Web Services IoT Core supports up to two digits after the decimal
     * (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Double thresholdPercentage;

    /**
     * <p>
     * The minimum number of things which must receive job execution
     * notifications before the job can be aborted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer minNumberOfExecutedThings;

    /**
     * <p>
     * The type of job execution failures that can initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @return <p>
     *         The type of job execution failures that can initiate a job abort.
     *         </p>
     * @see AwsJobAbortCriteriaFailureType
     */
    public String getFailureType() {
        return failureType;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            abort.
     *            </p>
     * @see AwsJobAbortCriteriaFailureType
     */
    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsJobAbortCriteriaFailureType
     */
    public AwsJobAbortCriteria withFailureType(String failureType) {
        this.failureType = failureType;
        return this;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            abort.
     *            </p>
     * @see AwsJobAbortCriteriaFailureType
     */
    public void setFailureType(AwsJobAbortCriteriaFailureType failureType) {
        this.failureType = failureType.toString();
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, REJECTED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsJobAbortCriteriaFailureType
     */
    public AwsJobAbortCriteria withFailureType(AwsJobAbortCriteriaFailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The type of job action to take to initiate the job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @return <p>
     *         The type of job action to take to initiate the job abort.
     *         </p>
     * @see AwsJobAbortCriteriaAbortAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The type of job action to take to initiate the job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of job action to take to initiate the job abort.
     *            </p>
     * @see AwsJobAbortCriteriaAbortAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of job action to take to initiate the job abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of job action to take to initiate the job abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsJobAbortCriteriaAbortAction
     */
    public AwsJobAbortCriteria withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The type of job action to take to initiate the job abort.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of job action to take to initiate the job abort.
     *            </p>
     * @see AwsJobAbortCriteriaAbortAction
     */
    public void setAction(AwsJobAbortCriteriaAbortAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The type of job action to take to initiate the job abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANCEL
     *
     * @param action <p>
     *            The type of job action to take to initiate the job abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AwsJobAbortCriteriaAbortAction
     */
    public AwsJobAbortCriteria withAction(AwsJobAbortCriteriaAbortAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The minimum percentage of job execution failures that must occur to
     * initiate the job abort.
     * </p>
     * <p>
     * Amazon Web Services IoT Core supports up to two digits after the decimal
     * (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         The minimum percentage of job execution failures that must occur
     *         to initiate the job abort.
     *         </p>
     *         <p>
     *         Amazon Web Services IoT Core supports up to two digits after the
     *         decimal (for example, 10.9 and 10.99, but not 10.999).
     *         </p>
     */
    public Double getThresholdPercentage() {
        return thresholdPercentage;
    }

    /**
     * <p>
     * The minimum percentage of job execution failures that must occur to
     * initiate the job abort.
     * </p>
     * <p>
     * Amazon Web Services IoT Core supports up to two digits after the decimal
     * (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param thresholdPercentage <p>
     *            The minimum percentage of job execution failures that must
     *            occur to initiate the job abort.
     *            </p>
     *            <p>
     *            Amazon Web Services IoT Core supports up to two digits after
     *            the decimal (for example, 10.9 and 10.99, but not 10.999).
     *            </p>
     */
    public void setThresholdPercentage(Double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    /**
     * <p>
     * The minimum percentage of job execution failures that must occur to
     * initiate the job abort.
     * </p>
     * <p>
     * Amazon Web Services IoT Core supports up to two digits after the decimal
     * (for example, 10.9 and 10.99, but not 10.999).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param thresholdPercentage <p>
     *            The minimum percentage of job execution failures that must
     *            occur to initiate the job abort.
     *            </p>
     *            <p>
     *            Amazon Web Services IoT Core supports up to two digits after
     *            the decimal (for example, 10.9 and 10.99, but not 10.999).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsJobAbortCriteria withThresholdPercentage(Double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
        return this;
    }

    /**
     * <p>
     * The minimum number of things which must receive job execution
     * notifications before the job can be aborted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The minimum number of things which must receive job execution
     *         notifications before the job can be aborted.
     *         </p>
     */
    public Integer getMinNumberOfExecutedThings() {
        return minNumberOfExecutedThings;
    }

    /**
     * <p>
     * The minimum number of things which must receive job execution
     * notifications before the job can be aborted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minNumberOfExecutedThings <p>
     *            The minimum number of things which must receive job execution
     *            notifications before the job can be aborted.
     *            </p>
     */
    public void setMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
        this.minNumberOfExecutedThings = minNumberOfExecutedThings;
    }

    /**
     * <p>
     * The minimum number of things which must receive job execution
     * notifications before the job can be aborted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minNumberOfExecutedThings <p>
     *            The minimum number of things which must receive job execution
     *            notifications before the job can be aborted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsJobAbortCriteria withMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
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

        if (obj instanceof AwsJobAbortCriteria == false)
            return false;
        AwsJobAbortCriteria other = (AwsJobAbortCriteria) obj;

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
