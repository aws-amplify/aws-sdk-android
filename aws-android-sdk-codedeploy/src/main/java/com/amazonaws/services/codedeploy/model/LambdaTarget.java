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

/**
 * <p>
 * Information about the target AWS Lambda function during an AWS Lambda
 * deployment.
 * </p>
 */
public class LambdaTarget implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>lambdaTarget</code>.
     * </p>
     */
    private String targetId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The status an AWS Lambda deployment's target Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     */
    private String status;

    /**
     * <p>
     * The date and time when the target Lambda function was updated by a
     * deployment.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The lifecycle events of the deployment to this target Lambda function.
     * </p>
     */
    private java.util.List<LifecycleEvent> lifecycleEvents;

    /**
     * <p>
     * A <code>LambdaFunctionInfo</code> object that describes a target Lambda
     * function.
     * </p>
     */
    private LambdaFunctionInfo lambdaFunctionInfo;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaTarget withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>lambdaTarget</code>.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment target that has a type of
     *         <code>lambdaTarget</code>.
     *         </p>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>lambdaTarget</code>.
     * </p>
     *
     * @param targetId <p>
     *            The unique ID of a deployment target that has a type of
     *            <code>lambdaTarget</code>.
     *            </p>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>lambdaTarget</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetId <p>
     *            The unique ID of a deployment target that has a type of
     *            <code>lambdaTarget</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaTarget withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the target.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) of the target.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) of the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaTarget withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The status an AWS Lambda deployment's target Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @return <p>
     *         The status an AWS Lambda deployment's target Lambda function.
     *         </p>
     * @see TargetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status an AWS Lambda deployment's target Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status an AWS Lambda deployment's target Lambda function.
     *            </p>
     * @see TargetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status an AWS Lambda deployment's target Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status an AWS Lambda deployment's target Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetStatus
     */
    public LambdaTarget withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status an AWS Lambda deployment's target Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status an AWS Lambda deployment's target Lambda function.
     *            </p>
     * @see TargetStatus
     */
    public void setStatus(TargetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status an AWS Lambda deployment's target Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status an AWS Lambda deployment's target Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetStatus
     */
    public LambdaTarget withStatus(TargetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the target Lambda function was updated by a
     * deployment.
     * </p>
     *
     * @return <p>
     *         The date and time when the target Lambda function was updated by
     *         a deployment.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target Lambda function was updated by a
     * deployment.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the target Lambda function was updated
     *            by a deployment.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target Lambda function was updated by a
     * deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the target Lambda function was updated
     *            by a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaTarget withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Lambda function.
     * </p>
     *
     * @return <p>
     *         The lifecycle events of the deployment to this target Lambda
     *         function.
     *         </p>
     */
    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        return lifecycleEvents;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Lambda function.
     * </p>
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the deployment to this target Lambda
     *            function.
     *            </p>
     */
    public void setLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        if (lifecycleEvents == null) {
            this.lifecycleEvents = null;
            return;
        }

        this.lifecycleEvents = new java.util.ArrayList<LifecycleEvent>(lifecycleEvents);
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the deployment to this target Lambda
     *            function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaTarget withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
        if (getLifecycleEvents() == null) {
            this.lifecycleEvents = new java.util.ArrayList<LifecycleEvent>(lifecycleEvents.length);
        }
        for (LifecycleEvent value : lifecycleEvents) {
            this.lifecycleEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the deployment to this target Lambda
     *            function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaTarget withLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        setLifecycleEvents(lifecycleEvents);
        return this;
    }

    /**
     * <p>
     * A <code>LambdaFunctionInfo</code> object that describes a target Lambda
     * function.
     * </p>
     *
     * @return <p>
     *         A <code>LambdaFunctionInfo</code> object that describes a target
     *         Lambda function.
     *         </p>
     */
    public LambdaFunctionInfo getLambdaFunctionInfo() {
        return lambdaFunctionInfo;
    }

    /**
     * <p>
     * A <code>LambdaFunctionInfo</code> object that describes a target Lambda
     * function.
     * </p>
     *
     * @param lambdaFunctionInfo <p>
     *            A <code>LambdaFunctionInfo</code> object that describes a
     *            target Lambda function.
     *            </p>
     */
    public void setLambdaFunctionInfo(LambdaFunctionInfo lambdaFunctionInfo) {
        this.lambdaFunctionInfo = lambdaFunctionInfo;
    }

    /**
     * <p>
     * A <code>LambdaFunctionInfo</code> object that describes a target Lambda
     * function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionInfo <p>
     *            A <code>LambdaFunctionInfo</code> object that describes a
     *            target Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaTarget withLambdaFunctionInfo(LambdaFunctionInfo lambdaFunctionInfo) {
        this.lambdaFunctionInfo = lambdaFunctionInfo;
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
        if (getTargetId() != null)
            sb.append("targetId: " + getTargetId() + ",");
        if (getTargetArn() != null)
            sb.append("targetArn: " + getTargetArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getLifecycleEvents() != null)
            sb.append("lifecycleEvents: " + getLifecycleEvents() + ",");
        if (getLambdaFunctionInfo() != null)
            sb.append("lambdaFunctionInfo: " + getLambdaFunctionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleEvents() == null) ? 0 : getLifecycleEvents().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaFunctionInfo() == null) ? 0 : getLambdaFunctionInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaTarget == false)
            return false;
        LambdaTarget other = (LambdaTarget) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLifecycleEvents() == null ^ this.getLifecycleEvents() == null)
            return false;
        if (other.getLifecycleEvents() != null
                && other.getLifecycleEvents().equals(this.getLifecycleEvents()) == false)
            return false;
        if (other.getLambdaFunctionInfo() == null ^ this.getLambdaFunctionInfo() == null)
            return false;
        if (other.getLambdaFunctionInfo() != null
                && other.getLambdaFunctionInfo().equals(this.getLambdaFunctionInfo()) == false)
            return false;
        return true;
    }
}
