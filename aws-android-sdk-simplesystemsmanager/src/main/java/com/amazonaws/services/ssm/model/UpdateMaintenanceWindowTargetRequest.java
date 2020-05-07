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
 * Modifies the target of an existing maintenance window. You can change the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Name
 * </p>
 * </li>
 * <li>
 * <p>
 * Description
 * </p>
 * </li>
 * <li>
 * <p>
 * Owner
 * </p>
 * </li>
 * <li>
 * <p>
 * IDs for an ID target
 * </p>
 * </li>
 * <li>
 * <p>
 * Tags for a Tag target
 * </p>
 * </li>
 * <li>
 * <p>
 * From any supported tag type to another. The three supported tag types are ID
 * target, Tag target, and resource group. For more information, see
 * <a>Target</a>.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * If a parameter is null, then the corresponding field is not modified.
 * </p>
 * </note>
 */
public class UpdateMaintenanceWindowTargetRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The maintenance window ID with which to modify the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * The target ID to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowTargetId;

    /**
     * <p>
     * The targets to add or replace.
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
     * A name for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * An optional description for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTargetWithMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * The maintenance window ID with which to modify the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The maintenance window ID with which to modify the target.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The maintenance window ID with which to modify the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The maintenance window ID with which to modify the target.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The maintenance window ID with which to modify the target.
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
     *            The maintenance window ID with which to modify the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTargetRequest withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * The target ID to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>
     *         The target ID to modify.
     *         </p>
     */
    public String getWindowTargetId() {
        return windowTargetId;
    }

    /**
     * <p>
     * The target ID to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTargetId <p>
     *            The target ID to modify.
     *            </p>
     */
    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The target ID to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTargetId <p>
     *            The target ID to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTargetRequest withWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
        return this;
    }

    /**
     * <p>
     * The targets to add or replace.
     * </p>
     *
     * @return <p>
     *         The targets to add or replace.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets to add or replace.
     * </p>
     *
     * @param targets <p>
     *            The targets to add or replace.
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
     * The targets to add or replace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets to add or replace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTargetRequest withTargets(Target... targets) {
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
     * The targets to add or replace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets to add or replace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTargetRequest withTargets(java.util.Collection<Target> targets) {
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
    public UpdateMaintenanceWindowTargetRequest withOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
        return this;
    }

    /**
     * <p>
     * A name for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         A name for the update.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            A name for the update.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the update.
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
     *            A name for the update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTargetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An optional description for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         An optional description for the update.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for the update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            An optional description for the update.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            An optional description for the update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTargetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTargetWithMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     *
     * @return <p>
     *         If True, then all fields that are required by the
     *         RegisterTargetWithMaintenanceWindow action are also required for
     *         this API request. Optional fields that are not specified are set
     *         to null.
     *         </p>
     */
    public Boolean isReplace() {
        return replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTargetWithMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     *
     * @return <p>
     *         If True, then all fields that are required by the
     *         RegisterTargetWithMaintenanceWindow action are also required for
     *         this API request. Optional fields that are not specified are set
     *         to null.
     *         </p>
     */
    public Boolean getReplace() {
        return replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTargetWithMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     *
     * @param replace <p>
     *            If True, then all fields that are required by the
     *            RegisterTargetWithMaintenanceWindow action are also required
     *            for this API request. Optional fields that are not specified
     *            are set to null.
     *            </p>
     */
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTargetWithMaintenanceWindow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replace <p>
     *            If True, then all fields that are required by the
     *            RegisterTargetWithMaintenanceWindow action are also required
     *            for this API request. Optional fields that are not specified
     *            are set to null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTargetRequest withReplace(Boolean replace) {
        this.replace = replace;
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
        if (getWindowTargetId() != null)
            sb.append("WindowTargetId: " + getWindowTargetId() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: " + getOwnerInformation() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getReplace() != null)
            sb.append("Replace: " + getReplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode
                + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMaintenanceWindowTargetRequest == false)
            return false;
        UpdateMaintenanceWindowTargetRequest other = (UpdateMaintenanceWindowTargetRequest) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null)
            return false;
        if (other.getWindowTargetId() != null
                && other.getWindowTargetId().equals(this.getWindowTargetId()) == false)
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
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }
}
