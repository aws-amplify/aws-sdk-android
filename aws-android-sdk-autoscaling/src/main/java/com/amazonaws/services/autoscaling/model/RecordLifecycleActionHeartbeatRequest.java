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
 * Records a heartbeat for the lifecycle action associated with the specified
 * token or instance. This extends the timeout by the length of time defined
 * using <a>PutLifecycleHook</a>.
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
 * Create the lifecycle hook. Specify whether the hook is used when the
 * instances launch or terminate.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>If you need more time, record the lifecycle action heartbeat to keep the
 * instance in a pending state.</b>
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
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html"
 * >Auto Scaling Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 */
public class RecordLifecycleActionHeartbeatRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * A token that uniquely identifies a specific lifecycle action associated
     * with an instance. Amazon EC2 Auto Scaling sends this token to the
     * notification target that you specified when you created the lifecycle
     * hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String lifecycleActionToken;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceId;

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
    public RecordLifecycleActionHeartbeatRequest withLifecycleHookName(String lifecycleHookName) {
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
    public RecordLifecycleActionHeartbeatRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * A token that uniquely identifies a specific lifecycle action associated
     * with an instance. Amazon EC2 Auto Scaling sends this token to the
     * notification target that you specified when you created the lifecycle
     * hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         A token that uniquely identifies a specific lifecycle action
     *         associated with an instance. Amazon EC2 Auto Scaling sends this
     *         token to the notification target that you specified when you
     *         created the lifecycle hook.
     *         </p>
     */
    public String getLifecycleActionToken() {
        return lifecycleActionToken;
    }

    /**
     * <p>
     * A token that uniquely identifies a specific lifecycle action associated
     * with an instance. Amazon EC2 Auto Scaling sends this token to the
     * notification target that you specified when you created the lifecycle
     * hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param lifecycleActionToken <p>
     *            A token that uniquely identifies a specific lifecycle action
     *            associated with an instance. Amazon EC2 Auto Scaling sends
     *            this token to the notification target that you specified when
     *            you created the lifecycle hook.
     *            </p>
     */
    public void setLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
    }

    /**
     * <p>
     * A token that uniquely identifies a specific lifecycle action associated
     * with an instance. Amazon EC2 Auto Scaling sends this token to the
     * notification target that you specified when you created the lifecycle
     * hook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param lifecycleActionToken <p>
     *            A token that uniquely identifies a specific lifecycle action
     *            associated with an instance. Amazon EC2 Auto Scaling sends
     *            this token to the notification target that you specified when
     *            you created the lifecycle hook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordLifecycleActionHeartbeatRequest withLifecycleActionToken(
            String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordLifecycleActionHeartbeatRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getLifecycleActionToken() != null)
            sb.append("LifecycleActionToken: " + getLifecycleActionToken() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
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
                + ((getLifecycleActionToken() == null) ? 0 : getLifecycleActionToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordLifecycleActionHeartbeatRequest == false)
            return false;
        RecordLifecycleActionHeartbeatRequest other = (RecordLifecycleActionHeartbeatRequest) obj;

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
        if (other.getLifecycleActionToken() == null ^ this.getLifecycleActionToken() == null)
            return false;
        if (other.getLifecycleActionToken() != null
                && other.getLifecycleActionToken().equals(this.getLifecycleActionToken()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
