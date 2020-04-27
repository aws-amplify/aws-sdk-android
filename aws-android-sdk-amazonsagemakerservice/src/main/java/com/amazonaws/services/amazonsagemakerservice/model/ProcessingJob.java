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
 * An Amazon SageMaker processing job that is used to analyze data and evaluate
 * models. For more information, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/processing-job.html"
 * >Process Data and Evaluate Models</a>.
 * </p>
 */
public class ProcessingJob implements Serializable {
    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container
     * before the processing job begins running if "S3InputMode" is set to
     * <code>File</code>.
     * </p>
     */
    private java.util.List<ProcessingInput> processingInputs;

    /**
     * <p>
     * The output configuration for the processing job.
     * </p>
     */
    private ProcessingOutputConfig processingOutputConfig;

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String processingJobName;

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a processing job. In distributed training, you specify more
     * than one instance.
     * </p>
     */
    private ProcessingResources processingResources;

    /**
     * <p>
     * Specifies a time limit for how long the processing job is allowed to run.
     * </p>
     */
    private ProcessingStoppingCondition stoppingCondition;

    /**
     * <p>
     * Configuration to run a processing job in a specified container image.
     * </p>
     */
    private AppSpecification appSpecification;

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * Networking options for a job, such as network traffic encryption between
     * containers, whether to allow inbound and outbound network calls to and
     * from containers, and the VPC subnets and security groups to use for
     * VPC-enabled jobs.
     * </p>
     */
    private NetworkConfig networkConfig;

    /**
     * <p>
     * The ARN of the role used to create the processing job.
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
     * Configuration for the experiment.
     * </p>
     */
    private ExperimentConfig experimentConfig;

    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     */
    private String processingJobArn;

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String processingJobStatus;

    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String exitMessage;

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The time that the processing job ended.
     * </p>
     */
    private java.util.Date processingEndTime;

    /**
     * <p>
     * The time that the processing job started.
     * </p>
     */
    private java.util.Date processingStartTime;

    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The time the processing job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this
     * processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String monitoringScheduleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job associated with this
     * processing job.
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
     * The ARN of the training job associated with this processing job.
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
     * An array of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container
     * before the processing job begins running if "S3InputMode" is set to
     * <code>File</code>.
     * </p>
     *
     * @return <p>
     *         For each input, data is downloaded from S3 into the processing
     *         container before the processing job begins running if
     *         "S3InputMode" is set to <code>File</code>.
     *         </p>
     */
    public java.util.List<ProcessingInput> getProcessingInputs() {
        return processingInputs;
    }

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container
     * before the processing job begins running if "S3InputMode" is set to
     * <code>File</code>.
     * </p>
     *
     * @param processingInputs <p>
     *            For each input, data is downloaded from S3 into the processing
     *            container before the processing job begins running if
     *            "S3InputMode" is set to <code>File</code>.
     *            </p>
     */
    public void setProcessingInputs(java.util.Collection<ProcessingInput> processingInputs) {
        if (processingInputs == null) {
            this.processingInputs = null;
            return;
        }

        this.processingInputs = new java.util.ArrayList<ProcessingInput>(processingInputs);
    }

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container
     * before the processing job begins running if "S3InputMode" is set to
     * <code>File</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingInputs <p>
     *            For each input, data is downloaded from S3 into the processing
     *            container before the processing job begins running if
     *            "S3InputMode" is set to <code>File</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingInputs(ProcessingInput... processingInputs) {
        if (getProcessingInputs() == null) {
            this.processingInputs = new java.util.ArrayList<ProcessingInput>(
                    processingInputs.length);
        }
        for (ProcessingInput value : processingInputs) {
            this.processingInputs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container
     * before the processing job begins running if "S3InputMode" is set to
     * <code>File</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingInputs <p>
     *            For each input, data is downloaded from S3 into the processing
     *            container before the processing job begins running if
     *            "S3InputMode" is set to <code>File</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingInputs(java.util.Collection<ProcessingInput> processingInputs) {
        setProcessingInputs(processingInputs);
        return this;
    }

    /**
     * <p>
     * The output configuration for the processing job.
     * </p>
     *
     * @return <p>
     *         The output configuration for the processing job.
     *         </p>
     */
    public ProcessingOutputConfig getProcessingOutputConfig() {
        return processingOutputConfig;
    }

    /**
     * <p>
     * The output configuration for the processing job.
     * </p>
     *
     * @param processingOutputConfig <p>
     *            The output configuration for the processing job.
     *            </p>
     */
    public void setProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        this.processingOutputConfig = processingOutputConfig;
    }

    /**
     * <p>
     * The output configuration for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingOutputConfig <p>
     *            The output configuration for the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        this.processingOutputConfig = processingOutputConfig;
        return this;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the processing job.
     *         </p>
     */
    public String getProcessingJobName() {
        return processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param processingJobName <p>
     *            The name of the processing job.
     *            </p>
     */
    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param processingJobName <p>
     *            The name of the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
        return this;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a processing job. In distributed training, you specify more
     * than one instance.
     * </p>
     *
     * @return <p>
     *         Identifies the resources, ML compute instances, and ML storage
     *         volumes to deploy for a processing job. In distributed training,
     *         you specify more than one instance.
     *         </p>
     */
    public ProcessingResources getProcessingResources() {
        return processingResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a processing job. In distributed training, you specify more
     * than one instance.
     * </p>
     *
     * @param processingResources <p>
     *            Identifies the resources, ML compute instances, and ML storage
     *            volumes to deploy for a processing job. In distributed
     *            training, you specify more than one instance.
     *            </p>
     */
    public void setProcessingResources(ProcessingResources processingResources) {
        this.processingResources = processingResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to
     * deploy for a processing job. In distributed training, you specify more
     * than one instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingResources <p>
     *            Identifies the resources, ML compute instances, and ML storage
     *            volumes to deploy for a processing job. In distributed
     *            training, you specify more than one instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingResources(ProcessingResources processingResources) {
        this.processingResources = processingResources;
        return this;
    }

    /**
     * <p>
     * Specifies a time limit for how long the processing job is allowed to run.
     * </p>
     *
     * @return <p>
     *         Specifies a time limit for how long the processing job is allowed
     *         to run.
     *         </p>
     */
    public ProcessingStoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * Specifies a time limit for how long the processing job is allowed to run.
     * </p>
     *
     * @param stoppingCondition <p>
     *            Specifies a time limit for how long the processing job is
     *            allowed to run.
     *            </p>
     */
    public void setStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a time limit for how long the processing job is allowed to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            Specifies a time limit for how long the processing job is
     *            allowed to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
        return this;
    }

    /**
     * <p>
     * Configuration to run a processing job in a specified container image.
     * </p>
     *
     * @return <p>
     *         Configuration to run a processing job in a specified container
     *         image.
     *         </p>
     */
    public AppSpecification getAppSpecification() {
        return appSpecification;
    }

    /**
     * <p>
     * Configuration to run a processing job in a specified container image.
     * </p>
     *
     * @param appSpecification <p>
     *            Configuration to run a processing job in a specified container
     *            image.
     *            </p>
     */
    public void setAppSpecification(AppSpecification appSpecification) {
        this.appSpecification = appSpecification;
    }

    /**
     * <p>
     * Configuration to run a processing job in a specified container image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appSpecification <p>
     *            Configuration to run a processing job in a specified container
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withAppSpecification(AppSpecification appSpecification) {
        this.appSpecification = appSpecification;
        return this;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     *
     * @return <p>
     *         Sets the environment variables in the Docker container.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     *
     * @param environment <p>
     *            Sets the environment variables in the Docker container.
     *            </p>
     */
    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            Sets the environment variables in the Docker container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
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
    public ProcessingJob addEnvironmentEntry(String key, String value) {
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
    public ProcessingJob clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Networking options for a job, such as network traffic encryption between
     * containers, whether to allow inbound and outbound network calls to and
     * from containers, and the VPC subnets and security groups to use for
     * VPC-enabled jobs.
     * </p>
     *
     * @return <p>
     *         Networking options for a job, such as network traffic encryption
     *         between containers, whether to allow inbound and outbound network
     *         calls to and from containers, and the VPC subnets and security
     *         groups to use for VPC-enabled jobs.
     *         </p>
     */
    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    /**
     * <p>
     * Networking options for a job, such as network traffic encryption between
     * containers, whether to allow inbound and outbound network calls to and
     * from containers, and the VPC subnets and security groups to use for
     * VPC-enabled jobs.
     * </p>
     *
     * @param networkConfig <p>
     *            Networking options for a job, such as network traffic
     *            encryption between containers, whether to allow inbound and
     *            outbound network calls to and from containers, and the VPC
     *            subnets and security groups to use for VPC-enabled jobs.
     *            </p>
     */
    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Networking options for a job, such as network traffic encryption between
     * containers, whether to allow inbound and outbound network calls to and
     * from containers, and the VPC subnets and security groups to use for
     * VPC-enabled jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfig <p>
     *            Networking options for a job, such as network traffic
     *            encryption between containers, whether to allow inbound and
     *            outbound network calls to and from containers, and the VPC
     *            subnets and security groups to use for VPC-enabled jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    /**
     * <p>
     * The ARN of the role used to create the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The ARN of the role used to create the processing job.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role used to create the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role used to create the processing job.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role used to create the processing job.
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
     *            The ARN of the role used to create the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
    public ProcessingJob withExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
        return this;
    }

    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @return <p>
     *         The ARN of the processing job.
     *         </p>
     */
    public String getProcessingJobArn() {
        return processingJobArn;
    }

    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param processingJobArn <p>
     *            The ARN of the processing job.
     *            </p>
     */
    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param processingJobArn <p>
     *            The ARN of the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the processing job.
     *         </p>
     * @see ProcessingJobStatus
     */
    public String getProcessingJobStatus() {
        return processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @see ProcessingJobStatus
     */
    public void setProcessingJobStatus(String processingJobStatus) {
        this.processingJobStatus = processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingJobStatus
     */
    public ProcessingJob withProcessingJobStatus(String processingJobStatus) {
        this.processingJobStatus = processingJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @see ProcessingJobStatus
     */
    public void setProcessingJobStatus(ProcessingJobStatus processingJobStatus) {
        this.processingJobStatus = processingJobStatus.toString();
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingJobStatus
     */
    public ProcessingJob withProcessingJobStatus(ProcessingJobStatus processingJobStatus) {
        this.processingJobStatus = processingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         A string, up to one KB in size, that contains metadata from the
     *         processing container when the processing job exits.
     *         </p>
     */
    public String getExitMessage() {
        return exitMessage;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param exitMessage <p>
     *            A string, up to one KB in size, that contains metadata from
     *            the processing container when the processing job exits.
     *            </p>
     */
    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param exitMessage <p>
     *            A string, up to one KB in size, that contains metadata from
     *            the processing container when the processing job exits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A string, up to one KB in size, that contains the reason a
     *         processing job failed, if it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            A string, up to one KB in size, that contains the reason a
     *            processing job failed, if it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            A string, up to one KB in size, that contains the reason a
     *            processing job failed, if it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The time that the processing job ended.
     * </p>
     *
     * @return <p>
     *         The time that the processing job ended.
     *         </p>
     */
    public java.util.Date getProcessingEndTime() {
        return processingEndTime;
    }

    /**
     * <p>
     * The time that the processing job ended.
     * </p>
     *
     * @param processingEndTime <p>
     *            The time that the processing job ended.
     *            </p>
     */
    public void setProcessingEndTime(java.util.Date processingEndTime) {
        this.processingEndTime = processingEndTime;
    }

    /**
     * <p>
     * The time that the processing job ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingEndTime <p>
     *            The time that the processing job ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingEndTime(java.util.Date processingEndTime) {
        this.processingEndTime = processingEndTime;
        return this;
    }

    /**
     * <p>
     * The time that the processing job started.
     * </p>
     *
     * @return <p>
     *         The time that the processing job started.
     *         </p>
     */
    public java.util.Date getProcessingStartTime() {
        return processingStartTime;
    }

    /**
     * <p>
     * The time that the processing job started.
     * </p>
     *
     * @param processingStartTime <p>
     *            The time that the processing job started.
     *            </p>
     */
    public void setProcessingStartTime(java.util.Date processingStartTime) {
        this.processingStartTime = processingStartTime;
    }

    /**
     * <p>
     * The time that the processing job started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingStartTime <p>
     *            The time that the processing job started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withProcessingStartTime(java.util.Date processingStartTime) {
        this.processingStartTime = processingStartTime;
        return this;
    }

    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     *
     * @return <p>
     *         The time the processing job was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The time the processing job was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The time the processing job was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The time the processing job was created.
     * </p>
     *
     * @return <p>
     *         The time the processing job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time the processing job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time the processing job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the processing job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time the processing job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this
     * processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The ARN of a monitoring schedule for an endpoint associated with
     *         this processing job.
     *         </p>
     */
    public String getMonitoringScheduleArn() {
        return monitoringScheduleArn;
    }

    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this
     * processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param monitoringScheduleArn <p>
     *            The ARN of a monitoring schedule for an endpoint associated
     *            with this processing job.
     *            </p>
     */
    public void setMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
    }

    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this
     * processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param monitoringScheduleArn <p>
     *            The ARN of a monitoring schedule for an endpoint associated
     *            with this processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job associated with this
     * processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AutoML job associated with
     *         this processing job.
     *         </p>
     */
    public String getAutoMLJobArn() {
        return autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job associated with this
     * processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @param autoMLJobArn <p>
     *            The Amazon Resource Name (ARN) of the AutoML job associated
     *            with this processing job.
     *            </p>
     */
    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job associated with this
     * processing job.
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
     *            The Amazon Resource Name (ARN) of the AutoML job associated
     *            with this processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the training job associated with this processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @return <p>
     *         The ARN of the training job associated with this processing job.
     *         </p>
     */
    public String getTrainingJobArn() {
        return trainingJobArn;
    }

    /**
     * <p>
     * The ARN of the training job associated with this processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @param trainingJobArn <p>
     *            The ARN of the training job associated with this processing
     *            job.
     *            </p>
     */
    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The ARN of the training job associated with this processing job.
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
     *            The ARN of the training job associated with this processing
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
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
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            An array of key-value pairs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
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
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
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
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withTags(Tag... tags) {
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
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
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
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJob withTags(java.util.Collection<Tag> tags) {
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
        if (getProcessingInputs() != null)
            sb.append("ProcessingInputs: " + getProcessingInputs() + ",");
        if (getProcessingOutputConfig() != null)
            sb.append("ProcessingOutputConfig: " + getProcessingOutputConfig() + ",");
        if (getProcessingJobName() != null)
            sb.append("ProcessingJobName: " + getProcessingJobName() + ",");
        if (getProcessingResources() != null)
            sb.append("ProcessingResources: " + getProcessingResources() + ",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: " + getStoppingCondition() + ",");
        if (getAppSpecification() != null)
            sb.append("AppSpecification: " + getAppSpecification() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getNetworkConfig() != null)
            sb.append("NetworkConfig: " + getNetworkConfig() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: " + getExperimentConfig() + ",");
        if (getProcessingJobArn() != null)
            sb.append("ProcessingJobArn: " + getProcessingJobArn() + ",");
        if (getProcessingJobStatus() != null)
            sb.append("ProcessingJobStatus: " + getProcessingJobStatus() + ",");
        if (getExitMessage() != null)
            sb.append("ExitMessage: " + getExitMessage() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getProcessingEndTime() != null)
            sb.append("ProcessingEndTime: " + getProcessingEndTime() + ",");
        if (getProcessingStartTime() != null)
            sb.append("ProcessingStartTime: " + getProcessingStartTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getMonitoringScheduleArn() != null)
            sb.append("MonitoringScheduleArn: " + getMonitoringScheduleArn() + ",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: " + getAutoMLJobArn() + ",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: " + getTrainingJobArn() + ",");
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
                + ((getProcessingInputs() == null) ? 0 : getProcessingInputs().hashCode());
        hashCode = prime
                * hashCode
                + ((getProcessingOutputConfig() == null) ? 0 : getProcessingOutputConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProcessingJobName() == null) ? 0 : getProcessingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingResources() == null) ? 0 : getProcessingResources().hashCode());
        hashCode = prime * hashCode
                + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode
                + ((getAppSpecification() == null) ? 0 : getAppSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingJobArn() == null) ? 0 : getProcessingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingJobStatus() == null) ? 0 : getProcessingJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getExitMessage() == null) ? 0 : getExitMessage().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingEndTime() == null) ? 0 : getProcessingEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingStartTime() == null) ? 0 : getProcessingStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleArn() == null) ? 0 : getMonitoringScheduleArn().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingJob == false)
            return false;
        ProcessingJob other = (ProcessingJob) obj;

        if (other.getProcessingInputs() == null ^ this.getProcessingInputs() == null)
            return false;
        if (other.getProcessingInputs() != null
                && other.getProcessingInputs().equals(this.getProcessingInputs()) == false)
            return false;
        if (other.getProcessingOutputConfig() == null ^ this.getProcessingOutputConfig() == null)
            return false;
        if (other.getProcessingOutputConfig() != null
                && other.getProcessingOutputConfig().equals(this.getProcessingOutputConfig()) == false)
            return false;
        if (other.getProcessingJobName() == null ^ this.getProcessingJobName() == null)
            return false;
        if (other.getProcessingJobName() != null
                && other.getProcessingJobName().equals(this.getProcessingJobName()) == false)
            return false;
        if (other.getProcessingResources() == null ^ this.getProcessingResources() == null)
            return false;
        if (other.getProcessingResources() != null
                && other.getProcessingResources().equals(this.getProcessingResources()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null
                && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getAppSpecification() == null ^ this.getAppSpecification() == null)
            return false;
        if (other.getAppSpecification() != null
                && other.getAppSpecification().equals(this.getAppSpecification()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getNetworkConfig() == null ^ this.getNetworkConfig() == null)
            return false;
        if (other.getNetworkConfig() != null
                && other.getNetworkConfig().equals(this.getNetworkConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null
                && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        if (other.getProcessingJobArn() == null ^ this.getProcessingJobArn() == null)
            return false;
        if (other.getProcessingJobArn() != null
                && other.getProcessingJobArn().equals(this.getProcessingJobArn()) == false)
            return false;
        if (other.getProcessingJobStatus() == null ^ this.getProcessingJobStatus() == null)
            return false;
        if (other.getProcessingJobStatus() != null
                && other.getProcessingJobStatus().equals(this.getProcessingJobStatus()) == false)
            return false;
        if (other.getExitMessage() == null ^ this.getExitMessage() == null)
            return false;
        if (other.getExitMessage() != null
                && other.getExitMessage().equals(this.getExitMessage()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getProcessingEndTime() == null ^ this.getProcessingEndTime() == null)
            return false;
        if (other.getProcessingEndTime() != null
                && other.getProcessingEndTime().equals(this.getProcessingEndTime()) == false)
            return false;
        if (other.getProcessingStartTime() == null ^ this.getProcessingStartTime() == null)
            return false;
        if (other.getProcessingStartTime() != null
                && other.getProcessingStartTime().equals(this.getProcessingStartTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getMonitoringScheduleArn() == null ^ this.getMonitoringScheduleArn() == null)
            return false;
        if (other.getMonitoringScheduleArn() != null
                && other.getMonitoringScheduleArn().equals(this.getMonitoringScheduleArn()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null
                && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null
                && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
