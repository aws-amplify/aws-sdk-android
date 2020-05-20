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
 * Information about the target of an Amazon ECS deployment.
 * </p>
 */
public class ECSTarget implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>ecsTarget</code>.
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
     * The date and time when the target Amazon ECS application was updated by a
     * deployment.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS
     * application.
     * </p>
     */
    private java.util.List<LifecycleEvent> lifecycleEvents;

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     */
    private String status;

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     */
    private java.util.List<ECSTaskSet> taskSetsInfo;

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
    public ECSTarget withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>ecsTarget</code>.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment target that has a type of
     *         <code>ecsTarget</code>.
     *         </p>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>ecsTarget</code>.
     * </p>
     *
     * @param targetId <p>
     *            The unique ID of a deployment target that has a type of
     *            <code>ecsTarget</code>.
     *            </p>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of
     * <code>ecsTarget</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetId <p>
     *            The unique ID of a deployment target that has a type of
     *            <code>ecsTarget</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTarget withTargetId(String targetId) {
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
    public ECSTarget withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The date and time when the target Amazon ECS application was updated by a
     * deployment.
     * </p>
     *
     * @return <p>
     *         The date and time when the target Amazon ECS application was
     *         updated by a deployment.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target Amazon ECS application was updated by a
     * deployment.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the target Amazon ECS application was
     *            updated by a deployment.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target Amazon ECS application was updated by a
     * deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the target Amazon ECS application was
     *            updated by a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTarget withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS
     * application.
     * </p>
     *
     * @return <p>
     *         The lifecycle events of the deployment to this target Amazon ECS
     *         application.
     *         </p>
     */
    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        return lifecycleEvents;
    }

    /**
     * <p>
     * The lifecycle events of the deployment to this target Amazon ECS
     * application.
     * </p>
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the deployment to this target Amazon
     *            ECS application.
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
     * The lifecycle events of the deployment to this target Amazon ECS
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the deployment to this target Amazon
     *            ECS application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTarget withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
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
     * The lifecycle events of the deployment to this target Amazon ECS
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the deployment to this target Amazon
     *            ECS application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTarget withLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        setLifecycleEvents(lifecycleEvents);
        return this;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @return <p>
     *         The status an Amazon ECS deployment's target ECS application.
     *         </p>
     * @see TargetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status an Amazon ECS deployment's target ECS application.
     *            </p>
     * @see TargetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
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
     *            The status an Amazon ECS deployment's target ECS application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetStatus
     */
    public ECSTarget withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status an Amazon ECS deployment's target ECS application.
     *            </p>
     * @see TargetStatus
     */
    public void setStatus(TargetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status an Amazon ECS deployment's target ECS application.
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
     *            The status an Amazon ECS deployment's target ECS application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetStatus
     */
    public ECSTarget withStatus(TargetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     *
     * @return <p>
     *         The <code>ECSTaskSet</code> objects associated with the ECS
     *         target.
     *         </p>
     */
    public java.util.List<ECSTaskSet> getTaskSetsInfo() {
        return taskSetsInfo;
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     *
     * @param taskSetsInfo <p>
     *            The <code>ECSTaskSet</code> objects associated with the ECS
     *            target.
     *            </p>
     */
    public void setTaskSetsInfo(java.util.Collection<ECSTaskSet> taskSetsInfo) {
        if (taskSetsInfo == null) {
            this.taskSetsInfo = null;
            return;
        }

        this.taskSetsInfo = new java.util.ArrayList<ECSTaskSet>(taskSetsInfo);
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSetsInfo <p>
     *            The <code>ECSTaskSet</code> objects associated with the ECS
     *            target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTarget withTaskSetsInfo(ECSTaskSet... taskSetsInfo) {
        if (getTaskSetsInfo() == null) {
            this.taskSetsInfo = new java.util.ArrayList<ECSTaskSet>(taskSetsInfo.length);
        }
        for (ECSTaskSet value : taskSetsInfo) {
            this.taskSetsInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The <code>ECSTaskSet</code> objects associated with the ECS target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSetsInfo <p>
     *            The <code>ECSTaskSet</code> objects associated with the ECS
     *            target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ECSTarget withTaskSetsInfo(java.util.Collection<ECSTaskSet> taskSetsInfo) {
        setTaskSetsInfo(taskSetsInfo);
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
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getLifecycleEvents() != null)
            sb.append("lifecycleEvents: " + getLifecycleEvents() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getTaskSetsInfo() != null)
            sb.append("taskSetsInfo: " + getTaskSetsInfo());
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
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleEvents() == null) ? 0 : getLifecycleEvents().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTaskSetsInfo() == null) ? 0 : getTaskSetsInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSTarget == false)
            return false;
        ECSTarget other = (ECSTarget) obj;

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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTaskSetsInfo() == null ^ this.getTaskSetsInfo() == null)
            return false;
        if (other.getTaskSetsInfo() != null
                && other.getTaskSetsInfo().equals(this.getTaskSetsInfo()) == false)
            return false;
        return true;
    }
}
