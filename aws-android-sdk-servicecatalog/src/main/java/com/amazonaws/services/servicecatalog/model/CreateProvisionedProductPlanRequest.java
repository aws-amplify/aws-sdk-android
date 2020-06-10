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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a plan. A plan includes the list of resources to be created (when
 * provisioning a new product) or modified (when updating a provisioned product)
 * when the plan is executed.
 * </p>
 * <p>
 * You can create one plan per provisioned product. To create a plan for an
 * existing provisioned product, the product status must be AVAILBLE or TAINTED.
 * </p>
 * <p>
 * To view the resource changes in the change set, use
 * <a>DescribeProvisionedProductPlan</a>. To create or modify the provisioned
 * product, use <a>ExecuteProvisionedProductPlan</a>.
 * </p>
 */
public class CreateProvisionedProductPlanRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The name of the plan.
     * </p>
     */
    private String planName;

    /**
     * <p>
     * The plan type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDFORMATION
     */
    private String planType;

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     */
    private java.util.List<String> notificationArns;

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String pathId;

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     */
    private String provisionedProductName;

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisioningArtifactId;

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     */
    private java.util.List<UpdateProvisioningParameter> provisioningParameters;

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String idempotencyToken;

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * If the plan is for an existing provisioned product, the product must have
     * a <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The language code.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     *
     * @return <p>
     *         The name of the plan.
     *         </p>
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     *
     * @param planName <p>
     *            The name of the plan.
     *            </p>
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * <p>
     * The name of the plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param planName <p>
     *            The name of the plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDFORMATION
     *
     * @return <p>
     *         The plan type.
     *         </p>
     * @see ProvisionedProductPlanType
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDFORMATION
     *
     * @param planType <p>
     *            The plan type.
     *            </p>
     * @see ProvisionedProductPlanType
     */
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDFORMATION
     *
     * @param planType <p>
     *            The plan type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisionedProductPlanType
     */
    public CreateProvisionedProductPlanRequest withPlanType(String planType) {
        this.planType = planType;
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDFORMATION
     *
     * @param planType <p>
     *            The plan type.
     *            </p>
     * @see ProvisionedProductPlanType
     */
    public void setPlanType(ProvisionedProductPlanType planType) {
        this.planType = planType.toString();
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDFORMATION
     *
     * @param planType <p>
     *            The plan type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisionedProductPlanType
     */
    public CreateProvisionedProductPlanRequest withPlanType(ProvisionedProductPlanType planType) {
        this.planType = planType.toString();
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     *
     * @return <p>
     *         Passed to CloudFormation. The SNS topic ARNs to which to publish
     *         stack-related events.
     *         </p>
     */
    public java.util.List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     *
     * @param notificationArns <p>
     *            Passed to CloudFormation. The SNS topic ARNs to which to
     *            publish stack-related events.
     *            </p>
     */
    public void setNotificationArns(java.util.Collection<String> notificationArns) {
        if (notificationArns == null) {
            this.notificationArns = null;
            return;
        }

        this.notificationArns = new java.util.ArrayList<String>(notificationArns);
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationArns <p>
     *            Passed to CloudFormation. The SNS topic ARNs to which to
     *            publish stack-related events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withNotificationArns(String... notificationArns) {
        if (getNotificationArns() == null) {
            this.notificationArns = new java.util.ArrayList<String>(notificationArns.length);
        }
        for (String value : notificationArns) {
            this.notificationArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationArns <p>
     *            Passed to CloudFormation. The SNS topic ARNs to which to
     *            publish stack-related events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withNotificationArns(
            java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
        return this;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The path identifier of the product. This value is optional if the
     *         product has a default path, and required if the product has more
     *         than one path. To list the paths for a product, use
     *         <a>ListLaunchPaths</a>.
     *         </p>
     */
    public String getPathId() {
        return pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param pathId <p>
     *            The path identifier of the product. This value is optional if
     *            the product has a default path, and required if the product
     *            has more than one path. To list the paths for a product, use
     *            <a>ListLaunchPaths</a>.
     *            </p>
     */
    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param pathId <p>
     *            The path identifier of the product. This value is optional if
     *            the product has a default path, and required if the product
     *            has more than one path. To list the paths for a product, use
     *            <a>ListLaunchPaths</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withPathId(String pathId) {
        this.pathId = pathId;
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @return <p>
     *         A user-friendly name for the provisioned product. This value must
     *         be unique for the AWS account and cannot be updated after the
     *         product is provisioned.
     *         </p>
     */
    public String getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            A user-friendly name for the provisioned product. This value
     *            must be unique for the AWS account and cannot be updated after
     *            the product is provisioned.
     *            </p>
     */
    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            A user-friendly name for the provisioned product. This value
     *            must be unique for the AWS account and cannot be updated after
     *            the product is provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withProvisionedProductName(
            String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact.
     *         </p>
     */
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     */
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withProvisioningArtifactId(
            String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     *
     * @return <p>
     *         Parameters specified by the administrator that are required for
     *         provisioning the product.
     *         </p>
     */
    public java.util.List<UpdateProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     *
     * @param provisioningParameters <p>
     *            Parameters specified by the administrator that are required
     *            for provisioning the product.
     *            </p>
     */
    public void setProvisioningParameters(
            java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<UpdateProvisioningParameter>(
                provisioningParameters);
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningParameters <p>
     *            Parameters specified by the administrator that are required
     *            for provisioning the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withProvisioningParameters(
            UpdateProvisioningParameter... provisioningParameters) {
        if (getProvisioningParameters() == null) {
            this.provisioningParameters = new java.util.ArrayList<UpdateProvisioningParameter>(
                    provisioningParameters.length);
        }
        for (UpdateProvisioningParameter value : provisioningParameters) {
            this.provisioningParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningParameters <p>
     *            Parameters specified by the administrator that are required
     *            for provisioning the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withProvisioningParameters(
            java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         A unique identifier that you provide to ensure idempotency. If
     *         multiple requests differ only by the idempotency token, the same
     *         response is returned for each repeated request.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * If the plan is for an existing provisioned product, the product must have
     * a <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     *         <p>
     *         If the plan is for an existing provisioned product, the product
     *         must have a <code>RESOURCE_UPDATE</code> constraint with
     *         <code>TagUpdatesOnProvisionedProduct</code> set to
     *         <code>ALLOWED</code> to allow tag updates.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * If the plan is for an existing provisioned product, the product must have
     * a <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            If the plan is for an existing provisioned product, the
     *            product must have a <code>RESOURCE_UPDATE</code> constraint
     *            with <code>TagUpdatesOnProvisionedProduct</code> set to
     *            <code>ALLOWED</code> to allow tag updates.
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
     * One or more tags.
     * </p>
     * <p>
     * If the plan is for an existing provisioned product, the product must have
     * a <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            If the plan is for an existing provisioned product, the
     *            product must have a <code>RESOURCE_UPDATE</code> constraint
     *            with <code>TagUpdatesOnProvisionedProduct</code> set to
     *            <code>ALLOWED</code> to allow tag updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withTags(Tag... tags) {
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
     * One or more tags.
     * </p>
     * <p>
     * If the plan is for an existing provisioned product, the product must have
     * a <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     *            <p>
     *            If the plan is for an existing provisioned product, the
     *            product must have a <code>RESOURCE_UPDATE</code> constraint
     *            with <code>TagUpdatesOnProvisionedProduct</code> set to
     *            <code>ALLOWED</code> to allow tag updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisionedProductPlanRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getPlanName() != null)
            sb.append("PlanName: " + getPlanName() + ",");
        if (getPlanType() != null)
            sb.append("PlanType: " + getPlanType() + ",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: " + getNotificationArns() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: " + getProvisioningParameters() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken() + ",");
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
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        hashCode = prime * hashCode + ((getPlanType() == null) ? 0 : getPlanType().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisionedProductPlanRequest == false)
            return false;
        CreateProvisionedProductPlanRequest other = (CreateProvisionedProductPlanRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPlanName() == null ^ this.getPlanName() == null)
            return false;
        if (other.getPlanName() != null && other.getPlanName().equals(this.getPlanName()) == false)
            return false;
        if (other.getPlanType() == null ^ this.getPlanType() == null)
            return false;
        if (other.getPlanType() != null && other.getPlanType().equals(this.getPlanType()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null
                && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null
                && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null
                && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
