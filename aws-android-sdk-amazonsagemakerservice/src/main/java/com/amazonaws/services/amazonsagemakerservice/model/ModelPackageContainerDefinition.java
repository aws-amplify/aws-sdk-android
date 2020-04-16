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
 * Describes the Docker container for the model package.
 * </p>
 */
public class ModelPackageContainerDefinition implements Serializable {
    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String containerHostname;

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm
     * provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String image;

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     */
    private String imageDigest;

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
     * The AWS Marketplace product ID of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String productId;

    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The DNS host name for the Docker container.
     *         </p>
     */
    public String getContainerHostname() {
        return containerHostname;
    }

    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param containerHostname <p>
     *            The DNS host name for the Docker container.
     *            </p>
     */
    public void setContainerHostname(String containerHostname) {
        this.containerHostname = containerHostname;
    }

    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param containerHostname <p>
     *            The DNS host name for the Docker container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageContainerDefinition withContainerHostname(String containerHostname) {
        this.containerHostname = containerHostname;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm
     * provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The Amazon EC2 Container Registry (Amazon ECR) path where
     *         inference code is stored.
     *         </p>
     *         <p>
     *         If you are using your own custom algorithm instead of an
     *         algorithm provided by Amazon SageMaker, the inference code must
     *         meet Amazon SageMaker requirements. Amazon SageMaker supports
     *         both <code>registry/repository[:tag]</code> and
     *         <code>registry/repository[@digest]</code> image path formats. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *         >Using Your Own Algorithms with Amazon SageMaker</a>.
     *         </p>
     */
    public String getImage() {
        return image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm
     * provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param image <p>
     *            The Amazon EC2 Container Registry (Amazon ECR) path where
     *            inference code is stored.
     *            </p>
     *            <p>
     *            If you are using your own custom algorithm instead of an
     *            algorithm provided by Amazon SageMaker, the inference code
     *            must meet Amazon SageMaker requirements. Amazon SageMaker
     *            supports both <code>registry/repository[:tag]</code> and
     *            <code>registry/repository[@digest]</code> image path formats.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>.
     *            </p>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code
     * is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm
     * provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param image <p>
     *            The Amazon EC2 Container Registry (Amazon ECR) path where
     *            inference code is stored.
     *            </p>
     *            <p>
     *            If you are using your own custom algorithm instead of an
     *            algorithm provided by Amazon SageMaker, the inference code
     *            must meet Amazon SageMaker requirements. Amazon SageMaker
     *            supports both <code>registry/repository[:tag]</code> and
     *            <code>registry/repository[@digest]</code> image path formats.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageContainerDefinition withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     *
     * @return <p>
     *         An MD5 hash of the training algorithm that identifies the Docker
     *         image used for training.
     *         </p>
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     *
     * @param imageDigest <p>
     *            An MD5 hash of the training algorithm that identifies the
     *            Docker image used for training.
     *            </p>
     */
    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     *
     * @param imageDigest <p>
     *            An MD5 hash of the training algorithm that identifies the
     *            Docker image used for training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageContainerDefinition withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
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
    public ModelPackageContainerDefinition withModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
        return this;
    }

    /**
     * <p>
     * The AWS Marketplace product ID of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The AWS Marketplace product ID of the model package.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The AWS Marketplace product ID of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param productId <p>
     *            The AWS Marketplace product ID of the model package.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The AWS Marketplace product ID of the model package.
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
     *            The AWS Marketplace product ID of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageContainerDefinition withProductId(String productId) {
        this.productId = productId;
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
        if (getContainerHostname() != null)
            sb.append("ContainerHostname: " + getContainerHostname() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getImageDigest() != null)
            sb.append("ImageDigest: " + getImageDigest() + ",");
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: " + getModelDataUrl() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerHostname() == null) ? 0 : getContainerHostname().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode
                + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode
                + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackageContainerDefinition == false)
            return false;
        ModelPackageContainerDefinition other = (ModelPackageContainerDefinition) obj;

        if (other.getContainerHostname() == null ^ this.getContainerHostname() == null)
            return false;
        if (other.getContainerHostname() != null
                && other.getContainerHostname().equals(this.getContainerHostname()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null
                && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null
                && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        return true;
    }
}
