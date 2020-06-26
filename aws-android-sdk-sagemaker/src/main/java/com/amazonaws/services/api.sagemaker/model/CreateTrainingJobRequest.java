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
 * Starts a model training job. After training completes, Amazon SageMaker saves
 * the resulting model artifacts to an Amazon S3 location that you specify.
 * </p>
 * <p>
 * If you choose to host your model using Amazon SageMaker hosting services, you
 * can use the resulting model artifacts as part of the model. You can also use
 * the artifacts in a machine learning service other than Amazon SageMaker,
 * provided that you know how to use them for inferences.
 * </p>
 * <p>
 * In the request body, you provide the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AlgorithmSpecification</code> - Identifies the training algorithm to
 * use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>HyperParameters</code> - Specify these algorithm-specific parameters to
 * enable the estimation of model parameters during training. Hyperparameters
 * can be tuned to optimize this learning process. For a list of hyperparameters
 * for each training algorithm provided by Amazon SageMaker, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
 * >Algorithms</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>InputDataConfig</code> - Describes the training dataset and the Amazon
 * S3, EFS, or FSx location where it is stored.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OutputDataConfig</code> - Identifies the Amazon S3 bucket where you
 * want Amazon SageMaker to save the results of model training.
 * </p>
 * <p/></li>
 * <li>
 * <p>
 * <code>ResourceConfig</code> - Identifies the resources, ML compute instances,
 * and ML storage volumes to deploy for model training. In distributed training,
 * you specify more than one instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>EnableManagedSpotTraining</code> - Optimize the cost of training
 * machine learning models by up to 80% by using Amazon EC2 Spot instances. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
 * >Managed Spot Training</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RoleARN</code> - The Amazon Resource Number (ARN) that Amazon SageMaker
 * assumes to perform tasks on your behalf during model training. You must grant
 * this role the necessary permissions so that Amazon SageMaker can successfully
 * complete model training.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StoppingCondition</code> - To help cap training costs, use
 * <code>MaxRuntimeInSeconds</code> to set a time limit for training. Use
 * <code>MaxWaitTimeInSeconds</code> to specify how long you are willing to wait
 * for a managed spot training job to complete.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about Amazon SageMaker, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
 * It Works</a>.
 * </p>
 */
public class CreateTrainingJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trainingJobName;

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model.
     * You set hyperparameters before you start the learning process. For a list
     * of hyperparameters for each training algorithm provided by Amazon
     * SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is
     * a key-value pair. Each key and value is limited to 256 characters, as
     * specified by the <code>Length Constraint</code>.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;

    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm and algorithm-specific metadata, including the input mode. For
     * more information about algorithms provided by Amazon SageMaker, see <a
     * href
     * ="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms
     * </a>. For information about providing your own algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     */
    private AlgorithmSpecification algorithmSpecification;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read
     * input data from an S3 bucket, download a Docker image that contains
     * training code, write model artifacts to an S3 bucket, write logs to
     * Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You
     * grant permissions for all of these tasks to an IAM role. For more
     * information, see <a href=
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
    private String roleArn;

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input
     * source. <code>InputDataConfig</code> describes the input data and its
     * location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example,
     * an algorithm might have two channels of input data,
     * <code>training_data</code> and <code>validation_data</code>. The
     * configuration for each channel provides the S3, EFS, or FSx location
     * where the input data is stored. It also provides information about the
     * stored data: the MIME type, compression method, and whether the data is
     * wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker
     * either copies input data files from an S3 bucket to a local directory in
     * the Docker container, or makes it available as input streams. For
     * example, if you specify an EFS location, input data files will be made
     * available as input streams. They do not need to be downloaded.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;

    /**
     * <p>
     * Specifies the path to the S3 location where you want to store model
     * artifacts. Amazon SageMaker creates subfolders for the artifacts.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use ML storage volumes for scratch space. If you
     * want Amazon SageMaker to use the ML storage volume to store the training
     * data, choose <code>File</code> as the <code>TrainingInputMode</code> in
     * the algorithm specification. For distributed training algorithms, specify
     * an instance count greater than 1.
     * </p>
     */
    private ResourceConfig resourceConfig;

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your
     * training job to connect to. Control access to and from your training
     * container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the
     * <code>SIGTERM</code> signal, which delays job termination for 120
     * seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     * </p>
     */
    private StoppingCondition stoppingCondition;

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
     * Isolates the training container. No inbound or outbound network calls can
     * be made, except for calls between peers within a training cluster for
     * distributed training. If you enable network isolation for training jobs
     * that are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     */
    private Boolean enableNetworkIsolation;

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed
     * training, choose <code>True</code>. Encryption provides greater security
     * for distributed training, but training might take longer. How long it
     * takes depends on the amount of communication between compute instances,
     * especially if you use a deep learning algorithm in distributed training.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     * >Protect Communications Between ML Compute Instances in a Distributed
     * Training Job</a>.
     * </p>
     */
    private Boolean enableInterContainerTrafficEncryption;

    /**
     * <p>
     * To train models using managed spot training, choose <code>True</code>.
     * Managed spot training provides a fully managed and scalable
     * infrastructure for training machine learning models. this option is
     * useful when training jobs can be interrupted and when there is
     * flexibility when the training job is run.
     * </p>
     * <p>
     * The complete and intermediate results of jobs are stored in an Amazon S3
     * bucket, and can be used as a starting point to train models
     * incrementally. Amazon SageMaker provides metrics and logs in CloudWatch.
     * They can be used to see when managed spot training jobs are running,
     * interrupted, resumed, or completed.
     * </p>
     */
    private Boolean enableManagedSpotTraining;

    /**
     * <p>
     * Contains information about the output location for managed spot training
     * checkpoint data.
     * </p>
     */
    private CheckpointConfig checkpointConfig;

    /**
     * <p>
     * Configuration information for the debug hook parameters, collection
     * configuration, and storage paths.
     * </p>
     */
    private DebugHookConfig debugHookConfig;

    /**
     * <p>
     * Configuration information for debugging rules.
     * </p>
     */
    private java.util.List<DebugRuleConfiguration> debugRuleConfigurations;

    /**
     * <p>
     * Configuration of storage locations for TensorBoard output.
     * </p>
     */
    private TensorBoardOutputConfig tensorBoardOutputConfig;

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     */
    private ExperimentConfig experimentConfig;

    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the training job. The name must be unique within an
     *         AWS Region in an AWS account.
     *         </p>
     */
    public String getTrainingJobName() {
        return trainingJobName;
    }

    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job. The name must be unique within
     *            an AWS Region in an AWS account.
     *            </p>
     */
    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job. The name must be unique within
     *            an AWS Region in an AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model.
     * You set hyperparameters before you start the learning process. For a list
     * of hyperparameters for each training algorithm provided by Amazon
     * SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is
     * a key-value pair. Each key and value is limited to 256 characters, as
     * specified by the <code>Length Constraint</code>.
     * </p>
     *
     * @return <p>
     *         Algorithm-specific parameters that influence the quality of the
     *         model. You set hyperparameters before you start the learning
     *         process. For a list of hyperparameters for each training
     *         algorithm provided by Amazon SageMaker, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *         >Algorithms</a>.
     *         </p>
     *         <p>
     *         You can specify a maximum of 100 hyperparameters. Each
     *         hyperparameter is a key-value pair. Each key and value is limited
     *         to 256 characters, as specified by the
     *         <code>Length Constraint</code>.
     *         </p>
     */
    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model.
     * You set hyperparameters before you start the learning process. For a list
     * of hyperparameters for each training algorithm provided by Amazon
     * SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is
     * a key-value pair. Each key and value is limited to 256 characters, as
     * specified by the <code>Length Constraint</code>.
     * </p>
     *
     * @param hyperParameters <p>
     *            Algorithm-specific parameters that influence the quality of
     *            the model. You set hyperparameters before you start the
     *            learning process. For a list of hyperparameters for each
     *            training algorithm provided by Amazon SageMaker, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>.
     *            </p>
     *            <p>
     *            You can specify a maximum of 100 hyperparameters. Each
     *            hyperparameter is a key-value pair. Each key and value is
     *            limited to 256 characters, as specified by the
     *            <code>Length Constraint</code>.
     *            </p>
     */
    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model.
     * You set hyperparameters before you start the learning process. For a list
     * of hyperparameters for each training algorithm provided by Amazon
     * SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is
     * a key-value pair. Each key and value is limited to 256 characters, as
     * specified by the <code>Length Constraint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameters <p>
     *            Algorithm-specific parameters that influence the quality of
     *            the model. You set hyperparameters before you start the
     *            learning process. For a list of hyperparameters for each
     *            training algorithm provided by Amazon SageMaker, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>.
     *            </p>
     *            <p>
     *            You can specify a maximum of 100 hyperparameters. Each
     *            hyperparameter is a key-value pair. Each key and value is
     *            limited to 256 characters, as specified by the
     *            <code>Length Constraint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withHyperParameters(
            java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters that influence the quality of the model.
     * You set hyperparameters before you start the learning process. For a list
     * of hyperparameters for each training algorithm provided by Amazon
     * SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * You can specify a maximum of 100 hyperparameters. Each hyperparameter is
     * a key-value pair. Each key and value is limited to 256 characters, as
     * specified by the <code>Length Constraint</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into HyperParameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into HyperParameters.
     * @param value The corresponding value of the entry to be added into
     *            HyperParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest addHyperParametersEntry(String key, String value) {
        if (null == this.hyperParameters) {
            this.hyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.hyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.hyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HyperParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTrainingJobRequest clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm and algorithm-specific metadata, including the input mode. For
     * more information about algorithms provided by Amazon SageMaker, see <a
     * href
     * ="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms
     * </a>. For information about providing your own algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     *
     * @return <p>
     *         The registry path of the Docker image that contains the training
     *         algorithm and algorithm-specific metadata, including the input
     *         mode. For more information about algorithms provided by Amazon
     *         SageMaker, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *         >Algorithms</a>. For information about providing your own
     *         algorithms, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *         >Using Your Own Algorithms with Amazon SageMaker</a>.
     *         </p>
     */
    public AlgorithmSpecification getAlgorithmSpecification() {
        return algorithmSpecification;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm and algorithm-specific metadata, including the input mode. For
     * more information about algorithms provided by Amazon SageMaker, see <a
     * href
     * ="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms
     * </a>. For information about providing your own algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     *
     * @param algorithmSpecification <p>
     *            The registry path of the Docker image that contains the
     *            training algorithm and algorithm-specific metadata, including
     *            the input mode. For more information about algorithms provided
     *            by Amazon SageMaker, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>. For information about providing your own
     *            algorithms, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>.
     *            </p>
     */
    public void setAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm and algorithm-specific metadata, including the input mode. For
     * more information about algorithms provided by Amazon SageMaker, see <a
     * href
     * ="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms
     * </a>. For information about providing your own algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmSpecification <p>
     *            The registry path of the Docker image that contains the
     *            training algorithm and algorithm-specific metadata, including
     *            the input mode. For more information about algorithms provided
     *            by Amazon SageMaker, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>. For information about providing your own
     *            algorithms, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withAlgorithmSpecification(
            AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read
     * input data from an S3 bucket, download a Docker image that contains
     * training code, write model artifacts to an S3 bucket, write logs to
     * Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You
     * grant permissions for all of these tasks to an IAM role. For more
     * information, see <a href=
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
     *         The Amazon Resource Name (ARN) of an IAM role that Amazon
     *         SageMaker can assume to perform tasks on your behalf.
     *         </p>
     *         <p>
     *         During model training, Amazon SageMaker needs your permission to
     *         read input data from an S3 bucket, download a Docker image that
     *         contains training code, write model artifacts to an S3 bucket,
     *         write logs to Amazon CloudWatch Logs, and publish metrics to
     *         Amazon CloudWatch. You grant permissions for all of these tasks
     *         to an IAM role. For more information, see <a href=
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
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read
     * input data from an S3 bucket, download a Docker image that contains
     * training code, write model artifacts to an S3 bucket, write logs to
     * Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You
     * grant permissions for all of these tasks to an IAM role. For more
     * information, see <a href=
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
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that Amazon
     *            SageMaker can assume to perform tasks on your behalf.
     *            </p>
     *            <p>
     *            During model training, Amazon SageMaker needs your permission
     *            to read input data from an S3 bucket, download a Docker image
     *            that contains training code, write model artifacts to an S3
     *            bucket, write logs to Amazon CloudWatch Logs, and publish
     *            metrics to Amazon CloudWatch. You grant permissions for all of
     *            these tasks to an IAM role. For more information, see <a href=
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
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
     * <p>
     * During model training, Amazon SageMaker needs your permission to read
     * input data from an S3 bucket, download a Docker image that contains
     * training code, write model artifacts to an S3 bucket, write logs to
     * Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You
     * grant permissions for all of these tasks to an IAM role. For more
     * information, see <a href=
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
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that Amazon
     *            SageMaker can assume to perform tasks on your behalf.
     *            </p>
     *            <p>
     *            During model training, Amazon SageMaker needs your permission
     *            to read input data from an S3 bucket, download a Docker image
     *            that contains training code, write model artifacts to an S3
     *            bucket, write logs to Amazon CloudWatch Logs, and publish
     *            metrics to Amazon CloudWatch. You grant permissions for all of
     *            these tasks to an IAM role. For more information, see <a href=
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
    public CreateTrainingJobRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input
     * source. <code>InputDataConfig</code> describes the input data and its
     * location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example,
     * an algorithm might have two channels of input data,
     * <code>training_data</code> and <code>validation_data</code>. The
     * configuration for each channel provides the S3, EFS, or FSx location
     * where the input data is stored. It also provides information about the
     * stored data: the MIME type, compression method, and whether the data is
     * wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker
     * either copies input data files from an S3 bucket to a local directory in
     * the Docker container, or makes it available as input streams. For
     * example, if you specify an EFS location, input data files will be made
     * available as input streams. They do not need to be downloaded.
     * </p>
     *
     * @return <p>
     *         An array of <code>Channel</code> objects. Each channel is a named
     *         input source. <code>InputDataConfig</code> describes the input
     *         data and its location.
     *         </p>
     *         <p>
     *         Algorithms can accept input data from one or more channels. For
     *         example, an algorithm might have two channels of input data,
     *         <code>training_data</code> and <code>validation_data</code>. The
     *         configuration for each channel provides the S3, EFS, or FSx
     *         location where the input data is stored. It also provides
     *         information about the stored data: the MIME type, compression
     *         method, and whether the data is wrapped in RecordIO format.
     *         </p>
     *         <p>
     *         Depending on the input mode that the algorithm supports, Amazon
     *         SageMaker either copies input data files from an S3 bucket to a
     *         local directory in the Docker container, or makes it available as
     *         input streams. For example, if you specify an EFS location, input
     *         data files will be made available as input streams. They do not
     *         need to be downloaded.
     *         </p>
     */
    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input
     * source. <code>InputDataConfig</code> describes the input data and its
     * location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example,
     * an algorithm might have two channels of input data,
     * <code>training_data</code> and <code>validation_data</code>. The
     * configuration for each channel provides the S3, EFS, or FSx location
     * where the input data is stored. It also provides information about the
     * stored data: the MIME type, compression method, and whether the data is
     * wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker
     * either copies input data files from an S3 bucket to a local directory in
     * the Docker container, or makes it available as input streams. For
     * example, if you specify an EFS location, input data files will be made
     * available as input streams. They do not need to be downloaded.
     * </p>
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects. Each channel is a
     *            named input source. <code>InputDataConfig</code> describes the
     *            input data and its location.
     *            </p>
     *            <p>
     *            Algorithms can accept input data from one or more channels.
     *            For example, an algorithm might have two channels of input
     *            data, <code>training_data</code> and
     *            <code>validation_data</code>. The configuration for each
     *            channel provides the S3, EFS, or FSx location where the input
     *            data is stored. It also provides information about the stored
     *            data: the MIME type, compression method, and whether the data
     *            is wrapped in RecordIO format.
     *            </p>
     *            <p>
     *            Depending on the input mode that the algorithm supports,
     *            Amazon SageMaker either copies input data files from an S3
     *            bucket to a local directory in the Docker container, or makes
     *            it available as input streams. For example, if you specify an
     *            EFS location, input data files will be made available as input
     *            streams. They do not need to be downloaded.
     *            </p>
     */
    public void setInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig);
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input
     * source. <code>InputDataConfig</code> describes the input data and its
     * location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example,
     * an algorithm might have two channels of input data,
     * <code>training_data</code> and <code>validation_data</code>. The
     * configuration for each channel provides the S3, EFS, or FSx location
     * where the input data is stored. It also provides information about the
     * stored data: the MIME type, compression method, and whether the data is
     * wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker
     * either copies input data files from an S3 bucket to a local directory in
     * the Docker container, or makes it available as input streams. For
     * example, if you specify an EFS location, input data files will be made
     * available as input streams. They do not need to be downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects. Each channel is a
     *            named input source. <code>InputDataConfig</code> describes the
     *            input data and its location.
     *            </p>
     *            <p>
     *            Algorithms can accept input data from one or more channels.
     *            For example, an algorithm might have two channels of input
     *            data, <code>training_data</code> and
     *            <code>validation_data</code>. The configuration for each
     *            channel provides the S3, EFS, or FSx location where the input
     *            data is stored. It also provides information about the stored
     *            data: the MIME type, compression method, and whether the data
     *            is wrapped in RecordIO format.
     *            </p>
     *            <p>
     *            Depending on the input mode that the algorithm supports,
     *            Amazon SageMaker either copies input data files from an S3
     *            bucket to a local directory in the Docker container, or makes
     *            it available as input streams. For example, if you specify an
     *            EFS location, input data files will be made available as input
     *            streams. They do not need to be downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withInputDataConfig(Channel... inputDataConfig) {
        if (getInputDataConfig() == null) {
            this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig.length);
        }
        for (Channel value : inputDataConfig) {
            this.inputDataConfig.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects. Each channel is a named input
     * source. <code>InputDataConfig</code> describes the input data and its
     * location.
     * </p>
     * <p>
     * Algorithms can accept input data from one or more channels. For example,
     * an algorithm might have two channels of input data,
     * <code>training_data</code> and <code>validation_data</code>. The
     * configuration for each channel provides the S3, EFS, or FSx location
     * where the input data is stored. It also provides information about the
     * stored data: the MIME type, compression method, and whether the data is
     * wrapped in RecordIO format.
     * </p>
     * <p>
     * Depending on the input mode that the algorithm supports, Amazon SageMaker
     * either copies input data files from an S3 bucket to a local directory in
     * the Docker container, or makes it available as input streams. For
     * example, if you specify an EFS location, input data files will be made
     * available as input streams. They do not need to be downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects. Each channel is a
     *            named input source. <code>InputDataConfig</code> describes the
     *            input data and its location.
     *            </p>
     *            <p>
     *            Algorithms can accept input data from one or more channels.
     *            For example, an algorithm might have two channels of input
     *            data, <code>training_data</code> and
     *            <code>validation_data</code>. The configuration for each
     *            channel provides the S3, EFS, or FSx location where the input
     *            data is stored. It also provides information about the stored
     *            data: the MIME type, compression method, and whether the data
     *            is wrapped in RecordIO format.
     *            </p>
     *            <p>
     *            Depending on the input mode that the algorithm supports,
     *            Amazon SageMaker either copies input data files from an S3
     *            bucket to a local directory in the Docker container, or makes
     *            it available as input streams. For example, if you specify an
     *            EFS location, input data files will be made available as input
     *            streams. They do not need to be downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withInputDataConfig(
            java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the path to the S3 location where you want to store model
     * artifacts. Amazon SageMaker creates subfolders for the artifacts.
     * </p>
     *
     * @return <p>
     *         Specifies the path to the S3 location where you want to store
     *         model artifacts. Amazon SageMaker creates subfolders for the
     *         artifacts.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the S3 location where you want to store model
     * artifacts. Amazon SageMaker creates subfolders for the artifacts.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Specifies the path to the S3 location where you want to store
     *            model artifacts. Amazon SageMaker creates subfolders for the
     *            artifacts.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the S3 location where you want to store model
     * artifacts. Amazon SageMaker creates subfolders for the artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Specifies the path to the S3 location where you want to store
     *            model artifacts. Amazon SageMaker creates subfolders for the
     *            artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use ML storage volumes for scratch space. If you
     * want Amazon SageMaker to use the ML storage volume to store the training
     * data, choose <code>File</code> as the <code>TrainingInputMode</code> in
     * the algorithm specification. For distributed training algorithms, specify
     * an instance count greater than 1.
     * </p>
     *
     * @return <p>
     *         The resources, including the ML compute instances and ML storage
     *         volumes, to use for model training.
     *         </p>
     *         <p>
     *         ML storage volumes store model artifacts and incremental states.
     *         Training algorithms might also use ML storage volumes for scratch
     *         space. If you want Amazon SageMaker to use the ML storage volume
     *         to store the training data, choose <code>File</code> as the
     *         <code>TrainingInputMode</code> in the algorithm specification.
     *         For distributed training algorithms, specify an instance count
     *         greater than 1.
     *         </p>
     */
    public ResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use ML storage volumes for scratch space. If you
     * want Amazon SageMaker to use the ML storage volume to store the training
     * data, choose <code>File</code> as the <code>TrainingInputMode</code> in
     * the algorithm specification. For distributed training algorithms, specify
     * an instance count greater than 1.
     * </p>
     *
     * @param resourceConfig <p>
     *            The resources, including the ML compute instances and ML
     *            storage volumes, to use for model training.
     *            </p>
     *            <p>
     *            ML storage volumes store model artifacts and incremental
     *            states. Training algorithms might also use ML storage volumes
     *            for scratch space. If you want Amazon SageMaker to use the ML
     *            storage volume to store the training data, choose
     *            <code>File</code> as the <code>TrainingInputMode</code> in the
     *            algorithm specification. For distributed training algorithms,
     *            specify an instance count greater than 1.
     *            </p>
     */
    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     * <p>
     * ML storage volumes store model artifacts and incremental states. Training
     * algorithms might also use ML storage volumes for scratch space. If you
     * want Amazon SageMaker to use the ML storage volume to store the training
     * data, choose <code>File</code> as the <code>TrainingInputMode</code> in
     * the algorithm specification. For distributed training algorithms, specify
     * an instance count greater than 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceConfig <p>
     *            The resources, including the ML compute instances and ML
     *            storage volumes, to use for model training.
     *            </p>
     *            <p>
     *            ML storage volumes store model artifacts and incremental
     *            states. Training algorithms might also use ML storage volumes
     *            for scratch space. If you want Amazon SageMaker to use the ML
     *            storage volume to store the training data, choose
     *            <code>File</code> as the <code>TrainingInputMode</code> in the
     *            algorithm specification. For distributed training algorithms,
     *            specify an instance count greater than 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your
     * training job to connect to. Control access to and from your training
     * container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @return <p>
     *         A <a>VpcConfig</a> object that specifies the VPC that you want
     *         your training job to connect to. Control access to and from your
     *         training container by configuring the VPC. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *         >Protect Training Jobs by Using an Amazon Virtual Private
     *         Cloud</a>.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your
     * training job to connect to. Control access to and from your training
     * container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that you want
     *            your training job to connect to. Control access to and from
     *            your training container by configuring the VPC. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *            >Protect Training Jobs by Using an Amazon Virtual Private
     *            Cloud</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that you want your
     * training job to connect to. Control access to and from your training
     * container by configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that you want
     *            your training job to connect to. Control access to and from
     *            your training container by configuring the VPC. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *            >Protect Training Jobs by Using an Amazon Virtual Private
     *            Cloud</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the
     * <code>SIGTERM</code> signal, which delays job termination for 120
     * seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     * </p>
     *
     * @return <p>
     *         Specifies a limit to how long a model training job can run. When
     *         the job reaches the time limit, Amazon SageMaker ends the
     *         training job. Use this API to cap model training costs.
     *         </p>
     *         <p>
     *         To stop a job, Amazon SageMaker sends the algorithm the
     *         <code>SIGTERM</code> signal, which delays job termination for 120
     *         seconds. Algorithms can use this 120-second window to save the
     *         model artifacts, so the results of training are not lost.
     *         </p>
     */
    public StoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the
     * <code>SIGTERM</code> signal, which delays job termination for 120
     * seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     * </p>
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model training job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            training job. Use this API to cap model training costs.
     *            </p>
     *            <p>
     *            To stop a job, Amazon SageMaker sends the algorithm the
     *            <code>SIGTERM</code> signal, which delays job termination for
     *            120 seconds. Algorithms can use this 120-second window to save
     *            the model artifacts, so the results of training are not lost.
     *            </p>
     */
    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the
     * <code>SIGTERM</code> signal, which delays job termination for 120
     * seconds. Algorithms can use this 120-second window to save the model
     * artifacts, so the results of training are not lost.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model training job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            training job. Use this API to cap model training costs.
     *            </p>
     *            <p>
     *            To stop a job, Amazon SageMaker sends the algorithm the
     *            <code>SIGTERM</code> signal, which delays job termination for
     *            120 seconds. Algorithms can use this 120-second window to save
     *            the model artifacts, so the results of training are not lost.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
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
    public CreateTrainingJobRequest withTags(Tag... tags) {
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
    public CreateTrainingJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can
     * be made, except for calls between peers within a training cluster for
     * distributed training. If you enable network isolation for training jobs
     * that are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     *
     * @return <p>
     *         Isolates the training container. No inbound or outbound network
     *         calls can be made, except for calls between peers within a
     *         training cluster for distributed training. If you enable network
     *         isolation for training jobs that are configured to use a VPC,
     *         Amazon SageMaker downloads and uploads customer data and model
     *         artifacts through the specified VPC, but the training container
     *         does not have network access.
     *         </p>
     */
    public Boolean isEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can
     * be made, except for calls between peers within a training cluster for
     * distributed training. If you enable network isolation for training jobs
     * that are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     *
     * @return <p>
     *         Isolates the training container. No inbound or outbound network
     *         calls can be made, except for calls between peers within a
     *         training cluster for distributed training. If you enable network
     *         isolation for training jobs that are configured to use a VPC,
     *         Amazon SageMaker downloads and uploads customer data and model
     *         artifacts through the specified VPC, but the training container
     *         does not have network access.
     *         </p>
     */
    public Boolean getEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can
     * be made, except for calls between peers within a training cluster for
     * distributed training. If you enable network isolation for training jobs
     * that are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     *
     * @param enableNetworkIsolation <p>
     *            Isolates the training container. No inbound or outbound
     *            network calls can be made, except for calls between peers
     *            within a training cluster for distributed training. If you
     *            enable network isolation for training jobs that are configured
     *            to use a VPC, Amazon SageMaker downloads and uploads customer
     *            data and model artifacts through the specified VPC, but the
     *            training container does not have network access.
     *            </p>
     */
    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can
     * be made, except for calls between peers within a training cluster for
     * distributed training. If you enable network isolation for training jobs
     * that are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNetworkIsolation <p>
     *            Isolates the training container. No inbound or outbound
     *            network calls can be made, except for calls between peers
     *            within a training cluster for distributed training. If you
     *            enable network isolation for training jobs that are configured
     *            to use a VPC, Amazon SageMaker downloads and uploads customer
     *            data and model artifacts through the specified VPC, but the
     *            training container does not have network access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
        return this;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed
     * training, choose <code>True</code>. Encryption provides greater security
     * for distributed training, but training might take longer. How long it
     * takes depends on the amount of communication between compute instances,
     * especially if you use a deep learning algorithm in distributed training.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     * >Protect Communications Between ML Compute Instances in a Distributed
     * Training Job</a>.
     * </p>
     *
     * @return <p>
     *         To encrypt all communications between ML compute instances in
     *         distributed training, choose <code>True</code>. Encryption
     *         provides greater security for distributed training, but training
     *         might take longer. How long it takes depends on the amount of
     *         communication between compute instances, especially if you use a
     *         deep learning algorithm in distributed training. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     *         >Protect Communications Between ML Compute Instances in a
     *         Distributed Training Job</a>.
     *         </p>
     */
    public Boolean isEnableInterContainerTrafficEncryption() {
        return enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed
     * training, choose <code>True</code>. Encryption provides greater security
     * for distributed training, but training might take longer. How long it
     * takes depends on the amount of communication between compute instances,
     * especially if you use a deep learning algorithm in distributed training.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     * >Protect Communications Between ML Compute Instances in a Distributed
     * Training Job</a>.
     * </p>
     *
     * @return <p>
     *         To encrypt all communications between ML compute instances in
     *         distributed training, choose <code>True</code>. Encryption
     *         provides greater security for distributed training, but training
     *         might take longer. How long it takes depends on the amount of
     *         communication between compute instances, especially if you use a
     *         deep learning algorithm in distributed training. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     *         >Protect Communications Between ML Compute Instances in a
     *         Distributed Training Job</a>.
     *         </p>
     */
    public Boolean getEnableInterContainerTrafficEncryption() {
        return enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed
     * training, choose <code>True</code>. Encryption provides greater security
     * for distributed training, but training might take longer. How long it
     * takes depends on the amount of communication between compute instances,
     * especially if you use a deep learning algorithm in distributed training.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     * >Protect Communications Between ML Compute Instances in a Distributed
     * Training Job</a>.
     * </p>
     *
     * @param enableInterContainerTrafficEncryption <p>
     *            To encrypt all communications between ML compute instances in
     *            distributed training, choose <code>True</code>. Encryption
     *            provides greater security for distributed training, but
     *            training might take longer. How long it takes depends on the
     *            amount of communication between compute instances, especially
     *            if you use a deep learning algorithm in distributed training.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     *            >Protect Communications Between ML Compute Instances in a
     *            Distributed Training Job</a>.
     *            </p>
     */
    public void setEnableInterContainerTrafficEncryption(
            Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * To encrypt all communications between ML compute instances in distributed
     * training, choose <code>True</code>. Encryption provides greater security
     * for distributed training, but training might take longer. How long it
     * takes depends on the amount of communication between compute instances,
     * especially if you use a deep learning algorithm in distributed training.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     * >Protect Communications Between ML Compute Instances in a Distributed
     * Training Job</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableInterContainerTrafficEncryption <p>
     *            To encrypt all communications between ML compute instances in
     *            distributed training, choose <code>True</code>. Encryption
     *            provides greater security for distributed training, but
     *            training might take longer. How long it takes depends on the
     *            amount of communication between compute instances, especially
     *            if you use a deep learning algorithm in distributed training.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-encrypt.html"
     *            >Protect Communications Between ML Compute Instances in a
     *            Distributed Training Job</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withEnableInterContainerTrafficEncryption(
            Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        return this;
    }

    /**
     * <p>
     * To train models using managed spot training, choose <code>True</code>.
     * Managed spot training provides a fully managed and scalable
     * infrastructure for training machine learning models. this option is
     * useful when training jobs can be interrupted and when there is
     * flexibility when the training job is run.
     * </p>
     * <p>
     * The complete and intermediate results of jobs are stored in an Amazon S3
     * bucket, and can be used as a starting point to train models
     * incrementally. Amazon SageMaker provides metrics and logs in CloudWatch.
     * They can be used to see when managed spot training jobs are running,
     * interrupted, resumed, or completed.
     * </p>
     *
     * @return <p>
     *         To train models using managed spot training, choose
     *         <code>True</code>. Managed spot training provides a fully managed
     *         and scalable infrastructure for training machine learning models.
     *         this option is useful when training jobs can be interrupted and
     *         when there is flexibility when the training job is run.
     *         </p>
     *         <p>
     *         The complete and intermediate results of jobs are stored in an
     *         Amazon S3 bucket, and can be used as a starting point to train
     *         models incrementally. Amazon SageMaker provides metrics and logs
     *         in CloudWatch. They can be used to see when managed spot training
     *         jobs are running, interrupted, resumed, or completed.
     *         </p>
     */
    public Boolean isEnableManagedSpotTraining() {
        return enableManagedSpotTraining;
    }

    /**
     * <p>
     * To train models using managed spot training, choose <code>True</code>.
     * Managed spot training provides a fully managed and scalable
     * infrastructure for training machine learning models. this option is
     * useful when training jobs can be interrupted and when there is
     * flexibility when the training job is run.
     * </p>
     * <p>
     * The complete and intermediate results of jobs are stored in an Amazon S3
     * bucket, and can be used as a starting point to train models
     * incrementally. Amazon SageMaker provides metrics and logs in CloudWatch.
     * They can be used to see when managed spot training jobs are running,
     * interrupted, resumed, or completed.
     * </p>
     *
     * @return <p>
     *         To train models using managed spot training, choose
     *         <code>True</code>. Managed spot training provides a fully managed
     *         and scalable infrastructure for training machine learning models.
     *         this option is useful when training jobs can be interrupted and
     *         when there is flexibility when the training job is run.
     *         </p>
     *         <p>
     *         The complete and intermediate results of jobs are stored in an
     *         Amazon S3 bucket, and can be used as a starting point to train
     *         models incrementally. Amazon SageMaker provides metrics and logs
     *         in CloudWatch. They can be used to see when managed spot training
     *         jobs are running, interrupted, resumed, or completed.
     *         </p>
     */
    public Boolean getEnableManagedSpotTraining() {
        return enableManagedSpotTraining;
    }

    /**
     * <p>
     * To train models using managed spot training, choose <code>True</code>.
     * Managed spot training provides a fully managed and scalable
     * infrastructure for training machine learning models. this option is
     * useful when training jobs can be interrupted and when there is
     * flexibility when the training job is run.
     * </p>
     * <p>
     * The complete and intermediate results of jobs are stored in an Amazon S3
     * bucket, and can be used as a starting point to train models
     * incrementally. Amazon SageMaker provides metrics and logs in CloudWatch.
     * They can be used to see when managed spot training jobs are running,
     * interrupted, resumed, or completed.
     * </p>
     *
     * @param enableManagedSpotTraining <p>
     *            To train models using managed spot training, choose
     *            <code>True</code>. Managed spot training provides a fully
     *            managed and scalable infrastructure for training machine
     *            learning models. this option is useful when training jobs can
     *            be interrupted and when there is flexibility when the training
     *            job is run.
     *            </p>
     *            <p>
     *            The complete and intermediate results of jobs are stored in an
     *            Amazon S3 bucket, and can be used as a starting point to train
     *            models incrementally. Amazon SageMaker provides metrics and
     *            logs in CloudWatch. They can be used to see when managed spot
     *            training jobs are running, interrupted, resumed, or completed.
     *            </p>
     */
    public void setEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        this.enableManagedSpotTraining = enableManagedSpotTraining;
    }

    /**
     * <p>
     * To train models using managed spot training, choose <code>True</code>.
     * Managed spot training provides a fully managed and scalable
     * infrastructure for training machine learning models. this option is
     * useful when training jobs can be interrupted and when there is
     * flexibility when the training job is run.
     * </p>
     * <p>
     * The complete and intermediate results of jobs are stored in an Amazon S3
     * bucket, and can be used as a starting point to train models
     * incrementally. Amazon SageMaker provides metrics and logs in CloudWatch.
     * They can be used to see when managed spot training jobs are running,
     * interrupted, resumed, or completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableManagedSpotTraining <p>
     *            To train models using managed spot training, choose
     *            <code>True</code>. Managed spot training provides a fully
     *            managed and scalable infrastructure for training machine
     *            learning models. this option is useful when training jobs can
     *            be interrupted and when there is flexibility when the training
     *            job is run.
     *            </p>
     *            <p>
     *            The complete and intermediate results of jobs are stored in an
     *            Amazon S3 bucket, and can be used as a starting point to train
     *            models incrementally. Amazon SageMaker provides metrics and
     *            logs in CloudWatch. They can be used to see when managed spot
     *            training jobs are running, interrupted, resumed, or completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        this.enableManagedSpotTraining = enableManagedSpotTraining;
        return this;
    }

    /**
     * <p>
     * Contains information about the output location for managed spot training
     * checkpoint data.
     * </p>
     *
     * @return <p>
     *         Contains information about the output location for managed spot
     *         training checkpoint data.
     *         </p>
     */
    public CheckpointConfig getCheckpointConfig() {
        return checkpointConfig;
    }

    /**
     * <p>
     * Contains information about the output location for managed spot training
     * checkpoint data.
     * </p>
     *
     * @param checkpointConfig <p>
     *            Contains information about the output location for managed
     *            spot training checkpoint data.
     *            </p>
     */
    public void setCheckpointConfig(CheckpointConfig checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
    }

    /**
     * <p>
     * Contains information about the output location for managed spot training
     * checkpoint data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkpointConfig <p>
     *            Contains information about the output location for managed
     *            spot training checkpoint data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withCheckpointConfig(CheckpointConfig checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
        return this;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters, collection
     * configuration, and storage paths.
     * </p>
     *
     * @return <p>
     *         Configuration information for the debug hook parameters,
     *         collection configuration, and storage paths.
     *         </p>
     */
    public DebugHookConfig getDebugHookConfig() {
        return debugHookConfig;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters, collection
     * configuration, and storage paths.
     * </p>
     *
     * @param debugHookConfig <p>
     *            Configuration information for the debug hook parameters,
     *            collection configuration, and storage paths.
     *            </p>
     */
    public void setDebugHookConfig(DebugHookConfig debugHookConfig) {
        this.debugHookConfig = debugHookConfig;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters, collection
     * configuration, and storage paths.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugHookConfig <p>
     *            Configuration information for the debug hook parameters,
     *            collection configuration, and storage paths.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withDebugHookConfig(DebugHookConfig debugHookConfig) {
        this.debugHookConfig = debugHookConfig;
        return this;
    }

    /**
     * <p>
     * Configuration information for debugging rules.
     * </p>
     *
     * @return <p>
     *         Configuration information for debugging rules.
     *         </p>
     */
    public java.util.List<DebugRuleConfiguration> getDebugRuleConfigurations() {
        return debugRuleConfigurations;
    }

    /**
     * <p>
     * Configuration information for debugging rules.
     * </p>
     *
     * @param debugRuleConfigurations <p>
     *            Configuration information for debugging rules.
     *            </p>
     */
    public void setDebugRuleConfigurations(
            java.util.Collection<DebugRuleConfiguration> debugRuleConfigurations) {
        if (debugRuleConfigurations == null) {
            this.debugRuleConfigurations = null;
            return;
        }

        this.debugRuleConfigurations = new java.util.ArrayList<DebugRuleConfiguration>(
                debugRuleConfigurations);
    }

    /**
     * <p>
     * Configuration information for debugging rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugRuleConfigurations <p>
     *            Configuration information for debugging rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withDebugRuleConfigurations(
            DebugRuleConfiguration... debugRuleConfigurations) {
        if (getDebugRuleConfigurations() == null) {
            this.debugRuleConfigurations = new java.util.ArrayList<DebugRuleConfiguration>(
                    debugRuleConfigurations.length);
        }
        for (DebugRuleConfiguration value : debugRuleConfigurations) {
            this.debugRuleConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for debugging rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugRuleConfigurations <p>
     *            Configuration information for debugging rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withDebugRuleConfigurations(
            java.util.Collection<DebugRuleConfiguration> debugRuleConfigurations) {
        setDebugRuleConfigurations(debugRuleConfigurations);
        return this;
    }

    /**
     * <p>
     * Configuration of storage locations for TensorBoard output.
     * </p>
     *
     * @return <p>
     *         Configuration of storage locations for TensorBoard output.
     *         </p>
     */
    public TensorBoardOutputConfig getTensorBoardOutputConfig() {
        return tensorBoardOutputConfig;
    }

    /**
     * <p>
     * Configuration of storage locations for TensorBoard output.
     * </p>
     *
     * @param tensorBoardOutputConfig <p>
     *            Configuration of storage locations for TensorBoard output.
     *            </p>
     */
    public void setTensorBoardOutputConfig(TensorBoardOutputConfig tensorBoardOutputConfig) {
        this.tensorBoardOutputConfig = tensorBoardOutputConfig;
    }

    /**
     * <p>
     * Configuration of storage locations for TensorBoard output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tensorBoardOutputConfig <p>
     *            Configuration of storage locations for TensorBoard output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withTensorBoardOutputConfig(
            TensorBoardOutputConfig tensorBoardOutputConfig) {
        this.tensorBoardOutputConfig = tensorBoardOutputConfig;
        return this;
    }

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     *
     * @return <p>
     *         Configuration for the experiment.
     *         </p>
     */
    public ExperimentConfig getExperimentConfig() {
        return experimentConfig;
    }

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     *
     * @param experimentConfig <p>
     *            Configuration for the experiment.
     *            </p>
     */
    public void setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
    }

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param experimentConfig <p>
     *            Configuration for the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrainingJobRequest withExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
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
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: " + getTrainingJobName() + ",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: " + getHyperParameters() + ",");
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: " + getAlgorithmSpecification() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: " + getResourceConfig() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: " + getStoppingCondition() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: " + getEnableNetworkIsolation() + ",");
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: "
                    + getEnableInterContainerTrafficEncryption() + ",");
        if (getEnableManagedSpotTraining() != null)
            sb.append("EnableManagedSpotTraining: " + getEnableManagedSpotTraining() + ",");
        if (getCheckpointConfig() != null)
            sb.append("CheckpointConfig: " + getCheckpointConfig() + ",");
        if (getDebugHookConfig() != null)
            sb.append("DebugHookConfig: " + getDebugHookConfig() + ",");
        if (getDebugRuleConfigurations() != null)
            sb.append("DebugRuleConfigurations: " + getDebugRuleConfigurations() + ",");
        if (getTensorBoardOutputConfig() != null)
            sb.append("TensorBoardOutputConfig: " + getTensorBoardOutputConfig() + ",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: " + getExperimentConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification()
                        .hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode
                + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableInterContainerTrafficEncryption() == null) ? 0
                        : getEnableInterContainerTrafficEncryption().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableManagedSpotTraining() == null) ? 0 : getEnableManagedSpotTraining()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCheckpointConfig() == null) ? 0 : getCheckpointConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDebugHookConfig() == null) ? 0 : getDebugHookConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getDebugRuleConfigurations() == null) ? 0 : getDebugRuleConfigurations()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTensorBoardOutputConfig() == null) ? 0 : getTensorBoardOutputConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrainingJobRequest == false)
            return false;
        CreateTrainingJobRequest other = (CreateTrainingJobRequest) obj;

        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null
                && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null
                && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getAlgorithmSpecification() == null ^ this.getAlgorithmSpecification() == null)
            return false;
        if (other.getAlgorithmSpecification() != null
                && other.getAlgorithmSpecification().equals(this.getAlgorithmSpecification()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null
                && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null
                && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null
                && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null
                && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() == null
                ^ this.getEnableInterContainerTrafficEncryption() == null)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() != null
                && other.getEnableInterContainerTrafficEncryption().equals(
                        this.getEnableInterContainerTrafficEncryption()) == false)
            return false;
        if (other.getEnableManagedSpotTraining() == null
                ^ this.getEnableManagedSpotTraining() == null)
            return false;
        if (other.getEnableManagedSpotTraining() != null
                && other.getEnableManagedSpotTraining().equals(this.getEnableManagedSpotTraining()) == false)
            return false;
        if (other.getCheckpointConfig() == null ^ this.getCheckpointConfig() == null)
            return false;
        if (other.getCheckpointConfig() != null
                && other.getCheckpointConfig().equals(this.getCheckpointConfig()) == false)
            return false;
        if (other.getDebugHookConfig() == null ^ this.getDebugHookConfig() == null)
            return false;
        if (other.getDebugHookConfig() != null
                && other.getDebugHookConfig().equals(this.getDebugHookConfig()) == false)
            return false;
        if (other.getDebugRuleConfigurations() == null ^ this.getDebugRuleConfigurations() == null)
            return false;
        if (other.getDebugRuleConfigurations() != null
                && other.getDebugRuleConfigurations().equals(this.getDebugRuleConfigurations()) == false)
            return false;
        if (other.getTensorBoardOutputConfig() == null ^ this.getTensorBoardOutputConfig() == null)
            return false;
        if (other.getTensorBoardOutputConfig() != null
                && other.getTensorBoardOutputConfig().equals(this.getTensorBoardOutputConfig()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null
                && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        return true;
    }
}
