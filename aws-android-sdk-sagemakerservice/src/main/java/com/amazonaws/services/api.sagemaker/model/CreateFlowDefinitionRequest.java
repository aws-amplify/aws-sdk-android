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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a flow definition.
 * </p>
 */
public class CreateFlowDefinitionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of your flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     */
    private String flowDefinitionName;

    /**
     * <p>
     * Container for configuring the source of human task requests. Use to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     */
    private HumanLoopRequestSource humanLoopRequestSource;

    /**
     * <p>
     * An object containing information about the events that trigger a human
     * workflow.
     * </p>
     */
    private HumanLoopActivationConfig humanLoopActivationConfig;

    /**
     * <p>
     * An object containing information about the tasks the human reviewers will
     * perform.
     * </p>
     */
    private HumanLoopConfig humanLoopConfig;

    /**
     * <p>
     * An object containing information about where the human review results
     * will be uploaded.
     * </p>
     */
    private FlowDefinitionOutputConfig outputConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services
     * on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a flow definition. Each tag consists of a key and a value,
     * both of which you define.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of your flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @return <p>
     *         The name of your flow definition.
     *         </p>
     */
    public String getFlowDefinitionName() {
        return flowDefinitionName;
    }

    /**
     * <p>
     * The name of your flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param flowDefinitionName <p>
     *            The name of your flow definition.
     *            </p>
     */
    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    /**
     * <p>
     * The name of your flow definition.
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
     *            The name of your flow definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
        return this;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests. Use to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     *
     * @return <p>
     *         Container for configuring the source of human task requests. Use
     *         to specify if Amazon Rekognition or Amazon Textract is used as an
     *         integration source.
     *         </p>
     */
    public HumanLoopRequestSource getHumanLoopRequestSource() {
        return humanLoopRequestSource;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests. Use to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     *
     * @param humanLoopRequestSource <p>
     *            Container for configuring the source of human task requests.
     *            Use to specify if Amazon Rekognition or Amazon Textract is
     *            used as an integration source.
     *            </p>
     */
    public void setHumanLoopRequestSource(HumanLoopRequestSource humanLoopRequestSource) {
        this.humanLoopRequestSource = humanLoopRequestSource;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests. Use to
     * specify if Amazon Rekognition or Amazon Textract is used as an
     * integration source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopRequestSource <p>
     *            Container for configuring the source of human task requests.
     *            Use to specify if Amazon Rekognition or Amazon Textract is
     *            used as an integration source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withHumanLoopRequestSource(
            HumanLoopRequestSource humanLoopRequestSource) {
        this.humanLoopRequestSource = humanLoopRequestSource;
        return this;
    }

    /**
     * <p>
     * An object containing information about the events that trigger a human
     * workflow.
     * </p>
     *
     * @return <p>
     *         An object containing information about the events that trigger a
     *         human workflow.
     *         </p>
     */
    public HumanLoopActivationConfig getHumanLoopActivationConfig() {
        return humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about the events that trigger a human
     * workflow.
     * </p>
     *
     * @param humanLoopActivationConfig <p>
     *            An object containing information about the events that trigger
     *            a human workflow.
     *            </p>
     */
    public void setHumanLoopActivationConfig(HumanLoopActivationConfig humanLoopActivationConfig) {
        this.humanLoopActivationConfig = humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about the events that trigger a human
     * workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopActivationConfig <p>
     *            An object containing information about the events that trigger
     *            a human workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withHumanLoopActivationConfig(
            HumanLoopActivationConfig humanLoopActivationConfig) {
        this.humanLoopActivationConfig = humanLoopActivationConfig;
        return this;
    }

    /**
     * <p>
     * An object containing information about the tasks the human reviewers will
     * perform.
     * </p>
     *
     * @return <p>
     *         An object containing information about the tasks the human
     *         reviewers will perform.
     *         </p>
     */
    public HumanLoopConfig getHumanLoopConfig() {
        return humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about the tasks the human reviewers will
     * perform.
     * </p>
     *
     * @param humanLoopConfig <p>
     *            An object containing information about the tasks the human
     *            reviewers will perform.
     *            </p>
     */
    public void setHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about the tasks the human reviewers will
     * perform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopConfig <p>
     *            An object containing information about the tasks the human
     *            reviewers will perform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
        return this;
    }

    /**
     * <p>
     * An object containing information about where the human review results
     * will be uploaded.
     * </p>
     *
     * @return <p>
     *         An object containing information about where the human review
     *         results will be uploaded.
     *         </p>
     */
    public FlowDefinitionOutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * An object containing information about where the human review results
     * will be uploaded.
     * </p>
     *
     * @param outputConfig <p>
     *            An object containing information about where the human review
     *            results will be uploaded.
     *            </p>
     */
    public void setOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * An object containing information about where the human review results
     * will be uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            An object containing information about where the human review
     *            results will be uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services
     * on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role needed to call other
     *         services on your behalf. For example,
     *         <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>
     *         .
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services
     * on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role needed to call
     *            other services on your behalf. For example,
     *            <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>
     *            .
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services
     * on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>
     * .
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
     *            The Amazon Resource Name (ARN) of the role needed to call
     *            other services on your behalf. For example,
     *            <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a flow definition. Each tag consists of a key and a value,
     * both of which you define.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs that contain metadata to help you
     *         categorize and organize a flow definition. Each tag consists of a
     *         key and a value, both of which you define.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a flow definition. Each tag consists of a key and a value,
     * both of which you define.
     * </p>
     *
     * @param tags <p>
     *            An array of key-value pairs that contain metadata to help you
     *            categorize and organize a flow definition. Each tag consists
     *            of a key and a value, both of which you define.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a flow definition. Each tag consists of a key and a value,
     * both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs that contain metadata to help you
     *            categorize and organize a flow definition. Each tag consists
     *            of a key and a value, both of which you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize
     * and organize a flow definition. Each tag consists of a key and a value,
     * both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs that contain metadata to help you
     *            categorize and organize a flow definition. Each tag consists
     *            of a key and a value, both of which you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowDefinitionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowDefinitionRequest == false)
            return false;
        CreateFlowDefinitionRequest other = (CreateFlowDefinitionRequest) obj;

        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null
                && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
