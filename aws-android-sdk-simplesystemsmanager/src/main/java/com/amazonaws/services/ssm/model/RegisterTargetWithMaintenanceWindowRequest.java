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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Registers a target with a maintenance window.
 * </p>
 */
public class RegisterTargetWithMaintenanceWindowRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the maintenance window the target should be registered with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * The type of target being registered with the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     */
    private String resourceType;

    /**
     * <p>
     * The targets to register with the maintenance window. In other words, the
     * instances to run commands on when the maintenance window runs.
     * </p>
     * <p>
     * You can specify targets using instance IDs, resource group names, or tags
     * that have been applied to instances.
     * </p>
     * <p>
     * <b>Example 1</b>: Specify instance IDs
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     * </p>
     * <p>
     * <b>Example 2</b>: Use tag key-pairs applied to instances
     * </p>
     * <p>
     * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     * </p>
     * <p>
     * <b>Example 3</b>: Use tag-keys applied to instances
     * </p>
     * <p>
     * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     * </p>
     * <p>
     * <b>Example 4</b>: Use resource group names
     * </p>
     * <p>
     * <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     * </p>
     * <p>
     * <b>Example 5</b>: Use filters for resource group types
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     * </p>
     * <note>
     * <p>
     * For <code>Key=resource-groups:ResourceTypeFilters</code>, specify
     * resource types in the following format
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     * </p>
     * </note>
     * <p>
     * For more information about these examples formats, including the best use
     * case for each one, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     * >Examples: Register targets with a maintenance window</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised
     * while running tasks for these targets in this maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String ownerInformation;

    /**
     * <p>
     * An optional name for the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * An optional description for the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the maintenance window the target should be registered with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The ID of the maintenance window the target should be registered
     *         with.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window the target should be registered with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window the target should be
     *            registered with.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window the target should be registered with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window the target should be
     *            registered with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTargetWithMaintenanceWindowRequest withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * The type of target being registered with the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @return <p>
     *         The type of target being registered with the maintenance window.
     *         </p>
     * @see MaintenanceWindowResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of target being registered with the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of target being registered with the maintenance
     *            window.
     *            </p>
     * @see MaintenanceWindowResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of target being registered with the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of target being registered with the maintenance
     *            window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowResourceType
     */
    public RegisterTargetWithMaintenanceWindowRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of target being registered with the maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of target being registered with the maintenance
     *            window.
     *            </p>
     * @see MaintenanceWindowResourceType
     */
    public void setResourceType(MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of target being registered with the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>
     *            The type of target being registered with the maintenance
     *            window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowResourceType
     */
    public RegisterTargetWithMaintenanceWindowRequest withResourceType(
            MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The targets to register with the maintenance window. In other words, the
     * instances to run commands on when the maintenance window runs.
     * </p>
     * <p>
     * You can specify targets using instance IDs, resource group names, or tags
     * that have been applied to instances.
     * </p>
     * <p>
     * <b>Example 1</b>: Specify instance IDs
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     * </p>
     * <p>
     * <b>Example 2</b>: Use tag key-pairs applied to instances
     * </p>
     * <p>
     * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     * </p>
     * <p>
     * <b>Example 3</b>: Use tag-keys applied to instances
     * </p>
     * <p>
     * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     * </p>
     * <p>
     * <b>Example 4</b>: Use resource group names
     * </p>
     * <p>
     * <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     * </p>
     * <p>
     * <b>Example 5</b>: Use filters for resource group types
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     * </p>
     * <note>
     * <p>
     * For <code>Key=resource-groups:ResourceTypeFilters</code>, specify
     * resource types in the following format
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     * </p>
     * </note>
     * <p>
     * For more information about these examples formats, including the best use
     * case for each one, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     * >Examples: Register targets with a maintenance window</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The targets to register with the maintenance window. In other
     *         words, the instances to run commands on when the maintenance
     *         window runs.
     *         </p>
     *         <p>
     *         You can specify targets using instance IDs, resource group names,
     *         or tags that have been applied to instances.
     *         </p>
     *         <p>
     *         <b>Example 1</b>: Specify instance IDs
     *         </p>
     *         <p>
     *         <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     *         </p>
     *         <p>
     *         <b>Example 2</b>: Use tag key-pairs applied to instances
     *         </p>
     *         <p>
     *         <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     *         </p>
     *         <p>
     *         <b>Example 3</b>: Use tag-keys applied to instances
     *         </p>
     *         <p>
     *         <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     *         </p>
     *         <p>
     *         <b>Example 4</b>: Use resource group names
     *         </p>
     *         <p>
     *         <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     *         </p>
     *         <p>
     *         <b>Example 5</b>: Use filters for resource group types
     *         </p>
     *         <p>
     *         <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     *         </p>
     *         <note>
     *         <p>
     *         For <code>Key=resource-groups:ResourceTypeFilters</code>, specify
     *         resource types in the following format
     *         </p>
     *         <p>
     *         <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     *         </p>
     *         </note>
     *         <p>
     *         For more information about these examples formats, including the
     *         best use case for each one, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     *         >Examples: Register targets with a maintenance window</a> in the
     *         <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets to register with the maintenance window. In other words, the
     * instances to run commands on when the maintenance window runs.
     * </p>
     * <p>
     * You can specify targets using instance IDs, resource group names, or tags
     * that have been applied to instances.
     * </p>
     * <p>
     * <b>Example 1</b>: Specify instance IDs
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     * </p>
     * <p>
     * <b>Example 2</b>: Use tag key-pairs applied to instances
     * </p>
     * <p>
     * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     * </p>
     * <p>
     * <b>Example 3</b>: Use tag-keys applied to instances
     * </p>
     * <p>
     * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     * </p>
     * <p>
     * <b>Example 4</b>: Use resource group names
     * </p>
     * <p>
     * <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     * </p>
     * <p>
     * <b>Example 5</b>: Use filters for resource group types
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     * </p>
     * <note>
     * <p>
     * For <code>Key=resource-groups:ResourceTypeFilters</code>, specify
     * resource types in the following format
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     * </p>
     * </note>
     * <p>
     * For more information about these examples formats, including the best use
     * case for each one, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     * >Examples: Register targets with a maintenance window</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     *
     * @param targets <p>
     *            The targets to register with the maintenance window. In other
     *            words, the instances to run commands on when the maintenance
     *            window runs.
     *            </p>
     *            <p>
     *            You can specify targets using instance IDs, resource group
     *            names, or tags that have been applied to instances.
     *            </p>
     *            <p>
     *            <b>Example 1</b>: Specify instance IDs
     *            </p>
     *            <p>
     *            <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 2</b>: Use tag key-pairs applied to instances
     *            </p>
     *            <p>
     *            <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 3</b>: Use tag-keys applied to instances
     *            </p>
     *            <p>
     *            <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 4</b>: Use resource group names
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 5</b>: Use filters for resource group types
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     *            </p>
     *            <note>
     *            <p>
     *            For <code>Key=resource-groups:ResourceTypeFilters</code>,
     *            specify resource types in the following format
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     *            </p>
     *            </note>
     *            <p>
     *            For more information about these examples formats, including
     *            the best use case for each one, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     *            >Examples: Register targets with a maintenance window</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The targets to register with the maintenance window. In other words, the
     * instances to run commands on when the maintenance window runs.
     * </p>
     * <p>
     * You can specify targets using instance IDs, resource group names, or tags
     * that have been applied to instances.
     * </p>
     * <p>
     * <b>Example 1</b>: Specify instance IDs
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     * </p>
     * <p>
     * <b>Example 2</b>: Use tag key-pairs applied to instances
     * </p>
     * <p>
     * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     * </p>
     * <p>
     * <b>Example 3</b>: Use tag-keys applied to instances
     * </p>
     * <p>
     * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     * </p>
     * <p>
     * <b>Example 4</b>: Use resource group names
     * </p>
     * <p>
     * <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     * </p>
     * <p>
     * <b>Example 5</b>: Use filters for resource group types
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     * </p>
     * <note>
     * <p>
     * For <code>Key=resource-groups:ResourceTypeFilters</code>, specify
     * resource types in the following format
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     * </p>
     * </note>
     * <p>
     * For more information about these examples formats, including the best use
     * case for each one, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     * >Examples: Register targets with a maintenance window</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets to register with the maintenance window. In other
     *            words, the instances to run commands on when the maintenance
     *            window runs.
     *            </p>
     *            <p>
     *            You can specify targets using instance IDs, resource group
     *            names, or tags that have been applied to instances.
     *            </p>
     *            <p>
     *            <b>Example 1</b>: Specify instance IDs
     *            </p>
     *            <p>
     *            <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 2</b>: Use tag key-pairs applied to instances
     *            </p>
     *            <p>
     *            <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 3</b>: Use tag-keys applied to instances
     *            </p>
     *            <p>
     *            <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 4</b>: Use resource group names
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 5</b>: Use filters for resource group types
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     *            </p>
     *            <note>
     *            <p>
     *            For <code>Key=resource-groups:ResourceTypeFilters</code>,
     *            specify resource types in the following format
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     *            </p>
     *            </note>
     *            <p>
     *            For more information about these examples formats, including
     *            the best use case for each one, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     *            >Examples: Register targets with a maintenance window</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTargetWithMaintenanceWindowRequest withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The targets to register with the maintenance window. In other words, the
     * instances to run commands on when the maintenance window runs.
     * </p>
     * <p>
     * You can specify targets using instance IDs, resource group names, or tags
     * that have been applied to instances.
     * </p>
     * <p>
     * <b>Example 1</b>: Specify instance IDs
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     * </p>
     * <p>
     * <b>Example 2</b>: Use tag key-pairs applied to instances
     * </p>
     * <p>
     * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     * </p>
     * <p>
     * <b>Example 3</b>: Use tag-keys applied to instances
     * </p>
     * <p>
     * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     * </p>
     * <p>
     * <b>Example 4</b>: Use resource group names
     * </p>
     * <p>
     * <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     * </p>
     * <p>
     * <b>Example 5</b>: Use filters for resource group types
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     * </p>
     * <note>
     * <p>
     * For <code>Key=resource-groups:ResourceTypeFilters</code>, specify
     * resource types in the following format
     * </p>
     * <p>
     * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     * </p>
     * </note>
     * <p>
     * For more information about these examples formats, including the best use
     * case for each one, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     * >Examples: Register targets with a maintenance window</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets to register with the maintenance window. In other
     *            words, the instances to run commands on when the maintenance
     *            window runs.
     *            </p>
     *            <p>
     *            You can specify targets using instance IDs, resource group
     *            names, or tags that have been applied to instances.
     *            </p>
     *            <p>
     *            <b>Example 1</b>: Specify instance IDs
     *            </p>
     *            <p>
     *            <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 2</b>: Use tag key-pairs applied to instances
     *            </p>
     *            <p>
     *            <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 3</b>: Use tag-keys applied to instances
     *            </p>
     *            <p>
     *            <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 4</b>: Use resource group names
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
     *            </p>
     *            <p>
     *            <b>Example 5</b>: Use filters for resource group types
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
     *            </p>
     *            <note>
     *            <p>
     *            For <code>Key=resource-groups:ResourceTypeFilters</code>,
     *            specify resource types in the following format
     *            </p>
     *            <p>
     *            <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
     *            </p>
     *            </note>
     *            <p>
     *            For more information about these examples formats, including
     *            the best use case for each one, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html"
     *            >Examples: Register targets with a maintenance window</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTargetWithMaintenanceWindowRequest withTargets(
            java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised
     * while running tasks for these targets in this maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         User-provided value that will be included in any CloudWatch
     *         events raised while running tasks for these targets in this
     *         maintenance window.
     *         </p>
     */
    public String getOwnerInformation() {
        return ownerInformation;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised
     * while running tasks for these targets in this maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>
     *            User-provided value that will be included in any CloudWatch
     *            events raised while running tasks for these targets in this
     *            maintenance window.
     *            </p>
     */
    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * User-provided value that will be included in any CloudWatch events raised
     * while running tasks for these targets in this maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>
     *            User-provided value that will be included in any CloudWatch
     *            events raised while running tasks for these targets in this
     *            maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTargetWithMaintenanceWindowRequest withOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
        return this;
    }

    /**
     * <p>
     * An optional name for the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         An optional name for the target.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * An optional name for the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            An optional name for the target.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An optional name for the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            An optional name for the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTargetWithMaintenanceWindowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An optional description for the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         An optional description for the target.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            An optional description for the target.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            An optional description for the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTargetWithMaintenanceWindowRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         User-provided idempotency token.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTargetWithMaintenanceWindowRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getWindowId() != null)
            sb.append("WindowId: " + getWindowId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: " + getOwnerInformation() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTargetWithMaintenanceWindowRequest == false)
            return false;
        RegisterTargetWithMaintenanceWindowRequest other = (RegisterTargetWithMaintenanceWindowRequest) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null)
            return false;
        if (other.getOwnerInformation() != null
                && other.getOwnerInformation().equals(this.getOwnerInformation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
