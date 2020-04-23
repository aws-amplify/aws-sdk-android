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
 * Available option.
 * </p>
 */
public class OptionGroupOption implements Serializable {
    /**
     * <p>
     * The name of the option.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the option.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     */
    private String engineName;

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     */
    private String majorEngineVersion;

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     */
    private String minimumRequiredMinorEngineVersion;

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     */
    private Boolean portRequired;

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     */
    private Integer defaultPort;

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     */
    private java.util.List<String> optionsDependedOn;

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     */
    private java.util.List<String> optionsConflictsWith;

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB
     * instances are associated with the option group. If you disassociate all
     * DB instances from the option group, your can remove the persistent option
     * from the option group.
     * </p>
     */
    private Boolean persistent;

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option
     * group containing a permanent option can't be removed from a DB instance.
     * </p>
     */
    private Boolean permanent;

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your
     * DB instance before you can use this option. You can enable Auto Minor
     * Version Upgrade when you first create your DB instance, or by modifying
     * your DB instance later.
     * </p>
     */
    private Boolean requiresAutoMinorEngineVersionUpgrade;

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a
     * VPC.
     * </p>
     */
    private Boolean vpcOnly;

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option.
     * This only applies to options that have different versions available.
     * </p>
     */
    private Boolean supportsOptionVersionDowngrade;

    /**
     * <p>
     * The option settings that are available (and the default value) for each
     * option in an option group.
     * </p>
     */
    private java.util.List<OptionGroupOptionSetting> optionGroupOptionSettings;

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     */
    private java.util.List<OptionVersion> optionGroupOptionVersions;

    /**
     * <p>
     * The name of the option.
     * </p>
     *
     * @return <p>
     *         The name of the option.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     *
     * @param name <p>
     *            The name of the option.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     *
     * @return <p>
     *         The description of the option.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     *
     * @param description <p>
     *            The description of the option.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     *
     * @return <p>
     *         The name of the engine that this option can be applied to.
     *         </p>
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     *
     * @param engineName <p>
     *            The name of the engine that this option can be applied to.
     *            </p>
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The name of the engine that this option can be applied to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineName <p>
     *            The name of the engine that this option can be applied to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     *
     * @return <p>
     *         Indicates the major engine version that the option is available
     *         for.
     *         </p>
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     *
     * @param majorEngineVersion <p>
     *            Indicates the major engine version that the option is
     *            available for.
     *            </p>
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * Indicates the major engine version that the option is available for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param majorEngineVersion <p>
     *            Indicates the major engine version that the option is
     *            available for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     *
     * @return <p>
     *         The minimum required engine version for the option to be applied.
     *         </p>
     */
    public String getMinimumRequiredMinorEngineVersion() {
        return minimumRequiredMinorEngineVersion;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     *
     * @param minimumRequiredMinorEngineVersion <p>
     *            The minimum required engine version for the option to be
     *            applied.
     *            </p>
     */
    public void setMinimumRequiredMinorEngineVersion(String minimumRequiredMinorEngineVersion) {
        this.minimumRequiredMinorEngineVersion = minimumRequiredMinorEngineVersion;
    }

    /**
     * <p>
     * The minimum required engine version for the option to be applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumRequiredMinorEngineVersion <p>
     *            The minimum required engine version for the option to be
     *            applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withMinimumRequiredMinorEngineVersion(
            String minimumRequiredMinorEngineVersion) {
        this.minimumRequiredMinorEngineVersion = minimumRequiredMinorEngineVersion;
        return this;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     *
     * @return <p>
     *         Specifies whether the option requires a port.
     *         </p>
     */
    public Boolean isPortRequired() {
        return portRequired;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     *
     * @return <p>
     *         Specifies whether the option requires a port.
     *         </p>
     */
    public Boolean getPortRequired() {
        return portRequired;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     *
     * @param portRequired <p>
     *            Specifies whether the option requires a port.
     *            </p>
     */
    public void setPortRequired(Boolean portRequired) {
        this.portRequired = portRequired;
    }

    /**
     * <p>
     * Specifies whether the option requires a port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portRequired <p>
     *            Specifies whether the option requires a port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withPortRequired(Boolean portRequired) {
        this.portRequired = portRequired;
        return this;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     *
     * @return <p>
     *         If the option requires a port, specifies the default port for the
     *         option.
     *         </p>
     */
    public Integer getDefaultPort() {
        return defaultPort;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     *
     * @param defaultPort <p>
     *            If the option requires a port, specifies the default port for
     *            the option.
     *            </p>
     */
    public void setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
    }

    /**
     * <p>
     * If the option requires a port, specifies the default port for the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultPort <p>
     *            If the option requires a port, specifies the default port for
     *            the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
        return this;
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     *
     * @return <p>
     *         The options that are prerequisites for this option.
     *         </p>
     */
    public java.util.List<String> getOptionsDependedOn() {
        return optionsDependedOn;
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     *
     * @param optionsDependedOn <p>
     *            The options that are prerequisites for this option.
     *            </p>
     */
    public void setOptionsDependedOn(java.util.Collection<String> optionsDependedOn) {
        if (optionsDependedOn == null) {
            this.optionsDependedOn = null;
            return;
        }

        this.optionsDependedOn = new java.util.ArrayList<String>(optionsDependedOn);
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsDependedOn <p>
     *            The options that are prerequisites for this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionsDependedOn(String... optionsDependedOn) {
        if (getOptionsDependedOn() == null) {
            this.optionsDependedOn = new java.util.ArrayList<String>(optionsDependedOn.length);
        }
        for (String value : optionsDependedOn) {
            this.optionsDependedOn.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The options that are prerequisites for this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsDependedOn <p>
     *            The options that are prerequisites for this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionsDependedOn(java.util.Collection<String> optionsDependedOn) {
        setOptionsDependedOn(optionsDependedOn);
        return this;
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     *
     * @return <p>
     *         The options that conflict with this option.
     *         </p>
     */
    public java.util.List<String> getOptionsConflictsWith() {
        return optionsConflictsWith;
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     *
     * @param optionsConflictsWith <p>
     *            The options that conflict with this option.
     *            </p>
     */
    public void setOptionsConflictsWith(java.util.Collection<String> optionsConflictsWith) {
        if (optionsConflictsWith == null) {
            this.optionsConflictsWith = null;
            return;
        }

        this.optionsConflictsWith = new java.util.ArrayList<String>(optionsConflictsWith);
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsConflictsWith <p>
     *            The options that conflict with this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionsConflictsWith(String... optionsConflictsWith) {
        if (getOptionsConflictsWith() == null) {
            this.optionsConflictsWith = new java.util.ArrayList<String>(optionsConflictsWith.length);
        }
        for (String value : optionsConflictsWith) {
            this.optionsConflictsWith.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The options that conflict with this option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsConflictsWith <p>
     *            The options that conflict with this option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionsConflictsWith(
            java.util.Collection<String> optionsConflictsWith) {
        setOptionsConflictsWith(optionsConflictsWith);
        return this;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB
     * instances are associated with the option group. If you disassociate all
     * DB instances from the option group, your can remove the persistent option
     * from the option group.
     * </p>
     *
     * @return <p>
     *         Persistent options can't be removed from an option group while DB
     *         instances are associated with the option group. If you
     *         disassociate all DB instances from the option group, your can
     *         remove the persistent option from the option group.
     *         </p>
     */
    public Boolean isPersistent() {
        return persistent;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB
     * instances are associated with the option group. If you disassociate all
     * DB instances from the option group, your can remove the persistent option
     * from the option group.
     * </p>
     *
     * @return <p>
     *         Persistent options can't be removed from an option group while DB
     *         instances are associated with the option group. If you
     *         disassociate all DB instances from the option group, your can
     *         remove the persistent option from the option group.
     *         </p>
     */
    public Boolean getPersistent() {
        return persistent;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB
     * instances are associated with the option group. If you disassociate all
     * DB instances from the option group, your can remove the persistent option
     * from the option group.
     * </p>
     *
     * @param persistent <p>
     *            Persistent options can't be removed from an option group while
     *            DB instances are associated with the option group. If you
     *            disassociate all DB instances from the option group, your can
     *            remove the persistent option from the option group.
     *            </p>
     */
    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * <p>
     * Persistent options can't be removed from an option group while DB
     * instances are associated with the option group. If you disassociate all
     * DB instances from the option group, your can remove the persistent option
     * from the option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persistent <p>
     *            Persistent options can't be removed from an option group while
     *            DB instances are associated with the option group. If you
     *            disassociate all DB instances from the option group, your can
     *            remove the persistent option from the option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withPersistent(Boolean persistent) {
        this.persistent = persistent;
        return this;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option
     * group containing a permanent option can't be removed from a DB instance.
     * </p>
     *
     * @return <p>
     *         Permanent options can never be removed from an option group. An
     *         option group containing a permanent option can't be removed from
     *         a DB instance.
     *         </p>
     */
    public Boolean isPermanent() {
        return permanent;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option
     * group containing a permanent option can't be removed from a DB instance.
     * </p>
     *
     * @return <p>
     *         Permanent options can never be removed from an option group. An
     *         option group containing a permanent option can't be removed from
     *         a DB instance.
     *         </p>
     */
    public Boolean getPermanent() {
        return permanent;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option
     * group containing a permanent option can't be removed from a DB instance.
     * </p>
     *
     * @param permanent <p>
     *            Permanent options can never be removed from an option group.
     *            An option group containing a permanent option can't be removed
     *            from a DB instance.
     *            </p>
     */
    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    /**
     * <p>
     * Permanent options can never be removed from an option group. An option
     * group containing a permanent option can't be removed from a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permanent <p>
     *            Permanent options can never be removed from an option group.
     *            An option group containing a permanent option can't be removed
     *            from a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withPermanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your
     * DB instance before you can use this option. You can enable Auto Minor
     * Version Upgrade when you first create your DB instance, or by modifying
     * your DB instance later.
     * </p>
     *
     * @return <p>
     *         If true, you must enable the Auto Minor Version Upgrade setting
     *         for your DB instance before you can use this option. You can
     *         enable Auto Minor Version Upgrade when you first create your DB
     *         instance, or by modifying your DB instance later.
     *         </p>
     */
    public Boolean isRequiresAutoMinorEngineVersionUpgrade() {
        return requiresAutoMinorEngineVersionUpgrade;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your
     * DB instance before you can use this option. You can enable Auto Minor
     * Version Upgrade when you first create your DB instance, or by modifying
     * your DB instance later.
     * </p>
     *
     * @return <p>
     *         If true, you must enable the Auto Minor Version Upgrade setting
     *         for your DB instance before you can use this option. You can
     *         enable Auto Minor Version Upgrade when you first create your DB
     *         instance, or by modifying your DB instance later.
     *         </p>
     */
    public Boolean getRequiresAutoMinorEngineVersionUpgrade() {
        return requiresAutoMinorEngineVersionUpgrade;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your
     * DB instance before you can use this option. You can enable Auto Minor
     * Version Upgrade when you first create your DB instance, or by modifying
     * your DB instance later.
     * </p>
     *
     * @param requiresAutoMinorEngineVersionUpgrade <p>
     *            If true, you must enable the Auto Minor Version Upgrade
     *            setting for your DB instance before you can use this option.
     *            You can enable Auto Minor Version Upgrade when you first
     *            create your DB instance, or by modifying your DB instance
     *            later.
     *            </p>
     */
    public void setRequiresAutoMinorEngineVersionUpgrade(
            Boolean requiresAutoMinorEngineVersionUpgrade) {
        this.requiresAutoMinorEngineVersionUpgrade = requiresAutoMinorEngineVersionUpgrade;
    }

    /**
     * <p>
     * If true, you must enable the Auto Minor Version Upgrade setting for your
     * DB instance before you can use this option. You can enable Auto Minor
     * Version Upgrade when you first create your DB instance, or by modifying
     * your DB instance later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiresAutoMinorEngineVersionUpgrade <p>
     *            If true, you must enable the Auto Minor Version Upgrade
     *            setting for your DB instance before you can use this option.
     *            You can enable Auto Minor Version Upgrade when you first
     *            create your DB instance, or by modifying your DB instance
     *            later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withRequiresAutoMinorEngineVersionUpgrade(
            Boolean requiresAutoMinorEngineVersionUpgrade) {
        this.requiresAutoMinorEngineVersionUpgrade = requiresAutoMinorEngineVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a
     * VPC.
     * </p>
     *
     * @return <p>
     *         If true, you can only use this option with a DB instance that is
     *         in a VPC.
     *         </p>
     */
    public Boolean isVpcOnly() {
        return vpcOnly;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a
     * VPC.
     * </p>
     *
     * @return <p>
     *         If true, you can only use this option with a DB instance that is
     *         in a VPC.
     *         </p>
     */
    public Boolean getVpcOnly() {
        return vpcOnly;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a
     * VPC.
     * </p>
     *
     * @param vpcOnly <p>
     *            If true, you can only use this option with a DB instance that
     *            is in a VPC.
     *            </p>
     */
    public void setVpcOnly(Boolean vpcOnly) {
        this.vpcOnly = vpcOnly;
    }

    /**
     * <p>
     * If true, you can only use this option with a DB instance that is in a
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcOnly <p>
     *            If true, you can only use this option with a DB instance that
     *            is in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withVpcOnly(Boolean vpcOnly) {
        this.vpcOnly = vpcOnly;
        return this;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option.
     * This only applies to options that have different versions available.
     * </p>
     *
     * @return <p>
     *         If true, you can change the option to an earlier version of the
     *         option. This only applies to options that have different versions
     *         available.
     *         </p>
     */
    public Boolean isSupportsOptionVersionDowngrade() {
        return supportsOptionVersionDowngrade;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option.
     * This only applies to options that have different versions available.
     * </p>
     *
     * @return <p>
     *         If true, you can change the option to an earlier version of the
     *         option. This only applies to options that have different versions
     *         available.
     *         </p>
     */
    public Boolean getSupportsOptionVersionDowngrade() {
        return supportsOptionVersionDowngrade;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option.
     * This only applies to options that have different versions available.
     * </p>
     *
     * @param supportsOptionVersionDowngrade <p>
     *            If true, you can change the option to an earlier version of
     *            the option. This only applies to options that have different
     *            versions available.
     *            </p>
     */
    public void setSupportsOptionVersionDowngrade(Boolean supportsOptionVersionDowngrade) {
        this.supportsOptionVersionDowngrade = supportsOptionVersionDowngrade;
    }

    /**
     * <p>
     * If true, you can change the option to an earlier version of the option.
     * This only applies to options that have different versions available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsOptionVersionDowngrade <p>
     *            If true, you can change the option to an earlier version of
     *            the option. This only applies to options that have different
     *            versions available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withSupportsOptionVersionDowngrade(
            Boolean supportsOptionVersionDowngrade) {
        this.supportsOptionVersionDowngrade = supportsOptionVersionDowngrade;
        return this;
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each
     * option in an option group.
     * </p>
     *
     * @return <p>
     *         The option settings that are available (and the default value)
     *         for each option in an option group.
     *         </p>
     */
    public java.util.List<OptionGroupOptionSetting> getOptionGroupOptionSettings() {
        return optionGroupOptionSettings;
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each
     * option in an option group.
     * </p>
     *
     * @param optionGroupOptionSettings <p>
     *            The option settings that are available (and the default value)
     *            for each option in an option group.
     *            </p>
     */
    public void setOptionGroupOptionSettings(
            java.util.Collection<OptionGroupOptionSetting> optionGroupOptionSettings) {
        if (optionGroupOptionSettings == null) {
            this.optionGroupOptionSettings = null;
            return;
        }

        this.optionGroupOptionSettings = new java.util.ArrayList<OptionGroupOptionSetting>(
                optionGroupOptionSettings);
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each
     * option in an option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupOptionSettings <p>
     *            The option settings that are available (and the default value)
     *            for each option in an option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionGroupOptionSettings(
            OptionGroupOptionSetting... optionGroupOptionSettings) {
        if (getOptionGroupOptionSettings() == null) {
            this.optionGroupOptionSettings = new java.util.ArrayList<OptionGroupOptionSetting>(
                    optionGroupOptionSettings.length);
        }
        for (OptionGroupOptionSetting value : optionGroupOptionSettings) {
            this.optionGroupOptionSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The option settings that are available (and the default value) for each
     * option in an option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupOptionSettings <p>
     *            The option settings that are available (and the default value)
     *            for each option in an option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionGroupOptionSettings(
            java.util.Collection<OptionGroupOptionSetting> optionGroupOptionSettings) {
        setOptionGroupOptionSettings(optionGroupOptionSettings);
        return this;
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     *
     * @return <p>
     *         The versions that are available for the option.
     *         </p>
     */
    public java.util.List<OptionVersion> getOptionGroupOptionVersions() {
        return optionGroupOptionVersions;
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     *
     * @param optionGroupOptionVersions <p>
     *            The versions that are available for the option.
     *            </p>
     */
    public void setOptionGroupOptionVersions(
            java.util.Collection<OptionVersion> optionGroupOptionVersions) {
        if (optionGroupOptionVersions == null) {
            this.optionGroupOptionVersions = null;
            return;
        }

        this.optionGroupOptionVersions = new java.util.ArrayList<OptionVersion>(
                optionGroupOptionVersions);
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupOptionVersions <p>
     *            The versions that are available for the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionGroupOptionVersions(
            OptionVersion... optionGroupOptionVersions) {
        if (getOptionGroupOptionVersions() == null) {
            this.optionGroupOptionVersions = new java.util.ArrayList<OptionVersion>(
                    optionGroupOptionVersions.length);
        }
        for (OptionVersion value : optionGroupOptionVersions) {
            this.optionGroupOptionVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The versions that are available for the option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupOptionVersions <p>
     *            The versions that are available for the option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOption withOptionGroupOptionVersions(
            java.util.Collection<OptionVersion> optionGroupOptionVersions) {
        setOptionGroupOptionVersions(optionGroupOptionVersions);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: " + getMajorEngineVersion() + ",");
        if (getMinimumRequiredMinorEngineVersion() != null)
            sb.append("MinimumRequiredMinorEngineVersion: "
                    + getMinimumRequiredMinorEngineVersion() + ",");
        if (getPortRequired() != null)
            sb.append("PortRequired: " + getPortRequired() + ",");
        if (getDefaultPort() != null)
            sb.append("DefaultPort: " + getDefaultPort() + ",");
        if (getOptionsDependedOn() != null)
            sb.append("OptionsDependedOn: " + getOptionsDependedOn() + ",");
        if (getOptionsConflictsWith() != null)
            sb.append("OptionsConflictsWith: " + getOptionsConflictsWith() + ",");
        if (getPersistent() != null)
            sb.append("Persistent: " + getPersistent() + ",");
        if (getPermanent() != null)
            sb.append("Permanent: " + getPermanent() + ",");
        if (getRequiresAutoMinorEngineVersionUpgrade() != null)
            sb.append("RequiresAutoMinorEngineVersionUpgrade: "
                    + getRequiresAutoMinorEngineVersionUpgrade() + ",");
        if (getVpcOnly() != null)
            sb.append("VpcOnly: " + getVpcOnly() + ",");
        if (getSupportsOptionVersionDowngrade() != null)
            sb.append("SupportsOptionVersionDowngrade: " + getSupportsOptionVersionDowngrade()
                    + ",");
        if (getOptionGroupOptionSettings() != null)
            sb.append("OptionGroupOptionSettings: " + getOptionGroupOptionSettings() + ",");
        if (getOptionGroupOptionVersions() != null)
            sb.append("OptionGroupOptionVersions: " + getOptionGroupOptionVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode
                + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumRequiredMinorEngineVersion() == null) ? 0
                        : getMinimumRequiredMinorEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getPortRequired() == null) ? 0 : getPortRequired().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultPort() == null) ? 0 : getDefaultPort().hashCode());
        hashCode = prime * hashCode
                + ((getOptionsDependedOn() == null) ? 0 : getOptionsDependedOn().hashCode());
        hashCode = prime * hashCode
                + ((getOptionsConflictsWith() == null) ? 0 : getOptionsConflictsWith().hashCode());
        hashCode = prime * hashCode + ((getPersistent() == null) ? 0 : getPersistent().hashCode());
        hashCode = prime * hashCode + ((getPermanent() == null) ? 0 : getPermanent().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequiresAutoMinorEngineVersionUpgrade() == null) ? 0
                        : getRequiresAutoMinorEngineVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getVpcOnly() == null) ? 0 : getVpcOnly().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsOptionVersionDowngrade() == null) ? 0
                        : getSupportsOptionVersionDowngrade().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionGroupOptionSettings() == null) ? 0 : getOptionGroupOptionSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionGroupOptionVersions() == null) ? 0 : getOptionGroupOptionVersions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroupOption == false)
            return false;
        OptionGroupOption other = (OptionGroupOption) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null
                && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null
                && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        if (other.getMinimumRequiredMinorEngineVersion() == null
                ^ this.getMinimumRequiredMinorEngineVersion() == null)
            return false;
        if (other.getMinimumRequiredMinorEngineVersion() != null
                && other.getMinimumRequiredMinorEngineVersion().equals(
                        this.getMinimumRequiredMinorEngineVersion()) == false)
            return false;
        if (other.getPortRequired() == null ^ this.getPortRequired() == null)
            return false;
        if (other.getPortRequired() != null
                && other.getPortRequired().equals(this.getPortRequired()) == false)
            return false;
        if (other.getDefaultPort() == null ^ this.getDefaultPort() == null)
            return false;
        if (other.getDefaultPort() != null
                && other.getDefaultPort().equals(this.getDefaultPort()) == false)
            return false;
        if (other.getOptionsDependedOn() == null ^ this.getOptionsDependedOn() == null)
            return false;
        if (other.getOptionsDependedOn() != null
                && other.getOptionsDependedOn().equals(this.getOptionsDependedOn()) == false)
            return false;
        if (other.getOptionsConflictsWith() == null ^ this.getOptionsConflictsWith() == null)
            return false;
        if (other.getOptionsConflictsWith() != null
                && other.getOptionsConflictsWith().equals(this.getOptionsConflictsWith()) == false)
            return false;
        if (other.getPersistent() == null ^ this.getPersistent() == null)
            return false;
        if (other.getPersistent() != null
                && other.getPersistent().equals(this.getPersistent()) == false)
            return false;
        if (other.getPermanent() == null ^ this.getPermanent() == null)
            return false;
        if (other.getPermanent() != null
                && other.getPermanent().equals(this.getPermanent()) == false)
            return false;
        if (other.getRequiresAutoMinorEngineVersionUpgrade() == null
                ^ this.getRequiresAutoMinorEngineVersionUpgrade() == null)
            return false;
        if (other.getRequiresAutoMinorEngineVersionUpgrade() != null
                && other.getRequiresAutoMinorEngineVersionUpgrade().equals(
                        this.getRequiresAutoMinorEngineVersionUpgrade()) == false)
            return false;
        if (other.getVpcOnly() == null ^ this.getVpcOnly() == null)
            return false;
        if (other.getVpcOnly() != null && other.getVpcOnly().equals(this.getVpcOnly()) == false)
            return false;
        if (other.getSupportsOptionVersionDowngrade() == null
                ^ this.getSupportsOptionVersionDowngrade() == null)
            return false;
        if (other.getSupportsOptionVersionDowngrade() != null
                && other.getSupportsOptionVersionDowngrade().equals(
                        this.getSupportsOptionVersionDowngrade()) == false)
            return false;
        if (other.getOptionGroupOptionSettings() == null
                ^ this.getOptionGroupOptionSettings() == null)
            return false;
        if (other.getOptionGroupOptionSettings() != null
                && other.getOptionGroupOptionSettings().equals(this.getOptionGroupOptionSettings()) == false)
            return false;
        if (other.getOptionGroupOptionVersions() == null
                ^ this.getOptionGroupOptionVersions() == null)
            return false;
        if (other.getOptionGroupOptionVersions() != null
                && other.getOptionGroupOptionVersions().equals(this.getOptionGroupOptionVersions()) == false)
            return false;
        return true;
    }
}
