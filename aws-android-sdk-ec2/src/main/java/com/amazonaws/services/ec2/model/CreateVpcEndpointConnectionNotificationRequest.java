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
 * Creates a connection notification for a specified VPC endpoint or VPC
 * endpoint service. A connection notification notifies you of specific endpoint
 * events. You must create an SNS topic to receive notifications. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Create a
 * Topic</a> in the <i>Amazon Simple Notification Service Developer Guide</i>.
 * </p>
 * <p>
 * You can create a connection notification for interface endpoints only.
 * </p>
 */
public class CreateVpcEndpointConnectionNotificationRequest extends AmazonWebServiceRequest
        implements Serializable {
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
     * The ID of the endpoint service.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     */
    private String connectionNotificationArn;

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid
     * values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     * , and <code>Reject</code>.
     * </p>
     */
    private java.util.List<String> connectionEvents;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
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
    public CreateVpcEndpointConnectionNotificationRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     *
     * @return <p>
     *         The ID of the endpoint service.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     *
     * @param serviceId <p>
     *            The ID of the endpoint service.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceId <p>
     *            The ID of the endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointConnectionNotificationRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the endpoint.
     *         </p>
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     *
     * @param vpcEndpointId <p>
     *            The ID of the endpoint.
     *            </p>
     */
    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointId <p>
     *            The ID of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointConnectionNotificationRequest withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     *
     * @return <p>
     *         The ARN of the SNS topic for the notifications.
     *         </p>
     */
    public String getConnectionNotificationArn() {
        return connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     *
     * @param connectionNotificationArn <p>
     *            The ARN of the SNS topic for the notifications.
     *            </p>
     */
    public void setConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionNotificationArn <p>
     *            The ARN of the SNS topic for the notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointConnectionNotificationRequest withConnectionNotificationArn(
            String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
        return this;
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid
     * values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     * , and <code>Reject</code>.
     * </p>
     *
     * @return <p>
     *         One or more endpoint events for which to receive notifications.
     *         Valid values are <code>Accept</code>, <code>Connect</code>,
     *         <code>Delete</code>, and <code>Reject</code>.
     *         </p>
     */
    public java.util.List<String> getConnectionEvents() {
        return connectionEvents;
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid
     * values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     * , and <code>Reject</code>.
     * </p>
     *
     * @param connectionEvents <p>
     *            One or more endpoint events for which to receive
     *            notifications. Valid values are <code>Accept</code>,
     *            <code>Connect</code>, <code>Delete</code>, and
     *            <code>Reject</code>.
     *            </p>
     */
    public void setConnectionEvents(java.util.Collection<String> connectionEvents) {
        if (connectionEvents == null) {
            this.connectionEvents = null;
            return;
        }

        this.connectionEvents = new java.util.ArrayList<String>(connectionEvents);
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid
     * values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     * , and <code>Reject</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEvents <p>
     *            One or more endpoint events for which to receive
     *            notifications. Valid values are <code>Accept</code>,
     *            <code>Connect</code>, <code>Delete</code>, and
     *            <code>Reject</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointConnectionNotificationRequest withConnectionEvents(
            String... connectionEvents) {
        if (getConnectionEvents() == null) {
            this.connectionEvents = new java.util.ArrayList<String>(connectionEvents.length);
        }
        for (String value : connectionEvents) {
            this.connectionEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid
     * values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     * , and <code>Reject</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEvents <p>
     *            One or more endpoint events for which to receive
     *            notifications. Valid values are <code>Accept</code>,
     *            <code>Connect</code>, <code>Delete</code>, and
     *            <code>Reject</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointConnectionNotificationRequest withConnectionEvents(
            java.util.Collection<String> connectionEvents) {
        setConnectionEvents(connectionEvents);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcEndpointConnectionNotificationRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getConnectionNotificationArn() != null)
            sb.append("ConnectionNotificationArn: " + getConnectionNotificationArn() + ",");
        if (getConnectionEvents() != null)
            sb.append("ConnectionEvents: " + getConnectionEvents() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionNotificationArn() == null) ? 0 : getConnectionNotificationArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConnectionEvents() == null) ? 0 : getConnectionEvents().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcEndpointConnectionNotificationRequest == false)
            return false;
        CreateVpcEndpointConnectionNotificationRequest other = (CreateVpcEndpointConnectionNotificationRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null
                && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getConnectionNotificationArn() == null
                ^ this.getConnectionNotificationArn() == null)
            return false;
        if (other.getConnectionNotificationArn() != null
                && other.getConnectionNotificationArn().equals(this.getConnectionNotificationArn()) == false)
            return false;
        if (other.getConnectionEvents() == null ^ this.getConnectionEvents() == null)
            return false;
        if (other.getConnectionEvents() != null
                && other.getConnectionEvents().equals(this.getConnectionEvents()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
