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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a queued dataset SPICE ingestion.
 * </p>
 */
public class QueueInfo implements Serializable {
    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     */
    private String waitingOnIngestion;

    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the
     * ongoing ingestion to complete.
     * </p>
     */
    private String queuedIngestion;

    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     *
     * @return <p>
     *         The ID of the queued ingestion.
     *         </p>
     */
    public String getWaitingOnIngestion() {
        return waitingOnIngestion;
    }

    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     *
     * @param waitingOnIngestion <p>
     *            The ID of the queued ingestion.
     *            </p>
     */
    public void setWaitingOnIngestion(String waitingOnIngestion) {
        this.waitingOnIngestion = waitingOnIngestion;
    }

    /**
     * <p>
     * The ID of the queued ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitingOnIngestion <p>
     *            The ID of the queued ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueInfo withWaitingOnIngestion(String waitingOnIngestion) {
        this.waitingOnIngestion = waitingOnIngestion;
        return this;
    }

    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the
     * ongoing ingestion to complete.
     * </p>
     *
     * @return <p>
     *         The ID of the ongoing ingestion. The queued ingestion is waiting
     *         for the ongoing ingestion to complete.
     *         </p>
     */
    public String getQueuedIngestion() {
        return queuedIngestion;
    }

    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the
     * ongoing ingestion to complete.
     * </p>
     *
     * @param queuedIngestion <p>
     *            The ID of the ongoing ingestion. The queued ingestion is
     *            waiting for the ongoing ingestion to complete.
     *            </p>
     */
    public void setQueuedIngestion(String queuedIngestion) {
        this.queuedIngestion = queuedIngestion;
    }

    /**
     * <p>
     * The ID of the ongoing ingestion. The queued ingestion is waiting for the
     * ongoing ingestion to complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queuedIngestion <p>
     *            The ID of the ongoing ingestion. The queued ingestion is
     *            waiting for the ongoing ingestion to complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueueInfo withQueuedIngestion(String queuedIngestion) {
        this.queuedIngestion = queuedIngestion;
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
        if (getWaitingOnIngestion() != null)
            sb.append("WaitingOnIngestion: " + getWaitingOnIngestion() + ",");
        if (getQueuedIngestion() != null)
            sb.append("QueuedIngestion: " + getQueuedIngestion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWaitingOnIngestion() == null) ? 0 : getWaitingOnIngestion().hashCode());
        hashCode = prime * hashCode
                + ((getQueuedIngestion() == null) ? 0 : getQueuedIngestion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueueInfo == false)
            return false;
        QueueInfo other = (QueueInfo) obj;

        if (other.getWaitingOnIngestion() == null ^ this.getWaitingOnIngestion() == null)
            return false;
        if (other.getWaitingOnIngestion() != null
                && other.getWaitingOnIngestion().equals(this.getWaitingOnIngestion()) == false)
            return false;
        if (other.getQueuedIngestion() == null ^ this.getQueuedIngestion() == null)
            return false;
        if (other.getQueuedIngestion() != null
                && other.getQueuedIngestion().equals(this.getQueuedIngestion()) == false)
            return false;
        return true;
    }
}
