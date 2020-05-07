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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates an alarm, and associates it with the specified metric.
 * </p>
 * <p>
 * An alarm is used to monitor a single metric for one of your resources. When a
 * metric condition is met, the alarm can notify you by email, SMS text message,
 * and a banner displayed on the Amazon Lightsail console. For more information,
 * see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
 * >Alarms in Amazon Lightsail</a>.
 * </p>
 * <p>
 * When this action creates an alarm, the alarm state is immediately set to
 * <code>INSUFFICIENT_DATA</code>. The alarm is then evaluated and its state is
 * set appropriately. Any actions associated with the new state are then
 * executed.
 * </p>
 * <p>
 * When you update an existing alarm, its state is left unchanged, but the
 * update completely overwrites the previous configuration of the alarm. The
 * alarm is then evaluated with the updated configuration.
 * </p>
 */
public class PutAlarmRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the alarm. Specify the name of an existing alarm to update,
     * and overwrite the previous configuration of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String alarmName;

    /**
     * <p>
     * The name of the metric to associate with the alarm.
     * </p>
     * <p>
     * You can configure up to two alarms per metric.
     * </p>
     * <p>
     * The following metrics are available for each resource type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instances</b>: <code>CPUUtilization</code>, <code>NetworkIn</code>,
     * <code>NetworkOut</code>, <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Load balancers</b>: <code>ClientTLSNegotiationErrorCount</code>,
     * <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>,
     * <code>HTTPCode_LB_4XX_Count</code>, <code>HTTPCode_LB_5XX_Count</code>,
     * <code>HTTPCode_Instance_2XX_Count</code>,
     * <code>HTTPCode_Instance_3XX_Count</code>,
     * <code>HTTPCode_Instance_4XX_Count</code>,
     * <code>HTTPCode_Instance_5XX_Count</code>,
     * <code>InstanceResponseTime</code>, <code>RejectedConnectionCount</code>,
     * and <code>RequestCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Relational databases</b>: <code>CPUUtilization</code>,
     * <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     * <code>FreeStorageSpace</code>, <code>NetworkReceiveThroughput</code>, and
     * <code>NetworkTransmitThroughput</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System,
     * ClientTLSNegotiationErrorCount, HealthyHostCount, UnhealthyHostCount,
     * HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount,
     * DatabaseConnections, DiskQueueDepth, FreeStorageSpace,
     * NetworkReceiveThroughput, NetworkTransmitThroughput
     */
    private String metricName;

    /**
     * <p>
     * The name of the Lightsail resource that will be monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String monitoredResourceName;

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic to
     * the threshold. The specified statistic value is used as the first
     * operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     */
    private String comparisonOperator;

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     */
    private Double threshold;

    /**
     * <p>
     * The number of most recent periods over which data is compared to the
     * specified threshold. If you are setting an "M out of N" alarm, this value
     * (<code>evaluationPeriods</code>) is the N.
     * </p>
     * <p>
     * If you are setting an alarm that requires that a number of consecutive
     * data points be breaching to trigger the alarm, this value specifies the
     * rolling period of time in which data points are evaluated.
     * </p>
     * <p>
     * Each evaluation period is five minutes long. For example, specify an
     * evaluation period of 24 to evaluate a metric over a rolling period of two
     * hours.
     * </p>
     * <p>
     * You can specify a minimum valuation period of 1 (5 minutes), and a
     * maximum evaluation period of 288 (24 hours).
     * </p>
     */
    private Integer evaluationPeriods;

    /**
     * <p>
     * The number of data points that must be not within the specified threshold
     * to trigger the alarm. If you are setting an "M out of N" alarm, this
     * value (<code>datapointsToAlarm</code>) is the M.
     * </p>
     */
    private Integer datapointsToAlarm;

    /**
     * <p>
     * Sets how this alarm will handle missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> - Assume the missing data is not within the
     * threshold. Missing data counts towards the number of times the metric is
     * not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> - Assume the missing data is within the
     * threshold. Missing data does not count towards the number of times the
     * metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> - Ignore the missing data. Maintains the current
     * alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> - Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>treatMissingData</code> is not specified, the default behavior
     * of <code>missing</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     */
    private String treatMissingData;

    /**
     * <p>
     * The contact protocols to use for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * A notification is sent via the specified contact protocol if
     * notifications are enabled for the alarm, and when the alarm is triggered.
     * </p>
     * <p>
     * A notification is not sent if a contact protocol is not specified, if the
     * specified contact protocol is not configured in the AWS Region, or if
     * notifications are not enabled for the alarm using the
     * <code>notificationEnabled</code> paramater.
     * </p>
     * <p>
     * Use the <code>CreateContactMethod</code> action to configure a contact
     * protocol in an AWS Region.
     * </p>
     */
    private java.util.List<String> contactProtocols;

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a notification trigger, the <code>ALARM</code> state
     * must be specified. The <code>INSUFFICIENT_DATA</code> and <code>OK</code>
     * states can be specified in addition to the <code>ALARM</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>OK</code> as an alarm trigger, a notification is
     * sent when the alarm switches from an <code>ALARM</code> or
     * <code>INSUFFICIENT_DATA</code> alarm state to an <code>OK</code> state.
     * This can be thought of as an <i>all clear</i> alarm notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>INSUFFICIENT_DATA</code> as the alarm trigger, a
     * notification is sent when the alarm switches from an <code>OK</code> or
     * <code>ALARM</code> alarm state to an <code>INSUFFICIENT_DATA</code>
     * state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The notification trigger defaults to <code>ALARM</code> if you don't
     * specify this parameter.
     * </p>
     */
    private java.util.List<String> notificationTriggers;

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * <p>
     * Notifications are enabled by default if you don't specify this parameter.
     * </p>
     */
    private Boolean notificationEnabled;

    /**
     * <p>
     * The name for the alarm. Specify the name of an existing alarm to update,
     * and overwrite the previous configuration of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name for the alarm. Specify the name of an existing alarm to
     *         update, and overwrite the previous configuration of the alarm.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The name for the alarm. Specify the name of an existing alarm to update,
     * and overwrite the previous configuration of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name for the alarm. Specify the name of an existing alarm
     *            to update, and overwrite the previous configuration of the
     *            alarm.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name for the alarm. Specify the name of an existing alarm to update,
     * and overwrite the previous configuration of the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name for the alarm. Specify the name of an existing alarm
     *            to update, and overwrite the previous configuration of the
     *            alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * <p>
     * The name of the metric to associate with the alarm.
     * </p>
     * <p>
     * You can configure up to two alarms per metric.
     * </p>
     * <p>
     * The following metrics are available for each resource type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instances</b>: <code>CPUUtilization</code>, <code>NetworkIn</code>,
     * <code>NetworkOut</code>, <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Load balancers</b>: <code>ClientTLSNegotiationErrorCount</code>,
     * <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>,
     * <code>HTTPCode_LB_4XX_Count</code>, <code>HTTPCode_LB_5XX_Count</code>,
     * <code>HTTPCode_Instance_2XX_Count</code>,
     * <code>HTTPCode_Instance_3XX_Count</code>,
     * <code>HTTPCode_Instance_4XX_Count</code>,
     * <code>HTTPCode_Instance_5XX_Count</code>,
     * <code>InstanceResponseTime</code>, <code>RejectedConnectionCount</code>,
     * and <code>RequestCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Relational databases</b>: <code>CPUUtilization</code>,
     * <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     * <code>FreeStorageSpace</code>, <code>NetworkReceiveThroughput</code>, and
     * <code>NetworkTransmitThroughput</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System,
     * ClientTLSNegotiationErrorCount, HealthyHostCount, UnhealthyHostCount,
     * HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount,
     * DatabaseConnections, DiskQueueDepth, FreeStorageSpace,
     * NetworkReceiveThroughput, NetworkTransmitThroughput
     *
     * @return <p>
     *         The name of the metric to associate with the alarm.
     *         </p>
     *         <p>
     *         You can configure up to two alarms per metric.
     *         </p>
     *         <p>
     *         The following metrics are available for each resource type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Instances</b>: <code>CPUUtilization</code>,
     *         <code>NetworkIn</code>, <code>NetworkOut</code>,
     *         <code>StatusCheckFailed</code>,
     *         <code>StatusCheckFailed_Instance</code>, and
     *         <code>StatusCheckFailed_System</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Load balancers</b>:
     *         <code>ClientTLSNegotiationErrorCount</code>,
     *         <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>,
     *         <code>HTTPCode_LB_4XX_Count</code>,
     *         <code>HTTPCode_LB_5XX_Count</code>,
     *         <code>HTTPCode_Instance_2XX_Count</code>,
     *         <code>HTTPCode_Instance_3XX_Count</code>,
     *         <code>HTTPCode_Instance_4XX_Count</code>,
     *         <code>HTTPCode_Instance_5XX_Count</code>,
     *         <code>InstanceResponseTime</code>,
     *         <code>RejectedConnectionCount</code>, and
     *         <code>RequestCount</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Relational databases</b>: <code>CPUUtilization</code>,
     *         <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     *         <code>FreeStorageSpace</code>,
     *         <code>NetworkReceiveThroughput</code>, and
     *         <code>NetworkTransmitThroughput</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see MetricName
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric to associate with the alarm.
     * </p>
     * <p>
     * You can configure up to two alarms per metric.
     * </p>
     * <p>
     * The following metrics are available for each resource type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instances</b>: <code>CPUUtilization</code>, <code>NetworkIn</code>,
     * <code>NetworkOut</code>, <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Load balancers</b>: <code>ClientTLSNegotiationErrorCount</code>,
     * <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>,
     * <code>HTTPCode_LB_4XX_Count</code>, <code>HTTPCode_LB_5XX_Count</code>,
     * <code>HTTPCode_Instance_2XX_Count</code>,
     * <code>HTTPCode_Instance_3XX_Count</code>,
     * <code>HTTPCode_Instance_4XX_Count</code>,
     * <code>HTTPCode_Instance_5XX_Count</code>,
     * <code>InstanceResponseTime</code>, <code>RejectedConnectionCount</code>,
     * and <code>RequestCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Relational databases</b>: <code>CPUUtilization</code>,
     * <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     * <code>FreeStorageSpace</code>, <code>NetworkReceiveThroughput</code>, and
     * <code>NetworkTransmitThroughput</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System,
     * ClientTLSNegotiationErrorCount, HealthyHostCount, UnhealthyHostCount,
     * HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount,
     * DatabaseConnections, DiskQueueDepth, FreeStorageSpace,
     * NetworkReceiveThroughput, NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric to associate with the alarm.
     *            </p>
     *            <p>
     *            You can configure up to two alarms per metric.
     *            </p>
     *            <p>
     *            The following metrics are available for each resource type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Instances</b>: <code>CPUUtilization</code>,
     *            <code>NetworkIn</code>, <code>NetworkOut</code>,
     *            <code>StatusCheckFailed</code>,
     *            <code>StatusCheckFailed_Instance</code>, and
     *            <code>StatusCheckFailed_System</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Load balancers</b>:
     *            <code>ClientTLSNegotiationErrorCount</code>,
     *            <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>, <code>HTTPCode_LB_4XX_Count</code>,
     *            <code>HTTPCode_LB_5XX_Count</code>,
     *            <code>HTTPCode_Instance_2XX_Count</code>,
     *            <code>HTTPCode_Instance_3XX_Count</code>,
     *            <code>HTTPCode_Instance_4XX_Count</code>,
     *            <code>HTTPCode_Instance_5XX_Count</code>,
     *            <code>InstanceResponseTime</code>,
     *            <code>RejectedConnectionCount</code>, and
     *            <code>RequestCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Relational databases</b>: <code>CPUUtilization</code>,
     *            <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     *            <code>FreeStorageSpace</code>,
     *            <code>NetworkReceiveThroughput</code>, and
     *            <code>NetworkTransmitThroughput</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MetricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric to associate with the alarm.
     * </p>
     * <p>
     * You can configure up to two alarms per metric.
     * </p>
     * <p>
     * The following metrics are available for each resource type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instances</b>: <code>CPUUtilization</code>, <code>NetworkIn</code>,
     * <code>NetworkOut</code>, <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Load balancers</b>: <code>ClientTLSNegotiationErrorCount</code>,
     * <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>,
     * <code>HTTPCode_LB_4XX_Count</code>, <code>HTTPCode_LB_5XX_Count</code>,
     * <code>HTTPCode_Instance_2XX_Count</code>,
     * <code>HTTPCode_Instance_3XX_Count</code>,
     * <code>HTTPCode_Instance_4XX_Count</code>,
     * <code>HTTPCode_Instance_5XX_Count</code>,
     * <code>InstanceResponseTime</code>, <code>RejectedConnectionCount</code>,
     * and <code>RequestCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Relational databases</b>: <code>CPUUtilization</code>,
     * <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     * <code>FreeStorageSpace</code>, <code>NetworkReceiveThroughput</code>, and
     * <code>NetworkTransmitThroughput</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System,
     * ClientTLSNegotiationErrorCount, HealthyHostCount, UnhealthyHostCount,
     * HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount,
     * DatabaseConnections, DiskQueueDepth, FreeStorageSpace,
     * NetworkReceiveThroughput, NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric to associate with the alarm.
     *            </p>
     *            <p>
     *            You can configure up to two alarms per metric.
     *            </p>
     *            <p>
     *            The following metrics are available for each resource type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Instances</b>: <code>CPUUtilization</code>,
     *            <code>NetworkIn</code>, <code>NetworkOut</code>,
     *            <code>StatusCheckFailed</code>,
     *            <code>StatusCheckFailed_Instance</code>, and
     *            <code>StatusCheckFailed_System</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Load balancers</b>:
     *            <code>ClientTLSNegotiationErrorCount</code>,
     *            <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>, <code>HTTPCode_LB_4XX_Count</code>,
     *            <code>HTTPCode_LB_5XX_Count</code>,
     *            <code>HTTPCode_Instance_2XX_Count</code>,
     *            <code>HTTPCode_Instance_3XX_Count</code>,
     *            <code>HTTPCode_Instance_4XX_Count</code>,
     *            <code>HTTPCode_Instance_5XX_Count</code>,
     *            <code>InstanceResponseTime</code>,
     *            <code>RejectedConnectionCount</code>, and
     *            <code>RequestCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Relational databases</b>: <code>CPUUtilization</code>,
     *            <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     *            <code>FreeStorageSpace</code>,
     *            <code>NetworkReceiveThroughput</code>, and
     *            <code>NetworkTransmitThroughput</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricName
     */
    public PutAlarmRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The name of the metric to associate with the alarm.
     * </p>
     * <p>
     * You can configure up to two alarms per metric.
     * </p>
     * <p>
     * The following metrics are available for each resource type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instances</b>: <code>CPUUtilization</code>, <code>NetworkIn</code>,
     * <code>NetworkOut</code>, <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Load balancers</b>: <code>ClientTLSNegotiationErrorCount</code>,
     * <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>,
     * <code>HTTPCode_LB_4XX_Count</code>, <code>HTTPCode_LB_5XX_Count</code>,
     * <code>HTTPCode_Instance_2XX_Count</code>,
     * <code>HTTPCode_Instance_3XX_Count</code>,
     * <code>HTTPCode_Instance_4XX_Count</code>,
     * <code>HTTPCode_Instance_5XX_Count</code>,
     * <code>InstanceResponseTime</code>, <code>RejectedConnectionCount</code>,
     * and <code>RequestCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Relational databases</b>: <code>CPUUtilization</code>,
     * <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     * <code>FreeStorageSpace</code>, <code>NetworkReceiveThroughput</code>, and
     * <code>NetworkTransmitThroughput</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System,
     * ClientTLSNegotiationErrorCount, HealthyHostCount, UnhealthyHostCount,
     * HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount,
     * DatabaseConnections, DiskQueueDepth, FreeStorageSpace,
     * NetworkReceiveThroughput, NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric to associate with the alarm.
     *            </p>
     *            <p>
     *            You can configure up to two alarms per metric.
     *            </p>
     *            <p>
     *            The following metrics are available for each resource type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Instances</b>: <code>CPUUtilization</code>,
     *            <code>NetworkIn</code>, <code>NetworkOut</code>,
     *            <code>StatusCheckFailed</code>,
     *            <code>StatusCheckFailed_Instance</code>, and
     *            <code>StatusCheckFailed_System</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Load balancers</b>:
     *            <code>ClientTLSNegotiationErrorCount</code>,
     *            <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>, <code>HTTPCode_LB_4XX_Count</code>,
     *            <code>HTTPCode_LB_5XX_Count</code>,
     *            <code>HTTPCode_Instance_2XX_Count</code>,
     *            <code>HTTPCode_Instance_3XX_Count</code>,
     *            <code>HTTPCode_Instance_4XX_Count</code>,
     *            <code>HTTPCode_Instance_5XX_Count</code>,
     *            <code>InstanceResponseTime</code>,
     *            <code>RejectedConnectionCount</code>, and
     *            <code>RequestCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Relational databases</b>: <code>CPUUtilization</code>,
     *            <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     *            <code>FreeStorageSpace</code>,
     *            <code>NetworkReceiveThroughput</code>, and
     *            <code>NetworkTransmitThroughput</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MetricName
     */
    public void setMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
    }

    /**
     * <p>
     * The name of the metric to associate with the alarm.
     * </p>
     * <p>
     * You can configure up to two alarms per metric.
     * </p>
     * <p>
     * The following metrics are available for each resource type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instances</b>: <code>CPUUtilization</code>, <code>NetworkIn</code>,
     * <code>NetworkOut</code>, <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Load balancers</b>: <code>ClientTLSNegotiationErrorCount</code>,
     * <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>,
     * <code>HTTPCode_LB_4XX_Count</code>, <code>HTTPCode_LB_5XX_Count</code>,
     * <code>HTTPCode_Instance_2XX_Count</code>,
     * <code>HTTPCode_Instance_3XX_Count</code>,
     * <code>HTTPCode_Instance_4XX_Count</code>,
     * <code>HTTPCode_Instance_5XX_Count</code>,
     * <code>InstanceResponseTime</code>, <code>RejectedConnectionCount</code>,
     * and <code>RequestCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Relational databases</b>: <code>CPUUtilization</code>,
     * <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     * <code>FreeStorageSpace</code>, <code>NetworkReceiveThroughput</code>, and
     * <code>NetworkTransmitThroughput</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System,
     * ClientTLSNegotiationErrorCount, HealthyHostCount, UnhealthyHostCount,
     * HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount,
     * DatabaseConnections, DiskQueueDepth, FreeStorageSpace,
     * NetworkReceiveThroughput, NetworkTransmitThroughput
     *
     * @param metricName <p>
     *            The name of the metric to associate with the alarm.
     *            </p>
     *            <p>
     *            You can configure up to two alarms per metric.
     *            </p>
     *            <p>
     *            The following metrics are available for each resource type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Instances</b>: <code>CPUUtilization</code>,
     *            <code>NetworkIn</code>, <code>NetworkOut</code>,
     *            <code>StatusCheckFailed</code>,
     *            <code>StatusCheckFailed_Instance</code>, and
     *            <code>StatusCheckFailed_System</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Load balancers</b>:
     *            <code>ClientTLSNegotiationErrorCount</code>,
     *            <code>HealthyHostCount</code>, <code>UnhealthyHostCount</code>, <code>HTTPCode_LB_4XX_Count</code>,
     *            <code>HTTPCode_LB_5XX_Count</code>,
     *            <code>HTTPCode_Instance_2XX_Count</code>,
     *            <code>HTTPCode_Instance_3XX_Count</code>,
     *            <code>HTTPCode_Instance_4XX_Count</code>,
     *            <code>HTTPCode_Instance_5XX_Count</code>,
     *            <code>InstanceResponseTime</code>,
     *            <code>RejectedConnectionCount</code>, and
     *            <code>RequestCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Relational databases</b>: <code>CPUUtilization</code>,
     *            <code>DatabaseConnections</code>, <code>DiskQueueDepth</code>,
     *            <code>FreeStorageSpace</code>,
     *            <code>NetworkReceiveThroughput</code>, and
     *            <code>NetworkTransmitThroughput</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricName
     */
    public PutAlarmRequest withMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The name of the Lightsail resource that will be monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the Lightsail resource that will be monitored.
     *         </p>
     *         <p>
     *         Instances, load balancers, and relational databases are the only
     *         Lightsail resources that can currently be monitored by alarms.
     *         </p>
     */
    public String getMonitoredResourceName() {
        return monitoredResourceName;
    }

    /**
     * <p>
     * The name of the Lightsail resource that will be monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param monitoredResourceName <p>
     *            The name of the Lightsail resource that will be monitored.
     *            </p>
     *            <p>
     *            Instances, load balancers, and relational databases are the
     *            only Lightsail resources that can currently be monitored by
     *            alarms.
     *            </p>
     */
    public void setMonitoredResourceName(String monitoredResourceName) {
        this.monitoredResourceName = monitoredResourceName;
    }

    /**
     * <p>
     * The name of the Lightsail resource that will be monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only
     * Lightsail resources that can currently be monitored by alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param monitoredResourceName <p>
     *            The name of the Lightsail resource that will be monitored.
     *            </p>
     *            <p>
     *            Instances, load balancers, and relational databases are the
     *            only Lightsail resources that can currently be monitored by
     *            alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withMonitoredResourceName(String monitoredResourceName) {
        this.monitoredResourceName = monitoredResourceName;
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic to
     * the threshold. The specified statistic value is used as the first
     * operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @return <p>
     *         The arithmetic operation to use when comparing the specified
     *         statistic to the threshold. The specified statistic value is used
     *         as the first operand.
     *         </p>
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic to
     * the threshold. The specified statistic value is used as the first
     * operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation to use when comparing the specified
     *            statistic to the threshold. The specified statistic value is
     *            used as the first operand.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic to
     * the threshold. The specified statistic value is used as the first
     * operand.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation to use when comparing the specified
     *            statistic to the threshold. The specified statistic value is
     *            used as the first operand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public PutAlarmRequest withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic to
     * the threshold. The specified statistic value is used as the first
     * operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation to use when comparing the specified
     *            statistic to the threshold. The specified statistic value is
     *            used as the first operand.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic to
     * the threshold. The specified statistic value is used as the first
     * operand.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation to use when comparing the specified
     *            statistic to the threshold. The specified statistic value is
     *            used as the first operand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public PutAlarmRequest withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     *
     * @return <p>
     *         The value against which the specified statistic is compared.
     *         </p>
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     *
     * @param threshold <p>
     *            The value against which the specified statistic is compared.
     *            </p>
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threshold <p>
     *            The value against which the specified statistic is compared.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * <p>
     * The number of most recent periods over which data is compared to the
     * specified threshold. If you are setting an "M out of N" alarm, this value
     * (<code>evaluationPeriods</code>) is the N.
     * </p>
     * <p>
     * If you are setting an alarm that requires that a number of consecutive
     * data points be breaching to trigger the alarm, this value specifies the
     * rolling period of time in which data points are evaluated.
     * </p>
     * <p>
     * Each evaluation period is five minutes long. For example, specify an
     * evaluation period of 24 to evaluate a metric over a rolling period of two
     * hours.
     * </p>
     * <p>
     * You can specify a minimum valuation period of 1 (5 minutes), and a
     * maximum evaluation period of 288 (24 hours).
     * </p>
     *
     * @return <p>
     *         The number of most recent periods over which data is compared to
     *         the specified threshold. If you are setting an "M out of N"
     *         alarm, this value (<code>evaluationPeriods</code>) is the N.
     *         </p>
     *         <p>
     *         If you are setting an alarm that requires that a number of
     *         consecutive data points be breaching to trigger the alarm, this
     *         value specifies the rolling period of time in which data points
     *         are evaluated.
     *         </p>
     *         <p>
     *         Each evaluation period is five minutes long. For example, specify
     *         an evaluation period of 24 to evaluate a metric over a rolling
     *         period of two hours.
     *         </p>
     *         <p>
     *         You can specify a minimum valuation period of 1 (5 minutes), and
     *         a maximum evaluation period of 288 (24 hours).
     *         </p>
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    /**
     * <p>
     * The number of most recent periods over which data is compared to the
     * specified threshold. If you are setting an "M out of N" alarm, this value
     * (<code>evaluationPeriods</code>) is the N.
     * </p>
     * <p>
     * If you are setting an alarm that requires that a number of consecutive
     * data points be breaching to trigger the alarm, this value specifies the
     * rolling period of time in which data points are evaluated.
     * </p>
     * <p>
     * Each evaluation period is five minutes long. For example, specify an
     * evaluation period of 24 to evaluate a metric over a rolling period of two
     * hours.
     * </p>
     * <p>
     * You can specify a minimum valuation period of 1 (5 minutes), and a
     * maximum evaluation period of 288 (24 hours).
     * </p>
     *
     * @param evaluationPeriods <p>
     *            The number of most recent periods over which data is compared
     *            to the specified threshold. If you are setting an "M out of N"
     *            alarm, this value (<code>evaluationPeriods</code>) is the N.
     *            </p>
     *            <p>
     *            If you are setting an alarm that requires that a number of
     *            consecutive data points be breaching to trigger the alarm,
     *            this value specifies the rolling period of time in which data
     *            points are evaluated.
     *            </p>
     *            <p>
     *            Each evaluation period is five minutes long. For example,
     *            specify an evaluation period of 24 to evaluate a metric over a
     *            rolling period of two hours.
     *            </p>
     *            <p>
     *            You can specify a minimum valuation period of 1 (5 minutes),
     *            and a maximum evaluation period of 288 (24 hours).
     *            </p>
     */
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of most recent periods over which data is compared to the
     * specified threshold. If you are setting an "M out of N" alarm, this value
     * (<code>evaluationPeriods</code>) is the N.
     * </p>
     * <p>
     * If you are setting an alarm that requires that a number of consecutive
     * data points be breaching to trigger the alarm, this value specifies the
     * rolling period of time in which data points are evaluated.
     * </p>
     * <p>
     * Each evaluation period is five minutes long. For example, specify an
     * evaluation period of 24 to evaluate a metric over a rolling period of two
     * hours.
     * </p>
     * <p>
     * You can specify a minimum valuation period of 1 (5 minutes), and a
     * maximum evaluation period of 288 (24 hours).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationPeriods <p>
     *            The number of most recent periods over which data is compared
     *            to the specified threshold. If you are setting an "M out of N"
     *            alarm, this value (<code>evaluationPeriods</code>) is the N.
     *            </p>
     *            <p>
     *            If you are setting an alarm that requires that a number of
     *            consecutive data points be breaching to trigger the alarm,
     *            this value specifies the rolling period of time in which data
     *            points are evaluated.
     *            </p>
     *            <p>
     *            Each evaluation period is five minutes long. For example,
     *            specify an evaluation period of 24 to evaluate a metric over a
     *            rolling period of two hours.
     *            </p>
     *            <p>
     *            You can specify a minimum valuation period of 1 (5 minutes),
     *            and a maximum evaluation period of 288 (24 hours).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    /**
     * <p>
     * The number of data points that must be not within the specified threshold
     * to trigger the alarm. If you are setting an "M out of N" alarm, this
     * value (<code>datapointsToAlarm</code>) is the M.
     * </p>
     *
     * @return <p>
     *         The number of data points that must be not within the specified
     *         threshold to trigger the alarm. If you are setting an
     *         "M out of N" alarm, this value (<code>datapointsToAlarm</code>)
     *         is the M.
     *         </p>
     */
    public Integer getDatapointsToAlarm() {
        return datapointsToAlarm;
    }

    /**
     * <p>
     * The number of data points that must be not within the specified threshold
     * to trigger the alarm. If you are setting an "M out of N" alarm, this
     * value (<code>datapointsToAlarm</code>) is the M.
     * </p>
     *
     * @param datapointsToAlarm <p>
     *            The number of data points that must be not within the
     *            specified threshold to trigger the alarm. If you are setting
     *            an "M out of N" alarm, this value (
     *            <code>datapointsToAlarm</code>) is the M.
     *            </p>
     */
    public void setDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
    }

    /**
     * <p>
     * The number of data points that must be not within the specified threshold
     * to trigger the alarm. If you are setting an "M out of N" alarm, this
     * value (<code>datapointsToAlarm</code>) is the M.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datapointsToAlarm <p>
     *            The number of data points that must be not within the
     *            specified threshold to trigger the alarm. If you are setting
     *            an "M out of N" alarm, this value (
     *            <code>datapointsToAlarm</code>) is the M.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
        return this;
    }

    /**
     * <p>
     * Sets how this alarm will handle missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> - Assume the missing data is not within the
     * threshold. Missing data counts towards the number of times the metric is
     * not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> - Assume the missing data is within the
     * threshold. Missing data does not count towards the number of times the
     * metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> - Ignore the missing data. Maintains the current
     * alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> - Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>treatMissingData</code> is not specified, the default behavior
     * of <code>missing</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @return <p>
     *         Sets how this alarm will handle missing data points.
     *         </p>
     *         <p>
     *         An alarm can treat missing data in the following ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>breaching</code> - Assume the missing data is not within
     *         the threshold. Missing data counts towards the number of times
     *         the metric is not within the threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>notBreaching</code> - Assume the missing data is within the
     *         threshold. Missing data does not count towards the number of
     *         times the metric is not within the threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ignore</code> - Ignore the missing data. Maintains the
     *         current alarm state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>missing</code> - Missing data is treated as missing.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>treatMissingData</code> is not specified, the default
     *         behavior of <code>missing</code> is used.
     *         </p>
     * @see TreatMissingData
     */
    public String getTreatMissingData() {
        return treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm will handle missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> - Assume the missing data is not within the
     * threshold. Missing data counts towards the number of times the metric is
     * not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> - Assume the missing data is within the
     * threshold. Missing data does not count towards the number of times the
     * metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> - Ignore the missing data. Maintains the current
     * alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> - Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>treatMissingData</code> is not specified, the default behavior
     * of <code>missing</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Sets how this alarm will handle missing data points.
     *            </p>
     *            <p>
     *            An alarm can treat missing data in the following ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>breaching</code> - Assume the missing data is not within
     *            the threshold. Missing data counts towards the number of times
     *            the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>notBreaching</code> - Assume the missing data is within
     *            the threshold. Missing data does not count towards the number
     *            of times the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code> - Ignore the missing data. Maintains the
     *            current alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>missing</code> - Missing data is treated as missing.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>treatMissingData</code> is not specified, the default
     *            behavior of <code>missing</code> is used.
     *            </p>
     * @see TreatMissingData
     */
    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm will handle missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> - Assume the missing data is not within the
     * threshold. Missing data counts towards the number of times the metric is
     * not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> - Assume the missing data is within the
     * threshold. Missing data does not count towards the number of times the
     * metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> - Ignore the missing data. Maintains the current
     * alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> - Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>treatMissingData</code> is not specified, the default behavior
     * of <code>missing</code> is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Sets how this alarm will handle missing data points.
     *            </p>
     *            <p>
     *            An alarm can treat missing data in the following ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>breaching</code> - Assume the missing data is not within
     *            the threshold. Missing data counts towards the number of times
     *            the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>notBreaching</code> - Assume the missing data is within
     *            the threshold. Missing data does not count towards the number
     *            of times the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code> - Ignore the missing data. Maintains the
     *            current alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>missing</code> - Missing data is treated as missing.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>treatMissingData</code> is not specified, the default
     *            behavior of <code>missing</code> is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TreatMissingData
     */
    public PutAlarmRequest withTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
        return this;
    }

    /**
     * <p>
     * Sets how this alarm will handle missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> - Assume the missing data is not within the
     * threshold. Missing data counts towards the number of times the metric is
     * not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> - Assume the missing data is within the
     * threshold. Missing data does not count towards the number of times the
     * metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> - Ignore the missing data. Maintains the current
     * alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> - Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>treatMissingData</code> is not specified, the default behavior
     * of <code>missing</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Sets how this alarm will handle missing data points.
     *            </p>
     *            <p>
     *            An alarm can treat missing data in the following ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>breaching</code> - Assume the missing data is not within
     *            the threshold. Missing data counts towards the number of times
     *            the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>notBreaching</code> - Assume the missing data is within
     *            the threshold. Missing data does not count towards the number
     *            of times the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code> - Ignore the missing data. Maintains the
     *            current alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>missing</code> - Missing data is treated as missing.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>treatMissingData</code> is not specified, the default
     *            behavior of <code>missing</code> is used.
     *            </p>
     * @see TreatMissingData
     */
    public void setTreatMissingData(TreatMissingData treatMissingData) {
        this.treatMissingData = treatMissingData.toString();
    }

    /**
     * <p>
     * Sets how this alarm will handle missing data points.
     * </p>
     * <p>
     * An alarm can treat missing data in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>breaching</code> - Assume the missing data is not within the
     * threshold. Missing data counts towards the number of times the metric is
     * not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>notBreaching</code> - Assume the missing data is within the
     * threshold. Missing data does not count towards the number of times the
     * metric is not within the threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code> - Ignore the missing data. Maintains the current
     * alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>missing</code> - Missing data is treated as missing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>treatMissingData</code> is not specified, the default behavior
     * of <code>missing</code> is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Sets how this alarm will handle missing data points.
     *            </p>
     *            <p>
     *            An alarm can treat missing data in the following ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>breaching</code> - Assume the missing data is not within
     *            the threshold. Missing data counts towards the number of times
     *            the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>notBreaching</code> - Assume the missing data is within
     *            the threshold. Missing data does not count towards the number
     *            of times the metric is not within the threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code> - Ignore the missing data. Maintains the
     *            current alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>missing</code> - Missing data is treated as missing.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>treatMissingData</code> is not specified, the default
     *            behavior of <code>missing</code> is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TreatMissingData
     */
    public PutAlarmRequest withTreatMissingData(TreatMissingData treatMissingData) {
        this.treatMissingData = treatMissingData.toString();
        return this;
    }

    /**
     * <p>
     * The contact protocols to use for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * A notification is sent via the specified contact protocol if
     * notifications are enabled for the alarm, and when the alarm is triggered.
     * </p>
     * <p>
     * A notification is not sent if a contact protocol is not specified, if the
     * specified contact protocol is not configured in the AWS Region, or if
     * notifications are not enabled for the alarm using the
     * <code>notificationEnabled</code> paramater.
     * </p>
     * <p>
     * Use the <code>CreateContactMethod</code> action to configure a contact
     * protocol in an AWS Region.
     * </p>
     *
     * @return <p>
     *         The contact protocols to use for the alarm, such as
     *         <code>Email</code>, <code>SMS</code> (text messaging), or both.
     *         </p>
     *         <p>
     *         A notification is sent via the specified contact protocol if
     *         notifications are enabled for the alarm, and when the alarm is
     *         triggered.
     *         </p>
     *         <p>
     *         A notification is not sent if a contact protocol is not
     *         specified, if the specified contact protocol is not configured in
     *         the AWS Region, or if notifications are not enabled for the alarm
     *         using the <code>notificationEnabled</code> paramater.
     *         </p>
     *         <p>
     *         Use the <code>CreateContactMethod</code> action to configure a
     *         contact protocol in an AWS Region.
     *         </p>
     */
    public java.util.List<String> getContactProtocols() {
        return contactProtocols;
    }

    /**
     * <p>
     * The contact protocols to use for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * A notification is sent via the specified contact protocol if
     * notifications are enabled for the alarm, and when the alarm is triggered.
     * </p>
     * <p>
     * A notification is not sent if a contact protocol is not specified, if the
     * specified contact protocol is not configured in the AWS Region, or if
     * notifications are not enabled for the alarm using the
     * <code>notificationEnabled</code> paramater.
     * </p>
     * <p>
     * Use the <code>CreateContactMethod</code> action to configure a contact
     * protocol in an AWS Region.
     * </p>
     *
     * @param contactProtocols <p>
     *            The contact protocols to use for the alarm, such as
     *            <code>Email</code>, <code>SMS</code> (text messaging), or
     *            both.
     *            </p>
     *            <p>
     *            A notification is sent via the specified contact protocol if
     *            notifications are enabled for the alarm, and when the alarm is
     *            triggered.
     *            </p>
     *            <p>
     *            A notification is not sent if a contact protocol is not
     *            specified, if the specified contact protocol is not configured
     *            in the AWS Region, or if notifications are not enabled for the
     *            alarm using the <code>notificationEnabled</code> paramater.
     *            </p>
     *            <p>
     *            Use the <code>CreateContactMethod</code> action to configure a
     *            contact protocol in an AWS Region.
     *            </p>
     */
    public void setContactProtocols(java.util.Collection<String> contactProtocols) {
        if (contactProtocols == null) {
            this.contactProtocols = null;
            return;
        }

        this.contactProtocols = new java.util.ArrayList<String>(contactProtocols);
    }

    /**
     * <p>
     * The contact protocols to use for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * A notification is sent via the specified contact protocol if
     * notifications are enabled for the alarm, and when the alarm is triggered.
     * </p>
     * <p>
     * A notification is not sent if a contact protocol is not specified, if the
     * specified contact protocol is not configured in the AWS Region, or if
     * notifications are not enabled for the alarm using the
     * <code>notificationEnabled</code> paramater.
     * </p>
     * <p>
     * Use the <code>CreateContactMethod</code> action to configure a contact
     * protocol in an AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactProtocols <p>
     *            The contact protocols to use for the alarm, such as
     *            <code>Email</code>, <code>SMS</code> (text messaging), or
     *            both.
     *            </p>
     *            <p>
     *            A notification is sent via the specified contact protocol if
     *            notifications are enabled for the alarm, and when the alarm is
     *            triggered.
     *            </p>
     *            <p>
     *            A notification is not sent if a contact protocol is not
     *            specified, if the specified contact protocol is not configured
     *            in the AWS Region, or if notifications are not enabled for the
     *            alarm using the <code>notificationEnabled</code> paramater.
     *            </p>
     *            <p>
     *            Use the <code>CreateContactMethod</code> action to configure a
     *            contact protocol in an AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withContactProtocols(String... contactProtocols) {
        if (getContactProtocols() == null) {
            this.contactProtocols = new java.util.ArrayList<String>(contactProtocols.length);
        }
        for (String value : contactProtocols) {
            this.contactProtocols.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The contact protocols to use for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * A notification is sent via the specified contact protocol if
     * notifications are enabled for the alarm, and when the alarm is triggered.
     * </p>
     * <p>
     * A notification is not sent if a contact protocol is not specified, if the
     * specified contact protocol is not configured in the AWS Region, or if
     * notifications are not enabled for the alarm using the
     * <code>notificationEnabled</code> paramater.
     * </p>
     * <p>
     * Use the <code>CreateContactMethod</code> action to configure a contact
     * protocol in an AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactProtocols <p>
     *            The contact protocols to use for the alarm, such as
     *            <code>Email</code>, <code>SMS</code> (text messaging), or
     *            both.
     *            </p>
     *            <p>
     *            A notification is sent via the specified contact protocol if
     *            notifications are enabled for the alarm, and when the alarm is
     *            triggered.
     *            </p>
     *            <p>
     *            A notification is not sent if a contact protocol is not
     *            specified, if the specified contact protocol is not configured
     *            in the AWS Region, or if notifications are not enabled for the
     *            alarm using the <code>notificationEnabled</code> paramater.
     *            </p>
     *            <p>
     *            Use the <code>CreateContactMethod</code> action to configure a
     *            contact protocol in an AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withContactProtocols(java.util.Collection<String> contactProtocols) {
        setContactProtocols(contactProtocols);
        return this;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a notification trigger, the <code>ALARM</code> state
     * must be specified. The <code>INSUFFICIENT_DATA</code> and <code>OK</code>
     * states can be specified in addition to the <code>ALARM</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>OK</code> as an alarm trigger, a notification is
     * sent when the alarm switches from an <code>ALARM</code> or
     * <code>INSUFFICIENT_DATA</code> alarm state to an <code>OK</code> state.
     * This can be thought of as an <i>all clear</i> alarm notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>INSUFFICIENT_DATA</code> as the alarm trigger, a
     * notification is sent when the alarm switches from an <code>OK</code> or
     * <code>ALARM</code> alarm state to an <code>INSUFFICIENT_DATA</code>
     * state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The notification trigger defaults to <code>ALARM</code> if you don't
     * specify this parameter.
     * </p>
     *
     * @return <p>
     *         The alarm states that trigger a notification.
     *         </p>
     *         <p>
     *         An alarm has the following possible states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALARM</code> - The metric is outside of the defined
     *         threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_DATA</code> - The alarm has just started, the
     *         metric is not available, or not enough data is available for the
     *         metric to determine the alarm state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OK</code> - The metric is within the defined threshold.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you specify a notification trigger, the <code>ALARM</code>
     *         state must be specified. The <code>INSUFFICIENT_DATA</code> and
     *         <code>OK</code> states can be specified in addition to the
     *         <code>ALARM</code> state.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify <code>OK</code> as an alarm trigger, a
     *         notification is sent when the alarm switches from an
     *         <code>ALARM</code> or <code>INSUFFICIENT_DATA</code> alarm state
     *         to an <code>OK</code> state. This can be thought of as an <i>all
     *         clear</i> alarm notification.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <code>INSUFFICIENT_DATA</code> as the alarm
     *         trigger, a notification is sent when the alarm switches from an
     *         <code>OK</code> or <code>ALARM</code> alarm state to an
     *         <code>INSUFFICIENT_DATA</code> state.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The notification trigger defaults to <code>ALARM</code> if you
     *         don't specify this parameter.
     *         </p>
     */
    public java.util.List<String> getNotificationTriggers() {
        return notificationTriggers;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a notification trigger, the <code>ALARM</code> state
     * must be specified. The <code>INSUFFICIENT_DATA</code> and <code>OK</code>
     * states can be specified in addition to the <code>ALARM</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>OK</code> as an alarm trigger, a notification is
     * sent when the alarm switches from an <code>ALARM</code> or
     * <code>INSUFFICIENT_DATA</code> alarm state to an <code>OK</code> state.
     * This can be thought of as an <i>all clear</i> alarm notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>INSUFFICIENT_DATA</code> as the alarm trigger, a
     * notification is sent when the alarm switches from an <code>OK</code> or
     * <code>ALARM</code> alarm state to an <code>INSUFFICIENT_DATA</code>
     * state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The notification trigger defaults to <code>ALARM</code> if you don't
     * specify this parameter.
     * </p>
     *
     * @param notificationTriggers <p>
     *            The alarm states that trigger a notification.
     *            </p>
     *            <p>
     *            An alarm has the following possible states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALARM</code> - The metric is outside of the defined
     *            threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSUFFICIENT_DATA</code> - The alarm has just started,
     *            the metric is not available, or not enough data is available
     *            for the metric to determine the alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OK</code> - The metric is within the defined threshold.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you specify a notification trigger, the
     *            <code>ALARM</code> state must be specified. The
     *            <code>INSUFFICIENT_DATA</code> and <code>OK</code> states can
     *            be specified in addition to the <code>ALARM</code> state.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify <code>OK</code> as an alarm trigger, a
     *            notification is sent when the alarm switches from an
     *            <code>ALARM</code> or <code>INSUFFICIENT_DATA</code> alarm
     *            state to an <code>OK</code> state. This can be thought of as
     *            an <i>all clear</i> alarm notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <code>INSUFFICIENT_DATA</code> as the alarm
     *            trigger, a notification is sent when the alarm switches from
     *            an <code>OK</code> or <code>ALARM</code> alarm state to an
     *            <code>INSUFFICIENT_DATA</code> state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The notification trigger defaults to <code>ALARM</code> if you
     *            don't specify this parameter.
     *            </p>
     */
    public void setNotificationTriggers(java.util.Collection<String> notificationTriggers) {
        if (notificationTriggers == null) {
            this.notificationTriggers = null;
            return;
        }

        this.notificationTriggers = new java.util.ArrayList<String>(notificationTriggers);
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a notification trigger, the <code>ALARM</code> state
     * must be specified. The <code>INSUFFICIENT_DATA</code> and <code>OK</code>
     * states can be specified in addition to the <code>ALARM</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>OK</code> as an alarm trigger, a notification is
     * sent when the alarm switches from an <code>ALARM</code> or
     * <code>INSUFFICIENT_DATA</code> alarm state to an <code>OK</code> state.
     * This can be thought of as an <i>all clear</i> alarm notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>INSUFFICIENT_DATA</code> as the alarm trigger, a
     * notification is sent when the alarm switches from an <code>OK</code> or
     * <code>ALARM</code> alarm state to an <code>INSUFFICIENT_DATA</code>
     * state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The notification trigger defaults to <code>ALARM</code> if you don't
     * specify this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTriggers <p>
     *            The alarm states that trigger a notification.
     *            </p>
     *            <p>
     *            An alarm has the following possible states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALARM</code> - The metric is outside of the defined
     *            threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSUFFICIENT_DATA</code> - The alarm has just started,
     *            the metric is not available, or not enough data is available
     *            for the metric to determine the alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OK</code> - The metric is within the defined threshold.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you specify a notification trigger, the
     *            <code>ALARM</code> state must be specified. The
     *            <code>INSUFFICIENT_DATA</code> and <code>OK</code> states can
     *            be specified in addition to the <code>ALARM</code> state.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify <code>OK</code> as an alarm trigger, a
     *            notification is sent when the alarm switches from an
     *            <code>ALARM</code> or <code>INSUFFICIENT_DATA</code> alarm
     *            state to an <code>OK</code> state. This can be thought of as
     *            an <i>all clear</i> alarm notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <code>INSUFFICIENT_DATA</code> as the alarm
     *            trigger, a notification is sent when the alarm switches from
     *            an <code>OK</code> or <code>ALARM</code> alarm state to an
     *            <code>INSUFFICIENT_DATA</code> state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The notification trigger defaults to <code>ALARM</code> if you
     *            don't specify this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withNotificationTriggers(String... notificationTriggers) {
        if (getNotificationTriggers() == null) {
            this.notificationTriggers = new java.util.ArrayList<String>(notificationTriggers.length);
        }
        for (String value : notificationTriggers) {
            this.notificationTriggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     * <p>
     * An alarm has the following possible states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify a notification trigger, the <code>ALARM</code> state
     * must be specified. The <code>INSUFFICIENT_DATA</code> and <code>OK</code>
     * states can be specified in addition to the <code>ALARM</code> state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>OK</code> as an alarm trigger, a notification is
     * sent when the alarm switches from an <code>ALARM</code> or
     * <code>INSUFFICIENT_DATA</code> alarm state to an <code>OK</code> state.
     * This can be thought of as an <i>all clear</i> alarm notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>INSUFFICIENT_DATA</code> as the alarm trigger, a
     * notification is sent when the alarm switches from an <code>OK</code> or
     * <code>ALARM</code> alarm state to an <code>INSUFFICIENT_DATA</code>
     * state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The notification trigger defaults to <code>ALARM</code> if you don't
     * specify this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTriggers <p>
     *            The alarm states that trigger a notification.
     *            </p>
     *            <p>
     *            An alarm has the following possible states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALARM</code> - The metric is outside of the defined
     *            threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSUFFICIENT_DATA</code> - The alarm has just started,
     *            the metric is not available, or not enough data is available
     *            for the metric to determine the alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OK</code> - The metric is within the defined threshold.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you specify a notification trigger, the
     *            <code>ALARM</code> state must be specified. The
     *            <code>INSUFFICIENT_DATA</code> and <code>OK</code> states can
     *            be specified in addition to the <code>ALARM</code> state.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify <code>OK</code> as an alarm trigger, a
     *            notification is sent when the alarm switches from an
     *            <code>ALARM</code> or <code>INSUFFICIENT_DATA</code> alarm
     *            state to an <code>OK</code> state. This can be thought of as
     *            an <i>all clear</i> alarm notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <code>INSUFFICIENT_DATA</code> as the alarm
     *            trigger, a notification is sent when the alarm switches from
     *            an <code>OK</code> or <code>ALARM</code> alarm state to an
     *            <code>INSUFFICIENT_DATA</code> state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The notification trigger defaults to <code>ALARM</code> if you
     *            don't specify this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withNotificationTriggers(
            java.util.Collection<String> notificationTriggers) {
        setNotificationTriggers(notificationTriggers);
        return this;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * <p>
     * Notifications are enabled by default if you don't specify this parameter.
     * </p>
     *
     * @return <p>
     *         Indicates whether the alarm is enabled.
     *         </p>
     *         <p>
     *         Notifications are enabled by default if you don't specify this
     *         parameter.
     *         </p>
     */
    public Boolean isNotificationEnabled() {
        return notificationEnabled;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * <p>
     * Notifications are enabled by default if you don't specify this parameter.
     * </p>
     *
     * @return <p>
     *         Indicates whether the alarm is enabled.
     *         </p>
     *         <p>
     *         Notifications are enabled by default if you don't specify this
     *         parameter.
     *         </p>
     */
    public Boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * <p>
     * Notifications are enabled by default if you don't specify this parameter.
     * </p>
     *
     * @param notificationEnabled <p>
     *            Indicates whether the alarm is enabled.
     *            </p>
     *            <p>
     *            Notifications are enabled by default if you don't specify this
     *            parameter.
     *            </p>
     */
    public void setNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     * <p>
     * Notifications are enabled by default if you don't specify this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationEnabled <p>
     *            Indicates whether the alarm is enabled.
     *            </p>
     *            <p>
     *            Notifications are enabled by default if you don't specify this
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAlarmRequest withNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
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
        if (getAlarmName() != null)
            sb.append("alarmName: " + getAlarmName() + ",");
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getMonitoredResourceName() != null)
            sb.append("monitoredResourceName: " + getMonitoredResourceName() + ",");
        if (getComparisonOperator() != null)
            sb.append("comparisonOperator: " + getComparisonOperator() + ",");
        if (getThreshold() != null)
            sb.append("threshold: " + getThreshold() + ",");
        if (getEvaluationPeriods() != null)
            sb.append("evaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getDatapointsToAlarm() != null)
            sb.append("datapointsToAlarm: " + getDatapointsToAlarm() + ",");
        if (getTreatMissingData() != null)
            sb.append("treatMissingData: " + getTreatMissingData() + ",");
        if (getContactProtocols() != null)
            sb.append("contactProtocols: " + getContactProtocols() + ",");
        if (getNotificationTriggers() != null)
            sb.append("notificationTriggers: " + getNotificationTriggers() + ",");
        if (getNotificationEnabled() != null)
            sb.append("notificationEnabled: " + getNotificationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoredResourceName() == null) ? 0 : getMonitoredResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode
                + ((getDatapointsToAlarm() == null) ? 0 : getDatapointsToAlarm().hashCode());
        hashCode = prime * hashCode
                + ((getTreatMissingData() == null) ? 0 : getTreatMissingData().hashCode());
        hashCode = prime * hashCode
                + ((getContactProtocols() == null) ? 0 : getContactProtocols().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationTriggers() == null) ? 0 : getNotificationTriggers().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationEnabled() == null) ? 0 : getNotificationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAlarmRequest == false)
            return false;
        PutAlarmRequest other = (PutAlarmRequest) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMonitoredResourceName() == null ^ this.getMonitoredResourceName() == null)
            return false;
        if (other.getMonitoredResourceName() != null
                && other.getMonitoredResourceName().equals(this.getMonitoredResourceName()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null
                && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getDatapointsToAlarm() == null ^ this.getDatapointsToAlarm() == null)
            return false;
        if (other.getDatapointsToAlarm() != null
                && other.getDatapointsToAlarm().equals(this.getDatapointsToAlarm()) == false)
            return false;
        if (other.getTreatMissingData() == null ^ this.getTreatMissingData() == null)
            return false;
        if (other.getTreatMissingData() != null
                && other.getTreatMissingData().equals(this.getTreatMissingData()) == false)
            return false;
        if (other.getContactProtocols() == null ^ this.getContactProtocols() == null)
            return false;
        if (other.getContactProtocols() != null
                && other.getContactProtocols().equals(this.getContactProtocols()) == false)
            return false;
        if (other.getNotificationTriggers() == null ^ this.getNotificationTriggers() == null)
            return false;
        if (other.getNotificationTriggers() != null
                && other.getNotificationTriggers().equals(this.getNotificationTriggers()) == false)
            return false;
        if (other.getNotificationEnabled() == null ^ this.getNotificationEnabled() == null)
            return false;
        if (other.getNotificationEnabled() != null
                && other.getNotificationEnabled().equals(this.getNotificationEnabled()) == false)
            return false;
        return true;
    }
}
