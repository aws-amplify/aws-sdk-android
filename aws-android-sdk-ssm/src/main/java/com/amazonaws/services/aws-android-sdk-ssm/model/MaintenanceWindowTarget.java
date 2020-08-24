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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>The target registered with the maintenance window.</p>
 */
public class MaintenanceWindowTarget implements Serializable {
    /**
     * <p>The ID of the maintenance window to register the target with.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>The ID of the target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowTargetId;

    /**
     * <p>The type of target that is being registered with the maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     */
    private String resourceType;

    /**
     * <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String ownerInformation;

    /**
     * <p>The name for the maintenance window target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>A description for the target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>The ID of the maintenance window to register the target with.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>The ID of the maintenance window to register the target with.</p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>The ID of the maintenance window to register the target with.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the maintenance window to register the target with.</p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>The ID of the maintenance window to register the target with.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the maintenance window to register the target with.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowTarget withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>The ID of the target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The ID of the target.</p>
     */
    public String getWindowTargetId() {
        return windowTargetId;
    }

    /**
     * <p>The ID of the target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTargetId <p>The ID of the target.</p>
     */
    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>The ID of the target.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTargetId <p>The ID of the target.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowTarget withWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
        return this;
    }

    /**
     * <p>The type of target that is being registered with the maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @return <p>The type of target that is being registered with the maintenance window.</p>
     *
     * @see MaintenanceWindowResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>The type of target that is being registered with the maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>The type of target that is being registered with the maintenance window.</p>
     *
     * @see MaintenanceWindowResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>The type of target that is being registered with the maintenance window.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>The type of target that is being registered with the maintenance window.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowResourceType
     */
    public MaintenanceWindowTarget withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>The type of target that is being registered with the maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>The type of target that is being registered with the maintenance window.</p>
     *
     * @see MaintenanceWindowResourceType
     */
    public void setResourceType(MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>The type of target that is being registered with the maintenance window.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE, RESOURCE_GROUP
     *
     * @param resourceType <p>The type of target that is being registered with the maintenance window.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MaintenanceWindowResourceType
     */
    public MaintenanceWindowTarget withResourceType(MaintenanceWindowResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     *
     * @return <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     *
     * @param targets <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targets <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowTarget withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targets <p>The targets, either instances or tags.</p> <p>Specify instances using the following format:</p> <p> <code>Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;</code> </p> <p>Tags are specified using the following format:</p> <p> <code>Key=&lt;tag name&gt;,Values=&lt;tag value&gt;</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowTarget withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.</p>
     */
    public String getOwnerInformation() {
        return ownerInformation;
    }

    /**
     * <p>A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.</p>
     */
    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowTarget withOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
        return this;
    }

    /**
     * <p>The name for the maintenance window target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name for the maintenance window target.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name for the maintenance window target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name for the maintenance window target.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name for the maintenance window target.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name for the maintenance window target.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowTarget withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>A description for the target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>A description for the target.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>A description for the target.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>A description for the target.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>A description for the target.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>A description for the target.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MaintenanceWindowTarget withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWindowId() != null) sb.append("WindowId: " + getWindowId() + ",");
        if (getWindowTargetId() != null) sb.append("WindowTargetId: " + getWindowTargetId() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getTargets() != null) sb.append("Targets: " + getTargets() + ",");
        if (getOwnerInformation() != null) sb.append("OwnerInformation: " + getOwnerInformation() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MaintenanceWindowTarget == false) return false;
        MaintenanceWindowTarget other = (MaintenanceWindowTarget)obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null) return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false) return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null) return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false) return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false;
        if (other.getTargets() == null ^ this.getTargets() == null) return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false) return false;
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null) return false;
        if (other.getOwnerInformation() != null && other.getOwnerInformation().equals(this.getOwnerInformation()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        return true;
    }
}
