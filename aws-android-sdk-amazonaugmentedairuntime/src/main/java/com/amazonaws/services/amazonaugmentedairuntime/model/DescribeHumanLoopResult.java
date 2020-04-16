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

public class DescribeHumanLoopResult implements Serializable {
    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The reason why a human loop failed. The failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * A failure code that identifies the type of failure.
     * </p>
     */
    private String failureCode;

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
     * The name of the human loop. The name must be lowercase, unique within the
     * Region in your account, and can have up to 63 characters. Valid
     * characters: a-z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     */
    private String humanLoopName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-loop/.*<br/>
     */
    private String humanLoopArn;

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
     * An object that contains information about the output of the human loop.
     * </p>
     */
    private HumanLoopOutput humanLoopOutput;

    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     *
     * @return <p>
     *         The creation time when Amazon Augmented AI created the human
     *         loop.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     *
     * @param creationTime <p>
     *            The creation time when Amazon Augmented AI created the human
     *            loop.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time when Amazon Augmented AI created the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation time when Amazon Augmented AI created the human
     *            loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanLoopResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The reason why a human loop failed. The failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     *
     * @return <p>
     *         The reason why a human loop failed. The failure reason is
     *         returned when the status of the human loop is <code>Failed</code>
     *         .
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason why a human loop failed. The failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     *
     * @param failureReason <p>
     *            The reason why a human loop failed. The failure reason is
     *            returned when the status of the human loop is
     *            <code>Failed</code>.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why a human loop failed. The failure reason is returned when
     * the status of the human loop is <code>Failed</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            The reason why a human loop failed. The failure reason is
     *            returned when the status of the human loop is
     *            <code>Failed</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanLoopResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * A failure code that identifies the type of failure.
     * </p>
     *
     * @return <p>
     *         A failure code that identifies the type of failure.
     *         </p>
     */
    public String getFailureCode() {
        return failureCode;
    }

    /**
     * <p>
     * A failure code that identifies the type of failure.
     * </p>
     *
     * @param failureCode <p>
     *            A failure code that identifies the type of failure.
     *            </p>
     */
    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * A failure code that identifies the type of failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureCode <p>
     *            A failure code that identifies the type of failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanLoopResult withFailureCode(String failureCode) {
        this.failureCode = failureCode;
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
    public DescribeHumanLoopResult withHumanLoopStatus(String humanLoopStatus) {
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
    public DescribeHumanLoopResult withHumanLoopStatus(HumanLoopStatus humanLoopStatus) {
        this.humanLoopStatus = humanLoopStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the human loop. The name must be lowercase, unique within the
     * Region in your account, and can have up to 63 characters. Valid
     * characters: a-z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the human loop. The name must be lowercase, unique
     *         within the Region in your account, and can have up to 63
     *         characters. Valid characters: a-z, 0-9, and - (hyphen).
     *         </p>
     */
    public String getHumanLoopName() {
        return humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop. The name must be lowercase, unique within the
     * Region in your account, and can have up to 63 characters. Valid
     * characters: a-z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @param humanLoopName <p>
     *            The name of the human loop. The name must be lowercase, unique
     *            within the Region in your account, and can have up to 63
     *            characters. Valid characters: a-z, 0-9, and - (hyphen).
     *            </p>
     */
    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop. The name must be lowercase, unique within the
     * Region in your account, and can have up to 63 characters. Valid
     * characters: a-z, 0-9, and - (hyphen).
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
     *            The name of the human loop. The name must be lowercase, unique
     *            within the Region in your account, and can have up to 63
     *            characters. Valid characters: a-z, 0-9, and - (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanLoopResult withHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-loop/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the human loop.
     *         </p>
     */
    public String getHumanLoopArn() {
        return humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-loop/.*<br/>
     *
     * @param humanLoopArn <p>
     *            The Amazon Resource Name (ARN) of the human loop.
     *            </p>
     */
    public void setHumanLoopArn(String humanLoopArn) {
        this.humanLoopArn = humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-loop/.*<br/>
     *
     * @param humanLoopArn <p>
     *            The Amazon Resource Name (ARN) of the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanLoopResult withHumanLoopArn(String humanLoopArn) {
        this.humanLoopArn = humanLoopArn;
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
    public DescribeHumanLoopResult withFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
        return this;
    }

    /**
     * <p>
     * An object that contains information about the output of the human loop.
     * </p>
     *
     * @return <p>
     *         An object that contains information about the output of the human
     *         loop.
     *         </p>
     */
    public HumanLoopOutput getHumanLoopOutput() {
        return humanLoopOutput;
    }

    /**
     * <p>
     * An object that contains information about the output of the human loop.
     * </p>
     *
     * @param humanLoopOutput <p>
     *            An object that contains information about the output of the
     *            human loop.
     *            </p>
     */
    public void setHumanLoopOutput(HumanLoopOutput humanLoopOutput) {
        this.humanLoopOutput = humanLoopOutput;
    }

    /**
     * <p>
     * An object that contains information about the output of the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopOutput <p>
     *            An object that contains information about the output of the
     *            human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanLoopResult withHumanLoopOutput(HumanLoopOutput humanLoopOutput) {
        this.humanLoopOutput = humanLoopOutput;
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
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getFailureCode() != null)
            sb.append("FailureCode: " + getFailureCode() + ",");
        if (getHumanLoopStatus() != null)
            sb.append("HumanLoopStatus: " + getHumanLoopStatus() + ",");
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: " + getHumanLoopName() + ",");
        if (getHumanLoopArn() != null)
            sb.append("HumanLoopArn: " + getHumanLoopArn() + ",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: " + getFlowDefinitionArn() + ",");
        if (getHumanLoopOutput() != null)
            sb.append("HumanLoopOutput: " + getHumanLoopOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopStatus() == null) ? 0 : getHumanLoopStatus().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopArn() == null) ? 0 : getHumanLoopArn().hashCode());
        hashCode = prime * hashCode
                + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopOutput() == null) ? 0 : getHumanLoopOutput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHumanLoopResult == false)
            return false;
        DescribeHumanLoopResult other = (DescribeHumanLoopResult) obj;

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
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null
                && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getHumanLoopStatus() == null ^ this.getHumanLoopStatus() == null)
            return false;
        if (other.getHumanLoopStatus() != null
                && other.getHumanLoopStatus().equals(this.getHumanLoopStatus()) == false)
            return false;
        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null
                && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        if (other.getHumanLoopArn() == null ^ this.getHumanLoopArn() == null)
            return false;
        if (other.getHumanLoopArn() != null
                && other.getHumanLoopArn().equals(this.getHumanLoopArn()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null
                && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getHumanLoopOutput() == null ^ this.getHumanLoopOutput() == null)
            return false;
        if (other.getHumanLoopOutput() != null
                && other.getHumanLoopOutput().equals(this.getHumanLoopOutput()) == false)
            return false;
        return true;
    }
}
