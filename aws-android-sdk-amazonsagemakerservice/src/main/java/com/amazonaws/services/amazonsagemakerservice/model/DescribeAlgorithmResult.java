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

public class DescribeAlgorithmResult implements Serializable {
    /**
     * <p>
     * The name of the algorithm being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String algorithmName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     */
    private String algorithmArn;

    /**
     * <p>
     * A brief summary about the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String algorithmDescription;

    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     */
    private TrainingSpecification trainingSpecification;

    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     */
    private InferenceSpecification inferenceSpecification;

    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon
     * SageMaker runs to test the algorithm.
     * </p>
     */
    private AlgorithmValidationSpecification validationSpecification;

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     */
    private String algorithmStatus;

    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     */
    private AlgorithmStatusDetails algorithmStatusDetails;

    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String productId;

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;

    /**
     * <p>
     * The name of the algorithm being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the algorithm being described.
     *         </p>
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm being described.
     *            </p>
     */
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm being described.
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
     *            The name of the algorithm being described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the algorithm.
     *         </p>
     */
    public String getAlgorithmArn() {
        return algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm.
     *            </p>
     */
    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
        return this;
    }

    /**
     * <p>
     * A brief summary about the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A brief summary about the algorithm.
     *         </p>
     */
    public String getAlgorithmDescription() {
        return algorithmDescription;
    }

    /**
     * <p>
     * A brief summary about the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param algorithmDescription <p>
     *            A brief summary about the algorithm.
     *            </p>
     */
    public void setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
    }

    /**
     * <p>
     * A brief summary about the algorithm.
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
     *            A brief summary about the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
        return this;
    }

    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     *
     * @return <p>
     *         A timestamp specifying when the algorithm was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp specifying when the algorithm was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp specifying when the algorithm was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     *
     * @return <p>
     *         Details about training jobs run by this algorithm.
     *         </p>
     */
    public TrainingSpecification getTrainingSpecification() {
        return trainingSpecification;
    }

    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     *
     * @param trainingSpecification <p>
     *            Details about training jobs run by this algorithm.
     *            </p>
     */
    public void setTrainingSpecification(TrainingSpecification trainingSpecification) {
        this.trainingSpecification = trainingSpecification;
    }

    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingSpecification <p>
     *            Details about training jobs run by this algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withTrainingSpecification(
            TrainingSpecification trainingSpecification) {
        this.trainingSpecification = trainingSpecification;
        return this;
    }

    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     *
     * @return <p>
     *         Details about inference jobs that the algorithm runs.
     *         </p>
     */
    public InferenceSpecification getInferenceSpecification() {
        return inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     *
     * @param inferenceSpecification <p>
     *            Details about inference jobs that the algorithm runs.
     *            </p>
     */
    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceSpecification <p>
     *            Details about inference jobs that the algorithm runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withInferenceSpecification(
            InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
        return this;
    }

    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon
     * SageMaker runs to test the algorithm.
     * </p>
     *
     * @return <p>
     *         Details about configurations for one or more training jobs that
     *         Amazon SageMaker runs to test the algorithm.
     *         </p>
     */
    public AlgorithmValidationSpecification getValidationSpecification() {
        return validationSpecification;
    }

    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon
     * SageMaker runs to test the algorithm.
     * </p>
     *
     * @param validationSpecification <p>
     *            Details about configurations for one or more training jobs
     *            that Amazon SageMaker runs to test the algorithm.
     *            </p>
     */
    public void setValidationSpecification(AlgorithmValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon
     * SageMaker runs to test the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationSpecification <p>
     *            Details about configurations for one or more training jobs
     *            that Amazon SageMaker runs to test the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withValidationSpecification(
            AlgorithmValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
        return this;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @return <p>
     *         The current status of the algorithm.
     *         </p>
     * @see AlgorithmStatus
     */
    public String getAlgorithmStatus() {
        return algorithmStatus;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The current status of the algorithm.
     *            </p>
     * @see AlgorithmStatus
     */
    public void setAlgorithmStatus(String algorithmStatus) {
        this.algorithmStatus = algorithmStatus;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The current status of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmStatus
     */
    public DescribeAlgorithmResult withAlgorithmStatus(String algorithmStatus) {
        this.algorithmStatus = algorithmStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The current status of the algorithm.
     *            </p>
     * @see AlgorithmStatus
     */
    public void setAlgorithmStatus(AlgorithmStatus algorithmStatus) {
        this.algorithmStatus = algorithmStatus.toString();
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param algorithmStatus <p>
     *            The current status of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmStatus
     */
    public DescribeAlgorithmResult withAlgorithmStatus(AlgorithmStatus algorithmStatus) {
        this.algorithmStatus = algorithmStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     *
     * @return <p>
     *         Details about the current status of the algorithm.
     *         </p>
     */
    public AlgorithmStatusDetails getAlgorithmStatusDetails() {
        return algorithmStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     *
     * @param algorithmStatusDetails <p>
     *            Details about the current status of the algorithm.
     *            </p>
     */
    public void setAlgorithmStatusDetails(AlgorithmStatusDetails algorithmStatusDetails) {
        this.algorithmStatusDetails = algorithmStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmStatusDetails <p>
     *            Details about the current status of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withAlgorithmStatusDetails(
            AlgorithmStatusDetails algorithmStatusDetails) {
        this.algorithmStatusDetails = algorithmStatusDetails;
        return this;
    }

    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The product identifier of the algorithm.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param productId <p>
     *            The product identifier of the algorithm.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param productId <p>
     *            The product identifier of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether the algorithm is certified to be listed in AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean isCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         Whether the algorithm is certified to be listed in AWS
     *         Marketplace.
     *         </p>
     */
    public Boolean getCertifyForMarketplace() {
        return certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     *
     * @param certifyForMarketplace <p>
     *            Whether the algorithm is certified to be listed in AWS
     *            Marketplace.
     *            </p>
     */
    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certifyForMarketplace <p>
     *            Whether the algorithm is certified to be listed in AWS
     *            Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlgorithmResult withCertifyForMarketplace(Boolean certifyForMarketplace) {
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
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: " + getAlgorithmArn() + ",");
        if (getAlgorithmDescription() != null)
            sb.append("AlgorithmDescription: " + getAlgorithmDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTrainingSpecification() != null)
            sb.append("TrainingSpecification: " + getTrainingSpecification() + ",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: " + getInferenceSpecification() + ",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: " + getValidationSpecification() + ",");
        if (getAlgorithmStatus() != null)
            sb.append("AlgorithmStatus: " + getAlgorithmStatus() + ",");
        if (getAlgorithmStatusDetails() != null)
            sb.append("AlgorithmStatusDetails: " + getAlgorithmStatusDetails() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
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
                + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmDescription() == null) ? 0 : getAlgorithmDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
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
        hashCode = prime * hashCode
                + ((getAlgorithmStatus() == null) ? 0 : getAlgorithmStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlgorithmStatusDetails() == null) ? 0 : getAlgorithmStatusDetails()
                        .hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
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

        if (obj instanceof DescribeAlgorithmResult == false)
            return false;
        DescribeAlgorithmResult other = (DescribeAlgorithmResult) obj;

        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null
                && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null
                && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getAlgorithmDescription() == null ^ this.getAlgorithmDescription() == null)
            return false;
        if (other.getAlgorithmDescription() != null
                && other.getAlgorithmDescription().equals(this.getAlgorithmDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getAlgorithmStatus() == null ^ this.getAlgorithmStatus() == null)
            return false;
        if (other.getAlgorithmStatus() != null
                && other.getAlgorithmStatus().equals(this.getAlgorithmStatus()) == false)
            return false;
        if (other.getAlgorithmStatusDetails() == null ^ this.getAlgorithmStatusDetails() == null)
            return false;
        if (other.getAlgorithmStatusDetails() != null
                && other.getAlgorithmStatusDetails().equals(this.getAlgorithmStatusDetails()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getCertifyForMarketplace() == null ^ this.getCertifyForMarketplace() == null)
            return false;
        if (other.getCertifyForMarketplace() != null
                && other.getCertifyForMarketplace().equals(this.getCertifyForMarketplace()) == false)
            return false;
        return true;
    }
}
