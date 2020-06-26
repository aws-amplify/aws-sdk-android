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
 * Contains information about a training job.
 * </p>
 */
public class TrainingJob implements Serializable {
    /**
     * <p>
     * The name of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trainingJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     */
    private String trainingJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning
     * job if the training job was launched by a hyperparameter tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     */
    private String tuningJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     */
    private String labelingJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     */
    private String autoMLJobArn;

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing
     * model artifacts.
     * </p>
     */
    private ModelArtifacts modelArtifacts;

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for
     * the failure, see the <code>FailureReason</code> field in the response to
     * a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String trainingJobStatus;

    /**
     * <p>
     * Provides detailed information about the state of the training job. For
     * detailed information about the secondary status of the training job, see
     * <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     */
    private String secondaryStatus;

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm
     * metadata.
     * </p>
     */
    private AlgorithmSpecification algorithmSpecification;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the
     * training job.
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
     * An array of <code>Channel</code> objects that describes each data input
     * channel.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the
     * job are stored. Amazon SageMaker creates subfolders for model artifacts.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that
     * are configured for model training.
     * </p>
     */
    private ResourceConfig resourceConfig;

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job
     * has access to. For more information, see <a
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
     * A timestamp that indicates when the training job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Indicates the time when the training job starts on training instances.
     * You are billed for the time interval between this time and the value of
     * <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be
     * later than this time. The difference is due to the time it takes to
     * download the training data and to the size of the training container.
     * </p>
     */
    private java.util.Date trainingStartTime;

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     */
    private java.util.Date trainingEndTime;

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last
     * modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has
     * transitioned through.
     * </p>
     */
    private java.util.List<SecondaryStatusTransition> secondaryStatusTransitions;

    /**
     * <p>
     * A list of final metric values that are set when the training job
     * completes. Used only if the training job was configured to use metrics.
     * </p>
     */
    private java.util.List<MetricData> finalMetricDataList;

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the
     * value is set to <code>true</code>. If network isolation is enabled, nodes
     * can't communicate beyond the VPC they run in.
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
     * </p>
     */
    private Boolean enableInterContainerTrafficEncryption;

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances
     * to run training jobs instead of on-demand instances. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     * >Managed Spot Training</a>.
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
     * The training time in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer trainingTimeInSeconds;

    /**
     * <p>
     * The billable time in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer billableTimeInSeconds;

    /**
     * <p>
     * Configuration information for the debug hook parameters, collection
     * configuration, and storage paths.
     * </p>
     */
    private DebugHookConfig debugHookConfig;

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     */
    private ExperimentConfig experimentConfig;

    /**
     * <p>
     * Information about the debug rule configuration.
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
     * Information about the evaluation status of the rules for the training
     * job.
     * </p>
     */
    private java.util.List<DebugRuleEvaluationStatus> debugRuleEvaluationStatuses;

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
     * The name of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the training job.
     *         </p>
     */
    public String getTrainingJobName() {
        return trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job.
     *            </p>
     */
    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
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
     *            The name of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the training job.
     *         </p>
     */
    public String getTrainingJobArn() {
        return trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @param trainingJobArn <p>
     *            The Amazon Resource Name (ARN) of the training job.
     *            </p>
     */
    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @param trainingJobArn <p>
     *            The Amazon Resource Name (ARN) of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning
     * job if the training job was launched by a hyperparameter tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the associated hyperparameter
     *         tuning job if the training job was launched by a hyperparameter
     *         tuning job.
     *         </p>
     */
    public String getTuningJobArn() {
        return tuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning
     * job if the training job was launched by a hyperparameter tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @param tuningJobArn <p>
     *            The Amazon Resource Name (ARN) of the associated
     *            hyperparameter tuning job if the training job was launched by
     *            a hyperparameter tuning job.
     *            </p>
     */
    public void setTuningJobArn(String tuningJobArn) {
        this.tuningJobArn = tuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning
     * job if the training job was launched by a hyperparameter tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @param tuningJobArn <p>
     *            The Amazon Resource Name (ARN) of the associated
     *            hyperparameter tuning job if the training job was launched by
     *            a hyperparameter tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withTuningJobArn(String tuningJobArn) {
        this.tuningJobArn = tuningJobArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the labeling job.
     *         </p>
     */
    public String getLabelingJobArn() {
        return labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) of the labeling job.
     *            </p>
     */
    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the job.
     *         </p>
     */
    public String getAutoMLJobArn() {
        return autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @param autoMLJobArn <p>
     *            The Amazon Resource Name (ARN) of the job.
     *            </p>
     */
    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @param autoMLJobArn <p>
     *            The Amazon Resource Name (ARN) of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
        return this;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing
     * model artifacts.
     * </p>
     *
     * @return <p>
     *         Information about the Amazon S3 location that is configured for
     *         storing model artifacts.
     *         </p>
     */
    public ModelArtifacts getModelArtifacts() {
        return modelArtifacts;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing
     * model artifacts.
     * </p>
     *
     * @param modelArtifacts <p>
     *            Information about the Amazon S3 location that is configured
     *            for storing model artifacts.
     *            </p>
     */
    public void setModelArtifacts(ModelArtifacts modelArtifacts) {
        this.modelArtifacts = modelArtifacts;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing
     * model artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelArtifacts <p>
     *            Information about the Amazon S3 location that is configured
     *            for storing model artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withModelArtifacts(ModelArtifacts modelArtifacts) {
        this.modelArtifacts = modelArtifacts;
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for
     * the failure, see the <code>FailureReason</code> field in the response to
     * a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the training job.
     *         </p>
     *         <p>
     *         Training job statuses are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InProgress</code> - The training is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The training job has completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The training job has failed. To see the
     *         reason for the failure, see the <code>FailureReason</code> field
     *         in the response to a <code>DescribeTrainingJobResponse</code>
     *         call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - The training job is stopping.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - The training job has stopped.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more detailed information, see <code>SecondaryStatus</code>.
     *         </p>
     * @see TrainingJobStatus
     */
    public String getTrainingJobStatus() {
        return trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for
     * the failure, see the <code>FailureReason</code> field in the response to
     * a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     *            <p>
     *            Training job statuses are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. To see the
     *            reason for the failure, see the <code>FailureReason</code>
     *            field in the response to a
     *            <code>DescribeTrainingJobResponse</code> call.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - The training job is stopping.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more detailed information, see
     *            <code>SecondaryStatus</code>.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for
     * the failure, see the <code>FailureReason</code> field in the response to
     * a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     *            <p>
     *            Training job statuses are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. To see the
     *            reason for the failure, see the <code>FailureReason</code>
     *            field in the response to a
     *            <code>DescribeTrainingJobResponse</code> call.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - The training job is stopping.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more detailed information, see
     *            <code>SecondaryStatus</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public TrainingJob withTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for
     * the failure, see the <code>FailureReason</code> field in the response to
     * a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     *            <p>
     *            Training job statuses are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. To see the
     *            reason for the failure, see the <code>FailureReason</code>
     *            field in the response to a
     *            <code>DescribeTrainingJobResponse</code> call.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - The training job is stopping.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more detailed information, see
     *            <code>SecondaryStatus</code>.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Training job statuses are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InProgress</code> - The training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. To see the reason for
     * the failure, see the <code>FailureReason</code> field in the response to
     * a <code>DescribeTrainingJobResponse</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - The training job is stopping.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more detailed information, see <code>SecondaryStatus</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     *            <p>
     *            Training job statuses are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. To see the
     *            reason for the failure, see the <code>FailureReason</code>
     *            field in the response to a
     *            <code>DescribeTrainingJobResponse</code> call.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - The training job is stopping.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more detailed information, see
     *            <code>SecondaryStatus</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public TrainingJob withTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For
     * detailed information about the secondary status of the training job, see
     * <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @return <p>
     *         Provides detailed information about the state of the training
     *         job. For detailed information about the secondary status of the
     *         training job, see <code>StatusMessage</code> under
     *         <a>SecondaryStatusTransition</a>.
     *         </p>
     *         <p>
     *         Amazon SageMaker provides primary statuses and secondary statuses
     *         that apply to each of them:
     *         </p>
     *         <dl>
     *         <dt>InProgress</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Starting</code> - Starting the training job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Downloading</code> - An optional stage for algorithms that
     *         support <code>File</code> training input mode. It indicates that
     *         data is being downloaded to the ML storage volumes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Training</code> - Training is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Uploading</code> - Training is complete and the model
     *         artifacts are being uploaded to the S3 location.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Completed</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The training job has completed.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The training job has failed. The reason for
     *         the failure is returned in the <code>FailureReason</code> field
     *         of <code>DescribeTrainingJobResponse</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Stopped</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MaxRuntimeExceeded</code> - The job stopped because it
     *         exceeded the maximum allowed runtime.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - The training job has stopped.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Stopping</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - Stopping the training job.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         </dl>
     *         <important>
     *         <p>
     *         Valid values for <code>SecondaryStatus</code> are subject to
     *         change.
     *         </p>
     *         </important>
     *         <p>
     *         We no longer support the following secondary statuses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LaunchingMLInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PreparingTrainingStack</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DownloadingTrainingImage</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see SecondaryStatus
     */
    public String getSecondaryStatus() {
        return secondaryStatus;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For
     * detailed information about the secondary status of the training job, see
     * <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param secondaryStatus <p>
     *            Provides detailed information about the state of the training
     *            job. For detailed information about the secondary status of
     *            the training job, see <code>StatusMessage</code> under
     *            <a>SecondaryStatusTransition</a>.
     *            </p>
     *            <p>
     *            Amazon SageMaker provides primary statuses and secondary
     *            statuses that apply to each of them:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <important>
     *            <p>
     *            Valid values for <code>SecondaryStatus</code> are subject to
     *            change.
     *            </p>
     *            </important>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SecondaryStatus
     */
    public void setSecondaryStatus(String secondaryStatus) {
        this.secondaryStatus = secondaryStatus;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For
     * detailed information about the secondary status of the training job, see
     * <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param secondaryStatus <p>
     *            Provides detailed information about the state of the training
     *            job. For detailed information about the secondary status of
     *            the training job, see <code>StatusMessage</code> under
     *            <a>SecondaryStatusTransition</a>.
     *            </p>
     *            <p>
     *            Amazon SageMaker provides primary statuses and secondary
     *            statuses that apply to each of them:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <important>
     *            <p>
     *            Valid values for <code>SecondaryStatus</code> are subject to
     *            change.
     *            </p>
     *            </important>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecondaryStatus
     */
    public TrainingJob withSecondaryStatus(String secondaryStatus) {
        this.secondaryStatus = secondaryStatus;
        return this;
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For
     * detailed information about the secondary status of the training job, see
     * <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param secondaryStatus <p>
     *            Provides detailed information about the state of the training
     *            job. For detailed information about the secondary status of
     *            the training job, see <code>StatusMessage</code> under
     *            <a>SecondaryStatusTransition</a>.
     *            </p>
     *            <p>
     *            Amazon SageMaker provides primary statuses and secondary
     *            statuses that apply to each of them:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <important>
     *            <p>
     *            Valid values for <code>SecondaryStatus</code> are subject to
     *            change.
     *            </p>
     *            </important>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SecondaryStatus
     */
    public void setSecondaryStatus(SecondaryStatus secondaryStatus) {
        this.secondaryStatus = secondaryStatus.toString();
    }

    /**
     * <p>
     * Provides detailed information about the state of the training job. For
     * detailed information about the secondary status of the training job, see
     * <code>StatusMessage</code> under <a>SecondaryStatusTransition</a>.
     * </p>
     * <p>
     * Amazon SageMaker provides primary statuses and secondary statuses that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Valid values for <code>SecondaryStatus</code> are subject to change.
     * </p>
     * </important>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param secondaryStatus <p>
     *            Provides detailed information about the state of the training
     *            job. For detailed information about the secondary status of
     *            the training job, see <code>StatusMessage</code> under
     *            <a>SecondaryStatusTransition</a>.
     *            </p>
     *            <p>
     *            Amazon SageMaker provides primary statuses and secondary
     *            statuses that apply to each of them:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <important>
     *            <p>
     *            Valid values for <code>SecondaryStatus</code> are subject to
     *            change.
     *            </p>
     *            </important>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecondaryStatus
     */
    public TrainingJob withSecondaryStatus(SecondaryStatus secondaryStatus) {
        this.secondaryStatus = secondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the training job failed, the reason it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the training job failed, the reason it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the training job failed, the reason it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     *
     * @return <p>
     *         Algorithm-specific parameters.
     *         </p>
     */
    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     *
     * @param hyperParameters <p>
     *            Algorithm-specific parameters.
     *            </p>
     */
    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameters <p>
     *            Algorithm-specific parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
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
    public TrainingJob addHyperParametersEntry(String key, String value) {
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
    public TrainingJob clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm
     * metadata.
     * </p>
     *
     * @return <p>
     *         Information about the algorithm used for training, and algorithm
     *         metadata.
     *         </p>
     */
    public AlgorithmSpecification getAlgorithmSpecification() {
        return algorithmSpecification;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm
     * metadata.
     * </p>
     *
     * @param algorithmSpecification <p>
     *            Information about the algorithm used for training, and
     *            algorithm metadata.
     *            </p>
     */
    public void setAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm
     * metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmSpecification <p>
     *            Information about the algorithm used for training, and
     *            algorithm metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the
     * training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The AWS Identity and Access Management (IAM) role configured for
     *         the training job.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the
     * training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The AWS Identity and Access Management (IAM) role configured
     *            for the training job.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the
     * training job.
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
     *            The AWS Identity and Access Management (IAM) role configured
     *            for the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input
     * channel.
     * </p>
     *
     * @return <p>
     *         An array of <code>Channel</code> objects that describes each data
     *         input channel.
     *         </p>
     */
    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input
     * channel.
     * </p>
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects that describes each
     *            data input channel.
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
     * An array of <code>Channel</code> objects that describes each data input
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects that describes each
     *            data input channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withInputDataConfig(Channel... inputDataConfig) {
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
     * An array of <code>Channel</code> objects that describes each data input
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects that describes each
     *            data input channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the
     * job are stored. Amazon SageMaker creates subfolders for model artifacts.
     * </p>
     *
     * @return <p>
     *         The S3 path where model artifacts that you configured when
     *         creating the job are stored. Amazon SageMaker creates subfolders
     *         for model artifacts.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the
     * job are stored. Amazon SageMaker creates subfolders for model artifacts.
     * </p>
     *
     * @param outputDataConfig <p>
     *            The S3 path where model artifacts that you configured when
     *            creating the job are stored. Amazon SageMaker creates
     *            subfolders for model artifacts.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the
     * job are stored. Amazon SageMaker creates subfolders for model artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            The S3 path where model artifacts that you configured when
     *            creating the job are stored. Amazon SageMaker creates
     *            subfolders for model artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that
     * are configured for model training.
     * </p>
     *
     * @return <p>
     *         Resources, including ML compute instances and ML storage volumes,
     *         that are configured for model training.
     *         </p>
     */
    public ResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that
     * are configured for model training.
     * </p>
     *
     * @param resourceConfig <p>
     *            Resources, including ML compute instances and ML storage
     *            volumes, that are configured for model training.
     *            </p>
     */
    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that
     * are configured for model training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceConfig <p>
     *            Resources, including ML compute instances and ML storage
     *            volumes, that are configured for model training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job
     * has access to. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @return <p>
     *         A <a>VpcConfig</a> object that specifies the VPC that this
     *         training job has access to. For more information, see <a href=
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
     * A <a>VpcConfig</a> object that specifies the VPC that this training job
     * has access to. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that this
     *            training job has access to. For more information, see <a href=
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
     * A <a>VpcConfig</a> object that specifies the VPC that this training job
     * has access to. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            A <a>VpcConfig</a> object that specifies the VPC that this
     *            training job has access to. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *            >Protect Training Jobs by Using an Amazon Virtual Private
     *            Cloud</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withVpcConfig(VpcConfig vpcConfig) {
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
    public TrainingJob withStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the training job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that indicates when the training job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that indicates when the training job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances.
     * You are billed for the time interval between this time and the value of
     * <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be
     * later than this time. The difference is due to the time it takes to
     * download the training data and to the size of the training container.
     * </p>
     *
     * @return <p>
     *         Indicates the time when the training job starts on training
     *         instances. You are billed for the time interval between this time
     *         and the value of <code>TrainingEndTime</code>. The start time in
     *         CloudWatch Logs might be later than this time. The difference is
     *         due to the time it takes to download the training data and to the
     *         size of the training container.
     *         </p>
     */
    public java.util.Date getTrainingStartTime() {
        return trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances.
     * You are billed for the time interval between this time and the value of
     * <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be
     * later than this time. The difference is due to the time it takes to
     * download the training data and to the size of the training container.
     * </p>
     *
     * @param trainingStartTime <p>
     *            Indicates the time when the training job starts on training
     *            instances. You are billed for the time interval between this
     *            time and the value of <code>TrainingEndTime</code>. The start
     *            time in CloudWatch Logs might be later than this time. The
     *            difference is due to the time it takes to download the
     *            training data and to the size of the training container.
     *            </p>
     */
    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances.
     * You are billed for the time interval between this time and the value of
     * <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be
     * later than this time. The difference is due to the time it takes to
     * download the training data and to the size of the training container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingStartTime <p>
     *            Indicates the time when the training job starts on training
     *            instances. You are billed for the time interval between this
     *            time and the value of <code>TrainingEndTime</code>. The start
     *            time in CloudWatch Logs might be later than this time. The
     *            difference is due to the time it takes to download the
     *            training data and to the size of the training container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     *
     * @return <p>
     *         Indicates the time when the training job ends on training
     *         instances. You are billed for the time interval between the value
     *         of <code>TrainingStartTime</code> and this time. For successful
     *         jobs and stopped jobs, this is the time after model artifacts are
     *         uploaded. For failed jobs, this is the time when Amazon SageMaker
     *         detects a job failure.
     *         </p>
     */
    public java.util.Date getTrainingEndTime() {
        return trainingEndTime;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     *
     * @param trainingEndTime <p>
     *            Indicates the time when the training job ends on training
     *            instances. You are billed for the time interval between the
     *            value of <code>TrainingStartTime</code> and this time. For
     *            successful jobs and stopped jobs, this is the time after model
     *            artifacts are uploaded. For failed jobs, this is the time when
     *            Amazon SageMaker detects a job failure.
     *            </p>
     */
    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You
     * are billed for the time interval between the value of
     * <code>TrainingStartTime</code> and this time. For successful jobs and
     * stopped jobs, this is the time after model artifacts are uploaded. For
     * failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingEndTime <p>
     *            Indicates the time when the training job ends on training
     *            instances. You are billed for the time interval between the
     *            value of <code>TrainingStartTime</code> and this time. For
     *            successful jobs and stopped jobs, this is the time after model
     *            artifacts are uploaded. For failed jobs, this is the time when
     *            Amazon SageMaker detects a job failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last
     * modified.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the status of the training job
     *         was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last
     * modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            A timestamp that indicates when the status of the training job
     *            was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            A timestamp that indicates when the status of the training job
     *            was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has
     * transitioned through.
     * </p>
     *
     * @return <p>
     *         A history of all of the secondary statuses that the training job
     *         has transitioned through.
     *         </p>
     */
    public java.util.List<SecondaryStatusTransition> getSecondaryStatusTransitions() {
        return secondaryStatusTransitions;
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has
     * transitioned through.
     * </p>
     *
     * @param secondaryStatusTransitions <p>
     *            A history of all of the secondary statuses that the training
     *            job has transitioned through.
     *            </p>
     */
    public void setSecondaryStatusTransitions(
            java.util.Collection<SecondaryStatusTransition> secondaryStatusTransitions) {
        if (secondaryStatusTransitions == null) {
            this.secondaryStatusTransitions = null;
            return;
        }

        this.secondaryStatusTransitions = new java.util.ArrayList<SecondaryStatusTransition>(
                secondaryStatusTransitions);
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has
     * transitioned through.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryStatusTransitions <p>
     *            A history of all of the secondary statuses that the training
     *            job has transitioned through.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withSecondaryStatusTransitions(
            SecondaryStatusTransition... secondaryStatusTransitions) {
        if (getSecondaryStatusTransitions() == null) {
            this.secondaryStatusTransitions = new java.util.ArrayList<SecondaryStatusTransition>(
                    secondaryStatusTransitions.length);
        }
        for (SecondaryStatusTransition value : secondaryStatusTransitions) {
            this.secondaryStatusTransitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A history of all of the secondary statuses that the training job has
     * transitioned through.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryStatusTransitions <p>
     *            A history of all of the secondary statuses that the training
     *            job has transitioned through.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withSecondaryStatusTransitions(
            java.util.Collection<SecondaryStatusTransition> secondaryStatusTransitions) {
        setSecondaryStatusTransitions(secondaryStatusTransitions);
        return this;
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job
     * completes. Used only if the training job was configured to use metrics.
     * </p>
     *
     * @return <p>
     *         A list of final metric values that are set when the training job
     *         completes. Used only if the training job was configured to use
     *         metrics.
     *         </p>
     */
    public java.util.List<MetricData> getFinalMetricDataList() {
        return finalMetricDataList;
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job
     * completes. Used only if the training job was configured to use metrics.
     * </p>
     *
     * @param finalMetricDataList <p>
     *            A list of final metric values that are set when the training
     *            job completes. Used only if the training job was configured to
     *            use metrics.
     *            </p>
     */
    public void setFinalMetricDataList(java.util.Collection<MetricData> finalMetricDataList) {
        if (finalMetricDataList == null) {
            this.finalMetricDataList = null;
            return;
        }

        this.finalMetricDataList = new java.util.ArrayList<MetricData>(finalMetricDataList);
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job
     * completes. Used only if the training job was configured to use metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalMetricDataList <p>
     *            A list of final metric values that are set when the training
     *            job completes. Used only if the training job was configured to
     *            use metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withFinalMetricDataList(MetricData... finalMetricDataList) {
        if (getFinalMetricDataList() == null) {
            this.finalMetricDataList = new java.util.ArrayList<MetricData>(
                    finalMetricDataList.length);
        }
        for (MetricData value : finalMetricDataList) {
            this.finalMetricDataList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of final metric values that are set when the training job
     * completes. Used only if the training job was configured to use metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalMetricDataList <p>
     *            A list of final metric values that are set when the training
     *            job completes. Used only if the training job was configured to
     *            use metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withFinalMetricDataList(java.util.Collection<MetricData> finalMetricDataList) {
        setFinalMetricDataList(finalMetricDataList);
        return this;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the
     * value is set to <code>true</code>. If network isolation is enabled, nodes
     * can't communicate beyond the VPC they run in.
     * </p>
     *
     * @return <p>
     *         If the <code>TrainingJob</code> was created with network
     *         isolation, the value is set to <code>true</code>. If network
     *         isolation is enabled, nodes can't communicate beyond the VPC they
     *         run in.
     *         </p>
     */
    public Boolean isEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the
     * value is set to <code>true</code>. If network isolation is enabled, nodes
     * can't communicate beyond the VPC they run in.
     * </p>
     *
     * @return <p>
     *         If the <code>TrainingJob</code> was created with network
     *         isolation, the value is set to <code>true</code>. If network
     *         isolation is enabled, nodes can't communicate beyond the VPC they
     *         run in.
     *         </p>
     */
    public Boolean getEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the
     * value is set to <code>true</code>. If network isolation is enabled, nodes
     * can't communicate beyond the VPC they run in.
     * </p>
     *
     * @param enableNetworkIsolation <p>
     *            If the <code>TrainingJob</code> was created with network
     *            isolation, the value is set to <code>true</code>. If network
     *            isolation is enabled, nodes can't communicate beyond the VPC
     *            they run in.
     *            </p>
     */
    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * If the <code>TrainingJob</code> was created with network isolation, the
     * value is set to <code>true</code>. If network isolation is enabled, nodes
     * can't communicate beyond the VPC they run in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNetworkIsolation <p>
     *            If the <code>TrainingJob</code> was created with network
     *            isolation, the value is set to <code>true</code>. If network
     *            isolation is enabled, nodes can't communicate beyond the VPC
     *            they run in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
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
     * </p>
     *
     * @return <p>
     *         To encrypt all communications between ML compute instances in
     *         distributed training, choose <code>True</code>. Encryption
     *         provides greater security for distributed training, but training
     *         might take longer. How long it takes depends on the amount of
     *         communication between compute instances, especially if you use a
     *         deep learning algorithm in distributed training.
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
     * </p>
     *
     * @return <p>
     *         To encrypt all communications between ML compute instances in
     *         distributed training, choose <code>True</code>. Encryption
     *         provides greater security for distributed training, but training
     *         might take longer. How long it takes depends on the amount of
     *         communication between compute instances, especially if you use a
     *         deep learning algorithm in distributed training.
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
     * </p>
     *
     * @param enableInterContainerTrafficEncryption <p>
     *            To encrypt all communications between ML compute instances in
     *            distributed training, choose <code>True</code>. Encryption
     *            provides greater security for distributed training, but
     *            training might take longer. How long it takes depends on the
     *            amount of communication between compute instances, especially
     *            if you use a deep learning algorithm in distributed training.
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
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withEnableInterContainerTrafficEncryption(
            Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        return this;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances
     * to run training jobs instead of on-demand instances. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     * >Managed Spot Training</a>.
     * </p>
     *
     * @return <p>
     *         When true, enables managed spot training using Amazon EC2 Spot
     *         instances to run training jobs instead of on-demand instances.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     *         >Managed Spot Training</a>.
     *         </p>
     */
    public Boolean isEnableManagedSpotTraining() {
        return enableManagedSpotTraining;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances
     * to run training jobs instead of on-demand instances. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     * >Managed Spot Training</a>.
     * </p>
     *
     * @return <p>
     *         When true, enables managed spot training using Amazon EC2 Spot
     *         instances to run training jobs instead of on-demand instances.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     *         >Managed Spot Training</a>.
     *         </p>
     */
    public Boolean getEnableManagedSpotTraining() {
        return enableManagedSpotTraining;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances
     * to run training jobs instead of on-demand instances. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     * >Managed Spot Training</a>.
     * </p>
     *
     * @param enableManagedSpotTraining <p>
     *            When true, enables managed spot training using Amazon EC2 Spot
     *            instances to run training jobs instead of on-demand instances.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     *            >Managed Spot Training</a>.
     *            </p>
     */
    public void setEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        this.enableManagedSpotTraining = enableManagedSpotTraining;
    }

    /**
     * <p>
     * When true, enables managed spot training using Amazon EC2 Spot instances
     * to run training jobs instead of on-demand instances. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     * >Managed Spot Training</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableManagedSpotTraining <p>
     *            When true, enables managed spot training using Amazon EC2 Spot
     *            instances to run training jobs instead of on-demand instances.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     *            >Managed Spot Training</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
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
    public TrainingJob withCheckpointConfig(CheckpointConfig checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
        return this;
    }

    /**
     * <p>
     * The training time in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The training time in seconds.
     *         </p>
     */
    public Integer getTrainingTimeInSeconds() {
        return trainingTimeInSeconds;
    }

    /**
     * <p>
     * The training time in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param trainingTimeInSeconds <p>
     *            The training time in seconds.
     *            </p>
     */
    public void setTrainingTimeInSeconds(Integer trainingTimeInSeconds) {
        this.trainingTimeInSeconds = trainingTimeInSeconds;
    }

    /**
     * <p>
     * The training time in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param trainingTimeInSeconds <p>
     *            The training time in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withTrainingTimeInSeconds(Integer trainingTimeInSeconds) {
        this.trainingTimeInSeconds = trainingTimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The billable time in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The billable time in seconds.
     *         </p>
     */
    public Integer getBillableTimeInSeconds() {
        return billableTimeInSeconds;
    }

    /**
     * <p>
     * The billable time in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param billableTimeInSeconds <p>
     *            The billable time in seconds.
     *            </p>
     */
    public void setBillableTimeInSeconds(Integer billableTimeInSeconds) {
        this.billableTimeInSeconds = billableTimeInSeconds;
    }

    /**
     * <p>
     * The billable time in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param billableTimeInSeconds <p>
     *            The billable time in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withBillableTimeInSeconds(Integer billableTimeInSeconds) {
        this.billableTimeInSeconds = billableTimeInSeconds;
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
    public TrainingJob withDebugHookConfig(DebugHookConfig debugHookConfig) {
        this.debugHookConfig = debugHookConfig;
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
    public TrainingJob withExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
        return this;
    }

    /**
     * <p>
     * Information about the debug rule configuration.
     * </p>
     *
     * @return <p>
     *         Information about the debug rule configuration.
     *         </p>
     */
    public java.util.List<DebugRuleConfiguration> getDebugRuleConfigurations() {
        return debugRuleConfigurations;
    }

    /**
     * <p>
     * Information about the debug rule configuration.
     * </p>
     *
     * @param debugRuleConfigurations <p>
     *            Information about the debug rule configuration.
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
     * Information about the debug rule configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugRuleConfigurations <p>
     *            Information about the debug rule configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withDebugRuleConfigurations(
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
     * Information about the debug rule configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugRuleConfigurations <p>
     *            Information about the debug rule configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withDebugRuleConfigurations(
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
    public TrainingJob withTensorBoardOutputConfig(TensorBoardOutputConfig tensorBoardOutputConfig) {
        this.tensorBoardOutputConfig = tensorBoardOutputConfig;
        return this;
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training
     * job.
     * </p>
     *
     * @return <p>
     *         Information about the evaluation status of the rules for the
     *         training job.
     *         </p>
     */
    public java.util.List<DebugRuleEvaluationStatus> getDebugRuleEvaluationStatuses() {
        return debugRuleEvaluationStatuses;
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training
     * job.
     * </p>
     *
     * @param debugRuleEvaluationStatuses <p>
     *            Information about the evaluation status of the rules for the
     *            training job.
     *            </p>
     */
    public void setDebugRuleEvaluationStatuses(
            java.util.Collection<DebugRuleEvaluationStatus> debugRuleEvaluationStatuses) {
        if (debugRuleEvaluationStatuses == null) {
            this.debugRuleEvaluationStatuses = null;
            return;
        }

        this.debugRuleEvaluationStatuses = new java.util.ArrayList<DebugRuleEvaluationStatus>(
                debugRuleEvaluationStatuses);
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugRuleEvaluationStatuses <p>
     *            Information about the evaluation status of the rules for the
     *            training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withDebugRuleEvaluationStatuses(
            DebugRuleEvaluationStatus... debugRuleEvaluationStatuses) {
        if (getDebugRuleEvaluationStatuses() == null) {
            this.debugRuleEvaluationStatuses = new java.util.ArrayList<DebugRuleEvaluationStatus>(
                    debugRuleEvaluationStatuses.length);
        }
        for (DebugRuleEvaluationStatus value : debugRuleEvaluationStatuses) {
            this.debugRuleEvaluationStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the evaluation status of the rules for the training
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugRuleEvaluationStatuses <p>
     *            Information about the evaluation status of the rules for the
     *            training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJob withDebugRuleEvaluationStatuses(
            java.util.Collection<DebugRuleEvaluationStatus> debugRuleEvaluationStatuses) {
        setDebugRuleEvaluationStatuses(debugRuleEvaluationStatuses);
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
    public TrainingJob withTags(Tag... tags) {
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
    public TrainingJob withTags(java.util.Collection<Tag> tags) {
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
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: " + getTrainingJobName() + ",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: " + getTrainingJobArn() + ",");
        if (getTuningJobArn() != null)
            sb.append("TuningJobArn: " + getTuningJobArn() + ",");
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: " + getLabelingJobArn() + ",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: " + getAutoMLJobArn() + ",");
        if (getModelArtifacts() != null)
            sb.append("ModelArtifacts: " + getModelArtifacts() + ",");
        if (getTrainingJobStatus() != null)
            sb.append("TrainingJobStatus: " + getTrainingJobStatus() + ",");
        if (getSecondaryStatus() != null)
            sb.append("SecondaryStatus: " + getSecondaryStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
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
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: " + getTrainingStartTime() + ",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: " + getTrainingEndTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getSecondaryStatusTransitions() != null)
            sb.append("SecondaryStatusTransitions: " + getSecondaryStatusTransitions() + ",");
        if (getFinalMetricDataList() != null)
            sb.append("FinalMetricDataList: " + getFinalMetricDataList() + ",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: " + getEnableNetworkIsolation() + ",");
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: "
                    + getEnableInterContainerTrafficEncryption() + ",");
        if (getEnableManagedSpotTraining() != null)
            sb.append("EnableManagedSpotTraining: " + getEnableManagedSpotTraining() + ",");
        if (getCheckpointConfig() != null)
            sb.append("CheckpointConfig: " + getCheckpointConfig() + ",");
        if (getTrainingTimeInSeconds() != null)
            sb.append("TrainingTimeInSeconds: " + getTrainingTimeInSeconds() + ",");
        if (getBillableTimeInSeconds() != null)
            sb.append("BillableTimeInSeconds: " + getBillableTimeInSeconds() + ",");
        if (getDebugHookConfig() != null)
            sb.append("DebugHookConfig: " + getDebugHookConfig() + ",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: " + getExperimentConfig() + ",");
        if (getDebugRuleConfigurations() != null)
            sb.append("DebugRuleConfigurations: " + getDebugRuleConfigurations() + ",");
        if (getTensorBoardOutputConfig() != null)
            sb.append("TensorBoardOutputConfig: " + getTensorBoardOutputConfig() + ",");
        if (getDebugRuleEvaluationStatuses() != null)
            sb.append("DebugRuleEvaluationStatuses: " + getDebugRuleEvaluationStatuses() + ",");
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
                + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getTuningJobArn() == null) ? 0 : getTuningJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getModelArtifacts() == null) ? 0 : getModelArtifacts().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobStatus() == null) ? 0 : getTrainingJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSecondaryStatus() == null) ? 0 : getSecondaryStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
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
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryStatusTransitions() == null) ? 0 : getSecondaryStatusTransitions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFinalMetricDataList() == null) ? 0 : getFinalMetricDataList().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getTrainingTimeInSeconds() == null) ? 0 : getTrainingTimeInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getBillableTimeInSeconds() == null) ? 0 : getBillableTimeInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getDebugHookConfig() == null) ? 0 : getDebugHookConfig().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getDebugRuleConfigurations() == null) ? 0 : getDebugRuleConfigurations()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTensorBoardOutputConfig() == null) ? 0 : getTensorBoardOutputConfig()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDebugRuleEvaluationStatuses() == null) ? 0
                        : getDebugRuleEvaluationStatuses().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingJob == false)
            return false;
        TrainingJob other = (TrainingJob) obj;

        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null
                && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null
                && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        if (other.getTuningJobArn() == null ^ this.getTuningJobArn() == null)
            return false;
        if (other.getTuningJobArn() != null
                && other.getTuningJobArn().equals(this.getTuningJobArn()) == false)
            return false;
        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null
                && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null
                && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getModelArtifacts() == null ^ this.getModelArtifacts() == null)
            return false;
        if (other.getModelArtifacts() != null
                && other.getModelArtifacts().equals(this.getModelArtifacts()) == false)
            return false;
        if (other.getTrainingJobStatus() == null ^ this.getTrainingJobStatus() == null)
            return false;
        if (other.getTrainingJobStatus() != null
                && other.getTrainingJobStatus().equals(this.getTrainingJobStatus()) == false)
            return false;
        if (other.getSecondaryStatus() == null ^ this.getSecondaryStatus() == null)
            return false;
        if (other.getSecondaryStatus() != null
                && other.getSecondaryStatus().equals(this.getSecondaryStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null
                && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null
                && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getSecondaryStatusTransitions() == null
                ^ this.getSecondaryStatusTransitions() == null)
            return false;
        if (other.getSecondaryStatusTransitions() != null
                && other.getSecondaryStatusTransitions().equals(
                        this.getSecondaryStatusTransitions()) == false)
            return false;
        if (other.getFinalMetricDataList() == null ^ this.getFinalMetricDataList() == null)
            return false;
        if (other.getFinalMetricDataList() != null
                && other.getFinalMetricDataList().equals(this.getFinalMetricDataList()) == false)
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
        if (other.getTrainingTimeInSeconds() == null ^ this.getTrainingTimeInSeconds() == null)
            return false;
        if (other.getTrainingTimeInSeconds() != null
                && other.getTrainingTimeInSeconds().equals(this.getTrainingTimeInSeconds()) == false)
            return false;
        if (other.getBillableTimeInSeconds() == null ^ this.getBillableTimeInSeconds() == null)
            return false;
        if (other.getBillableTimeInSeconds() != null
                && other.getBillableTimeInSeconds().equals(this.getBillableTimeInSeconds()) == false)
            return false;
        if (other.getDebugHookConfig() == null ^ this.getDebugHookConfig() == null)
            return false;
        if (other.getDebugHookConfig() != null
                && other.getDebugHookConfig().equals(this.getDebugHookConfig()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null
                && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
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
        if (other.getDebugRuleEvaluationStatuses() == null
                ^ this.getDebugRuleEvaluationStatuses() == null)
            return false;
        if (other.getDebugRuleEvaluationStatuses() != null
                && other.getDebugRuleEvaluationStatuses().equals(
                        this.getDebugRuleEvaluationStatuses()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
