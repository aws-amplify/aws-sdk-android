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

public class DescribeFlowDefinitionResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
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
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     */
    private String flowDefinitionName;

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     */
    private String flowDefinitionStatus;

    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Container for configuring the source of human task requests. Used to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     */
    private HumanLoopRequestSource humanLoopRequestSource;

    /**
     * <p>
     * An object containing information about what triggers a human review
     * workflow.
     * </p>
     */
    private HumanLoopActivationConfig humanLoopActivationConfig;

    /**
     * <p>
     * An object containing information about who works on the task, the
     * workforce task price, and other task details.
     * </p>
     */
    private HumanLoopConfig humanLoopConfig;

    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     */
    private FlowDefinitionOutputConfig outputConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) execution role for the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the flow defintion.
     *         </p>
     */
    public String getFlowDefinitionArn() {
        return flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @param flowDefinitionArn <p>
     *            The Amazon Resource Name (ARN) of the flow defintion.
     *            </p>
     */
    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
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
     *            The Amazon Resource Name (ARN) of the flow defintion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the flow definition.
     *         </p>
     */
    public String getFlowDefinitionName() {
        return flowDefinitionName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param flowDefinitionName <p>
     *            The Amazon Resource Name (ARN) of the flow definition.
     *            </p>
     */
    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
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
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param flowDefinitionName <p>
     *            The Amazon Resource Name (ARN) of the flow definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @return <p>
     *         The status of the flow definition. Valid values are listed below.
     *         </p>
     * @see FlowDefinitionStatus
     */
    public String getFlowDefinitionStatus() {
        return flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values are listed
     *            below.
     *            </p>
     * @see FlowDefinitionStatus
     */
    public void setFlowDefinitionStatus(String flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values are listed
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlowDefinitionStatus
     */
    public DescribeFlowDefinitionResult withFlowDefinitionStatus(String flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values are listed
     *            below.
     *            </p>
     * @see FlowDefinitionStatus
     */
    public void setFlowDefinitionStatus(FlowDefinitionStatus flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus.toString();
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Initializing, Active, Failed, Deleting
     *
     * @param flowDefinitionStatus <p>
     *            The status of the flow definition. Valid values are listed
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlowDefinitionStatus
     */
    public DescribeFlowDefinitionResult withFlowDefinitionStatus(
            FlowDefinitionStatus flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the flow definition was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     *
     * @param creationTime <p>
     *            The timestamp when the flow definition was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The timestamp when the flow definition was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests. Used to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     *
     * @return <p>
     *         Container for configuring the source of human task requests. Used
     *         to specify if Amazon Rekognition or Amazon Textract is used as an
     *         integration source.
     *         </p>
     */
    public HumanLoopRequestSource getHumanLoopRequestSource() {
        return humanLoopRequestSource;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests. Used to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     *
     * @param humanLoopRequestSource <p>
     *            Container for configuring the source of human task requests.
     *            Used to specify if Amazon Rekognition or Amazon Textract is
     *            used as an integration source.
     *            </p>
     */
    public void setHumanLoopRequestSource(HumanLoopRequestSource humanLoopRequestSource) {
        this.humanLoopRequestSource = humanLoopRequestSource;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests. Used to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopRequestSource <p>
     *            Container for configuring the source of human task requests.
     *            Used to specify if Amazon Rekognition or Amazon Textract is
     *            used as an integration source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withHumanLoopRequestSource(
            HumanLoopRequestSource humanLoopRequestSource) {
        this.humanLoopRequestSource = humanLoopRequestSource;
        return this;
    }

    /**
     * <p>
     * An object containing information about what triggers a human review
     * workflow.
     * </p>
     *
     * @return <p>
     *         An object containing information about what triggers a human
     *         review workflow.
     *         </p>
     */
    public HumanLoopActivationConfig getHumanLoopActivationConfig() {
        return humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about what triggers a human review
     * workflow.
     * </p>
     *
     * @param humanLoopActivationConfig <p>
     *            An object containing information about what triggers a human
     *            review workflow.
     *            </p>
     */
    public void setHumanLoopActivationConfig(HumanLoopActivationConfig humanLoopActivationConfig) {
        this.humanLoopActivationConfig = humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about what triggers a human review
     * workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopActivationConfig <p>
     *            An object containing information about what triggers a human
     *            review workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withHumanLoopActivationConfig(
            HumanLoopActivationConfig humanLoopActivationConfig) {
        this.humanLoopActivationConfig = humanLoopActivationConfig;
        return this;
    }

    /**
     * <p>
     * An object containing information about who works on the task, the
     * workforce task price, and other task details.
     * </p>
     *
     * @return <p>
     *         An object containing information about who works on the task, the
     *         workforce task price, and other task details.
     *         </p>
     */
    public HumanLoopConfig getHumanLoopConfig() {
        return humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about who works on the task, the
     * workforce task price, and other task details.
     * </p>
     *
     * @param humanLoopConfig <p>
     *            An object containing information about who works on the task,
     *            the workforce task price, and other task details.
     *            </p>
     */
    public void setHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about who works on the task, the
     * workforce task price, and other task details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopConfig <p>
     *            An object containing information about who works on the task,
     *            the workforce task price, and other task details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
        return this;
    }

    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     *
     * @return <p>
     *         An object containing information about the output file.
     *         </p>
     */
    public FlowDefinitionOutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     *
     * @param outputConfig <p>
     *            An object containing information about the output file.
     *            </p>
     */
    public void setOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            An object containing information about the output file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) execution role for the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) execution role for the flow definition.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) execution role for the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) execution role for the flow definition.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) execution role for the flow definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) execution role for the flow definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p/>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p/>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionResult withFailureReason(String failureReason) {
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
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: " + getFlowDefinitionArn() + ",");
        if (getFlowDefinitionName() != null)
            sb.append("FlowDefinitionName: " + getFlowDefinitionName() + ",");
        if (getFlowDefinitionStatus() != null)
            sb.append("FlowDefinitionStatus: " + getFlowDefinitionStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getHumanLoopRequestSource() != null)
            sb.append("HumanLoopRequestSource: " + getHumanLoopRequestSource() + ",");
        if (getHumanLoopActivationConfig() != null)
            sb.append("HumanLoopActivationConfig: " + getHumanLoopActivationConfig() + ",");
        if (getHumanLoopConfig() != null)
            sb.append("HumanLoopConfig: " + getHumanLoopConfig() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
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
                + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode
                + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
        hashCode = prime * hashCode
                + ((getFlowDefinitionStatus() == null) ? 0 : getFlowDefinitionStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getHumanLoopRequestSource() == null) ? 0 : getHumanLoopRequestSource()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHumanLoopActivationConfig() == null) ? 0 : getHumanLoopActivationConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopConfig() == null) ? 0 : getHumanLoopConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
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

        if (obj instanceof DescribeFlowDefinitionResult == false)
            return false;
        DescribeFlowDefinitionResult other = (DescribeFlowDefinitionResult) obj;

        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null
                && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null
                && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
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
        if (other.getHumanLoopRequestSource() == null ^ this.getHumanLoopRequestSource() == null)
            return false;
        if (other.getHumanLoopRequestSource() != null
                && other.getHumanLoopRequestSource().equals(this.getHumanLoopRequestSource()) == false)
            return false;
        if (other.getHumanLoopActivationConfig() == null
                ^ this.getHumanLoopActivationConfig() == null)
            return false;
        if (other.getHumanLoopActivationConfig() != null
                && other.getHumanLoopActivationConfig().equals(this.getHumanLoopActivationConfig()) == false)
            return false;
        if (other.getHumanLoopConfig() == null ^ this.getHumanLoopConfig() == null)
            return false;
        if (other.getHumanLoopConfig() != null
                && other.getHumanLoopConfig().equals(this.getHumanLoopConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
