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
 * The version of the database engine that a DB instance can be upgraded to.
 * </p>
 */
public class UpgradeTarget implements Serializable {
    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A value that indicates whether the target version is applied to any
     * source DB instances that have <code>AutoMinorVersionUpgrade</code> set to
     * true.
     * </p>
     */
    private Boolean autoUpgrade;

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major
     * version.
     * </p>
     */
    private Boolean isMajorVersionUpgrade;

    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     *
     * @return <p>
     *         The name of the upgrade target database engine.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     *
     * @param engine <p>
     *            The name of the upgrade target database engine.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the upgrade target database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeTarget withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     *
     * @return <p>
     *         The version number of the upgrade target database engine.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     *
     * @param engineVersion <p>
     *            The version number of the upgrade target database engine.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version number of the upgrade target database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeTarget withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     *
     * @return <p>
     *         The version of the database engine that a DB instance can be
     *         upgraded to.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     *
     * @param description <p>
     *            The version of the database engine that a DB instance can be
     *            upgraded to.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The version of the database engine that a DB instance can be
     *            upgraded to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeTarget withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any
     * source DB instances that have <code>AutoMinorVersionUpgrade</code> set to
     * true.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the target version is applied to
     *         any source DB instances that have
     *         <code>AutoMinorVersionUpgrade</code> set to true.
     *         </p>
     */
    public Boolean isAutoUpgrade() {
        return autoUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any
     * source DB instances that have <code>AutoMinorVersionUpgrade</code> set to
     * true.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the target version is applied to
     *         any source DB instances that have
     *         <code>AutoMinorVersionUpgrade</code> set to true.
     *         </p>
     */
    public Boolean getAutoUpgrade() {
        return autoUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any
     * source DB instances that have <code>AutoMinorVersionUpgrade</code> set to
     * true.
     * </p>
     *
     * @param autoUpgrade <p>
     *            A value that indicates whether the target version is applied
     *            to any source DB instances that have
     *            <code>AutoMinorVersionUpgrade</code> set to true.
     *            </p>
     */
    public void setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any
     * source DB instances that have <code>AutoMinorVersionUpgrade</code> set to
     * true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoUpgrade <p>
     *            A value that indicates whether the target version is applied
     *            to any source DB instances that have
     *            <code>AutoMinorVersionUpgrade</code> set to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeTarget withAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major
     * version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether a database engine is upgraded to a
     *         major version.
     *         </p>
     */
    public Boolean isIsMajorVersionUpgrade() {
        return isMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major
     * version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether a database engine is upgraded to a
     *         major version.
     *         </p>
     */
    public Boolean getIsMajorVersionUpgrade() {
        return isMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major
     * version.
     * </p>
     *
     * @param isMajorVersionUpgrade <p>
     *            A value that indicates whether a database engine is upgraded
     *            to a major version.
     *            </p>
     */
    public void setIsMajorVersionUpgrade(Boolean isMajorVersionUpgrade) {
        this.isMajorVersionUpgrade = isMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isMajorVersionUpgrade <p>
     *            A value that indicates whether a database engine is upgraded
     *            to a major version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpgradeTarget withIsMajorVersionUpgrade(Boolean isMajorVersionUpgrade) {
        this.isMajorVersionUpgrade = isMajorVersionUpgrade;
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAutoUpgrade() != null)
            sb.append("AutoUpgrade: " + getAutoUpgrade() + ",");
        if (getIsMajorVersionUpgrade() != null)
            sb.append("IsMajorVersionUpgrade: " + getIsMajorVersionUpgrade());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAutoUpgrade() == null) ? 0 : getAutoUpgrade().hashCode());
        hashCode = prime
                * hashCode
                + ((getIsMajorVersionUpgrade() == null) ? 0 : getIsMajorVersionUpgrade().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeTarget == false)
            return false;
        UpgradeTarget other = (UpgradeTarget) obj;

        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAutoUpgrade() == null ^ this.getAutoUpgrade() == null)
            return false;
        if (other.getAutoUpgrade() != null
                && other.getAutoUpgrade().equals(this.getAutoUpgrade()) == false)
            return false;
        if (other.getIsMajorVersionUpgrade() == null ^ this.getIsMajorVersionUpgrade() == null)
            return false;
        if (other.getIsMajorVersionUpgrade() != null
                && other.getIsMajorVersionUpgrade().equals(this.getIsMajorVersionUpgrade()) == false)
            return false;
        return true;
    }
}
