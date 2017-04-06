/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates an alarm and associates it with the specified Amazon
 * CloudWatch metric. Optionally, this operation can associate one or more
 * Amazon Simple Notification Service resources with the alarm.
 * </p>
 * <p>
 * When this operation creates an alarm, the alarm state is immediately set to
 * <code>INSUFFICIENT_DATA</code>. The alarm is evaluated and its
 * <code>StateValue</code> is set appropriately. Any actions associated with the
 * <code>StateValue</code> is then executed.
 * </p>
 * <note> When updating an existing alarm, its <code>StateValue</code> is left
 * unchanged. </note> <note> If you are using an AWS Identity and Access
 * Management (IAM) account to create or modify an alarm, you must have the
 * following Amazon EC2 permissions:
 * <ul>
 * <li><code>ec2:DescribeInstanceStatus</code> and
 * <code>ec2:DescribeInstances</code> for all alarms on Amazon EC2 instance
 * status metrics.</li>
 * <li><code>ec2:StopInstances</code> for alarms with stop actions.</li>
 * <li><code>ec2:TerminateInstances</code> for alarms with terminate actions.</li>
 * <li><code>ec2:DescribeInstanceRecoveryAttribute</code>, and
 * <code>ec2:RecoverInstances</code> for alarms with recover actions.</li>
 * </ul>
 * <p>
 * If you have read/write permissions for Amazon CloudWatch but not for Amazon
 * EC2, you can still create an alarm but the stop or terminate actions won't be
 * performed on the Amazon EC2 instance. However, if you are later granted
 * permission to use the associated Amazon EC2 APIs, the alarm actions you
 * created earlier will be performed. For more information about IAM
 * permissions, see <a href=
 * "http://docs.aws.amazon.com//IAM/latest/UserGuide/PermissionsAndPolicies.html"
 * >Permissions and Policies</a> in <i>Using IAM</i>.
 * </p>
 * <p>
 * If you are using an IAM role (e.g., an Amazon EC2 instance profile), you
 * cannot stop or terminate the instance using alarm actions. However, you can
 * still see the alarm state and perform any other actions such as Amazon SNS
 * notifications or Auto Scaling policies.
 * </p>
 * <p>
 * If you are using temporary security credentials granted using the AWS
 * Security Token Service (AWS STS), you cannot stop or terminate an Amazon EC2
 * instance using alarm actions.
 * </p>
 * </note>
 */
public class PutMetricAlarmRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String alarmName;

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
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     */
    private Boolean actionsEnabled;

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     */
    private java.util.List<String> oKActions = new java.util.ArrayList<String>();

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     */
    private java.util.List<String> alarmActions = new java.util.ArrayList<String>();

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     */
    private java.util.List<String> insufficientDataActions = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * <p>
     * The namespace for the alarm's associated metric.
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
     * The dimensions for the alarm's associated metric.
     * </p>
     */
    private java.util.List<Dimension> dimensions = new java.util.ArrayList<Dimension>();

    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     */
    private Integer period;

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
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
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The descriptive name for the alarm. This name must be unique
     *         within the user's AWS account
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The descriptive name for the alarm. This name must be unique
     *            within the user's AWS account
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The descriptive name for the alarm. This name must be unique
     *            within the user's AWS account
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
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
    public PutMetricAlarmRequest withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not actions should be executed during any
     *         changes to the alarm's state.
     *         </p>
     */
    public Boolean isActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not actions should be executed during any
     *         changes to the alarm's state.
     *         </p>
     */
    public Boolean getActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     *
     * @param actionsEnabled <p>
     *            Indicates whether or not actions should be executed during any
     *            changes to the alarm's state.
     *            </p>
     */
    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether or not actions should be executed during any changes to
     * the alarm's state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsEnabled <p>
     *            Indicates whether or not actions should be executed during any
     *            changes to the alarm's state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>OK</code> state from any other state. Each action is specified as
     * an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     *
     * @return <p>
     *         The list of actions to execute when this alarm transitions into
     *         an <code>OK</code> state from any other state. Each action is
     *         specified as an Amazon Resource Name (ARN).
     *         </p>
     *         <p>
     *         Valid Values: arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:recover
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         arn:aws:swf:us-east-1:{<i>customer
     *         -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *         arn:aws
     *         :swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *         .InstanceId.Terminate/1.0 |
     *         arn:aws:swf:us-east-1:{<i>customer-account
     *         </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *         </p>
     *         <p>
     *         <b>Note:</b> You must create at least one stop, terminate, or
     *         reboot alarm using the Amazon EC2 or CloudWatch console to create
     *         the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *         this IAM role is created, you can create stop, terminate, or
     *         reboot alarms using the CLI.
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
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     *
     * @param oKActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>OK</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
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
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
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
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withOKActions(String... oKActions) {
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
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
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
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withOKActions(java.util.Collection<String> oKActions) {
        setOKActions(oKActions);
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state. Each action is specified
     * as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     *
     * @return <p>
     *         The list of actions to execute when this alarm transitions into
     *         an <code>ALARM</code> state from any other state. Each action is
     *         specified as an Amazon Resource Name (ARN).
     *         </p>
     *         <p>
     *         Valid Values: arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:recover
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         arn:aws:swf:us-east-1:{<i>customer
     *         -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *         arn:aws
     *         :swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *         .InstanceId.Terminate/1.0 |
     *         arn:aws:swf:us-east-1:{<i>customer-account
     *         </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *         </p>
     *         <p>
     *         <b>Note:</b> You must create at least one stop, terminate, or
     *         reboot alarm using the Amazon EC2 or CloudWatch console to create
     *         the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *         this IAM role is created, you can create stop, terminate, or
     *         reboot alarms using the CLI.
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
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     *
     * @param alarmActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>ALARM</code> state from any other state. Each
     *            action is specified as an Amazon Resource Name (ARN).
     *            </p>
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
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
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
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
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withAlarmActions(String... alarmActions) {
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
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
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
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withAlarmActions(java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The list of actions to execute when this alarm transitions into an
     * <code>INSUFFICIENT_DATA</code> state from any other state. Each action is
     * specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     *
     * @return <p>
     *         The list of actions to execute when this alarm transitions into
     *         an <code>INSUFFICIENT_DATA</code> state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN).
     *         </p>
     *         <p>
     *         Valid Values: arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region (e.g.,
     *         us-east-1)</i>:ec2:recover
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         arn:aws:swf:us-east-1:{<i>customer
     *         -account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     *         arn:aws
     *         :swf:us-east-1:{<i>customer-account</i>}:action/actions/AWS_EC2
     *         .InstanceId.Terminate/1.0 |
     *         arn:aws:swf:us-east-1:{<i>customer-account
     *         </i>}:action/actions/AWS_EC2.InstanceId.Reboot/1.0
     *         </p>
     *         <p>
     *         <b>Note:</b> You must create at least one stop, terminate, or
     *         reboot alarm using the Amazon EC2 or CloudWatch console to create
     *         the <b>EC2ActionsAccess</b> IAM role for the first time. After
     *         this IAM role is created, you can create stop, terminate, or
     *         reboot alarms using the CLI.
     *         </p>
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
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
     *
     * @param insufficientDataActions <p>
     *            The list of actions to execute when this alarm transitions
     *            into an <code>INSUFFICIENT_DATA</code> state from any other
     *            state. Each action is specified as an Amazon Resource Name
     *            (ARN).
     *            </p>
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
     *            </p>
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
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
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
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withInsufficientDataActions(String... insufficientDataActions) {
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
     * <p>
     * Valid Values: arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:stop |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:terminate |
     * arn:aws:automate:<i>region (e.g., us-east-1)</i>:ec2:recover
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * arn:aws:swf:us-east-1:{<i>customer-
     * account</i>}:action/actions/AWS_EC2.InstanceId.Stop/1.0 |
     * arn:aws:swf:us-east
     * -1:{<i>customer-account</i>}:action/actions/AWS_EC2.InstanceId
     * .Terminate/1.0 |
     * arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/actions
     * /AWS_EC2.InstanceId.Reboot/1.0
     * </p>
     * <p>
     * <b>Note:</b> You must create at least one stop, terminate, or reboot
     * alarm using the Amazon EC2 or CloudWatch console to create the
     * <b>EC2ActionsAccess</b> IAM role for the first time. After this IAM role
     * is created, you can create stop, terminate, or reboot alarms using the
     * CLI.
     * </p>
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
     *            <p>
     *            Valid Values: arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:stop | arn:aws:automate:<i>region (e.g.,
     *            us-east-1)</i>:ec2:terminate | arn:aws:automate:<i>region
     *            (e.g., us-east-1)</i>:ec2:recover
     *            </p>
     *            <p>
     *            Valid Values (for use with IAM roles):
     *            arn:aws:swf:us-east-1:{<
     *            i>customer-account</i>}:action/actions/
     *            AWS_EC2.InstanceId.Stop/1.0 |
     *            arn:aws:swf:us-east-1:{<i>customer
     *            -account</i>}:action/actions/AWS_EC2.InstanceId.Terminate/1.0
     *            | arn:aws:swf:us-east-1:{<i>customer-account</i>}:action/
     *            actions/AWS_EC2.InstanceId.Reboot/1.0
     *            </p>
     *            <p>
     *            <b>Note:</b> You must create at least one stop, terminate, or
     *            reboot alarm using the Amazon EC2 or CloudWatch console to
     *            create the <b>EC2ActionsAccess</b> IAM role for the first
     *            time. After this IAM role is created, you can create stop,
     *            terminate, or reboot alarms using the CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withInsufficientDataActions(
            java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for the alarm's associated metric.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name for the alarm's associated metric.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name for the alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name for the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The namespace for the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return <p>
     *         The namespace for the alarm's associated metric.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace for the alarm's associated metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace for the alarm's associated metric.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the alarm's associated metric.
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
     *            The namespace for the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withNamespace(String namespace) {
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
    public PutMetricAlarmRequest withStatistic(String statistic) {
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
    public PutMetricAlarmRequest withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The dimensions for the alarm's associated metric.
     * </p>
     *
     * @return <p>
     *         The dimensions for the alarm's associated metric.
     *         </p>
     */
    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimensions for the alarm's associated metric.
     * </p>
     *
     * @param dimensions <p>
     *            The dimensions for the alarm's associated metric.
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
     * The dimensions for the alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimensions for the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withDimensions(Dimension... dimensions) {
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
     * The dimensions for the alarm's associated metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimensions for the alarm's associated metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return <p>
     *         The period in seconds over which the specified statistic is
     *         applied.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            The period in seconds over which the specified statistic is
     *            applied.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period in seconds over which the specified statistic is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            The period in seconds over which the specified statistic is
     *            applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricAlarmRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
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
     *         The statistic's unit of measure. For example, the units for the
     *         Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks
     *         the number of bytes that an instance receives on all network
     *         interfaces. You can also specify a unit when you create a custom
     *         metric. Units help provide conceptual meaning to your data.
     *         Metric data points that specify a unit of measure, such as
     *         Percent, are aggregated separately.
     *         </p>
     *         <p>
     *         <b>Note:</b> If you specify a unit, you must use a unit that is
     *         appropriate for the metric. Otherwise, this can cause an Amazon
     *         CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
     *         </p>
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
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
     *            The statistic's unit of measure. For example, the units for
     *            the Amazon EC2 NetworkIn metric are Bytes because NetworkIn
     *            tracks the number of bytes that an instance receives on all
     *            network interfaces. You can also specify a unit when you
     *            create a custom metric. Units help provide conceptual meaning
     *            to your data. Metric data points that specify a unit of
     *            measure, such as Percent, are aggregated separately.
     *            </p>
     *            <p>
     *            <b>Note:</b> If you specify a unit, you must use a unit that
     *            is appropriate for the metric. Otherwise, this can cause an
     *            Amazon CloudWatch alarm to get stuck in the INSUFFICIENT DATA
     *            state.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
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
     *            The statistic's unit of measure. For example, the units for
     *            the Amazon EC2 NetworkIn metric are Bytes because NetworkIn
     *            tracks the number of bytes that an instance receives on all
     *            network interfaces. You can also specify a unit when you
     *            create a custom metric. Units help provide conceptual meaning
     *            to your data. Metric data points that specify a unit of
     *            measure, such as Percent, are aggregated separately.
     *            </p>
     *            <p>
     *            <b>Note:</b> If you specify a unit, you must use a unit that
     *            is appropriate for the metric. Otherwise, this can cause an
     *            Amazon CloudWatch alarm to get stuck in the INSUFFICIENT DATA
     *            state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public PutMetricAlarmRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
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
     *            The statistic's unit of measure. For example, the units for
     *            the Amazon EC2 NetworkIn metric are Bytes because NetworkIn
     *            tracks the number of bytes that an instance receives on all
     *            network interfaces. You can also specify a unit when you
     *            create a custom metric. Units help provide conceptual meaning
     *            to your data. Metric data points that specify a unit of
     *            measure, such as Percent, are aggregated separately.
     *            </p>
     *            <p>
     *            <b>Note:</b> If you specify a unit, you must use a unit that
     *            is appropriate for the metric. Otherwise, this can cause an
     *            Amazon CloudWatch alarm to get stuck in the INSUFFICIENT DATA
     *            state.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The statistic's unit of measure. For example, the units for the Amazon
     * EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of
     * bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide
     * conceptual meaning to your data. Metric data points that specify a unit
     * of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * <b>Note:</b> If you specify a unit, you must use a unit that is
     * appropriate for the metric. Otherwise, this can cause an Amazon
     * CloudWatch alarm to get stuck in the INSUFFICIENT DATA state.
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
     *            The statistic's unit of measure. For example, the units for
     *            the Amazon EC2 NetworkIn metric are Bytes because NetworkIn
     *            tracks the number of bytes that an instance receives on all
     *            network interfaces. You can also specify a unit when you
     *            create a custom metric. Units help provide conceptual meaning
     *            to your data. Metric data points that specify a unit of
     *            measure, such as Percent, are aggregated separately.
     *            </p>
     *            <p>
     *            <b>Note:</b> If you specify a unit, you must use a unit that
     *            is appropriate for the metric. Otherwise, this can cause an
     *            Amazon CloudWatch alarm to get stuck in the INSUFFICIENT DATA
     *            state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public PutMetricAlarmRequest withUnit(StandardUnit unit) {
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
    public PutMetricAlarmRequest withEvaluationPeriods(Integer evaluationPeriods) {
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
    public PutMetricAlarmRequest withThreshold(Double threshold) {
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
    public PutMetricAlarmRequest withComparisonOperator(String comparisonOperator) {
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
    public PutMetricAlarmRequest withComparisonOperator(ComparisonOperator comparisonOperator) {
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
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: " + getAlarmDescription() + ",");
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: " + getActionsEnabled() + ",");
        if (getOKActions() != null)
            sb.append("OKActions: " + getOKActions() + ",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: " + getAlarmActions() + ",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: " + getInsufficientDataActions() + ",");
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
        hashCode = prime * hashCode
                + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode());
        hashCode = prime * hashCode
                + ((getActionsEnabled() == null) ? 0 : getActionsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOKActions() == null) ? 0 : getOKActions().hashCode());
        hashCode = prime * hashCode
                + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        hashCode = prime
                * hashCode
                + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions()
                        .hashCode());
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

        if (obj instanceof PutMetricAlarmRequest == false)
            return false;
        PutMetricAlarmRequest other = (PutMetricAlarmRequest) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null
                && other.getAlarmDescription().equals(this.getAlarmDescription()) == false)
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
