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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a database image, or blueprint. A blueprint describes the major
 * engine version of a database.
 * </p>
 */
public class RelationalDatabaseBlueprint implements Serializable {
    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     */
    private String blueprintId;

    /**
     * <p>
     * The database software of the database blueprint (for example,
     * <code>MySQL</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mysql
     */
    private String engine;

    /**
     * <p>
     * The database engine version for the database blueprint (for example,
     * <code>5.7.23</code>).
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     */
    private String engineDescription;

    /**
     * <p>
     * The description of the database engine version for the database
     * blueprint.
     * </p>
     */
    private String engineVersionDescription;

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for
     * the database blueprint.
     * </p>
     */
    private Boolean isEngineDefault;

    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     *
     * @return <p>
     *         The ID for the database blueprint.
     *         </p>
     */
    public String getBlueprintId() {
        return blueprintId;
    }

    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     *
     * @param blueprintId <p>
     *            The ID for the database blueprint.
     *            </p>
     */
    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blueprintId <p>
     *            The ID for the database blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBlueprint withBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
        return this;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example,
     * <code>MySQL</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mysql
     *
     * @return <p>
     *         The database software of the database blueprint (for example,
     *         <code>MySQL</code>).
     *         </p>
     * @see RelationalDatabaseEngine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example,
     * <code>MySQL</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mysql
     *
     * @param engine <p>
     *            The database software of the database blueprint (for example,
     *            <code>MySQL</code>).
     *            </p>
     * @see RelationalDatabaseEngine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example,
     * <code>MySQL</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mysql
     *
     * @param engine <p>
     *            The database software of the database blueprint (for example,
     *            <code>MySQL</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationalDatabaseEngine
     */
    public RelationalDatabaseBlueprint withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example,
     * <code>MySQL</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mysql
     *
     * @param engine <p>
     *            The database software of the database blueprint (for example,
     *            <code>MySQL</code>).
     *            </p>
     * @see RelationalDatabaseEngine
     */
    public void setEngine(RelationalDatabaseEngine engine) {
        this.engine = engine.toString();
    }

    /**
     * <p>
     * The database software of the database blueprint (for example,
     * <code>MySQL</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mysql
     *
     * @param engine <p>
     *            The database software of the database blueprint (for example,
     *            <code>MySQL</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationalDatabaseEngine
     */
    public RelationalDatabaseBlueprint withEngine(RelationalDatabaseEngine engine) {
        this.engine = engine.toString();
        return this;
    }

    /**
     * <p>
     * The database engine version for the database blueprint (for example,
     * <code>5.7.23</code>).
     * </p>
     *
     * @return <p>
     *         The database engine version for the database blueprint (for
     *         example, <code>5.7.23</code>).
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database blueprint (for example,
     * <code>5.7.23</code>).
     * </p>
     *
     * @param engineVersion <p>
     *            The database engine version for the database blueprint (for
     *            example, <code>5.7.23</code>).
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database blueprint (for example,
     * <code>5.7.23</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The database engine version for the database blueprint (for
     *            example, <code>5.7.23</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBlueprint withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     *
     * @return <p>
     *         The description of the database engine for the database
     *         blueprint.
     *         </p>
     */
    public String getEngineDescription() {
        return engineDescription;
    }

    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     *
     * @param engineDescription <p>
     *            The description of the database engine for the database
     *            blueprint.
     *            </p>
     */
    public void setEngineDescription(String engineDescription) {
        this.engineDescription = engineDescription;
    }

    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineDescription <p>
     *            The description of the database engine for the database
     *            blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBlueprint withEngineDescription(String engineDescription) {
        this.engineDescription = engineDescription;
        return this;
    }

    /**
     * <p>
     * The description of the database engine version for the database
     * blueprint.
     * </p>
     *
     * @return <p>
     *         The description of the database engine version for the database
     *         blueprint.
     *         </p>
     */
    public String getEngineVersionDescription() {
        return engineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version for the database
     * blueprint.
     * </p>
     *
     * @param engineVersionDescription <p>
     *            The description of the database engine version for the
     *            database blueprint.
     *            </p>
     */
    public void setEngineVersionDescription(String engineVersionDescription) {
        this.engineVersionDescription = engineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version for the database
     * blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersionDescription <p>
     *            The description of the database engine version for the
     *            database blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBlueprint withEngineVersionDescription(String engineVersionDescription) {
        this.engineVersionDescription = engineVersionDescription;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for
     * the database blueprint.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the engine version is the
     *         default for the database blueprint.
     *         </p>
     */
    public Boolean isIsEngineDefault() {
        return isEngineDefault;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for
     * the database blueprint.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the engine version is the
     *         default for the database blueprint.
     *         </p>
     */
    public Boolean getIsEngineDefault() {
        return isEngineDefault;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for
     * the database blueprint.
     * </p>
     *
     * @param isEngineDefault <p>
     *            A Boolean value indicating whether the engine version is the
     *            default for the database blueprint.
     *            </p>
     */
    public void setIsEngineDefault(Boolean isEngineDefault) {
        this.isEngineDefault = isEngineDefault;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for
     * the database blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isEngineDefault <p>
     *            A Boolean value indicating whether the engine version is the
     *            default for the database blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseBlueprint withIsEngineDefault(Boolean isEngineDefault) {
        this.isEngineDefault = isEngineDefault;
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
        if (getBlueprintId() != null)
            sb.append("blueprintId: " + getBlueprintId() + ",");
        if (getEngine() != null)
            sb.append("engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("engineVersion: " + getEngineVersion() + ",");
        if (getEngineDescription() != null)
            sb.append("engineDescription: " + getEngineDescription() + ",");
        if (getEngineVersionDescription() != null)
            sb.append("engineVersionDescription: " + getEngineVersionDescription() + ",");
        if (getIsEngineDefault() != null)
            sb.append("isEngineDefault: " + getIsEngineDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEngineDescription() == null) ? 0 : getEngineDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersionDescription() == null) ? 0 : getEngineVersionDescription()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIsEngineDefault() == null) ? 0 : getIsEngineDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseBlueprint == false)
            return false;
        RelationalDatabaseBlueprint other = (RelationalDatabaseBlueprint) obj;

        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null
                && other.getBlueprintId().equals(this.getBlueprintId()) == false)
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
        if (other.getEngineDescription() == null ^ this.getEngineDescription() == null)
            return false;
        if (other.getEngineDescription() != null
                && other.getEngineDescription().equals(this.getEngineDescription()) == false)
            return false;
        if (other.getEngineVersionDescription() == null
                ^ this.getEngineVersionDescription() == null)
            return false;
        if (other.getEngineVersionDescription() != null
                && other.getEngineVersionDescription().equals(this.getEngineVersionDescription()) == false)
            return false;
        if (other.getIsEngineDefault() == null ^ this.getIsEngineDefault() == null)
            return false;
        if (other.getIsEngineDefault() != null
                && other.getIsEngineDefault().equals(this.getIsEngineDefault()) == false)
            return false;
        return true;
    }
}
