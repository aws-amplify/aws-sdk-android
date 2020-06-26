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

public class DescribeEndpointConfigResult implements Serializable {
    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointConfigName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     */
    private String endpointConfigArn;

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     */
    private java.util.List<ProductionVariant> productionVariants;

    /**
     * <p/>
     */
    private DataCaptureConfig dataCaptureConfig;

    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on
     * the ML storage volume attached to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         Name of the Amazon SageMaker endpoint configuration.
     *         </p>
     */
    public String getEndpointConfigName() {
        return endpointConfigName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            Name of the Amazon SageMaker endpoint configuration.
     *            </p>
     */
    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            Name of the Amazon SageMaker endpoint configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointConfigResult withEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the endpoint configuration.
     *         </p>
     */
    public String getEndpointConfigArn() {
        return endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     *
     * @param endpointConfigArn <p>
     *            The Amazon Resource Name (ARN) of the endpoint configuration.
     *            </p>
     */
    public void setEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint-config/.*
     * <br/>
     *
     * @param endpointConfigArn <p>
     *            The Amazon Resource Name (ARN) of the endpoint configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointConfigResult withEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
        return this;
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     *
     * @return <p>
     *         An array of <code>ProductionVariant</code> objects, one for each
     *         model that you want to host at this endpoint.
     *         </p>
     */
    public java.util.List<ProductionVariant> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     *
     * @param productionVariants <p>
     *            An array of <code>ProductionVariant</code> objects, one for
     *            each model that you want to host at this endpoint.
     *            </p>
     */
    public void setProductionVariants(java.util.Collection<ProductionVariant> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<ProductionVariant>(productionVariants);
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productionVariants <p>
     *            An array of <code>ProductionVariant</code> objects, one for
     *            each model that you want to host at this endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointConfigResult withProductionVariants(
            ProductionVariant... productionVariants) {
        if (getProductionVariants() == null) {
            this.productionVariants = new java.util.ArrayList<ProductionVariant>(
                    productionVariants.length);
        }
        for (ProductionVariant value : productionVariants) {
            this.productionVariants.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productionVariants <p>
     *            An array of <code>ProductionVariant</code> objects, one for
     *            each model that you want to host at this endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointConfigResult withProductionVariants(
            java.util.Collection<ProductionVariant> productionVariants) {
        setProductionVariants(productionVariants);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public DataCaptureConfig getDataCaptureConfig() {
        return dataCaptureConfig;
    }

    /**
     * <p/>
     *
     * @param dataCaptureConfig <p/>
     */
    public void setDataCaptureConfig(DataCaptureConfig dataCaptureConfig) {
        this.dataCaptureConfig = dataCaptureConfig;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataCaptureConfig <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointConfigResult withDataCaptureConfig(DataCaptureConfig dataCaptureConfig) {
        this.dataCaptureConfig = dataCaptureConfig;
        return this;
    }

    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on
     * the ML storage volume attached to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         AWS KMS key ID Amazon SageMaker uses to encrypt data when storing
     *         it on the ML storage volume attached to the instance.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on
     * the ML storage volume attached to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            AWS KMS key ID Amazon SageMaker uses to encrypt data when
     *            storing it on the ML storage volume attached to the instance.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on
     * the ML storage volume attached to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            AWS KMS key ID Amazon SageMaker uses to encrypt data when
     *            storing it on the ML storage volume attached to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointConfigResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the endpoint configuration was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the endpoint configuration was
     *            created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the endpoint configuration was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointConfigResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: " + getEndpointConfigName() + ",");
        if (getEndpointConfigArn() != null)
            sb.append("EndpointConfigArn: " + getEndpointConfigArn() + ",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: " + getProductionVariants() + ",");
        if (getDataCaptureConfig() != null)
            sb.append("DataCaptureConfig: " + getDataCaptureConfig() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointConfigArn() == null) ? 0 : getEndpointConfigArn().hashCode());
        hashCode = prime * hashCode
                + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode
                + ((getDataCaptureConfig() == null) ? 0 : getDataCaptureConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointConfigResult == false)
            return false;
        DescribeEndpointConfigResult other = (DescribeEndpointConfigResult) obj;

        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null
                && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getEndpointConfigArn() == null ^ this.getEndpointConfigArn() == null)
            return false;
        if (other.getEndpointConfigArn() != null
                && other.getEndpointConfigArn().equals(this.getEndpointConfigArn()) == false)
            return false;
        if (other.getProductionVariants() == null ^ this.getProductionVariants() == null)
            return false;
        if (other.getProductionVariants() != null
                && other.getProductionVariants().equals(this.getProductionVariants()) == false)
            return false;
        if (other.getDataCaptureConfig() == null ^ this.getDataCaptureConfig() == null)
            return false;
        if (other.getDataCaptureConfig() != null
                && other.getDataCaptureConfig().equals(this.getDataCaptureConfig()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
