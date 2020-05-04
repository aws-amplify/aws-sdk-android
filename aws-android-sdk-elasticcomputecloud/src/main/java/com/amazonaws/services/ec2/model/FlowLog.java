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

/**
 * <p>
 * Describes a flow log.
 * </p>
 */
public class FlowLog implements Serializable {
    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch Logs throttling has been applied for one or
     * more network interfaces, or that you've reached the limit on the number
     * of log groups that you can create. <code>Access error</code> indicates
     * that the IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     * </p>
     */
    private String deliverLogsErrorMessage;

    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     */
    private String deliverLogsPermissionArn;

    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     * </p>
     */
    private String deliverLogsStatus;

    /**
     * <p>
     * The flow log ID.
     * </p>
     */
    private String flowLogId;

    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     */
    private String flowLogStatus;

    /**
     * <p>
     * The name of the flow log group.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     */
    private String trafficType;

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     */
    private String logDestinationType;

    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow
     * log data can be published to an CloudWatch Logs log group or an Amazon S3
     * bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group
     * to which the data is published. If the flow log publishes to Amazon S3,
     * this element indicates the ARN of the Amazon S3 bucket to which the data
     * is published.
     * </p>
     */
    private String logDestination;

    /**
     * <p>
     * The format of the flow log record.
     * </p>
     */
    private String logFormat;

    /**
     * <p>
     * The tags for the flow log.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The maximum interval of time, in seconds, during which a flow of packets
     * is captured and aggregated into a flow log record.
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * (1 minute) or less, regardless of the specified value.
     * </p>
     * <p>
     * Valid Values: <code>60</code> | <code>600</code>
     * </p>
     */
    private Integer maxAggregationInterval;

    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     *
     * @return <p>
     *         The date and time the flow log was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time the flow log was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the flow log was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time the flow log was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch Logs throttling has been applied for one or
     * more network interfaces, or that you've reached the limit on the number
     * of log groups that you can create. <code>Access error</code> indicates
     * that the IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     * </p>
     *
     * @return <p>
     *         Information about the error that occurred.
     *         <code>Rate limited</code> indicates that CloudWatch Logs
     *         throttling has been applied for one or more network interfaces,
     *         or that you've reached the limit on the number of log groups that
     *         you can create. <code>Access error</code> indicates that the IAM
     *         role associated with the flow log does not have sufficient
     *         permissions to publish to CloudWatch Logs.
     *         <code>Unknown error</code> indicates an internal error.
     *         </p>
     */
    public String getDeliverLogsErrorMessage() {
        return deliverLogsErrorMessage;
    }

    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch Logs throttling has been applied for one or
     * more network interfaces, or that you've reached the limit on the number
     * of log groups that you can create. <code>Access error</code> indicates
     * that the IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     * </p>
     *
     * @param deliverLogsErrorMessage <p>
     *            Information about the error that occurred.
     *            <code>Rate limited</code> indicates that CloudWatch Logs
     *            throttling has been applied for one or more network
     *            interfaces, or that you've reached the limit on the number of
     *            log groups that you can create. <code>Access error</code>
     *            indicates that the IAM role associated with the flow log does
     *            not have sufficient permissions to publish to CloudWatch Logs.
     *            <code>Unknown error</code> indicates an internal error.
     *            </p>
     */
    public void setDeliverLogsErrorMessage(String deliverLogsErrorMessage) {
        this.deliverLogsErrorMessage = deliverLogsErrorMessage;
    }

    /**
     * <p>
     * Information about the error that occurred. <code>Rate limited</code>
     * indicates that CloudWatch Logs throttling has been applied for one or
     * more network interfaces, or that you've reached the limit on the number
     * of log groups that you can create. <code>Access error</code> indicates
     * that the IAM role associated with the flow log does not have sufficient
     * permissions to publish to CloudWatch Logs. <code>Unknown error</code>
     * indicates an internal error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliverLogsErrorMessage <p>
     *            Information about the error that occurred.
     *            <code>Rate limited</code> indicates that CloudWatch Logs
     *            throttling has been applied for one or more network
     *            interfaces, or that you've reached the limit on the number of
     *            log groups that you can create. <code>Access error</code>
     *            indicates that the IAM role associated with the flow log does
     *            not have sufficient permissions to publish to CloudWatch Logs.
     *            <code>Unknown error</code> indicates an internal error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withDeliverLogsErrorMessage(String deliverLogsErrorMessage) {
        this.deliverLogsErrorMessage = deliverLogsErrorMessage;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role that posts logs to CloudWatch Logs.
     *         </p>
     */
    public String getDeliverLogsPermissionArn() {
        return deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     *
     * @param deliverLogsPermissionArn <p>
     *            The ARN of the IAM role that posts logs to CloudWatch Logs.
     *            </p>
     */
    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that posts logs to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliverLogsPermissionArn <p>
     *            The ARN of the IAM role that posts logs to CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
        return this;
    }

    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     * </p>
     *
     * @return <p>
     *         The status of the logs delivery (<code>SUCCESS</code> |
     *         <code>FAILED</code>).
     *         </p>
     */
    public String getDeliverLogsStatus() {
        return deliverLogsStatus;
    }

    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     * </p>
     *
     * @param deliverLogsStatus <p>
     *            The status of the logs delivery (<code>SUCCESS</code> |
     *            <code>FAILED</code>).
     *            </p>
     */
    public void setDeliverLogsStatus(String deliverLogsStatus) {
        this.deliverLogsStatus = deliverLogsStatus;
    }

    /**
     * <p>
     * The status of the logs delivery (<code>SUCCESS</code> |
     * <code>FAILED</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliverLogsStatus <p>
     *            The status of the logs delivery (<code>SUCCESS</code> |
     *            <code>FAILED</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withDeliverLogsStatus(String deliverLogsStatus) {
        this.deliverLogsStatus = deliverLogsStatus;
        return this;
    }

    /**
     * <p>
     * The flow log ID.
     * </p>
     *
     * @return <p>
     *         The flow log ID.
     *         </p>
     */
    public String getFlowLogId() {
        return flowLogId;
    }

    /**
     * <p>
     * The flow log ID.
     * </p>
     *
     * @param flowLogId <p>
     *            The flow log ID.
     *            </p>
     */
    public void setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
    }

    /**
     * <p>
     * The flow log ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowLogId <p>
     *            The flow log ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }

    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     *
     * @return <p>
     *         The status of the flow log (<code>ACTIVE</code>).
     *         </p>
     */
    public String getFlowLogStatus() {
        return flowLogStatus;
    }

    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     *
     * @param flowLogStatus <p>
     *            The status of the flow log (<code>ACTIVE</code>).
     *            </p>
     */
    public void setFlowLogStatus(String flowLogStatus) {
        this.flowLogStatus = flowLogStatus;
    }

    /**
     * <p>
     * The status of the flow log (<code>ACTIVE</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowLogStatus <p>
     *            The status of the flow log (<code>ACTIVE</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withFlowLogStatus(String flowLogStatus) {
        this.flowLogStatus = flowLogStatus;
        return this;
    }

    /**
     * <p>
     * The name of the flow log group.
     * </p>
     *
     * @return <p>
     *         The name of the flow log group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the flow log group.
     * </p>
     *
     * @param logGroupName <p>
     *            The name of the flow log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the flow log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logGroupName <p>
     *            The name of the flow log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     *
     * @return <p>
     *         The ID of the resource on which the flow log was created.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     *
     * @param resourceId <p>
     *            The ID of the resource on which the flow log was created.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource on which the flow log was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The ID of the resource on which the flow log was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @return <p>
     *         The type of traffic captured for the flow log.
     *         </p>
     * @see TrafficType
     */
    public String getTrafficType() {
        return trafficType;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic captured for the flow log.
     *            </p>
     * @see TrafficType
     */
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic captured for the flow log.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficType
     */
    public FlowLog withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic captured for the flow log.
     *            </p>
     * @see TrafficType
     */
    public void setTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
    }

    /**
     * <p>
     * The type of traffic captured for the flow log.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType <p>
     *            The type of traffic captured for the flow log.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficType
     */
    public FlowLog withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @return <p>
     *         Specifies the type of destination to which the flow log data is
     *         published. Flow log data can be published to CloudWatch Logs or
     *         Amazon S3.
     *         </p>
     * @see LogDestinationType
     */
    public String getLogDestinationType() {
        return logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @param logDestinationType <p>
     *            Specifies the type of destination to which the flow log data
     *            is published. Flow log data can be published to CloudWatch
     *            Logs or Amazon S3.
     *            </p>
     * @see LogDestinationType
     */
    public void setLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3.
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
     *            is published. Flow log data can be published to CloudWatch
     *            Logs or Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogDestinationType
     */
    public FlowLog withLogDestinationType(String logDestinationType) {
        this.logDestinationType = logDestinationType;
        return this;
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cloud-watch-logs, s3
     *
     * @param logDestinationType <p>
     *            Specifies the type of destination to which the flow log data
     *            is published. Flow log data can be published to CloudWatch
     *            Logs or Amazon S3.
     *            </p>
     * @see LogDestinationType
     */
    public void setLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
    }

    /**
     * <p>
     * Specifies the type of destination to which the flow log data is
     * published. Flow log data can be published to CloudWatch Logs or Amazon
     * S3.
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
     *            is published. Flow log data can be published to CloudWatch
     *            Logs or Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogDestinationType
     */
    public FlowLog withLogDestinationType(LogDestinationType logDestinationType) {
        this.logDestinationType = logDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow
     * log data can be published to an CloudWatch Logs log group or an Amazon S3
     * bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group
     * to which the data is published. If the flow log publishes to Amazon S3,
     * this element indicates the ARN of the Amazon S3 bucket to which the data
     * is published.
     * </p>
     *
     * @return <p>
     *         Specifies the destination to which the flow log data is
     *         published. Flow log data can be published to an CloudWatch Logs
     *         log group or an Amazon S3 bucket. If the flow log publishes to
     *         CloudWatch Logs, this element indicates the Amazon Resource Name
     *         (ARN) of the CloudWatch Logs log group to which the data is
     *         published. If the flow log publishes to Amazon S3, this element
     *         indicates the ARN of the Amazon S3 bucket to which the data is
     *         published.
     *         </p>
     */
    public String getLogDestination() {
        return logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow
     * log data can be published to an CloudWatch Logs log group or an Amazon S3
     * bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group
     * to which the data is published. If the flow log publishes to Amazon S3,
     * this element indicates the ARN of the Amazon S3 bucket to which the data
     * is published.
     * </p>
     *
     * @param logDestination <p>
     *            Specifies the destination to which the flow log data is
     *            published. Flow log data can be published to an CloudWatch
     *            Logs log group or an Amazon S3 bucket. If the flow log
     *            publishes to CloudWatch Logs, this element indicates the
     *            Amazon Resource Name (ARN) of the CloudWatch Logs log group to
     *            which the data is published. If the flow log publishes to
     *            Amazon S3, this element indicates the ARN of the Amazon S3
     *            bucket to which the data is published.
     *            </p>
     */
    public void setLogDestination(String logDestination) {
        this.logDestination = logDestination;
    }

    /**
     * <p>
     * Specifies the destination to which the flow log data is published. Flow
     * log data can be published to an CloudWatch Logs log group or an Amazon S3
     * bucket. If the flow log publishes to CloudWatch Logs, this element
     * indicates the Amazon Resource Name (ARN) of the CloudWatch Logs log group
     * to which the data is published. If the flow log publishes to Amazon S3,
     * this element indicates the ARN of the Amazon S3 bucket to which the data
     * is published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logDestination <p>
     *            Specifies the destination to which the flow log data is
     *            published. Flow log data can be published to an CloudWatch
     *            Logs log group or an Amazon S3 bucket. If the flow log
     *            publishes to CloudWatch Logs, this element indicates the
     *            Amazon Resource Name (ARN) of the CloudWatch Logs log group to
     *            which the data is published. If the flow log publishes to
     *            Amazon S3, this element indicates the ARN of the Amazon S3
     *            bucket to which the data is published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withLogDestination(String logDestination) {
        this.logDestination = logDestination;
        return this;
    }

    /**
     * <p>
     * The format of the flow log record.
     * </p>
     *
     * @return <p>
     *         The format of the flow log record.
     *         </p>
     */
    public String getLogFormat() {
        return logFormat;
    }

    /**
     * <p>
     * The format of the flow log record.
     * </p>
     *
     * @param logFormat <p>
     *            The format of the flow log record.
     *            </p>
     */
    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * <p>
     * The format of the flow log record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logFormat <p>
     *            The format of the flow log record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withLogFormat(String logFormat) {
        this.logFormat = logFormat;
        return this;
    }

    /**
     * <p>
     * The tags for the flow log.
     * </p>
     *
     * @return <p>
     *         The tags for the flow log.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the flow log.
     * </p>
     *
     * @param tags <p>
     *            The tags for the flow log.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the flow log.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the flow log.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the flow log.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the flow log.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The maximum interval of time, in seconds, during which a flow of packets
     * is captured and aggregated into a flow log record.
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * (1 minute) or less, regardless of the specified value.
     * </p>
     * <p>
     * Valid Values: <code>60</code> | <code>600</code>
     * </p>
     *
     * @return <p>
     *         The maximum interval of time, in seconds, during which a flow of
     *         packets is captured and aggregated into a flow log record.
     *         </p>
     *         <p>
     *         When a network interface is attached to a <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Nitro-based instance</a>, the aggregation interval is always 60
     *         seconds (1 minute) or less, regardless of the specified value.
     *         </p>
     *         <p>
     *         Valid Values: <code>60</code> | <code>600</code>
     *         </p>
     */
    public Integer getMaxAggregationInterval() {
        return maxAggregationInterval;
    }

    /**
     * <p>
     * The maximum interval of time, in seconds, during which a flow of packets
     * is captured and aggregated into a flow log record.
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * (1 minute) or less, regardless of the specified value.
     * </p>
     * <p>
     * Valid Values: <code>60</code> | <code>600</code>
     * </p>
     *
     * @param maxAggregationInterval <p>
     *            The maximum interval of time, in seconds, during which a flow
     *            of packets is captured and aggregated into a flow log record.
     *            </p>
     *            <p>
     *            When a network interface is attached to a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instance</a>, the aggregation interval is always
     *            60 seconds (1 minute) or less, regardless of the specified
     *            value.
     *            </p>
     *            <p>
     *            Valid Values: <code>60</code> | <code>600</code>
     *            </p>
     */
    public void setMaxAggregationInterval(Integer maxAggregationInterval) {
        this.maxAggregationInterval = maxAggregationInterval;
    }

    /**
     * <p>
     * The maximum interval of time, in seconds, during which a flow of packets
     * is captured and aggregated into a flow log record.
     * </p>
     * <p>
     * When a network interface is attached to a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     * >Nitro-based instance</a>, the aggregation interval is always 60 seconds
     * (1 minute) or less, regardless of the specified value.
     * </p>
     * <p>
     * Valid Values: <code>60</code> | <code>600</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAggregationInterval <p>
     *            The maximum interval of time, in seconds, during which a flow
     *            of packets is captured and aggregated into a flow log record.
     *            </p>
     *            <p>
     *            When a network interface is attached to a <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *            >Nitro-based instance</a>, the aggregation interval is always
     *            60 seconds (1 minute) or less, regardless of the specified
     *            value.
     *            </p>
     *            <p>
     *            Valid Values: <code>60</code> | <code>600</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FlowLog withMaxAggregationInterval(Integer maxAggregationInterval) {
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
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDeliverLogsErrorMessage() != null)
            sb.append("DeliverLogsErrorMessage: " + getDeliverLogsErrorMessage() + ",");
        if (getDeliverLogsPermissionArn() != null)
            sb.append("DeliverLogsPermissionArn: " + getDeliverLogsPermissionArn() + ",");
        if (getDeliverLogsStatus() != null)
            sb.append("DeliverLogsStatus: " + getDeliverLogsStatus() + ",");
        if (getFlowLogId() != null)
            sb.append("FlowLogId: " + getFlowLogId() + ",");
        if (getFlowLogStatus() != null)
            sb.append("FlowLogStatus: " + getFlowLogStatus() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTrafficType() != null)
            sb.append("TrafficType: " + getTrafficType() + ",");
        if (getLogDestinationType() != null)
            sb.append("LogDestinationType: " + getLogDestinationType() + ",");
        if (getLogDestination() != null)
            sb.append("LogDestination: " + getLogDestination() + ",");
        if (getLogFormat() != null)
            sb.append("LogFormat: " + getLogFormat() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getMaxAggregationInterval() != null)
            sb.append("MaxAggregationInterval: " + getMaxAggregationInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeliverLogsErrorMessage() == null) ? 0 : getDeliverLogsErrorMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeliverLogsPermissionArn() == null) ? 0 : getDeliverLogsPermissionArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeliverLogsStatus() == null) ? 0 : getDeliverLogsStatus().hashCode());
        hashCode = prime * hashCode + ((getFlowLogId() == null) ? 0 : getFlowLogId().hashCode());
        hashCode = prime * hashCode
                + ((getFlowLogStatus() == null) ? 0 : getFlowLogStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        hashCode = prime * hashCode
                + ((getLogDestinationType() == null) ? 0 : getLogDestinationType().hashCode());
        hashCode = prime * hashCode
                + ((getLogDestination() == null) ? 0 : getLogDestination().hashCode());
        hashCode = prime * hashCode + ((getLogFormat() == null) ? 0 : getLogFormat().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof FlowLog == false)
            return false;
        FlowLog other = (FlowLog) obj;

        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeliverLogsErrorMessage() == null ^ this.getDeliverLogsErrorMessage() == null)
            return false;
        if (other.getDeliverLogsErrorMessage() != null
                && other.getDeliverLogsErrorMessage().equals(this.getDeliverLogsErrorMessage()) == false)
            return false;
        if (other.getDeliverLogsPermissionArn() == null
                ^ this.getDeliverLogsPermissionArn() == null)
            return false;
        if (other.getDeliverLogsPermissionArn() != null
                && other.getDeliverLogsPermissionArn().equals(this.getDeliverLogsPermissionArn()) == false)
            return false;
        if (other.getDeliverLogsStatus() == null ^ this.getDeliverLogsStatus() == null)
            return false;
        if (other.getDeliverLogsStatus() != null
                && other.getDeliverLogsStatus().equals(this.getDeliverLogsStatus()) == false)
            return false;
        if (other.getFlowLogId() == null ^ this.getFlowLogId() == null)
            return false;
        if (other.getFlowLogId() != null
                && other.getFlowLogId().equals(this.getFlowLogId()) == false)
            return false;
        if (other.getFlowLogStatus() == null ^ this.getFlowLogStatus() == null)
            return false;
        if (other.getFlowLogStatus() != null
                && other.getFlowLogStatus().equals(this.getFlowLogStatus()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getMaxAggregationInterval() == null ^ this.getMaxAggregationInterval() == null)
            return false;
        if (other.getMaxAggregationInterval() != null
                && other.getMaxAggregationInterval().equals(this.getMaxAggregationInterval()) == false)
            return false;
        return true;
    }
}
