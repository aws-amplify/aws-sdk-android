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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Describes the setup to be used for Kafka broker nodes in the cluster.
 * </p>
 */
public class BrokerNodeGroupInfo implements Serializable {
    /**
     * 
     <p>
     * The distribution of broker nodes across Availability Zones. This is an
     * optional parameter. If you don't specify it, Amazon MSK gives it the
     * value DEFAULT. You can also explicitly set this parameter to the value
     * DEFAULT. No other values are currently allowed.
     * </p>
     * <p>
     * Amazon MSK distributes the broker nodes evenly across the Availability
     * Zones that correspond to the subnets you provide when you create the
     * cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT
     */
    private String brokerAZDistribution;

    /**
     * 
     <p>
     * The list of subnets to connect to in the client virtual private cloud
     * (VPC). AWS creates elastic network interfaces inside these subnets.
     * Client applications use elastic network interfaces to produce and consume
     * data. Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     */
    private java.util.List<String> clientSubnets;

    /**
     * 
     <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following
     * instance types are allowed: kafka.m5.large, kafka.m5.xlarge,
     * kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and
     * kafka.m5.24xlarge.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 32<br/>
     */
    private String instanceType;

    /**
     * 
     <p>
     * The AWS security groups to associate with the elastic network interfaces
     * in order to specify who can connect to and communicate with the Amazon
     * MSK cluster. If you don't specify a security group, Amazon MSK uses the
     * default security group associated with the VPC.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * 
     <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p>
     */
    private StorageInfo storageInfo;

    /**
     * 
     <p>
     * The distribution of broker nodes across Availability Zones. This is an
     * optional parameter. If you don't specify it, Amazon MSK gives it the
     * value DEFAULT. You can also explicitly set this parameter to the value
     * DEFAULT. No other values are currently allowed.
     * </p>
     * <p>
     * Amazon MSK distributes the broker nodes evenly across the Availability
     * Zones that correspond to the subnets you provide when you create the
     * cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT
     *
     * @return <p>
     *         The distribution of broker nodes across Availability Zones. This
     *         is an optional parameter. If you don't specify it, Amazon MSK
     *         gives it the value DEFAULT. You can also explicitly set this
     *         parameter to the value DEFAULT. No other values are currently
     *         allowed.
     *         </p>
     *         <p>
     *         Amazon MSK distributes the broker nodes evenly across the
     *         Availability Zones that correspond to the subnets you provide
     *         when you create the cluster.
     *         </p> @see BrokerAZDistribution
     */
    public String getBrokerAZDistribution() {
        return brokerAZDistribution;
    }

    /**
     * 
     <p>
     * The distribution of broker nodes across Availability Zones. This is an
     * optional parameter. If you don't specify it, Amazon MSK gives it the
     * value DEFAULT. You can also explicitly set this parameter to the value
     * DEFAULT. No other values are currently allowed.
     * </p>
     * <p>
     * Amazon MSK distributes the broker nodes evenly across the Availability
     * Zones that correspond to the subnets you provide when you create the
     * cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT
     *
     * @param brokerAZDistribution <p>
     *            The distribution of broker nodes across Availability Zones.
     *            This is an optional parameter. If you don't specify it, Amazon
     *            MSK gives it the value DEFAULT. You can also explicitly set
     *            this parameter to the value DEFAULT. No other values are
     *            currently allowed.
     *            </p>
     *            <p>
     *            Amazon MSK distributes the broker nodes evenly across the
     *            Availability Zones that correspond to the subnets you provide
     *            when you create the cluster.
     *            </p> @see BrokerAZDistribution
     */
    public void setBrokerAZDistribution(String brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution;
    }

    /**
     * 
     <p>
     * The distribution of broker nodes across Availability Zones. This is an
     * optional parameter. If you don't specify it, Amazon MSK gives it the
     * value DEFAULT. You can also explicitly set this parameter to the value
     * DEFAULT. No other values are currently allowed.
     * </p>
     * <p>
     * Amazon MSK distributes the broker nodes evenly across the Availability
     * Zones that correspond to the subnets you provide when you create the
     * cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT
     *
     * @param brokerAZDistribution <p>
     *            The distribution of broker nodes across Availability Zones.
     *            This is an optional parameter. If you don't specify it, Amazon
     *            MSK gives it the value DEFAULT. You can also explicitly set
     *            this parameter to the value DEFAULT. No other values are
     *            currently allowed.
     *            </p>
     *            <p>
     *            Amazon MSK distributes the broker nodes evenly across the
     *            Availability Zones that correspond to the subnets you provide
     *            when you create the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BrokerAZDistribution
     */
    public BrokerNodeGroupInfo withBrokerAZDistribution(String brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution;
        return this;
    }

    /**
     * 
     <p>
     * The distribution of broker nodes across Availability Zones. This is an
     * optional parameter. If you don't specify it, Amazon MSK gives it the
     * value DEFAULT. You can also explicitly set this parameter to the value
     * DEFAULT. No other values are currently allowed.
     * </p>
     * <p>
     * Amazon MSK distributes the broker nodes evenly across the Availability
     * Zones that correspond to the subnets you provide when you create the
     * cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT
     *
     * @param brokerAZDistribution <p>
     *            The distribution of broker nodes across Availability Zones.
     *            This is an optional parameter. If you don't specify it, Amazon
     *            MSK gives it the value DEFAULT. You can also explicitly set
     *            this parameter to the value DEFAULT. No other values are
     *            currently allowed.
     *            </p>
     *            <p>
     *            Amazon MSK distributes the broker nodes evenly across the
     *            Availability Zones that correspond to the subnets you provide
     *            when you create the cluster.
     *            </p> @see BrokerAZDistribution
     */
    public void setBrokerAZDistribution(BrokerAZDistribution brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution.toString();
    }

    /**
     * 
     <p>
     * The distribution of broker nodes across Availability Zones. This is an
     * optional parameter. If you don't specify it, Amazon MSK gives it the
     * value DEFAULT. You can also explicitly set this parameter to the value
     * DEFAULT. No other values are currently allowed.
     * </p>
     * <p>
     * Amazon MSK distributes the broker nodes evenly across the Availability
     * Zones that correspond to the subnets you provide when you create the
     * cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT
     *
     * @param brokerAZDistribution <p>
     *            The distribution of broker nodes across Availability Zones.
     *            This is an optional parameter. If you don't specify it, Amazon
     *            MSK gives it the value DEFAULT. You can also explicitly set
     *            this parameter to the value DEFAULT. No other values are
     *            currently allowed.
     *            </p>
     *            <p>
     *            Amazon MSK distributes the broker nodes evenly across the
     *            Availability Zones that correspond to the subnets you provide
     *            when you create the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BrokerAZDistribution
     */
    public BrokerNodeGroupInfo withBrokerAZDistribution(BrokerAZDistribution brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution.toString();
        return this;
    }

    /**
     * 
     <p>
     * The list of subnets to connect to in the client virtual private cloud
     * (VPC). AWS creates elastic network interfaces inside these subnets.
     * Client applications use elastic network interfaces to produce and consume
     * data. Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     * 
     * @return <p>
     *         The list of subnets to connect to in the client virtual private
     *         cloud (VPC). AWS creates elastic network interfaces inside these
     *         subnets. Client applications use elastic network interfaces to
     *         produce and consume data. Client subnets can't be in Availability
     *         Zone us-east-1e.
     *         </p>
     */
    public java.util.List<String> getClientSubnets() {
        return clientSubnets;
    }

    /**
     * 
     <p>
     * The list of subnets to connect to in the client virtual private cloud
     * (VPC). AWS creates elastic network interfaces inside these subnets.
     * Client applications use elastic network interfaces to produce and consume
     * data. Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     * 
     * @param clientSubnets <p>
     *            The list of subnets to connect to in the client virtual
     *            private cloud (VPC). AWS creates elastic network interfaces
     *            inside these subnets. Client applications use elastic network
     *            interfaces to produce and consume data. Client subnets can't
     *            be in Availability Zone us-east-1e.
     *            </p>
     */
    public void setClientSubnets(java.util.Collection<String> clientSubnets) {
        if (clientSubnets == null) {
            this.clientSubnets = null;
            return;
        }

        this.clientSubnets = new java.util.ArrayList<String>(clientSubnets);
    }

    /**
     * 
     <p>
     * The list of subnets to connect to in the client virtual private cloud
     * (VPC). AWS creates elastic network interfaces inside these subnets.
     * Client applications use elastic network interfaces to produce and consume
     * data. Client subnets can't be in Availability Zone us-east-1e.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientSubnets <p>
     *            The list of subnets to connect to in the client virtual
     *            private cloud (VPC). AWS creates elastic network interfaces
     *            inside these subnets. Client applications use elastic network
     *            interfaces to produce and consume data. Client subnets can't
     *            be in Availability Zone us-east-1e.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeGroupInfo withClientSubnets(String... clientSubnets) {
        if (getClientSubnets() == null) {
            this.clientSubnets = new java.util.ArrayList<String>(clientSubnets.length);
        }
        for (String value : clientSubnets) {
            this.clientSubnets.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * The list of subnets to connect to in the client virtual private cloud
     * (VPC). AWS creates elastic network interfaces inside these subnets.
     * Client applications use elastic network interfaces to produce and consume
     * data. Client subnets can't be in Availability Zone us-east-1e.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientSubnets <p>
     *            The list of subnets to connect to in the client virtual
     *            private cloud (VPC). AWS creates elastic network interfaces
     *            inside these subnets. Client applications use elastic network
     *            interfaces to produce and consume data. Client subnets can't
     *            be in Availability Zone us-east-1e.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeGroupInfo withClientSubnets(java.util.Collection<String> clientSubnets) {
        setClientSubnets(clientSubnets);
        return this;
    }

    /**
     * 
     <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following
     * instance types are allowed: kafka.m5.large, kafka.m5.xlarge,
     * kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and
     * kafka.m5.24xlarge.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 32<br/>
     *
     * @return <p>
     *         The type of Amazon EC2 instances to use for Kafka brokers. The
     *         following instance types are allowed: kafka.m5.large,
     *         kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge,
     *         kafka.m5.12xlarge, and kafka.m5.24xlarge.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * 
     <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following
     * instance types are allowed: kafka.m5.large, kafka.m5.xlarge,
     * kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and
     * kafka.m5.24xlarge.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 32<br/>
     *
     * @param instanceType <p>
     *            The type of Amazon EC2 instances to use for Kafka brokers. The
     *            following instance types are allowed: kafka.m5.large,
     *            kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge,
     *            kafka.m5.12xlarge, and kafka.m5.24xlarge.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * 
     <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following
     * instance types are allowed: kafka.m5.large, kafka.m5.xlarge,
     * kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and
     * kafka.m5.24xlarge.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 32<br/>
     *
     * @param instanceType <p>
     *            The type of Amazon EC2 instances to use for Kafka brokers. The
     *            following instance types are allowed: kafka.m5.large,
     *            kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge,
     *            kafka.m5.12xlarge, and kafka.m5.24xlarge.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeGroupInfo withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 
     <p>
     * The AWS security groups to associate with the elastic network interfaces
     * in order to specify who can connect to and communicate with the Amazon
     * MSK cluster. If you don't specify a security group, Amazon MSK uses the
     * default security group associated with the VPC.
     * </p>
     * 
     * @return <p>
     *         The AWS security groups to associate with the elastic network
     *         interfaces in order to specify who can connect to and communicate
     *         with the Amazon MSK cluster. If you don't specify a security
     *         group, Amazon MSK uses the default security group associated with
     *         the VPC.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * 
     <p>
     * The AWS security groups to associate with the elastic network interfaces
     * in order to specify who can connect to and communicate with the Amazon
     * MSK cluster. If you don't specify a security group, Amazon MSK uses the
     * default security group associated with the VPC.
     * </p>
     * 
     * @param securityGroups <p>
     *            The AWS security groups to associate with the elastic network
     *            interfaces in order to specify who can connect to and
     *            communicate with the Amazon MSK cluster. If you don't specify
     *            a security group, Amazon MSK uses the default security group
     *            associated with the VPC.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * 
     <p>
     * The AWS security groups to associate with the elastic network interfaces
     * in order to specify who can connect to and communicate with the Amazon
     * MSK cluster. If you don't specify a security group, Amazon MSK uses the
     * default security group associated with the VPC.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The AWS security groups to associate with the elastic network
     *            interfaces in order to specify who can connect to and
     *            communicate with the Amazon MSK cluster. If you don't specify
     *            a security group, Amazon MSK uses the default security group
     *            associated with the VPC.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeGroupInfo withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * The AWS security groups to associate with the elastic network interfaces
     * in order to specify who can connect to and communicate with the Amazon
     * MSK cluster. If you don't specify a security group, Amazon MSK uses the
     * default security group associated with the VPC.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The AWS security groups to associate with the elastic network
     *            interfaces in order to specify who can connect to and
     *            communicate with the Amazon MSK cluster. If you don't specify
     *            a security group, Amazon MSK uses the default security group
     *            associated with the VPC.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeGroupInfo withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * 
     <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p>
     * 
     * @return <p>
     *         Contains information about storage volumes attached to MSK broker
     *         nodes.
     *         </p>
     */
    public StorageInfo getStorageInfo() {
        return storageInfo;
    }

    /**
     * 
     <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p>
     * 
     * @param storageInfo <p>
     *            Contains information about storage volumes attached to MSK
     *            broker nodes.
     *            </p>
     */
    public void setStorageInfo(StorageInfo storageInfo) {
        this.storageInfo = storageInfo;
    }

    /**
     * 
     <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageInfo <p>
     *            Contains information about storage volumes attached to MSK
     *            broker nodes.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerNodeGroupInfo withStorageInfo(StorageInfo storageInfo) {
        this.storageInfo = storageInfo;
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
        if (getBrokerAZDistribution() != null)
            sb.append("BrokerAZDistribution: " + getBrokerAZDistribution() + ",");
        if (getClientSubnets() != null)
            sb.append("ClientSubnets: " + getClientSubnets() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getStorageInfo() != null)
            sb.append("StorageInfo: " + getStorageInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBrokerAZDistribution() == null) ? 0 : getBrokerAZDistribution().hashCode());
        hashCode = prime * hashCode
                + ((getClientSubnets() == null) ? 0 : getClientSubnets().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getStorageInfo() == null) ? 0 : getStorageInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerNodeGroupInfo == false)
            return false;
        BrokerNodeGroupInfo other = (BrokerNodeGroupInfo) obj;

        if (other.getBrokerAZDistribution() == null ^ this.getBrokerAZDistribution() == null)
            return false;
        if (other.getBrokerAZDistribution() != null
                && other.getBrokerAZDistribution().equals(this.getBrokerAZDistribution()) == false)
            return false;
        if (other.getClientSubnets() == null ^ this.getClientSubnets() == null)
            return false;
        if (other.getClientSubnets() != null
                && other.getClientSubnets().equals(this.getClientSubnets()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getStorageInfo() == null ^ this.getStorageInfo() == null)
            return false;
        if (other.getStorageInfo() != null
                && other.getStorageInfo().equals(this.getStorageInfo()) == false)
            return false;
        return true;
    }
}
