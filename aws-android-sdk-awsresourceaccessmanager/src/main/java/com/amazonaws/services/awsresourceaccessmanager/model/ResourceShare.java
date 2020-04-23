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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a resource share.
 * </p>
 */
public class ResourceShare implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     */
    private String owningAccountId;

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     */
    private Boolean allowExternalPrincipals;

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     */
    private String status;

    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The tags for the resource share.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * Indicates how the resource share was created. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_FROM_POLICY</code> - Indicates that the resource share was
     * created from an AWS Identity and Access Management (AWS IAM) policy
     * attached to a resource. These resource shares are visible only to the AWS
     * account that created it. They cannot be modified in AWS RAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROMOTING_TO_STANDARD</code> - The resource share is in the process
     * of being promoted. For more information, see
     * <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> - Indicates that the resource share was created in
     * AWS RAM using the console or APIs. These resource shares are visible to
     * all principals. They can be modified in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_FROM_POLICY, PROMOTING_TO_STANDARD,
     * STANDARD
     */
    private String featureSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource share.
     *         </p>
     */
    public String getResourceShareArn() {
        return resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     */
    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @return <p>
     *         The name of the resource share.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @param name <p>
     *            The name of the resource share.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the resource share.
     *         </p>
     */
    public String getOwningAccountId() {
        return owningAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     *
     * @param owningAccountId <p>
     *            The ID of the AWS account that owns the resource share.
     *            </p>
     */
    public void setOwningAccountId(String owningAccountId) {
        this.owningAccountId = owningAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owningAccountId <p>
     *            The ID of the AWS account that owns the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withOwningAccountId(String owningAccountId) {
        this.owningAccountId = owningAccountId;
        return this;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     *
     * @return <p>
     *         Indicates whether principals outside your AWS organization can be
     *         associated with a resource share.
     *         </p>
     */
    public Boolean isAllowExternalPrincipals() {
        return allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     *
     * @return <p>
     *         Indicates whether principals outside your AWS organization can be
     *         associated with a resource share.
     *         </p>
     */
    public Boolean getAllowExternalPrincipals() {
        return allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     *
     * @param allowExternalPrincipals <p>
     *            Indicates whether principals outside your AWS organization can
     *            be associated with a resource share.
     *            </p>
     */
    public void setAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowExternalPrincipals <p>
     *            Indicates whether principals outside your AWS organization can
     *            be associated with a resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
        return this;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @return <p>
     *         The status of the resource share.
     *         </p>
     * @see ResourceShareStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param status <p>
     *            The status of the resource share.
     *            </p>
     * @see ResourceShareStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param status <p>
     *            The status of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareStatus
     */
    public ResourceShare withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param status <p>
     *            The status of the resource share.
     *            </p>
     * @see ResourceShareStatus
     */
    public void setStatus(ResourceShareStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param status <p>
     *            The status of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareStatus
     */
    public ResourceShare withStatus(ResourceShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     *
     * @return <p>
     *         A message about the status of the resource share.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     *
     * @param statusMessage <p>
     *            A message about the status of the resource share.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A message about the status of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The tags for the resource share.
     * </p>
     *
     * @return <p>
     *         The tags for the resource share.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the resource share.
     * </p>
     *
     * @param tags <p>
     *            The tags for the resource share.
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
     * The tags for the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withTags(Tag... tags) {
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
     * The tags for the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     *
     * @return <p>
     *         The time when the resource share was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time when the resource share was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the resource share was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the resource share was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     *
     * @return <p>
     *         The time when the resource share was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The time when the resource share was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the resource share was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The time when the resource share was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShare withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * Indicates how the resource share was created. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_FROM_POLICY</code> - Indicates that the resource share was
     * created from an AWS Identity and Access Management (AWS IAM) policy
     * attached to a resource. These resource shares are visible only to the AWS
     * account that created it. They cannot be modified in AWS RAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROMOTING_TO_STANDARD</code> - The resource share is in the process
     * of being promoted. For more information, see
     * <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> - Indicates that the resource share was created in
     * AWS RAM using the console or APIs. These resource shares are visible to
     * all principals. They can be modified in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_FROM_POLICY, PROMOTING_TO_STANDARD,
     * STANDARD
     *
     * @return <p>
     *         Indicates how the resource share was created. Possible values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED_FROM_POLICY</code> - Indicates that the resource
     *         share was created from an AWS Identity and Access Management (AWS
     *         IAM) policy attached to a resource. These resource shares are
     *         visible only to the AWS account that created it. They cannot be
     *         modified in AWS RAM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROMOTING_TO_STANDARD</code> - The resource share is in the
     *         process of being promoted. For more information, see
     *         <a>PromoteResourceShareCreatedFromPolicy</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STANDARD</code> - Indicates that the resource share was
     *         created in AWS RAM using the console or APIs. These resource
     *         shares are visible to all principals. They can be modified in AWS
     *         RAM.
     *         </p>
     *         </li>
     *         </ul>
     * @see ResourceShareFeatureSet
     */
    public String getFeatureSet() {
        return featureSet;
    }

    /**
     * <p>
     * Indicates how the resource share was created. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_FROM_POLICY</code> - Indicates that the resource share was
     * created from an AWS Identity and Access Management (AWS IAM) policy
     * attached to a resource. These resource shares are visible only to the AWS
     * account that created it. They cannot be modified in AWS RAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROMOTING_TO_STANDARD</code> - The resource share is in the process
     * of being promoted. For more information, see
     * <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> - Indicates that the resource share was created in
     * AWS RAM using the console or APIs. These resource shares are visible to
     * all principals. They can be modified in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_FROM_POLICY, PROMOTING_TO_STANDARD,
     * STANDARD
     *
     * @param featureSet <p>
     *            Indicates how the resource share was created. Possible values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED_FROM_POLICY</code> - Indicates that the resource
     *            share was created from an AWS Identity and Access Management
     *            (AWS IAM) policy attached to a resource. These resource shares
     *            are visible only to the AWS account that created it. They
     *            cannot be modified in AWS RAM.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROMOTING_TO_STANDARD</code> - The resource share is in
     *            the process of being promoted. For more information, see
     *            <a>PromoteResourceShareCreatedFromPolicy</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STANDARD</code> - Indicates that the resource share was
     *            created in AWS RAM using the console or APIs. These resource
     *            shares are visible to all principals. They can be modified in
     *            AWS RAM.
     *            </p>
     *            </li>
     *            </ul>
     * @see ResourceShareFeatureSet
     */
    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    /**
     * <p>
     * Indicates how the resource share was created. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_FROM_POLICY</code> - Indicates that the resource share was
     * created from an AWS Identity and Access Management (AWS IAM) policy
     * attached to a resource. These resource shares are visible only to the AWS
     * account that created it. They cannot be modified in AWS RAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROMOTING_TO_STANDARD</code> - The resource share is in the process
     * of being promoted. For more information, see
     * <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> - Indicates that the resource share was created in
     * AWS RAM using the console or APIs. These resource shares are visible to
     * all principals. They can be modified in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_FROM_POLICY, PROMOTING_TO_STANDARD,
     * STANDARD
     *
     * @param featureSet <p>
     *            Indicates how the resource share was created. Possible values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED_FROM_POLICY</code> - Indicates that the resource
     *            share was created from an AWS Identity and Access Management
     *            (AWS IAM) policy attached to a resource. These resource shares
     *            are visible only to the AWS account that created it. They
     *            cannot be modified in AWS RAM.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROMOTING_TO_STANDARD</code> - The resource share is in
     *            the process of being promoted. For more information, see
     *            <a>PromoteResourceShareCreatedFromPolicy</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STANDARD</code> - Indicates that the resource share was
     *            created in AWS RAM using the console or APIs. These resource
     *            shares are visible to all principals. They can be modified in
     *            AWS RAM.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareFeatureSet
     */
    public ResourceShare withFeatureSet(String featureSet) {
        this.featureSet = featureSet;
        return this;
    }

    /**
     * <p>
     * Indicates how the resource share was created. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_FROM_POLICY</code> - Indicates that the resource share was
     * created from an AWS Identity and Access Management (AWS IAM) policy
     * attached to a resource. These resource shares are visible only to the AWS
     * account that created it. They cannot be modified in AWS RAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROMOTING_TO_STANDARD</code> - The resource share is in the process
     * of being promoted. For more information, see
     * <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> - Indicates that the resource share was created in
     * AWS RAM using the console or APIs. These resource shares are visible to
     * all principals. They can be modified in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_FROM_POLICY, PROMOTING_TO_STANDARD,
     * STANDARD
     *
     * @param featureSet <p>
     *            Indicates how the resource share was created. Possible values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED_FROM_POLICY</code> - Indicates that the resource
     *            share was created from an AWS Identity and Access Management
     *            (AWS IAM) policy attached to a resource. These resource shares
     *            are visible only to the AWS account that created it. They
     *            cannot be modified in AWS RAM.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROMOTING_TO_STANDARD</code> - The resource share is in
     *            the process of being promoted. For more information, see
     *            <a>PromoteResourceShareCreatedFromPolicy</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STANDARD</code> - Indicates that the resource share was
     *            created in AWS RAM using the console or APIs. These resource
     *            shares are visible to all principals. They can be modified in
     *            AWS RAM.
     *            </p>
     *            </li>
     *            </ul>
     * @see ResourceShareFeatureSet
     */
    public void setFeatureSet(ResourceShareFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
    }

    /**
     * <p>
     * Indicates how the resource share was created. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED_FROM_POLICY</code> - Indicates that the resource share was
     * created from an AWS Identity and Access Management (AWS IAM) policy
     * attached to a resource. These resource shares are visible only to the AWS
     * account that created it. They cannot be modified in AWS RAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROMOTING_TO_STANDARD</code> - The resource share is in the process
     * of being promoted. For more information, see
     * <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code> - Indicates that the resource share was created in
     * AWS RAM using the console or APIs. These resource shares are visible to
     * all principals. They can be modified in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_FROM_POLICY, PROMOTING_TO_STANDARD,
     * STANDARD
     *
     * @param featureSet <p>
     *            Indicates how the resource share was created. Possible values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED_FROM_POLICY</code> - Indicates that the resource
     *            share was created from an AWS Identity and Access Management
     *            (AWS IAM) policy attached to a resource. These resource shares
     *            are visible only to the AWS account that created it. They
     *            cannot be modified in AWS RAM.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PROMOTING_TO_STANDARD</code> - The resource share is in
     *            the process of being promoted. For more information, see
     *            <a>PromoteResourceShareCreatedFromPolicy</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STANDARD</code> - Indicates that the resource share was
     *            created in AWS RAM using the console or APIs. These resource
     *            shares are visible to all principals. They can be modified in
     *            AWS RAM.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareFeatureSet
     */
    public ResourceShare withFeatureSet(ResourceShareFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
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
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getOwningAccountId() != null)
            sb.append("owningAccountId: " + getOwningAccountId() + ",");
        if (getAllowExternalPrincipals() != null)
            sb.append("allowExternalPrincipals: " + getAllowExternalPrincipals() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("statusMessage: " + getStatusMessage() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getFeatureSet() != null)
            sb.append("featureSet: " + getFeatureSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getOwningAccountId() == null) ? 0 : getOwningAccountId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowExternalPrincipals() == null) ? 0 : getAllowExternalPrincipals()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceShare == false)
            return false;
        ResourceShare other = (ResourceShare) obj;

        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningAccountId() == null ^ this.getOwningAccountId() == null)
            return false;
        if (other.getOwningAccountId() != null
                && other.getOwningAccountId().equals(this.getOwningAccountId()) == false)
            return false;
        if (other.getAllowExternalPrincipals() == null ^ this.getAllowExternalPrincipals() == null)
            return false;
        if (other.getAllowExternalPrincipals() != null
                && other.getAllowExternalPrincipals().equals(this.getAllowExternalPrincipals()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null
                && other.getFeatureSet().equals(this.getFeatureSet()) == false)
            return false;
        return true;
    }
}
