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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the result of a Lambda validation function. The function validates
 * lifecycle hooks during a deployment that uses the AWS Lambda or Amazon ECS
 * compute platform. For AWS Lambda deployments, the available lifecycle hooks
 * are <code>BeforeAllowTraffic</code> and <code>AfterAllowTraffic</code>. For
 * Amazon ECS deployments, the available lifecycle hooks are
 * <code>BeforeInstall</code>, <code>AfterInstall</code>,
 * <code>AfterAllowTestTraffic</code>, <code>BeforeAllowTraffic</code>, and
 * <code>AfterAllowTraffic</code>. Lambda validation functions return
 * <code>Succeeded</code> or <code>Failed</code>. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-lambda"
 * >AppSpec 'hooks' Section for an AWS Lambda Deployment </a> and <a href=
 * "https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-ecs"
 * >AppSpec 'hooks' Section for an Amazon ECS Deployment</a>.
 * </p>
 */
public class PutLifecycleEventHookExecutionStatusRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that
     * validates a deployment lifecycle event.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle
     * hook is specified in the <code>hooks</code> section of the AppSpec file.
     * </p>
     */
    private String lifecycleEventHookExecutionId;

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle
     * event (<code>Succeeded</code> or <code>Failed</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     */
    private String status;

    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that
     * validates a deployment lifecycle event.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment. Pass this ID to a Lambda function
     *         that validates a deployment lifecycle event.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that
     * validates a deployment lifecycle event.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment. Pass this ID to a Lambda
     *            function that validates a deployment lifecycle event.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that
     * validates a deployment lifecycle event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment. Pass this ID to a Lambda
     *            function that validates a deployment lifecycle event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleEventHookExecutionStatusRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle
     * hook is specified in the <code>hooks</code> section of the AppSpec file.
     * </p>
     *
     * @return <p>
     *         The execution ID of a deployment's lifecycle hook. A deployment
     *         lifecycle hook is specified in the <code>hooks</code> section of
     *         the AppSpec file.
     *         </p>
     */
    public String getLifecycleEventHookExecutionId() {
        return lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle
     * hook is specified in the <code>hooks</code> section of the AppSpec file.
     * </p>
     *
     * @param lifecycleEventHookExecutionId <p>
     *            The execution ID of a deployment's lifecycle hook. A
     *            deployment lifecycle hook is specified in the
     *            <code>hooks</code> section of the AppSpec file.
     *            </p>
     */
    public void setLifecycleEventHookExecutionId(String lifecycleEventHookExecutionId) {
        this.lifecycleEventHookExecutionId = lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle
     * hook is specified in the <code>hooks</code> section of the AppSpec file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEventHookExecutionId <p>
     *            The execution ID of a deployment's lifecycle hook. A
     *            deployment lifecycle hook is specified in the
     *            <code>hooks</code> section of the AppSpec file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleEventHookExecutionStatusRequest withLifecycleEventHookExecutionId(
            String lifecycleEventHookExecutionId) {
        this.lifecycleEventHookExecutionId = lifecycleEventHookExecutionId;
        return this;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle
     * event (<code>Succeeded</code> or <code>Failed</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @return <p>
     *         The result of a Lambda function that validates a deployment
     *         lifecycle event (<code>Succeeded</code> or <code>Failed</code>).
     *         </p>
     * @see LifecycleEventStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle
     * event (<code>Succeeded</code> or <code>Failed</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The result of a Lambda function that validates a deployment
     *            lifecycle event (<code>Succeeded</code> or <code>Failed</code>
     *            ).
     *            </p>
     * @see LifecycleEventStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle
     * event (<code>Succeeded</code> or <code>Failed</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The result of a Lambda function that validates a deployment
     *            lifecycle event (<code>Succeeded</code> or <code>Failed</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifecycleEventStatus
     */
    public PutLifecycleEventHookExecutionStatusRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle
     * event (<code>Succeeded</code> or <code>Failed</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The result of a Lambda function that validates a deployment
     *            lifecycle event (<code>Succeeded</code> or <code>Failed</code>
     *            ).
     *            </p>
     * @see LifecycleEventStatus
     */
    public void setStatus(LifecycleEventStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle
     * event (<code>Succeeded</code> or <code>Failed</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The result of a Lambda function that validates a deployment
     *            lifecycle event (<code>Succeeded</code> or <code>Failed</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifecycleEventStatus
     */
    public PutLifecycleEventHookExecutionStatusRequest withStatus(LifecycleEventStatus status) {
        this.status = status.toString();
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
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getLifecycleEventHookExecutionId() != null)
            sb.append("lifecycleEventHookExecutionId: " + getLifecycleEventHookExecutionId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime
                * hashCode
                + ((getLifecycleEventHookExecutionId() == null) ? 0
                        : getLifecycleEventHookExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleEventHookExecutionStatusRequest == false)
            return false;
        PutLifecycleEventHookExecutionStatusRequest other = (PutLifecycleEventHookExecutionStatusRequest) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getLifecycleEventHookExecutionId() == null
                ^ this.getLifecycleEventHookExecutionId() == null)
            return false;
        if (other.getLifecycleEventHookExecutionId() != null
                && other.getLifecycleEventHookExecutionId().equals(
                        this.getLifecycleEventHookExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
