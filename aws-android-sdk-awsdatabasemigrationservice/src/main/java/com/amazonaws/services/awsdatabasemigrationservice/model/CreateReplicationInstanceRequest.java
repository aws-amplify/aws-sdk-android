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
 * Creates the replication instance using the specified parameters.
 * </p>
 * <p>
 * AWS DMS requires that your account have certain roles with appropriate
 * permissions before you can create a replication instance. For information on
 * the required roles, see <a href=
 * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.APIRole.html"
 * >Creating the IAM Roles to Use With the AWS CLI and AWS DMS API</a>. For
 * information on the required permissions, see <a href=
 * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.IAMPermissions.html"
 * >IAM Permissions Needed to Use AWS DMS</a>.
 * </p>
 */
public class CreateReplicationInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     */
    private String replicationInstanceIdentifier;

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
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
     * The Availability Zone where the replication instance will be created. The
     * default value is a random, system-chosen Availability Zone in the
     * endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
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
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the
     * replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * A list of DNS name servers supported for the replication instance.
     * </p>
     */
    private String dnsNameServers;

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     *
     * @return <p>
     *         The replication instance identifier. This parameter is stored as
     *         a lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>myrepinstance</code>
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
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     *
     * @param replicationInstanceIdentifier <p>
     *            The replication instance identifier. This parameter is stored
     *            as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>myrepinstance</code>
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
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceIdentifier <p>
     *            The replication instance identifier. This parameter is stored
     *            as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>myrepinstance</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withReplicationInstanceIdentifier(
            String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     *
     * @return <p>
     *         The amount of storage (in gigabytes) to be initially allocated
     *         for the replication instance.
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) to be initially allocated
     *            for the replication instance.
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) to be initially allocated
     *            for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     *
     * @return <p>
     *         The compute and memory capacity of the replication instance as
     *         specified by the replication instance class.
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
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance as
     *            specified by the replication instance class.
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
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
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
     *            The compute and memory capacity of the replication instance as
     *            specified by the replication instance class.
     *            </p>
     *            <p>
     *            Valid Values:
     *            <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withReplicationInstanceClass(
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
    public CreateReplicationInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
    public CreateReplicationInstanceRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the replication instance will be created. The
     * default value is a random, system-chosen Availability Zone in the
     * endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     *
     * @return <p>
     *         The Availability Zone where the replication instance will be
     *         created. The default value is a random, system-chosen
     *         Availability Zone in the endpoint's AWS Region, for example:
     *         <code>us-east-1d</code>
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the replication instance will be created. The
     * default value is a random, system-chosen Availability Zone in the
     * endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone where the replication instance will be
     *            created. The default value is a random, system-chosen
     *            Availability Zone in the endpoint's AWS Region, for example:
     *            <code>us-east-1d</code>
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the replication instance will be created. The
     * default value is a random, system-chosen Availability Zone in the
     * endpoint's AWS Region, for example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone where the replication instance will be
     *            created. The default value is a random, system-chosen
     *            Availability Zone in the endpoint's AWS Region, for example:
     *            <code>us-east-1d</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     *
     * @return <p>
     *         A subnet group to associate with the replication instance.
     *         </p>
     */
    public String getReplicationSubnetGroupIdentifier() {
        return replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            A subnet group to associate with the replication instance.
     *            </p>
     */
    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroupIdentifier <p>
     *            A subnet group to associate with the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withReplicationSubnetGroupIdentifier(
            String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @return <p>
     *         The weekly time range during which system maintenance can occur,
     *         in Universal Coordinated Time (UTC).
     *         </p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         Default: A 30-minute window selected at random from an 8-hour
     *         block of time per AWS Region, occurring on a random day of the
     *         week.
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC).
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            Default: A 30-minute window selected at random from an 8-hour
     *            block of time per AWS Region, occurring on a random day of the
     *            week.
     *            </p>
     *            <p>
     *            Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *            </p>
     *            <p>
     *            Constraints: Minimum 30-minute window.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC).
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            Default: A 30-minute window selected at random from an 8-hour
     *            block of time per AWS Region, occurring on a random day of the
     *            week.
     *            </p>
     *            <p>
     *            Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *            </p>
     *            <p>
     *            Constraints: Minimum 30-minute window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withPreferredMaintenanceWindow(
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
    public CreateReplicationInstanceRequest withMultiAZ(Boolean multiAZ) {
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
    public CreateReplicationInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor engine upgrades are applied
     *         automatically to the replication instance during the maintenance
     *         window. This parameter defaults to <code>true</code>.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor engine upgrades are applied
     *         automatically to the replication instance during the maintenance
     *         window. This parameter defaults to <code>true</code>.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor engine upgrades are
     *            applied automatically to the replication instance during the
     *            maintenance window. This parameter defaults to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the replication instance during the maintenance window.
     * This parameter defaults to <code>true</code>.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor engine upgrades are
     *            applied automatically to the replication instance during the
     *            maintenance window. This parameter defaults to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     *
     * @return <p>
     *         One or more tags to be assigned to the replication instance.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     *
     * @param tags <p>
     *            One or more tags to be assigned to the replication instance.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the
     * replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     *
     * @return <p>
     *         An AWS KMS key identifier that is used to encrypt the data on the
     *         replication instance.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code>
     *         parameter, then AWS DMS uses your default encryption key.
     *         </p>
     *         <p>
     *         AWS KMS creates the default encryption key for your AWS account.
     *         Your AWS account has a different default encryption key for each
     *         AWS Region.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the
     * replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     *
     * @param kmsKeyId <p>
     *            An AWS KMS key identifier that is used to encrypt the data on
     *            the replication instance.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then AWS DMS uses your default encryption key.
     *            </p>
     *            <p>
     *            AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An AWS KMS key identifier that is used to encrypt the data on the
     * replication instance.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then AWS DMS uses your default encryption key.
     * </p>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            An AWS KMS key identifier that is used to encrypt the data on
     *            the replication instance.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then AWS DMS uses your default encryption key.
     *            </p>
     *            <p>
     *            AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for the replication instance.
     *         A value of <code>true</code> represents an instance with a public
     *         IP address. A value of <code>false</code> represents an instance
     *         with a private IP address. The default value is <code>true</code>
     *         .
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for the replication instance.
     *         A value of <code>true</code> represents an instance with a public
     *         IP address. A value of <code>false</code> represents an instance
     *         with a private IP address. The default value is <code>true</code>
     *         .
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for the replication
     *            instance. A value of <code>true</code> represents an instance
     *            with a public IP address. A value of <code>false</code>
     *            represents an instance with a private IP address. The default
     *            value is <code>true</code>.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for the replication
     *            instance. A value of <code>true</code> represents an instance
     *            with a public IP address. A value of <code>false</code>
     *            represents an instance with a private IP address. The default
     *            value is <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * A list of DNS name servers supported for the replication instance.
     * </p>
     *
     * @return <p>
     *         A list of DNS name servers supported for the replication
     *         instance.
     *         </p>
     */
    public String getDnsNameServers() {
        return dnsNameServers;
    }

    /**
     * <p>
     * A list of DNS name servers supported for the replication instance.
     * </p>
     *
     * @param dnsNameServers <p>
     *            A list of DNS name servers supported for the replication
     *            instance.
     *            </p>
     */
    public void setDnsNameServers(String dnsNameServers) {
        this.dnsNameServers = dnsNameServers;
    }

    /**
     * <p>
     * A list of DNS name servers supported for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsNameServers <p>
     *            A list of DNS name servers supported for the replication
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationInstanceRequest withDnsNameServers(String dnsNameServers) {
        this.dnsNameServers = dnsNameServers;
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
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: " + getReplicationInstanceIdentifier() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: " + getReplicationInstanceClass() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: " + getReplicationSubnetGroupIdentifier()
                    + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getDnsNameServers() != null)
            sb.append("DnsNameServers: " + getDnsNameServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceIdentifier() == null) ? 0
                        : getReplicationInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroupIdentifier() == null) ? 0
                        : getReplicationSubnetGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode
                + ((getDnsNameServers() == null) ? 0 : getDnsNameServers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationInstanceRequest == false)
            return false;
        CreateReplicationInstanceRequest other = (CreateReplicationInstanceRequest) obj;

        if (other.getReplicationInstanceIdentifier() == null
                ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(
                        this.getReplicationInstanceIdentifier()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
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
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() == null
                ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(
                        this.getReplicationSubnetGroupIdentifier()) == false)
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
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getDnsNameServers() == null ^ this.getDnsNameServers() == null)
            return false;
        if (other.getDnsNameServers() != null
                && other.getDnsNameServers().equals(this.getDnsNameServers()) == false)
            return false;
        return true;
    }
}
