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
 * A description of the Amazon EC2 instance on which the cluster (job flow)
 * runs. A valid JobFlowInstancesConfig must contain either InstanceGroups or
 * InstanceFleets, which is the recommended configuration. They cannot be used
 * together. You may also have MasterInstanceType, SlaveInstanceType, and
 * InstanceCount (all three must be present), but we don't recommend this
 * configuration.
 * </p>
 */
public class JobFlowInstancesConfig implements Serializable {
    /**
     * <p>
     * The EC2 instance type of the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String masterInstanceType;

    /**
     * <p>
     * The EC2 instance type of the core and task nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String slaveInstanceType;

    /**
     * <p>
     * The number of EC2 instances in the cluster.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * Configuration for the instance groups in a cluster.
     * </p>
     */
    private java.util.List<InstanceGroupConfig> instanceGroups;

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Describes the EC2 instances and instance configurations for clusters that
     * use the instance fleet configuration.
     * </p>
     */
    private java.util.List<InstanceFleetConfig> instanceFleets;

    /**
     * <p>
     * The name of the EC2 key pair that can be used to ssh to the master node
     * as the user called "hadoop."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String ec2KeyName;

    /**
     * <p>
     * The Availability Zone in which the cluster runs.
     * </p>
     */
    private PlacementType placement;

    /**
     * <p>
     * Specifies whether the cluster should remain available after completing
     * all steps.
     * </p>
     */
    private Boolean keepJobFlowAliveWhenNoSteps;

    /**
     * <p>
     * Specifies whether to lock the cluster to prevent the Amazon EC2 instances
     * from being terminated by API call, user intervention, or in the event of
     * a job-flow error.
     * </p>
     */
    private Boolean terminationProtected;

    /**
     * <p>
     * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop
     * version for the cluster. Valid inputs are "0.18" (deprecated), "0.20"
     * (deprecated), "0.20.205" (deprecated), "1.0.3", "2.2.0", or "2.4.0". If
     * you do not set this value, the default of 0.18 is used, unless the
     * <code>AmiVersion</code> parameter is set in the RunJobFlow call, in which
     * case the default version of Hadoop for that AMI version is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String hadoopVersion;

    /**
     * <p>
     * Applies to clusters that use the uniform instance group configuration. To
     * launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this
     * parameter to the identifier of the Amazon VPC subnet where you want the
     * cluster to launch. If you do not specify this value and your account
     * supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String ec2SubnetId;

    /**
     * <p>
     * Applies to clusters that use the instance fleet configuration. When
     * multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
     * launches instances in the optimal subnet.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     */
    private java.util.List<String> ec2SubnetIds;

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String emrManagedMasterSecurityGroup;

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the core and task
     * nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String emrManagedSlaveSecurityGroup;

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * The EC2 instance type of the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The EC2 instance type of the master node.
     *         </p>
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param masterInstanceType <p>
     *            The EC2 instance type of the master node.
     *            </p>
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the master node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param masterInstanceType <p>
     *            The EC2 instance type of the master node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }

    /**
     * <p>
     * The EC2 instance type of the core and task nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The EC2 instance type of the core and task nodes.
     *         </p>
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the core and task nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param slaveInstanceType <p>
     *            The EC2 instance type of the core and task nodes.
     *            </p>
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the core and task nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param slaveInstanceType <p>
     *            The EC2 instance type of the core and task nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances in the cluster.
     * </p>
     *
     * @return <p>
     *         The number of EC2 instances in the cluster.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of EC2 instances in the cluster.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of EC2 instances in the cluster.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of EC2 instances in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of EC2 instances in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * Configuration for the instance groups in a cluster.
     * </p>
     *
     * @return <p>
     *         Configuration for the instance groups in a cluster.
     *         </p>
     */
    public java.util.List<InstanceGroupConfig> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * Configuration for the instance groups in a cluster.
     * </p>
     *
     * @param instanceGroups <p>
     *            Configuration for the instance groups in a cluster.
     *            </p>
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new java.util.ArrayList<InstanceGroupConfig>(instanceGroups);
    }

    /**
     * <p>
     * Configuration for the instance groups in a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Configuration for the instance groups in a cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withInstanceGroups(InstanceGroupConfig... instanceGroups) {
        if (getInstanceGroups() == null) {
            this.instanceGroups = new java.util.ArrayList<InstanceGroupConfig>(
                    instanceGroups.length);
        }
        for (InstanceGroupConfig value : instanceGroups) {
            this.instanceGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Configuration for the instance groups in a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Configuration for the instance groups in a cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withInstanceGroups(
            java.util.Collection<InstanceGroupConfig> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Describes the EC2 instances and instance configurations for clusters that
     * use the instance fleet configuration.
     * </p>
     *
     * @return <note>
     *         <p>
     *         The instance fleet configuration is available only in Amazon EMR
     *         versions 4.8.0 and later, excluding 5.0.x versions.
     *         </p>
     *         </note>
     *         <p>
     *         Describes the EC2 instances and instance configurations for
     *         clusters that use the instance fleet configuration.
     *         </p>
     */
    public java.util.List<InstanceFleetConfig> getInstanceFleets() {
        return instanceFleets;
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Describes the EC2 instances and instance configurations for clusters that
     * use the instance fleet configuration.
     * </p>
     *
     * @param instanceFleets <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     *            <p>
     *            Describes the EC2 instances and instance configurations for
     *            clusters that use the instance fleet configuration.
     *            </p>
     */
    public void setInstanceFleets(java.util.Collection<InstanceFleetConfig> instanceFleets) {
        if (instanceFleets == null) {
            this.instanceFleets = null;
            return;
        }

        this.instanceFleets = new java.util.ArrayList<InstanceFleetConfig>(instanceFleets);
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Describes the EC2 instances and instance configurations for clusters that
     * use the instance fleet configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleets <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     *            <p>
     *            Describes the EC2 instances and instance configurations for
     *            clusters that use the instance fleet configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withInstanceFleets(InstanceFleetConfig... instanceFleets) {
        if (getInstanceFleets() == null) {
            this.instanceFleets = new java.util.ArrayList<InstanceFleetConfig>(
                    instanceFleets.length);
        }
        for (InstanceFleetConfig value : instanceFleets) {
            this.instanceFleets.add(value);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Describes the EC2 instances and instance configurations for clusters that
     * use the instance fleet configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleets <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     *            <p>
     *            Describes the EC2 instances and instance configurations for
     *            clusters that use the instance fleet configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withInstanceFleets(
            java.util.Collection<InstanceFleetConfig> instanceFleets) {
        setInstanceFleets(instanceFleets);
        return this;
    }

    /**
     * <p>
     * The name of the EC2 key pair that can be used to ssh to the master node
     * as the user called "hadoop."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the EC2 key pair that can be used to ssh to the
     *         master node as the user called "hadoop."
     *         </p>
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }

    /**
     * <p>
     * The name of the EC2 key pair that can be used to ssh to the master node
     * as the user called "hadoop."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ec2KeyName <p>
     *            The name of the EC2 key pair that can be used to ssh to the
     *            master node as the user called "hadoop."
     *            </p>
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    /**
     * <p>
     * The name of the EC2 key pair that can be used to ssh to the master node
     * as the user called "hadoop."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ec2KeyName <p>
     *            The name of the EC2 key pair that can be used to ssh to the
     *            master node as the user called "hadoop."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster runs.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which the cluster runs.
     *         </p>
     */
    public PlacementType getPlacement() {
        return placement;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster runs.
     * </p>
     *
     * @param placement <p>
     *            The Availability Zone in which the cluster runs.
     *            </p>
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placement <p>
     *            The Availability Zone in which the cluster runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }

    /**
     * <p>
     * Specifies whether the cluster should remain available after completing
     * all steps.
     * </p>
     *
     * @return <p>
     *         Specifies whether the cluster should remain available after
     *         completing all steps.
     *         </p>
     */
    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the cluster should remain available after completing
     * all steps.
     * </p>
     *
     * @return <p>
     *         Specifies whether the cluster should remain available after
     *         completing all steps.
     *         </p>
     */
    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the cluster should remain available after completing
     * all steps.
     * </p>
     *
     * @param keepJobFlowAliveWhenNoSteps <p>
     *            Specifies whether the cluster should remain available after
     *            completing all steps.
     *            </p>
     */
    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the cluster should remain available after completing
     * all steps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keepJobFlowAliveWhenNoSteps <p>
     *            Specifies whether the cluster should remain available after
     *            completing all steps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withKeepJobFlowAliveWhenNoSteps(
            Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }

    /**
     * <p>
     * Specifies whether to lock the cluster to prevent the Amazon EC2 instances
     * from being terminated by API call, user intervention, or in the event of
     * a job-flow error.
     * </p>
     *
     * @return <p>
     *         Specifies whether to lock the cluster to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention,
     *         or in the event of a job-flow error.
     *         </p>
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * Specifies whether to lock the cluster to prevent the Amazon EC2 instances
     * from being terminated by API call, user intervention, or in the event of
     * a job-flow error.
     * </p>
     *
     * @return <p>
     *         Specifies whether to lock the cluster to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention,
     *         or in the event of a job-flow error.
     *         </p>
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * Specifies whether to lock the cluster to prevent the Amazon EC2 instances
     * from being terminated by API call, user intervention, or in the event of
     * a job-flow error.
     * </p>
     *
     * @param terminationProtected <p>
     *            Specifies whether to lock the cluster to prevent the Amazon
     *            EC2 instances from being terminated by API call, user
     *            intervention, or in the event of a job-flow error.
     *            </p>
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * Specifies whether to lock the cluster to prevent the Amazon EC2 instances
     * from being terminated by API call, user intervention, or in the event of
     * a job-flow error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationProtected <p>
     *            Specifies whether to lock the cluster to prevent the Amazon
     *            EC2 instances from being terminated by API call, user
     *            intervention, or in the event of a job-flow error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    /**
     * <p>
     * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop
     * version for the cluster. Valid inputs are "0.18" (deprecated), "0.20"
     * (deprecated), "0.20.205" (deprecated), "1.0.3", "2.2.0", or "2.4.0". If
     * you do not set this value, the default of 0.18 is used, unless the
     * <code>AmiVersion</code> parameter is set in the RunJobFlow call, in which
     * case the default version of Hadoop for that AMI version is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Applies only to Amazon EMR release versions earlier than 4.0. The
     *         Hadoop version for the cluster. Valid inputs are "0.18"
     *         (deprecated), "0.20" (deprecated), "0.20.205" (deprecated),
     *         "1.0.3", "2.2.0", or "2.4.0". If you do not set this value, the
     *         default of 0.18 is used, unless the <code>AmiVersion</code>
     *         parameter is set in the RunJobFlow call, in which case the
     *         default version of Hadoop for that AMI version is used.
     *         </p>
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }

    /**
     * <p>
     * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop
     * version for the cluster. Valid inputs are "0.18" (deprecated), "0.20"
     * (deprecated), "0.20.205" (deprecated), "1.0.3", "2.2.0", or "2.4.0". If
     * you do not set this value, the default of 0.18 is used, unless the
     * <code>AmiVersion</code> parameter is set in the RunJobFlow call, in which
     * case the default version of Hadoop for that AMI version is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param hadoopVersion <p>
     *            Applies only to Amazon EMR release versions earlier than 4.0.
     *            The Hadoop version for the cluster. Valid inputs are "0.18"
     *            (deprecated), "0.20" (deprecated), "0.20.205" (deprecated),
     *            "1.0.3", "2.2.0", or "2.4.0". If you do not set this value,
     *            the default of 0.18 is used, unless the
     *            <code>AmiVersion</code> parameter is set in the RunJobFlow
     *            call, in which case the default version of Hadoop for that AMI
     *            version is used.
     *            </p>
     */
    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }

    /**
     * <p>
     * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop
     * version for the cluster. Valid inputs are "0.18" (deprecated), "0.20"
     * (deprecated), "0.20.205" (deprecated), "1.0.3", "2.2.0", or "2.4.0". If
     * you do not set this value, the default of 0.18 is used, unless the
     * <code>AmiVersion</code> parameter is set in the RunJobFlow call, in which
     * case the default version of Hadoop for that AMI version is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param hadoopVersion <p>
     *            Applies only to Amazon EMR release versions earlier than 4.0.
     *            The Hadoop version for the cluster. Valid inputs are "0.18"
     *            (deprecated), "0.20" (deprecated), "0.20.205" (deprecated),
     *            "1.0.3", "2.2.0", or "2.4.0". If you do not set this value,
     *            the default of 0.18 is used, unless the
     *            <code>AmiVersion</code> parameter is set in the RunJobFlow
     *            call, in which case the default version of Hadoop for that AMI
     *            version is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
        return this;
    }

    /**
     * <p>
     * Applies to clusters that use the uniform instance group configuration. To
     * launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this
     * parameter to the identifier of the Amazon VPC subnet where you want the
     * cluster to launch. If you do not specify this value and your account
     * supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Applies to clusters that use the uniform instance group
     *         configuration. To launch the cluster in Amazon Virtual Private
     *         Cloud (Amazon VPC), set this parameter to the identifier of the
     *         Amazon VPC subnet where you want the cluster to launch. If you do
     *         not specify this value and your account supports EC2-Classic, the
     *         cluster launches in EC2-Classic.
     *         </p>
     */
    public String getEc2SubnetId() {
        return ec2SubnetId;
    }

    /**
     * <p>
     * Applies to clusters that use the uniform instance group configuration. To
     * launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this
     * parameter to the identifier of the Amazon VPC subnet where you want the
     * cluster to launch. If you do not specify this value and your account
     * supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ec2SubnetId <p>
     *            Applies to clusters that use the uniform instance group
     *            configuration. To launch the cluster in Amazon Virtual Private
     *            Cloud (Amazon VPC), set this parameter to the identifier of
     *            the Amazon VPC subnet where you want the cluster to launch. If
     *            you do not specify this value and your account supports
     *            EC2-Classic, the cluster launches in EC2-Classic.
     *            </p>
     */
    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    /**
     * <p>
     * Applies to clusters that use the uniform instance group configuration. To
     * launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this
     * parameter to the identifier of the Amazon VPC subnet where you want the
     * cluster to launch. If you do not specify this value and your account
     * supports EC2-Classic, the cluster launches in EC2-Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ec2SubnetId <p>
     *            Applies to clusters that use the uniform instance group
     *            configuration. To launch the cluster in Amazon Virtual Private
     *            Cloud (Amazon VPC), set this parameter to the identifier of
     *            the Amazon VPC subnet where you want the cluster to launch. If
     *            you do not specify this value and your account supports
     *            EC2-Classic, the cluster launches in EC2-Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }

    /**
     * <p>
     * Applies to clusters that use the instance fleet configuration. When
     * multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
     * launches instances in the optimal subnet.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     *
     * @return <p>
     *         Applies to clusters that use the instance fleet configuration.
     *         When multiple EC2 subnet IDs are specified, Amazon EMR evaluates
     *         them and launches instances in the optimal subnet.
     *         </p>
     *         <note>
     *         <p>
     *         The instance fleet configuration is available only in Amazon EMR
     *         versions 4.8.0 and later, excluding 5.0.x versions.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getEc2SubnetIds() {
        return ec2SubnetIds;
    }

    /**
     * <p>
     * Applies to clusters that use the instance fleet configuration. When
     * multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
     * launches instances in the optimal subnet.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     *
     * @param ec2SubnetIds <p>
     *            Applies to clusters that use the instance fleet configuration.
     *            When multiple EC2 subnet IDs are specified, Amazon EMR
     *            evaluates them and launches instances in the optimal subnet.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     */
    public void setEc2SubnetIds(java.util.Collection<String> ec2SubnetIds) {
        if (ec2SubnetIds == null) {
            this.ec2SubnetIds = null;
            return;
        }

        this.ec2SubnetIds = new java.util.ArrayList<String>(ec2SubnetIds);
    }

    /**
     * <p>
     * Applies to clusters that use the instance fleet configuration. When
     * multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
     * launches instances in the optimal subnet.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2SubnetIds <p>
     *            Applies to clusters that use the instance fleet configuration.
     *            When multiple EC2 subnet IDs are specified, Amazon EMR
     *            evaluates them and launches instances in the optimal subnet.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withEc2SubnetIds(String... ec2SubnetIds) {
        if (getEc2SubnetIds() == null) {
            this.ec2SubnetIds = new java.util.ArrayList<String>(ec2SubnetIds.length);
        }
        for (String value : ec2SubnetIds) {
            this.ec2SubnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Applies to clusters that use the instance fleet configuration. When
     * multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
     * launches instances in the optimal subnet.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2SubnetIds <p>
     *            Applies to clusters that use the instance fleet configuration.
     *            When multiple EC2 subnet IDs are specified, Amazon EMR
     *            evaluates them and launches instances in the optimal subnet.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withEc2SubnetIds(java.util.Collection<String> ec2SubnetIds) {
        setEc2SubnetIds(ec2SubnetIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param emrManagedMasterSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the master
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withEmrManagedMasterSecurityGroup(
            String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the core and task
     * nodes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param emrManagedSlaveSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the core
     *            and task nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withEmrManagedSlaveSecurityGroup(
            String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param serviceAccessSecurityGroup <p>
     *            The identifier of the Amazon EC2 security group for the Amazon
     *            EMR service to access clusters in VPC private subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesConfig withServiceAccessSecurityGroup(String serviceAccessSecurityGroup) {
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
    public JobFlowInstancesConfig withAdditionalMasterSecurityGroups(
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
    public JobFlowInstancesConfig withAdditionalMasterSecurityGroups(
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
    public JobFlowInstancesConfig withAdditionalSlaveSecurityGroups(
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
    public JobFlowInstancesConfig withAdditionalSlaveSecurityGroups(
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
        if (getMasterInstanceType() != null)
            sb.append("MasterInstanceType: " + getMasterInstanceType() + ",");
        if (getSlaveInstanceType() != null)
            sb.append("SlaveInstanceType: " + getSlaveInstanceType() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getInstanceFleets() != null)
            sb.append("InstanceFleets: " + getInstanceFleets() + ",");
        if (getEc2KeyName() != null)
            sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getKeepJobFlowAliveWhenNoSteps() != null)
            sb.append("KeepJobFlowAliveWhenNoSteps: " + getKeepJobFlowAliveWhenNoSteps() + ",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: " + getTerminationProtected() + ",");
        if (getHadoopVersion() != null)
            sb.append("HadoopVersion: " + getHadoopVersion() + ",");
        if (getEc2SubnetId() != null)
            sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getEc2SubnetIds() != null)
            sb.append("Ec2SubnetIds: " + getEc2SubnetIds() + ",");
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

        hashCode = prime * hashCode
                + ((getMasterInstanceType() == null) ? 0 : getMasterInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getSlaveInstanceType() == null) ? 0 : getSlaveInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFleets() == null) ? 0 : getInstanceFleets().hashCode());
        hashCode = prime * hashCode + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeepJobFlowAliveWhenNoSteps() == null) ? 0
                        : getKeepJobFlowAliveWhenNoSteps().hashCode());
        hashCode = prime * hashCode
                + ((getTerminationProtected() == null) ? 0 : getTerminationProtected().hashCode());
        hashCode = prime * hashCode
                + ((getHadoopVersion() == null) ? 0 : getHadoopVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getEc2SubnetIds() == null) ? 0 : getEc2SubnetIds().hashCode());
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

        if (obj instanceof JobFlowInstancesConfig == false)
            return false;
        JobFlowInstancesConfig other = (JobFlowInstancesConfig) obj;

        if (other.getMasterInstanceType() == null ^ this.getMasterInstanceType() == null)
            return false;
        if (other.getMasterInstanceType() != null
                && other.getMasterInstanceType().equals(this.getMasterInstanceType()) == false)
            return false;
        if (other.getSlaveInstanceType() == null ^ this.getSlaveInstanceType() == null)
            return false;
        if (other.getSlaveInstanceType() != null
                && other.getSlaveInstanceType().equals(this.getSlaveInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null
                && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        if (other.getInstanceFleets() == null ^ this.getInstanceFleets() == null)
            return false;
        if (other.getInstanceFleets() != null
                && other.getInstanceFleets().equals(this.getInstanceFleets()) == false)
            return false;
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null)
            return false;
        if (other.getEc2KeyName() != null
                && other.getEc2KeyName().equals(this.getEc2KeyName()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null
                && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getKeepJobFlowAliveWhenNoSteps() == null
                ^ this.getKeepJobFlowAliveWhenNoSteps() == null)
            return false;
        if (other.getKeepJobFlowAliveWhenNoSteps() != null
                && other.getKeepJobFlowAliveWhenNoSteps().equals(
                        this.getKeepJobFlowAliveWhenNoSteps()) == false)
            return false;
        if (other.getTerminationProtected() == null ^ this.getTerminationProtected() == null)
            return false;
        if (other.getTerminationProtected() != null
                && other.getTerminationProtected().equals(this.getTerminationProtected()) == false)
            return false;
        if (other.getHadoopVersion() == null ^ this.getHadoopVersion() == null)
            return false;
        if (other.getHadoopVersion() != null
                && other.getHadoopVersion().equals(this.getHadoopVersion()) == false)
            return false;
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null)
            return false;
        if (other.getEc2SubnetId() != null
                && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false)
            return false;
        if (other.getEc2SubnetIds() == null ^ this.getEc2SubnetIds() == null)
            return false;
        if (other.getEc2SubnetIds() != null
                && other.getEc2SubnetIds().equals(this.getEc2SubnetIds()) == false)
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
