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
 * Information about the target to be updated by an AWS CloudFormation
 * blue/green deployment. This target type is used for all deployments initiated
 * by a CloudFormation stack update.
 * </p>
 */
public class CloudFormationTarget implements Serializable {
    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The unique ID of a deployment target that has a type of 
     * <code>CloudFormationTarget</code>.
     * </p>
     */
    private String targetId;

    /**
     * <p>
     * The date and time when the target application was updated by an AWS
     * CloudFormation blue/green deployment.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to
     * this target application.
     * </p>
     */
    private java.util.List<LifecycleEvent> lifecycleEvents;

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target
     * application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     */
    private String status;

    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS
     * CloudFormation blue/green deployment receives.
     * </p>
     */
    private Double targetVersionWeight;

    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of an AWS CloudFormation blue/green deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of an AWS CloudFormation blue/green deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of an AWS CloudFormation blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationTarget withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of 
     * <code>CloudFormationTarget</code>.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment target that has a type of 
     *         <code>CloudFormationTarget</code>.
     *         </p>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of 
     * <code>CloudFormationTarget</code>.
     * </p>
     *
     * @param targetId <p>
     *            The unique ID of a deployment target that has a type of 
     *            <code>CloudFormationTarget</code>.
     *            </p>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of 
     * <code>CloudFormationTarget</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetId <p>
     *            The unique ID of a deployment target that has a type of 
     *            <code>CloudFormationTarget</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationTarget withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * <p>
     * The date and time when the target application was updated by an AWS
     * CloudFormation blue/green deployment.
     * </p>
     *
     * @return <p>
     *         The date and time when the target application was updated by an
     *         AWS CloudFormation blue/green deployment.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target application was updated by an AWS
     * CloudFormation blue/green deployment.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the target application was updated by
     *            an AWS CloudFormation blue/green deployment.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target application was updated by an AWS
     * CloudFormation blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the target application was updated by
     *            an AWS CloudFormation blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationTarget withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to
     * this target application.
     * </p>
     *
     * @return <p>
     *         The lifecycle events of the AWS CloudFormation blue/green
     *         deployment to this target application.
     *         </p>
     */
    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        return lifecycleEvents;
    }

    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to
     * this target application.
     * </p>
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the AWS CloudFormation blue/green
     *            deployment to this target application.
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
     * The lifecycle events of the AWS CloudFormation blue/green deployment to
     * this target application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the AWS CloudFormation blue/green
     *            deployment to this target application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationTarget withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
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
     * The lifecycle events of the AWS CloudFormation blue/green deployment to
     * this target application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEvents <p>
     *            The lifecycle events of the AWS CloudFormation blue/green
     *            deployment to this target application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationTarget withLifecycleEvents(
            java.util.Collection<LifecycleEvent> lifecycleEvents) {
        setLifecycleEvents(lifecycleEvents);
        return this;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target
     * application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @return <p>
     *         The status of an AWS CloudFormation blue/green deployment's
     *         target application.
     *         </p>
     * @see TargetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target
     * application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status of an AWS CloudFormation blue/green deployment's
     *            target application.
     *            </p>
     * @see TargetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target
     * application.
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
     *            The status of an AWS CloudFormation blue/green deployment's
     *            target application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetStatus
     */
    public CloudFormationTarget withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target
     * application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown, Ready
     *
     * @param status <p>
     *            The status of an AWS CloudFormation blue/green deployment's
     *            target application.
     *            </p>
     * @see TargetStatus
     */
    public void setStatus(TargetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target
     * application.
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
     *            The status of an AWS CloudFormation blue/green deployment's
     *            target application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetStatus
     */
    public CloudFormationTarget withStatus(TargetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     *
     * @return <p>
     *         The resource type for the AWS CloudFormation blue/green
     *         deployment.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     *
     * @param resourceType <p>
     *            The resource type for the AWS CloudFormation blue/green
     *            deployment.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The resource type for the AWS CloudFormation blue/green
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationTarget withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS
     * CloudFormation blue/green deployment receives.
     * </p>
     *
     * @return <p>
     *         The percentage of production traffic that the target version of
     *         an AWS CloudFormation blue/green deployment receives.
     *         </p>
     */
    public Double getTargetVersionWeight() {
        return targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS
     * CloudFormation blue/green deployment receives.
     * </p>
     *
     * @param targetVersionWeight <p>
     *            The percentage of production traffic that the target version
     *            of an AWS CloudFormation blue/green deployment receives.
     *            </p>
     */
    public void setTargetVersionWeight(Double targetVersionWeight) {
        this.targetVersionWeight = targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS
     * CloudFormation blue/green deployment receives.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersionWeight <p>
     *            The percentage of production traffic that the target version
     *            of an AWS CloudFormation blue/green deployment receives.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationTarget withTargetVersionWeight(Double targetVersionWeight) {
        this.targetVersionWeight = targetVersionWeight;
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
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getLifecycleEvents() != null)
            sb.append("lifecycleEvents: " + getLifecycleEvents() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getTargetVersionWeight() != null)
            sb.append("targetVersionWeight: " + getTargetVersionWeight());
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
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleEvents() == null) ? 0 : getLifecycleEvents().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVersionWeight() == null) ? 0 : getTargetVersionWeight().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationTarget == false)
            return false;
        CloudFormationTarget other = (CloudFormationTarget) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
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
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTargetVersionWeight() == null ^ this.getTargetVersionWeight() == null)
            return false;
        if (other.getTargetVersionWeight() != null
                && other.getTargetVersionWeight().equals(this.getTargetVersionWeight()) == false)
            return false;
        return true;
    }
}
