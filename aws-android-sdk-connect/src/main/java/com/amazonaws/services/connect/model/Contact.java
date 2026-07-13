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
 * Contains information about a contact.
 * </p>
 */
public class Contact implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identifier for the contact.
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
     * The name of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String description;

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
    private QueueInfo queueInfo;

    /**
     * <p>
     * Information about the agent who accepted the contact.
     * </p>
     */
    private AgentInfo agentInfo;

    /**
     * <p>
     * The date and time this contact was initiated, in UTC time. For
     * <code>INBOUND</code>, this is when the contact arrived. For
     * <code>OUTBOUND</code>, this is when the agent began dialing. For
     * <code>CALLBACK</code>, this is when the callback contact was created. For
     * <code>TRANSFER</code> and <code>QUEUE_TRANSFER</code>, this is when the
     * transfer was initiated. For <code>API</code>, this is when the request
     * arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent
     * started dialing the external participant. For <code>MONITOR</code>, this
     * is when the supervisor started listening to a contact.
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
     * The timestamp when contact was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;

    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     */
    private java.util.Date lastPausedTimestamp;

    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     */
    private java.util.Date lastResumedTimestamp;

    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     */
    private Integer totalPauseCount;

    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer totalPauseDurationInSeconds;

    /**
     * <p>
     * The timestamp, in Unix epoch time format, at which to start running the
     * inbound flow.
     * </p>
     */
    private java.util.Date scheduledTimestamp;

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     * >related</a> to this contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String relatedContactId;

    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     */
    private WisdomInfo wisdomInfo;

    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the
     * contact, in seconds (longer / larger queue time are routed
     * preferentially). Cannot be specified if the QueuePriority is specified.
     * Must be statically defined and a valid integer value.
     * </p>
     */
    private Integer queueTimeAdjustmentSeconds;

    /**
     * <p>
     * An integer that represents the queue priority to be applied to the
     * contact (lower priorities are routed preferentially). Cannot be specified
     * if the QueueTimeAdjustmentSeconds is specified. Must be statically
     * defined, must be larger than zero, and a valid integer value. Default
     * Value is 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     */
    private Long queuePriority;

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services
     * generated and user-defined tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The timestamp when customer endpoint connected to Amazon Connect.
     * </p>
     */
    private java.util.Date connectedToSystemTimestamp;

    /**
     * <p>
     * Latest routing criteria on the contact.
     * </p>
     */
    private RoutingCriteria routingCriteria;

    /**
     * <p>
     * Information about the Customer on the contact.
     * </p>
     */
    private Customer customer;

    /**
     * <p>
     * Information associated with a campaign.
     * </p>
     */
    private Campaign campaign;

    /**
     * <p>
     * Indicates how an <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     * >outbound campaign</a> call is actually disposed if the contact is
     * connected to Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANSWERED, UNDETECTED, ERROR, HUMAN_ANSWERED,
     * SIT_TONE_DETECTED, SIT_TONE_BUSY, SIT_TONE_INVALID_NUMBER,
     * FAX_MACHINE_DETECTED, VOICEMAIL_BEEP, VOICEMAIL_NO_BEEP, AMD_UNRESOLVED,
     * AMD_UNANSWERED, AMD_ERROR, AMD_NOT_APPLICABLE
     */
    private String answeringMachineDetectionStatus;

    /**
     * <p>
     * Information about customer’s voice activity.
     * </p>
     */
    private CustomerVoiceActivity customerVoiceActivity;

    /**
     * <p>
     * Information about the quality of the participant's media connection.
     * </p>
     */
    private QualityMetrics qualityMetrics;

    /**
     * <p>
     * Information about the call disconnect experience.
     * </p>
     */
    private DisconnectDetails disconnectDetails;

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact
     * segments using an attribute map. The attributes are standard Amazon
     * Connect attributes and can be accessed in flows. Attribute keys can
     * include only alphanumeric, -, and _ characters. This field can be used to
     * show channel subtype. For example, <code>connect:Guide</code> or
     * <code>connect:SMS</code>.
     * </p>
     */
    private java.util.Map<String, SegmentAttributeValue> segmentAttributes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the contact.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the contact.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The identifier for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier for the contact.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier for the contact.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withId(String id) {
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
    public Contact withInitialContactId(String initialContactId) {
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
    public Contact withPreviousContactId(String previousContactId) {
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
    public Contact withInitiationMethod(String initiationMethod) {
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
    public Contact withInitiationMethod(ContactInitiationMethod initiationMethod) {
        this.initiationMethod = initiationMethod.toString();
        return this;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return <p>
     *         The name of the contact.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of the contact.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         The description of the contact.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            The description of the contact.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            The description of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withDescription(String description) {
        this.description = description;
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
    public Contact withChannel(String channel) {
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
    public Contact withChannel(Channel channel) {
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
    public QueueInfo getQueueInfo() {
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
    public void setQueueInfo(QueueInfo queueInfo) {
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
    public Contact withQueueInfo(QueueInfo queueInfo) {
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
    public AgentInfo getAgentInfo() {
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
    public void setAgentInfo(AgentInfo agentInfo) {
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
    public Contact withAgentInfo(AgentInfo agentInfo) {
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
     * transfer was initiated. For <code>API</code>, this is when the request
     * arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent
     * started dialing the external participant. For <code>MONITOR</code>, this
     * is when the supervisor started listening to a contact.
     * </p>
     *
     * @return <p>
     *         The date and time this contact was initiated, in UTC time. For
     *         <code>INBOUND</code>, this is when the contact arrived. For
     *         <code>OUTBOUND</code>, this is when the agent began dialing. For
     *         <code>CALLBACK</code>, this is when the callback contact was
     *         created. For <code>TRANSFER</code> and
     *         <code>QUEUE_TRANSFER</code>, this is when the transfer was
     *         initiated. For <code>API</code>, this is when the request
     *         arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the
     *         agent started dialing the external participant. For
     *         <code>MONITOR</code>, this is when the supervisor started
     *         listening to a contact.
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
     * transfer was initiated. For <code>API</code>, this is when the request
     * arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent
     * started dialing the external participant. For <code>MONITOR</code>, this
     * is when the supervisor started listening to a contact.
     * </p>
     *
     * @param initiationTimestamp <p>
     *            The date and time this contact was initiated, in UTC time. For
     *            <code>INBOUND</code>, this is when the contact arrived. For
     *            <code>OUTBOUND</code>, this is when the agent began dialing.
     *            For <code>CALLBACK</code>, this is when the callback contact
     *            was created. For <code>TRANSFER</code> and
     *            <code>QUEUE_TRANSFER</code>, this is when the transfer was
     *            initiated. For <code>API</code>, this is when the request
     *            arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the
     *            agent started dialing the external participant. For
     *            <code>MONITOR</code>, this is when the supervisor started
     *            listening to a contact.
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
     * transfer was initiated. For <code>API</code>, this is when the request
     * arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the agent
     * started dialing the external participant. For <code>MONITOR</code>, this
     * is when the supervisor started listening to a contact.
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
     *            initiated. For <code>API</code>, this is when the request
     *            arrived. For <code>EXTERNAL_OUTBOUND</code>, this is when the
     *            agent started dialing the external participant. For
     *            <code>MONITOR</code>, this is when the supervisor started
     *            listening to a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withInitiationTimestamp(java.util.Date initiationTimestamp) {
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
    public Contact withDisconnectTimestamp(java.util.Date disconnectTimestamp) {
        this.disconnectTimestamp = disconnectTimestamp;
        return this;
    }

    /**
     * <p>
     * The timestamp when contact was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp when contact was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    /**
     * <p>
     * The timestamp when contact was last updated.
     * </p>
     *
     * @param lastUpdateTimestamp <p>
     *            The timestamp when contact was last updated.
     *            </p>
     */
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The timestamp when contact was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateTimestamp <p>
     *            The timestamp when contact was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     *
     * @return <p>
     *         The timestamp when the contact was last paused.
     *         </p>
     */
    public java.util.Date getLastPausedTimestamp() {
        return lastPausedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     *
     * @param lastPausedTimestamp <p>
     *            The timestamp when the contact was last paused.
     *            </p>
     */
    public void setLastPausedTimestamp(java.util.Date lastPausedTimestamp) {
        this.lastPausedTimestamp = lastPausedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last paused.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastPausedTimestamp <p>
     *            The timestamp when the contact was last paused.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withLastPausedTimestamp(java.util.Date lastPausedTimestamp) {
        this.lastPausedTimestamp = lastPausedTimestamp;
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     *
     * @return <p>
     *         The timestamp when the contact was last resumed.
     *         </p>
     */
    public java.util.Date getLastResumedTimestamp() {
        return lastResumedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     *
     * @param lastResumedTimestamp <p>
     *            The timestamp when the contact was last resumed.
     *            </p>
     */
    public void setLastResumedTimestamp(java.util.Date lastResumedTimestamp) {
        this.lastResumedTimestamp = lastResumedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was last resumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastResumedTimestamp <p>
     *            The timestamp when the contact was last resumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withLastResumedTimestamp(java.util.Date lastResumedTimestamp) {
        this.lastResumedTimestamp = lastResumedTimestamp;
        return this;
    }

    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @return <p>
     *         Total pause count for a contact.
     *         </p>
     */
    public Integer getTotalPauseCount() {
        return totalPauseCount;
    }

    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param totalPauseCount <p>
     *            Total pause count for a contact.
     *            </p>
     */
    public void setTotalPauseCount(Integer totalPauseCount) {
        this.totalPauseCount = totalPauseCount;
    }

    /**
     * <p>
     * Total pause count for a contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param totalPauseCount <p>
     *            Total pause count for a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withTotalPauseCount(Integer totalPauseCount) {
        this.totalPauseCount = totalPauseCount;
        return this;
    }

    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Total pause duration for a contact in seconds.
     *         </p>
     */
    public Integer getTotalPauseDurationInSeconds() {
        return totalPauseDurationInSeconds;
    }

    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalPauseDurationInSeconds <p>
     *            Total pause duration for a contact in seconds.
     *            </p>
     */
    public void setTotalPauseDurationInSeconds(Integer totalPauseDurationInSeconds) {
        this.totalPauseDurationInSeconds = totalPauseDurationInSeconds;
    }

    /**
     * <p>
     * Total pause duration for a contact in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalPauseDurationInSeconds <p>
     *            Total pause duration for a contact in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withTotalPauseDurationInSeconds(Integer totalPauseDurationInSeconds) {
        this.totalPauseDurationInSeconds = totalPauseDurationInSeconds;
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
    public Contact withScheduledTimestamp(java.util.Date scheduledTimestamp) {
        this.scheduledTimestamp = scheduledTimestamp;
        return this;
    }

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     * >related</a> to this contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The contactId that is <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     *         >related</a> to this contact.
     *         </p>
     */
    public String getRelatedContactId() {
        return relatedContactId;
    }

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     * >related</a> to this contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The contactId that is <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     *            >related</a> to this contact.
     *            </p>
     */
    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     * >related</a> to this contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The contactId that is <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html#relatedcontactid"
     *            >related</a> to this contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
        return this;
    }

    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     *
     * @return <p>
     *         Information about Amazon Connect Wisdom.
     *         </p>
     */
    public WisdomInfo getWisdomInfo() {
        return wisdomInfo;
    }

    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     *
     * @param wisdomInfo <p>
     *            Information about Amazon Connect Wisdom.
     *            </p>
     */
    public void setWisdomInfo(WisdomInfo wisdomInfo) {
        this.wisdomInfo = wisdomInfo;
    }

    /**
     * <p>
     * Information about Amazon Connect Wisdom.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param wisdomInfo <p>
     *            Information about Amazon Connect Wisdom.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withWisdomInfo(WisdomInfo wisdomInfo) {
        this.wisdomInfo = wisdomInfo;
        return this;
    }

    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the
     * contact, in seconds (longer / larger queue time are routed
     * preferentially). Cannot be specified if the QueuePriority is specified.
     * Must be statically defined and a valid integer value.
     * </p>
     *
     * @return <p>
     *         An integer that represents the queue time adjust to be applied to
     *         the contact, in seconds (longer / larger queue time are routed
     *         preferentially). Cannot be specified if the QueuePriority is
     *         specified. Must be statically defined and a valid integer value.
     *         </p>
     */
    public Integer getQueueTimeAdjustmentSeconds() {
        return queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the
     * contact, in seconds (longer / larger queue time are routed
     * preferentially). Cannot be specified if the QueuePriority is specified.
     * Must be statically defined and a valid integer value.
     * </p>
     *
     * @param queueTimeAdjustmentSeconds <p>
     *            An integer that represents the queue time adjust to be applied
     *            to the contact, in seconds (longer / larger queue time are
     *            routed preferentially). Cannot be specified if the
     *            QueuePriority is specified. Must be statically defined and a
     *            valid integer value.
     *            </p>
     */
    public void setQueueTimeAdjustmentSeconds(Integer queueTimeAdjustmentSeconds) {
        this.queueTimeAdjustmentSeconds = queueTimeAdjustmentSeconds;
    }

    /**
     * <p>
     * An integer that represents the queue time adjust to be applied to the
     * contact, in seconds (longer / larger queue time are routed
     * preferentially). Cannot be specified if the QueuePriority is specified.
     * Must be statically defined and a valid integer value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueTimeAdjustmentSeconds <p>
     *            An integer that represents the queue time adjust to be applied
     *            to the contact, in seconds (longer / larger queue time are
     *            routed preferentially). Cannot be specified if the
     *            QueuePriority is specified. Must be statically defined and a
     *            valid integer value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withQueueTimeAdjustmentSeconds(Integer queueTimeAdjustmentSeconds) {
        this.queueTimeAdjustmentSeconds = queueTimeAdjustmentSeconds;
        return this;
    }

    /**
     * <p>
     * An integer that represents the queue priority to be applied to the
     * contact (lower priorities are routed preferentially). Cannot be specified
     * if the QueueTimeAdjustmentSeconds is specified. Must be statically
     * defined, must be larger than zero, and a valid integer value. Default
     * Value is 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     *
     * @return <p>
     *         An integer that represents the queue priority to be applied to
     *         the contact (lower priorities are routed preferentially). Cannot
     *         be specified if the QueueTimeAdjustmentSeconds is specified. Must
     *         be statically defined, must be larger than zero, and a valid
     *         integer value. Default Value is 5.
     *         </p>
     */
    public Long getQueuePriority() {
        return queuePriority;
    }

    /**
     * <p>
     * An integer that represents the queue priority to be applied to the
     * contact (lower priorities are routed preferentially). Cannot be specified
     * if the QueueTimeAdjustmentSeconds is specified. Must be statically
     * defined, must be larger than zero, and a valid integer value. Default
     * Value is 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     *
     * @param queuePriority <p>
     *            An integer that represents the queue priority to be applied to
     *            the contact (lower priorities are routed preferentially).
     *            Cannot be specified if the QueueTimeAdjustmentSeconds is
     *            specified. Must be statically defined, must be larger than
     *            zero, and a valid integer value. Default Value is 5.
     *            </p>
     */
    public void setQueuePriority(Long queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * <p>
     * An integer that represents the queue priority to be applied to the
     * contact (lower priorities are routed preferentially). Cannot be specified
     * if the QueueTimeAdjustmentSeconds is specified. Must be statically
     * defined, must be larger than zero, and a valid integer value. Default
     * Value is 5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 9223372036854775807<br/>
     *
     * @param queuePriority <p>
     *            An integer that represents the queue priority to be applied to
     *            the contact (lower priorities are routed preferentially).
     *            Cannot be specified if the QueueTimeAdjustmentSeconds is
     *            specified. Must be statically defined, must be larger than
     *            zero, and a valid integer value. Default Value is 5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withQueuePriority(Long queuePriority) {
        this.queuePriority = queuePriority;
        return this;
    }

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services
     * generated and user-defined tags.
     * </p>
     *
     * @return <p>
     *         Tags associated with the contact. This contains both Amazon Web
     *         Services generated and user-defined tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services
     * generated and user-defined tags.
     * </p>
     *
     * @param tags <p>
     *            Tags associated with the contact. This contains both Amazon
     *            Web Services generated and user-defined tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services
     * generated and user-defined tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with the contact. This contains both Amazon
     *            Web Services generated and user-defined tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Tags associated with the contact. This contains both Amazon Web Services
     * generated and user-defined tags.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Contact clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp when customer endpoint connected to Amazon Connect.
     * </p>
     *
     * @return <p>
     *         The timestamp when customer endpoint connected to Amazon Connect.
     *         </p>
     */
    public java.util.Date getConnectedToSystemTimestamp() {
        return connectedToSystemTimestamp;
    }

    /**
     * <p>
     * The timestamp when customer endpoint connected to Amazon Connect.
     * </p>
     *
     * @param connectedToSystemTimestamp <p>
     *            The timestamp when customer endpoint connected to Amazon
     *            Connect.
     *            </p>
     */
    public void setConnectedToSystemTimestamp(java.util.Date connectedToSystemTimestamp) {
        this.connectedToSystemTimestamp = connectedToSystemTimestamp;
    }

    /**
     * <p>
     * The timestamp when customer endpoint connected to Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectedToSystemTimestamp <p>
     *            The timestamp when customer endpoint connected to Amazon
     *            Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withConnectedToSystemTimestamp(java.util.Date connectedToSystemTimestamp) {
        this.connectedToSystemTimestamp = connectedToSystemTimestamp;
        return this;
    }

    /**
     * <p>
     * Latest routing criteria on the contact.
     * </p>
     *
     * @return <p>
     *         Latest routing criteria on the contact.
     *         </p>
     */
    public RoutingCriteria getRoutingCriteria() {
        return routingCriteria;
    }

    /**
     * <p>
     * Latest routing criteria on the contact.
     * </p>
     *
     * @param routingCriteria <p>
     *            Latest routing criteria on the contact.
     *            </p>
     */
    public void setRoutingCriteria(RoutingCriteria routingCriteria) {
        this.routingCriteria = routingCriteria;
    }

    /**
     * <p>
     * Latest routing criteria on the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingCriteria <p>
     *            Latest routing criteria on the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withRoutingCriteria(RoutingCriteria routingCriteria) {
        this.routingCriteria = routingCriteria;
        return this;
    }

    /**
     * <p>
     * Information about the Customer on the contact.
     * </p>
     *
     * @return <p>
     *         Information about the Customer on the contact.
     *         </p>
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * <p>
     * Information about the Customer on the contact.
     * </p>
     *
     * @param customer <p>
     *            Information about the Customer on the contact.
     *            </p>
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * <p>
     * Information about the Customer on the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customer <p>
     *            Information about the Customer on the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * <p>
     * Information associated with a campaign.
     * </p>
     *
     * @return <p>
     *         Information associated with a campaign.
     *         </p>
     */
    public Campaign getCampaign() {
        return campaign;
    }

    /**
     * <p>
     * Information associated with a campaign.
     * </p>
     *
     * @param campaign <p>
     *            Information associated with a campaign.
     *            </p>
     */
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    /**
     * <p>
     * Information associated with a campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaign <p>
     *            Information associated with a campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withCampaign(Campaign campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * <p>
     * Indicates how an <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     * >outbound campaign</a> call is actually disposed if the contact is
     * connected to Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANSWERED, UNDETECTED, ERROR, HUMAN_ANSWERED,
     * SIT_TONE_DETECTED, SIT_TONE_BUSY, SIT_TONE_INVALID_NUMBER,
     * FAX_MACHINE_DETECTED, VOICEMAIL_BEEP, VOICEMAIL_NO_BEEP, AMD_UNRESOLVED,
     * AMD_UNANSWERED, AMD_ERROR, AMD_NOT_APPLICABLE
     *
     * @return <p>
     *         Indicates how an <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     *         >outbound campaign</a> call is actually disposed if the contact
     *         is connected to Amazon Connect.
     *         </p>
     * @see AnsweringMachineDetectionStatus
     */
    public String getAnsweringMachineDetectionStatus() {
        return answeringMachineDetectionStatus;
    }

    /**
     * <p>
     * Indicates how an <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     * >outbound campaign</a> call is actually disposed if the contact is
     * connected to Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANSWERED, UNDETECTED, ERROR, HUMAN_ANSWERED,
     * SIT_TONE_DETECTED, SIT_TONE_BUSY, SIT_TONE_INVALID_NUMBER,
     * FAX_MACHINE_DETECTED, VOICEMAIL_BEEP, VOICEMAIL_NO_BEEP, AMD_UNRESOLVED,
     * AMD_UNANSWERED, AMD_ERROR, AMD_NOT_APPLICABLE
     *
     * @param answeringMachineDetectionStatus <p>
     *            Indicates how an <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     *            >outbound campaign</a> call is actually disposed if the
     *            contact is connected to Amazon Connect.
     *            </p>
     * @see AnsweringMachineDetectionStatus
     */
    public void setAnsweringMachineDetectionStatus(String answeringMachineDetectionStatus) {
        this.answeringMachineDetectionStatus = answeringMachineDetectionStatus;
    }

    /**
     * <p>
     * Indicates how an <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     * >outbound campaign</a> call is actually disposed if the contact is
     * connected to Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANSWERED, UNDETECTED, ERROR, HUMAN_ANSWERED,
     * SIT_TONE_DETECTED, SIT_TONE_BUSY, SIT_TONE_INVALID_NUMBER,
     * FAX_MACHINE_DETECTED, VOICEMAIL_BEEP, VOICEMAIL_NO_BEEP, AMD_UNRESOLVED,
     * AMD_UNANSWERED, AMD_ERROR, AMD_NOT_APPLICABLE
     *
     * @param answeringMachineDetectionStatus <p>
     *            Indicates how an <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     *            >outbound campaign</a> call is actually disposed if the
     *            contact is connected to Amazon Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AnsweringMachineDetectionStatus
     */
    public Contact withAnsweringMachineDetectionStatus(String answeringMachineDetectionStatus) {
        this.answeringMachineDetectionStatus = answeringMachineDetectionStatus;
        return this;
    }

    /**
     * <p>
     * Indicates how an <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     * >outbound campaign</a> call is actually disposed if the contact is
     * connected to Amazon Connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANSWERED, UNDETECTED, ERROR, HUMAN_ANSWERED,
     * SIT_TONE_DETECTED, SIT_TONE_BUSY, SIT_TONE_INVALID_NUMBER,
     * FAX_MACHINE_DETECTED, VOICEMAIL_BEEP, VOICEMAIL_NO_BEEP, AMD_UNRESOLVED,
     * AMD_UNANSWERED, AMD_ERROR, AMD_NOT_APPLICABLE
     *
     * @param answeringMachineDetectionStatus <p>
     *            Indicates how an <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     *            >outbound campaign</a> call is actually disposed if the
     *            contact is connected to Amazon Connect.
     *            </p>
     * @see AnsweringMachineDetectionStatus
     */
    public void setAnsweringMachineDetectionStatus(
            AnsweringMachineDetectionStatus answeringMachineDetectionStatus) {
        this.answeringMachineDetectionStatus = answeringMachineDetectionStatus.toString();
    }

    /**
     * <p>
     * Indicates how an <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     * >outbound campaign</a> call is actually disposed if the contact is
     * connected to Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANSWERED, UNDETECTED, ERROR, HUMAN_ANSWERED,
     * SIT_TONE_DETECTED, SIT_TONE_BUSY, SIT_TONE_INVALID_NUMBER,
     * FAX_MACHINE_DETECTED, VOICEMAIL_BEEP, VOICEMAIL_NO_BEEP, AMD_UNRESOLVED,
     * AMD_UNANSWERED, AMD_ERROR, AMD_NOT_APPLICABLE
     *
     * @param answeringMachineDetectionStatus <p>
     *            Indicates how an <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/how-to-create-campaigns.html"
     *            >outbound campaign</a> call is actually disposed if the
     *            contact is connected to Amazon Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AnsweringMachineDetectionStatus
     */
    public Contact withAnsweringMachineDetectionStatus(
            AnsweringMachineDetectionStatus answeringMachineDetectionStatus) {
        this.answeringMachineDetectionStatus = answeringMachineDetectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about customer’s voice activity.
     * </p>
     *
     * @return <p>
     *         Information about customer’s voice activity.
     *         </p>
     */
    public CustomerVoiceActivity getCustomerVoiceActivity() {
        return customerVoiceActivity;
    }

    /**
     * <p>
     * Information about customer’s voice activity.
     * </p>
     *
     * @param customerVoiceActivity <p>
     *            Information about customer’s voice activity.
     *            </p>
     */
    public void setCustomerVoiceActivity(CustomerVoiceActivity customerVoiceActivity) {
        this.customerVoiceActivity = customerVoiceActivity;
    }

    /**
     * <p>
     * Information about customer’s voice activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerVoiceActivity <p>
     *            Information about customer’s voice activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withCustomerVoiceActivity(CustomerVoiceActivity customerVoiceActivity) {
        this.customerVoiceActivity = customerVoiceActivity;
        return this;
    }

    /**
     * <p>
     * Information about the quality of the participant's media connection.
     * </p>
     *
     * @return <p>
     *         Information about the quality of the participant's media
     *         connection.
     *         </p>
     */
    public QualityMetrics getQualityMetrics() {
        return qualityMetrics;
    }

    /**
     * <p>
     * Information about the quality of the participant's media connection.
     * </p>
     *
     * @param qualityMetrics <p>
     *            Information about the quality of the participant's media
     *            connection.
     *            </p>
     */
    public void setQualityMetrics(QualityMetrics qualityMetrics) {
        this.qualityMetrics = qualityMetrics;
    }

    /**
     * <p>
     * Information about the quality of the participant's media connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qualityMetrics <p>
     *            Information about the quality of the participant's media
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withQualityMetrics(QualityMetrics qualityMetrics) {
        this.qualityMetrics = qualityMetrics;
        return this;
    }

    /**
     * <p>
     * Information about the call disconnect experience.
     * </p>
     *
     * @return <p>
     *         Information about the call disconnect experience.
     *         </p>
     */
    public DisconnectDetails getDisconnectDetails() {
        return disconnectDetails;
    }

    /**
     * <p>
     * Information about the call disconnect experience.
     * </p>
     *
     * @param disconnectDetails <p>
     *            Information about the call disconnect experience.
     *            </p>
     */
    public void setDisconnectDetails(DisconnectDetails disconnectDetails) {
        this.disconnectDetails = disconnectDetails;
    }

    /**
     * <p>
     * Information about the call disconnect experience.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disconnectDetails <p>
     *            Information about the call disconnect experience.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withDisconnectDetails(DisconnectDetails disconnectDetails) {
        this.disconnectDetails = disconnectDetails;
        return this;
    }

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact
     * segments using an attribute map. The attributes are standard Amazon
     * Connect attributes and can be accessed in flows. Attribute keys can
     * include only alphanumeric, -, and _ characters. This field can be used to
     * show channel subtype. For example, <code>connect:Guide</code> or
     * <code>connect:SMS</code>.
     * </p>
     *
     * @return <p>
     *         A set of system defined key-value pairs stored on individual
     *         contact segments using an attribute map. The attributes are
     *         standard Amazon Connect attributes and can be accessed in flows.
     *         Attribute keys can include only alphanumeric, -, and _
     *         characters. This field can be used to show channel subtype. For
     *         example, <code>connect:Guide</code> or <code>connect:SMS</code>.
     *         </p>
     */
    public java.util.Map<String, SegmentAttributeValue> getSegmentAttributes() {
        return segmentAttributes;
    }

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact
     * segments using an attribute map. The attributes are standard Amazon
     * Connect attributes and can be accessed in flows. Attribute keys can
     * include only alphanumeric, -, and _ characters. This field can be used to
     * show channel subtype. For example, <code>connect:Guide</code> or
     * <code>connect:SMS</code>.
     * </p>
     *
     * @param segmentAttributes <p>
     *            A set of system defined key-value pairs stored on individual
     *            contact segments using an attribute map. The attributes are
     *            standard Amazon Connect attributes and can be accessed in
     *            flows. Attribute keys can include only alphanumeric, -, and _
     *            characters. This field can be used to show channel subtype.
     *            For example, <code>connect:Guide</code> or
     *            <code>connect:SMS</code>.
     *            </p>
     */
    public void setSegmentAttributes(java.util.Map<String, SegmentAttributeValue> segmentAttributes) {
        this.segmentAttributes = segmentAttributes;
    }

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact
     * segments using an attribute map. The attributes are standard Amazon
     * Connect attributes and can be accessed in flows. Attribute keys can
     * include only alphanumeric, -, and _ characters. This field can be used to
     * show channel subtype. For example, <code>connect:Guide</code> or
     * <code>connect:SMS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentAttributes <p>
     *            A set of system defined key-value pairs stored on individual
     *            contact segments using an attribute map. The attributes are
     *            standard Amazon Connect attributes and can be accessed in
     *            flows. Attribute keys can include only alphanumeric, -, and _
     *            characters. This field can be used to show channel subtype.
     *            For example, <code>connect:Guide</code> or
     *            <code>connect:SMS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withSegmentAttributes(
            java.util.Map<String, SegmentAttributeValue> segmentAttributes) {
        this.segmentAttributes = segmentAttributes;
        return this;
    }

    /**
     * <p>
     * A set of system defined key-value pairs stored on individual contact
     * segments using an attribute map. The attributes are standard Amazon
     * Connect attributes and can be accessed in flows. Attribute keys can
     * include only alphanumeric, -, and _ characters. This field can be used to
     * show channel subtype. For example, <code>connect:Guide</code> or
     * <code>connect:SMS</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into SegmentAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into SegmentAttributes.
     * @param value The corresponding value of the entry to be added into
     *            SegmentAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact addSegmentAttributesEntry(String key, SegmentAttributeValue value) {
        if (null == this.segmentAttributes) {
            this.segmentAttributes = new java.util.HashMap<String, SegmentAttributeValue>();
        }
        if (this.segmentAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.segmentAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SegmentAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Contact clearSegmentAttributesEntries() {
        this.segmentAttributes = null;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
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
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: " + getLastUpdateTimestamp() + ",");
        if (getLastPausedTimestamp() != null)
            sb.append("LastPausedTimestamp: " + getLastPausedTimestamp() + ",");
        if (getLastResumedTimestamp() != null)
            sb.append("LastResumedTimestamp: " + getLastResumedTimestamp() + ",");
        if (getTotalPauseCount() != null)
            sb.append("TotalPauseCount: " + getTotalPauseCount() + ",");
        if (getTotalPauseDurationInSeconds() != null)
            sb.append("TotalPauseDurationInSeconds: " + getTotalPauseDurationInSeconds() + ",");
        if (getScheduledTimestamp() != null)
            sb.append("ScheduledTimestamp: " + getScheduledTimestamp() + ",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: " + getRelatedContactId() + ",");
        if (getWisdomInfo() != null)
            sb.append("WisdomInfo: " + getWisdomInfo() + ",");
        if (getQueueTimeAdjustmentSeconds() != null)
            sb.append("QueueTimeAdjustmentSeconds: " + getQueueTimeAdjustmentSeconds() + ",");
        if (getQueuePriority() != null)
            sb.append("QueuePriority: " + getQueuePriority() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getConnectedToSystemTimestamp() != null)
            sb.append("ConnectedToSystemTimestamp: " + getConnectedToSystemTimestamp() + ",");
        if (getRoutingCriteria() != null)
            sb.append("RoutingCriteria: " + getRoutingCriteria() + ",");
        if (getCustomer() != null)
            sb.append("Customer: " + getCustomer() + ",");
        if (getCampaign() != null)
            sb.append("Campaign: " + getCampaign() + ",");
        if (getAnsweringMachineDetectionStatus() != null)
            sb.append("AnsweringMachineDetectionStatus: " + getAnsweringMachineDetectionStatus()
                    + ",");
        if (getCustomerVoiceActivity() != null)
            sb.append("CustomerVoiceActivity: " + getCustomerVoiceActivity() + ",");
        if (getQualityMetrics() != null)
            sb.append("QualityMetrics: " + getQualityMetrics() + ",");
        if (getDisconnectDetails() != null)
            sb.append("DisconnectDetails: " + getDisconnectDetails() + ",");
        if (getSegmentAttributes() != null)
            sb.append("SegmentAttributes: " + getSegmentAttributes());
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getQueueInfo() == null) ? 0 : getQueueInfo().hashCode());
        hashCode = prime * hashCode + ((getAgentInfo() == null) ? 0 : getAgentInfo().hashCode());
        hashCode = prime * hashCode
                + ((getInitiationTimestamp() == null) ? 0 : getInitiationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getDisconnectTimestamp() == null) ? 0 : getDisconnectTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastPausedTimestamp() == null) ? 0 : getLastPausedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastResumedTimestamp() == null) ? 0 : getLastResumedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getTotalPauseCount() == null) ? 0 : getTotalPauseCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalPauseDurationInSeconds() == null) ? 0
                        : getTotalPauseDurationInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledTimestamp() == null) ? 0 : getScheduledTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        hashCode = prime * hashCode + ((getWisdomInfo() == null) ? 0 : getWisdomInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getQueueTimeAdjustmentSeconds() == null) ? 0 : getQueueTimeAdjustmentSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getQueuePriority() == null) ? 0 : getQueuePriority().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectedToSystemTimestamp() == null) ? 0 : getConnectedToSystemTimestamp()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRoutingCriteria() == null) ? 0 : getRoutingCriteria().hashCode());
        hashCode = prime * hashCode + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        hashCode = prime * hashCode + ((getCampaign() == null) ? 0 : getCampaign().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnsweringMachineDetectionStatus() == null) ? 0
                        : getAnsweringMachineDetectionStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerVoiceActivity() == null) ? 0 : getCustomerVoiceActivity().hashCode());
        hashCode = prime * hashCode
                + ((getQualityMetrics() == null) ? 0 : getQualityMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getDisconnectDetails() == null) ? 0 : getDisconnectDetails().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentAttributes() == null) ? 0 : getSegmentAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Contact == false)
            return false;
        Contact other = (Contact) obj;

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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null
                && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getLastPausedTimestamp() == null ^ this.getLastPausedTimestamp() == null)
            return false;
        if (other.getLastPausedTimestamp() != null
                && other.getLastPausedTimestamp().equals(this.getLastPausedTimestamp()) == false)
            return false;
        if (other.getLastResumedTimestamp() == null ^ this.getLastResumedTimestamp() == null)
            return false;
        if (other.getLastResumedTimestamp() != null
                && other.getLastResumedTimestamp().equals(this.getLastResumedTimestamp()) == false)
            return false;
        if (other.getTotalPauseCount() == null ^ this.getTotalPauseCount() == null)
            return false;
        if (other.getTotalPauseCount() != null
                && other.getTotalPauseCount().equals(this.getTotalPauseCount()) == false)
            return false;
        if (other.getTotalPauseDurationInSeconds() == null
                ^ this.getTotalPauseDurationInSeconds() == null)
            return false;
        if (other.getTotalPauseDurationInSeconds() != null
                && other.getTotalPauseDurationInSeconds().equals(
                        this.getTotalPauseDurationInSeconds()) == false)
            return false;
        if (other.getScheduledTimestamp() == null ^ this.getScheduledTimestamp() == null)
            return false;
        if (other.getScheduledTimestamp() != null
                && other.getScheduledTimestamp().equals(this.getScheduledTimestamp()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null
                && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        if (other.getWisdomInfo() == null ^ this.getWisdomInfo() == null)
            return false;
        if (other.getWisdomInfo() != null
                && other.getWisdomInfo().equals(this.getWisdomInfo()) == false)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() == null
                ^ this.getQueueTimeAdjustmentSeconds() == null)
            return false;
        if (other.getQueueTimeAdjustmentSeconds() != null
                && other.getQueueTimeAdjustmentSeconds().equals(
                        this.getQueueTimeAdjustmentSeconds()) == false)
            return false;
        if (other.getQueuePriority() == null ^ this.getQueuePriority() == null)
            return false;
        if (other.getQueuePriority() != null
                && other.getQueuePriority().equals(this.getQueuePriority()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConnectedToSystemTimestamp() == null
                ^ this.getConnectedToSystemTimestamp() == null)
            return false;
        if (other.getConnectedToSystemTimestamp() != null
                && other.getConnectedToSystemTimestamp().equals(
                        this.getConnectedToSystemTimestamp()) == false)
            return false;
        if (other.getRoutingCriteria() == null ^ this.getRoutingCriteria() == null)
            return false;
        if (other.getRoutingCriteria() != null
                && other.getRoutingCriteria().equals(this.getRoutingCriteria()) == false)
            return false;
        if (other.getCustomer() == null ^ this.getCustomer() == null)
            return false;
        if (other.getCustomer() != null && other.getCustomer().equals(this.getCustomer()) == false)
            return false;
        if (other.getCampaign() == null ^ this.getCampaign() == null)
            return false;
        if (other.getCampaign() != null && other.getCampaign().equals(this.getCampaign()) == false)
            return false;
        if (other.getAnsweringMachineDetectionStatus() == null
                ^ this.getAnsweringMachineDetectionStatus() == null)
            return false;
        if (other.getAnsweringMachineDetectionStatus() != null
                && other.getAnsweringMachineDetectionStatus().equals(
                        this.getAnsweringMachineDetectionStatus()) == false)
            return false;
        if (other.getCustomerVoiceActivity() == null ^ this.getCustomerVoiceActivity() == null)
            return false;
        if (other.getCustomerVoiceActivity() != null
                && other.getCustomerVoiceActivity().equals(this.getCustomerVoiceActivity()) == false)
            return false;
        if (other.getQualityMetrics() == null ^ this.getQualityMetrics() == null)
            return false;
        if (other.getQualityMetrics() != null
                && other.getQualityMetrics().equals(this.getQualityMetrics()) == false)
            return false;
        if (other.getDisconnectDetails() == null ^ this.getDisconnectDetails() == null)
            return false;
        if (other.getDisconnectDetails() != null
                && other.getDisconnectDetails().equals(this.getDisconnectDetails()) == false)
            return false;
        if (other.getSegmentAttributes() == null ^ this.getSegmentAttributes() == null)
            return false;
        if (other.getSegmentAttributes() != null
                && other.getSegmentAttributes().equals(this.getSegmentAttributes()) == false)
            return false;
        return true;
    }
}
