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
 * Configures a hyperparameter tuning job.
 * </p>
 */
public class HyperParameterTuningJobConfig implements Serializable {
    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of
     * hyperparameter values to use for the training job it launches. To use the
     * Bayesian search strategy, set this to <code>Bayesian</code>. To randomly
     * search, set it to <code>Random</code>. For information about search
     * strategies, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     */
    private String strategy;

    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the
     * objective metric for this tuning job.
     * </p>
     */
    private HyperParameterTuningJobObjective hyperParameterTuningJobObjective;

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs for this tuning job.
     * </p>
     */
    private ResourceLimits resourceLimits;

    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of
     * hyperparameters that this tuning job searches.
     * </p>
     */
    private ParameterRanges parameterRanges;

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the
     * hyperparameter tuning job. This can be one of the following values (the
     * default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early
     * stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter
     * tuning job when they are unlikely to perform better than previously
     * completed training jobs. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     * >Stop Training Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Off, Auto
     */
    private String trainingJobEarlyStoppingType;

    /**
     * <p>
     * The tuning job's completion criteria.
     * </p>
     */
    private TuningJobCompletionCriteria tuningJobCompletionCriteria;

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of
     * hyperparameter values to use for the training job it launches. To use the
     * Bayesian search strategy, set this to <code>Bayesian</code>. To randomly
     * search, set it to <code>Random</code>. For information about search
     * strategies, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @return <p>
     *         Specifies how hyperparameter tuning chooses the combinations of
     *         hyperparameter values to use for the training job it launches. To
     *         use the Bayesian search strategy, set this to
     *         <code>Bayesian</code>. To randomly search, set it to
     *         <code>Random</code>. For information about search strategies, see
     *         <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *         >How Hyperparameter Tuning Works</a>.
     *         </p>
     * @see HyperParameterTuningJobStrategyType
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of
     * hyperparameter values to use for the training job it launches. To use the
     * Bayesian search strategy, set this to <code>Bayesian</code>. To randomly
     * search, set it to <code>Random</code>. For information about search
     * strategies, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies how hyperparameter tuning chooses the combinations
     *            of hyperparameter values to use for the training job it
     *            launches. To use the Bayesian search strategy, set this to
     *            <code>Bayesian</code>. To randomly search, set it to
     *            <code>Random</code>. For information about search strategies,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *            >How Hyperparameter Tuning Works</a>.
     *            </p>
     * @see HyperParameterTuningJobStrategyType
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of
     * hyperparameter values to use for the training job it launches. To use the
     * Bayesian search strategy, set this to <code>Bayesian</code>. To randomly
     * search, set it to <code>Random</code>. For information about search
     * strategies, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies how hyperparameter tuning chooses the combinations
     *            of hyperparameter values to use for the training job it
     *            launches. To use the Bayesian search strategy, set this to
     *            <code>Bayesian</code>. To randomly search, set it to
     *            <code>Random</code>. For information about search strategies,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *            >How Hyperparameter Tuning Works</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStrategyType
     */
    public HyperParameterTuningJobConfig withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of
     * hyperparameter values to use for the training job it launches. To use the
     * Bayesian search strategy, set this to <code>Bayesian</code>. To randomly
     * search, set it to <code>Random</code>. For information about search
     * strategies, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies how hyperparameter tuning chooses the combinations
     *            of hyperparameter values to use for the training job it
     *            launches. To use the Bayesian search strategy, set this to
     *            <code>Bayesian</code>. To randomly search, set it to
     *            <code>Random</code>. For information about search strategies,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *            >How Hyperparameter Tuning Works</a>.
     *            </p>
     * @see HyperParameterTuningJobStrategyType
     */
    public void setStrategy(HyperParameterTuningJobStrategyType strategy) {
        this.strategy = strategy.toString();
    }

    /**
     * <p>
     * Specifies how hyperparameter tuning chooses the combinations of
     * hyperparameter values to use for the training job it launches. To use the
     * Bayesian search strategy, set this to <code>Bayesian</code>. To randomly
     * search, set it to <code>Random</code>. For information about search
     * strategies, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     * >How Hyperparameter Tuning Works</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bayesian, Random
     *
     * @param strategy <p>
     *            Specifies how hyperparameter tuning chooses the combinations
     *            of hyperparameter values to use for the training job it
     *            launches. To use the Bayesian search strategy, set this to
     *            <code>Bayesian</code>. To randomly search, set it to
     *            <code>Random</code>. For information about search strategies,
     *            see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-how-it-works.html"
     *            >How Hyperparameter Tuning Works</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterTuningJobStrategyType
     */
    public HyperParameterTuningJobConfig withStrategy(HyperParameterTuningJobStrategyType strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the
     * objective metric for this tuning job.
     * </p>
     *
     * @return <p>
     *         The <a>HyperParameterTuningJobObjective</a> object that specifies
     *         the objective metric for this tuning job.
     *         </p>
     */
    public HyperParameterTuningJobObjective getHyperParameterTuningJobObjective() {
        return hyperParameterTuningJobObjective;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the
     * objective metric for this tuning job.
     * </p>
     *
     * @param hyperParameterTuningJobObjective <p>
     *            The <a>HyperParameterTuningJobObjective</a> object that
     *            specifies the objective metric for this tuning job.
     *            </p>
     */
    public void setHyperParameterTuningJobObjective(
            HyperParameterTuningJobObjective hyperParameterTuningJobObjective) {
        this.hyperParameterTuningJobObjective = hyperParameterTuningJobObjective;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobObjective</a> object that specifies the
     * objective metric for this tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameterTuningJobObjective <p>
     *            The <a>HyperParameterTuningJobObjective</a> object that
     *            specifies the objective metric for this tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobConfig withHyperParameterTuningJobObjective(
            HyperParameterTuningJobObjective hyperParameterTuningJobObjective) {
        this.hyperParameterTuningJobObjective = hyperParameterTuningJobObjective;
        return this;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs for this tuning job.
     * </p>
     *
     * @return <p>
     *         The <a>ResourceLimits</a> object that specifies the maximum
     *         number of training jobs and parallel training jobs for this
     *         tuning job.
     *         </p>
     */
    public ResourceLimits getResourceLimits() {
        return resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs for this tuning job.
     * </p>
     *
     * @param resourceLimits <p>
     *            The <a>ResourceLimits</a> object that specifies the maximum
     *            number of training jobs and parallel training jobs for this
     *            tuning job.
     *            </p>
     */
    public void setResourceLimits(ResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of
     * training jobs and parallel training jobs for this tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLimits <p>
     *            The <a>ResourceLimits</a> object that specifies the maximum
     *            number of training jobs and parallel training jobs for this
     *            tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobConfig withResourceLimits(ResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
        return this;
    }

    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of
     * hyperparameters that this tuning job searches.
     * </p>
     *
     * @return <p>
     *         The <a>ParameterRanges</a> object that specifies the ranges of
     *         hyperparameters that this tuning job searches.
     *         </p>
     */
    public ParameterRanges getParameterRanges() {
        return parameterRanges;
    }

    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of
     * hyperparameters that this tuning job searches.
     * </p>
     *
     * @param parameterRanges <p>
     *            The <a>ParameterRanges</a> object that specifies the ranges of
     *            hyperparameters that this tuning job searches.
     *            </p>
     */
    public void setParameterRanges(ParameterRanges parameterRanges) {
        this.parameterRanges = parameterRanges;
    }

    /**
     * <p>
     * The <a>ParameterRanges</a> object that specifies the ranges of
     * hyperparameters that this tuning job searches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterRanges <p>
     *            The <a>ParameterRanges</a> object that specifies the ranges of
     *            hyperparameters that this tuning job searches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobConfig withParameterRanges(ParameterRanges parameterRanges) {
        this.parameterRanges = parameterRanges;
        return this;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the
     * hyperparameter tuning job. This can be one of the following values (the
     * default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early
     * stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter
     * tuning job when they are unlikely to perform better than previously
     * completed training jobs. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     * >Stop Training Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Off, Auto
     *
     * @return <p>
     *         Specifies whether to use early stopping for training jobs
     *         launched by the hyperparameter tuning job. This can be one of the
     *         following values (the default value is <code>OFF</code>):
     *         </p>
     *         <dl>
     *         <dt>OFF</dt>
     *         <dd>
     *         <p>
     *         Training jobs launched by the hyperparameter tuning job do not
     *         use early stopping.
     *         </p>
     *         </dd>
     *         <dt>AUTO</dt>
     *         <dd>
     *         <p>
     *         Amazon SageMaker stops training jobs launched by the
     *         hyperparameter tuning job when they are unlikely to perform
     *         better than previously completed training jobs. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     *         >Stop Training Jobs Early</a>.
     *         </p>
     *         </dd>
     *         </dl>
     * @see TrainingJobEarlyStoppingType
     */
    public String getTrainingJobEarlyStoppingType() {
        return trainingJobEarlyStoppingType;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the
     * hyperparameter tuning job. This can be one of the following values (the
     * default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early
     * stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter
     * tuning job when they are unlikely to perform better than previously
     * completed training jobs. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     * >Stop Training Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Off, Auto
     *
     * @param trainingJobEarlyStoppingType <p>
     *            Specifies whether to use early stopping for training jobs
     *            launched by the hyperparameter tuning job. This can be one of
     *            the following values (the default value is <code>OFF</code>):
     *            </p>
     *            <dl>
     *            <dt>OFF</dt>
     *            <dd>
     *            <p>
     *            Training jobs launched by the hyperparameter tuning job do not
     *            use early stopping.
     *            </p>
     *            </dd>
     *            <dt>AUTO</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker stops training jobs launched by the
     *            hyperparameter tuning job when they are unlikely to perform
     *            better than previously completed training jobs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     *            >Stop Training Jobs Early</a>.
     *            </p>
     *            </dd>
     *            </dl>
     * @see TrainingJobEarlyStoppingType
     */
    public void setTrainingJobEarlyStoppingType(String trainingJobEarlyStoppingType) {
        this.trainingJobEarlyStoppingType = trainingJobEarlyStoppingType;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the
     * hyperparameter tuning job. This can be one of the following values (the
     * default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early
     * stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter
     * tuning job when they are unlikely to perform better than previously
     * completed training jobs. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     * >Stop Training Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Off, Auto
     *
     * @param trainingJobEarlyStoppingType <p>
     *            Specifies whether to use early stopping for training jobs
     *            launched by the hyperparameter tuning job. This can be one of
     *            the following values (the default value is <code>OFF</code>):
     *            </p>
     *            <dl>
     *            <dt>OFF</dt>
     *            <dd>
     *            <p>
     *            Training jobs launched by the hyperparameter tuning job do not
     *            use early stopping.
     *            </p>
     *            </dd>
     *            <dt>AUTO</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker stops training jobs launched by the
     *            hyperparameter tuning job when they are unlikely to perform
     *            better than previously completed training jobs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     *            >Stop Training Jobs Early</a>.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobEarlyStoppingType
     */
    public HyperParameterTuningJobConfig withTrainingJobEarlyStoppingType(
            String trainingJobEarlyStoppingType) {
        this.trainingJobEarlyStoppingType = trainingJobEarlyStoppingType;
        return this;
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the
     * hyperparameter tuning job. This can be one of the following values (the
     * default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early
     * stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter
     * tuning job when they are unlikely to perform better than previously
     * completed training jobs. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     * >Stop Training Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Off, Auto
     *
     * @param trainingJobEarlyStoppingType <p>
     *            Specifies whether to use early stopping for training jobs
     *            launched by the hyperparameter tuning job. This can be one of
     *            the following values (the default value is <code>OFF</code>):
     *            </p>
     *            <dl>
     *            <dt>OFF</dt>
     *            <dd>
     *            <p>
     *            Training jobs launched by the hyperparameter tuning job do not
     *            use early stopping.
     *            </p>
     *            </dd>
     *            <dt>AUTO</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker stops training jobs launched by the
     *            hyperparameter tuning job when they are unlikely to perform
     *            better than previously completed training jobs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     *            >Stop Training Jobs Early</a>.
     *            </p>
     *            </dd>
     *            </dl>
     * @see TrainingJobEarlyStoppingType
     */
    public void setTrainingJobEarlyStoppingType(
            TrainingJobEarlyStoppingType trainingJobEarlyStoppingType) {
        this.trainingJobEarlyStoppingType = trainingJobEarlyStoppingType.toString();
    }

    /**
     * <p>
     * Specifies whether to use early stopping for training jobs launched by the
     * hyperparameter tuning job. This can be one of the following values (the
     * default value is <code>OFF</code>):
     * </p>
     * <dl>
     * <dt>OFF</dt>
     * <dd>
     * <p>
     * Training jobs launched by the hyperparameter tuning job do not use early
     * stopping.
     * </p>
     * </dd>
     * <dt>AUTO</dt>
     * <dd>
     * <p>
     * Amazon SageMaker stops training jobs launched by the hyperparameter
     * tuning job when they are unlikely to perform better than previously
     * completed training jobs. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     * >Stop Training Jobs Early</a>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Off, Auto
     *
     * @param trainingJobEarlyStoppingType <p>
     *            Specifies whether to use early stopping for training jobs
     *            launched by the hyperparameter tuning job. This can be one of
     *            the following values (the default value is <code>OFF</code>):
     *            </p>
     *            <dl>
     *            <dt>OFF</dt>
     *            <dd>
     *            <p>
     *            Training jobs launched by the hyperparameter tuning job do not
     *            use early stopping.
     *            </p>
     *            </dd>
     *            <dt>AUTO</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker stops training jobs launched by the
     *            hyperparameter tuning job when they are unlikely to perform
     *            better than previously completed training jobs. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-early-stopping.html"
     *            >Stop Training Jobs Early</a>.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobEarlyStoppingType
     */
    public HyperParameterTuningJobConfig withTrainingJobEarlyStoppingType(
            TrainingJobEarlyStoppingType trainingJobEarlyStoppingType) {
        this.trainingJobEarlyStoppingType = trainingJobEarlyStoppingType.toString();
        return this;
    }

    /**
     * <p>
     * The tuning job's completion criteria.
     * </p>
     *
     * @return <p>
     *         The tuning job's completion criteria.
     *         </p>
     */
    public TuningJobCompletionCriteria getTuningJobCompletionCriteria() {
        return tuningJobCompletionCriteria;
    }

    /**
     * <p>
     * The tuning job's completion criteria.
     * </p>
     *
     * @param tuningJobCompletionCriteria <p>
     *            The tuning job's completion criteria.
     *            </p>
     */
    public void setTuningJobCompletionCriteria(
            TuningJobCompletionCriteria tuningJobCompletionCriteria) {
        this.tuningJobCompletionCriteria = tuningJobCompletionCriteria;
    }

    /**
     * <p>
     * The tuning job's completion criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tuningJobCompletionCriteria <p>
     *            The tuning job's completion criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterTuningJobConfig withTuningJobCompletionCriteria(
            TuningJobCompletionCriteria tuningJobCompletionCriteria) {
        this.tuningJobCompletionCriteria = tuningJobCompletionCriteria;
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
        if (getStrategy() != null)
            sb.append("Strategy: " + getStrategy() + ",");
        if (getHyperParameterTuningJobObjective() != null)
            sb.append("HyperParameterTuningJobObjective: " + getHyperParameterTuningJobObjective()
                    + ",");
        if (getResourceLimits() != null)
            sb.append("ResourceLimits: " + getResourceLimits() + ",");
        if (getParameterRanges() != null)
            sb.append("ParameterRanges: " + getParameterRanges() + ",");
        if (getTrainingJobEarlyStoppingType() != null)
            sb.append("TrainingJobEarlyStoppingType: " + getTrainingJobEarlyStoppingType() + ",");
        if (getTuningJobCompletionCriteria() != null)
            sb.append("TuningJobCompletionCriteria: " + getTuningJobCompletionCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobObjective() == null) ? 0
                        : getHyperParameterTuningJobObjective().hashCode());
        hashCode = prime * hashCode
                + ((getResourceLimits() == null) ? 0 : getResourceLimits().hashCode());
        hashCode = prime * hashCode
                + ((getParameterRanges() == null) ? 0 : getParameterRanges().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingJobEarlyStoppingType() == null) ? 0
                        : getTrainingJobEarlyStoppingType().hashCode());
        hashCode = prime
                * hashCode
                + ((getTuningJobCompletionCriteria() == null) ? 0
                        : getTuningJobCompletionCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobConfig == false)
            return false;
        HyperParameterTuningJobConfig other = (HyperParameterTuningJobConfig) obj;

        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getHyperParameterTuningJobObjective() == null
                ^ this.getHyperParameterTuningJobObjective() == null)
            return false;
        if (other.getHyperParameterTuningJobObjective() != null
                && other.getHyperParameterTuningJobObjective().equals(
                        this.getHyperParameterTuningJobObjective()) == false)
            return false;
        if (other.getResourceLimits() == null ^ this.getResourceLimits() == null)
            return false;
        if (other.getResourceLimits() != null
                && other.getResourceLimits().equals(this.getResourceLimits()) == false)
            return false;
        if (other.getParameterRanges() == null ^ this.getParameterRanges() == null)
            return false;
        if (other.getParameterRanges() != null
                && other.getParameterRanges().equals(this.getParameterRanges()) == false)
            return false;
        if (other.getTrainingJobEarlyStoppingType() == null
                ^ this.getTrainingJobEarlyStoppingType() == null)
            return false;
        if (other.getTrainingJobEarlyStoppingType() != null
                && other.getTrainingJobEarlyStoppingType().equals(
                        this.getTrainingJobEarlyStoppingType()) == false)
            return false;
        if (other.getTuningJobCompletionCriteria() == null
                ^ this.getTuningJobCompletionCriteria() == null)
            return false;
        if (other.getTuningJobCompletionCriteria() != null
                && other.getTuningJobCompletionCriteria().equals(
                        this.getTuningJobCompletionCriteria()) == false)
            return false;
        return true;
    }
}
