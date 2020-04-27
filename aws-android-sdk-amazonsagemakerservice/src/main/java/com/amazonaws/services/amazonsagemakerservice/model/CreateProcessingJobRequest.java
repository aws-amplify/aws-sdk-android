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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a processing job.
 * </p>
 */
public class CreateProcessingJobRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Output configuration for the processing job.
     * </p>
     */
    private ProcessingOutputConfig processingOutputConfig;

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS
     * Region in the AWS account.
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
     * The time limit for how long the processing job is allowed to run.
     * </p>
     */
    private ProcessingStoppingCondition stoppingCondition;

    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
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
     * Networking options for a processing job.
     * </p>
     */
    private NetworkConfig networkConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     */
    private ExperimentConfig experimentConfig;

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
    public CreateProcessingJobRequest withProcessingInputs(ProcessingInput... processingInputs) {
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
    public CreateProcessingJobRequest withProcessingInputs(
            java.util.Collection<ProcessingInput> processingInputs) {
        setProcessingInputs(processingInputs);
        return this;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     *
     * @return <p>
     *         Output configuration for the processing job.
     *         </p>
     */
    public ProcessingOutputConfig getProcessingOutputConfig() {
        return processingOutputConfig;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     *
     * @param processingOutputConfig <p>
     *            Output configuration for the processing job.
     *            </p>
     */
    public void setProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        this.processingOutputConfig = processingOutputConfig;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingOutputConfig <p>
     *            Output configuration for the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withProcessingOutputConfig(
            ProcessingOutputConfig processingOutputConfig) {
        this.processingOutputConfig = processingOutputConfig;
        return this;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS
     * Region in the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the processing job. The name must be unique within an
     *         AWS Region in the AWS account.
     *         </p>
     */
    public String getProcessingJobName() {
        return processingJobName;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS
     * Region in the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param processingJobName <p>
     *            The name of the processing job. The name must be unique within
     *            an AWS Region in the AWS account.
     *            </p>
     */
    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS
     * Region in the AWS account.
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
     *            The name of the processing job. The name must be unique within
     *            an AWS Region in the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withProcessingJobName(String processingJobName) {
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
    public CreateProcessingJobRequest withProcessingResources(
            ProcessingResources processingResources) {
        this.processingResources = processingResources;
        return this;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     *
     * @return <p>
     *         The time limit for how long the processing job is allowed to run.
     *         </p>
     */
    public ProcessingStoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     *
     * @param stoppingCondition <p>
     *            The time limit for how long the processing job is allowed to
     *            run.
     *            </p>
     */
    public void setStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            The time limit for how long the processing job is allowed to
     *            run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withStoppingCondition(
            ProcessingStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
        return this;
    }

    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
     * </p>
     *
     * @return <p>
     *         Configures the processing job to run a specified Docker container
     *         image.
     *         </p>
     */
    public AppSpecification getAppSpecification() {
        return appSpecification;
    }

    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
     * </p>
     *
     * @param appSpecification <p>
     *            Configures the processing job to run a specified Docker
     *            container image.
     *            </p>
     */
    public void setAppSpecification(AppSpecification appSpecification) {
        this.appSpecification = appSpecification;
    }

    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appSpecification <p>
     *            Configures the processing job to run a specified Docker
     *            container image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withAppSpecification(AppSpecification appSpecification) {
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
    public CreateProcessingJobRequest withEnvironment(java.util.Map<String, String> environment) {
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
    public CreateProcessingJobRequest addEnvironmentEntry(String key, String value) {
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
    public CreateProcessingJobRequest clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     *
     * @return <p>
     *         Networking options for a processing job.
     *         </p>
     */
    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     *
     * @param networkConfig <p>
     *            Networking options for a processing job.
     *            </p>
     */
    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfig <p>
     *            Networking options for a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can
     * assume to perform tasks on your behalf.
     * </p>
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that Amazon
     *            SageMaker can assume to perform tasks on your behalf.
     *            </p>
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         (Optional) An array of key-value pairs. For more information, see
     *         <a href=
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withTags(Tag... tags) {
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProcessingJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public CreateProcessingJobRequest withExperimentConfig(ExperimentConfig experimentConfig) {
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof CreateProcessingJobRequest == false)
            return false;
        CreateProcessingJobRequest other = (CreateProcessingJobRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null
                && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        return true;
    }
}
