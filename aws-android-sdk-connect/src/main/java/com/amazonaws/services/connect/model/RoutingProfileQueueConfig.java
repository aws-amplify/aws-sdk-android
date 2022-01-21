/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the queue and channel for which priority and delay
 * can be set.
 * </p>
 */
public class RoutingProfileQueueConfig implements Serializable {
    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     */
    private RoutingProfileQueueReference queueReference;

    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     */
    private Integer priority;

    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are
     * routed to an available agent. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9999<br/>
     */
    private Integer delay;

    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     *
     * @return <p>
     *         Contains information about a queue resource.
     *         </p>
     */
    public RoutingProfileQueueReference getQueueReference() {
        return queueReference;
    }

    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     *
     * @param queueReference <p>
     *            Contains information about a queue resource.
     *            </p>
     */
    public void setQueueReference(RoutingProfileQueueReference queueReference) {
        this.queueReference = queueReference;
    }

    /**
     * <p>
     * Contains information about a queue resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueReference <p>
     *            Contains information about a queue resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingProfileQueueConfig withQueueReference(RoutingProfileQueueReference queueReference) {
        this.queueReference = queueReference;
        return this;
    }

    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @return <p>
     *         The order in which contacts are to be handled for the queue. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *         >Queues: priority and delay</a>.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param priority <p>
     *            The order in which contacts are to be handled for the queue.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *            >Queues: priority and delay</a>.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The order in which contacts are to be handled for the queue. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param priority <p>
     *            The order in which contacts are to be handled for the queue.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *            >Queues: priority and delay</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingProfileQueueConfig withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are
     * routed to an available agent. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9999<br/>
     *
     * @return <p>
     *         The delay, in seconds, a contact should be in the queue before
     *         they are routed to an available agent. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *         >Queues: priority and delay</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are
     * routed to an available agent. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9999<br/>
     *
     * @param delay <p>
     *            The delay, in seconds, a contact should be in the queue before
     *            they are routed to an available agent. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *            >Queues: priority and delay</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    /**
     * <p>
     * The delay, in seconds, a contact should be in the queue before they are
     * routed to an available agent. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9999<br/>
     *
     * @param delay <p>
     *            The delay, in seconds, a contact should be in the queue before
     *            they are routed to an available agent. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *            >Queues: priority and delay</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingProfileQueueConfig withDelay(Integer delay) {
        this.delay = delay;
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
        if (getQueueReference() != null)
            sb.append("QueueReference: " + getQueueReference() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getDelay() != null)
            sb.append("Delay: " + getDelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueueReference() == null) ? 0 : getQueueReference().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getDelay() == null) ? 0 : getDelay().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoutingProfileQueueConfig == false)
            return false;
        RoutingProfileQueueConfig other = (RoutingProfileQueueConfig) obj;

        if (other.getQueueReference() == null ^ this.getQueueReference() == null)
            return false;
        if (other.getQueueReference() != null
                && other.getQueueReference().equals(this.getQueueReference()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getDelay() == null ^ this.getDelay() == null)
            return false;
        if (other.getDelay() != null && other.getDelay().equals(this.getDelay()) == false)
            return false;
        return true;
    }
}
