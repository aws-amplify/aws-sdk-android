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
 * Describes the container, as part of model definition.
 * </p>
 */
public class ContainerDefinition implements Serializable {
    /**
     * <p>
     * This parameter is ignored for models that contain only a
     * <code>PrimaryContainer</code>.
     * </p>
     * <p>
     * When a <code>ContainerDefinition</code> is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the
     * purposes of logging and metrics. For information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html"
     * >Use Logs and Metrics to Monitor an Inference Pipeline</a>. If you don't
     * specify a value for this parameter for a <code>ContainerDefinition</code>
     * that is part of an inference pipeline, a unique name is automatically
     * assigned based on the position of the <code>ContainerDefinition</code> in
     * the pipeline. If you specify a value for the
     * <code>ContainerHostName</code> for any <code>ContainerDefinition</code>
     * that is part of an inference pipeline, you must specify a value for the
     * <code>ContainerHostName</code> parameter of every
     * <code>ContainerDefinition</code> in that pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String containerHostname;

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored. If you are using your own custom algorithm instead of an
     * algorithm provided by Amazon SageMaker, the inference code must meet
     * Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String image;

    /**
     * <p>
     * Whether the container hosts a single model or multiple models.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleModel, MultiModel
     */
    private String mode;

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix). The S3 path is required for Amazon SageMaker built-in
     * algorithms, but not if you use your own algorithms. For more information
     * on built-in algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Common Parameters</a>.
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you
     * provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS
     * STS for that region. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you use a built-in algorithm to create a model, Amazon SageMaker
     * requires that you provide a S3 path to the model artifacts in
     * <code>ModelDataUrl</code>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String modelDataUrl;

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and
     * value in the <code>Environment</code> string to string map can have
     * length of up to 1024. We support up to 16 entries in the map.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     */
    private String modelPackageName;

    /**
     * <p>
     * This parameter is ignored for models that contain only a
     * <code>PrimaryContainer</code>.
     * </p>
     * <p>
     * When a <code>ContainerDefinition</code> is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the
     * purposes of logging and metrics. For information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html"
     * >Use Logs and Metrics to Monitor an Inference Pipeline</a>. If you don't
     * specify a value for this parameter for a <code>ContainerDefinition</code>
     * that is part of an inference pipeline, a unique name is automatically
     * assigned based on the position of the <code>ContainerDefinition</code> in
     * the pipeline. If you specify a value for the
     * <code>ContainerHostName</code> for any <code>ContainerDefinition</code>
     * that is part of an inference pipeline, you must specify a value for the
     * <code>ContainerHostName</code> parameter of every
     * <code>ContainerDefinition</code> in that pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         This parameter is ignored for models that contain only a
     *         <code>PrimaryContainer</code>.
     *         </p>
     *         <p>
     *         When a <code>ContainerDefinition</code> is part of an inference
     *         pipeline, the value of the parameter uniquely identifies the
     *         container for the purposes of logging and metrics. For
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html"
     *         >Use Logs and Metrics to Monitor an Inference Pipeline</a>. If
     *         you don't specify a value for this parameter for a
     *         <code>ContainerDefinition</code> that is part of an inference
     *         pipeline, a unique name is automatically assigned based on the
     *         position of the <code>ContainerDefinition</code> in the pipeline.
     *         If you specify a value for the <code>ContainerHostName</code> for
     *         any <code>ContainerDefinition</code> that is part of an inference
     *         pipeline, you must specify a value for the
     *         <code>ContainerHostName</code> parameter of every
     *         <code>ContainerDefinition</code> in that pipeline.
     *         </p>
     */
    public String getContainerHostname() {
        return containerHostname;
    }

    /**
     * <p>
     * This parameter is ignored for models that contain only a
     * <code>PrimaryContainer</code>.
     * </p>
     * <p>
     * When a <code>ContainerDefinition</code> is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the
     * purposes of logging and metrics. For information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html"
     * >Use Logs and Metrics to Monitor an Inference Pipeline</a>. If you don't
     * specify a value for this parameter for a <code>ContainerDefinition</code>
     * that is part of an inference pipeline, a unique name is automatically
     * assigned based on the position of the <code>ContainerDefinition</code> in
     * the pipeline. If you specify a value for the
     * <code>ContainerHostName</code> for any <code>ContainerDefinition</code>
     * that is part of an inference pipeline, you must specify a value for the
     * <code>ContainerHostName</code> parameter of every
     * <code>ContainerDefinition</code> in that pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param containerHostname <p>
     *            This parameter is ignored for models that contain only a
     *            <code>PrimaryContainer</code>.
     *            </p>
     *            <p>
     *            When a <code>ContainerDefinition</code> is part of an
     *            inference pipeline, the value of the parameter uniquely
     *            identifies the container for the purposes of logging and
     *            metrics. For information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html"
     *            >Use Logs and Metrics to Monitor an Inference Pipeline</a>. If
     *            you don't specify a value for this parameter for a
     *            <code>ContainerDefinition</code> that is part of an inference
     *            pipeline, a unique name is automatically assigned based on the
     *            position of the <code>ContainerDefinition</code> in the
     *            pipeline. If you specify a value for the
     *            <code>ContainerHostName</code> for any
     *            <code>ContainerDefinition</code> that is part of an inference
     *            pipeline, you must specify a value for the
     *            <code>ContainerHostName</code> parameter of every
     *            <code>ContainerDefinition</code> in that pipeline.
     *            </p>
     */
    public void setContainerHostname(String containerHostname) {
        this.containerHostname = containerHostname;
    }

    /**
     * <p>
     * This parameter is ignored for models that contain only a
     * <code>PrimaryContainer</code>.
     * </p>
     * <p>
     * When a <code>ContainerDefinition</code> is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the
     * purposes of logging and metrics. For information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html"
     * >Use Logs and Metrics to Monitor an Inference Pipeline</a>. If you don't
     * specify a value for this parameter for a <code>ContainerDefinition</code>
     * that is part of an inference pipeline, a unique name is automatically
     * assigned based on the position of the <code>ContainerDefinition</code> in
     * the pipeline. If you specify a value for the
     * <code>ContainerHostName</code> for any <code>ContainerDefinition</code>
     * that is part of an inference pipeline, you must specify a value for the
     * <code>ContainerHostName</code> parameter of every
     * <code>ContainerDefinition</code> in that pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param containerHostname <p>
     *            This parameter is ignored for models that contain only a
     *            <code>PrimaryContainer</code>.
     *            </p>
     *            <p>
     *            When a <code>ContainerDefinition</code> is part of an
     *            inference pipeline, the value of the parameter uniquely
     *            identifies the container for the purposes of logging and
     *            metrics. For information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html"
     *            >Use Logs and Metrics to Monitor an Inference Pipeline</a>. If
     *            you don't specify a value for this parameter for a
     *            <code>ContainerDefinition</code> that is part of an inference
     *            pipeline, a unique name is automatically assigned based on the
     *            position of the <code>ContainerDefinition</code> in the
     *            pipeline. If you specify a value for the
     *            <code>ContainerHostName</code> for any
     *            <code>ContainerDefinition</code> that is part of an inference
     *            pipeline, you must specify a value for the
     *            <code>ContainerHostName</code> parameter of every
     *            <code>ContainerDefinition</code> in that pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerDefinition withContainerHostname(String containerHostname) {
        this.containerHostname = containerHostname;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored. If you are using your own custom algorithm instead of an
     * algorithm provided by Amazon SageMaker, the inference code must meet
     * Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The Amazon EC2 Container Registry (Amazon ECR) path where
     *         inference code is stored. If you are using your own custom
     *         algorithm instead of an algorithm provided by Amazon SageMaker,
     *         the inference code must meet Amazon SageMaker requirements.
     *         Amazon SageMaker supports both
     *         <code>registry/repository[:tag]</code> and
     *         <code>registry/repository[@digest]</code> image path formats. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *         >Using Your Own Algorithms with Amazon SageMaker</a>
     *         </p>
     */
    public String getImage() {
        return image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored. If you are using your own custom algorithm instead of an
     * algorithm provided by Amazon SageMaker, the inference code must meet
     * Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param image <p>
     *            The Amazon EC2 Container Registry (Amazon ECR) path where
     *            inference code is stored. If you are using your own custom
     *            algorithm instead of an algorithm provided by Amazon
     *            SageMaker, the inference code must meet Amazon SageMaker
     *            requirements. Amazon SageMaker supports both
     *            <code>registry/repository[:tag]</code> and
     *            <code>registry/repository[@digest]</code> image path formats.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>
     *            </p>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored. If you are using your own custom algorithm instead of an
     * algorithm provided by Amazon SageMaker, the inference code must meet
     * Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param image <p>
     *            The Amazon EC2 Container Registry (Amazon ECR) path where
     *            inference code is stored. If you are using your own custom
     *            algorithm instead of an algorithm provided by Amazon
     *            SageMaker, the inference code must meet Amazon SageMaker
     *            requirements. Amazon SageMaker supports both
     *            <code>registry/repository[:tag]</code> and
     *            <code>registry/repository[@digest]</code> image path formats.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerDefinition withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Whether the container hosts a single model or multiple models.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleModel, MultiModel
     *
     * @return <p>
     *         Whether the container hosts a single model or multiple models.
     *         </p>
     * @see ContainerMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Whether the container hosts a single model or multiple models.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleModel, MultiModel
     *
     * @param mode <p>
     *            Whether the container hosts a single model or multiple models.
     *            </p>
     * @see ContainerMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Whether the container hosts a single model or multiple models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleModel, MultiModel
     *
     * @param mode <p>
     *            Whether the container hosts a single model or multiple models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerMode
     */
    public ContainerDefinition withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Whether the container hosts a single model or multiple models.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleModel, MultiModel
     *
     * @param mode <p>
     *            Whether the container hosts a single model or multiple models.
     *            </p>
     * @see ContainerMode
     */
    public void setMode(ContainerMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Whether the container hosts a single model or multiple models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SingleModel, MultiModel
     *
     * @param mode <p>
     *            Whether the container hosts a single model or multiple models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerMode
     */
    public ContainerDefinition withMode(ContainerMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix). The S3 path is required for Amazon SageMaker built-in
     * algorithms, but not if you use your own algorithms. For more information
     * on built-in algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Common Parameters</a>.
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you
     * provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS
     * STS for that region. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you use a built-in algorithm to create a model, Amazon SageMaker
     * requires that you provide a S3 path to the model artifacts in
     * <code>ModelDataUrl</code>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The S3 path where the model artifacts, which result from model
     *         training, are stored. This path must point to a single gzip
     *         compressed tar archive (.tar.gz suffix). The S3 path is required
     *         for Amazon SageMaker built-in algorithms, but not if you use your
     *         own algorithms. For more information on built-in algorithms, see
     *         <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *         >Common Parameters</a>.
     *         </p>
     *         <p>
     *         If you provide a value for this parameter, Amazon SageMaker uses
     *         AWS Security Token Service to download model artifacts from the
     *         S3 path you provide. AWS STS is activated in your IAM user
     *         account by default. If you previously deactivated AWS STS for a
     *         region, you need to reactivate AWS STS for that region. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *         >Activating and Deactivating AWS STS in an AWS Region</a> in the
     *         <i>AWS Identity and Access Management User Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         If you use a built-in algorithm to create a model, Amazon
     *         SageMaker requires that you provide a S3 path to the model
     *         artifacts in <code>ModelDataUrl</code>.
     *         </p>
     *         </important>
     */
    public String getModelDataUrl() {
        return modelDataUrl;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix). The S3 path is required for Amazon SageMaker built-in
     * algorithms, but not if you use your own algorithms. For more information
     * on built-in algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Common Parameters</a>.
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you
     * provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS
     * STS for that region. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you use a built-in algorithm to create a model, Amazon SageMaker
     * requires that you provide a S3 path to the model artifacts in
     * <code>ModelDataUrl</code>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param modelDataUrl <p>
     *            The S3 path where the model artifacts, which result from model
     *            training, are stored. This path must point to a single gzip
     *            compressed tar archive (.tar.gz suffix). The S3 path is
     *            required for Amazon SageMaker built-in algorithms, but not if
     *            you use your own algorithms. For more information on built-in
     *            algorithms, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *            >Common Parameters</a>.
     *            </p>
     *            <p>
     *            If you provide a value for this parameter, Amazon SageMaker
     *            uses AWS Security Token Service to download model artifacts
     *            from the S3 path you provide. AWS STS is activated in your IAM
     *            user account by default. If you previously deactivated AWS STS
     *            for a region, you need to reactivate AWS STS for that region.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *            >Activating and Deactivating AWS STS in an AWS Region</a> in
     *            the <i>AWS Identity and Access Management User Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            If you use a built-in algorithm to create a model, Amazon
     *            SageMaker requires that you provide a S3 path to the model
     *            artifacts in <code>ModelDataUrl</code>.
     *            </p>
     *            </important>
     */
    public void setModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix). The S3 path is required for Amazon SageMaker built-in
     * algorithms, but not if you use your own algorithms. For more information
     * on built-in algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Common Parameters</a>.
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you
     * provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS
     * STS for that region. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you use a built-in algorithm to create a model, Amazon SageMaker
     * requires that you provide a S3 path to the model artifacts in
     * <code>ModelDataUrl</code>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param modelDataUrl <p>
     *            The S3 path where the model artifacts, which result from model
     *            training, are stored. This path must point to a single gzip
     *            compressed tar archive (.tar.gz suffix). The S3 path is
     *            required for Amazon SageMaker built-in algorithms, but not if
     *            you use your own algorithms. For more information on built-in
     *            algorithms, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *            >Common Parameters</a>.
     *            </p>
     *            <p>
     *            If you provide a value for this parameter, Amazon SageMaker
     *            uses AWS Security Token Service to download model artifacts
     *            from the S3 path you provide. AWS STS is activated in your IAM
     *            user account by default. If you previously deactivated AWS STS
     *            for a region, you need to reactivate AWS STS for that region.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *            >Activating and Deactivating AWS STS in an AWS Region</a> in
     *            the <i>AWS Identity and Access Management User Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            If you use a built-in algorithm to create a model, Amazon
     *            SageMaker requires that you provide a S3 path to the model
     *            artifacts in <code>ModelDataUrl</code>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerDefinition withModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and
     * value in the <code>Environment</code> string to string map can have
     * length of up to 1024. We support up to 16 entries in the map.
     * </p>
     *
     * @return <p>
     *         The environment variables to set in the Docker container. Each
     *         key and value in the <code>Environment</code> string to string
     *         map can have length of up to 1024. We support up to 16 entries in
     *         the map.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and
     * value in the <code>Environment</code> string to string map can have
     * length of up to 1024. We support up to 16 entries in the map.
     * </p>
     *
     * @param environment <p>
     *            The environment variables to set in the Docker container. Each
     *            key and value in the <code>Environment</code> string to string
     *            map can have length of up to 1024. We support up to 16 entries
     *            in the map.
     *            </p>
     */
    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and
     * value in the <code>Environment</code> string to string map can have
     * length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            The environment variables to set in the Docker container. Each
     *            key and value in the <code>Environment</code> string to string
     *            map can have length of up to 1024. We support up to 16 entries
     *            in the map.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerDefinition withEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and
     * value in the <code>Environment</code> string to string map can have
     * length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * <p>
     * The method adds a new key-value pair into Environment parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Environment.
     * @param value The corresponding value of the entry to be added into
     *            Environment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerDefinition addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ContainerDefinition clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the model package to
     *         use to create the model.
     *         </p>
     */
    public String getModelPackageName() {
        return modelPackageName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param modelPackageName <p>
     *            The name or Amazon Resource Name (ARN) of the model package to
     *            use to create the model.
     *            </p>
     */
    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param modelPackageName <p>
     *            The name or Amazon Resource Name (ARN) of the model package to
     *            use to create the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerDefinition withModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
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
        if (getContainerHostname() != null)
            sb.append("ContainerHostname: " + getContainerHostname() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: " + getModelDataUrl() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: " + getModelPackageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerHostname() == null) ? 0 : getContainerHostname().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDefinition == false)
            return false;
        ContainerDefinition other = (ContainerDefinition) obj;

        if (other.getContainerHostname() == null ^ this.getContainerHostname() == null)
            return false;
        if (other.getContainerHostname() != null
                && other.getContainerHostname().equals(this.getContainerHostname()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null
                && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null
                && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        return true;
    }
}
