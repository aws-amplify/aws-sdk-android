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
 * Creates one or more flow logs to capture information about IP traffic for a
 * specific network interface, subnet, or VPC.
 * </p>
 * <p>
 * Flow log data for a monitored network interface is recorded as flow log
 * records, which are log events consisting of fields that describe the traffic
 * flow. For more information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
 * >Flow Log Records</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 * <p>
 * When publishing to CloudWatch Logs, flow log records are published to a log
 * group, and each network interface has a unique log stream in the log group.
 * When publishing to Amazon S3, flow log records for all of the monitored
 * network interfaces are published to a single log file object that is stored
 * in the specified bucket.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html">VPC
 * Flow Logs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class CreateFlowLogsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to
     * a CloudWatch Logs log group in your account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     */
    private String deliverLogsPermissionArn;

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2
     * publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to
     * create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     */
    private java.util.List<String> resourceIds;

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if
     * you specified a VPC ID for the <code>ResourceId</code> property, specify
     * <code>VPC</code> for this property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     */
    private String resourceType;

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts
     * or rejects, or all traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     */
    private String trafficType;

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3,
     * specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     */
    private String logDestinationType;

    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published.
     * Flow log data can be published to a CloudWatch Logs log group or an
     * Amazon S3 bucket. The value specified for this parameter depends on the
     * value specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or
     * <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN) of
     * the CloudWatch Logs log group. For example, to publish to a log group
     * called <code>my-logs</code>, specify
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>.
     * Alternatively, use <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon
     * S3 bucket. You can also specify a subfolder in the bucket. To specify a
     * subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a
     * subfolder named <code>my-logs</code> in a bucket named
     * <code>my-bucket</code>, use the following ARN:
     * <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot use
     * <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     */
    private String logDestination;

    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they
     * should appear. For a list of available fields, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     * >Flow Log Records</a>. If you omit this parameter, the flow log is
     * created using the default format. If you specify this parameter, you must
     * specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated
     * by spaces. For the AWS CLI, use single quotation marks (' ') to surround
     * the parameter value.
     * </p>
     */
    private String logFormat;

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured
     * and aggregated into a flow log record. You can specify 60 seconds (1
     * minute) or 600 seconds (10 minutes).
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     */
    private Integer maxAggregationInterval;

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
    public CreateFlowLogsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
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
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
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
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
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
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to
     * a CloudWatch Logs log group in your account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     *
     * @return <p>
     *         The ARN for the IAM role that permits Amazon EC2 to publish flow
     *         logs to a CloudWatch Logs log group in your account.
     *         </p>
     *         <p>
     *         If you specify <code>LogDestinationType</code> as <code>s3</code>
     *         , do not specify <code>DeliverLogsPermissionArn</code> or
     *         <code>LogGroupName</code>.
     *         </p>
     */
    public String getDeliverLogsPermissionArn() {
        return deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to
     * a CloudWatch Logs log group in your account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     *
     * @param deliverLogsPermissionArn <p>
     *            The ARN for the IAM role that permits Amazon EC2 to publish
     *            flow logs to a CloudWatch Logs log group in your account.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     */
    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to
     * a CloudWatch Logs log group in your account.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliverLogsPermissionArn <p>
     *            The ARN for the IAM role that permits Amazon EC2 to publish
     *            flow logs to a CloudWatch Logs log group in your account.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
        return this;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2
     * publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     *
     * @return <p>
     *         The name of a new or existing CloudWatch Logs log group where
     *         Amazon EC2 publishes your flow logs.
     *         </p>
     *         <p>
     *         If you specify <code>LogDestinationType</code> as <code>s3</code>
     *         , do not specify <code>DeliverLogsPermissionArn</code> or
     *         <code>LogGroupName</code>.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2
     * publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     *
     * @param logGroupName <p>
     *            The name of a new or existing CloudWatch Logs log group where
     *            Amazon EC2 publishes your flow logs.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2
     * publishes your flow logs.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupName <p>
     *            The name of a new or existing CloudWatch Logs log group where
     *            Amazon EC2 publishes your flow logs.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to
     * create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     *
     * @return <p>
     *         The ID of the subnet, network interface, or VPC for which you
     *         want to create a flow log.
     *         </p>
     *         <p>
     *         Constraints: Maximum of 1000 resources
     *         </p>
     */
    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to
     * create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     *
     * @param resourceIds <p>
     *            The ID of the subnet, network interface, or VPC for which you
     *            want to create a flow log.
     *            </p>
     *            <p>
     *            Constraints: Maximum of 1000 resources
     *            </p>
     */
    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to
     * create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIds <p>
     *            The ID of the subnet, network interface, or VPC for which you
     *            want to create a flow log.
     *            </p>
     *            <p>
     *            Constraints: Maximum of 1000 resources
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withResourceIds(String... resourceIds) {
        if (getResourceIds() == null) {
            this.resourceIds = new java.util.ArrayList<String>(resourceIds.length);
        }
        for (String value : resourceIds) {
            this.resourceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the subnet, network interface, or VPC for which you want to
     * create a flow log.
     * </p>
     * <p>
     * Constraints: Maximum of 1000 resources
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIds <p>
     *            The ID of the subnet, network interface, or VPC for which you
     *            want to create a flow log.
     *            </p>
     *            <p>
     *            Constraints: Maximum of 1000 resources
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if
     * you specified a VPC ID for the <code>ResourceId</code> property, specify
     * <code>VPC</code> for this property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @return <p>
     *         The type of resource for which to create the flow log. For
     *         example, if you specified a VPC ID for the
     *         <code>ResourceId</code> property, specify <code>VPC</code> for
     *         this property.
     *         </p>
     * @see FlowLogsResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if
     * you specified a VPC ID for the <code>ResourceId</code> property, specify
     * <code>VPC</code> for this property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType <p>
     *            The type of resource for which to create the flow log. For
     *            example, if you specified a VPC ID for the
     *            <code>ResourceId</code> property, specify <code>VPC</code> for
     *            this property.
     *            </p>
     * @see FlowLogsResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if
     * you specified a VPC ID for the <code>ResourceId</code> property, specify
     * <code>VPC</code> for this property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType <p>
     *            The type of resource for which to create the flow log. For
     *            example, if you specified a VPC ID for the
     *            <code>ResourceId</code> property, specify <code>VPC</code> for
     *            this property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlowLogsResourceType
     */
    public CreateFlowLogsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if
     * you specified a VPC ID for the <code>ResourceId</code> property, specify
     * <code>VPC</code> for this property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType <p>
     *            The type of resource for which to create the flow log. For
     *            example, if you specified a VPC ID for the
     *            <code>ResourceId</code> property, specify <code>VPC</code> for
     *            this property.
     *            </p>
     * @see FlowLogsResourceType
     */
    public void setResourceType(FlowLogsResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource for which to create the flow log. For example, if
     * you specified a VPC ID for the <code>ResourceId</code> property, specify
     * <code>VPC</code> for this property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType <p>
     *            The type of resource for which to create the flow log. For
     *            example, if you specified a VPC ID for the
     *            <code>ResourceId</code> property, specify <code>VPC</code> for
     *            this property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FlowLogsResourceType
     */
    public CreateFlowLogsRequest withResourceType(FlowLogsResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts
     * or rejects, or all traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @return <p>
     *         The type of traffic to log. You can log traffic that the resource
     *         accepts or rejects, or all traffic.
     *         </p>
     * @see TrafficType
     */
    public String getTrafficType() {
        return trafficType;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts
     * or rejects, or all traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic to log. You can log traffic that the
     *            resource accepts or rejects, or all traffic.
     *            </p>
     * @see TrafficType
     */
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts
     * or rejects, or all traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic to log. You can log traffic that the
     *            resource accepts or rejects, or all traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficType
     */
    public CreateFlowLogsRequest withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts
     * or rejects, or all traffic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic to log. You can log traffic that the
     *            resource accepts or rejects, or all traffic.
     *            </p>
     * @see TrafficType
     */
    public void setTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
    }

    /**
     * <p>
     * The type of traffic to log. You can log traffic that the resource accepts
     * or rejects, or all traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic to log. You can log traffic that the
     *            resource accepts or rejects, or all traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficType
     */
    public CreateFlowLogsRequest withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3,
     * specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @return <p>
     *         Specifies the type of destination to which the flow log data is
     *         to be published. Flow log data can be published to CloudWatch
     *         Logs or Amazon S3. To publish flow log data to CloudWatch Logs,
     *         specify <code>cloud-watch-logs</code>. To publish flow log data
     *         to Amazon S3, specify <code>s3</code>.
     *         </p>
     *         <p>
     *         If you specify <code>LogDestinationType</code> as <code>s3</code>
     *         , do not specify <code>DeliverLogsPermissionArn</code> or
     *         <code>LogGroupName</code>.
     *         </p>
     *         <p>
     *         Default: <code>cloud-watch-logs</code>
     *         </p>
     * @see LogDestinationType
     */
    public String getLogDestinationType() {
        return logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3,
     * specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @param logDestinationType <p>
     *            Specifies the type of destination to which the flow log data
     *            is to be published. Flow log data can be published to
     *            CloudWatch Logs or Amazon S3. To publish flow log data to
     *            CloudWatch Logs, specify <code>cloud-watch-logs</code>. To
     *            publish flow log data to Amazon S3, specify <code>s3</code>.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     *            <p>
     *            Default: <code>cloud-watch-logs</code>
     *            </p>
     * @see LogDestinationType
     */
    public void setLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3,
     * specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @param logDestinationType <p>
     *            Specifies the type of destination to which the flow log data
     *            is to be published. Flow log data can be published to
     *            CloudWatch Logs or Amazon S3. To publish flow log data to
     *            CloudWatch Logs, specify <code>cloud-watch-logs</code>. To
     *            publish flow log data to Amazon S3, specify <code>s3</code>.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     *            <p>
     *            Default: <code>cloud-watch-logs</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogDestinationType
     */
    public CreateFlowLogsRequest withLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
        return this;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3,
     * specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @param logDestinationType <p>
     *            Specifies the type of destination to which the flow log data
     *            is to be published. Flow log data can be published to
     *            CloudWatch Logs or Amazon S3. To publish flow log data to
     *            CloudWatch Logs, specify <code>cloud-watch-logs</code>. To
     *            publish flow log data to Amazon S3, specify <code>s3</code>.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     *            <p>
     *            Default: <code>cloud-watch-logs</code>
     *            </p>
     * @see LogDestinationType
     */
    public void setLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is to be
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3. To publish flow log data to CloudWatch Logs, specify
     * <code>cloud-watch-logs</code>. To publish flow log data to Amazon S3,
     * specify <code>s3</code>.
     * </p>
     * <p>
     * If you specify <code>LogDestinationType</code> as <code>s3</code>, do not
     * specify <code>DeliverLogsPermissionArn</code> or
     * <code>LogGroupName</code>.
     * </p>
     * <p>
     * Default: <code>cloud-watch-logs</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @param logDestinationType <p>
     *            Specifies the type of destination to which the flow log data
     *            is to be published. Flow log data can be published to
     *            CloudWatch Logs or Amazon S3. To publish flow log data to
     *            CloudWatch Logs, specify <code>cloud-watch-logs</code>. To
     *            publish flow log data to Amazon S3, specify <code>s3</code>.
     *            </p>
     *            <p>
     *            If you specify <code>LogDestinationType</code> as
     *            <code>s3</code>, do not specify
     *            <code>DeliverLogsPermissionArn</code> or
     *            <code>LogGroupName</code>.
     *            </p>
     *            <p>
     *            Default: <code>cloud-watch-logs</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogDestinationType
     */
    public CreateFlowLogsRequest withLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published.
     * Flow log data can be published to a CloudWatch Logs log group or an
     * Amazon S3 bucket. The value specified for this parameter depends on the
     * value specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or
     * <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN) of
     * the CloudWatch Logs log group. For example, to publish to a log group
     * called <code>my-logs</code>, specify
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>.
     * Alternatively, use <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon
     * S3 bucket. You can also specify a subfolder in the bucket. To specify a
     * subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a
     * subfolder named <code>my-logs</code> in a bucket named
     * <code>my-bucket</code>, use the following ARN:
     * <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot use
     * <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     *
     * @return <p>
     *         Specifies the destination to which the flow log data is to be
     *         published. Flow log data can be published to a CloudWatch Logs
     *         log group or an Amazon S3 bucket. The value specified for this
     *         parameter depends on the value specified for
     *         <code>LogDestinationType</code>.
     *         </p>
     *         <p>
     *         If <code>LogDestinationType</code> is not specified or
     *         <code>cloud-watch-logs</code>, specify the Amazon Resource Name
     *         (ARN) of the CloudWatch Logs log group. For example, to publish
     *         to a log group called <code>my-logs</code>, specify
     *         <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>
     *         . Alternatively, use <code>LogGroupName</code> instead.
     *         </p>
     *         <p>
     *         If LogDestinationType is <code>s3</code>, specify the ARN of the
     *         Amazon S3 bucket. You can also specify a subfolder in the bucket.
     *         To specify a subfolder in the bucket, use the following ARN
     *         format: <code>bucket_ARN/subfolder_name/</code>. For example, to
     *         specify a subfolder named <code>my-logs</code> in a bucket named
     *         <code>my-bucket</code>, use the following ARN:
     *         <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot use
     *         <code>AWSLogs</code> as a subfolder name. This is a reserved
     *         term.
     *         </p>
     */
    public String getLogDestination() {
        return logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published.
     * Flow log data can be published to a CloudWatch Logs log group or an
     * Amazon S3 bucket. The value specified for this parameter depends on the
     * value specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or
     * <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN) of
     * the CloudWatch Logs log group. For example, to publish to a log group
     * called <code>my-logs</code>, specify
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>.
     * Alternatively, use <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon
     * S3 bucket. You can also specify a subfolder in the bucket. To specify a
     * subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a
     * subfolder named <code>my-logs</code> in a bucket named
     * <code>my-bucket</code>, use the following ARN:
     * <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot use
     * <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     *
     * @param logDestination <p>
     *            Specifies the destination to which the flow log data is to be
     *            published. Flow log data can be published to a CloudWatch Logs
     *            log group or an Amazon S3 bucket. The value specified for this
     *            parameter depends on the value specified for
     *            <code>LogDestinationType</code>.
     *            </p>
     *            <p>
     *            If <code>LogDestinationType</code> is not specified or
     *            <code>cloud-watch-logs</code>, specify the Amazon Resource
     *            Name (ARN) of the CloudWatch Logs log group. For example, to
     *            publish to a log group called <code>my-logs</code>, specify
     *            <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>
     *            . Alternatively, use <code>LogGroupName</code> instead.
     *            </p>
     *            <p>
     *            If LogDestinationType is <code>s3</code>, specify the ARN of
     *            the Amazon S3 bucket. You can also specify a subfolder in the
     *            bucket. To specify a subfolder in the bucket, use the
     *            following ARN format: <code>bucket_ARN/subfolder_name/</code>.
     *            For example, to specify a subfolder named <code>my-logs</code>
     *            in a bucket named <code>my-bucket</code>, use the following
     *            ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot
     *            use <code>AWSLogs</code> as a subfolder name. This is a
     *            reserved term.
     *            </p>
     */
    public void setLogDestination(String logDestination) {
        this.logDestination = logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is to be published.
     * Flow log data can be published to a CloudWatch Logs log group or an
     * Amazon S3 bucket. The value specified for this parameter depends on the
     * value specified for <code>LogDestinationType</code>.
     * </p>
     * <p>
     * If <code>LogDestinationType</code> is not specified or
     * <code>cloud-watch-logs</code>, specify the Amazon Resource Name (ARN) of
     * the CloudWatch Logs log group. For example, to publish to a log group
     * called <code>my-logs</code>, specify
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>.
     * Alternatively, use <code>LogGroupName</code> instead.
     * </p>
     * <p>
     * If LogDestinationType is <code>s3</code>, specify the ARN of the Amazon
     * S3 bucket. You can also specify a subfolder in the bucket. To specify a
     * subfolder in the bucket, use the following ARN format:
     * <code>bucket_ARN/subfolder_name/</code>. For example, to specify a
     * subfolder named <code>my-logs</code> in a bucket named
     * <code>my-bucket</code>, use the following ARN:
     * <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot use
     * <code>AWSLogs</code> as a subfolder name. This is a reserved term.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logDestination <p>
     *            Specifies the destination to which the flow log data is to be
     *            published. Flow log data can be published to a CloudWatch Logs
     *            log group or an Amazon S3 bucket. The value specified for this
     *            parameter depends on the value specified for
     *            <code>LogDestinationType</code>.
     *            </p>
     *            <p>
     *            If <code>LogDestinationType</code> is not specified or
     *            <code>cloud-watch-logs</code>, specify the Amazon Resource
     *            Name (ARN) of the CloudWatch Logs log group. For example, to
     *            publish to a log group called <code>my-logs</code>, specify
     *            <code>arn:aws:logs:us-east-1:123456789012:log-group:my-logs</code>
     *            . Alternatively, use <code>LogGroupName</code> instead.
     *            </p>
     *            <p>
     *            If LogDestinationType is <code>s3</code>, specify the ARN of
     *            the Amazon S3 bucket. You can also specify a subfolder in the
     *            bucket. To specify a subfolder in the bucket, use the
     *            following ARN format: <code>bucket_ARN/subfolder_name/</code>.
     *            For example, to specify a subfolder named <code>my-logs</code>
     *            in a bucket named <code>my-bucket</code>, use the following
     *            ARN: <code>arn:aws:s3:::my-bucket/my-logs/</code>. You cannot
     *            use <code>AWSLogs</code> as a subfolder name. This is a
     *            reserved term.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withLogDestination(String logDestination) {
        this.logDestination = logDestination;
        return this;
    }

    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they
     * should appear. For a list of available fields, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     * >Flow Log Records</a>. If you omit this parameter, the flow log is
     * created using the default format. If you specify this parameter, you must
     * specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated
     * by spaces. For the AWS CLI, use single quotation marks (' ') to surround
     * the parameter value.
     * </p>
     *
     * @return <p>
     *         The fields to include in the flow log record, in the order in
     *         which they should appear. For a list of available fields, see <a
     *         href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     *         >Flow Log Records</a>. If you omit this parameter, the flow log
     *         is created using the default format. If you specify this
     *         parameter, you must specify at least one field.
     *         </p>
     *         <p>
     *         Specify the fields using the <code>${field-id}</code> format,
     *         separated by spaces. For the AWS CLI, use single quotation marks
     *         (' ') to surround the parameter value.
     *         </p>
     */
    public String getLogFormat() {
        return logFormat;
    }

    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they
     * should appear. For a list of available fields, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     * >Flow Log Records</a>. If you omit this parameter, the flow log is
     * created using the default format. If you specify this parameter, you must
     * specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated
     * by spaces. For the AWS CLI, use single quotation marks (' ') to surround
     * the parameter value.
     * </p>
     *
     * @param logFormat <p>
     *            The fields to include in the flow log record, in the order in
     *            which they should appear. For a list of available fields, see
     *            <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     *            >Flow Log Records</a>. If you omit this parameter, the flow
     *            log is created using the default format. If you specify this
     *            parameter, you must specify at least one field.
     *            </p>
     *            <p>
     *            Specify the fields using the <code>${field-id}</code> format,
     *            separated by spaces. For the AWS CLI, use single quotation
     *            marks (' ') to surround the parameter value.
     *            </p>
     */
    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * <p>
     * The fields to include in the flow log record, in the order in which they
     * should appear. For a list of available fields, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     * >Flow Log Records</a>. If you omit this parameter, the flow log is
     * created using the default format. If you specify this parameter, you must
     * specify at least one field.
     * </p>
     * <p>
     * Specify the fields using the <code>${field-id}</code> format, separated
     * by spaces. For the AWS CLI, use single quotation marks (' ') to surround
     * the parameter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logFormat <p>
     *            The fields to include in the flow log record, in the order in
     *            which they should appear. For a list of available fields, see
     *            <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     *            >Flow Log Records</a>. If you omit this parameter, the flow
     *            log is created using the default format. If you specify this
     *            parameter, you must specify at least one field.
     *            </p>
     *            <p>
     *            Specify the fields using the <code>${field-id}</code> format,
     *            separated by spaces. For the AWS CLI, use single quotation
     *            marks (' ') to surround the parameter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withLogFormat(String logFormat) {
        this.logFormat = logFormat;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the flow logs.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the flow logs.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the flow logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the flow logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the flow logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured
     * and aggregated into a flow log record. You can specify 60 seconds (1
     * minute) or 600 seconds (10 minutes).
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     *
     * @return <p>
     *         The maximum interval of time during which a flow of packets is
     *         captured and aggregated into a flow log record. You can specify
     *         60 seconds (1 minute) or 600 seconds (10 minutes).
     *         </p>
     *         <p>
     *         When a network interface is attached to a <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instance</a>, the aggregation interval is always 60
     *         seconds or less, regardless of the value that you specify.
     *         </p>
     *         <p>
     *         Default: 600
     *         </p>
     */
    public Integer getMaxAggregationInterval() {
        return maxAggregationInterval;
    }

    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured
     * and aggregated into a flow log record. You can specify 60 seconds (1
     * minute) or 600 seconds (10 minutes).
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     *
     * @param maxAggregationInterval <p>
     *            The maximum interval of time during which a flow of packets is
     *            captured and aggregated into a flow log record. You can
     *            specify 60 seconds (1 minute) or 600 seconds (10 minutes).
     *            </p>
     *            <p>
     *            When a network interface is attached to a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instance</a>, the aggregation interval is always
     *            60 seconds or less, regardless of the value that you specify.
     *            </p>
     *            <p>
     *            Default: 600
     *            </p>
     */
    public void setMaxAggregationInterval(Integer maxAggregationInterval) {
        this.maxAggregationInterval = maxAggregationInterval;
    }

    /**
     * <p>
     * The maximum interval of time during which a flow of packets is captured
     * and aggregated into a flow log record. You can specify 60 seconds (1
     * minute) or 600 seconds (10 minutes).
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * or less, regardless of the value that you specify.
     * </p>
     * <p>
     * Default: 600
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAggregationInterval <p>
     *            The maximum interval of time during which a flow of packets is
     *            captured and aggregated into a flow log record. You can
     *            specify 60 seconds (1 minute) or 600 seconds (10 minutes).
     *            </p>
     *            <p>
     *            When a network interface is attached to a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instance</a>, the aggregation interval is always
     *            60 seconds or less, regardless of the value that you specify.
     *            </p>
     *            <p>
     *            Default: 600
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlowLogsRequest withMaxAggregationInterval(Integer maxAggregationInterval) {
        this.maxAggregationInterval = maxAggregationInterval;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDeliverLogsPermissionArn() != null)
            sb.append("DeliverLogsPermissionArn: " + getDeliverLogsPermissionArn() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: " + getResourceIds() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getTrafficType() != null)
            sb.append("TrafficType: " + getTrafficType() + ",");
        if (getLogDestinationType() != null)
            sb.append("LogDestinationType: " + getLogDestinationType() + ",");
        if (getLogDestination() != null)
            sb.append("LogDestination: " + getLogDestination() + ",");
        if (getLogFormat() != null)
            sb.append("LogFormat: " + getLogFormat() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getMaxAggregationInterval() != null)
            sb.append("MaxAggregationInterval: " + getMaxAggregationInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeliverLogsPermissionArn() == null) ? 0 : getDeliverLogsPermissionArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        hashCode = prime * hashCode
                + ((getLogDestinationType() == null) ? 0 : getLogDestinationType().hashCode());
        hashCode = prime * hashCode
                + ((getLogDestination() == null) ? 0 : getLogDestination().hashCode());
        hashCode = prime * hashCode + ((getLogFormat() == null) ? 0 : getLogFormat().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxAggregationInterval() == null) ? 0 : getMaxAggregationInterval()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowLogsRequest == false)
            return false;
        CreateFlowLogsRequest other = (CreateFlowLogsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDeliverLogsPermissionArn() == null
                ^ this.getDeliverLogsPermissionArn() == null)
            return false;
        if (other.getDeliverLogsPermissionArn() != null
                && other.getDeliverLogsPermissionArn().equals(this.getDeliverLogsPermissionArn()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null
                && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTrafficType() == null ^ this.getTrafficType() == null)
            return false;
        if (other.getTrafficType() != null
                && other.getTrafficType().equals(this.getTrafficType()) == false)
            return false;
        if (other.getLogDestinationType() == null ^ this.getLogDestinationType() == null)
            return false;
        if (other.getLogDestinationType() != null
                && other.getLogDestinationType().equals(this.getLogDestinationType()) == false)
            return false;
        if (other.getLogDestination() == null ^ this.getLogDestination() == null)
            return false;
        if (other.getLogDestination() != null
                && other.getLogDestination().equals(this.getLogDestination()) == false)
            return false;
        if (other.getLogFormat() == null ^ this.getLogFormat() == null)
            return false;
        if (other.getLogFormat() != null
                && other.getLogFormat().equals(this.getLogFormat()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getMaxAggregationInterval() == null ^ this.getMaxAggregationInterval() == null)
            return false;
        if (other.getMaxAggregationInterval() != null
                && other.getMaxAggregationInterval().equals(this.getMaxAggregationInterval()) == false)
            return false;
        return true;
    }
}
