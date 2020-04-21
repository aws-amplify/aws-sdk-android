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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Specify the type of Amazon EC2 instances that the cluster (job flow) runs on.
 * </p>
 */
public class JobFlowInstancesDetail implements Serializable {
    /**
     * <p>
     * The Amazon EC2 master node instance type.
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
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String masterPublicDnsName;

    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String masterInstanceId;

    /**
     * <p>
     * The Amazon EC2 core and task node instance type.
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
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and core and task node. If the
     * value is greater than 1, one instance is the master node and all others
     * are core and task nodes.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * Details about the instance groups in a cluster.
     * </p>
     */
    private java.util.List<InstanceGroupDetail> instanceGroups;

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour that an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     */
    private Integer normalizedInstanceHours;

    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node.
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
     * For clusters launched within Amazon Virtual Private Cloud, this is the
     * identifier of the subnet where the cluster was launched.
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
     * The Amazon EC2 Availability Zone for the cluster.
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
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job-flow error.
     * </p>
     */
    private Boolean terminationProtected;

    /**
     * <p>
     * The Hadoop version for the cluster.
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
     * The Amazon EC2 master node instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon EC2 master node instance type.
     *         </p>
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 master node instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param masterInstanceType <p>
     *            The Amazon EC2 master node instance type.
     *            </p>
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 master node instance type.
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
     *            The Amazon EC2 master node instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }

    /**
     * <p>
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The DNS name of the master node. If the cluster is on a private
     *         subnet, this is the private DNS name. On a public subnet, this is
     *         the public DNS name.
     *         </p>
     */
    public String getMasterPublicDnsName() {
        return masterPublicDnsName;
    }

    /**
     * <p>
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param masterPublicDnsName <p>
     *            The DNS name of the master node. If the cluster is on a
     *            private subnet, this is the private DNS name. On a public
     *            subnet, this is the public DNS name.
     *            </p>
     */
    public void setMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
    }

    /**
     * <p>
     * The DNS name of the master node. If the cluster is on a private subnet,
     * this is the private DNS name. On a public subnet, this is the public DNS
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param masterPublicDnsName <p>
     *            The DNS name of the master node. If the cluster is on a
     *            private subnet, this is the private DNS name. On a public
     *            subnet, this is the public DNS name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon EC2 instance identifier of the master node.
     *         </p>
     */
    public String getMasterInstanceId() {
        return masterInstanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param masterInstanceId <p>
     *            The Amazon EC2 instance identifier of the master node.
     *            </p>
     */
    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param masterInstanceId <p>
     *            The Amazon EC2 instance identifier of the master node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 core and task node instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon EC2 core and task node instance type.
     *         </p>
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 core and task node instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param slaveInstanceType <p>
     *            The Amazon EC2 core and task node instance type.
     *            </p>
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 core and task node instance type.
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
     *            The Amazon EC2 core and task node instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and core and task node. If the
     * value is greater than 1, one instance is the master node and all others
     * are core and task nodes.
     * </p>
     *
     * @return <p>
     *         The number of Amazon EC2 instances in the cluster. If the value
     *         is 1, the same instance serves as both the master and core and
     *         task node. If the value is greater than 1, one instance is the
     *         master node and all others are core and task nodes.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and core and task node. If the
     * value is greater than 1, one instance is the master node and all others
     * are core and task nodes.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of Amazon EC2 instances in the cluster. If the
     *            value is 1, the same instance serves as both the master and
     *            core and task node. If the value is greater than 1, one
     *            instance is the master node and all others are core and task
     *            nodes.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and core and task node. If the
     * value is greater than 1, one instance is the master node and all others
     * are core and task nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of Amazon EC2 instances in the cluster. If the
     *            value is 1, the same instance serves as both the master and
     *            core and task node. If the value is greater than 1, one
     *            instance is the master node and all others are core and task
     *            nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * Details about the instance groups in a cluster.
     * </p>
     *
     * @return <p>
     *         Details about the instance groups in a cluster.
     *         </p>
     */
    public java.util.List<InstanceGroupDetail> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * Details about the instance groups in a cluster.
     * </p>
     *
     * @param instanceGroups <p>
     *            Details about the instance groups in a cluster.
     *            </p>
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupDetail> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new java.util.ArrayList<InstanceGroupDetail>(instanceGroups);
    }

    /**
     * <p>
     * Details about the instance groups in a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Details about the instance groups in a cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withInstanceGroups(InstanceGroupDetail... instanceGroups) {
        if (getInstanceGroups() == null) {
            this.instanceGroups = new java.util.ArrayList<InstanceGroupDetail>(
                    instanceGroups.length);
        }
        for (InstanceGroupDetail value : instanceGroups) {
            this.instanceGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details about the instance groups in a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceGroups <p>
     *            Details about the instance groups in a cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withInstanceGroups(
            java.util.Collection<InstanceGroupDetail> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour that an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     *
     * @return <p>
     *         An approximation of the cost of the cluster, represented in
     *         m1.small/hours. This value is incremented one time for every hour
     *         that an m1.small runs. Larger instances are weighted more, so an
     *         Amazon EC2 instance that is roughly four times more expensive
     *         would result in the normalized instance hours being incremented
     *         by four. This result is only an approximation and does not
     *         reflect the actual billing rate.
     *         </p>
     */
    public Integer getNormalizedInstanceHours() {
        return normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour that an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     *
     * @param normalizedInstanceHours <p>
     *            An approximation of the cost of the cluster, represented in
     *            m1.small/hours. This value is incremented one time for every
     *            hour that an m1.small runs. Larger instances are weighted
     *            more, so an Amazon EC2 instance that is roughly four times
     *            more expensive would result in the normalized instance hours
     *            being incremented by four. This result is only an
     *            approximation and does not reflect the actual billing rate.
     *            </p>
     */
    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the cluster, represented in
     * m1.small/hours. This value is incremented one time for every hour that an
     * m1.small runs. Larger instances are weighted more, so an Amazon EC2
     * instance that is roughly four times more expensive would result in the
     * normalized instance hours being incremented by four. This result is only
     * an approximation and does not reflect the actual billing rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param normalizedInstanceHours <p>
     *            An approximation of the cost of the cluster, represented in
     *            m1.small/hours. This value is incremented one time for every
     *            hour that an m1.small runs. Larger instances are weighted
     *            more, so an Amazon EC2 instance that is roughly four times
     *            more expensive would result in the normalized instance hours
     *            being incremented by four. This result is only an
     *            approximation and does not reflect the actual billing rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
        return this;
    }

    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of an Amazon EC2 key pair that can be used to ssh to the
     *         master node.
     *         </p>
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }

    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ec2KeyName <p>
     *            The name of an Amazon EC2 key pair that can be used to ssh to
     *            the master node.
     *            </p>
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node.
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
     *            The name of an Amazon EC2 key pair that can be used to ssh to
     *            the master node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }

    /**
     * <p>
     * For clusters launched within Amazon Virtual Private Cloud, this is the
     * identifier of the subnet where the cluster was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         For clusters launched within Amazon Virtual Private Cloud, this
     *         is the identifier of the subnet where the cluster was launched.
     *         </p>
     */
    public String getEc2SubnetId() {
        return ec2SubnetId;
    }

    /**
     * <p>
     * For clusters launched within Amazon Virtual Private Cloud, this is the
     * identifier of the subnet where the cluster was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ec2SubnetId <p>
     *            For clusters launched within Amazon Virtual Private Cloud,
     *            this is the identifier of the subnet where the cluster was
     *            launched.
     *            </p>
     */
    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    /**
     * <p>
     * For clusters launched within Amazon Virtual Private Cloud, this is the
     * identifier of the subnet where the cluster was launched.
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
     *            For clusters launched within Amazon Virtual Private Cloud,
     *            this is the identifier of the subnet where the cluster was
     *            launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 Availability Zone for the cluster.
     *         </p>
     */
    public PlacementType getPlacement() {
        return placement;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster.
     * </p>
     *
     * @param placement <p>
     *            The Amazon EC2 Availability Zone for the cluster.
     *            </p>
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placement <p>
     *            The Amazon EC2 Availability Zone for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withPlacement(PlacementType placement) {
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
    public JobFlowInstancesDetail withKeepJobFlowAliveWhenNoSteps(
            Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job-flow error.
     * </p>
     *
     * @return <p>
     *         Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in
     *         the event of a job-flow error.
     *         </p>
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job-flow error.
     * </p>
     *
     * @return <p>
     *         Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in
     *         the event of a job-flow error.
     *         </p>
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job-flow error.
     * </p>
     *
     * @param terminationProtected <p>
     *            Specifies whether the Amazon EC2 instances in the cluster are
     *            protected from termination by API calls, user intervention, or
     *            in the event of a job-flow error.
     *            </p>
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job-flow error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationProtected <p>
     *            Specifies whether the Amazon EC2 instances in the cluster are
     *            protected from termination by API calls, user intervention, or
     *            in the event of a job-flow error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    /**
     * <p>
     * The Hadoop version for the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Hadoop version for the cluster.
     *         </p>
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }

    /**
     * <p>
     * The Hadoop version for the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param hadoopVersion <p>
     *            The Hadoop version for the cluster.
     *            </p>
     */
    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }

    /**
     * <p>
     * The Hadoop version for the cluster.
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
     *            The Hadoop version for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowInstancesDetail withHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
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
        if (getMasterPublicDnsName() != null)
            sb.append("MasterPublicDnsName: " + getMasterPublicDnsName() + ",");
        if (getMasterInstanceId() != null)
            sb.append("MasterInstanceId: " + getMasterInstanceId() + ",");
        if (getSlaveInstanceType() != null)
            sb.append("SlaveInstanceType: " + getSlaveInstanceType() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getNormalizedInstanceHours() != null)
            sb.append("NormalizedInstanceHours: " + getNormalizedInstanceHours() + ",");
        if (getEc2KeyName() != null)
            sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getEc2SubnetId() != null)
            sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getKeepJobFlowAliveWhenNoSteps() != null)
            sb.append("KeepJobFlowAliveWhenNoSteps: " + getKeepJobFlowAliveWhenNoSteps() + ",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: " + getTerminationProtected() + ",");
        if (getHadoopVersion() != null)
            sb.append("HadoopVersion: " + getHadoopVersion());
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
                + ((getMasterPublicDnsName() == null) ? 0 : getMasterPublicDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getMasterInstanceId() == null) ? 0 : getMasterInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getSlaveInstanceType() == null) ? 0 : getSlaveInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getNormalizedInstanceHours() == null) ? 0 : getNormalizedInstanceHours()
                        .hashCode());
        hashCode = prime * hashCode + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode());
        hashCode = prime * hashCode
                + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeepJobFlowAliveWhenNoSteps() == null) ? 0
                        : getKeepJobFlowAliveWhenNoSteps().hashCode());
        hashCode = prime * hashCode
                + ((getTerminationProtected() == null) ? 0 : getTerminationProtected().hashCode());
        hashCode = prime * hashCode
                + ((getHadoopVersion() == null) ? 0 : getHadoopVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobFlowInstancesDetail == false)
            return false;
        JobFlowInstancesDetail other = (JobFlowInstancesDetail) obj;

        if (other.getMasterInstanceType() == null ^ this.getMasterInstanceType() == null)
            return false;
        if (other.getMasterInstanceType() != null
                && other.getMasterInstanceType().equals(this.getMasterInstanceType()) == false)
            return false;
        if (other.getMasterPublicDnsName() == null ^ this.getMasterPublicDnsName() == null)
            return false;
        if (other.getMasterPublicDnsName() != null
                && other.getMasterPublicDnsName().equals(this.getMasterPublicDnsName()) == false)
            return false;
        if (other.getMasterInstanceId() == null ^ this.getMasterInstanceId() == null)
            return false;
        if (other.getMasterInstanceId() != null
                && other.getMasterInstanceId().equals(this.getMasterInstanceId()) == false)
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
        if (other.getNormalizedInstanceHours() == null ^ this.getNormalizedInstanceHours() == null)
            return false;
        if (other.getNormalizedInstanceHours() != null
                && other.getNormalizedInstanceHours().equals(this.getNormalizedInstanceHours()) == false)
            return false;
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
        return true;
    }
}
