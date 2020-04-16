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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Description of the source and destination queues between which the job has
 * moved, along with the timestamp of the move
 */
public class QueueTransition implements Serializable {
    /**
     * The queue that the job was on after the transition.
     */
    private String destinationQueue;

    /**
     * The queue that the job was on before the transition.
     */
    private String sourceQueue;

    /**
     * The time, in Unix epoch format, that the job moved from the source queue
     * to the destination queue.
     */
    private java.util.Date timestamp;

    /**
     * The queue that the job was on after the transition.
     *
     * @return The queue that the job was on after the transition.
     */
    public String getDestinationQueue() {
        return destinationQueue;
    }

    /**
     * The queue that the job was on after the transition.
     *
     * @param destinationQueue The queue that the job was on after the
     *            transition.
     */
    public void setDestinationQueue(String destinationQueue) {
        this.destinationQueue = destinationQueue;
    }

    /**
     * The queue that the job was on after the transition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationQueue The queue that the job was on after the
     *            transition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueTransition withDestinationQueue(String destinationQueue) {
        this.destinationQueue = destinationQueue;
        return this;
    }

    /**
     * The queue that the job was on before the transition.
     *
     * @return The queue that the job was on before the transition.
     */
    public String getSourceQueue() {
        return sourceQueue;
    }

    /**
     * The queue that the job was on before the transition.
     *
     * @param sourceQueue The queue that the job was on before the transition.
     */
    public void setSourceQueue(String sourceQueue) {
        this.sourceQueue = sourceQueue;
    }

    /**
     * The queue that the job was on before the transition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceQueue The queue that the job was on before the transition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueTransition withSourceQueue(String sourceQueue) {
        this.sourceQueue = sourceQueue;
        return this;
    }

    /**
     * The time, in Unix epoch format, that the job moved from the source queue
     * to the destination queue.
     *
     * @return The time, in Unix epoch format, that the job moved from the
     *         source queue to the destination queue.
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The time, in Unix epoch format, that the job moved from the source queue
     * to the destination queue.
     *
     * @param timestamp The time, in Unix epoch format, that the job moved from
     *            the source queue to the destination queue.
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The time, in Unix epoch format, that the job moved from the source queue
     * to the destination queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp The time, in Unix epoch format, that the job moved from
     *            the source queue to the destination queue.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueTransition withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getDestinationQueue() != null)
            sb.append("DestinationQueue: " + getDestinationQueue() + ",");
        if (getSourceQueue() != null)
            sb.append("SourceQueue: " + getSourceQueue() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationQueue() == null) ? 0 : getDestinationQueue().hashCode());
        hashCode = prime * hashCode
                + ((getSourceQueue() == null) ? 0 : getSourceQueue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueTransition == false)
            return false;
        QueueTransition other = (QueueTransition) obj;

        if (other.getDestinationQueue() == null ^ this.getDestinationQueue() == null)
            return false;
        if (other.getDestinationQueue() != null
                && other.getDestinationQueue().equals(this.getDestinationQueue()) == false)
            return false;
        if (other.getSourceQueue() == null ^ this.getSourceQueue() == null)
            return false;
        if (other.getSourceQueue() != null
                && other.getSourceQueue().equals(this.getSourceQueue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
