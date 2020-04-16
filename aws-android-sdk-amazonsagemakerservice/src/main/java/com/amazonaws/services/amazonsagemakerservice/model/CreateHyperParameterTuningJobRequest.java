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
 * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the
 * best version of a model by running many training jobs on your dataset using
 * the algorithm you choose and values for hyperparameters within ranges that
 * you specify. It then chooses the hyperparameter values that result in a model
 * that performs the best, as measured by an objective metric that you choose.
 * </p>
 */
public class CreateHyperParameterTuningJobRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all
     * training jobs that this tuning job launches. The name must be unique
     * within the same AWS account and AWS Region. The name must have { } to { }
     * characters. Valid characters are a-z, A-Z, 0-9, and : + = @ _ % -
     * (hyphen). The name is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String hyperParameterTuningJobName;

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that describes the tuning
     * job, including the search strategy, the objective metric used to evaluate
     * training jobs, ranges of parameters to search, and resource limits for
     * the tuning job. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     */
    private HyperParameterTuningJobConfig hyperParameterTuningJobConfig;

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that describes the
     * training jobs that this tuning job launches, including static
     * hyperparameters, input data configuration, output data configuration,
     * resource configuration, and stopping condition.
     * </p>
     */
    private HyperParameterTrainingJobDefinition trainingJobDefinition;

    /**
     * <p/>
     */
    private java.util.List<HyperParameterTrainingJobDefinition> trainingJobDefinitions;

    /**
     * <p>
     * Specifies the configuration for starting the hyperparameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     * <p>
     * All training jobs launched by the new hyperparameter tuning job are
     * evaluated by using the objective metric. If you specify
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code> as the
     * <code>WarmStartType</code> value for the warm start configuration, the
     * training job that performs the best in the new tuning job is compared to
     * the best training jobs from the parent tuning jobs. From these, the
     * training job that performs the best as measured by the objective metric
     * is returned as the overall best training job.
     * </p>
     * <note>
     * <p>
     * All training jobs launched by parent hyperparameter tuning jobs and the
     * new hyperparameter tuning jobs count against the limit of training jobs
     * for the tuning job.
     * </p>
     * </note>
     */
    private HyperParameterTuningJobWarmStartConfig warmStartConfig;

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS
     * resources in different ways, for example, by purpose, owner, or
     * environment. For more information, see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * Tags that you specify for the tuning job are also added to all training
     * jobs that the tuning job launches.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all
     * training jobs that this tuning job launches. The name must be unique
     * within the same AWS account and AWS Region. The name must have { } to { }
     * characters. Valid characters are a-z, A-Z, 0-9, and : + = @ _ % -
     * (hyphen). The name is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the tuning job. This name is the prefix for the names
     *         of all training jobs that this tuning job launches. The name must
     *         be unique within the same AWS account and AWS Region. The name
     *         must have { } to { } characters. Valid characters are a-z, A-Z,
     *         0-9, and : + = @ _ % - (hyphen). The name is not case sensitive.
     *         </p>
     */
    public String getHyperParameterTuningJobName() {
        return hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all
     * training jobs that this tuning job launches. The name must be unique
     * within the same AWS account and AWS Region. The name must have { } to { }
     * characters. Valid characters are a-z, A-Z, 0-9, and : + = @ _ % -
     * (hyphen). The name is not case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the tuning job. This name is the prefix for the
     *            names of all training jobs that this tuning job launches. The
     *            name must be unique within the same AWS account and AWS
     *            Region. The name must have { } to { } characters. Valid
     *            characters are a-z, A-Z, 0-9, and : + = @ _ % - (hyphen). The
     *            name is not case sensitive.
     *            </p>
     */
    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job. This name is the prefix for the names of all
     * training jobs that this tuning job launches. The name must be unique
     * within the same AWS account and AWS Region. The name must have { } to { }
     * characters. Valid characters are a-z, A-Z, 0-9, and : + = @ _ % -
     * (hyphen). The name is not case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the tuning job. This name is the prefix for the
     *            names of all training jobs that this tuning job launches. The
     *            name must be unique within the same AWS account and AWS
     *            Region. The name must have { } to { } characters. Valid
     *            characters are a-z, A-Z, 0-9, and : + = @ _ % - (hyphen). The
     *            name is not case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withHyperParameterTuningJobName(
            String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that describes the tuning
     * job, including the search strategy, the objective metric used to evaluate
     * training jobs, ranges of parameters to search, and resource limits for
     * the tuning job. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     *
     * @return <p>
     *         The <a>HyperParameterTuningJobConfig</a> object that describes
     *         the tuning job, including the search strategy, the objective
     *         metric used to evaluate training jobs, ranges of parameters to
     *         search, and resource limits for the tuning job. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *         >How Hyperparameter Tuning Works</a>.
     *         </p>
     */
    public HyperParameterTuningJobConfig getHyperParameterTuningJobConfig() {
        return hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that describes the tuning
     * job, including the search strategy, the objective metric used to evaluate
     * training jobs, ranges of parameters to search, and resource limits for
     * the tuning job. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     *
     * @param hyperParameterTuningJobConfig <p>
     *            The <a>HyperParameterTuningJobConfig</a> object that describes
     *            the tuning job, including the search strategy, the objective
     *            metric used to evaluate training jobs, ranges of parameters to
     *            search, and resource limits for the tuning job. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *            >How Hyperparameter Tuning Works</a>.
     *            </p>
     */
    public void setHyperParameterTuningJobConfig(
            HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        this.hyperParameterTuningJobConfig = hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that describes the tuning
     * job, including the search strategy, the objective metric used to evaluate
     * training jobs, ranges of parameters to search, and resource limits for
     * the tuning job. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameterTuningJobConfig <p>
     *            The <a>HyperParameterTuningJobConfig</a> object that describes
     *            the tuning job, including the search strategy, the objective
     *            metric used to evaluate training jobs, ranges of parameters to
     *            search, and resource limits for the tuning job. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *            >How Hyperparameter Tuning Works</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withHyperParameterTuningJobConfig(
            HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        this.hyperParameterTuningJobConfig = hyperParameterTuningJobConfig;
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that describes the
     * training jobs that this tuning job launches, including static
     * hyperparameters, input data configuration, output data configuration,
     * resource configuration, and stopping condition.
     * </p>
     *
     * @return <p>
     *         The <a>HyperParameterTrainingJobDefinition</a> object that
     *         describes the training jobs that this tuning job launches,
     *         including static hyperparameters, input data configuration,
     *         output data configuration, resource configuration, and stopping
     *         condition.
     *         </p>
     */
    public HyperParameterTrainingJobDefinition getTrainingJobDefinition() {
        return trainingJobDefinition;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that describes the
     * training jobs that this tuning job launches, including static
     * hyperparameters, input data configuration, output data configuration,
     * resource configuration, and stopping condition.
     * </p>
     *
     * @param trainingJobDefinition <p>
     *            The <a>HyperParameterTrainingJobDefinition</a> object that
     *            describes the training jobs that this tuning job launches,
     *            including static hyperparameters, input data configuration,
     *            output data configuration, resource configuration, and
     *            stopping condition.
     *            </p>
     */
    public void setTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that describes the
     * training jobs that this tuning job launches, including static
     * hyperparameters, input data configuration, output data configuration,
     * resource configuration, and stopping condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobDefinition <p>
     *            The <a>HyperParameterTrainingJobDefinition</a> object that
     *            describes the training jobs that this tuning job launches,
     *            including static hyperparameters, input data configuration,
     *            output data configuration, resource configuration, and
     *            stopping condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withTrainingJobDefinition(
            HyperParameterTrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<HyperParameterTrainingJobDefinition> getTrainingJobDefinitions() {
        return trainingJobDefinitions;
    }

    /**
     * <p/>
     *
     * @param trainingJobDefinitions <p/>
     */
    public void setTrainingJobDefinitions(
            java.util.Collection<HyperParameterTrainingJobDefinition> trainingJobDefinitions) {
        if (trainingJobDefinitions == null) {
            this.trainingJobDefinitions = null;
            return;
        }

        this.trainingJobDefinitions = new java.util.ArrayList<HyperParameterTrainingJobDefinition>(
                trainingJobDefinitions);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobDefinitions <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withTrainingJobDefinitions(
            HyperParameterTrainingJobDefinition... trainingJobDefinitions) {
        if (getTrainingJobDefinitions() == null) {
            this.trainingJobDefinitions = new java.util.ArrayList<HyperParameterTrainingJobDefinition>(
                    trainingJobDefinitions.length);
        }
        for (HyperParameterTrainingJobDefinition value : trainingJobDefinitions) {
            this.trainingJobDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobDefinitions <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withTrainingJobDefinitions(
            java.util.Collection<HyperParameterTrainingJobDefinition> trainingJobDefinitions) {
        setTrainingJobDefinitions(trainingJobDefinitions);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for starting the hyperparameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     * <p>
     * All training jobs launched by the new hyperparameter tuning job are
     * evaluated by using the objective metric. If you specify
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code> as the
     * <code>WarmStartType</code> value for the warm start configuration, the
     * training job that performs the best in the new tuning job is compared to
     * the best training jobs from the parent tuning jobs. From these, the
     * training job that performs the best as measured by the objective metric
     * is returned as the overall best training job.
     * </p>
     * <note>
     * <p>
     * All training jobs launched by parent hyperparameter tuning jobs and the
     * new hyperparameter tuning jobs count against the limit of training jobs
     * for the tuning job.
     * </p>
     * </note>
     *
     * @return <p>
     *         Specifies the configuration for starting the hyperparameter
     *         tuning job using one or more previous tuning jobs as a starting
     *         point. The results of previous tuning jobs are used to inform
     *         which combinations of hyperparameters to search over in the new
     *         tuning job.
     *         </p>
     *         <p>
     *         All training jobs launched by the new hyperparameter tuning job
     *         are evaluated by using the objective metric. If you specify
     *         <code>IDENTICAL_DATA_AND_ALGORITHM</code> as the
     *         <code>WarmStartType</code> value for the warm start
     *         configuration, the training job that performs the best in the new
     *         tuning job is compared to the best training jobs from the parent
     *         tuning jobs. From these, the training job that performs the best
     *         as measured by the objective metric is returned as the overall
     *         best training job.
     *         </p>
     *         <note>
     *         <p>
     *         All training jobs launched by parent hyperparameter tuning jobs
     *         and the new hyperparameter tuning jobs count against the limit of
     *         training jobs for the tuning job.
     *         </p>
     *         </note>
     */
    public HyperParameterTuningJobWarmStartConfig getWarmStartConfig() {
        return warmStartConfig;
    }

    /**
     * <p>
     * Specifies the configuration for starting the hyperparameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     * <p>
     * All training jobs launched by the new hyperparameter tuning job are
     * evaluated by using the objective metric. If you specify
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code> as the
     * <code>WarmStartType</code> value for the warm start configuration, the
     * training job that performs the best in the new tuning job is compared to
     * the best training jobs from the parent tuning jobs. From these, the
     * training job that performs the best as measured by the objective metric
     * is returned as the overall best training job.
     * </p>
     * <note>
     * <p>
     * All training jobs launched by parent hyperparameter tuning jobs and the
     * new hyperparameter tuning jobs count against the limit of training jobs
     * for the tuning job.
     * </p>
     * </note>
     *
     * @param warmStartConfig <p>
     *            Specifies the configuration for starting the hyperparameter
     *            tuning job using one or more previous tuning jobs as a
     *            starting point. The results of previous tuning jobs are used
     *            to inform which combinations of hyperparameters to search over
     *            in the new tuning job.
     *            </p>
     *            <p>
     *            All training jobs launched by the new hyperparameter tuning
     *            job are evaluated by using the objective metric. If you
     *            specify <code>IDENTICAL_DATA_AND_ALGORITHM</code> as the
     *            <code>WarmStartType</code> value for the warm start
     *            configuration, the training job that performs the best in the
     *            new tuning job is compared to the best training jobs from the
     *            parent tuning jobs. From these, the training job that performs
     *            the best as measured by the objective metric is returned as
     *            the overall best training job.
     *            </p>
     *            <note>
     *            <p>
     *            All training jobs launched by parent hyperparameter tuning
     *            jobs and the new hyperparameter tuning jobs count against the
     *            limit of training jobs for the tuning job.
     *            </p>
     *            </note>
     */
    public void setWarmStartConfig(HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        this.warmStartConfig = warmStartConfig;
    }

    /**
     * <p>
     * Specifies the configuration for starting the hyperparameter tuning job
     * using one or more previous tuning jobs as a starting point. The results
     * of previous tuning jobs are used to inform which combinations of
     * hyperparameters to search over in the new tuning job.
     * </p>
     * <p>
     * All training jobs launched by the new hyperparameter tuning job are
     * evaluated by using the objective metric. If you specify
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code> as the
     * <code>WarmStartType</code> value for the warm start configuration, the
     * training job that performs the best in the new tuning job is compared to
     * the best training jobs from the parent tuning jobs. From these, the
     * training job that performs the best as measured by the objective metric
     * is returned as the overall best training job.
     * </p>
     * <note>
     * <p>
     * All training jobs launched by parent hyperparameter tuning jobs and the
     * new hyperparameter tuning jobs count against the limit of training jobs
     * for the tuning job.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warmStartConfig <p>
     *            Specifies the configuration for starting the hyperparameter
     *            tuning job using one or more previous tuning jobs as a
     *            starting point. The results of previous tuning jobs are used
     *            to inform which combinations of hyperparameters to search over
     *            in the new tuning job.
     *            </p>
     *            <p>
     *            All training jobs launched by the new hyperparameter tuning
     *            job are evaluated by using the objective metric. If you
     *            specify <code>IDENTICAL_DATA_AND_ALGORITHM</code> as the
     *            <code>WarmStartType</code> value for the warm start
     *            configuration, the training job that performs the best in the
     *            new tuning job is compared to the best training jobs from the
     *            parent tuning jobs. From these, the training job that performs
     *            the best as measured by the objective metric is returned as
     *            the overall best training job.
     *            </p>
     *            <note>
     *            <p>
     *            All training jobs launched by parent hyperparameter tuning
     *            jobs and the new hyperparameter tuning jobs count against the
     *            limit of training jobs for the tuning job.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withWarmStartConfig(
            HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        this.warmStartConfig = warmStartConfig;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS
     * resources in different ways, for example, by purpose, owner, or
     * environment. For more information, see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * Tags that you specify for the tuning job are also added to all training
     * jobs that the tuning job launches.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs. You can use tags to categorize your
     *         AWS resources in different ways, for example, by purpose, owner,
     *         or environment. For more information, see <a href=
     *         "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     *         >AWS Tagging Strategies</a>.
     *         </p>
     *         <p>
     *         Tags that you specify for the tuning job are also added to all
     *         training jobs that the tuning job launches.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your AWS
     * resources in different ways, for example, by purpose, owner, or
     * environment. For more information, see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * Tags that you specify for the tuning job are also added to all training
     * jobs that the tuning job launches.
     * </p>
     *
     * @param tags <p>
     *            An array of key-value pairs. You can use tags to categorize
     *            your AWS resources in different ways, for example, by purpose,
     *            owner, or environment. For more information, see <a href=
     *            "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     *            >AWS Tagging Strategies</a>.
     *            </p>
     *            <p>
     *            Tags that you specify for the tuning job are also added to all
     *            training jobs that the tuning job launches.
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
     * An array of key-value pairs. You can use tags to categorize your AWS
     * resources in different ways, for example, by purpose, owner, or
     * environment. For more information, see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * Tags that you specify for the tuning job are also added to all training
     * jobs that the tuning job launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs. You can use tags to categorize
     *            your AWS resources in different ways, for example, by purpose,
     *            owner, or environment. For more information, see <a href=
     *            "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     *            >AWS Tagging Strategies</a>.
     *            </p>
     *            <p>
     *            Tags that you specify for the tuning job are also added to all
     *            training jobs that the tuning job launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withTags(Tag... tags) {
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
     * An array of key-value pairs. You can use tags to categorize your AWS
     * resources in different ways, for example, by purpose, owner, or
     * environment. For more information, see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * Tags that you specify for the tuning job are also added to all training
     * jobs that the tuning job launches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key-value pairs. You can use tags to categorize
     *            your AWS resources in different ways, for example, by purpose,
     *            owner, or environment. For more information, see <a href=
     *            "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     *            >AWS Tagging Strategies</a>.
     *            </p>
     *            <p>
     *            Tags that you specify for the tuning job are also added to all
     *            training jobs that the tuning job launches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: " + getHyperParameterTuningJobName() + ",");
        if (getHyperParameterTuningJobConfig() != null)
            sb.append("HyperParameterTuningJobConfig: " + getHyperParameterTuningJobConfig() + ",");
        if (getTrainingJobDefinition() != null)
            sb.append("TrainingJobDefinition: " + getTrainingJobDefinition() + ",");
        if (getTrainingJobDefinitions() != null)
            sb.append("TrainingJobDefinitions: " + getTrainingJobDefinitions() + ",");
        if (getWarmStartConfig() != null)
            sb.append("WarmStartConfig: " + getWarmStartConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobName() == null) ? 0
                        : getHyperParameterTuningJobName().hashCode());
        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobConfig() == null) ? 0
                        : getHyperParameterTuningJobConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingJobDefinition() == null) ? 0 : getTrainingJobDefinition().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingJobDefinitions() == null) ? 0 : getTrainingJobDefinitions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getWarmStartConfig() == null) ? 0 : getWarmStartConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHyperParameterTuningJobRequest == false)
            return false;
        CreateHyperParameterTuningJobRequest other = (CreateHyperParameterTuningJobRequest) obj;

        if (other.getHyperParameterTuningJobName() == null
                ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null
                && other.getHyperParameterTuningJobName().equals(
                        this.getHyperParameterTuningJobName()) == false)
            return false;
        if (other.getHyperParameterTuningJobConfig() == null
                ^ this.getHyperParameterTuningJobConfig() == null)
            return false;
        if (other.getHyperParameterTuningJobConfig() != null
                && other.getHyperParameterTuningJobConfig().equals(
                        this.getHyperParameterTuningJobConfig()) == false)
            return false;
        if (other.getTrainingJobDefinition() == null ^ this.getTrainingJobDefinition() == null)
            return false;
        if (other.getTrainingJobDefinition() != null
                && other.getTrainingJobDefinition().equals(this.getTrainingJobDefinition()) == false)
            return false;
        if (other.getTrainingJobDefinitions() == null ^ this.getTrainingJobDefinitions() == null)
            return false;
        if (other.getTrainingJobDefinitions() != null
                && other.getTrainingJobDefinitions().equals(this.getTrainingJobDefinitions()) == false)
            return false;
        if (other.getWarmStartConfig() == null ^ this.getWarmStartConfig() == null)
            return false;
        if (other.getWarmStartConfig() != null
                && other.getWarmStartConfig().equals(this.getWarmStartConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
