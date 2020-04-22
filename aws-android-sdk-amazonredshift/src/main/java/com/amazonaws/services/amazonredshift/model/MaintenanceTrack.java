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
 * Defines a maintenance track that determines which Amazon Redshift version to
 * apply during a maintenance window. If the value for
 * <code>MaintenanceTrack</code> is <code>current</code>, the cluster is updated
 * to the most recently certified maintenance release. If the value is
 * <code>trailing</code>, the cluster is updated to the previously certified
 * maintenance release.
 * </p>
 */
public class MaintenanceTrack implements Serializable {
    /**
     * <p>
     * The name of the maintenance track. Possible values are
     * <code>current</code> and <code>trailing</code>.
     * </p>
     */
    private String maintenanceTrackName;

    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     */
    private String databaseVersion;

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance
     * track.
     * </p>
     */
    private java.util.List<UpdateTarget> updateTargets;

    /**
     * <p>
     * The name of the maintenance track. Possible values are
     * <code>current</code> and <code>trailing</code>.
     * </p>
     *
     * @return <p>
     *         The name of the maintenance track. Possible values are
     *         <code>current</code> and <code>trailing</code>.
     *         </p>
     */
    public String getMaintenanceTrackName() {
        return maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track. Possible values are
     * <code>current</code> and <code>trailing</code>.
     * </p>
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track. Possible values are
     *            <code>current</code> and <code>trailing</code>.
     *            </p>
     */
    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track. Possible values are
     * <code>current</code> and <code>trailing</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track. Possible values are
     *            <code>current</code> and <code>trailing</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceTrack withMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
        return this;
    }

    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     *
     * @return <p>
     *         The version number for the cluster release.
     *         </p>
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     *
     * @param databaseVersion <p>
     *            The version number for the cluster release.
     *            </p>
     */
    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseVersion <p>
     *            The version number for the cluster release.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceTrack withDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
        return this;
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance
     * track.
     * </p>
     *
     * @return <p>
     *         An array of <a>UpdateTarget</a> objects to update with the
     *         maintenance track.
     *         </p>
     */
    public java.util.List<UpdateTarget> getUpdateTargets() {
        return updateTargets;
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance
     * track.
     * </p>
     *
     * @param updateTargets <p>
     *            An array of <a>UpdateTarget</a> objects to update with the
     *            maintenance track.
     *            </p>
     */
    public void setUpdateTargets(java.util.Collection<UpdateTarget> updateTargets) {
        if (updateTargets == null) {
            this.updateTargets = null;
            return;
        }

        this.updateTargets = new java.util.ArrayList<UpdateTarget>(updateTargets);
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance
     * track.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTargets <p>
     *            An array of <a>UpdateTarget</a> objects to update with the
     *            maintenance track.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceTrack withUpdateTargets(UpdateTarget... updateTargets) {
        if (getUpdateTargets() == null) {
            this.updateTargets = new java.util.ArrayList<UpdateTarget>(updateTargets.length);
        }
        for (UpdateTarget value : updateTargets) {
            this.updateTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance
     * track.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTargets <p>
     *            An array of <a>UpdateTarget</a> objects to update with the
     *            maintenance track.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceTrack withUpdateTargets(java.util.Collection<UpdateTarget> updateTargets) {
        setUpdateTargets(updateTargets);
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
        if (getUpdateTargets() != null)
            sb.append("UpdateTargets: " + getUpdateTargets());
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
                + ((getUpdateTargets() == null) ? 0 : getUpdateTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceTrack == false)
            return false;
        MaintenanceTrack other = (MaintenanceTrack) obj;

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
        if (other.getUpdateTargets() == null ^ this.getUpdateTargets() == null)
            return false;
        if (other.getUpdateTargets() != null
                && other.getUpdateTargets().equals(this.getUpdateTargets()) == false)
            return false;
        return true;
    }
}
