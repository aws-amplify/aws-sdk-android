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

public class DescribeModelResult implements Serializable {
    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String modelName;

    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and
     * custom environment map that the inference code uses when it is deployed
     * in production.
     * </p>
     */
    private ContainerDefinition primaryContainer;

    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     */
    private java.util.List<ContainerDefinition> containers;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the
     * model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String executionRoleArn;

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this model has
     * access to. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a>
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     */
    private String modelArn;

    /**
     * <p>
     * If <code>True</code>, no inbound or outbound network calls can be made to
     * or from the model container.
     * </p>
     */
    private Boolean enableNetworkIsolation;

    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         Name of the Amazon SageMaker model.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            Name of the Amazon SageMaker model.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            Name of the Amazon SageMaker model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and
     * custom environment map that the inference code uses when it is deployed
     * in production.
     * </p>
     *
     * @return <p>
     *         The location of the primary inference code, associated artifacts,
     *         and custom environment map that the inference code uses when it
     *         is deployed in production.
     *         </p>
     */
    public ContainerDefinition getPrimaryContainer() {
        return primaryContainer;
    }

    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and
     * custom environment map that the inference code uses when it is deployed
     * in production.
     * </p>
     *
     * @param primaryContainer <p>
     *            The location of the primary inference code, associated
     *            artifacts, and custom environment map that the inference code
     *            uses when it is deployed in production.
     *            </p>
     */
    public void setPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    /**
     * <p>
     * The location of the primary inference code, associated artifacts, and
     * custom environment map that the inference code uses when it is deployed
     * in production.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryContainer <p>
     *            The location of the primary inference code, associated
     *            artifacts, and custom environment map that the inference code
     *            uses when it is deployed in production.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
        return this;
    }

    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     *
     * @return <p>
     *         The containers in the inference pipeline.
     *         </p>
     */
    public java.util.List<ContainerDefinition> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     *
     * @param containers <p>
     *            The containers in the inference pipeline.
     *            </p>
     */
    public void setContainers(java.util.Collection<ContainerDefinition> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<ContainerDefinition>(containers);
    }

    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            The containers in the inference pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withContainers(ContainerDefinition... containers) {
        if (getContainers() == null) {
            this.containers = new java.util.ArrayList<ContainerDefinition>(containers.length);
        }
        for (ContainerDefinition value : containers) {
            this.containers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The containers in the inference pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            The containers in the inference pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withContainers(java.util.Collection<ContainerDefinition> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the
     * model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that you specified
     *         for the model.
     *         </p>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the
     * model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that you
     *            specified for the model.
     *            </p>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the
     * model.
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
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that you
     *            specified for the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this model has
     * access to. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a>
     * </p>
     *
     * @return <p>
     *         A <a>VpcConfig</a> object that specifies the VPC that this model
     *         has access to. For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *         >Protect Endpoints by Using an Amazon Virtual Private Cloud</a>
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this model has
     * access to. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a>
     * </p>
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that this
     *            model has access to. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *            >Protect Endpoints by Using an Amazon Virtual Private
     *            Cloud</a>
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this model has
     * access to. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that this
     *            model has access to. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *            >Protect Endpoints by Using an Amazon Virtual Private
     *            Cloud</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the model was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the model was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the model was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model.
     *         </p>
     */
    public String getModelArn() {
        return modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Name (ARN) of the model.
     *            </p>
     */
    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Name (ARN) of the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withModelArn(String modelArn) {
        this.modelArn = modelArn;
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, no inbound or outbound network calls can be made to
     * or from the model container.
     * </p>
     *
     * @return <p>
     *         If <code>True</code>, no inbound or outbound network calls can be
     *         made to or from the model container.
     *         </p>
     */
    public Boolean isEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * If <code>True</code>, no inbound or outbound network calls can be made to
     * or from the model container.
     * </p>
     *
     * @return <p>
     *         If <code>True</code>, no inbound or outbound network calls can be
     *         made to or from the model container.
     *         </p>
     */
    public Boolean getEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * If <code>True</code>, no inbound or outbound network calls can be made to
     * or from the model container.
     * </p>
     *
     * @param enableNetworkIsolation <p>
     *            If <code>True</code>, no inbound or outbound network calls can
     *            be made to or from the model container.
     *            </p>
     */
    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * If <code>True</code>, no inbound or outbound network calls can be made to
     * or from the model container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNetworkIsolation <p>
     *            If <code>True</code>, no inbound or outbound network calls can
     *            be made to or from the model container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelResult withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
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
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName() + ",");
        if (getPrimaryContainer() != null)
            sb.append("PrimaryContainer: " + getPrimaryContainer() + ",");
        if (getContainers() != null)
            sb.append("Containers: " + getContainers() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: " + getExecutionRoleArn() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getModelArn() != null)
            sb.append("ModelArn: " + getModelArn() + ",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: " + getEnableNetworkIsolation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode
                + ((getPrimaryContainer() == null) ? 0 : getPrimaryContainer().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelResult == false)
            return false;
        DescribeModelResult other = (DescribeModelResult) obj;

        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getPrimaryContainer() == null ^ this.getPrimaryContainer() == null)
            return false;
        if (other.getPrimaryContainer() != null
                && other.getPrimaryContainer().equals(this.getPrimaryContainer()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null
                && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null
                && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        return true;
    }
}
