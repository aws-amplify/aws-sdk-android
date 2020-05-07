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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the specified attribute of the specified AMI. You can specify only
 * one attribute at a time. You can use the <code>Attribute</code> parameter to
 * specify the attribute or one of the following parameters:
 * <code>Description</code>, <code>LaunchPermission</code>, or
 * <code>ProductCode</code>.
 * </p>
 * <p>
 * AWS Marketplace product codes cannot be modified. Images with an AWS
 * Marketplace product code cannot be made public.
 * </p>
 * <p>
 * To enable the SriovNetSupport enhanced networking attribute of an image,
 * enable SriovNetSupport on an instance and create an AMI from the instance.
 * </p>
 */
public class ModifyImageAttributeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the attribute to modify. The valid values are
     * <code>description</code>, <code>launchPermission</code>, and
     * <code>productCodes</code>.
     * </p>
     */
    private String attribute;

    /**
     * <p>
     * A new description for the AMI.
     * </p>
     */
    private AttributeValue description;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * A new launch permission for the AMI.
     * </p>
     */
    private LaunchPermissionModifications launchPermission;

    /**
     * <p>
     * The operation type. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     */
    private String operationType;

    /**
     * <p>
     * The DevPay product codes. After you add a product code to an AMI, it
     * can't be removed.
     * </p>
     */
    private java.util.List<String> productCodes;

    /**
     * <p>
     * The user groups. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     */
    private java.util.List<String> userGroups;

    /**
     * <p>
     * The AWS account IDs. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * The value of the attribute being modified. This parameter can be used
     * only when the <code>Attribute</code> parameter is
     * <code>description</code> or <code>productCodes</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the attribute to modify. The valid values are
     * <code>description</code>, <code>launchPermission</code>, and
     * <code>productCodes</code>.
     * </p>
     *
     * @return <p>
     *         The name of the attribute to modify. The valid values are
     *         <code>description</code>, <code>launchPermission</code>, and
     *         <code>productCodes</code>.
     *         </p>
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The name of the attribute to modify. The valid values are
     * <code>description</code>, <code>launchPermission</code>, and
     * <code>productCodes</code>.
     * </p>
     *
     * @param attribute <p>
     *            The name of the attribute to modify. The valid values are
     *            <code>description</code>, <code>launchPermission</code>, and
     *            <code>productCodes</code>.
     *            </p>
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute to modify. The valid values are
     * <code>description</code>, <code>launchPermission</code>, and
     * <code>productCodes</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attribute <p>
     *            The name of the attribute to modify. The valid values are
     *            <code>description</code>, <code>launchPermission</code>, and
     *            <code>productCodes</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * A new description for the AMI.
     * </p>
     *
     * @return <p>
     *         A new description for the AMI.
     *         </p>
     */
    public AttributeValue getDescription() {
        return description;
    }

    /**
     * <p>
     * A new description for the AMI.
     * </p>
     *
     * @param description <p>
     *            A new description for the AMI.
     *            </p>
     */
    public void setDescription(AttributeValue description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A new description for the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withDescription(AttributeValue description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @return <p>
     *         The ID of the AMI.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * A new launch permission for the AMI.
     * </p>
     *
     * @return <p>
     *         A new launch permission for the AMI.
     *         </p>
     */
    public LaunchPermissionModifications getLaunchPermission() {
        return launchPermission;
    }

    /**
     * <p>
     * A new launch permission for the AMI.
     * </p>
     *
     * @param launchPermission <p>
     *            A new launch permission for the AMI.
     *            </p>
     */
    public void setLaunchPermission(LaunchPermissionModifications launchPermission) {
        this.launchPermission = launchPermission;
    }

    /**
     * <p>
     * A new launch permission for the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPermission <p>
     *            A new launch permission for the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withLaunchPermission(
            LaunchPermissionModifications launchPermission) {
        this.launchPermission = launchPermission;
        return this;
    }

    /**
     * <p>
     * The operation type. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @return <p>
     *         The operation type. This parameter can be used only when the
     *         <code>Attribute</code> parameter is <code>launchPermission</code>
     *         .
     *         </p>
     * @see OperationType
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * <p>
     * The operation type. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The operation type. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public ModifyImageAttributeRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * <p>
     * The operation type. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
    }

    /**
     * <p>
     * The operation type. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public ModifyImageAttributeRequest withOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The DevPay product codes. After you add a product code to an AMI, it
     * can't be removed.
     * </p>
     *
     * @return <p>
     *         The DevPay product codes. After you add a product code to an AMI,
     *         it can't be removed.
     *         </p>
     */
    public java.util.List<String> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * The DevPay product codes. After you add a product code to an AMI, it
     * can't be removed.
     * </p>
     *
     * @param productCodes <p>
     *            The DevPay product codes. After you add a product code to an
     *            AMI, it can't be removed.
     *            </p>
     */
    public void setProductCodes(java.util.Collection<String> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new java.util.ArrayList<String>(productCodes);
    }

    /**
     * <p>
     * The DevPay product codes. After you add a product code to an AMI, it
     * can't be removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The DevPay product codes. After you add a product code to an
     *            AMI, it can't be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withProductCodes(String... productCodes) {
        if (getProductCodes() == null) {
            this.productCodes = new java.util.ArrayList<String>(productCodes.length);
        }
        for (String value : productCodes) {
            this.productCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The DevPay product codes. After you add a product code to an AMI, it
     * can't be removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The DevPay product codes. After you add a product code to an
     *            AMI, it can't be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withProductCodes(java.util.Collection<String> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The user groups. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     *
     * @return <p>
     *         The user groups. This parameter can be used only when the
     *         <code>Attribute</code> parameter is <code>launchPermission</code>
     *         .
     *         </p>
     */
    public java.util.List<String> getUserGroups() {
        return userGroups;
    }

    /**
     * <p>
     * The user groups. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     *
     * @param userGroups <p>
     *            The user groups. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     */
    public void setUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }

        this.userGroups = new java.util.ArrayList<String>(userGroups);
    }

    /**
     * <p>
     * The user groups. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userGroups <p>
     *            The user groups. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withUserGroups(String... userGroups) {
        if (getUserGroups() == null) {
            this.userGroups = new java.util.ArrayList<String>(userGroups.length);
        }
        for (String value : userGroups) {
            this.userGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The user groups. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userGroups <p>
     *            The user groups. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * The AWS account IDs. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     *
     * @return <p>
     *         The AWS account IDs. This parameter can be used only when the
     *         <code>Attribute</code> parameter is <code>launchPermission</code>
     *         .
     *         </p>
     */
    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * The AWS account IDs. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     *
     * @param userIds <p>
     *            The AWS account IDs. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * The AWS account IDs. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The AWS account IDs. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withUserIds(String... userIds) {
        if (getUserIds() == null) {
            this.userIds = new java.util.ArrayList<String>(userIds.length);
        }
        for (String value : userIds) {
            this.userIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account IDs. This parameter can be used only when the
     * <code>Attribute</code> parameter is <code>launchPermission</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The AWS account IDs. This parameter can be used only when the
     *            <code>Attribute</code> parameter is
     *            <code>launchPermission</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * The value of the attribute being modified. This parameter can be used
     * only when the <code>Attribute</code> parameter is
     * <code>description</code> or <code>productCodes</code>.
     * </p>
     *
     * @return <p>
     *         The value of the attribute being modified. This parameter can be
     *         used only when the <code>Attribute</code> parameter is
     *         <code>description</code> or <code>productCodes</code>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the attribute being modified. This parameter can be used
     * only when the <code>Attribute</code> parameter is
     * <code>description</code> or <code>productCodes</code>.
     * </p>
     *
     * @param value <p>
     *            The value of the attribute being modified. This parameter can
     *            be used only when the <code>Attribute</code> parameter is
     *            <code>description</code> or <code>productCodes</code>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute being modified. This parameter can be used
     * only when the <code>Attribute</code> parameter is
     * <code>description</code> or <code>productCodes</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the attribute being modified. This parameter can
     *            be used only when the <code>Attribute</code> parameter is
     *            <code>description</code> or <code>productCodes</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyImageAttributeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getLaunchPermission() != null)
            sb.append("LaunchPermission: " + getLaunchPermission() + ",");
        if (getOperationType() != null)
            sb.append("OperationType: " + getOperationType() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getUserGroups() != null)
            sb.append("UserGroups: " + getUserGroups() + ",");
        if (getUserIds() != null)
            sb.append("UserIds: " + getUserIds() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchPermission() == null) ? 0 : getLaunchPermission().hashCode());
        hashCode = prime * hashCode
                + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyImageAttributeRequest == false)
            return false;
        ModifyImageAttributeRequest other = (ModifyImageAttributeRequest) obj;

        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getLaunchPermission() == null ^ this.getLaunchPermission() == null)
            return false;
        if (other.getLaunchPermission() != null
                && other.getLaunchPermission().equals(this.getLaunchPermission()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null
                && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null
                && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
