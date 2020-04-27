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
 * Creates an AutoPilot job.
 * </p>
 * <p>
 * After you run an AutoPilot job, you can find the best performing model by
 * calling , and then deploy that model by following the steps described in <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html">
 * Step 6.1: Deploy the Model to Amazon SageMaker Hosting Services</a>.
 * </p>
 * <p>
 * For information about how to use AutoPilot, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development.html"
 * >Use AutoPilot to Automate Model Development</a>.
 * </p>
 */
public class CreateAutoMLJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies an AutoPilot job. Must be unique to your account and is
     * case-insensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String autoMLJobName;

    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * Minimum of 1000 rows.
     * </p>
     */
    private java.util.List<AutoMLChannel> inputDataConfig;

    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported:
     * CSV.
     * </p>
     */
    private AutoMLOutputDataConfig outputDataConfig;

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the
     * candidates. Options include: BinaryClassification,
     * MulticlassClassification, and Regression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     */
    private String problemType;

    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will
     * infer minimize or maximize. If this is not provided, the most commonly
     * used ObjectiveMetric for problem type will be selected.
     * </p>
     */
    private AutoMLJobObjective autoMLJobObjective;

    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     */
    private AutoMLJobConfig autoMLJobConfig;

    /**
     * <p>
     * The ARN of the role that will be used to access the data.
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
     * This will generate possible candidates without training a model. A
     * candidate is a combination of data preprocessors, algorithms, and
     * algorithm parameter settings.
     * </p>
     */
    private Boolean generateCandidateDefinitionsOnly;

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Identifies an AutoPilot job. Must be unique to your account and is
     * case-insensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         Identifies an AutoPilot job. Must be unique to your account and
     *         is case-insensitive.
     *         </p>
     */
    public String getAutoMLJobName() {
        return autoMLJobName;
    }

    /**
     * <p>
     * Identifies an AutoPilot job. Must be unique to your account and is
     * case-insensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param autoMLJobName <p>
     *            Identifies an AutoPilot job. Must be unique to your account
     *            and is case-insensitive.
     *            </p>
     */
    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Identifies an AutoPilot job. Must be unique to your account and is
     * case-insensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param autoMLJobName <p>
     *            Identifies an AutoPilot job. Must be unique to your account
     *            and is case-insensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
        return this;
    }

    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * Minimum of 1000 rows.
     * </p>
     *
     * @return <p>
     *         Similar to InputDataConfig supported by Tuning. Format(s)
     *         supported: CSV. Minimum of 1000 rows.
     *         </p>
     */
    public java.util.List<AutoMLChannel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * Minimum of 1000 rows.
     * </p>
     *
     * @param inputDataConfig <p>
     *            Similar to InputDataConfig supported by Tuning. Format(s)
     *            supported: CSV. Minimum of 1000 rows.
     *            </p>
     */
    public void setInputDataConfig(java.util.Collection<AutoMLChannel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<AutoMLChannel>(inputDataConfig);
    }

    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * Minimum of 1000 rows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Similar to InputDataConfig supported by Tuning. Format(s)
     *            supported: CSV. Minimum of 1000 rows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withInputDataConfig(AutoMLChannel... inputDataConfig) {
        if (getInputDataConfig() == null) {
            this.inputDataConfig = new java.util.ArrayList<AutoMLChannel>(inputDataConfig.length);
        }
        for (AutoMLChannel value : inputDataConfig) {
            this.inputDataConfig.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
     * Minimum of 1000 rows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Similar to InputDataConfig supported by Tuning. Format(s)
     *            supported: CSV. Minimum of 1000 rows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withInputDataConfig(
            java.util.Collection<AutoMLChannel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported:
     * CSV.
     * </p>
     *
     * @return <p>
     *         Similar to OutputDataConfig supported by Tuning. Format(s)
     *         supported: CSV.
     *         </p>
     */
    public AutoMLOutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported:
     * CSV.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Similar to OutputDataConfig supported by Tuning. Format(s)
     *            supported: CSV.
     *            </p>
     */
    public void setOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Similar to OutputDataConfig supported by Tuning. Format(s) supported:
     * CSV.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Similar to OutputDataConfig supported by Tuning. Format(s)
     *            supported: CSV.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the
     * candidates. Options include: BinaryClassification,
     * MulticlassClassification, and Regression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @return <p>
     *         Defines the kind of preprocessing and algorithms intended for the
     *         candidates. Options include: BinaryClassification,
     *         MulticlassClassification, and Regression.
     *         </p>
     * @see ProblemType
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the
     * candidates. Options include: BinaryClassification,
     * MulticlassClassification, and Regression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Defines the kind of preprocessing and algorithms intended for
     *            the candidates. Options include: BinaryClassification,
     *            MulticlassClassification, and Regression.
     *            </p>
     * @see ProblemType
     */
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the
     * candidates. Options include: BinaryClassification,
     * MulticlassClassification, and Regression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Defines the kind of preprocessing and algorithms intended for
     *            the candidates. Options include: BinaryClassification,
     *            MulticlassClassification, and Regression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProblemType
     */
    public CreateAutoMLJobRequest withProblemType(String problemType) {
        this.problemType = problemType;
        return this;
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the
     * candidates. Options include: BinaryClassification,
     * MulticlassClassification, and Regression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Defines the kind of preprocessing and algorithms intended for
     *            the candidates. Options include: BinaryClassification,
     *            MulticlassClassification, and Regression.
     *            </p>
     * @see ProblemType
     */
    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
    }

    /**
     * <p>
     * Defines the kind of preprocessing and algorithms intended for the
     * candidates. Options include: BinaryClassification,
     * MulticlassClassification, and Regression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            Defines the kind of preprocessing and algorithms intended for
     *            the candidates. Options include: BinaryClassification,
     *            MulticlassClassification, and Regression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProblemType
     */
    public CreateAutoMLJobRequest withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will
     * infer minimize or maximize. If this is not provided, the most commonly
     * used ObjectiveMetric for problem type will be selected.
     * </p>
     *
     * @return <p>
     *         Defines the job's objective. You provide a MetricName and AutoML
     *         will infer minimize or maximize. If this is not provided, the
     *         most commonly used ObjectiveMetric for problem type will be
     *         selected.
     *         </p>
     */
    public AutoMLJobObjective getAutoMLJobObjective() {
        return autoMLJobObjective;
    }

    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will
     * infer minimize or maximize. If this is not provided, the most commonly
     * used ObjectiveMetric for problem type will be selected.
     * </p>
     *
     * @param autoMLJobObjective <p>
     *            Defines the job's objective. You provide a MetricName and
     *            AutoML will infer minimize or maximize. If this is not
     *            provided, the most commonly used ObjectiveMetric for problem
     *            type will be selected.
     *            </p>
     */
    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * <p>
     * Defines the job's objective. You provide a MetricName and AutoML will
     * infer minimize or maximize. If this is not provided, the most commonly
     * used ObjectiveMetric for problem type will be selected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobObjective <p>
     *            Defines the job's objective. You provide a MetricName and
     *            AutoML will infer minimize or maximize. If this is not
     *            provided, the most commonly used ObjectiveMetric for problem
     *            type will be selected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
        return this;
    }

    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     *
     * @return <p>
     *         Contains CompletionCriteria and SecurityConfig.
     *         </p>
     */
    public AutoMLJobConfig getAutoMLJobConfig() {
        return autoMLJobConfig;
    }

    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     *
     * @param autoMLJobConfig <p>
     *            Contains CompletionCriteria and SecurityConfig.
     *            </p>
     */
    public void setAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
    }

    /**
     * <p>
     * Contains CompletionCriteria and SecurityConfig.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobConfig <p>
     *            Contains CompletionCriteria and SecurityConfig.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
        return this;
    }

    /**
     * <p>
     * The ARN of the role that will be used to access the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The ARN of the role that will be used to access the data.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that will be used to access the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that will be used to access the data.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that will be used to access the data.
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
     *            The ARN of the role that will be used to access the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A
     * candidate is a combination of data preprocessors, algorithms, and
     * algorithm parameter settings.
     * </p>
     *
     * @return <p>
     *         This will generate possible candidates without training a model.
     *         A candidate is a combination of data preprocessors, algorithms,
     *         and algorithm parameter settings.
     *         </p>
     */
    public Boolean isGenerateCandidateDefinitionsOnly() {
        return generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A
     * candidate is a combination of data preprocessors, algorithms, and
     * algorithm parameter settings.
     * </p>
     *
     * @return <p>
     *         This will generate possible candidates without training a model.
     *         A candidate is a combination of data preprocessors, algorithms,
     *         and algorithm parameter settings.
     *         </p>
     */
    public Boolean getGenerateCandidateDefinitionsOnly() {
        return generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A
     * candidate is a combination of data preprocessors, algorithms, and
     * algorithm parameter settings.
     * </p>
     *
     * @param generateCandidateDefinitionsOnly <p>
     *            This will generate possible candidates without training a
     *            model. A candidate is a combination of data preprocessors,
     *            algorithms, and algorithm parameter settings.
     *            </p>
     */
    public void setGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * This will generate possible candidates without training a model. A
     * candidate is a combination of data preprocessors, algorithms, and
     * algorithm parameter settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generateCandidateDefinitionsOnly <p>
     *            This will generate possible candidates without training a
     *            model. A candidate is a combination of data preprocessors,
     *            algorithms, and algorithm parameter settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withGenerateCandidateDefinitionsOnly(
            Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     *
     * @return <p>
     *         Each tag consists of a key and an optional value. Tag keys must
     *         be unique per resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
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
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withTags(Tag... tags) {
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
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAutoMLJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: " + getAutoMLJobName() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getProblemType() != null)
            sb.append("ProblemType: " + getProblemType() + ",");
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: " + getAutoMLJobObjective() + ",");
        if (getAutoMLJobConfig() != null)
            sb.append("AutoMLJobConfig: " + getAutoMLJobConfig() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getGenerateCandidateDefinitionsOnly() != null)
            sb.append("GenerateCandidateDefinitionsOnly: " + getGenerateCandidateDefinitionsOnly()
                    + ",");
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
                + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getProblemType() == null) ? 0 : getProblemType().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobConfig() == null) ? 0 : getAutoMLJobConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getGenerateCandidateDefinitionsOnly() == null) ? 0
                        : getGenerateCandidateDefinitionsOnly().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoMLJobRequest == false)
            return false;
        CreateAutoMLJobRequest other = (CreateAutoMLJobRequest) obj;

        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null
                && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
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
        if (other.getProblemType() == null ^ this.getProblemType() == null)
            return false;
        if (other.getProblemType() != null
                && other.getProblemType().equals(this.getProblemType()) == false)
            return false;
        if (other.getAutoMLJobObjective() == null ^ this.getAutoMLJobObjective() == null)
            return false;
        if (other.getAutoMLJobObjective() != null
                && other.getAutoMLJobObjective().equals(this.getAutoMLJobObjective()) == false)
            return false;
        if (other.getAutoMLJobConfig() == null ^ this.getAutoMLJobConfig() == null)
            return false;
        if (other.getAutoMLJobConfig() != null
                && other.getAutoMLJobConfig().equals(this.getAutoMLJobConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() == null
                ^ this.getGenerateCandidateDefinitionsOnly() == null)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() != null
                && other.getGenerateCandidateDefinitionsOnly().equals(
                        this.getGenerateCandidateDefinitionsOnly()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
