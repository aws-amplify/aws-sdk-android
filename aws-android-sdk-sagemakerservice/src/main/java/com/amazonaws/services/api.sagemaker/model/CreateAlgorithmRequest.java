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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a machine learning algorithm that you can use in Amazon SageMaker and
 * list in the AWS Marketplace.
 * </p>
 */
public class CreateAlgorithmRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String algorithmName;

    /**
     * <p>
     * A description of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String algorithmDescription;

    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective
     * metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For
     * example, an algorithm might support <code>train</code>,
     * <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     */
    private TrainingSpecification trainingSpecification;

    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and
     * model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     */
    private InferenceSpecification inferenceSpecification;

    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon
     * SageMaker runs to test the algorithm's training code and, optionally, one
     * or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     */
    private AlgorithmValidationSpecification validationSpecification;

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS
     * Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the algorithm.
     *         </p>
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm.
     *            </p>
     */
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAlgorithmRequest withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }

    /**
     * <p>
     * A description of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A description of the algorithm.
     *         </p>
     */
    public String getAlgorithmDescription() {
        return algorithmDescription;
    }

    /**
     * <p>
     * A description of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param algorithmDescription <p>
     *            A description of the algorithm.
     *            </p>
     */
    public void setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
    }

    /**
     * <p>
     * A description of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param algorithmDescription <p>
     *            A description of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAlgorithmRequest withAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
        return this;
    }

    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective
     * metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For
     * example, an algorithm might support <code>train</code>,
     * <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies details about training jobs run by this algorithm,
     *         including the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The Amazon ECR path of the container and the version digest of
     *         the algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The hyperparameters that the algorithm supports.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance types that the algorithm supports for training.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Whether the algorithm supports distributed training.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The metrics that the algorithm emits to Amazon CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Which metrics that the algorithm emits can be used as the
     *         objective metric for hyperparameter tuning jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The input channels that the algorithm supports for training data.
     *         For example, an algorithm might support <code>train</code>,
     *         <code>validation</code>, and <code>test</code> channels.
     *         </p>
     *         </li>
     *         </ul>
     */
    public TrainingSpecification getTrainingSpecification() {
        return trainingSpecification;
    }

    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective
     * metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For
     * example, an algorithm might support <code>train</code>,
     * <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     *
     * @param trainingSpecification <p>
     *            Specifies details about training jobs run by this algorithm,
     *            including the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The Amazon ECR path of the container and the version digest of
     *            the algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The hyperparameters that the algorithm supports.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The instance types that the algorithm supports for training.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Whether the algorithm supports distributed training.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The metrics that the algorithm emits to Amazon CloudWatch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Which metrics that the algorithm emits can be used as the
     *            objective metric for hyperparameter tuning jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The input channels that the algorithm supports for training
     *            data. For example, an algorithm might support
     *            <code>train</code>, <code>validation</code>, and
     *            <code>test</code> channels.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTrainingSpecification(TrainingSpecification trainingSpecification) {
        this.trainingSpecification = trainingSpecification;
    }

    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective
     * metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For
     * example, an algorithm might support <code>train</code>,
     * <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingSpecification <p>
     *            Specifies details about training jobs run by this algorithm,
     *            including the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The Amazon ECR path of the container and the version digest of
     *            the algorithm.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The hyperparameters that the algorithm supports.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The instance types that the algorithm supports for training.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Whether the algorithm supports distributed training.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The metrics that the algorithm emits to Amazon CloudWatch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Which metrics that the algorithm emits can be used as the
     *            objective metric for hyperparameter tuning jobs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The input channels that the algorithm supports for training
     *            data. For example, an algorithm might support
     *            <code>train</code>, <code>validation</code>, and
     *            <code>test</code> channels.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAlgorithmRequest withTrainingSpecification(
            TrainingSpecification trainingSpecification) {
        this.trainingSpecification = trainingSpecification;
        return this;
    }

    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and
     * model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies details about inference jobs that the algorithm runs,
     *         including the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The Amazon ECR paths of containers that contain the inference
     *         code and model artifacts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance types that the algorithm supports for transform jobs
     *         and real-time endpoints used for inference.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The input and output content formats that the algorithm supports
     *         for inference.
     *         </p>
     *         </li>
     *         </ul>
     */
    public InferenceSpecification getInferenceSpecification() {
        return inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and
     * model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     *
     * @param inferenceSpecification <p>
     *            Specifies details about inference jobs that the algorithm
     *            runs, including the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The Amazon ECR paths of containers that contain the inference
     *            code and model artifacts.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The instance types that the algorithm supports for transform
     *            jobs and real-time endpoints used for inference.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The input and output content formats that the algorithm
     *            supports for inference.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and
     * model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceSpecification <p>
     *            Specifies details about inference jobs that the algorithm
     *            runs, including the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The Amazon ECR paths of containers that contain the inference
     *            code and model artifacts.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The instance types that the algorithm supports for transform
     *            jobs and real-time endpoints used for inference.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The input and output content formats that the algorithm
     *            supports for inference.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAlgorithmRequest withInferenceSpecification(
            InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
        return this;
    }

    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon
     * SageMaker runs to test the algorithm's training code and, optionally, one
     * or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     *
     * @return <p>
     *         Specifies configurations for one or more training jobs and that
     *         Amazon SageMaker runs to test the algorithm's training code and,
     *         optionally, one or more batch transform jobs that Amazon
     *         SageMaker runs to test the algorithm's inference code.
     *         </p>
     */
    public AlgorithmValidationSpecification getValidationSpecification() {
        return validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon
     * SageMaker runs to test the algorithm's training code and, optionally, one
     * or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     *
     * @param validationSpecification <p>
     *            Specifies configurations for one or more training jobs and
     *            that Amazon SageMaker runs to test the algorithm's training
     *            code and, optionally, one or more batch transform jobs that
     *            Amazon SageMaker runs to test the algorithm's inference code.
     *            </p>
     */
    public void setValidationSpecification(AlgorithmValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon
     * SageMaker runs to test the algorithm's training code and, optionally, one
     * or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationSpecification <p>
     *            Specifies configurations for one or more training jobs and
     *            that Amazon SageMaker runs to test the algorithm's training
     *            code and, optionally, one or more batch transform jobs that
     *            Amazon SageMaker runs to test the algorithm's inference code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAlgorithmRequest withValidationSpecification(
            AlgorithmValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
        return this;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS
     * Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether to certify the algorithm so that it can be listed in AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean isCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS
     * Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether to certify the algorithm so that it can be listed in AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean getCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS
     * Marketplace.
     * </p>
     *
     * @param certifyForMarketplace <p>
     *            Whether to certify the algorithm so that it can be listed in
     *            AWS Marketplace.
     *            </p>
     */
    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS
     * Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certifyForMarketplace <p>
     *            Whether to certify the algorithm so that it can be listed in
     *            AWS Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAlgorithmRequest withCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
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
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: " + getAlgorithmName() + ",");
        if (getAlgorithmDescription() != null)
            sb.append("AlgorithmDescription: " + getAlgorithmDescription() + ",");
        if (getTrainingSpecification() != null)
            sb.append("TrainingSpecification: " + getTrainingSpecification() + ",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: " + getInferenceSpecification() + ",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: " + getValidationSpecification() + ",");
        if (getCertifyForMarketplace() != null)
            sb.append("CertifyForMarketplace: " + getCertifyForMarketplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmDescription() == null) ? 0 : getAlgorithmDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingSpecification() == null) ? 0 : getTrainingSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationSpecification() == null) ? 0 : getValidationSpecification()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCertifyForMarketplace() == null) ? 0 : getCertifyForMarketplace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAlgorithmRequest == false)
            return false;
        CreateAlgorithmRequest other = (CreateAlgorithmRequest) obj;

        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null
                && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getAlgorithmDescription() == null ^ this.getAlgorithmDescription() == null)
            return false;
        if (other.getAlgorithmDescription() != null
                && other.getAlgorithmDescription().equals(this.getAlgorithmDescription()) == false)
            return false;
        if (other.getTrainingSpecification() == null ^ this.getTrainingSpecification() == null)
            return false;
        if (other.getTrainingSpecification() != null
                && other.getTrainingSpecification().equals(this.getTrainingSpecification()) == false)
            return false;
        if (other.getInferenceSpecification() == null ^ this.getInferenceSpecification() == null)
            return false;
        if (other.getInferenceSpecification() != null
                && other.getInferenceSpecification().equals(this.getInferenceSpecification()) == false)
            return false;
        if (other.getValidationSpecification() == null ^ this.getValidationSpecification() == null)
            return false;
        if (other.getValidationSpecification() != null
                && other.getValidationSpecification().equals(this.getValidationSpecification()) == false)
            return false;
        if (other.getCertifyForMarketplace() == null ^ this.getCertifyForMarketplace() == null)
            return false;
        if (other.getCertifyForMarketplace() != null
                && other.getCertifyForMarketplace().equals(this.getCertifyForMarketplace()) == false)
            return false;
        return true;
    }
}
