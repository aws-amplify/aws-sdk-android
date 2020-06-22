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
 * Detailed information about an instance group.
 * </p>
 */
public class InstanceGroupDetail implements Serializable {
    /**
     * <p>
     * Unique identifier for the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceGroupId;

    /**
     * <p>
     * Friendly name for the instance group.
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
     * Instance group role in the cluster
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
     * EC2 instance type.
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
     * Target number of instances to run in the instance group.
     * </p>
     */
    private Integer instanceRequestCount;

    /**
     * <p>
     * Actual count of running instances.
     * </p>
     */
    private Integer instanceRunningCount;

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING,
     * TERMINATED, and FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING,
     * RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED,
     * SHUTTING_DOWN, ENDED
     */
    private String state;

    /**
     * <p>
     * Details regarding the state of the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String lastStateChangeReason;

    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     */
    private java.util.Date startDateTime;

    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     */
    private java.util.Date readyDateTime;

    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * Unique identifier for the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Unique identifier for the instance group.
     *         </p>
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }

    /**
     * <p>
     * Unique identifier for the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceGroupId <p>
     *            Unique identifier for the instance group.
     *            </p>
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * Unique identifier for the instance group.
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
     * @param instanceGroupId <p>
     *            Unique identifier for the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }

    /**
     * <p>
     * Friendly name for the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Friendly name for the instance group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Friendly name for the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            Friendly name for the instance group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Friendly name for the instance group.
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
     *            Friendly name for the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withName(String name) {
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
    public InstanceGroupDetail withMarket(String market) {
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
    public InstanceGroupDetail withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return <p>
     *         Instance group role in the cluster
     *         </p>
     * @see InstanceRoleType
     */
    public String getInstanceRole() {
        return instanceRole;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            Instance group role in the cluster
     *            </p>
     * @see InstanceRoleType
     */
    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            Instance group role in the cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceRoleType
     */
    public InstanceGroupDetail withInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            Instance group role in the cluster
     *            </p>
     * @see InstanceRoleType
     */
    public void setInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
    }

    /**
     * <p>
     * Instance group role in the cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceRole <p>
     *            Instance group role in the cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceRoleType
     */
    public InstanceGroupDetail withInstanceRole(InstanceRoleType instanceRole) {
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
    public InstanceGroupDetail withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * <p>
     * EC2 instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         EC2 instance type.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * EC2 instance type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            EC2 instance type.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * EC2 instance type.
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
     *            EC2 instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * Target number of instances to run in the instance group.
     * </p>
     *
     * @return <p>
     *         Target number of instances to run in the instance group.
     *         </p>
     */
    public Integer getInstanceRequestCount() {
        return instanceRequestCount;
    }

    /**
     * <p>
     * Target number of instances to run in the instance group.
     * </p>
     *
     * @param instanceRequestCount <p>
     *            Target number of instances to run in the instance group.
     *            </p>
     */
    public void setInstanceRequestCount(Integer instanceRequestCount) {
        this.instanceRequestCount = instanceRequestCount;
    }

    /**
     * <p>
     * Target number of instances to run in the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceRequestCount <p>
     *            Target number of instances to run in the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withInstanceRequestCount(Integer instanceRequestCount) {
        this.instanceRequestCount = instanceRequestCount;
        return this;
    }

    /**
     * <p>
     * Actual count of running instances.
     * </p>
     *
     * @return <p>
     *         Actual count of running instances.
     *         </p>
     */
    public Integer getInstanceRunningCount() {
        return instanceRunningCount;
    }

    /**
     * <p>
     * Actual count of running instances.
     * </p>
     *
     * @param instanceRunningCount <p>
     *            Actual count of running instances.
     *            </p>
     */
    public void setInstanceRunningCount(Integer instanceRunningCount) {
        this.instanceRunningCount = instanceRunningCount;
    }

    /**
     * <p>
     * Actual count of running instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceRunningCount <p>
     *            Actual count of running instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withInstanceRunningCount(Integer instanceRunningCount) {
        this.instanceRunningCount = instanceRunningCount;
        return this;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING,
     * TERMINATED, and FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING,
     * RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED,
     * SHUTTING_DOWN, ENDED
     *
     * @return <p>
     *         State of instance group. The following values are deprecated:
     *         STARTING, TERMINATED, and FAILED.
     *         </p>
     * @see InstanceGroupState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING,
     * TERMINATED, and FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING,
     * RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED,
     * SHUTTING_DOWN, ENDED
     *
     * @param state <p>
     *            State of instance group. The following values are deprecated:
     *            STARTING, TERMINATED, and FAILED.
     *            </p>
     * @see InstanceGroupState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING,
     * TERMINATED, and FAILED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING,
     * RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED,
     * SHUTTING_DOWN, ENDED
     *
     * @param state <p>
     *            State of instance group. The following values are deprecated:
     *            STARTING, TERMINATED, and FAILED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceGroupState
     */
    public InstanceGroupDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING,
     * TERMINATED, and FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING,
     * RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED,
     * SHUTTING_DOWN, ENDED
     *
     * @param state <p>
     *            State of instance group. The following values are deprecated:
     *            STARTING, TERMINATED, and FAILED.
     *            </p>
     * @see InstanceGroupState
     */
    public void setState(InstanceGroupState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * State of instance group. The following values are deprecated: STARTING,
     * TERMINATED, and FAILED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING,
     * RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED,
     * SHUTTING_DOWN, ENDED
     *
     * @param state <p>
     *            State of instance group. The following values are deprecated:
     *            STARTING, TERMINATED, and FAILED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceGroupState
     */
    public InstanceGroupDetail withState(InstanceGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Details regarding the state of the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Details regarding the state of the instance group.
     *         </p>
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }

    /**
     * <p>
     * Details regarding the state of the instance group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param lastStateChangeReason <p>
     *            Details regarding the state of the instance group.
     *            </p>
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }

    /**
     * <p>
     * Details regarding the state of the instance group.
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
     * @param lastStateChangeReason <p>
     *            Details regarding the state of the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     *
     * @return <p>
     *         The date/time the instance group was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The date/time the instance group was created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date/time the instance group was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     *
     * @return <p>
     *         The date/time the instance group was started.
     *         </p>
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     *
     * @param startDateTime <p>
     *            The date/time the instance group was started.
     *            </p>
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDateTime <p>
     *            The date/time the instance group was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     *
     * @return <p>
     *         The date/time the instance group was available to the cluster.
     *         </p>
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     *
     * @param readyDateTime <p>
     *            The date/time the instance group was available to the cluster.
     *            </p>
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was available to the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readyDateTime <p>
     *            The date/time the instance group was available to the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }

    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     *
     * @return <p>
     *         The date/time the instance group was terminated.
     *         </p>
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     *
     * @param endDateTime <p>
     *            The date/time the instance group was terminated.
     *            </p>
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date/time the instance group was terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDateTime <p>
     *            The date/time the instance group was terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
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
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
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
        if (getInstanceRequestCount() != null)
            sb.append("InstanceRequestCount: " + getInstanceRequestCount() + ",");
        if (getInstanceRunningCount() != null)
            sb.append("InstanceRunningCount: " + getInstanceRunningCount() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getLastStateChangeReason() != null)
            sb.append("LastStateChangeReason: " + getLastStateChangeReason() + ",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: " + getStartDateTime() + ",");
        if (getReadyDateTime() != null)
            sb.append("ReadyDateTime: " + getReadyDateTime() + ",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: " + getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceRequestCount() == null) ? 0 : getInstanceRequestCount().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceRunningCount() == null) ? 0 : getInstanceRunningCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastStateChangeReason() == null) ? 0 : getLastStateChangeReason().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupDetail == false)
            return false;
        InstanceGroupDetail other = (InstanceGroupDetail) obj;

        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null
                && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
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
        if (other.getInstanceRequestCount() == null ^ this.getInstanceRequestCount() == null)
            return false;
        if (other.getInstanceRequestCount() != null
                && other.getInstanceRequestCount().equals(this.getInstanceRequestCount()) == false)
            return false;
        if (other.getInstanceRunningCount() == null ^ this.getInstanceRunningCount() == null)
            return false;
        if (other.getInstanceRunningCount() != null
                && other.getInstanceRunningCount().equals(this.getInstanceRunningCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getLastStateChangeReason() == null ^ this.getLastStateChangeReason() == null)
            return false;
        if (other.getLastStateChangeReason() != null
                && other.getLastStateChangeReason().equals(this.getLastStateChangeReason()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null
                && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null)
            return false;
        if (other.getReadyDateTime() != null
                && other.getReadyDateTime().equals(this.getReadyDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null
                && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }
}
