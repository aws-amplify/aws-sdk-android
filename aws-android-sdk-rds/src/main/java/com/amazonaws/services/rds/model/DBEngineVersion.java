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
 * This data type is used as a response element in the action
 * <code>DescribeDBEngineVersions</code>.
 * </p>
 */
public class DBEngineVersion implements Serializable {
    /**
     * <p>
     * The name of the database engine.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     */
    private String dBParameterGroupFamily;

    /**
     * <p>
     * The description of the database engine.
     * </p>
     */
    private String dBEngineDescription;

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     */
    private String dBEngineVersionDescription;

    /**
     * <p>
     * The default character set for new instances of this engine version, if
     * the <code>CharacterSetName</code> parameter of the CreateDBInstance API
     * isn't specified.
     * </p>
     */
    private CharacterSet defaultCharacterSet;

    /**
     * <p>
     * A list of the character sets supported by this engine for the
     * <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     */
    private java.util.List<CharacterSet> supportedCharacterSets;

    /**
     * <p>
     * A list of engine versions that this database engine version can be
     * upgraded to.
     * </p>
     */
    private java.util.List<UpgradeTarget> validUpgradeTarget;

    /**
     * <p>
     * A list of the time zones supported by this engine for the
     * <code>Timezone</code> parameter of the <code>CreateDBInstance</code>
     * action.
     * </p>
     */
    private java.util.List<Timezone> supportedTimezones;

    /**
     * <p>
     * The types of logs that the database engine has available for export to
     * CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> exportableLogTypes;

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the
     * log types specified by ExportableLogTypes to CloudWatch Logs.
     * </p>
     */
    private Boolean supportsLogExportsToCloudwatchLogs;

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     */
    private Boolean supportsReadReplica;

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     */
    private java.util.List<String> supportedEngineModes;

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names
     * include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> supportedFeatureNames;

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or
     * <code>deprecated</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the database engine.
     * </p>
     *
     * @return <p>
     *         The name of the database engine.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     *
     * @param engine <p>
     *            The name of the database engine.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     *
     * @return <p>
     *         The version number of the database engine.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     *
     * @param engineVersion <p>
     *            The version number of the database engine.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version number of the database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     *
     * @return <p>
     *         The name of the DB parameter group family for the database
     *         engine.
     *         </p>
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     *
     * @param dBParameterGroupFamily <p>
     *            The name of the DB parameter group family for the database
     *            engine.
     *            </p>
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupFamily <p>
     *            The name of the DB parameter group family for the database
     *            engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     *
     * @return <p>
     *         The description of the database engine.
     *         </p>
     */
    public String getDBEngineDescription() {
        return dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     *
     * @param dBEngineDescription <p>
     *            The description of the database engine.
     *            </p>
     */
    public void setDBEngineDescription(String dBEngineDescription) {
        this.dBEngineDescription = dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBEngineDescription <p>
     *            The description of the database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withDBEngineDescription(String dBEngineDescription) {
        this.dBEngineDescription = dBEngineDescription;
        return this;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     *
     * @return <p>
     *         The description of the database engine version.
     *         </p>
     */
    public String getDBEngineVersionDescription() {
        return dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     *
     * @param dBEngineVersionDescription <p>
     *            The description of the database engine version.
     *            </p>
     */
    public void setDBEngineVersionDescription(String dBEngineVersionDescription) {
        this.dBEngineVersionDescription = dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBEngineVersionDescription <p>
     *            The description of the database engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withDBEngineVersionDescription(String dBEngineVersionDescription) {
        this.dBEngineVersionDescription = dBEngineVersionDescription;
        return this;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if
     * the <code>CharacterSetName</code> parameter of the CreateDBInstance API
     * isn't specified.
     * </p>
     *
     * @return <p>
     *         The default character set for new instances of this engine
     *         version, if the <code>CharacterSetName</code> parameter of the
     *         CreateDBInstance API isn't specified.
     *         </p>
     */
    public CharacterSet getDefaultCharacterSet() {
        return defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if
     * the <code>CharacterSetName</code> parameter of the CreateDBInstance API
     * isn't specified.
     * </p>
     *
     * @param defaultCharacterSet <p>
     *            The default character set for new instances of this engine
     *            version, if the <code>CharacterSetName</code> parameter of the
     *            CreateDBInstance API isn't specified.
     *            </p>
     */
    public void setDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        this.defaultCharacterSet = defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if
     * the <code>CharacterSetName</code> parameter of the CreateDBInstance API
     * isn't specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCharacterSet <p>
     *            The default character set for new instances of this engine
     *            version, if the <code>CharacterSetName</code> parameter of the
     *            CreateDBInstance API isn't specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        this.defaultCharacterSet = defaultCharacterSet;
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the
     * <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     *
     * @return <p>
     *         A list of the character sets supported by this engine for the
     *         <code>CharacterSetName</code> parameter of the
     *         <code>CreateDBInstance</code> action.
     *         </p>
     */
    public java.util.List<CharacterSet> getSupportedCharacterSets() {
        return supportedCharacterSets;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the
     * <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     *
     * @param supportedCharacterSets <p>
     *            A list of the character sets supported by this engine for the
     *            <code>CharacterSetName</code> parameter of the
     *            <code>CreateDBInstance</code> action.
     *            </p>
     */
    public void setSupportedCharacterSets(java.util.Collection<CharacterSet> supportedCharacterSets) {
        if (supportedCharacterSets == null) {
            this.supportedCharacterSets = null;
            return;
        }

        this.supportedCharacterSets = new java.util.ArrayList<CharacterSet>(supportedCharacterSets);
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the
     * <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedCharacterSets <p>
     *            A list of the character sets supported by this engine for the
     *            <code>CharacterSetName</code> parameter of the
     *            <code>CreateDBInstance</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedCharacterSets(CharacterSet... supportedCharacterSets) {
        if (getSupportedCharacterSets() == null) {
            this.supportedCharacterSets = new java.util.ArrayList<CharacterSet>(
                    supportedCharacterSets.length);
        }
        for (CharacterSet value : supportedCharacterSets) {
            this.supportedCharacterSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the
     * <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedCharacterSets <p>
     *            A list of the character sets supported by this engine for the
     *            <code>CharacterSetName</code> parameter of the
     *            <code>CreateDBInstance</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedCharacterSets(
            java.util.Collection<CharacterSet> supportedCharacterSets) {
        setSupportedCharacterSets(supportedCharacterSets);
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be
     * upgraded to.
     * </p>
     *
     * @return <p>
     *         A list of engine versions that this database engine version can
     *         be upgraded to.
     *         </p>
     */
    public java.util.List<UpgradeTarget> getValidUpgradeTarget() {
        return validUpgradeTarget;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be
     * upgraded to.
     * </p>
     *
     * @param validUpgradeTarget <p>
     *            A list of engine versions that this database engine version
     *            can be upgraded to.
     *            </p>
     */
    public void setValidUpgradeTarget(java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        if (validUpgradeTarget == null) {
            this.validUpgradeTarget = null;
            return;
        }

        this.validUpgradeTarget = new java.util.ArrayList<UpgradeTarget>(validUpgradeTarget);
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be
     * upgraded to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUpgradeTarget <p>
     *            A list of engine versions that this database engine version
     *            can be upgraded to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withValidUpgradeTarget(UpgradeTarget... validUpgradeTarget) {
        if (getValidUpgradeTarget() == null) {
            this.validUpgradeTarget = new java.util.ArrayList<UpgradeTarget>(
                    validUpgradeTarget.length);
        }
        for (UpgradeTarget value : validUpgradeTarget) {
            this.validUpgradeTarget.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be
     * upgraded to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUpgradeTarget <p>
     *            A list of engine versions that this database engine version
     *            can be upgraded to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withValidUpgradeTarget(
            java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        setValidUpgradeTarget(validUpgradeTarget);
        return this;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the
     * <code>Timezone</code> parameter of the <code>CreateDBInstance</code>
     * action.
     * </p>
     *
     * @return <p>
     *         A list of the time zones supported by this engine for the
     *         <code>Timezone</code> parameter of the
     *         <code>CreateDBInstance</code> action.
     *         </p>
     */
    public java.util.List<Timezone> getSupportedTimezones() {
        return supportedTimezones;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the
     * <code>Timezone</code> parameter of the <code>CreateDBInstance</code>
     * action.
     * </p>
     *
     * @param supportedTimezones <p>
     *            A list of the time zones supported by this engine for the
     *            <code>Timezone</code> parameter of the
     *            <code>CreateDBInstance</code> action.
     *            </p>
     */
    public void setSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        if (supportedTimezones == null) {
            this.supportedTimezones = null;
            return;
        }

        this.supportedTimezones = new java.util.ArrayList<Timezone>(supportedTimezones);
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the
     * <code>Timezone</code> parameter of the <code>CreateDBInstance</code>
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTimezones <p>
     *            A list of the time zones supported by this engine for the
     *            <code>Timezone</code> parameter of the
     *            <code>CreateDBInstance</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedTimezones(Timezone... supportedTimezones) {
        if (getSupportedTimezones() == null) {
            this.supportedTimezones = new java.util.ArrayList<Timezone>(supportedTimezones.length);
        }
        for (Timezone value : supportedTimezones) {
            this.supportedTimezones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the
     * <code>Timezone</code> parameter of the <code>CreateDBInstance</code>
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTimezones <p>
     *            A list of the time zones supported by this engine for the
     *            <code>Timezone</code> parameter of the
     *            <code>CreateDBInstance</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        setSupportedTimezones(supportedTimezones);
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to
     * CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         The types of logs that the database engine has available for
     *         export to CloudWatch Logs.
     *         </p>
     */
    public java.util.List<String> getExportableLogTypes() {
        return exportableLogTypes;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to
     * CloudWatch Logs.
     * </p>
     *
     * @param exportableLogTypes <p>
     *            The types of logs that the database engine has available for
     *            export to CloudWatch Logs.
     *            </p>
     */
    public void setExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        if (exportableLogTypes == null) {
            this.exportableLogTypes = null;
            return;
        }

        this.exportableLogTypes = new java.util.ArrayList<String>(exportableLogTypes);
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportableLogTypes <p>
     *            The types of logs that the database engine has available for
     *            export to CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withExportableLogTypes(String... exportableLogTypes) {
        if (getExportableLogTypes() == null) {
            this.exportableLogTypes = new java.util.ArrayList<String>(exportableLogTypes.length);
        }
        for (String value : exportableLogTypes) {
            this.exportableLogTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportableLogTypes <p>
     *            The types of logs that the database engine has available for
     *            export to CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        setExportableLogTypes(exportableLogTypes);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the
     * log types specified by ExportableLogTypes to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the engine version supports
     *         exporting the log types specified by ExportableLogTypes to
     *         CloudWatch Logs.
     *         </p>
     */
    public Boolean isSupportsLogExportsToCloudwatchLogs() {
        return supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the
     * log types specified by ExportableLogTypes to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the engine version supports
     *         exporting the log types specified by ExportableLogTypes to
     *         CloudWatch Logs.
     *         </p>
     */
    public Boolean getSupportsLogExportsToCloudwatchLogs() {
        return supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the
     * log types specified by ExportableLogTypes to CloudWatch Logs.
     * </p>
     *
     * @param supportsLogExportsToCloudwatchLogs <p>
     *            A value that indicates whether the engine version supports
     *            exporting the log types specified by ExportableLogTypes to
     *            CloudWatch Logs.
     *            </p>
     */
    public void setSupportsLogExportsToCloudwatchLogs(Boolean supportsLogExportsToCloudwatchLogs) {
        this.supportsLogExportsToCloudwatchLogs = supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the
     * log types specified by ExportableLogTypes to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsLogExportsToCloudwatchLogs <p>
     *            A value that indicates whether the engine version supports
     *            exporting the log types specified by ExportableLogTypes to
     *            CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportsLogExportsToCloudwatchLogs(
            Boolean supportsLogExportsToCloudwatchLogs) {
        this.supportsLogExportsToCloudwatchLogs = supportsLogExportsToCloudwatchLogs;
        return this;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     *
     * @return <p>
     *         Indicates whether the database engine version supports read
     *         replicas.
     *         </p>
     */
    public Boolean isSupportsReadReplica() {
        return supportsReadReplica;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     *
     * @return <p>
     *         Indicates whether the database engine version supports read
     *         replicas.
     *         </p>
     */
    public Boolean getSupportsReadReplica() {
        return supportsReadReplica;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     *
     * @param supportsReadReplica <p>
     *            Indicates whether the database engine version supports read
     *            replicas.
     *            </p>
     */
    public void setSupportsReadReplica(Boolean supportsReadReplica) {
        this.supportsReadReplica = supportsReadReplica;
    }

    /**
     * <p>
     * Indicates whether the database engine version supports read replicas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsReadReplica <p>
     *            Indicates whether the database engine version supports read
     *            replicas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportsReadReplica(Boolean supportsReadReplica) {
        this.supportsReadReplica = supportsReadReplica;
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of the supported DB engine modes.
     *         </p>
     *         <note>
     *         <p>
     *         <code>global</code> engine mode only applies for global database
     *         clusters created with Aurora MySQL version 5.6.10a. For higher
     *         Aurora MySQL versions, the clusters in a global database use
     *         <code>provisioned</code> engine mode.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getSupportedEngineModes() {
        return supportedEngineModes;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     *
     * @param supportedEngineModes <p>
     *            A list of the supported DB engine modes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     */
    public void setSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        if (supportedEngineModes == null) {
            this.supportedEngineModes = null;
            return;
        }

        this.supportedEngineModes = new java.util.ArrayList<String>(supportedEngineModes);
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEngineModes <p>
     *            A list of the supported DB engine modes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedEngineModes(String... supportedEngineModes) {
        if (getSupportedEngineModes() == null) {
            this.supportedEngineModes = new java.util.ArrayList<String>(supportedEngineModes.length);
        }
        for (String value : supportedEngineModes) {
            this.supportedEngineModes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEngineModes <p>
     *            A list of the supported DB engine modes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedEngineModes(
            java.util.Collection<String> supportedEngineModes) {
        setSupportedEngineModes(supportedEngineModes);
        return this;
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names
     * include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of features supported by the DB engine. Supported feature
     *         names include the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         s3Import
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getSupportedFeatureNames() {
        return supportedFeatureNames;
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names
     * include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     *
     * @param supportedFeatureNames <p>
     *            A list of features supported by the DB engine. Supported
     *            feature names include the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            s3Import
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSupportedFeatureNames(java.util.Collection<String> supportedFeatureNames) {
        if (supportedFeatureNames == null) {
            this.supportedFeatureNames = null;
            return;
        }

        this.supportedFeatureNames = new java.util.ArrayList<String>(supportedFeatureNames);
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names
     * include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedFeatureNames <p>
     *            A list of features supported by the DB engine. Supported
     *            feature names include the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            s3Import
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedFeatureNames(String... supportedFeatureNames) {
        if (getSupportedFeatureNames() == null) {
            this.supportedFeatureNames = new java.util.ArrayList<String>(
                    supportedFeatureNames.length);
        }
        for (String value : supportedFeatureNames) {
            this.supportedFeatureNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of features supported by the DB engine. Supported feature names
     * include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3Import
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedFeatureNames <p>
     *            A list of features supported by the DB engine. Supported
     *            feature names include the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            s3Import
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withSupportedFeatureNames(
            java.util.Collection<String> supportedFeatureNames) {
        setSupportedFeatureNames(supportedFeatureNames);
        return this;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or
     * <code>deprecated</code>.
     * </p>
     *
     * @return <p>
     *         The status of the DB engine version, either
     *         <code>available</code> or <code>deprecated</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or
     * <code>deprecated</code>.
     * </p>
     *
     * @param status <p>
     *            The status of the DB engine version, either
     *            <code>available</code> or <code>deprecated</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB engine version, either <code>available</code> or
     * <code>deprecated</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the DB engine version, either
     *            <code>available</code> or <code>deprecated</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBEngineVersion withStatus(String status) {
        this.status = status;
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
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
        if (getDBEngineDescription() != null)
            sb.append("DBEngineDescription: " + getDBEngineDescription() + ",");
        if (getDBEngineVersionDescription() != null)
            sb.append("DBEngineVersionDescription: " + getDBEngineVersionDescription() + ",");
        if (getDefaultCharacterSet() != null)
            sb.append("DefaultCharacterSet: " + getDefaultCharacterSet() + ",");
        if (getSupportedCharacterSets() != null)
            sb.append("SupportedCharacterSets: " + getSupportedCharacterSets() + ",");
        if (getValidUpgradeTarget() != null)
            sb.append("ValidUpgradeTarget: " + getValidUpgradeTarget() + ",");
        if (getSupportedTimezones() != null)
            sb.append("SupportedTimezones: " + getSupportedTimezones() + ",");
        if (getExportableLogTypes() != null)
            sb.append("ExportableLogTypes: " + getExportableLogTypes() + ",");
        if (getSupportsLogExportsToCloudwatchLogs() != null)
            sb.append("SupportsLogExportsToCloudwatchLogs: "
                    + getSupportsLogExportsToCloudwatchLogs() + ",");
        if (getSupportsReadReplica() != null)
            sb.append("SupportsReadReplica: " + getSupportsReadReplica() + ",");
        if (getSupportedEngineModes() != null)
            sb.append("SupportedEngineModes: " + getSupportedEngineModes() + ",");
        if (getSupportedFeatureNames() != null)
            sb.append("SupportedFeatureNames: " + getSupportedFeatureNames() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
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
        hashCode = prime
                * hashCode
                + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDBEngineDescription() == null) ? 0 : getDBEngineDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBEngineVersionDescription() == null) ? 0 : getDBEngineVersionDescription()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDefaultCharacterSet() == null) ? 0 : getDefaultCharacterSet().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedCharacterSets() == null) ? 0 : getSupportedCharacterSets()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getValidUpgradeTarget() == null) ? 0 : getValidUpgradeTarget().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedTimezones() == null) ? 0 : getSupportedTimezones().hashCode());
        hashCode = prime * hashCode
                + ((getExportableLogTypes() == null) ? 0 : getExportableLogTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsLogExportsToCloudwatchLogs() == null) ? 0
                        : getSupportsLogExportsToCloudwatchLogs().hashCode());
        hashCode = prime * hashCode
                + ((getSupportsReadReplica() == null) ? 0 : getSupportsReadReplica().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedEngineModes() == null) ? 0 : getSupportedEngineModes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedFeatureNames() == null) ? 0 : getSupportedFeatureNames().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBEngineVersion == false)
            return false;
        DBEngineVersion other = (DBEngineVersion) obj;

        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null
                && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getDBEngineDescription() == null ^ this.getDBEngineDescription() == null)
            return false;
        if (other.getDBEngineDescription() != null
                && other.getDBEngineDescription().equals(this.getDBEngineDescription()) == false)
            return false;
        if (other.getDBEngineVersionDescription() == null
                ^ this.getDBEngineVersionDescription() == null)
            return false;
        if (other.getDBEngineVersionDescription() != null
                && other.getDBEngineVersionDescription().equals(
                        this.getDBEngineVersionDescription()) == false)
            return false;
        if (other.getDefaultCharacterSet() == null ^ this.getDefaultCharacterSet() == null)
            return false;
        if (other.getDefaultCharacterSet() != null
                && other.getDefaultCharacterSet().equals(this.getDefaultCharacterSet()) == false)
            return false;
        if (other.getSupportedCharacterSets() == null ^ this.getSupportedCharacterSets() == null)
            return false;
        if (other.getSupportedCharacterSets() != null
                && other.getSupportedCharacterSets().equals(this.getSupportedCharacterSets()) == false)
            return false;
        if (other.getValidUpgradeTarget() == null ^ this.getValidUpgradeTarget() == null)
            return false;
        if (other.getValidUpgradeTarget() != null
                && other.getValidUpgradeTarget().equals(this.getValidUpgradeTarget()) == false)
            return false;
        if (other.getSupportedTimezones() == null ^ this.getSupportedTimezones() == null)
            return false;
        if (other.getSupportedTimezones() != null
                && other.getSupportedTimezones().equals(this.getSupportedTimezones()) == false)
            return false;
        if (other.getExportableLogTypes() == null ^ this.getExportableLogTypes() == null)
            return false;
        if (other.getExportableLogTypes() != null
                && other.getExportableLogTypes().equals(this.getExportableLogTypes()) == false)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() == null
                ^ this.getSupportsLogExportsToCloudwatchLogs() == null)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() != null
                && other.getSupportsLogExportsToCloudwatchLogs().equals(
                        this.getSupportsLogExportsToCloudwatchLogs()) == false)
            return false;
        if (other.getSupportsReadReplica() == null ^ this.getSupportsReadReplica() == null)
            return false;
        if (other.getSupportsReadReplica() != null
                && other.getSupportsReadReplica().equals(this.getSupportsReadReplica()) == false)
            return false;
        if (other.getSupportedEngineModes() == null ^ this.getSupportedEngineModes() == null)
            return false;
        if (other.getSupportedEngineModes() != null
                && other.getSupportedEngineModes().equals(this.getSupportedEngineModes()) == false)
            return false;
        if (other.getSupportedFeatureNames() == null ^ this.getSupportedFeatureNames() == null)
            return false;
        if (other.getSupportedFeatureNames() != null
                && other.getSupportedFeatureNames().equals(this.getSupportedFeatureNames()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
