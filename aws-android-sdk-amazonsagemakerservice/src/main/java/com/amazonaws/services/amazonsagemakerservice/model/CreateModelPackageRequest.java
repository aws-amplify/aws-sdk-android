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
 * Creates a model package that you can use to create Amazon SageMaker models or
 * list on AWS Marketplace. Buyers can subscribe to model packages listed on AWS
 * Marketplace to create models in Amazon SageMaker.
 * </p>
 * <p>
 * To create a model package by specifying a Docker container that contains your
 * inference code and the Amazon S3 location of your model artifacts, provide
 * values for <code>InferenceSpecification</code>. To create a model from an
 * algorithm resource that you created or subscribed to in AWS Marketplace,
 * provide a value for <code>SourceAlgorithmSpecification</code>.
 * </p>
 */
public class CreateModelPackageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String modelPackageName;

    /**
     * <p>
     * A description of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String modelPackageDescription;

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based
     * on this model package, including the following:
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
     * The instance types that the model package supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     */
    private InferenceSpecification inferenceSpecification;

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon
     * SageMaker runs to test the model package.
     * </p>
     */
    private ModelPackageValidationSpecification validationSpecification;

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     */
    private SourceAlgorithmSpecification sourceAlgorithmSpecification;

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the model package. The name must have 1 to 63
     *         characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     *         </p>
     */
    public String getModelPackageName() {
        return modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param modelPackageName <p>
     *            The name of the model package. The name must have 1 to 63
     *            characters. Valid characters are a-z, A-Z, 0-9, and -
     *            (hyphen).
     *            </p>
     */
    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param modelPackageName <p>
     *            The name of the model package. The name must have 1 to 63
     *            characters. Valid characters are a-z, A-Z, 0-9, and -
     *            (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelPackageRequest withModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
        return this;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A description of the model package.
     *         </p>
     */
    public String getModelPackageDescription() {
        return modelPackageDescription;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param modelPackageDescription <p>
     *            A description of the model package.
     *            </p>
     */
    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param modelPackageDescription <p>
     *            A description of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelPackageRequest withModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
        return this;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based
     * on this model package, including the following:
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
     * The instance types that the model package supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies details about inference jobs that can be run with
     *         models based on this model package, including the following:
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
     *         The instance types that the model package supports for transform
     *         jobs and real-time endpoints used for inference.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The input and output content formats that the model package
     *         supports for inference.
     *         </p>
     *         </li>
     *         </ul>
     */
    public InferenceSpecification getInferenceSpecification() {
        return inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based
     * on this model package, including the following:
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
     * The instance types that the model package supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     *
     * @param inferenceSpecification <p>
     *            Specifies details about inference jobs that can be run with
     *            models based on this model package, including the following:
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
     *            The instance types that the model package supports for
     *            transform jobs and real-time endpoints used for inference.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The input and output content formats that the model package
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
     * Specifies details about inference jobs that can be run with models based
     * on this model package, including the following:
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
     * The instance types that the model package supports for transform jobs and
     * real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for
     * inference.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceSpecification <p>
     *            Specifies details about inference jobs that can be run with
     *            models based on this model package, including the following:
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
     *            The instance types that the model package supports for
     *            transform jobs and real-time endpoints used for inference.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The input and output content formats that the model package
     *            supports for inference.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelPackageRequest withInferenceSpecification(
            InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
        return this;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon
     * SageMaker runs to test the model package.
     * </p>
     *
     * @return <p>
     *         Specifies configurations for one or more transform jobs that
     *         Amazon SageMaker runs to test the model package.
     *         </p>
     */
    public ModelPackageValidationSpecification getValidationSpecification() {
        return validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon
     * SageMaker runs to test the model package.
     * </p>
     *
     * @param validationSpecification <p>
     *            Specifies configurations for one or more transform jobs that
     *            Amazon SageMaker runs to test the model package.
     *            </p>
     */
    public void setValidationSpecification(
            ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon
     * SageMaker runs to test the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationSpecification <p>
     *            Specifies configurations for one or more transform jobs that
     *            Amazon SageMaker runs to test the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelPackageRequest withValidationSpecification(
            ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
        return this;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     *
     * @return <p>
     *         Details about the algorithm that was used to create the model
     *         package.
     *         </p>
     */
    public SourceAlgorithmSpecification getSourceAlgorithmSpecification() {
        return sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     *
     * @param sourceAlgorithmSpecification <p>
     *            Details about the algorithm that was used to create the model
     *            package.
     *            </p>
     */
    public void setSourceAlgorithmSpecification(
            SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        this.sourceAlgorithmSpecification = sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceAlgorithmSpecification <p>
     *            Details about the algorithm that was used to create the model
     *            package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelPackageRequest withSourceAlgorithmSpecification(
            SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        this.sourceAlgorithmSpecification = sourceAlgorithmSpecification;
        return this;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether to certify the model package for listing on AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean isCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether to certify the model package for listing on AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean getCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     *
     * @param certifyForMarketplace <p>
     *            Whether to certify the model package for listing on AWS
     *            Marketplace.
     *            </p>
     */
    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certifyForMarketplace <p>
     *            Whether to certify the model package for listing on AWS
     *            Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelPackageRequest withCertifyForMarketplace(Boolean certifyForMarketplace) {
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
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: " + getModelPackageName() + ",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: " + getModelPackageDescription() + ",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: " + getInferenceSpecification() + ",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: " + getValidationSpecification() + ",");
        if (getSourceAlgorithmSpecification() != null)
            sb.append("SourceAlgorithmSpecification: " + getSourceAlgorithmSpecification() + ",");
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
                + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        hashCode = prime
                * hashCode
                + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription()
                        .hashCode());
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
                + ((getSourceAlgorithmSpecification() == null) ? 0
                        : getSourceAlgorithmSpecification().hashCode());
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

        if (obj instanceof CreateModelPackageRequest == false)
            return false;
        CreateModelPackageRequest other = (CreateModelPackageRequest) obj;

        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null
                && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null
                && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
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
        if (other.getSourceAlgorithmSpecification() == null
                ^ this.getSourceAlgorithmSpecification() == null)
            return false;
        if (other.getSourceAlgorithmSpecification() != null
                && other.getSourceAlgorithmSpecification().equals(
                        this.getSourceAlgorithmSpecification()) == false)
            return false;
        if (other.getCertifyForMarketplace() == null ^ this.getCertifyForMarketplace() == null)
            return false;
        if (other.getCertifyForMarketplace() != null
                && other.getCertifyForMarketplace().equals(this.getCertifyForMarketplace()) == false)
            return false;
        return true;
    }
}
