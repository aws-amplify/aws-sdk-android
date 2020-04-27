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
 * Contains summary information about the flow definition.
 * </p>
 */
public class FlowDefinitionSummary implements Serializable {
    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     */
    private String flowDefinitionName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     */
    private String flowDefinitionArn;

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     */
    private String flowDefinitionStatus;

    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is
     * returned only when the flow definition status is <code>Failed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @return <p>
     *         The name of the flow definition.
     *         </p>
     */
    public String getFlowDefinitionName() {
        return flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param flowDefinitionName <p>
     *            The name of the flow definition.
     *            </p>
     */
    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param flowDefinitionName <p>
     *            The name of the flow definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowDefinitionSummary withFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the flow definition.
     *         </p>
     */
    public String getFlowDefinitionArn() {
        return flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @param flowDefinitionArn <p>
     *            The Amazon Resource Name (ARN) of the flow definition.
     *            </p>
     */
    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @param flowDefinitionArn <p>
     *            The Amazon Resource Name (ARN) of the flow definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowDefinitionSummary withFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @return <p>
     *         The status of the flow definition. Valid values:
     *         </p>
     * @see FlowDefinitionStatus
     */
    public String getFlowDefinitionStatus() {
        return flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values:
     *            </p>
     * @see FlowDefinitionStatus
     */
    public void setFlowDefinitionStatus(String flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values:
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlowDefinitionStatus
     */
    public FlowDefinitionSummary withFlowDefinitionStatus(String flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values:
     *            </p>
     * @see FlowDefinitionStatus
     */
    public void setFlowDefinitionStatus(FlowDefinitionStatus flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus.toString();
    }

    /**
     * <p>
     * The status of the flow definition. Valid values:
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values:
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlowDefinitionStatus
     */
    public FlowDefinitionSummary withFlowDefinitionStatus(FlowDefinitionStatus flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     *
     * @return <p>
     *         The timestamp when SageMaker created the flow definition.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     *
     * @param creationTime <p>
     *            The timestamp when SageMaker created the flow definition.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when SageMaker created the flow definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The timestamp when SageMaker created the flow definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowDefinitionSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is
     * returned only when the flow definition status is <code>Failed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The reason why the flow definition creation failed. A failure
     *         reason is returned only when the flow definition status is
     *         <code>Failed</code>.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is
     * returned only when the flow definition status is <code>Failed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The reason why the flow definition creation failed. A failure
     *            reason is returned only when the flow definition status is
     *            <code>Failed</code>.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the flow definition creation failed. A failure reason is
     * returned only when the flow definition status is <code>Failed</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The reason why the flow definition creation failed. A failure
     *            reason is returned only when the flow definition status is
     *            <code>Failed</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowDefinitionSummary withFailureReason(String failureReason) {
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
        if (getFlowDefinitionName() != null)
            sb.append("FlowDefinitionName: " + getFlowDefinitionName() + ",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: " + getFlowDefinitionArn() + ",");
        if (getFlowDefinitionStatus() != null)
            sb.append("FlowDefinitionStatus: " + getFlowDefinitionStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
        hashCode = prime * hashCode
                + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode
                + ((getFlowDefinitionStatus() == null) ? 0 : getFlowDefinitionStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
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

        if (obj instanceof FlowDefinitionSummary == false)
            return false;
        FlowDefinitionSummary other = (FlowDefinitionSummary) obj;

        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null
                && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null
                && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getFlowDefinitionStatus() == null ^ this.getFlowDefinitionStatus() == null)
            return false;
        if (other.getFlowDefinitionStatus() != null
                && other.getFlowDefinitionStatus().equals(this.getFlowDefinitionStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
