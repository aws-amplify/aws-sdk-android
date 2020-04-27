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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the replication instance to apply new settings. You can change one
 * or more parameters by specifying these parameters and the new values in the
 * request.
 * </p>
 * <p>
 * Some settings are applied during the maintenance window.
 * </p>
 * <p/>
 */
public class ModifyReplicationInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication
     * instance.
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the
     * next maintenance window.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     */
    private String replicationInstanceClass;

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication
     * instance. The VPC security group must work with the VPC containing the
     * replication instance.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * which might result in an outage. Changing this parameter does not result
     * in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the
     * current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This parameter must be set to <code>true</code> when specifying a value
     * for the <code>EngineVersion</code> parameter that is a different major
     * version than the replication instance's current version.
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;

    /**
     * <p>
     * A value that indicates that minor version upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * Changing this parameter doesn't result in an outage, except in the case
     * dsecribed following. The change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * An outage does result if these factors apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter is set to <code>true</code> during the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS DMS has enabled automatic patching for the given engine version.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     */
    private String replicationInstanceIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication
     * instance.
     * </p>
     *
     * @return <p>
     *         The amount of storage (in gigabytes) to be allocated for the
     *         replication instance.
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication
     * instance.
     * </p>
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) to be allocated for the
     *            replication instance.
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be allocated for the replication
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) to be allocated for the
     *            replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the
     * next maintenance window.
     * </p>
     *
     * @return <p>
     *         Indicates whether the changes should be applied immediately or
     *         during the next maintenance window.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the
     * next maintenance window.
     * </p>
     *
     * @return <p>
     *         Indicates whether the changes should be applied immediately or
     *         during the next maintenance window.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the
     * next maintenance window.
     * </p>
     *
     * @param applyImmediately <p>
     *            Indicates whether the changes should be applied immediately or
     *            during the next maintenance window.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates whether the changes should be applied immediately or during the
     * next maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            Indicates whether the changes should be applied immediately or
     *            during the next maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     *
     * @return <p>
     *         The compute and memory capacity of the replication instance.
     *         </p>
     *         <p>
     *         Valid Values:
     *         <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     *         </p>
     */
    public String getReplicationInstanceClass() {
        return replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance.
     *            </p>
     *            <p>
     *            Valid Values:
     *            <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     *            </p>
     */
    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance.
     *            </p>
     *            <p>
     *            Valid Values:
     *            <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withReplicationInstanceClass(
            String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
        return this;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication
     * instance. The VPC security group must work with the VPC containing the
     * replication instance.
     * </p>
     *
     * @return <p>
     *         Specifies the VPC security group to be used with the replication
     *         instance. The VPC security group must work with the VPC
     *         containing the replication instance.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication
     * instance. The VPC security group must work with the VPC containing the
     * replication instance.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            Specifies the VPC security group to be used with the
     *            replication instance. The VPC security group must work with
     *            the VPC containing the replication instance.
     *            </p>
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication
     * instance. The VPC security group must work with the VPC containing the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            Specifies the VPC security group to be used with the
     *            replication instance. The VPC security group must work with
     *            the VPC containing the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) {
            this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds.length);
        }
        for (String value : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the VPC security group to be used with the replication
     * instance. The VPC security group must work with the VPC containing the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            Specifies the VPC security group to be used with the
     *            replication instance. The VPC security group must work with
     *            the VPC containing the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * which might result in an outage. Changing this parameter does not result
     * in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the
     * current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     *
     * @return <p>
     *         The weekly time range (in UTC) during which system maintenance
     *         can occur, which might result in an outage. Changing this
     *         parameter does not result in an outage, except in the following
     *         situation, and the change is asynchronously applied as soon as
     *         possible. If moving this window to the current time, there must
     *         be at least 30 minutes between the current time and end of the
     *         window to ensure pending changes are applied.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Format: ddd:hh24:mi-ddd:hh24:mi
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Must be at least 30 minutes
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * which might result in an outage. Changing this parameter does not result
     * in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the
     * current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range (in UTC) during which system maintenance
     *            can occur, which might result in an outage. Changing this
     *            parameter does not result in an outage, except in the
     *            following situation, and the change is asynchronously applied
     *            as soon as possible. If moving this window to the current
     *            time, there must be at least 30 minutes between the current
     *            time and end of the window to ensure pending changes are
     *            applied.
     *            </p>
     *            <p>
     *            Default: Uses existing setting
     *            </p>
     *            <p>
     *            Format: ddd:hh24:mi-ddd:hh24:mi
     *            </p>
     *            <p>
     *            Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *            </p>
     *            <p>
     *            Constraints: Must be at least 30 minutes
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur,
     * which might result in an outage. Changing this parameter does not result
     * in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If moving this window to the
     * current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range (in UTC) during which system maintenance
     *            can occur, which might result in an outage. Changing this
     *            parameter does not result in an outage, except in the
     *            following situation, and the change is asynchronously applied
     *            as soon as possible. If moving this window to the current
     *            time, there must be at least 30 minutes between the current
     *            time and end of the window to ensure pending changes are
     *            applied.
     *            </p>
     *            <p>
     *            Default: Uses existing setting
     *            </p>
     *            <p>
     *            Format: ddd:hh24:mi-ddd:hh24:mi
     *            </p>
     *            <p>
     *            Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *            </p>
     *            <p>
     *            Constraints: Must be at least 30 minutes
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the replication instance is a Multi-AZ
     *         deployment. You can't set the <code>AvailabilityZone</code>
     *         parameter if the Multi-AZ parameter is set to <code>true</code>.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the replication instance is a Multi-AZ
     *         deployment. You can't set the <code>AvailabilityZone</code>
     *         parameter if the Multi-AZ parameter is set to <code>true</code>.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     *
     * @param multiAZ <p>
     *            Specifies whether the replication instance is a Multi-AZ
     *            deployment. You can't set the <code>AvailabilityZone</code>
     *            parameter if the Multi-AZ parameter is set to
     *            <code>true</code>.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            Specifies whether the replication instance is a Multi-AZ
     *            deployment. You can't set the <code>AvailabilityZone</code>
     *            parameter if the Multi-AZ parameter is set to
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     *
     * @return <p>
     *         The engine version number of the replication instance.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     *
     * @param engineVersion <p>
     *            The engine version number of the replication instance.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The engine version number of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This parameter must be set to <code>true</code> when specifying a value
     * for the <code>EngineVersion</code> parameter that is a different major
     * version than the replication instance's current version.
     * </p>
     *
     * @return <p>
     *         Indicates that major version upgrades are allowed. Changing this
     *         parameter does not result in an outage, and the change is
     *         asynchronously applied as soon as possible.
     *         </p>
     *         <p>
     *         This parameter must be set to <code>true</code> when specifying a
     *         value for the <code>EngineVersion</code> parameter that is a
     *         different major version than the replication instance's current
     *         version.
     *         </p>
     */
    public Boolean isAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This parameter must be set to <code>true</code> when specifying a value
     * for the <code>EngineVersion</code> parameter that is a different major
     * version than the replication instance's current version.
     * </p>
     *
     * @return <p>
     *         Indicates that major version upgrades are allowed. Changing this
     *         parameter does not result in an outage, and the change is
     *         asynchronously applied as soon as possible.
     *         </p>
     *         <p>
     *         This parameter must be set to <code>true</code> when specifying a
     *         value for the <code>EngineVersion</code> parameter that is a
     *         different major version than the replication instance's current
     *         version.
     *         </p>
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This parameter must be set to <code>true</code> when specifying a value
     * for the <code>EngineVersion</code> parameter that is a different major
     * version than the replication instance's current version.
     * </p>
     *
     * @param allowMajorVersionUpgrade <p>
     *            Indicates that major version upgrades are allowed. Changing
     *            this parameter does not result in an outage, and the change is
     *            asynchronously applied as soon as possible.
     *            </p>
     *            <p>
     *            This parameter must be set to <code>true</code> when
     *            specifying a value for the <code>EngineVersion</code>
     *            parameter that is a different major version than the
     *            replication instance's current version.
     *            </p>
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage, and the change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This parameter must be set to <code>true</code> when specifying a value
     * for the <code>EngineVersion</code> parameter that is a different major
     * version than the replication instance's current version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowMajorVersionUpgrade <p>
     *            Indicates that major version upgrades are allowed. Changing
     *            this parameter does not result in an outage, and the change is
     *            asynchronously applied as soon as possible.
     *            </p>
     *            <p>
     *            This parameter must be set to <code>true</code> when
     *            specifying a value for the <code>EngineVersion</code>
     *            parameter that is a different major version than the
     *            replication instance's current version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withAllowMajorVersionUpgrade(
            Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * A value that indicates that minor version upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * Changing this parameter doesn't result in an outage, except in the case
     * dsecribed following. The change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * An outage does result if these factors apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter is set to <code>true</code> during the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS DMS has enabled automatic patching for the given engine version.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that indicates that minor version upgrades are applied
     *         automatically to the replication instance during the maintenance
     *         window. Changing this parameter doesn't result in an outage,
     *         except in the case dsecribed following. The change is
     *         asynchronously applied as soon as possible.
     *         </p>
     *         <p>
     *         An outage does result if these factors apply:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter is set to <code>true</code> during the maintenance
     *         window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A newer minor version is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS DMS has enabled automatic patching for the given engine
     *         version.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates that minor version upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * Changing this parameter doesn't result in an outage, except in the case
     * dsecribed following. The change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * An outage does result if these factors apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter is set to <code>true</code> during the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS DMS has enabled automatic patching for the given engine version.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that indicates that minor version upgrades are applied
     *         automatically to the replication instance during the maintenance
     *         window. Changing this parameter doesn't result in an outage,
     *         except in the case dsecribed following. The change is
     *         asynchronously applied as soon as possible.
     *         </p>
     *         <p>
     *         An outage does result if these factors apply:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter is set to <code>true</code> during the maintenance
     *         window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A newer minor version is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS DMS has enabled automatic patching for the given engine
     *         version.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates that minor version upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * Changing this parameter doesn't result in an outage, except in the case
     * dsecribed following. The change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * An outage does result if these factors apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter is set to <code>true</code> during the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS DMS has enabled automatic patching for the given engine version.
     * </p>
     * </li>
     * </ul>
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates that minor version upgrades are applied
     *            automatically to the replication instance during the
     *            maintenance window. Changing this parameter doesn't result in
     *            an outage, except in the case dsecribed following. The change
     *            is asynchronously applied as soon as possible.
     *            </p>
     *            <p>
     *            An outage does result if these factors apply:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter is set to <code>true</code> during the
     *            maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A newer minor version is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS DMS has enabled automatic patching for the given engine
     *            version.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates that minor version upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * Changing this parameter doesn't result in an outage, except in the case
     * dsecribed following. The change is asynchronously applied as soon as
     * possible.
     * </p>
     * <p>
     * An outage does result if these factors apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter is set to <code>true</code> during the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS DMS has enabled automatic patching for the given engine version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates that minor version upgrades are applied
     *            automatically to the replication instance during the
     *            maintenance window. Changing this parameter doesn't result in
     *            an outage, except in the case dsecribed following. The change
     *            is asynchronously applied as soon as possible.
     *            </p>
     *            <p>
     *            An outage does result if these factors apply:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter is set to <code>true</code> during the
     *            maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A newer minor version is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS DMS has enabled automatic patching for the given engine
     *            version.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @return <p>
     *         The replication instance identifier. This parameter is stored as
     *         a lowercase string.
     *         </p>
     */
    public String getReplicationInstanceIdentifier() {
        return replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @param replicationInstanceIdentifier <p>
     *            The replication instance identifier. This parameter is stored
     *            as a lowercase string.
     *            </p>
     */
    public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceIdentifier <p>
     *            The replication instance identifier. This parameter is stored
     *            as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationInstanceRequest withReplicationInstanceIdentifier(
            String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately() + ",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: " + getReplicationInstanceClass() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: " + getAllowMajorVersionUpgrade() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: " + getReplicationInstanceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceIdentifier() == null) ? 0
                        : getReplicationInstanceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationInstanceRequest == false)
            return false;
        ModifyReplicationInstanceRequest other = (ModifyReplicationInstanceRequest) obj;

        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null
                ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null
                && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null
                ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null
                && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getReplicationInstanceIdentifier() == null
                ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(
                        this.getReplicationInstanceIdentifier()) == false)
            return false;
        return true;
    }
}
