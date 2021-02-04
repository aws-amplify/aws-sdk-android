/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The criteria by which the behavior is determined to be normal.
 * </p>
 */
public class BehaviorCriteria implements Serializable {
    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the
     * criteria (containing a <code>value</code> or
     * <code>statisticalThreshold</code>). Valid operators include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address-list</code>: <code>in-cidr-set</code> and
     * <code>not-in-cidr-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number</code>: <code>less-than</code>,
     * <code>less-than-equals</code>, <code>greater-than</code>, and
     * <code>greater-than-equals</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>less-than, less-than-equals, greater-than,
     * greater-than-equals, in-cidr-set, not-in-cidr-set, in-port-set,
     * not-in-port-set, in-set, not-in-set
     */
    private String comparisonOperator;

    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     */
    private MetricValue value;

    /**
     * <p>
     * Use this to specify the time duration over which the behavior is
     * evaluated, for those criteria that have a time dimension (for example,
     * <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code>
     * metric comparison, measurements from all devices are accumulated over
     * this time duration before being used to calculate percentiles, and later,
     * measurements from an individual device are also accumulated over this
     * time duration before being given a percentile rank. Cannot be used with
     * list-based metric datatypes.
     * </p>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of
     * consecutive datapoints, an alarm occurs. If not specified, the default is
     * 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer consecutiveDatapointsToAlarm;

    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in
     * violation of the behavior for the specified number of consecutive
     * datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer consecutiveDatapointsToClear;

    /**
     * <p>
     * A statistical ranking (percentile)that indicates a threshold value by
     * which a behavior is determined to be in compliance or in violation of the
     * behavior.
     * </p>
     */
    private StatisticalThreshold statisticalThreshold;

    /**
     * <p>
     * The configuration of an ML Detect
     * </p>
     */
    private MachineLearningDetectionConfig mlDetectionConfig;

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the
     * criteria (containing a <code>value</code> or
     * <code>statisticalThreshold</code>). Valid operators include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address-list</code>: <code>in-cidr-set</code> and
     * <code>not-in-cidr-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number</code>: <code>less-than</code>,
     * <code>less-than-equals</code>, <code>greater-than</code>, and
     * <code>greater-than-equals</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>less-than, less-than-equals, greater-than,
     * greater-than-equals, in-cidr-set, not-in-cidr-set, in-port-set,
     * not-in-port-set, in-set, not-in-set
     *
     * @return <p>
     *         The operator that relates the thing measured (<code>metric</code>
     *         ) to the criteria (containing a <code>value</code> or
     *         <code>statisticalThreshold</code>). Valid operators include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>string-list</code>: <code>in-set</code> and
     *         <code>not-in-set</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>number-list</code>: <code>in-set</code> and
     *         <code>not-in-set</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-address-list</code>: <code>in-cidr-set</code> and
     *         <code>not-in-cidr-set</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>number</code>: <code>less-than</code>,
     *         <code>less-than-equals</code>, <code>greater-than</code>, and
     *         <code>greater-than-equals</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the
     * criteria (containing a <code>value</code> or
     * <code>statisticalThreshold</code>). Valid operators include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address-list</code>: <code>in-cidr-set</code> and
     * <code>not-in-cidr-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number</code>: <code>less-than</code>,
     * <code>less-than-equals</code>, <code>greater-than</code>, and
     * <code>greater-than-equals</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>less-than, less-than-equals, greater-than,
     * greater-than-equals, in-cidr-set, not-in-cidr-set, in-port-set,
     * not-in-port-set, in-set, not-in-set
     *
     * @param comparisonOperator <p>
     *            The operator that relates the thing measured (
     *            <code>metric</code>) to the criteria (containing a
     *            <code>value</code> or <code>statisticalThreshold</code>).
     *            Valid operators include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>string-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ip-address-list</code>: <code>in-cidr-set</code> and
     *            <code>not-in-cidr-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number</code>: <code>less-than</code>,
     *            <code>less-than-equals</code>, <code>greater-than</code>, and
     *            <code>greater-than-equals</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the
     * criteria (containing a <code>value</code> or
     * <code>statisticalThreshold</code>). Valid operators include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address-list</code>: <code>in-cidr-set</code> and
     * <code>not-in-cidr-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number</code>: <code>less-than</code>,
     * <code>less-than-equals</code>, <code>greater-than</code>, and
     * <code>greater-than-equals</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>less-than, less-than-equals, greater-than,
     * greater-than-equals, in-cidr-set, not-in-cidr-set, in-port-set,
     * not-in-port-set, in-set, not-in-set
     *
     * @param comparisonOperator <p>
     *            The operator that relates the thing measured (
     *            <code>metric</code>) to the criteria (containing a
     *            <code>value</code> or <code>statisticalThreshold</code>).
     *            Valid operators include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>string-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ip-address-list</code>: <code>in-cidr-set</code> and
     *            <code>not-in-cidr-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number</code>: <code>less-than</code>,
     *            <code>less-than-equals</code>, <code>greater-than</code>, and
     *            <code>greater-than-equals</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public BehaviorCriteria withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the
     * criteria (containing a <code>value</code> or
     * <code>statisticalThreshold</code>). Valid operators include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address-list</code>: <code>in-cidr-set</code> and
     * <code>not-in-cidr-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number</code>: <code>less-than</code>,
     * <code>less-than-equals</code>, <code>greater-than</code>, and
     * <code>greater-than-equals</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>less-than, less-than-equals, greater-than,
     * greater-than-equals, in-cidr-set, not-in-cidr-set, in-port-set,
     * not-in-port-set, in-set, not-in-set
     *
     * @param comparisonOperator <p>
     *            The operator that relates the thing measured (
     *            <code>metric</code>) to the criteria (containing a
     *            <code>value</code> or <code>statisticalThreshold</code>).
     *            Valid operators include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>string-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ip-address-list</code>: <code>in-cidr-set</code> and
     *            <code>not-in-cidr-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number</code>: <code>less-than</code>,
     *            <code>less-than-equals</code>, <code>greater-than</code>, and
     *            <code>greater-than-equals</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the
     * criteria (containing a <code>value</code> or
     * <code>statisticalThreshold</code>). Valid operators include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number-list</code>: <code>in-set</code> and <code>not-in-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address-list</code>: <code>in-cidr-set</code> and
     * <code>not-in-cidr-set</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>number</code>: <code>less-than</code>,
     * <code>less-than-equals</code>, <code>greater-than</code>, and
     * <code>greater-than-equals</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>less-than, less-than-equals, greater-than,
     * greater-than-equals, in-cidr-set, not-in-cidr-set, in-port-set,
     * not-in-port-set, in-set, not-in-set
     *
     * @param comparisonOperator <p>
     *            The operator that relates the thing measured (
     *            <code>metric</code>) to the criteria (containing a
     *            <code>value</code> or <code>statisticalThreshold</code>).
     *            Valid operators include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>string-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number-list</code>: <code>in-set</code> and
     *            <code>not-in-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ip-address-list</code>: <code>in-cidr-set</code> and
     *            <code>not-in-cidr-set</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>number</code>: <code>less-than</code>,
     *            <code>less-than-equals</code>, <code>greater-than</code>, and
     *            <code>greater-than-equals</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public BehaviorCriteria withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     *
     * @return <p>
     *         The value to be compared with the <code>metric</code>.
     *         </p>
     */
    public MetricValue getValue() {
        return value;
    }

    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     *
     * @param value <p>
     *            The value to be compared with the <code>metric</code>.
     *            </p>
     */
    public void setValue(MetricValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value to be compared with the <code>metric</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorCriteria withValue(MetricValue value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * Use this to specify the time duration over which the behavior is
     * evaluated, for those criteria that have a time dimension (for example,
     * <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code>
     * metric comparison, measurements from all devices are accumulated over
     * this time duration before being used to calculate percentiles, and later,
     * measurements from an individual device are also accumulated over this
     * time duration before being given a percentile rank. Cannot be used with
     * list-based metric datatypes.
     * </p>
     *
     * @return <p>
     *         Use this to specify the time duration over which the behavior is
     *         evaluated, for those criteria that have a time dimension (for
     *         example, <code>NUM_MESSAGES_SENT</code>). For a
     *         <code>statisticalThreshhold</code> metric comparison,
     *         measurements from all devices are accumulated over this time
     *         duration before being used to calculate percentiles, and later,
     *         measurements from an individual device are also accumulated over
     *         this time duration before being given a percentile rank. Cannot
     *         be used with list-based metric datatypes.
     *         </p>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * Use this to specify the time duration over which the behavior is
     * evaluated, for those criteria that have a time dimension (for example,
     * <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code>
     * metric comparison, measurements from all devices are accumulated over
     * this time duration before being used to calculate percentiles, and later,
     * measurements from an individual device are also accumulated over this
     * time duration before being given a percentile rank. Cannot be used with
     * list-based metric datatypes.
     * </p>
     *
     * @param durationSeconds <p>
     *            Use this to specify the time duration over which the behavior
     *            is evaluated, for those criteria that have a time dimension
     *            (for example, <code>NUM_MESSAGES_SENT</code>). For a
     *            <code>statisticalThreshhold</code> metric comparison,
     *            measurements from all devices are accumulated over this time
     *            duration before being used to calculate percentiles, and
     *            later, measurements from an individual device are also
     *            accumulated over this time duration before being given a
     *            percentile rank. Cannot be used with list-based metric
     *            datatypes.
     *            </p>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * Use this to specify the time duration over which the behavior is
     * evaluated, for those criteria that have a time dimension (for example,
     * <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code>
     * metric comparison, measurements from all devices are accumulated over
     * this time duration before being used to calculate percentiles, and later,
     * measurements from an individual device are also accumulated over this
     * time duration before being given a percentile rank. Cannot be used with
     * list-based metric datatypes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationSeconds <p>
     *            Use this to specify the time duration over which the behavior
     *            is evaluated, for those criteria that have a time dimension
     *            (for example, <code>NUM_MESSAGES_SENT</code>). For a
     *            <code>statisticalThreshhold</code> metric comparison,
     *            measurements from all devices are accumulated over this time
     *            duration before being used to calculate percentiles, and
     *            later, measurements from an individual device are also
     *            accumulated over this time duration before being given a
     *            percentile rank. Cannot be used with list-based metric
     *            datatypes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorCriteria withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of
     * consecutive datapoints, an alarm occurs. If not specified, the default is
     * 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         If a device is in violation of the behavior for the specified
     *         number of consecutive datapoints, an alarm occurs. If not
     *         specified, the default is 1.
     *         </p>
     */
    public Integer getConsecutiveDatapointsToAlarm() {
        return consecutiveDatapointsToAlarm;
    }

    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of
     * consecutive datapoints, an alarm occurs. If not specified, the default is
     * 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param consecutiveDatapointsToAlarm <p>
     *            If a device is in violation of the behavior for the specified
     *            number of consecutive datapoints, an alarm occurs. If not
     *            specified, the default is 1.
     *            </p>
     */
    public void setConsecutiveDatapointsToAlarm(Integer consecutiveDatapointsToAlarm) {
        this.consecutiveDatapointsToAlarm = consecutiveDatapointsToAlarm;
    }

    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of
     * consecutive datapoints, an alarm occurs. If not specified, the default is
     * 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param consecutiveDatapointsToAlarm <p>
     *            If a device is in violation of the behavior for the specified
     *            number of consecutive datapoints, an alarm occurs. If not
     *            specified, the default is 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorCriteria withConsecutiveDatapointsToAlarm(Integer consecutiveDatapointsToAlarm) {
        this.consecutiveDatapointsToAlarm = consecutiveDatapointsToAlarm;
        return this;
    }

    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in
     * violation of the behavior for the specified number of consecutive
     * datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         If an alarm has occurred and the offending device is no longer in
     *         violation of the behavior for the specified number of consecutive
     *         datapoints, the alarm is cleared. If not specified, the default
     *         is 1.
     *         </p>
     */
    public Integer getConsecutiveDatapointsToClear() {
        return consecutiveDatapointsToClear;
    }

    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in
     * violation of the behavior for the specified number of consecutive
     * datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param consecutiveDatapointsToClear <p>
     *            If an alarm has occurred and the offending device is no longer
     *            in violation of the behavior for the specified number of
     *            consecutive datapoints, the alarm is cleared. If not
     *            specified, the default is 1.
     *            </p>
     */
    public void setConsecutiveDatapointsToClear(Integer consecutiveDatapointsToClear) {
        this.consecutiveDatapointsToClear = consecutiveDatapointsToClear;
    }

    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in
     * violation of the behavior for the specified number of consecutive
     * datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param consecutiveDatapointsToClear <p>
     *            If an alarm has occurred and the offending device is no longer
     *            in violation of the behavior for the specified number of
     *            consecutive datapoints, the alarm is cleared. If not
     *            specified, the default is 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorCriteria withConsecutiveDatapointsToClear(Integer consecutiveDatapointsToClear) {
        this.consecutiveDatapointsToClear = consecutiveDatapointsToClear;
        return this;
    }

    /**
     * <p>
     * A statistical ranking (percentile)that indicates a threshold value by
     * which a behavior is determined to be in compliance or in violation of the
     * behavior.
     * </p>
     *
     * @return <p>
     *         A statistical ranking (percentile)that indicates a threshold
     *         value by which a behavior is determined to be in compliance or in
     *         violation of the behavior.
     *         </p>
     */
    public StatisticalThreshold getStatisticalThreshold() {
        return statisticalThreshold;
    }

    /**
     * <p>
     * A statistical ranking (percentile)that indicates a threshold value by
     * which a behavior is determined to be in compliance or in violation of the
     * behavior.
     * </p>
     *
     * @param statisticalThreshold <p>
     *            A statistical ranking (percentile)that indicates a threshold
     *            value by which a behavior is determined to be in compliance or
     *            in violation of the behavior.
     *            </p>
     */
    public void setStatisticalThreshold(StatisticalThreshold statisticalThreshold) {
        this.statisticalThreshold = statisticalThreshold;
    }

    /**
     * <p>
     * A statistical ranking (percentile)that indicates a threshold value by
     * which a behavior is determined to be in compliance or in violation of the
     * behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statisticalThreshold <p>
     *            A statistical ranking (percentile)that indicates a threshold
     *            value by which a behavior is determined to be in compliance or
     *            in violation of the behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorCriteria withStatisticalThreshold(StatisticalThreshold statisticalThreshold) {
        this.statisticalThreshold = statisticalThreshold;
        return this;
    }

    /**
     * <p>
     * The configuration of an ML Detect
     * </p>
     *
     * @return <p>
     *         The configuration of an ML Detect
     *         </p>
     */
    public MachineLearningDetectionConfig getMlDetectionConfig() {
        return mlDetectionConfig;
    }

    /**
     * <p>
     * The configuration of an ML Detect
     * </p>
     *
     * @param mlDetectionConfig <p>
     *            The configuration of an ML Detect
     *            </p>
     */
    public void setMlDetectionConfig(MachineLearningDetectionConfig mlDetectionConfig) {
        this.mlDetectionConfig = mlDetectionConfig;
    }

    /**
     * <p>
     * The configuration of an ML Detect
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mlDetectionConfig <p>
     *            The configuration of an ML Detect
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BehaviorCriteria withMlDetectionConfig(MachineLearningDetectionConfig mlDetectionConfig) {
        this.mlDetectionConfig = mlDetectionConfig;
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
        if (getComparisonOperator() != null)
            sb.append("comparisonOperator: " + getComparisonOperator() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getDurationSeconds() != null)
            sb.append("durationSeconds: " + getDurationSeconds() + ",");
        if (getConsecutiveDatapointsToAlarm() != null)
            sb.append("consecutiveDatapointsToAlarm: " + getConsecutiveDatapointsToAlarm() + ",");
        if (getConsecutiveDatapointsToClear() != null)
            sb.append("consecutiveDatapointsToClear: " + getConsecutiveDatapointsToClear() + ",");
        if (getStatisticalThreshold() != null)
            sb.append("statisticalThreshold: " + getStatisticalThreshold() + ",");
        if (getMlDetectionConfig() != null)
            sb.append("mlDetectionConfig: " + getMlDetectionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getConsecutiveDatapointsToAlarm() == null) ? 0
                        : getConsecutiveDatapointsToAlarm().hashCode());
        hashCode = prime
                * hashCode
                + ((getConsecutiveDatapointsToClear() == null) ? 0
                        : getConsecutiveDatapointsToClear().hashCode());
        hashCode = prime * hashCode
                + ((getStatisticalThreshold() == null) ? 0 : getStatisticalThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getMlDetectionConfig() == null) ? 0 : getMlDetectionConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BehaviorCriteria == false)
            return false;
        BehaviorCriteria other = (BehaviorCriteria) obj;

        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getConsecutiveDatapointsToAlarm() == null
                ^ this.getConsecutiveDatapointsToAlarm() == null)
            return false;
        if (other.getConsecutiveDatapointsToAlarm() != null
                && other.getConsecutiveDatapointsToAlarm().equals(
                        this.getConsecutiveDatapointsToAlarm()) == false)
            return false;
        if (other.getConsecutiveDatapointsToClear() == null
                ^ this.getConsecutiveDatapointsToClear() == null)
            return false;
        if (other.getConsecutiveDatapointsToClear() != null
                && other.getConsecutiveDatapointsToClear().equals(
                        this.getConsecutiveDatapointsToClear()) == false)
            return false;
        if (other.getStatisticalThreshold() == null ^ this.getStatisticalThreshold() == null)
            return false;
        if (other.getStatisticalThreshold() != null
                && other.getStatisticalThreshold().equals(this.getStatisticalThreshold()) == false)
            return false;
        if (other.getMlDetectionConfig() == null ^ this.getMlDetectionConfig() == null)
            return false;
        if (other.getMlDetectionConfig() != null
                && other.getMlDetectionConfig().equals(this.getMlDetectionConfig()) == false)
            return false;
        return true;
    }
}
