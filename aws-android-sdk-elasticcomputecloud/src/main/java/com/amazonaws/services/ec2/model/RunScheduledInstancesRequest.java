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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Launches the specified Scheduled Instances.
 * </p>
 * <p>
 * Before you can launch a Scheduled Instance, you must purchase it and obtain
 * an identifier using <a>PurchaseScheduledInstances</a>.
 * </p>
 * <p>
 * You must launch a Scheduled Instance during its scheduled time period. You
 * can't stop or reboot a Scheduled Instance, but you can terminate it as
 * needed. If you terminate a Scheduled Instance before the current scheduled
 * time period ends, you can launch it again after a few minutes. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-scheduled-instances.html"
 * >Scheduled Instances</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class RunScheduledInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The launch specification. You must match the instance type, Availability
     * Zone, network, and platform of the schedule that you purchased.
     * </p>
     */
    private ScheduledInstancesLaunchSpecification launchSpecification;

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     */
    private String scheduledInstanceId;

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that ensures the idempotency of
     *         the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that ensures the idempotency
     *            of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that ensures the idempotency
     *            of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunScheduledInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunScheduledInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     *
     * @return <p>
     *         The number of instances.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunScheduledInstancesRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The launch specification. You must match the instance type, Availability
     * Zone, network, and platform of the schedule that you purchased.
     * </p>
     *
     * @return <p>
     *         The launch specification. You must match the instance type,
     *         Availability Zone, network, and platform of the schedule that you
     *         purchased.
     *         </p>
     */
    public ScheduledInstancesLaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }

    /**
     * <p>
     * The launch specification. You must match the instance type, Availability
     * Zone, network, and platform of the schedule that you purchased.
     * </p>
     *
     * @param launchSpecification <p>
     *            The launch specification. You must match the instance type,
     *            Availability Zone, network, and platform of the schedule that
     *            you purchased.
     *            </p>
     */
    public void setLaunchSpecification(ScheduledInstancesLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * The launch specification. You must match the instance type, Availability
     * Zone, network, and platform of the schedule that you purchased.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchSpecification <p>
     *            The launch specification. You must match the instance type,
     *            Availability Zone, network, and platform of the schedule that
     *            you purchased.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunScheduledInstancesRequest withLaunchSpecification(
            ScheduledInstancesLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     *
     * @return <p>
     *         The Scheduled Instance ID.
     *         </p>
     */
    public String getScheduledInstanceId() {
        return scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     *
     * @param scheduledInstanceId <p>
     *            The Scheduled Instance ID.
     *            </p>
     */
    public void setScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceId <p>
     *            The Scheduled Instance ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunScheduledInstancesRequest withScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getScheduledInstanceId() != null)
            sb.append("ScheduledInstanceId: " + getScheduledInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledInstanceId() == null) ? 0 : getScheduledInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunScheduledInstancesRequest == false)
            return false;
        RunScheduledInstancesRequest other = (RunScheduledInstancesRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null
                && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        if (other.getScheduledInstanceId() == null ^ this.getScheduledInstanceId() == null)
            return false;
        if (other.getScheduledInstanceId() != null
                && other.getScheduledInstanceId().equals(this.getScheduledInstanceId()) == false)
            return false;
        return true;
    }
}
