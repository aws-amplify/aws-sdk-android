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
 * Defines the training jobs launched by a hyperparameter tuning job.
 * </p>
 */
public class HyperParameterTrainingJobDefinition implements Serializable {
    /**
     * <p>
     * The job definition name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String definitionName;

    /**
     * <p>
     * Defines the objective metric for a hyperparameter tuning job.
     * Hyperparameter tuning uses the value of this metric to evaluate the
     * training jobs it launches, and returns the training job that results in
     * either the highest or lowest value for this metric, depending on the
     * value you specify for the <code>Type</code> parameter.
     * </p>
     */
    private HyperParameterTuningJobObjective tuningObjective;

    /**
     * <p>
     * Specifies ranges of integer, continuous, and categorical hyperparameters
     * that a hyperparameter tuning job searches. The hyperparameter tuning job
     * launches training jobs with hyperparameter values within these ranges to
     * find the combination of values that result in the training job with the
     * best performance as measured by the objective metric of the
     * hyperparameter tuning job.
     * </p>
     * <note>
     * <p>
     * You can specify a maximum of 20 hyperparameters that a hyperparameter
     * tuning job can search over. Every possible value of a categorical
     * parameter range counts against this limit.
     * </p>
     * </note>
     */
    private ParameterRanges hyperParameterRanges;

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning
     * job.
     * </p>
     */
    private java.util.Map<String, String> staticHyperParameters;

    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the
     * resource algorithm to use for the training jobs that the tuning job
     * launches.
     * </p>
     */
    private HyperParameterAlgorithmSpecification algorithmSpecification;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * training jobs that the tuning job launches.
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
     * An array of <a>Channel</a> objects that specify the input for the
     * training jobs that the tuning job launches.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;

    /**
     * <p>
     * The <a>VpcConfig</a> object that specifies the VPC that you want the
     * training jobs that this hyperparameter tuning job launches to connect to.
     * Control access to and from your training container by configuring the
     * VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model
     * artifacts from the training jobs that the tuning job launches.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to
     * use for the training jobs that the tuning job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training
     * algorithms might also use storage volumes for scratch space. If you want
     * Amazon SageMaker to use the storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the
     * algorithm specification. For distributed training algorithms, specify an
     * instance count greater than 1.
     * </p>
     */
    private ResourceConfig resourceConfig;

    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can
     * run. It also specifies how long you are willing to wait for a managed
     * spot training job to complete. When the job reaches the a limit, Amazon
     * SageMaker ends the training job. Use this API to cap model training
     * costs.
     * </p>
     */
    private StoppingCondition stoppingCondition;

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can
     * be made, except for calls between peers within a training cluster for
     * distributed training. If network isolation is used for training jobs that
     * are configured to use a VPC, Amazon SageMaker downloads and uploads
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
     * </p>
     */
    private Boolean enableInterContainerTrafficEncryption;

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (
     * <code>True</code>) or not (<code>False</code>).
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
     * The job definition name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The job definition name.
     *         </p>
     */
    public String getDefinitionName() {
        return definitionName;
    }

    /**
     * <p>
     * The job definition name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param definitionName <p>
     *            The job definition name.
     *            </p>
     */
    public void setDefinitionName(String definitionName) {
        this.definitionName = definitionName;
    }

    /**
     * <p>
     * The job definition name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param definitionName <p>
     *            The job definition name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withDefinitionName(String definitionName) {
        this.definitionName = definitionName;
        return this;
    }

    /**
     * <p>
     * Defines the objective metric for a hyperparameter tuning job.
     * Hyperparameter tuning uses the value of this metric to evaluate the
     * training jobs it launches, and returns the training job that results in
     * either the highest or lowest value for this metric, depending on the
     * value you specify for the <code>Type</code> parameter.
     * </p>
     *
     * @return <p>
     *         Defines the objective metric for a hyperparameter tuning job.
     *         Hyperparameter tuning uses the value of this metric to evaluate
     *         the training jobs it launches, and returns the training job that
     *         results in either the highest or lowest value for this metric,
     *         depending on the value you specify for the <code>Type</code>
     *         parameter.
     *         </p>
     */
    public HyperParameterTuningJobObjective getTuningObjective() {
        return tuningObjective;
    }

    /**
     * <p>
     * Defines the objective metric for a hyperparameter tuning job.
     * Hyperparameter tuning uses the value of this metric to evaluate the
     * training jobs it launches, and returns the training job that results in
     * either the highest or lowest value for this metric, depending on the
     * value you specify for the <code>Type</code> parameter.
     * </p>
     *
     * @param tuningObjective <p>
     *            Defines the objective metric for a hyperparameter tuning job.
     *            Hyperparameter tuning uses the value of this metric to
     *            evaluate the training jobs it launches, and returns the
     *            training job that results in either the highest or lowest
     *            value for this metric, depending on the value you specify for
     *            the <code>Type</code> parameter.
     *            </p>
     */
    public void setTuningObjective(HyperParameterTuningJobObjective tuningObjective) {
        this.tuningObjective = tuningObjective;
    }

    /**
     * <p>
     * Defines the objective metric for a hyperparameter tuning job.
     * Hyperparameter tuning uses the value of this metric to evaluate the
     * training jobs it launches, and returns the training job that results in
     * either the highest or lowest value for this metric, depending on the
     * value you specify for the <code>Type</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tuningObjective <p>
     *            Defines the objective metric for a hyperparameter tuning job.
     *            Hyperparameter tuning uses the value of this metric to
     *            evaluate the training jobs it launches, and returns the
     *            training job that results in either the highest or lowest
     *            value for this metric, depending on the value you specify for
     *            the <code>Type</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withTuningObjective(
            HyperParameterTuningJobObjective tuningObjective) {
        this.tuningObjective = tuningObjective;
        return this;
    }

    /**
     * <p>
     * Specifies ranges of integer, continuous, and categorical hyperparameters
     * that a hyperparameter tuning job searches. The hyperparameter tuning job
     * launches training jobs with hyperparameter values within these ranges to
     * find the combination of values that result in the training job with the
     * best performance as measured by the objective metric of the
     * hyperparameter tuning job.
     * </p>
     * <note>
     * <p>
     * You can specify a maximum of 20 hyperparameters that a hyperparameter
     * tuning job can search over. Every possible value of a categorical
     * parameter range counts against this limit.
     * </p>
     * </note>
     *
     * @return <p>
     *         Specifies ranges of integer, continuous, and categorical
     *         hyperparameters that a hyperparameter tuning job searches. The
     *         hyperparameter tuning job launches training jobs with
     *         hyperparameter values within these ranges to find the combination
     *         of values that result in the training job with the best
     *         performance as measured by the objective metric of the
     *         hyperparameter tuning job.
     *         </p>
     *         <note>
     *         <p>
     *         You can specify a maximum of 20 hyperparameters that a
     *         hyperparameter tuning job can search over. Every possible value
     *         of a categorical parameter range counts against this limit.
     *         </p>
     *         </note>
     */
    public ParameterRanges getHyperParameterRanges() {
        return hyperParameterRanges;
    }

    /**
     * <p>
     * Specifies ranges of integer, continuous, and categorical hyperparameters
     * that a hyperparameter tuning job searches. The hyperparameter tuning job
     * launches training jobs with hyperparameter values within these ranges to
     * find the combination of values that result in the training job with the
     * best performance as measured by the objective metric of the
     * hyperparameter tuning job.
     * </p>
     * <note>
     * <p>
     * You can specify a maximum of 20 hyperparameters that a hyperparameter
     * tuning job can search over. Every possible value of a categorical
     * parameter range counts against this limit.
     * </p>
     * </note>
     *
     * @param hyperParameterRanges <p>
     *            Specifies ranges of integer, continuous, and categorical
     *            hyperparameters that a hyperparameter tuning job searches. The
     *            hyperparameter tuning job launches training jobs with
     *            hyperparameter values within these ranges to find the
     *            combination of values that result in the training job with the
     *            best performance as measured by the objective metric of the
     *            hyperparameter tuning job.
     *            </p>
     *            <note>
     *            <p>
     *            You can specify a maximum of 20 hyperparameters that a
     *            hyperparameter tuning job can search over. Every possible
     *            value of a categorical parameter range counts against this
     *            limit.
     *            </p>
     *            </note>
     */
    public void setHyperParameterRanges(ParameterRanges hyperParameterRanges) {
        this.hyperParameterRanges = hyperParameterRanges;
    }

    /**
     * <p>
     * Specifies ranges of integer, continuous, and categorical hyperparameters
     * that a hyperparameter tuning job searches. The hyperparameter tuning job
     * launches training jobs with hyperparameter values within these ranges to
     * find the combination of values that result in the training job with the
     * best performance as measured by the objective metric of the
     * hyperparameter tuning job.
     * </p>
     * <note>
     * <p>
     * You can specify a maximum of 20 hyperparameters that a hyperparameter
     * tuning job can search over. Every possible value of a categorical
     * parameter range counts against this limit.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameterRanges <p>
     *            Specifies ranges of integer, continuous, and categorical
     *            hyperparameters that a hyperparameter tuning job searches. The
     *            hyperparameter tuning job launches training jobs with
     *            hyperparameter values within these ranges to find the
     *            combination of values that result in the training job with the
     *            best performance as measured by the objective metric of the
     *            hyperparameter tuning job.
     *            </p>
     *            <note>
     *            <p>
     *            You can specify a maximum of 20 hyperparameters that a
     *            hyperparameter tuning job can search over. Every possible
     *            value of a categorical parameter range counts against this
     *            limit.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withHyperParameterRanges(
            ParameterRanges hyperParameterRanges) {
        this.hyperParameterRanges = hyperParameterRanges;
        return this;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning
     * job.
     * </p>
     *
     * @return <p>
     *         Specifies the values of hyperparameters that do not change for
     *         the tuning job.
     *         </p>
     */
    public java.util.Map<String, String> getStaticHyperParameters() {
        return staticHyperParameters;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning
     * job.
     * </p>
     *
     * @param staticHyperParameters <p>
     *            Specifies the values of hyperparameters that do not change for
     *            the tuning job.
     *            </p>
     */
    public void setStaticHyperParameters(java.util.Map<String, String> staticHyperParameters) {
        this.staticHyperParameters = staticHyperParameters;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticHyperParameters <p>
     *            Specifies the values of hyperparameters that do not change for
     *            the tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withStaticHyperParameters(
            java.util.Map<String, String> staticHyperParameters) {
        this.staticHyperParameters = staticHyperParameters;
        return this;
    }

    /**
     * <p>
     * Specifies the values of hyperparameters that do not change for the tuning
     * job.
     * </p>
     * <p>
     * The method adds a new key-value pair into StaticHyperParameters
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into StaticHyperParameters.
     * @param value The corresponding value of the entry to be added into
     *            StaticHyperParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition addStaticHyperParametersEntry(String key,
            String value) {
        if (null == this.staticHyperParameters) {
            this.staticHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.staticHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.staticHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StaticHyperParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public HyperParameterTrainingJobDefinition clearStaticHyperParametersEntries() {
        this.staticHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the
     * resource algorithm to use for the training jobs that the tuning job
     * launches.
     * </p>
     *
     * @return <p>
     *         The <a>HyperParameterAlgorithmSpecification</a> object that
     *         specifies the resource algorithm to use for the training jobs
     *         that the tuning job launches.
     *         </p>
     */
    public HyperParameterAlgorithmSpecification getAlgorithmSpecification() {
        return algorithmSpecification;
    }

    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the
     * resource algorithm to use for the training jobs that the tuning job
     * launches.
     * </p>
     *
     * @param algorithmSpecification <p>
     *            The <a>HyperParameterAlgorithmSpecification</a> object that
     *            specifies the resource algorithm to use for the training jobs
     *            that the tuning job launches.
     *            </p>
     */
    public void setAlgorithmSpecification(
            HyperParameterAlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * The <a>HyperParameterAlgorithmSpecification</a> object that specifies the
     * resource algorithm to use for the training jobs that the tuning job
     * launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmSpecification <p>
     *            The <a>HyperParameterAlgorithmSpecification</a> object that
     *            specifies the resource algorithm to use for the training jobs
     *            that the tuning job launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withAlgorithmSpecification(
            HyperParameterAlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * training jobs that the tuning job launches.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role associated with
     *         the training jobs that the tuning job launches.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * training jobs that the tuning job launches.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role associated with
     *            the training jobs that the tuning job launches.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * training jobs that the tuning job launches.
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
     *            The Amazon Resource Name (ARN) of the IAM role associated with
     *            the training jobs that the tuning job launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * An array of <a>Channel</a> objects that specify the input for the
     * training jobs that the tuning job launches.
     * </p>
     *
     * @return <p>
     *         An array of <a>Channel</a> objects that specify the input for the
     *         training jobs that the tuning job launches.
     *         </p>
     */
    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <a>Channel</a> objects that specify the input for the
     * training jobs that the tuning job launches.
     * </p>
     *
     * @param inputDataConfig <p>
     *            An array of <a>Channel</a> objects that specify the input for
     *            the training jobs that the tuning job launches.
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
     * An array of <a>Channel</a> objects that specify the input for the
     * training jobs that the tuning job launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <a>Channel</a> objects that specify the input for
     *            the training jobs that the tuning job launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withInputDataConfig(Channel... inputDataConfig) {
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
     * An array of <a>Channel</a> objects that specify the input for the
     * training jobs that the tuning job launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <a>Channel</a> objects that specify the input for
     *            the training jobs that the tuning job launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withInputDataConfig(
            java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The <a>VpcConfig</a> object that specifies the VPC that you want the
     * training jobs that this hyperparameter tuning job launches to connect to.
     * Control access to and from your training container by configuring the
     * VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @return <p>
     *         The <a>VpcConfig</a> object that specifies the VPC that you want
     *         the training jobs that this hyperparameter tuning job launches to
     *         connect to. Control access to and from your training container by
     *         configuring the VPC. For more information, see <a href=
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
     * The <a>VpcConfig</a> object that specifies the VPC that you want the
     * training jobs that this hyperparameter tuning job launches to connect to.
     * Control access to and from your training container by configuring the
     * VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            The <a>VpcConfig</a> object that specifies the VPC that you
     *            want the training jobs that this hyperparameter tuning job
     *            launches to connect to. Control access to and from your
     *            training container by configuring the VPC. For more
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
     * The <a>VpcConfig</a> object that specifies the VPC that you want the
     * training jobs that this hyperparameter tuning job launches to connect to.
     * Control access to and from your training container by configuring the
     * VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     * >Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            The <a>VpcConfig</a> object that specifies the VPC that you
     *            want the training jobs that this hyperparameter tuning job
     *            launches to connect to. Control access to and from your
     *            training container by configuring the VPC. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *            >Protect Training Jobs by Using an Amazon Virtual Private
     *            Cloud</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model
     * artifacts from the training jobs that the tuning job launches.
     * </p>
     *
     * @return <p>
     *         Specifies the path to the Amazon S3 bucket where you store model
     *         artifacts from the training jobs that the tuning job launches.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model
     * artifacts from the training jobs that the tuning job launches.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Specifies the path to the Amazon S3 bucket where you store
     *            model artifacts from the training jobs that the tuning job
     *            launches.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies the path to the Amazon S3 bucket where you store model
     * artifacts from the training jobs that the tuning job launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Specifies the path to the Amazon S3 bucket where you store
     *            model artifacts from the training jobs that the tuning job
     *            launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withOutputDataConfig(
            OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to
     * use for the training jobs that the tuning job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training
     * algorithms might also use storage volumes for scratch space. If you want
     * Amazon SageMaker to use the storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the
     * algorithm specification. For distributed training algorithms, specify an
     * instance count greater than 1.
     * </p>
     *
     * @return <p>
     *         The resources, including the compute instances and storage
     *         volumes, to use for the training jobs that the tuning job
     *         launches.
     *         </p>
     *         <p>
     *         Storage volumes store model artifacts and incremental states.
     *         Training algorithms might also use storage volumes for scratch
     *         space. If you want Amazon SageMaker to use the storage volume to
     *         store the training data, choose <code>File</code> as the
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
     * The resources, including the compute instances and storage volumes, to
     * use for the training jobs that the tuning job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training
     * algorithms might also use storage volumes for scratch space. If you want
     * Amazon SageMaker to use the storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the
     * algorithm specification. For distributed training algorithms, specify an
     * instance count greater than 1.
     * </p>
     *
     * @param resourceConfig <p>
     *            The resources, including the compute instances and storage
     *            volumes, to use for the training jobs that the tuning job
     *            launches.
     *            </p>
     *            <p>
     *            Storage volumes store model artifacts and incremental states.
     *            Training algorithms might also use storage volumes for scratch
     *            space. If you want Amazon SageMaker to use the storage volume
     *            to store the training data, choose <code>File</code> as the
     *            <code>TrainingInputMode</code> in the algorithm specification.
     *            For distributed training algorithms, specify an instance count
     *            greater than 1.
     *            </p>
     */
    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resources, including the compute instances and storage volumes, to
     * use for the training jobs that the tuning job launches.
     * </p>
     * <p>
     * Storage volumes store model artifacts and incremental states. Training
     * algorithms might also use storage volumes for scratch space. If you want
     * Amazon SageMaker to use the storage volume to store the training data,
     * choose <code>File</code> as the <code>TrainingInputMode</code> in the
     * algorithm specification. For distributed training algorithms, specify an
     * instance count greater than 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceConfig <p>
     *            The resources, including the compute instances and storage
     *            volumes, to use for the training jobs that the tuning job
     *            launches.
     *            </p>
     *            <p>
     *            Storage volumes store model artifacts and incremental states.
     *            Training algorithms might also use storage volumes for scratch
     *            space. If you want Amazon SageMaker to use the storage volume
     *            to store the training data, choose <code>File</code> as the
     *            <code>TrainingInputMode</code> in the algorithm specification.
     *            For distributed training algorithms, specify an instance count
     *            greater than 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can
     * run. It also specifies how long you are willing to wait for a managed
     * spot training job to complete. When the job reaches the a limit, Amazon
     * SageMaker ends the training job. Use this API to cap model training
     * costs.
     * </p>
     *
     * @return <p>
     *         Specifies a limit to how long a model hyperparameter training job
     *         can run. It also specifies how long you are willing to wait for a
     *         managed spot training job to complete. When the job reaches the a
     *         limit, Amazon SageMaker ends the training job. Use this API to
     *         cap model training costs.
     *         </p>
     */
    public StoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can
     * run. It also specifies how long you are willing to wait for a managed
     * spot training job to complete. When the job reaches the a limit, Amazon
     * SageMaker ends the training job. Use this API to cap model training
     * costs.
     * </p>
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model hyperparameter training
     *            job can run. It also specifies how long you are willing to
     *            wait for a managed spot training job to complete. When the job
     *            reaches the a limit, Amazon SageMaker ends the training job.
     *            Use this API to cap model training costs.
     *            </p>
     */
    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model hyperparameter training job can
     * run. It also specifies how long you are willing to wait for a managed
     * spot training job to complete. When the job reaches the a limit, Amazon
     * SageMaker ends the training job. Use this API to cap model training
     * costs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model hyperparameter training
     *            job can run. It also specifies how long you are willing to
     *            wait for a managed spot training job to complete. When the job
     *            reaches the a limit, Amazon SageMaker ends the training job.
     *            Use this API to cap model training costs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withStoppingCondition(
            StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
        return this;
    }

    /**
     * <p>
     * Isolates the training container. No inbound or outbound network calls can
     * be made, except for calls between peers within a training cluster for
     * distributed training. If network isolation is used for training jobs that
     * are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     *
     * @return <p>
     *         Isolates the training container. No inbound or outbound network
     *         calls can be made, except for calls between peers within a
     *         training cluster for distributed training. If network isolation
     *         is used for training jobs that are configured to use a VPC,
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
     * distributed training. If network isolation is used for training jobs that
     * are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     *
     * @return <p>
     *         Isolates the training container. No inbound or outbound network
     *         calls can be made, except for calls between peers within a
     *         training cluster for distributed training. If network isolation
     *         is used for training jobs that are configured to use a VPC,
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
     * distributed training. If network isolation is used for training jobs that
     * are configured to use a VPC, Amazon SageMaker downloads and uploads
     * customer data and model artifacts through the specified VPC, but the
     * training container does not have network access.
     * </p>
     *
     * @param enableNetworkIsolation <p>
     *            Isolates the training container. No inbound or outbound
     *            network calls can be made, except for calls between peers
     *            within a training cluster for distributed training. If network
     *            isolation is used for training jobs that are configured to use
     *            a VPC, Amazon SageMaker downloads and uploads customer data
     *            and model artifacts through the specified VPC, but the
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
     * distributed training. If network isolation is used for training jobs that
     * are configured to use a VPC, Amazon SageMaker downloads and uploads
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
     *            within a training cluster for distributed training. If network
     *            isolation is used for training jobs that are configured to use
     *            a VPC, Amazon SageMaker downloads and uploads customer data
     *            and model artifacts through the specified VPC, but the
     *            training container does not have network access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withEnableNetworkIsolation(
            Boolean enableNetworkIsolation) {
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
    public HyperParameterTrainingJobDefinition withEnableInterContainerTrafficEncryption(
            Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (
     * <code>True</code>) or not (<code>False</code>).
     * </p>
     *
     * @return <p>
     *         A Boolean indicating whether managed spot training is enabled (
     *         <code>True</code>) or not (<code>False</code>).
     *         </p>
     */
    public Boolean isEnableManagedSpotTraining() {
        return enableManagedSpotTraining;
    }

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (
     * <code>True</code>) or not (<code>False</code>).
     * </p>
     *
     * @return <p>
     *         A Boolean indicating whether managed spot training is enabled (
     *         <code>True</code>) or not (<code>False</code>).
     *         </p>
     */
    public Boolean getEnableManagedSpotTraining() {
        return enableManagedSpotTraining;
    }

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (
     * <code>True</code>) or not (<code>False</code>).
     * </p>
     *
     * @param enableManagedSpotTraining <p>
     *            A Boolean indicating whether managed spot training is enabled
     *            (<code>True</code>) or not (<code>False</code>).
     *            </p>
     */
    public void setEnableManagedSpotTraining(Boolean enableManagedSpotTraining) {
        this.enableManagedSpotTraining = enableManagedSpotTraining;
    }

    /**
     * <p>
     * A Boolean indicating whether managed spot training is enabled (
     * <code>True</code>) or not (<code>False</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableManagedSpotTraining <p>
     *            A Boolean indicating whether managed spot training is enabled
     *            (<code>True</code>) or not (<code>False</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTrainingJobDefinition withEnableManagedSpotTraining(
            Boolean enableManagedSpotTraining) {
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
    public HyperParameterTrainingJobDefinition withCheckpointConfig(
            CheckpointConfig checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
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
        if (getDefinitionName() != null)
            sb.append("DefinitionName: " + getDefinitionName() + ",");
        if (getTuningObjective() != null)
            sb.append("TuningObjective: " + getTuningObjective() + ",");
        if (getHyperParameterRanges() != null)
            sb.append("HyperParameterRanges: " + getHyperParameterRanges() + ",");
        if (getStaticHyperParameters() != null)
            sb.append("StaticHyperParameters: " + getStaticHyperParameters() + ",");
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: " + getAlgorithmSpecification() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: " + getResourceConfig() + ",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: " + getStoppingCondition() + ",");
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: " + getEnableNetworkIsolation() + ",");
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: "
                    + getEnableInterContainerTrafficEncryption() + ",");
        if (getEnableManagedSpotTraining() != null)
            sb.append("EnableManagedSpotTraining: " + getEnableManagedSpotTraining() + ",");
        if (getCheckpointConfig() != null)
            sb.append("CheckpointConfig: " + getCheckpointConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefinitionName() == null) ? 0 : getDefinitionName().hashCode());
        hashCode = prime * hashCode
                + ((getTuningObjective() == null) ? 0 : getTuningObjective().hashCode());
        hashCode = prime * hashCode
                + ((getHyperParameterRanges() == null) ? 0 : getHyperParameterRanges().hashCode());
        hashCode = prime
                * hashCode
                + ((getStaticHyperParameters() == null) ? 0 : getStaticHyperParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification()
                        .hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode
                + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTrainingJobDefinition == false)
            return false;
        HyperParameterTrainingJobDefinition other = (HyperParameterTrainingJobDefinition) obj;

        if (other.getDefinitionName() == null ^ this.getDefinitionName() == null)
            return false;
        if (other.getDefinitionName() != null
                && other.getDefinitionName().equals(this.getDefinitionName()) == false)
            return false;
        if (other.getTuningObjective() == null ^ this.getTuningObjective() == null)
            return false;
        if (other.getTuningObjective() != null
                && other.getTuningObjective().equals(this.getTuningObjective()) == false)
            return false;
        if (other.getHyperParameterRanges() == null ^ this.getHyperParameterRanges() == null)
            return false;
        if (other.getHyperParameterRanges() != null
                && other.getHyperParameterRanges().equals(this.getHyperParameterRanges()) == false)
            return false;
        if (other.getStaticHyperParameters() == null ^ this.getStaticHyperParameters() == null)
            return false;
        if (other.getStaticHyperParameters() != null
                && other.getStaticHyperParameters().equals(this.getStaticHyperParameters()) == false)
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
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
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
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null
                && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
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
        return true;
    }
}
