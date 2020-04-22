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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * A maintenance track that you can switch the current track to.
 * </p>
 */
public class UpdateTarget implements Serializable {
    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     */
    private String maintenanceTrackName;

    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     */
    private String databaseVersion;

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     */
    private java.util.List<SupportedOperation> supportedOperations;

    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     *
     * @return <p>
     *         The name of the new maintenance track.
     *         </p>
     */
    public String getMaintenanceTrackName() {
        return maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     *
     * @param maintenanceTrackName <p>
     *            The name of the new maintenance track.
     *            </p>
     */
    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTrackName <p>
     *            The name of the new maintenance track.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTarget withMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
        return this;
    }

    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     *
     * @return <p>
     *         The cluster version for the new maintenance track.
     *         </p>
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     *
     * @param databaseVersion <p>
     *            The cluster version for the new maintenance track.
     *            </p>
     */
    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseVersion <p>
     *            The cluster version for the new maintenance track.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTarget withDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
        return this;
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     *
     * @return <p>
     *         A list of operations supported by the maintenance track.
     *         </p>
     */
    public java.util.List<SupportedOperation> getSupportedOperations() {
        return supportedOperations;
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     *
     * @param supportedOperations <p>
     *            A list of operations supported by the maintenance track.
     *            </p>
     */
    public void setSupportedOperations(java.util.Collection<SupportedOperation> supportedOperations) {
        if (supportedOperations == null) {
            this.supportedOperations = null;
            return;
        }

        this.supportedOperations = new java.util.ArrayList<SupportedOperation>(supportedOperations);
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedOperations <p>
     *            A list of operations supported by the maintenance track.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTarget withSupportedOperations(SupportedOperation... supportedOperations) {
        if (getSupportedOperations() == null) {
            this.supportedOperations = new java.util.ArrayList<SupportedOperation>(
                    supportedOperations.length);
        }
        for (SupportedOperation value : supportedOperations) {
            this.supportedOperations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedOperations <p>
     *            A list of operations supported by the maintenance track.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTarget withSupportedOperations(
            java.util.Collection<SupportedOperation> supportedOperations) {
        setSupportedOperations(supportedOperations);
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
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: " + getMaintenanceTrackName() + ",");
        if (getDatabaseVersion() != null)
            sb.append("DatabaseVersion: " + getDatabaseVersion() + ",");
        if (getSupportedOperations() != null)
            sb.append("SupportedOperations: " + getSupportedOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseVersion() == null) ? 0 : getDatabaseVersion().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedOperations() == null) ? 0 : getSupportedOperations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTarget == false)
            return false;
        UpdateTarget other = (UpdateTarget) obj;

        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null
                && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getDatabaseVersion() == null ^ this.getDatabaseVersion() == null)
            return false;
        if (other.getDatabaseVersion() != null
                && other.getDatabaseVersion().equals(this.getDatabaseVersion()) == false)
            return false;
        if (other.getSupportedOperations() == null ^ this.getSupportedOperations() == null)
            return false;
        if (other.getSupportedOperations() != null
                && other.getSupportedOperations().equals(this.getSupportedOperations()) == false)
            return false;
        return true;
    }
}
