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
 * Describes an instance fleet, which is a group of EC2 instances that host a
 * particular node type (master, core, or task) in an Amazon EMR cluster.
 * Instance fleets can consist of a mix of instance types and On-Demand and Spot
 * instances, which are provisioned to meet a defined target capacity.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 */
public class InstanceFleet implements Serializable {
    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     */
    private String id;

    /**
     * <p>
     * A friendly name for the instance fleet.
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
     * The current status of the instance fleet.
     * </p>
     */
    private InstanceFleetStatus status;

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,
     * CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     */
    private String instanceFleetType;

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which
     * determines how many On-Demand instances to provision. When the instance
     * fleet launches, Amazon EMR tries to provision On-Demand instances as
     * specified by <a>InstanceTypeConfig</a>. Each instance configuration has a
     * specified <code>WeightedCapacity</code>. When an On-Demand instance is
     * provisioned, the <code>WeightedCapacity</code> units count toward the
     * target capacity. Amazon EMR provisions instances until the target
     * capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon
     * EMR can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use
     * <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the
     * instance fleet using <code>TargetSpotCapacity</code>. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * can be specified, and its value must be 1.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer targetOnDemandCapacity;

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision. When the instance fleet
     * launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified
     * <code>WeightedCapacity</code>. When a Spot instance is provisioned, the
     * <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally
     * fulfilled, even if this results in an overage. For example, if there are
     * 2 units remaining to fulfill capacity, and Amazon EMR can only provision
     * an instance with a <code>WeightedCapacity</code> of 5 units, the instance
     * is provisioned, and the target capacity is exceeded by 3 units. You can
     * use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned
     * for the instance fleet. At least one of <code>TargetSpotCapacity</code>
     * and <code>TargetOnDemandCapacity</code> should be greater than 0. For a
     * master instance fleet, only one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> can be specified, and its value must
     * be 1.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer targetSpotCapacity;

    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance
     * fleet to fulfill <code>TargetOnDemandCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer provisionedOnDemandCapacity;

    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance
     * fleet to fulfill <code>TargetSpotCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer provisionedSpotCapacity;

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet.
     * Up to five unique instance specifications may be defined for each
     * instance fleet.
     * </p>
     */
    private java.util.List<InstanceTypeSpecification> instanceTypeSpecifications;

    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     */
    private InstanceFleetProvisioningSpecifications launchSpecifications;

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the instance fleet.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     *
     * @param id <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier of the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A friendly name for the instance fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A friendly name for the instance fleet.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name for the instance fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            A friendly name for the instance fleet.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the instance fleet.
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
     *            A friendly name for the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current status of the instance fleet.
     * </p>
     *
     * @return <p>
     *         The current status of the instance fleet.
     *         </p>
     */
    public InstanceFleetStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the instance fleet.
     * </p>
     *
     * @param status <p>
     *            The current status of the instance fleet.
     *            </p>
     */
    public void setStatus(InstanceFleetStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withStatus(InstanceFleetStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,
     * CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @return <p>
     *         The node type that the instance fleet hosts. Valid values are
     *         MASTER, CORE, or TASK.
     *         </p>
     * @see InstanceFleetType
     */
    public String getInstanceFleetType() {
        return instanceFleetType;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,
     * CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type that the instance fleet hosts. Valid values are
     *            MASTER, CORE, or TASK.
     *            </p>
     * @see InstanceFleetType
     */
    public void setInstanceFleetType(String instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,
     * CORE, or TASK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type that the instance fleet hosts. Valid values are
     *            MASTER, CORE, or TASK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetType
     */
    public InstanceFleet withInstanceFleetType(String instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
        return this;
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,
     * CORE, or TASK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type that the instance fleet hosts. Valid values are
     *            MASTER, CORE, or TASK.
     *            </p>
     * @see InstanceFleetType
     */
    public void setInstanceFleetType(InstanceFleetType instanceFleetType) {
        this.instanceFleetType = instanceFleetType.toString();
    }

    /**
     * <p>
     * The node type that the instance fleet hosts. Valid values are MASTER,
     * CORE, or TASK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, CORE, TASK
     *
     * @param instanceFleetType <p>
     *            The node type that the instance fleet hosts. Valid values are
     *            MASTER, CORE, or TASK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetType
     */
    public InstanceFleet withInstanceFleetType(InstanceFleetType instanceFleetType) {
        this.instanceFleetType = instanceFleetType.toString();
        return this;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which
     * determines how many On-Demand instances to provision. When the instance
     * fleet launches, Amazon EMR tries to provision On-Demand instances as
     * specified by <a>InstanceTypeConfig</a>. Each instance configuration has a
     * specified <code>WeightedCapacity</code>. When an On-Demand instance is
     * provisioned, the <code>WeightedCapacity</code> units count toward the
     * target capacity. Amazon EMR provisions instances until the target
     * capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon
     * EMR can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use
     * <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the
     * instance fleet using <code>TargetSpotCapacity</code>. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * can be specified, and its value must be 1.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The target capacity of On-Demand units for the instance fleet,
     *         which determines how many On-Demand instances to provision. When
     *         the instance fleet launches, Amazon EMR tries to provision
     *         On-Demand instances as specified by <a>InstanceTypeConfig</a>.
     *         Each instance configuration has a specified
     *         <code>WeightedCapacity</code>. When an On-Demand instance is
     *         provisioned, the <code>WeightedCapacity</code> units count toward
     *         the target capacity. Amazon EMR provisions instances until the
     *         target capacity is totally fulfilled, even if this results in an
     *         overage. For example, if there are 2 units remaining to fulfill
     *         capacity, and Amazon EMR can only provision an instance with a
     *         <code>WeightedCapacity</code> of 5 units, the instance is
     *         provisioned, and the target capacity is exceeded by 3 units. You
     *         can use <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to
     *         determine the Spot capacity units that have been provisioned for
     *         the instance fleet.
     *         </p>
     *         <note>
     *         <p>
     *         If not specified or set to 0, only Spot instances are provisioned
     *         for the instance fleet using <code>TargetSpotCapacity</code>. At
     *         least one of <code>TargetSpotCapacity</code> and
     *         <code>TargetOnDemandCapacity</code> should be greater than 0. For
     *         a master instance fleet, only one of
     *         <code>TargetSpotCapacity</code> and
     *         <code>TargetOnDemandCapacity</code> can be specified, and its
     *         value must be 1.
     *         </p>
     *         </note>
     */
    public Integer getTargetOnDemandCapacity() {
        return targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which
     * determines how many On-Demand instances to provision. When the instance
     * fleet launches, Amazon EMR tries to provision On-Demand instances as
     * specified by <a>InstanceTypeConfig</a>. Each instance configuration has a
     * specified <code>WeightedCapacity</code>. When an On-Demand instance is
     * provisioned, the <code>WeightedCapacity</code> units count toward the
     * target capacity. Amazon EMR provisions instances until the target
     * capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon
     * EMR can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use
     * <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the
     * instance fleet using <code>TargetSpotCapacity</code>. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * can be specified, and its value must be 1.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetOnDemandCapacity <p>
     *            The target capacity of On-Demand units for the instance fleet,
     *            which determines how many On-Demand instances to provision.
     *            When the instance fleet launches, Amazon EMR tries to
     *            provision On-Demand instances as specified by
     *            <a>InstanceTypeConfig</a>. Each instance configuration has a
     *            specified <code>WeightedCapacity</code>. When an On-Demand
     *            instance is provisioned, the <code>WeightedCapacity</code>
     *            units count toward the target capacity. Amazon EMR provisions
     *            instances until the target capacity is totally fulfilled, even
     *            if this results in an overage. For example, if there are 2
     *            units remaining to fulfill capacity, and Amazon EMR can only
     *            provision an instance with a <code>WeightedCapacity</code> of
     *            5 units, the instance is provisioned, and the target capacity
     *            is exceeded by 3 units. You can use
     *            <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine
     *            the Spot capacity units that have been provisioned for the
     *            instance fleet.
     *            </p>
     *            <note>
     *            <p>
     *            If not specified or set to 0, only Spot instances are
     *            provisioned for the instance fleet using
     *            <code>TargetSpotCapacity</code>. At least one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> should be greater than 0.
     *            For a master instance fleet, only one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> can be specified, and its
     *            value must be 1.
     *            </p>
     *            </note>
     */
    public void setTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet, which
     * determines how many On-Demand instances to provision. When the instance
     * fleet launches, Amazon EMR tries to provision On-Demand instances as
     * specified by <a>InstanceTypeConfig</a>. Each instance configuration has a
     * specified <code>WeightedCapacity</code>. When an On-Demand instance is
     * provisioned, the <code>WeightedCapacity</code> units count toward the
     * target capacity. Amazon EMR provisions instances until the target
     * capacity is totally fulfilled, even if this results in an overage. For
     * example, if there are 2 units remaining to fulfill capacity, and Amazon
     * EMR can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the target capacity is
     * exceeded by 3 units. You can use
     * <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only Spot instances are provisioned for the
     * instance fleet using <code>TargetSpotCapacity</code>. At least one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * should be greater than 0. For a master instance fleet, only one of
     * <code>TargetSpotCapacity</code> and <code>TargetOnDemandCapacity</code>
     * can be specified, and its value must be 1.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetOnDemandCapacity <p>
     *            The target capacity of On-Demand units for the instance fleet,
     *            which determines how many On-Demand instances to provision.
     *            When the instance fleet launches, Amazon EMR tries to
     *            provision On-Demand instances as specified by
     *            <a>InstanceTypeConfig</a>. Each instance configuration has a
     *            specified <code>WeightedCapacity</code>. When an On-Demand
     *            instance is provisioned, the <code>WeightedCapacity</code>
     *            units count toward the target capacity. Amazon EMR provisions
     *            instances until the target capacity is totally fulfilled, even
     *            if this results in an overage. For example, if there are 2
     *            units remaining to fulfill capacity, and Amazon EMR can only
     *            provision an instance with a <code>WeightedCapacity</code> of
     *            5 units, the instance is provisioned, and the target capacity
     *            is exceeded by 3 units. You can use
     *            <a>InstanceFleet$ProvisionedOnDemandCapacity</a> to determine
     *            the Spot capacity units that have been provisioned for the
     *            instance fleet.
     *            </p>
     *            <note>
     *            <p>
     *            If not specified or set to 0, only Spot instances are
     *            provisioned for the instance fleet using
     *            <code>TargetSpotCapacity</code>. At least one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> should be greater than 0.
     *            For a master instance fleet, only one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> can be specified, and its
     *            value must be 1.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        return this;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision. When the instance fleet
     * launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified
     * <code>WeightedCapacity</code>. When a Spot instance is provisioned, the
     * <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally
     * fulfilled, even if this results in an overage. For example, if there are
     * 2 units remaining to fulfill capacity, and Amazon EMR can only provision
     * an instance with a <code>WeightedCapacity</code> of 5 units, the instance
     * is provisioned, and the target capacity is exceeded by 3 units. You can
     * use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned
     * for the instance fleet. At least one of <code>TargetSpotCapacity</code>
     * and <code>TargetOnDemandCapacity</code> should be greater than 0. For a
     * master instance fleet, only one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> can be specified, and its value must
     * be 1.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The target capacity of Spot units for the instance fleet, which
     *         determines how many Spot instances to provision. When the
     *         instance fleet launches, Amazon EMR tries to provision Spot
     *         instances as specified by <a>InstanceTypeConfig</a>. Each
     *         instance configuration has a specified
     *         <code>WeightedCapacity</code>. When a Spot instance is
     *         provisioned, the <code>WeightedCapacity</code> units count toward
     *         the target capacity. Amazon EMR provisions instances until the
     *         target capacity is totally fulfilled, even if this results in an
     *         overage. For example, if there are 2 units remaining to fulfill
     *         capacity, and Amazon EMR can only provision an instance with a
     *         <code>WeightedCapacity</code> of 5 units, the instance is
     *         provisioned, and the target capacity is exceeded by 3 units. You
     *         can use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine
     *         the Spot capacity units that have been provisioned for the
     *         instance fleet.
     *         </p>
     *         <note>
     *         <p>
     *         If not specified or set to 0, only On-Demand instances are
     *         provisioned for the instance fleet. At least one of
     *         <code>TargetSpotCapacity</code> and
     *         <code>TargetOnDemandCapacity</code> should be greater than 0. For
     *         a master instance fleet, only one of
     *         <code>TargetSpotCapacity</code> and
     *         <code>TargetOnDemandCapacity</code> can be specified, and its
     *         value must be 1.
     *         </p>
     *         </note>
     */
    public Integer getTargetSpotCapacity() {
        return targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision. When the instance fleet
     * launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified
     * <code>WeightedCapacity</code>. When a Spot instance is provisioned, the
     * <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally
     * fulfilled, even if this results in an overage. For example, if there are
     * 2 units remaining to fulfill capacity, and Amazon EMR can only provision
     * an instance with a <code>WeightedCapacity</code> of 5 units, the instance
     * is provisioned, and the target capacity is exceeded by 3 units. You can
     * use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned
     * for the instance fleet. At least one of <code>TargetSpotCapacity</code>
     * and <code>TargetOnDemandCapacity</code> should be greater than 0. For a
     * master instance fleet, only one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> can be specified, and its value must
     * be 1.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetSpotCapacity <p>
     *            The target capacity of Spot units for the instance fleet,
     *            which determines how many Spot instances to provision. When
     *            the instance fleet launches, Amazon EMR tries to provision
     *            Spot instances as specified by <a>InstanceTypeConfig</a>. Each
     *            instance configuration has a specified
     *            <code>WeightedCapacity</code>. When a Spot instance is
     *            provisioned, the <code>WeightedCapacity</code> units count
     *            toward the target capacity. Amazon EMR provisions instances
     *            until the target capacity is totally fulfilled, even if this
     *            results in an overage. For example, if there are 2 units
     *            remaining to fulfill capacity, and Amazon EMR can only
     *            provision an instance with a <code>WeightedCapacity</code> of
     *            5 units, the instance is provisioned, and the target capacity
     *            is exceeded by 3 units. You can use
     *            <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the
     *            Spot capacity units that have been provisioned for the
     *            instance fleet.
     *            </p>
     *            <note>
     *            <p>
     *            If not specified or set to 0, only On-Demand instances are
     *            provisioned for the instance fleet. At least one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> should be greater than 0.
     *            For a master instance fleet, only one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> can be specified, and its
     *            value must be 1.
     *            </p>
     *            </note>
     */
    public void setTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet, which
     * determines how many Spot instances to provision. When the instance fleet
     * launches, Amazon EMR tries to provision Spot instances as specified by
     * <a>InstanceTypeConfig</a>. Each instance configuration has a specified
     * <code>WeightedCapacity</code>. When a Spot instance is provisioned, the
     * <code>WeightedCapacity</code> units count toward the target capacity.
     * Amazon EMR provisions instances until the target capacity is totally
     * fulfilled, even if this results in an overage. For example, if there are
     * 2 units remaining to fulfill capacity, and Amazon EMR can only provision
     * an instance with a <code>WeightedCapacity</code> of 5 units, the instance
     * is provisioned, and the target capacity is exceeded by 3 units. You can
     * use <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the Spot
     * capacity units that have been provisioned for the instance fleet.
     * </p>
     * <note>
     * <p>
     * If not specified or set to 0, only On-Demand instances are provisioned
     * for the instance fleet. At least one of <code>TargetSpotCapacity</code>
     * and <code>TargetOnDemandCapacity</code> should be greater than 0. For a
     * master instance fleet, only one of <code>TargetSpotCapacity</code> and
     * <code>TargetOnDemandCapacity</code> can be specified, and its value must
     * be 1.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetSpotCapacity <p>
     *            The target capacity of Spot units for the instance fleet,
     *            which determines how many Spot instances to provision. When
     *            the instance fleet launches, Amazon EMR tries to provision
     *            Spot instances as specified by <a>InstanceTypeConfig</a>. Each
     *            instance configuration has a specified
     *            <code>WeightedCapacity</code>. When a Spot instance is
     *            provisioned, the <code>WeightedCapacity</code> units count
     *            toward the target capacity. Amazon EMR provisions instances
     *            until the target capacity is totally fulfilled, even if this
     *            results in an overage. For example, if there are 2 units
     *            remaining to fulfill capacity, and Amazon EMR can only
     *            provision an instance with a <code>WeightedCapacity</code> of
     *            5 units, the instance is provisioned, and the target capacity
     *            is exceeded by 3 units. You can use
     *            <a>InstanceFleet$ProvisionedSpotCapacity</a> to determine the
     *            Spot capacity units that have been provisioned for the
     *            instance fleet.
     *            </p>
     *            <note>
     *            <p>
     *            If not specified or set to 0, only On-Demand instances are
     *            provisioned for the instance fleet. At least one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> should be greater than 0.
     *            For a master instance fleet, only one of
     *            <code>TargetSpotCapacity</code> and
     *            <code>TargetOnDemandCapacity</code> can be specified, and its
     *            value must be 1.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance
     * fleet to fulfill <code>TargetOnDemandCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of On-Demand units that have been provisioned for the
     *         instance fleet to fulfill <code>TargetOnDemandCapacity</code>.
     *         This provisioned capacity might be less than or greater than
     *         <code>TargetOnDemandCapacity</code>.
     *         </p>
     */
    public Integer getProvisionedOnDemandCapacity() {
        return provisionedOnDemandCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance
     * fleet to fulfill <code>TargetOnDemandCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param provisionedOnDemandCapacity <p>
     *            The number of On-Demand units that have been provisioned for
     *            the instance fleet to fulfill
     *            <code>TargetOnDemandCapacity</code>. This provisioned capacity
     *            might be less than or greater than
     *            <code>TargetOnDemandCapacity</code>.
     *            </p>
     */
    public void setProvisionedOnDemandCapacity(Integer provisionedOnDemandCapacity) {
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units that have been provisioned for the instance
     * fleet to fulfill <code>TargetOnDemandCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetOnDemandCapacity</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param provisionedOnDemandCapacity <p>
     *            The number of On-Demand units that have been provisioned for
     *            the instance fleet to fulfill
     *            <code>TargetOnDemandCapacity</code>. This provisioned capacity
     *            might be less than or greater than
     *            <code>TargetOnDemandCapacity</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withProvisionedOnDemandCapacity(Integer provisionedOnDemandCapacity) {
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
        return this;
    }

    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance
     * fleet to fulfill <code>TargetSpotCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of Spot units that have been provisioned for this
     *         instance fleet to fulfill <code>TargetSpotCapacity</code>. This
     *         provisioned capacity might be less than or greater than
     *         <code>TargetSpotCapacity</code>.
     *         </p>
     */
    public Integer getProvisionedSpotCapacity() {
        return provisionedSpotCapacity;
    }

    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance
     * fleet to fulfill <code>TargetSpotCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param provisionedSpotCapacity <p>
     *            The number of Spot units that have been provisioned for this
     *            instance fleet to fulfill <code>TargetSpotCapacity</code>.
     *            This provisioned capacity might be less than or greater than
     *            <code>TargetSpotCapacity</code>.
     *            </p>
     */
    public void setProvisionedSpotCapacity(Integer provisionedSpotCapacity) {
        this.provisionedSpotCapacity = provisionedSpotCapacity;
    }

    /**
     * <p>
     * The number of Spot units that have been provisioned for this instance
     * fleet to fulfill <code>TargetSpotCapacity</code>. This provisioned
     * capacity might be less than or greater than
     * <code>TargetSpotCapacity</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param provisionedSpotCapacity <p>
     *            The number of Spot units that have been provisioned for this
     *            instance fleet to fulfill <code>TargetSpotCapacity</code>.
     *            This provisioned capacity might be less than or greater than
     *            <code>TargetSpotCapacity</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withProvisionedSpotCapacity(Integer provisionedSpotCapacity) {
        this.provisionedSpotCapacity = provisionedSpotCapacity;
        return this;
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet.
     * Up to five unique instance specifications may be defined for each
     * instance fleet.
     * </p>
     *
     * @return <p>
     *         The specification for the instance types that comprise an
     *         instance fleet. Up to five unique instance specifications may be
     *         defined for each instance fleet.
     *         </p>
     */
    public java.util.List<InstanceTypeSpecification> getInstanceTypeSpecifications() {
        return instanceTypeSpecifications;
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet.
     * Up to five unique instance specifications may be defined for each
     * instance fleet.
     * </p>
     *
     * @param instanceTypeSpecifications <p>
     *            The specification for the instance types that comprise an
     *            instance fleet. Up to five unique instance specifications may
     *            be defined for each instance fleet.
     *            </p>
     */
    public void setInstanceTypeSpecifications(
            java.util.Collection<InstanceTypeSpecification> instanceTypeSpecifications) {
        if (instanceTypeSpecifications == null) {
            this.instanceTypeSpecifications = null;
            return;
        }

        this.instanceTypeSpecifications = new java.util.ArrayList<InstanceTypeSpecification>(
                instanceTypeSpecifications);
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet.
     * Up to five unique instance specifications may be defined for each
     * instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypeSpecifications <p>
     *            The specification for the instance types that comprise an
     *            instance fleet. Up to five unique instance specifications may
     *            be defined for each instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withInstanceTypeSpecifications(
            InstanceTypeSpecification... instanceTypeSpecifications) {
        if (getInstanceTypeSpecifications() == null) {
            this.instanceTypeSpecifications = new java.util.ArrayList<InstanceTypeSpecification>(
                    instanceTypeSpecifications.length);
        }
        for (InstanceTypeSpecification value : instanceTypeSpecifications) {
            this.instanceTypeSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specification for the instance types that comprise an instance fleet.
     * Up to five unique instance specifications may be defined for each
     * instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypeSpecifications <p>
     *            The specification for the instance types that comprise an
     *            instance fleet. Up to five unique instance specifications may
     *            be defined for each instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withInstanceTypeSpecifications(
            java.util.Collection<InstanceTypeSpecification> instanceTypeSpecifications) {
        setInstanceTypeSpecifications(instanceTypeSpecifications);
        return this;
    }

    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     *
     * @return <p>
     *         Describes the launch specification for an instance fleet.
     *         </p>
     */
    public InstanceFleetProvisioningSpecifications getLaunchSpecifications() {
        return launchSpecifications;
    }

    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     *
     * @param launchSpecifications <p>
     *            Describes the launch specification for an instance fleet.
     *            </p>
     */
    public void setLaunchSpecifications(InstanceFleetProvisioningSpecifications launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    /**
     * <p>
     * Describes the launch specification for an instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchSpecifications <p>
     *            Describes the launch specification for an instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleet withLaunchSpecifications(
            InstanceFleetProvisioningSpecifications launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getInstanceFleetType() != null)
            sb.append("InstanceFleetType: " + getInstanceFleetType() + ",");
        if (getTargetOnDemandCapacity() != null)
            sb.append("TargetOnDemandCapacity: " + getTargetOnDemandCapacity() + ",");
        if (getTargetSpotCapacity() != null)
            sb.append("TargetSpotCapacity: " + getTargetSpotCapacity() + ",");
        if (getProvisionedOnDemandCapacity() != null)
            sb.append("ProvisionedOnDemandCapacity: " + getProvisionedOnDemandCapacity() + ",");
        if (getProvisionedSpotCapacity() != null)
            sb.append("ProvisionedSpotCapacity: " + getProvisionedSpotCapacity() + ",");
        if (getInstanceTypeSpecifications() != null)
            sb.append("InstanceTypeSpecifications: " + getInstanceTypeSpecifications() + ",");
        if (getLaunchSpecifications() != null)
            sb.append("LaunchSpecifications: " + getLaunchSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFleetType() == null) ? 0 : getInstanceFleetType().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetOnDemandCapacity() == null) ? 0 : getTargetOnDemandCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTargetSpotCapacity() == null) ? 0 : getTargetSpotCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedOnDemandCapacity() == null) ? 0
                        : getProvisionedOnDemandCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedSpotCapacity() == null) ? 0 : getProvisionedSpotCapacity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceTypeSpecifications() == null) ? 0 : getInstanceTypeSpecifications()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLaunchSpecifications() == null) ? 0 : getLaunchSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleet == false)
            return false;
        InstanceFleet other = (InstanceFleet) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInstanceFleetType() == null ^ this.getInstanceFleetType() == null)
            return false;
        if (other.getInstanceFleetType() != null
                && other.getInstanceFleetType().equals(this.getInstanceFleetType()) == false)
            return false;
        if (other.getTargetOnDemandCapacity() == null ^ this.getTargetOnDemandCapacity() == null)
            return false;
        if (other.getTargetOnDemandCapacity() != null
                && other.getTargetOnDemandCapacity().equals(this.getTargetOnDemandCapacity()) == false)
            return false;
        if (other.getTargetSpotCapacity() == null ^ this.getTargetSpotCapacity() == null)
            return false;
        if (other.getTargetSpotCapacity() != null
                && other.getTargetSpotCapacity().equals(this.getTargetSpotCapacity()) == false)
            return false;
        if (other.getProvisionedOnDemandCapacity() == null
                ^ this.getProvisionedOnDemandCapacity() == null)
            return false;
        if (other.getProvisionedOnDemandCapacity() != null
                && other.getProvisionedOnDemandCapacity().equals(
                        this.getProvisionedOnDemandCapacity()) == false)
            return false;
        if (other.getProvisionedSpotCapacity() == null ^ this.getProvisionedSpotCapacity() == null)
            return false;
        if (other.getProvisionedSpotCapacity() != null
                && other.getProvisionedSpotCapacity().equals(this.getProvisionedSpotCapacity()) == false)
            return false;
        if (other.getInstanceTypeSpecifications() == null
                ^ this.getInstanceTypeSpecifications() == null)
            return false;
        if (other.getInstanceTypeSpecifications() != null
                && other.getInstanceTypeSpecifications().equals(
                        this.getInstanceTypeSpecifications()) == false)
            return false;
        if (other.getLaunchSpecifications() == null ^ this.getLaunchSpecifications() == null)
            return false;
        if (other.getLaunchSpecifications() != null
                && other.getLaunchSpecifications().equals(this.getLaunchSpecifications()) == false)
            return false;
        return true;
    }
}
