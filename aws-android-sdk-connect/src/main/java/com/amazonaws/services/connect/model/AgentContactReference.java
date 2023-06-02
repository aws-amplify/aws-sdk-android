/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the <a href=
 * "https://docs.aws.amazon.com/connect/latest/APIReference/API_Contact.html"
 * >contact</a> associated to the user.
 * </p>
 */
public class AgentContactReference implements Serializable {
    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     */
    private String channel;

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     */
    private String initiationMethod;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >state of the contact</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCOMING, PENDING, CONNECTING, CONNECTED,
     * CONNECTED_ONHOLD, MISSED, ERROR, ENDED, REJECTED
     */
    private String agentContactState;

    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     */
    private java.util.Date stateStartTimestamp;

    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     */
    private java.util.Date connectedToAgentTimestamp;

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     */
    private QueueReference queue;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact in this instance of Amazon Connect.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact in this instance of Amazon
     *            Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentContactReference withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @return <p>
     *         The channel of the contact.
     *         </p>
     * @see Channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel of the contact.
     *            </p>
     * @see Channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public AgentContactReference withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel of the contact.
     *            </p>
     * @see Channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel.toString();
    }

    /**
     * <p>
     * The channel of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public AgentContactReference withChannel(Channel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @return <p>
     *         How the contact was initiated.
     *         </p>
     * @see ContactInitiationMethod
     */
    public String getInitiationMethod() {
        return initiationMethod;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @param initiationMethod <p>
     *            How the contact was initiated.
     *            </p>
     * @see ContactInitiationMethod
     */
    public void setInitiationMethod(String initiationMethod) {
        this.initiationMethod = initiationMethod;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @param initiationMethod <p>
     *            How the contact was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactInitiationMethod
     */
    public AgentContactReference withInitiationMethod(String initiationMethod) {
        this.initiationMethod = initiationMethod;
        return this;
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @param initiationMethod <p>
     *            How the contact was initiated.
     *            </p>
     * @see ContactInitiationMethod
     */
    public void setInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
    }

    /**
     * <p>
     * How the contact was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @param initiationMethod <p>
     *            How the contact was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactInitiationMethod
     */
    public AgentContactReference withInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >state of the contact</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCOMING, PENDING, CONNECTING, CONNECTED,
     * CONNECTED_ONHOLD, MISSED, ERROR, ENDED, REJECTED
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *         >state of the contact</a>.
     *         </p>
     * @see ContactState
     */
    public String getAgentContactState() {
        return agentContactState;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >state of the contact</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCOMING, PENDING, CONNECTING, CONNECTED,
     * CONNECTED_ONHOLD, MISSED, ERROR, ENDED, REJECTED
     *
     * @param agentContactState <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *            >state of the contact</a>.
     *            </p>
     * @see ContactState
     */
    public void setAgentContactState(String agentContactState) {
        this.agentContactState = agentContactState;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >state of the contact</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCOMING, PENDING, CONNECTING, CONNECTED,
     * CONNECTED_ONHOLD, MISSED, ERROR, ENDED, REJECTED
     *
     * @param agentContactState <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *            >state of the contact</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactState
     */
    public AgentContactReference withAgentContactState(String agentContactState) {
        this.agentContactState = agentContactState;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >state of the contact</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCOMING, PENDING, CONNECTING, CONNECTED,
     * CONNECTED_ONHOLD, MISSED, ERROR, ENDED, REJECTED
     *
     * @param agentContactState <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *            >state of the contact</a>.
     *            </p>
     * @see ContactState
     */
    public void setAgentContactState(ContactState agentContactState) {
        this.agentContactState = agentContactState.toString();
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >state of the contact</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCOMING, PENDING, CONNECTING, CONNECTED,
     * CONNECTED_ONHOLD, MISSED, ERROR, ENDED, REJECTED
     *
     * @param agentContactState <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *            >state of the contact</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactState
     */
    public AgentContactReference withAgentContactState(ContactState agentContactState) {
        this.agentContactState = agentContactState.toString();
        return this;
    }

    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     *
     * @return <p>
     *         The epoch timestamp when the contact state started.
     *         </p>
     */
    public java.util.Date getStateStartTimestamp() {
        return stateStartTimestamp;
    }

    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     *
     * @param stateStartTimestamp <p>
     *            The epoch timestamp when the contact state started.
     *            </p>
     */
    public void setStateStartTimestamp(java.util.Date stateStartTimestamp) {
        this.stateStartTimestamp = stateStartTimestamp;
    }

    /**
     * <p>
     * The epoch timestamp when the contact state started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateStartTimestamp <p>
     *            The epoch timestamp when the contact state started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentContactReference withStateStartTimestamp(java.util.Date stateStartTimestamp) {
        this.stateStartTimestamp = stateStartTimestamp;
        return this;
    }

    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     *
     * @return <p>
     *         The time at which the contact was connected to an agent.
     *         </p>
     */
    public java.util.Date getConnectedToAgentTimestamp() {
        return connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     *
     * @param connectedToAgentTimestamp <p>
     *            The time at which the contact was connected to an agent.
     *            </p>
     */
    public void setConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        this.connectedToAgentTimestamp = connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The time at which the contact was connected to an agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectedToAgentTimestamp <p>
     *            The time at which the contact was connected to an agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentContactReference withConnectedToAgentTimestamp(
            java.util.Date connectedToAgentTimestamp) {
        this.connectedToAgentTimestamp = connectedToAgentTimestamp;
        return this;
    }

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     *
     * @return <p>
     *         Contains information about a queue resource for which metrics are
     *         returned.
     *         </p>
     */
    public QueueReference getQueue() {
        return queue;
    }

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     *
     * @param queue <p>
     *            Contains information about a queue resource for which metrics
     *            are returned.
     *            </p>
     */
    public void setQueue(QueueReference queue) {
        this.queue = queue;
    }

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue <p>
     *            Contains information about a queue resource for which metrics
     *            are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgentContactReference withQueue(QueueReference queue) {
        this.queue = queue;
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
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getChannel() != null)
            sb.append("Channel: " + getChannel() + ",");
        if (getInitiationMethod() != null)
            sb.append("InitiationMethod: " + getInitiationMethod() + ",");
        if (getAgentContactState() != null)
            sb.append("AgentContactState: " + getAgentContactState() + ",");
        if (getStateStartTimestamp() != null)
            sb.append("StateStartTimestamp: " + getStateStartTimestamp() + ",");
        if (getConnectedToAgentTimestamp() != null)
            sb.append("ConnectedToAgentTimestamp: " + getConnectedToAgentTimestamp() + ",");
        if (getQueue() != null)
            sb.append("Queue: " + getQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode
                + ((getInitiationMethod() == null) ? 0 : getInitiationMethod().hashCode());
        hashCode = prime * hashCode
                + ((getAgentContactState() == null) ? 0 : getAgentContactState().hashCode());
        hashCode = prime * hashCode
                + ((getStateStartTimestamp() == null) ? 0 : getStateStartTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectedToAgentTimestamp() == null) ? 0 : getConnectedToAgentTimestamp()
                        .hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentContactReference == false)
            return false;
        AgentContactReference other = (AgentContactReference) obj;

        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getInitiationMethod() == null ^ this.getInitiationMethod() == null)
            return false;
        if (other.getInitiationMethod() != null
                && other.getInitiationMethod().equals(this.getInitiationMethod()) == false)
            return false;
        if (other.getAgentContactState() == null ^ this.getAgentContactState() == null)
            return false;
        if (other.getAgentContactState() != null
                && other.getAgentContactState().equals(this.getAgentContactState()) == false)
            return false;
        if (other.getStateStartTimestamp() == null ^ this.getStateStartTimestamp() == null)
            return false;
        if (other.getStateStartTimestamp() != null
                && other.getStateStartTimestamp().equals(this.getStateStartTimestamp()) == false)
            return false;
        if (other.getConnectedToAgentTimestamp() == null
                ^ this.getConnectedToAgentTimestamp() == null)
            return false;
        if (other.getConnectedToAgentTimestamp() != null
                && other.getConnectedToAgentTimestamp().equals(this.getConnectedToAgentTimestamp()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        return true;
    }
}
