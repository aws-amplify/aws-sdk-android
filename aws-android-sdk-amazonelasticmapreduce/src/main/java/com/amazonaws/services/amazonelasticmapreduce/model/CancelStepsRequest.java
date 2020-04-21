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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Cancels a pending step or steps in a running cluster. Available only in
 * Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of
 * 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent
 * but asynchronous; it does not guarantee a step will be canceled, even if the
 * request is successfully submitted. You can only cancel steps that are in a
 * <code>PENDING</code> state.
 * </p>
 */
public class CancelStepsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled.
     * Use <a>RunJobFlow</a> and <a>ListClusters</a> to get ClusterIDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String clusterId;

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get
     * steps and their states for the specified cluster.
     * </p>
     */
    private java.util.List<String> stepIds;

    /**
     * <p>
     * The option to choose for cancelling <code>RUNNING</code> steps. By
     * default, the value is <code>SEND_INTERRUPT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND_INTERRUPT, TERMINATE_PROCESS
     */
    private String stepCancellationOption;

    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled.
     * Use <a>RunJobFlow</a> and <a>ListClusters</a> to get ClusterIDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The <code>ClusterID</code> for which specified steps will be
     *         canceled. Use <a>RunJobFlow</a> and <a>ListClusters</a> to get
     *         ClusterIDs.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled.
     * Use <a>RunJobFlow</a> and <a>ListClusters</a> to get ClusterIDs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param clusterId <p>
     *            The <code>ClusterID</code> for which specified steps will be
     *            canceled. Use <a>RunJobFlow</a> and <a>ListClusters</a> to get
     *            ClusterIDs.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled.
     * Use <a>RunJobFlow</a> and <a>ListClusters</a> to get ClusterIDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param clusterId <p>
     *            The <code>ClusterID</code> for which specified steps will be
     *            canceled. Use <a>RunJobFlow</a> and <a>ListClusters</a> to get
     *            ClusterIDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelStepsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get
     * steps and their states for the specified cluster.
     * </p>
     *
     * @return <p>
     *         The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a>
     *         to get steps and their states for the specified cluster.
     *         </p>
     */
    public java.util.List<String> getStepIds() {
        return stepIds;
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get
     * steps and their states for the specified cluster.
     * </p>
     *
     * @param stepIds <p>
     *            The list of <code>StepIDs</code> to cancel. Use
     *            <a>ListSteps</a> to get steps and their states for the
     *            specified cluster.
     *            </p>
     */
    public void setStepIds(java.util.Collection<String> stepIds) {
        if (stepIds == null) {
            this.stepIds = null;
            return;
        }

        this.stepIds = new java.util.ArrayList<String>(stepIds);
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get
     * steps and their states for the specified cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepIds <p>
     *            The list of <code>StepIDs</code> to cancel. Use
     *            <a>ListSteps</a> to get steps and their states for the
     *            specified cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelStepsRequest withStepIds(String... stepIds) {
        if (getStepIds() == null) {
            this.stepIds = new java.util.ArrayList<String>(stepIds.length);
        }
        for (String value : stepIds) {
            this.stepIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get
     * steps and their states for the specified cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepIds <p>
     *            The list of <code>StepIDs</code> to cancel. Use
     *            <a>ListSteps</a> to get steps and their states for the
     *            specified cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelStepsRequest withStepIds(java.util.Collection<String> stepIds) {
        setStepIds(stepIds);
        return this;
    }

    /**
     * <p>
     * The option to choose for cancelling <code>RUNNING</code> steps. By
     * default, the value is <code>SEND_INTERRUPT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND_INTERRUPT, TERMINATE_PROCESS
     *
     * @return <p>
     *         The option to choose for cancelling <code>RUNNING</code> steps.
     *         By default, the value is <code>SEND_INTERRUPT</code>.
     *         </p>
     * @see StepCancellationOption
     */
    public String getStepCancellationOption() {
        return stepCancellationOption;
    }

    /**
     * <p>
     * The option to choose for cancelling <code>RUNNING</code> steps. By
     * default, the value is <code>SEND_INTERRUPT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND_INTERRUPT, TERMINATE_PROCESS
     *
     * @param stepCancellationOption <p>
     *            The option to choose for cancelling <code>RUNNING</code>
     *            steps. By default, the value is <code>SEND_INTERRUPT</code>.
     *            </p>
     * @see StepCancellationOption
     */
    public void setStepCancellationOption(String stepCancellationOption) {
        this.stepCancellationOption = stepCancellationOption;
    }

    /**
     * <p>
     * The option to choose for cancelling <code>RUNNING</code> steps. By
     * default, the value is <code>SEND_INTERRUPT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND_INTERRUPT, TERMINATE_PROCESS
     *
     * @param stepCancellationOption <p>
     *            The option to choose for cancelling <code>RUNNING</code>
     *            steps. By default, the value is <code>SEND_INTERRUPT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StepCancellationOption
     */
    public CancelStepsRequest withStepCancellationOption(String stepCancellationOption) {
        this.stepCancellationOption = stepCancellationOption;
        return this;
    }

    /**
     * <p>
     * The option to choose for cancelling <code>RUNNING</code> steps. By
     * default, the value is <code>SEND_INTERRUPT</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND_INTERRUPT, TERMINATE_PROCESS
     *
     * @param stepCancellationOption <p>
     *            The option to choose for cancelling <code>RUNNING</code>
     *            steps. By default, the value is <code>SEND_INTERRUPT</code>.
     *            </p>
     * @see StepCancellationOption
     */
    public void setStepCancellationOption(StepCancellationOption stepCancellationOption) {
        this.stepCancellationOption = stepCancellationOption.toString();
    }

    /**
     * <p>
     * The option to choose for cancelling <code>RUNNING</code> steps. By
     * default, the value is <code>SEND_INTERRUPT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND_INTERRUPT, TERMINATE_PROCESS
     *
     * @param stepCancellationOption <p>
     *            The option to choose for cancelling <code>RUNNING</code>
     *            steps. By default, the value is <code>SEND_INTERRUPT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StepCancellationOption
     */
    public CancelStepsRequest withStepCancellationOption(
            StepCancellationOption stepCancellationOption) {
        this.stepCancellationOption = stepCancellationOption.toString();
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
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getStepIds() != null)
            sb.append("StepIds: " + getStepIds() + ",");
        if (getStepCancellationOption() != null)
            sb.append("StepCancellationOption: " + getStepCancellationOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getStepIds() == null) ? 0 : getStepIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getStepCancellationOption() == null) ? 0 : getStepCancellationOption()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelStepsRequest == false)
            return false;
        CancelStepsRequest other = (CancelStepsRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getStepIds() == null ^ this.getStepIds() == null)
            return false;
        if (other.getStepIds() != null && other.getStepIds().equals(this.getStepIds()) == false)
            return false;
        if (other.getStepCancellationOption() == null ^ this.getStepCancellationOption() == null)
            return false;
        if (other.getStepCancellationOption() != null
                && other.getStepCancellationOption().equals(this.getStepCancellationOption()) == false)
            return false;
        return true;
    }
}
