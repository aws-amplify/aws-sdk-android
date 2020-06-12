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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The details of a capacity provider.
 * </p>
 */
public class CapacityProvider implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the capacity provider.
     * </p>
     */
    private String capacityProviderArn;

    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The current status of the capacity provider. Only capacity providers in
     * an <code>ACTIVE</code> state can be used in a cluster. When a capacity
     * provider is successfully deleted, it will have an <code>INACTIVE</code>
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The Auto Scaling group settings for the capacity provider.
     * </p>
     */
    private AutoScalingGroupProvider autoScalingGroupProvider;

    /**
     * <p>
     * The update status of the capacity provider. The following are the
     * possible states that will be returned.
     * </p>
     * <dl>
     * <dt>DELETE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The capacity provider is in the process of being deleted.
     * </p>
     * </dd>
     * <dt>DELETE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity provider has been successfully deleted and will have an
     * <code>INACTIVE</code> status.
     * </p>
     * </dd>
     * <dt>DELETE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider was unable to be deleted. The update status reason
     * will provide further details about why the delete failed.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED
     */
    private String updateStatus;

    /**
     * <p>
     * The update status reason. This provides further details about the update
     * status for the capacity provider.
     * </p>
     */
    private String updateStatusReason;

    /**
     * <p>
     * The metadata that you apply to the capacity provider to help you
     * categorize and organize it. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the capacity provider.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the capacity
     *         provider.
     *         </p>
     */
    public String getCapacityProviderArn() {
        return capacityProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the capacity provider.
     * </p>
     *
     * @param capacityProviderArn <p>
     *            The Amazon Resource Name (ARN) that identifies the capacity
     *            provider.
     *            </p>
     */
    public void setCapacityProviderArn(String capacityProviderArn) {
        this.capacityProviderArn = capacityProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderArn <p>
     *            The Amazon Resource Name (ARN) that identifies the capacity
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProvider withCapacityProviderArn(String capacityProviderArn) {
        this.capacityProviderArn = capacityProviderArn;
        return this;
    }

    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     *
     * @return <p>
     *         The name of the capacity provider.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     *
     * @param name <p>
     *            The name of the capacity provider.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the capacity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current status of the capacity provider. Only capacity providers in
     * an <code>ACTIVE</code> state can be used in a cluster. When a capacity
     * provider is successfully deleted, it will have an <code>INACTIVE</code>
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The current status of the capacity provider. Only capacity
     *         providers in an <code>ACTIVE</code> state can be used in a
     *         cluster. When a capacity provider is successfully deleted, it
     *         will have an <code>INACTIVE</code> status.
     *         </p>
     * @see CapacityProviderStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the capacity provider. Only capacity providers in
     * an <code>ACTIVE</code> state can be used in a cluster. When a capacity
     * provider is successfully deleted, it will have an <code>INACTIVE</code>
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The current status of the capacity provider. Only capacity
     *            providers in an <code>ACTIVE</code> state can be used in a
     *            cluster. When a capacity provider is successfully deleted, it
     *            will have an <code>INACTIVE</code> status.
     *            </p>
     * @see CapacityProviderStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the capacity provider. Only capacity providers in
     * an <code>ACTIVE</code> state can be used in a cluster. When a capacity
     * provider is successfully deleted, it will have an <code>INACTIVE</code>
     * status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The current status of the capacity provider. Only capacity
     *            providers in an <code>ACTIVE</code> state can be used in a
     *            cluster. When a capacity provider is successfully deleted, it
     *            will have an <code>INACTIVE</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityProviderStatus
     */
    public CapacityProvider withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the capacity provider. Only capacity providers in
     * an <code>ACTIVE</code> state can be used in a cluster. When a capacity
     * provider is successfully deleted, it will have an <code>INACTIVE</code>
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The current status of the capacity provider. Only capacity
     *            providers in an <code>ACTIVE</code> state can be used in a
     *            cluster. When a capacity provider is successfully deleted, it
     *            will have an <code>INACTIVE</code> status.
     *            </p>
     * @see CapacityProviderStatus
     */
    public void setStatus(CapacityProviderStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the capacity provider. Only capacity providers in
     * an <code>ACTIVE</code> state can be used in a cluster. When a capacity
     * provider is successfully deleted, it will have an <code>INACTIVE</code>
     * status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The current status of the capacity provider. Only capacity
     *            providers in an <code>ACTIVE</code> state can be used in a
     *            cluster. When a capacity provider is successfully deleted, it
     *            will have an <code>INACTIVE</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityProviderStatus
     */
    public CapacityProvider withStatus(CapacityProviderStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Auto Scaling group settings for the capacity provider.
     * </p>
     *
     * @return <p>
     *         The Auto Scaling group settings for the capacity provider.
     *         </p>
     */
    public AutoScalingGroupProvider getAutoScalingGroupProvider() {
        return autoScalingGroupProvider;
    }

    /**
     * <p>
     * The Auto Scaling group settings for the capacity provider.
     * </p>
     *
     * @param autoScalingGroupProvider <p>
     *            The Auto Scaling group settings for the capacity provider.
     *            </p>
     */
    public void setAutoScalingGroupProvider(AutoScalingGroupProvider autoScalingGroupProvider) {
        this.autoScalingGroupProvider = autoScalingGroupProvider;
    }

    /**
     * <p>
     * The Auto Scaling group settings for the capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroupProvider <p>
     *            The Auto Scaling group settings for the capacity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProvider withAutoScalingGroupProvider(
            AutoScalingGroupProvider autoScalingGroupProvider) {
        this.autoScalingGroupProvider = autoScalingGroupProvider;
        return this;
    }

    /**
     * <p>
     * The update status of the capacity provider. The following are the
     * possible states that will be returned.
     * </p>
     * <dl>
     * <dt>DELETE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The capacity provider is in the process of being deleted.
     * </p>
     * </dd>
     * <dt>DELETE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity provider has been successfully deleted and will have an
     * <code>INACTIVE</code> status.
     * </p>
     * </dd>
     * <dt>DELETE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider was unable to be deleted. The update status reason
     * will provide further details about why the delete failed.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED
     *
     * @return <p>
     *         The update status of the capacity provider. The following are the
     *         possible states that will be returned.
     *         </p>
     *         <dl>
     *         <dt>DELETE_IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         The capacity provider is in the process of being deleted.
     *         </p>
     *         </dd>
     *         <dt>DELETE_COMPLETE</dt>
     *         <dd>
     *         <p>
     *         The capacity provider has been successfully deleted and will have
     *         an <code>INACTIVE</code> status.
     *         </p>
     *         </dd>
     *         <dt>DELETE_FAILED</dt>
     *         <dd>
     *         <p>
     *         The capacity provider was unable to be deleted. The update status
     *         reason will provide further details about why the delete failed.
     *         </p>
     *         </dd>
     *         </dl>
     * @see CapacityProviderUpdateStatus
     */
    public String getUpdateStatus() {
        return updateStatus;
    }

    /**
     * <p>
     * The update status of the capacity provider. The following are the
     * possible states that will be returned.
     * </p>
     * <dl>
     * <dt>DELETE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The capacity provider is in the process of being deleted.
     * </p>
     * </dd>
     * <dt>DELETE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity provider has been successfully deleted and will have an
     * <code>INACTIVE</code> status.
     * </p>
     * </dd>
     * <dt>DELETE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider was unable to be deleted. The update status reason
     * will provide further details about why the delete failed.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED
     *
     * @param updateStatus <p>
     *            The update status of the capacity provider. The following are
     *            the possible states that will be returned.
     *            </p>
     *            <dl>
     *            <dt>DELETE_IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            The capacity provider is in the process of being deleted.
     *            </p>
     *            </dd>
     *            <dt>DELETE_COMPLETE</dt>
     *            <dd>
     *            <p>
     *            The capacity provider has been successfully deleted and will
     *            have an <code>INACTIVE</code> status.
     *            </p>
     *            </dd>
     *            <dt>DELETE_FAILED</dt>
     *            <dd>
     *            <p>
     *            The capacity provider was unable to be deleted. The update
     *            status reason will provide further details about why the
     *            delete failed.
     *            </p>
     *            </dd>
     *            </dl>
     * @see CapacityProviderUpdateStatus
     */
    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The update status of the capacity provider. The following are the
     * possible states that will be returned.
     * </p>
     * <dl>
     * <dt>DELETE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The capacity provider is in the process of being deleted.
     * </p>
     * </dd>
     * <dt>DELETE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity provider has been successfully deleted and will have an
     * <code>INACTIVE</code> status.
     * </p>
     * </dd>
     * <dt>DELETE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider was unable to be deleted. The update status reason
     * will provide further details about why the delete failed.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED
     *
     * @param updateStatus <p>
     *            The update status of the capacity provider. The following are
     *            the possible states that will be returned.
     *            </p>
     *            <dl>
     *            <dt>DELETE_IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            The capacity provider is in the process of being deleted.
     *            </p>
     *            </dd>
     *            <dt>DELETE_COMPLETE</dt>
     *            <dd>
     *            <p>
     *            The capacity provider has been successfully deleted and will
     *            have an <code>INACTIVE</code> status.
     *            </p>
     *            </dd>
     *            <dt>DELETE_FAILED</dt>
     *            <dd>
     *            <p>
     *            The capacity provider was unable to be deleted. The update
     *            status reason will provide further details about why the
     *            delete failed.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityProviderUpdateStatus
     */
    public CapacityProvider withUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    /**
     * <p>
     * The update status of the capacity provider. The following are the
     * possible states that will be returned.
     * </p>
     * <dl>
     * <dt>DELETE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The capacity provider is in the process of being deleted.
     * </p>
     * </dd>
     * <dt>DELETE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity provider has been successfully deleted and will have an
     * <code>INACTIVE</code> status.
     * </p>
     * </dd>
     * <dt>DELETE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider was unable to be deleted. The update status reason
     * will provide further details about why the delete failed.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED
     *
     * @param updateStatus <p>
     *            The update status of the capacity provider. The following are
     *            the possible states that will be returned.
     *            </p>
     *            <dl>
     *            <dt>DELETE_IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            The capacity provider is in the process of being deleted.
     *            </p>
     *            </dd>
     *            <dt>DELETE_COMPLETE</dt>
     *            <dd>
     *            <p>
     *            The capacity provider has been successfully deleted and will
     *            have an <code>INACTIVE</code> status.
     *            </p>
     *            </dd>
     *            <dt>DELETE_FAILED</dt>
     *            <dd>
     *            <p>
     *            The capacity provider was unable to be deleted. The update
     *            status reason will provide further details about why the
     *            delete failed.
     *            </p>
     *            </dd>
     *            </dl>
     * @see CapacityProviderUpdateStatus
     */
    public void setUpdateStatus(CapacityProviderUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
    }

    /**
     * <p>
     * The update status of the capacity provider. The following are the
     * possible states that will be returned.
     * </p>
     * <dl>
     * <dt>DELETE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The capacity provider is in the process of being deleted.
     * </p>
     * </dd>
     * <dt>DELETE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity provider has been successfully deleted and will have an
     * <code>INACTIVE</code> status.
     * </p>
     * </dd>
     * <dt>DELETE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider was unable to be deleted. The update status reason
     * will provide further details about why the delete failed.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED
     *
     * @param updateStatus <p>
     *            The update status of the capacity provider. The following are
     *            the possible states that will be returned.
     *            </p>
     *            <dl>
     *            <dt>DELETE_IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            The capacity provider is in the process of being deleted.
     *            </p>
     *            </dd>
     *            <dt>DELETE_COMPLETE</dt>
     *            <dd>
     *            <p>
     *            The capacity provider has been successfully deleted and will
     *            have an <code>INACTIVE</code> status.
     *            </p>
     *            </dd>
     *            <dt>DELETE_FAILED</dt>
     *            <dd>
     *            <p>
     *            The capacity provider was unable to be deleted. The update
     *            status reason will provide further details about why the
     *            delete failed.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityProviderUpdateStatus
     */
    public CapacityProvider withUpdateStatus(CapacityProviderUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The update status reason. This provides further details about the update
     * status for the capacity provider.
     * </p>
     *
     * @return <p>
     *         The update status reason. This provides further details about the
     *         update status for the capacity provider.
     *         </p>
     */
    public String getUpdateStatusReason() {
        return updateStatusReason;
    }

    /**
     * <p>
     * The update status reason. This provides further details about the update
     * status for the capacity provider.
     * </p>
     *
     * @param updateStatusReason <p>
     *            The update status reason. This provides further details about
     *            the update status for the capacity provider.
     *            </p>
     */
    public void setUpdateStatusReason(String updateStatusReason) {
        this.updateStatusReason = updateStatusReason;
    }

    /**
     * <p>
     * The update status reason. This provides further details about the update
     * status for the capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateStatusReason <p>
     *            The update status reason. This provides further details about
     *            the update status for the capacity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProvider withUpdateStatusReason(String updateStatusReason) {
        this.updateStatusReason = updateStatusReason;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the capacity provider to help you
     * categorize and organize it. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The metadata that you apply to the capacity provider to help you
     *         categorize and organize it. Each tag consists of a key and an
     *         optional value, both of which you define.
     *         </p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key
     *         can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and
     *         resources, remember that other services may have restrictions on
     *         allowed characters. Generally allowed characters are: letters,
     *         numbers, and spaces representable in UTF-8, and the following
     *         characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     *         lowercase combination of such as a prefix for either keys or
     *         values as it is reserved for AWS use. You cannot edit or delete
     *         tag keys or values with this prefix. Tags with this prefix do not
     *         count against your tags per resource limit.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the capacity provider to help you
     * categorize and organize it. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            The metadata that you apply to the capacity provider to help
     *            you categorize and organize it. Each tag consists of a key and
     *            an optional value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
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
     * The metadata that you apply to the capacity provider to help you
     * categorize and organize it. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the capacity provider to help
     *            you categorize and organize it. Each tag consists of a key and
     *            an optional value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProvider withTags(Tag... tags) {
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
     * The metadata that you apply to the capacity provider to help you
     * categorize and organize it. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the capacity provider to help
     *            you categorize and organize it. Each tag consists of a key and
     *            an optional value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityProvider withTags(java.util.Collection<Tag> tags) {
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
        if (getCapacityProviderArn() != null)
            sb.append("capacityProviderArn: " + getCapacityProviderArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getAutoScalingGroupProvider() != null)
            sb.append("autoScalingGroupProvider: " + getAutoScalingGroupProvider() + ",");
        if (getUpdateStatus() != null)
            sb.append("updateStatus: " + getUpdateStatus() + ",");
        if (getUpdateStatusReason() != null)
            sb.append("updateStatusReason: " + getUpdateStatusReason() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapacityProviderArn() == null) ? 0 : getCapacityProviderArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoScalingGroupProvider() == null) ? 0 : getAutoScalingGroupProvider()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateStatusReason() == null) ? 0 : getUpdateStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityProvider == false)
            return false;
        CapacityProvider other = (CapacityProvider) obj;

        if (other.getCapacityProviderArn() == null ^ this.getCapacityProviderArn() == null)
            return false;
        if (other.getCapacityProviderArn() != null
                && other.getCapacityProviderArn().equals(this.getCapacityProviderArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAutoScalingGroupProvider() == null
                ^ this.getAutoScalingGroupProvider() == null)
            return false;
        if (other.getAutoScalingGroupProvider() != null
                && other.getAutoScalingGroupProvider().equals(this.getAutoScalingGroupProvider()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null
                && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getUpdateStatusReason() == null ^ this.getUpdateStatusReason() == null)
            return false;
        if (other.getUpdateStatusReason() != null
                && other.getUpdateStatusReason().equals(this.getUpdateStatusReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
