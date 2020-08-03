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


public class UpdateMaintenanceWindowTargetResult implements Serializable {
    /**
     * <p>The maintenance window ID specified in the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>The target ID specified in the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowTargetId;

    /**
     * <p>The updated targets.</p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>The updated owner.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String ownerInformation;

    /**
     * <p>The updated name.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The updated description.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>The maintenance window ID specified in the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>The maintenance window ID specified in the update request.</p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>The maintenance window ID specified in the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The maintenance window ID specified in the update request.</p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>The maintenance window ID specified in the update request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The maintenance window ID specified in the update request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowTargetResult withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>The target ID specified in the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>The target ID specified in the update request.</p>
     */
    public String getWindowTargetId() {
        return windowTargetId;
    }

    /**
     * <p>The target ID specified in the update request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTargetId <p>The target ID specified in the update request.</p>
     */
    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>The target ID specified in the update request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTargetId <p>The target ID specified in the update request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowTargetResult withWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
        return this;
    }

    /**
     * <p>The updated targets.</p>
     *
     * @return <p>The updated targets.</p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>The updated targets.</p>
     *
     * @param targets <p>The updated targets.</p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>The updated targets.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targets <p>The updated targets.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowTargetResult withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>The updated targets.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targets <p>The updated targets.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowTargetResult withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>The updated owner.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>The updated owner.</p>
     */
    public String getOwnerInformation() {
        return ownerInformation;
    }

    /**
     * <p>The updated owner.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>The updated owner.</p>
     */
    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>The updated owner.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param ownerInformation <p>The updated owner.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowTargetResult withOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
        return this;
    }

    /**
     * <p>The updated name.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The updated name.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The updated name.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The updated name.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The updated name.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The updated name.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowTargetResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The updated description.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>The updated description.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>The updated description.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>The updated description.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>The updated description.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>The updated description.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateMaintenanceWindowTargetResult withDescription(String description) {
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

        if (obj instanceof UpdateMaintenanceWindowTargetResult == false) return false;
        UpdateMaintenanceWindowTargetResult other = (UpdateMaintenanceWindowTargetResult)obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null) return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false) return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null) return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false) return false;
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
