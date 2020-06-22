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
 * Configuration defining a new instance group.
 * </p>
 */
public class InstanceGroupConfig implements Serializable {
    /**
     * <p>
     * Friendly name given to the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String name;

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     */
    private String market;

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceRole;

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String bidPrice;

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceType;

    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the
     * instance group.
     * </p>
     */
    private EbsConfiguration ebsConfiguration;

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See
     * <a>PutAutoScalingPolicy</a>.
     * </p>
     */
    private AutoScalingPolicy autoScalingPolicy;

    /**
     * <p>
     * Friendly name given to the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Friendly name given to the instance group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Friendly name given to the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            Friendly name given to the instance group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Friendly name given to the instance group.
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
     * @param name <p>
     *            Friendly name given to the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @return <p>
     *         Market type of the EC2 instances used to create a cluster node.
     *         </p>
     * @see MarketType
     */
    public String getMarket() {
        return market;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Market type of the EC2 instances used to create a cluster
     *            node.
     *            </p>
     * @see MarketType
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Market type of the EC2 instances used to create a cluster
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public InstanceGroupConfig withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Market type of the EC2 instances used to create a cluster
     *            node.
     *            </p>
     * @see MarketType
     */
    public void setMarket(MarketType market) {
        this.market = market.toString();
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Market type of the EC2 instances used to create a cluster
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public InstanceGroupConfig withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return <p>
     *         The role of the instance group in the cluster.
     *         </p>
     * @see InstanceRoleType
     */
    public String getInstanceRole() {
        return instanceRole;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            The role of the instance group in the cluster.
     *            </p>
     * @see InstanceRoleType
     */
    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            The role of the instance group in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceRoleType
     */
    public InstanceGroupConfig withInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            The role of the instance group in the cluster.
     *            </p>
     * @see InstanceRoleType
     */
    public void setInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            The role of the instance group in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceRoleType
     */
    public InstanceGroupConfig withInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
        return this;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The bid price for each EC2 Spot instance type as defined by
     *         <code>InstanceType</code>. Expressed in USD. If neither
     *         <code>BidPrice</code> nor
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *         100%.
     *         </p>
     */
    public String getBidPrice() {
        return bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param bidPrice <p>
     *            The bid price for each EC2 Spot instance type as defined by
     *            <code>InstanceType</code>. Expressed in USD. If neither
     *            <code>BidPrice</code> nor
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *            100%.
     *            </p>
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
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
     * @param bidPrice <p>
     *            The bid price for each EC2 Spot instance type as defined by
     *            <code>InstanceType</code>. Expressed in USD. If neither
     *            <code>BidPrice</code> nor
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *            <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to
     *            100%.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The EC2 instance type for all instances in the instance group.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The EC2 instance type for all instances in the instance group.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
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
     * @param instanceType <p>
     *            The EC2 instance type for all instances in the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     *
     * @return <p>
     *         Target number of instances for the instance group.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     *
     * @param instanceCount <p>
     *            Target number of instances for the instance group.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            Target number of instances for the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     *
     * @return <note>
     *         <p>
     *         Amazon EMR releases 4.x or later.
     *         </p>
     *         </note>
     *         <p>
     *         The list of configurations supplied for an EMR cluster instance
     *         group. You can specify a separate configuration for each instance
     *         group (master, core, and task).
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     *
     * @param configurations <note>
     *            <p>
     *            Amazon EMR releases 4.x or later.
     *            </p>
     *            </note>
     *            <p>
     *            The list of configurations supplied for an EMR cluster
     *            instance group. You can specify a separate configuration for
     *            each instance group (master, core, and task).
     *            </p>
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<Configuration>(configurations);
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <note>
     *            <p>
     *            Amazon EMR releases 4.x or later.
     *            </p>
     *            </note>
     *            <p>
     *            The list of configurations supplied for an EMR cluster
     *            instance group. You can specify a separate configuration for
     *            each instance group (master, core, and task).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) {
            this.configurations = new java.util.ArrayList<Configuration>(configurations.length);
        }
        for (Configuration value : configurations) {
            this.configurations.add(value);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <note>
     *            <p>
     *            Amazon EMR releases 4.x or later.
     *            </p>
     *            </note>
     *            <p>
     *            The list of configurations supplied for an EMR cluster
     *            instance group. You can specify a separate configuration for
     *            each instance group (master, core, and task).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the
     * instance group.
     * </p>
     *
     * @return <p>
     *         EBS configurations that will be attached to each EC2 instance in
     *         the instance group.
     *         </p>
     */
    public EbsConfiguration getEbsConfiguration() {
        return ebsConfiguration;
    }

    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the
     * instance group.
     * </p>
     *
     * @param ebsConfiguration <p>
     *            EBS configurations that will be attached to each EC2 instance
     *            in the instance group.
     *            </p>
     */
    public void setEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
    }

    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the
     * instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsConfiguration <p>
     *            EBS configurations that will be attached to each EC2 instance
     *            in the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
        return this;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See
     * <a>PutAutoScalingPolicy</a>.
     * </p>
     *
     * @return <p>
     *         An automatic scaling policy for a core instance group or task
     *         instance group in an Amazon EMR cluster. The automatic scaling
     *         policy defines how an instance group dynamically adds and
     *         terminates EC2 instances in response to the value of a CloudWatch
     *         metric. See <a>PutAutoScalingPolicy</a>.
     *         </p>
     */
    public AutoScalingPolicy getAutoScalingPolicy() {
        return autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See
     * <a>PutAutoScalingPolicy</a>.
     * </p>
     *
     * @param autoScalingPolicy <p>
     *            An automatic scaling policy for a core instance group or task
     *            instance group in an Amazon EMR cluster. The automatic scaling
     *            policy defines how an instance group dynamically adds and
     *            terminates EC2 instances in response to the value of a
     *            CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     *            </p>
     */
    public void setAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See
     * <a>PutAutoScalingPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingPolicy <p>
     *            An automatic scaling policy for a core instance group or task
     *            instance group in an Amazon EMR cluster. The automatic scaling
     *            policy defines how an instance group dynamically adds and
     *            terminates EC2 instances in response to the value of a
     *            CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupConfig withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
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
        if (getMarket() != null)
            sb.append("Market: " + getMarket() + ",");
        if (getInstanceRole() != null)
            sb.append("InstanceRole: " + getInstanceRole() + ",");
        if (getBidPrice() != null)
            sb.append("BidPrice: " + getBidPrice() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getEbsConfiguration() != null)
            sb.append("EbsConfiguration: " + getEbsConfiguration() + ",");
        if (getAutoScalingPolicy() != null)
            sb.append("AutoScalingPolicy: " + getAutoScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getEbsConfiguration() == null) ? 0 : getEbsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingPolicy() == null) ? 0 : getAutoScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupConfig == false)
            return false;
        InstanceGroupConfig other = (InstanceGroupConfig) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null
                && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        if (other.getBidPrice() == null ^ this.getBidPrice() == null)
            return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getEbsConfiguration() == null ^ this.getEbsConfiguration() == null)
            return false;
        if (other.getEbsConfiguration() != null
                && other.getEbsConfiguration().equals(this.getEbsConfiguration()) == false)
            return false;
        if (other.getAutoScalingPolicy() == null ^ this.getAutoScalingPolicy() == null)
            return false;
        if (other.getAutoScalingPolicy() != null
                && other.getAutoScalingPolicy().equals(this.getAutoScalingPolicy()) == false)
            return false;
        return true;
    }
}
