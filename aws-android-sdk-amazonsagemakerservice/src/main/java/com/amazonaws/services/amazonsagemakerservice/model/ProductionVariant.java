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
 * Identifies a model that you want to host and the resources to deploy for
 * hosting it. If you are deploying multiple models, tell Amazon SageMaker how
 * to distribute traffic among the models by specifying variant weights.
 * </p>
 */
public class ProductionVariant implements Serializable {
    /**
     * <p>
     * The name of the production variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String variantName;

    /**
     * <p>
     * The name of the model that you want to host. This is the name that you
     * specified when creating the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String modelName;

    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer initialInstanceCount;

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge,
     * ml.m5.4xlarge, ml.m5.12xlarge, ml.m5.24xlarge, ml.m5d.large,
     * ml.m5d.xlarge, ml.m5d.2xlarge, ml.m5d.4xlarge, ml.m5d.12xlarge,
     * ml.m5d.24xlarge, ml.c4.large, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.c5.large, ml.c5.xlarge,
     * ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.18xlarge,
     * ml.c5d.large, ml.c5d.xlarge, ml.c5d.2xlarge, ml.c5d.4xlarge,
     * ml.c5d.9xlarge, ml.c5d.18xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge, ml.r5.4xlarge, ml.r5.12xlarge,
     * ml.r5.24xlarge, ml.r5d.large, ml.r5d.xlarge, ml.r5d.2xlarge,
     * ml.r5d.4xlarge, ml.r5d.12xlarge, ml.r5d.24xlarge, ml.inf1.xlarge,
     * ml.inf1.2xlarge, ml.inf1.6xlarge, ml.inf1.24xlarge
     */
    private String instanceType;

    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you
     * specify in the endpoint configuration. The traffic to a production
     * variant is determined by the ratio of the <code>VariantWeight</code> to
     * the sum of all <code>VariantWeight</code> values across all
     * ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     */
    private Float initialVariantWeight;

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production
     * variant. EI instances provide on-demand GPU computing for inference. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.eia1.medium, ml.eia1.large, ml.eia1.xlarge,
     * ml.eia2.medium, ml.eia2.large, ml.eia2.xlarge
     */
    private String acceleratorType;

    /**
     * <p>
     * The name of the production variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the production variant.
     *         </p>
     */
    public String getVariantName() {
        return variantName;
    }

    /**
     * <p>
     * The name of the production variant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param variantName <p>
     *            The name of the production variant.
     *            </p>
     */
    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the production variant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param variantName <p>
     *            The name of the production variant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariant withVariantName(String variantName) {
        this.variantName = variantName;
        return this;
    }

    /**
     * <p>
     * The name of the model that you want to host. This is the name that you
     * specified when creating the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the model that you want to host. This is the name
     *         that you specified when creating the model.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * The name of the model that you want to host. This is the name that you
     * specified when creating the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            The name of the model that you want to host. This is the name
     *            that you specified when creating the model.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model that you want to host. This is the name that you
     * specified when creating the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            The name of the model that you want to host. This is the name
     *            that you specified when creating the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariant withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Number of instances to launch initially.
     *         </p>
     */
    public Integer getInitialInstanceCount() {
        return initialInstanceCount;
    }

    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param initialInstanceCount <p>
     *            Number of instances to launch initially.
     *            </p>
     */
    public void setInitialInstanceCount(Integer initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
    }

    /**
     * <p>
     * Number of instances to launch initially.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param initialInstanceCount <p>
     *            Number of instances to launch initially.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariant withInitialInstanceCount(Integer initialInstanceCount) {
        this.initialInstanceCount = initialInstanceCount;
        return this;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge,
     * ml.m5.4xlarge, ml.m5.12xlarge, ml.m5.24xlarge, ml.m5d.large,
     * ml.m5d.xlarge, ml.m5d.2xlarge, ml.m5d.4xlarge, ml.m5d.12xlarge,
     * ml.m5d.24xlarge, ml.c4.large, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.c5.large, ml.c5.xlarge,
     * ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.18xlarge,
     * ml.c5d.large, ml.c5d.xlarge, ml.c5d.2xlarge, ml.c5d.4xlarge,
     * ml.c5d.9xlarge, ml.c5d.18xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge, ml.r5.4xlarge, ml.r5.12xlarge,
     * ml.r5.24xlarge, ml.r5d.large, ml.r5d.xlarge, ml.r5d.2xlarge,
     * ml.r5d.4xlarge, ml.r5d.12xlarge, ml.r5d.24xlarge, ml.inf1.xlarge,
     * ml.inf1.2xlarge, ml.inf1.6xlarge, ml.inf1.24xlarge
     *
     * @return <p>
     *         The ML compute instance type.
     *         </p>
     * @see ProductionVariantInstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge,
     * ml.m5.4xlarge, ml.m5.12xlarge, ml.m5.24xlarge, ml.m5d.large,
     * ml.m5d.xlarge, ml.m5d.2xlarge, ml.m5d.4xlarge, ml.m5d.12xlarge,
     * ml.m5d.24xlarge, ml.c4.large, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.c5.large, ml.c5.xlarge,
     * ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.18xlarge,
     * ml.c5d.large, ml.c5d.xlarge, ml.c5d.2xlarge, ml.c5d.4xlarge,
     * ml.c5d.9xlarge, ml.c5d.18xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge, ml.r5.4xlarge, ml.r5.12xlarge,
     * ml.r5.24xlarge, ml.r5d.large, ml.r5d.xlarge, ml.r5d.2xlarge,
     * ml.r5d.4xlarge, ml.r5d.12xlarge, ml.r5d.24xlarge, ml.inf1.xlarge,
     * ml.inf1.2xlarge, ml.inf1.6xlarge, ml.inf1.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @see ProductionVariantInstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge,
     * ml.m5.4xlarge, ml.m5.12xlarge, ml.m5.24xlarge, ml.m5d.large,
     * ml.m5d.xlarge, ml.m5d.2xlarge, ml.m5d.4xlarge, ml.m5d.12xlarge,
     * ml.m5d.24xlarge, ml.c4.large, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.c5.large, ml.c5.xlarge,
     * ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.18xlarge,
     * ml.c5d.large, ml.c5d.xlarge, ml.c5d.2xlarge, ml.c5d.4xlarge,
     * ml.c5d.9xlarge, ml.c5d.18xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge, ml.r5.4xlarge, ml.r5.12xlarge,
     * ml.r5.24xlarge, ml.r5d.large, ml.r5d.xlarge, ml.r5d.2xlarge,
     * ml.r5d.4xlarge, ml.r5d.12xlarge, ml.r5d.24xlarge, ml.inf1.xlarge,
     * ml.inf1.2xlarge, ml.inf1.6xlarge, ml.inf1.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductionVariantInstanceType
     */
    public ProductionVariant withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge,
     * ml.m5.4xlarge, ml.m5.12xlarge, ml.m5.24xlarge, ml.m5d.large,
     * ml.m5d.xlarge, ml.m5d.2xlarge, ml.m5d.4xlarge, ml.m5d.12xlarge,
     * ml.m5d.24xlarge, ml.c4.large, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.c5.large, ml.c5.xlarge,
     * ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.18xlarge,
     * ml.c5d.large, ml.c5d.xlarge, ml.c5d.2xlarge, ml.c5d.4xlarge,
     * ml.c5d.9xlarge, ml.c5d.18xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge, ml.r5.4xlarge, ml.r5.12xlarge,
     * ml.r5.24xlarge, ml.r5d.large, ml.r5d.xlarge, ml.r5d.2xlarge,
     * ml.r5d.4xlarge, ml.r5d.12xlarge, ml.r5d.24xlarge, ml.inf1.xlarge,
     * ml.inf1.2xlarge, ml.inf1.6xlarge, ml.inf1.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @see ProductionVariantInstanceType
     */
    public void setInstanceType(ProductionVariantInstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The ML compute instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.t2.medium, ml.t2.large, ml.t2.xlarge,
     * ml.t2.2xlarge, ml.m4.xlarge, ml.m4.2xlarge, ml.m4.4xlarge,
     * ml.m4.10xlarge, ml.m4.16xlarge, ml.m5.large, ml.m5.xlarge, ml.m5.2xlarge,
     * ml.m5.4xlarge, ml.m5.12xlarge, ml.m5.24xlarge, ml.m5d.large,
     * ml.m5d.xlarge, ml.m5d.2xlarge, ml.m5d.4xlarge, ml.m5d.12xlarge,
     * ml.m5d.24xlarge, ml.c4.large, ml.c4.xlarge, ml.c4.2xlarge, ml.c4.4xlarge,
     * ml.c4.8xlarge, ml.p2.xlarge, ml.p2.8xlarge, ml.p2.16xlarge,
     * ml.p3.2xlarge, ml.p3.8xlarge, ml.p3.16xlarge, ml.c5.large, ml.c5.xlarge,
     * ml.c5.2xlarge, ml.c5.4xlarge, ml.c5.9xlarge, ml.c5.18xlarge,
     * ml.c5d.large, ml.c5d.xlarge, ml.c5d.2xlarge, ml.c5d.4xlarge,
     * ml.c5d.9xlarge, ml.c5d.18xlarge, ml.g4dn.xlarge, ml.g4dn.2xlarge,
     * ml.g4dn.4xlarge, ml.g4dn.8xlarge, ml.g4dn.12xlarge, ml.g4dn.16xlarge,
     * ml.r5.large, ml.r5.xlarge, ml.r5.2xlarge, ml.r5.4xlarge, ml.r5.12xlarge,
     * ml.r5.24xlarge, ml.r5d.large, ml.r5d.xlarge, ml.r5d.2xlarge,
     * ml.r5d.4xlarge, ml.r5d.12xlarge, ml.r5d.24xlarge, ml.inf1.xlarge,
     * ml.inf1.2xlarge, ml.inf1.6xlarge, ml.inf1.24xlarge
     *
     * @param instanceType <p>
     *            The ML compute instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductionVariantInstanceType
     */
    public ProductionVariant withInstanceType(ProductionVariantInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you
     * specify in the endpoint configuration. The traffic to a production
     * variant is determined by the ratio of the <code>VariantWeight</code> to
     * the sum of all <code>VariantWeight</code> values across all
     * ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @return <p>
     *         Determines initial traffic distribution among all of the models
     *         that you specify in the endpoint configuration. The traffic to a
     *         production variant is determined by the ratio of the
     *         <code>VariantWeight</code> to the sum of all
     *         <code>VariantWeight</code> values across all ProductionVariants.
     *         If unspecified, it defaults to 1.0.
     *         </p>
     */
    public Float getInitialVariantWeight() {
        return initialVariantWeight;
    }

    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you
     * specify in the endpoint configuration. The traffic to a production
     * variant is determined by the ratio of the <code>VariantWeight</code> to
     * the sum of all <code>VariantWeight</code> values across all
     * ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param initialVariantWeight <p>
     *            Determines initial traffic distribution among all of the
     *            models that you specify in the endpoint configuration. The
     *            traffic to a production variant is determined by the ratio of
     *            the <code>VariantWeight</code> to the sum of all
     *            <code>VariantWeight</code> values across all
     *            ProductionVariants. If unspecified, it defaults to 1.0.
     *            </p>
     */
    public void setInitialVariantWeight(Float initialVariantWeight) {
        this.initialVariantWeight = initialVariantWeight;
    }

    /**
     * <p>
     * Determines initial traffic distribution among all of the models that you
     * specify in the endpoint configuration. The traffic to a production
     * variant is determined by the ratio of the <code>VariantWeight</code> to
     * the sum of all <code>VariantWeight</code> values across all
     * ProductionVariants. If unspecified, it defaults to 1.0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param initialVariantWeight <p>
     *            Determines initial traffic distribution among all of the
     *            models that you specify in the endpoint configuration. The
     *            traffic to a production variant is determined by the ratio of
     *            the <code>VariantWeight</code> to the sum of all
     *            <code>VariantWeight</code> values across all
     *            ProductionVariants. If unspecified, it defaults to 1.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionVariant withInitialVariantWeight(Float initialVariantWeight) {
        this.initialVariantWeight = initialVariantWeight;
        return this;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production
     * variant. EI instances provide on-demand GPU computing for inference. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.eia1.medium, ml.eia1.large, ml.eia1.xlarge,
     * ml.eia2.medium, ml.eia2.large, ml.eia2.xlarge
     *
     * @return <p>
     *         The size of the Elastic Inference (EI) instance to use for the
     *         production variant. EI instances provide on-demand GPU computing
     *         for inference. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *         >Using Elastic Inference in Amazon SageMaker</a>.
     *         </p>
     * @see ProductionVariantAcceleratorType
     */
    public String getAcceleratorType() {
        return acceleratorType;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production
     * variant. EI instances provide on-demand GPU computing for inference. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.eia1.medium, ml.eia1.large, ml.eia1.xlarge,
     * ml.eia2.medium, ml.eia2.large, ml.eia2.xlarge
     *
     * @param acceleratorType <p>
     *            The size of the Elastic Inference (EI) instance to use for the
     *            production variant. EI instances provide on-demand GPU
     *            computing for inference. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @see ProductionVariantAcceleratorType
     */
    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production
     * variant. EI instances provide on-demand GPU computing for inference. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.eia1.medium, ml.eia1.large, ml.eia1.xlarge,
     * ml.eia2.medium, ml.eia2.large, ml.eia2.xlarge
     *
     * @param acceleratorType <p>
     *            The size of the Elastic Inference (EI) instance to use for the
     *            production variant. EI instances provide on-demand GPU
     *            computing for inference. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductionVariantAcceleratorType
     */
    public ProductionVariant withAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production
     * variant. EI instances provide on-demand GPU computing for inference. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.eia1.medium, ml.eia1.large, ml.eia1.xlarge,
     * ml.eia2.medium, ml.eia2.large, ml.eia2.xlarge
     *
     * @param acceleratorType <p>
     *            The size of the Elastic Inference (EI) instance to use for the
     *            production variant. EI instances provide on-demand GPU
     *            computing for inference. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @see ProductionVariantAcceleratorType
     */
    public void setAcceleratorType(ProductionVariantAcceleratorType acceleratorType) {
        this.acceleratorType = acceleratorType.toString();
    }

    /**
     * <p>
     * The size of the Elastic Inference (EI) instance to use for the production
     * variant. EI instances provide on-demand GPU computing for inference. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html">Using
     * Elastic Inference in Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ml.eia1.medium, ml.eia1.large, ml.eia1.xlarge,
     * ml.eia2.medium, ml.eia2.large, ml.eia2.xlarge
     *
     * @param acceleratorType <p>
     *            The size of the Elastic Inference (EI) instance to use for the
     *            production variant. EI instances provide on-demand GPU
     *            computing for inference. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html"
     *            >Using Elastic Inference in Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProductionVariantAcceleratorType
     */
    public ProductionVariant withAcceleratorType(ProductionVariantAcceleratorType acceleratorType) {
        this.acceleratorType = acceleratorType.toString();
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
        if (getVariantName() != null)
            sb.append("VariantName: " + getVariantName() + ",");
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName() + ",");
        if (getInitialInstanceCount() != null)
            sb.append("InitialInstanceCount: " + getInitialInstanceCount() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInitialVariantWeight() != null)
            sb.append("InitialVariantWeight: " + getInitialVariantWeight() + ",");
        if (getAcceleratorType() != null)
            sb.append("AcceleratorType: " + getAcceleratorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode
                + ((getInitialInstanceCount() == null) ? 0 : getInitialInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInitialVariantWeight() == null) ? 0 : getInitialVariantWeight().hashCode());
        hashCode = prime * hashCode
                + ((getAcceleratorType() == null) ? 0 : getAcceleratorType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariant == false)
            return false;
        ProductionVariant other = (ProductionVariant) obj;

        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null
                && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInitialInstanceCount() == null ^ this.getInitialInstanceCount() == null)
            return false;
        if (other.getInitialInstanceCount() != null
                && other.getInitialInstanceCount().equals(this.getInitialInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInitialVariantWeight() == null ^ this.getInitialVariantWeight() == null)
            return false;
        if (other.getInitialVariantWeight() != null
                && other.getInitialVariantWeight().equals(this.getInitialVariantWeight()) == false)
            return false;
        if (other.getAcceleratorType() == null ^ this.getAcceleratorType() == null)
            return false;
        if (other.getAcceleratorType() != null
                && other.getAcceleratorType().equals(this.getAcceleratorType()) == false)
            return false;
        return true;
    }
}
