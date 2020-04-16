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

package com.amazonaws.services.amazonaugmentedairuntime.model;

import java.io.Serializable;

/**
 * <p>
 * Summary information about the human loop.
 * </p>
 */
public class HumanLoopSummary implements Serializable {
    /**
     * <p>
     * The name of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     */
    private String humanLoopName;

    /**
     * <p>
     * The status of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Failed, Completed, Stopped, Stopping
     */
    private String humanLoopStatus;

    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition used to configure
     * the human loop.
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
     * The name of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the human loop.
     *         </p>
     */
    public String getHumanLoopName() {
        return humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @param humanLoopName <p>
     *            The name of the human loop.
     *            </p>
     */
    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @param humanLoopName <p>
     *            The name of the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopSummary withHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
        return this;
    }

    /**
     * <p>
     * The status of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Failed, Completed, Stopped, Stopping
     *
     * @return <p>
     *         The status of the human loop.
     *         </p>
     * @see HumanLoopStatus
     */
    public String getHumanLoopStatus() {
        return humanLoopStatus;
    }

    /**
     * <p>
     * The status of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Failed, Completed, Stopped, Stopping
     *
     * @param humanLoopStatus <p>
     *            The status of the human loop.
     *            </p>
     * @see HumanLoopStatus
     */
    public void setHumanLoopStatus(String humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus;
    }

    /**
     * <p>
     * The status of the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Failed, Completed, Stopped, Stopping
     *
     * @param humanLoopStatus <p>
     *            The status of the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HumanLoopStatus
     */
    public HumanLoopSummary withHumanLoopStatus(String humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus;
        return this;
    }

    /**
     * <p>
     * The status of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Failed, Completed, Stopped, Stopping
     *
     * @param humanLoopStatus <p>
     *            The status of the human loop.
     *            </p>
     * @see HumanLoopStatus
     */
    public void setHumanLoopStatus(HumanLoopStatus humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus.toString();
    }

    /**
     * <p>
     * The status of the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Failed, Completed, Stopped, Stopping
     *
     * @param humanLoopStatus <p>
     *            The status of the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HumanLoopStatus
     */
    public HumanLoopSummary withHumanLoopStatus(HumanLoopStatus humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus.toString();
        return this;
    }

    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     *
     * @return <p>
     *         When Amazon Augmented AI created the human loop.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     *
     * @param creationTime <p>
     *            When Amazon Augmented AI created the human loop.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When Amazon Augmented AI created the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            When Amazon Augmented AI created the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The reason why the human loop failed. A failure reason is
     *         returned when the status of the human loop is <code>Failed</code>
     *         .
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The reason why the human loop failed. A failure reason is
     *            returned when the status of the human loop is
     *            <code>Failed</code>.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the human loop failed. A failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The reason why the human loop failed. A failure reason is
     *            returned when the status of the human loop is
     *            <code>Failed</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition used to configure
     * the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the flow definition used to
     *         configure the human loop.
     *         </p>
     */
    public String getFlowDefinitionArn() {
        return flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition used to configure
     * the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @param flowDefinitionArn <p>
     *            The Amazon Resource Name (ARN) of the flow definition used to
     *            configure the human loop.
     *            </p>
     */
    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition used to configure
     * the human loop.
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
     *            The Amazon Resource Name (ARN) of the flow definition used to
     *            configure the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopSummary withFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
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
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: " + getHumanLoopName() + ",");
        if (getHumanLoopStatus() != null)
            sb.append("HumanLoopStatus: " + getHumanLoopStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: " + getFlowDefinitionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopStatus() == null) ? 0 : getHumanLoopStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopSummary == false)
            return false;
        HumanLoopSummary other = (HumanLoopSummary) obj;

        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null
                && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        if (other.getHumanLoopStatus() == null ^ this.getHumanLoopStatus() == null)
            return false;
        if (other.getHumanLoopStatus() != null
                && other.getHumanLoopStatus().equals(this.getHumanLoopStatus()) == false)
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
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null
                && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        return true;
    }
}
