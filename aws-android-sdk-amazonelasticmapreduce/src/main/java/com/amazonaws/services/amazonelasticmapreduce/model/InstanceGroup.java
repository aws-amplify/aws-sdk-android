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
 * This entity represents an instance group, which is a group of instances that
 * have common purpose. For example, CORE instance group is used for HDFS.
 * </p>
 */
public class InstanceGroup implements Serializable {
    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the instance group.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     */
    private String market;

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceGroupType;

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by
     * <code>InstanceType</code>. Expressed in USD. If neither
     * <code>BidPrice</code> nor
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
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
     * The target number of instances for the instance group.
     * </p>
     */
    private Integer requestedInstanceCount;

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     */
    private Integer runningInstanceCount;

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     */
    private InstanceGroupStatus status;

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
     * The version number of the requested configuration specification for this
     * instance group.
     * </p>
     */
    private Long configurationsVersion;

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance
     * group last time.
     * </p>
     */
    private java.util.List<Configuration> lastSuccessfullyAppliedConfigurations;

    /**
     * <p>
     * The version number of a configuration specification that was successfully
     * applied for an instance group last time.
     * </p>
     */
    private Long lastSuccessfullyAppliedConfigurationsVersion;

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     */
    private java.util.List<EbsBlockDevice> ebsBlockDevices;

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     */
    private ShrinkPolicy shrinkPolicy;

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * </p>
     */
    private AutoScalingPolicyDescription autoScalingPolicy;

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     *
     * @return <p>
     *         The identifier of the instance group.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     *
     * @param id <p>
     *            The identifier of the instance group.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     *
     * @return <p>
     *         The name of the instance group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     *
     * @param name <p>
     *            The name of the instance group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @return <p>
     *         The marketplace to provision instances for this group. Valid
     *         values are ON_DEMAND or SPOT.
     *         </p>
     * @see MarketType
     */
    public String getMarket() {
        return market;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The marketplace to provision instances for this group. Valid
     *            values are ON_DEMAND or SPOT.
     *            </p>
     * @see MarketType
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The marketplace to provision instances for this group. Valid
     *            values are ON_DEMAND or SPOT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public InstanceGroup withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The marketplace to provision instances for this group. Valid
     *            values are ON_DEMAND or SPOT.
     *            </p>
     * @see MarketType
     */
    public void setMarket(MarketType market) {
        this.market = market.toString();
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            The marketplace to provision instances for this group. Valid
     *            values are ON_DEMAND or SPOT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public InstanceGroup withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return <p>
     *         The type of the instance group. Valid values are MASTER, CORE or
     *         TASK.
     *         </p>
     * @see InstanceGroupType
     */
    public String getInstanceGroupType() {
        return instanceGroupType;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType <p>
     *            The type of the instance group. Valid values are MASTER, CORE
     *            or TASK.
     *            </p>
     * @see InstanceGroupType
     */
    public void setInstanceGroupType(String instanceGroupType) {
        this.instanceGroupType = instanceGroupType;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType <p>
     *            The type of the instance group. Valid values are MASTER, CORE
     *            or TASK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceGroupType
     */
    public InstanceGroup withInstanceGroupType(String instanceGroupType) {
        this.instanceGroupType = instanceGroupType;
        return this;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType <p>
     *            The type of the instance group. Valid values are MASTER, CORE
     *            or TASK.
     *            </p>
     * @see InstanceGroupType
     */
    public void setInstanceGroupType(InstanceGroupType instanceGroupType) {
        this.instanceGroupType = instanceGroupType.toString();
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceGroupType <p>
     *            The type of the instance group. Valid values are MASTER, CORE
     *            or TASK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceGroupType
     */
    public InstanceGroup withInstanceGroupType(InstanceGroupType instanceGroupType) {
        this.instanceGroupType = instanceGroupType.toString();
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
    public InstanceGroup withBidPrice(String bidPrice) {
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
    public InstanceGroup withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     *
     * @return <p>
     *         The target number of instances for the instance group.
     *         </p>
     */
    public Integer getRequestedInstanceCount() {
        return requestedInstanceCount;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     *
     * @param requestedInstanceCount <p>
     *            The target number of instances for the instance group.
     *            </p>
     */
    public void setRequestedInstanceCount(Integer requestedInstanceCount) {
        this.requestedInstanceCount = requestedInstanceCount;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedInstanceCount <p>
     *            The target number of instances for the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withRequestedInstanceCount(Integer requestedInstanceCount) {
        this.requestedInstanceCount = requestedInstanceCount;
        return this;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     *
     * @return <p>
     *         The number of instances currently running in this instance group.
     *         </p>
     */
    public Integer getRunningInstanceCount() {
        return runningInstanceCount;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     *
     * @param runningInstanceCount <p>
     *            The number of instances currently running in this instance
     *            group.
     *            </p>
     */
    public void setRunningInstanceCount(Integer runningInstanceCount) {
        this.runningInstanceCount = runningInstanceCount;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningInstanceCount <p>
     *            The number of instances currently running in this instance
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withRunningInstanceCount(Integer runningInstanceCount) {
        this.runningInstanceCount = runningInstanceCount;
        return this;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     *
     * @return <p>
     *         The current status of the instance group.
     *         </p>
     */
    public InstanceGroupStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     *
     * @param status <p>
     *            The current status of the instance group.
     *            </p>
     */
    public void setStatus(InstanceGroupStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withStatus(InstanceGroupStatus status) {
        this.status = status;
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
    public InstanceGroup withConfigurations(Configuration... configurations) {
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
    public InstanceGroup withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The version number of the requested configuration specification for this
     * instance group.
     * </p>
     *
     * @return <p>
     *         The version number of the requested configuration specification
     *         for this instance group.
     *         </p>
     */
    public Long getConfigurationsVersion() {
        return configurationsVersion;
    }

    /**
     * <p>
     * The version number of the requested configuration specification for this
     * instance group.
     * </p>
     *
     * @param configurationsVersion <p>
     *            The version number of the requested configuration
     *            specification for this instance group.
     *            </p>
     */
    public void setConfigurationsVersion(Long configurationsVersion) {
        this.configurationsVersion = configurationsVersion;
    }

    /**
     * <p>
     * The version number of the requested configuration specification for this
     * instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationsVersion <p>
     *            The version number of the requested configuration
     *            specification for this instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withConfigurationsVersion(Long configurationsVersion) {
        this.configurationsVersion = configurationsVersion;
        return this;
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance
     * group last time.
     * </p>
     *
     * @return <p>
     *         A list of configurations that were successfully applied for an
     *         instance group last time.
     *         </p>
     */
    public java.util.List<Configuration> getLastSuccessfullyAppliedConfigurations() {
        return lastSuccessfullyAppliedConfigurations;
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance
     * group last time.
     * </p>
     *
     * @param lastSuccessfullyAppliedConfigurations <p>
     *            A list of configurations that were successfully applied for an
     *            instance group last time.
     *            </p>
     */
    public void setLastSuccessfullyAppliedConfigurations(
            java.util.Collection<Configuration> lastSuccessfullyAppliedConfigurations) {
        if (lastSuccessfullyAppliedConfigurations == null) {
            this.lastSuccessfullyAppliedConfigurations = null;
            return;
        }

        this.lastSuccessfullyAppliedConfigurations = new java.util.ArrayList<Configuration>(
                lastSuccessfullyAppliedConfigurations);
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance
     * group last time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSuccessfullyAppliedConfigurations <p>
     *            A list of configurations that were successfully applied for an
     *            instance group last time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withLastSuccessfullyAppliedConfigurations(
            Configuration... lastSuccessfullyAppliedConfigurations) {
        if (getLastSuccessfullyAppliedConfigurations() == null) {
            this.lastSuccessfullyAppliedConfigurations = new java.util.ArrayList<Configuration>(
                    lastSuccessfullyAppliedConfigurations.length);
        }
        for (Configuration value : lastSuccessfullyAppliedConfigurations) {
            this.lastSuccessfullyAppliedConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of configurations that were successfully applied for an instance
     * group last time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSuccessfullyAppliedConfigurations <p>
     *            A list of configurations that were successfully applied for an
     *            instance group last time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withLastSuccessfullyAppliedConfigurations(
            java.util.Collection<Configuration> lastSuccessfullyAppliedConfigurations) {
        setLastSuccessfullyAppliedConfigurations(lastSuccessfullyAppliedConfigurations);
        return this;
    }

    /**
     * <p>
     * The version number of a configuration specification that was successfully
     * applied for an instance group last time.
     * </p>
     *
     * @return <p>
     *         The version number of a configuration specification that was
     *         successfully applied for an instance group last time.
     *         </p>
     */
    public Long getLastSuccessfullyAppliedConfigurationsVersion() {
        return lastSuccessfullyAppliedConfigurationsVersion;
    }

    /**
     * <p>
     * The version number of a configuration specification that was successfully
     * applied for an instance group last time.
     * </p>
     *
     * @param lastSuccessfullyAppliedConfigurationsVersion <p>
     *            The version number of a configuration specification that was
     *            successfully applied for an instance group last time.
     *            </p>
     */
    public void setLastSuccessfullyAppliedConfigurationsVersion(
            Long lastSuccessfullyAppliedConfigurationsVersion) {
        this.lastSuccessfullyAppliedConfigurationsVersion = lastSuccessfullyAppliedConfigurationsVersion;
    }

    /**
     * <p>
     * The version number of a configuration specification that was successfully
     * applied for an instance group last time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSuccessfullyAppliedConfigurationsVersion <p>
     *            The version number of a configuration specification that was
     *            successfully applied for an instance group last time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withLastSuccessfullyAppliedConfigurationsVersion(
            Long lastSuccessfullyAppliedConfigurationsVersion) {
        this.lastSuccessfullyAppliedConfigurationsVersion = lastSuccessfullyAppliedConfigurationsVersion;
        return this;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     *
     * @return <p>
     *         The EBS block devices that are mapped to this instance group.
     *         </p>
     */
    public java.util.List<EbsBlockDevice> getEbsBlockDevices() {
        return ebsBlockDevices;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     *
     * @param ebsBlockDevices <p>
     *            The EBS block devices that are mapped to this instance group.
     *            </p>
     */
    public void setEbsBlockDevices(java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        if (ebsBlockDevices == null) {
            this.ebsBlockDevices = null;
            return;
        }

        this.ebsBlockDevices = new java.util.ArrayList<EbsBlockDevice>(ebsBlockDevices);
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsBlockDevices <p>
     *            The EBS block devices that are mapped to this instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withEbsBlockDevices(EbsBlockDevice... ebsBlockDevices) {
        if (getEbsBlockDevices() == null) {
            this.ebsBlockDevices = new java.util.ArrayList<EbsBlockDevice>(ebsBlockDevices.length);
        }
        for (EbsBlockDevice value : ebsBlockDevices) {
            this.ebsBlockDevices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsBlockDevices <p>
     *            The EBS block devices that are mapped to this instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withEbsBlockDevices(java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        setEbsBlockDevices(ebsBlockDevices);
        return this;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     *
     * @return <p>
     *         If the instance group is EBS-optimized. An Amazon EBS-optimized
     *         instance uses an optimized configuration stack and provides
     *         additional, dedicated capacity for Amazon EBS I/O.
     *         </p>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     *
     * @return <p>
     *         If the instance group is EBS-optimized. An Amazon EBS-optimized
     *         instance uses an optimized configuration stack and provides
     *         additional, dedicated capacity for Amazon EBS I/O.
     *         </p>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     *
     * @param ebsOptimized <p>
     *            If the instance group is EBS-optimized. An Amazon
     *            EBS-optimized instance uses an optimized configuration stack
     *            and provides additional, dedicated capacity for Amazon EBS
     *            I/O.
     *            </p>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS-optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            If the instance group is EBS-optimized. An Amazon
     *            EBS-optimized instance uses an optimized configuration stack
     *            and provides additional, dedicated capacity for Amazon EBS
     *            I/O.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     *
     * @return <p>
     *         Policy for customizing shrink operations.
     *         </p>
     */
    public ShrinkPolicy getShrinkPolicy() {
        return shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     *
     * @param shrinkPolicy <p>
     *            Policy for customizing shrink operations.
     *            </p>
     */
    public void setShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        this.shrinkPolicy = shrinkPolicy;
    }

    /**
     * <p>
     * Policy for customizing shrink operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shrinkPolicy <p>
     *            Policy for customizing shrink operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withShrinkPolicy(ShrinkPolicy shrinkPolicy) {
        this.shrinkPolicy = shrinkPolicy;
        return this;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * </p>
     *
     * @return <p>
     *         An automatic scaling policy for a core instance group or task
     *         instance group in an Amazon EMR cluster. The automatic scaling
     *         policy defines how an instance group dynamically adds and
     *         terminates EC2 instances in response to the value of a CloudWatch
     *         metric. See PutAutoScalingPolicy.
     *         </p>
     */
    public AutoScalingPolicyDescription getAutoScalingPolicy() {
        return autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
     * </p>
     *
     * @param autoScalingPolicy <p>
     *            An automatic scaling policy for a core instance group or task
     *            instance group in an Amazon EMR cluster. The automatic scaling
     *            policy defines how an instance group dynamically adds and
     *            terminates EC2 instances in response to the value of a
     *            CloudWatch metric. See PutAutoScalingPolicy.
     *            </p>
     */
    public void setAutoScalingPolicy(AutoScalingPolicyDescription autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance
     * group in an Amazon EMR cluster. The automatic scaling policy defines how
     * an instance group dynamically adds and terminates EC2 instances in
     * response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
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
     *            CloudWatch metric. See PutAutoScalingPolicy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroup withAutoScalingPolicy(AutoScalingPolicyDescription autoScalingPolicy) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMarket() != null)
            sb.append("Market: " + getMarket() + ",");
        if (getInstanceGroupType() != null)
            sb.append("InstanceGroupType: " + getInstanceGroupType() + ",");
        if (getBidPrice() != null)
            sb.append("BidPrice: " + getBidPrice() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getRequestedInstanceCount() != null)
            sb.append("RequestedInstanceCount: " + getRequestedInstanceCount() + ",");
        if (getRunningInstanceCount() != null)
            sb.append("RunningInstanceCount: " + getRunningInstanceCount() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getConfigurationsVersion() != null)
            sb.append("ConfigurationsVersion: " + getConfigurationsVersion() + ",");
        if (getLastSuccessfullyAppliedConfigurations() != null)
            sb.append("LastSuccessfullyAppliedConfigurations: "
                    + getLastSuccessfullyAppliedConfigurations() + ",");
        if (getLastSuccessfullyAppliedConfigurationsVersion() != null)
            sb.append("LastSuccessfullyAppliedConfigurationsVersion: "
                    + getLastSuccessfullyAppliedConfigurationsVersion() + ",");
        if (getEbsBlockDevices() != null)
            sb.append("EbsBlockDevices: " + getEbsBlockDevices() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getShrinkPolicy() != null)
            sb.append("ShrinkPolicy: " + getShrinkPolicy() + ",");
        if (getAutoScalingPolicy() != null)
            sb.append("AutoScalingPolicy: " + getAutoScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceGroupType() == null) ? 0 : getInstanceGroupType().hashCode());
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestedInstanceCount() == null) ? 0 : getRequestedInstanceCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRunningInstanceCount() == null) ? 0 : getRunningInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationsVersion() == null) ? 0 : getConfigurationsVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastSuccessfullyAppliedConfigurations() == null) ? 0
                        : getLastSuccessfullyAppliedConfigurations().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastSuccessfullyAppliedConfigurationsVersion() == null) ? 0
                        : getLastSuccessfullyAppliedConfigurationsVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEbsBlockDevices() == null) ? 0 : getEbsBlockDevices().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode
                + ((getShrinkPolicy() == null) ? 0 : getShrinkPolicy().hashCode());
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

        if (obj instanceof InstanceGroup == false)
            return false;
        InstanceGroup other = (InstanceGroup) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceGroupType() == null ^ this.getInstanceGroupType() == null)
            return false;
        if (other.getInstanceGroupType() != null
                && other.getInstanceGroupType().equals(this.getInstanceGroupType()) == false)
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
        if (other.getRequestedInstanceCount() == null ^ this.getRequestedInstanceCount() == null)
            return false;
        if (other.getRequestedInstanceCount() != null
                && other.getRequestedInstanceCount().equals(this.getRequestedInstanceCount()) == false)
            return false;
        if (other.getRunningInstanceCount() == null ^ this.getRunningInstanceCount() == null)
            return false;
        if (other.getRunningInstanceCount() != null
                && other.getRunningInstanceCount().equals(this.getRunningInstanceCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getConfigurationsVersion() == null ^ this.getConfigurationsVersion() == null)
            return false;
        if (other.getConfigurationsVersion() != null
                && other.getConfigurationsVersion().equals(this.getConfigurationsVersion()) == false)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurations() == null
                ^ this.getLastSuccessfullyAppliedConfigurations() == null)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurations() != null
                && other.getLastSuccessfullyAppliedConfigurations().equals(
                        this.getLastSuccessfullyAppliedConfigurations()) == false)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurationsVersion() == null
                ^ this.getLastSuccessfullyAppliedConfigurationsVersion() == null)
            return false;
        if (other.getLastSuccessfullyAppliedConfigurationsVersion() != null
                && other.getLastSuccessfullyAppliedConfigurationsVersion().equals(
                        this.getLastSuccessfullyAppliedConfigurationsVersion()) == false)
            return false;
        if (other.getEbsBlockDevices() == null ^ this.getEbsBlockDevices() == null)
            return false;
        if (other.getEbsBlockDevices() != null
                && other.getEbsBlockDevices().equals(this.getEbsBlockDevices()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getShrinkPolicy() == null ^ this.getShrinkPolicy() == null)
            return false;
        if (other.getShrinkPolicy() != null
                && other.getShrinkPolicy().equals(this.getShrinkPolicy()) == false)
            return false;
        if (other.getAutoScalingPolicy() == null ^ this.getAutoScalingPolicy() == null)
            return false;
        if (other.getAutoScalingPolicy() != null
                && other.getAutoScalingPolicy().equals(this.getAutoScalingPolicy()) == false)
            return false;
        return true;
    }
}
