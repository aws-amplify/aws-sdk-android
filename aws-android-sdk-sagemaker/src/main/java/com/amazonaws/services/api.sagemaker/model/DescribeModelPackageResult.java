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

public class DescribeModelPackageResult implements Serializable {
    /**
     * <p>
     * The name of the model package being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String modelPackageName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     */
    private String modelPackageArn;

    /**
     * <p>
     * A brief summary of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String modelPackageDescription;

    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Details about inference jobs that can be run with models based on this
     * model package.
     * </p>
     */
    private InferenceSpecification inferenceSpecification;

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     */
    private SourceAlgorithmSpecification sourceAlgorithmSpecification;

    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs
     * to test the model package.
     * </p>
     */
    private ModelPackageValidationSpecification validationSpecification;

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     */
    private String modelPackageStatus;

    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     */
    private ModelPackageStatusDetails modelPackageStatusDetails;

    /**
     * <p>
     * Whether the model package is certified for listing on AWS Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;

    /**
     * <p>
     * The name of the model package being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the model package being described.
     *         </p>
     */
    public String getModelPackageName() {
        return modelPackageName;
    }

    /**
     * <p>
     * The name of the model package being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param modelPackageName <p>
     *            The name of the model package being described.
     *            </p>
     */
    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package being described.
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
     *            The name of the model package being described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model package.
     *         </p>
     */
    public String getModelPackageArn() {
        return modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     *
     * @param modelPackageArn <p>
     *            The Amazon Resource Name (ARN) of the model package.
     *            </p>
     */
    public void setModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     *
     * @param modelPackageArn <p>
     *            The Amazon Resource Name (ARN) of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
        return this;
    }

    /**
     * <p>
     * A brief summary of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A brief summary of the model package.
     *         </p>
     */
    public String getModelPackageDescription() {
        return modelPackageDescription;
    }

    /**
     * <p>
     * A brief summary of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param modelPackageDescription <p>
     *            A brief summary of the model package.
     *            </p>
     */
    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * A brief summary of the model package.
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
     *            A brief summary of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
        return this;
    }

    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     *
     * @return <p>
     *         A timestamp specifying when the model package was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp specifying when the model package was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp specifying when the model package was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Details about inference jobs that can be run with models based on this
     * model package.
     * </p>
     *
     * @return <p>
     *         Details about inference jobs that can be run with models based on
     *         this model package.
     *         </p>
     */
    public InferenceSpecification getInferenceSpecification() {
        return inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that can be run with models based on this
     * model package.
     * </p>
     *
     * @param inferenceSpecification <p>
     *            Details about inference jobs that can be run with models based
     *            on this model package.
     *            </p>
     */
    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that can be run with models based on this
     * model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceSpecification <p>
     *            Details about inference jobs that can be run with models based
     *            on this model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withInferenceSpecification(
            InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
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
    public DescribeModelPackageResult withSourceAlgorithmSpecification(
            SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        this.sourceAlgorithmSpecification = sourceAlgorithmSpecification;
        return this;
    }

    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs
     * to test the model package.
     * </p>
     *
     * @return <p>
     *         Configurations for one or more transform jobs that Amazon
     *         SageMaker runs to test the model package.
     *         </p>
     */
    public ModelPackageValidationSpecification getValidationSpecification() {
        return validationSpecification;
    }

    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs
     * to test the model package.
     * </p>
     *
     * @param validationSpecification <p>
     *            Configurations for one or more transform jobs that Amazon
     *            SageMaker runs to test the model package.
     *            </p>
     */
    public void setValidationSpecification(
            ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs
     * to test the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationSpecification <p>
     *            Configurations for one or more transform jobs that Amazon
     *            SageMaker runs to test the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withValidationSpecification(
            ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
        return this;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @return <p>
     *         The current status of the model package.
     *         </p>
     * @see ModelPackageStatus
     */
    public String getModelPackageStatus() {
        return modelPackageStatus;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The current status of the model package.
     *            </p>
     * @see ModelPackageStatus
     */
    public void setModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The current status of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelPackageStatus
     */
    public DescribeModelPackageResult withModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The current status of the model package.
     *            </p>
     * @see ModelPackageStatus
     */
    public void setModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The current status of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelPackageStatus
     */
    public DescribeModelPackageResult withModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     *
     * @return <p>
     *         Details about the current status of the model package.
     *         </p>
     */
    public ModelPackageStatusDetails getModelPackageStatusDetails() {
        return modelPackageStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     *
     * @param modelPackageStatusDetails <p>
     *            Details about the current status of the model package.
     *            </p>
     */
    public void setModelPackageStatusDetails(ModelPackageStatusDetails modelPackageStatusDetails) {
        this.modelPackageStatusDetails = modelPackageStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelPackageStatusDetails <p>
     *            Details about the current status of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withModelPackageStatusDetails(
            ModelPackageStatusDetails modelPackageStatusDetails) {
        this.modelPackageStatusDetails = modelPackageStatusDetails;
        return this;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether the model package is certified for listing on AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean isCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether the model package is certified for listing on AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean getCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on AWS Marketplace.
     * </p>
     *
     * @param certifyForMarketplace <p>
     *            Whether the model package is certified for listing on AWS
     *            Marketplace.
     *            </p>
     */
    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on AWS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certifyForMarketplace <p>
     *            Whether the model package is certified for listing on AWS
     *            Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeModelPackageResult withCertifyForMarketplace(Boolean certifyForMarketplace) {
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
        if (getModelPackageArn() != null)
            sb.append("ModelPackageArn: " + getModelPackageArn() + ",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: " + getModelPackageDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: " + getInferenceSpecification() + ",");
        if (getSourceAlgorithmSpecification() != null)
            sb.append("SourceAlgorithmSpecification: " + getSourceAlgorithmSpecification() + ",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: " + getValidationSpecification() + ",");
        if (getModelPackageStatus() != null)
            sb.append("ModelPackageStatus: " + getModelPackageStatus() + ",");
        if (getModelPackageStatusDetails() != null)
            sb.append("ModelPackageStatusDetails: " + getModelPackageStatusDetails() + ",");
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
        hashCode = prime * hashCode
                + ((getModelPackageArn() == null) ? 0 : getModelPackageArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceAlgorithmSpecification() == null) ? 0
                        : getSourceAlgorithmSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationSpecification() == null) ? 0 : getValidationSpecification()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getModelPackageStatus() == null) ? 0 : getModelPackageStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getModelPackageStatusDetails() == null) ? 0 : getModelPackageStatusDetails()
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

        if (obj instanceof DescribeModelPackageResult == false)
            return false;
        DescribeModelPackageResult other = (DescribeModelPackageResult) obj;

        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null
                && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        if (other.getModelPackageArn() == null ^ this.getModelPackageArn() == null)
            return false;
        if (other.getModelPackageArn() != null
                && other.getModelPackageArn().equals(this.getModelPackageArn()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null
                && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getInferenceSpecification() == null ^ this.getInferenceSpecification() == null)
            return false;
        if (other.getInferenceSpecification() != null
                && other.getInferenceSpecification().equals(this.getInferenceSpecification()) == false)
            return false;
        if (other.getSourceAlgorithmSpecification() == null
                ^ this.getSourceAlgorithmSpecification() == null)
            return false;
        if (other.getSourceAlgorithmSpecification() != null
                && other.getSourceAlgorithmSpecification().equals(
                        this.getSourceAlgorithmSpecification()) == false)
            return false;
        if (other.getValidationSpecification() == null ^ this.getValidationSpecification() == null)
            return false;
        if (other.getValidationSpecification() != null
                && other.getValidationSpecification().equals(this.getValidationSpecification()) == false)
            return false;
        if (other.getModelPackageStatus() == null ^ this.getModelPackageStatus() == null)
            return false;
        if (other.getModelPackageStatus() != null
                && other.getModelPackageStatus().equals(this.getModelPackageStatus()) == false)
            return false;
        if (other.getModelPackageStatusDetails() == null
                ^ this.getModelPackageStatusDetails() == null)
            return false;
        if (other.getModelPackageStatusDetails() != null
                && other.getModelPackageStatusDetails().equals(this.getModelPackageStatusDetails()) == false)
            return false;
        if (other.getCertifyForMarketplace() == null ^ this.getCertifyForMarketplace() == null)
            return false;
        if (other.getCertifyForMarketplace() != null
                && other.getCertifyForMarketplace().equals(this.getCertifyForMarketplace()) == false)
            return false;
        return true;
    }
}
