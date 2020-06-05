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
 * An object that provides information about a solution. A solution is a trained
 * model that can be deployed as a campaign.
 * </p>
 */
public class Solution implements Serializable {
    /**
     * <p>
     * The name of the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

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
     * When true, Amazon Personalize performs a search for the best
     * USER_PERSONALIZATION recipe from the list specified in the solution
     * configuration (<code>recipeArn</code> must not be specified). When false
     * (the default), Amazon Personalize uses <code>recipeArn</code> for
     * training.
     * </p>
     */
    private Boolean performAutoML;

    /**
     * <p>
     * The ARN of the recipe used to create the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String recipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the
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
     * Describes the configuration properties for the solution.
     * </p>
     */
    private SolutionConfig solutionConfig;

    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     */
    private AutoMLResult autoMLResult;

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
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
     * The creation date and time (in Unix time) of the solution.
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
     * Describes the latest version of the solution, including the status and
     * the ARN.
     * </p>
     */
    private SolutionVersionSummary latestSolutionVersion;

    /**
     * <p>
     * The name of the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the solution.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the solution.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the solution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withName(String name) {
        this.name = name;
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
    public Solution withSolutionArn(String solutionArn) {
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
    public Solution withPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
        return this;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best
     * USER_PERSONALIZATION recipe from the list specified in the solution
     * configuration (<code>recipeArn</code> must not be specified). When false
     * (the default), Amazon Personalize uses <code>recipeArn</code> for
     * training.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Personalize performs a search for the best
     *         USER_PERSONALIZATION recipe from the list specified in the
     *         solution configuration (<code>recipeArn</code> must not be
     *         specified). When false (the default), Amazon Personalize uses
     *         <code>recipeArn</code> for training.
     *         </p>
     */
    public Boolean isPerformAutoML() {
        return performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best
     * USER_PERSONALIZATION recipe from the list specified in the solution
     * configuration (<code>recipeArn</code> must not be specified). When false
     * (the default), Amazon Personalize uses <code>recipeArn</code> for
     * training.
     * </p>
     *
     * @return <p>
     *         When true, Amazon Personalize performs a search for the best
     *         USER_PERSONALIZATION recipe from the list specified in the
     *         solution configuration (<code>recipeArn</code> must not be
     *         specified). When false (the default), Amazon Personalize uses
     *         <code>recipeArn</code> for training.
     *         </p>
     */
    public Boolean getPerformAutoML() {
        return performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best
     * USER_PERSONALIZATION recipe from the list specified in the solution
     * configuration (<code>recipeArn</code> must not be specified). When false
     * (the default), Amazon Personalize uses <code>recipeArn</code> for
     * training.
     * </p>
     *
     * @param performAutoML <p>
     *            When true, Amazon Personalize performs a search for the best
     *            USER_PERSONALIZATION recipe from the list specified in the
     *            solution configuration (<code>recipeArn</code> must not be
     *            specified). When false (the default), Amazon Personalize uses
     *            <code>recipeArn</code> for training.
     *            </p>
     */
    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize performs a search for the best
     * USER_PERSONALIZATION recipe from the list specified in the solution
     * configuration (<code>recipeArn</code> must not be specified). When false
     * (the default), Amazon Personalize uses <code>recipeArn</code> for
     * training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performAutoML <p>
     *            When true, Amazon Personalize performs a search for the best
     *            USER_PERSONALIZATION recipe from the list specified in the
     *            solution configuration (<code>recipeArn</code> must not be
     *            specified). When false (the default), Amazon Personalize uses
     *            <code>recipeArn</code> for training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
        return this;
    }

    /**
     * <p>
     * The ARN of the recipe used to create the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the recipe used to create the solution.
     *         </p>
     */
    public String getRecipeArn() {
        return recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used to create the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param recipeArn <p>
     *            The ARN of the recipe used to create the solution.
     *            </p>
     */
    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used to create the solution.
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
     *            The ARN of the recipe used to create the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the
     * training data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset group that provides
     *         the training data.
     *         </p>
     */
    public String getDatasetGroupArn() {
        return datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the
     * training data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The Amazon Resource Name (ARN) of the dataset group that
     *            provides the training data.
     *            </p>
     */
    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the
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
     *            The Amazon Resource Name (ARN) of the dataset group that
     *            provides the training data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
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
    public Solution withEventType(String eventType) {
        this.eventType = eventType;
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
    public Solution withSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
        return this;
    }

    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     *
     * @return <p>
     *         When <code>performAutoML</code> is true, specifies the best
     *         recipe found.
     *         </p>
     */
    public AutoMLResult getAutoMLResult() {
        return autoMLResult;
    }

    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     *
     * @param autoMLResult <p>
     *            When <code>performAutoML</code> is true, specifies the best
     *            recipe found.
     *            </p>
     */
    public void setAutoMLResult(AutoMLResult autoMLResult) {
        this.autoMLResult = autoMLResult;
    }

    /**
     * <p>
     * When <code>performAutoML</code> is true, specifies the best recipe found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLResult <p>
     *            When <code>performAutoML</code> is true, specifies the best
     *            recipe found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withAutoMLResult(AutoMLResult autoMLResult) {
        this.autoMLResult = autoMLResult;
        return this;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the solution.
     *         </p>
     *         <p>
     *         A solution can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *         FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the solution.
     *            </p>
     *            <p>
     *            A solution can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DELETE PENDING &gt; DELETE IN_PROGRESS
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the solution.
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
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
     *            The status of the solution.
     *            </p>
     *            <p>
     *            A solution can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DELETE PENDING &gt; DELETE IN_PROGRESS
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the solution.
     * </p>
     *
     * @return <p>
     *         The creation date and time (in Unix time) of the solution.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the solution.
     * </p>
     *
     * @param creationDateTime <p>
     *            The creation date and time (in Unix time) of the solution.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the solution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The creation date and time (in Unix time) of the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withCreationDateTime(java.util.Date creationDateTime) {
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
    public Solution withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * <p>
     * Describes the latest version of the solution, including the status and
     * the ARN.
     * </p>
     *
     * @return <p>
     *         Describes the latest version of the solution, including the
     *         status and the ARN.
     *         </p>
     */
    public SolutionVersionSummary getLatestSolutionVersion() {
        return latestSolutionVersion;
    }

    /**
     * <p>
     * Describes the latest version of the solution, including the status and
     * the ARN.
     * </p>
     *
     * @param latestSolutionVersion <p>
     *            Describes the latest version of the solution, including the
     *            status and the ARN.
     *            </p>
     */
    public void setLatestSolutionVersion(SolutionVersionSummary latestSolutionVersion) {
        this.latestSolutionVersion = latestSolutionVersion;
    }

    /**
     * <p>
     * Describes the latest version of the solution, including the status and
     * the ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestSolutionVersion <p>
     *            Describes the latest version of the solution, including the
     *            status and the ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Solution withLatestSolutionVersion(SolutionVersionSummary latestSolutionVersion) {
        this.latestSolutionVersion = latestSolutionVersion;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getSolutionArn() != null)
            sb.append("solutionArn: " + getSolutionArn() + ",");
        if (getPerformHPO() != null)
            sb.append("performHPO: " + getPerformHPO() + ",");
        if (getPerformAutoML() != null)
            sb.append("performAutoML: " + getPerformAutoML() + ",");
        if (getRecipeArn() != null)
            sb.append("recipeArn: " + getRecipeArn() + ",");
        if (getDatasetGroupArn() != null)
            sb.append("datasetGroupArn: " + getDatasetGroupArn() + ",");
        if (getEventType() != null)
            sb.append("eventType: " + getEventType() + ",");
        if (getSolutionConfig() != null)
            sb.append("solutionConfig: " + getSolutionConfig() + ",");
        if (getAutoMLResult() != null)
            sb.append("autoMLResult: " + getAutoMLResult() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime() + ",");
        if (getLatestSolutionVersion() != null)
            sb.append("latestSolutionVersion: " + getLatestSolutionVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode
                + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionConfig() == null) ? 0 : getSolutionConfig().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLResult() == null) ? 0 : getAutoMLResult().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestSolutionVersion() == null) ? 0 : getLatestSolutionVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Solution == false)
            return false;
        Solution other = (Solution) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null
                && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getSolutionConfig() == null ^ this.getSolutionConfig() == null)
            return false;
        if (other.getSolutionConfig() != null
                && other.getSolutionConfig().equals(this.getSolutionConfig()) == false)
            return false;
        if (other.getAutoMLResult() == null ^ this.getAutoMLResult() == null)
            return false;
        if (other.getAutoMLResult() != null
                && other.getAutoMLResult().equals(this.getAutoMLResult()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getLatestSolutionVersion() == null ^ this.getLatestSolutionVersion() == null)
            return false;
        if (other.getLatestSolutionVersion() != null
                && other.getLatestSolutionVersion().equals(this.getLatestSolutionVersion()) == false)
            return false;
        return true;
    }
}
