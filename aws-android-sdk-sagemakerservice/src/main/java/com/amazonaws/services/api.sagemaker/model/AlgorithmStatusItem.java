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
 * Represents the overall status of an algorithm.
 * </p>
 */
public class AlgorithmStatusItem implements Serializable {
    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String name;

    /**
     * <p>
     * The current status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, InProgress, Completed, Failed
     */
    private String status;

    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the algorithm for which the overall status is being
     *         reported.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param name <p>
     *            The name of the algorithm for which the overall status is
     *            being reported.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the algorithm for which the overall status is being reported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param name <p>
     *            The name of the algorithm for which the overall status is
     *            being reported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmStatusItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, InProgress, Completed, Failed
     *
     * @return <p>
     *         The current status.
     *         </p>
     * @see DetailedAlgorithmStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, InProgress, Completed, Failed
     *
     * @param status <p>
     *            The current status.
     *            </p>
     * @see DetailedAlgorithmStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, InProgress, Completed, Failed
     *
     * @param status <p>
     *            The current status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetailedAlgorithmStatus
     */
    public AlgorithmStatusItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, InProgress, Completed, Failed
     *
     * @param status <p>
     *            The current status.
     *            </p>
     * @see DetailedAlgorithmStatus
     */
    public void setStatus(DetailedAlgorithmStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, InProgress, Completed, Failed
     *
     * @param status <p>
     *            The current status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetailedAlgorithmStatus
     */
    public AlgorithmStatusItem withStatus(DetailedAlgorithmStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     *
     * @return <p>
     *         if the overall status is <code>Failed</code>, the reason for the
     *         failure.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     *
     * @param failureReason <p>
     *            if the overall status is <code>Failed</code>, the reason for
     *            the failure.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * if the overall status is <code>Failed</code>, the reason for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            if the overall status is <code>Failed</code>, the reason for
     *            the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmStatusItem withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmStatusItem == false)
            return false;
        AlgorithmStatusItem other = (AlgorithmStatusItem) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
