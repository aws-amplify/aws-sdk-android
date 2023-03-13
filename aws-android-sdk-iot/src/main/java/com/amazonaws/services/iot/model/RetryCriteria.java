/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The criteria that determines how many retries are allowed for each failure
 * type for a job.
 * </p>
 */
public class RetryCriteria implements Serializable {
    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, TIMED_OUT, ALL
     */
    private String failureType;

    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     */
    private Integer numberOfRetries;

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, TIMED_OUT, ALL
     *
     * @return <p>
     *         The type of job execution failures that can initiate a job retry.
     *         </p>
     * @see RetryableFailureType
     */
    public String getFailureType() {
        return failureType;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            retry.
     *            </p>
     * @see RetryableFailureType
     */
    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            retry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RetryableFailureType
     */
    public RetryCriteria withFailureType(String failureType) {
        this.failureType = failureType;
        return this;
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            retry.
     *            </p>
     * @see RetryableFailureType
     */
    public void setFailureType(RetryableFailureType failureType) {
        this.failureType = failureType.toString();
    }

    /**
     * <p>
     * The type of job execution failures that can initiate a job retry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, TIMED_OUT, ALL
     *
     * @param failureType <p>
     *            The type of job execution failures that can initiate a job
     *            retry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RetryableFailureType
     */
    public RetryCriteria withFailureType(RetryableFailureType failureType) {
        this.failureType = failureType.toString();
        return this;
    }

    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @return <p>
     *         The number of retries allowed for a failure type for the job.
     *         </p>
     */
    public Integer getNumberOfRetries() {
        return numberOfRetries;
    }

    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param numberOfRetries <p>
     *            The number of retries allowed for a failure type for the job.
     *            </p>
     */
    public void setNumberOfRetries(Integer numberOfRetries) {
        this.numberOfRetries = numberOfRetries;
    }

    /**
     * <p>
     * The number of retries allowed for a failure type for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param numberOfRetries <p>
     *            The number of retries allowed for a failure type for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetryCriteria withNumberOfRetries(Integer numberOfRetries) {
        this.numberOfRetries = numberOfRetries;
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
        if (getNumberOfRetries() != null)
            sb.append("numberOfRetries: " + getNumberOfRetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfRetries() == null) ? 0 : getNumberOfRetries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryCriteria == false)
            return false;
        RetryCriteria other = (RetryCriteria) obj;

        if (other.getFailureType() == null ^ this.getFailureType() == null)
            return false;
        if (other.getFailureType() != null
                && other.getFailureType().equals(this.getFailureType()) == false)
            return false;
        if (other.getNumberOfRetries() == null ^ this.getNumberOfRetries() == null)
            return false;
        if (other.getNumberOfRetries() != null
                && other.getNumberOfRetries().equals(this.getNumberOfRetries()) == false)
            return false;
        return true;
    }
}
