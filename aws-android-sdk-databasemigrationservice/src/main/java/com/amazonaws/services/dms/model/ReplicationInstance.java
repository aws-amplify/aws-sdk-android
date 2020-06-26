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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information that defines a replication instance.
 * </p>
 */
public class ReplicationInstance implements Serializable {
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
     * Must contain 1-63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
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
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     */
    private String replicationInstanceClass;

    /**
     * <p>
     * The status of the replication instance. The possible return values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"available"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleted"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"upgrading"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"rebooting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"resetting-master-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"storage-full"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-network"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"maintenance"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String replicationInstanceStatus;

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     */
    private java.util.Date instanceCreateTime;

    /**
     * <p>
     * The VPC security group for the instance.
     * </p>
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups;

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     */
    private ReplicationSubnetGroup replicationSubnetGroup;

    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * The pending modification values.
     * </p>
     */
    private ReplicationPendingModifiedValues pendingModifiedValues;

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
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

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
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     */
    private String replicationInstancePublicIpAddress;

    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     */
    private String replicationInstancePrivateIpAddress;

    /**
     * <p>
     * One or more public IP addresses for the replication instance.
     * </p>
     */
    private java.util.List<String> replicationInstancePublicIpAddresses;

    /**
     * <p>
     * One or more private IP addresses for the replication instance.
     * </p>
     */
    private java.util.List<String> replicationInstancePrivateIpAddresses;

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
     * The Availability Zone of the standby replication instance in a Multi-AZ
     * deployment.
     * </p>
     */
    private String secondaryAvailabilityZone;

    /**
     * <p>
     * The expiration date of the free replication instance that is part of the
     * Free DMS program.
     * </p>
     */
    private java.util.Date freeUntil;

    /**
     * <p>
     * The DNS name servers supported for the replication instance to access
     * your on-premise source or target database.
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
     * Must contain 1-63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
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
     *         Must contain 1-63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
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
     * Must contain 1-63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
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
     *            Must contain 1-63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
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
     * Must contain 1-63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
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
     *            Must contain 1-63 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>myrepinstance</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstanceIdentifier(
            String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     *
     * @return <p>
     *         The compute and memory capacity of the replication instance as
     *         defined for the specified replication instance class.
     *         </p>
     *         <p>
     *         For more information on the settings and capacities for the
     *         available replication instance classes, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *         > Selecting the right AWS DMS replication instance for your
     *         migration</a>.
     *         </p>
     */
    public String getReplicationInstanceClass() {
        return replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance as
     *            defined for the specified replication instance class.
     *            </p>
     *            <p>
     *            For more information on the settings and capacities for the
     *            available replication instance classes, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *            > Selecting the right AWS DMS replication instance for your
     *            migration</a>.
     *            </p>
     */
    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance as
     *            defined for the specified replication instance class.
     *            </p>
     *            <p>
     *            For more information on the settings and capacities for the
     *            available replication instance classes, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *            > Selecting the right AWS DMS replication instance for your
     *            migration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
        return this;
    }

    /**
     * <p>
     * The status of the replication instance. The possible return values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"available"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleted"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"upgrading"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"rebooting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"resetting-master-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"storage-full"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-network"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"maintenance"</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the replication instance. The possible return
     *         values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"available"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"creating"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"deleted"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"deleting"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"failed"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"modifying"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"upgrading"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"rebooting"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"resetting-master-credentials"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"storage-full"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"incompatible-credentials"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"incompatible-network"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"maintenance"</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getReplicationInstanceStatus() {
        return replicationInstanceStatus;
    }

    /**
     * <p>
     * The status of the replication instance. The possible return values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"available"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleted"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"upgrading"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"rebooting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"resetting-master-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"storage-full"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-network"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"maintenance"</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param replicationInstanceStatus <p>
     *            The status of the replication instance. The possible return
     *            values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"available"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"creating"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"deleted"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"deleting"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"failed"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"modifying"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"upgrading"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"rebooting"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"resetting-master-credentials"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"storage-full"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"incompatible-credentials"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"incompatible-network"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"maintenance"</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setReplicationInstanceStatus(String replicationInstanceStatus) {
        this.replicationInstanceStatus = replicationInstanceStatus;
    }

    /**
     * <p>
     * The status of the replication instance. The possible return values
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"available"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"creating"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleted"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"modifying"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"upgrading"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"rebooting"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"resetting-master-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"storage-full"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-credentials"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"incompatible-network"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"maintenance"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceStatus <p>
     *            The status of the replication instance. The possible return
     *            values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"available"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"creating"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"deleted"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"deleting"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"failed"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"modifying"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"upgrading"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"rebooting"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"resetting-master-credentials"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"storage-full"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"incompatible-credentials"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"incompatible-network"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"maintenance"</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstanceStatus(String replicationInstanceStatus) {
        this.replicationInstanceStatus = replicationInstanceStatus;
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     *
     * @return <p>
     *         The amount of storage (in gigabytes) that is allocated for the
     *         replication instance.
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) that is allocated for the
     *            replication instance.
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) that is allocated for the
     *            replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     *
     * @return <p>
     *         The time the replication instance was created.
     *         </p>
     */
    public java.util.Date getInstanceCreateTime() {
        return instanceCreateTime;
    }

    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     *
     * @param instanceCreateTime <p>
     *            The time the replication instance was created.
     *            </p>
     */
    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCreateTime <p>
     *            The time the replication instance was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * <p>
     * The VPC security group for the instance.
     * </p>
     *
     * @return <p>
     *         The VPC security group for the instance.
     *         </p>
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * The VPC security group for the instance.
     * </p>
     *
     * @param vpcSecurityGroups <p>
     *            The VPC security group for the instance.
     *            </p>
     */
    public void setVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(
                vpcSecurityGroups);
    }

    /**
     * <p>
     * The VPC security group for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            The VPC security group for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withVpcSecurityGroups(
            VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (getVpcSecurityGroups() == null) {
            this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(
                    vpcSecurityGroups.length);
        }
        for (VpcSecurityGroupMembership value : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The VPC security group for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            The VPC security group for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     *
     * @return <p>
     *         The Availability Zone for the instance.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the instance.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     *
     * @return <p>
     *         The subnet group for the replication instance.
     *         </p>
     */
    public ReplicationSubnetGroup getReplicationSubnetGroup() {
        return replicationSubnetGroup;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     *
     * @param replicationSubnetGroup <p>
     *            The subnet group for the replication instance.
     *            </p>
     */
    public void setReplicationSubnetGroup(ReplicationSubnetGroup replicationSubnetGroup) {
        this.replicationSubnetGroup = replicationSubnetGroup;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSubnetGroup <p>
     *            The subnet group for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationSubnetGroup(
            ReplicationSubnetGroup replicationSubnetGroup) {
        this.replicationSubnetGroup = replicationSubnetGroup;
        return this;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     *
     * @return <p>
     *         The maintenance window times for the replication instance.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The maintenance window times for the replication instance.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The maintenance window times for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The pending modification values.
     * </p>
     *
     * @return <p>
     *         The pending modification values.
     *         </p>
     */
    public ReplicationPendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }

    /**
     * <p>
     * The pending modification values.
     * </p>
     *
     * @param pendingModifiedValues <p>
     *            The pending modification values.
     *            </p>
     */
    public void setPendingModifiedValues(ReplicationPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * The pending modification values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingModifiedValues <p>
     *            The pending modification values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withPendingModifiedValues(
            ReplicationPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
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
    public ReplicationInstance withMultiAZ(Boolean multiAZ) {
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
    public ReplicationInstance withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     *
     * @return <p>
     *         Boolean value indicating if minor version upgrades will be
     *         automatically applied to the instance.
     *         </p>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     *
     * @return <p>
     *         Boolean value indicating if minor version upgrades will be
     *         automatically applied to the instance.
     *         </p>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     *
     * @param autoMinorVersionUpgrade <p>
     *            Boolean value indicating if minor version upgrades will be
     *            automatically applied to the instance.
     *            </p>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            Boolean value indicating if minor version upgrades will be
     *            automatically applied to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
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
    public ReplicationInstance withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

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
    public ReplicationInstance withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     *
     * @return <p>
     *         The public IP address of the replication instance.
     *         </p>
     */
    public String getReplicationInstancePublicIpAddress() {
        return replicationInstancePublicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     *
     * @param replicationInstancePublicIpAddress <p>
     *            The public IP address of the replication instance.
     *            </p>
     */
    public void setReplicationInstancePublicIpAddress(String replicationInstancePublicIpAddress) {
        this.replicationInstancePublicIpAddress = replicationInstancePublicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstancePublicIpAddress <p>
     *            The public IP address of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstancePublicIpAddress(
            String replicationInstancePublicIpAddress) {
        this.replicationInstancePublicIpAddress = replicationInstancePublicIpAddress;
        return this;
    }

    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     *
     * @return <p>
     *         The private IP address of the replication instance.
     *         </p>
     */
    public String getReplicationInstancePrivateIpAddress() {
        return replicationInstancePrivateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     *
     * @param replicationInstancePrivateIpAddress <p>
     *            The private IP address of the replication instance.
     *            </p>
     */
    public void setReplicationInstancePrivateIpAddress(String replicationInstancePrivateIpAddress) {
        this.replicationInstancePrivateIpAddress = replicationInstancePrivateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstancePrivateIpAddress <p>
     *            The private IP address of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstancePrivateIpAddress(
            String replicationInstancePrivateIpAddress) {
        this.replicationInstancePrivateIpAddress = replicationInstancePrivateIpAddress;
        return this;
    }

    /**
     * <p>
     * One or more public IP addresses for the replication instance.
     * </p>
     *
     * @return <p>
     *         One or more public IP addresses for the replication instance.
     *         </p>
     */
    public java.util.List<String> getReplicationInstancePublicIpAddresses() {
        return replicationInstancePublicIpAddresses;
    }

    /**
     * <p>
     * One or more public IP addresses for the replication instance.
     * </p>
     *
     * @param replicationInstancePublicIpAddresses <p>
     *            One or more public IP addresses for the replication instance.
     *            </p>
     */
    public void setReplicationInstancePublicIpAddresses(
            java.util.Collection<String> replicationInstancePublicIpAddresses) {
        if (replicationInstancePublicIpAddresses == null) {
            this.replicationInstancePublicIpAddresses = null;
            return;
        }

        this.replicationInstancePublicIpAddresses = new java.util.ArrayList<String>(
                replicationInstancePublicIpAddresses);
    }

    /**
     * <p>
     * One or more public IP addresses for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstancePublicIpAddresses <p>
     *            One or more public IP addresses for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstancePublicIpAddresses(
            String... replicationInstancePublicIpAddresses) {
        if (getReplicationInstancePublicIpAddresses() == null) {
            this.replicationInstancePublicIpAddresses = new java.util.ArrayList<String>(
                    replicationInstancePublicIpAddresses.length);
        }
        for (String value : replicationInstancePublicIpAddresses) {
            this.replicationInstancePublicIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more public IP addresses for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstancePublicIpAddresses <p>
     *            One or more public IP addresses for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstancePublicIpAddresses(
            java.util.Collection<String> replicationInstancePublicIpAddresses) {
        setReplicationInstancePublicIpAddresses(replicationInstancePublicIpAddresses);
        return this;
    }

    /**
     * <p>
     * One or more private IP addresses for the replication instance.
     * </p>
     *
     * @return <p>
     *         One or more private IP addresses for the replication instance.
     *         </p>
     */
    public java.util.List<String> getReplicationInstancePrivateIpAddresses() {
        return replicationInstancePrivateIpAddresses;
    }

    /**
     * <p>
     * One or more private IP addresses for the replication instance.
     * </p>
     *
     * @param replicationInstancePrivateIpAddresses <p>
     *            One or more private IP addresses for the replication instance.
     *            </p>
     */
    public void setReplicationInstancePrivateIpAddresses(
            java.util.Collection<String> replicationInstancePrivateIpAddresses) {
        if (replicationInstancePrivateIpAddresses == null) {
            this.replicationInstancePrivateIpAddresses = null;
            return;
        }

        this.replicationInstancePrivateIpAddresses = new java.util.ArrayList<String>(
                replicationInstancePrivateIpAddresses);
    }

    /**
     * <p>
     * One or more private IP addresses for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstancePrivateIpAddresses <p>
     *            One or more private IP addresses for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstancePrivateIpAddresses(
            String... replicationInstancePrivateIpAddresses) {
        if (getReplicationInstancePrivateIpAddresses() == null) {
            this.replicationInstancePrivateIpAddresses = new java.util.ArrayList<String>(
                    replicationInstancePrivateIpAddresses.length);
        }
        for (String value : replicationInstancePrivateIpAddresses) {
            this.replicationInstancePrivateIpAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more private IP addresses for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstancePrivateIpAddresses <p>
     *            One or more private IP addresses for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withReplicationInstancePrivateIpAddresses(
            java.util.Collection<String> replicationInstancePrivateIpAddresses) {
        setReplicationInstancePrivateIpAddresses(replicationInstancePrivateIpAddresses);
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
    public ReplicationInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the standby replication instance in a Multi-AZ
     * deployment.
     * </p>
     *
     * @return <p>
     *         The Availability Zone of the standby replication instance in a
     *         Multi-AZ deployment.
     *         </p>
     */
    public String getSecondaryAvailabilityZone() {
        return secondaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the standby replication instance in a Multi-AZ
     * deployment.
     * </p>
     *
     * @param secondaryAvailabilityZone <p>
     *            The Availability Zone of the standby replication instance in a
     *            Multi-AZ deployment.
     *            </p>
     */
    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the standby replication instance in a Multi-AZ
     * deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryAvailabilityZone <p>
     *            The Availability Zone of the standby replication instance in a
     *            Multi-AZ deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * The expiration date of the free replication instance that is part of the
     * Free DMS program.
     * </p>
     *
     * @return <p>
     *         The expiration date of the free replication instance that is part
     *         of the Free DMS program.
     *         </p>
     */
    public java.util.Date getFreeUntil() {
        return freeUntil;
    }

    /**
     * <p>
     * The expiration date of the free replication instance that is part of the
     * Free DMS program.
     * </p>
     *
     * @param freeUntil <p>
     *            The expiration date of the free replication instance that is
     *            part of the Free DMS program.
     *            </p>
     */
    public void setFreeUntil(java.util.Date freeUntil) {
        this.freeUntil = freeUntil;
    }

    /**
     * <p>
     * The expiration date of the free replication instance that is part of the
     * Free DMS program.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param freeUntil <p>
     *            The expiration date of the free replication instance that is
     *            part of the Free DMS program.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withFreeUntil(java.util.Date freeUntil) {
        this.freeUntil = freeUntil;
        return this;
    }

    /**
     * <p>
     * The DNS name servers supported for the replication instance to access
     * your on-premise source or target database.
     * </p>
     *
     * @return <p>
     *         The DNS name servers supported for the replication instance to
     *         access your on-premise source or target database.
     *         </p>
     */
    public String getDnsNameServers() {
        return dnsNameServers;
    }

    /**
     * <p>
     * The DNS name servers supported for the replication instance to access
     * your on-premise source or target database.
     * </p>
     *
     * @param dnsNameServers <p>
     *            The DNS name servers supported for the replication instance to
     *            access your on-premise source or target database.
     *            </p>
     */
    public void setDnsNameServers(String dnsNameServers) {
        this.dnsNameServers = dnsNameServers;
    }

    /**
     * <p>
     * The DNS name servers supported for the replication instance to access
     * your on-premise source or target database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsNameServers <p>
     *            The DNS name servers supported for the replication instance to
     *            access your on-premise source or target database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationInstance withDnsNameServers(String dnsNameServers) {
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
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: " + getReplicationInstanceClass() + ",");
        if (getReplicationInstanceStatus() != null)
            sb.append("ReplicationInstanceStatus: " + getReplicationInstanceStatus() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: " + getInstanceCreateTime() + ",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getReplicationSubnetGroup() != null)
            sb.append("ReplicationSubnetGroup: " + getReplicationSubnetGroup() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getReplicationInstancePublicIpAddress() != null)
            sb.append("ReplicationInstancePublicIpAddress: "
                    + getReplicationInstancePublicIpAddress() + ",");
        if (getReplicationInstancePrivateIpAddress() != null)
            sb.append("ReplicationInstancePrivateIpAddress: "
                    + getReplicationInstancePrivateIpAddress() + ",");
        if (getReplicationInstancePublicIpAddresses() != null)
            sb.append("ReplicationInstancePublicIpAddresses: "
                    + getReplicationInstancePublicIpAddresses() + ",");
        if (getReplicationInstancePrivateIpAddresses() != null)
            sb.append("ReplicationInstancePrivateIpAddresses: "
                    + getReplicationInstancePrivateIpAddresses() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getSecondaryAvailabilityZone() != null)
            sb.append("SecondaryAvailabilityZone: " + getSecondaryAvailabilityZone() + ",");
        if (getFreeUntil() != null)
            sb.append("FreeUntil: " + getFreeUntil() + ",");
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
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceStatus() == null) ? 0 : getReplicationInstanceStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroup() == null) ? 0 : getReplicationSubnetGroup()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstancePublicIpAddress() == null) ? 0
                        : getReplicationInstancePublicIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstancePrivateIpAddress() == null) ? 0
                        : getReplicationInstancePrivateIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstancePublicIpAddresses() == null) ? 0
                        : getReplicationInstancePublicIpAddresses().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstancePrivateIpAddresses() == null) ? 0
                        : getReplicationInstancePrivateIpAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode + ((getFreeUntil() == null) ? 0 : getFreeUntil().hashCode());
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

        if (obj instanceof ReplicationInstance == false)
            return false;
        ReplicationInstance other = (ReplicationInstance) obj;

        if (other.getReplicationInstanceIdentifier() == null
                ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(
                        this.getReplicationInstanceIdentifier()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null
                ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null
                && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getReplicationInstanceStatus() == null
                ^ this.getReplicationInstanceStatus() == null)
            return false;
        if (other.getReplicationInstanceStatus() != null
                && other.getReplicationInstanceStatus().equals(this.getReplicationInstanceStatus()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null
                && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null
                && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getReplicationSubnetGroup() == null ^ this.getReplicationSubnetGroup() == null)
            return false;
        if (other.getReplicationSubnetGroup() != null
                && other.getReplicationSubnetGroup().equals(this.getReplicationSubnetGroup()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getReplicationInstancePublicIpAddress() == null
                ^ this.getReplicationInstancePublicIpAddress() == null)
            return false;
        if (other.getReplicationInstancePublicIpAddress() != null
                && other.getReplicationInstancePublicIpAddress().equals(
                        this.getReplicationInstancePublicIpAddress()) == false)
            return false;
        if (other.getReplicationInstancePrivateIpAddress() == null
                ^ this.getReplicationInstancePrivateIpAddress() == null)
            return false;
        if (other.getReplicationInstancePrivateIpAddress() != null
                && other.getReplicationInstancePrivateIpAddress().equals(
                        this.getReplicationInstancePrivateIpAddress()) == false)
            return false;
        if (other.getReplicationInstancePublicIpAddresses() == null
                ^ this.getReplicationInstancePublicIpAddresses() == null)
            return false;
        if (other.getReplicationInstancePublicIpAddresses() != null
                && other.getReplicationInstancePublicIpAddresses().equals(
                        this.getReplicationInstancePublicIpAddresses()) == false)
            return false;
        if (other.getReplicationInstancePrivateIpAddresses() == null
                ^ this.getReplicationInstancePrivateIpAddresses() == null)
            return false;
        if (other.getReplicationInstancePrivateIpAddresses() != null
                && other.getReplicationInstancePrivateIpAddresses().equals(
                        this.getReplicationInstancePrivateIpAddresses()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getSecondaryAvailabilityZone() == null
                ^ this.getSecondaryAvailabilityZone() == null)
            return false;
        if (other.getSecondaryAvailabilityZone() != null
                && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false)
            return false;
        if (other.getFreeUntil() == null ^ this.getFreeUntil() == null)
            return false;
        if (other.getFreeUntil() != null
                && other.getFreeUntil().equals(this.getFreeUntil()) == false)
            return false;
        if (other.getDnsNameServers() == null ^ this.getDnsNameServers() == null)
            return false;
        if (other.getDnsNameServers() != null
                && other.getDnsNameServers().equals(this.getDnsNameServers()) == false)
            return false;
        return true;
    }
}
