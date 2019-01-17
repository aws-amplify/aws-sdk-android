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

/**
 * <p>
 * Describes a lifecycle hook, which tells Amazon EC2 Auto Scaling that you want
 * to perform an action whenever it launches instances or whenever it terminates
 * instances.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html"
 * >Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 */
public class LifecycleHookSpecification implements Serializable {
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
     * The state of the EC2 instance to which you want to attach the lifecycle
     * hook. The possible values are:
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
     */
    private String lifecycleTransition;

    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto
     * Scaling sends a message to the notification target.
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
     * times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling
     * performs the default action. You can prevent the lifecycle hook from
     * timing out by calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     */
    private Integer heartbeatTimeout;

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. The valid values
     * are <code>CONTINUE</code> and <code>ABANDON</code>.
     * </p>
     */
    private String defaultResult;

    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to
     * when an instance is in the transition state for the lifecycle hook. The
     * notification target can be either an SQS queue or an SNS topic.
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
     * The ARN of the IAM role that allows the Auto Scaling group to publish to
     * the specified notification target.
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
    public LifecycleHookSpecification withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * <p>
     * The state of the EC2 instance to which you want to attach the lifecycle
     * hook. The possible values are:
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
     *
     * @return <p>
     *         The state of the EC2 instance to which you want to attach the
     *         lifecycle hook. The possible values are:
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
     */
    public String getLifecycleTransition() {
        return lifecycleTransition;
    }

    /**
     * <p>
     * The state of the EC2 instance to which you want to attach the lifecycle
     * hook. The possible values are:
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
     *
     * @param lifecycleTransition <p>
     *            The state of the EC2 instance to which you want to attach the
     *            lifecycle hook. The possible values are:
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
     */
    public void setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }

    /**
     * <p>
     * The state of the EC2 instance to which you want to attach the lifecycle
     * hook. The possible values are:
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleTransition <p>
     *            The state of the EC2 instance to which you want to attach the
     *            lifecycle hook. The possible values are:
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleHookSpecification withLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }

    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto
     * Scaling sends a message to the notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Additional information that you want to include any time Amazon
     *         EC2 Auto Scaling sends a message to the notification target.
     *         </p>
     */
    public String getNotificationMetadata() {
        return notificationMetadata;
    }

    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto
     * Scaling sends a message to the notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationMetadata <p>
     *            Additional information that you want to include any time
     *            Amazon EC2 Auto Scaling sends a message to the notification
     *            target.
     *            </p>
     */
    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto
     * Scaling sends a message to the notification target.
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
     *            Additional information that you want to include any time
     *            Amazon EC2 Auto Scaling sends a message to the notification
     *            target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleHookSpecification withNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook
     * times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling
     * performs the default action. You can prevent the lifecycle hook from
     * timing out by calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     *
     * @return <p>
     *         The maximum time, in seconds, that can elapse before the
     *         lifecycle hook times out. If the lifecycle hook times out, Amazon
     *         EC2 Auto Scaling performs the default action. You can prevent the
     *         lifecycle hook from timing out by calling
     *         <a>RecordLifecycleActionHeartbeat</a>.
     *         </p>
     */
    public Integer getHeartbeatTimeout() {
        return heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook
     * times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling
     * performs the default action. You can prevent the lifecycle hook from
     * timing out by calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     *
     * @param heartbeatTimeout <p>
     *            The maximum time, in seconds, that can elapse before the
     *            lifecycle hook times out. If the lifecycle hook times out,
     *            Amazon EC2 Auto Scaling performs the default action. You can
     *            prevent the lifecycle hook from timing out by calling
     *            <a>RecordLifecycleActionHeartbeat</a>.
     *            </p>
     */
    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook
     * times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling
     * performs the default action. You can prevent the lifecycle hook from
     * timing out by calling <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param heartbeatTimeout <p>
     *            The maximum time, in seconds, that can elapse before the
     *            lifecycle hook times out. If the lifecycle hook times out,
     *            Amazon EC2 Auto Scaling performs the default action. You can
     *            prevent the lifecycle hook from timing out by calling
     *            <a>RecordLifecycleActionHeartbeat</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleHookSpecification withHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. The valid values
     * are <code>CONTINUE</code> and <code>ABANDON</code>.
     * </p>
     *
     * @return <p>
     *         Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure
     *         occurs. The valid values are <code>CONTINUE</code> and
     *         <code>ABANDON</code>.
     *         </p>
     */
    public String getDefaultResult() {
        return defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. The valid values
     * are <code>CONTINUE</code> and <code>ABANDON</code>.
     * </p>
     *
     * @param defaultResult <p>
     *            Defines the action the Auto Scaling group should take when the
     *            lifecycle hook timeout elapses or if an unexpected failure
     *            occurs. The valid values are <code>CONTINUE</code> and
     *            <code>ABANDON</code>.
     *            </p>
     */
    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle
     * hook timeout elapses or if an unexpected failure occurs. The valid values
     * are <code>CONTINUE</code> and <code>ABANDON</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultResult <p>
     *            Defines the action the Auto Scaling group should take when the
     *            lifecycle hook timeout elapses or if an unexpected failure
     *            occurs. The valid values are <code>CONTINUE</code> and
     *            <code>ABANDON</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleHookSpecification withDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }

    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to
     * when an instance is in the transition state for the lifecycle hook. The
     * notification target can be either an SQS queue or an SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ARN of the target that Amazon EC2 Auto Scaling sends
     *         notifications to when an instance is in the transition state for
     *         the lifecycle hook. The notification target can be either an SQS
     *         queue or an SNS topic.
     *         </p>
     */
    public String getNotificationTargetARN() {
        return notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to
     * when an instance is in the transition state for the lifecycle hook. The
     * notification target can be either an SQS queue or an SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationTargetARN <p>
     *            The ARN of the target that Amazon EC2 Auto Scaling sends
     *            notifications to when an instance is in the transition state
     *            for the lifecycle hook. The notification target can be either
     *            an SQS queue or an SNS topic.
     *            </p>
     */
    public void setNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to
     * when an instance is in the transition state for the lifecycle hook. The
     * notification target can be either an SQS queue or an SNS topic.
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
     *            The ARN of the target that Amazon EC2 Auto Scaling sends
     *            notifications to when an instance is in the transition state
     *            for the lifecycle hook. The notification target can be either
     *            an SQS queue or an SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleHookSpecification withNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to
     * the specified notification target.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param roleARN <p>
     *            The ARN of the IAM role that allows the Auto Scaling group to
     *            publish to the specified notification target.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleHookSpecification withRoleARN(String roleARN) {
        this.roleARN = roleARN;
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
        if (getLifecycleTransition() != null)
            sb.append("LifecycleTransition: " + getLifecycleTransition() + ",");
        if (getNotificationMetadata() != null)
            sb.append("NotificationMetadata: " + getNotificationMetadata() + ",");
        if (getHeartbeatTimeout() != null)
            sb.append("HeartbeatTimeout: " + getHeartbeatTimeout() + ",");
        if (getDefaultResult() != null)
            sb.append("DefaultResult: " + getDefaultResult() + ",");
        if (getNotificationTargetARN() != null)
            sb.append("NotificationTargetARN: " + getNotificationTargetARN() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN());
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
                + ((getLifecycleTransition() == null) ? 0 : getLifecycleTransition().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationMetadata() == null) ? 0 : getNotificationMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultResult() == null) ? 0 : getDefaultResult().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationTargetARN() == null) ? 0 : getNotificationTargetARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleHookSpecification == false)
            return false;
        LifecycleHookSpecification other = (LifecycleHookSpecification) obj;

        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null)
            return false;
        if (other.getLifecycleHookName() != null
                && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false)
            return false;
        if (other.getLifecycleTransition() == null ^ this.getLifecycleTransition() == null)
            return false;
        if (other.getLifecycleTransition() != null
                && other.getLifecycleTransition().equals(this.getLifecycleTransition()) == false)
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
        if (other.getNotificationTargetARN() == null ^ this.getNotificationTargetARN() == null)
            return false;
        if (other.getNotificationTargetARN() != null
                && other.getNotificationTargetARN().equals(this.getNotificationTargetARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }
}
