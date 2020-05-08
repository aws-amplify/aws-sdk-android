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

/**
 * <p>
 * The instance type and the Amazon Resource Name (ARN) of the SageMaker image
 * created on the instance. The ARN is stored as metadata in Amazon SageMaker
 * Studio notebooks.
 * </p>
 */
public class ResourceSpec implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>^arn:aws(-[\w]+)*:sagemaker:.+:[0-9]{12}:image/[a-z0-9]([-
     * .]?[a-z0-9])*$<br/>
     */
    private String sageMakerImageArn;

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, ml.t3.micro, ml.t3.small, ml.t3.medium,
     * ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge, ml.m5.large, ml.m5.xlarge,
     * ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.8xlarge, ml.m5.12xlarge,
     * ml.m5.16xlarge, ml.m5.24xlarge, ml.c5.large, ml.c5.xlarge, ml.c5.2xlarge,
     * ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.12xlarge, ml.c5.18xlarge,
     * ml.c5.24xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.g4dn.xlarge, ml.g4dn.2xlarge, ml.g4dn.4xlarge, ml.g4dn.8xlarge,
     * ml.g4dn.12xlarge, ml.g4dn.16xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>^arn:aws(-[\w]+)*:sagemaker:.+:[0-9]{12}:image/[a-z0-9]([-
     * .]?[a-z0-9])*$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SageMaker image created on
     *         the instance.
     *         </p>
     */
    public String getSageMakerImageArn() {
        return sageMakerImageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>^arn:aws(-[\w]+)*:sagemaker:.+:[0-9]{12}:image/[a-z0-9]([-
     * .]?[a-z0-9])*$<br/>
     *
     * @param sageMakerImageArn <p>
     *            The Amazon Resource Name (ARN) of the SageMaker image created
     *            on the instance.
     *            </p>
     */
    public void setSageMakerImageArn(String sageMakerImageArn) {
        this.sageMakerImageArn = sageMakerImageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>^arn:aws(-[\w]+)*:sagemaker:.+:[0-9]{12}:image/[a-z0-9]([-
     * .]?[a-z0-9])*$<br/>
     *
     * @param sageMakerImageArn <p>
     *            The Amazon Resource Name (ARN) of the SageMaker image created
     *            on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSpec withSageMakerImageArn(String sageMakerImageArn) {
        this.sageMakerImageArn = sageMakerImageArn;
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, ml.t3.micro, ml.t3.small, ml.t3.medium,
     * ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge, ml.m5.large, ml.m5.xlarge,
     * ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.8xlarge, ml.m5.12xlarge,
     * ml.m5.16xlarge, ml.m5.24xlarge, ml.c5.large, ml.c5.xlarge, ml.c5.2xlarge,
     * ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.12xlarge, ml.c5.18xlarge,
     * ml.c5.24xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.g4dn.xlarge, ml.g4dn.2xlarge, ml.g4dn.4xlarge, ml.g4dn.8xlarge,
     * ml.g4dn.12xlarge, ml.g4dn.16xlarge
     *
     * @return <p>
     *         The instance type.
     *         </p>
     * @see AppInstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, ml.t3.micro, ml.t3.small, ml.t3.medium,
     * ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge, ml.m5.large, ml.m5.xlarge,
     * ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.8xlarge, ml.m5.12xlarge,
     * ml.m5.16xlarge, ml.m5.24xlarge, ml.c5.large, ml.c5.xlarge, ml.c5.2xlarge,
     * ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.12xlarge, ml.c5.18xlarge,
     * ml.c5.24xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.g4dn.xlarge, ml.g4dn.2xlarge, ml.g4dn.4xlarge, ml.g4dn.8xlarge,
     * ml.g4dn.12xlarge, ml.g4dn.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @see AppInstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, ml.t3.micro, ml.t3.small, ml.t3.medium,
     * ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge, ml.m5.large, ml.m5.xlarge,
     * ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.8xlarge, ml.m5.12xlarge,
     * ml.m5.16xlarge, ml.m5.24xlarge, ml.c5.large, ml.c5.xlarge, ml.c5.2xlarge,
     * ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.12xlarge, ml.c5.18xlarge,
     * ml.c5.24xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.g4dn.xlarge, ml.g4dn.2xlarge, ml.g4dn.4xlarge, ml.g4dn.8xlarge,
     * ml.g4dn.12xlarge, ml.g4dn.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppInstanceType
     */
    public ResourceSpec withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, ml.t3.micro, ml.t3.small, ml.t3.medium,
     * ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge, ml.m5.large, ml.m5.xlarge,
     * ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.8xlarge, ml.m5.12xlarge,
     * ml.m5.16xlarge, ml.m5.24xlarge, ml.c5.large, ml.c5.xlarge, ml.c5.2xlarge,
     * ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.12xlarge, ml.c5.18xlarge,
     * ml.c5.24xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.g4dn.xlarge, ml.g4dn.2xlarge, ml.g4dn.4xlarge, ml.g4dn.8xlarge,
     * ml.g4dn.12xlarge, ml.g4dn.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @see AppInstanceType
     */
    public void setInstanceType(AppInstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>system, ml.t3.micro, ml.t3.small, ml.t3.medium,
     * ml.t3.large, ml.t3.xlarge, ml.t3.2xlarge, ml.m5.large, ml.m5.xlarge,
     * ml.m5.2xlarge, ml.m5.4xlarge, ml.m5.8xlarge, ml.m5.12xlarge,
     * ml.m5.16xlarge, ml.m5.24xlarge, ml.c5.large, ml.c5.xlarge, ml.c5.2xlarge,
     * ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.12xlarge, ml.c5.18xlarge,
     * ml.c5.24xlarge, ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge,
     * ml.g4dn.xlarge, ml.g4dn.2xlarge, ml.g4dn.4xlarge, ml.g4dn.8xlarge,
     * ml.g4dn.12xlarge, ml.g4dn.16xlarge
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppInstanceType
     */
    public ResourceSpec withInstanceType(AppInstanceType instanceType) {
        this.instanceType = instanceType.toString();
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
        if (getSageMakerImageArn() != null)
            sb.append("SageMakerImageArn: " + getSageMakerImageArn() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSageMakerImageArn() == null) ? 0 : getSageMakerImageArn().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSpec == false)
            return false;
        ResourceSpec other = (ResourceSpec) obj;

        if (other.getSageMakerImageArn() == null ^ this.getSageMakerImageArn() == null)
            return false;
        if (other.getSageMakerImageArn() != null
                && other.getSageMakerImageArn().equals(this.getSageMakerImageArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }
}
