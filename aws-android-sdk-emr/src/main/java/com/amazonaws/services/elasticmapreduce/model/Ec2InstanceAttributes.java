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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the EC2 instances in a cluster grouped by
 * category. For example, key name, subnet ID, IAM instance profile, and so on.
 * </p>
 */
public class Ec2InstanceAttributes implements Serializable {
    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into
     * the master node as a user named "hadoop".
     * </p>
     */
    private String ec2KeyName;

    /**
     * <p>
     * Set this parameter to the identifier of the Amazon VPC subnet where you
     * want the cluster to launch. If you do not specify this value, and your
     * account supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     */
    private String ec2SubnetId;

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * the unique identifier of one or more Amazon EC2 subnets in which to
     * launch EC2 cluster instances. Subnets must exist within the same VPC.
     * Amazon EMR chooses the EC2 subnet with the best fit from among the list
     * of <code>RequestedEc2SubnetIds</code>, and then launches all cluster
     * instances within that Subnet. If this value is not specified, and the
     * account and Region support EC2-Classic networks, the cluster launches
     * instances in the EC2-Classic network and uses
     * <code>RequestedEc2AvailabilityZones</code> instead of this setting. If
     * EC2-Classic is not supported, and no Subnet is specified, Amazon EMR
     * chooses the subnet for you. <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     */
    private java.util.List<String> requestedEc2SubnetIds;

    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     */
    private String ec2AvailabilityZone;

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * one or more Availability Zones in which to launch EC2 cluster instances
     * when the EC2-Classic network configuration is supported. Amazon EMR
     * chooses the Availability Zone with the best fit from among the list of
     * <code>RequestedEc2AvailabilityZones</code>, and then launches all cluster
     * instances within that Availability Zone. If you do not specify this
     * value, Amazon EMR chooses the Availability Zone for you.
     * <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     */
    private java.util.List<String> requestedEc2AvailabilityZones;

    /**
     * <p>
     * The IAM role that was specified when the cluster was launched. The EC2
     * instances of the cluster assume this role.
     * </p>
     */
    private String iamInstanceProfile;

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     */
    private String emrManagedMasterSecurityGroup;

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the core and task
     * nodes.
     * </p>
     */
    private String emrManagedSlaveSecurityGroup;

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     */
    private String serviceAccessSecurityGroup;

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     */
    private java.util.List<String> additionalMasterSecurityGroups;

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the core and task
     * nodes.
     * </p>
     */
    private java.util.List<String> additionalSlaveSecurityGroups;

    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into
     * the master node as a user named "hadoop".
     * </p>
     *
     * @return <p>
     *         The name of the Amazon EC2 key pair to use when connecting with
     *         SSH into the master node as a user named "hadoop".
     *         </p>
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into
     * the master node as a user named "hadoop".
     * </p>
     *
     * @param ec2KeyName <p>
     *            The name of the Amazon EC2 key pair to use when connecting
     *            with SSH into the master node as a user named "hadoop".
     *            </p>
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into
     * the master node as a user named "hadoop".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2KeyName <p>
     *            The name of the Amazon EC2 key pair to use when connecting
     *            with SSH into the master node as a user named "hadoop".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }

    /**
     * <p>
     * Set this parameter to the identifier of the Amazon VPC subnet where you
     * want the cluster to launch. If you do not specify this value, and your
     * account supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     *
     * @return <p>
     *         Set this parameter to the identifier of the Amazon VPC subnet
     *         where you want the cluster to launch. If you do not specify this
     *         value, and your account supports EC2-Classic, the cluster
     *         launches in EC2-Classic.
     *         </p>
     */
    public String getEc2SubnetId() {
        return ec2SubnetId;
    }

    /**
     * <p>
     * Set this parameter to the identifier of the Amazon VPC subnet where you
     * want the cluster to launch. If you do not specify this value, and your
     * account supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     *
     * @param ec2SubnetId <p>
     *            Set this parameter to the identifier of the Amazon VPC subnet
     *            where you want the cluster to launch. If you do not specify
     *            this value, and your account supports EC2-Classic, the cluster
     *            launches in EC2-Classic.
     *            </p>
     */
    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    /**
     * <p>
     * Set this parameter to the identifier of the Amazon VPC subnet where you
     * want the cluster to launch. If you do not specify this value, and your
     * account supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2SubnetId <p>
     *            Set this parameter to the identifier of the Amazon VPC subnet
     *            where you want the cluster to launch. If you do not specify
     *            this value, and your account supports EC2-Classic, the cluster
     *            launches in EC2-Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * the unique identifier of one or more Amazon EC2 subnets in which to
     * launch EC2 cluster instances. Subnets must exist within the same VPC.
     * Amazon EMR chooses the EC2 subnet with the best fit from among the list
     * of <code>RequestedEc2SubnetIds</code>, and then launches all cluster
     * instances within that Subnet. If this value is not specified, and the
     * account and Region support EC2-Classic networks, the cluster launches
     * instances in the EC2-Classic network and uses
     * <code>RequestedEc2AvailabilityZones</code> instead of this setting. If
     * EC2-Classic is not supported, and no Subnet is specified, Amazon EMR
     * chooses the subnet for you. <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     *
     * @return <p>
     *         Applies to clusters configured with the instance fleets option.
     *         Specifies the unique identifier of one or more Amazon EC2 subnets
     *         in which to launch EC2 cluster instances. Subnets must exist
     *         within the same VPC. Amazon EMR chooses the EC2 subnet with the
     *         best fit from among the list of
     *         <code>RequestedEc2SubnetIds</code>, and then launches all cluster
     *         instances within that Subnet. If this value is not specified, and
     *         the account and Region support EC2-Classic networks, the cluster
     *         launches instances in the EC2-Classic network and uses
     *         <code>RequestedEc2AvailabilityZones</code> instead of this
     *         setting. If EC2-Classic is not supported, and no Subnet is
     *         specified, Amazon EMR chooses the subnet for you.
     *         <code>RequestedEc2SubnetIDs</code> and
     *         <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *         together.
     *         </p>
     */
    public java.util.List<String> getRequestedEc2SubnetIds() {
        return requestedEc2SubnetIds;
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * the unique identifier of one or more Amazon EC2 subnets in which to
     * launch EC2 cluster instances. Subnets must exist within the same VPC.
     * Amazon EMR chooses the EC2 subnet with the best fit from among the list
     * of <code>RequestedEc2SubnetIds</code>, and then launches all cluster
     * instances within that Subnet. If this value is not specified, and the
     * account and Region support EC2-Classic networks, the cluster launches
     * instances in the EC2-Classic network and uses
     * <code>RequestedEc2AvailabilityZones</code> instead of this setting. If
     * EC2-Classic is not supported, and no Subnet is specified, Amazon EMR
     * chooses the subnet for you. <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     *
     * @param requestedEc2SubnetIds <p>
     *            Applies to clusters configured with the instance fleets
     *            option. Specifies the unique identifier of one or more Amazon
     *            EC2 subnets in which to launch EC2 cluster instances. Subnets
     *            must exist within the same VPC. Amazon EMR chooses the EC2
     *            subnet with the best fit from among the list of
     *            <code>RequestedEc2SubnetIds</code>, and then launches all
     *            cluster instances within that Subnet. If this value is not
     *            specified, and the account and Region support EC2-Classic
     *            networks, the cluster launches instances in the EC2-Classic
     *            network and uses <code>RequestedEc2AvailabilityZones</code>
     *            instead of this setting. If EC2-Classic is not supported, and
     *            no Subnet is specified, Amazon EMR chooses the subnet for you.
     *            <code>RequestedEc2SubnetIDs</code> and
     *            <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *            together.
     *            </p>
     */
    public void setRequestedEc2SubnetIds(java.util.Collection<String> requestedEc2SubnetIds) {
        if (requestedEc2SubnetIds == null) {
            this.requestedEc2SubnetIds = null;
            return;
        }

        this.requestedEc2SubnetIds = new java.util.ArrayList<String>(requestedEc2SubnetIds);
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * the unique identifier of one or more Amazon EC2 subnets in which to
     * launch EC2 cluster instances. Subnets must exist within the same VPC.
     * Amazon EMR chooses the EC2 subnet with the best fit from among the list
     * of <code>RequestedEc2SubnetIds</code>, and then launches all cluster
     * instances within that Subnet. If this value is not specified, and the
     * account and Region support EC2-Classic networks, the cluster launches
     * instances in the EC2-Classic network and uses
     * <code>RequestedEc2AvailabilityZones</code> instead of this setting. If
     * EC2-Classic is not supported, and no Subnet is specified, Amazon EMR
     * chooses the subnet for you. <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedEc2SubnetIds <p>
     *            Applies to clusters configured with the instance fleets
     *            option. Specifies the unique identifier of one or more Amazon
     *            EC2 subnets in which to launch EC2 cluster instances. Subnets
     *            must exist within the same VPC. Amazon EMR chooses the EC2
     *            subnet with the best fit from among the list of
     *            <code>RequestedEc2SubnetIds</code>, and then launches all
     *            cluster instances within that Subnet. If this value is not
     *            specified, and the account and Region support EC2-Classic
     *            networks, the cluster launches instances in the EC2-Classic
     *            network and uses <code>RequestedEc2AvailabilityZones</code>
     *            instead of this setting. If EC2-Classic is not supported, and
     *            no Subnet is specified, Amazon EMR chooses the subnet for you.
     *            <code>RequestedEc2SubnetIDs</code> and
     *            <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *            together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withRequestedEc2SubnetIds(String... requestedEc2SubnetIds) {
        if (getRequestedEc2SubnetIds() == null) {
            this.requestedEc2SubnetIds = new java.util.ArrayList<String>(
                    requestedEc2SubnetIds.length);
        }
        for (String value : requestedEc2SubnetIds) {
            this.requestedEc2SubnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * the unique identifier of one or more Amazon EC2 subnets in which to
     * launch EC2 cluster instances. Subnets must exist within the same VPC.
     * Amazon EMR chooses the EC2 subnet with the best fit from among the list
     * of <code>RequestedEc2SubnetIds</code>, and then launches all cluster
     * instances within that Subnet. If this value is not specified, and the
     * account and Region support EC2-Classic networks, the cluster launches
     * instances in the EC2-Classic network and uses
     * <code>RequestedEc2AvailabilityZones</code> instead of this setting. If
     * EC2-Classic is not supported, and no Subnet is specified, Amazon EMR
     * chooses the subnet for you. <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedEc2SubnetIds <p>
     *            Applies to clusters configured with the instance fleets
     *            option. Specifies the unique identifier of one or more Amazon
     *            EC2 subnets in which to launch EC2 cluster instances. Subnets
     *            must exist within the same VPC. Amazon EMR chooses the EC2
     *            subnet with the best fit from among the list of
     *            <code>RequestedEc2SubnetIds</code>, and then launches all
     *            cluster instances within that Subnet. If this value is not
     *            specified, and the account and Region support EC2-Classic
     *            networks, the cluster launches instances in the EC2-Classic
     *            network and uses <code>RequestedEc2AvailabilityZones</code>
     *            instead of this setting. If EC2-Classic is not supported, and
     *            no Subnet is specified, Amazon EMR chooses the subnet for you.
     *            <code>RequestedEc2SubnetIDs</code> and
     *            <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *            together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withRequestedEc2SubnetIds(
            java.util.Collection<String> requestedEc2SubnetIds) {
        setRequestedEc2SubnetIds(requestedEc2SubnetIds);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which the cluster will run.
     *         </p>
     */
    public String getEc2AvailabilityZone() {
        return ec2AvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     *
     * @param ec2AvailabilityZone <p>
     *            The Availability Zone in which the cluster will run.
     *            </p>
     */
    public void setEc2AvailabilityZone(String ec2AvailabilityZone) {
        this.ec2AvailabilityZone = ec2AvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2AvailabilityZone <p>
     *            The Availability Zone in which the cluster will run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withEc2AvailabilityZone(String ec2AvailabilityZone) {
        this.ec2AvailabilityZone = ec2AvailabilityZone;
        return this;
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * one or more Availability Zones in which to launch EC2 cluster instances
     * when the EC2-Classic network configuration is supported. Amazon EMR
     * chooses the Availability Zone with the best fit from among the list of
     * <code>RequestedEc2AvailabilityZones</code>, and then launches all cluster
     * instances within that Availability Zone. If you do not specify this
     * value, Amazon EMR chooses the Availability Zone for you.
     * <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     *
     * @return <p>
     *         Applies to clusters configured with the instance fleets option.
     *         Specifies one or more Availability Zones in which to launch EC2
     *         cluster instances when the EC2-Classic network configuration is
     *         supported. Amazon EMR chooses the Availability Zone with the best
     *         fit from among the list of
     *         <code>RequestedEc2AvailabilityZones</code>, and then launches all
     *         cluster instances within that Availability Zone. If you do not
     *         specify this value, Amazon EMR chooses the Availability Zone for
     *         you. <code>RequestedEc2SubnetIDs</code> and
     *         <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *         together.
     *         </p>
     */
    public java.util.List<String> getRequestedEc2AvailabilityZones() {
        return requestedEc2AvailabilityZones;
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * one or more Availability Zones in which to launch EC2 cluster instances
     * when the EC2-Classic network configuration is supported. Amazon EMR
     * chooses the Availability Zone with the best fit from among the list of
     * <code>RequestedEc2AvailabilityZones</code>, and then launches all cluster
     * instances within that Availability Zone. If you do not specify this
     * value, Amazon EMR chooses the Availability Zone for you.
     * <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     *
     * @param requestedEc2AvailabilityZones <p>
     *            Applies to clusters configured with the instance fleets
     *            option. Specifies one or more Availability Zones in which to
     *            launch EC2 cluster instances when the EC2-Classic network
     *            configuration is supported. Amazon EMR chooses the
     *            Availability Zone with the best fit from among the list of
     *            <code>RequestedEc2AvailabilityZones</code>, and then launches
     *            all cluster instances within that Availability Zone. If you do
     *            not specify this value, Amazon EMR chooses the Availability
     *            Zone for you. <code>RequestedEc2SubnetIDs</code> and
     *            <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *            together.
     *            </p>
     */
    public void setRequestedEc2AvailabilityZones(
            java.util.Collection<String> requestedEc2AvailabilityZones) {
        if (requestedEc2AvailabilityZones == null) {
            this.requestedEc2AvailabilityZones = null;
            return;
        }

        this.requestedEc2AvailabilityZones = new java.util.ArrayList<String>(
                requestedEc2AvailabilityZones);
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * one or more Availability Zones in which to launch EC2 cluster instances
     * when the EC2-Classic network configuration is supported. Amazon EMR
     * chooses the Availability Zone with the best fit from among the list of
     * <code>RequestedEc2AvailabilityZones</code>, and then launches all cluster
     * instances within that Availability Zone. If you do not specify this
     * value, Amazon EMR chooses the Availability Zone for you.
     * <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedEc2AvailabilityZones <p>
     *            Applies to clusters configured with the instance fleets
     *            option. Specifies one or more Availability Zones in which to
     *            launch EC2 cluster instances when the EC2-Classic network
     *            configuration is supported. Amazon EMR chooses the
     *            Availability Zone with the best fit from among the list of
     *            <code>RequestedEc2AvailabilityZones</code>, and then launches
     *            all cluster instances within that Availability Zone. If you do
     *            not specify this value, Amazon EMR chooses the Availability
     *            Zone for you. <code>RequestedEc2SubnetIDs</code> and
     *            <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *            together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withRequestedEc2AvailabilityZones(
            String... requestedEc2AvailabilityZones) {
        if (getRequestedEc2AvailabilityZones() == null) {
            this.requestedEc2AvailabilityZones = new java.util.ArrayList<String>(
                    requestedEc2AvailabilityZones.length);
        }
        for (String value : requestedEc2AvailabilityZones) {
            this.requestedEc2AvailabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Applies to clusters configured with the instance fleets option. Specifies
     * one or more Availability Zones in which to launch EC2 cluster instances
     * when the EC2-Classic network configuration is supported. Amazon EMR
     * chooses the Availability Zone with the best fit from among the list of
     * <code>RequestedEc2AvailabilityZones</code>, and then launches all cluster
     * instances within that Availability Zone. If you do not specify this
     * value, Amazon EMR chooses the Availability Zone for you.
     * <code>RequestedEc2SubnetIDs</code> and
     * <code>RequestedEc2AvailabilityZones</code> cannot be specified together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedEc2AvailabilityZones <p>
     *            Applies to clusters configured with the instance fleets
     *            option. Specifies one or more Availability Zones in which to
     *            launch EC2 cluster instances when the EC2-Classic network
     *            configuration is supported. Amazon EMR chooses the
     *            Availability Zone with the best fit from among the list of
     *            <code>RequestedEc2AvailabilityZones</code>, and then launches
     *            all cluster instances within that Availability Zone. If you do
     *            not specify this value, Amazon EMR chooses the Availability
     *            Zone for you. <code>RequestedEc2SubnetIDs</code> and
     *            <code>RequestedEc2AvailabilityZones</code> cannot be specified
     *            together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withRequestedEc2AvailabilityZones(
            java.util.Collection<String> requestedEc2AvailabilityZones) {
        setRequestedEc2AvailabilityZones(requestedEc2AvailabilityZones);
        return this;
    }

    /**
     * <p>
     * The IAM role that was specified when the cluster was launched. The EC2
     * instances of the cluster assume this role.
     * </p>
     *
     * @return <p>
     *         The IAM role that was specified when the cluster was launched.
     *         The EC2 instances of the cluster assume this role.
     *         </p>
     */
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM role that was specified when the cluster was launched. The EC2
     * instances of the cluster assume this role.
     * </p>
     *
     * @param iamInstanceProfile <p>
     *            The IAM role that was specified when the cluster was launched.
     *            The EC2 instances of the cluster assume this role.
     *            </p>
     */
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM role that was specified when the cluster was launched. The EC2
     * instances of the cluster assume this role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamInstanceProfile <p>
     *            The IAM role that was specified when the cluster was launched.
     *            The EC2 instances of the cluster assume this role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     *
     * @return <p>
     *         The identifier of the Amazon EC2 security group for the master
     *         node.
     *         </p>
     */
    public String getEmrManagedMasterSecurityGroup() {
        return emrManagedMasterSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     *
     * @param emrManagedMasterSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the master
     *            node.
     *            </p>
     */
    public void setEmrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emrManagedMasterSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the master
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withEmrManagedMasterSecurityGroup(
            String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the core and task
     * nodes.
     * </p>
     *
     * @return <p>
     *         The identifier of the Amazon EC2 security group for the core and
     *         task nodes.
     *         </p>
     */
    public String getEmrManagedSlaveSecurityGroup() {
        return emrManagedSlaveSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the core and task
     * nodes.
     * </p>
     *
     * @param emrManagedSlaveSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the core
     *            and task nodes.
     *            </p>
     */
    public void setEmrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the core and task
     * nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emrManagedSlaveSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the core
     *            and task nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withEmrManagedSlaveSecurityGroup(
            String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     *
     * @return <p>
     *         The identifier of the Amazon EC2 security group for the Amazon
     *         EMR service to access clusters in VPC private subnets.
     *         </p>
     */
    public String getServiceAccessSecurityGroup() {
        return serviceAccessSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     *
     * @param serviceAccessSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the Amazon
     *            EMR service to access clusters in VPC private subnets.
     *            </p>
     */
    public void setServiceAccessSecurityGroup(String serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the Amazon
     *            EMR service to access clusters in VPC private subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withServiceAccessSecurityGroup(String serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     *
     * @return <p>
     *         A list of additional Amazon EC2 security group IDs for the master
     *         node.
     *         </p>
     */
    public java.util.List<String> getAdditionalMasterSecurityGroups() {
        return additionalMasterSecurityGroups;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     *
     * @param additionalMasterSecurityGroups <p>
     *            A list of additional Amazon EC2 security group IDs for the
     *            master node.
     *            </p>
     */
    public void setAdditionalMasterSecurityGroups(
            java.util.Collection<String> additionalMasterSecurityGroups) {
        if (additionalMasterSecurityGroups == null) {
            this.additionalMasterSecurityGroups = null;
            return;
        }

        this.additionalMasterSecurityGroups = new java.util.ArrayList<String>(
                additionalMasterSecurityGroups);
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalMasterSecurityGroups <p>
     *            A list of additional Amazon EC2 security group IDs for the
     *            master node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withAdditionalMasterSecurityGroups(
            String... additionalMasterSecurityGroups) {
        if (getAdditionalMasterSecurityGroups() == null) {
            this.additionalMasterSecurityGroups = new java.util.ArrayList<String>(
                    additionalMasterSecurityGroups.length);
        }
        for (String value : additionalMasterSecurityGroups) {
            this.additionalMasterSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalMasterSecurityGroups <p>
     *            A list of additional Amazon EC2 security group IDs for the
     *            master node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withAdditionalMasterSecurityGroups(
            java.util.Collection<String> additionalMasterSecurityGroups) {
        setAdditionalMasterSecurityGroups(additionalMasterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the core and task
     * nodes.
     * </p>
     *
     * @return <p>
     *         A list of additional Amazon EC2 security group IDs for the core
     *         and task nodes.
     *         </p>
     */
    public java.util.List<String> getAdditionalSlaveSecurityGroups() {
        return additionalSlaveSecurityGroups;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the core and task
     * nodes.
     * </p>
     *
     * @param additionalSlaveSecurityGroups <p>
     *            A list of additional Amazon EC2 security group IDs for the
     *            core and task nodes.
     *            </p>
     */
    public void setAdditionalSlaveSecurityGroups(
            java.util.Collection<String> additionalSlaveSecurityGroups) {
        if (additionalSlaveSecurityGroups == null) {
            this.additionalSlaveSecurityGroups = null;
            return;
        }

        this.additionalSlaveSecurityGroups = new java.util.ArrayList<String>(
                additionalSlaveSecurityGroups);
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the core and task
     * nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalSlaveSecurityGroups <p>
     *            A list of additional Amazon EC2 security group IDs for the
     *            core and task nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withAdditionalSlaveSecurityGroups(
            String... additionalSlaveSecurityGroups) {
        if (getAdditionalSlaveSecurityGroups() == null) {
            this.additionalSlaveSecurityGroups = new java.util.ArrayList<String>(
                    additionalSlaveSecurityGroups.length);
        }
        for (String value : additionalSlaveSecurityGroups) {
            this.additionalSlaveSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the core and task
     * nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalSlaveSecurityGroups <p>
     *            A list of additional Amazon EC2 security group IDs for the
     *            core and task nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2InstanceAttributes withAdditionalSlaveSecurityGroups(
            java.util.Collection<String> additionalSlaveSecurityGroups) {
        setAdditionalSlaveSecurityGroups(additionalSlaveSecurityGroups);
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
        if (getEc2KeyName() != null)
            sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getEc2SubnetId() != null)
            sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getRequestedEc2SubnetIds() != null)
            sb.append("RequestedEc2SubnetIds: " + getRequestedEc2SubnetIds() + ",");
        if (getEc2AvailabilityZone() != null)
            sb.append("Ec2AvailabilityZone: " + getEc2AvailabilityZone() + ",");
        if (getRequestedEc2AvailabilityZones() != null)
            sb.append("RequestedEc2AvailabilityZones: " + getRequestedEc2AvailabilityZones() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getEmrManagedMasterSecurityGroup() != null)
            sb.append("EmrManagedMasterSecurityGroup: " + getEmrManagedMasterSecurityGroup() + ",");
        if (getEmrManagedSlaveSecurityGroup() != null)
            sb.append("EmrManagedSlaveSecurityGroup: " + getEmrManagedSlaveSecurityGroup() + ",");
        if (getServiceAccessSecurityGroup() != null)
            sb.append("ServiceAccessSecurityGroup: " + getServiceAccessSecurityGroup() + ",");
        if (getAdditionalMasterSecurityGroups() != null)
            sb.append("AdditionalMasterSecurityGroups: " + getAdditionalMasterSecurityGroups()
                    + ",");
        if (getAdditionalSlaveSecurityGroups() != null)
            sb.append("AdditionalSlaveSecurityGroups: " + getAdditionalSlaveSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode());
        hashCode = prime * hashCode
                + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestedEc2SubnetIds() == null) ? 0 : getRequestedEc2SubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getEc2AvailabilityZone() == null) ? 0 : getEc2AvailabilityZone().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestedEc2AvailabilityZones() == null) ? 0
                        : getRequestedEc2AvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime
                * hashCode
                + ((getEmrManagedMasterSecurityGroup() == null) ? 0
                        : getEmrManagedMasterSecurityGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getEmrManagedSlaveSecurityGroup() == null) ? 0
                        : getEmrManagedSlaveSecurityGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceAccessSecurityGroup() == null) ? 0 : getServiceAccessSecurityGroup()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalMasterSecurityGroups() == null) ? 0
                        : getAdditionalMasterSecurityGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalSlaveSecurityGroups() == null) ? 0
                        : getAdditionalSlaveSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2InstanceAttributes == false)
            return false;
        Ec2InstanceAttributes other = (Ec2InstanceAttributes) obj;

        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null)
            return false;
        if (other.getEc2KeyName() != null
                && other.getEc2KeyName().equals(this.getEc2KeyName()) == false)
            return false;
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null)
            return false;
        if (other.getEc2SubnetId() != null
                && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false)
            return false;
        if (other.getRequestedEc2SubnetIds() == null ^ this.getRequestedEc2SubnetIds() == null)
            return false;
        if (other.getRequestedEc2SubnetIds() != null
                && other.getRequestedEc2SubnetIds().equals(this.getRequestedEc2SubnetIds()) == false)
            return false;
        if (other.getEc2AvailabilityZone() == null ^ this.getEc2AvailabilityZone() == null)
            return false;
        if (other.getEc2AvailabilityZone() != null
                && other.getEc2AvailabilityZone().equals(this.getEc2AvailabilityZone()) == false)
            return false;
        if (other.getRequestedEc2AvailabilityZones() == null
                ^ this.getRequestedEc2AvailabilityZones() == null)
            return false;
        if (other.getRequestedEc2AvailabilityZones() != null
                && other.getRequestedEc2AvailabilityZones().equals(
                        this.getRequestedEc2AvailabilityZones()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getEmrManagedMasterSecurityGroup() == null
                ^ this.getEmrManagedMasterSecurityGroup() == null)
            return false;
        if (other.getEmrManagedMasterSecurityGroup() != null
                && other.getEmrManagedMasterSecurityGroup().equals(
                        this.getEmrManagedMasterSecurityGroup()) == false)
            return false;
        if (other.getEmrManagedSlaveSecurityGroup() == null
                ^ this.getEmrManagedSlaveSecurityGroup() == null)
            return false;
        if (other.getEmrManagedSlaveSecurityGroup() != null
                && other.getEmrManagedSlaveSecurityGroup().equals(
                        this.getEmrManagedSlaveSecurityGroup()) == false)
            return false;
        if (other.getServiceAccessSecurityGroup() == null
                ^ this.getServiceAccessSecurityGroup() == null)
            return false;
        if (other.getServiceAccessSecurityGroup() != null
                && other.getServiceAccessSecurityGroup().equals(
                        this.getServiceAccessSecurityGroup()) == false)
            return false;
        if (other.getAdditionalMasterSecurityGroups() == null
                ^ this.getAdditionalMasterSecurityGroups() == null)
            return false;
        if (other.getAdditionalMasterSecurityGroups() != null
                && other.getAdditionalMasterSecurityGroups().equals(
                        this.getAdditionalMasterSecurityGroups()) == false)
            return false;
        if (other.getAdditionalSlaveSecurityGroups() == null
                ^ this.getAdditionalSlaveSecurityGroups() == null)
            return false;
        if (other.getAdditionalSlaveSecurityGroups() != null
                && other.getAdditionalSlaveSecurityGroups().equals(
                        this.getAdditionalSlaveSecurityGroups()) == false)
            return false;
        return true;
    }
}
