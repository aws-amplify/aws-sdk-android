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
 * Creates a model in Amazon SageMaker. In the request, you name the model and
 * describe a primary container. For the primary container, you specify the
 * Docker image that contains inference code, artifacts (from prior training),
 * and a custom environment map that the inference code uses when you deploy the
 * model for predictions.
 * </p>
 * <p>
 * Use this API to create a model if you want to use Amazon SageMaker hosting
 * services or run a batch transform job.
 * </p>
 * <p>
 * To host your model, you create an endpoint configuration with the
 * <code>CreateEndpointConfig</code> API, and then create an endpoint with the
 * <code>CreateEndpoint</code> API. Amazon SageMaker then deploys all of the
 * containers that you defined for the model in the hosting environment.
 * </p>
 * <p>
 * For an example that calls this method when deploying a model to Amazon
 * SageMaker hosting services, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
 * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python
 * (Boto 3)).</a>
 * </p>
 * <p>
 * To run a batch transform using your model, you start a job with the
 * <code>CreateTransformJob</code> API. Amazon SageMaker uses your model and
 * your dataset to get inferences which are then saved to a specified S3
 * location.
 * </p>
 * <p>
 * In the <code>CreateModel</code> request, you must define a container with the
 * <code>PrimaryContainer</code> parameter.
 * </p>
 * <p>
 * In the request, you also provide an IAM role that Amazon SageMaker can assume
 * to access model artifacts and docker image for deployment on ML compute
 * hosting instances or for batch transform jobs. In addition, you also use the
 * IAM role to manage permissions the inference code needs. For example, if the
 * inference code access any other AWS resources, you grant necessary
 * permissions via this role.
 * </p>
 */
public class CreateModelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the new model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String modelName;

    /**
     * <p>
     * The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code
     * uses when the model is deployed for predictions.
     * </p>
     */
    private ContainerDefinition primaryContainer;

    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     */
    private java.util.List<ContainerDefinition> containers;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access model artifacts and docker image for deployment on ML
     * compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String executionRoleArn;

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model
     * to connect to. Control access to and from your model container by
     * configuring the VPC. <code>VpcConfig</code> is used in hosting services
     * and in batch transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">
     * Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private
     * Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be
     * made to or from the model container.
     * </p>
     */
    private Boolean enableNetworkIsolation;

    /**
     * <p>
     * The name of the new model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the new model.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * The name of the new model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            The name of the new model.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the new model.
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
     *            The name of the new model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code
     * uses when the model is deployed for predictions.
     * </p>
     *
     * @return <p>
     *         The location of the primary docker image containing inference
     *         code, associated artifacts, and custom environment map that the
     *         inference code uses when the model is deployed for predictions.
     *         </p>
     */
    public ContainerDefinition getPrimaryContainer() {
        return primaryContainer;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code
     * uses when the model is deployed for predictions.
     * </p>
     *
     * @param primaryContainer <p>
     *            The location of the primary docker image containing inference
     *            code, associated artifacts, and custom environment map that
     *            the inference code uses when the model is deployed for
     *            predictions.
     *            </p>
     */
    public void setPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    /**
     * <p>
     * The location of the primary docker image containing inference code,
     * associated artifacts, and custom environment map that the inference code
     * uses when the model is deployed for predictions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primaryContainer <p>
     *            The location of the primary docker image containing inference
     *            code, associated artifacts, and custom environment map that
     *            the inference code uses when the model is deployed for
     *            predictions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
        return this;
    }

    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     *
     * @return <p>
     *         Specifies the containers in the inference pipeline.
     *         </p>
     */
    public java.util.List<ContainerDefinition> getContainers() {
        return containers;
    }

    /**
     * <p>
     * Specifies the containers in the inference pipeline.
     * </p>
     *
     * @param containers <p>
     *            Specifies the containers in the inference pipeline.
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
     * Specifies the containers in the inference pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            Specifies the containers in the inference pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withContainers(ContainerDefinition... containers) {
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
     * Specifies the containers in the inference pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            Specifies the containers in the inference pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withContainers(java.util.Collection<ContainerDefinition> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access model artifacts and docker image for deployment on ML
     * compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that Amazon
     *         SageMaker can assume to access model artifacts and docker image
     *         for deployment on ML compute instances or for batch transform
     *         jobs. Deploying on ML compute instances is part of model hosting.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *         >Amazon SageMaker Roles</a>.
     *         </p>
     *         <note>
     *         <p>
     *         To be able to pass this role to Amazon SageMaker, the caller of
     *         this API must have the <code>iam:PassRole</code> permission.
     *         </p>
     *         </note>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access model artifacts and docker image for deployment on ML
     * compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that Amazon
     *            SageMaker can assume to access model artifacts and docker
     *            image for deployment on ML compute instances or for batch
     *            transform jobs. Deploying on ML compute instances is part of
     *            model hosting. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *            >Amazon SageMaker Roles</a>.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to pass this role to Amazon SageMaker, the caller
     *            of this API must have the <code>iam:PassRole</code>
     *            permission.
     *            </p>
     *            </note>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can
     * assume to access model artifacts and docker image for deployment on ML
     * compute instances or for batch transform jobs. Deploying on ML compute
     * instances is part of model hosting. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API
     * must have the <code>iam:PassRole</code> permission.
     * </p>
     * </note>
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
     *            The Amazon Resource Name (ARN) of the IAM role that Amazon
     *            SageMaker can assume to access model artifacts and docker
     *            image for deployment on ML compute instances or for batch
     *            transform jobs. Deploying on ML compute instances is part of
     *            model hosting. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *            >Amazon SageMaker Roles</a>.
     *            </p>
     *            <note>
     *            <p>
     *            To be able to pass this role to Amazon SageMaker, the caller
     *            of this API must have the <code>iam:PassRole</code>
     *            permission.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *         Management User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            An array of key-value pairs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
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
     * An array of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withTags(Tag... tags) {
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
     * An array of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model
     * to connect to. Control access to and from your model container by
     * configuring the VPC. <code>VpcConfig</code> is used in hosting services
     * and in batch transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">
     * Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private
     * Cloud</a>.
     * </p>
     *
     * @return <p>
     *         A <a>VpcConfig</a> object that specifies the VPC that you want
     *         your model to connect to. Control access to and from your model
     *         container by configuring the VPC. <code>VpcConfig</code> is used
     *         in hosting services and in batch transform. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *         >Protect Endpoints by Using an Amazon Virtual Private Cloud</a>
     *         and <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html"
     *         >Protect Data in Batch Transform Jobs by Using an Amazon Virtual
     *         Private Cloud</a>.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model
     * to connect to. Control access to and from your model container by
     * configuring the VPC. <code>VpcConfig</code> is used in hosting services
     * and in batch transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">
     * Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private
     * Cloud</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that you want
     *            your model to connect to. Control access to and from your
     *            model container by configuring the VPC. <code>VpcConfig</code>
     *            is used in hosting services and in batch transform. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *            >Protect Endpoints by Using an Amazon Virtual Private
     *            Cloud</a> and <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html"
     *            >Protect Data in Batch Transform Jobs by Using an Amazon
     *            Virtual Private Cloud</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your model
     * to connect to. Control access to and from your model container by
     * configuring the VPC. <code>VpcConfig</code> is used in hosting services
     * and in batch transform. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html">
     * Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private
     * Cloud</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that you want
     *            your model to connect to. Control access to and from your
     *            model container by configuring the VPC. <code>VpcConfig</code>
     *            is used in hosting services and in batch transform. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *            >Protect Endpoints by Using an Amazon Virtual Private
     *            Cloud</a> and <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html"
     *            >Protect Data in Batch Transform Jobs by Using an Amazon
     *            Virtual Private Cloud</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be
     * made to or from the model container.
     * </p>
     *
     * @return <p>
     *         Isolates the model container. No inbound or outbound network
     *         calls can be made to or from the model container.
     *         </p>
     */
    public Boolean isEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be
     * made to or from the model container.
     * </p>
     *
     * @return <p>
     *         Isolates the model container. No inbound or outbound network
     *         calls can be made to or from the model container.
     *         </p>
     */
    public Boolean getEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be
     * made to or from the model container.
     * </p>
     *
     * @param enableNetworkIsolation <p>
     *            Isolates the model container. No inbound or outbound network
     *            calls can be made to or from the model container.
     *            </p>
     */
    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the model container. No inbound or outbound network calls can be
     * made to or from the model container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNetworkIsolation <p>
     *            Isolates the model container. No inbound or outbound network
     *            calls can be made to or from the model container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
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

        if (obj instanceof CreateModelRequest == false)
            return false;
        CreateModelRequest other = (CreateModelRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null
                && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        return true;
    }
}
