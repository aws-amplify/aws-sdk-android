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
 * A container for specifying the configuration for publication of messages to
 * an Amazon Simple Notification Service (Amazon SNS) topic when Amazon S3
 * detects specified events. This data type is deprecated. Use
 * <a>TopicConfiguration</a> instead.
 * </p>
 */
public class TopicConfigurationDeprecated implements Serializable {
    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     */
    private String id;

    /**
     * <p>
     * A collection of events related to objects
     * </p>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * Bucket event for which to send notifications.
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
     * Amazon SNS topic to which Amazon S3 will publish a message to report the
     * specified events for the bucket.
     * </p>
     */
    private String topic;

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
    public TopicConfigurationDeprecated withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A collection of events related to objects
     * </p>
     *
     * @return <p>
     *         A collection of events related to objects
     *         </p>
     */
    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * A collection of events related to objects
     * </p>
     *
     * @param events <p>
     *            A collection of events related to objects
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
     * A collection of events related to objects
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            A collection of events related to objects
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicConfigurationDeprecated withEvents(String... events) {
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
     * A collection of events related to objects
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            A collection of events related to objects
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicConfigurationDeprecated withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Bucket event for which to send notifications.
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
     *         Bucket event for which to send notifications.
     *         </p>
     * @see Event
     */
    public String getEvent() {
        return event;
    }

    /**
     * <p>
     * Bucket event for which to send notifications.
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
     *            Bucket event for which to send notifications.
     *            </p>
     * @see Event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * Bucket event for which to send notifications.
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
     *            Bucket event for which to send notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Event
     */
    public TopicConfigurationDeprecated withEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * <p>
     * Bucket event for which to send notifications.
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
     *            Bucket event for which to send notifications.
     *            </p>
     * @see Event
     */
    public void setEvent(Event event) {
        this.event = event.toString();
    }

    /**
     * <p>
     * Bucket event for which to send notifications.
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
     *            Bucket event for which to send notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Event
     */
    public TopicConfigurationDeprecated withEvent(Event event) {
        this.event = event.toString();
        return this;
    }

    /**
     * <p>
     * Amazon SNS topic to which Amazon S3 will publish a message to report the
     * specified events for the bucket.
     * </p>
     *
     * @return <p>
     *         Amazon SNS topic to which Amazon S3 will publish a message to
     *         report the specified events for the bucket.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * Amazon SNS topic to which Amazon S3 will publish a message to report the
     * specified events for the bucket.
     * </p>
     *
     * @param topic <p>
     *            Amazon SNS topic to which Amazon S3 will publish a message to
     *            report the specified events for the bucket.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * Amazon SNS topic to which Amazon S3 will publish a message to report the
     * specified events for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            Amazon SNS topic to which Amazon S3 will publish a message to
     *            report the specified events for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicConfigurationDeprecated withTopic(String topic) {
        this.topic = topic;
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
        if (getEvents() != null)
            sb.append("Events: " + getEvents() + ",");
        if (getEvent() != null)
            sb.append("Event: " + getEvent() + ",");
        if (getTopic() != null)
            sb.append("Topic: " + getTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicConfigurationDeprecated == false)
            return false;
        TopicConfigurationDeprecated other = (TopicConfigurationDeprecated) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        return true;
    }
}
