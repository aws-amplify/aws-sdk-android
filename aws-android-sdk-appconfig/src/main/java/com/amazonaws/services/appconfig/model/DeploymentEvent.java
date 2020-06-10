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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

/**
 * <p>
 * An object that describes a deployment event.
 * </p>
 */
public class DeploymentEvent implements Serializable {
    /**
     * <p>
     * The type of deployment event. Deployment event types include the start,
     * stop, or completion of a deployment; a percentage update; the start or
     * stop of a bake period; the start or completion of a rollback.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENTAGE_UPDATED, ROLLBACK_STARTED,
     * ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED,
     * DEPLOYMENT_COMPLETED
     */
    private String eventType;

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered
     * by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR
     */
    private String triggeredBy;

    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not
     * limited to, the user account or the CloudWatch alarm ARN that initiated a
     * rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     */
    private java.util.Date occurredAt;

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start,
     * stop, or completion of a deployment; a percentage update; the start or
     * stop of a bake period; the start or completion of a rollback.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENTAGE_UPDATED, ROLLBACK_STARTED,
     * ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED,
     * DEPLOYMENT_COMPLETED
     *
     * @return <p>
     *         The type of deployment event. Deployment event types include the
     *         start, stop, or completion of a deployment; a percentage update;
     *         the start or stop of a bake period; the start or completion of a
     *         rollback.
     *         </p>
     * @see DeploymentEventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start,
     * stop, or completion of a deployment; a percentage update; the start or
     * stop of a bake period; the start or completion of a rollback.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENTAGE_UPDATED, ROLLBACK_STARTED,
     * ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED,
     * DEPLOYMENT_COMPLETED
     *
     * @param eventType <p>
     *            The type of deployment event. Deployment event types include
     *            the start, stop, or completion of a deployment; a percentage
     *            update; the start or stop of a bake period; the start or
     *            completion of a rollback.
     *            </p>
     * @see DeploymentEventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start,
     * stop, or completion of a deployment; a percentage update; the start or
     * stop of a bake period; the start or completion of a rollback.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENTAGE_UPDATED, ROLLBACK_STARTED,
     * ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED,
     * DEPLOYMENT_COMPLETED
     *
     * @param eventType <p>
     *            The type of deployment event. Deployment event types include
     *            the start, stop, or completion of a deployment; a percentage
     *            update; the start or stop of a bake period; the start or
     *            completion of a rollback.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentEventType
     */
    public DeploymentEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start,
     * stop, or completion of a deployment; a percentage update; the start or
     * stop of a bake period; the start or completion of a rollback.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENTAGE_UPDATED, ROLLBACK_STARTED,
     * ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED,
     * DEPLOYMENT_COMPLETED
     *
     * @param eventType <p>
     *            The type of deployment event. Deployment event types include
     *            the start, stop, or completion of a deployment; a percentage
     *            update; the start or stop of a bake period; the start or
     *            completion of a rollback.
     *            </p>
     * @see DeploymentEventType
     */
    public void setEventType(DeploymentEventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start,
     * stop, or completion of a deployment; a percentage update; the start or
     * stop of a bake period; the start or completion of a rollback.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENTAGE_UPDATED, ROLLBACK_STARTED,
     * ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED,
     * DEPLOYMENT_COMPLETED
     *
     * @param eventType <p>
     *            The type of deployment event. Deployment event types include
     *            the start, stop, or completion of a deployment; a percentage
     *            update; the start or stop of a bake period; the start or
     *            completion of a rollback.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentEventType
     */
    public DeploymentEvent withEventType(DeploymentEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered
     * by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR
     *
     * @return <p>
     *         The entity that triggered the deployment event. Events can be
     *         triggered by a user, AWS AppConfig, an Amazon CloudWatch alarm,
     *         or an internal error.
     *         </p>
     * @see TriggeredBy
     */
    public String getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered
     * by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR
     *
     * @param triggeredBy <p>
     *            The entity that triggered the deployment event. Events can be
     *            triggered by a user, AWS AppConfig, an Amazon CloudWatch
     *            alarm, or an internal error.
     *            </p>
     * @see TriggeredBy
     */
    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered
     * by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal
     * error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR
     *
     * @param triggeredBy <p>
     *            The entity that triggered the deployment event. Events can be
     *            triggered by a user, AWS AppConfig, an Amazon CloudWatch
     *            alarm, or an internal error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggeredBy
     */
    public DeploymentEvent withTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
        return this;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered
     * by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR
     *
     * @param triggeredBy <p>
     *            The entity that triggered the deployment event. Events can be
     *            triggered by a user, AWS AppConfig, an Amazon CloudWatch
     *            alarm, or an internal error.
     *            </p>
     * @see TriggeredBy
     */
    public void setTriggeredBy(TriggeredBy triggeredBy) {
        this.triggeredBy = triggeredBy.toString();
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered
     * by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal
     * error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR
     *
     * @param triggeredBy <p>
     *            The entity that triggered the deployment event. Events can be
     *            triggered by a user, AWS AppConfig, an Amazon CloudWatch
     *            alarm, or an internal error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggeredBy
     */
    public DeploymentEvent withTriggeredBy(TriggeredBy triggeredBy) {
        this.triggeredBy = triggeredBy.toString();
        return this;
    }

    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not
     * limited to, the user account or the CloudWatch alarm ARN that initiated a
     * rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A description of the deployment event. Descriptions include, but
     *         are not limited to, the user account or the CloudWatch alarm ARN
     *         that initiated a rollback, the percentage of hosts that received
     *         the deployment, or in the case of an internal error, a
     *         recommendation to attempt a new deployment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not
     * limited to, the user account or the CloudWatch alarm ARN that initiated a
     * rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the deployment event. Descriptions include,
     *            but are not limited to, the user account or the CloudWatch
     *            alarm ARN that initiated a rollback, the percentage of hosts
     *            that received the deployment, or in the case of an internal
     *            error, a recommendation to attempt a new deployment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not
     * limited to, the user account or the CloudWatch alarm ARN that initiated a
     * rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the deployment event. Descriptions include,
     *            but are not limited to, the user account or the CloudWatch
     *            alarm ARN that initiated a rollback, the percentage of hosts
     *            that received the deployment, or in the case of an internal
     *            error, a recommendation to attempt a new deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentEvent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     *
     * @return <p>
     *         The date and time the event occurred.
     *         </p>
     */
    public java.util.Date getOccurredAt() {
        return occurredAt;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     *
     * @param occurredAt <p>
     *            The date and time the event occurred.
     *            </p>
     */
    public void setOccurredAt(java.util.Date occurredAt) {
        this.occurredAt = occurredAt;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param occurredAt <p>
     *            The date and time the event occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentEvent withOccurredAt(java.util.Date occurredAt) {
        this.occurredAt = occurredAt;
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
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getTriggeredBy() != null)
            sb.append("TriggeredBy: " + getTriggeredBy() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOccurredAt() != null)
            sb.append("OccurredAt: " + getOccurredAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode
                + ((getTriggeredBy() == null) ? 0 : getTriggeredBy().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOccurredAt() == null) ? 0 : getOccurredAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentEvent == false)
            return false;
        DeploymentEvent other = (DeploymentEvent) obj;

        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getTriggeredBy() == null ^ this.getTriggeredBy() == null)
            return false;
        if (other.getTriggeredBy() != null
                && other.getTriggeredBy().equals(this.getTriggeredBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOccurredAt() == null ^ this.getOccurredAt() == null)
            return false;
        if (other.getOccurredAt() != null
                && other.getOccurredAt().equals(this.getOccurredAt()) == false)
            return false;
        return true;
    }
}
