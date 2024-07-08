/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information of returned contact.
 * </p>
 */
public class ContactSearchSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the
     * initial contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String initialContactId;

    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous
     * contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String previousContactId;

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     */
    private String initiationMethod;

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     */
    private String channel;

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     */
    private ContactSearchSummaryQueueInfo queueInfo;

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     */
    private ContactSearchSummaryAgentInfo agentInfo;

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For
     * <code>INBOUND</code>, this is when the contact arrived. For
     * <code>OUTBOUND</code>, this is when the agent began dialing. For
     * <code>CALLBACK</code>, this is when the callback contact was created. For
     * <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing
     * the external participant. For <code>MONITOR</code>, this is when the
     * supervisor started listening to a contact.
     * </p>
     */
    private java.util.Date initiationTimestamp;

    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon
     * Connect.
     * </p>
     */
    private java.util.Date disconnectTimestamp;

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the
     * inbound flow.
     * </p>
     */
    private java.util.Date scheduledTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the contact.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the contact.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact summary.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the contact summary.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the contact summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the contact summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the
     * initial contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         If this contact is related to other contacts, this is the ID of
     *         the initial contact.
     *         </p>
     */
    public String getInitialContactId() {
        return initialContactId;
    }

    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the
     * initial contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            If this contact is related to other contacts, this is the ID
     *            of the initial contact.
     *            </p>
     */
    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * If this contact is related to other contacts, this is the ID of the
     * initial contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            If this contact is related to other contacts, this is the ID
     *            of the initial contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
        return this;
    }

    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous
     * contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         If this contact is not the first contact, this is the ID of the
     *         previous contact.
     *         </p>
     */
    public String getPreviousContactId() {
        return previousContactId;
    }

    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous
     * contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param previousContactId <p>
     *            If this contact is not the first contact, this is the ID of
     *            the previous contact.
     *            </p>
     */
    public void setPreviousContactId(String previousContactId) {
        this.previousContactId = previousContactId;
    }

    /**
     * <p>
     * If this contact is not the first contact, this is the ID of the previous
     * contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param previousContactId <p>
     *            If this contact is not the first contact, this is the ID of
     *            the previous contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withPreviousContactId(String previousContactId) {
        this.previousContactId = previousContactId;
        return this;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @return <p>
     *         Indicates how the contact was initiated.
     *         </p>
     * @see ContactInitiationMethod
     */
    public String getInitiationMethod() {
        return initiationMethod;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @param initiationMethod <p>
     *            Indicates how the contact was initiated.
     *            </p>
     * @see ContactInitiationMethod
     */
    public void setInitiationMethod(String initiationMethod) {
        this.initiationMethod = initiationMethod;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
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
     *            Indicates how the contact was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactInitiationMethod
     */
    public ContactSearchSummary withInitiationMethod(String initiationMethod) {
        this.initiationMethod = initiationMethod;
        return this;
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND, OUTBOUND, TRANSFER, QUEUE_TRANSFER,
     * CALLBACK, API, DISCONNECT, MONITOR, EXTERNAL_OUTBOUND
     *
     * @param initiationMethod <p>
     *            Indicates how the contact was initiated.
     *            </p>
     * @see ContactInitiationMethod
     */
    public void setInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
    }

    /**
     * <p>
     * Indicates how the contact was initiated.
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
     *            Indicates how the contact was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactInitiationMethod
     */
    public ContactSearchSummary withInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
        return this;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @return <p>
     *         How the contact reached your contact center.
     *         </p>
     * @see Channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            How the contact reached your contact center.
     *            </p>
     * @see Channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            How the contact reached your contact center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public ContactSearchSummary withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            How the contact reached your contact center.
     *            </p>
     * @see Channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel.toString();
    }

    /**
     * <p>
     * How the contact reached your contact center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            How the contact reached your contact center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public ContactSearchSummary withChannel(Channel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     *
     * @return <p>
     *         If this contact was queued, this contains information about the
     *         queue.
     *         </p>
     */
    public ContactSearchSummaryQueueInfo getQueueInfo() {
        return queueInfo;
    }

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     *
     * @param queueInfo <p>
     *            If this contact was queued, this contains information about
     *            the queue.
     *            </p>
     */
    public void setQueueInfo(ContactSearchSummaryQueueInfo queueInfo) {
        this.queueInfo = queueInfo;
    }

    /**
     * <p>
     * If this contact was queued, this contains information about the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueInfo <p>
     *            If this contact was queued, this contains information about
     *            the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withQueueInfo(ContactSearchSummaryQueueInfo queueInfo) {
        this.queueInfo = queueInfo;
        return this;
    }

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     *
     * @return <p>
     *         Information about the agent who accepted the contact.
     *         </p>
     */
    public ContactSearchSummaryAgentInfo getAgentInfo() {
        return agentInfo;
    }

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     *
     * @param agentInfo <p>
     *            Information about the agent who accepted the contact.
     *            </p>
     */
    public void setAgentInfo(ContactSearchSummaryAgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentInfo <p>
     *            Information about the agent who accepted the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withAgentInfo(ContactSearchSummaryAgentInfo agentInfo) {
        this.agentInfo = agentInfo;
        return this;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For
     * <code>INBOUND</code>, this is when the contact arrived. For
     * <code>OUTBOUND</code>, this is when the agent began dialing. For
     * <code>CALLBACK</code>, this is when the callback contact was created. For
     * <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing
     * the external participant. For <code>MONITOR</code>, this is when the
     * supervisor started listening to a contact.
     * </p>
     *
     * @return <p>
     *         The date and time this contact was initiated, in UTC time. For
     *         <code>INBOUND</code>, this is when the contact arrived. For
     *         <code>OUTBOUND</code>, this is when the agent began dialing. For
     *         <code>CALLBACK</code>, this is when the callback contact was
     *         created. For <code>TRANSFER</code> and
     *         <code>QUEUE_TRANSFER</code>, this is when the transfer was
     *         initiated. For API, this is when the request arrived. For
     *         <code>EXTERNAL_OUTBOUND</code>, this is when the agent started
     *         dialing the external participant. For <code>MONITOR</code>, this
     *         is when the supervisor started listening to a contact.
     *         </p>
     */
    public java.util.Date getInitiationTimestamp() {
        return initiationTimestamp;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For
     * <code>INBOUND</code>, this is when the contact arrived. For
     * <code>OUTBOUND</code>, this is when the agent began dialing. For
     * <code>CALLBACK</code>, this is when the callback contact was created. For
     * <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing
     * the external participant. For <code>MONITOR</code>, this is when the
     * supervisor started listening to a contact.
     * </p>
     *
     * @param initiationTimestamp <p>
     *            The date and time this contact was initiated, in UTC time. For
     *            <code>INBOUND</code>, this is when the contact arrived. For
     *            <code>OUTBOUND</code>, this is when the agent began dialing.
     *            For <code>CALLBACK</code>, this is when the callback contact
     *            was created. For <code>TRANSFER</code> and
     *            <code>QUEUE_TRANSFER</code>, this is when the transfer was
     *            initiated. For API, this is when the request arrived. For
     *            <code>EXTERNAL_OUTBOUND</code>, this is when the agent started
     *            dialing the external participant. For <code>MONITOR</code>,
     *            this is when the supervisor started listening to a contact.
     *            </p>
     */
    public void setInitiationTimestamp(java.util.Date initiationTimestamp) {
        this.initiationTimestamp = initiationTimestamp;
    }

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For
     * <code>INBOUND</code>, this is when the contact arrived. For
     * <code>OUTBOUND</code>, this is when the agent began dialing. For
     * <code>CALLBACK</code>, this is when the callback contact was created. For
     * <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For API, this is when the request arrived. For
     * <code>EXTERNAL_OUTBOUND</code>, this is when the agent started dialing
     * the external participant. For <code>MONITOR</code>, this is when the
     * supervisor started listening to a contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiationTimestamp <p>
     *            The date and time this contact was initiated, in UTC time. For
     *            <code>INBOUND</code>, this is when the contact arrived. For
     *            <code>OUTBOUND</code>, this is when the agent began dialing.
     *            For <code>CALLBACK</code>, this is when the callback contact
     *            was created. For <code>TRANSFER</code> and
     *            <code>QUEUE_TRANSFER</code>, this is when the transfer was
     *            initiated. For API, this is when the request arrived. For
     *            <code>EXTERNAL_OUTBOUND</code>, this is when the agent started
     *            dialing the external participant. For <code>MONITOR</code>,
     *            this is when the supervisor started listening to a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withInitiationTimestamp(java.util.Date initiationTimestamp) {
        this.initiationTimestamp = initiationTimestamp;
        return this;
    }

    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon
     * Connect.
     * </p>
     *
     * @return <p>
     *         The timestamp when the customer endpoint disconnected from Amazon
     *         Connect.
     *         </p>
     */
    public java.util.Date getDisconnectTimestamp() {
        return disconnectTimestamp;
    }

    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon
     * Connect.
     * </p>
     *
     * @param disconnectTimestamp <p>
     *            The timestamp when the customer endpoint disconnected from
     *            Amazon Connect.
     *            </p>
     */
    public void setDisconnectTimestamp(java.util.Date disconnectTimestamp) {
        this.disconnectTimestamp = disconnectTimestamp;
    }

    /**
     * <p>
     * The timestamp when the customer endpoint disconnected from Amazon
     * Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disconnectTimestamp <p>
     *            The timestamp when the customer endpoint disconnected from
     *            Amazon Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withDisconnectTimestamp(java.util.Date disconnectTimestamp) {
        this.disconnectTimestamp = disconnectTimestamp;
        return this;
    }

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the
     * inbound flow.
     * </p>
     *
     * @return <p>
     *         The timestamp, in Unix epoch time format, at which to start
     *         running the inbound flow.
     *         </p>
     */
    public java.util.Date getScheduledTimestamp() {
        return scheduledTimestamp;
    }

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the
     * inbound flow.
     * </p>
     *
     * @param scheduledTimestamp <p>
     *            The timestamp, in Unix epoch time format, at which to start
     *            running the inbound flow.
     *            </p>
     */
    public void setScheduledTimestamp(java.util.Date scheduledTimestamp) {
        this.scheduledTimestamp = scheduledTimestamp;
    }

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the
     * inbound flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledTimestamp <p>
     *            The timestamp, in Unix epoch time format, at which to start
     *            running the inbound flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummary withScheduledTimestamp(java.util.Date scheduledTimestamp) {
        this.scheduledTimestamp = scheduledTimestamp;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getInitialContactId() != null)
            sb.append("InitialContactId: " + getInitialContactId() + ",");
        if (getPreviousContactId() != null)
            sb.append("PreviousContactId: " + getPreviousContactId() + ",");
        if (getInitiationMethod() != null)
            sb.append("InitiationMethod: " + getInitiationMethod() + ",");
        if (getChannel() != null)
            sb.append("Channel: " + getChannel() + ",");
        if (getQueueInfo() != null)
            sb.append("QueueInfo: " + getQueueInfo() + ",");
        if (getAgentInfo() != null)
            sb.append("AgentInfo: " + getAgentInfo() + ",");
        if (getInitiationTimestamp() != null)
            sb.append("InitiationTimestamp: " + getInitiationTimestamp() + ",");
        if (getDisconnectTimestamp() != null)
            sb.append("DisconnectTimestamp: " + getDisconnectTimestamp() + ",");
        if (getScheduledTimestamp() != null)
            sb.append("ScheduledTimestamp: " + getScheduledTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousContactId() == null) ? 0 : getPreviousContactId().hashCode());
        hashCode = prime * hashCode
                + ((getInitiationMethod() == null) ? 0 : getInitiationMethod().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getQueueInfo() == null) ? 0 : getQueueInfo().hashCode());
        hashCode = prime * hashCode + ((getAgentInfo() == null) ? 0 : getAgentInfo().hashCode());
        hashCode = prime * hashCode
                + ((getInitiationTimestamp() == null) ? 0 : getInitiationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getDisconnectTimestamp() == null) ? 0 : getDisconnectTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledTimestamp() == null) ? 0 : getScheduledTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactSearchSummary == false)
            return false;
        ContactSearchSummary other = (ContactSearchSummary) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null
                && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getPreviousContactId() == null ^ this.getPreviousContactId() == null)
            return false;
        if (other.getPreviousContactId() != null
                && other.getPreviousContactId().equals(this.getPreviousContactId()) == false)
            return false;
        if (other.getInitiationMethod() == null ^ this.getInitiationMethod() == null)
            return false;
        if (other.getInitiationMethod() != null
                && other.getInitiationMethod().equals(this.getInitiationMethod()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getQueueInfo() == null ^ this.getQueueInfo() == null)
            return false;
        if (other.getQueueInfo() != null
                && other.getQueueInfo().equals(this.getQueueInfo()) == false)
            return false;
        if (other.getAgentInfo() == null ^ this.getAgentInfo() == null)
            return false;
        if (other.getAgentInfo() != null
                && other.getAgentInfo().equals(this.getAgentInfo()) == false)
            return false;
        if (other.getInitiationTimestamp() == null ^ this.getInitiationTimestamp() == null)
            return false;
        if (other.getInitiationTimestamp() != null
                && other.getInitiationTimestamp().equals(this.getInitiationTimestamp()) == false)
            return false;
        if (other.getDisconnectTimestamp() == null ^ this.getDisconnectTimestamp() == null)
            return false;
        if (other.getDisconnectTimestamp() != null
                && other.getDisconnectTimestamp().equals(this.getDisconnectTimestamp()) == false)
            return false;
        if (other.getScheduledTimestamp() == null ^ this.getScheduledTimestamp() == null)
            return false;
        if (other.getScheduledTimestamp() != null
                && other.getScheduledTimestamp().equals(this.getScheduledTimestamp()) == false)
            return false;
        return true;
    }
}
