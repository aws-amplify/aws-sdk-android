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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates the configuration for training a model. A trained model is known as a
 * solution. After the configuration is created, you train the model (create a
 * solution) by calling the <a>CreateSolutionVersion</a> operation. Every time
 * you call <code>CreateSolutionVersion</code>, a new version of the solution is
 * created.
 * </p>
 * <p>
 * After creating a solution version, you check its accuracy by calling
 * <a>GetSolutionMetrics</a>. When you are satisfied with the version, you
 * deploy it using <a>CreateCampaign</a>. The campaign provides recommendations
 * to a client through the <a href=
 * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
 * >GetRecommendations</a> API.
 * </p>
 * <p>
 * To train a model, Amazon Personalize requires training data and a recipe. The
 * training data comes from the dataset group that you provide in the request. A
 * recipe specifies the training algorithm and a feature transformation. You can
 * specify one of the predefined recipes provided by Amazon Personalize.
 * Alternatively, you can specify <code>performAutoML</code> and Amazon
 * Personalize will analyze your data and select the optimum
 * USER_PERSONALIZATION recipe for you.
 * </p>
 * <p>
 * <b>Status</b>
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
 * To get the status of the solution, call <a>DescribeSolution</a>. Wait until
 * the status shows as ACTIVE before calling <code>CreateSolutionVersion</code>.
 * </p>
 * <p class="title">
 * <b>Related APIs</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListSolutions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateSolutionVersion</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeSolution</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteSolution</a>
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <a>ListSolutionVersions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeSolutionVersion</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateSolutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or
     * selected recipe. The default is <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and
     * you should not set it to <code>false</code>.
     * </p>
     */
    private Boolean performHPO;

    /**
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is
     * <code>false</code>. For this case, you must specify
     * <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training
     * data and selects the optimal USER_PERSONALIZATION recipe and
     * hyperparameters. In this case, you must omit <code>recipeArn</code>.
     * Amazon Personalize determines the optimal recipe by running tests with
     * different values for the hyperparameters. AutoML lengthens the training
     * process as compared to selecting a specific recipe.
     * </p>
     */
    private Boolean performAutoML;

    /**
     * <p>
     * The ARN of the recipe to use for model training. Only specified when
     * <code>performAutoML</code> is false.
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
     * When your have multiple event types (using an <code>EVENT_TYPE</code>
     * schema field), this parameter specifies which event type (for example,
     * 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String eventType;

    /**
     * <p>
     * The configuration to use with the solution. When
     * <code>performAutoML</code> is set to true, Amazon Personalize only
     * evaluates the <code>autoMLConfig</code> section of the solution
     * configuration.
     * </p>
     */
    private SolutionConfig solutionConfig;

    /**
     * <p>
     * The name for the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name for the solution.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the solution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name for the solution.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the solution.
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
     *            The name for the solution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSolutionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or
     * selected recipe. The default is <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and
     * you should not set it to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether to perform hyperparameter optimization (HPO) on the
     *         specified or selected recipe. The default is <code>false</code>.
     *         </p>
     *         <p>
     *         When performing AutoML, this parameter is always
     *         <code>true</code> and you should not set it to <code>false</code>
     *         .
     *         </p>
     */
    public Boolean isPerformHPO() {
        return performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or
     * selected recipe. The default is <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and
     * you should not set it to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether to perform hyperparameter optimization (HPO) on the
     *         specified or selected recipe. The default is <code>false</code>.
     *         </p>
     *         <p>
     *         When performing AutoML, this parameter is always
     *         <code>true</code> and you should not set it to <code>false</code>
     *         .
     *         </p>
     */
    public Boolean getPerformHPO() {
        return performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or
     * selected recipe. The default is <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and
     * you should not set it to <code>false</code>.
     * </p>
     *
     * @param performHPO <p>
     *            Whether to perform hyperparameter optimization (HPO) on the
     *            specified or selected recipe. The default is
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            When performing AutoML, this parameter is always
     *            <code>true</code> and you should not set it to
     *            <code>false</code>.
     *            </p>
     */
    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or
     * selected recipe. The default is <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and
     * you should not set it to <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performHPO <p>
     *            Whether to perform hyperparameter optimization (HPO) on the
     *            specified or selected recipe. The default is
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            When performing AutoML, this parameter is always
     *            <code>true</code> and you should not set it to
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSolutionRequest withPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
        return this;
    }

    /**
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is
     * <code>false</code>. For this case, you must specify
     * <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training
     * data and selects the optimal USER_PERSONALIZATION recipe and
     * hyperparameters. In this case, you must omit <code>recipeArn</code>.
     * Amazon Personalize determines the optimal recipe by running tests with
     * different values for the hyperparameters. AutoML lengthens the training
     * process as compared to selecting a specific recipe.
     * </p>
     *
     * @return <p>
     *         Whether to perform automated machine learning (AutoML). The
     *         default is <code>false</code>. For this case, you must specify
     *         <code>recipeArn</code>.
     *         </p>
     *         <p>
     *         When set to <code>true</code>, Amazon Personalize analyzes your
     *         training data and selects the optimal USER_PERSONALIZATION recipe
     *         and hyperparameters. In this case, you must omit
     *         <code>recipeArn</code>. Amazon Personalize determines the optimal
     *         recipe by running tests with different values for the
     *         hyperparameters. AutoML lengthens the training process as
     *         compared to selecting a specific recipe.
     *         </p>
     */
    public Boolean isPerformAutoML() {
        return performAutoML;
    }

    /**
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is
     * <code>false</code>. For this case, you must specify
     * <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training
     * data and selects the optimal USER_PERSONALIZATION recipe and
     * hyperparameters. In this case, you must omit <code>recipeArn</code>.
     * Amazon Personalize determines the optimal recipe by running tests with
     * different values for the hyperparameters. AutoML lengthens the training
     * process as compared to selecting a specific recipe.
     * </p>
     *
     * @return <p>
     *         Whether to perform automated machine learning (AutoML). The
     *         default is <code>false</code>. For this case, you must specify
     *         <code>recipeArn</code>.
     *         </p>
     *         <p>
     *         When set to <code>true</code>, Amazon Personalize analyzes your
     *         training data and selects the optimal USER_PERSONALIZATION recipe
     *         and hyperparameters. In this case, you must omit
     *         <code>recipeArn</code>. Amazon Personalize determines the optimal
     *         recipe by running tests with different values for the
     *         hyperparameters. AutoML lengthens the training process as
     *         compared to selecting a specific recipe.
     *         </p>
     */
    public Boolean getPerformAutoML() {
        return performAutoML;
    }

    /**
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is
     * <code>false</code>. For this case, you must specify
     * <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training
     * data and selects the optimal USER_PERSONALIZATION recipe and
     * hyperparameters. In this case, you must omit <code>recipeArn</code>.
     * Amazon Personalize determines the optimal recipe by running tests with
     * different values for the hyperparameters. AutoML lengthens the training
     * process as compared to selecting a specific recipe.
     * </p>
     *
     * @param performAutoML <p>
     *            Whether to perform automated machine learning (AutoML). The
     *            default is <code>false</code>. For this case, you must specify
     *            <code>recipeArn</code>.
     *            </p>
     *            <p>
     *            When set to <code>true</code>, Amazon Personalize analyzes
     *            your training data and selects the optimal
     *            USER_PERSONALIZATION recipe and hyperparameters. In this case,
     *            you must omit <code>recipeArn</code>. Amazon Personalize
     *            determines the optimal recipe by running tests with different
     *            values for the hyperparameters. AutoML lengthens the training
     *            process as compared to selecting a specific recipe.
     *            </p>
     */
    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is
     * <code>false</code>. For this case, you must specify
     * <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training
     * data and selects the optimal USER_PERSONALIZATION recipe and
     * hyperparameters. In this case, you must omit <code>recipeArn</code>.
     * Amazon Personalize determines the optimal recipe by running tests with
     * different values for the hyperparameters. AutoML lengthens the training
     * process as compared to selecting a specific recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performAutoML <p>
     *            Whether to perform automated machine learning (AutoML). The
     *            default is <code>false</code>. For this case, you must specify
     *            <code>recipeArn</code>.
     *            </p>
     *            <p>
     *            When set to <code>true</code>, Amazon Personalize analyzes
     *            your training data and selects the optimal
     *            USER_PERSONALIZATION recipe and hyperparameters. In this case,
     *            you must omit <code>recipeArn</code>. Amazon Personalize
     *            determines the optimal recipe by running tests with different
     *            values for the hyperparameters. AutoML lengthens the training
     *            process as compared to selecting a specific recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSolutionRequest withPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
        return this;
    }

    /**
     * <p>
     * The ARN of the recipe to use for model training. Only specified when
     * <code>performAutoML</code> is false.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the recipe to use for model training. Only specified
     *         when <code>performAutoML</code> is false.
     *         </p>
     */
    public String getRecipeArn() {
        return recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe to use for model training. Only specified when
     * <code>performAutoML</code> is false.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param recipeArn <p>
     *            The ARN of the recipe to use for model training. Only
     *            specified when <code>performAutoML</code> is false.
     *            </p>
     */
    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe to use for model training. Only specified when
     * <code>performAutoML</code> is false.
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
     *            The ARN of the recipe to use for model training. Only
     *            specified when <code>performAutoML</code> is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSolutionRequest withRecipeArn(String recipeArn) {
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
    public CreateSolutionRequest withDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
        return this;
    }

    /**
     * <p>
     * When your have multiple event types (using an <code>EVENT_TYPE</code>
     * schema field), this parameter specifies which event type (for example,
     * 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         When your have multiple event types (using an
     *         <code>EVENT_TYPE</code> schema field), this parameter specifies
     *         which event type (for example, 'click' or 'like') is used for
     *         training the model.
     *         </p>
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * When your have multiple event types (using an <code>EVENT_TYPE</code>
     * schema field), this parameter specifies which event type (for example,
     * 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param eventType <p>
     *            When your have multiple event types (using an
     *            <code>EVENT_TYPE</code> schema field), this parameter
     *            specifies which event type (for example, 'click' or 'like') is
     *            used for training the model.
     *            </p>
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * When your have multiple event types (using an <code>EVENT_TYPE</code>
     * schema field), this parameter specifies which event type (for example,
     * 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param eventType <p>
     *            When your have multiple event types (using an
     *            <code>EVENT_TYPE</code> schema field), this parameter
     *            specifies which event type (for example, 'click' or 'like') is
     *            used for training the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSolutionRequest withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The configuration to use with the solution. When
     * <code>performAutoML</code> is set to true, Amazon Personalize only
     * evaluates the <code>autoMLConfig</code> section of the solution
     * configuration.
     * </p>
     *
     * @return <p>
     *         The configuration to use with the solution. When
     *         <code>performAutoML</code> is set to true, Amazon Personalize
     *         only evaluates the <code>autoMLConfig</code> section of the
     *         solution configuration.
     *         </p>
     */
    public SolutionConfig getSolutionConfig() {
        return solutionConfig;
    }

    /**
     * <p>
     * The configuration to use with the solution. When
     * <code>performAutoML</code> is set to true, Amazon Personalize only
     * evaluates the <code>autoMLConfig</code> section of the solution
     * configuration.
     * </p>
     *
     * @param solutionConfig <p>
     *            The configuration to use with the solution. When
     *            <code>performAutoML</code> is set to true, Amazon Personalize
     *            only evaluates the <code>autoMLConfig</code> section of the
     *            solution configuration.
     *            </p>
     */
    public void setSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
    }

    /**
     * <p>
     * The configuration to use with the solution. When
     * <code>performAutoML</code> is set to true, Amazon Personalize only
     * evaluates the <code>autoMLConfig</code> section of the solution
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionConfig <p>
     *            The configuration to use with the solution. When
     *            <code>performAutoML</code> is set to true, Amazon Personalize
     *            only evaluates the <code>autoMLConfig</code> section of the
     *            solution configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSolutionRequest withSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
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
            sb.append("solutionConfig: " + getSolutionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode
                + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionConfig() == null) ? 0 : getSolutionConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSolutionRequest == false)
            return false;
        CreateSolutionRequest other = (CreateSolutionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        return true;
    }
}
