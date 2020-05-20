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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an instance in a deployment.
 * </p>
 */
@Deprecated
public class InstanceSummary implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: The deployment is in progress for this
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     */
    private String status;

    /**
     * <p>
     * A timestamp that indicates when the instance information was last
     * updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     */
    private java.util.List<LifecycleEvent> lifecycleEvents;

    /**
     * <p>
     * Information about which environment an instance belongs to in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     */
    private String instanceType;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSummary withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     *
     * @return <p>
     *         The instance ID.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     *
     * @param instanceId <p>
     *            The instance ID.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The instance ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSummary withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: The deployment is in progress for this
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @return <p>
     *         The deployment status for this instance:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Pending</code>: The deployment is pending for this
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>In Progress</code>: The deployment is in progress for this
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Succeeded</code>: The deployment has succeeded for this
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: The deployment has failed for this instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Skipped</code>: The deployment has been skipped for this
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unknown</code>: The deployment status is unknown for this
     *         instance.
     *         </p>
     *         </li>
     *         </ul>
     * @see InstanceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: The deployment is in progress for this
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The deployment status for this instance:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code>: The deployment is pending for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>In Progress</code>: The deployment is in progress for
     *            this instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: The deployment has succeeded for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: The deployment has failed for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Skipped</code>: The deployment has been skipped for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unknown</code>: The deployment status is unknown for
     *            this instance.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: The deployment is in progress for this
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The deployment status for this instance:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code>: The deployment is pending for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>In Progress</code>: The deployment is in progress for
     *            this instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: The deployment has succeeded for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: The deployment has failed for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Skipped</code>: The deployment has been skipped for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unknown</code>: The deployment status is unknown for
     *            this instance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceStatus
     */
    public InstanceSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: The deployment is in progress for this
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The deployment status for this instance:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code>: The deployment is pending for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>In Progress</code>: The deployment is in progress for
     *            this instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: The deployment has succeeded for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: The deployment has failed for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Skipped</code>: The deployment has been skipped for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unknown</code>: The deployment status is unknown for
     *            this instance.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceStatus
     */
    public void setStatus(InstanceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code>: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>In Progress</code>: The deployment is in progress for this
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code>: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Skipped</code>: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code>: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The deployment status for this instance:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code>: The deployment is pending for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>In Progress</code>: The deployment is in progress for
     *            this instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code>: The deployment has succeeded for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: The deployment has failed for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Skipped</code>: The deployment has been skipped for this
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unknown</code>: The deployment status is unknown for
     *            this instance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceStatus
     */
    public InstanceSummary withStatus(InstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the instance information was last
     * updated.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the instance information was last
     *         updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the instance information was last
     * updated.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            A timestamp that indicates when the instance information was
     *            last updated.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * A timestamp that indicates when the instance information was last
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            A timestamp that indicates when the instance information was
     *            last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     *
     * @return <p>
     *         A list of lifecycle events for this instance.
     *         </p>
     */
    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        return lifecycleEvents;
    }

    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     *
     * @param lifecycleEvents <p>
     *            A list of lifecycle events for this instance.
     *            </p>
     */
    public void setLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        if (lifecycleEvents == null) {
            this.lifecycleEvents = null;
            return;
        }

        this.lifecycleEvents = new java.util.ArrayList<LifecycleEvent>(lifecycleEvents);
    }

    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            A list of lifecycle events for this instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSummary withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
        if (getLifecycleEvents() == null) {
            this.lifecycleEvents = new java.util.ArrayList<LifecycleEvent>(lifecycleEvents.length);
        }
        for (LifecycleEvent value : lifecycleEvents) {
            this.lifecycleEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            A list of lifecycle events for this instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSummary withLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        setLifecycleEvents(lifecycleEvents);
        return this;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @return <p>
     *         Information about which environment an instance belongs to in a
     *         blue/green deployment.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         BLUE: The instance is part of the original environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GREEN: The instance is part of the replacement environment.
     *         </p>
     *         </li>
     *         </ul>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param instanceType <p>
     *            Information about which environment an instance belongs to in
     *            a blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            BLUE: The instance is part of the original environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GREEN: The instance is part of the replacement environment.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param instanceType <p>
     *            Information about which environment an instance belongs to in
     *            a blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            BLUE: The instance is part of the original environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GREEN: The instance is part of the replacement environment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public InstanceSummary withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param instanceType <p>
     *            Information about which environment an instance belongs to in
     *            a blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            BLUE: The instance is part of the original environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GREEN: The instance is part of the replacement environment.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a
     * blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Blue, Green
     *
     * @param instanceType <p>
     *            Information about which environment an instance belongs to in
     *            a blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            BLUE: The instance is part of the original environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            GREEN: The instance is part of the replacement environment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public InstanceSummary withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
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
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getInstanceId() != null)
            sb.append("instanceId: " + getInstanceId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getLifecycleEvents() != null)
            sb.append("lifecycleEvents: " + getLifecycleEvents() + ",");
        if (getInstanceType() != null)
            sb.append("instanceType: " + getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleEvents() == null) ? 0 : getLifecycleEvents().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSummary == false)
            return false;
        InstanceSummary other = (InstanceSummary) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLifecycleEvents() == null ^ this.getLifecycleEvents() == null)
            return false;
        if (other.getLifecycleEvents() != null
                && other.getLifecycleEvents().equals(this.getLifecycleEvents()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }
}
