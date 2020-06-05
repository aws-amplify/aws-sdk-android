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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * An object that provides information about a specific version of a
 * <a>Solution</a>.
 * </p>
 */
public class SolutionVersion implements Serializable {
    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionVersionArn;

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionArn;

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen
     * recipe. The default is <code>false</code>.
     * </p>
     */
    private Boolean performHPO;

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe
     * according to the solution configuration. When false (the default), Amazon
     * Personalize uses <code>recipeArn</code>.
     * </p>
     */
    private Boolean performAutoML;

    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String recipeArn;

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training
     * the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String eventType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the
     * training data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetGroupArn;

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     */
    private SolutionConfig solutionConfig;

    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to
     * train a model. This field is visible only after Amazon Personalize
     * successfully trains a model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double trainingHours;

    /**
     * <p>
     * The scope of training used to create the solution version. The
     * <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the training data that has
     * changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to
     * the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a
     * solution version with the <code>FULL</code> option and the training
     * solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     */
    private String trainingMode;

    /**
     * <p>
     * If hyperparameter optimization was performed, contains the hyperparameter
     * values of the best performing model.
     * </p>
     */
    private TunedHPOParams tunedHPOParams;

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String status;

    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was
     * created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the solution version.
     *         </p>
     */
    public String getSolutionVersionArn() {
        return solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The ARN of the solution version.
     *            </p>
     */
    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The ARN of the solution version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the solution.
     *         </p>
     */
    public String getSolutionArn() {
        return solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionArn <p>
     *            The ARN of the solution.
     *            </p>
     */
    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionArn <p>
     *            The ARN of the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen
     * recipe. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether to perform hyperparameter optimization (HPO) on the
     *         chosen recipe. The default is <code>false</code>.
     *         </p>
     */
    public Boolean isPerformHPO() {
        return performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen
     * recipe. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether to perform hyperparameter optimization (HPO) on the
     *         chosen recipe. The default is <code>false</code>.
     *         </p>
     */
    public Boolean getPerformHPO() {
        return performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen
     * recipe. The default is <code>false</code>.
     * </p>
     *
     * @param performHPO <p>
     *            Whether to perform hyperparameter optimization (HPO) on the
     *            chosen recipe. The default is <code>false</code>.
     *            </p>
     */
    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen
     * recipe. The default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performHPO <p>
     *            Whether to perform hyperparameter optimization (HPO) on the
     *            chosen recipe. The default is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
        return this;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe
     * according to the solution configuration. When false (the default), Amazon
     * Personalize uses <code>recipeArn</code>.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Personalize searches for the most optimal
     *         recipe according to the solution configuration. When false (the
     *         default), Amazon Personalize uses <code>recipeArn</code>.
     *         </p>
     */
    public Boolean isPerformAutoML() {
        return performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe
     * according to the solution configuration. When false (the default), Amazon
     * Personalize uses <code>recipeArn</code>.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Personalize searches for the most optimal
     *         recipe according to the solution configuration. When false (the
     *         default), Amazon Personalize uses <code>recipeArn</code>.
     *         </p>
     */
    public Boolean getPerformAutoML() {
        return performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe
     * according to the solution configuration. When false (the default), Amazon
     * Personalize uses <code>recipeArn</code>.
     * </p>
     *
     * @param performAutoML <p>
     *            When true, Amazon Personalize searches for the most optimal
     *            recipe according to the solution configuration. When false
     *            (the default), Amazon Personalize uses <code>recipeArn</code>.
     *            </p>
     */
    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe
     * according to the solution configuration. When false (the default), Amazon
     * Personalize uses <code>recipeArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performAutoML <p>
     *            When true, Amazon Personalize searches for the most optimal
     *            recipe according to the solution configuration. When false
     *            (the default), Amazon Personalize uses <code>recipeArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
        return this;
    }

    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the recipe used in the solution.
     *         </p>
     */
    public String getRecipeArn() {
        return recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param recipeArn <p>
     *            The ARN of the recipe used in the solution.
     *            </p>
     */
    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param recipeArn <p>
     *            The ARN of the recipe used in the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
        return this;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training
     * the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The event type (for example, 'click' or 'like') that is used for
     *         training the model.
     *         </p>
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training
     * the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param eventType <p>
     *            The event type (for example, 'click' or 'like') that is used
     *            for training the model.
     *            </p>
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training
     * the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param eventType <p>
     *            The event type (for example, 'click' or 'like') that is used
     *            for training the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the
     * training data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset group providing the
     *         training data.
     *         </p>
     */
    public String getDatasetGroupArn() {
        return datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the
     * training data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The Amazon Resource Name (ARN) of the dataset group providing
     *            the training data.
     *            </p>
     */
    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the
     * training data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The Amazon Resource Name (ARN) of the dataset group providing
     *            the training data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
        return this;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     *
     * @return <p>
     *         Describes the configuration properties for the solution.
     *         </p>
     */
    public SolutionConfig getSolutionConfig() {
        return solutionConfig;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     *
     * @param solutionConfig <p>
     *            Describes the configuration properties for the solution.
     *            </p>
     */
    public void setSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionConfig <p>
     *            Describes the configuration properties for the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
        return this;
    }

    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to
     * train a model. This field is visible only after Amazon Personalize
     * successfully trains a model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time used to train the model. You are billed for the time it
     *         takes to train a model. This field is visible only after Amazon
     *         Personalize successfully trains a model.
     *         </p>
     */
    public Double getTrainingHours() {
        return trainingHours;
    }

    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to
     * train a model. This field is visible only after Amazon Personalize
     * successfully trains a model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param trainingHours <p>
     *            The time used to train the model. You are billed for the time
     *            it takes to train a model. This field is visible only after
     *            Amazon Personalize successfully trains a model.
     *            </p>
     */
    public void setTrainingHours(Double trainingHours) {
        this.trainingHours = trainingHours;
    }

    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to
     * train a model. This field is visible only after Amazon Personalize
     * successfully trains a model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param trainingHours <p>
     *            The time used to train the model. You are billed for the time
     *            it takes to train a model. This field is visible only after
     *            Amazon Personalize successfully trains a model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withTrainingHours(Double trainingHours) {
        this.trainingHours = trainingHours;
        return this;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The
     * <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the training data that has
     * changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to
     * the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a
     * solution version with the <code>FULL</code> option and the training
     * solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @return <p>
     *         The scope of training used to create the solution version. The
     *         <code>FULL</code> option trains the solution version based on the
     *         entirety of the input solution's training data, while the
     *         <code>UPDATE</code> option processes only the training data that
     *         has changed since the creation of the last solution version.
     *         Choose <code>UPDATE</code> when you want to start recommending
     *         items added to the dataset without retraining the model.
     *         </p>
     *         <important>
     *         <p>
     *         The <code>UPDATE</code> option can only be used after you've
     *         created a solution version with the <code>FULL</code> option and
     *         the training solution uses the
     *         <a>native-recipe-hrnn-coldstart</a>.
     *         </p>
     *         </important>
     * @see TrainingMode
     */
    public String getTrainingMode() {
        return trainingMode;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The
     * <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the training data that has
     * changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to
     * the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a
     * solution version with the <code>FULL</code> option and the training
     * solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training used to create the solution version. The
     *            <code>FULL</code> option trains the solution version based on
     *            the entirety of the input solution's training data, while the
     *            <code>UPDATE</code> option processes only the training data
     *            that has changed since the creation of the last solution
     *            version. Choose <code>UPDATE</code> when you want to start
     *            recommending items added to the dataset without retraining the
     *            model.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used after you've
     *            created a solution version with the <code>FULL</code> option
     *            and the training solution uses the
     *            <a>native-recipe-hrnn-coldstart</a>.
     *            </p>
     *            </important>
     * @see TrainingMode
     */
    public void setTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The
     * <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the training data that has
     * changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to
     * the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a
     * solution version with the <code>FULL</code> option and the training
     * solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training used to create the solution version. The
     *            <code>FULL</code> option trains the solution version based on
     *            the entirety of the input solution's training data, while the
     *            <code>UPDATE</code> option processes only the training data
     *            that has changed since the creation of the last solution
     *            version. Choose <code>UPDATE</code> when you want to start
     *            recommending items added to the dataset without retraining the
     *            model.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used after you've
     *            created a solution version with the <code>FULL</code> option
     *            and the training solution uses the
     *            <a>native-recipe-hrnn-coldstart</a>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingMode
     */
    public SolutionVersion withTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
        return this;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The
     * <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the training data that has
     * changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to
     * the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a
     * solution version with the <code>FULL</code> option and the training
     * solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training used to create the solution version. The
     *            <code>FULL</code> option trains the solution version based on
     *            the entirety of the input solution's training data, while the
     *            <code>UPDATE</code> option processes only the training data
     *            that has changed since the creation of the last solution
     *            version. Choose <code>UPDATE</code> when you want to start
     *            recommending items added to the dataset without retraining the
     *            model.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used after you've
     *            created a solution version with the <code>FULL</code> option
     *            and the training solution uses the
     *            <a>native-recipe-hrnn-coldstart</a>.
     *            </p>
     *            </important>
     * @see TrainingMode
     */
    public void setTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The
     * <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the training data that has
     * changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to
     * the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a
     * solution version with the <code>FULL</code> option and the training
     * solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training used to create the solution version. The
     *            <code>FULL</code> option trains the solution version based on
     *            the entirety of the input solution's training data, while the
     *            <code>UPDATE</code> option processes only the training data
     *            that has changed since the creation of the last solution
     *            version. Choose <code>UPDATE</code> when you want to start
     *            recommending items added to the dataset without retraining the
     *            model.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used after you've
     *            created a solution version with the <code>FULL</code> option
     *            and the training solution uses the
     *            <a>native-recipe-hrnn-coldstart</a>.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingMode
     */
    public SolutionVersion withTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
        return this;
    }

    /**
     * <p>
     * If hyperparameter optimization was performed, contains the hyperparameter
     * values of the best performing model.
     * </p>
     *
     * @return <p>
     *         If hyperparameter optimization was performed, contains the
     *         hyperparameter values of the best performing model.
     *         </p>
     */
    public TunedHPOParams getTunedHPOParams() {
        return tunedHPOParams;
    }

    /**
     * <p>
     * If hyperparameter optimization was performed, contains the hyperparameter
     * values of the best performing model.
     * </p>
     *
     * @param tunedHPOParams <p>
     *            If hyperparameter optimization was performed, contains the
     *            hyperparameter values of the best performing model.
     *            </p>
     */
    public void setTunedHPOParams(TunedHPOParams tunedHPOParams) {
        this.tunedHPOParams = tunedHPOParams;
    }

    /**
     * <p>
     * If hyperparameter optimization was performed, contains the hyperparameter
     * values of the best performing model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tunedHPOParams <p>
     *            If hyperparameter optimization was performed, contains the
     *            hyperparameter values of the best performing model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withTunedHPOParams(TunedHPOParams tunedHPOParams) {
        this.tunedHPOParams = tunedHPOParams;
        return this;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the solution version.
     *         </p>
     *         <p>
     *         A solution version can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE IN_PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the solution version.
     *            </p>
     *            <p>
     *            A solution version can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE IN_PROGRESS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE FAILED
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the solution version.
     *            </p>
     *            <p>
     *            A solution version can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE IN_PROGRESS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE FAILED
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     *
     * @return <p>
     *         If training a solution version fails, the reason for the failure.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     *
     * @param failureReason <p>
     *            If training a solution version fails, the reason for the
     *            failure.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If training a solution version fails, the reason for the
     *            failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was
     * created.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix time) that this version of the
     *         solution was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was
     * created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix time) that this version of the
     *            solution was created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix time) that this version of the
     *            solution was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix time) that the solution was last
     *         updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) that the solution was last
     *            updated.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) that the solution was last
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionVersion withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
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
        if (getSolutionVersionArn() != null)
            sb.append("solutionVersionArn: " + getSolutionVersionArn() + ",");
        if (getSolutionArn() != null)
            sb.append("solutionArn: " + getSolutionArn() + ",");
        if (getPerformHPO() != null)
            sb.append("performHPO: " + getPerformHPO() + ",");
        if (getPerformAutoML() != null)
            sb.append("performAutoML: " + getPerformAutoML() + ",");
        if (getRecipeArn() != null)
            sb.append("recipeArn: " + getRecipeArn() + ",");
        if (getEventType() != null)
            sb.append("eventType: " + getEventType() + ",");
        if (getDatasetGroupArn() != null)
            sb.append("datasetGroupArn: " + getDatasetGroupArn() + ",");
        if (getSolutionConfig() != null)
            sb.append("solutionConfig: " + getSolutionConfig() + ",");
        if (getTrainingHours() != null)
            sb.append("trainingHours: " + getTrainingHours() + ",");
        if (getTrainingMode() != null)
            sb.append("trainingMode: " + getTrainingMode() + ",");
        if (getTunedHPOParams() != null)
            sb.append("tunedHPOParams: " + getTunedHPOParams() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode
                + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionConfig() == null) ? 0 : getSolutionConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingHours() == null) ? 0 : getTrainingHours().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingMode() == null) ? 0 : getTrainingMode().hashCode());
        hashCode = prime * hashCode
                + ((getTunedHPOParams() == null) ? 0 : getTunedHPOParams().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SolutionVersion == false)
            return false;
        SolutionVersion other = (SolutionVersion) obj;

        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null
                && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null
                && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        if (other.getPerformHPO() == null ^ this.getPerformHPO() == null)
            return false;
        if (other.getPerformHPO() != null
                && other.getPerformHPO().equals(this.getPerformHPO()) == false)
            return false;
        if (other.getPerformAutoML() == null ^ this.getPerformAutoML() == null)
            return false;
        if (other.getPerformAutoML() != null
                && other.getPerformAutoML().equals(this.getPerformAutoML()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null
                && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null
                && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getSolutionConfig() == null ^ this.getSolutionConfig() == null)
            return false;
        if (other.getSolutionConfig() != null
                && other.getSolutionConfig().equals(this.getSolutionConfig()) == false)
            return false;
        if (other.getTrainingHours() == null ^ this.getTrainingHours() == null)
            return false;
        if (other.getTrainingHours() != null
                && other.getTrainingHours().equals(this.getTrainingHours()) == false)
            return false;
        if (other.getTrainingMode() == null ^ this.getTrainingMode() == null)
            return false;
        if (other.getTrainingMode() != null
                && other.getTrainingMode().equals(this.getTrainingMode()) == false)
            return false;
        if (other.getTunedHPOParams() == null ^ this.getTunedHPOParams() == null)
            return false;
        if (other.getTunedHPOParams() != null
                && other.getTunedHPOParams().equals(this.getTunedHPOParams()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }
}
