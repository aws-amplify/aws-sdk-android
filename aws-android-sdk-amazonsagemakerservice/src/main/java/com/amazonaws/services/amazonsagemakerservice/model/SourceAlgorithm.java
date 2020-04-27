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

/**
 * <p>
 * Specifies an algorithm that was used to create the model package. The
 * algorithm must be either an algorithm resource in your Amazon SageMaker
 * account or an algorithm in AWS Marketplace that you are subscribed to.
 * </p>
 */
public class SourceAlgorithm implements Serializable {
    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model
     * training, are stored. This path must point to a single <code>gzip</code>
     * compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String modelDataUrl;

    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The
     * algorithm must be either an algorithm resource in your Amazon SageMaker
     * account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     */
    private String algorithmName;

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model
     * training, are stored. This path must point to a single <code>gzip</code>
     * compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The Amazon S3 path where the model artifacts, which result from
     *         model training, are stored. This path must point to a single
     *         <code>gzip</code> compressed tar archive (<code>.tar.gz</code>
     *         suffix).
     *         </p>
     */
    public String getModelDataUrl() {
        return modelDataUrl;
    }

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model
     * training, are stored. This path must point to a single <code>gzip</code>
     * compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param modelDataUrl <p>
     *            The Amazon S3 path where the model artifacts, which result
     *            from model training, are stored. This path must point to a
     *            single <code>gzip</code> compressed tar archive (
     *            <code>.tar.gz</code> suffix).
     *            </p>
     */
    public void setModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model
     * training, are stored. This path must point to a single <code>gzip</code>
     * compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param modelDataUrl <p>
     *            The Amazon S3 path where the model artifacts, which result
     *            from model training, are stored. This path must point to a
     *            single <code>gzip</code> compressed tar archive (
     *            <code>.tar.gz</code> suffix).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceAlgorithm withModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
        return this;
    }

    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The
     * algorithm must be either an algorithm resource in your Amazon SageMaker
     * account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @return <p>
     *         The name of an algorithm that was used to create the model
     *         package. The algorithm must be either an algorithm resource in
     *         your Amazon SageMaker account or an algorithm in AWS Marketplace
     *         that you are subscribed to.
     *         </p>
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The
     * algorithm must be either an algorithm resource in your Amazon SageMaker
     * account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param algorithmName <p>
     *            The name of an algorithm that was used to create the model
     *            package. The algorithm must be either an algorithm resource in
     *            your Amazon SageMaker account or an algorithm in AWS
     *            Marketplace that you are subscribed to.
     *            </p>
     */
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The
     * algorithm must be either an algorithm resource in your Amazon SageMaker
     * account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param algorithmName <p>
     *            The name of an algorithm that was used to create the model
     *            package. The algorithm must be either an algorithm resource in
     *            your Amazon SageMaker account or an algorithm in AWS
     *            Marketplace that you are subscribed to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceAlgorithm withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
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
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: " + getModelDataUrl() + ",");
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: " + getAlgorithmName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAlgorithm == false)
            return false;
        SourceAlgorithm other = (SourceAlgorithm) obj;

        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null
                && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
            return false;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null
                && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        return true;
    }
}
