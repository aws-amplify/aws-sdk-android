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
 * Contains summary information about a routing profile queue.
 * </p>
 */
public class RoutingProfileQueueConfigSummary implements Serializable {
    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     */
    private String queueArn;

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String queueName;

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
     * The delay, in seconds, that a contact should be in the queue before they
     * are routed to an available agent. For more information, see <a href=
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
     * The channels this queue supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     */
    private String channel;

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @return <p>
     *         The identifier for the queue.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingProfileQueueConfigSummary withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the queue.
     *         </p>
     */
    public String getQueueArn() {
        return queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @param queueArn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     */
    public void setQueueArn(String queueArn) {
        this.queueArn = queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueArn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingProfileQueueConfigSummary withQueueArn(String queueArn) {
        this.queueArn = queueArn;
        return this;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the queue.
     *         </p>
     */
    public String getQueueName() {
        return queueName;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param queueName <p>
     *            The name of the queue.
     *            </p>
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param queueName <p>
     *            The name of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingProfileQueueConfigSummary withQueueName(String queueName) {
        this.queueName = queueName;
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
    public RoutingProfileQueueConfigSummary withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The delay, in seconds, that a contact should be in the queue before they
     * are routed to an available agent. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9999<br/>
     *
     * @return <p>
     *         The delay, in seconds, that a contact should be in the queue
     *         before they are routed to an available agent. For more
     *         information, see <a href=
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
     * The delay, in seconds, that a contact should be in the queue before they
     * are routed to an available agent. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     * >Queues: priority and delay</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 9999<br/>
     *
     * @param delay <p>
     *            The delay, in seconds, that a contact should be in the queue
     *            before they are routed to an available agent. For more
     *            information, see <a href=
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
     * The delay, in seconds, that a contact should be in the queue before they
     * are routed to an available agent. For more information, see <a href=
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
     *            The delay, in seconds, that a contact should be in the queue
     *            before they are routed to an available agent. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html"
     *            >Queues: priority and delay</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingProfileQueueConfigSummary withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @return <p>
     *         The channels this queue supports.
     *         </p>
     * @see Channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels this queue supports.
     *            </p>
     * @see Channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels this queue supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public RoutingProfileQueueConfigSummary withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels this queue supports.
     *            </p>
     * @see Channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel.toString();
    }

    /**
     * <p>
     * The channels this queue supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channels this queue supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public RoutingProfileQueueConfigSummary withChannel(Channel channel) {
        this.channel = channel.toString();
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
        if (getQueueId() != null)
            sb.append("QueueId: " + getQueueId() + ",");
        if (getQueueArn() != null)
            sb.append("QueueArn: " + getQueueArn() + ",");
        if (getQueueName() != null)
            sb.append("QueueName: " + getQueueName() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getDelay() != null)
            sb.append("Delay: " + getDelay() + ",");
        if (getChannel() != null)
            sb.append("Channel: " + getChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getQueueArn() == null) ? 0 : getQueueArn().hashCode());
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getDelay() == null) ? 0 : getDelay().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoutingProfileQueueConfigSummary == false)
            return false;
        RoutingProfileQueueConfigSummary other = (RoutingProfileQueueConfigSummary) obj;

        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getQueueArn() == null ^ this.getQueueArn() == null)
            return false;
        if (other.getQueueArn() != null && other.getQueueArn().equals(this.getQueueArn()) == false)
            return false;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null
                && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getDelay() == null ^ this.getDelay() == null)
            return false;
        if (other.getDelay() != null && other.getDelay().equals(this.getDelay()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        return true;
    }
}
