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
 * Modifies the specified attribute of the specified Amazon FPGA Image (AFI).
 * </p>
 */
public class ModifyFpgaImageAttributeRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The ID of the AFI.
     * </p>
     */
    private String fpgaImageId;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, loadPermission, productCodes
     */
    private String attribute;

    /**
     * <p>
     * The operation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     */
    private String operationType;

    /**
     * <p>
     * The AWS account IDs. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * The user groups. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     */
    private java.util.List<String> userGroups;

    /**
     * <p>
     * The product codes. After you add a product code to an AFI, it can't be
     * removed. This parameter is valid only when modifying the
     * <code>productCodes</code> attribute.
     * </p>
     */
    private java.util.List<String> productCodes;

    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     */
    private LoadPermissionModifications loadPermission;

    /**
     * <p>
     * A description for the AFI.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A name for the AFI.
     * </p>
     */
    private String name;

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
    public ModifyFpgaImageAttributeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     *
     * @return <p>
     *         The ID of the AFI.
     *         </p>
     */
    public String getFpgaImageId() {
        return fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     *
     * @param fpgaImageId <p>
     *            The ID of the AFI.
     *            </p>
     */
    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageId <p>
     *            The ID of the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, loadPermission, productCodes
     *
     * @return <p>
     *         The name of the attribute.
     *         </p>
     * @see FpgaImageAttributeName
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, loadPermission, productCodes
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @see FpgaImageAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, loadPermission, productCodes
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FpgaImageAttributeName
     */
    public ModifyFpgaImageAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, loadPermission, productCodes
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @see FpgaImageAttributeName
     */
    public void setAttribute(FpgaImageAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, loadPermission, productCodes
     *
     * @param attribute <p>
     *            The name of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FpgaImageAttributeName
     */
    public ModifyFpgaImageAttributeRequest withAttribute(FpgaImageAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @return <p>
     *         The operation type.
     *         </p>
     * @see OperationType
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public ModifyFpgaImageAttributeRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove
     *
     * @param operationType <p>
     *            The operation type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public ModifyFpgaImageAttributeRequest withOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS account IDs. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     *
     * @return <p>
     *         The AWS account IDs. This parameter is valid only when modifying
     *         the <code>loadPermission</code> attribute.
     *         </p>
     */
    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * The AWS account IDs. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     *
     * @param userIds <p>
     *            The AWS account IDs. This parameter is valid only when
     *            modifying the <code>loadPermission</code> attribute.
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
     * The AWS account IDs. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The AWS account IDs. This parameter is valid only when
     *            modifying the <code>loadPermission</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withUserIds(String... userIds) {
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
     * The AWS account IDs. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            The AWS account IDs. This parameter is valid only when
     *            modifying the <code>loadPermission</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * The user groups. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     *
     * @return <p>
     *         The user groups. This parameter is valid only when modifying the
     *         <code>loadPermission</code> attribute.
     *         </p>
     */
    public java.util.List<String> getUserGroups() {
        return userGroups;
    }

    /**
     * <p>
     * The user groups. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     *
     * @param userGroups <p>
     *            The user groups. This parameter is valid only when modifying
     *            the <code>loadPermission</code> attribute.
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
     * The user groups. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userGroups <p>
     *            The user groups. This parameter is valid only when modifying
     *            the <code>loadPermission</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withUserGroups(String... userGroups) {
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
     * The user groups. This parameter is valid only when modifying the
     * <code>loadPermission</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userGroups <p>
     *            The user groups. This parameter is valid only when modifying
     *            the <code>loadPermission</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * The product codes. After you add a product code to an AFI, it can't be
     * removed. This parameter is valid only when modifying the
     * <code>productCodes</code> attribute.
     * </p>
     *
     * @return <p>
     *         The product codes. After you add a product code to an AFI, it
     *         can't be removed. This parameter is valid only when modifying the
     *         <code>productCodes</code> attribute.
     *         </p>
     */
    public java.util.List<String> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * The product codes. After you add a product code to an AFI, it can't be
     * removed. This parameter is valid only when modifying the
     * <code>productCodes</code> attribute.
     * </p>
     *
     * @param productCodes <p>
     *            The product codes. After you add a product code to an AFI, it
     *            can't be removed. This parameter is valid only when modifying
     *            the <code>productCodes</code> attribute.
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
     * The product codes. After you add a product code to an AFI, it can't be
     * removed. This parameter is valid only when modifying the
     * <code>productCodes</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes. After you add a product code to an AFI, it
     *            can't be removed. This parameter is valid only when modifying
     *            the <code>productCodes</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withProductCodes(String... productCodes) {
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
     * The product codes. After you add a product code to an AFI, it can't be
     * removed. This parameter is valid only when modifying the
     * <code>productCodes</code> attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes. After you add a product code to an AFI, it
     *            can't be removed. This parameter is valid only when modifying
     *            the <code>productCodes</code> attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withProductCodes(
            java.util.Collection<String> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     *
     * @return <p>
     *         The load permission for the AFI.
     *         </p>
     */
    public LoadPermissionModifications getLoadPermission() {
        return loadPermission;
    }

    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     *
     * @param loadPermission <p>
     *            The load permission for the AFI.
     *            </p>
     */
    public void setLoadPermission(LoadPermissionModifications loadPermission) {
        this.loadPermission = loadPermission;
    }

    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadPermission <p>
     *            The load permission for the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withLoadPermission(
            LoadPermissionModifications loadPermission) {
        this.loadPermission = loadPermission;
        return this;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     *
     * @return <p>
     *         A description for the AFI.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     *
     * @param description <p>
     *            A description for the AFI.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     *
     * @return <p>
     *         A name for the AFI.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     *
     * @param name <p>
     *            A name for the AFI.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A name for the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFpgaImageAttributeRequest withName(String name) {
        this.name = name;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: " + getFpgaImageId() + ",");
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getOperationType() != null)
            sb.append("OperationType: " + getOperationType() + ",");
        if (getUserIds() != null)
            sb.append("UserIds: " + getUserIds() + ",");
        if (getUserGroups() != null)
            sb.append("UserGroups: " + getUserGroups() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getLoadPermission() != null)
            sb.append("LoadPermission: " + getLoadPermission() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode
                + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode
                + ((getLoadPermission() == null) ? 0 : getLoadPermission().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyFpgaImageAttributeRequest == false)
            return false;
        ModifyFpgaImageAttributeRequest other = (ModifyFpgaImageAttributeRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null
                && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null
                && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null
                && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getLoadPermission() == null ^ this.getLoadPermission() == null)
            return false;
        if (other.getLoadPermission() != null
                && other.getLoadPermission().equals(this.getLoadPermission()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
