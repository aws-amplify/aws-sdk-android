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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for specifying the AWS Lambda notification configuration.
 * </p>
 */
public class CloudFunctionConfiguration implements Serializable {
    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The bucket event for which to send notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3:ReducedRedundancyLostObject,
     * s3:ObjectCreated:*, s3:ObjectCreated:Put, s3:ObjectCreated:Post,
     * s3:ObjectCreated:Copy, s3:ObjectCreated:CompleteMultipartUpload,
     * s3:ObjectRemoved:*, s3:ObjectRemoved:Delete,
     * s3:ObjectRemoved:DeleteMarkerCreated, s3:ObjectRestore:*,
     * s3:ObjectRestore:Post, s3:ObjectRestore:Completed, s3:Replication:*,
     * s3:Replication:OperationFailedReplication,
     * s3:Replication:OperationNotTracked,
     * s3:Replication:OperationMissedThreshold,
     * s3:Replication:OperationReplicatedAfterThreshold
     */
    private String event;

    /**
     * <p>
     * Bucket events for which to send notifications.
     * </p>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * Lambda cloud function ARN that Amazon S3 can invoke when it detects
     * events of the specified type.
     * </p>
     */
    private String cloudFunction;

    /**
     * <p>
     * The role supporting the invocation of the Lambda function
     * </p>
     */
    private String invocationRole;

    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     *
     * @return <p>
     *         An optional unique identifier for configurations in a
     *         notification configuration. If you don't provide one, Amazon S3
     *         will assign an ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     *
     * @param id <p>
     *            An optional unique identifier for configurations in a
     *            notification configuration. If you don't provide one, Amazon
     *            S3 will assign an ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            An optional unique identifier for configurations in a
     *            notification configuration. If you don't provide one, Amazon
     *            S3 will assign an ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFunctionConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The bucket event for which to send notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3:ReducedRedundancyLostObject,
     * s3:ObjectCreated:*, s3:ObjectCreated:Put, s3:ObjectCreated:Post,
     * s3:ObjectCreated:Copy, s3:ObjectCreated:CompleteMultipartUpload,
     * s3:ObjectRemoved:*, s3:ObjectRemoved:Delete,
     * s3:ObjectRemoved:DeleteMarkerCreated, s3:ObjectRestore:*,
     * s3:ObjectRestore:Post, s3:ObjectRestore:Completed, s3:Replication:*,
     * s3:Replication:OperationFailedReplication,
     * s3:Replication:OperationNotTracked,
     * s3:Replication:OperationMissedThreshold,
     * s3:Replication:OperationReplicatedAfterThreshold
     *
     * @return <p>
     *         The bucket event for which to send notifications.
     *         </p>
     * @see Event
     */
    public String getEvent() {
        return event;
    }

    /**
     * <p>
     * The bucket event for which to send notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3:ReducedRedundancyLostObject,
     * s3:ObjectCreated:*, s3:ObjectCreated:Put, s3:ObjectCreated:Post,
     * s3:ObjectCreated:Copy, s3:ObjectCreated:CompleteMultipartUpload,
     * s3:ObjectRemoved:*, s3:ObjectRemoved:Delete,
     * s3:ObjectRemoved:DeleteMarkerCreated, s3:ObjectRestore:*,
     * s3:ObjectRestore:Post, s3:ObjectRestore:Completed, s3:Replication:*,
     * s3:Replication:OperationFailedReplication,
     * s3:Replication:OperationNotTracked,
     * s3:Replication:OperationMissedThreshold,
     * s3:Replication:OperationReplicatedAfterThreshold
     *
     * @param event <p>
     *            The bucket event for which to send notifications.
     *            </p>
     * @see Event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The bucket event for which to send notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3:ReducedRedundancyLostObject,
     * s3:ObjectCreated:*, s3:ObjectCreated:Put, s3:ObjectCreated:Post,
     * s3:ObjectCreated:Copy, s3:ObjectCreated:CompleteMultipartUpload,
     * s3:ObjectRemoved:*, s3:ObjectRemoved:Delete,
     * s3:ObjectRemoved:DeleteMarkerCreated, s3:ObjectRestore:*,
     * s3:ObjectRestore:Post, s3:ObjectRestore:Completed, s3:Replication:*,
     * s3:Replication:OperationFailedReplication,
     * s3:Replication:OperationNotTracked,
     * s3:Replication:OperationMissedThreshold,
     * s3:Replication:OperationReplicatedAfterThreshold
     *
     * @param event <p>
     *            The bucket event for which to send notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Event
     */
    public CloudFunctionConfiguration withEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * <p>
     * The bucket event for which to send notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3:ReducedRedundancyLostObject,
     * s3:ObjectCreated:*, s3:ObjectCreated:Put, s3:ObjectCreated:Post,
     * s3:ObjectCreated:Copy, s3:ObjectCreated:CompleteMultipartUpload,
     * s3:ObjectRemoved:*, s3:ObjectRemoved:Delete,
     * s3:ObjectRemoved:DeleteMarkerCreated, s3:ObjectRestore:*,
     * s3:ObjectRestore:Post, s3:ObjectRestore:Completed, s3:Replication:*,
     * s3:Replication:OperationFailedReplication,
     * s3:Replication:OperationNotTracked,
     * s3:Replication:OperationMissedThreshold,
     * s3:Replication:OperationReplicatedAfterThreshold
     *
     * @param event <p>
     *            The bucket event for which to send notifications.
     *            </p>
     * @see Event
     */
    public void setEvent(Event event) {
        this.event = event.toString();
    }

    /**
     * <p>
     * The bucket event for which to send notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3:ReducedRedundancyLostObject,
     * s3:ObjectCreated:*, s3:ObjectCreated:Put, s3:ObjectCreated:Post,
     * s3:ObjectCreated:Copy, s3:ObjectCreated:CompleteMultipartUpload,
     * s3:ObjectRemoved:*, s3:ObjectRemoved:Delete,
     * s3:ObjectRemoved:DeleteMarkerCreated, s3:ObjectRestore:*,
     * s3:ObjectRestore:Post, s3:ObjectRestore:Completed, s3:Replication:*,
     * s3:Replication:OperationFailedReplication,
     * s3:Replication:OperationNotTracked,
     * s3:Replication:OperationMissedThreshold,
     * s3:Replication:OperationReplicatedAfterThreshold
     *
     * @param event <p>
     *            The bucket event for which to send notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Event
     */
    public CloudFunctionConfiguration withEvent(Event event) {
        this.event = event.toString();
        return this;
    }

    /**
     * <p>
     * Bucket events for which to send notifications.
     * </p>
     *
     * @return <p>
     *         Bucket events for which to send notifications.
     *         </p>
     */
    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * Bucket events for which to send notifications.
     * </p>
     *
     * @param events <p>
     *            Bucket events for which to send notifications.
     *            </p>
     */
    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * Bucket events for which to send notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Bucket events for which to send notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFunctionConfiguration withEvents(String... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<String>(events.length);
        }
        for (String value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Bucket events for which to send notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Bucket events for which to send notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFunctionConfiguration withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Lambda cloud function ARN that Amazon S3 can invoke when it detects
     * events of the specified type.
     * </p>
     *
     * @return <p>
     *         Lambda cloud function ARN that Amazon S3 can invoke when it
     *         detects events of the specified type.
     *         </p>
     */
    public String getCloudFunction() {
        return cloudFunction;
    }

    /**
     * <p>
     * Lambda cloud function ARN that Amazon S3 can invoke when it detects
     * events of the specified type.
     * </p>
     *
     * @param cloudFunction <p>
     *            Lambda cloud function ARN that Amazon S3 can invoke when it
     *            detects events of the specified type.
     *            </p>
     */
    public void setCloudFunction(String cloudFunction) {
        this.cloudFunction = cloudFunction;
    }

    /**
     * <p>
     * Lambda cloud function ARN that Amazon S3 can invoke when it detects
     * events of the specified type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFunction <p>
     *            Lambda cloud function ARN that Amazon S3 can invoke when it
     *            detects events of the specified type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFunctionConfiguration withCloudFunction(String cloudFunction) {
        this.cloudFunction = cloudFunction;
        return this;
    }

    /**
     * <p>
     * The role supporting the invocation of the Lambda function
     * </p>
     *
     * @return <p>
     *         The role supporting the invocation of the Lambda function
     *         </p>
     */
    public String getInvocationRole() {
        return invocationRole;
    }

    /**
     * <p>
     * The role supporting the invocation of the Lambda function
     * </p>
     *
     * @param invocationRole <p>
     *            The role supporting the invocation of the Lambda function
     *            </p>
     */
    public void setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
    }

    /**
     * <p>
     * The role supporting the invocation of the Lambda function
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invocationRole <p>
     *            The role supporting the invocation of the Lambda function
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFunctionConfiguration withInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getEvent() != null)
            sb.append("Event: " + getEvent() + ",");
        if (getEvents() != null)
            sb.append("Events: " + getEvents() + ",");
        if (getCloudFunction() != null)
            sb.append("CloudFunction: " + getCloudFunction() + ",");
        if (getInvocationRole() != null)
            sb.append("InvocationRole: " + getInvocationRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode
                + ((getCloudFunction() == null) ? 0 : getCloudFunction().hashCode());
        hashCode = prime * hashCode
                + ((getInvocationRole() == null) ? 0 : getInvocationRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFunctionConfiguration == false)
            return false;
        CloudFunctionConfiguration other = (CloudFunctionConfiguration) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getCloudFunction() == null ^ this.getCloudFunction() == null)
            return false;
        if (other.getCloudFunction() != null
                && other.getCloudFunction().equals(this.getCloudFunction()) == false)
            return false;
        if (other.getInvocationRole() == null ^ this.getInvocationRole() == null)
            return false;
        if (other.getInvocationRole() != null
                && other.getInvocationRole().equals(this.getInvocationRole()) == false)
            return false;
        return true;
    }
}
