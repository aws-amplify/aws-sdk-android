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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class ApplyPendingMaintenanceActionResult implements Serializable {
    /**
     * <p>
     * Describes the pending maintenance actions for a resource.
     * </p>
     */
    private ResourcePendingMaintenanceActions resourcePendingMaintenanceActions;

    /**
     * <p>
     * Describes the pending maintenance actions for a resource.
     * </p>
     *
     * @return <p>
     *         Describes the pending maintenance actions for a resource.
     *         </p>
     */
    public ResourcePendingMaintenanceActions getResourcePendingMaintenanceActions() {
        return resourcePendingMaintenanceActions;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for a resource.
     * </p>
     *
     * @param resourcePendingMaintenanceActions <p>
     *            Describes the pending maintenance actions for a resource.
     *            </p>
     */
    public void setResourcePendingMaintenanceActions(
            ResourcePendingMaintenanceActions resourcePendingMaintenanceActions) {
        this.resourcePendingMaintenanceActions = resourcePendingMaintenanceActions;
    }

    /**
     * <p>
     * Describes the pending maintenance actions for a resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcePendingMaintenanceActions <p>
     *            Describes the pending maintenance actions for a resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplyPendingMaintenanceActionResult withResourcePendingMaintenanceActions(
            ResourcePendingMaintenanceActions resourcePendingMaintenanceActions) {
        this.resourcePendingMaintenanceActions = resourcePendingMaintenanceActions;
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
        if (getResourcePendingMaintenanceActions() != null)
            sb.append("ResourcePendingMaintenanceActions: "
                    + getResourcePendingMaintenanceActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourcePendingMaintenanceActions() == null) ? 0
                        : getResourcePendingMaintenanceActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplyPendingMaintenanceActionResult == false)
            return false;
        ApplyPendingMaintenanceActionResult other = (ApplyPendingMaintenanceActionResult) obj;

        if (other.getResourcePendingMaintenanceActions() == null
                ^ this.getResourcePendingMaintenanceActions() == null)
            return false;
        if (other.getResourcePendingMaintenanceActions() != null
                && other.getResourcePendingMaintenanceActions().equals(
                        this.getResourcePendingMaintenanceActions()) == false)
            return false;
        return true;
    }
}
