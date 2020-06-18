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

/**
 * <p>
 * Contains the installation media for a DB engine that requires an on-premises
 * customer provided license, such as Microsoft SQL Server.
 * </p>
 */
public class InstallationMedia implements Serializable {
    /**
     * <p>
     * The installation medium ID.
     * </p>
     */
    private String installationMediaId;

    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     */
    private String customAvailabilityZoneId;

    /**
     * <p>
     * The DB engine.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     */
    private String engineInstallationMediaPath;

    /**
     * <p>
     * The path to the installation medium for the operating system associated
     * with the DB engine.
     * </p>
     */
    private String oSInstallationMediaPath;

    /**
     * <p>
     * The status of the installation medium.
     * </p>
     */
    private String status;

    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     */
    private InstallationMediaFailureCause failureCause;

    /**
     * <p>
     * The installation medium ID.
     * </p>
     *
     * @return <p>
     *         The installation medium ID.
     *         </p>
     */
    public String getInstallationMediaId() {
        return installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     *
     * @param installationMediaId <p>
     *            The installation medium ID.
     *            </p>
     */
    public void setInstallationMediaId(String installationMediaId) {
        this.installationMediaId = installationMediaId;
    }

    /**
     * <p>
     * The installation medium ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param installationMediaId <p>
     *            The installation medium ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withInstallationMediaId(String installationMediaId) {
        this.installationMediaId = installationMediaId;
        return this;
    }

    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     *
     * @return <p>
     *         The custom Availability Zone (AZ) that contains the installation
     *         media.
     *         </p>
     */
    public String getCustomAvailabilityZoneId() {
        return customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     *
     * @param customAvailabilityZoneId <p>
     *            The custom Availability Zone (AZ) that contains the
     *            installation media.
     *            </p>
     */
    public void setCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom Availability Zone (AZ) that contains the installation media.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAvailabilityZoneId <p>
     *            The custom Availability Zone (AZ) that contains the
     *            installation media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
        return this;
    }

    /**
     * <p>
     * The DB engine.
     * </p>
     *
     * @return <p>
     *         The DB engine.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The DB engine.
     * </p>
     *
     * @param engine <p>
     *            The DB engine.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The DB engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The DB engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     *
     * @return <p>
     *         The engine version of the DB engine.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     *
     * @param engineVersion <p>
     *            The engine version of the DB engine.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of the DB engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The engine version of the DB engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     *
     * @return <p>
     *         The path to the installation medium for the DB engine.
     *         </p>
     */
    public String getEngineInstallationMediaPath() {
        return engineInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     *
     * @param engineInstallationMediaPath <p>
     *            The path to the installation medium for the DB engine.
     *            </p>
     */
    public void setEngineInstallationMediaPath(String engineInstallationMediaPath) {
        this.engineInstallationMediaPath = engineInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the DB engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineInstallationMediaPath <p>
     *            The path to the installation medium for the DB engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withEngineInstallationMediaPath(String engineInstallationMediaPath) {
        this.engineInstallationMediaPath = engineInstallationMediaPath;
        return this;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated
     * with the DB engine.
     * </p>
     *
     * @return <p>
     *         The path to the installation medium for the operating system
     *         associated with the DB engine.
     *         </p>
     */
    public String getOSInstallationMediaPath() {
        return oSInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated
     * with the DB engine.
     * </p>
     *
     * @param oSInstallationMediaPath <p>
     *            The path to the installation medium for the operating system
     *            associated with the DB engine.
     *            </p>
     */
    public void setOSInstallationMediaPath(String oSInstallationMediaPath) {
        this.oSInstallationMediaPath = oSInstallationMediaPath;
    }

    /**
     * <p>
     * The path to the installation medium for the operating system associated
     * with the DB engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oSInstallationMediaPath <p>
     *            The path to the installation medium for the operating system
     *            associated with the DB engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withOSInstallationMediaPath(String oSInstallationMediaPath) {
        this.oSInstallationMediaPath = oSInstallationMediaPath;
        return this;
    }

    /**
     * <p>
     * The status of the installation medium.
     * </p>
     *
     * @return <p>
     *         The status of the installation medium.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the installation medium.
     * </p>
     *
     * @param status <p>
     *            The status of the installation medium.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the installation medium.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the installation medium.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     *
     * @return <p>
     *         If an installation media failure occurred, the cause of the
     *         failure.
     *         </p>
     */
    public InstallationMediaFailureCause getFailureCause() {
        return failureCause;
    }

    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     *
     * @param failureCause <p>
     *            If an installation media failure occurred, the cause of the
     *            failure.
     *            </p>
     */
    public void setFailureCause(InstallationMediaFailureCause failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * If an installation media failure occurred, the cause of the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureCause <p>
     *            If an installation media failure occurred, the cause of the
     *            failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMedia withFailureCause(InstallationMediaFailureCause failureCause) {
        this.failureCause = failureCause;
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
        if (getInstallationMediaId() != null)
            sb.append("InstallationMediaId: " + getInstallationMediaId() + ",");
        if (getCustomAvailabilityZoneId() != null)
            sb.append("CustomAvailabilityZoneId: " + getCustomAvailabilityZoneId() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getEngineInstallationMediaPath() != null)
            sb.append("EngineInstallationMediaPath: " + getEngineInstallationMediaPath() + ",");
        if (getOSInstallationMediaPath() != null)
            sb.append("OSInstallationMediaPath: " + getOSInstallationMediaPath() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getFailureCause() != null)
            sb.append("FailureCause: " + getFailureCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstallationMediaId() == null) ? 0 : getInstallationMediaId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomAvailabilityZoneId() == null) ? 0 : getCustomAvailabilityZoneId()
                        .hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineInstallationMediaPath() == null) ? 0
                        : getEngineInstallationMediaPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getOSInstallationMediaPath() == null) ? 0 : getOSInstallationMediaPath()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstallationMedia == false)
            return false;
        InstallationMedia other = (InstallationMedia) obj;

        if (other.getInstallationMediaId() == null ^ this.getInstallationMediaId() == null)
            return false;
        if (other.getInstallationMediaId() != null
                && other.getInstallationMediaId().equals(this.getInstallationMediaId()) == false)
            return false;
        if (other.getCustomAvailabilityZoneId() == null
                ^ this.getCustomAvailabilityZoneId() == null)
            return false;
        if (other.getCustomAvailabilityZoneId() != null
                && other.getCustomAvailabilityZoneId().equals(this.getCustomAvailabilityZoneId()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineInstallationMediaPath() == null
                ^ this.getEngineInstallationMediaPath() == null)
            return false;
        if (other.getEngineInstallationMediaPath() != null
                && other.getEngineInstallationMediaPath().equals(
                        this.getEngineInstallationMediaPath()) == false)
            return false;
        if (other.getOSInstallationMediaPath() == null ^ this.getOSInstallationMediaPath() == null)
            return false;
        if (other.getOSInstallationMediaPath() != null
                && other.getOSInstallationMediaPath().equals(this.getOSInstallationMediaPath()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null
                && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        return true;
    }
}
