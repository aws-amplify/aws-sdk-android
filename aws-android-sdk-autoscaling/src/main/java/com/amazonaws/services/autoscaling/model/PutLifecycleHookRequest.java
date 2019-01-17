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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a lifecycle hook for the specified Auto Scaling group.
 * </p>
 * <p>
 * A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an
 * instance that is not actively in service; for example, either when the
 * instance launches or before the instance terminates.
 * </p>
 * <p>
 * This step is a part of the procedure for adding a lifecycle hook to an Auto
 * Scaling group:
 * </p>
 * <ol>
 * <li>
 * <p>
 * (Optional) Create a Lambda function and a rule that allows CloudWatch Events
 * to invoke your Lambda function when Amazon EC2 Auto Scaling launches or
 * terminates instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * (Optional) Create a notification target and an IAM role. The target can be
 * either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2
 * Auto Scaling to publish lifecycle notifications to the target.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Create the lifecycle hook. Specify whether the hook is used when the
 * instances launch or terminate.</b>
 * </p>
 * </li>
 * <li>
 * <p>
 * If you need more time, record the lifecycle action heartbeat to keep the
 * instance in a pending state.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you finish before the timeout period ends, complete the lifecycle action.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html"
 * >Auto Scaling Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User
 * Guide</i>.
 * </p>
 * <p>
 * If you exceed your maximum limit of lifecycle hooks, which by default is 50
 * per Auto Scaling group, the call fails. For information about updating this
 * limit, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
 * >AWS Service Limits</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 */
public class PutLifecycleHookRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     */
    private String lifecycleHookName;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. The
     * possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     */
    private String lifecycleTransition;

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to
     * the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String roleARN;

    /**
     * <p>
     * The ARN of the notification target that Amazon EC2 Auto Scaling uses to
     * notify you when an instance is in the transition state for the lifecycle
     * hook. This target can be either an SQS queue or an SNS topic. If you
     * specify an empty string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an
     * Amazon SQS queue, and an email key-value pair format when sending
     * notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Amazon EC2 Auto Scaling sends it
     * a test message. Test messages contain the following additional key-value
     * pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String notificationTargetARN;

    /**
     * <p>
     * Contains additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String notificationMetadata;

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook
     * times out. The range is from 30 to 7200 seconds. The default is 3600
     * seconds (1 hour).
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the
     * default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     */
    private Integer heartbeatTimeout;

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. This parameter
     * can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default
     * value is <code>ABANDON</code>.
     * </p>
     */
    private String defaultResult;

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @return <p>
     *         The name of the lifecycle hook.
     *         </p>
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName <p>
     *            The name of the lifecycle hook.
     *            </p>
     */
    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName <p>
     *            The name of the lifecycle hook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. The
     * possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     *
     * @return <p>
     *         The instance state to which you want to attach the lifecycle
     *         hook. The possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         autoscaling:EC2_INSTANCE_LAUNCHING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         autoscaling:EC2_INSTANCE_TERMINATING
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is required for new lifecycle hooks, but optional
     *         when updating existing hooks.
     *         </p>
     */
    public String getLifecycleTransition() {
        return lifecycleTransition;
    }

    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. The
     * possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     *
     * @param lifecycleTransition <p>
     *            The instance state to which you want to attach the lifecycle
     *            hook. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            autoscaling:EC2_INSTANCE_LAUNCHING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            autoscaling:EC2_INSTANCE_TERMINATING
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This parameter is required for new lifecycle hooks, but
     *            optional when updating existing hooks.
     *            </p>
     */
    public void setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }

    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. The
     * possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleTransition <p>
     *            The instance state to which you want to attach the lifecycle
     *            hook. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            autoscaling:EC2_INSTANCE_LAUNCHING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            autoscaling:EC2_INSTANCE_TERMINATING
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This parameter is required for new lifecycle hooks, but
     *            optional when updating existing hooks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to
     * the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ARN of the IAM role that allows the Auto Scaling group to
     *         publish to the specified notification target.
     *         </p>
     *         <p>
     *         This parameter is required for new lifecycle hooks, but optional
     *         when updating existing hooks.
     *         </p>
     */
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to
     * the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param roleARN <p>
     *            The ARN of the IAM role that allows the Auto Scaling group to
     *            publish to the specified notification target.
     *            </p>
     *            <p>
     *            This parameter is required for new lifecycle hooks, but
     *            optional when updating existing hooks.
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to
     * the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when
     * updating existing hooks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param roleARN <p>
     *            The ARN of the IAM role that allows the Auto Scaling group to
     *            publish to the specified notification target.
     *            </p>
     *            <p>
     *            This parameter is required for new lifecycle hooks, but
     *            optional when updating existing hooks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * The ARN of the notification target that Amazon EC2 Auto Scaling uses to
     * notify you when an instance is in the transition state for the lifecycle
     * hook. This target can be either an SQS queue or an SNS topic. If you
     * specify an empty string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an
     * Amazon SQS queue, and an email key-value pair format when sending
     * notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Amazon EC2 Auto Scaling sends it
     * a test message. Test messages contain the following additional key-value
     * pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ARN of the notification target that Amazon EC2 Auto Scaling
     *         uses to notify you when an instance is in the transition state
     *         for the lifecycle hook. This target can be either an SQS queue or
     *         an SNS topic. If you specify an empty string, this overrides the
     *         current ARN.
     *         </p>
     *         <p>
     *         This operation uses the JSON format when sending notifications to
     *         an Amazon SQS queue, and an email key-value pair format when
     *         sending notifications to an Amazon SNS topic.
     *         </p>
     *         <p>
     *         When you specify a notification target, Amazon EC2 Auto Scaling
     *         sends it a test message. Test messages contain the following
     *         additional key-value pair:
     *         <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     *         </p>
     */
    public String getNotificationTargetARN() {
        return notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the notification target that Amazon EC2 Auto Scaling uses to
     * notify you when an instance is in the transition state for the lifecycle
     * hook. This target can be either an SQS queue or an SNS topic. If you
     * specify an empty string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an
     * Amazon SQS queue, and an email key-value pair format when sending
     * notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Amazon EC2 Auto Scaling sends it
     * a test message. Test messages contain the following additional key-value
     * pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationTargetARN <p>
     *            The ARN of the notification target that Amazon EC2 Auto
     *            Scaling uses to notify you when an instance is in the
     *            transition state for the lifecycle hook. This target can be
     *            either an SQS queue or an SNS topic. If you specify an empty
     *            string, this overrides the current ARN.
     *            </p>
     *            <p>
     *            This operation uses the JSON format when sending notifications
     *            to an Amazon SQS queue, and an email key-value pair format
     *            when sending notifications to an Amazon SNS topic.
     *            </p>
     *            <p>
     *            When you specify a notification target, Amazon EC2 Auto
     *            Scaling sends it a test message. Test messages contain the
     *            following additional key-value pair:
     *            <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     *            </p>
     */
    public void setNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the notification target that Amazon EC2 Auto Scaling uses to
     * notify you when an instance is in the transition state for the lifecycle
     * hook. This target can be either an SQS queue or an SNS topic. If you
     * specify an empty string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an
     * Amazon SQS queue, and an email key-value pair format when sending
     * notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Amazon EC2 Auto Scaling sends it
     * a test message. Test messages contain the following additional key-value
     * pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationTargetARN <p>
     *            The ARN of the notification target that Amazon EC2 Auto
     *            Scaling uses to notify you when an instance is in the
     *            transition state for the lifecycle hook. This target can be
     *            either an SQS queue or an SNS topic. If you specify an empty
     *            string, this overrides the current ARN.
     *            </p>
     *            <p>
     *            This operation uses the JSON format when sending notifications
     *            to an Amazon SQS queue, and an email key-value pair format
     *            when sending notifications to an Amazon SNS topic.
     *            </p>
     *            <p>
     *            When you specify a notification target, Amazon EC2 Auto
     *            Scaling sends it a test message. Test messages contain the
     *            following additional key-value pair:
     *            <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
        return this;
    }

    /**
     * <p>
     * Contains additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Contains additional information that you want to include any time
     *         Amazon EC2 Auto Scaling sends a message to the notification
     *         target.
     *         </p>
     */
    public String getNotificationMetadata() {
        return notificationMetadata;
    }

    /**
     * <p>
     * Contains additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationMetadata <p>
     *            Contains additional information that you want to include any
     *            time Amazon EC2 Auto Scaling sends a message to the
     *            notification target.
     *            </p>
     */
    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    /**
     * <p>
     * Contains additional information that you want to include any time Amazon
     * EC2 Auto Scaling sends a message to the notification target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationMetadata <p>
     *            Contains additional information that you want to include any
     *            time Amazon EC2 Auto Scaling sends a message to the
     *            notification target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook
     * times out. The range is from 30 to 7200 seconds. The default is 3600
     * seconds (1 hour).
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the
     * default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     *
     * @return <p>
     *         The maximum time, in seconds, that can elapse before the
     *         lifecycle hook times out. The range is from 30 to 7200 seconds.
     *         The default is 3600 seconds (1 hour).
     *         </p>
     *         <p>
     *         If the lifecycle hook times out, Amazon EC2 Auto Scaling performs
     *         the default action. You can prevent the lifecycle hook from
     *         timing out by calling <a>RecordLifecycleActionHeartbeat</a>.
     *         </p>
     */
    public Integer getHeartbeatTimeout() {
        return heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook
     * times out. The range is from 30 to 7200 seconds. The default is 3600
     * seconds (1 hour).
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the
     * default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     *
     * @param heartbeatTimeout <p>
     *            The maximum time, in seconds, that can elapse before the
     *            lifecycle hook times out. The range is from 30 to 7200
     *            seconds. The default is 3600 seconds (1 hour).
     *            </p>
     *            <p>
     *            If the lifecycle hook times out, Amazon EC2 Auto Scaling
     *            performs the default action. You can prevent the lifecycle
     *            hook from timing out by calling
     *            <a>RecordLifecycleActionHeartbeat</a>.
     *            </p>
     */
    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook
     * times out. The range is from 30 to 7200 seconds. The default is 3600
     * seconds (1 hour).
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the
     * default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param heartbeatTimeout <p>
     *            The maximum time, in seconds, that can elapse before the
     *            lifecycle hook times out. The range is from 30 to 7200
     *            seconds. The default is 3600 seconds (1 hour).
     *            </p>
     *            <p>
     *            If the lifecycle hook times out, Amazon EC2 Auto Scaling
     *            performs the default action. You can prevent the lifecycle
     *            hook from timing out by calling
     *            <a>RecordLifecycleActionHeartbeat</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. This parameter
     * can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default
     * value is <code>ABANDON</code>.
     * </p>
     *
     * @return <p>
     *         Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure
     *         occurs. This parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>. The default value is <code>ABANDON</code>.
     *         </p>
     */
    public String getDefaultResult() {
        return defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. This parameter
     * can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default
     * value is <code>ABANDON</code>.
     * </p>
     *
     * @param defaultResult <p>
     *            Defines the action the Auto Scaling group should take when the
     *            lifecycle hook timeout elapses or if an unexpected failure
     *            occurs. This parameter can be either <code>CONTINUE</code> or
     *            <code>ABANDON</code>. The default value is
     *            <code>ABANDON</code>.
     *            </p>
     */
    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. This parameter
     * can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default
     * value is <code>ABANDON</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultResult <p>
     *            Defines the action the Auto Scaling group should take when the
     *            lifecycle hook timeout elapses or if an unexpected failure
     *            occurs. This parameter can be either <code>CONTINUE</code> or
     *            <code>ABANDON</code>. The default value is
     *            <code>ABANDON</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleHookRequest withDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
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
        if (getLifecycleHookName() != null)
            sb.append("LifecycleHookName: " + getLifecycleHookName() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLifecycleTransition() != null)
            sb.append("LifecycleTransition: " + getLifecycleTransition() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getNotificationTargetARN() != null)
            sb.append("NotificationTargetARN: " + getNotificationTargetARN() + ",");
        if (getNotificationMetadata() != null)
            sb.append("NotificationMetadata: " + getNotificationMetadata() + ",");
        if (getHeartbeatTimeout() != null)
            sb.append("HeartbeatTimeout: " + getHeartbeatTimeout() + ",");
        if (getDefaultResult() != null)
            sb.append("DefaultResult: " + getDefaultResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLifecycleHookName() == null) ? 0 : getLifecycleHookName().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleTransition() == null) ? 0 : getLifecycleTransition().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationTargetARN() == null) ? 0 : getNotificationTargetARN().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationMetadata() == null) ? 0 : getNotificationMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultResult() == null) ? 0 : getDefaultResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleHookRequest == false)
            return false;
        PutLifecycleHookRequest other = (PutLifecycleHookRequest) obj;

        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null)
            return false;
        if (other.getLifecycleHookName() != null
                && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLifecycleTransition() == null ^ this.getLifecycleTransition() == null)
            return false;
        if (other.getLifecycleTransition() != null
                && other.getLifecycleTransition().equals(this.getLifecycleTransition()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getNotificationTargetARN() == null ^ this.getNotificationTargetARN() == null)
            return false;
        if (other.getNotificationTargetARN() != null
                && other.getNotificationTargetARN().equals(this.getNotificationTargetARN()) == false)
            return false;
        if (other.getNotificationMetadata() == null ^ this.getNotificationMetadata() == null)
            return false;
        if (other.getNotificationMetadata() != null
                && other.getNotificationMetadata().equals(this.getNotificationMetadata()) == false)
            return false;
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null)
            return false;
        if (other.getHeartbeatTimeout() != null
                && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false)
            return false;
        if (other.getDefaultResult() == null ^ this.getDefaultResult() == null)
            return false;
        if (other.getDefaultResult() != null
                && other.getDefaultResult().equals(this.getDefaultResult()) == false)
            return false;
        return true;
    }
}
