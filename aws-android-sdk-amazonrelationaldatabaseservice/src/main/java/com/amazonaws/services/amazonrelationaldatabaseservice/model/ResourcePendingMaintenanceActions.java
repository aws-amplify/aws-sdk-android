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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the pending maintenance actions for a resource.
 * </p>
 */
public class ResourcePendingMaintenanceActions implements Serializable {
    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for
     * the resource.
     * </p>
     */
    private java.util.List<PendingMaintenanceAction> pendingMaintenanceActionDetails;

    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     *
     * @return <p>
     *         The ARN of the resource that has pending maintenance actions.
     *         </p>
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     *
     * @param resourceIdentifier <p>
     *            The ARN of the resource that has pending maintenance actions.
     *            </p>
     */
    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifier <p>
     *            The ARN of the resource that has pending maintenance actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcePendingMaintenanceActions withResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for
     * the resource.
     * </p>
     *
     * @return <p>
     *         A list that provides details about the pending maintenance
     *         actions for the resource.
     *         </p>
     */
    public java.util.List<PendingMaintenanceAction> getPendingMaintenanceActionDetails() {
        return pendingMaintenanceActionDetails;
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for
     * the resource.
     * </p>
     *
     * @param pendingMaintenanceActionDetails <p>
     *            A list that provides details about the pending maintenance
     *            actions for the resource.
     *            </p>
     */
    public void setPendingMaintenanceActionDetails(
            java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActionDetails) {
        if (pendingMaintenanceActionDetails == null) {
            this.pendingMaintenanceActionDetails = null;
            return;
        }

        this.pendingMaintenanceActionDetails = new java.util.ArrayList<PendingMaintenanceAction>(
                pendingMaintenanceActionDetails);
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for
     * the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingMaintenanceActionDetails <p>
     *            A list that provides details about the pending maintenance
     *            actions for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcePendingMaintenanceActions withPendingMaintenanceActionDetails(
            PendingMaintenanceAction... pendingMaintenanceActionDetails) {
        if (getPendingMaintenanceActionDetails() == null) {
            this.pendingMaintenanceActionDetails = new java.util.ArrayList<PendingMaintenanceAction>(
                    pendingMaintenanceActionDetails.length);
        }
        for (PendingMaintenanceAction value : pendingMaintenanceActionDetails) {
            this.pendingMaintenanceActionDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for
     * the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingMaintenanceActionDetails <p>
     *            A list that provides details about the pending maintenance
     *            actions for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcePendingMaintenanceActions withPendingMaintenanceActionDetails(
            java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActionDetails) {
        setPendingMaintenanceActionDetails(pendingMaintenanceActionDetails);
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: " + getResourceIdentifier() + ",");
        if (getPendingMaintenanceActionDetails() != null)
            sb.append("PendingMaintenanceActionDetails: " + getPendingMaintenanceActionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingMaintenanceActionDetails() == null) ? 0
                        : getPendingMaintenanceActionDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePendingMaintenanceActions == false)
            return false;
        ResourcePendingMaintenanceActions other = (ResourcePendingMaintenanceActions) obj;

        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null
                && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getPendingMaintenanceActionDetails() == null
                ^ this.getPendingMaintenanceActionDetails() == null)
            return false;
        if (other.getPendingMaintenanceActionDetails() != null
                && other.getPendingMaintenanceActionDetails().equals(
                        this.getPendingMaintenanceActionDetails()) == false)
            return false;
        return true;
    }
}
