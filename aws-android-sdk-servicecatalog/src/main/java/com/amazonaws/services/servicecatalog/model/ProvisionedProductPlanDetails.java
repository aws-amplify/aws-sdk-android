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

/**
 * <p>
 * Information about a plan.
 * </p>
 */
public class ProvisionedProductPlanDetails implements Serializable {
    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

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
     * The name of the plan.
     * </p>
     */
    private String planName;

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String planId;

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisionProductId;

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     */
    private String provisionProductName;

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
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED,
     * EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED
     */
    private String status;

    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     */
    private java.util.Date updatedTime;

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     */
    private java.util.List<String> notificationArns;

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     */
    private java.util.List<UpdateProvisioningParameter> provisioningParameters;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The status message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String statusMessage;

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @return <p>
     *         The UTC time stamp of the creation time.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
    public ProvisionedProductPlanDetails withPathId(String pathId) {
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
    public ProvisionedProductPlanDetails withProductId(String productId) {
        this.productId = productId;
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
    public ProvisionedProductPlanDetails withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The plan identifier.
     *         </p>
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param planId <p>
     *            The plan identifier.
     *            </p>
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param planId <p>
     *            The plan identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withPlanId(String planId) {
        this.planId = planId;
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
    public String getProvisionProductId() {
        return provisionProductId;
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
     * @param provisionProductId <p>
     *            The product identifier.
     *            </p>
     */
    public void setProvisionProductId(String provisionProductId) {
        this.provisionProductId = provisionProductId;
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
     * @param provisionProductId <p>
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withProvisionProductId(String provisionProductId) {
        this.provisionProductId = provisionProductId;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @return <p>
     *         The user-friendly name of the provisioned product.
     *         </p>
     */
    public String getProvisionProductName() {
        return provisionProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionProductName <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     */
    public void setProvisionProductName(String provisionProductName) {
        this.provisionProductName = provisionProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionProductName <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withProvisionProductName(String provisionProductName) {
        this.provisionProductName = provisionProductName;
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
    public ProvisionedProductPlanDetails withPlanType(String planType) {
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
    public ProvisionedProductPlanDetails withPlanType(ProvisionedProductPlanType planType) {
        this.planType = planType.toString();
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
    public ProvisionedProductPlanDetails withProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED,
     * EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED
     *
     * @return <p>
     *         The status.
     *         </p>
     * @see ProvisionedProductPlanStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED,
     * EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see ProvisionedProductPlanStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED,
     * EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisionedProductPlanStatus
     */
    public ProvisionedProductPlanDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED,
     * EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see ProvisionedProductPlanStatus
     */
    public void setStatus(ProvisionedProductPlanStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED,
     * EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisionedProductPlanStatus
     */
    public ProvisionedProductPlanDetails withStatus(ProvisionedProductPlanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     *
     * @return <p>
     *         The time when the plan was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     *
     * @param updatedTime <p>
     *            The time when the plan was last updated.
     *            </p>
     */
    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The time when the plan was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTime <p>
     *            The time when the plan was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
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
    public ProvisionedProductPlanDetails withNotificationArns(String... notificationArns) {
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
    public ProvisionedProductPlanDetails withNotificationArns(
            java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
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
    public ProvisionedProductPlanDetails withProvisioningParameters(
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
    public ProvisionedProductPlanDetails withProvisioningParameters(
            java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withTags(Tag... tags) {
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The status message.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param statusMessage <p>
     *            The status message.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param statusMessage <p>
     *            The status message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductPlanDetails withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getPlanName() != null)
            sb.append("PlanName: " + getPlanName() + ",");
        if (getPlanId() != null)
            sb.append("PlanId: " + getPlanId() + ",");
        if (getProvisionProductId() != null)
            sb.append("ProvisionProductId: " + getProvisionProductId() + ",");
        if (getProvisionProductName() != null)
            sb.append("ProvisionProductName: " + getProvisionProductName() + ",");
        if (getPlanType() != null)
            sb.append("PlanType: " + getPlanType() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: " + getUpdatedTime() + ",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: " + getNotificationArns() + ",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: " + getProvisioningParameters() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        hashCode = prime * hashCode + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionProductId() == null) ? 0 : getProvisionProductId().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionProductName() == null) ? 0 : getProvisionProductName().hashCode());
        hashCode = prime * hashCode + ((getPlanType() == null) ? 0 : getPlanType().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedProductPlanDetails == false)
            return false;
        ProvisionedProductPlanDetails other = (ProvisionedProductPlanDetails) obj;

        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
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
        if (other.getPlanName() == null ^ this.getPlanName() == null)
            return false;
        if (other.getPlanName() != null && other.getPlanName().equals(this.getPlanName()) == false)
            return false;
        if (other.getPlanId() == null ^ this.getPlanId() == null)
            return false;
        if (other.getPlanId() != null && other.getPlanId().equals(this.getPlanId()) == false)
            return false;
        if (other.getProvisionProductId() == null ^ this.getProvisionProductId() == null)
            return false;
        if (other.getProvisionProductId() != null
                && other.getProvisionProductId().equals(this.getProvisionProductId()) == false)
            return false;
        if (other.getProvisionProductName() == null ^ this.getProvisionProductName() == null)
            return false;
        if (other.getProvisionProductName() != null
                && other.getProvisionProductName().equals(this.getProvisionProductName()) == false)
            return false;
        if (other.getPlanType() == null ^ this.getPlanType() == null)
            return false;
        if (other.getPlanType() != null && other.getPlanType().equals(this.getPlanType()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null
                && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null
                && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null
                && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }
}
