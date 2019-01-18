/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

/**
 * <p>
 * The <a>MetricAlarm</a> data type represents an alarm. You can use
 * <a>PutMetricAlarm</a> to create or update an alarm.
 * </p>
 */
public class MetricAlarm implements Serializable {
    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String alarmName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     */
    private String alarmArn;

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String alarmDescription;

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     */
    private java.util.Date alarmConfigurationUpdatedTimestamp;

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the
     * alarm's state.
     * </p>
     */
    private Boolean actionsEnabled;

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     */
    private java.util.List<String> oKActions = new java.util.ArrayList<String>();

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     */
    private java.util.List<String> alarmActions = new java.util.ArrayList<String>();

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <important>The current WSDL lists this attribute as
     * <code>UnknownActions</code>.</important>
     */
    private java.util.List<String> insufficientDataActions = new java.util.ArrayList<String>();

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     */
    private String stateValue;

    /**
     * <p>
     * A human-readable explanation for the alarm's state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     */
    private String stateReason;

    /**
     * <p>
     * An explanation for the alarm's state in machine-readable JSON format
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     */
    private String stateReasonData;

    /**
     * <p>
     * The time stamp of the last update to the alarm's state.
     * </p>
     */
    private java.util.Date stateUpdatedTimestamp;

    /**
     * <p>
     * The name of the alarm's metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * <p>
     * The namespace of alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     */
    private String statistic;

    /**
     * <p>
     * The list of dimensions associated with the alarm's associated metric.
     * </p>
     */
    private java.util.List<Dimension> dimensions = new java.util.ArrayList<Dimension>();

    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     */
    private Integer period;

    /**
     * <p>
     * The unit of the alarm's associated metric.
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
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer evaluationPeriods;

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     */
    private Double threshold;

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     */
    private String comparisonOperator;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the alarm.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
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
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the alarm.
     *         </p>
     */
    public String getAlarmArn() {
        return alarmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param alarmArn <p>
     *            The Amazon Resource Name (ARN) of the alarm.
     *            </p>
     */
    public void setAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
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
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param alarmArn <p>
     *            The Amazon Resource Name (ARN) of the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
        return this;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The description for the alarm.
     *         </p>
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param alarmDescription <p>
     *            The description for the alarm.
     *            </p>
     */
    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param alarmDescription <p>
     *            The description for the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     *
     * @return <p>
     *         The time stamp of the last update to the alarm configuration.
     *         </p>
     */
    public java.util.Date getAlarmConfigurationUpdatedTimestamp() {
        return alarmConfigurationUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     *
     * @param alarmConfigurationUpdatedTimestamp <p>
     *            The time stamp of the last update to the alarm configuration.
     *            </p>
     */
    public void setAlarmConfigurationUpdatedTimestamp(
            java.util.Date alarmConfigurationUpdatedTimestamp) {
        this.alarmConfigurationUpdatedTimestamp = alarmConfigurationUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmConfigurationUpdatedTimestamp <p>
     *            The time stamp of the last update to the alarm configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withAlarmConfigurationUpdatedTimestamp(
            java.util.Date alarmConfigurationUpdatedTimestamp) {
        this.alarmConfigurationUpdatedTimestamp = alarmConfigurationUpdatedTimestamp;
        return this;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the
     * alarm's state.
     * </p>
     *
     * @return <p>
     *         Indicates whether actions should be executed during any changes
     *         to the alarm's state.
     *         </p>
     */
    public Boolean isActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the
     * alarm's state.
     * </p>
     *
     * @return <p>
     *         Indicates whether actions should be executed during any changes
     *         to the alarm's state.
     *         </p>
     */
    public Boolean getActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the
     * alarm's state.
     * </p>
     *
     * @param actionsEnabled <p>
     *            Indicates whether actions should be executed during any
     *            changes to the alarm's state.
     *            </p>
     */
    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the
     * alarm's state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsEnabled <p>
     *            Indicates whether actions should be executed during any
     *            changes to the alarm's state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     *
     * @return <p>
     *         The list of actions to execute when this alarm transitions into
     *         an <code>OK</code> state from any other state. Each action is
     *         specified as an Amazon Resource Name (ARN).
     *         </p>
     */
    public java.util.List<String> getOKActions() {
        return oKActions;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     *
     * @param oKActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>OK</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     */
    public void setOKActions(java.util.Collection<String> oKActions) {
        if (oKActions == null) {
            this.oKActions = null;
            return;
        }

        this.oKActions = new java.util.ArrayList<String>(oKActions);
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oKActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>OK</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withOKActions(String... oKActions) {
        if (getOKActions() == null) {
            this.oKActions = new java.util.ArrayList<String>(oKActions.length);
        }
        for (String value : oKActions) {
            this.oKActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param oKActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>OK</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withOKActions(java.util.Collection<String> oKActions) {
        setOKActions(oKActions);
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     *
     * @return <p>
     *         The list of actions to execute when this alarm transitions into
     *         an <code>ALARM</code> state from any other state. Each action is
     *         specified as an Amazon Resource Name (ARN).
     *         </p>
     */
    public java.util.List<String> getAlarmActions() {
        return alarmActions;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     *
     * @param alarmActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>ALARM</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     */
    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }

        this.alarmActions = new java.util.ArrayList<String>(alarmActions);
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>ALARM</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withAlarmActions(String... alarmActions) {
        if (getAlarmActions() == null) {
            this.alarmActions = new java.util.ArrayList<String>(alarmActions.length);
        }
        for (String value : alarmActions) {
            this.alarmActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>ALARM</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withAlarmActions(java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <important>The current WSDL lists this attribute as
     * <code>UnknownActions</code>.</important>
     *
     * @return <p>
     *         The list of actions to execute when this alarm transitions into
     *         an <code>INSUFFICIENT_DATA</code> state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN).
     *         </p>
     *         <important>The current WSDL lists this attribute as
     *         <code>UnknownActions</code>.</important>
     */
    public java.util.List<String> getInsufficientDataActions() {
        return insufficientDataActions;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <important>The current WSDL lists this attribute as
     * <code>UnknownActions</code>.</important>
     *
     * @param insufficientDataActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>INSUFFICIENT_DATA</code> state from any other
     *            state. Each action is specified as an Amazon Resource Name
     *            (ARN).
     *            </p>
     *            <important>The current WSDL lists this attribute as
     *            <code>UnknownActions</code>.</important>
     */
    public void setInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
            return;
        }

        this.insufficientDataActions = new java.util.ArrayList<String>(insufficientDataActions);
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <important>The current WSDL lists this attribute as
     * <code>UnknownActions</code>.</important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insufficientDataActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>INSUFFICIENT_DATA</code> state from any other
     *            state. Each action is specified as an Amazon Resource Name
     *            (ARN).
     *            </p>
     *            <important>The current WSDL lists this attribute as
     *            <code>UnknownActions</code>.</important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withInsufficientDataActions(String... insufficientDataActions) {
        if (getInsufficientDataActions() == null) {
            this.insufficientDataActions = new java.util.ArrayList<String>(
                    insufficientDataActions.length);
        }
        for (String value : insufficientDataActions) {
            this.insufficientDataActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <important>The current WSDL lists this attribute as
     * <code>UnknownActions</code>.</important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insufficientDataActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>INSUFFICIENT_DATA</code> state from any other
     *            state. Each action is specified as an Amazon Resource Name
     *            (ARN).
     *            </p>
     *            <important>The current WSDL lists this attribute as
     *            <code>UnknownActions</code>.</important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withInsufficientDataActions(
            java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @return <p>
     *         The state value for the alarm.
     *         </p>
     * @see StateValue
     */
    public String getStateValue() {
        return stateValue;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value for the alarm.
     *            </p>
     * @see StateValue
     */
    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value for the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StateValue
     */
    public MetricAlarm withStateValue(String stateValue) {
        this.stateValue = stateValue;
        return this;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value for the alarm.
     *            </p>
     * @see StateValue
     */
    public void setStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value for the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StateValue
     */
    public MetricAlarm withStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
        return this;
    }

    /**
     * <p>
     * A human-readable explanation for the alarm's state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     *
     * @return <p>
     *         A human-readable explanation for the alarm's state.
     *         </p>
     */
    public String getStateReason() {
        return stateReason;
    }

    /**
     * <p>
     * A human-readable explanation for the alarm's state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     *
     * @param stateReason <p>
     *            A human-readable explanation for the alarm's state.
     *            </p>
     */
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * A human-readable explanation for the alarm's state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1023<br/>
     *
     * @param stateReason <p>
     *            A human-readable explanation for the alarm's state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * <p>
     * An explanation for the alarm's state in machine-readable JSON format
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @return <p>
     *         An explanation for the alarm's state in machine-readable JSON
     *         format
     *         </p>
     */
    public String getStateReasonData() {
        return stateReasonData;
    }

    /**
     * <p>
     * An explanation for the alarm's state in machine-readable JSON format
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @param stateReasonData <p>
     *            An explanation for the alarm's state in machine-readable JSON
     *            format
     *            </p>
     */
    public void setStateReasonData(String stateReasonData) {
        this.stateReasonData = stateReasonData;
    }

    /**
     * <p>
     * An explanation for the alarm's state in machine-readable JSON format
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @param stateReasonData <p>
     *            An explanation for the alarm's state in machine-readable JSON
     *            format
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withStateReasonData(String stateReasonData) {
        this.stateReasonData = stateReasonData;
        return this;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm's state.
     * </p>
     *
     * @return <p>
     *         The time stamp of the last update to the alarm's state.
     *         </p>
     */
    public java.util.Date getStateUpdatedTimestamp() {
        return stateUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm's state.
     * </p>
     *
     * @param stateUpdatedTimestamp <p>
     *            The time stamp of the last update to the alarm's state.
     *            </p>
     */
    public void setStateUpdatedTimestamp(java.util.Date stateUpdatedTimestamp) {
        this.stateUpdatedTimestamp = stateUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm's state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateUpdatedTimestamp <p>
     *            The time stamp of the last update to the alarm's state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withStateUpdatedTimestamp(java.util.Date stateUpdatedTimestamp) {
        this.stateUpdatedTimestamp = stateUpdatedTimestamp;
        return this;
    }

    /**
     * <p>
     * The name of the alarm's metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the alarm's metric.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the alarm's metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the alarm's metric.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the alarm's metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the alarm's metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The namespace of alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return <p>
     *         The namespace of alarm's associated metric.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace of alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace of alarm's associated metric.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace of alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @return <p>
     *         The statistic to apply to the alarm's associated metric.
     *         </p>
     * @see Statistic
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic <p>
     *            The statistic to apply to the alarm's associated metric.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic <p>
     *            The statistic to apply to the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public MetricAlarm withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic <p>
     *            The statistic to apply to the alarm's associated metric.
     *            </p>
     * @see Statistic
     */
    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic to apply to the alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SampleCount, Average, Sum, Minimum, Maximum
     *
     * @param statistic <p>
     *            The statistic to apply to the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Statistic
     */
    public MetricAlarm withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The list of dimensions associated with the alarm's associated metric.
     * </p>
     *
     * @return <p>
     *         The list of dimensions associated with the alarm's associated
     *         metric.
     *         </p>
     */
    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The list of dimensions associated with the alarm's associated metric.
     * </p>
     *
     * @param dimensions <p>
     *            The list of dimensions associated with the alarm's associated
     *            metric.
     *            </p>
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<Dimension>(dimensions);
    }

    /**
     * <p>
     * The list of dimensions associated with the alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The list of dimensions associated with the alarm's associated
     *            metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withDimensions(Dimension... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<Dimension>(dimensions.length);
        }
        for (Dimension value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of dimensions associated with the alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The list of dimensions associated with the alarm's associated
     *            metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return <p>
     *         The period in seconds over which the statistic is applied.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            The period in seconds over which the statistic is applied.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            The period in seconds over which the statistic is applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The unit of the alarm's associated metric.
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
     *         The unit of the alarm's associated metric.
     *         </p>
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of the alarm's associated metric.
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
     *            The unit of the alarm's associated metric.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the alarm's associated metric.
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
     *            The unit of the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public MetricAlarm withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit of the alarm's associated metric.
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
     *            The unit of the alarm's associated metric.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of the alarm's associated metric.
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
     *            The unit of the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public MetricAlarm withUnit(StandardUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param evaluationPeriods <p>
     *            The number of periods over which data is compared to the
     *            specified threshold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricAlarm withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
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
    public MetricAlarm withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @return <p>
     *         The arithmetic operation to use when comparing the specified
     *         <code>Statistic</code> and <code>Threshold</code>. The specified
     *         <code>Statistic</code> value is used as the first operand.
     *         </p>
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation to use when comparing the specified
     *            <code>Statistic</code> and <code>Threshold</code>. The
     *            specified <code>Statistic</code> value is used as the first
     *            operand.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
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
     *            <code>Statistic</code> and <code>Threshold</code>. The
     *            specified <code>Statistic</code> value is used as the first
     *            operand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public MetricAlarm withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GreaterThanOrEqualToThreshold,
     * GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold
     *
     * @param comparisonOperator <p>
     *            The arithmetic operation to use when comparing the specified
     *            <code>Statistic</code> and <code>Threshold</code>. The
     *            specified <code>Statistic</code> value is used as the first
     *            operand.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified
     * <code>Statistic</code> and <code>Threshold</code>. The specified
     * <code>Statistic</code> value is used as the first operand.
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
     *            <code>Statistic</code> and <code>Threshold</code>. The
     *            specified <code>Statistic</code> value is used as the first
     *            operand.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public MetricAlarm withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
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
            sb.append("AlarmName: " + getAlarmName() + ",");
        if (getAlarmArn() != null)
            sb.append("AlarmArn: " + getAlarmArn() + ",");
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: " + getAlarmDescription() + ",");
        if (getAlarmConfigurationUpdatedTimestamp() != null)
            sb.append("AlarmConfigurationUpdatedTimestamp: "
                    + getAlarmConfigurationUpdatedTimestamp() + ",");
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: " + getActionsEnabled() + ",");
        if (getOKActions() != null)
            sb.append("OKActions: " + getOKActions() + ",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: " + getAlarmActions() + ",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: " + getInsufficientDataActions() + ",");
        if (getStateValue() != null)
            sb.append("StateValue: " + getStateValue() + ",");
        if (getStateReason() != null)
            sb.append("StateReason: " + getStateReason() + ",");
        if (getStateReasonData() != null)
            sb.append("StateReasonData: " + getStateReasonData() + ",");
        if (getStateUpdatedTimestamp() != null)
            sb.append("StateUpdatedTimestamp: " + getStateUpdatedTimestamp() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit() + ",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getAlarmArn() == null) ? 0 : getAlarmArn().hashCode());
        hashCode = prime * hashCode
                + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlarmConfigurationUpdatedTimestamp() == null) ? 0
                        : getAlarmConfigurationUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getActionsEnabled() == null) ? 0 : getActionsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOKActions() == null) ? 0 : getOKActions().hashCode());
        hashCode = prime * hashCode
                + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        hashCode = prime
                * hashCode
                + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions()
                        .hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        hashCode = prime * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode
                + ((getStateReasonData() == null) ? 0 : getStateReasonData().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateUpdatedTimestamp() == null) ? 0 : getStateUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricAlarm == false)
            return false;
        MetricAlarm other = (MetricAlarm) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmArn() == null ^ this.getAlarmArn() == null)
            return false;
        if (other.getAlarmArn() != null && other.getAlarmArn().equals(this.getAlarmArn()) == false)
            return false;
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null
                && other.getAlarmDescription().equals(this.getAlarmDescription()) == false)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() == null
                ^ this.getAlarmConfigurationUpdatedTimestamp() == null)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() != null
                && other.getAlarmConfigurationUpdatedTimestamp().equals(
                        this.getAlarmConfigurationUpdatedTimestamp()) == false)
            return false;
        if (other.getActionsEnabled() == null ^ this.getActionsEnabled() == null)
            return false;
        if (other.getActionsEnabled() != null
                && other.getActionsEnabled().equals(this.getActionsEnabled()) == false)
            return false;
        if (other.getOKActions() == null ^ this.getOKActions() == null)
            return false;
        if (other.getOKActions() != null
                && other.getOKActions().equals(this.getOKActions()) == false)
            return false;
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null)
            return false;
        if (other.getAlarmActions() != null
                && other.getAlarmActions().equals(this.getAlarmActions()) == false)
            return false;
        if (other.getInsufficientDataActions() == null ^ this.getInsufficientDataActions() == null)
            return false;
        if (other.getInsufficientDataActions() != null
                && other.getInsufficientDataActions().equals(this.getInsufficientDataActions()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null
                && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null
                && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateReasonData() == null ^ this.getStateReasonData() == null)
            return false;
        if (other.getStateReasonData() != null
                && other.getStateReasonData().equals(this.getStateReasonData()) == false)
            return false;
        if (other.getStateUpdatedTimestamp() == null ^ this.getStateUpdatedTimestamp() == null)
            return false;
        if (other.getStateUpdatedTimestamp() != null
                && other.getStateUpdatedTimestamp().equals(this.getStateUpdatedTimestamp()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null
                && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        return true;
    }
}
