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

/**
 * <p>
 * Describes an alarm.
 * </p>
 * <p>
 * An alarm is a way to monitor your Amazon Lightsail resource metrics. For more
 * information, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
 * >Alarms in Amazon Lightsail</a>.
 * </p>
 */
public class Alarm implements Serializable {
    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     */
    private String resourceType;

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail alarm. This code enables our support
     * team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * An object that lists information about the resource monitored by the
     * alarm.
     * </p>
     */
    private MonitoredResourceInfo monitoredResourceInfo;

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and
     * threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     */
    private String comparisonOperator;

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     */
    private Integer evaluationPeriods;

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     */
    private Integer period;

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     */
    private Double threshold;

    /**
     * <p>
     * The number of data points that must not within the specified threshold to
     * trigger the alarm.
     * </p>
     */
    private Integer datapointsToAlarm;

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     */
    private String treatMissingData;

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Minimum, Maximum, Sum, Average, SampleCount
     */
    private String statistic;

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
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
     * The current state of the alarm.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     */
    private String state;

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     */
    private String unit;

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     */
    private java.util.List<String> contactProtocols;

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     */
    private java.util.List<String> notificationTriggers;

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     */
    private Boolean notificationEnabled;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the alarm.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the alarm.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the alarm.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the alarm.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the alarm was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the alarm was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the alarm was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the alarm was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     *
     * @return <p>
     *         An object that lists information about the location of the alarm.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     *
     * @param location <p>
     *            An object that lists information about the location of the
     *            alarm.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * An object that lists information about the location of the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            An object that lists information about the location of the
     *            alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type (e.g., <code>Alarm</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>Alarm</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>Alarm</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Alarm withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>Alarm</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Alarm</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>Alarm</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Alarm withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail alarm. This code enables our support
     * team to look up your Lightsail information more easily.
     * </p>
     *
     * @return <p>
     *         The support code. Include this code in your email to support when
     *         you have questions about your Lightsail alarm. This code enables
     *         our support team to look up your Lightsail information more
     *         easily.
     *         </p>
     */
    public String getSupportCode() {
        return supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail alarm. This code enables our support
     * team to look up your Lightsail information more easily.
     * </p>
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail alarm. This code
     *            enables our support team to look up your Lightsail information
     *            more easily.
     *            </p>
     */
    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail alarm. This code enables our support
     * team to look up your Lightsail information more easily.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail alarm. This code
     *            enables our support team to look up your Lightsail information
     *            more easily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * An object that lists information about the resource monitored by the
     * alarm.
     * </p>
     *
     * @return <p>
     *         An object that lists information about the resource monitored by
     *         the alarm.
     *         </p>
     */
    public MonitoredResourceInfo getMonitoredResourceInfo() {
        return monitoredResourceInfo;
    }

    /**
     * <p>
     * An object that lists information about the resource monitored by the
     * alarm.
     * </p>
     *
     * @param monitoredResourceInfo <p>
     *            An object that lists information about the resource monitored
     *            by the alarm.
     *            </p>
     */
    public void setMonitoredResourceInfo(MonitoredResourceInfo monitoredResourceInfo) {
        this.monitoredResourceInfo = monitoredResourceInfo;
    }

    /**
     * <p>
     * An object that lists information about the resource monitored by the
     * alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoredResourceInfo <p>
     *            An object that lists information about the resource monitored
     *            by the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withMonitoredResourceInfo(MonitoredResourceInfo monitoredResourceInfo) {
        this.monitoredResourceInfo = monitoredResourceInfo;
        return this;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and
     * threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @return <p>
     *         The arithmetic operation used when comparing the specified
     *         statistic and threshold.
     *         </p>
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and
     * threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation used when comparing the specified
     *            statistic and threshold.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and
     * threshold.
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
     *            The arithmetic operation used when comparing the specified
     *            statistic and threshold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public Alarm withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and
     * threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation used when comparing the specified
     *            statistic and threshold.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified statistic and
     * threshold.
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
     *            The arithmetic operation used when comparing the specified
     *            statistic and threshold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public Alarm withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     *
     * @return <p>
     *         The number of periods over which data is compared to the
     *         specified threshold.
     *         </p>
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     *
     * @param evaluationPeriods <p>
     *            The number of periods over which data is compared to the
     *            specified threshold.
     *            </p>
     */
    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationPeriods <p>
     *            The number of periods over which data is compared to the
     *            specified threshold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @return <p>
     *         The period, in seconds, over which the statistic is applied.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param period <p>
     *            The period, in seconds, over which the statistic is applied.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param period <p>
     *            The period, in seconds, over which the statistic is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withPeriod(Integer period) {
        this.period = period;
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
    public Alarm withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * <p>
     * The number of data points that must not within the specified threshold to
     * trigger the alarm.
     * </p>
     *
     * @return <p>
     *         The number of data points that must not within the specified
     *         threshold to trigger the alarm.
     *         </p>
     */
    public Integer getDatapointsToAlarm() {
        return datapointsToAlarm;
    }

    /**
     * <p>
     * The number of data points that must not within the specified threshold to
     * trigger the alarm.
     * </p>
     *
     * @param datapointsToAlarm <p>
     *            The number of data points that must not within the specified
     *            threshold to trigger the alarm.
     *            </p>
     */
    public void setDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
    }

    /**
     * <p>
     * The number of data points that must not within the specified threshold to
     * trigger the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datapointsToAlarm <p>
     *            The number of data points that must not within the specified
     *            threshold to trigger the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
        return this;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @return <p>
     *         Specifies how the alarm handles missing data points.
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
     * @see TreatMissingData
     */
    public String getTreatMissingData() {
        return treatMissingData;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Specifies how the alarm handles missing data points.
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
     * @see TreatMissingData
     */
    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Specifies how the alarm handles missing data points.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TreatMissingData
     */
    public Alarm withTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
        return this;
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Specifies how the alarm handles missing data points.
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
     * @see TreatMissingData
     */
    public void setTreatMissingData(TreatMissingData treatMissingData) {
        this.treatMissingData = treatMissingData.toString();
    }

    /**
     * <p>
     * Specifies how the alarm handles missing data points.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>breaching, notBreaching, ignore, missing
     *
     * @param treatMissingData <p>
     *            Specifies how the alarm handles missing data points.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TreatMissingData
     */
    public Alarm withTreatMissingData(TreatMissingData treatMissingData) {
        this.treatMissingData = treatMissingData.toString();
        return this;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Minimum, Maximum, Sum, Average, SampleCount
     *
     * @return <p>
     *         The statistic for the metric associated with the alarm.
     *         </p>
     *         <p>
     *         The following statistics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Minimum</code> - The lowest value observed during the
     *         specified period. Use this value to determine low volumes of
     *         activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> - The highest value observed during the
     *         specified period. Use this value to determine high volumes of
     *         activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> - All values submitted for the matching metric
     *         added together. You can use this statistic to determine the total
     *         volume of a metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> - The value of Sum / SampleCount during the
     *         specified period. By comparing this statistic with the Minimum
     *         and Maximum values, you can determine the full scope of a metric
     *         and how close the average use is to the Minimum and Maximum
     *         values. This comparison helps you to know when to increase or
     *         decrease your resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> - The count, or number, of data points
     *         used for the statistical calculation.
     *         </p>
     *         </li>
     *         </ul>
     * @see MetricStatistic
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Minimum, Maximum, Sum, Average, SampleCount
     *
     * @param statistic <p>
     *            The statistic for the metric associated with the alarm.
     *            </p>
     *            <p>
     *            The following statistics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Minimum</code> - The lowest value observed during the
     *            specified period. Use this value to determine low volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Maximum</code> - The highest value observed during the
     *            specified period. Use this value to determine high volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Sum</code> - All values submitted for the matching
     *            metric added together. You can use this statistic to determine
     *            the total volume of a metric.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Average</code> - The value of Sum / SampleCount during
     *            the specified period. By comparing this statistic with the
     *            Minimum and Maximum values, you can determine the full scope
     *            of a metric and how close the average use is to the Minimum
     *            and Maximum values. This comparison helps you to know when to
     *            increase or decrease your resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SampleCount</code> - The count, or number, of data
     *            points used for the statistical calculation.
     *            </p>
     *            </li>
     *            </ul>
     * @see MetricStatistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Minimum, Maximum, Sum, Average, SampleCount
     *
     * @param statistic <p>
     *            The statistic for the metric associated with the alarm.
     *            </p>
     *            <p>
     *            The following statistics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Minimum</code> - The lowest value observed during the
     *            specified period. Use this value to determine low volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Maximum</code> - The highest value observed during the
     *            specified period. Use this value to determine high volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Sum</code> - All values submitted for the matching
     *            metric added together. You can use this statistic to determine
     *            the total volume of a metric.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Average</code> - The value of Sum / SampleCount during
     *            the specified period. By comparing this statistic with the
     *            Minimum and Maximum values, you can determine the full scope
     *            of a metric and how close the average use is to the Minimum
     *            and Maximum values. This comparison helps you to know when to
     *            increase or decrease your resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SampleCount</code> - The count, or number, of data
     *            points used for the statistical calculation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricStatistic
     */
    public Alarm withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Minimum, Maximum, Sum, Average, SampleCount
     *
     * @param statistic <p>
     *            The statistic for the metric associated with the alarm.
     *            </p>
     *            <p>
     *            The following statistics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Minimum</code> - The lowest value observed during the
     *            specified period. Use this value to determine low volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Maximum</code> - The highest value observed during the
     *            specified period. Use this value to determine high volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Sum</code> - All values submitted for the matching
     *            metric added together. You can use this statistic to determine
     *            the total volume of a metric.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Average</code> - The value of Sum / SampleCount during
     *            the specified period. By comparing this statistic with the
     *            Minimum and Maximum values, you can determine the full scope
     *            of a metric and how close the average use is to the Minimum
     *            and Maximum values. This comparison helps you to know when to
     *            increase or decrease your resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SampleCount</code> - The count, or number, of data
     *            points used for the statistical calculation.
     *            </p>
     *            </li>
     *            </ul>
     * @see MetricStatistic
     */
    public void setStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Minimum, Maximum, Sum, Average, SampleCount
     *
     * @param statistic <p>
     *            The statistic for the metric associated with the alarm.
     *            </p>
     *            <p>
     *            The following statistics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Minimum</code> - The lowest value observed during the
     *            specified period. Use this value to determine low volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Maximum</code> - The highest value observed during the
     *            specified period. Use this value to determine high volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Sum</code> - All values submitted for the matching
     *            metric added together. You can use this statistic to determine
     *            the total volume of a metric.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Average</code> - The value of Sum / SampleCount during
     *            the specified period. By comparing this statistic with the
     *            Minimum and Maximum values, you can determine the full scope
     *            of a metric and how close the average use is to the Minimum
     *            and Maximum values. This comparison helps you to know when to
     *            increase or decrease your resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SampleCount</code> - The count, or number, of data
     *            points used for the statistical calculation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricStatistic
     */
    public Alarm withStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
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
     *         The name of the metric associated with the alarm.
     *         </p>
     * @see MetricName
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
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
     *            The name of the metric associated with the alarm.
     *            </p>
     * @see MetricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
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
     *            The name of the metric associated with the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricName
     */
    public Alarm withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
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
     *            The name of the metric associated with the alarm.
     *            </p>
     * @see MetricName
     */
    public void setMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
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
     *            The name of the metric associated with the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricName
     */
    public Alarm withMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the alarm.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @return <p>
     *         The current state of the alarm.
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
     * @see AlarmState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the alarm.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The current state of the alarm.
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
     * @see AlarmState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the alarm.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The current state of the alarm.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlarmState
     */
    public Alarm withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the alarm.
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
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The current state of the alarm.
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
     * @see AlarmState
     */
    public void setState(AlarmState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the alarm.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The current state of the alarm.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlarmState
     */
    public Alarm withState(AlarmState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @return <p>
     *         The unit of the metric associated with the alarm.
     *         </p>
     * @see MetricUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit of the metric associated with the alarm.
     *            </p>
     * @see MetricUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit of the metric associated with the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricUnit
     */
    public Alarm withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit of the metric associated with the alarm.
     *            </p>
     * @see MetricUnit
     */
    public void setUnit(MetricUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit of the metric associated with the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricUnit
     */
    public Alarm withUnit(MetricUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     *
     * @return <p>
     *         The contact protocols for the alarm, such as <code>Email</code>,
     *         <code>SMS</code> (text messaging), or both.
     *         </p>
     */
    public java.util.List<String> getContactProtocols() {
        return contactProtocols;
    }

    /**
     * <p>
     * The contact protocols for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     *
     * @param contactProtocols <p>
     *            The contact protocols for the alarm, such as
     *            <code>Email</code>, <code>SMS</code> (text messaging), or
     *            both.
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
     * The contact protocols for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactProtocols <p>
     *            The contact protocols for the alarm, such as
     *            <code>Email</code>, <code>SMS</code> (text messaging), or
     *            both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withContactProtocols(String... contactProtocols) {
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
     * The contact protocols for the alarm, such as <code>Email</code>,
     * <code>SMS</code> (text messaging), or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactProtocols <p>
     *            The contact protocols for the alarm, such as
     *            <code>Email</code>, <code>SMS</code> (text messaging), or
     *            both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withContactProtocols(java.util.Collection<String> contactProtocols) {
        setContactProtocols(contactProtocols);
        return this;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     *
     * @return <p>
     *         The alarm states that trigger a notification.
     *         </p>
     */
    public java.util.List<String> getNotificationTriggers() {
        return notificationTriggers;
    }

    /**
     * <p>
     * The alarm states that trigger a notification.
     * </p>
     *
     * @param notificationTriggers <p>
     *            The alarm states that trigger a notification.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTriggers <p>
     *            The alarm states that trigger a notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withNotificationTriggers(String... notificationTriggers) {
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTriggers <p>
     *            The alarm states that trigger a notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withNotificationTriggers(java.util.Collection<String> notificationTriggers) {
        setNotificationTriggers(notificationTriggers);
        return this;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the alarm is enabled.
     *         </p>
     */
    public Boolean isNotificationEnabled() {
        return notificationEnabled;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether the alarm is enabled.
     *         </p>
     */
    public Boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    /**
     * <p>
     * Indicates whether the alarm is enabled.
     * </p>
     *
     * @param notificationEnabled <p>
     *            Indicates whether the alarm is enabled.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationEnabled <p>
     *            Indicates whether the alarm is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Alarm withNotificationEnabled(Boolean notificationEnabled) {
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getSupportCode() != null)
            sb.append("supportCode: " + getSupportCode() + ",");
        if (getMonitoredResourceInfo() != null)
            sb.append("monitoredResourceInfo: " + getMonitoredResourceInfo() + ",");
        if (getComparisonOperator() != null)
            sb.append("comparisonOperator: " + getComparisonOperator() + ",");
        if (getEvaluationPeriods() != null)
            sb.append("evaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getPeriod() != null)
            sb.append("period: " + getPeriod() + ",");
        if (getThreshold() != null)
            sb.append("threshold: " + getThreshold() + ",");
        if (getDatapointsToAlarm() != null)
            sb.append("datapointsToAlarm: " + getDatapointsToAlarm() + ",");
        if (getTreatMissingData() != null)
            sb.append("treatMissingData: " + getTreatMissingData() + ",");
        if (getStatistic() != null)
            sb.append("statistic: " + getStatistic() + ",");
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit() + ",");
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoredResourceInfo() == null) ? 0 : getMonitoredResourceInfo().hashCode());
        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getDatapointsToAlarm() == null) ? 0 : getDatapointsToAlarm().hashCode());
        hashCode = prime * hashCode
                + ((getTreatMissingData() == null) ? 0 : getTreatMissingData().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
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

        if (obj instanceof Alarm == false)
            return false;
        Alarm other = (Alarm) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null
                && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getMonitoredResourceInfo() == null ^ this.getMonitoredResourceInfo() == null)
            return false;
        if (other.getMonitoredResourceInfo() != null
                && other.getMonitoredResourceInfo().equals(this.getMonitoredResourceInfo()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null
                && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
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
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
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
